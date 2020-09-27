
FILES_${PN}-dev += " \
	${libdir}/gcc/${TARGET_SYS}/${BINV}/finclude \
"

do_configure_prepend () {
        mtarget=`echo ${TARGET_SYS} | sed -e s#-${SDKPKGSUFFIX}##`
        target=`echo ${TARGET_SYS} | sed -e s#-${SDKPKGSUFFIX}##`
        hardlinkdir ${STAGING_INCDIR_NATIVE}/gcc-build-internal-$mtarget ${B}

        echo "Configuring libbacktrace"
        rm -rf ${B}/$target/libbacktrace/
        mkdir -p ${B}/$target/libbacktrace/
        cd ${B}/$target/libbacktrace/
        chmod a+x ${S}/libbacktrace/configure
        relpath=${@os.path.relpath("${S}/libbacktrace", "${B}/$target/libbacktrace")}
        $relpath/configure ${CONFIGUREOPTS} ${EXTRA_OECONF}
        # Easiest way to stop bad RPATHs getting into the library since we have a
        # broken libtool here
        sed -i -e 's/hardcode_into_libs=yes/hardcode_into_libs=no/' ${B}/$target/libbacktrace/libtool
}

do_compile_prepend () {
        target=`echo ${TARGET_SYS} | sed -e s#-${SDKPKGSUFFIX}##`
        cd ${B}/$target/libbacktrace/
        oe_runmake MULTIBUILDTOP=${B}/$target/libbacktrace/
        cd ${B}/$target/libgfortran/
        oe_runmake MULTIBUILDTOP=${B}/$target/libgfortran/
}


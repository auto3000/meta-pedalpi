require x42-plugins.inc 

SUMMARY = "Simple Step Sequencer."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "lv2"

SRCREV = "a42dce8219e0c0dc888d4e99bd3875109cdb160a"
SRC_URI = "gitsm://github.com/x42/stepseq.lv2.git"

do_install() {
	install -d "${D}${libdir}/lv2"
	for i in 4 8 12 16; do
		for j in 4 8 16 32; do
			if [ -f misc/box_s${j}_n${i}.png ]; then
				echo "Now build stepseq N_NOTES=$i N_STEPS=$j"
				oe_runmake clean
				oe_runmake N_NOTES=$i N_STEPS=$j OPTIMIZATIONS="-ffast-math -fno-finite-math-only -DNDEBUG"
				oe_runmake N_NOTES=$i N_STEPS=$j install DEST="${D}/"
			else
				echo "Ignore N_NOTES=$i N_STEPS=$j because misc/box_s${j}_n${i}.png does not exist"
			fi
		done
	done
}

do_compile() {
}


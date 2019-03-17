DESCRIPTION = "RDF is a Ruby package to parse, read and write Resource Description Framework (RDF) data files."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SECTION = "devel/ruby"

DEPENDS = "xz-native libxml2-native libxslt-native pkgconfig-native ruby-native bundler-native"
S = "${WORKDIR}"

do_install() {
        set -x
        CC=${BUILD_CC} CXX=${BUILD_CXX} gem install --local nokogiri --no-ri --no-rdoc -- --use-system-libraries     --enable-cross-build \
                --with-zlib-lib=${STAGING_DIR_NATIVE}/usr/lib \
                --with-zlib-include=${STAGING_DIR_NATIVE}/usr/include \
                --with-zlib-dir=${STAGING_DIR_NATIVE}/usr \
                --with-opt-lib=${STAGING_DIR_NATIVE}/usr/lib \
                --with-opt-include=${STAGING_DIR_NATIVE}/usr/include \
                --with-opt-dir=${STAGING_DIR_NATIVE}/usr \
                --with-xml2-config=$PSEUDO_PREFIX \
                --with-xslt-config=$PSEUDO_PREFIX
        gem install linkeddata --no-ri --no-rdoc --local
        gem install rdf --no-ri --no-rdoc --local
}


SRC_URI = " \
    file://addressable-2.6.0.gem \
    file://bcp47-0.3.3.gem \
    file://bigdecimal-1.2.6.gem \
    file://builder-3.2.3.gem \
    file://bundler-1.9.4.gem \
    file://concurrent-ruby-1.1.5.gem \
    file://connection_pool-2.2.2.gem \
    file://ebnf-1.1.3.gem \
    file://equivalent-xml-0.6.0.gem \
    file://haml-5.0.4.gem \
    file://hamster-3.0.0.gem \
    file://htmlentities-4.3.4.gem \
    file://i18n-1.4.0.gem \
    file://io-console-0.4.7.gem \
    file://json-1.8.1.gem \
    file://json-ld-3.0.2.gem \
    file://json-ld-preloaded-3.0.2.gem \
    file://ld-patch-0.3.3.gem \
    file://linkeddata-3.0.1.gem \
    file://link_header-0.0.8.gem \
    file://mini_portile2-2.3.0.gem \
    file://minitest-5.4.3.gem \
    file://multi_json-1.13.1.gem \
    file://net-http-persistent-3.0.0.gem \
    file://nokogiri-1.8.5.gem \
    file://nokogumbo-1.5.0.gem \
    file://power_assert-0.2.2.gem \
    file://psych-2.0.8.gem \
    file://public_suffix-3.0.3.gem \
    file://rake-10.4.2.gem \
    file://rdf-3.0.10.gem \
    file://rdf-aggregate-repo-2.2.1.gem \
    file://rdf-isomorphic-3.0.0.gem \
    file://rdf-json-2.2.0.gem \
    file://rdf-microdata-2.2.3.gem \
    file://rdf-n3-3.0.1.gem \
    file://rdf-normalize-0.3.3.gem \
    file://rdf-rdfa-3.0.1.gem \
    file://rdf-rdfxml-2.2.1.gem \
    file://rdf-reasoner-0.5.1.gem \
    file://rdf-tabular-2.2.1.gem \
    file://rdf-trig-3.0.1.gem \
    file://rdf-trix-2.2.1.gem \
    file://rdf-turtle-3.0.5.gem \
    file://rdf-vocab-3.0.4.gem \
    file://rdf-xsd-3.0.1.gem \
    file://rdoc-4.2.0.gem \
    file://shex-0.5.2.gem \
    file://sparql-3.0.2.gem \
    file://sparql-client-3.0.1.gem \
    file://sxp-1.0.2.gem \
    file://temple-0.8.1.gem \
    file://test-unit-3.0.8.gem \
    file://tilt-2.0.9.gem \
    "





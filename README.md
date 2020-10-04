# meta-pedalpi - Meta Layer for PedalPI

This README file contains information on building the meta-pedalpi distribution layer.
Please see the corresponding sections below for details.

This layer provides:
- +500 LV2 plugins for Guitar/Bass/Vocals effects, see the complete package list [there](https://github.com/auto3000/meta-pedalpi/tree/master/recipes-lv2)
- a couple software for [JACK](http://jackaudio.org/), [MOD suite](http://moddevices.com/mod-duo) (mod-host, mod-ui, mod-sdk) and [PedalPI v2](https://github.com/auto3000/pedalpii)
- a recipe 'pedalpi-dev-platform' to generate a complete customized image, please see [pedalpi-dev-platform layer](https://github.com/auto3000/pedalpi-dev-platform) for a simplified setup

## Baseline

This branch is based on the Yocto 'zeus' release and you can find its latest version at [zeus branch](https://github.com/auto3000/meta-pedalpi/tree/master).

You can also find 'morty' baseline at [morty branch](https://github.com/auto3000/meta-pedalpi/tree/morty).

For info on available baselines, please refer to [master branch](https://github.com/auto3000/meta-pedalpi/tree/master) of this repository.

## Dependencies

This layer depends on:

  URI: git://git.yoctoproject.org/poky
  branch: zeus
 
  URI: git://git.openembedded.org/meta-openembedded
  branch: zeus

  URI: git://github.com/meta-qt5/meta-qt5
  branch: zeus


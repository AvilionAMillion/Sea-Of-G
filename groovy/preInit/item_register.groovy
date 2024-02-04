content.createItem('sand').register()
content.createItem('silt').register()
content.createItem('sediment').register()
content.createItem('soil').register()

content.createBlock('siltblock')
        .setHardness(0.1F)
        .setResistance(0.1F)
        .setSoundType(SoundType.SAND)
        .register()

content.createFluid('fertilizerfluid')
        .setColor(0x36271A)
        .register()

class WithMyAccel extends Config ((site, here, up) => {
  case BuildRoCC => 
    Seq(
      (p: Parameters) => 
      {
        val example = LazyModule(new ExampleAccel(OpcodeSet.custom0)(p))
        example
      }
    )
  }
)

class WithRoccAccumulator extends Config((site, here, up) => {
  case BuildRoCC => 
    Seq(
      (p: Parameters) => 
      {
          val accumulator = LazyModule(new AccumulatorExample(OpcodeSet.custom2, n = 4)(p))
          accumulator
      }
    )
  }
)

class WithRoccTranslator extends Config((site, here, up) => {
  case BuildRoCC => 
    Seq(
      (p: Parameters) => {
          val translator = LazyModule(new TranslatorExample(OpcodeSet.custom1)(p))
          translator
      }
    )
  }
)

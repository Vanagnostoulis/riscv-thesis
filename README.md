# Rocket Chip
ΣΤΑ ΑΡΧΕΙΑ ΤΟΥ ΡΕΠΟ ΕΧΩ ΜΟΝΟ ΤΟΝ ΚΩΔΙΚΑ ΠΟΥ ΠΡΕΠΕΙ ΝΑ ΜΠΟΥΝ ΣΤON ROCKET CORE

- changed src/main/scala/tile/LazyRocc.scala    
  added class ExampleAccel   
  added class class ExampleAccelModuleImp

- in order to add my accelerator into my design    
changed src/main/scala/system/Config.scala    
added "class MyConfig extends Config(new WithMyAccel ++ new DefaultConfig)"     
  
changed src/main/scala/subsystem/Config.scala  (file in repo)

# Mem example
- after runing ./first.sh into rocket-chip/emulator  
- run ./pame_sw.sh in mem directory to run the example with verbose flag.   
- output file  
  contains the output of ./pame_sw.sh   
- grep.sh   
just filters the output file based on prints in Chisel code 

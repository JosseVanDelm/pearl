package pearl

import chisel3._


class Alu extends Module {

  val io = IO(new Bundle {
    val srcA   = IO(UInt(32.W))
    val srcB   = IO(UInt(32.W))
    val res    = IO(UInt(32.W))
    val select = IO(Bool())
  })


  when(io.select) {
    io.res := io.srcA + io.srcB
  } .otherwise {
    io.res := io.srcA - io.srcB
  }
}




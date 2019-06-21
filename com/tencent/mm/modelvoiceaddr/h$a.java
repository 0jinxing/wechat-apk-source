package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Random;

public final class h$a
{
  public String data;
  public int gbA;
  public boolean gbB;
  public String gbv;
  public boolean gbw;
  public boolean gbx;
  public int gby;
  public int gbz;

  public h$a(h paramh)
  {
    AppMethodBeat.i(116746);
    long l1 = 0xFFFFFFFF & System.currentTimeMillis();
    long l2 = 0xFFFFFFFF & new Random(System.currentTimeMillis()).nextInt();
    long l3 = l1 << 32 | l2;
    long l4 = l3;
    if (l3 < 0L)
      l4 = Math.abs(l3);
    paramh = this.gbC.gbr + String.valueOf(l4);
    ab.i("MicroMsg.ShortSentenceContainer", "finally random = %s(%s) time = %s(%s) id = %s(%s) session = %s strId = %s", new Object[] { Long.valueOf(l2), Long.toBinaryString(l2), Long.valueOf(l1), Long.toBinaryString(l1), Long.valueOf(l4), Long.toBinaryString(l4), this.gbC.gbr, paramh });
    this.gbv = paramh;
    this.gbw = false;
    this.gbx = false;
    this.gby = 2147483647;
    this.gbz = 0;
    this.gbA = -1;
    this.data = null;
    this.gbB = false;
    AppMethodBeat.o(116746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.h.a
 * JD-Core Version:    0.6.2
 */
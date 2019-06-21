package com.tencent.mm.plugin.mmsight.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  long geE;
  long kCh;
  long otF;
  private String tag;
  long value;

  public b(String paramString)
  {
    AppMethodBeat.i(76460);
    this.tag = "default";
    this.kCh = bo.yz();
    this.otF = bo.yz();
    this.value = 0L;
    this.geE = 0L;
    this.tag = paramString;
    AppMethodBeat.o(76460);
  }

  public final String bPk()
  {
    AppMethodBeat.i(76463);
    String str;
    if (this.geE == 0L)
    {
      str = "";
      AppMethodBeat.o(76463);
    }
    while (true)
    {
      return str;
      double d1 = (this.otF - this.kCh) / 1000.0D;
      double d2 = d1;
      if (d1 == 0.0D)
        d2 = 1.0D;
      str = 1.0D * this.geE / d2;
      AppMethodBeat.o(76463);
    }
  }

  public final String getValue()
  {
    AppMethodBeat.i(76462);
    String str;
    if (this.geE == 0L)
    {
      str = "";
      AppMethodBeat.o(76462);
    }
    while (true)
    {
      return str;
      double d1 = (this.otF - this.kCh) / 1000.0D;
      double d2 = d1;
      if (d1 == 0.0D)
        d2 = 1.0D;
      str = String.format("CounterUtil %s tag %s count %s passed %.3f perValue %.3f/count counttime %.3f/s valuetime %.3f/s st:%s ed:%s diff%s", new Object[] { "", this.tag, Long.valueOf(this.geE), Double.valueOf(d2), Double.valueOf(this.value * 1.0D / this.geE), Double.valueOf(this.geE * 1.0D / d2), Double.valueOf(1.0D * this.value / d2), Long.valueOf(this.kCh), Long.valueOf(this.otF), Long.valueOf(this.otF - this.kCh) });
      AppMethodBeat.o(76462);
    }
  }

  public final void jl(long paramLong)
  {
    AppMethodBeat.i(76461);
    if (this.geE == 0L)
      this.kCh = bo.yz();
    this.value += paramLong;
    this.geE += 1L;
    this.otF = bo.yz();
    AppMethodBeat.o(76461);
  }

  public final void reset()
  {
    this.value = 0L;
    this.geE = 0L;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b
 * JD-Core Version:    0.6.2
 */
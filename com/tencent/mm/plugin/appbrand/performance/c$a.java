package com.tencent.mm.plugin.appbrand.performance;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$a
{
  long aZV;
  String appId;
  String category;
  String ivO;
  String ivP;
  String name;
  long start;

  public final String toString()
  {
    AppMethodBeat.i(114382);
    String str = this.name + "," + this.category + "," + this.ivO + "," + (this.start - c.aKr()) + "," + (this.aZV - c.aKr()) + "," + this.ivP;
    AppMethodBeat.o(114382);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.c.a
 * JD-Core Version:    0.6.2
 */
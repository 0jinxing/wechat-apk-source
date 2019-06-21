package com.tencent.mm.plugin.appbrand.service;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum i$a
{
  public final String tag;

  static
  {
    AppMethodBeat.i(114921);
    iDF = new a("CLICK", 0, "1");
    iDG = new a("SWIPE", 1, "2");
    iDH = new a[] { iDF, iDG };
    AppMethodBeat.o(114921);
  }

  private i$a(String paramString)
  {
    this.tag = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.service.i.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.n;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c$a
{
  private String name;

  static
  {
    AppMethodBeat.i(91130);
    izo = new a("AppStart", 0, "AppStart");
    izp = new a("LoadPageFrame", 1, "LoadPageFrame");
    izq = new a("PrepareJsRuntime", 2, "PrepareJsRuntime");
    izr = new a("GetDom", 3, "GetDom");
    izs = new a("ParseDom", 4, "ParseDom");
    izt = new a("DiffDom", 5, "DiffDom");
    izu = new a("GetGlobalCss", 6, "GetGlobalCss");
    izv = new a("GetCss", 7, "GetCss");
    izw = new a("ParseCss", 8, "ParseCss");
    izx = new a("GetData", 9, "GetData");
    izy = new a("Layout", 10, "Layout");
    izz = new a("JSEvent", 11, "JSEvent");
    izA = new a("StartUp", 12, "StartUp");
    izB = new a[] { izo, izp, izq, izr, izs, izt, izu, izv, izw, izx, izy, izz, izA };
    AppMethodBeat.o(91130);
  }

  private c$a(String paramString)
  {
    this.name = paramString;
  }

  public final String toString()
  {
    return this.name;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.n.c.a
 * JD-Core Version:    0.6.2
 */
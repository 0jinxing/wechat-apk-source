package com.tencent.mm.plugin.appbrand.launching.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum b
{
  final String fNY;
  final int scene;

  static
  {
    AppMethodBeat.i(132034);
    ijk = new b("WALLET", 0, "weapp://wallet/", 1019);
    ijl = new b("SEARCH_NATIVE_FEATURE", 1, "weapp://search/", 1005);
    ijm = new b[] { ijk, ijl };
    AppMethodBeat.o(132034);
  }

  private b(String paramString, int paramInt)
  {
    this.fNY = paramString;
    this.scene = paramInt;
  }

  static String aHI()
  {
    return "";
  }

  static String aHJ()
  {
    return "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.b.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.ui.banner;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum b$a
{
  static final int iKx;

  static
  {
    AppMethodBeat.i(133268);
    iKs = new a("appId", 0);
    iKt = new a("versionType", 1);
    iKu = new a("appName", 2);
    iKv = new a("iconURL", 3);
    iKw = new a("customText", 4);
    iKy = new a[] { iKs, iKt, iKu, iKv, iKw };
    iKx = values().length;
    AppMethodBeat.o(133268);
  }

  public final String wP()
  {
    AppMethodBeat.i(133267);
    String str = "appbrand_top_banner_in_chatting_extra_key_" + name();
    AppMethodBeat.o(133267);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.b.a
 * JD-Core Version:    0.6.2
 */
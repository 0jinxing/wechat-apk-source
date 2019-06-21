package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum as$a
{
  static
  {
    AppMethodBeat.i(59516);
    gUI = new a("APP_READY", 0);
    gUJ = new a("APP_MANIFEST_NULL", 1);
    gUK = new a("PKG_EXPIRED", 2);
    gUL = new a("APP_NOT_INSTALLED", 3);
    gUM = new a("APP_BROKEN", 4);
    gUN = new a("ENV_ERR", 5);
    gUO = new a[] { gUI, gUJ, gUK, gUL, gUM, gUN };
    AppMethodBeat.o(59516);
  }

  public final int awj()
  {
    AppMethodBeat.i(59515);
    int i = super.ordinal();
    AppMethodBeat.o(59515);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.as.a
 * JD-Core Version:    0.6.2
 */
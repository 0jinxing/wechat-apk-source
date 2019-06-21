package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class ab extends j<aa>
{
  public static final String[] fjY;

  static
  {
    AppMethodBeat.i(129408);
    fjY = new String[] { j.a(aa.gSs, "PkgUpdateStats") };
    AppMethodBeat.o(129408);
  }

  public ab(e parame)
  {
    super(parame, aa.gSs, "PkgUpdateStats", aa.diI);
  }

  final boolean ao(String paramString, int paramInt)
  {
    AppMethodBeat.i(129407);
    aa localaa = new aa();
    localaa.field_key = paramString;
    localaa.field_version = paramInt;
    boolean bool = super.a(localaa, aa.gSr);
    AppMethodBeat.o(129407);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ab
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.profile.ui.newbizinfo.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends j<d>
{
  public static final String[] fjY;
  public static final String[] fjZ;

  static
  {
    AppMethodBeat.i(23959);
    fjY = new String[] { j.a(d.fjX, "ProfileInfo") };
    fjZ = new String[0];
    AppMethodBeat.o(23959);
  }

  public a(e parame)
  {
    super(parame, d.fjX, "ProfileInfo", fjZ);
  }

  public final d Va(String paramString)
  {
    AppMethodBeat.i(23958);
    d locald = new d();
    locald.field_username = paramString;
    if (!b(locald, new String[] { "username" }))
    {
      ab.e("MicroMsg.ProfileInfoStorage", "profileInfo is null");
      paramString = null;
      AppMethodBeat.o(23958);
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.ProfileInfoStorage", "get username:%s", new Object[] { locald.field_username });
      AppMethodBeat.o(23958);
      paramString = locald;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.d.a
 * JD-Core Version:    0.6.2
 */
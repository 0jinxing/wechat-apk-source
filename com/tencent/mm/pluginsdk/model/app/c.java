package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends j<b>
{
  public static final String[] fnj;
  e bSd;

  static
  {
    AppMethodBeat.i(79236);
    fnj = new String[] { j.a(b.ccO, "appattach") };
    AppMethodBeat.o(79236);
  }

  public c(e parame)
  {
    super(parame, b.ccO, "appattach", null);
    this.bSd = parame;
  }

  public final boolean a(b paramb, String[] paramArrayOfString)
  {
    AppMethodBeat.i(79233);
    boolean bool = super.c(paramb, paramArrayOfString);
    ab.d("MicroMsg.AppAttachInfoStorage", "update AppAttachInfo field_mediaId %s field_mediaSvrId %s ret %s %s", new Object[] { paramb.field_mediaId, paramb.field_mediaSvrId, Boolean.valueOf(bool), "" });
    AppMethodBeat.o(79233);
    return bool;
  }

  public final b aiE(String paramString)
  {
    AppMethodBeat.i(79232);
    b localb = new b();
    localb.field_mediaSvrId = paramString;
    if (b(localb, new String[] { "mediaSvrId" }))
    {
      AppMethodBeat.o(79232);
      paramString = localb;
    }
    while (true)
    {
      return paramString;
      if (b(localb, new String[] { "mediaId" }))
      {
        AppMethodBeat.o(79232);
        paramString = localb;
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(79232);
      }
    }
  }

  public final void lY(long paramLong)
  {
    AppMethodBeat.i(79231);
    String str = " update appattach set status = 198 , lastModifyTime = " + bo.anT() + " where rowid = " + paramLong;
    this.bSd.hY("appattach", str);
    doNotify();
    AppMethodBeat.o(79231);
  }

  public final b lZ(long paramLong)
  {
    AppMethodBeat.i(79234);
    b localb = new b();
    localb.field_msgInfoId = paramLong;
    if (b(localb, new String[] { "msgInfoId" }))
      AppMethodBeat.o(79234);
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(79234);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.c
 * JD-Core Version:    0.6.2
 */
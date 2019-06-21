package com.tencent.mm.aj.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends j<com.tencent.mm.g.c.ab>
{
  public static final String[] fnj;
  private e bSd;
  private final l<g.a, g.a.b> fuL;

  static
  {
    AppMethodBeat.i(11566);
    fnj = new String[] { j.a(f.ccO, "BizChatMyUserInfo") };
    AppMethodBeat.o(11566);
  }

  public g(e parame)
  {
    super(parame, f.ccO, "BizChatMyUserInfo", null);
    AppMethodBeat.i(11560);
    this.fuL = new g.1(this);
    this.bSd = parame;
    parame.hY("BizChatMyUserInfo", "CREATE INDEX IF NOT EXISTS bizChatbrandUserNameIndex ON BizChatMyUserInfo ( brandUserName )");
    AppMethodBeat.o(11560);
  }

  public final boolean a(f paramf)
  {
    AppMethodBeat.i(11563);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert");
    boolean bool = super.b(paramf);
    if (bool)
    {
      g.a.b localb = new g.a.b();
      localb.cwz = paramf.field_brandUserName;
      localb.fxN = g.a.a.fxJ;
      localb.fxO = paramf;
      this.fuL.cF(localb);
      this.fuL.doNotify();
    }
    while (true)
    {
      AppMethodBeat.o(11563);
      return bool;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert fail");
    }
  }

  public final boolean b(f paramf)
  {
    AppMethodBeat.i(11564);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update");
    if (paramf == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BizChatMyUserInfoStorage", "update wrong argument");
      bool = false;
      AppMethodBeat.o(11564);
      return bool;
    }
    boolean bool = super.a(paramf);
    if (bool)
    {
      g.a.b localb = new g.a.b();
      localb.cwz = paramf.field_brandUserName;
      localb.fxN = g.a.a.fxL;
      localb.fxO = paramf;
      this.fuL.cF(localb);
      this.fuL.doNotify();
    }
    while (true)
    {
      AppMethodBeat.o(11564);
      break;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update fail");
    }
  }

  public final int getCount()
  {
    int i = 0;
    AppMethodBeat.i(11565);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage getCount");
    Cursor localCursor = this.bSd.a("SELECT COUNT(*) FROM BizChatMyUserInfo", null, 2);
    if (localCursor.moveToFirst())
      i = localCursor.getInt(0);
    localCursor.close();
    AppMethodBeat.o(11565);
    return i;
  }

  public final f rA(String paramString)
  {
    AppMethodBeat.i(11561);
    if (bo.isNullOrNil(paramString))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BizChatMyUserInfoStorage", "get： wrong argument");
      paramString = null;
      AppMethodBeat.o(11561);
    }
    while (true)
    {
      return paramString;
      f localf = new f();
      localf.field_brandUserName = paramString;
      super.b(localf, new String[0]);
      AppMethodBeat.o(11561);
      paramString = localf;
    }
  }

  public final boolean rB(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11562);
    if (bo.isNullOrNil(paramString))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BizChatMyUserInfoStorage", "delete wrong argument");
      AppMethodBeat.o(11562);
    }
    while (true)
    {
      return bool;
      f localf = new f();
      localf.field_brandUserName = paramString;
      bool = super.a(localf, new String[] { "brandUserName" });
      if (bool)
      {
        paramString = new g.a.b();
        paramString.cwz = localf.field_brandUserName;
        paramString.fxN = g.a.a.fxK;
        paramString.fxO = localf;
        this.fuL.cF(paramString);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11562);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.g
 * JD-Core Version:    0.6.2
 */
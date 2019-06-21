package com.tencent.mm.plugin.appbrand.game.b.a;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class c extends j<b>
{
  public static final String[] fjY;
  private final boolean hrm;

  static
  {
    AppMethodBeat.i(130120);
    fjY = new String[] { j.a(b.ccO, "WxagGameInfo") };
    AppMethodBeat.o(130120);
  }

  public c(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, b.ccO, "WxagGameInfo", null);
    AppMethodBeat.i(130109);
    if (parame != null);
    for (boolean bool = true; ; bool = false)
    {
      this.hrm = bool;
      if (!this.hrm)
        ab.e("MicroMsg.MiniGameInfoStorage", "storage can not work!!!");
      AppMethodBeat.o(130109);
      return;
    }
  }

  private boolean a(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(130117);
    if ((!this.hrm) || (paramb == null))
      AppMethodBeat.o(130117);
    while (true)
    {
      return bool;
      bool = super.a(paramb, new String[0]);
      AppMethodBeat.o(130117);
    }
  }

  private b bd(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(130118);
    if (!this.hrm)
    {
      AppMethodBeat.o(130118);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery(String.format("select * from %s where %s=? and %s=?", new Object[] { "WxagGameInfo", "AppId", "debugType" }), new String[] { paramString, String.valueOf(paramInt) });
      if (localCursor.moveToFirst())
      {
        paramString = new b();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(130118);
      }
      else
      {
        localCursor.close();
        AppMethodBeat.o(130118);
        paramString = localObject;
      }
    }
  }

  private static String be(String paramString, int paramInt)
  {
    AppMethodBeat.i(130119);
    paramInt = String.format(Locale.US, "%s|%d", new Object[] { paramString, Integer.valueOf(paramInt) }).hashCode();
    AppMethodBeat.o(130119);
    return String.valueOf(paramInt);
  }

  public final b As(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(130111);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(130111);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WxagGameInfo", "RecordId" }), new String[] { paramString });
      if (localCursor.moveToFirst())
      {
        paramString = new b();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(130111);
      }
      else
      {
        ab.i("MicroMsg.MiniGameInfoStorage", "getMiniGame recordId:%s, no record in DB", new Object[] { paramString });
        localCursor.close();
        AppMethodBeat.o(130111);
        paramString = localObject;
      }
    }
  }

  public final boolean a(a parama, boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(130116);
    if ((!this.hrm) || (parama == null))
    {
      AppMethodBeat.o(130116);
      paramBoolean = bool1;
      return paramBoolean;
    }
    b localb = bd(parama.fKh, parama.gVs);
    if ((localb == null) || (!localb.field_isSync));
    for (boolean bool2 = true; ; bool2 = false)
    {
      ab.i("MicroMsg.MiniGameInfoStorage", "needUpdate:%b", new Object[] { Boolean.valueOf(bool2) });
      if (bool2)
      {
        a(localb);
        localb = new b();
        if (bo.isNullOrNil(parama.euD))
          parama.euD = be(parama.jBB, parama.gVs);
        localb.field_RecordId = parama.euD;
        localb.field_AppId = parama.fKh;
        localb.field_AppName = parama.ncH;
        localb.field_UserName = parama.jBB;
        localb.field_IconUrl = parama.IconUrl;
        localb.field_BriefIntro = parama.nay;
        localb.field_isSync = false;
        localb.field_createTime = System.currentTimeMillis();
        bool2 = b(localb);
        if ((bool2) && (paramBoolean))
          b("single", 2, localb.field_RecordId);
        AppMethodBeat.o(130116);
        paramBoolean = bool2;
        break;
      }
      AppMethodBeat.o(130116);
      paramBoolean = bool1;
      break;
    }
  }

  public final List<b> aAH()
  {
    Object localObject1 = null;
    AppMethodBeat.i(130110);
    if (!this.hrm)
      AppMethodBeat.o(130110);
    while (true)
    {
      return localObject1;
      Object localObject2 = String.format("select * from %s", new Object[] { "WxagGameInfo" });
      Cursor localCursor = rawQuery((String)localObject2, new String[0]);
      ab.i("MicroMsg.MiniGameInfoStorage", "getMiniGameList queryStr:%s", new Object[] { localObject2 });
      if (localCursor == null)
      {
        ab.i("MicroMsg.MiniGameInfoStorage", "cursor is null");
        AppMethodBeat.o(130110);
      }
      else if (localCursor.moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          localObject2 = new b();
          ((b)localObject2).d(localCursor);
          ((List)localObject1).add(localObject2);
        }
        while (localCursor.moveToNext());
        localCursor.close();
        ab.i("MicroMsg.MiniGameInfoStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
        AppMethodBeat.o(130110);
      }
      else
      {
        localCursor.close();
        ab.i("MicroMsg.MiniGameInfoStorage", "no record");
        AppMethodBeat.o(130110);
      }
    }
  }

  public final boolean aH(List<String> paramList)
  {
    AppMethodBeat.i(130115);
    boolean bool;
    if ((!this.hrm) || (bo.ek(paramList)))
    {
      AppMethodBeat.o(130115);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        ae((String)localIterator.next(), false);
      b("batch", 5, paramList);
      bool = true;
      AppMethodBeat.o(130115);
    }
  }

  public final boolean ae(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(130114);
    if ((!this.hrm) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(130114);
    for (paramBoolean = bool; ; paramBoolean = bool)
    {
      return paramBoolean;
      b localb = new b();
      localb.field_RecordId = paramString;
      bool = super.a(localb, new String[0]);
      if ((bool) && (paramBoolean))
        b("single", 5, paramString);
      AppMethodBeat.o(130114);
    }
  }

  public final boolean b(List<a> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(130113);
    if ((!this.hrm) || (bo.ek(paramList)))
      AppMethodBeat.o(130113);
    for (paramBoolean = false; ; paramBoolean = true)
    {
      return paramBoolean;
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        a(locala, false);
        localArrayList.add(locala.euD);
      }
      if (paramBoolean)
        b("batch", 2, localArrayList);
      ab.i("MicroMsg.MiniGameInfoStorage", "insert miniGame size:%d,   isSync:%b", new Object[] { Integer.valueOf(paramList.size()), Boolean.FALSE });
      AppMethodBeat.o(130113);
    }
  }

  public final void c(k.a parama)
  {
    AppMethodBeat.i(130112);
    a(parama, com.tencent.mm.plugin.appbrand.s.e.aNS().oAl.getLooper());
    AppMethodBeat.o(130112);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.a.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.aj;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class i extends j<g>
{
  public static final String[] fnj;
  private com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(11400);
    fnj = new String[] { j.a(g.ccO, "BizKF") };
    AppMethodBeat.o(11400);
  }

  public i(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, g.ccO, "BizKF", null);
    AppMethodBeat.i(11392);
    this.bSd = parame;
    parame.hY("BizKF", "CREATE INDEX IF NOT EXISTS BizKFAppIdUsernameIndex ON BizKF ( brandUsername )");
    parame.hY("BizKF", "CREATE INDEX IF NOT EXISTS BizKFOpenIdIndex ON BizKF ( openId )");
    AppMethodBeat.o(11392);
  }

  public static boolean a(g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(11394);
    if (paramg != null)
      if (System.currentTimeMillis() - paramg.field_updateTime >= 86400000L)
      {
        bool = true;
        AppMethodBeat.o(11394);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(11394);
      continue;
      AppMethodBeat.o(11394);
    }
  }

  private boolean b(g paramg)
  {
    AppMethodBeat.i(11395);
    if ((paramg == null) || (bo.isNullOrNil(paramg.field_openId)) || (bo.isNullOrNil(paramg.field_brandUsername)))
    {
      ab.w("MicroMsg.BizKFStorage", "wrong argument");
      AppMethodBeat.o(11395);
      bool = false;
      return bool;
    }
    ContentValues localContentValues = paramg.Hl();
    if (this.bSd.replace("BizKF", g.ccO.xDc, localContentValues) > 0L);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.BizKFStorage", "replace: openId=%s, brandUsername=%s, ret=%s ", new Object[] { paramg.field_openId, paramg.field_brandUsername, Boolean.valueOf(bool) });
      AppMethodBeat.o(11395);
      break;
    }
  }

  public final int f(LinkedList<g> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(11398);
    if (paramLinkedList.size() <= 0)
    {
      ab.e("MicroMsg.BizKFStorage", "null kfs");
      AppMethodBeat.o(11398);
      return i;
    }
    if ((this.bSd instanceof h));
    for (long l = ((h)this.bSd).iV(Thread.currentThread().getId()); ; l = 0L)
    {
      Iterator localIterator = paramLinkedList.iterator();
      i = 0;
      label65: if (localIterator.hasNext())
      {
        paramLinkedList = (g)localIterator.next();
        if ((paramLinkedList == null) || (!b(paramLinkedList)))
          break label152;
        i++;
      }
      label152: 
      while (true)
      {
        break label65;
        if ((this.bSd instanceof h))
          com.tencent.mm.kernel.g.RP().eJN.mB(l);
        ab.i("MicroMsg.BizKFStorage", "insertOrUpdateBizKFs %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(11398);
        break;
      }
    }
  }

  public final g rg(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11393);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(11393);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("BizKF", null, "openId=?", new String[] { paramString }, null, null, null, 2);
      if (!localCursor.moveToFirst())
      {
        ab.w("MicroMsg.BizKFStorage", "get null with openId:".concat(String.valueOf(paramString)));
        localCursor.close();
        AppMethodBeat.o(11393);
        paramString = localObject;
      }
      else
      {
        paramString = new g();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(11393);
      }
    }
  }

  public final g rh(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11396);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(11396);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("BizKF", null, "brandUsername = ? order by kfType desc ", new String[] { paramString }, null, null, null, 2);
      if (!localCursor.moveToFirst())
      {
        ab.w("MicroMsg.BizKFStorage", "get null with brandUsername:".concat(String.valueOf(paramString)));
        localCursor.close();
        AppMethodBeat.o(11396);
        paramString = localObject;
      }
      else
      {
        paramString = new g();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(11396);
      }
    }
  }

  public final int ri(String paramString)
  {
    AppMethodBeat.i(11397);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = -1;
      AppMethodBeat.o(11397);
    }
    while (true)
    {
      return i;
      i = this.bSd.delete("BizKF", "brandUsername = ?", new String[] { paramString });
      ab.i("MicroMsg.BizKFStorage", "deleteKFWorker by brand username(u:%s, r:%d).", new Object[] { paramString, Integer.valueOf(i) });
      AppMethodBeat.o(11397);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.i
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.a.d;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  LinkedList<String> mVh;
  LinkedList<f> mVi;

  public b()
  {
    AppMethodBeat.i(111189);
    this.mVi = new LinkedList();
    this.mVh = new LinkedList();
    AppMethodBeat.o(111189);
  }

  private void bDO()
  {
    AppMethodBeat.i(111192);
    Object localObject1 = new ArrayList();
    Object localObject2 = ((d)com.tencent.mm.kernel.g.K(d.class)).XS().rawQuery("select * from FileDownloadInfo where status=3", new String[0]);
    if (localObject2 == null);
    while (!((List)localObject1).isEmpty())
    {
      Object localObject3 = ((List)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (String)((Iterator)localObject3).next();
        if ((!bo.isNullOrNil((String)localObject1)) && (!this.mVh.contains(localObject1)))
        {
          localObject2 = com.tencent.mm.pluginsdk.model.app.g.bT((String)localObject1, false);
          if ((localObject2 != null) && (!this.mVi.contains(localObject2)))
          {
            this.mVi.add(localObject2);
            this.mVh.add(localObject1);
          }
        }
      }
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new com.tencent.mm.plugin.downloader.f.a();
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).d((Cursor)localObject2);
        if ((!bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject3).field_appId)) && (((com.tencent.mm.plugin.downloader.f.a)localObject3).field_appId.startsWith("wx")) && (((com.tencent.mm.plugin.downloader.f.a)localObject3).field_status == 3) && (e.ct(((com.tencent.mm.plugin.downloader.f.a)localObject3).field_filePath)) && (!((List)localObject1).contains(((com.tencent.mm.plugin.downloader.f.a)localObject3).field_appId)))
          ((List)localObject1).add(((com.tencent.mm.plugin.downloader.f.a)localObject3).field_appId);
      }
      ((Cursor)localObject2).close();
    }
    AppMethodBeat.o(111192);
  }

  private void dW(Context paramContext)
  {
    AppMethodBeat.i(111191);
    Cursor localCursor = com.tencent.mm.plugin.s.a.bYJ().dhE();
    if (localCursor == null)
    {
      ab.e("MicroMsg.GameAppCacheService", "getInstalledGame faild: curosr is null");
      AppMethodBeat.o(111191);
    }
    while (true)
    {
      return;
      if (localCursor.moveToFirst())
        do
        {
          f localf = new f();
          localf.d(localCursor);
          if ((com.tencent.mm.pluginsdk.model.app.g.a(paramContext, localf)) && (!this.mVh.contains(localf.field_appId)))
          {
            ab.i("MicroMsg.GameAppCacheService", "installed game:[%s][%s]", new Object[] { localf.field_appName, localf.field_appId });
            this.mVi.add(localf);
            this.mVh.add(localf.field_appId);
          }
        }
        while (localCursor.moveToNext());
      localCursor.close();
      AppMethodBeat.o(111191);
    }
  }

  public final void clearCache()
  {
    AppMethodBeat.i(111193);
    ab.i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
    if (this.mVi != null)
      this.mVi.clear();
    if (this.mVh != null)
      this.mVh.clear();
    AppMethodBeat.o(111193);
  }

  public final void init(Context paramContext)
  {
    AppMethodBeat.i(111190);
    if (this.mVi == null)
    {
      this.mVi = new LinkedList();
      if (this.mVh != null)
        break label122;
      this.mVh = new LinkedList();
    }
    while (true)
    {
      long l1 = System.currentTimeMillis();
      dW(paramContext);
      long l2 = System.currentTimeMillis();
      bDO();
      long l3 = System.currentTimeMillis();
      ab.i("MicroMsg.GameAppCacheService", "Init time: %d, %d, %d", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(l3 - l1) });
      AppMethodBeat.o(111190);
      return;
      this.mVi.clear();
      break;
      label122: this.mVh.clear();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.appcache;

import android.database.Cursor;
import android.os.StatFs;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class x
{
  private static final byte[] gSj = new byte[0];

  public static x.b a(long paramLong, x.a parama)
  {
    AppMethodBeat.i(129404);
    if (paramLong <= 0L)
    {
      parama = x.b.gTu;
      AppMethodBeat.o(129404);
    }
    while (true)
    {
      return parama;
      Object localObject1 = new StatFs(ap.avY());
      int i = ((StatFs)localObject1).getAvailableBlocks();
      long l = ((StatFs)localObject1).getBlockSize() * i;
      if ((l < 0L) || (l > paramLong))
      {
        parama = x.b.gTu;
        AppMethodBeat.o(129404);
      }
      else
      {
        localObject1 = (ad)f.E(ad.class);
        if (localObject1 == null)
        {
          ab.e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy %d, lruStorage NULL", new Object[] { Long.valueOf(paramLong) });
          parama = x.b.gTw;
          AppMethodBeat.o(129404);
        }
        else
        {
          Object localObject2 = String.format(Locale.US, " %s, %s ASC", new Object[] { "hit", "hitTimeMS" });
          Object localObject3 = new LinkedList();
          synchronized (gSj)
          {
            localObject2 = ((ad)localObject1).bSd.a("PkgUsageLRURecord", new String[] { "appId", "type" }, null, null, null, null, (String)localObject2, 2);
            if (localObject2 == null)
            {
              parama = x.b.gTw;
              AppMethodBeat.o(129404);
              continue;
            }
            if (!((Cursor)localObject2).moveToFirst())
            {
              ((Cursor)localObject2).close();
              parama = x.b.gTw;
              AppMethodBeat.o(129404);
            }
          }
          try
          {
            boolean bool;
            do
            {
              ((LinkedList)localObject3).add(Pair.create(((Cursor)localObject2).getString(0), Integer.valueOf(((Cursor)localObject2).getInt(1))));
              bool = ((Cursor)localObject2).moveToNext();
            }
            while (bool);
            ((Cursor)localObject2).close();
            ??? = f.auV();
            if (??? == null)
            {
              ab.e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy %d, pkgStorage NULL", new Object[] { Long.valueOf(paramLong) });
              parama = x.b.gTw;
              AppMethodBeat.o(129404);
              continue;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy, read from cursor e = %s", new Object[] { localException });
              ((Cursor)localObject2).close();
            }
            parama = finally;
            AppMethodBeat.o(129404);
            throw parama;
          }
          finally
          {
            ((Cursor)localObject2).close();
            AppMethodBeat.o(129404);
          }
          a(parama);
          Iterator localIterator2 = ((LinkedList)localObject3).iterator();
          l = 0L;
          i = 0;
          label614: 
          while (true)
          {
            if (!localIterator2.hasNext())
              break label617;
            localObject2 = (Pair)localIterator2.next();
            Iterator localIterator1 = ((ax)???).a((String)((Pair)localObject2).first, ((Integer)((Pair)localObject2).second).intValue(), ax.a.gVm, new String[] { "pkgPath" }).iterator();
            while (true)
            {
              if (!localIterator1.hasNext())
                break label614;
              localObject3 = (at)localIterator1.next();
              l = com.tencent.mm.vfs.e.asZ(((at)localObject3).field_pkgPath) + l;
              com.tencent.mm.vfs.e.deleteFile(((at)localObject3).field_pkgPath);
              i++;
              ((ad)localObject1).am((String)((Pair)localObject2).first, ((Integer)((Pair)localObject2).second).intValue());
              a(parama);
              if (l >= paramLong)
              {
                parama = new com.tencent.mm.g.b.a.bo();
                parama.dcY = 3L;
                parama.ddb = i;
                if (r.avG());
                for (paramLong = 1L; ; paramLong = 0L)
                {
                  parama.dcW = paramLong;
                  parama.ajK();
                  parama = x.b.gTv;
                  AppMethodBeat.o(129404);
                  break;
                }
              }
            }
          }
          label617: parama = x.b.gTw;
          AppMethodBeat.o(129404);
        }
      }
    }
  }

  private static void a(x.a parama)
  {
    AppMethodBeat.i(129405);
    if ((parama != null) && (parama.avo()))
    {
      parama = new InterruptedException();
      AppMethodBeat.o(129405);
      throw parama;
    }
    AppMethodBeat.o(129405);
  }

  public static void an(String arg0, int paramInt)
  {
    AppMethodBeat.i(129402);
    if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(???))
      AppMethodBeat.o(129402);
    while (true)
    {
      return;
      String str = p.zm(???);
      if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(str))
      {
        AppMethodBeat.o(129402);
        continue;
      }
      ad localad = (ad)f.E(ad.class);
      if (localad == null)
      {
        AppMethodBeat.o(129402);
        continue;
      }
      synchronized (gSj)
      {
        ac localac = new com/tencent/mm/plugin/appbrand/appcache/ac;
        localac.<init>();
        localac.field_appId = str;
        localac.field_type = paramInt;
        if (localad.b(localac, ac.gSr))
        {
          localac.field_hit += 1;
          localac.field_hitTimeMS = com.tencent.mm.sdk.platformtools.bo.anU();
          localad.c(localac, ac.gSr);
          AppMethodBeat.o(129402);
          continue;
        }
        localac.field_hit = 1;
        localac.field_hitTimeMS = com.tencent.mm.sdk.platformtools.bo.anU();
        localad.b(localac);
      }
    }
  }

  public static x.b gg(long paramLong)
  {
    AppMethodBeat.i(129403);
    try
    {
      x.b localb1 = a(paramLong, x.a.gTt);
      AppMethodBeat.o(129403);
      return localb1;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimOffSize with dummy check, get interrupted, e = %s", new Object[] { localInterruptedException });
        x.b localb2 = x.b.gTw;
        AppMethodBeat.o(129403);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.x
 * JD-Core Version:    0.6.2
 */
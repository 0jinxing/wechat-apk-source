package com.tencent.mm.plugin.appbrand.appcache;

import android.database.Cursor;
import android.os.StatFs;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class g
{
  private static final byte[] gSj = new byte[0];

  public static g.b a(long paramLong, g.a parama)
  {
    AppMethodBeat.i(129332);
    if (paramLong <= 0L)
    {
      parama = g.b.gSn;
      AppMethodBeat.o(129332);
    }
    while (true)
    {
      return parama;
      Object localObject1 = new StatFs(ap.avY());
      long l = ((StatFs)localObject1).getAvailableBlocks();
      l = ((StatFs)localObject1).getBlockSize() * l;
      if ((l < 0L) || (l > paramLong))
      {
        parama = g.b.gSn;
        AppMethodBeat.o(129332);
      }
      else
      {
        localObject1 = (f)com.tencent.mm.plugin.appbrand.app.f.E(f.class);
        if (localObject1 == null)
        {
          ab.e("MicroMsg.AppBrand.CodeLibPruneLRULogic", "trimBy %d, lruStorage NULL", new Object[] { Long.valueOf(paramLong) });
          parama = g.b.gSp;
          AppMethodBeat.o(129332);
        }
        else
        {
          Object localObject2 = String.format(Locale.US, " %s, %s ASC", new Object[] { "hit", "hitTimeMS" });
          Object localObject3 = new LinkedList();
          synchronized (gSj)
          {
            localObject2 = ((f)localObject1).bSd.a("CodeLibUsageLRURecord", new String[] { "appId", "version" }, null, null, null, null, (String)localObject2, 2);
            if (localObject2 == null)
            {
              parama = g.b.gSp;
              AppMethodBeat.o(129332);
              continue;
            }
            if (!((Cursor)localObject2).moveToFirst())
            {
              ((Cursor)localObject2).close();
              parama = g.b.gSp;
              AppMethodBeat.o(129332);
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
            ab.i("MicroMsg.AppBrand.CodeLibPruneLRULogic", "codelib size:%d", new Object[] { Integer.valueOf(((LinkedList)localObject3).size()) });
            ??? = com.tencent.mm.plugin.appbrand.app.f.auV();
            if (??? == null)
            {
              ab.e("MicroMsg.AppBrand.CodeLibPruneLRULogic", "trimBy %d, pkgStorage NULL", new Object[] { Long.valueOf(paramLong) });
              parama = g.b.gSp;
              AppMethodBeat.o(129332);
              continue;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.AppBrand.CodeLibPruneLRULogic", "trimBy, read from cursor e = %s", new Object[] { localException });
              ((Cursor)localObject2).close();
            }
            parama = finally;
            AppMethodBeat.o(129332);
            throw parama;
          }
          finally
          {
            ((Cursor)localObject2).close();
            AppMethodBeat.o(129332);
          }
          a(parama);
          localObject3 = ((LinkedList)localObject3).iterator();
          l = 0L;
          int i = 0;
          label597: label728: label731: 
          while (true)
          {
            if (!((Iterator)localObject3).hasNext())
              break label734;
            Pair localPair = (Pair)((Iterator)localObject3).next();
            localObject2 = ((ax)???).b((String)localPair.first, ((Integer)localPair.second).intValue(), ax.a.gVm, new String[] { "pkgPath" }).iterator();
            while (true)
            {
              if (!((Iterator)localObject2).hasNext())
                break label731;
              at localat = (at)((Iterator)localObject2).next();
              l = com.tencent.mm.a.e.cs(localat.field_pkgPath) + l;
              ab.i("MicroMsg.AppBrand.CodeLibPruneLRULogic", "wxapkg appid:%s,delete path:%s", new Object[] { localat.field_appId, localat.field_pkgPath });
              com.tencent.mm.a.e.deleteFile(localat.field_pkgPath);
              String str = localat.field_appId;
              final int j = localat.field_version;
              if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(str))
              {
                ab.e("MicroMsg.AppBrand.CodeLibPruneLRULogic", "removeCodeCache appId null or nil!");
                i++;
                ((f)localObject1).am((String)localPair.first, ((Integer)localPair.second).intValue());
                a(parama);
                if (l < paramLong)
                  break label728;
                parama = new com.tencent.mm.g.b.a.bo();
                parama.dcY = 4L;
                parama.ddb = i;
                if (!r.avH())
                  break label723;
              }
              for (paramLong = 1L; ; paramLong = 0L)
              {
                parama.dcW = paramLong;
                parama.ajK();
                parama = g.b.gSo;
                AppMethodBeat.o(129332);
                break;
                str = str.substring(0, str.indexOf("$"));
                com.tencent.mm.plugin.appbrand.app.f.avc();
                am.a(new FilenameFilter()
                {
                  public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
                  {
                    AppMethodBeat.i(129327);
                    boolean bool = paramAnonymousString.equals(this.gSk + "_" + j);
                    AppMethodBeat.o(129327);
                    return bool;
                  }
                });
                break label597;
              }
            }
          }
          label723: label734: parama = g.b.gSp;
          AppMethodBeat.o(129332);
        }
      }
    }
  }

  private static void a(g.a parama)
  {
    AppMethodBeat.i(129333);
    if ((parama != null) && (parama.avo()))
    {
      parama = new InterruptedException();
      AppMethodBeat.o(129333);
      throw parama;
    }
    AppMethodBeat.o(129333);
  }

  public static void an(String paramString, int paramInt)
  {
    AppMethodBeat.i(129331);
    if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString))
      AppMethodBeat.o(129331);
    while (true)
    {
      return;
      f localf = (f)com.tencent.mm.plugin.appbrand.app.f.E(f.class);
      if (localf == null)
      {
        AppMethodBeat.o(129331);
        continue;
      }
      synchronized (gSj)
      {
        h localh = new com/tencent/mm/plugin/appbrand/appcache/h;
        localh.<init>();
        localh.field_appId = paramString;
        localh.field_version = paramInt;
        if (localf.b(localh, h.gSr))
        {
          localh.field_hit += 1;
          localh.field_hitTimeMS = com.tencent.mm.sdk.platformtools.bo.anU();
          localf.c(localh, h.gSr);
          AppMethodBeat.o(129331);
          continue;
        }
        localh.field_hit = 1;
        localh.field_hitTimeMS = com.tencent.mm.sdk.platformtools.bo.anU();
        localf.b(localh);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.g
 * JD-Core Version:    0.6.2
 */
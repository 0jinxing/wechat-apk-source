package com.tencent.mm.plugin.appbrand.appcache;

import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.PackageManager;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n$d
  implements n
{
  final AtomicBoolean gSD;

  public n$d()
  {
    AppMethodBeat.i(129343);
    this.gSD = new AtomicBoolean();
    AppMethodBeat.o(129343);
  }

  private void avA()
  {
    AppMethodBeat.i(129348);
    File localFile = new File(ap.avY());
    if ((!localFile.exists()) || (!localFile.isDirectory()))
      AppMethodBeat.o(129348);
    while (true)
    {
      return;
      for (localFile : localFile.listFiles(new FileFilter()
      {
        public final boolean accept(File paramAnonymousFile)
        {
          AppMethodBeat.i(129340);
          boolean bool = paramAnonymousFile.isFile();
          AppMethodBeat.o(129340);
          return bool;
        }
      }))
        if (!f.auV().xH(localFile.getAbsolutePath()))
          n.a.xo(localFile.getAbsolutePath());
      AppMethodBeat.o(129348);
    }
  }

  private void avy()
  {
    AppMethodBeat.i(129344);
    if (this.gSD.get())
    {
      InterruptedException localInterruptedException = new InterruptedException();
      AppMethodBeat.o(129344);
      throw localInterruptedException;
    }
    AppMethodBeat.o(129344);
  }

  private void avz()
  {
    AppMethodBeat.i(129347);
    avy();
    long l1 = com.tencent.mm.sdk.platformtools.bo.anT();
    long l2 = AppBrandGlobalSystemConfig.ayC().hgf.hgv;
    Object localObject1 = ((af)f.E(af.class)).baR();
    if ((localObject1 == null) || (((Cursor)localObject1).isClosed()))
      AppMethodBeat.o(129347);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      if (((Cursor)localObject1).moveToFirst())
        do
        {
          localObject2 = new ae();
          ((ae)localObject2).d((Cursor)localObject1);
          localLinkedList.add(localObject2);
        }
        while (((Cursor)localObject1).moveToNext());
      ((Cursor)localObject1).close();
      avy();
      Object localObject2 = localLinkedList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (ae)((Iterator)localObject2).next();
        if (e.ct(((ae)localObject1).field_pkgPath))
        {
          avy();
          if (TimeUnit.MILLISECONDS.toSeconds(new File(((ae)localObject1).field_pkgPath).lastModified()) < l1 - l2)
          {
            ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processEncrypted, delete record(%s %d %d)", new Object[] { ((ae)localObject1).field_appId, Integer.valueOf(((ae)localObject1).field_type), Integer.valueOf(((ae)localObject1).field_version) });
            ((af)f.E(af.class)).a((c)localObject1, new String[0]);
            e.cu(((ae)localObject1).field_pkgPath);
          }
        }
      }
      AppMethodBeat.o(129347);
    }
  }

  // ERROR //
  private static void ay(List<String> paramList)
  {
    // Byte code:
    //   0: ldc 224
    //   2: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 228	com/tencent/mm/sdk/platformtools/bo:ek	(Ljava/util/List;)Z
    //   9: ifeq +9 -> 18
    //   12: ldc 224
    //   14: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   17: return
    //   18: invokestatic 98	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   21: lstore_1
    //   22: invokestatic 104	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig:ayC	()Lcom/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig;
    //   25: getfield 108	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig:hgf	Lcom/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig$PackageManager;
    //   28: getfield 114	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig$PackageManager:hgv	J
    //   31: lstore_3
    //   32: aload_0
    //   33: invokeinterface 157 1 0
    //   38: astore 5
    //   40: aload 5
    //   42: invokeinterface 162 1 0
    //   47: ifeq +160 -> 207
    //   50: aload 5
    //   52: invokeinterface 166 1 0
    //   57: checkcast 215	java/lang/String
    //   60: astore_0
    //   61: aload_0
    //   62: invokestatic 231	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   65: ifne +12 -> 77
    //   68: aload_0
    //   69: ldc 233
    //   71: invokevirtual 236	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   74: ifne -34 -> 40
    //   77: aload_0
    //   78: iconst_0
    //   79: invokestatic 242	com/tencent/mm/plugin/appbrand/launching/h:bm	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   82: astore 6
    //   84: aload 6
    //   86: ifnonnull +37 -> 123
    //   89: new 244	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   96: aload_0
    //   97: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: bipush 36
    //   102: invokevirtual 252	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   105: ldc 254
    //   107: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 257	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: iconst_0
    //   114: invokestatic 242	com/tencent/mm/plugin/appbrand/launching/h:bm	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   117: ifnonnull -77 -> 40
    //   120: goto -80 -> 40
    //   123: getstatic 181	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   126: new 37	java/io/File
    //   129: dup
    //   130: aload 6
    //   132: getfield 262	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gSP	Ljava/lang/String;
    //   135: invokespecial 46	java/io/File:<init>	(Ljava/lang/String;)V
    //   138: invokevirtual 184	java/io/File:lastModified	()J
    //   141: invokevirtual 188	java/util/concurrent/TimeUnit:toSeconds	(J)J
    //   144: lload_1
    //   145: lload_3
    //   146: lsub
    //   147: lcmp
    //   148: ifge -108 -> 40
    //   151: ldc 190
    //   153: ldc_w 264
    //   156: iconst_2
    //   157: anewarray 4	java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: aload_0
    //   163: aastore
    //   164: dup
    //   165: iconst_1
    //   166: aload 6
    //   168: getfield 267	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gVu	I
    //   171: invokestatic 205	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   174: aastore
    //   175: invokestatic 213	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: invokestatic 66	com/tencent/mm/plugin/appbrand/app/f:auV	()Lcom/tencent/mm/plugin/appbrand/appcache/ax;
    //   181: aload_0
    //   182: aload 6
    //   184: getfield 267	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gVu	I
    //   187: invokevirtual 271	com/tencent/mm/plugin/appbrand/appcache/ax:av	(Ljava/lang/String;I)I
    //   190: pop
    //   191: invokestatic 66	com/tencent/mm/plugin/appbrand/app/f:auV	()Lcom/tencent/mm/plugin/appbrand/appcache/ax;
    //   194: aload_0
    //   195: aload 6
    //   197: getfield 267	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gVu	I
    //   200: invokevirtual 274	com/tencent/mm/plugin/appbrand/appcache/ax:aw	(Ljava/lang/String;I)I
    //   203: pop
    //   204: goto -164 -> 40
    //   207: ldc 224
    //   209: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: goto -195 -> 17
  }

  public final void run()
  {
    AppMethodBeat.i(129345);
    if (f.auV() == null)
    {
      ab.e("MicroMsg.AppBrand.PkgCleanupNewLogic", "run() entered but storage not ready");
      AppMethodBeat.o(129345);
    }
    while (true)
    {
      return;
      this.gSD.set(false);
      try
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(1007L, 1L, 1L);
      }
      catch (Throwable localThrowable1)
      {
        Object localObject3;
        while (true)
        {
          try
          {
            Object localObject1 = f.auV().awo();
            if (com.tencent.mm.sdk.platformtools.bo.ek((List)localObject1))
              break label357;
            avy();
            l1 = com.tencent.mm.sdk.platformtools.bo.anT();
            localObject1 = ((List)localObject1).iterator();
            if (!((Iterator)localObject1).hasNext())
              break label357;
            localObject3 = (at)((Iterator)localObject1).next();
            if (com.tencent.mm.plugin.appbrand.task.h.DS(((at)localObject3).field_appId))
            {
              ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDebug appID(%s) is running, skip", new Object[] { ((at)localObject3).field_appId });
              continue;
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "interrupted %s", new Object[] { Log.getStackTraceString(localInterruptedException) });
            AppMethodBeat.o(129345);
            break;
            localThrowable1 = localThrowable1;
            ab.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", localThrowable1, "cleanup start report", new Object[0]);
            continue;
            avy();
            if ((((at)localObject3).field_endTime <= 0L) || (((at)localObject3).field_endTime > l1))
              break label309;
            if (((at)localObject3).field_debugType != 999)
              continue;
            n.a.xo(((at)localObject3).field_pkgPath);
            f.auV().a((at)localObject3);
            ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDebug, (%s, %d) exceed time range[%d, %d]", new Object[] { ((at)localObject3).field_appId, Integer.valueOf(((at)localObject3).field_debugType), Long.valueOf(((at)localObject3).field_startTime), Long.valueOf(((at)localObject3).field_endTime) });
            continue;
          }
          catch (Throwable localThrowable2)
          {
            ab.e("MicroMsg.AppBrand.PkgCleanupNewLogic", "process occur exception %s", new Object[] { localThrowable2 });
            AppMethodBeat.o(129345);
          }
          break;
          label309: if (((at)localObject3).field_debugType == 999)
            ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDebug, debug library not exceed time range[%d %d]", new Object[] { Long.valueOf(((at)localObject3).field_startTime), Long.valueOf(((at)localObject3).field_endTime) });
        }
        label357: avy();
        Object localObject2 = f.auK();
        int i = ai.avM();
        int j = i;
        label396: Object localObject4;
        label474: label510: long l3;
        label529: double d1;
        double d2;
        boolean bool;
        label587: double d3;
        if (i <= 0)
        {
          localObject3 = com.tencent.mm.plugin.appbrand.launching.h.bm("@LibraryAppId", 0);
          if (localObject3 == null)
            j = 0;
        }
        else
        {
          if (j > 0)
          {
            ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processRelease, delete libraries record < %d", new Object[] { Integer.valueOf(j) });
            f.auV().av("@LibraryAppId", j);
          }
          localObject4 = ((com.tencent.mm.cd.h)localObject2).a("select distinct appId from AppBrandWxaPkgManifestRecord where debugType=? and appId!=? and appId not like '%%$%%'", new String[] { "0", "@LibraryAppId" }, 0);
          if ((localObject4 != null) && (!((Cursor)localObject4).isClosed()))
            break label742;
          avz();
          avA();
          avy();
          localObject2 = new android/os/StatFs;
          ((StatFs)localObject2).<init>(ap.avY());
          if (Build.VERSION.SDK_INT < 18)
            break label1071;
          l1 = ((StatFs)localObject2).getBlockCountLong();
          long l2 = n.b.avw();
          if (Build.VERSION.SDK_INT < 18)
            break label1080;
          l3 = ((StatFs)localObject2).getBlockSizeLong();
          d1 = l2 / l3 / l1;
          d2 = AppBrandGlobalSystemConfig.ayC().hgf.hgx / 100.0F;
          if ((d1 <= d2) || (l2 <= AppBrandGlobalSystemConfig.ayC().hgf.hgw * 1048576L))
            break label1090;
          bool = true;
          ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, usedPercent(%f), maxPercent(%f), usedBytes(%d), maxMB(%d), shouldCleanup=%B", new Object[] { Double.valueOf(d1), Double.valueOf(d2), Long.valueOf(l2), Long.valueOf(AppBrandGlobalSystemConfig.ayC().hgf.hgw), Boolean.valueOf(bool) });
          if (!bool)
            break label1151;
          ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, cleanup by conditions usedPercent(%f) > maxPercent(%f)", new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
          d3 = l1;
          if (Build.VERSION.SDK_INT < 18)
            break label1096;
        }
        label794: label1062: label1064: label1071: label1080: label1090: label1096: for (long l1 = ((StatFs)localObject2).getBlockSizeLong(); ; l1 = ((StatFs)localObject2).getBlockSize())
        {
          l1 = ()(l1 * (d3 * (d1 - d2)));
          if (l1 >= 0L)
            break label1105;
          ab.e("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, calculated bytesToTrim is minus");
          AppMethodBeat.o(129345);
          break;
          j = ((WxaPkgWrappingInfo)localObject3).gVu;
          break label396;
          label742: localObject3 = new java/util/LinkedList;
          ((LinkedList)localObject3).<init>();
          if (((Cursor)localObject4).moveToFirst())
          {
            localObject2 = ((Cursor)localObject4).getString(0);
            if (com.tencent.mm.plugin.appbrand.task.h.DS((String)localObject2))
            {
              ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processRelease appID(%s) is running, skip", new Object[] { localObject2 });
              if (((Cursor)localObject4).moveToNext())
                break label912;
            }
          }
          else
          {
            ((Cursor)localObject4).close();
            localObject2 = new java/util/LinkedList;
            ((LinkedList)localObject2).<init>();
            avy();
            localObject3 = ((List)localObject3).iterator();
          }
          while (true)
          {
            if (!((Iterator)localObject3).hasNext())
              break label1064;
            localObject4 = (String)((Iterator)localObject3).next();
            Object localObject5 = f.auO().e((String)localObject4, new String[] { "versionInfo" });
            if ((localObject5 == null) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((WxaAttributes)localObject5).field_versionInfo)))
            {
              ((List)localObject2).add(localObject4);
              continue;
              ((List)localObject3).add(localObject2);
              break label794;
              break;
            }
            avy();
            if (((WxaAttributes)localObject5).ayL() == null);
            for (j = 0; ; j = ((WxaAttributes)localObject5).ayL().axy)
            {
              if (j <= 0)
                break label1062;
              i = f.auV().av((String)localObject4, j);
              if (i > 0)
              {
                ab.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processRelease, delete record(%s) < %d, count(%d)", new Object[] { localObject4, Integer.valueOf(j), Integer.valueOf(i) });
                localObject5 = new com/tencent/mm/g/b/a/bo;
                ((com.tencent.mm.g.b.a.bo)localObject5).<init>();
                ((com.tencent.mm.g.b.a.bo)localObject5).dcY = 2L;
                localObject5 = ((com.tencent.mm.g.b.a.bo)localObject5).gk((String)localObject4);
                ((com.tencent.mm.g.b.a.bo)localObject5).dda = 0L;
                ((com.tencent.mm.g.b.a.bo)localObject5).ddb = i;
                ((com.tencent.mm.g.b.a.bo)localObject5).dcW = 1L;
                ((com.tencent.mm.g.b.a.bo)localObject5).ajK();
              }
              f.auV().aw((String)localObject4, j);
              break;
            }
          }
          ay((List)localObject2);
          break label474;
          l1 = ((StatFs)localObject2).getBlockCount();
          break label510;
          l3 = ((StatFs)localObject2).getBlockSize();
          break label529;
          bool = false;
          break label587;
        }
        label912: label1105: avy();
        localObject2 = new com/tencent/mm/plugin/appbrand/appcache/n$d$2;
        ((n.d.2)localObject2).<init>(this);
        x.a(l1, (x.a)localObject2);
        if (r.avH())
        {
          l1 /= 5L;
          localObject2 = new com/tencent/mm/plugin/appbrand/appcache/n$d$3;
          ((n.d.3)localObject2).<init>(this);
          g.a(l1, (g.a)localObject2);
        }
        label1151: AppMethodBeat.o(129345);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.n.d
 * JD-Core Version:    0.6.2
 */
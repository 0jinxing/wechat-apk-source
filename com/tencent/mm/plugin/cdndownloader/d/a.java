package com.tencent.mm.plugin.cdndownloader.d;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.cdndownloader.f.c;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState;
import com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;

public final class a
  implements com.tencent.mm.ipcinvoker.wx_extension.b.a
{
  private static a kte;
  private static final Object kth;
  private long ktf;
  private long ktg;
  com.tencent.mm.plugin.cdndownloader.a.a kti;
  private Set<CDNTaskInfo> ktj;
  public b ktk;
  private ServiceConnection ktl;
  private ap ktm;
  private com.tencent.mm.plugin.cdndownloader.a.b ktn;
  private n.a kto;
  private Context mContext;

  static
  {
    AppMethodBeat.i(922);
    kth = new Object();
    AppMethodBeat.o(922);
  }

  public a()
  {
    AppMethodBeat.i(900);
    this.ktf = 0L;
    this.ktg = 0L;
    this.ktj = new com.tencent.mm.plugin.cdndownloader.e.a(new a.1(this));
    this.ktl = new a.2(this);
    this.ktm = new ap(com.tencent.mm.ce.a.dvQ().getLooper(), new a.3(this), true);
    this.ktn = new a.4(this);
    this.kto = new a.5(this);
    this.mContext = ah.getContext();
    g.RQ();
    g.RO().a(this.kto);
    beW();
    AppMethodBeat.o(900);
  }

  private void beR()
  {
    AppMethodBeat.i(908);
    if (this.kti != null);
    while (true)
    {
      try
      {
        this.kti.beR();
        AppMethodBeat.o(908);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.CDNDownloadClient", "addIPCTaskMarker: ".concat(String.valueOf(localRemoteException)));
      }
      AppMethodBeat.o(908);
    }
  }

  public static a beV()
  {
    try
    {
      AppMethodBeat.i(899);
      if (kte == null)
      {
        locala = new com/tencent/mm/plugin/cdndownloader/d/a;
        locala.<init>();
        kte = locala;
      }
      a locala = kte;
      AppMethodBeat.o(899);
      return locala;
    }
    finally
    {
    }
  }

  private void beW()
  {
    try
    {
      AppMethodBeat.i(901);
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(this.mContext, CDNDownloadService.class);
      try
      {
        ab.i("MicroMsg.CDNDownloadClient", "bindService: ".concat(String.valueOf(this.mContext.bindService(localIntent, this.ktl, 1))));
        AppMethodBeat.o(901);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("bindService: ");
          ab.e("MicroMsg.CDNDownloadClient", localException.getMessage());
          AppMethodBeat.o(901);
        }
      }
    }
    finally
    {
    }
  }

  private void c(CDNTaskInfo paramCDNTaskInfo)
  {
    AppMethodBeat.i(909);
    this.ktj.add(paramCDNTaskInfo);
    com.tencent.mm.plugin.cdndownloader.f.b.a(e(paramCDNTaskInfo));
    AppMethodBeat.o(909);
  }

  private void d(CDNTaskInfo paramCDNTaskInfo)
  {
    AppMethodBeat.i(910);
    this.ktj.remove(paramCDNTaskInfo);
    com.tencent.mm.plugin.cdndownloader.f.b.HF(paramCDNTaskInfo.downloadUrl);
    AppMethodBeat.o(910);
  }

  private static com.tencent.mm.plugin.cdndownloader.f.a e(CDNTaskInfo paramCDNTaskInfo)
  {
    AppMethodBeat.i(911);
    com.tencent.mm.plugin.cdndownloader.f.a locala = new com.tencent.mm.plugin.cdndownloader.f.a();
    locala.field_mediaId = paramCDNTaskInfo.cHr;
    locala.field_downloadUrlHashCode = paramCDNTaskInfo.downloadUrl.hashCode();
    locala.field_downloadUrl = paramCDNTaskInfo.downloadUrl;
    locala.field_httpsUrl = paramCDNTaskInfo.ktq;
    locala.field_filePath = paramCDNTaskInfo.filePath;
    locala.field_verifyHeaders = paramCDNTaskInfo.ktr;
    locala.field_allowMobileNetDownload = Boolean.valueOf(paramCDNTaskInfo.ktu);
    locala.field_wifiAutoDownload = Boolean.valueOf(paramCDNTaskInfo.ktv);
    locala.field_game_package_download = Boolean.valueOf(paramCDNTaskInfo.egs);
    AppMethodBeat.o(911);
    return locala;
  }

  // ERROR //
  public final boolean HA(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: sipush 903
    //   7: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: ldc 144
    //   12: ldc_w 422
    //   15: aload_1
    //   16: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   19: invokevirtual 174	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   22: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_1
    //   26: invokestatic 427	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   29: ifeq +23 -> 52
    //   32: ldc 144
    //   34: ldc_w 429
    //   37: invokestatic 432	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: sipush 903
    //   43: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: iload_2
    //   47: istore_3
    //   48: aload_0
    //   49: monitorexit
    //   50: iload_3
    //   51: ireturn
    //   52: new 244	com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo
    //   55: astore 4
    //   57: aload 4
    //   59: aload_1
    //   60: invokespecial 433	com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo:<init>	(Ljava/lang/String;)V
    //   63: aload_0
    //   64: aload 4
    //   66: invokespecial 139	com/tencent/mm/plugin/cdndownloader/d/a:d	(Lcom/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo;)V
    //   69: aload_0
    //   70: getfield 131	com/tencent/mm/plugin/cdndownloader/d/a:kti	Lcom/tencent/mm/plugin/cdndownloader/a/a;
    //   73: astore 4
    //   75: aload 4
    //   77: ifnull +59 -> 136
    //   80: aload_0
    //   81: getfield 131	com/tencent/mm/plugin/cdndownloader/d/a:kti	Lcom/tencent/mm/plugin/cdndownloader/a/a;
    //   84: aload_1
    //   85: invokeinterface 435 2 0
    //   90: istore_3
    //   91: sipush 903
    //   94: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: goto -49 -> 48
    //   100: astore_1
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_1
    //   104: athrow
    //   105: astore_1
    //   106: new 204	java/lang/StringBuilder
    //   109: astore 4
    //   111: aload 4
    //   113: ldc_w 437
    //   116: invokespecial 207	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   119: ldc 144
    //   121: aload 4
    //   123: aload_1
    //   124: invokevirtual 328	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   127: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: ldc 144
    //   138: ldc_w 439
    //   141: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: sipush 903
    //   147: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: iload_2
    //   151: istore_3
    //   152: goto -104 -> 48
    //
    // Exception table:
    //   from	to	target	type
    //   4	46	100	finally
    //   52	75	100	finally
    //   80	91	100	finally
    //   91	97	100	finally
    //   106	136	100	finally
    //   136	150	100	finally
    //   80	91	105	android/os/RemoteException
  }

  // ERROR //
  public final boolean HB(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: sipush 905
    //   7: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: ldc 144
    //   12: ldc_w 442
    //   15: aload_1
    //   16: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   19: invokevirtual 174	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   22: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_1
    //   26: invokestatic 427	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   29: ifeq +21 -> 50
    //   32: ldc 144
    //   34: ldc_w 444
    //   37: invokestatic 432	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: sipush 905
    //   43: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: aload_0
    //   47: monitorexit
    //   48: iload_2
    //   49: ireturn
    //   50: new 244	com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo
    //   53: astore_3
    //   54: aload_3
    //   55: aload_1
    //   56: invokespecial 433	com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo:<init>	(Ljava/lang/String;)V
    //   59: aload_0
    //   60: aload_3
    //   61: invokespecial 139	com/tencent/mm/plugin/cdndownloader/d/a:d	(Lcom/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo;)V
    //   64: aload_0
    //   65: getfield 131	com/tencent/mm/plugin/cdndownloader/d/a:kti	Lcom/tencent/mm/plugin/cdndownloader/a/a;
    //   68: astore_3
    //   69: aload_3
    //   70: ifnull +60 -> 130
    //   73: aload_0
    //   74: getfield 131	com/tencent/mm/plugin/cdndownloader/d/a:kti	Lcom/tencent/mm/plugin/cdndownloader/a/a;
    //   77: aload_1
    //   78: invokeinterface 446 2 0
    //   83: istore 4
    //   85: iload 4
    //   87: istore_2
    //   88: sipush 905
    //   91: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: goto -48 -> 46
    //   97: astore_1
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_1
    //   101: athrow
    //   102: astore_3
    //   103: new 204	java/lang/StringBuilder
    //   106: astore_1
    //   107: aload_1
    //   108: ldc_w 448
    //   111: invokespecial 207	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   114: ldc 144
    //   116: aload_1
    //   117: aload_3
    //   118: invokevirtual 328	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   121: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: ldc 144
    //   132: ldc_w 450
    //   135: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: sipush 905
    //   141: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: goto -98 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   4	46	97	finally
    //   50	69	97	finally
    //   73	85	97	finally
    //   88	94	97	finally
    //   103	130	97	finally
    //   130	144	97	finally
    //   73	85	102	android/os/RemoteException
  }

  public final CDNTaskState HC(String paramString)
  {
    Object localObject1 = null;
    while (true)
    {
      Object localObject2;
      Object localObject5;
      Object localObject4;
      try
      {
        AppMethodBeat.i(906);
        ab.i("MicroMsg.CDNDownloadClient", "queryDownloadTask: ".concat(String.valueOf(paramString)));
        if (bo.isNullOrNil(paramString))
        {
          ab.w("MicroMsg.CDNDownloadClient", "queryDownloadTask, url invalid");
          AppMethodBeat.o(906);
          paramString = localObject1;
          return paramString;
        }
        if (this.kti != null)
        {
          ab.d("MicroMsg.CDNDownloadClient", "queryDownloadTask service has connected");
          try
          {
            localObject2 = this.kti.HC(paramString);
            if ((((CDNTaskState)localObject2).taskState != 100) && (((CDNTaskState)localObject2).taskState != 101))
              break label462;
            Object localObject3 = this.ktj;
            localObject5 = new com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo;
            ((CDNTaskInfo)localObject5).<init>(paramString);
            if (((Set)localObject3).contains(localObject5))
              break label439;
            localObject3 = com.tencent.mm.plugin.cdndownloader.f.b.beQ();
            if (localObject3 == null)
              break label450;
            localObject5 = ((c)localObject3).rawQuery(String.format("select * from %s where %s=%s", new Object[] { "CdnDownloadInfo", "downloadUrlHashCode", Integer.valueOf(paramString.hashCode()) }), new String[0]);
            if (localObject5 == null)
              break label450;
            localObject3 = null;
            if (!((Cursor)localObject5).moveToNext())
              break label301;
            localObject3 = new com/tencent/mm/plugin/cdndownloader/f/a;
            ((com.tencent.mm.plugin.cdndownloader.f.a)localObject3).<init>();
            ((com.tencent.mm.plugin.cdndownloader.f.a)localObject3).d((Cursor)localObject5);
            continue;
          }
          catch (RemoteException localRemoteException)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("queryDownloadTask, ");
            ab.e("MicroMsg.CDNDownloadClient", localRemoteException.getMessage());
          }
        }
        else
        {
          localObject2 = this.ktj;
          localObject4 = new com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo;
          ((CDNTaskInfo)localObject4).<init>(paramString);
          if (!((Set)localObject2).contains(localObject4))
            break label500;
          paramString = new com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskState;
          paramString.<init>();
          paramString.taskState = 101;
          AppMethodBeat.o(906);
          continue;
        }
      }
      finally
      {
      }
      label301: ((Cursor)localObject5).close();
      label308: if (localObject4 != null)
      {
        localObject5 = new com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo;
        ((CDNTaskInfo)localObject5).<init>(paramString);
        ((CDNTaskInfo)localObject5).ktq = ((com.tencent.mm.plugin.cdndownloader.f.a)localObject4).field_httpsUrl;
        ((CDNTaskInfo)localObject5).cHr = ((com.tencent.mm.plugin.cdndownloader.f.a)localObject4).field_mediaId;
        ((CDNTaskInfo)localObject5).filePath = ((com.tencent.mm.plugin.cdndownloader.f.a)localObject4).field_filePath;
        ((CDNTaskInfo)localObject5).ktr = ((com.tencent.mm.plugin.cdndownloader.f.a)localObject4).field_verifyHeaders;
        ((CDNTaskInfo)localObject5).ktu = ((com.tencent.mm.plugin.cdndownloader.f.a)localObject4).field_allowMobileNetDownload.booleanValue();
        ((CDNTaskInfo)localObject5).ktv = ((com.tencent.mm.plugin.cdndownloader.f.a)localObject4).field_wifiAutoDownload.booleanValue();
        ((CDNTaskInfo)localObject5).egs = ((com.tencent.mm.plugin.cdndownloader.f.a)localObject4).field_game_package_download.booleanValue();
        ((CDNTaskInfo)localObject5).kts = 15;
        ((CDNTaskInfo)localObject5).ktt = 3600;
        localObject4 = localObject5;
        if (localObject4 != null)
          this.ktj.add(localObject4);
      }
      while (true)
      {
        label422: label439: AppMethodBeat.o(906);
        paramString = (String)localObject2;
        break;
        label450: localObject4 = null;
        break label308;
        localObject4 = null;
        break label422;
        label462: localObject5 = this.ktj;
        localObject4 = new com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo;
        ((CDNTaskInfo)localObject4).<init>(paramString);
        if (((Set)localObject5).contains(localObject4))
          ((CDNTaskState)localObject2).taskState = 101;
      }
      label500: AppMethodBeat.o(906);
      paramString = localObject1;
    }
  }

  public final CDNTaskState HE(String paramString)
  {
    try
    {
      AppMethodBeat.i(907);
      if (this.kti != null)
      {
        paramString = HC(paramString);
        AppMethodBeat.o(907);
      }
      while (true)
      {
        return paramString;
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId())
          break;
        paramString = null;
        AppMethodBeat.o(907);
      }
    }
    finally
    {
    }
    beW();
    try
    {
      synchronized (kth)
      {
        if (this.kti == null)
        {
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("queryDownloadTaskSync, wait for bindService, now: ");
          ab.i("MicroMsg.CDNDownloadClient", System.currentTimeMillis());
          localObject2 = new com/tencent/mm/plugin/cdndownloader/d/a$6;
          ((a.6)localObject2).<init>(this);
          com.tencent.mm.ce.a.r((Runnable)localObject2, 10000L);
          kth.wait();
        }
        paramString = HC(paramString);
        AppMethodBeat.o(907);
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.i("MicroMsg.CDNDownloadClient", "queryDownloadTaskSync，now: %d, exp: %s", new Object[] { Long.valueOf(System.currentTimeMillis()), localException.getMessage() });
    }
  }

  public final int a(CDNTaskInfo paramCDNTaskInfo)
  {
    int i = -2;
    while (true)
    {
      try
      {
        AppMethodBeat.i(902);
        if ((paramCDNTaskInfo == null) || (bo.isNullOrNil(paramCDNTaskInfo.downloadUrl)))
        {
          ab.w("MicroMsg.CDNDownloadClient", "addDownloadTask, info invalid");
          i = -1;
          AppMethodBeat.o(902);
          return i;
        }
        ab.i("MicroMsg.CDNDownloadClient", "addDownloadTask filePath:%s, url:%s", new Object[] { paramCDNTaskInfo.filePath, paramCDNTaskInfo.downloadUrl });
        if (this.ktj.contains(paramCDNTaskInfo))
        {
          ab.i("MicroMsg.CDNDownloadClient", "addDownloadTask, already in running");
          AppMethodBeat.o(902);
          continue;
        }
      }
      finally
      {
      }
      Object localObject = HC(paramCDNTaskInfo.downloadUrl);
      if ((localObject != null) && (((CDNTaskState)localObject).taskState == 104) && (e.ct(paramCDNTaskInfo.filePath)))
      {
        ab.i("MicroMsg.CDNDownloadClient", "addDownloadTask, has download success");
        AppMethodBeat.o(902);
        i = 1;
      }
      else
      {
        localObject = this.kti;
        if (localObject != null)
        {
          try
          {
            i = this.kti.a(paramCDNTaskInfo);
            this.ktn.e(paramCDNTaskInfo.cHr, 1, 0, "");
            if ((i == 0) || (i == -2))
              c(paramCDNTaskInfo);
            AppMethodBeat.o(902);
          }
          catch (RemoteException localRemoteException)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("addDownloadTask, ");
            ab.e("MicroMsg.CDNDownloadClient", localRemoteException.getMessage());
          }
        }
        else
        {
          c(paramCDNTaskInfo);
          beW();
          AppMethodBeat.o(902);
          i = 0;
        }
      }
    }
  }

  public final int b(CDNTaskInfo paramCDNTaskInfo)
  {
    int i = -2;
    while (true)
    {
      try
      {
        AppMethodBeat.i(904);
        if ((paramCDNTaskInfo == null) || (bo.isNullOrNil(paramCDNTaskInfo.downloadUrl)))
        {
          ab.w("MicroMsg.CDNDownloadClient", "resumeDownloadTask, info invalid");
          i = -1;
          AppMethodBeat.o(904);
          return i;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("resumeDownloadTask: ");
        ab.i("MicroMsg.CDNDownloadClient", paramCDNTaskInfo.downloadUrl);
        if (this.ktj.contains(paramCDNTaskInfo))
        {
          ab.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, already in running");
          AppMethodBeat.o(904);
          continue;
        }
      }
      finally
      {
      }
      Object localObject = HC(paramCDNTaskInfo.downloadUrl);
      if ((localObject != null) && (((CDNTaskState)localObject).taskState == 104) && (e.ct(paramCDNTaskInfo.filePath)))
      {
        ab.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, has download success");
        AppMethodBeat.o(904);
        i = 1;
      }
      else
      {
        paramCDNTaskInfo.ktw = true;
        localObject = this.kti;
        if (localObject != null)
        {
          try
          {
            i = this.kti.b(paramCDNTaskInfo);
            this.ktn.e(paramCDNTaskInfo.cHr, 1, 0, "");
            if ((i == 0) || (i == -2))
              c(paramCDNTaskInfo);
            AppMethodBeat.o(904);
          }
          catch (RemoteException localRemoteException)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("resumeDownloadTask, ");
            ab.e("MicroMsg.CDNDownloadClient", localRemoteException.getMessage());
          }
        }
        else
        {
          c(paramCDNTaskInfo);
          beW();
          AppMethodBeat.o(904);
          i = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.d.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.downloader.model;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

final class g extends h
{
  ap gyS;
  DownloadManager kNv;
  CopyOnWriteArraySet<Long> kNw;
  private Context mContext;

  public g(b paramb)
  {
    super(paramb);
    AppMethodBeat.i(2455);
    this.gyS = new ap(new g.2(this), false);
    this.mContext = ah.getContext();
    this.kNv = ((DownloadManager)this.mContext.getSystemService("download"));
    this.kNw = new CopyOnWriteArraySet();
    AppMethodBeat.o(2455);
  }

  private FileDownloadTaskInfo hB(long paramLong)
  {
    AppMethodBeat.i(2460);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    Object localObject = new DownloadManager.Query();
    ((DownloadManager.Query)localObject).setFilterById(new long[] { paramLong });
    while (true)
    {
      try
      {
        localObject = this.kNv.query((DownloadManager.Query)localObject);
        if (localObject == null)
        {
          ab.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
          AppMethodBeat.o(2460);
          return localFileDownloadTaskInfo;
        }
      }
      catch (Exception localException1)
      {
        ab.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", new Object[] { localException1.toString(), Long.valueOf(paramLong) });
        AppMethodBeat.o(2460);
        continue;
      }
      int i;
      int j;
      int k;
      int m;
      int n;
      if (localException1.moveToFirst())
      {
        i = localException1.getColumnIndex("status");
        j = localException1.getColumnIndex("uri");
        k = localException1.getColumnIndex("local_uri");
        m = localException1.getColumnIndex("bytes_so_far");
        n = localException1.getColumnIndex("total_size");
        if (i == -1);
      }
      try
      {
        switch (localException1.getInt(i))
        {
        default:
        case 1:
        case 2:
          while (true)
          {
            if (j != -1)
              localFileDownloadTaskInfo.url = localException1.getString(j);
            if (k != -1)
            {
              String str = localException1.getString(k);
              if (bo.isNullOrNil(str))
                break label483;
              ab.i("MicroMsg.FileDownloaderImpl23", "get download uri: [%s]", new Object[] { str });
              localFileDownloadTaskInfo.path = Uri.parse(str).getPath();
              ab.i("MicroMsg.FileDownloaderImpl23", "get download path: [%s]", new Object[] { localFileDownloadTaskInfo.path });
            }
            if (m != -1)
              localFileDownloadTaskInfo.kNr = localException1.getLong(m);
            if (n != -1)
              localFileDownloadTaskInfo.jrb = localException1.getLong(n);
            localException1.close();
            ab.i("MicroMsg.FileDownloaderImpl23", "querySysDownloadManager: id: %d, status: %d, url: %s, path: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localFileDownloadTaskInfo.status), localFileDownloadTaskInfo.url, localFileDownloadTaskInfo.path });
            AppMethodBeat.o(2460);
            break;
            localFileDownloadTaskInfo.status = 1;
          }
        case 16:
        case 4:
        case 8:
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", new Object[] { localException2.toString() });
          localFileDownloadTaskInfo.status = 4;
          continue;
          localFileDownloadTaskInfo.status = 4;
          continue;
          localFileDownloadTaskInfo.status = 2;
          continue;
          localFileDownloadTaskInfo.status = 3;
          continue;
          label483: ab.e("MicroMsg.FileDownloaderImpl23", "get download uri failed");
        }
      }
    }
  }

  public final long a(a parama)
  {
    return parama.field_downloadId;
  }

  public final long a(e parame)
  {
    long l = -1L;
    AppMethodBeat.i(2456);
    if ((parame == null) || (bo.isNullOrNil(parame.gUx)))
    {
      ab.e("MicroMsg.FileDownloaderImpl23", "Invalid Request");
      AppMethodBeat.o(2456);
    }
    while (true)
    {
      return l;
      if (parame.kNe)
      {
        ab.e("MicroMsg.FileDownloaderImpl23", "autoDownloadTask not use system downloader, appid = %s", new Object[] { parame.mAppId });
        AppMethodBeat.o(2456);
      }
      else
      {
        String str = parame.gUx;
        Object localObject1 = "";
        Object localObject2 = c.Iq(str);
        if (localObject2 != null)
        {
          localObject1 = hB(((a)localObject2).field_sysDownloadId);
          if (((FileDownloadTaskInfo)localObject1).status == 1)
          {
            l = ((FileDownloadTaskInfo)localObject1).id;
            AppMethodBeat.o(2456);
          }
          else
          {
            localObject1 = ((a)localObject2).field_filePath;
            this.kNv.remove(new long[] { ((a)localObject2).field_sysDownloadId });
          }
        }
        else
        {
          localObject2 = com.tencent.mm.compatible.util.h.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject2 = new com.tencent.mm.vfs.b((String)localObject2);
            if (!((com.tencent.mm.vfs.b)localObject2).exists())
              ab.i("MicroMsg.FileDownloaderImpl23", "download folder not exist, make new one : [%b]", new Object[] { Boolean.valueOf(((com.tencent.mm.vfs.b)localObject2).mkdirs()) });
          }
          if (!bo.isNullOrNil((String)localObject1))
          {
            localObject1 = new File((String)localObject1);
            if (((File)localObject1).exists())
              ab.i("MicroMsg.FileDownloaderImplBase", "Delete previous file result: %b", new Object[] { Boolean.valueOf(((File)localObject1).delete()) });
          }
          c.Io(str);
          c.Ip(parame.mAppId);
          localObject1 = f.c(parame);
          ((a)localObject1).field_downloadId = System.currentTimeMillis();
          ((a)localObject1).field_status = 0;
          ((a)localObject1).field_downloaderType = 1;
          str = ag.ck(str);
          ((a)localObject1).field_filePath = (com.tencent.mm.compatible.util.h.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/" + str);
          ((a)localObject1).field_startTime = System.currentTimeMillis();
          c.d((a)localObject1);
          com.tencent.mm.kernel.g.RS().aa(new g.1(this, parame, (a)localObject1));
          l = ((a)localObject1).field_downloadId;
          AppMethodBeat.o(2456);
        }
      }
    }
  }

  final long g(a parama)
  {
    AppMethodBeat.i(2459);
    try
    {
      Uri localUri = Uri.parse(parama.field_downloadUrl);
      DownloadManager.Request localRequest = new android/app/DownloadManager$Request;
      localRequest.<init>(localUri);
      localRequest.setAllowedNetworkTypes(3);
      localRequest.setShowRunningNotification(parama.field_showNotification);
      localRequest.setVisibleInDownloadsUi(parama.field_showNotification);
      if (!bo.isNullOrNil(parama.field_fileName))
        localRequest.setTitle(parama.field_fileName);
      localRequest.setDestinationUri(com.tencent.mm.vfs.e.asY(parama.field_filePath));
      l = this.kNv.enqueue(localRequest);
      if (l > 0L)
        AppMethodBeat.o(2459);
      while (true)
      {
        return l;
        ab.e("MicroMsg.FileDownloaderImpl23", "addToSysDownloadManager Failed: Invalid downloadId");
        AppMethodBeat.o(2459);
        l = -1L;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.FileDownloaderImpl23", "Add download task failed: %s, url: %s", new Object[] { localException.toString(), parama.field_downloadUrl });
        AppMethodBeat.o(2459);
        long l = -1L;
      }
    }
  }

  // ERROR //
  public final int hl(long paramLong)
  {
    // Byte code:
    //   0: sipush 2457
    //   3: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 405	com/tencent/mm/plugin/downloader/model/d:bij	()Lcom/tencent/mm/plugin/downloader/model/d;
    //   9: pop
    //   10: lload_1
    //   11: invokestatic 409	com/tencent/mm/plugin/downloader/model/d:hx	(J)Z
    //   14: ifeq +35 -> 49
    //   17: invokestatic 405	com/tencent/mm/plugin/downloader/model/d:bij	()Lcom/tencent/mm/plugin/downloader/model/d;
    //   20: pop
    //   21: lload_1
    //   22: invokestatic 413	com/tencent/mm/plugin/downloader/model/d:hy	(J)J
    //   25: lstore_1
    //   26: aload_0
    //   27: getfield 55	com/tencent/mm/plugin/downloader/model/g:kNv	Landroid/app/DownloadManager;
    //   30: iconst_1
    //   31: newarray long
    //   33: dup
    //   34: iconst_0
    //   35: lload_1
    //   36: lastore
    //   37: invokevirtual 244	android/app/DownloadManager:remove	([J)I
    //   40: istore_3
    //   41: sipush 2457
    //   44: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: iload_3
    //   48: ireturn
    //   49: lload_1
    //   50: invokestatic 417	com/tencent/mm/plugin/downloader/model/c:hv	(J)Lcom/tencent/mm/plugin/downloader/f/a;
    //   53: astore 4
    //   55: aload 4
    //   57: ifnonnull +22 -> 79
    //   60: ldc 86
    //   62: ldc_w 419
    //   65: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: sipush 2457
    //   71: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: iconst_0
    //   75: istore_3
    //   76: goto -29 -> 47
    //   79: aload_0
    //   80: getfield 55	com/tencent/mm/plugin/downloader/model/g:kNv	Landroid/app/DownloadManager;
    //   83: iconst_1
    //   84: newarray long
    //   86: dup
    //   87: iconst_0
    //   88: aload 4
    //   90: getfield 232	com/tencent/mm/plugin/downloader/f/a:field_sysDownloadId	J
    //   93: lastore
    //   94: invokevirtual 244	android/app/DownloadManager:remove	([J)I
    //   97: istore_3
    //   98: ldc 86
    //   100: ldc_w 421
    //   103: iconst_1
    //   104: anewarray 98	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: lload_1
    //   110: invokestatic 108	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   113: aastore
    //   114: invokestatic 153	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: aload 4
    //   119: getfield 240	com/tencent/mm/plugin/downloader/f/a:field_filePath	Ljava/lang/String;
    //   122: invokestatic 424	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   125: pop
    //   126: ldc 86
    //   128: ldc_w 426
    //   131: iconst_1
    //   132: anewarray 98	java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: aload 4
    //   139: getfield 240	com/tencent/mm/plugin/downloader/f/a:field_filePath	Ljava/lang/String;
    //   142: aastore
    //   143: invokestatic 153	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: aload 4
    //   148: iconst_5
    //   149: putfield 308	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   152: aload 4
    //   154: invokestatic 428	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   157: pop2
    //   158: aload_0
    //   159: getfield 432	com/tencent/mm/plugin/downloader/model/g:kMT	Lcom/tencent/mm/plugin/downloader/model/b;
    //   162: lload_1
    //   163: invokevirtual 438	com/tencent/mm/plugin/downloader/model/b:hr	(J)V
    //   166: aload_0
    //   167: getfield 62	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   170: lload_1
    //   171: invokestatic 108	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   174: invokevirtual 441	java/util/concurrent/CopyOnWriteArraySet:remove	(Ljava/lang/Object;)Z
    //   177: pop
    //   178: sipush 2457
    //   181: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: goto -137 -> 47
    //   187: astore 5
    //   189: iconst_0
    //   190: istore_3
    //   191: ldc 86
    //   193: ldc_w 443
    //   196: iconst_2
    //   197: anewarray 98	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: lload_1
    //   203: invokestatic 108	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   206: aastore
    //   207: dup
    //   208: iconst_1
    //   209: aload 5
    //   211: invokevirtual 102	java/lang/Exception:toString	()Ljava/lang/String;
    //   214: aastore
    //   215: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: goto -101 -> 117
    //   221: astore 5
    //   223: goto -32 -> 191
    //
    // Exception table:
    //   from	to	target	type
    //   79	98	187	java/lang/Exception
    //   98	117	221	java/lang/Exception
  }

  public final FileDownloadTaskInfo hm(long paramLong)
  {
    AppMethodBeat.i(2458);
    d.bij();
    FileDownloadTaskInfo localFileDownloadTaskInfo;
    if (d.hx(paramLong))
    {
      d.bij();
      localFileDownloadTaskInfo = hB(d.hy(paramLong));
      localFileDownloadTaskInfo.id = paramLong;
      localFileDownloadTaskInfo.cBA = 1;
      AppMethodBeat.o(2458);
    }
    while (true)
    {
      return localFileDownloadTaskInfo;
      a locala = c.hv(paramLong);
      if (locala == null)
      {
        localFileDownloadTaskInfo = new FileDownloadTaskInfo();
        AppMethodBeat.o(2458);
      }
      else
      {
        if ((locala.field_status == 4) || (locala.field_status == 2) || (locala.field_status == 5) || (locala.field_status == 3))
          this.kNw.remove(Long.valueOf(paramLong));
        localFileDownloadTaskInfo = new FileDownloadTaskInfo();
        localFileDownloadTaskInfo.id = locala.field_downloadId;
        localFileDownloadTaskInfo.url = locala.field_downloadUrl;
        localFileDownloadTaskInfo.status = locala.field_status;
        localFileDownloadTaskInfo.path = locala.field_filePath;
        localFileDownloadTaskInfo.cvZ = locala.field_md5;
        localFileDownloadTaskInfo.kNs = locala.field_autoDownload;
        localFileDownloadTaskInfo.cBA = locala.field_downloaderType;
        localFileDownloadTaskInfo.kNr = locala.field_downloadedSize;
        localFileDownloadTaskInfo.jrb = locala.field_totalSize;
        AppMethodBeat.o(2458);
      }
    }
  }

  public final boolean hn(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(2461);
    FileDownloadTaskInfo localFileDownloadTaskInfo = hm(paramLong);
    if (localFileDownloadTaskInfo == null)
    {
      ab.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(2461);
    }
    while (true)
    {
      return bool;
      this.kNw.remove(Long.valueOf(paramLong));
      if (localFileDownloadTaskInfo.status != 1)
      {
        ab.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task is not running", new Object[] { Long.valueOf(paramLong) });
        AppMethodBeat.o(2461);
        bool = true;
      }
      else
      {
        int i = hl(paramLong);
        ab.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task removed: %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
        if (i > 0)
        {
          AppMethodBeat.o(2461);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(2461);
        }
      }
    }
  }

  public final boolean ho(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(2462);
    a locala = c.hv(paramLong);
    if (locala == null)
    {
      ab.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(2462);
    }
    while (true)
    {
      return bool;
      if (locala.field_downloaderType != 1)
      {
        ab.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, downloader not matched", new Object[] { Long.valueOf(paramLong) });
        com.tencent.mm.vfs.e.deleteFile(locala.field_filePath);
        ab.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask, delete file: %s", new Object[] { locala.field_filePath });
        c.hw(paramLong);
        AppMethodBeat.o(2462);
      }
      else if (locala.field_status == 1)
      {
        ab.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, not in paused status", new Object[] { Long.valueOf(paramLong) });
        AppMethodBeat.o(2462);
      }
      else
      {
        this.kNv.remove(new long[] { locala.field_sysDownloadId });
        paramLong = g(locala);
        if (paramLong > 0L)
        {
          this.kNw.add(Long.valueOf(locala.field_downloadId));
          if (this.gyS.doT())
            this.gyS.ae(100L, 100L);
          locala.field_sysDownloadId = paramLong;
          locala.field_status = 1;
          c.e(locala);
          AppMethodBeat.o(2462);
          bool = true;
        }
        else
        {
          ab.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, restart failed");
          AppMethodBeat.o(2462);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.g
 * JD-Core Version:    0.6.2
 */
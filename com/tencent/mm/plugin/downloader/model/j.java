package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.CdnTaskStateInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;

public final class j extends h
{
  private static final String kMy;
  private HashMap<String, Long> kMA;
  private g.a kNz;
  private Context mContext;

  static
  {
    AppMethodBeat.i(2477);
    kMy = com.tencent.mm.loader.j.b.eSn + "WebNetFile";
    AppMethodBeat.o(2477);
  }

  public j(b paramb)
  {
    super(paramb);
    AppMethodBeat.i(2469);
    this.kNz = new g.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, com.tencent.mm.i.c paramAnonymousc, d paramAnonymousd, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(2468);
        String str1;
        String str2;
        if (paramAnonymousc == null)
        {
          str1 = "null";
          if (paramAnonymousd != null)
            break label94;
          str2 = "null";
          label23: ab.d("MicroMsg.FileWebNetDownloader", "on webnet callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), str1, str2 });
          if (paramAnonymousInt != -21006)
            break label104;
          ab.i("MicroMsg.FileWebNetDownloader", "duplicate request, ignore this request, media id is %s", new Object[] { paramAnonymousString });
          AppMethodBeat.o(2468);
        }
        while (true)
        {
          return 0;
          str1 = paramAnonymousc.toString();
          break;
          label94: str2 = paramAnonymousd.toString();
          break label23;
          label104: if (paramAnonymousInt != 0)
          {
            ab.e("MicroMsg.FileWebNetDownloader", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
            j.a(j.this, paramAnonymousString, 4, paramAnonymousInt);
            AppMethodBeat.o(2468);
          }
          else
          {
            if (paramAnonymousc == null)
              break label180;
            j.a(j.this, paramAnonymousString, paramAnonymousc.field_finishedLength, paramAnonymousc.field_toltalLength);
            AppMethodBeat.o(2468);
          }
        }
        label180: if (paramAnonymousd != null)
        {
          if (paramAnonymousd.field_retCode == 0)
            break label247;
          ab.e("MicroMsg.FileWebNetDownloader", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousd.field_retCode), paramAnonymousd });
          j.a(j.this, paramAnonymousString, 4, paramAnonymousd.field_retCode);
        }
        while (true)
        {
          AppMethodBeat.o(2468);
          break;
          label247: ab.i("MicroMsg.FileWebNetDownloader", "cdn trans suceess, media id : %s", new Object[] { paramAnonymousString });
          j.a(j.this, paramAnonymousString, 3, 0);
        }
      }

      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
      }

      public final byte[] l(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        return new byte[0];
      }
    };
    this.mContext = ah.getContext();
    this.kMA = new HashMap();
    AppMethodBeat.o(2469);
  }

  public final long a(com.tencent.mm.plugin.downloader.f.a parama)
  {
    return 0L;
  }

  public final long a(e parame)
  {
    AppMethodBeat.i(2470);
    long l;
    if ((parame == null) || (bo.isNullOrNil(parame.gUx)))
    {
      ab.e("MicroMsg.FileWebNetDownloader", "Invalid Request");
      l = -1L;
      AppMethodBeat.o(2470);
    }
    while (true)
    {
      return l;
      ab.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: %s", new Object[] { parame.gUx });
      localObject1 = parame.gUx;
      localObject2 = c.Iq((String)localObject1);
      if (localObject2 == null)
        break;
      localObject3 = hm(((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadId);
      ab.i("MicroMsg.FileWebNetDownloader", "addDownloadTask, status = " + ((FileDownloadTaskInfo)localObject3).status);
      if (((FileDownloadTaskInfo)localObject3).status != 1)
        break;
      l = ((FileDownloadTaskInfo)localObject3).id;
      AppMethodBeat.o(2470);
    }
    c.Io((String)localObject1);
    c.Ip(parame.mAppId);
    Object localObject3 = f.c(parame);
    ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadId = System.currentTimeMillis();
    ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloaderType = 4;
    Object localObject1 = ag.ck((String)localObject1);
    ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_filePath = (kMy + "/" + (String)localObject1);
    if (localObject2 != null)
    {
      localObject1 = ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_filePath;
      localObject2 = ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_filePath;
      if ((localObject1 != null) && (localObject2 != null) && (!((String)localObject1).equals(localObject2)))
      {
        ab.i("MicroMsg.FileWebNetDownloader", "removeLastFile, new File = %s, oldFile = %s", new Object[] { localObject1, localObject2 });
        localObject2 = new File((String)localObject2);
        if (((File)localObject2).exists())
          ab.i("MicroMsg.FileWebNetDownloader", "Delete previous file result: %b", new Object[] { Boolean.valueOf(((File)localObject2).delete()) });
      }
    }
    ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_startTime = System.currentTimeMillis();
    Object localObject2 = new File(kMy);
    File localFile;
    if (!((File)localObject2).exists())
    {
      if (!((File)localObject2).getParentFile().exists())
      {
        localFile = ((File)localObject2).getParentFile();
        localObject1 = new File(localFile.getAbsolutePath() + System.currentTimeMillis());
        if (((File)localObject1).mkdirs())
          ((File)localObject1).renameTo(localFile);
      }
      else
      {
        ab.i("MicroMsg.FileWebNetDownloader", "Make download dir result: %b", new Object[] { Boolean.valueOf(((File)localObject2).mkdirs()) });
      }
    }
    else
    {
      label429: localObject2 = new g();
      ((g)localObject2).egm = parame.gUx;
      ((g)localObject2).field_mediaId = parame.gUx;
      if (parame.kNb == 2)
      {
        ((g)localObject2).field_fileType = com.tencent.mm.i.a.efR;
        ((g)localObject2).egn = 20;
        ((g)localObject2).ego = 90;
      }
      ((g)localObject2).field_fullpath = ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_filePath;
      ((g)localObject2).egl = this.kNz;
      boolean bool = com.tencent.mm.al.f.afx().b((g)localObject2, -1);
      ab.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: ".concat(String.valueOf(bool)));
      if (!bool)
        break label604;
      ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_status = 1;
      c.d((com.tencent.mm.plugin.downloader.f.a)localObject3);
      this.kMT.j(((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadId, ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_filePath);
    }
    while (true)
    {
      l = ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadId;
      AppMethodBeat.o(2470);
      break;
      ab.e("MicroMsg.FileWebNetDownloader", "mkdir parent error, %s", new Object[] { localFile.getAbsolutePath() });
      break label429;
      label604: ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_status = 4;
      ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_errCode = com.tencent.mm.plugin.downloader.a.a.kJQ;
      c.d((com.tencent.mm.plugin.downloader.f.a)localObject3);
      this.kMT.d(((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadId, ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_errCode, false);
    }
  }

  public final int hl(long paramLong)
  {
    AppMethodBeat.i(2472);
    new Thread(new j.1(this, paramLong)).start();
    AppMethodBeat.o(2472);
    return 1;
  }

  public final FileDownloadTaskInfo hm(long paramLong)
  {
    AppMethodBeat.i(2471);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if (locala != null)
    {
      CdnLogic.CdnTaskStateInfo localCdnTaskStateInfo = CdnLogic.httpMultiSocketDownloadTaskState(locala.field_downloadUrl);
      if ((locala.field_status != 1) || ((localCdnTaskStateInfo != null) && ((localCdnTaskStateInfo.taskState == 100) || (localCdnTaskStateInfo.taskState == 101))))
        break label150;
    }
    label150: for (localFileDownloadTaskInfo.status = 0; ; localFileDownloadTaskInfo.status = locala.field_status)
    {
      localFileDownloadTaskInfo.kNr = locala.field_downloadedSize;
      localFileDownloadTaskInfo.jrb = locala.field_totalSize;
      localFileDownloadTaskInfo.id = paramLong;
      localFileDownloadTaskInfo.cBA = locala.field_downloaderType;
      localFileDownloadTaskInfo.kNs = locala.field_autoDownload;
      localFileDownloadTaskInfo.path = locala.field_filePath;
      localFileDownloadTaskInfo.url = locala.field_downloadUrl;
      localFileDownloadTaskInfo.cvZ = locala.field_md5;
      AppMethodBeat.o(2471);
      return localFileDownloadTaskInfo;
    }
  }

  public final boolean hn(final long paramLong)
  {
    AppMethodBeat.i(2473);
    new Thread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(2466);
        ab.d("MicroMsg.FileWebNetDownloader", "pauseDownloadTask");
        Object localObject = j.this.hm(paramLong);
        if ((localObject != null) && (((FileDownloadTaskInfo)localObject).status == 1))
        {
          CdnLogic.pauseHttpMultiSocketDownloadTask(((FileDownloadTaskInfo)localObject).url);
          localObject = c.hv(paramLong);
          if (localObject != null)
          {
            ((com.tencent.mm.plugin.downloader.f.a)localObject).field_status = 2;
            c.e((com.tencent.mm.plugin.downloader.f.a)localObject);
          }
          j.this.kMT.hs(paramLong);
        }
        AppMethodBeat.o(2466);
      }
    }).start();
    AppMethodBeat.o(2473);
    return true;
  }

  public final boolean ho(final long paramLong)
  {
    AppMethodBeat.i(2474);
    final com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    boolean bool;
    if ((locala != null) && (locala.field_status == 2))
    {
      new Thread(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(2467);
          int i = CdnLogic.resumeHttpMultiSocketDownloadTask(locala.field_downloadUrl);
          ab.i("MicroMsg.FileWebNetDownloader", "resumeDownloadTask: ".concat(String.valueOf(i)));
          locala.field_startTime = System.currentTimeMillis();
          locala.field_startState = com.tencent.mm.plugin.downloader.a.b.kKd;
          locala.field_startSize = locala.field_downloadedSize;
          if (i == 0)
          {
            locala.field_status = 1;
            locala.field_errCode = 0;
            c.e(locala);
            j.this.kMT.k(paramLong, locala.field_filePath);
            AppMethodBeat.o(2467);
          }
          while (true)
          {
            return;
            locala.field_status = 4;
            locala.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJR;
            c.e(locala);
            j.this.kMT.d(paramLong, locala.field_errCode, false);
            AppMethodBeat.o(2467);
          }
        }
      }).start();
      bool = true;
      AppMethodBeat.o(2474);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(2474);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.j
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.MMIntentService;
import com.tencent.mm.vfs.j;
import java.io.File;

public class FileDownloadService extends MMIntentService
{
  public static final String EXTRA_ID;
  public static final String EXTRA_PACKAGE_NAME;
  private static final String kNm;
  public static final String kNn;
  public static final String kNo;
  public static final String kNp;
  public static final String kNq;

  static
  {
    AppMethodBeat.i(2445);
    kNm = FileDownloadService.class.getSimpleName() + "_extra_";
    EXTRA_ID = kNm + "id";
    kNn = kNm + "action_type";
    EXTRA_PACKAGE_NAME = kNm + "package_name";
    kNo = kNm + "file_path";
    kNp = kNm + "md5";
    kNq = kNm + "change_url";
    AppMethodBeat.o(2445);
  }

  public FileDownloadService()
  {
    super("FileDownloadService");
  }

  private static boolean J(String paramString1, String paramString2, String paramString3)
  {
    int i = 1;
    AppMethodBeat.i(2444);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(paramString1);
    ab.i("MicroMsg.FileDownloadService", "MD5 Check: %s, File Exists: %b", new Object[] { paramString1, Boolean.valueOf(localb.exists()) });
    long l1 = System.currentTimeMillis();
    String str = com.tencent.mm.vfs.e.atg(j.w(localb.mUri));
    long l2 = System.currentTimeMillis() - l1;
    ab.i("MicroMsg.FileDownloadService", "MD5 Check Time: %d", new Object[] { Long.valueOf(l2) });
    ab.i("MicroMsg.FileDownloadService", "Original MD5: %s, Calculated MD5: %s", new Object[] { paramString2, str });
    if (!bo.isNullOrNil(paramString3))
    {
      paramString1 = c.In(paramString3);
      if (paramString1 != null)
      {
        com.tencent.mm.game.report.api.b localb1 = com.tencent.mm.game.report.api.b.eBF;
        l1 = paramString1.field_downloadId;
        if (!paramString1.field_reserveInWifi)
          break label181;
        localb1.a(paramString3, 111, l1, "", l2, i);
      }
    }
    boolean bool;
    if (bo.isNullOrNil(paramString2))
    {
      bool = localb.exists();
      AppMethodBeat.o(2444);
    }
    while (true)
    {
      return bool;
      label181: i = 0;
      break;
      if (bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.FileDownloadService", "check from file failed, may caused by low memory while checking md5");
        bool = localb.exists();
        AppMethodBeat.o(2444);
      }
      else
      {
        bool = paramString2.trim().equalsIgnoreCase(str.trim());
        AppMethodBeat.o(2444);
      }
    }
  }

  private static boolean j(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(2443);
    if ((at.isWifi(ah.getContext())) && (!paramBoolean) && (!bo.isNullOrNil(paramString)))
    {
      paramBoolean = true;
      AppMethodBeat.o(2443);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(2443);
    }
  }

  public final String getTag()
  {
    return "MicroMsg.FileDownloadService";
  }

  public final void onHandleIntent(Intent paramIntent)
  {
    AppMethodBeat.i(2442);
    if (paramIntent == null)
      AppMethodBeat.o(2442);
    label16: int i;
    label72: long l1;
    Object localObject1;
    boolean bool1;
    while (true)
    {
      return;
      i = paramIntent.getIntExtra(kNn, 0);
      ab.i("MicroMsg.FileDownloadService", "handle intent type : %d", new Object[] { Integer.valueOf(i) });
      switch (i)
      {
      case 2:
      default:
        AppMethodBeat.o(2442);
        break;
      case 1:
        l1 = paramIntent.getLongExtra(EXTRA_ID, -1L);
        if (l1 < 0L)
        {
          ab.e("MicroMsg.FileDownloadService", "Invalid id");
          AppMethodBeat.o(2442);
        }
        else
        {
          if (g.RN().QY())
          {
            g.RN();
            if (!com.tencent.mm.kernel.a.QT());
          }
          else
          {
            ab.d("MicroMsg.FileDownloadService", "no user login");
            AppMethodBeat.o(2442);
            continue;
          }
          localObject1 = c.hv(l1);
          if (localObject1 == null)
            break label2047;
          if ((paramIntent.getBooleanExtra(kNq, false)) || (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_isSecondDownload));
          for (bool1 = true; ; bool1 = false)
          {
            ab.i("MicroMsg.FileDownloadService", "filePath = " + ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath);
            if ((!bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath)) && (com.tencent.mm.vfs.e.ct(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath)))
              break label357;
            h.pYm.a(710L, 5L, 1L, false);
            ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_status = 4;
            ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_errCode = com.tencent.mm.plugin.downloader.a.a.kKa;
            c.e((com.tencent.mm.plugin.downloader.f.a)localObject1);
            paramIntent = d.bij();
            i = com.tencent.mm.plugin.downloader.a.a.kKa;
            ab.i("MicroMsg.FileDownloadManager", "onDownloadFailed, id = %d, errCode = %d", new Object[] { Long.valueOf(l1), Integer.valueOf(i) });
            if (paramIntent.kMT != null)
              paramIntent.kMT.d(l1, i, bool1);
            ab.i("MicroMsg.FileDownloadService", "file not exists, appid = " + ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId);
            AppMethodBeat.o(2442);
            break;
          }
          label357: if (!bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_md5))
            break label406;
          ab.i("MicroMsg.FileDownloadService", "Invalid original md5, abort checking");
          ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_status = 3;
          c.e((com.tencent.mm.plugin.downloader.f.a)localObject1);
          d.bij().o(l1, bool1);
          AppMethodBeat.o(2442);
        }
        break;
      case 3:
      }
    }
    label406: long l2;
    if (!bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId))
      l2 = System.currentTimeMillis();
    while (true)
    {
      try
      {
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath);
        localObject3 = ((File)localObject2).getAbsolutePath();
        bool2 = com.tencent.mm.plugin.downloader.d.c.Il((String)localObject3);
        if (bool2)
        {
          paramIntent = "v2";
          ab.i("MicroMsg.Channel.GameChannelUtil", "apkPath:%s, this is %s signature", new Object[] { localObject3, paramIntent });
          localObject3 = null;
          if (bool2)
            localObject3 = com.tencent.mm.plugin.downloader.d.c.L((File)localObject2);
          paramIntent = (Intent)localObject3;
          if (localObject3 == null)
          {
            localObject3 = com.tencent.mm.plugin.downloader.d.c.K((File)localObject2);
            paramIntent = (Intent)localObject3;
            if (bool2)
            {
              paramIntent = (Intent)localObject3;
              if (localObject3 != null)
              {
                ab.i("MicroMsg.Channel.GameChannelUtil", "you are use v2 signature but use v1 channel modle, this apk will can't install in 7.0system");
                paramIntent = (Intent)localObject3;
              }
            }
          }
          ab.i("MicroMsg.Channel.GameChannelUtil", "readChannel, channelId = %s", new Object[] { paramIntent });
          l2 = System.currentTimeMillis() - l2;
          ab.i("MicroMsg.FileDownloadService", "readChannelId, channelId:%s, cost time: %d", new Object[] { paramIntent, Long.valueOf(l2) });
          l2 = 0L + l2;
          bool2 = J(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath, ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_md5, ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId);
          if (bool1)
          {
            if (!bool2)
              continue;
            com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 21L);
            localObject2 = com.tencent.mm.game.report.api.b.eBF;
            localObject3 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId;
            l3 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId;
            if (!((com.tencent.mm.plugin.downloader.f.a)localObject1).field_reserveInWifi)
              continue;
            i = 1;
            ((com.tencent.mm.game.report.api.b)localObject2).a((String)localObject3, 108, l3, paramIntent, 0L, i);
          }
          if (!bool2)
          {
            if (!((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadUrl.startsWith("https"))
              continue;
            com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 32L);
          }
          if ((bool2) || (bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId)))
            break label2190;
          bool3 = false;
          l3 = System.currentTimeMillis();
        }
      }
      catch (Exception paramIntent)
      {
        try
        {
          Object localObject3 = new java/io/File;
          ((File)localObject3).<init>(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath);
          boolean bool4 = com.tencent.mm.plugin.downloader.d.e.e((File)localObject3, "10000145");
          bool3 = bool4;
          long l3 = System.currentTimeMillis() - l3;
          l2 += l3;
          ab.i("MicroMsg.FileDownloadService", "writeChannelId result:%b, cost time: %d", new Object[] { Boolean.valueOf(bool3), Long.valueOf(l3) });
          ab.i("MicroMsg.FileDownloadService", "channel opration cost time: %d", new Object[] { Long.valueOf(l2) });
          if (bool3)
          {
            bool2 = J(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath, ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_md5, ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId);
            ab.i("MicroMsg.FileDownloadService", "after modify channel, ret:%b", new Object[] { Boolean.valueOf(bool2) });
            if (bool2)
            {
              paramIntent = "10000145";
              i = 102;
              com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 24L);
              localObject3 = com.tencent.mm.game.report.api.b.eBF;
              localObject2 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId;
              l3 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId;
              if (!((com.tencent.mm.plugin.downloader.f.a)localObject1).field_reserveInWifi)
                continue;
              j = 1;
              ((com.tencent.mm.game.report.api.b)localObject3).a((String)localObject2, i, l3, paramIntent, l2, j);
              if (!bool1);
              switch (i)
              {
              default:
                i = 0;
                localObject3 = com.tencent.mm.game.report.api.b.eBF;
                localObject2 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId;
                l2 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId;
                if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_reserveInWifi)
                {
                  j = 1;
                  ((com.tencent.mm.game.report.api.b)localObject3).a((String)localObject2, i, l2, paramIntent, 0L, j);
                  if ((bool2) && (!j(bool1, ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_secondaryUrl)))
                  {
                    localObject3 = com.tencent.mm.game.report.api.b.eBF;
                    localObject2 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId;
                    l2 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId;
                    if (!((com.tencent.mm.plugin.downloader.f.a)localObject1).field_reserveInWifi)
                      continue;
                    i = 1;
                    ((com.tencent.mm.game.report.api.b)localObject3).a((String)localObject2, 107, l2, paramIntent, 0L, i);
                    com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 29L);
                  }
                  if (!bool2)
                    continue;
                  ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_status = 3;
                  ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_channelId = paramIntent;
                  c.e((com.tencent.mm.plugin.downloader.f.a)localObject1);
                  d.bij().o(l1, bool1);
                  AppMethodBeat.o(2442);
                  break label16;
                  paramIntent = "v1";
                  continue;
                  paramIntent = paramIntent;
                  ab.e("MicroMsg.FileDownloadService", "readChannelId exception : " + paramIntent.getMessage());
                  paramIntent = "";
                  continue;
                  i = 0;
                  continue;
                  com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 22L);
                  localObject2 = com.tencent.mm.game.report.api.b.eBF;
                  localObject3 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId;
                  l3 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId;
                  if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_reserveInWifi)
                  {
                    i = 1;
                    ((com.tencent.mm.game.report.api.b)localObject2).a((String)localObject3, 109, l3, paramIntent, 0L, i);
                    continue;
                  }
                  i = 0;
                  continue;
                  com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 31L);
                }
                break;
              case 102:
              case 103:
              case 101:
              }
            }
          }
        }
        catch (Exception localException)
        {
          Object localObject2;
          boolean bool3;
          ab.e("MicroMsg.FileDownloadService", "writeChannelId exception : " + localException.getMessage());
          continue;
          i = 103;
          com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 25L);
          continue;
          i = 101;
          com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 23L);
          continue;
          int j = 0;
          continue;
          i = 105;
          com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 27L);
          continue;
          i = 106;
          com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 28L);
          continue;
          i = 104;
          com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 26L);
          continue;
          j = 0;
          continue;
          i = 0;
          continue;
          if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloaderType == 3)
          {
            if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadUrl.startsWith("https"))
            {
              h.pYm.a(710L, 10L, 1L, false);
              ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_status = 4;
              ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_channelId = paramIntent;
              ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_errCode = com.tencent.mm.plugin.downloader.a.a.kJW;
              ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadedSize = com.tencent.mm.vfs.e.asZ(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath);
              c.e((com.tencent.mm.plugin.downloader.f.a)localObject1);
              ab.i("MicroMsg.FileDownloadService", "ChannelId = %s, receivedSize = %d, fileSize = %d", new Object[] { paramIntent, Long.valueOf(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadedSize), Long.valueOf(com.tencent.mm.vfs.e.asZ(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath)) });
              ab.i("MicroMsg.FileDownloadService", "delete file: %s", new Object[] { ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath });
              com.tencent.mm.vfs.e.deleteFile(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_filePath);
              bool3 = at.isWifi(ah.getContext());
              if (bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_secondaryUrl))
                continue;
              bool2 = true;
              ab.i("MicroMsg.FileDownloadService", "checkMd5, isWifi: %b, hasChangeUrl: %b, hasHttpsUrl: %b", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
              if (!j(bool1, ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_secondaryUrl))
                continue;
              localObject4 = new e.a();
              ((e.a)localObject4).It(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_secondaryUrl);
              ((e.a)localObject4).hA(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_fileSize);
              ((e.a)localObject4).Iv(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_fileName);
              ((e.a)localObject4).setAppId(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId);
              ((e.a)localObject4).Iw(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_md5);
              ((e.a)localObject4).setScene(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_scene);
              ((e.a)localObject4).Ix(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_extInfo);
              ((e.a)localObject4).kNl.kNg = true;
              ((e.a)localObject4).ga(true);
              ((e.a)localObject4).tN(1);
              ((e.a)localObject4).cY(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_packageName);
              ((e.a)localObject4).kNl.kNi = true;
              if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloaderType == 3)
                continue;
              l2 = d.bij().a(((e.a)localObject4).kNl);
              h.pYm.a(710L, 8L, 1L, false);
              ab.i("MicroMsg.FileDownloadService", "MD5 check failed, restart download, id = ".concat(String.valueOf(l2)));
              localObject2 = com.tencent.mm.game.report.api.b.eBF;
              localObject4 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId;
              l2 = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId;
              if (!((com.tencent.mm.plugin.downloader.f.a)localObject1).field_reserveInWifi)
                continue;
              i = 1;
              ((com.tencent.mm.game.report.api.b)localObject2).a((String)localObject4, 110, l2, paramIntent, 0L, i);
              com.tencent.mm.game.report.api.b.eBF.j(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_appId, 30L);
              AppMethodBeat.o(2442);
              break;
            }
            h.pYm.a(710L, 9L, 1L, false);
            continue;
          }
          if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadUrl.startsWith("https"))
          {
            h.pYm.a(710L, 7L, 1L, false);
            continue;
          }
          h.pYm.a(710L, 6L, 1L, false);
          continue;
          boolean bool2 = false;
          continue;
          l2 = d.bij().b(((e.a)localObject4).kNl);
          h.pYm.a(710L, 11L, 1L, false);
          continue;
          i = 0;
          continue;
          localObject1 = d.bij();
          localObject4 = c.hv(l1);
          if (localObject4 == null)
            break label2047;
        }
      }
      paramIntent = ah.getContext();
      if ((((com.tencent.mm.plugin.downloader.f.a)localObject4).field_showNotification) && (bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject4).field_fileName)))
        d.a(((com.tencent.mm.plugin.downloader.f.a)localObject4).field_appId, paramIntent.getString(2131299779), "", null);
      while (true)
      {
        ((d)localObject1).kMT.d(l1, com.tencent.mm.plugin.downloader.a.a.kJW, bool1);
        label2047: AppMethodBeat.o(2442);
        break;
        if ((((com.tencent.mm.plugin.downloader.f.a)localObject4).field_showNotification) && (!bo.isNullOrNil(((com.tencent.mm.plugin.downloader.f.a)localObject4).field_fileName)))
          d.a(((com.tencent.mm.plugin.downloader.f.a)localObject4).field_appId, ((com.tencent.mm.plugin.downloader.f.a)localObject4).field_fileName, paramIntent.getString(2131299779), null);
      }
      Object localObject4 = paramIntent.getStringExtra(kNo);
      l2 = paramIntent.getLongExtra("downloadId", -1L);
      if ((bo.isNullOrNil((String)localObject4)) || (!com.tencent.mm.vfs.e.ct((String)localObject4)))
      {
        ab.i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
        AppMethodBeat.o(2442);
        break;
      }
      paramIntent = c.hv(l2);
      if (paramIntent != null)
      {
        com.tencent.mm.plugin.downloader.h.a.a(paramIntent.field_downloadId, false, null);
        AppMethodBeat.o(2442);
        break;
      }
      com.tencent.mm.plugin.downloader.h.a.a((String)localObject4, null);
      break label72;
      label2190: continue;
      l2 = 0L;
      paramIntent = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.FileDownloadService
 * JD-Core Version:    0.6.2
 */
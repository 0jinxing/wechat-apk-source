package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.k;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

final class aj extends Handler
{
  aj(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    boolean bool1 = true;
    AppMethodBeat.i(64346);
    switch (paramMessage.what)
    {
    case 105:
    case 106:
    case 107:
    default:
    case 100:
    case 101:
    case 108:
    case 102:
    case 104:
    case 103:
    }
    while (true)
    {
      AppMethodBeat.o(64346);
      while (true)
      {
        label65: return;
        int i;
        label76: boolean bool2;
        if (paramMessage.arg1 == 1)
        {
          i = 1;
          bool2 = TbsDownloader.a(true, false);
          if ((paramMessage.obj != null) && ((paramMessage.obj instanceof TbsDownloader.TbsDownloaderCallback)))
          {
            TbsLog.i("TbsDownload", "needDownload-onNeedDownloadFinish needStartDownload=".concat(String.valueOf(bool2)));
            localObject1 = "";
            localObject2 = localObject1;
            if (TbsDownloader.a() != null)
            {
              localObject2 = localObject1;
              if (TbsDownloader.a().getApplicationContext() != null)
              {
                localObject2 = localObject1;
                if (TbsDownloader.a().getApplicationContext().getApplicationInfo() != null)
                  localObject2 = TbsDownloader.a().getApplicationContext().getApplicationInfo().packageName;
              }
            }
            if ((bool2) && (i == 0))
              break label245;
            ((TbsDownloader.TbsDownloaderCallback)paramMessage.obj).onNeedDownloadFinish(bool2, TbsDownloadConfig.getInstance(TbsDownloader.a()).mPreferences.getInt("tbs_download_version", 0));
          }
        }
        while ((TbsShareManager.isThirdPartyApp(TbsDownloader.a())) && (bool2))
        {
          TbsDownloader.startDownload(TbsDownloader.a());
          AppMethodBeat.o(64346);
          break label65;
          i = 0;
          break label76;
          label245: if (("com.tencent.mm".equals(localObject2)) || ("com.tencent.mobileqq".equals(localObject2)))
          {
            TbsLog.i("TbsDownload", "needDownload-onNeedDownloadFinish in mm or QQ callback needStartDownload = ".concat(String.valueOf(bool2)));
            ((TbsDownloader.TbsDownloaderCallback)paramMessage.obj).onNeedDownloadFinish(bool2, TbsDownloadConfig.getInstance(TbsDownloader.a()).mPreferences.getInt("tbs_download_version", 0));
          }
        }
        Object localObject1 = null;
        Object localObject3 = null;
        Object localObject2 = localObject3;
        if (!TbsShareManager.isThirdPartyApp(TbsDownloader.a()))
        {
          localObject2 = "tbs_download_lock_file" + TbsDownloadConfig.getInstance(TbsDownloader.a()).mPreferences.getInt("tbs_download_version", 0) + ".txt";
          localObject1 = k.b(TbsDownloader.a(), false, (String)localObject2);
          if (localObject1 != null)
          {
            localObject3 = k.a(TbsDownloader.a(), (FileOutputStream)localObject1);
            localObject2 = localObject3;
            if (localObject3 == null)
            {
              QbSdk.m.onDownloadFinish(177);
              TbsLog.i("TbsDownload", "file lock locked,wx or qq is downloading");
              TbsDownloadConfig.getInstance(TbsDownloader.a()).setDownloadInterruptCode(-203);
              TbsLog.i("TbsDownload", "MSG_START_DOWNLOAD_DECOUPLECORE return #1");
              AppMethodBeat.o(64346);
            }
          }
          else
          {
            localObject2 = localObject3;
            if (k.a(TbsDownloader.a()))
            {
              TbsDownloadConfig.getInstance(TbsDownloader.a()).setDownloadInterruptCode(-204);
              TbsLog.i("TbsDownload", "MSG_START_DOWNLOAD_DECOUPLECORE return #2");
              AppMethodBeat.o(64346);
            }
          }
        }
        else
        {
          label503: boolean bool3;
          if (paramMessage.arg1 == 1)
          {
            bool2 = true;
            localObject3 = TbsDownloadConfig.getInstance(TbsDownloader.a());
            if (108 != paramMessage.what)
              break label614;
            bool3 = true;
            label523: if (!TbsDownloader.a(false, bool2, bool3))
              break label696;
            if ((!bool2) || (!an.a().b(TbsDownloader.a(), TbsDownloadConfig.getInstance(TbsDownloader.a()).mPreferences.getInt("tbs_download_version", 0))))
              break label620;
            QbSdk.m.onDownloadFinish(122);
            ((TbsDownloadConfig)localObject3).setDownloadInterruptCode(-213);
          }
          while (true)
          {
            TbsLog.i("TbsDownload", "------freeFileLock called :");
            k.a((FileLock)localObject2, (FileOutputStream)localObject1);
            AppMethodBeat.o(64346);
            break;
            bool2 = false;
            break label503;
            label614: bool3 = false;
            break label523;
            label620: if (((TbsDownloadConfig)localObject3).mPreferences.getBoolean("tbs_needdownload", false))
            {
              TbsDownloadConfig.getInstance(TbsDownloader.a()).setDownloadInterruptCode(-215);
              localObject3 = TbsDownloader.b();
              if (108 == paramMessage.what);
              for (bool3 = bool1; ; bool3 = false)
              {
                ((ag)localObject3).b(bool2, bool3);
                break;
              }
            }
            QbSdk.m.onDownloadFinish(110);
            continue;
            label696: QbSdk.m.onDownloadFinish(110);
          }
          TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] MSG_REPORT_DOWNLOAD_STAT");
          if (TbsShareManager.isThirdPartyApp(TbsDownloader.a()));
          for (i = TbsShareManager.a(TbsDownloader.a(), false); ; i = an.a().n(TbsDownloader.a()))
          {
            TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] localTbsVersion=".concat(String.valueOf(i)));
            TbsDownloader.b().a(i);
            TbsLogReport.getInstance(TbsDownloader.a()).dailyReport();
            AppMethodBeat.o(64346);
            break;
          }
          TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] MSG_UPLOAD_TBSLOG");
          TbsLogReport.getInstance(TbsDownloader.a()).reportTbsLog();
          AppMethodBeat.o(64346);
          continue;
          TbsLog.i("TbsDownload", "[TbsDownloader.handleMessage] MSG_CONTINUEINSTALL_TBSCORE");
          if (paramMessage.arg1 != 0)
            break label844;
          an.a().a((Context)paramMessage.obj, true);
          AppMethodBeat.o(64346);
        }
      }
      label844: an.a().a((Context)paramMessage.obj, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.aj
 * JD-Core Version:    0.6.2
 */
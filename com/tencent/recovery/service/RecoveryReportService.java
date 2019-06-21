package com.tencent.recovery.service;

import android.app.IntentService;
import android.content.Intent;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.report.RecoveryReporter;
import com.tencent.recovery.util.Util;

public class RecoveryReportService extends IntentService
{
  public RecoveryReportService()
  {
    super(RecoveryReportService.class.getName());
  }

  private void ba(Intent paramIntent)
  {
    int i = 0;
    while (true)
    {
      String str2;
      try
      {
        String str1 = paramIntent.getStringExtra("KeyReportType");
        boolean bool = Util.isNullOrNil(str1);
        if (bool)
          return;
      }
      catch (Exception localException)
      {
        str2 = null;
        continue;
        String str3 = paramIntent.getStringExtra("KeyReportUploadClassName");
        RecoveryLog.i("Recovery.RecoveryReportService", "handle report intent %s %s", new Object[] { str2, str3 });
        switch (str2.hashCode())
        {
        default:
          i = -1;
          switch (i)
          {
          default:
            RecoveryUploadService.startAlarm(this, str3);
            stopSelf();
            continue;
          case 0:
          case 1:
          }
          break;
        case -1125171110:
        case 2120497953:
        }
      }
      finally
      {
      }
      if (str2.equals("HandleStatus"))
      {
        continue;
        if (str2.equals("ProcessStatus"))
        {
          i = 1;
          continue;
          RecoveryReporter.c(this, str2, paramIntent.getParcelableArrayListExtra("KeyReportItem"));
          continue;
          RecoveryReporter.a(this, str2, (RecoveryStatusItem)paramIntent.getParcelableExtra("KeyReportItem"));
        }
      }
    }
  }

  public void onDestroy()
  {
    RecoveryLog.dQd();
    super.onDestroy();
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    ba(paramIntent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.service.RecoveryReportService
 * JD-Core Version:    0.6.2
 */
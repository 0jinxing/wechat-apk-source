package com.tencent.tmassistantsdk.logreport;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver;
import com.tencent.tmassistantsdk.util.TMLog;

class LogReportManager$1
  implements NetworkMonitorReceiver.INetworkChangedObserver
{
  LogReportManager$1(LogReportManager paramLogReportManager)
  {
  }

  public void onNetworkChanged()
  {
    AppMethodBeat.i(75817);
    TMLog.i("LogReportManager", "onNetworkChanged,netState:" + DownloadHelper.getNetStatus());
    Class[] arrayOfClass = LogReportManager.access$000();
    int i = arrayOfClass.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Class localClass = arrayOfClass[j];
        try
        {
          if (localClass.equals(DownloadReportManager.class))
            DownloadReportManager.getInstance().resetMaxReportCount();
          while (true)
          {
            j++;
            break;
            if (localClass.equals(TipsInfoReportManager.class))
              TipsInfoReportManager.getInstance().resetMaxReportCount();
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
        }
      }
    if (DownloadHelper.isNetworkConncted())
      DownloadHelper.getNetStatus().equalsIgnoreCase("wifi");
    AppMethodBeat.o(75817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.logreport.LogReportManager.1
 * JD-Core Version:    0.6.2
 */
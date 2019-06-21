package com.tencent.tmassistantsdk.logreport;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver;

public class LogReportManager
{
  private static final Class<?>[] REPORT_MANAGERS = { DownloadReportManager.class, TipsInfoReportManager.class, UpdateInfoReportManager.class };
  private static final String TAG = "LogReportManager";
  private static LogReportManager mInstance = null;
  private final NetworkMonitorReceiver.INetworkChangedObserver mNetworkChangedObserver;

  private LogReportManager()
  {
    AppMethodBeat.i(75819);
    this.mNetworkChangedObserver = new LogReportManager.1(this);
    NetworkMonitorReceiver.getInstance().addNetworkChangedObserver(this.mNetworkChangedObserver);
    AppMethodBeat.o(75819);
  }

  public static LogReportManager getInstance()
  {
    try
    {
      AppMethodBeat.i(75818);
      if (mInstance == null)
      {
        localLogReportManager = new com/tencent/tmassistantsdk/logreport/LogReportManager;
        localLogReportManager.<init>();
        mInstance = localLogReportManager;
      }
      LogReportManager localLogReportManager = mInstance;
      AppMethodBeat.o(75818);
      return localLogReportManager;
    }
    finally
    {
    }
  }

  public void cancleReport()
  {
    AppMethodBeat.i(75822);
    Class[] arrayOfClass = REPORT_MANAGERS;
    int i = arrayOfClass.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Class localClass = arrayOfClass[j];
        try
        {
          if (localClass.equals(DownloadReportManager.class))
            DownloadReportManager.getInstance().cancleRequest();
          while (true)
          {
            j++;
            break;
            if (localClass.equals(TipsInfoReportManager.class))
              TipsInfoReportManager.getInstance().cancleRequest();
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
        }
      }
    AppMethodBeat.o(75822);
  }

  public void destory()
  {
    AppMethodBeat.i(75820);
    Class[] arrayOfClass = REPORT_MANAGERS;
    int i = arrayOfClass.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Class localClass = arrayOfClass[j];
        try
        {
          if (localClass.equals(DownloadReportManager.class))
            DownloadReportManager.getInstance().destroy();
          while (true)
          {
            j++;
            break;
            if (localClass.equals(TipsInfoReportManager.class))
              TipsInfoReportManager.getInstance().destroy();
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
        }
      }
    NetworkMonitorReceiver.getInstance().removeNetworkChangedObserver(this.mNetworkChangedObserver);
    AppMethodBeat.o(75820);
  }

  public void reportLog()
  {
    AppMethodBeat.i(75821);
    Class[] arrayOfClass = REPORT_MANAGERS;
    int i = arrayOfClass.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Class localClass = arrayOfClass[j];
        try
        {
          if (localClass.equals(DownloadReportManager.class))
            DownloadReportManager.getInstance().reportLogData();
          while (true)
          {
            j++;
            break;
            if (!localClass.equals(TipsInfoReportManager.class))
              break label83;
            TipsInfoReportManager.getInstance().reportLogData();
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
            continue;
            label83: if (localException.equals(UpdateInfoReportManager.class))
              UpdateInfoReportManager.getInstance().reportLogData();
          }
        }
      }
    AppMethodBeat.o(75821);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.logreport.LogReportManager
 * JD-Core Version:    0.6.2
 */
package com.tencent.tmassistantsdk.logreport;

import android.net.Proxy;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable;
import com.tencent.tmassistantsdk.storage.table.DownloadLogTable;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;

public class DownloadReportManager extends BaseReportManager
{
  protected static final String TAG = "DownloadReportManager";
  protected static DownloadReportManager mInstance = null;

  public static DownloadReportManager getInstance()
  {
    try
    {
      AppMethodBeat.i(75808);
      if (mInstance == null)
      {
        localDownloadReportManager = new com/tencent/tmassistantsdk/logreport/DownloadReportManager;
        localDownloadReportManager.<init>();
        mInstance = localDownloadReportManager;
      }
      DownloadReportManager localDownloadReportManager = mInstance;
      AppMethodBeat.o(75808);
      return localDownloadReportManager;
    }
    finally
    {
    }
  }

  public DownloadChunkLogInfo createNewChunkLogInfo(byte paramByte)
  {
    AppMethodBeat.i(75809);
    TMLog.i("DownloadReportManager", "createNewChunkLogInfo");
    DownloadChunkLogInfo localDownloadChunkLogInfo = new DownloadChunkLogInfo();
    localDownloadChunkLogInfo.type = ((byte)paramByte);
    localDownloadChunkLogInfo.networkOperator = GlobalUtil.getInstance().getNetworkOperator();
    localDownloadChunkLogInfo.networkType = GlobalUtil.getInstance().getNetworkType();
    if (!TextUtils.isEmpty(Proxy.getDefaultHost()));
    for (paramByte = 1; ; paramByte = 0)
    {
      localDownloadChunkLogInfo.isWap = ((byte)(byte)paramByte);
      localDownloadChunkLogInfo.startTime = System.currentTimeMillis();
      AppMethodBeat.o(75809);
      return localDownloadChunkLogInfo;
    }
  }

  protected BaseLogTable getLogTable()
  {
    AppMethodBeat.i(75810);
    DownloadLogTable localDownloadLogTable = DownloadLogTable.getInstance();
    AppMethodBeat.o(75810);
    return localDownloadLogTable;
  }

  protected byte getReportType()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.logreport.DownloadReportManager
 * JD-Core Version:    0.6.2
 */
package com.tencent.tmassistantsdk.logreport;

import com.qq.taf.jce.JceStruct;
import com.tencent.tmassistantsdk.protocol.ProtocolPackage;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable.DataWrapper;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseReportManager
  implements ILogReportHttpListener
{
  public static final int MAX_READ_COUNT = 1000;
  protected static final String TAG = "BaseReportManager";
  protected final List<Long> idLists = new ArrayList();
  protected int maxReportCount = 0;
  protected LogReportHttpRequest reportRequest = null;

  public void addLogData(JceStruct paramJceStruct)
  {
    try
    {
      TMLog.i("BaseReportManager", "addLogData,loginfo");
      if (paramJceStruct != null)
      {
        paramJceStruct = ProtocolPackage.jceStructToUTF8Byte(paramJceStruct);
        getLogTable().save(paramJceStruct);
      }
      return;
    }
    finally
    {
    }
    throw paramJceStruct;
  }

  public void cancleRequest()
  {
    if (this.reportRequest != null)
    {
      this.reportRequest.cancleRequest();
      this.reportRequest = null;
    }
  }

  public void destroy()
  {
    this.reportRequest = null;
    this.idLists.clear();
  }

  protected abstract BaseLogTable getLogTable();

  protected abstract byte getReportType();

  public void onLogReprotHttpRequestFinish(LogReportHttpRequest paramLogReportHttpRequest, boolean paramBoolean)
  {
    TMLog.i("BaseReportManager", "onLogReprotHttpRequestFinish,result:".concat(String.valueOf(paramBoolean)));
    if ((paramBoolean) && (this.idLists != null) && (this.idLists.size() > 0))
      getLogTable().delete(this.idLists);
    this.reportRequest = null;
    this.idLists.clear();
    if ((paramBoolean) && (this.maxReportCount < 5))
    {
      TMLog.i("BaseReportManager", "onLogReprotHttpRequestFinish wifi is true reportlog go on,result:" + paramBoolean + " count:" + this.maxReportCount);
      reportLogData();
      this.maxReportCount += 1;
    }
  }

  public void reportLogData()
  {
    boolean bool1 = false;
    while (true)
    {
      try
      {
        bool2 = GlobalUtil.getInstance().canReportValue();
        if (!bool2)
          return;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("reportLogData,request:");
        TMLog.i("BaseReportManager", this.reportRequest);
        if (this.reportRequest != null)
          continue;
        localObject = new com/tencent/tmassistantsdk/logreport/LogReportHttpRequest;
        ((LogReportHttpRequest)localObject).<init>();
        this.reportRequest = ((LogReportHttpRequest)localObject);
        this.reportRequest.setmListener(this);
        localObject = getLogTable().getDatas(1000);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("readLogDataAndSendToServer,wrappterCount:");
        TMLog.i("BaseReportManager", ((BaseLogTable.DataWrapper)localObject).dataList.size());
        bool2 = bool1;
        if (localObject != null)
        {
          if (((BaseLogTable.DataWrapper)localObject).dataList.size() <= 0)
            bool2 = bool1;
        }
        else
        {
          if (bool2)
            continue;
          this.maxReportCount = 0;
          this.reportRequest = null;
          continue;
        }
      }
      finally
      {
      }
      this.idLists.addAll(localDataWrapper.idList);
      boolean bool2 = this.reportRequest.sendLogDataToServer(getReportType(), localDataWrapper);
    }
  }

  public void resetMaxReportCount()
  {
    this.maxReportCount = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.logreport.BaseReportManager
 * JD-Core Version:    0.6.2
 */
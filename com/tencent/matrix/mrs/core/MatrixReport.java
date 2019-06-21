package com.tencent.matrix.mrs.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.d.c;
import com.tencent.matrix.trace.b.a.a;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mrs.util.MatrixReportBroadcast;
import com.tencent.mrs.util.MatrixStrategyNotifyBroadcast;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class MatrixReport
{
  private static final String TAG = "Matrix.MatrixReport";
  private static IReportCallback mReportCallback;
  private static MrsCallback mrsCallback;
  private static volatile MatrixReport sInstance;
  private final long clientVersion;
  private final Context context;
  private final boolean isDebug;
  private final boolean isReportProcess;
  private final MatrixWxReporter matrixWxReporter;
  private final String processName;
  private final long publishType;
  private final String revision;
  private long uin = 0L;

  private MatrixReport(Context paramContext, String paramString1, long paramLong1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, long paramLong2)
  {
    this.clientVersion = paramLong1;
    this.revision = paramString2;
    this.isDebug = paramBoolean1;
    this.context = paramContext;
    this.processName = paramString1;
    this.isReportProcess = paramBoolean2;
    this.publishType = paramLong2;
    if (paramBoolean2);
    while (true)
    {
      try
      {
        MrsLogic.init(paramLong1, paramString2, paramBoolean1, paramLong2);
        this.matrixWxReporter = new MatrixWxReporter();
        return;
      }
      catch (Throwable paramContext)
      {
        c.printErrStackTrace("Matrix.MatrixReport", paramContext, "call oncreate err", new Object[0]);
        MrsLogic.init(paramLong1, paramString2, paramBoolean1, paramLong2);
        continue;
      }
      paramString1 = new IntentFilter();
      paramString1.addAction("strategyNotify");
      paramContext.registerReceiver(new MatrixStrategyNotifyBroadcast(), paramString1, "com.tencent.mm.matrix.strategynotify", null);
    }
  }

  private static void checkStatusChange()
  {
    c.i("Matrix.MatrixReport", "schedule to check", new Object[0]);
    if (!com.tencent.matrix.a.isInstalled())
      c.i("Matrix.MatrixReport", "matrix not installed", new Object[0]);
    while (true)
    {
      return;
      if (mReportCallback != null)
      {
        HashMap localHashMap = new HashMap();
        Iterator localIterator = com.tencent.matrix.a.yK().bUC.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.matrix.b.b localb = (com.tencent.matrix.b.b)localIterator.next();
          if ((localb instanceof com.tencent.matrix.trace.a))
          {
            localHashMap.put("Trace_FPS", Boolean.valueOf(MrsLogic.isNeed2Report("Trace_FPS")));
            localHashMap.put("Trace_EvilMethod", Boolean.valueOf(MrsLogic.isNeed2Report("Trace_EvilMethod")));
            localHashMap.put("Trace_StartUp", Boolean.valueOf(MrsLogic.isNeed2Report("Trace_StartUp")));
          }
          else
          {
            localHashMap.put(localb.getTag(), Boolean.valueOf(MrsLogic.isNeed2Report(localb.getTag())));
          }
        }
        if (localHashMap.size() > 0)
        {
          c.i("Matrix.MatrixReport", "onStatusChange, map:%s", new Object[] { localHashMap });
          if (mReportCallback != null)
            mReportCallback.onStatusChanged(localHashMap);
        }
      }
    }
  }

  public static MrsCallback getMrsCallback()
  {
    return mrsCallback;
  }

  public static MatrixReport init(MatrixReport paramMatrixReport, IReportCallback paramIReportCallback)
  {
    if (paramMatrixReport == null)
      throw new RuntimeException("Matrix report init, matrixReport should not be null.");
    try
    {
      if (sInstance == null)
        sInstance = paramMatrixReport;
      while (true)
      {
        mReportCallback = paramIReportCallback;
        return sInstance;
        c.e("Matrix.MatrixReport", "Matrix report instance is already set. this invoking will be ignored", new Object[0]);
      }
    }
    finally
    {
    }
    throw paramMatrixReport;
  }

  public static boolean isInstalled()
  {
    if (sInstance != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void setMrsCallback(MrsCallback paramMrsCallback)
  {
    mrsCallback = paramMrsCallback;
    MrsLogic.setCallBack(paramMrsCallback);
  }

  public static MatrixReport with()
  {
    if (sInstance == null)
      throw new RuntimeException("you must init Matrix report sdk first");
    return sInstance;
  }

  public long getClientVersion()
  {
    return this.clientVersion;
  }

  public Context getContext()
  {
    return this.context;
  }

  public MrsLogic.PhoneInfo getPhoneInfo()
  {
    return MrsLogic.getPhoneInfo();
  }

  public String getProcessName()
  {
    return this.processName;
  }

  public long getPublishType()
  {
    return this.publishType;
  }

  public String getRevision()
  {
    return this.revision;
  }

  public long getUin()
  {
    return this.uin;
  }

  public boolean isDebug()
  {
    return this.isDebug;
  }

  public boolean isNeedReport(String paramString)
  {
    return MrsLogic.isNeed2Report(paramString);
  }

  public boolean isReportProcess()
  {
    return this.isReportProcess;
  }

  public void onCrash()
  {
    if (this.isReportProcess)
      MrsLogic.onCrash();
  }

  public void onDestroy()
  {
    if (this.isReportProcess)
      MrsLogic.onDestroy();
  }

  public void onForeground(boolean paramBoolean)
  {
    if (this.isReportProcess)
      MrsLogic.onForeground(paramBoolean);
    if (!paramBoolean)
      com.tencent.mm.sdk.g.d.xDG.b(new Runnable()
      {
        public void run()
        {
          MatrixReport.access$000();
        }
      }
      , "Matrix.MatrixReport");
  }

  public void onStrategyResp(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    MrsLogic.onStrategyResp(paramInt1, paramInt2, paramArrayOfByte);
  }

  public void report(com.tencent.matrix.c.b paramb, File paramFile)
  {
    report(paramb, paramFile, true);
  }

  public void report(com.tencent.matrix.c.b paramb, File paramFile, boolean paramBoolean)
  {
    if ((paramb != null) && (paramFile != null));
    try
    {
      if (!paramFile.exists())
        c.e("Matrix.MatrixReport", "Matrix report, tag %s or file %s is null, just return", new Object[] { paramb, paramFile });
      while (true)
      {
        return;
        MatrixUploadIssue localMatrixUploadIssue = new com/tencent/matrix/mrs/core/MatrixUploadIssue;
        localMatrixUploadIssue.<init>();
        localMatrixUploadIssue.setTag(paramb.tag);
        localMatrixUploadIssue.setCanSplitSlice(true);
        localMatrixUploadIssue.setDataType(1);
        localMatrixUploadIssue.setNeedDeleteFileAfterSucc(paramBoolean);
        if (paramb.bWu == null)
          break;
        i = paramb.bWu.intValue();
        localMatrixUploadIssue.setType(i);
        localMatrixUploadIssue.setDesKey(paramb.key);
        localMatrixUploadIssue.setFilePath(paramFile.getAbsolutePath());
        MrsLogic.uploadMatrixIssue(localMatrixUploadIssue);
      }
    }
    catch (Throwable paramb)
    {
      while (true)
      {
        c.e("Matrix.MatrixReport", "Matrix report occur error:".concat(String.valueOf(paramb)), new Object[0]);
        continue;
        int i = 0;
      }
    }
  }

  public void report(String paramString, JSONObject paramJSONObject)
  {
    if ((paramString == null) || (paramJSONObject == null));
    while (true)
    {
      try
      {
        c.e("Matrix.MatrixReport", "Matrix report, tag %s or data %s is null, just return", new Object[] { paramString, paramJSONObject });
        return;
        if (this.isReportProcess)
        {
          with().reportLocal(paramString, paramJSONObject.toString());
          continue;
        }
      }
      catch (Throwable paramString)
      {
        paramString = paramString;
        c.e("Matrix.MatrixReport", "Matrix report occur error:".concat(String.valueOf(paramString)), new Object[0]);
        continue;
      }
      finally
      {
      }
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(this.context, MatrixReportBroadcast.class);
      localIntent.putExtra("tag", paramString);
      localIntent.putExtra("value", paramJSONObject.toString());
      c.i("Matrix.MatrixReport", "Matrix report with broadcast tag:%s, data:%s", new Object[] { paramString, paramJSONObject.toString() });
      this.context.sendBroadcast(localIntent);
    }
  }

  public void reportLocal(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null))
      c.e("Matrix.MatrixReport", "Matrix reportLocal, tag %s or data %s is null, just return", new Object[] { paramString1, paramString2 });
    while (true)
    {
      return;
      if (!this.isReportProcess)
      {
        c.e("Matrix.MatrixReport", "Matrix reportLocal, only report process can report directly, current:%s", new Object[] { this.processName });
        continue;
      }
      Object localObject1 = null;
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString2);
      }
      catch (JSONException localJSONException1)
      {
        try
        {
          Object localObject2;
          if ((((JSONObject)localObject2).getString("tag").equalsIgnoreCase("Trace_EvilMethod")) && (((JSONObject)localObject2).getString("detail").equalsIgnoreCase(a.a.bYJ.toString())))
          {
            bool = bo.isNullOrNil(((JSONObject)localObject2).getString("stackKey"));
            if (!bool)
              bool = true;
            while (true)
            {
              c.i("Matrix.MatrixReport", "Matrix reportLocal tag:%s, data:%s ClientVersion:%s isRealReportForMatrix:%s", new Object[] { paramString1, paramString2, Integer.valueOf(com.tencent.mm.protocal.d.vxo), Boolean.valueOf(bool) });
              if (bool)
                MrsLogic.collectData(paramString1, paramString2.getBytes());
              this.matrixWxReporter.report(paramString1, (JSONObject)localObject2);
              break;
              bool = false;
              continue;
              localJSONException1 = localJSONException1;
              localObject2 = localObject1;
              ab.printErrStackTrace("Matrix.MatrixReport", localJSONException1, "data:%s", new Object[] { ((JSONObject)localObject2).toString() });
              bool = true;
            }
          }
        }
        catch (JSONException localJSONException2)
        {
          while (true)
          {
            continue;
            boolean bool = true;
          }
        }
      }
    }
  }

  public void setUin(long paramLong)
  {
    this.uin = paramLong;
    if (this.isReportProcess)
      MrsLogic.setUin(paramLong);
  }

  public static class Builder
  {
    private Long clientVersion;
    private final Context context;
    private Boolean isDebug;
    private Boolean isReportProcess;
    private String processName;
    private Long publishType;
    private String revision;

    public Builder(Context paramContext)
    {
      if (paramContext == null)
        throw new RuntimeException("matrix report init, context is null");
      this.context = paramContext;
    }

    public MatrixReport build()
    {
      if (this.processName == null)
        throw new RuntimeException("matrix report init, processName is null");
      if (this.clientVersion == null)
        throw new RuntimeException("matrix report init, clientVersion is null");
      if (this.revision == null)
        throw new RuntimeException("matrix report init, revision is null");
      if (this.publishType == null)
        throw new RuntimeException("matrix report init, publishType is null");
      if (this.isDebug == null)
        this.isDebug = Boolean.FALSE;
      if (this.isReportProcess == null)
        this.isReportProcess = Boolean.FALSE;
      return new MatrixReport(this.context, this.processName, this.clientVersion.longValue(), this.revision, this.isDebug.booleanValue(), this.isReportProcess.booleanValue(), this.publishType.longValue(), null);
    }

    public Builder clientVersion(long paramLong)
    {
      this.clientVersion = Long.valueOf(paramLong);
      return this;
    }

    public Builder isDebug(boolean paramBoolean)
    {
      this.isDebug = Boolean.valueOf(paramBoolean);
      return this;
    }

    public Builder isReportProcess(boolean paramBoolean)
    {
      this.isReportProcess = Boolean.valueOf(paramBoolean);
      return this;
    }

    public Builder processName(String paramString)
    {
      this.processName = paramString;
      return this;
    }

    public Builder publishType(long paramLong)
    {
      this.publishType = Long.valueOf(paramLong);
      return this;
    }

    public Builder revision(String paramString)
    {
      this.revision = paramString;
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.mrs.core.MatrixReport
 * JD-Core Version:    0.6.2
 */
package com.tencent.recovery.wx.service;

import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.report.RecoveryReporter;
import com.tencent.recovery.service.RecoveryUploadService;
import com.tencent.recovery.util.Util;
import com.tencent.recovery.wx.util.EncryptUtil;
import com.tencent.recovery.wx.util.PByteArray;
import com.tencent.recovery.wx.util.WXUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class WXRecoveryUploadService extends RecoveryUploadService
{
  private static final String TAG = "Recovery.WXRecoveryUploadService";
  private static final String UNIT_REPORT_TAG = "RecoveryHandle";

  private static int compareVersion(String paramString1, String paramString2)
  {
    int i = 0;
    try
    {
      int j = Integer.decode(paramString1).intValue();
      int k = Integer.decode(paramString2).intValue();
      if (j > k)
        i = 1;
      while (true)
      {
        label27: return i;
        if (k > j)
          i = -1;
      }
    }
    catch (Exception paramString1)
    {
      break label27;
    }
  }

  public static String convertStreamToString(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      paramInputStream = "";
    while (true)
    {
      return paramInputStream;
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
      StringBuilder localStringBuilder1 = new StringBuilder();
      try
      {
        while (true)
        {
          String str = localBufferedReader.readLine();
          if (str == null)
            break;
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>();
          localStringBuilder1.append(str + "\n");
        }
      }
      catch (IOException localIOException)
      {
        localIOException = localIOException;
        RecoveryLog.printErrStackTrace("Recovery.WXRecoveryUploadService", localIOException, "", new Object[0]);
        try
        {
          paramInputStream.close();
          while (true)
          {
            paramInputStream = localStringBuilder1.toString();
            break;
            try
            {
              paramInputStream.close();
            }
            catch (IOException paramInputStream)
            {
              RecoveryLog.printErrStackTrace("Recovery.WXRecoveryUploadService", paramInputStream, "", new Object[0]);
            }
          }
        }
        catch (IOException paramInputStream)
        {
          while (true)
            RecoveryLog.printErrStackTrace("Recovery.WXRecoveryUploadService", paramInputStream, "", new Object[0]);
        }
      }
      finally
      {
      }
    }
    try
    {
      paramInputStream.close();
      throw localObject;
    }
    catch (IOException paramInputStream)
    {
      while (true)
        RecoveryLog.printErrStackTrace("Recovery.WXRecoveryUploadService", paramInputStream, "", new Object[0]);
    }
  }

  private boolean pushData(JSONArray paramJSONArray, String paramString)
  {
    try
    {
      Object localObject1 = WXUtil.iH(this);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("android-");
      localObject2 = Build.VERSION.SDK_INT;
      Object localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>();
      Object localObject4 = new org/json/JSONObject;
      ((JSONObject)localObject4).<init>();
      JSONObject localJSONObject = ((JSONObject)localObject4).put("protocol_ver", 1);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      paramJSONArray = ((JSONObject)localObject3).put("head", localJSONObject.put("phone", Build.MANUFACTURER + "-" + Build.MODEL).put("os_ver", localObject2).put("report_time", System.currentTimeMillis())).put("items", paramJSONArray).toString().getBytes();
      int i = paramJSONArray.length;
      localObject3 = EncryptUtil.x(String.format("weixin#$()%d%d", new Object[] { Integer.decode(paramString), Integer.valueOf(i) }).getBytes()).toLowerCase();
      localObject4 = EncryptUtil.compress(paramJSONArray);
      paramJSONArray = new com/tencent/recovery/wx/util/PByteArray;
      paramJSONArray.<init>();
      EncryptUtil.a(paramJSONArray, (byte[])localObject4, ((String)localObject3).getBytes());
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>(256);
      localObject2 = ((StringBuilder)localObject4).append("http://support.weixin.qq.com/cgi-bin/mmsupport-bin/stackreport?version=").append(paramString).append("&devicetype=").append((String)localObject2).append("&filelength=").append(i).append("&sum=").append((String)localObject3).append("&reporttype=1&NewReportType=110");
      if ((localObject1 != null) && (((String)localObject1).length() != 0))
        ((StringBuilder)localObject2).append("&username=").append((String)localObject1);
      localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(((StringBuilder)localObject2).toString());
      localObject1 = (HttpURLConnection)((URL)localObject1).openConnection();
      ((HttpURLConnection)localObject1).setRequestMethod("POST");
      ((HttpURLConnection)localObject1).setReadTimeout(20000);
      ((HttpURLConnection)localObject1).setConnectTimeout(10000);
      ((HttpURLConnection)localObject1).setRequestProperty("content-type", "binary/octet-stream");
      ((HttpURLConnection)localObject1).setDoOutput(true);
      ((HttpURLConnection)localObject1).setDoInput(true);
      ((HttpURLConnection)localObject1).connect();
      localObject2 = ((HttpURLConnection)localObject1).getOutputStream();
      ((OutputStream)localObject2).write(paramJSONArray.value);
      ((OutputStream)localObject2).flush();
      ((OutputStream)localObject2).close();
      if (((HttpURLConnection)localObject1).getResponseCode() != 200)
      {
        paramJSONArray = convertStreamToString(((HttpURLConnection)localObject1).getErrorStream());
        localObject2 = convertStreamToString(((HttpURLConnection)localObject1).getInputStream());
        RecoveryLog.i("Recovery.WXRecoveryUploadService", "POST returned: %d %s %s %s", new Object[] { Integer.valueOf(((HttpURLConnection)localObject1).getResponseCode()), paramString, paramJSONArray, localObject2 });
      }
      for (bool = false; ; bool = true)
      {
        return bool;
        RecoveryLog.i("Recovery.WXRecoveryUploadService", "POST returned success %s", new Object[] { paramString });
      }
    }
    catch (Exception paramJSONArray)
    {
      while (true)
      {
        RecoveryLog.printErrStackTrace("Recovery.WXRecoveryUploadService", paramJSONArray, "pushData", new Object[0]);
        boolean bool = false;
      }
    }
  }

  public boolean tryToUploadData()
  {
    Object localObject = new Intent();
    ((Intent)localObject).setPackage(getPackageName());
    ((Intent)localObject).setAction("com.tecent.mm.intent.action.RECOVERY_STATUS_UPLOAD");
    sendBroadcast((Intent)localObject);
    localObject = RecoveryReporter.a(this, "HandleStatus", RecoveryHandleItem.class);
    boolean bool = uploadData((List)localObject);
    if ((((List)localObject).size() == 0) || (bool))
      RecoveryReporter.bX(this, "HandleStatus");
    return bool;
  }

  protected boolean uploadData(List<RecoveryHandleItem> paramList)
  {
    int i = Util.iB(this);
    JSONArray localJSONArray = new JSONArray();
    Object localObject1 = "0x27000435";
    Iterator localIterator = paramList.iterator();
    RecoveryHandleItem localRecoveryHandleItem;
    if (localIterator.hasNext())
      localRecoveryHandleItem = (RecoveryHandleItem)localIterator.next();
    label225: 
    while (true)
    {
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        localJSONArray.put(((JSONObject)localObject2).put("tag", "RecoveryHandle").put("info", localRecoveryHandleItem.key).put("uin", localRecoveryHandleItem.eCq).put("deviceUUID", i).put("time", Util.nz(localRecoveryHandleItem.timestamp)).put("cver", localRecoveryHandleItem.clientVersion).put("processName", localRecoveryHandleItem.processName).put("phoneStatus", localRecoveryHandleItem.Arn));
        if (compareVersion(localRecoveryHandleItem.clientVersion, (String)localObject1) <= 0)
          break label225;
        localObject2 = localRecoveryHandleItem.clientVersion;
        localObject1 = localObject2;
        break;
        boolean bool = pushData(localJSONArray, (String)localObject1);
        RecoveryLog.i("Recovery.WXRecoveryUploadService", "upload result %b %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramList.size()) });
        return bool;
      }
      catch (Exception localException)
      {
      }
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.service.WXRecoveryUploadService
 * JD-Core Version:    0.6.2
 */
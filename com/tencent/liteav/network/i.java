package com.tencent.liteav.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONObject;

public class i
{
  protected static i a;
  private Context b = null;
  private long c = 3L;

  static
  {
    AppMethodBeat.i(67630);
    a = new i();
    AppMethodBeat.o(67630);
  }

  private i.a a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(67624);
    if (b(paramString))
    {
      paramString = null;
      AppMethodBeat.o(67624);
    }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject1 = this.b.getSharedPreferences("com.tencent.liteav.network", 0).getString("34238512-C08C-4931-A000-40E1D8B5BA5B", "");
        boolean bool = b((String)localObject1);
        if (bool)
        {
          paramString = null;
          AppMethodBeat.o(67624);
        }
        else
        {
          Object localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>((String)localObject1);
          localObject2 = ((JSONObject)localObject2).optJSONObject(paramString);
          if (localObject2 == null)
          {
            paramString = null;
            AppMethodBeat.o(67624);
          }
          else
          {
            if (paramBoolean);
            for (paramString = "DomainArrayData"; ; paramString = "OriginArrayData")
            {
              localObject2 = ((JSONObject)localObject2).optJSONArray(paramString);
              if (localObject2 != null)
                break label134;
              paramString = null;
              AppMethodBeat.o(67624);
              break;
            }
            label134: int i = ((JSONArray)localObject2).length();
            long l = i;
            if (l == 0L)
            {
              paramString = null;
              AppMethodBeat.o(67624);
            }
            else
            {
              paramString = "";
              float f1 = 0.0F;
              float f2 = 0.0F;
              float f3 = 0.0F;
              float f4 = 0.0F;
              for (i = 0; i < l; i++)
              {
                localObject1 = ((JSONArray)localObject2).getJSONObject(i);
                f1 += (float)((JSONObject)localObject1).optLong("networkRTT");
                f2 = (float)(f2 + ((JSONObject)localObject1).optDouble("avgBlockCnt"));
                f3 = (float)(f3 + ((JSONObject)localObject1).optDouble("avgVideoQue"));
                f4 = (float)(f4 + ((JSONObject)localObject1).optDouble("avgAudioQue"));
                paramString = String.format("%s \n isDomainAddressBetter：itemData domain = %b NetworkRTT = %d avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", new Object[] { paramString, Boolean.valueOf(paramBoolean), Long.valueOf(((JSONObject)localObject1).optLong("networkRTT")), Double.valueOf(((JSONObject)localObject1).optDouble("avgBlockCnt")), Double.valueOf(((JSONObject)localObject1).optDouble("avgVideoQue")), Double.valueOf(((JSONObject)localObject1).optDouble("avgAudioQue")) });
              }
              f1 /= (float)l;
              f2 /= (float)l;
              f3 /= (float)l;
              f4 /= (float)l;
              paramString = new com/tencent/liteav/network/i$a;
              paramString.<init>(this);
              paramString.a = f1;
              paramString.b = f2;
              paramString.c = f3;
              paramString.d = f4;
              paramString.e = l;
              AppMethodBeat.o(67624);
            }
          }
        }
      }
      catch (Exception paramString)
      {
        paramString = null;
        AppMethodBeat.o(67624);
      }
    }
  }

  public static i a()
  {
    return a;
  }

  private boolean b(String paramString)
  {
    AppMethodBeat.i(67625);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = true;
      AppMethodBeat.o(67625);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67625);
    }
  }

  private JSONObject c(String paramString)
  {
    AppMethodBeat.i(67626);
    if (!b(paramString));
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        AppMethodBeat.o(67626);
        paramString = localJSONObject;
        return paramString;
      }
      catch (Exception paramString)
      {
      }
      paramString = new JSONObject();
      AppMethodBeat.o(67626);
    }
  }

  private void d()
  {
    AppMethodBeat.i(67627);
    this.c = com.tencent.liteav.basic.f.b.a().a("Network", "QualityDataCacheCount");
    if ((this.c == -1L) || (this.c < 3L))
      this.c = 3L;
    AppMethodBeat.o(67627);
  }

  public long a(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(67628);
    if (this.b != null)
    {
      l = this.b.getSharedPreferences("com.tencent.liteav.network", 0).getLong(paramString, 0L);
      AppMethodBeat.o(67628);
    }
    while (true)
    {
      return l;
      AppMethodBeat.o(67628);
    }
  }

  public void a(Context paramContext)
  {
    AppMethodBeat.i(67620);
    if (this.b == null)
      this.b = paramContext.getApplicationContext();
    AppMethodBeat.o(67620);
  }

  public void a(String paramString, long paramLong)
  {
    AppMethodBeat.i(67629);
    if (this.b != null)
      this.b.getSharedPreferences("com.tencent.liteav.network", 0).edit().putLong(paramString, paramLong).commit();
    AppMethodBeat.o(67629);
  }

  public void a(String paramString, long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(67622);
    int i;
    if (com.tencent.liteav.basic.f.b.a().a("Network", "QualityDataCacheCount") > 0L)
    {
      i = 1;
      if (i != 0)
        break label40;
      AppMethodBeat.o(67622);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label40: TXCLog.e("UploadQualityData", String.format("updateQualityData: accessID = %s serverType = %d totalTime = %d networkRTT = %d avgBlockCnt = %f avgVideoQue = %f avgAudioQue = %f", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Float.valueOf(paramFloat3) }));
      if (!b(paramString))
        break label123;
      AppMethodBeat.o(67622);
    }
    label429: 
    while (true)
    {
      try
      {
        label123: SharedPreferences localSharedPreferences = this.b.getSharedPreferences("com.tencent.liteav.network", 0);
        JSONObject localJSONObject1 = c(localSharedPreferences.getString("34238512-C08C-4931-A000-40E1D8B5BA5B", ""));
        JSONObject localJSONObject2 = localJSONObject1.optJSONObject(paramString);
        if (localJSONObject2 != null)
          break label429;
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        String str;
        Object localObject2;
        if (paramLong1 == 3L)
        {
          str = "DomainArrayData";
          localObject1 = localJSONObject2.optJSONArray(str);
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = new org/json/JSONArray;
            ((JSONArray)localObject2).<init>();
          }
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>();
          ((JSONObject)localObject1).put("totalTime", paramLong2);
          ((JSONObject)localObject1).put("networkRTT", paramLong3);
          ((JSONObject)localObject1).put("avgBlockCnt", paramFloat1);
          ((JSONObject)localObject1).put("avgVideoQue", paramFloat2);
          ((JSONObject)localObject1).put("avgAudioQue", paramFloat3);
          ((JSONArray)localObject2).put(localObject1);
          int j = ((JSONArray)localObject2).length();
          if (j > this.c)
          {
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>();
            i = (int)(j - this.c);
            localObject1 = localJSONArray;
            if (i >= j)
              continue;
            localJSONArray.put(((JSONArray)localObject2).get(i));
            i++;
            continue;
          }
        }
        else
        {
          str = "OriginArrayData";
          continue;
        }
        Object localObject1 = localObject2;
        localJSONObject2.put(str, localObject1);
        localJSONObject1.put(paramString, localJSONObject2);
        paramString = localJSONObject1.toString();
        localSharedPreferences.edit().putString("34238512-C08C-4931-A000-40E1D8B5BA5B", paramString).commit();
        AppMethodBeat.o(67622);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(67622);
      }
      break;
    }
  }

  public String b()
  {
    AppMethodBeat.i(67621);
    try
    {
      if (this.b != null)
      {
        int i = com.tencent.liteav.basic.util.b.c(this.b);
        Object localObject;
        if (i == 255)
        {
          localObject = "";
          AppMethodBeat.o(67621);
        }
        while (true)
        {
          return localObject;
          if (i == 1)
          {
            localObject = (WifiManager)this.b.getSystemService("wifi");
            if (localObject == null)
              break;
            localObject = ((WifiManager)localObject).getConnectionInfo();
            if (localObject == null)
              break;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("wifi:");
            localObject = ((WifiInfo)localObject).getSSID();
            AppMethodBeat.o(67621);
          }
          else if (i == 2)
          {
            localObject = "4g:";
            AppMethodBeat.o(67621);
          }
          else if (i == 3)
          {
            localObject = "3g:";
            AppMethodBeat.o(67621);
          }
          else if (i == 4)
          {
            localObject = "2g:";
            AppMethodBeat.o(67621);
          }
          else if (i == 5)
          {
            localObject = "ethernet:";
            AppMethodBeat.o(67621);
          }
          else
          {
            localObject = "xg:";
            AppMethodBeat.o(67621);
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = "";
        AppMethodBeat.o(67621);
      }
    }
  }

  public boolean c()
  {
    AppMethodBeat.i(67623);
    d();
    Object localObject1 = b();
    Object localObject2 = "isDomainAddressBetter: accessID = " + (String)localObject1 + " minQualityDataCount = " + this.c;
    i.a locala1 = a((String)localObject1, true);
    i.a locala2 = a((String)localObject1, false);
    localObject1 = localObject2;
    if (locala1 != null)
      localObject1 = String.format("%s \n isDomainAddressBetter：domainQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", new Object[] { localObject2, Long.valueOf(locala1.e), Float.valueOf(locala1.a), Float.valueOf(locala1.b), Float.valueOf(locala1.c), Float.valueOf(locala1.d) });
    localObject2 = localObject1;
    if (locala2 != null)
      localObject2 = String.format("%s \n isDomainAddressBetter：originQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", new Object[] { localObject1, Long.valueOf(locala2.e), Float.valueOf(locala2.a), Float.valueOf(locala2.b), Float.valueOf(locala2.c), Float.valueOf(locala2.d) });
    TXCLog.e("UploadQualityData", (String)localObject2);
    boolean bool;
    if ((locala1 == null) || (locala1.e < this.c) || (locala2 == null) || (locala2.e < this.c))
    {
      AppMethodBeat.o(67623);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((locala1.b < locala2.b) && (locala1.c < locala2.c) && (locala1.d < locala2.d))
      {
        AppMethodBeat.o(67623);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(67623);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.i
 * JD-Core Version:    0.6.2
 */
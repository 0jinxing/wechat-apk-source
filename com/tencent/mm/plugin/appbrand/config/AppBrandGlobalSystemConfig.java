package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.luggage.sdk.customize.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AppBrandGlobalSystemConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandGlobalSystemConfig> CREATOR;
  private static volatile AppBrandGlobalSystemConfig hfF;
  public static final AppBrandGlobalSystemConfig hfG;
  public int hfH;
  public int hfI;
  public int hfJ;
  public int hfK;
  public int hfL;
  public int hfM;
  public int hfN;
  public String hfO;
  public AppBrandGlobalSystemConfig.HttpSetting hfP;
  public int[] hfQ;
  public int hfR;
  public int hfS;
  public int hfT;
  public int hfU;
  public int hfV;
  public int hfW;
  public int hfX;
  public int hfY;
  public int hfZ;
  public int hga;
  public String[] hgb;
  public double hgc;
  public int hgd;
  public AppBrandGlobalSystemConfig.WeAppSyncVersionSetting hge;
  public AppBrandGlobalSystemConfig.PackageManager hgf;
  public long hgg;
  public String[] hgh;
  public int hgi;
  public int hgj;

  static
  {
    AppMethodBeat.i(101812);
    AppBrandGlobalSystemConfig localAppBrandGlobalSystemConfig = new AppBrandGlobalSystemConfig();
    hfG = localAppBrandGlobalSystemConfig;
    localAppBrandGlobalSystemConfig.hfI = 5;
    hfG.hfJ = 300;
    hfG.hfK = 10;
    hfG.hfL = 1048576;
    hfG.hfM = 1048576;
    hfG.hfN = 20971520;
    hfG.hfQ = AppBrandGlobalSystemConfig.a.hgk;
    hfG.hfR = 50;
    hfG.hfS = 11;
    hfG.hfT = 12;
    hfG.hfU = 1800;
    hfG.hfV = 307200;
    hfG.hfW = 25;
    hfG.hfX = 10485760;
    hfG.hfY = 314572800;
    hfG.hfZ = 1;
    hfG.hga = 50;
    hfG.hgb = AppBrandGlobalSystemConfig.a.hgl;
    hfG.hgc = 0.0D;
    hfG.hgd = 60;
    hfG.hge = new AppBrandGlobalSystemConfig.WeAppSyncVersionSetting();
    hfG.hgf = new AppBrandGlobalSystemConfig.PackageManager();
    hfG.hgg = 30L;
    hfG.hgh = AppBrandGlobalSystemConfig.a.hgm;
    hfG.hgi = 10;
    hfG.hgj = 86400;
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(101812);
  }

  private AppBrandGlobalSystemConfig()
  {
    AppMethodBeat.i(101809);
    this.hfH = 2147483647;
    this.hfP = new AppBrandGlobalSystemConfig.HttpSetting();
    AppMethodBeat.o(101809);
  }

  protected AppBrandGlobalSystemConfig(Parcel paramParcel)
  {
    AppMethodBeat.i(101811);
    this.hfH = 2147483647;
    this.hfP = new AppBrandGlobalSystemConfig.HttpSetting();
    this.hfH = paramParcel.readInt();
    this.hfI = paramParcel.readInt();
    this.hfJ = paramParcel.readInt();
    this.hfK = paramParcel.readInt();
    this.hfL = paramParcel.readInt();
    this.hfM = paramParcel.readInt();
    this.hfN = paramParcel.readInt();
    this.hfO = paramParcel.readString();
    this.hfP = ((AppBrandGlobalSystemConfig.HttpSetting)paramParcel.readParcelable(AppBrandGlobalSystemConfig.HttpSetting.class.getClassLoader()));
    this.hfQ = paramParcel.createIntArray();
    this.hfR = paramParcel.readInt();
    this.hfS = paramParcel.readInt();
    this.hfU = paramParcel.readInt();
    this.hfV = paramParcel.readInt();
    this.hfW = paramParcel.readInt();
    this.hfX = paramParcel.readInt();
    this.hfY = paramParcel.readInt();
    this.hfZ = paramParcel.readInt();
    this.hga = paramParcel.readInt();
    this.hgb = paramParcel.createStringArray();
    this.hgc = paramParcel.readDouble();
    this.hgd = paramParcel.readInt();
    this.hge = ((AppBrandGlobalSystemConfig.WeAppSyncVersionSetting)paramParcel.readParcelable(AppBrandGlobalSystemConfig.WeAppSyncVersionSetting.class.getClassLoader()));
    this.hgf = ((AppBrandGlobalSystemConfig.PackageManager)paramParcel.readParcelable(AppBrandGlobalSystemConfig.PackageManager.class.getClassLoader()));
    this.hgg = paramParcel.readLong();
    this.hgh = paramParcel.createStringArray();
    this.hgi = paramParcel.readInt();
    this.hgj = paramParcel.readInt();
    AppMethodBeat.o(101811);
  }

  static String ayA()
  {
    AppMethodBeat.i(101805);
    Object localObject = new File(com.tencent.mm.compatible.util.e.eSk.replace("/data/user/0", "/data/data"), "wxaapp/res/");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = new File((File)localObject, "AppService.conf").getAbsolutePath();
    AppMethodBeat.o(101805);
    return localObject;
  }

  private static AppBrandGlobalSystemConfig ayB()
  {
    try
    {
      AppMethodBeat.i(101806);
      Object localObject1 = hfF;
      if (localObject1 == null);
      while (true)
      {
        try
        {
          localObject1 = com.tencent.mm.a.e.cy(ayA());
          if (bo.isNullOrNil((String)localObject1))
          {
            AppMethodBeat.o(101806);
            localObject1 = null;
            return localObject1;
          }
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          ((b)com.tencent.luggage.a.e.B(b.class)).xI();
          Object localObject2 = null;
          continue;
        }
        catch (IOException localIOException)
        {
          ab.e("MicroMsg.AppBrandGlobalSystemConfig", "read config file, exp = %s", new Object[] { localIOException });
          localObject3 = null;
          continue;
          hfF = yX((String)localObject3);
        }
        Object localObject3 = hfF;
        AppMethodBeat.o(101806);
      }
    }
    finally
    {
    }
  }

  public static AppBrandGlobalSystemConfig ayC()
  {
    AppMethodBeat.i(101807);
    AppBrandGlobalSystemConfig localAppBrandGlobalSystemConfig = ayB();
    if (localAppBrandGlobalSystemConfig == null)
    {
      localAppBrandGlobalSystemConfig = hfG;
      AppMethodBeat.o(101807);
    }
    while (true)
    {
      return localAppBrandGlobalSystemConfig;
      AppMethodBeat.o(101807);
    }
  }

  static void ayz()
  {
    try
    {
      hfF = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static AppBrandGlobalSystemConfig yX(String paramString)
  {
    AppMethodBeat.i(101808);
    ab.d("MicroMsg.AppBrandGlobalSystemConfig", "parse json = %s", new Object[] { paramString });
    JSONObject localJSONObject;
    Object localObject2;
    AppBrandGlobalSystemConfig.HttpSetting localHttpSetting;
    int i;
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig;
      paramString.<init>();
      localObject1 = localJSONObject.optJSONObject("HTTPSetting");
      if (localObject1 == null)
        break label348;
      localObject2 = ((JSONObject)localObject1).optString("HTTPHeaderMode", "");
      if (((String)localObject2).equals("BlackList"))
        paramString.hfP.mode = 1;
      while (true)
      {
        localObject2 = ((JSONObject)localObject1).optJSONArray("HeaderBlackList");
        if (localObject2 == null)
          break;
        localHttpSetting = paramString.hfP;
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        localHttpSetting.hgn = ((ArrayList)localObject3);
        for (i = 0; i < ((JSONArray)localObject2).length(); i++)
          paramString.hfP.hgn.add(((JSONArray)localObject2).getString(i));
        if (((String)localObject2).equals("WhiteList"))
          paramString.hfP.mode = 2;
      }
    }
    catch (Exception paramString)
    {
      ab.e("MicroMsg.AppBrandGlobalSystemConfig", "parse exception = %s", new Object[] { bo.l(paramString) });
      AppMethodBeat.o(101808);
      paramString = null;
    }
    return paramString;
    Object localObject3 = ((JSONObject)localObject1).optJSONArray("HeaderWhiteList");
    if (localObject3 != null)
    {
      localHttpSetting = paramString.hfP;
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localHttpSetting.hgo = ((ArrayList)localObject2);
      for (i = 0; i < ((JSONArray)localObject3).length(); i++)
        paramString.hfP.hgo.add(((JSONArray)localObject3).getString(i));
    }
    paramString.hfP.hgp = ((JSONObject)localObject1).optInt("WebsocketMaxTimeoutMS", -1);
    paramString.hfP.hgq = ((JSONObject)localObject1).optInt("UploadMaxTimeoutMS", -1);
    paramString.hfP.hgr = ((JSONObject)localObject1).optInt("DownloadMaxTimeoutMS", -1);
    paramString.hfP.hgs = ((JSONObject)localObject1).optInt("RequestMaxTimeoutMS", -1);
    paramString.hfP.hgt = ((JSONObject)localObject1).optString("HTTPHeaderReferer");
    label348: Object localObject1 = new com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig$WeAppSyncVersionSetting;
    ((AppBrandGlobalSystemConfig.WeAppSyncVersionSetting)localObject1).<init>();
    paramString.hge = ((AppBrandGlobalSystemConfig.WeAppSyncVersionSetting)localObject1);
    localObject1 = localJSONObject.optJSONObject("SyncVersionSetting");
    if (localObject1 != null)
    {
      paramString.hge.hgy = ((JSONObject)localObject1).optLong("PullVersionInterval", paramString.hge.hgy);
      paramString.hge.hgz = ((JSONObject)localObject1).optLong("PullVersionWxaUsageLastInterval", paramString.hge.hgz);
      paramString.hge.hgA = ((JSONObject)localObject1).optInt("PullVersionMaxCount", paramString.hge.hgA);
      paramString.hge.hgB = ((JSONObject)localObject1).optInt("PullVersionMaxCountPerRequest", paramString.hge.hgB);
    }
    localObject1 = new com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig$PackageManager;
    ((AppBrandGlobalSystemConfig.PackageManager)localObject1).<init>();
    paramString.hgf = ((AppBrandGlobalSystemConfig.PackageManager)localObject1);
    localObject1 = localJSONObject.optJSONObject("PackageManager");
    if (localObject1 != null)
    {
      paramString.hgf.hgu = ((JSONObject)localObject1).optLong("CheckInterval", paramString.hgf.hgu);
      paramString.hgf.hgv = ((JSONObject)localObject1).optLong("WithoutContactClearSeconds", paramString.hgf.hgv);
      paramString.hgf.hgw = ((JSONObject)localObject1).optLong("ClientStorageMinMB", paramString.hgf.hgw);
      paramString.hgf.hgx = ((JSONObject)localObject1).optInt("WholeClientStoragePercent", paramString.hgf.hgx);
    }
    paramString.hfO = localJSONObject.optString("CDNBaseURL");
    paramString.hfI = localJSONObject.optInt("AppMaxRunningCount", 5);
    paramString.hfJ = localJSONObject.optInt("TempFileSizeLimitTotal", 300);
    paramString.hfK = localJSONObject.optInt("DownloadFileSizeLimit", 10);
    paramString.hfL = localJSONObject.optInt("MaxLocalStorageItemSize", 1048576);
    paramString.hfM = localJSONObject.optInt("MaxGlobalStorageItemSize", 1048576);
    paramString.hfN = localJSONObject.optInt("MaxGlobalStorageSize", 20971520);
    paramString.hfX = localJSONObject.optInt("NativeBufferSizeLimitByte", 10485760);
    paramString.hfY = localJSONObject.optInt("NativeBufferQueueLimitByte", 314572800);
    paramString.hgj = localJSONObject.optInt("WeUseRecallInterval", 86400);
    localObject1 = localJSONObject.optJSONArray("SyncLaunchSceneList");
    if (localObject1 != null)
    {
      paramString.hfQ = new int[((JSONArray)localObject1).length()];
      for (i = 0; i < ((JSONArray)localObject1).length(); i++)
        paramString.hfQ[i] = ((JSONArray)localObject1).optInt(i, 0);
    }
    if (paramString.hfQ == null)
      paramString.hfQ = AppBrandGlobalSystemConfig.a.hgk;
    paramString.hfR = localJSONObject.optInt("StarNumberLimitation", 50);
    paramString.hfS = localJSONObject.optInt("TaskBarItemCountLimitation", 11);
    paramString.hfT = localJSONObject.optInt("NewTaskBarRecentsItemCountLimitation", 12);
    paramString.hfU = localJSONObject.optInt("WidgetImageFlowLimitDuration", 1800);
    paramString.hfV = localJSONObject.optInt("WidgetImageFlowLimitMaxSize", 307200);
    paramString.hfW = localJSONObject.optInt("WidgetDrawMinInterval", 25);
    paramString.hfZ = localJSONObject.optInt("GameMaxRunningCount", 1);
    paramString.hga = localJSONObject.optInt("GameDownloadFileSizeLimit", 50);
    localObject1 = localJSONObject.optJSONArray("SubContextImgDomain");
    if ((localObject1 == null) || (((JSONArray)localObject1).length() == 0))
    {
      paramString.hgb = AppBrandGlobalSystemConfig.a.hgl;
      label892: paramString.hgc = localJSONObject.optDouble("GamePerfCollectSamplePercentage", 0.0D);
      paramString.hgd = localJSONObject.optInt("GamePerfCollectInterval", 60);
      paramString.hgg = localJSONObject.optLong("OpendataMaxFileStorageSize", 30L);
      localObject1 = localJSONObject.optJSONArray("PreDownloadUserNameBlackList");
      if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
        break label1022;
      paramString.hgh = AppBrandGlobalSystemConfig.a.hgm;
    }
    while (true)
    {
      paramString.hgi = localJSONObject.optInt("WXDataMaxRequestConcurrent", 10);
      AppMethodBeat.o(101808);
      break;
      paramString.hgb = new String[((JSONArray)localObject1).length()];
      for (i = 0; i < ((JSONArray)localObject1).length(); i++)
        paramString.hgb[i] = ((JSONArray)localObject1).optString(i, null);
      break label892;
      label1022: paramString.hgh = new String[((JSONArray)localObject1).length()];
      for (i = 0; i < ((JSONArray)localObject1).length(); i++)
        paramString.hgh[i] = ((JSONArray)localObject1).optString(i, null);
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101810);
    paramParcel.writeInt(this.hfH);
    paramParcel.writeInt(this.hfI);
    paramParcel.writeInt(this.hfJ);
    paramParcel.writeInt(this.hfK);
    paramParcel.writeInt(this.hfL);
    paramParcel.writeInt(this.hfM);
    paramParcel.writeInt(this.hfN);
    paramParcel.writeString(this.hfO);
    paramParcel.writeParcelable(this.hfP, paramInt);
    paramParcel.writeIntArray(this.hfQ);
    paramParcel.writeInt(this.hfR);
    paramParcel.writeInt(this.hfS);
    paramParcel.writeInt(this.hfU);
    paramParcel.writeInt(this.hfV);
    paramParcel.writeInt(this.hfW);
    paramParcel.writeInt(this.hfX);
    paramParcel.writeInt(this.hfY);
    paramParcel.writeInt(this.hfZ);
    paramParcel.writeInt(this.hga);
    paramParcel.writeStringArray(this.hgb);
    paramParcel.writeDouble(this.hgc);
    paramParcel.writeInt(this.hgd);
    paramParcel.writeParcelable(this.hge, paramInt);
    paramParcel.writeParcelable(this.hgf, paramInt);
    paramParcel.writeLong(this.hgg);
    paramParcel.writeStringArray(this.hgh);
    paramParcel.writeInt(this.hgi);
    paramParcel.writeInt(this.hgj);
    AppMethodBeat.o(101810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig
 * JD-Core Version:    0.6.2
 */
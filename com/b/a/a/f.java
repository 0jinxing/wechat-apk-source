package com.b.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private final WifiManager bCU;
  private final LocationManager bCV;
  final SensorManager bCW;
  final PackageManager bCX;
  PackageInfo bCY;
  String bCZ;
  String bDa;
  String bDb;
  private int bDc;
  private int bDd;
  int bDe;
  int bDf;
  int bDg;
  int bDh;
  String imei;
  final Context mContext;
  private String source;
  private String version;
  String versionName;

  public f(Context paramContext)
  {
    AppMethodBeat.i(55536);
    this.bDc = 0;
    this.bDd = 0;
    this.bDe = 0;
    this.bDf = 0;
    this.bDg = 0;
    this.bDh = 0;
    this.source = "203";
    this.version = "2.0.1";
    this.mContext = paramContext;
    this.bCU = ((WifiManager)this.mContext.getSystemService("wifi"));
    this.bCV = ((LocationManager)this.mContext.getSystemService("location"));
    this.bCW = ((SensorManager)this.mContext.getSystemService("sensor"));
    this.bCX = this.mContext.getPackageManager();
    this.bCY = new PackageInfo();
    try
    {
      this.bCY = this.bCX.getPackageInfo(this.mContext.getPackageName(), 0);
      AppMethodBeat.o(55536);
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
        AppMethodBeat.o(55536);
    }
  }

  private static String bo(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private boolean wa()
  {
    AppMethodBeat.i(55538);
    boolean bool1 = false;
    try
    {
      boolean bool2 = this.bCV.isProviderEnabled("gps");
      bool1 = bool2;
      label19: AppMethodBeat.o(55538);
      return bool1;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }

  @SuppressLint({"NewApi"})
  private boolean wb()
  {
    AppMethodBeat.i(55539);
    boolean bool1 = false;
    boolean bool2;
    if (this.bCU != null)
    {
      bool2 = this.bCU.isWifiEnabled();
      bool1 = bool2;
      if (!bool2)
        bool1 = bool2;
    }
    try
    {
      if (Build.VERSION.SDK_INT >= 18)
        bool1 = this.bCU.isScanAlwaysAvailable();
      AppMethodBeat.o(55539);
      return bool1;
    }
    catch (Error localError)
    {
      while (true)
        bool1 = bool2;
    }
    catch (Exception localException)
    {
      while (true)
        bool1 = bool2;
    }
  }

  public final String t(byte[] paramArrayOfByte)
  {
    int i = 1;
    AppMethodBeat.i(55537);
    HashMap localHashMap = new HashMap();
    localHashMap.put("version", this.version);
    localHashMap.put("app_name", bo(this.versionName));
    if (this.bCZ != null)
      localHashMap.put("app_label", bo(Base64.encodeToString(this.bCZ.getBytes(), 0)));
    while (true)
    {
      int j;
      if (wa())
      {
        j = 1;
        label78: this.bDd = j;
        if ((this.bCU == null) || (!this.bCU.isWifiEnabled()))
          break label314;
        j = 1;
        label104: if ((j | wb()) == 0)
          break label320;
        j = i;
        this.bDc = j;
        localHashMap.put("chips", Integer.toBinaryString(this.bDh | 0x0 | this.bDg << 1 | this.bDf << 2 | this.bDe << 3 | this.bDd << 4 | this.bDc << 5));
        localHashMap.put("source", this.source);
        localHashMap.put("query", new String(paramArrayOfByte));
      }
      try
      {
        paramArrayOfByte = new org/json/JSONObject;
        paramArrayOfByte.<init>(localHashMap);
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        localHashMap.put("model", bo(Base64.encodeToString(this.bDa.getBytes(), 0)));
        localHashMap.put("version", bo(this.bDb));
        localHashMap.put("imei", bo(this.imei));
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(localHashMap);
        paramArrayOfByte = paramArrayOfByte.put("attribute", localJSONObject).toString();
        AppMethodBeat.o(55537);
        return paramArrayOfByte;
        localHashMap.put("app_label", "");
        continue;
        j = 0;
        break label78;
        label314: j = 0;
        break label104;
        label320: j = 0;
      }
      catch (JSONException paramArrayOfByte)
      {
        while (true)
        {
          paramArrayOfByte = null;
          AppMethodBeat.o(55537);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.b.a.a.f
 * JD-Core Version:    0.6.2
 */
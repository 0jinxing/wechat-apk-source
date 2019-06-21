package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.r.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsApiGetInstallState$GetInstallStateTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetInstallStateTask> CREATOR;
  private int bOs;
  private q gNC;
  private m hxE;
  private boolean hxM;
  private String hzK;
  private JSONArray hzL;
  private boolean hzM;
  private String mPackageName;
  private String mVersionName;

  static
  {
    AppMethodBeat.i(114348);
    CREATOR = new JsApiGetInstallState.GetInstallStateTask.1();
    AppMethodBeat.o(114348);
  }

  public JsApiGetInstallState$GetInstallStateTask(Parcel paramParcel)
  {
    AppMethodBeat.i(114343);
    g(paramParcel);
    AppMethodBeat.o(114343);
  }

  public JsApiGetInstallState$GetInstallStateTask(m paramm, q paramq, int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(114342);
    aBV();
    this.hxE = paramm;
    this.gNC = paramq;
    this.bOs = paramInt;
    this.mPackageName = paramJSONObject.optString("packageName");
    paramm = paramJSONObject.optJSONArray("packageNameArray");
    if (paramm != null)
      this.hzK = paramm.toString();
    this.hxM = true;
    AppMethodBeat.o(114342);
  }

  public final void asP()
  {
    AppMethodBeat.i(114344);
    int i;
    if (!bo.isNullOrNil(this.hzK))
    {
      try
      {
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>(this.hzK);
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>();
        this.hzL = ((JSONArray)localObject2);
        i = 0;
        while (true)
          if (i < ((JSONArray)localObject1).length())
          {
            String str2 = ((JSONArray)localObject1).optString(i);
            Object localObject3 = b.getPackageInfo(ah.getContext(), str2);
            int j;
            label75: label83: boolean bool;
            if (localObject3 == null)
            {
              j = 0;
              if (localObject3 != null)
                break label227;
              localObject2 = "null";
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("getInstallState, packageName = ");
              ab.i("MicroMsg.JsApiGetInstallState", str2 + ", packageInfo = " + localObject3 + ", version = " + j + ", versionName = " + (String)localObject2);
              if (localObject3 == null)
                break label236;
              bool = true;
            }
            try
            {
              while (true)
              {
                localObject3 = new org/json/JSONObject;
                ((JSONObject)localObject3).<init>();
                ((JSONObject)localObject3).put("packageName", str2);
                ((JSONObject)localObject3).put("isInstalled", bool);
                if (bool)
                {
                  ((JSONObject)localObject3).put("versionCode", j);
                  ((JSONObject)localObject3).put("versionName", localObject2);
                }
                this.hzL.put(localObject3);
                i++;
                break;
                j = ((PackageInfo)localObject3).versionCode;
                break label75;
                label227: localObject2 = ((PackageInfo)localObject3).versionName;
                break label83;
                label236: bool = false;
              }
            }
            catch (JSONException localJSONException1)
            {
              while (true)
                ab.i("MicroMsg.JsApiGetInstallState", localJSONException1.getMessage());
            }
          }
      }
      catch (JSONException localJSONException2)
      {
        ab.e("MicroMsg.JsApiGetInstallState", localJSONException2.getMessage());
        this.hxM = true;
      }
      while (true)
      {
        aCb();
        AppMethodBeat.o(114344);
        return;
        this.hxM = false;
      }
    }
    Object localObject1 = b.getPackageInfo(ah.getContext(), this.mPackageName);
    label306: String str1;
    if (localObject1 == null)
    {
      i = 0;
      if (localObject1 != null)
        break label389;
      str1 = "null";
      label313: ab.i("MicroMsg.JsApiGetInstallState", "doGetInstallState, packageName = " + this.mPackageName + ", packageInfo = " + localObject1 + ", version = " + i + ", versionName = " + str1);
      if (localObject1 != null)
        break label397;
    }
    for (this.hzM = false; ; this.hzM = true)
    {
      this.hxM = false;
      break;
      i = ((PackageInfo)localObject1).versionCode;
      break label306;
      label389: str1 = ((PackageInfo)localObject1).versionName;
      break label313;
      label397: this.mVersionName = str1;
    }
  }

  public final void asQ()
  {
    boolean bool = true;
    AppMethodBeat.i(114345);
    if (this.gNC == null);
    while (true)
    {
      ab.d("MicroMsg.JsApiGetInstallState", "callback, service is null: %b", new Object[] { Boolean.valueOf(bool) });
      aBW();
      if (!this.hxM)
        break;
      this.gNC.M(this.bOs, this.hxE.j("fail", null));
      AppMethodBeat.o(114345);
      return;
      bool = false;
    }
    HashMap localHashMap = new HashMap();
    if (this.hzL != null)
      localHashMap.put("result", this.hzL);
    while (true)
    {
      this.gNC.M(this.bOs, this.hxE.j("ok", localHashMap));
      AppMethodBeat.o(114345);
      break;
      localHashMap.put("versionName", this.mVersionName);
      localHashMap.put("isInstalled", Boolean.valueOf(this.hzM));
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(114346);
    this.mPackageName = paramParcel.readString();
    this.hzK = paramParcel.readString();
    boolean bool2;
    String str;
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.hxM = bool2;
      if (paramParcel.readInt() != 1)
        break label98;
      bool2 = bool1;
      this.hzM = bool2;
      this.mVersionName = paramParcel.readString();
      str = paramParcel.readString();
      if (str == null)
        break label128;
    }
    while (true)
    {
      try
      {
        paramParcel = new org/json/JSONArray;
        paramParcel.<init>(str);
        this.hzL = paramParcel;
        AppMethodBeat.o(114346);
        return;
        bool2 = false;
        break;
        label98: bool2 = false;
      }
      catch (JSONException paramParcel)
      {
        ab.e("MicroMsg.JsApiGetInstallState", "parseFromParcel: " + paramParcel.getMessage());
      }
      label128: AppMethodBeat.o(114346);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(114347);
    paramParcel.writeString(this.mPackageName);
    paramParcel.writeString(this.hzK);
    if (this.hxM)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.hzM)
        break label92;
      paramInt = i;
      label46: paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.mVersionName);
      if (this.hzL == null)
        break label97;
    }
    label92: label97: for (String str = this.hzL.toString(); ; str = null)
    {
      paramParcel.writeString(str);
      AppMethodBeat.o(114347);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label46;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState.GetInstallStateTask
 * JD-Core Version:    0.6.2
 */
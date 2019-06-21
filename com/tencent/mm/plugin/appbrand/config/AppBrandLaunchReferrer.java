package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class AppBrandLaunchReferrer
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandLaunchReferrer> CREATOR;
  public String appId;
  public String businessType;
  public String cFM;
  public String cOv;
  public int cvp;
  public int hgQ;
  public String hgR;
  public String hgS;
  public String hgT;
  public String hgU;
  public String url;

  static
  {
    AppMethodBeat.i(86903);
    CREATOR = new AppBrandLaunchReferrer.1();
    AppMethodBeat.o(86903);
  }

  public AppBrandLaunchReferrer()
  {
  }

  private AppBrandLaunchReferrer(Parcel paramParcel)
  {
    AppMethodBeat.i(86902);
    j(paramParcel);
    AppMethodBeat.o(86902);
  }

  private void j(Parcel paramParcel)
  {
    AppMethodBeat.i(86898);
    this.hgQ = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.cFM = paramParcel.readString();
    this.hgR = paramParcel.readString();
    this.url = paramParcel.readString();
    this.hgS = paramParcel.readString();
    this.cvp = paramParcel.readInt();
    this.businessType = paramParcel.readString();
    this.cOv = paramParcel.readString();
    this.hgT = paramParcel.readString();
    this.hgU = paramParcel.readString();
    AppMethodBeat.o(86898);
  }

  public final void a(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    AppMethodBeat.i(86900);
    if (paramAppBrandLaunchReferrer == null)
      AppMethodBeat.o(86900);
    while (true)
    {
      return;
      Parcel localParcel = Parcel.obtain();
      localParcel.setDataPosition(0);
      paramAppBrandLaunchReferrer.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      j(localParcel);
      localParcel.recycle();
      AppMethodBeat.o(86900);
    }
  }

  public final JSONObject ayF()
  {
    AppMethodBeat.i(86901);
    try
    {
      localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>(this.cFM);
      localJSONObject2 = new JSONObject();
    }
    catch (Exception localException1)
    {
      try
      {
        JSONObject localJSONObject1;
        localJSONObject2.put("appId", this.appId);
        localJSONObject2.put("extraData", localJSONObject1);
        if (((this.hgQ == 1) || (this.hgQ == 3) || (this.hgQ == 2)) && (!bo.isNullOrNil(this.hgR)))
        {
          localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>(this.hgR);
          localJSONObject2.put("privateExtraData", localJSONObject1);
        }
        if ((this.hgQ == 6) && (!bo.isNullOrNil(this.cOv)))
        {
          localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>(this.cOv);
          localJSONObject2.put("messageExtraData", localJSONObject1);
        }
        if ((this.hgQ == 7) && (!bo.isNullOrNil(this.hgT)))
        {
          localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>(this.hgT);
          localJSONObject2.put("openapiInvokeData", localJSONObject1);
        }
        if ((this.hgQ == 7) && (!bo.isNullOrNil(this.hgU)))
        {
          localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>(this.hgU);
          localJSONObject2.put("transitiveData", localJSONObject1);
        }
        if (localJSONObject2.length() == 0)
        {
          localJSONObject1 = null;
          AppMethodBeat.o(86901);
          return localJSONObject1;
          localException1 = localException1;
          String str = this.cFM;
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          JSONObject localJSONObject2;
          ab.e("MicroMsg.AppBrandLaunchReferrer", "toJsonObj exception: %s", new Object[] { localException2 });
          continue;
          AppMethodBeat.o(86901);
          Object localObject = localJSONObject2;
        }
      }
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    AppMethodBeat.i(86897);
    String str = "AppBrandLaunchReferrer{launchScene=" + this.hgQ + ", appId='" + this.appId + '\'' + ", extraData='" + this.cFM + '\'' + ", url='" + this.url + '\'' + ", agentId='" + this.hgS + '\'' + ", sourceType='" + this.cvp + '\'' + ", businessType='" + this.businessType + '\'' + '}';
    AppMethodBeat.o(86897);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(86899);
    paramParcel.writeInt(this.hgQ);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.cFM);
    paramParcel.writeString(this.hgR);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.hgS);
    paramParcel.writeInt(this.cvp);
    paramParcel.writeString(this.businessType);
    paramParcel.writeString(this.cOv);
    paramParcel.writeString(this.hgT);
    paramParcel.writeString(this.hgU);
    AppMethodBeat.o(86899);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
 * JD-Core Version:    0.6.2
 */
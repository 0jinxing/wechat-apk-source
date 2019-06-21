package com.tencent.luggage.sdk.config;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper;
import com.tencent.luggage.sdk.launching.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.launching.params.AppBrandWeishiParams;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandInitConfigLU extends AppBrandInitConfig
{
  public static final Parcelable.Creator<AppBrandInitConfigLU> CREATOR;
  public int axy;
  protected String bQd;
  public int bQe;
  public boolean bQf;
  public boolean bQg;
  public String bQh;
  public String bQi;
  public final AppBrandWeishiParams bQj;
  public String bQk;
  public int bQl;
  public b<?> bQm;
  public transient AppBrandStatObject bQn;
  public String extInfo;
  public long startTime;
  public int uin;
  public String username;

  static
  {
    AppMethodBeat.i(101620);
    CREATOR = new AppBrandInitConfigLU.1();
    AppMethodBeat.o(101620);
  }

  public AppBrandInitConfigLU()
  {
    AppMethodBeat.i(101613);
    this.bQj = new AppBrandWeishiParams();
    AppMethodBeat.o(101613);
  }

  protected AppBrandInitConfigLU(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(101614);
    this.bQd = paramParcel.readString();
    this.username = paramParcel.readString();
    this.bQh = paramParcel.readString();
    this.bQi = paramParcel.readString();
    this.bQj = ((AppBrandWeishiParams)paramParcel.readParcelable(AppBrandWeishiParams.class.getClassLoader()));
    this.bQe = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.bQf = bool2;
      if (paramParcel.readByte() == 0)
        break label163;
    }
    label163: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.bQg = bool2;
      this.extInfo = paramParcel.readString();
      this.bQk = paramParcel.readString();
      this.startTime = paramParcel.readLong();
      this.axy = paramParcel.readInt();
      this.bQl = paramParcel.readInt();
      this.uin = paramParcel.readInt();
      this.bQm = OnWXAppResultXPCWrapper.b(paramParcel);
      AppMethodBeat.o(101614);
      return;
      bool2 = false;
      break;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final void resetSession()
  {
    AppMethodBeat.i(101610);
    this.bQd = ("SessionId@" + hashCode() + "#" + bo.anU());
    AppMethodBeat.o(101610);
  }

  public String toString()
  {
    AppMethodBeat.i(101615);
    String str = "AppBrandInitConfigLU {visitingSessionId='" + this.bQd + '\'' + ", username='" + this.username + '\'' + ", appId='" + this.appId + '\'' + ", brandName='" + this.cwz + '\'' + ", debugType=" + this.gVs + ", orientation='" + this.hfh + '\'' + ", enterPath='" + this.hgC + '\'' + ", shareName='" + this.bQh + '\'' + ", shareKey='" + this.bQi + '\'' + ", weishiParams=" + this.bQj + ", startTime=" + this.startTime + ", referrer=" + this.hgF + ", extInfo=" + this.extInfo + ", appVersion=" + this.axy + '}';
    AppMethodBeat.o(101615);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(101618);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.bQd);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.bQh);
    paramParcel.writeString(this.bQi);
    paramParcel.writeParcelable(this.bQj, paramInt);
    paramParcel.writeInt(this.bQe);
    if (this.bQf)
    {
      paramInt = 1;
      j = paramInt;
      paramParcel.writeByte(j);
      if (!this.bQg)
        break label166;
    }
    int k;
    for (int j = i; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      paramParcel.writeString(this.extInfo);
      paramParcel.writeString(this.bQk);
      paramParcel.writeLong(this.startTime);
      paramParcel.writeInt(this.axy);
      paramParcel.writeInt(this.bQl);
      paramParcel.writeInt(this.uin);
      OnWXAppResultXPCWrapper.a(this.bQm, paramParcel);
      AppMethodBeat.o(101618);
      return;
      paramInt = 0;
      k = paramInt;
      break;
      label166: paramInt = 0;
    }
  }

  public final JSONObject xA()
  {
    Object localObject = null;
    AppMethodBeat.i(101611);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("shareKey", this.bQi);
      localJSONObject.put("shareName", this.bQh);
      if (localJSONObject.length() == 0)
      {
        AppMethodBeat.o(101611);
        return localObject;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        AppMethodBeat.o(101611);
        continue;
        AppMethodBeat.o(101611);
        localObject = localJSONException;
      }
    }
  }

  public final JSONObject xB()
  {
    Object localObject = null;
    AppMethodBeat.i(101612);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appId", this.appId);
      localJSONObject.put("nickname", this.cwz);
      localJSONObject.put("icon", this.iconUrl);
      if (localJSONObject.length() == 0)
      {
        AppMethodBeat.o(101612);
        return localObject;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        AppMethodBeat.o(101612);
        continue;
        AppMethodBeat.o(101612);
        localObject = localJSONException;
      }
    }
  }

  public AppBrandInitConfigLU xC()
  {
    AppMethodBeat.i(101616);
    Parcel localParcel = xD();
    AppBrandInitConfigLU localAppBrandInitConfigLU = new AppBrandInitConfigLU(localParcel);
    localParcel.recycle();
    AppMethodBeat.o(101616);
    return localAppBrandInitConfigLU;
  }

  public Parcel xD()
  {
    AppMethodBeat.i(101617);
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    AppMethodBeat.o(101617);
    return localParcel;
  }

  public final AppBrandStatObject xx()
  {
    return this.bQn;
  }

  public boolean xy()
  {
    if (this.bQe == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String xz()
  {
    return this.bQd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.config.AppBrandInitConfigLU
 * JD-Core Version:    0.6.2
 */
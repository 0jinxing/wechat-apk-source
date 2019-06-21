package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;

public class AppBrandInitConfigWC extends AppBrandInitConfigLU
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandInitConfigWC> CREATOR;
  public transient boolean hgI;
  public boolean hgJ;
  public long hgK;
  public String hgL;
  public String hgM;
  public volatile QualitySession hgN;
  public boolean hgO;
  public transient int hgP;

  static
  {
    AppMethodBeat.i(129841);
    CREATOR = new AppBrandInitConfigWC.1();
    AppMethodBeat.o(129841);
  }

  AppBrandInitConfigWC()
  {
    this.hgO = false;
  }

  protected AppBrandInitConfigWC(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(129838);
    this.hgO = false;
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hgJ = bool2;
      this.hgK = paramParcel.readLong();
      this.hgN = ((QualitySession)paramParcel.readParcelable(QualitySession.class.getClassLoader()));
      if (paramParcel.readByte() == 0)
        break label96;
    }
    label96: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hgO = bool2;
      this.hgL = paramParcel.readString();
      this.hgM = paramParcel.readString();
      AppMethodBeat.o(129838);
      return;
      bool2 = false;
      break;
    }
  }

  private AppBrandInitConfigWC ayE()
  {
    AppMethodBeat.i(129835);
    Parcel localParcel = xD();
    AppBrandInitConfigWC localAppBrandInitConfigWC = new AppBrandInitConfigWC(localParcel);
    localParcel.recycle();
    AppMethodBeat.o(129835);
    return localAppBrandInitConfigWC;
  }

  public String toString()
  {
    AppMethodBeat.i(129834);
    String str = "AppBrandInitConfigWC {visitingSessionId='" + this.bQd + '\'' + ", username='" + this.username + '\'' + ", appId='" + this.appId + '\'' + ", brandName='" + this.cwz + '\'' + ", debugType=" + this.gVs + ", isPluginApp=" + this.hgJ + ", preferRunInTools=" + this.hgI + ", orientation='" + this.hfh + '\'' + ", enterPath='" + this.hgC + '\'' + ", shareName='" + this.bQh + '\'' + ", shareKey='" + this.bQi + '\'' + ", startTime=" + this.startTime + ", attrsFromCgi=" + this.hgO + ", referrer=" + this.hgF + ", extInfo=" + this.extInfo + ", appVersion=" + this.axy + ", loadingImgUrl=" + this.hgL + ", loadingImgrProgressbarColor" + this.hgM + '}';
    AppMethodBeat.o(129834);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(129837);
    super.writeToParcel(paramParcel, paramInt);
    byte b1;
    byte b2;
    if (this.hgJ)
    {
      b1 = 1;
      b2 = b1;
      paramParcel.writeByte(b2);
      paramParcel.writeLong(this.hgK);
      paramParcel.writeParcelable(this.hgN, paramInt);
      if (!this.hgO)
        break label97;
    }
    label97: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeString(this.hgL);
      paramParcel.writeString(this.hgM);
      AppMethodBeat.o(129837);
      return;
      b1 = 0;
      b2 = b1;
      break;
    }
  }

  public final Parcel xD()
  {
    AppMethodBeat.i(129836);
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    AppMethodBeat.o(129836);
    return localParcel;
  }

  public final boolean xy()
  {
    if (this.bQe == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC
 * JD-Core Version:    0.6.2
 */
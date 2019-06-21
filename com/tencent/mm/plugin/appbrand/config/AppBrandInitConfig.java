package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandInitConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandInitConfig> CREATOR;
  public String appId;
  public String cwz;
  public int gVs;
  public String hfh;
  public String hgC;
  public int hgD;
  public String hgE;
  public final AppBrandLaunchReferrer hgF;
  public boolean hgG;
  public String iconUrl;

  static
  {
    AppMethodBeat.i(86895);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(86895);
  }

  public AppBrandInitConfig()
  {
    AppMethodBeat.i(86892);
    this.hgF = new AppBrandLaunchReferrer();
    AppMethodBeat.o(86892);
  }

  protected AppBrandInitConfig(Parcel paramParcel)
  {
    AppMethodBeat.i(86893);
    this.appId = paramParcel.readString();
    this.cwz = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.gVs = paramParcel.readInt();
    this.hgC = paramParcel.readString();
    this.hgF = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
    this.hfh = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.hgG = bool;
      this.hgD = paramParcel.readInt();
      this.hgE = paramParcel.readString();
      AppMethodBeat.o(86893);
      return;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(86894);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.cwz);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeInt(this.gVs);
    paramParcel.writeString(this.hgC);
    paramParcel.writeParcelable(this.hgF, paramInt);
    paramParcel.writeString(this.hfh);
    if (this.hgG);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.hgD);
      paramParcel.writeString(this.hgE);
      AppMethodBeat.o(86894);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig
 * JD-Core Version:    0.6.2
 */
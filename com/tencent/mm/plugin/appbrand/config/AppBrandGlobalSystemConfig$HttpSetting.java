package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class AppBrandGlobalSystemConfig$HttpSetting
  implements Parcelable
{
  public static final Parcelable.Creator<HttpSetting> CREATOR;
  public ArrayList<String> hgn;
  public ArrayList<String> hgo;
  public int hgp;
  public int hgq;
  public int hgr;
  public int hgs;
  public String hgt;
  public int mode;

  static
  {
    AppMethodBeat.i(101796);
    CREATOR = new AppBrandGlobalSystemConfig.HttpSetting.1();
    AppMethodBeat.o(101796);
  }

  public AppBrandGlobalSystemConfig$HttpSetting()
  {
    this.mode = 0;
  }

  AppBrandGlobalSystemConfig$HttpSetting(Parcel paramParcel)
  {
    AppMethodBeat.i(101795);
    this.mode = 0;
    this.mode = paramParcel.readInt();
    this.hgn = paramParcel.createStringArrayList();
    this.hgo = paramParcel.createStringArrayList();
    this.hgp = paramParcel.readInt();
    this.hgq = paramParcel.readInt();
    this.hgr = paramParcel.readInt();
    this.hgs = paramParcel.readInt();
    this.hgt = paramParcel.readString();
    AppMethodBeat.o(101795);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101794);
    paramParcel.writeInt(this.mode);
    paramParcel.writeStringList(this.hgn);
    paramParcel.writeStringList(this.hgo);
    paramParcel.writeInt(this.hgp);
    paramParcel.writeInt(this.hgq);
    paramParcel.writeInt(this.hgr);
    paramParcel.writeInt(this.hgs);
    paramParcel.writeString(this.hgt);
    AppMethodBeat.o(101794);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting
 * JD-Core Version:    0.6.2
 */
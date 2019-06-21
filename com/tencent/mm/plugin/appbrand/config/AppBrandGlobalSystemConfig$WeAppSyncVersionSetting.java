package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandGlobalSystemConfig$WeAppSyncVersionSetting
  implements Parcelable
{
  public static final Parcelable.Creator<WeAppSyncVersionSetting> CREATOR;
  public int hgA;
  public int hgB;
  public long hgy;
  public long hgz;

  static
  {
    AppMethodBeat.i(101804);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(101804);
  }

  AppBrandGlobalSystemConfig$WeAppSyncVersionSetting()
  {
    this.hgy = 21600L;
    this.hgz = 604800L;
    this.hgA = 1000;
    this.hgB = 100;
  }

  AppBrandGlobalSystemConfig$WeAppSyncVersionSetting(Parcel paramParcel)
  {
    AppMethodBeat.i(101803);
    this.hgy = 21600L;
    this.hgz = 604800L;
    this.hgA = 1000;
    this.hgB = 100;
    this.hgy = paramParcel.readLong();
    this.hgz = paramParcel.readLong();
    this.hgA = paramParcel.readInt();
    this.hgB = paramParcel.readInt();
    AppMethodBeat.o(101803);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101802);
    paramParcel.writeLong(this.hgy);
    paramParcel.writeLong(this.hgz);
    paramParcel.writeInt(this.hgA);
    paramParcel.writeInt(this.hgB);
    AppMethodBeat.o(101802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting
 * JD-Core Version:    0.6.2
 */
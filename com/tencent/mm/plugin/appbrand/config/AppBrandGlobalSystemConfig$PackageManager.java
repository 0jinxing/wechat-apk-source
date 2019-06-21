package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandGlobalSystemConfig$PackageManager
  implements Parcelable
{
  public static final Parcelable.Creator<PackageManager> CREATOR;
  public long hgu;
  public long hgv;
  public long hgw;
  public int hgx;

  static
  {
    AppMethodBeat.i(101800);
    CREATOR = new AppBrandGlobalSystemConfig.PackageManager.1();
    AppMethodBeat.o(101800);
  }

  public AppBrandGlobalSystemConfig$PackageManager()
  {
    this.hgu = 86400L;
    this.hgv = 864000L;
    this.hgw = 256L;
    this.hgx = 5;
  }

  protected AppBrandGlobalSystemConfig$PackageManager(Parcel paramParcel)
  {
    AppMethodBeat.i(101799);
    this.hgu = 86400L;
    this.hgv = 864000L;
    this.hgw = 256L;
    this.hgx = 5;
    this.hgu = paramParcel.readLong();
    this.hgv = paramParcel.readLong();
    this.hgw = paramParcel.readLong();
    this.hgx = paramParcel.readInt();
    AppMethodBeat.o(101799);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101798);
    paramParcel.writeLong(this.hgu);
    paramParcel.writeLong(this.hgv);
    paramParcel.writeLong(this.hgw);
    paramParcel.writeInt(this.hgx);
    AppMethodBeat.o(101798);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.PackageManager
 * JD-Core Version:    0.6.2
 */
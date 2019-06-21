package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.jsapi.version.a;

final class AppBrandPrepareTask$PrepareResult
  implements Parcelable
{
  public static final Parcelable.Creator<PrepareResult> CREATOR;
  private int igp;
  private AppBrandLaunchErrorAction igq;
  private AppBrandSysConfigWC igr;
  private AppStartupPerformanceReportBundle igs;
  private int igt;
  private long igu;
  private a igv;
  private int igw;

  static
  {
    AppMethodBeat.i(131757);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(131757);
  }

  AppBrandPrepareTask$PrepareResult()
  {
    this.igw = 0;
  }

  AppBrandPrepareTask$PrepareResult(Parcel paramParcel)
  {
    AppMethodBeat.i(131756);
    this.igw = 0;
    this.igp = paramParcel.readInt();
    this.igq = ((AppBrandLaunchErrorAction)paramParcel.readParcelable(AppBrandLaunchErrorAction.class.getClassLoader()));
    this.igr = ((AppBrandSysConfigWC)paramParcel.readParcelable(AppBrandSysConfigWC.class.getClassLoader()));
    this.igt = paramParcel.readInt();
    this.igu = paramParcel.readLong();
    this.igs = ((AppStartupPerformanceReportBundle)paramParcel.readParcelable(AppStartupPerformanceReportBundle.class.getClassLoader()));
    this.igw = paramParcel.readInt();
    if (this.igp == 5)
      this.igv = a.BN(paramParcel.readString());
    AppMethodBeat.o(131756);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131755);
    paramParcel.writeInt(this.igp);
    paramParcel.writeParcelable(this.igq, paramInt);
    paramParcel.writeParcelable(this.igr, paramInt);
    paramParcel.writeInt(this.igt);
    paramParcel.writeLong(this.igu);
    paramParcel.writeParcelable(this.igs, paramInt);
    paramParcel.writeInt(this.igw);
    if (this.igp == 5)
      paramParcel.writeString(this.igv.toString());
    AppMethodBeat.o(131755);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.PrepareResult
 * JD-Core Version:    0.6.2
 */
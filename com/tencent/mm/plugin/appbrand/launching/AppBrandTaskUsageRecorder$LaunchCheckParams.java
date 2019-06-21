package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;

public final class AppBrandTaskUsageRecorder$LaunchCheckParams
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchCheckParams> CREATOR;
  final String bQd;
  final int gVu;
  final int hCY;
  final QualitySession hgN;
  final boolean hop;
  final AppBrandInitConfigWC igx;
  final AppBrandStatObject igy;

  static
  {
    AppMethodBeat.i(131763);
    CREATOR = new AppBrandTaskUsageRecorder.LaunchCheckParams.1();
    AppMethodBeat.o(131763);
  }

  AppBrandTaskUsageRecorder$LaunchCheckParams(Parcel paramParcel)
  {
    AppMethodBeat.i(131762);
    this.hop = true;
    this.igx = ((AppBrandInitConfigWC)paramParcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader()));
    this.igy = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
    this.gVu = paramParcel.readInt();
    this.hCY = paramParcel.readInt();
    this.bQd = paramParcel.readString();
    this.hgN = ((QualitySession)paramParcel.readParcelable(QualitySession.class.getClassLoader()));
    AppMethodBeat.o(131762);
  }

  public AppBrandTaskUsageRecorder$LaunchCheckParams(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject, int paramInt1, int paramInt2, String paramString, QualitySession paramQualitySession)
  {
    this.hop = true;
    this.igx = paramAppBrandInitConfigWC;
    this.igy = paramAppBrandStatObject;
    this.gVu = paramInt1;
    this.hCY = paramInt2;
    this.bQd = paramString;
    this.hgN = paramQualitySession;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131761);
    paramParcel.writeParcelable(this.igx, paramInt);
    paramParcel.writeParcelable(this.igy, paramInt);
    paramParcel.writeInt(this.gVu);
    paramParcel.writeInt(this.hCY);
    paramParcel.writeString(this.bQd);
    paramParcel.writeParcelable(this.hgN, paramInt);
    AppMethodBeat.o(131761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.LaunchCheckParams
 * JD-Core Version:    0.6.2
 */
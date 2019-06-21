package com.tencent.mm.plugin.appbrand.report.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AdReportCgiHelper$AdReportCgiParams
  implements Parcelable
{
  public static final Parcelable.Creator<AdReportCgiParams> CREATOR;
  private int eBH;
  private String iAG;

  static
  {
    AppMethodBeat.i(132575);
    CREATOR = new AdReportCgiHelper.AdReportCgiParams.1();
    AppMethodBeat.o(132575);
  }

  AdReportCgiHelper$AdReportCgiParams()
  {
  }

  protected AdReportCgiHelper$AdReportCgiParams(Parcel paramParcel)
  {
    AppMethodBeat.i(132573);
    this.eBH = paramParcel.readInt();
    this.iAG = paramParcel.readString();
    AppMethodBeat.o(132573);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(132574);
    paramParcel.writeInt(this.eBH);
    paramParcel.writeString(this.iAG);
    AppMethodBeat.o(132574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper.AdReportCgiParams
 * JD-Core Version:    0.6.2
 */
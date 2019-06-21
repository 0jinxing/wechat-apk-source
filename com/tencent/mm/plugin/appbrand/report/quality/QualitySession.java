package com.tencent.mm.plugin.appbrand.report.quality;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public class QualitySession
  implements Parcelable
{
  public static final Parcelable.Creator<QualitySession> CREATOR;
  public String appId;
  public int apptype;
  public int iCZ;
  public int iDa;
  public final String igT;
  public int scene;

  static
  {
    AppMethodBeat.i(132707);
    CREATOR = new QualitySession.1();
    AppMethodBeat.o(132707);
  }

  protected QualitySession(Parcel paramParcel)
  {
    AppMethodBeat.i(132706);
    this.igT = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.iCZ = paramParcel.readInt();
    this.apptype = paramParcel.readInt();
    this.scene = paramParcel.readInt();
    this.iDa = paramParcel.readInt();
    AppMethodBeat.o(132706);
  }

  public QualitySession(String paramString, AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(132704);
    this.igT = paramString;
    this.appId = paramAppBrandInitConfigWC.appId;
    switch (paramAppBrandInitConfigWC.gVs)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      this.apptype = (paramAppBrandInitConfigWC.bQe + 1000);
      this.scene = paramAppBrandStatObject.scene;
      this.iDa = paramAppBrandInitConfigWC.axy;
      AppMethodBeat.o(132704);
      return;
      this.iCZ = 1;
      continue;
      this.iCZ = 2;
      continue;
      this.iCZ = 3;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(132705);
    paramParcel.writeString(this.igT);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.iCZ);
    paramParcel.writeInt(this.apptype);
    paramParcel.writeInt(this.scene);
    paramParcel.writeInt(this.iDa);
    AppMethodBeat.o(132705);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.QualitySession
 * JD-Core Version:    0.6.2
 */
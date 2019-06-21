package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;

class ModularizingPkgRetrieverWC$WxaPkgResultProgressPair
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgResultProgressPair> CREATOR;
  WxaPkgWrappingInfo iif;
  WxaPkgLoadProgress iig;
  private ModularizingPkgRetrieverWC.WxaPkgResultProgressPair.a iih;

  static
  {
    AppMethodBeat.i(131942);
    CREATOR = new ModularizingPkgRetrieverWC.WxaPkgResultProgressPair.1();
    AppMethodBeat.o(131942);
  }

  ModularizingPkgRetrieverWC$WxaPkgResultProgressPair(Parcel paramParcel)
  {
    AppMethodBeat.i(131940);
    this.iif = ((WxaPkgWrappingInfo)paramParcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader()));
    this.iig = ((WxaPkgLoadProgress)paramParcel.readParcelable(WxaPkgLoadProgress.class.getClassLoader()));
    this.iih = ((ModularizingPkgRetrieverWC.WxaPkgResultProgressPair.a)paramParcel.readSerializable());
    AppMethodBeat.o(131940);
  }

  ModularizingPkgRetrieverWC$WxaPkgResultProgressPair(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    this.iig = paramWxaPkgLoadProgress;
    this.iih = ModularizingPkgRetrieverWC.WxaPkgResultProgressPair.a.iij;
  }

  ModularizingPkgRetrieverWC$WxaPkgResultProgressPair(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    this.iif = paramWxaPkgWrappingInfo;
    this.iih = ModularizingPkgRetrieverWC.WxaPkgResultProgressPair.a.iii;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131941);
    paramParcel.writeParcelable(this.iif, paramInt);
    paramParcel.writeParcelable(this.iig, paramInt);
    paramParcel.writeSerializable(this.iih);
    AppMethodBeat.o(131941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverWC.WxaPkgResultProgressPair
 * JD-Core Version:    0.6.2
 */
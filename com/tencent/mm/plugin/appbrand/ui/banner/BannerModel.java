package com.tencent.mm.plugin.appbrand.ui.banner;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;

final class BannerModel
  implements Parcelable
{
  public static final Parcelable.Creator<BannerModel> CREATOR;
  private static volatile BannerModel iKW;
  String appId;
  String appName;
  String haO;
  int har;
  String iKV;

  static
  {
    AppMethodBeat.i(133320);
    CREATOR = new BannerModel.1();
    AppMethodBeat.o(133320);
  }

  BannerModel()
  {
  }

  private BannerModel(Parcel paramParcel)
  {
    AppMethodBeat.i(133318);
    this.appId = paramParcel.readString();
    this.har = paramParcel.readInt();
    this.appName = paramParcel.readString();
    this.haO = paramParcel.readString();
    this.iKV = paramParcel.readString();
    AppMethodBeat.o(133318);
  }

  static BannerModel aMS()
  {
    AppMethodBeat.i(133319);
    try
    {
      BannerModel localBannerModel = ((e)g.K(e.class)).aMJ();
      iKW = localBannerModel;
      return localBannerModel;
    }
    finally
    {
      AppMethodBeat.o(133319);
    }
  }

  static BannerModel aMT()
  {
    try
    {
      BannerModel localBannerModel = iKW;
      return localBannerModel;
    }
    finally
    {
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(133317);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.har);
    paramParcel.writeString(this.appName);
    paramParcel.writeString(this.haO);
    paramParcel.writeString(this.iKV);
    AppMethodBeat.o(133317);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.BannerModel
 * JD-Core Version:    0.6.2
 */
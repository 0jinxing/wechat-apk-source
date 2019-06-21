package com.tencent.mm.plugin.appbrand.launching.params;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandWeishiParams
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandWeishiParams> CREATOR;
  public String appId;
  public String appName;
  public int ffp;
  public String ijv;
  public String ijw;
  public String ijx;
  public String thumbUrl;

  static
  {
    AppMethodBeat.i(102118);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(102118);
  }

  public AppBrandWeishiParams()
  {
  }

  public AppBrandWeishiParams(Parcel paramParcel)
  {
    AppMethodBeat.i(102114);
    j(paramParcel);
    AppMethodBeat.o(102114);
  }

  private void j(Parcel paramParcel)
  {
    AppMethodBeat.i(102115);
    this.ffp = paramParcel.readInt();
    this.thumbUrl = paramParcel.readString();
    this.ijv = paramParcel.readString();
    this.ijw = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.appName = paramParcel.readString();
    this.ijx = paramParcel.readString();
    AppMethodBeat.o(102115);
  }

  public final void a(AppBrandWeishiParams paramAppBrandWeishiParams)
  {
    AppMethodBeat.i(102116);
    if (paramAppBrandWeishiParams == null)
      AppMethodBeat.o(102116);
    while (true)
    {
      return;
      Parcel localParcel = Parcel.obtain();
      localParcel.setDataPosition(0);
      paramAppBrandWeishiParams.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      j(localParcel);
      localParcel.recycle();
      AppMethodBeat.o(102116);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(102113);
    String str = "AppBrandWeishiParams{fromOpenSdk=" + this.ffp + ", thumbUrl='" + this.thumbUrl + '\'' + ", thumbFullPath='" + this.ijv + '\'' + ", msgImgPath='" + this.ijw + '\'' + ", appId='" + this.appId + '\'' + ", appName='" + this.appName + '\'' + ", sourceUserName='" + this.ijx + '\'' + '}';
    AppMethodBeat.o(102113);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102117);
    paramParcel.writeInt(this.ffp);
    paramParcel.writeString(this.thumbUrl);
    paramParcel.writeString(this.ijv);
    paramParcel.writeString(this.ijw);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.appName);
    paramParcel.writeString(this.ijx);
    AppMethodBeat.o(102117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.params.AppBrandWeishiParams
 * JD-Core Version:    0.6.2
 */
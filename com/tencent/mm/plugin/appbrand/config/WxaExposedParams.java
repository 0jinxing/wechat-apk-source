package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WxaExposedParams
  implements Parcelable
{
  public static final Parcelable.Creator<WxaExposedParams> CREATOR;
  public String appId;
  public int from;
  public int gVt;
  public int gVu;
  public String hiv;
  public String hiw;
  public String iconUrl;
  public String nickname;
  public String pageId;
  public String username;

  static
  {
    AppMethodBeat.i(114918);
    CREATOR = new WxaExposedParams.1();
    AppMethodBeat.o(114918);
  }

  protected WxaExposedParams(Parcel paramParcel)
  {
    AppMethodBeat.i(114915);
    this.appId = paramParcel.readString();
    this.username = paramParcel.readString();
    this.nickname = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.gVt = paramParcel.readInt();
    this.gVu = paramParcel.readInt();
    this.hiv = paramParcel.readString();
    this.from = paramParcel.readInt();
    this.pageId = paramParcel.readString();
    this.hiw = paramParcel.readString();
    AppMethodBeat.o(114915);
  }

  private WxaExposedParams(WxaExposedParams.a parama)
  {
    this.appId = parama.appId;
    this.username = parama.username;
    this.nickname = parama.nickname;
    this.iconUrl = parama.iconUrl;
    this.gVt = parama.gVt;
    this.gVu = parama.gVu;
    this.hiv = parama.hiv;
    this.from = parama.from;
    this.pageId = parama.pageId;
    this.hiw = parama.hiw;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(114917);
    String str = "WxaExposedParams{appId='" + this.appId + '\'' + ", username='" + this.username + '\'' + ", nickname='" + this.nickname + '\'' + ", iconUrl='" + this.iconUrl + '\'' + ", pkgDebugType=" + this.gVt + ", pkgVersion=" + this.gVu + ", pkgMD5='" + this.hiv + '\'' + ", from=" + this.from + ", pageId='" + this.pageId + '\'' + ", errorUrl='" + this.hiw + '\'' + '}';
    AppMethodBeat.o(114917);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114916);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.nickname);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeInt(this.gVt);
    paramParcel.writeInt(this.gVu);
    paramParcel.writeString(this.hiv);
    paramParcel.writeInt(this.from);
    paramParcel.writeString(this.pageId);
    paramParcel.writeString(this.hiw);
    AppMethodBeat.o(114916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.WxaExposedParams
 * JD-Core Version:    0.6.2
 */
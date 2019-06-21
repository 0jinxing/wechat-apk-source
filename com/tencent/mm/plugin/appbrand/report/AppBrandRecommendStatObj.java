package com.tencent.mm.plugin.appbrand.report;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandRecommendStatObj
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandRecommendStatObj> CREATOR;
  public float cEB;
  public float cGm;
  public String csB;
  public long hbj;
  public String iAa;
  public String iAb;
  public String iAc;
  public int iAd;
  public String iAe;
  public String izZ;
  public int position;
  public String username;

  static
  {
    AppMethodBeat.i(96183);
    CREATOR = new AppBrandRecommendStatObj.1();
    AppMethodBeat.o(96183);
  }

  public AppBrandRecommendStatObj()
  {
  }

  public AppBrandRecommendStatObj(Parcel paramParcel)
  {
    AppMethodBeat.i(96180);
    this.username = paramParcel.readString();
    this.izZ = paramParcel.readString();
    this.iAa = paramParcel.readString();
    this.csB = paramParcel.readString();
    this.iAb = paramParcel.readString();
    this.iAc = paramParcel.readString();
    this.iAd = paramParcel.readInt();
    this.iAe = paramParcel.readString();
    this.position = paramParcel.readInt();
    this.cGm = paramParcel.readFloat();
    this.cEB = paramParcel.readFloat();
    this.hbj = paramParcel.readLong();
    AppMethodBeat.o(96180);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(96181);
    String str = "AppBrandRecommendStatObj{username=" + this.username + ", recommend_id='" + this.izZ + '\'' + ", strategy_info=" + this.iAa + ", appid='" + this.csB + '\'' + ", page_path=" + this.iAb + ", page_param=" + this.iAc + ", card_type=" + this.iAd + ", pass_str=" + this.iAe + ", position=" + this.position + ", longitude=" + this.cGm + ", latitude=" + this.cEB + ", sessionId=" + this.hbj + '}';
    AppMethodBeat.o(96181);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(96182);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.izZ);
    paramParcel.writeString(this.iAa);
    paramParcel.writeString(this.csB);
    paramParcel.writeString(this.iAb);
    paramParcel.writeString(this.iAc);
    paramParcel.writeInt(this.iAd);
    paramParcel.writeString(this.iAe);
    paramParcel.writeInt(this.position);
    paramParcel.writeFloat(this.cGm);
    paramParcel.writeFloat(this.cEB);
    paramParcel.writeLong(this.hbj);
    AppMethodBeat.o(96182);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj
 * JD-Core Version:    0.6.2
 */
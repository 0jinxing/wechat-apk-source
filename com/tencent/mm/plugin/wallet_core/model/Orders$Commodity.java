package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class Orders$Commodity
  implements Parcelable
{
  public static final Parcelable.Creator<Commodity> CREATOR;
  public String cAa;
  public String desc;
  public double kCJ;
  public String pbP;
  public String pbX;
  public String pbY;
  public String pbZ;
  public String pca;
  public String pcc;
  public String pce;
  public String pcf;
  public int pch;
  public String pcj;
  public String pcl;
  public String pcm;
  public String pcq;
  public double tAR;
  public String tAS;
  public String tAT;
  public List<Orders.DiscountInfo> tAU;
  public String tAV;
  public String tAW;
  public String tAX;
  public Orders.RecommendTinyAppInfo tAY;
  public Orders.RemarksInfo tAZ;
  public int tAh;
  public List<Orders.Promotions> tBa;
  public boolean tBb;
  public Orders.a tBc;

  static
  {
    AppMethodBeat.i(46798);
    CREATOR = new Orders.Commodity.1();
    AppMethodBeat.o(46798);
  }

  public Orders$Commodity()
  {
    AppMethodBeat.i(46795);
    this.kCJ = 0.0D;
    this.tAR = 0.0D;
    this.tAU = new ArrayList();
    this.tAY = null;
    this.tBa = new ArrayList();
    this.tBb = false;
    this.tBc = new Orders.a();
    AppMethodBeat.o(46795);
  }

  public Orders$Commodity(Parcel paramParcel)
  {
    AppMethodBeat.i(46796);
    this.kCJ = 0.0D;
    this.tAR = 0.0D;
    this.tAU = new ArrayList();
    this.tAY = null;
    this.tBa = new ArrayList();
    this.tBb = false;
    this.tBc = new Orders.a();
    this.pbX = paramParcel.readString();
    this.pbY = paramParcel.readString();
    this.pbZ = paramParcel.readString();
    this.pca = paramParcel.readString();
    this.desc = paramParcel.readString();
    this.pcc = paramParcel.readString();
    this.kCJ = paramParcel.readDouble();
    this.pce = paramParcel.readString();
    this.pcf = paramParcel.readString();
    this.pch = paramParcel.readInt();
    this.cAa = paramParcel.readString();
    this.pcj = paramParcel.readString();
    this.pcl = paramParcel.readString();
    this.pcm = paramParcel.readString();
    this.pbP = paramParcel.readString();
    this.tAT = paramParcel.readString();
    this.pcq = paramParcel.readString();
    paramParcel.readTypedList(this.tAU, Orders.DiscountInfo.CREATOR);
    this.tAV = paramParcel.readString();
    this.tAX = paramParcel.readString();
    this.tAY = ((Orders.RecommendTinyAppInfo)paramParcel.readParcelable(Orders.RecommendTinyAppInfo.class.getClassLoader()));
    paramParcel.readTypedList(this.tBa, Orders.Promotions.CREATOR);
    this.tAZ = ((Orders.RemarksInfo)paramParcel.readParcelable(Orders.RemarksInfo.class.getClassLoader()));
    AppMethodBeat.o(46796);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46797);
    paramParcel.writeString(this.pbX);
    paramParcel.writeString(this.pbY);
    paramParcel.writeString(this.pbZ);
    paramParcel.writeString(this.pca);
    paramParcel.writeString(this.desc);
    paramParcel.writeString(this.pcc);
    paramParcel.writeDouble(this.kCJ);
    paramParcel.writeString(this.pce);
    paramParcel.writeString(this.pcf);
    paramParcel.writeInt(this.pch);
    paramParcel.writeString(this.cAa);
    paramParcel.writeString(this.pcj);
    paramParcel.writeString(this.pcl);
    paramParcel.writeString(this.pcm);
    paramParcel.writeString(this.pbP);
    paramParcel.writeString(this.tAT);
    paramParcel.writeString(this.pcq);
    paramParcel.writeTypedList(this.tAU);
    paramParcel.writeString(this.tAV);
    paramParcel.writeString(this.tAX);
    paramParcel.writeParcelable(this.tAY, 0);
    paramParcel.writeTypedList(this.tBa);
    paramParcel.writeParcelable(this.tAZ, 0);
    AppMethodBeat.o(46797);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.Commodity
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import d.a.a.c;

public class Orders$Promotions
  implements Parcelable
{
  public static final Parcelable.Creator<Promotions> CREATOR;
  public String name;
  public String pcm;
  public String pia;
  public int tBn;
  public int tBo;
  public int tBp;
  public String tBq;
  public String tBr;
  public String tBs;
  public int tBt;
  public String tBu;
  public String tBv;
  public c tBw;
  public String title;
  public long ttW;
  public int type;
  public int tzP;
  public int tzQ;
  public long tzR;
  public String tzS;
  public String url;

  static
  {
    AppMethodBeat.i(46815);
    CREATOR = new Orders.Promotions.1();
    AppMethodBeat.o(46815);
  }

  public Orders$Promotions()
  {
  }

  public Orders$Promotions(Parcel paramParcel)
  {
    AppMethodBeat.i(46813);
    this.type = paramParcel.readInt();
    this.pia = paramParcel.readString();
    this.name = paramParcel.readString();
    this.tzS = paramParcel.readString();
    this.url = paramParcel.readString();
    this.pcm = paramParcel.readString();
    this.title = paramParcel.readString();
    this.tBn = paramParcel.readInt();
    this.ttW = paramParcel.readLong();
    this.tBo = paramParcel.readInt();
    this.tBp = paramParcel.readInt();
    this.tzP = paramParcel.readInt();
    this.tzQ = paramParcel.readInt();
    this.tBq = paramParcel.readString();
    this.tBr = paramParcel.readString();
    this.tBs = paramParcel.readString();
    this.tzR = paramParcel.readLong();
    this.tBt = paramParcel.readInt();
    AppMethodBeat.o(46813);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46814);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.pia);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.tzS);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.pcm);
    paramParcel.writeString(this.title);
    paramParcel.writeInt(this.tBn);
    paramParcel.writeLong(this.ttW);
    paramParcel.writeInt(this.tBo);
    paramParcel.writeInt(this.tBp);
    paramParcel.writeInt(this.tzP);
    paramParcel.writeInt(this.tzQ);
    paramParcel.writeString(this.tBq);
    paramParcel.writeString(this.tBr);
    paramParcel.writeString(this.tBs);
    paramParcel.writeLong(this.tzR);
    paramParcel.writeInt(this.tBt);
    AppMethodBeat.o(46814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.Promotions
 * JD-Core Version:    0.6.2
 */
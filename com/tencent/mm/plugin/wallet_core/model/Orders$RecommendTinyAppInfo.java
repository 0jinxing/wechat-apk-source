package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Orders$RecommendTinyAppInfo
  implements Parcelable
{
  public static final Parcelable.Creator<RecommendTinyAppInfo> CREATOR;
  public int tBA;
  public int tBB;
  public long tBC;
  public long tBx;
  public long tBy;
  public long tBz;
  public String ttf;
  public String ttg;
  public String tzU;
  public String tzV;
  public String tzW;
  public String tzX;
  public int tzY;

  static
  {
    AppMethodBeat.i(46819);
    CREATOR = new Orders.RecommendTinyAppInfo.1();
    AppMethodBeat.o(46819);
  }

  public Orders$RecommendTinyAppInfo()
  {
  }

  public Orders$RecommendTinyAppInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46817);
    this.ttf = paramParcel.readString();
    this.tzU = paramParcel.readString();
    this.tzV = paramParcel.readString();
    this.tzW = paramParcel.readString();
    this.ttg = paramParcel.readString();
    this.tzY = paramParcel.readInt();
    AppMethodBeat.o(46817);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46818);
    paramParcel.writeString(this.ttf);
    paramParcel.writeString(this.tzU);
    paramParcel.writeString(this.tzV);
    paramParcel.writeString(this.tzW);
    paramParcel.writeString(this.ttg);
    paramParcel.writeInt(this.tzY);
    AppMethodBeat.o(46818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo
 * JD-Core Version:    0.6.2
 */
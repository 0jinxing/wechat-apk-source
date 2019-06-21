package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Orders$DiscountInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DiscountInfo> CREATOR;
  public String pOz;
  public double tBm;

  static
  {
    AppMethodBeat.i(46811);
    CREATOR = new Orders.DiscountInfo.1();
    AppMethodBeat.o(46811);
  }

  public Orders$DiscountInfo()
  {
  }

  public Orders$DiscountInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46809);
    this.tBm = paramParcel.readDouble();
    this.pOz = paramParcel.readString();
    AppMethodBeat.o(46809);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46810);
    paramParcel.writeDouble(this.tBm);
    paramParcel.writeString(this.pOz);
    AppMethodBeat.o(46810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo
 * JD-Core Version:    0.6.2
 */
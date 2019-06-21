package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Orders$SimpleCashierInfo
  implements Parcelable
{
  public static final Parcelable.Creator<SimpleCashierInfo> CREATOR;
  public String pbn;
  public String pbo;
  public int tBL;

  static
  {
    AppMethodBeat.i(46832);
    CREATOR = new Orders.SimpleCashierInfo.1();
    AppMethodBeat.o(46832);
  }

  public Orders$SimpleCashierInfo()
  {
  }

  protected Orders$SimpleCashierInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46830);
    this.tBL = paramParcel.readInt();
    this.pbn = paramParcel.readString();
    this.pbo = paramParcel.readString();
    AppMethodBeat.o(46830);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46831);
    paramParcel.writeInt(this.tBL);
    paramParcel.writeString(this.pbn);
    paramParcel.writeString(this.pbo);
    AppMethodBeat.o(46831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo
 * JD-Core Version:    0.6.2
 */
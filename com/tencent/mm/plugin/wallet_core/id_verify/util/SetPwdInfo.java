package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SetPwdInfo
  implements Parcelable
{
  public static final Parcelable.Creator<SetPwdInfo> CREATOR;
  public String nZa;
  public String nZb;
  public String nZc;
  public int twa;

  static
  {
    AppMethodBeat.i(46693);
    CREATOR = new SetPwdInfo.1();
    AppMethodBeat.o(46693);
  }

  public SetPwdInfo()
  {
    this.nZb = "";
    this.nZc = "";
  }

  protected SetPwdInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46691);
    this.nZb = "";
    this.nZc = "";
    this.twa = paramParcel.readInt();
    this.nZa = paramParcel.readString();
    this.nZb = paramParcel.readString();
    this.nZc = paramParcel.readString();
    AppMethodBeat.o(46691);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46692);
    paramParcel.writeInt(this.twa);
    paramParcel.writeString(this.nZa);
    paramParcel.writeString(this.nZb);
    paramParcel.writeString(this.nZc);
    AppMethodBeat.o(46692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo
 * JD-Core Version:    0.6.2
 */
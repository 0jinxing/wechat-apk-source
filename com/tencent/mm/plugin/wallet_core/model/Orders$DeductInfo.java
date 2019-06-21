package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class Orders$DeductInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DeductInfo> CREATOR;
  public String desc;
  public String kdE;
  public String tBd;
  public List<Orders.DeductShowInfo> tBe;
  public int tBf;
  public String tBg;
  public String tBh;
  public String title;
  public int tpY;
  public int tpl;
  public String tpm;

  static
  {
    AppMethodBeat.i(46803);
    CREATOR = new Orders.DeductInfo.1();
    AppMethodBeat.o(46803);
  }

  public Orders$DeductInfo()
  {
    AppMethodBeat.i(46800);
    this.tBe = new ArrayList();
    AppMethodBeat.o(46800);
  }

  public Orders$DeductInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46801);
    this.tBe = new ArrayList();
    this.title = paramParcel.readString();
    this.desc = paramParcel.readString();
    this.tpY = paramParcel.readInt();
    this.tBd = paramParcel.readString();
    this.tBf = paramParcel.readInt();
    paramParcel.readTypedList(this.tBe, Orders.DeductShowInfo.CREATOR);
    this.tpl = paramParcel.readInt();
    this.kdE = paramParcel.readString();
    this.tpm = paramParcel.readString();
    this.tBg = paramParcel.readString();
    this.tBh = paramParcel.readString();
    AppMethodBeat.o(46801);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46802);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.desc);
    paramParcel.writeInt(this.tpY);
    paramParcel.writeString(this.tBd);
    paramParcel.writeInt(this.tBf);
    paramParcel.writeTypedList(this.tBe);
    paramParcel.writeInt(this.tpl);
    paramParcel.writeString(this.kdE);
    paramParcel.writeString(this.tpm);
    paramParcel.writeString(this.tBg);
    paramParcel.writeString(this.tBh);
    AppMethodBeat.o(46802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo
 * JD-Core Version:    0.6.2
 */
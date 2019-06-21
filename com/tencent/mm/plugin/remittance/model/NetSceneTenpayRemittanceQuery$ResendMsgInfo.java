package com.tencent.mm.plugin.remittance.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NetSceneTenpayRemittanceQuery$ResendMsgInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ResendMsgInfo> CREATOR;
  public String description;
  public String nZb;
  public String nZc;
  public String pQx;
  public String title;

  static
  {
    AppMethodBeat.i(44783);
    CREATOR = new NetSceneTenpayRemittanceQuery.ResendMsgInfo.1();
    AppMethodBeat.o(44783);
  }

  public NetSceneTenpayRemittanceQuery$ResendMsgInfo()
  {
  }

  protected NetSceneTenpayRemittanceQuery$ResendMsgInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(44782);
    this.title = paramParcel.readString();
    this.pQx = paramParcel.readString();
    this.description = paramParcel.readString();
    this.nZb = paramParcel.readString();
    this.nZc = paramParcel.readString();
    AppMethodBeat.o(44782);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(44780);
    String str = "ResendMsgInfo{title='" + this.title + '\'' + ", pic='" + this.pQx + '\'' + ", description='" + this.description + '\'' + ", left_button_wording='" + this.nZb + '\'' + ", right_button_wording='" + this.nZc + '\'' + '}';
    AppMethodBeat.o(44780);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(44781);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.pQx);
    paramParcel.writeString(this.description);
    paramParcel.writeString(this.nZb);
    paramParcel.writeString(this.nZc);
    AppMethodBeat.o(44781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.ResendMsgInfo
 * JD-Core Version:    0.6.2
 */
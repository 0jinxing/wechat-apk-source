package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.yq;

public class EnterTimeParcel
  implements Parcelable
{
  public static final Parcelable.Creator<EnterTimeParcel> CREATOR;
  public String color;
  public int pLQ;
  public String pLR;
  public String pLS;
  public int pLT;

  static
  {
    AppMethodBeat.i(44499);
    CREATOR = new EnterTimeParcel.1();
    AppMethodBeat.o(44499);
  }

  public EnterTimeParcel()
  {
  }

  public EnterTimeParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(44497);
    this.pLQ = paramParcel.readInt();
    this.pLR = paramParcel.readString();
    this.pLS = paramParcel.readString();
    this.pLT = paramParcel.readInt();
    this.color = paramParcel.readString();
    AppMethodBeat.o(44497);
  }

  public EnterTimeParcel(yq paramyq)
  {
    this.pLQ = paramyq.pLQ;
    this.pLR = paramyq.pLR;
    this.pLS = paramyq.pLS;
    this.pLT = paramyq.pLT;
    this.color = paramyq.color;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(44498);
    paramParcel.writeInt(this.pLQ);
    paramParcel.writeString(this.pLR);
    paramParcel.writeString(this.pLS);
    paramParcel.writeInt(this.pLT);
    paramParcel.writeString(this.color);
    AppMethodBeat.o(44498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel
 * JD-Core Version:    0.6.2
 */
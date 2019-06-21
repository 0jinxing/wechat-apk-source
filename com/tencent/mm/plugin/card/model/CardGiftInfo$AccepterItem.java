package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CardGiftInfo$AccepterItem
  implements Parcelable
{
  public static final Parcelable.Creator<AccepterItem> CREATOR;
  public String kcU;
  public String kcV;
  public String kcW;
  public String kcX;

  static
  {
    AppMethodBeat.i(87783);
    CREATOR = new CardGiftInfo.AccepterItem.1();
    AppMethodBeat.o(87783);
  }

  public CardGiftInfo$AccepterItem()
  {
  }

  private CardGiftInfo$AccepterItem(Parcel paramParcel)
  {
    AppMethodBeat.i(87781);
    this.kcU = paramParcel.readString();
    this.kcV = paramParcel.readString();
    this.kcW = paramParcel.readString();
    this.kcX = paramParcel.readString();
    AppMethodBeat.o(87781);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(87782);
    paramParcel.writeString(this.kcU);
    paramParcel.writeString(this.kcV);
    paramParcel.writeString(this.kcW);
    paramParcel.writeString(this.kcX);
    AppMethodBeat.o(87782);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem
 * JD-Core Version:    0.6.2
 */
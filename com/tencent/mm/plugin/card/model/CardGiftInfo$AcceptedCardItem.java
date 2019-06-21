package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CardGiftInfo$AcceptedCardItem
  implements Parcelable
{
  public static final Parcelable.Creator<AcceptedCardItem> CREATOR;
  public String kcU;
  public String kcV;

  static
  {
    AppMethodBeat.i(87779);
    CREATOR = new CardGiftInfo.AcceptedCardItem.1();
    AppMethodBeat.o(87779);
  }

  public CardGiftInfo$AcceptedCardItem()
  {
  }

  private CardGiftInfo$AcceptedCardItem(Parcel paramParcel)
  {
    AppMethodBeat.i(87777);
    this.kcU = paramParcel.readString();
    this.kcV = paramParcel.readString();
    AppMethodBeat.o(87777);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(87778);
    paramParcel.writeString(this.kcU);
    paramParcel.writeString(this.kcV);
    AppMethodBeat.o(87778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem
 * JD-Core Version:    0.6.2
 */
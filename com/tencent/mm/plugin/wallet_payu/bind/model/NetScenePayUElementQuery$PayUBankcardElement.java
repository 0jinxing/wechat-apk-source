package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NetScenePayUElementQuery$PayUBankcardElement
  implements Parcelable
{
  public String cEW = "";
  public String cardType = "";
  public String pcj = "";
  public String tSG = "";
  public String tSH = "";

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(48334);
    paramParcel.writeString(this.tSG);
    paramParcel.writeString(this.pcj);
    paramParcel.writeString(this.tSH);
    paramParcel.writeString(this.cardType);
    paramParcel.writeString(this.cEW);
    AppMethodBeat.o(48334);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery.PayUBankcardElement
 * JD-Core Version:    0.6.2
 */
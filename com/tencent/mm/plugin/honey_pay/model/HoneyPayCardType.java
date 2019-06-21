package com.tencent.mm.plugin.honey_pay.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.asj;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public class HoneyPayCardType
  implements Parcelable
{
  public static final Parcelable.Creator<HoneyPayCardType> CREATOR;
  public byte[] wR;

  static
  {
    AppMethodBeat.i(41749);
    CREATOR = new HoneyPayCardType.1();
    AppMethodBeat.o(41749);
  }

  protected HoneyPayCardType(Parcel paramParcel)
  {
    AppMethodBeat.i(41747);
    this.wR = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(this.wR);
    AppMethodBeat.o(41747);
  }

  public HoneyPayCardType(asj paramasj)
  {
    AppMethodBeat.i(41746);
    try
    {
      this.wR = paramasj.toByteArray();
      AppMethodBeat.o(41746);
      return;
    }
    catch (IOException paramasj)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.HoneyPayCardType", paramasj, "", new Object[0]);
        AppMethodBeat.o(41746);
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(41748);
    paramParcel.writeInt(this.wR.length);
    paramParcel.writeByteArray(this.wR);
    AppMethodBeat.o(41748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType
 * JD-Core Version:    0.6.2
 */
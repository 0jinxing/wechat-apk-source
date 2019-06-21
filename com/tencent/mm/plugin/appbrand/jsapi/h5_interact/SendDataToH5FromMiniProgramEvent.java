package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.b;

public class SendDataToH5FromMiniProgramEvent extends b
  implements Parcelable
{
  public static final Parcelable.Creator<SendDataToH5FromMiniProgramEvent> CREATOR;
  public String data;
  public String hJU;
  public int hJV;

  static
  {
    AppMethodBeat.i(93754);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(93754);
  }

  public SendDataToH5FromMiniProgramEvent()
  {
  }

  protected SendDataToH5FromMiniProgramEvent(Parcel paramParcel)
  {
    AppMethodBeat.i(93753);
    this.hJU = paramParcel.readString();
    this.data = paramParcel.readString();
    this.hJV = paramParcel.readInt();
    AppMethodBeat.o(93753);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(93752);
    paramParcel.writeString(this.hJU);
    paramParcel.writeString(this.data);
    paramParcel.writeInt(this.hJV);
    AppMethodBeat.o(93752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent
 * JD-Core Version:    0.6.2
 */
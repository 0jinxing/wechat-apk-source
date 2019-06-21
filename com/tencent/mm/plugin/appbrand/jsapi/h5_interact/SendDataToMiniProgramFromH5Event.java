package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SendDataToMiniProgramFromH5Event
  implements Parcelable
{
  public static final Parcelable.Creator<SendDataToMiniProgramFromH5Event> CREATOR;
  public String data;
  public String hJW;
  public int hJX;

  static
  {
    AppMethodBeat.i(131093);
    CREATOR = new SendDataToMiniProgramFromH5Event.1();
    AppMethodBeat.o(131093);
  }

  public SendDataToMiniProgramFromH5Event()
  {
  }

  protected SendDataToMiniProgramFromH5Event(Parcel paramParcel)
  {
    AppMethodBeat.i(131092);
    this.hJW = paramParcel.readString();
    this.data = paramParcel.readString();
    this.hJX = paramParcel.readInt();
    AppMethodBeat.o(131092);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131091);
    paramParcel.writeString(this.hJW);
    paramParcel.writeString(this.data);
    paramParcel.writeInt(this.hJX);
    AppMethodBeat.o(131091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event
 * JD-Core Version:    0.6.2
 */
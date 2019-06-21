package com.tencent.mm.plugin.music.cache.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCAudioParamRequest
  implements Parcelable
{
  public static final Parcelable.Creator<IPCAudioParamRequest> CREATOR;
  public String cFI;
  public byte[] fKv;
  public String mimeType;
  public int oLm;

  static
  {
    AppMethodBeat.i(137460);
    CREATOR = new IPCAudioParamRequest.1();
    AppMethodBeat.o(137460);
  }

  public IPCAudioParamRequest()
  {
    this.cFI = "";
    this.oLm = 0;
    this.mimeType = "";
  }

  public IPCAudioParamRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(137458);
    this.cFI = "";
    this.oLm = 0;
    this.mimeType = "";
    this.cFI = paramParcel.readString();
    this.oLm = paramParcel.readInt();
    this.mimeType = paramParcel.readString();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.fKv = new byte[i];
      paramParcel.readByteArray(this.fKv);
    }
    AppMethodBeat.o(137458);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137459);
    paramParcel.writeString(this.cFI);
    paramParcel.writeInt(this.oLm);
    paramParcel.writeString(this.mimeType);
    if (this.fKv != null)
    {
      paramParcel.writeInt(this.fKv.length);
      paramParcel.writeByteArray(this.fKv);
      AppMethodBeat.o(137459);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      AppMethodBeat.o(137459);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest
 * JD-Core Version:    0.6.2
 */
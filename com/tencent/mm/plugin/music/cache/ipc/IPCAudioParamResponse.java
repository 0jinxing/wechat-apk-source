package com.tencent.mm.plugin.music.cache.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.h;

public class IPCAudioParamResponse
  implements Parcelable
{
  public static final Parcelable.Creator<IPCAudioParamResponse> CREATOR;
  public String cFI;
  public byte[] fKv;
  public int fKw;
  public String fKx;
  public int fKy;
  public String fileName;
  public String musicUrl;

  static
  {
    AppMethodBeat.i(137464);
    CREATOR = new IPCAudioParamResponse.1();
    AppMethodBeat.o(137464);
  }

  public IPCAudioParamResponse()
  {
  }

  public IPCAudioParamResponse(Parcel paramParcel)
  {
    AppMethodBeat.i(137462);
    this.cFI = paramParcel.readString();
    this.musicUrl = paramParcel.readString();
    this.fileName = paramParcel.readString();
    this.fKx = paramParcel.readString();
    this.fKw = paramParcel.readInt();
    this.fKy = paramParcel.readInt();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.fKv = new byte[i];
      paramParcel.readByteArray(this.fKv);
    }
    AppMethodBeat.o(137462);
  }

  public IPCAudioParamResponse(h paramh)
  {
    this.cFI = paramh.cFI;
    this.musicUrl = paramh.musicUrl;
    this.fileName = paramh.fileName;
    this.fKw = paramh.fKw;
    this.fKx = paramh.fKx;
    this.fKv = paramh.fKv;
    this.fKy = paramh.fKy;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137463);
    paramParcel.writeString(this.cFI);
    paramParcel.writeString(this.musicUrl);
    paramParcel.writeString(this.fileName);
    paramParcel.writeString(this.fKx);
    paramParcel.writeInt(this.fKw);
    paramParcel.writeInt(this.fKy);
    if (this.fKv != null)
    {
      paramParcel.writeInt(this.fKv.length);
      paramParcel.writeByteArray(this.fKv);
      AppMethodBeat.o(137463);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      AppMethodBeat.o(137463);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse
 * JD-Core Version:    0.6.2
 */
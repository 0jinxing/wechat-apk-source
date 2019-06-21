package com.tencent.mm.ipcinvoker.wx_extension.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ipcinvoker.extension.c;
import com.tencent.mm.ipcinvoker.wx_extension.a;

public class IPCRunCgiRespWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<IPCRunCgiRespWrapper> CREATOR;
  public String aIm;
  public b ehh;
  public int errCode;
  public int errType;

  static
  {
    AppMethodBeat.i(126225);
    CREATOR = new IPCRunCgiRespWrapper.1();
    AppMethodBeat.o(126225);
  }

  public IPCRunCgiRespWrapper()
  {
  }

  IPCRunCgiRespWrapper(Parcel paramParcel)
  {
    AppMethodBeat.i(126223);
    this.errType = paramParcel.readInt();
    this.errCode = paramParcel.readInt();
    this.aIm = paramParcel.readString();
    this.ehh = ((b)c.a(a.class.getName(), paramParcel));
    AppMethodBeat.o(126223);
  }

  public static IPCRunCgiRespWrapper Qa()
  {
    AppMethodBeat.i(126224);
    IPCRunCgiRespWrapper localIPCRunCgiRespWrapper = new IPCRunCgiRespWrapper();
    localIPCRunCgiRespWrapper.ehh = null;
    localIPCRunCgiRespWrapper.aIm = null;
    localIPCRunCgiRespWrapper.errType = 3;
    localIPCRunCgiRespWrapper.errCode = -2;
    AppMethodBeat.o(126224);
    return localIPCRunCgiRespWrapper;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(126222);
    paramParcel.writeInt(this.errType);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.aIm);
    c.a(this.ehh, paramParcel);
    AppMethodBeat.o(126222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper
 * JD-Core Version:    0.6.2
 */
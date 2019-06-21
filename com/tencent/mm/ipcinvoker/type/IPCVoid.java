package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCVoid
  implements Parcelable
{
  public static final Parcelable.Creator<IPCVoid> CREATOR;
  public static final IPCVoid eGH;

  static
  {
    AppMethodBeat.i(114165);
    eGH = new IPCVoid();
    CREATOR = new IPCVoid.1();
    AppMethodBeat.o(114165);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.type.IPCVoid
 * JD-Core Version:    0.6.2
 */
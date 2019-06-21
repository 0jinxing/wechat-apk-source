package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCByte
  implements Parcelable
{
  public static final Parcelable.Creator<IPCByte> CREATOR;
  public byte value;

  static
  {
    AppMethodBeat.i(114139);
    CREATOR = new IPCByte.1();
    AppMethodBeat.o(114139);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(114138);
    if (paramObject == this)
      AppMethodBeat.o(114138);
    while (true)
    {
      return bool;
      if ((paramObject instanceof IPCByte))
      {
        paramObject = (IPCByte)paramObject;
        if (this.value == paramObject.value)
        {
          AppMethodBeat.o(114138);
        }
        else
        {
          AppMethodBeat.o(114138);
          bool = false;
        }
      }
      else if ((paramObject instanceof Byte))
      {
        bool = paramObject.equals(Byte.valueOf(this.value));
        AppMethodBeat.o(114138);
      }
      else
      {
        AppMethodBeat.o(114138);
        bool = false;
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(114137);
    String str = Integer.toString(this.value);
    AppMethodBeat.o(114137);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114136);
    paramParcel.writeByte(this.value);
    AppMethodBeat.o(114136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.type.IPCByte
 * JD-Core Version:    0.6.2
 */
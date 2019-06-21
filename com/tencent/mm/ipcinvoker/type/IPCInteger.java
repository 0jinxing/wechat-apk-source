package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCInteger
  implements Parcelable
{
  public static final Parcelable.Creator<IPCInteger> CREATOR;
  public int value;

  static
  {
    AppMethodBeat.i(114154);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(114154);
  }

  public IPCInteger()
  {
  }

  public IPCInteger(int paramInt)
  {
    this.value = paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(114153);
    if (paramObject == this)
      AppMethodBeat.o(114153);
    while (true)
    {
      return bool;
      if ((paramObject instanceof IPCInteger))
      {
        paramObject = (IPCInteger)paramObject;
        if (this.value == paramObject.value)
        {
          AppMethodBeat.o(114153);
        }
        else
        {
          AppMethodBeat.o(114153);
          bool = false;
        }
      }
      else if ((paramObject instanceof Integer))
      {
        bool = paramObject.equals(Integer.valueOf(this.value));
        AppMethodBeat.o(114153);
      }
      else
      {
        AppMethodBeat.o(114153);
        bool = false;
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(114152);
    String str = Integer.toString(this.value);
    AppMethodBeat.o(114152);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114151);
    paramParcel.writeInt(this.value);
    AppMethodBeat.o(114151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.type.IPCInteger
 * JD-Core Version:    0.6.2
 */
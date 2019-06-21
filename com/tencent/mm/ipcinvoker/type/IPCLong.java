package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCLong
  implements Parcelable
{
  public static final Parcelable.Creator<IPCLong> CREATOR;
  public long value;

  static
  {
    AppMethodBeat.i(114159);
    CREATOR = new IPCLong.1();
    AppMethodBeat.o(114159);
  }

  public IPCLong()
  {
  }

  public IPCLong(long paramLong)
  {
    this.value = paramLong;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(114158);
    if (paramObject == this)
      AppMethodBeat.o(114158);
    while (true)
    {
      return bool;
      if ((paramObject instanceof IPCLong))
      {
        paramObject = (IPCLong)paramObject;
        if (this.value == paramObject.value)
        {
          AppMethodBeat.o(114158);
        }
        else
        {
          AppMethodBeat.o(114158);
          bool = false;
        }
      }
      else if ((paramObject instanceof Long))
      {
        bool = paramObject.equals(Long.valueOf(this.value));
        AppMethodBeat.o(114158);
      }
      else
      {
        AppMethodBeat.o(114158);
        bool = false;
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(114157);
    String str = Long.toString(this.value);
    AppMethodBeat.o(114157);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114156);
    paramParcel.writeLong(this.value);
    AppMethodBeat.o(114156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.type.IPCLong
 * JD-Core Version:    0.6.2
 */
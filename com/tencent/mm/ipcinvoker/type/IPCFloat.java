package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCFloat
  implements Parcelable
{
  public static final Parcelable.Creator<IPCFloat> CREATOR;
  public float value;

  static
  {
    AppMethodBeat.i(114149);
    CREATOR = new IPCFloat.1();
    AppMethodBeat.o(114149);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(114148);
    if (paramObject == this)
      AppMethodBeat.o(114148);
    while (true)
    {
      return bool;
      if ((paramObject instanceof IPCFloat))
      {
        paramObject = (IPCFloat)paramObject;
        if (this.value == paramObject.value)
        {
          AppMethodBeat.o(114148);
        }
        else
        {
          AppMethodBeat.o(114148);
          bool = false;
        }
      }
      else if ((paramObject instanceof Float))
      {
        bool = paramObject.equals(Float.valueOf(this.value));
        AppMethodBeat.o(114148);
      }
      else
      {
        AppMethodBeat.o(114148);
        bool = false;
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(114147);
    String str = Float.toString(this.value);
    AppMethodBeat.o(114147);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114146);
    paramParcel.writeFloat(this.value);
    AppMethodBeat.o(114146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.type.IPCFloat
 * JD-Core Version:    0.6.2
 */
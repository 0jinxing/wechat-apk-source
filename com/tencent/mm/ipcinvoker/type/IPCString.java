package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCString
  implements Parcelable
{
  public static final Parcelable.Creator<IPCString> CREATOR;
  public String value;

  static
  {
    AppMethodBeat.i(114163);
    CREATOR = new IPCString.1();
    AppMethodBeat.o(114163);
  }

  public IPCString()
  {
  }

  public IPCString(String paramString)
  {
    this.value = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(114162);
    if (paramObject == this)
      AppMethodBeat.o(114162);
    while (true)
    {
      return bool;
      if ((paramObject instanceof IPCString))
      {
        paramObject = (IPCString)paramObject;
        if ((this.value == paramObject.value) || ((this.value != null) && (this.value.equals(paramObject.value))))
        {
          AppMethodBeat.o(114162);
        }
        else
        {
          AppMethodBeat.o(114162);
          bool = false;
        }
      }
      else if ((paramObject instanceof String))
      {
        bool = paramObject.equals(this.value);
        AppMethodBeat.o(114162);
      }
      else
      {
        AppMethodBeat.o(114162);
        bool = false;
      }
    }
  }

  public String toString()
  {
    return this.value;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114161);
    paramParcel.writeString(this.value);
    AppMethodBeat.o(114161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.type.IPCString
 * JD-Core Version:    0.6.2
 */
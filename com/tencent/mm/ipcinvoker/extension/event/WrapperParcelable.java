package com.tencent.mm.ipcinvoker.extension.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.a;
import com.tencent.mm.ipcinvoker.extension.c;

class WrapperParcelable
  implements Parcelable
{
  public static final Parcelable.Creator<WrapperParcelable> CREATOR;
  Object eGy;

  static
  {
    AppMethodBeat.i(114108);
    CREATOR = new WrapperParcelable.1();
    AppMethodBeat.o(114108);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114107);
    if (this.eGy != null)
    {
      a locala = c.ar(this.eGy);
      if (locala != null)
      {
        paramParcel.writeInt(1);
        paramParcel.writeString(locala.getClass().getName());
        locala.a(this.eGy, paramParcel);
        AppMethodBeat.o(114107);
      }
    }
    while (true)
    {
      return;
      paramParcel.writeInt(1);
      AppMethodBeat.o(114107);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable
 * JD-Core Version:    0.6.2
 */
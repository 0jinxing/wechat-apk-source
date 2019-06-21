package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class XParcelableWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<XParcelableWrapper> CREATOR;
  public f eGC;

  static
  {
    AppMethodBeat.i(114105);
    CREATOR = new XParcelableWrapper.1();
    AppMethodBeat.o(114105);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114104);
    if (this.eGC != null)
    {
      paramParcel.writeInt(1);
      paramParcel.writeString(this.eGC.getClass().getName());
      this.eGC.e(paramParcel);
      AppMethodBeat.o(114104);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      AppMethodBeat.o(114104);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.XParcelableWrapper
 * JD-Core Version:    0.6.2
 */
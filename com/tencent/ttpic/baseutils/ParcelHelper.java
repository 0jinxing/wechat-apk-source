package com.tencent.ttpic.baseutils;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ParcelHelper
{
  public static <T> T copy(Parcelable paramParcelable)
  {
    AppMethodBeat.i(49791);
    Object localObject = null;
    try
    {
      Parcel localParcel = Parcel.obtain();
      localObject = localParcel;
      localParcel.writeParcelable(paramParcelable, 0);
      localObject = localParcel;
      localParcel.setDataPosition(0);
      localObject = localParcel;
      paramParcelable = localParcel.readParcelable(paramParcelable.getClass().getClassLoader());
      return paramParcelable;
    }
    finally
    {
      localObject.recycle();
      AppMethodBeat.o(49791);
    }
    throw paramParcelable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.ParcelHelper
 * JD-Core Version:    0.6.2
 */
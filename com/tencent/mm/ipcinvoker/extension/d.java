package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    AppMethodBeat.i(114086);
    paramParcel.writeParcelable((Parcelable)paramObject, 0);
    AppMethodBeat.o(114086);
  }

  public final boolean aq(Object paramObject)
  {
    return paramObject instanceof Parcelable;
  }

  public final Object d(Parcel paramParcel)
  {
    AppMethodBeat.i(114087);
    paramParcel = paramParcel.readParcelable(getClass().getClassLoader());
    AppMethodBeat.o(114087);
    return paramParcel;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.k;

public final class g
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    AppMethodBeat.i(114101);
    paramObject = (f)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    paramObject.e(paramParcel);
    AppMethodBeat.o(114101);
  }

  public final boolean aq(Object paramObject)
  {
    return paramObject instanceof f;
  }

  public final Object d(Parcel paramParcel)
  {
    AppMethodBeat.i(114102);
    f localf = (f)k.c(paramParcel.readString(), f.class);
    if (localf != null)
    {
      localf.readFromParcel(paramParcel);
      AppMethodBeat.o(114102);
      paramParcel = localf;
    }
    while (true)
    {
      return paramParcel;
      paramParcel = null;
      AppMethodBeat.o(114102);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.g
 * JD-Core Version:    0.6.2
 */
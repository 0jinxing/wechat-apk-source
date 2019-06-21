package com.tencent.mm.ipcinvoker.extension;

import android.os.Bundle;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.k;

public final class b
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    AppMethodBeat.i(114079);
    paramObject = (com.tencent.mm.ipcinvoker.d.a)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    paramParcel.writeBundle(paramObject.toBundle());
    AppMethodBeat.o(114079);
  }

  public final boolean aq(Object paramObject)
  {
    return paramObject instanceof com.tencent.mm.ipcinvoker.d.a;
  }

  public final Object d(Parcel paramParcel)
  {
    AppMethodBeat.i(114080);
    String str = paramParcel.readString();
    Bundle localBundle = paramParcel.readBundle();
    paramParcel = (com.tencent.mm.ipcinvoker.d.a)k.c(str, com.tencent.mm.ipcinvoker.d.a.class);
    if (paramParcel != null)
    {
      paramParcel.fromBundle(localBundle);
      AppMethodBeat.o(114080);
    }
    while (true)
    {
      return paramParcel;
      paramParcel = null;
      AppMethodBeat.o(114080);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.b
 * JD-Core Version:    0.6.2
 */
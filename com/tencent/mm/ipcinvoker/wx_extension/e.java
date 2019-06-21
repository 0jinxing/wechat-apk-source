package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.a;

public final class e
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    AppMethodBeat.i(126201);
    paramObject = (Parcel)paramObject;
    paramObject.setDataPosition(0);
    paramParcel.writeInt(paramObject.dataSize());
    paramParcel.appendFrom(paramObject, 0, paramObject.dataSize());
    AppMethodBeat.o(126201);
  }

  public final boolean aq(Object paramObject)
  {
    return paramObject instanceof Parcel;
  }

  public final Object d(Parcel paramParcel)
  {
    AppMethodBeat.i(126202);
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    int i = paramParcel.readInt();
    localParcel.appendFrom(paramParcel, paramParcel.dataPosition(), i);
    localParcel.setDataPosition(0);
    AppMethodBeat.o(126202);
    return localParcel;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.e
 * JD-Core Version:    0.6.2
 */
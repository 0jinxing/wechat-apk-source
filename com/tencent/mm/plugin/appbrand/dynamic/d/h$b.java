package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.f;

public final class h$b
  implements f
{
  String cOS;
  boolean hmZ;
  boolean hna;
  String id;

  public final void e(Parcel paramParcel)
  {
    int i = 1;
    AppMethodBeat.i(10842);
    paramParcel.writeString(this.id);
    if (this.hmZ)
    {
      j = 1;
      paramParcel.writeInt(j);
      paramParcel.writeString(this.cOS);
      if (!this.hna)
        break label64;
    }
    label64: for (int j = i; ; j = 0)
    {
      paramParcel.writeInt(j);
      AppMethodBeat.o(10842);
      return;
      j = 0;
      break;
    }
  }

  public final void readFromParcel(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(10843);
    this.id = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.hmZ = bool2;
      this.cOS = paramParcel.readString();
      if (paramParcel.readInt() != 1)
        break label66;
    }
    label66: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hna = bool2;
      AppMethodBeat.o(10843);
      return;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.h.b
 * JD-Core Version:    0.6.2
 */
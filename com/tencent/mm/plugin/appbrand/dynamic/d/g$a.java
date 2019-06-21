package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.f;

final class g$a
  implements f
{
  String cMQ;
  String id;

  public final void e(Parcel paramParcel)
  {
    AppMethodBeat.i(10834);
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.cMQ);
    AppMethodBeat.o(10834);
  }

  public final void readFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(10835);
    this.id = paramParcel.readString();
    this.cMQ = paramParcel.readString();
    AppMethodBeat.o(10835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.g.a
 * JD-Core Version:    0.6.2
 */
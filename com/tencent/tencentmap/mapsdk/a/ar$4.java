package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fv;

class ar$4
  implements fv
{
  boolean a;
  Handler b;

  ar$4(ar paramar)
  {
    AppMethodBeat.i(100594);
    this.a = false;
    this.b = new Handler(Looper.getMainLooper());
    AppMethodBeat.o(100594);
  }

  public void a()
  {
    AppMethodBeat.i(100595);
    if (!this.a)
      this.a = true;
    this.b.post(new ar.4.1(this));
    AppMethodBeat.o(100595);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar.4
 * JD-Core Version:    0.6.2
 */
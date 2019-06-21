package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ir
  implements gt
{
  private iz a;

  public ir(iz paramiz)
  {
    this.a = paramiz;
  }

  public void a(gs paramgs)
  {
    AppMethodBeat.i(99870);
    if (this.a == null)
      AppMethodBeat.o(99870);
    while (true)
    {
      return;
      if (paramgs != null)
        this.a.a(this.a.b().j());
      if (this.a.v != null)
        this.a.v.sendEmptyMessage(0);
      AppMethodBeat.o(99870);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ir
 * JD-Core Version:    0.6.2
 */
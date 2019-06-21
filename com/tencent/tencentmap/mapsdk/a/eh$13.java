package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter;

class eh$13
  implements aj.b
{
  eh$13(eh parameh, TencentMap.InfoWindowAdapter paramInfoWindowAdapter)
  {
  }

  public View a(de paramde)
  {
    AppMethodBeat.i(101482);
    if (this.a != null)
    {
      paramde = this.a.getInfoWindow(eh.a(this.b, paramde));
      AppMethodBeat.o(101482);
    }
    while (true)
    {
      return paramde;
      paramde = null;
      AppMethodBeat.o(101482);
    }
  }

  public View b(de paramde)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.13
 * JD-Core Version:    0.6.2
 */
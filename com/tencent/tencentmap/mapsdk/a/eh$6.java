package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener;

class eh$6
  implements aj.f
{
  eh$6(eh parameh, TencentMap.OnIndoorStateChangeListener paramOnIndoorStateChangeListener)
  {
  }

  public boolean onIndoorBuildingDeactivated()
  {
    AppMethodBeat.i(101465);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101465);
    }
    while (true)
    {
      return bool;
      bool = this.a.onIndoorBuildingDeactivated();
      AppMethodBeat.o(101465);
    }
  }

  public boolean onIndoorBuildingFocused()
  {
    AppMethodBeat.i(101463);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101463);
    }
    while (true)
    {
      return bool;
      bool = this.a.onIndoorBuildingFocused();
      AppMethodBeat.o(101463);
    }
  }

  public boolean onIndoorLevelActivated(cw paramcw)
  {
    AppMethodBeat.i(101464);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101464);
    }
    while (true)
    {
      return bool;
      bool = this.a.onIndoorLevelActivated(ej.a(paramcw));
      AppMethodBeat.o(101464);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.6
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aj.f;
import com.tencent.tencentmap.mapsdk.a.cw;

public class iu
  implements aj.f
{
  private iz a;

  public iu(iz paramiz)
  {
    this.a = paramiz;
  }

  public boolean onIndoorBuildingDeactivated()
  {
    boolean bool = false;
    AppMethodBeat.i(99875);
    if (this.a == null)
      AppMethodBeat.o(99875);
    while (true)
    {
      return bool;
      this.a.onIndoorBuildingDeactivated();
      if (this.a.r != null)
        this.a.r.onIndoorBuildingDeactivated();
      lf locallf = this.a.j;
      if (locallf != null)
        locallf.b(false);
      bool = true;
      AppMethodBeat.o(99875);
    }
  }

  public boolean onIndoorBuildingFocused()
  {
    boolean bool = true;
    AppMethodBeat.i(99873);
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(99873);
    }
    while (true)
    {
      return bool;
      this.a.onIndoorBuildingFocused();
      if (this.a.r != null)
        this.a.r.onIndoorBuildingFocused();
      lf locallf = this.a.j;
      if (locallf != null)
        locallf.b(true);
      AppMethodBeat.o(99873);
    }
  }

  public boolean onIndoorLevelActivated(cw paramcw)
  {
    AppMethodBeat.i(99874);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(99874);
    }
    while (true)
    {
      return bool;
      this.a.onIndoorLevelActivated(paramcw);
      if (this.a.r != null)
        this.a.r.onIndoorLevelActivated(paramcw);
      lf locallf = this.a.j;
      if ((locallf != null) && (locallf.b()) && (this.a.b().h() >= 16))
        locallf.a(paramcw);
      bool = true;
      AppMethodBeat.o(99874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.iu
 * JD-Core Version:    0.6.2
 */
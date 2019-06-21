package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.gg;

public class bk
{
  private cg a = null;

  public bk(cg paramcg)
  {
    this.a = paramcg;
  }

  public void a()
  {
    if (this.a != null)
      this.a = null;
  }

  public gg b()
  {
    AppMethodBeat.i(100838);
    gg localgg;
    if (this.a == null)
    {
      localgg = null;
      AppMethodBeat.o(100838);
    }
    while (true)
    {
      return localgg;
      localgg = this.a.f();
      AppMethodBeat.o(100838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bk
 * JD-Core Version:    0.6.2
 */
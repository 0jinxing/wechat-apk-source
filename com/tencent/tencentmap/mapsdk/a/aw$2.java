package com.tencent.tencentmap.mapsdk.a;

import android.view.MotionEvent;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fw;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.iz;

class aw$2
  implements aw.a
{
  private de b = null;
  private boolean c = false;

  aw$2(aw paramaw)
  {
  }

  public void a()
  {
    this.c = false;
    this.b = null;
  }

  public void a(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(100691);
    if ((aw.b(this.a) == null) || (aw.b(this.a).b() == null) || (!this.c) || (this.b == null))
    {
      AppMethodBeat.o(100691);
      return;
    }
    aj.m localm = this.b.s();
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(100691);
      break;
      AppMethodBeat.o(100691);
      break;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      paramMotionEvent = new DoublePoint(i, j);
      paramMotionEvent = ic.a(aw.b(this.a).b().t().a(paramMotionEvent));
      this.b.a(paramMotionEvent);
      if (localm != null)
        localm.b(this.b);
      if (aw.c(this.a) != null)
      {
        aw.c(this.a).b(this.b);
        AppMethodBeat.o(100691);
        break;
        this.c = false;
        if (localm != null)
          localm.c(this.b);
        if (aw.c(this.a) != null)
          aw.c(this.a).c(this.b);
        this.b = null;
      }
    }
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(100692);
    if (paramString.trim().length() == 0)
    {
      this.b = null;
      this.c = false;
      AppMethodBeat.o(100692);
    }
    while (true)
    {
      return;
      this.b = aw.a(this.a, paramString);
      if (this.b != null)
      {
        if (!this.b.i())
        {
          this.b = null;
          this.c = false;
          AppMethodBeat.o(100692);
        }
        else
        {
          this.c = true;
          if (aw.c(this.a) != null)
            aw.c(this.a).a(this.b);
        }
      }
      else
        AppMethodBeat.o(100692);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aw.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener;

class eh$7
  implements dn
{
  eh$7(eh parameh, TencentMap.TencentMapGestureListener paramTencentMapGestureListener)
  {
  }

  public void a()
  {
    AppMethodBeat.i(101473);
    if (this.a == null)
      AppMethodBeat.o(101473);
    while (true)
    {
      return;
      this.a.onMapStable();
      AppMethodBeat.o(101473);
    }
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101466);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101466);
    }
    while (true)
    {
      return bool;
      bool = this.a.onDoubleTap(paramFloat1, paramFloat2);
      AppMethodBeat.o(101466);
    }
  }

  public boolean b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101467);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101467);
    }
    while (true)
    {
      return bool;
      bool = this.a.onSingleTap(paramFloat1, paramFloat2);
      AppMethodBeat.o(101467);
    }
  }

  public boolean c(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101468);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101468);
    }
    while (true)
    {
      return bool;
      bool = this.a.onFling(paramFloat1, paramFloat2);
      AppMethodBeat.o(101468);
    }
  }

  public boolean d(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101469);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101469);
    }
    while (true)
    {
      return bool;
      bool = this.a.onScroll(paramFloat1, paramFloat2);
      AppMethodBeat.o(101469);
    }
  }

  public boolean e(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101470);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101470);
    }
    while (true)
    {
      return bool;
      bool = this.a.onLongPress(paramFloat1, paramFloat2);
      AppMethodBeat.o(101470);
    }
  }

  public boolean f(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101471);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101471);
    }
    while (true)
    {
      return bool;
      bool = this.a.onDown(paramFloat1, paramFloat2);
      AppMethodBeat.o(101471);
    }
  }

  public boolean g(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101472);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101472);
    }
    while (true)
    {
      return bool;
      bool = this.a.onUp(paramFloat1, paramFloat2);
      AppMethodBeat.o(101472);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eh.7
 * JD-Core Version:    0.6.2
 */
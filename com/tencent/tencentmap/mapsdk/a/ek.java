package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.UiSettings;

public class ek
  implements UiSettings
{
  private am a;

  public ek(am paramam)
  {
    this.a = paramam;
  }

  public boolean isAnimationEnabled()
  {
    return false;
  }

  public boolean isCompassEnabled()
  {
    AppMethodBeat.i(101601);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101601);
    }
    while (true)
    {
      return bool;
      bool = this.a.a();
      AppMethodBeat.o(101601);
    }
  }

  public boolean isIndoorLevelPickerEnabled()
  {
    AppMethodBeat.i(101599);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101599);
    }
    while (true)
    {
      return bool;
      bool = this.a.d();
      AppMethodBeat.o(101599);
    }
  }

  public boolean isRotateGesturesEnabled()
  {
    AppMethodBeat.i(101596);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101596);
    }
    while (true)
    {
      return bool;
      bool = this.a.c();
      AppMethodBeat.o(101596);
    }
  }

  public boolean isScaleControlsEnabled()
  {
    AppMethodBeat.i(101591);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.e();
      AppMethodBeat.o(101591);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101591);
    }
  }

  public boolean isTiltGesturesEnabled()
  {
    AppMethodBeat.i(101594);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101594);
    }
    while (true)
    {
      return bool;
      bool = this.a.b();
      AppMethodBeat.o(101594);
    }
  }

  public void setAllGesturesEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101588);
    if (this.a != null)
      this.a.g(paramBoolean);
    AppMethodBeat.o(101588);
  }

  public void setAnimationEnabled(boolean paramBoolean)
  {
  }

  public void setCompassEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101600);
    if (this.a == null)
      AppMethodBeat.o(101600);
    while (true)
    {
      return;
      this.a.b(paramBoolean);
      AppMethodBeat.o(101600);
    }
  }

  public void setIndoorLevelPickerEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101598);
    if (this.a != null)
      this.a.j(paramBoolean);
    AppMethodBeat.o(101598);
  }

  public void setLogoPosition(int paramInt)
  {
    AppMethodBeat.i(101589);
    if (this.a != null)
      this.a.b(paramInt);
    AppMethodBeat.o(101589);
  }

  public void setLogoPosition(int paramInt, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(101597);
    if (this.a != null)
      this.a.a(paramInt, paramArrayOfInt);
    AppMethodBeat.o(101597);
  }

  public void setLogoScale(float paramFloat)
  {
    AppMethodBeat.i(101595);
    if (this.a == null)
      AppMethodBeat.o(101595);
    while (true)
    {
      return;
      this.a.a(paramFloat);
      AppMethodBeat.o(101595);
    }
  }

  public void setRotateGesturesEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101593);
    if (this.a == null)
      AppMethodBeat.o(101593);
    while (true)
    {
      return;
      this.a.f(paramBoolean);
      AppMethodBeat.o(101593);
    }
  }

  public void setScaleControlsEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101585);
    if (this.a != null)
      this.a.h(paramBoolean);
    AppMethodBeat.o(101585);
  }

  public void setScaleViewPosition(int paramInt)
  {
    AppMethodBeat.i(101590);
    if (this.a != null)
      switch (paramInt)
      {
      default:
      case 1:
      case 2:
      }
    while (true)
    {
      this.a.a(paramInt);
      AppMethodBeat.o(101590);
      return;
      paramInt = 4;
      continue;
      paramInt = 1;
    }
  }

  public void setScrollGesturesEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101586);
    if (this.a != null)
      this.a.c(paramBoolean);
    AppMethodBeat.o(101586);
  }

  public void setTiltGesturesEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101592);
    if (this.a == null)
      AppMethodBeat.o(101592);
    while (true)
    {
      return;
      this.a.e(paramBoolean);
      AppMethodBeat.o(101592);
    }
  }

  public void setZoomGesturesEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(101587);
    if (this.a != null)
      this.a.d(paramBoolean);
    AppMethodBeat.o(101587);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ek
 * JD-Core Version:    0.6.2
 */
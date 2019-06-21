package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends OrientationEventListener
{
  private int orientation = -1;
  private int otG = -1;
  private int otH = -1;
  private long otI = 0L;
  private long otJ = 0L;
  public c.a otK;

  public c(Context paramContext)
  {
    super(paramContext, 2);
  }

  public final void enable()
  {
    AppMethodBeat.i(76465);
    ab.i("MicroMsg.DeviceOrientationListener", "enable, config isEnableLandscapeMode: %s", new Object[] { Boolean.valueOf(j.ouw) });
    if (j.ouw)
    {
      super.enable();
      this.otJ = bo.yz();
    }
    AppMethodBeat.o(76465);
  }

  public final int getOrientation()
  {
    if (!j.ouw);
    for (int i = 0; ; i = this.orientation)
      return i;
  }

  public final boolean isLandscape()
  {
    boolean bool = false;
    AppMethodBeat.i(76466);
    if (!j.ouw)
      AppMethodBeat.o(76466);
    while (true)
    {
      return bool;
      long l = bo.az(this.otJ);
      ab.i("MicroMsg.DeviceOrientationListener", "isLandscape, tickToNow: %s, orientation: %s", new Object[] { Long.valueOf(l), Integer.valueOf(this.orientation) });
      if (l < 2000L)
      {
        AppMethodBeat.o(76466);
      }
      else if (this.orientation < 0)
      {
        AppMethodBeat.o(76466);
      }
      else if ((this.orientation == 90) || (this.orientation == 270))
      {
        AppMethodBeat.o(76466);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(76466);
      }
    }
  }

  public final void onOrientationChanged(int paramInt)
  {
    AppMethodBeat.i(76464);
    if (!j.ouw)
      AppMethodBeat.o(76464);
    while (true)
    {
      return;
      if (bo.az(this.otJ) >= 2000L)
        break;
      ab.v("MicroMsg.DeviceOrientationListener", "onOrientationChanged, not reach DETECT_THRESHOLD");
      AppMethodBeat.o(76464);
    }
    if ((Math.abs(this.otG - paramInt) >= 30) || (bo.az(this.otI) >= 300L))
    {
      this.otG = paramInt;
      this.otI = bo.yz();
      if ((paramInt > 60) && (paramInt < 300))
        break label145;
      if ((paramInt <= 30) || (paramInt >= 330))
        this.orientation = 0;
    }
    while (true)
    {
      if (this.otK != null)
        this.otK.yR(this.orientation);
      AppMethodBeat.o(76464);
      break;
      label145: if ((paramInt >= 30) && (paramInt <= 150))
      {
        if ((paramInt >= 60) && (paramInt <= 120))
          this.orientation = 90;
      }
      else if ((paramInt >= 120) && (paramInt <= 240))
      {
        if ((paramInt >= 150) && (paramInt <= 210))
          this.orientation = 180;
      }
      else if ((paramInt >= 210) && (paramInt <= 330) && (paramInt >= 240) && (paramInt <= 300))
        this.orientation = 270;
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(76467);
    ab.i("MicroMsg.DeviceOrientationListener", "reset");
    this.otH = -1;
    this.orientation = -1;
    this.otG = -1;
    AppMethodBeat.o(76467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.c
 * JD-Core Version:    0.6.2
 */
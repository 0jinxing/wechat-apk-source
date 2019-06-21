package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends OrientationEventListener
{
  private int orientation = -1;
  private int otG = -1;
  private int otH = -1;
  private long otI = 0L;
  private long otJ = 0L;
  i.a sEB;

  public i(Context paramContext)
  {
    super(paramContext);
  }

  public final void enable()
  {
    AppMethodBeat.i(1731);
    super.enable();
    this.otJ = bo.yz();
    AppMethodBeat.o(1731);
  }

  public final void onOrientationChanged(int paramInt)
  {
    AppMethodBeat.i(1730);
    if (bo.az(this.otJ) < 2000L)
    {
      ab.v("MicroMsg.TopStory.TopStoryDeviceOrientationListener", "onOrientationChanged, not reach DETECT_THRESHOLD");
      AppMethodBeat.o(1730);
      return;
    }
    ab.d("MicroMsg.TopStory.TopStoryDeviceOrientationListener", "onOrientationChanged: %s", new Object[] { Integer.valueOf(paramInt) });
    if ((Math.abs(this.otG - paramInt) >= 60) && (bo.az(this.otI) >= 1000L))
    {
      this.otG = paramInt;
      this.otI = bo.yz();
      if ((paramInt > 60) && (paramInt < 300))
        break label152;
      if ((paramInt <= 30) || (paramInt >= 330))
        this.orientation = 0;
    }
    while (true)
    {
      if (this.sEB != null)
        this.sEB.yR(this.orientation);
      AppMethodBeat.o(1730);
      break;
      label152: if ((paramInt >= 30) && (paramInt <= 150))
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.i
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$2
  implements Runnable
{
  h$2(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113696);
    FrameLayout localFrameLayout = (FrameLayout)this.nRb.findViewById(2131824670);
    RelativeLayout localRelativeLayout = (RelativeLayout)this.nRb.nQW.findViewById(2131826350);
    if (localFrameLayout == null)
    {
      ab.w("MicroMsg.TrackMapUI", "mapcontent is null!");
      AppMethodBeat.o(113696);
    }
    while (true)
    {
      return;
      RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localFrameLayout.getLayoutParams();
      RelativeLayout.LayoutParams localLayoutParams2 = localLayoutParams1;
      if (localLayoutParams1 == null)
        localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams2.height = (localFrameLayout.getHeight() - localRelativeLayout.getHeight());
      localFrameLayout.setLayoutParams(localLayoutParams2);
      AppMethodBeat.o(113696);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;

final class HomeUI$21
  implements Runnable
{
  HomeUI$21(HomeUI paramHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29367);
    if (aw.RK())
    {
      aw.ZK();
      z localz = c.Ry();
      if (localz != null)
        localz.dsb();
    }
    AppMethodBeat.o(29367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.21
 * JD-Core Version:    0.6.2
 */
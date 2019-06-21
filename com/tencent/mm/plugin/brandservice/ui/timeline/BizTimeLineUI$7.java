package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BizTimeLineUI$7
  implements Runnable
{
  BizTimeLineUI$7(BizTimeLineUI paramBizTimeLineUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14189);
    if (z.aeX().mG(this.jOi) <= 0)
    {
      this.jOK.MY(0);
      AppMethodBeat.o(14189);
    }
    while (true)
    {
      return;
      float f1 = BizTimeLineUI.o(this.jOK).getX();
      int i = (int)((BizTimeLineUI.o(this.jOK).getWidth() + (f1 + f1)) / 2.0F);
      int j = a.gd(this.jOK.mController.ylL) / 2;
      if (i != j)
      {
        float f2 = j - i + f1;
        BizTimeLineUI.o(this.jOK).setX(f2);
        ab.d("MicroMsg.BizTimeLineUI", "updateActionBarCustomView x = %f, new x=%f", new Object[] { Float.valueOf(f1), Float.valueOf(f2) });
      }
      if (BizTimeLineUI.o(this.jOK).getVisibility() != 0)
        BizTimeLineUI.o(this.jOK).setVisibility(0);
      AppMethodBeat.o(14189);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.7
 * JD-Core Version:    0.6.2
 */
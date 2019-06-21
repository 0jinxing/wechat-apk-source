package com.tencent.mm.plugin.sns.ui;

import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.ui.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.QFadeImageView;

final class SnsTimeLineUI$53
  implements Runnable
{
  SnsTimeLineUI$53(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39527);
    SnsTimeLineUI.j(this.rzs).nDp.setSelection(0);
    SnsTimeLineUI.a locala = SnsTimeLineUI.h(this.rzs);
    if (locala.rzY)
    {
      if (SnsTimeLineUI.rza.booleanValue())
        ab.i("MicroMsg.SnsTimeLineUI", "force init %s %s %s", new Object[] { Boolean.valueOf(locala.rzY), Float.valueOf(locala.rAb), Integer.valueOf(locala.rzZ) });
      localObject = (AbsoluteLayout.LayoutParams)SnsTimeLineUI.r(locala.rzs).getLayoutParams();
      ((AbsoluteLayout.LayoutParams)localObject).y = locala.rzZ;
      SnsTimeLineUI.r(locala.rzs).setLayoutParams((ViewGroup.LayoutParams)localObject);
      locala.rzO = locala.rAa;
      locala.rzS = locala.rAb;
    }
    SnsTimeLineUI.h(this.rzs).cur();
    Object localObject = SnsTimeLineUI.o(this.rzs);
    SnsTimeLineUI.k(this.rzs);
    ((b)localObject).d(SnsTimeLineUI.l(this.rzs), SnsTimeLineUI.m(this.rzs), SnsTimeLineUI.n(this.rzs), SnsTimeLineUI.w(this.rzs));
    g.RP().Ry().set(ac.a.xWq, Integer.valueOf(2));
    AppMethodBeat.o(39527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.53
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk.ui.tools;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;

final class p$1$1
  implements Runnable
{
  p$1$1(p.1 param1, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70412);
    int i = this.mqd.getResources().getDisplayMetrics().heightPixels - this.mqd.getHeight() >>> 1;
    int j = (int)(i / 1.618D - (this.vvB.vvA.getHeight() >>> 1));
    if (j >= 0)
    {
      if (p.access$000() < 0)
        p.access$002(BackwardSupportUtil.b.b(this.mqd.getContext(), 20.0F));
      if (this.vvB.vvA.getHeight() + j + p.access$000() <= i)
        break label192;
      j -= this.vvB.vvA.getHeight() + j + p.access$000() - i;
    }
    label192: 
    while (true)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.vvB.vvA.getLayoutParams();
      if ((j > 0) && (j != localLayoutParams.bottomMargin))
      {
        ab.i("VideoSightHelper", "setting tip marginBottom ".concat(String.valueOf(j)));
        localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.rightMargin, j);
        this.vvB.vvA.setLayoutParams(localLayoutParams);
      }
      AppMethodBeat.o(70412);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.p.1.1
 * JD-Core Version:    0.6.2
 */
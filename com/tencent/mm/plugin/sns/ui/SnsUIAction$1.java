package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;

final class SnsUIAction$1
  implements Runnable
{
  SnsUIAction$1(SnsUIAction paramSnsUIAction)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39637);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    SnsUIAction.a(this.rCe).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    af.cnu();
    s.fs(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
    AppMethodBeat.o(39637);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.os.Build.VERSION;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$4
  implements DynamicGridView.f
{
  e$4(e parame, DynamicGridView paramDynamicGridView, View paramView)
  {
  }

  public final void cvd()
  {
    AppMethodBeat.i(40324);
    DynamicGridView localDynamicGridView = this.rLc;
    localDynamicGridView.lBk = false;
    localDynamicGridView.requestDisallowInterceptTouchEvent(false);
    if ((DynamicGridView.cvj()) && (localDynamicGridView.rLz))
      localDynamicGridView.lo(true);
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.rLc.setElevation(this.rLd.rKV);
      AppMethodBeat.o(40324);
    }
    while (true)
    {
      return;
      this.rLe.bringToFront();
      AppMethodBeat.o(40324);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.e.4
 * JD-Core Version:    0.6.2
 */
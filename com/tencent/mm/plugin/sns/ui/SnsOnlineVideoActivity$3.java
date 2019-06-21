package com.tencent.mm.plugin.sns.ui;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e;

final class SnsOnlineVideoActivity$3
  implements ViewTreeObserver.OnPreDrawListener
{
  SnsOnlineVideoActivity$3(SnsOnlineVideoActivity paramSnsOnlineVideoActivity)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(39145);
    SnsOnlineVideoActivity.d(this.rvf).getViewTreeObserver().removeOnPreDrawListener(this);
    SnsOnlineVideoActivity.p(this.rvf).a(SnsOnlineVideoActivity.d(this.rvf), SnsOnlineVideoActivity.j(this.rvf), new SnsOnlineVideoActivity.3.1(this));
    AppMethodBeat.o(39145);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.3
 * JD-Core Version:    0.6.2
 */
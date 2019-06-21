package com.tencent.mm.plugin.facedetect.ui;

import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(383);
    a.b(this.lWL).setAnimationListener(new a.1.1(this));
    a.a(this.lWL).startAnimation(a.b(this.lWL));
    AppMethodBeat.o(383);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.a.1
 * JD-Core Version:    0.6.2
 */
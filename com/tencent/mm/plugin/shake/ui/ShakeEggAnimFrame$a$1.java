package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ShakeEggAnimFrame$a$1
  implements Runnable
{
  ShakeEggAnimFrame$a$1(ShakeEggAnimFrame.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24710);
    if (this.quo.targetView != null)
    {
      this.quo.targetView.clearAnimation();
      ShakeEggAnimFrame localShakeEggAnimFrame = this.quo.qun;
      View localView = this.quo.targetView;
      localShakeEggAnimFrame.qul.remove(localView);
      localShakeEggAnimFrame.removeView(localView);
    }
    AppMethodBeat.o(24710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame.a.1
 * JD-Core Version:    0.6.2
 */
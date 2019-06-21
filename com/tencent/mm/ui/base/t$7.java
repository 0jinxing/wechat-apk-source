package com.tencent.mm.ui.base;

import android.app.Activity;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class t$7
  implements Runnable
{
  t$7(o paramo, Activity paramActivity, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106877);
    this.yxX.showAtLocation(this.ghG.getWindow().getDecorView(), 48, 0, this.yyb);
    AppMethodBeat.o(106877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t.7
 * JD-Core Version:    0.6.2
 */
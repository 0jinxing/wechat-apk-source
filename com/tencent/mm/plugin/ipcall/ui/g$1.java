package com.tencent.mm.plugin.ipcall.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  g$1(g paramg, View paramView)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(22151);
    Object localObject = new Rect();
    this.imq.getWindowVisibleDisplayFrame((Rect)localObject);
    if (this.imq.getRootView().getHeight() - (((Rect)localObject).bottom - ((Rect)localObject).top) > 100)
    {
      localObject = this.nDb;
      ((g)localObject).jcl.postDelayed(new g.2((g)localObject), 100L);
    }
    AppMethodBeat.o(22151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.g.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ab;

final class a$5
  implements Runnable
{
  a$5(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116376);
    Rect localRect = new Rect();
    this.zZU.getWindowVisibleDisplayFrame(localRect);
    int i;
    if (this.zZU.getBottom() - localRect.bottom >= 300)
    {
      i = 1;
      this.zZU.getResources().getDisplayMetrics();
      if (i != 0)
        break label142;
      i = this.zZU.getBottom() - (int)this.zZU.getResources().getDimension(2131428230);
    }
    while (true)
    {
      if (a.b(this.zZU).getHeight() != i)
        a.b(this.zZU).setHeight(i);
      this.zZU.getViewTreeObserver().removeOnGlobalLayoutListener(this.zZU);
      this.zZU.getViewTreeObserver().addOnGlobalLayoutListener(this.zZU);
      AppMethodBeat.o(116376);
      return;
      i = 0;
      break;
      label142: i = this.zZU.getBottom() - j.Mw() - (int)this.zZU.getResources().getDimension(2131428230);
      ab.e("MicroMsg.BaseDrawingView", "[onKeyboardChanged] height:%s", new Object[] { Integer.valueOf(i) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.5
 * JD-Core Version:    0.6.2
 */
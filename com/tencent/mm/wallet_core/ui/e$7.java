package com.tencent.mm.wallet_core.ui;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$7
  implements Runnable
{
  e$7(View paramView1, int paramInt, View paramView2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(49262);
    Rect localRect = new Rect();
    this.val$view.getHitRect(localRect);
    localRect.top -= this.ewg;
    localRect.bottom += this.ewg;
    localRect.left -= this.ewg;
    localRect.right += this.ewg;
    this.zGL.setTouchDelegate(new TouchDelegate(localRect, this.val$view));
    AppMethodBeat.o(49262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.e.7
 * JD-Core Version:    0.6.2
 */
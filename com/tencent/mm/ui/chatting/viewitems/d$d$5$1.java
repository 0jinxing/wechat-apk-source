package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class d$d$5$1
  implements ViewTreeObserver.OnPreDrawListener
{
  d$d$5$1(d.d.5 param5, Bitmap paramBitmap)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(32830);
    this.zcV.zcS.zcd.getViewTreeObserver().removeOnPreDrawListener(this);
    int i = this.zcV.zcS.zcd.getHeight();
    int j = this.zcV.zcS.zcd.getWidth();
    int k = i;
    if (i == 0)
      k = com.tencent.mm.bz.a.al(this.zcV.zbG.yTx.getContext(), 2131428220);
    i = j;
    if (j == 0)
      i = com.tencent.mm.bz.a.al(this.zcV.zbG.yTx.getContext(), 2131428221);
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(d.a(this.krR, 2130838171, i, k));
    this.zcV.zcS.zcd.setBackgroundDrawable(localBitmapDrawable);
    AppMethodBeat.o(32830);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.d.5.1
 * JD-Core Version:    0.6.2
 */
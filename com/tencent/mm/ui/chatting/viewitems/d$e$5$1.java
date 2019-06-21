package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class d$e$5$1
  implements ViewTreeObserver.OnPreDrawListener
{
  d$e$5$1(d.e.5 param5, Bitmap paramBitmap)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(32847);
    this.zcY.zcS.zcd.getViewTreeObserver().removeOnPreDrawListener(this);
    int i = this.zcY.zcS.zcd.getHeight();
    int j = this.zcY.zcS.zcd.getWidth();
    int k = i;
    if (i == 0)
      k = com.tencent.mm.bz.a.al(this.zcY.zbG.yTx.getContext(), 2131428220);
    i = j;
    if (j == 0)
      i = com.tencent.mm.bz.a.al(this.zcY.zbG.yTx.getContext(), 2131428221);
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(d.a(this.krR, 2130838204, i, k));
    this.zcY.zcS.zcd.setBackgroundDrawable(localBitmapDrawable);
    AppMethodBeat.o(32847);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.e.5.1
 * JD-Core Version:    0.6.2
 */
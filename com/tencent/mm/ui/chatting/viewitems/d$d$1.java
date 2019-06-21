package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class d$d$1
  implements ViewTreeObserver.OnPreDrawListener
{
  private boolean zcR = false;

  d$d$1(d.d paramd, d.c paramc, com.tencent.mm.ui.chatting.d.a parama, Bitmap paramBitmap)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(32822);
    if (this.zcR)
    {
      this.zcS.zcd.getViewTreeObserver().removeOnPreDrawListener(this);
      AppMethodBeat.o(32822);
      return true;
    }
    this.zcS.zcd.getViewTreeObserver().removeOnPreDrawListener(this);
    this.zcR = true;
    int i = com.tencent.mm.bz.a.fromDPToPix(this.zbG.yTx.getContext(), 24);
    Bitmap localBitmap = this.val$bitmap;
    Object localObject;
    if (localBitmap != null)
    {
      localObject = localBitmap;
      if (!localBitmap.isRecycled());
    }
    else
    {
      localObject = d.au(this.zbG.yTx.getContext().getResources().getColor(2131689868), i, i);
    }
    int j = ((Bitmap)localObject).getHeight();
    if (i > j);
    while (true)
    {
      localObject = d.e(d.al(Bitmap.createScaledBitmap((Bitmap)localObject, j, j, true)), 20);
      i = this.zcS.zcd.getHeight();
      int k = this.zcS.zcd.getWidth();
      j = i;
      if (i == 0)
        j = com.tencent.mm.bz.a.al(this.zbG.yTx.getContext(), 2131428220);
      i = k;
      if (k == 0)
        i = com.tencent.mm.bz.a.al(this.zbG.yTx.getContext(), 2131428221);
      localObject = new BitmapDrawable(d.a((Bitmap)localObject, 2130838171, i, j));
      this.zcS.zcd.setBackgroundDrawable((Drawable)localObject);
      AppMethodBeat.o(32822);
      break;
      j = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.d.1
 * JD-Core Version:    0.6.2
 */
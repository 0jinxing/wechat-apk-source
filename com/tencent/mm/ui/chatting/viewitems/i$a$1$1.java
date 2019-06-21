package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.d;

final class i$a$1$1
  implements ViewTreeObserver.OnPreDrawListener
{
  i$a$1$1(i.a.1 param1, Bitmap paramBitmap)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(32913);
    this.zdD.zdC.zdz.getViewTreeObserver().removeOnPreDrawListener(this);
    int i = this.zdD.zdC.zdz.getHeight();
    int j = this.zdD.zdC.zdz.getWidth();
    int k = i;
    if (i == 0)
      k = a.al(this.zdD.val$context, 2131428220);
    i = j;
    if (j == 0)
      i = a.al(this.zdD.val$context, 2131428221);
    if (this.zdD.zdC.zdA);
    for (Object localObject = d.a(this.krR, 2130838171, i, k); ; localObject = d.a(this.krR, 2130838204, i, k))
    {
      localObject = new BitmapDrawable((Bitmap)localObject);
      this.zdD.zdC.zdz.setBackgroundDrawable((Drawable)localObject);
      AppMethodBeat.o(32913);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.i.a.1.1
 * JD-Core Version:    0.6.2
 */
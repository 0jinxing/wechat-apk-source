package com.tencent.luggage.sdk.a.a;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.g.b;

final class a$3$1
  implements Runnable
{
  a$3$1(a.3 param3, int paramInt1, int paramInt2, b paramb, View paramView, int paramInt3, int paramInt4)
  {
  }

  public final void run()
  {
    int i = -1;
    AppMethodBeat.i(101634);
    Bitmap localBitmap = this.bQY.bQU.aBo();
    int j;
    if ((localBitmap != null) && (localBitmap.getWidth() > 0) && (localBitmap.getHeight() > 0))
    {
      j = Math.min(localBitmap.getWidth(), this.val$w);
      i = Math.min(localBitmap.getHeight(), this.val$h);
      this.bQV.B(new Object[] { Bitmap.createBitmap(localBitmap, 0, 0, j, i) });
      localBitmap.recycle();
      this.bQY.bQU.a(new a.3.1.1(this));
      AppMethodBeat.o(101634);
      return;
    }
    if (localBitmap == null)
    {
      j = -1;
      label118: if (localBitmap != null)
        break label175;
    }
    while (true)
    {
      d.e("MicroMsg.AppBrandPageViewLU", "getScreenshotWithoutDecor bitmap invalid width(%d), height(%d)", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      this.bQV.B(new Object[] { null });
      break;
      j = localBitmap.getWidth();
      break label118;
      label175: i = localBitmap.getHeight();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.a.a.a.3.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.game.ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.f.e.b;

final class n$1 extends e.b
{
  n$1(n paramn, String paramString)
  {
  }

  public final void a(View paramView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(112067);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      n.a(this.nkQ).put(this.val$url, paramBitmap);
    AppMethodBeat.o(112067);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.n.1
 * JD-Core Version:    0.6.2
 */
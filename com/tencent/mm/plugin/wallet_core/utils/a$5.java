package com.tencent.mm.plugin.wallet_core.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.sdk.platformtools.bo;

final class a$5
  implements Runnable
{
  a$5(a parama, e parame, ImageView paramImageView, a.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47988);
    if (!bo.isNullOrNil(this.tOW.txq))
    {
      Bitmap localBitmap = x.a(new c(this.tOW.txq));
      this.lvs.setImageBitmap(localBitmap);
      x.a(this.tOU);
      AppMethodBeat.o(47988);
    }
    while (true)
    {
      return;
      if (this.tOW.txu > 0)
        this.lvs.setImageResource(this.tOW.txu);
      AppMethodBeat.o(47988);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.5
 * JD-Core Version:    0.6.2
 */
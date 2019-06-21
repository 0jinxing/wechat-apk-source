package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a$1
  implements Runnable
{
  b$a$1(b.a parama, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47873);
    this.tNp.tlu.setImageBitmap(this.val$bitmap);
    this.tNp.tNj.invalidate();
    AppMethodBeat.o(47873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.b.a.1
 * JD-Core Version:    0.6.2
 */
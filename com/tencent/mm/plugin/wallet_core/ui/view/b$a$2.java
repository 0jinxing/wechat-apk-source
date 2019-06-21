package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a$2
  implements Runnable
{
  b$a$2(b.a parama, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47874);
    this.tNp.tlt.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(47874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.b.a.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_core.utils;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.e;

final class a$3
  implements Runnable
{
  a$3(a parama, ImageView paramImageView, e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47986);
    this.lvs.setImageResource(this.tOW.txs);
    AppMethodBeat.o(47986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.3
 * JD-Core Version:    0.6.2
 */
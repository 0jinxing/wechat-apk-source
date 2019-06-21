package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class k$3
  implements View.OnClickListener
{
  k$3(k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32384);
    if (this.yXH.yUe != null)
    {
      ab.i("MicroMsg.ImageGalleryViewHolder", "%d video wait play on click, play video %d", new Object[] { Integer.valueOf(this.yXH.hashCode()), Integer.valueOf(this.yXH.mPosition) });
      this.yXH.yUe.OP(this.yXH.mPosition);
    }
    AppMethodBeat.o(32384);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.k.3
 * JD-Core Version:    0.6.2
 */
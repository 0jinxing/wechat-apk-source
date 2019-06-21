package com.tencent.mm.plugin.gallery.ui;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2
  implements h.a
{
  f$2(f paramf, f.a parama)
  {
  }

  public final void bCx()
  {
    AppMethodBeat.i(21576);
    ab.i("MicroMsg.PreviewSelectedImageAdapter", "%s %s", new Object[] { Integer.valueOf(this.mRP.mOX.getWidth()), Integer.valueOf(this.mRP.mOX.getHeight()) });
    AppMethodBeat.o(21576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.f.2
 * JD-Core Version:    0.6.2
 */
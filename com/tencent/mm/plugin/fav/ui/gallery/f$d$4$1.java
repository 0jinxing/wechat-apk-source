package com.tencent.mm.plugin.fav.ui.gallery;

import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$d$4$1
  implements PopupWindow.OnDismissListener
{
  f$d$4$1(f.d.4 param4)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(74572);
    if ((this.mos.mor.mom != null) && (!this.mos.mor.moe.mod))
      this.mos.mor.mom.setVisibility(8);
    AppMethodBeat.o(74572);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.d.4.1
 * JD-Core Version:    0.6.2
 */
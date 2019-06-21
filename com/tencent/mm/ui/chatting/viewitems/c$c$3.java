package com.tencent.mm.ui.chatting.viewitems;

import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.textview.a.f;

final class c$c$3
  implements PopupWindow.OnDismissListener
{
  c$c$3(c.c paramc)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(138191);
    if (c.c.c(this.zbF) != null)
      c.c.c(this.zbF).dismiss();
    AppMethodBeat.o(138191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c.c.3
 * JD-Core Version:    0.6.2
 */
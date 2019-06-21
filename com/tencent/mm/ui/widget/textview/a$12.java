package com.tencent.mm.ui.widget.textview;

import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$12
  implements PopupWindow.OnDismissListener
{
  a$12(a parama)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(138211);
    this.zWL.zWm.setOnTouchListener(this.zWL.jZu);
    AppMethodBeat.o(138211);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.12
 * JD-Core Version:    0.6.2
 */
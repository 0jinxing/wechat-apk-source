package com.tencent.mm.plugin.record.ui.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;

final class d$1$2
  implements n.d
{
  d$1$2(d.1 param1, TextView paramTextView)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24368);
    if (paramInt == 0)
    {
      ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setText(this.ekn.getText());
      h.bP(this.pLi.pLh.context, this.pLi.pLh.context.getString(2131296876));
    }
    AppMethodBeat.o(24368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.d.1.2
 * JD-Core Version:    0.6.2
 */
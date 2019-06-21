package com.tencent.mm.plugin.record.ui.b;

import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aar;

final class d$1$3
  implements PopupWindow.OnDismissListener
{
  d$1$3(d.1 param1, TextView paramTextView)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(24369);
    this.ekn.setText(this.pLi.pKY.cAv.desc);
    j.h(this.ekn, 1);
    AppMethodBeat.o(24369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.d.1.3
 * JD-Core Version:    0.6.2
 */
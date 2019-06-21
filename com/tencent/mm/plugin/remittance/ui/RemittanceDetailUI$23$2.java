package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.ui.tools.m;

final class RemittanceDetailUI$23$2
  implements a.a
{
  RemittanceDetailUI$23$2(RemittanceDetailUI.23 param23)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45025);
    RemittanceDetailUI.e(this.pVK.pVw).setVisibility(0);
    RemittanceDetailUI.f(this.pVK.pVw).setVisibility(8);
    m.a(this.pVK.pVw, (ScrollView)this.pVK.pVw.findViewById(2131820884), this.pVK.pVw.findViewById(2131827020), this.pVK.pVw.findViewById(2131827024), this.pVK.pVw.findViewById(2131827058));
    AppMethodBeat.o(45025);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.23.2
 * JD-Core Version:    0.6.2
 */
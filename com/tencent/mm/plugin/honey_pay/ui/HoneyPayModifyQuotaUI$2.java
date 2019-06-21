package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HoneyPayModifyQuotaUI$2
  implements View.OnClickListener
{
  HoneyPayModifyQuotaUI$2(HoneyPayModifyQuotaUI paramHoneyPayModifyQuotaUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41914);
    if (HoneyPayModifyQuotaUI.a(this.nsK))
    {
      HoneyPayModifyQuotaUI.b(this.nsK);
      this.nsK.aoB();
    }
    AppMethodBeat.o(41914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI.2
 * JD-Core Version:    0.6.2
 */
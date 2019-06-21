package com.tencent.mm.model.gdpr.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MPGdprPolicyUI$3
  implements MenuItem.OnMenuItemClickListener
{
  MPGdprPolicyUI$3(MPGdprPolicyUI paramMPGdprPolicyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(1504);
    this.foz.finish();
    AppMethodBeat.o(1504);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI.3
 * JD-Core Version:    0.6.2
 */
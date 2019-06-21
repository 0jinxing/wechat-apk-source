package com.tencent.mm.plugin.wallet_core.utils;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

public final class e$3
  implements MMSwitchBtn.a
{
  public e$3(View paramView)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(48018);
    if (this.tPo != null)
      this.tPo.setEnabled(paramBoolean);
    AppMethodBeat.o(48018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.e.3
 * JD-Core Version:    0.6.2
 */
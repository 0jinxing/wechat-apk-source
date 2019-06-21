package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletCardElementUI$14$1
  implements b.a
{
  WalletCardElementUI$14$1(WalletCardElementUI.14 param14, b paramb)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(47229);
    if (paramBoolean)
    {
      WalletCardElementUI.h(this.tGj.tGf).setText((String)paramObject);
      WalletCardElementUI.b(this.tGj.tGf, this.tGi.dLl());
      WalletCardElementUI.b(this.tGj.tGf);
    }
    this.tGi.hide();
    AppMethodBeat.o(47229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.14.1
 * JD-Core Version:    0.6.2
 */
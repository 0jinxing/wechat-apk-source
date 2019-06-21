package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.Iterator;
import java.util.List;

final class WalletCardElementUI$12$1
  implements b.a
{
  WalletCardElementUI$12$1(WalletCardElementUI.12 param12, b paramb)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(47226);
    this.jqm.hide();
    if (paramBoolean)
    {
      paramObject = (String)paramObject;
      WalletCardElementUI.f(this.tGg.tGf).setText(paramObject);
      if (!paramObject.equals(this.tGg.tGf.getString(2131304760)))
        break label162;
    }
    label162: for (int i = 0; ; i = 1)
    {
      Iterator localIterator = WalletCardElementUI.d(this.tGg.tGf).iterator();
      while (localIterator.hasNext())
      {
        paramObject = (ElementQuery)localIterator.next();
        if (((i != 0) && (paramObject.cPr())) || ((i == 0) && (paramObject.cPe())))
        {
          WalletCardElementUI.a(this.tGg.tGf, paramObject);
          WalletCardElementUI.g(this.tGg.tGf);
        }
      }
      WalletCardElementUI.a(this.tGg.tGf, this.jqm.dLl());
      AppMethodBeat.o(47226);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.12.1
 * JD-Core Version:    0.6.2
 */
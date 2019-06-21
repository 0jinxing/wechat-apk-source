package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.po;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;

final class ConfirmScanBankCardResultUI$1
  implements View.OnClickListener
{
  ConfirmScanBankCardResultUI$1(ConfirmScanBankCardResultUI paramConfirmScanBankCardResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81010);
    String str;
    if (ConfirmScanBankCardResultUI.a(this.qci) != null)
    {
      str = ConfirmScanBankCardResultUI.a(this.qci).getEditableText().toString();
      if (bo.isNullOrNil(str))
        AppMethodBeat.o(81010);
    }
    while (true)
    {
      return;
      paramView = new po();
      paramView.cLL.action = 1;
      paramView.cLL.cardNum = str;
      a.xxA.m(paramView);
      ConfirmScanBankCardResultUI.b(this.qci);
      AppMethodBeat.o(81010);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI.1
 * JD-Core Version:    0.6.2
 */
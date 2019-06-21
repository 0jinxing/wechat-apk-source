package com.tencent.mm.plugin.collect.reward.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class QrRewardMainUI$1
  implements TextWatcher
{
  int kEB = 0;

  QrRewardMainUI$1(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(41083);
    ab.d("MicroMsg.QrRewardMainUI", "s: %s, %s", new Object[] { paramEditable.toString(), Integer.valueOf(paramEditable.length()) });
    String str = paramEditable.toString();
    if (bo.isNullOrNil(str))
      this.kEB = 0;
    while (true)
    {
      paramEditable.delete(this.kEB, paramEditable.length());
      AppMethodBeat.o(41083);
      return;
      if (this.kEB == 0)
        if ((((a)g.K(a.class)).G(str)) || (((a)g.K(a.class)).H(str)))
          this.kEB = paramEditable.length();
        else
          this.kEB = 1;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.1
 * JD-Core Version:    0.6.2
 */
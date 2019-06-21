package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class QrRewardMainUI$4
  implements n.c
{
  QrRewardMainUI$4(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(41086);
    String str1 = this.kEC.getString(2131302069);
    if (QrRewardMainUI.l(this.kEC))
    {
      str2 = this.kEC.getString(2131302075);
      paraml.a(1, str1, str2);
      str1 = this.kEC.getString(2131302070);
      if (QrRewardMainUI.l(this.kEC))
        break label93;
    }
    label93: for (String str2 = this.kEC.getString(2131302075); ; str2 = "")
    {
      paraml.a(2, str1, str2);
      AppMethodBeat.o(41086);
      return;
      str2 = "";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.4
 * JD-Core Version:    0.6.2
 */
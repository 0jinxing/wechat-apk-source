package com.tencent.mm.plugin.luckymoney.ui;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class LuckyMoneyWishFooter$6
  implements ChatFooterPanel.a
{
  LuckyMoneyWishFooter$6(LuckyMoneyWishFooter paramLuckyMoneyWishFooter)
  {
  }

  public final void aRg()
  {
    AppMethodBeat.i(43052);
    LuckyMoneyWishFooter.b(this.ois).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
    LuckyMoneyWishFooter.b(this.ois).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    AppMethodBeat.o(43052);
  }

  public final void aYY()
  {
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(43053);
    try
    {
      LuckyMoneyWishFooter.b(this.ois).asB(paramString);
      AppMethodBeat.o(43053);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsCommentFooter", paramString, "", new Object[0]);
        AppMethodBeat.o(43053);
      }
    }
  }

  public final void fC(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter.6
 * JD-Core Version:    0.6.2
 */
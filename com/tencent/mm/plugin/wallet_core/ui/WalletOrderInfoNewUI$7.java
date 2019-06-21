package com.tencent.mm.plugin.wallet_core.ui;

import android.graphics.Paint;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletOrderInfoNewUI$7
  implements Runnable
{
  WalletOrderInfoNewUI$7(WalletOrderInfoNewUI paramWalletOrderInfoNewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47432);
    try
    {
      if ((WalletOrderInfoNewUI.s(this.tIz).getVisibility() == 0) && (WalletOrderInfoNewUI.t(this.tIz).getRight() > 0) && (WalletOrderInfoNewUI.s(this.tIz).getLeft() > 0) && (WalletOrderInfoNewUI.t(this.tIz).getRight() >= WalletOrderInfoNewUI.s(this.tIz).getLeft()) && (!bo.ac(WalletOrderInfoNewUI.t(this.tIz).getText())))
      {
        float f = WalletOrderInfoNewUI.t(this.tIz).getTextSize();
        ab.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", new Object[] { Integer.valueOf(WalletOrderInfoNewUI.t(this.tIz).getRight()), Integer.valueOf(WalletOrderInfoNewUI.s(this.tIz).getLeft()) });
        Object localObject = new android/graphics/Paint;
        ((Paint)localObject).<init>();
        ((Paint)localObject).setTextSize(f);
        String str1 = WalletOrderInfoNewUI.t(this.tIz).getText().toString();
        f = WalletOrderInfoNewUI.s(this.tIz).getLeft() - WalletOrderInfoNewUI.t(this.tIz).getLeft();
        for (int i = 1; (((Paint)localObject).measureText(str1.substring(0, str1.length() - i - 1)) > f) && (i <= str1.length() - 1); i++);
        ab.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str1.length()) });
        String str2 = str1.substring(0, str1.length() - i - 1);
        localObject = str2;
        if (str1.length() > 9)
        {
          localObject = str2;
          if (str2.length() < 9)
            localObject = str1.substring(0, 9);
        }
        WalletOrderInfoNewUI.t(this.tIz).setText((CharSequence)localObject);
        WalletOrderInfoNewUI.t(this.tIz).append("...");
      }
      AppMethodBeat.o(47432);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletOrderInfoNewUI", localException, "calc tinyapp name error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(47432);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.7
 * JD-Core Version:    0.6.2
 */
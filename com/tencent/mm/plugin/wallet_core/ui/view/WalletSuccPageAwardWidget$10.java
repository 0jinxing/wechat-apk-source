package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Paint;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletSuccPageAwardWidget$10
  implements Runnable
{
  WalletSuccPageAwardWidget$10(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47954);
    try
    {
      if ((WalletSuccPageAwardWidget.s(this.tOK).getVisibility() == 0) && (WalletSuccPageAwardWidget.t(this.tOK).getRight() > 0) && (WalletSuccPageAwardWidget.s(this.tOK).getLeft() > 0) && (WalletSuccPageAwardWidget.t(this.tOK).getRight() >= WalletSuccPageAwardWidget.s(this.tOK).getLeft()) && (!bo.ac(WalletSuccPageAwardWidget.t(this.tOK).getText())))
      {
        float f = WalletSuccPageAwardWidget.t(this.tOK).getTextSize();
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "nameTv size exceed, nameTv.getRight(): %s, button.getLeft(): %s", new Object[] { Integer.valueOf(WalletSuccPageAwardWidget.t(this.tOK).getRight()), Integer.valueOf(WalletSuccPageAwardWidget.s(this.tOK).getLeft()) });
        Object localObject = new android/graphics/Paint;
        ((Paint)localObject).<init>();
        ((Paint)localObject).setTextSize(f);
        String str1 = WalletSuccPageAwardWidget.t(this.tOK).getText().toString();
        f = WalletSuccPageAwardWidget.s(this.tOK).getLeft() - WalletSuccPageAwardWidget.t(this.tOK).getLeft();
        for (int i = 1; (((Paint)localObject).measureText(str1.substring(0, str1.length() - i - 1)) > f) && (i <= str1.length() - 1); i++);
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "nameTv, exceed len, final search count: %s, text.length: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str1.length()) });
        String str2 = str1.substring(0, str1.length() - i - 1);
        localObject = str2;
        if (str1.length() > 9)
        {
          localObject = str2;
          if (str2.length() < 9)
            localObject = str1.substring(0, 9);
        }
        WalletSuccPageAwardWidget.t(this.tOK).setText((CharSequence)localObject);
        WalletSuccPageAwardWidget.t(this.tOK).append("...");
      }
      AppMethodBeat.o(47954);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException, "calc nameTv len error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(47954);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.10
 * JD-Core Version:    0.6.2
 */
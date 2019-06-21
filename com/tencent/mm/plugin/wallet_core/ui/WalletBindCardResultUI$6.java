package com.tencent.mm.plugin.wallet_core.ui;

import android.graphics.Paint;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletBindCardResultUI$6
  implements Runnable
{
  WalletBindCardResultUI$6(WalletBindCardResultUI paramWalletBindCardResultUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47191);
    if ((WalletBindCardResultUI.g(this.tEY).getVisibility() == 0) && (WalletBindCardResultUI.h(this.tEY).getRight() >= WalletBindCardResultUI.g(this.tEY).getLeft()) && (!bo.ac(WalletBindCardResultUI.h(this.tEY).getText())))
    {
      float f1 = WalletBindCardResultUI.h(this.tEY).getTextSize();
      ab.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", new Object[] { Integer.valueOf(WalletBindCardResultUI.h(this.tEY).getRight()), Integer.valueOf(WalletBindCardResultUI.g(this.tEY).getLeft()) });
      Paint localPaint = new Paint();
      localPaint.setTextSize(f1);
      String str = WalletBindCardResultUI.h(this.tEY).getText().toString();
      float f2 = localPaint.measureText(str);
      f1 = WalletBindCardResultUI.h(this.tEY).getRight() - WalletBindCardResultUI.g(this.tEY).getLeft();
      for (int i = 1; (localPaint.measureText(str.substring(0, str.length() - i - 1)) > f2 - f1) && (i <= str.length() - 1); i++);
      ab.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str.length()) });
      WalletBindCardResultUI.h(this.tEY).setText(str.substring(0, str.length() - i - 1));
      WalletBindCardResultUI.h(this.tEY).append("...");
    }
    AppMethodBeat.o(47191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.6
 * JD-Core Version:    0.6.2
 */
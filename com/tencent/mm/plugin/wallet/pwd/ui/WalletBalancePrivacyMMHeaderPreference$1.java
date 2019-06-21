package com.tencent.mm.plugin.wallet.pwd.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.p.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletBalancePrivacyMMHeaderPreference$1
  implements p.a
{
  WalletBalancePrivacyMMHeaderPreference$1(WalletBalancePrivacyMMHeaderPreference paramWalletBalancePrivacyMMHeaderPreference, ImageView paramImageView)
  {
  }

  public final void i(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(46207);
    ab.i("MicroMsg.WalletBalancePrivacyMMHeaderPreference", "alvinluo icon url: %s", new Object[] { paramString });
    this.tqP.setImageBitmap(paramBitmap);
    AppMethodBeat.o(46207);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference.1
 * JD-Core Version:    0.6.2
 */
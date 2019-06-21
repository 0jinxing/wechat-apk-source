package com.tencent.mm.plugin.wallet_core.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$2
  implements Runnable
{
  a$2(a parama, a.b paramb, ImageView paramImageView, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47985);
    Bankcard localBankcard = this.tOU.thJ;
    String str = (String)this.lvs.getTag(2131820688);
    if ((!bo.isNullOrNil(str)) && (((!r.YM()) && (str.equals(localBankcard.field_bankcardType))) || ((r.YM()) && (str.equals(localBankcard.field_bankName)))))
    {
      this.lvs.setImageBitmap(this.tOV);
      AppMethodBeat.o(47985);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.BankcardLogoHelper", "not match tag: %s, banktype: %s, iv: %s", new Object[] { str, localBankcard.field_bankcardType, this.lvs });
      AppMethodBeat.o(47985);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.2
 * JD-Core Version:    0.6.2
 */
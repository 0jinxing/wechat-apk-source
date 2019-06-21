package com.tencent.mm.plugin.offline.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;
import java.util.HashMap;
import java.util.List;

final class WalletOfflineCoinPurseUI$30
  implements n.c
{
  WalletOfflineCoinPurseUI$30(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, List paramList, com.tencent.mm.ui.widget.a.d paramd)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(43540);
    int i = 0;
    Bankcard localBankcard;
    Object localObject1;
    Object localObject2;
    Bitmap localBitmap;
    if (i < this.nrU.size())
    {
      localBankcard = (Bankcard)this.nrU.get(i);
      localObject1 = com.tencent.mm.plugin.offline.c.a.Uk(localBankcard.field_bankcardType);
      localObject2 = localObject1;
      if (localBankcard.cPd())
      {
        localObject2 = localObject1;
        if (localBankcard.txc != null)
          localObject2 = localBankcard.txc.oRi;
      }
      localBitmap = x.a(new c((String)localObject2));
      x.a(new WalletOfflineCoinPurseUI.30.1(this, (String)localObject2, paraml));
      localObject1 = "";
      if (!bo.isNullOrNil(localBankcard.field_forbidWord))
        localObject1 = localBankcard.field_forbidWord;
      if ((!bo.isNullOrNil((String)localObject1)) || (localBankcard.field_support_micropay))
        break label595;
      if (bo.isNullOrNil(localBankcard.field_no_micro_word))
        localObject1 = "";
    }
    label152: label177: label577: label589: label595: 
    while (true)
    {
      SpannableString localSpannableString;
      Object localObject3;
      String str;
      if (bo.isNullOrNil(localBankcard.field_forbid_title))
      {
        localSpannableString = new SpannableString((CharSequence)localObject1);
        localObject3 = localObject1;
        if (((!localBankcard.cPc()) && (!localBankcard.cPd())) || (localBankcard.twS < 0.0D))
          break label517;
        str = localBankcard.field_desc + this.pav.getString(2131304548, new Object[] { com.tencent.mm.wallet_core.ui.e.G(localBankcard.twS) });
        label245: if (!localBankcard.cPg())
          break label526;
        localObject1 = com.tencent.mm.svg.a.a.f(this.pav.getResources(), 2131231368);
      }
      while (true)
      {
        if (localObject1 == null)
          WalletOfflineCoinPurseUI.K(this.pav).put(localObject2, Integer.valueOf(i));
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "i %d fee %s %s", new Object[] { Integer.valueOf(i), str, localSpannableString });
        localObject2 = j.b(this.pav.mController.ylL, str);
        if (localObject1 == null)
        {
          localObject1 = null;
          label341: if (!bo.isNullOrNil((String)localObject3))
            break label577;
        }
        for (boolean bool = false; ; bool = true)
        {
          paraml.a(i, (CharSequence)localObject2, localSpannableString, (Drawable)localObject1, bool);
          i++;
          break;
          localObject1 = localBankcard.field_no_micro_word;
          break label152;
          localObject3 = (String)localObject1 + " ";
          localSpannableString = new SpannableString((String)localObject3 + localBankcard.field_forbid_title);
          localObject1 = new WalletOfflineCoinPurseUI.30.2(this, this.pav, localBankcard);
          int j = ((String)localObject3).length();
          int k = ((String)localObject3).length() + localBankcard.field_forbid_title.length();
          localSpannableString.setSpan(new ForegroundColorSpan(this.pav.getResources().getColor(2131690645)), j, k, 33);
          localSpannableString.setSpan(localObject1, j, k, 33);
          break label177;
          str = localBankcard.field_desc;
          break label245;
          if (localBitmap == null)
            break label589;
          localObject1 = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a(localBitmap, this.pav.getResources().getDimensionPixelOffset(2131428760), this.pav.getResources().getDimensionPixelOffset(2131428760), true, false));
          break label266;
          break label341;
        }
        AppMethodBeat.o(43540);
        return;
        localObject1 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.30
 * JD-Core Version:    0.6.2
 */
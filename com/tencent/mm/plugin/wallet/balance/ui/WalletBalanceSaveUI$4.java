package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.HashMap;
import java.util.List;

final class WalletBalanceSaveUI$4
  implements n.c
{
  WalletBalanceSaveUI$4(WalletBalanceSaveUI paramWalletBalanceSaveUI, List paramList, com.tencent.mm.ui.widget.d paramd)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(45474);
    int i = this.nrU.size();
    int j = 0;
    Bankcard localBankcard;
    Object localObject1;
    if (j < i)
    {
      localBankcard = (Bankcard)this.nrU.get(j);
      localObject1 = b.i(this.thL, localBankcard.field_bankcardType, localBankcard.cPb());
      if (localObject1 == null)
        break label570;
    }
    label151: label408: label570: for (String str1 = ((e)localObject1).oRi; ; str1 = "")
    {
      Bitmap localBitmap = x.a(new c(str1));
      x.a(new WalletBalanceSaveUI.4.1(this, str1, paraml));
      Object localObject2 = null;
      Object localObject3 = null;
      localObject1 = "";
      if (!bo.isNullOrNil(localBankcard.field_forbidWord))
        localObject1 = localBankcard.field_forbidWord;
      SpannableString localSpannableString;
      Object localObject4;
      String str2;
      if (bo.isNullOrNil(localBankcard.field_forbid_title))
      {
        localSpannableString = new SpannableString((CharSequence)localObject1);
        localObject4 = localObject1;
        str2 = localBankcard.field_desc;
        if (!localBankcard.cPc())
          break label408;
        ab.i("MicroMsg.WalletBalanceSaveUI", "i %d fee %s %s", new Object[] { Integer.valueOf(j), str2, localSpannableString });
        localObject1 = this.thL.getResources().getDrawable(2130840657);
        if (!bo.isNullOrNil((String)localObject4))
          break label402;
      }
      for (boolean bool = false; ; bool = true)
      {
        paraml.a(j, str2, localSpannableString, (Drawable)localObject1, bool);
        localObject1 = localObject3;
        if (localObject1 == null)
          WalletBalanceSaveUI.d(this.thL).put(str1, Integer.valueOf(j));
        j++;
        break;
        localObject4 = (String)localObject1 + " ";
        localSpannableString = new SpannableString((String)localObject4 + localBankcard.field_forbid_title);
        localObject1 = new WalletBalanceSaveUI.4.2(this, this.thL);
        int k = ((String)localObject4).length();
        int m = ((String)localObject4).length() + localBankcard.field_forbid_title.length();
        localSpannableString.setSpan(new ForegroundColorSpan(this.thL.getResources().getColor(2131690645)), k, m, 33);
        localSpannableString.setSpan(localObject1, k, m, 33);
        break label151;
      }
      localObject1 = localObject2;
      if (localBitmap != null)
        localObject1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap, this.thL.getResources().getDimensionPixelOffset(2131428760), this.thL.getResources().getDimensionPixelOffset(2131428760), true, false);
      ab.i("MicroMsg.WalletBalanceSaveUI", "i %d fee %s %s", new Object[] { Integer.valueOf(j), str2, localSpannableString });
      if (localObject1 == null)
      {
        localObject3 = null;
        label486: if (!bo.isNullOrNil((String)localObject4))
          break label528;
      }
      for (bool = false; ; bool = true)
      {
        paraml.a(j, str2, localSpannableString, (Drawable)localObject3, bool);
        break;
        localObject3 = new BitmapDrawable((Bitmap)localObject1);
        break label486;
      }
      paraml.a(i, this.thL.getString(2131304574), "", this.thL.getResources().getDrawable(2130840649), false);
      AppMethodBeat.o(45474);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet.balance.a.a.p;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.protocal.protobuf.azb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.HashMap;
import java.util.List;

final class WalletLqtSaveFetchUI$21
  implements n.c
{
  WalletLqtSaveFetchUI$21(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI, com.tencent.mm.ui.widget.a.d paramd)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(45674);
    int i = WalletLqtSaveFetchUI.f(this.tkP).size();
    int j = 0;
    Bankcard localBankcard;
    Object localObject1;
    if (j < i)
    {
      localBankcard = (Bankcard)WalletLqtSaveFetchUI.f(this.tkP).get(j);
      localObject1 = b.i(this.tkP, localBankcard.field_bankcardType, localBankcard.cPb());
      if (localObject1 == null)
        break label728;
    }
    label157: label414: label578: label590: label728: for (String str1 = ((e)localObject1).oRi; ; str1 = "")
    {
      Bitmap localBitmap = x.a(new c(str1));
      x.a(new WalletLqtSaveFetchUI.21.1(this, str1, paraml));
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
          break label414;
        ab.i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", new Object[] { Integer.valueOf(j), str2, localSpannableString });
        localObject1 = this.tkP.getResources().getDrawable(2130840657);
        if (!bo.isNullOrNil((String)localObject4))
          break label408;
      }
      for (boolean bool = false; ; bool = true)
      {
        paraml.a(j, str2, localSpannableString, (Drawable)localObject1, bool);
        localObject1 = localObject3;
        if (localObject1 == null)
          WalletLqtSaveFetchUI.g(this.tkP).put(str1, Integer.valueOf(j));
        j++;
        break;
        localObject4 = (String)localObject1 + " ";
        localSpannableString = new SpannableString((String)localObject4 + localBankcard.field_forbid_title);
        localObject1 = new WalletLqtSaveFetchUI.21.2(this, this.tkP);
        int k = ((String)localObject4).length();
        int m = ((String)localObject4).length() + localBankcard.field_forbid_title.length();
        localSpannableString.setSpan(new ForegroundColorSpan(this.tkP.getResources().getColor(2131690645)), k, m, 33);
        localSpannableString.setSpan(localObject1, k, m, 33);
        break label157;
      }
      localObject1 = localObject2;
      if (localBitmap != null)
        localObject1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap, this.tkP.getResources().getDimensionPixelOffset(2131428760), this.tkP.getResources().getDimensionPixelOffset(2131428760), true, false);
      ab.i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", new Object[] { Integer.valueOf(j), str2, localSpannableString });
      if (localObject1 == null)
      {
        localObject3 = null;
        label492: if (!bo.isNullOrNil((String)localObject4))
          break label534;
      }
      for (bool = false; ; bool = true)
      {
        paraml.a(j, str2, localSpannableString, (Drawable)localObject3, bool);
        break;
        localObject3 = new BitmapDrawable((Bitmap)localObject1);
        break label492;
      }
      localObject1 = p.tfu;
      if (WalletLqtSaveFetchUI.h(this.tkP) == 1)
      {
        bool = true;
        ((p)localObject1).mL(bool);
        if (!bool)
          break label614;
        localObject1 = ((p)localObject1).tfi;
        if (localObject1 == null)
          break label624;
        bool = ((azb)localObject1).wCP;
        if (!bool)
          break label630;
        ab.i("MicroMsg.WalletLqtSaveFetchUI", "isNoSupportLqtBank");
        AppMethodBeat.o(45674);
      }
      while (true)
      {
        return;
        bool = false;
        break;
        label614: localObject1 = ((p)localObject1).tfj;
        break label578;
        label624: bool = false;
        break label590;
        label630: if (WalletLqtSaveFetchUI.h(this.tkP) == 1)
        {
          paraml.a(i, this.tkP.getString(2131305011), "", this.tkP.getResources().getDrawable(2130840649), false);
          AppMethodBeat.o(45674);
        }
        else
        {
          if (WalletLqtSaveFetchUI.h(this.tkP) == 2)
            paraml.a(i, this.tkP.getString(2131304931), "", this.tkP.getResources().getDrawable(2130840649), false);
          AppMethodBeat.o(45674);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.21
 * JD-Core Version:    0.6.2
 */
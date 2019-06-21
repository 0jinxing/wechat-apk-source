package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Context;
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
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class WalletBalanceFetchUI$16
  implements n.c
{
  WalletBalanceFetchUI$16(WalletBalanceFetchUI paramWalletBalanceFetchUI, List paramList, Context paramContext)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(45372);
    int i = 0;
    Iterator localIterator = this.thk.iterator();
    Object localObject1;
    Object localObject2;
    Bitmap localBitmap;
    Object localObject4;
    if (localIterator.hasNext())
    {
      localObject1 = (Bankcard)localIterator.next();
      localObject2 = b.i(this.val$context, ((Bankcard)localObject1).field_bankcardType, ((Bankcard)localObject1).cPb());
      localObject3 = "";
      if (localObject2 != null)
        localObject3 = ((e)localObject2).oRi;
      ab.d("MicroMsg.WalletBalanceFetchUI", "logo url: %s", new Object[] { localObject3 });
      localBitmap = x.a(new c((String)localObject3));
      localObject3 = "";
      if (!bo.isNullOrNil(((Bankcard)localObject1).field_forbidWord))
        localObject3 = ((Bankcard)localObject1).field_forbidWord;
      if (bo.isNullOrNil(((Bankcard)localObject1).field_forbid_title))
      {
        localObject4 = new SpannableString((CharSequence)localObject3);
        localObject2 = localObject3;
        localObject3 = localObject4;
        label154: localObject4 = localObject3;
        if (bo.ac((CharSequence)localObject3))
          localObject4 = new SpannableString(((Bankcard)localObject1).field_fetchArriveTimeWording);
        localObject1 = ((Bankcard)localObject1).field_desc;
        if (localBitmap == null)
          break label472;
      }
    }
    label261: label445: label472: for (Object localObject3 = d.a(localBitmap, this.val$context.getResources().getDimensionPixelOffset(2131428760), this.val$context.getResources().getDimensionPixelOffset(2131428760), true, false); ; localObject3 = null)
    {
      ab.i("MicroMsg.WalletBalanceFetchUI", "i %d fee %s %s", new Object[] { Integer.valueOf(i), localObject1, localObject4 });
      if (localObject3 == null)
      {
        localObject3 = null;
        if (bo.isNullOrNil((String)localObject2))
          break label445;
      }
      for (boolean bool = true; ; bool = false)
      {
        paraml.a(i, (CharSequence)localObject1, (CharSequence)localObject4, (Drawable)localObject3, bool);
        i++;
        break;
        localObject2 = (String)localObject3 + " ";
        localObject3 = new SpannableString((String)localObject2 + ((Bankcard)localObject1).field_forbid_title);
        localObject4 = new WalletBalanceFetchUI.16.1(this, this.val$context, (Bankcard)localObject1);
        int j = ((String)localObject2).length();
        int k = ((String)localObject2).length() + ((Bankcard)localObject1).field_forbid_title.length();
        ((SpannableString)localObject3).setSpan(new ForegroundColorSpan(this.val$context.getResources().getColor(2131690645)), j, k, 33);
        ((SpannableString)localObject3).setSpan(localObject4, j, k, 33);
        break label154;
        localObject3 = new BitmapDrawable((Bitmap)localObject3);
        break label261;
      }
      paraml.e(i, this.val$context.getString(2131304544));
      AppMethodBeat.o(45372);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.16
 * JD-Core Version:    0.6.2
 */
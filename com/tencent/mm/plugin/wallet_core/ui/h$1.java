package com.tencent.mm.plugin.wallet_core.ui;

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
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class h$1
  implements n.c
{
  h$1(List paramList, Context paramContext, HashMap paramHashMap, com.tencent.mm.ui.widget.a.d paramd, boolean paramBoolean, String paramString)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(47157);
    int i = 0;
    Iterator localIterator = this.thk.iterator();
    Bankcard localBankcard;
    Object localObject1;
    if (localIterator.hasNext())
    {
      localBankcard = (Bankcard)localIterator.next();
      localObject1 = null;
      if (localBankcard.cPd())
      {
        localObject2 = r.cPI().tCZ;
        if (localObject2 != null)
          localObject1 = ((Bankcard)localObject2).txc;
        label68: if (localObject1 == null)
          break label650;
      }
    }
    label644: label650: for (Object localObject2 = ((e)localObject1).oRi; ; localObject2 = "")
    {
      ab.d("MicroMsg.WalletBankcardBottomSheetHelper", "logo url: %s", new Object[] { localObject2 });
      Bitmap localBitmap = x.a(new c((String)localObject2));
      x.a(new h.1.1(this, (String)localObject2, paraml));
      localObject1 = "";
      if (!bo.isNullOrNil(localBankcard.field_forbidWord))
        localObject1 = localBankcard.field_forbidWord;
      Object localObject3;
      Object localObject4;
      label177: String str;
      if (bo.isNullOrNil(localBankcard.field_forbid_title))
      {
        localObject3 = new SpannableString((CharSequence)localObject1);
        localObject4 = localObject1;
        localObject1 = localObject3;
        localObject3 = localObject1;
        if (this.tEj)
        {
          localObject3 = localObject1;
          if (bo.ac((CharSequence)localObject1))
          {
            localObject3 = localObject1;
            if (!bo.isNullOrNil(localBankcard.field_fetchArriveTimeWording))
              localObject3 = new SpannableString(localBankcard.field_fetchArriveTimeWording);
          }
        }
        str = localBankcard.field_desc;
        if (localBitmap == null)
          break label644;
      }
      for (localObject1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap, this.val$context.getResources().getDimensionPixelOffset(2131428760), this.val$context.getResources().getDimensionPixelOffset(2131428760), true, false); ; localObject1 = null)
      {
        if (localObject1 == null)
          this.tEh.put(localObject2, Integer.valueOf(i));
        ab.i("MicroMsg.WalletBankcardBottomSheetHelper", "i %d fee %s %s", new Object[] { Integer.valueOf(i), str, localObject3 });
        if (localBankcard.cPc())
        {
          localObject1 = this.val$context.getResources().getDrawable(2130840657);
          if (!bo.isNullOrNil((String)localObject4));
          for (bool = true; ; bool = false)
          {
            paraml.a(i, str, (CharSequence)localObject3, (Drawable)localObject1, bool);
            i++;
            break;
            localObject1 = b.i(this.val$context, localBankcard.field_bankcardType, localBankcard.cPb());
            break label68;
            localObject4 = (String)localObject1 + " ";
            localObject1 = new SpannableString((String)localObject4 + localBankcard.field_forbid_title);
            localObject3 = new h.1.2(this, this.val$context, localBankcard);
            int j = ((String)localObject4).length();
            int k = ((String)localObject4).length() + localBankcard.field_forbid_title.length();
            ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(this.val$context.getResources().getColor(2131690645)), j, k, 33);
            ((SpannableString)localObject1).setSpan(localObject3, j, k, 33);
            break label177;
          }
        }
        if (localObject1 == null)
        {
          localObject1 = null;
          label549: if (bo.isNullOrNil((String)localObject4))
            break label594;
        }
        label594: for (boolean bool = true; ; bool = false)
        {
          paraml.a(i, str, (CharSequence)localObject3, (Drawable)localObject1, bool);
          i++;
          break;
          localObject1 = new BitmapDrawable((Bitmap)localObject1);
          break label549;
        }
        if ((this.tEk) && (!bo.isNullOrNil(this.tEl)))
          paraml.a(i, this.tEl, "", ah.getResources().getDrawable(2130840649), false);
        AppMethodBeat.o(47157);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.h.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import java.util.List;

final class q$9$1
  implements l.b
{
  q$9$1(q.9 param9)
  {
  }

  public final void a(FavorPayInfo paramFavorPayInfo)
  {
    Object localObject1 = null;
    AppMethodBeat.i(47601);
    this.tKw.tKq.toH = paramFavorPayInfo;
    int i;
    if (this.tKw.tKq.pGr == null)
    {
      i = 0;
      if (this.tKw.tKq.pGr != null)
        break label290;
      paramFavorPayInfo = "";
      label49: ad.e(i, paramFavorPayInfo, 15, this.tKw.tKq.toH.tzb);
      this.tKw.tKq.tJR = false;
      paramFavorPayInfo = b.bt(this.tKw.tKq.toH.tzc, this.tKw.tKq.toH.tzd);
      this.tKw.tKq.toH.tzf = "";
      if (!b.a(this.tKw.tKq.toH, this.tKw.tKq.tJT))
        break label335;
      this.tKw.tKq.tJR = true;
      if (paramFavorPayInfo.size() != 0)
        break label307;
    }
    label290: label307: for (this.tKw.tKq.toH.tzf = this.tKw.val$context.getString(2131304796); ; this.tKw.tKq.toH.tzf = this.tKw.val$context.getString(2131304797))
    {
      this.tKw.tKq.dismiss();
      if (this.tKw.tKq.tKk == null)
        break label335;
      this.tKw.tKq.tKk.a(this.tKw.tKq.tJF.getText(), this.tKw.tKq.toH, this.tKw.tKq.tJR);
      AppMethodBeat.o(47601);
      return;
      i = this.tKw.tKq.pGr.cIf;
      break;
      paramFavorPayInfo = this.tKw.tKq.pGr.czZ;
      break label49;
    }
    label335: if (this.tKw.tKq.tJI != null)
      this.tKw.tKq.tJI.setTag(this.tKw.tKq.toH);
    Object localObject2 = this.tKw.tKq.tpu.acU(this.tKw.tKq.toH.tzb);
    double d;
    String str1;
    String str2;
    String str3;
    label458: String str4;
    if ((localObject2 != null) && (((j)localObject2).tnb > 0.0D))
    {
      d = ((j)localObject2).tmT;
      str1 = e.G(((j)localObject2).tna);
      str2 = e.G(this.tKw.tKv.tAr.tmR);
      str3 = ((j)localObject2).tnd;
      paramFavorPayInfo = null;
      if ((localObject2 == null) || (((j)localObject2).tnc == 0))
        break label657;
      str4 = ((j)localObject2).tne;
      localObject2 = str4;
      if (bo.isNullOrNil(str3));
    }
    label657: for (localObject2 = ",".concat(String.valueOf(str4)); ; localObject2 = null)
    {
      if ((!bo.isNullOrNil(str3)) || (!bo.isNullOrNil((String)localObject2)))
        if (bo.isNullOrNil(paramFavorPayInfo))
          paramFavorPayInfo = localObject1;
      while (true)
      {
        this.tKw.tKq.f(str1, d);
        this.tKw.tKq.ade(str2);
        this.tKw.tKq.gN(str3, paramFavorPayInfo);
        this.tKw.tKq.adf((String)localObject2);
        AppMethodBeat.o(47601);
        break;
        d = this.tKw.tKv.tAr.tmR;
        str1 = e.G(this.tKw.tKv.tAr.tmR);
        paramFavorPayInfo = this.tKw.val$context.getString(2131305238);
        str3 = null;
        str2 = null;
        break label458;
        paramFavorPayInfo = ",".concat(String.valueOf(paramFavorPayInfo));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.9.1
 * JD-Core Version:    0.6.2
 */
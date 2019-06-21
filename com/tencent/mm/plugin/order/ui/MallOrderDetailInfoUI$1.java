package com.tencent.mm.plugin.order.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.c;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.b;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;

final class MallOrderDetailInfoUI$1
  implements View.OnClickListener
{
  MallOrderDetailInfoUI$1(MallOrderDetailInfoUI paramMallOrderDetailInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43798);
    if (paramView.getId() == 2131825812)
    {
      if (this.pdR.pcS.pbJ != null)
      {
        c.aM(this.pdR, this.pdR.pcS.pbJ.mZj);
        MallOrderDetailInfoUI.a(this.pdR, this.pdR.pcS.pbJ.pbR);
        AppMethodBeat.o(43798);
      }
    }
    else if ((paramView.getId() == 2131825814) || (paramView.getId() == 2131825816))
    {
      if ((this.pdR.pcS.pbK == null) || (this.pdR.pcS.pbK.size() <= 0))
        break label608;
      if (TextUtils.isEmpty(((ProductSectionItem)this.pdR.pcS.pbK.get(0)).jumpUrl))
        break label616;
    }
    label608: label616: for (boolean bool = c.aM(this.pdR, ((ProductSectionItem)this.pdR.pcS.pbK.get(0)).jumpUrl); ; bool = false)
    {
      if (!bool)
        c.aN(this.pdR, ((ProductSectionItem)this.pdR.pcS.pbK.get(0)).pdA);
      MallOrderDetailInfoUI.a(this.pdR, ((ProductSectionItem)this.pdR.pcS.pbK.get(0)).name);
      AppMethodBeat.o(43798);
      break;
      if (paramView.getId() == 2131825815)
      {
        paramView = this.pdR.mBundle;
        paramView.putParcelableArrayList("order_product_list", this.pdR.pcS.pbK);
        paramView.putInt("key_enter_id", 0);
        paramView.putString("key_trans_id", MallOrderDetailInfoUI.a(this.pdR));
        paramView.putString("appname", this.pdR.pcS.cBb);
        a.j(this.pdR, new Bundle());
        MallOrderDetailInfoUI.a(this.pdR, this.pdR.getResources().getString(2131301341));
        AppMethodBeat.o(43798);
        break;
      }
      if (paramView.getId() == 2131825817)
      {
        paramView = this.pdR.mBundle.getString("key_trans_id");
        Bundle localBundle = this.pdR.mBundle;
        localBundle.putString("key_trans_id", paramView);
        localBundle.putInt("key_enter_id", 1);
        if (this.pdR.pcS != null)
          localBundle.putParcelable("transaction_data", this.pdR.pcS.pbI);
        a.j(this.pdR, localBundle);
        MallOrderDetailInfoUI.a(this.pdR, this.pdR.getResources().getString(2131301338));
        AppMethodBeat.o(43798);
        break;
      }
      if (paramView.getId() == 2131825831)
      {
        MallOrderDetailInfoUI.b(this.pdR);
        AppMethodBeat.o(43798);
        break;
      }
      if (paramView.getId() == 2131825822)
      {
        if ((this.pdR.pcS == null) || (this.pdR.pcS.pbP == null))
          break label608;
        this.pdR.pdC = this.pdR.pcS.pbP;
        MallOrderDetailInfoUI.c(this.pdR);
        MallOrderDetailInfoUI.a(this.pdR, this.pdR.getResources().getString(2131301336));
        AppMethodBeat.o(43798);
        break;
      }
      if (paramView.getId() == 2131825824)
      {
        e.af(this.pdR, this.pdR.pcS.cBb);
        MallOrderDetailInfoUI.a(this.pdR, this.pdR.getResources().getString(2131301347));
      }
      AppMethodBeat.o(43798);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.1
 * JD-Core Version:    0.6.2
 */
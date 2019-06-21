package com.tencent.mm.plugin.wallet.pay.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.List;

public final class WalletPayUI$a
{
  protected WalletPayUI$a(WalletPayUI paramWalletPayUI)
  {
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(46075);
    this.tqj.tpN.removeAllViews();
    int i;
    ViewGroup.LayoutParams localLayoutParams;
    int j;
    label40: View localView;
    TextView localTextView1;
    TextView localTextView2;
    Orders.Commodity localCommodity;
    String str1;
    String str2;
    if (this.tqj.mCount == 0)
    {
      i = 0;
      localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
      j = 0;
      if (j >= i)
        break label574;
      localView = ((LayoutInflater)this.tqj.getSystemService("layout_inflater")).inflate(2130971146, null);
      localTextView1 = (TextView)localView.findViewById(2131828930);
      localTextView2 = (TextView)localView.findViewById(2131828923);
      localCommodity = (Orders.Commodity)this.tqj.pWy.tAq.get(j);
      str1 = "";
      str2 = str1;
      if (this.tqj.pVL != null)
        if ((this.tqj.pVL.cIf != 32) && (this.tqj.pVL.cIf != 33) && (this.tqj.pVL.cIf != 31))
        {
          str2 = str1;
          if (this.tqj.pVL.cIf != 48);
        }
        else
        {
          str2 = this.tqj.pVL.vwh.getString("extinfo_key_1", "");
          if (bo.isNullOrNil(str2))
            break label451;
          g.RQ();
          ad localad = ((j)g.K(j.class)).XM().aoM(str2);
          if (localad == null)
            break label424;
          str2 = localad.Oj();
        }
      label257: if (localCommodity != null)
      {
        if (bo.isNullOrNil(str2))
          break label470;
        localTextView2.setText(str2);
        localTextView2.setVisibility(0);
        ((TextView)localView.findViewById(2131828983)).setVisibility(0);
        label297: if (bo.isNullOrNil(localCommodity.desc))
          break label539;
        localTextView1.setText(localCommodity.desc);
        localTextView1.setVisibility(8);
        ((TextView)localView.findViewById(2131828929)).setVisibility(8);
        label340: if ((bo.isNullOrNil(str2)) && (bo.isNullOrNil(localCommodity.pca)))
          break label564;
        localView.setVisibility(0);
      }
    }
    while (true)
    {
      localView.setLayoutParams(localLayoutParams);
      localView.measure(-2, -2);
      this.tqj.tpN.addView(localView);
      j++;
      break label40;
      if (this.tqj.tpB)
      {
        i = this.tqj.mCount;
        break;
      }
      i = 1;
      break;
      label424: ab.e(this.tqj.TAG, "can not found contact for user::".concat(String.valueOf(str2)));
      str2 = str1;
      break label257;
      label451: ab.e(this.tqj.TAG, "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
      str2 = str1;
      break label257;
      label470: if (!bo.isNullOrNil(localCommodity.pca))
      {
        localTextView2.setText(localCommodity.pca);
        localTextView2.setVisibility(0);
        ((TextView)localView.findViewById(2131828983)).setVisibility(0);
        break label297;
      }
      ((TextView)localView.findViewById(2131828983)).setVisibility(8);
      localTextView2.setVisibility(8);
      break label297;
      label539: ((TextView)localView.findViewById(2131828929)).setVisibility(8);
      localTextView1.setVisibility(8);
      break label340;
      label564: localView.setVisibility(8);
    }
    label574: AppMethodBeat.o(46075);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.a
 * JD-Core Version:    0.6.2
 */
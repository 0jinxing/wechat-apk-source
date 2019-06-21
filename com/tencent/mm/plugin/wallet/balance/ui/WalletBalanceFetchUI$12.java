package com.tencent.mm.plugin.wallet.balance.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;
import java.util.ArrayList;
import java.util.List;

final class WalletBalanceFetchUI$12
  implements View.OnClickListener
{
  WalletBalanceFetchUI$12(WalletBalanceFetchUI paramWalletBalanceFetchUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45367);
    this.the.aoB();
    s.cNC();
    ArrayList localArrayList = s.cND().cQD();
    s.cNC();
    Object localObject1 = s.cND().tCX;
    String str = "";
    if (localObject1 != null)
    {
      paramView = ((b)localObject1).twA;
      str = ((b)localObject1).twz;
    }
    while (true)
    {
      Object localObject2 = this.the;
      AppCompatActivity localAppCompatActivity = this.the.mController.ylL;
      localObject1 = WalletBalanceFetchUI.b(this.the);
      WalletBalanceFetchUI.12.1 local1 = new WalletBalanceFetchUI.12.1(this, localArrayList);
      d locald = new d(localAppCompatActivity, 2, true);
      locald.rBl = new WalletBalanceFetchUI.16((WalletBalanceFetchUI)localObject2, localArrayList, localAppCompatActivity);
      locald.rBm = local1;
      locald.zQy = true;
      localObject2 = LayoutInflater.from(localAppCompatActivity).inflate(2130971046, null);
      if (!bo.isNullOrNil(str))
        ((TextView)((View)localObject2).findViewById(2131828598)).setText(str);
      if (!bo.isNullOrNil(paramView))
        ((TextView)((View)localObject2).findViewById(2131828599)).setText(paramView);
      locald.F((View)localObject2, false);
      int i = localArrayList.size();
      int j;
      int k;
      if (localObject1 != null)
      {
        j = 0;
        k = i;
        if (j >= localArrayList.size())
          break label266;
        if (!((Bankcard)localArrayList.get(j)).field_bindSerial.equals(((Bankcard)localObject1).field_bindSerial))
          break label284;
        i = j;
      }
      label266: label284: 
      while (true)
      {
        j++;
        break;
        k = i;
        locald.zQA = k;
        locald.cpD();
        AppMethodBeat.o(45367);
        return;
      }
      paramView = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.12
 * JD-Core Version:    0.6.2
 */
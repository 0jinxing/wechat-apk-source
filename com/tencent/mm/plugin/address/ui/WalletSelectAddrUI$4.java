package com.tencent.mm.plugin.address.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.address.model.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class WalletSelectAddrUI$4
  implements AdapterView.OnItemClickListener
{
  WalletSelectAddrUI$4(WalletSelectAddrUI paramWalletSelectAddrUI)
  {
  }

  public final void onItemClick(AdapterView<?> arg1, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(16980);
    ab.d("MicroMsg.WalletSelectAddrUI", "select pos ".concat(String.valueOf(paramInt)));
    synchronized (WalletSelectAddrUI.c(this.gLk))
    {
      if (paramInt < WalletSelectAddrUI.d(this.gLk).size())
      {
        WalletSelectAddrUI.a(this.gLk, (com.tencent.mm.plugin.address.d.b)WalletSelectAddrUI.d(this.gLk).get(paramInt));
        if ((WalletSelectAddrUI.e(this.gLk)) || (WalletSelectAddrUI.f(this.gLk)) || (WalletSelectAddrUI.g(this.gLk) == null))
          break label136;
        WalletSelectAddrUI.a(this.gLk, WalletSelectAddrUI.g(this.gLk).id);
      }
      label136: 
      while ((WalletSelectAddrUI.g(this.gLk) == null) || (WalletSelectAddrUI.g(this.gLk).id == 0))
      {
        WalletSelectAddrUI.i(this.gLk).notifyDataSetChanged();
        AppMethodBeat.o(16980);
        return;
      }
      paramView = new com/tencent/mm/plugin/address/model/g;
      paramView.<init>(WalletSelectAddrUI.g(this.gLk).id);
      WalletSelectAddrUI.h(this.gLk).g(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.4
 * JD-Core Version:    0.6.2
 */
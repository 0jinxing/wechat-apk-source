package com.tencent.mm.plugin.address.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.address.model.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;
import java.util.List;

final class WalletSelectAddrUI$5
  implements AdapterView.OnItemLongClickListener
{
  WalletSelectAddrUI$5(WalletSelectAddrUI paramWalletSelectAddrUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, final int paramInt, long paramLong)
  {
    AppMethodBeat.i(16982);
    paramAdapterView = this.gLk.getResources().getStringArray(2131755062);
    h.a(this.gLk.mController.ylL, null, paramAdapterView, null, new h.c()
    {
      public final void iE(int paramAnonymousInt)
      {
        AppMethodBeat.i(16981);
        while (true)
        {
          synchronized (WalletSelectAddrUI.c(WalletSelectAddrUI.5.this.gLk))
          {
            if (paramInt >= WalletSelectAddrUI.d(WalletSelectAddrUI.5.this.gLk).size())
              break label209;
            com.tencent.mm.plugin.address.d.b localb = (com.tencent.mm.plugin.address.d.b)WalletSelectAddrUI.d(WalletSelectAddrUI.5.this.gLk).get(paramInt);
            if (localb == null)
            {
              AppMethodBeat.o(16981);
              return;
            }
          }
          switch (paramAnonymousInt)
          {
          default:
          case 0:
          case 1:
          case 2:
          }
          while (true)
          {
            AppMethodBeat.o(16981);
            break;
            WalletSelectAddrUI.a(WalletSelectAddrUI.5.this.gLk, localObject2.id);
            AppMethodBeat.o(16981);
            break;
            localf = new f(localObject2.id);
            WalletSelectAddrUI.a(WalletSelectAddrUI.5.this.gLk, null);
            WalletSelectAddrUI.h(WalletSelectAddrUI.5.this.gLk).g(localf);
            AppMethodBeat.o(16981);
            break;
            WalletSelectAddrUI.b(WalletSelectAddrUI.5.this.gLk, localf);
          }
          label209: f localf = null;
        }
      }
    });
    AppMethodBeat.o(16982);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.5
 * JD-Core Version:    0.6.2
 */
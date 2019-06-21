package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ayi;
import com.tencent.mm.protocal.protobuf.cjh;
import com.tencent.mm.protocal.protobuf.cji;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;

final class WalletUniversalPayOrderUI$3
  implements MMSwitchBtn.a
{
  WalletUniversalPayOrderUI$3(WalletUniversalPayOrderUI paramWalletUniversalPayOrderUI, cji paramcji)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(46428);
    ab.i("MicroMsg.WalletUniversalPayOrderUI", "click switch: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    WalletUniversalPayOrderUI.e(this.ttx).setDragEnabled(paramBoolean);
    cjh localcjh;
    Object localObject;
    if (paramBoolean)
    {
      if ((this.tty.xhZ == 1) && (this.tty.xia != null) && (!bo.isNullOrNil(this.tty.xia.title)))
      {
        ab.i("MicroMsg.WalletUniversalPayOrderUI", "show open dialog");
        localcjh = this.tty.xia;
        localObject = new c.a(this.ttx.mController.ylL);
        ((c.a)localObject).asD(localcjh.title);
        ((c.a)localObject).asE(localcjh.content);
        ((c.a)localObject).rc(false);
        if (localcjh.xhU != null)
        {
          ((c.a)localObject).asK(localcjh.xhU.title);
          ((c.a)localObject).b(new WalletUniversalPayOrderUI.3.1(this));
        }
        if (localcjh.xhV != null)
        {
          ((c.a)localObject).asJ(localcjh.xhV.title);
          ((c.a)localObject).a(new WalletUniversalPayOrderUI.3.2(this));
        }
        localObject = ((c.a)localObject).aMb();
        this.ttx.addDialog((Dialog)localObject);
        ((c)localObject).show();
        h.pYm.e(16343, new Object[] { Integer.valueOf(3) });
      }
      while (true)
      {
        h.pYm.e(16343, new Object[] { Integer.valueOf(2) });
        AppMethodBeat.o(46428);
        return;
        WalletUniversalPayOrderUI.f(this.ttx);
      }
    }
    if (WalletUniversalPayOrderUI.g(this.ttx))
    {
      WalletUniversalPayOrderUI.h(this.ttx);
      if ((this.tty.xib != null) && (!bo.isNullOrNil(this.tty.xib.title)))
      {
        ab.i("MicroMsg.WalletUniversalPayOrderUI", "show close dialog");
        localcjh = this.tty.xib;
        localObject = new c.a(this.ttx.mController.ylL);
        ((c.a)localObject).asD(localcjh.title);
        ((c.a)localObject).asE(localcjh.content);
        ((c.a)localObject).rc(false);
        if (localcjh.xhU != null)
        {
          ((c.a)localObject).asK(localcjh.xhU.title);
          ((c.a)localObject).b(new WalletUniversalPayOrderUI.3.3(this));
        }
        if (localcjh.xhV != null)
        {
          ((c.a)localObject).asJ(localcjh.xhV.title);
          ((c.a)localObject).a(new WalletUniversalPayOrderUI.3.4(this));
        }
        localObject = ((c.a)localObject).aMb();
        this.ttx.addDialog((Dialog)localObject);
        ((c)localObject).show();
        h.pYm.e(16343, new Object[] { Integer.valueOf(7) });
      }
    }
    while (true)
    {
      h.pYm.e(16343, new Object[] { Integer.valueOf(6) });
      AppMethodBeat.o(46428);
      break;
      WalletUniversalPayOrderUI.i(this.ttx);
      continue;
      WalletUniversalPayOrderUI.i(this.ttx);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.3
 * JD-Core Version:    0.6.2
 */
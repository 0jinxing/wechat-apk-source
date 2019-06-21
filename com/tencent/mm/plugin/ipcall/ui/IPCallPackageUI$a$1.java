package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.e.f;
import com.tencent.mm.protocal.protobuf.crx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class IPCallPackageUI$a$1
  implements View.OnClickListener
{
  IPCallPackageUI$a$1(IPCallPackageUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22226);
    paramView = (crx)this.nDS.getItem(((Integer)paramView.getTag()).intValue());
    if ((paramView == null) || (bo.isNullOrNil(paramView.ProductID)))
    {
      ab.e("MicroMsg.IPCallPackageUI", "buyBtnClick: proToBuy is null");
      AppMethodBeat.o(22226);
    }
    while (true)
    {
      return;
      IPCallPackageUI.b(IPCallPackageUI.a.a(this.nDS)).start();
      f localf = IPCallPackageUI.b(IPCallPackageUI.a.a(this.nDS));
      localf.nyS += 1;
      IPCallPackageUI.b(IPCallPackageUI.a.a(this.nDS)).nyW = paramView.ProductID;
      h.a(IPCallPackageUI.a.a(this.nDS), IPCallPackageUI.a.a(this.nDS).getString(2131300817, new Object[] { paramView.wOs, paramView.Title }), IPCallPackageUI.a.a(this.nDS).getString(2131300818), IPCallPackageUI.a.a(this.nDS).getString(2131300815), IPCallPackageUI.a.a(this.nDS).getString(2131300816), false, new IPCallPackageUI.a.1.1(this, paramView), new IPCallPackageUI.a.1.2(this));
      AppMethodBeat.o(22226);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI.a.1
 * JD-Core Version:    0.6.2
 */
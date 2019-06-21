package com.tencent.mm.plugin.mall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bqn;
import com.tencent.mm.protocal.protobuf.btr;
import com.tencent.mm.protocal.protobuf.cgd;
import com.tencent.mm.protocal.protobuf.chf;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import org.json.JSONObject;

final class MallWalletSectionCellView$2
  implements View.OnClickListener
{
  MallWalletSectionCellView$2(MallWalletSectionCellView paramMallWalletSectionCellView, cgd paramcgd, JSONObject paramJSONObject)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43250);
    com.tencent.mm.plugin.wallet_core.utils.e.a(this.onJ.getContext(), this.onK.vCP);
    MallWalletSectionCellView.a(this.onJ);
    if ((this.onL != null) && (this.onK.xfj != null))
    {
      this.onL.remove(this.onK.xfj.wpJ);
      this.onL.remove(String.format("%s_expiretime", new Object[] { this.onK.xfj.wpJ }));
      g.RP().Ry().set(ac.a.xUn, this.onL.toString());
    }
    paramView = "";
    int i;
    if (this.onK.vCP.type == 1)
    {
      paramView = this.onK.vCP.url;
      i = 1;
    }
    while (true)
    {
      h.pYm.e(16502, new Object[] { Integer.valueOf(2), paramView, Integer.valueOf(i) });
      AppMethodBeat.o(43250);
      return;
      if (this.onK.vCP.type == 2)
      {
        if (this.onK.vCP.wVC != null)
          paramView = this.onK.vCP.wVC.username;
        i = 2;
      }
      else if (this.onK.vCP.type == 4)
      {
        paramView = this.onK.vCP.url;
        i = 3;
      }
      else
      {
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView.2
 * JD-Core Version:    0.6.2
 */
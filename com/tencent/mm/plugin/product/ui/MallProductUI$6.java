package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.t;

final class MallProductUI$6
  implements View.OnClickListener
{
  MallProductUI$6(MallProductUI paramMallProductUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44162);
    paramView = MallProductUI.e(this.pke);
    if (paramView.piK.bZP())
    {
      paramView.gNy.startActivity(new Intent(paramView.gNy, MallProductSelectSkuUI.class));
      h.pYm.e(11008, new Object[] { paramView.piK.bZL(), paramView.piK.pgO.pho, Integer.valueOf(f.gOW), Integer.valueOf(1) });
      AppMethodBeat.o(44162);
    }
    while (true)
    {
      return;
      t.makeText(paramView.gNy, 2131301349, 1).show();
      AppMethodBeat.o(44162);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.6
 * JD-Core Version:    0.6.2
 */
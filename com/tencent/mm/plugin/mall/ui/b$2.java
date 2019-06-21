package com.tencent.mm.plugin.mall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb, int paramInt, MallFunction paramMallFunction)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43136);
    ab.v("MicroMsg.FunctionListAdapter", "on Click");
    if (b.c(this.olG) != null)
      b.c(this.olG).a(this.olH, this.olI);
    AppMethodBeat.o(43136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.b.2
 * JD-Core Version:    0.6.2
 */
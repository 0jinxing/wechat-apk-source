package com.tencent.mm.plugin.order.ui.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallTransactionObject;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama, MallTransactionObject paramMallTransactionObject, f paramf, com.tencent.mm.ui.base.preference.f paramf1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43885);
    paramView = this.pbT.desc + "\n" + this.pbT.pcb;
    this.pet.setContent(paramView);
    this.iFR.notifyDataSetChanged();
    AppMethodBeat.o(43885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a.2
 * JD-Core Version:    0.6.2
 */
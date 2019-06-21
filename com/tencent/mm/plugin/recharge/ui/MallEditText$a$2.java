package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.a.a;
import java.util.LinkedList;

final class MallEditText$a$2
  implements View.OnClickListener
{
  MallEditText$a$2(MallEditText.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44212);
    a.cea().cK(null);
    this.pGH.pGB.setInput(null);
    MallEditText.d(this.pGH.pGB).cK(new LinkedList());
    MallEditText.d(this.pGH.pGB).notifyDataSetChanged();
    AppMethodBeat.o(44212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.MallEditText.a.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class l$9
  implements View.OnClickListener
{
  l$9(l paraml)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125141);
    h.a(this.gDD.gDo, this.gDD.gDo.getString(2131302306) + this.gDD.account, this.gDD.gDo.getString(2131302307), this.gDD.gDo.getString(2131296994), this.gDD.gDo.getString(2131296868), false, new l.9.1(this), new l.9.2(this));
    AppMethodBeat.o(125141);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.l.9
 * JD-Core Version:    0.6.2
 */
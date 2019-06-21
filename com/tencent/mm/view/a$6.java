package com.tencent.mm.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.br.b;

final class a$6
  implements View.OnClickListener
{
  a$6(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(116377);
    if (this.zZU.getTextEditView().getVisibility() == 0)
    {
      this.zZU.getPresenter().dlS();
      AppMethodBeat.o(116377);
    }
    while (true)
    {
      return;
      this.zZU.getPresenter().onExit();
      AppMethodBeat.o(116377);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.6
 * JD-Core Version:    0.6.2
 */
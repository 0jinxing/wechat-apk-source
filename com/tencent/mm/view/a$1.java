package com.tencent.mm.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Switch;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.br.b;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(116371);
    int j;
    if (this.zZU.getTextEditView().getVisibility() == 0)
    {
      b localb = this.zZU.getPresenter();
      paramView = a.b(this.zZU).getText();
      int i = a.b(this.zZU).getCurrentTextColor();
      if (a.c(this.zZU).isChecked())
      {
        j = ((Integer)a.c(this.zZU).getTag()).intValue();
        localb.a(paramView, i, j);
        AppMethodBeat.o(116371);
      }
    }
    while (true)
    {
      return;
      j = 0;
      break;
      this.zZU.getPresenter().onFinish();
      AppMethodBeat.o(116371);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.1
 * JD-Core Version:    0.6.2
 */
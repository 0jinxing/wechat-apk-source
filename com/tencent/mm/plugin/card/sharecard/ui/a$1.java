package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88089);
    if (paramView.getId() == 2131821992)
      if (this.kgl.kge.isChecked())
      {
        if (this.kgl.kgi == null)
          break label79;
        this.kgl.kgi.sV(1);
        AppMethodBeat.o(88089);
      }
    while (true)
    {
      return;
      if (this.kgl.kgi != null)
        this.kgl.kgi.sV(0);
      label79: AppMethodBeat.o(88089);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.a.1
 * JD-Core Version:    0.6.2
 */
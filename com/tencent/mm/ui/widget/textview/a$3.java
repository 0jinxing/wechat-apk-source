package com.tencent.mm.ui.widget.textview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$3
  implements View.OnClickListener
{
  a$3(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138208);
    ai.d("SelectableTextHelper", "onClick", new Object[0]);
    if (this.zWL.lDG != null)
      this.zWL.lDG.onClick(paramView);
    this.zWL.zWC = true;
    this.zWL.zWD = true;
    this.zWL.dLL();
    this.zWL.dLM();
    if (this.zWL.zWn != null)
      this.zWL.zWn.dismiss();
    AppMethodBeat.o(138208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.3
 * JD-Core Version:    0.6.2
 */
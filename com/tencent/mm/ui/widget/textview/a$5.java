package com.tencent.mm.ui.widget.textview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$5
  implements Runnable
{
  a$5(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113121);
    ai.d("SelectableTextHelper", "dismiss all runnable.", new Object[0]);
    if (this.zWL.zWJ != null)
      this.zWL.zWJ.dHp();
    AppMethodBeat.o(113121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.5
 * JD-Core Version:    0.6.2
 */
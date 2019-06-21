package com.tencent.mm.emoji.view;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class InsectFrameLayout$a
  implements Runnable
{
  InsectFrameLayout$a(InsectFrameLayout paramInsectFrameLayout, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63317);
    this.eAs.setPadding(this.eAs.getPaddingLeft(), this.eAs.getPaddingTop(), this.eAs.getPaddingRight(), this.eAt);
    this.eAs.requestLayout();
    AppMethodBeat.o(63317);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.view.InsectFrameLayout.a
 * JD-Core Version:    0.6.2
 */
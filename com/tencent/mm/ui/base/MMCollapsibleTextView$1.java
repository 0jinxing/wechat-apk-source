package com.tencent.mm.ui.base;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMCollapsibleTextView$1
  implements View.OnClickListener
{
  MMCollapsibleTextView$1(MMCollapsibleTextView paramMMCollapsibleTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(106518);
    switch (MMCollapsibleTextView.b(this.ytY).get(MMCollapsibleTextView.a(this.ytY), -1))
    {
    default:
      AppMethodBeat.o(106518);
      return;
    case 1:
      MMCollapsibleTextView.b(this.ytY).put(MMCollapsibleTextView.a(this.ytY), 2);
    case 2:
    }
    while (true)
    {
      MMCollapsibleTextView.c(this.ytY);
      AppMethodBeat.o(106518);
      break;
      MMCollapsibleTextView.b(this.ytY).put(MMCollapsibleTextView.a(this.ytY), 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMCollapsibleTextView.1
 * JD-Core Version:    0.6.2
 */
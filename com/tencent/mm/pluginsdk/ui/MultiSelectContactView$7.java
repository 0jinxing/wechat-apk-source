package com.tencent.mm.pluginsdk.ui;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MultiSelectContactView$7
  implements Runnable
{
  MultiSelectContactView$7(MultiSelectContactView paramMultiSelectContactView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105164);
    MultiSelectContactView.j(this.vii).scrollTo(MultiSelectContactView.h(this.vii).getMeasuredWidth(), 0);
    AppMethodBeat.o(105164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MultiSelectContactView.7
 * JD-Core Version:    0.6.2
 */
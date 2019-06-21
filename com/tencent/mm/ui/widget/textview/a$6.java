package com.tencent.mm.ui.widget.textview;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$6
  implements View.OnAttachStateChangeListener
{
  a$6(a parama)
  {
  }

  public final void onViewAttachedToWindow(View paramView)
  {
    AppMethodBeat.i(113122);
    ai.d("SelectableTextHelper", "onViewAttachedToWindow", new Object[0]);
    AppMethodBeat.o(113122);
  }

  public final void onViewDetachedFromWindow(View paramView)
  {
    AppMethodBeat.i(113123);
    ai.d("SelectableTextHelper", "onViewDetachedFromWindow", new Object[0]);
    this.zWL.destroy();
    AppMethodBeat.o(113123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.6
 * JD-Core Version:    0.6.2
 */
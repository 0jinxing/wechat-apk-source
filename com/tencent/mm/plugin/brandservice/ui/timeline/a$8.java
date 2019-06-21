package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.q;

final class a$8
  implements View.OnLongClickListener
{
  a$8(a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(14105);
    this.jNG.jNl = ((q)paramView.getTag());
    this.jNG.jNn = 0;
    a.e(this.jNG).a(paramView, this.jNG, a.b(this.jNG), a.c(this.jNG), a.d(this.jNG));
    AppMethodBeat.o(14105);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.8
 * JD-Core Version:    0.6.2
 */
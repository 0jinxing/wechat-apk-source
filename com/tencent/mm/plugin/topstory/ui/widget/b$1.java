package com.tencent.mm.plugin.topstory.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb, b.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2227);
    if (b.a(this.sHX).isEmpty())
      b.a(this.sHX).add(b.b(this.sHX));
    this.sHW.j(b.a(this.sHX));
    this.sHX.dismiss();
    AppMethodBeat.o(2227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.b.1
 * JD-Core Version:    0.6.2
 */
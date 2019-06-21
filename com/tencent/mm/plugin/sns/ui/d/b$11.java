package com.tencent.mm.plugin.sns.ui.d;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class b$11
  implements View.OnClickListener
{
  b$11(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40258);
    h.a(this.rKt.activity, 2131303818, 2131297061, 2131296881, 2131296868, new b.11.1(this, paramView), null);
    AppMethodBeat.o(40258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.11
 * JD-Core Version:    0.6.2
 */
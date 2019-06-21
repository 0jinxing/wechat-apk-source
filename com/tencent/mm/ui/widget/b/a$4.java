package com.tencent.mm.ui.widget.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.o;

final class a$4
  implements View.OnClickListener
{
  a$4(a parama, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112758);
    if (a.b(this.zSe) != null)
      a.b(this.zSe).onMMMenuItemSelected(a.a(this.zSe).getItem(this.sN), this.sN);
    a.d(this.zSe).dismiss();
    AppMethodBeat.o(112758);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.a.4
 * JD-Core Version:    0.6.2
 */
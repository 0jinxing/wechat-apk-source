package com.tencent.mm.ui.widget.picker;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112808);
    a.a(this.zSk, true, a.a(this.zSk).getYear(), a.a(this.zSk).getMonth(), a.a(this.zSk).getDayOfMonth());
    this.zSk.hide();
    AppMethodBeat.o(112808);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.a.1
 * JD-Core Version:    0.6.2
 */
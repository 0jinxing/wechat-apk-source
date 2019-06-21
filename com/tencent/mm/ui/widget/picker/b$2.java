package com.tencent.mm.ui.widget.picker;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112821);
    b localb = this.zSr;
    if (b.b(this.zSr) == null);
    for (paramView = null; ; paramView = b.b(this.zSr).aRK())
    {
      if (b.a(this.zSr) != null)
        b.a(this.zSr).aRK();
      b.a(localb, true, paramView);
      AppMethodBeat.o(112821);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.b.2
 * JD-Core Version:    0.6.2
 */
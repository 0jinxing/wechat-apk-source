package com.tencent.mm.ui.i;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(80359);
    b.a(this.zLi).onCancel();
    this.zLi.dismiss();
    AppMethodBeat.o(80359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.b.1
 * JD-Core Version:    0.6.2
 */
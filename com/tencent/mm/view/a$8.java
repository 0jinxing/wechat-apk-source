package com.tencent.mm.view;

import android.widget.Switch;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.view.footer.SelectColorBar.a;

final class a$8
  implements SelectColorBar.a
{
  a$8(a parama)
  {
  }

  public final void Qy(int paramInt)
  {
    AppMethodBeat.i(116379);
    if (a.c(this.zZU).isChecked())
    {
      a.c(this.zZU).setTag(Integer.valueOf(paramInt));
      a.b(this.zZU).setTextBackground(paramInt);
      AppMethodBeat.o(116379);
    }
    while (true)
    {
      return;
      a.b(this.zZU).setTextColor(paramInt);
      AppMethodBeat.o(116379);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.8
 * JD-Core Version:    0.6.2
 */
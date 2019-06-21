package com.tencent.mm.plugin.emoji.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.i.a;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama, i.a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(52714);
    if (this.kRT.a(this.kRS, paramView))
      this.kRT.b(this.kRS, paramView);
    AppMethodBeat.o(52714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.1
 * JD-Core Version:    0.6.2
 */
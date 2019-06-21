package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a$1
  implements View.OnClickListener
{
  c$a$1(c.a parama, c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13698);
    if (c.f(this.gtK.gtC) != null)
      c.f(this.gtK.gtC).c(this.gtK.gtF, this.gtK.cvZ, this.gtK.status);
    AppMethodBeat.o(13698);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.c.a.1
 * JD-Core Version:    0.6.2
 */
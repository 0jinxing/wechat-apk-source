package com.tencent.mm.plugin.shake.c.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24548);
    if (paramView.getId() == 2131827470)
    {
      this.qtg.dismiss();
      if (a.a(this.qtg) != null)
        a.a(this.qtg).ckg();
      ab.i("MicroMsg.ShakeCardDialog", "close ShakeCardDialog");
      AppMethodBeat.o(24548);
    }
    while (true)
    {
      return;
      if (paramView.getId() == 2131821929)
      {
        if (a.b(this.qtg) == a.a.qti)
        {
          a.a(this.qtg, a.a.qtj);
          a.a(this.qtg, 0);
          a.c(this.qtg);
          a.d(this.qtg);
          AppMethodBeat.o(24548);
        }
        else if (a.b(this.qtg) != a.a.qtj)
        {
          if (a.b(this.qtg) == a.a.qtl)
          {
            a.d(this.qtg);
            AppMethodBeat.o(24548);
            continue;
          }
          if (a.b(this.qtg) == a.a.qtk)
          {
            com.tencent.mm.sdk.b.a.xxA.c(a.e(this.qtg));
            a.f(this.qtg);
          }
        }
      }
      else
        AppMethodBeat.o(24548);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.b.a.2
 * JD-Core Version:    0.6.2
 */
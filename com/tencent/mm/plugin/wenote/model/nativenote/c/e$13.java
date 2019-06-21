package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.a.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class e$13
  implements View.OnClickListener
{
  public e$13(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26870);
    ab.i("NoteSelectManager", "select all");
    this.uRO.dfh();
    if (!e.dfx())
    {
      ab.e("NoteSelectManager", "select all: not init");
      AppMethodBeat.o(26870);
    }
    int i;
    int j;
    while (true)
    {
      return;
      i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dex();
      j = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dey();
      paramView = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(i);
      com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(j);
      if ((paramView == null) || (localc == null))
      {
        ab.e("NoteSelectManager", "select all: item is null");
        e.h(this.uRO);
        AppMethodBeat.o(26870);
      }
      else
      {
        if (localc.getType() != 1)
          break label225;
        paramView = a.ahb(((i)localc).content);
        if (paramView != null)
          break;
        ab.e("NoteSelectManager", "select all: spanned is null");
        e.h(this.uRO);
        AppMethodBeat.o(26870);
      }
    }
    label225: for (int k = paramView.length(); ; k = 1)
    {
      e.e(this.uRO);
      this.uRO.H(i, 0, j, k);
      this.uRO.dfj();
      this.uRO.dfh();
      e.j(this.uRO);
      this.uRO.oq(false);
      this.uRO.oo(false);
      AppMethodBeat.o(26870);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e.13
 * JD-Core Version:    0.6.2
 */
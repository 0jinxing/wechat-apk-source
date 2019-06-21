package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class e$2
  implements View.OnClickListener
{
  public e$2(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26859);
    ab.i("NoteSelectManager", "delete");
    if ((!e.dfx()) || (!e.k(this.uRO)))
    {
      ab.e("NoteSelectManager", "delete: not init or not editable");
      this.uRO.dfh();
      AppMethodBeat.o(26859);
    }
    while (true)
    {
      return;
      if (e.l(this.uRO))
      {
        if (e.m(this.uRO) != null)
          e.m(this.uRO).ddY();
        AppMethodBeat.o(26859);
      }
      else if (e.m(this.uRO) != null)
      {
        e.m(this.uRO).ddZ();
        AppMethodBeat.o(26859);
      }
      else
      {
        this.uRO.dfp();
        AppMethodBeat.o(26859);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e.2
 * JD-Core Version:    0.6.2
 */
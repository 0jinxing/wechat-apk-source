package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;

public final class a$b extends a.c
{
  public a$b(a parama)
  {
    super(parama);
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(29930);
    super.a(paraml);
    paraml.e(3, this.yrl.context.getString(2131296833));
    paraml.e(8, this.yrl.context.getString(2131296829));
    paraml.e(7, a.a(this.yrl));
    AppMethodBeat.o(29930);
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(29931);
    super.onMMMenuItemSelected(paramMenuItem, paramInt);
    AppMethodBeat.o(29931);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.a.b
 * JD-Core Version:    0.6.2
 */
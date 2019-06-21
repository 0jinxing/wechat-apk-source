package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.v;

public final class a$g extends a.c
{
  public a$g(a parama)
  {
    super(parama);
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(29943);
    super.a(paraml);
    paraml.e(6, this.yrl.context.getString(2131296716));
    paraml.e(4, this.yrl.context.getString(2131296828));
    AppMethodBeat.o(29943);
  }

  public final View dzm()
  {
    AppMethodBeat.i(29942);
    View localView = v.hu(this.yrl.context).inflate(2130969013, null);
    ((TextView)localView.findViewById(2131822396)).setText(this.yrl.context.getString(2131296832));
    AppMethodBeat.o(29942);
    return localView;
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(29944);
    super.onMMMenuItemSelected(paramMenuItem, paramInt);
    AppMethodBeat.o(29944);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.a.g
 * JD-Core Version:    0.6.2
 */
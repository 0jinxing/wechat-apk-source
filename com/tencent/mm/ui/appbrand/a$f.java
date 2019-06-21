package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.v;

public final class a$f extends a.c
{
  public a$f(a parama)
  {
    super(parama);
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(29940);
    super.a(paraml);
    paraml.e(5, this.yrl.context.getString(2131296715));
    paraml.e(4, this.yrl.context.getString(2131296828));
    AppMethodBeat.o(29940);
  }

  public final View dzm()
  {
    AppMethodBeat.i(29939);
    View localView = v.hu(this.yrl.context).inflate(2130969013, null);
    ((TextView)localView.findViewById(2131822396)).setText(this.yrl.context.getString(2131296830));
    AppMethodBeat.o(29939);
    return localView;
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(29941);
    super.onMMMenuItemSelected(paramMenuItem, paramInt);
    AppMethodBeat.o(29941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.a.f
 * JD-Core Version:    0.6.2
 */
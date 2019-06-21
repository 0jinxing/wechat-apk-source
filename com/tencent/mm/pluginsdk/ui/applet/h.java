package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class h
  implements i
{
  public final o a(q paramq, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, q.a parama)
  {
    AppMethodBeat.i(27711);
    paramq = g.a(paramq, paramString1, paramString2, paramString3, paramString4, paramString5, parama);
    AppMethodBeat.o(27711);
    return paramq;
  }

  public final c a(Context paramContext, String paramString1, View paramView, String paramString2, q.a parama)
  {
    AppMethodBeat.i(27714);
    paramContext = new g.a(paramContext).cx(paramString1).ev(paramView).h(Boolean.TRUE).djy();
    paramContext.vkn = paramString2;
    paramContext = paramContext.a(parama).gud;
    AppMethodBeat.o(27714);
    return paramContext;
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, q.a parama)
  {
    AppMethodBeat.i(27716);
    paramContext = new g.a(paramContext);
    paramContext.cx(paramString1);
    paramContext.ajE(paramString2);
    paramContext.h(Boolean.TRUE);
    paramContext.vkn = paramString3;
    paramContext.a(parama).gud.show();
    AppMethodBeat.o(27716);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, q.a parama)
  {
    AppMethodBeat.i(27715);
    paramContext = new g.a(paramContext);
    paramContext.cx(paramString1).ajC(paramString2).vkn = paramString3;
    paramContext.ajD(paramString5).djx();
    paramContext.vkm.asH(paramString4);
    paramContext.a(parama).gud.show();
    AppMethodBeat.o(27715);
  }

  public final void a(q paramq, String paramString1, String paramString2, String paramString3, q.a parama)
  {
    AppMethodBeat.i(27712);
    g.a(paramq, paramString1, paramString2, paramString3, parama);
    AppMethodBeat.o(27712);
  }

  public final c b(q paramq, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, q.a parama)
  {
    AppMethodBeat.i(27713);
    paramq = g.b(paramq, paramString1, paramString2, paramString3, paramString4, paramString5, parama);
    AppMethodBeat.o(27713);
    return paramq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.h
 * JD-Core Version:    0.6.2
 */
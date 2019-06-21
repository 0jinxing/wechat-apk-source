package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import android.graphics.Paint.Style;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.r.g;

public final class e extends b
{
  private static e hdC;

  static
  {
    AppMethodBeat.i(103640);
    hdC = new e();
    AppMethodBeat.o(103640);
  }

  public static e ayl()
  {
    return hdC;
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(103638);
    parama.reset();
    parama.release();
    parama.setStyle(Paint.Style.FILL);
    parama.setAntiAlias(true);
    parama.setStrokeWidth(g.qb(1));
    super.a(parama);
    AppMethodBeat.o(103638);
  }

  public final a ayi()
  {
    AppMethodBeat.i(103639);
    a locala = new a();
    locala.setStyle(Paint.Style.FILL);
    locala.setAntiAlias(true);
    locala.setStrokeWidth(g.qb(1));
    AppMethodBeat.o(103639);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.e
 * JD-Core Version:    0.6.2
 */
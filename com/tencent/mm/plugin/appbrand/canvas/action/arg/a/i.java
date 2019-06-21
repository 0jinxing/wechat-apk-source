package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import android.graphics.Paint.Style;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.r.g;

public final class i extends b
{
  public static final i hdG;

  static
  {
    AppMethodBeat.i(103649);
    hdG = new i();
    AppMethodBeat.o(103649);
  }

  public static i ayp()
  {
    return hdG;
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(103647);
    parama.reset();
    parama.release();
    parama.setStyle(Paint.Style.STROKE);
    parama.setAntiAlias(true);
    parama.setStrokeWidth(g.qb(1));
    super.a(parama);
    AppMethodBeat.o(103647);
  }

  public final a ayi()
  {
    AppMethodBeat.i(103648);
    a locala = new a();
    locala.setStyle(Paint.Style.STROKE);
    locala.setAntiAlias(true);
    locala.setStrokeWidth(g.qb(1));
    AppMethodBeat.o(103648);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.i
 * JD-Core Version:    0.6.2
 */
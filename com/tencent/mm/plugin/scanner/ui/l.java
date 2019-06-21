package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Point;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.k;

public final class l extends c
{
  public l(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint, paramDisplayMetrics, paramInt);
  }

  protected final b a(b.a parama)
  {
    AppMethodBeat.i(81182);
    parama = new k(parama, 2);
    AppMethodBeat.o(81182);
    return parama;
  }

  protected final float cgK()
  {
    return 1.467F;
  }

  protected final String cgL()
  {
    return "driving";
  }

  protected final int cgM()
  {
    return 2131302730;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.l
 * JD-Core Version:    0.6.2
 */
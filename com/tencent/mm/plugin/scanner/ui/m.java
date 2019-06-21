package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Point;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.k;

public class m extends c
{
  public m(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint, paramDisplayMetrics, paramInt);
  }

  protected final b a(b.a parama)
  {
    AppMethodBeat.i(81183);
    parama = new k(parama, 1);
    AppMethodBeat.o(81183);
    return parama;
  }

  protected final float cgK()
  {
    return 1.586F;
  }

  protected final String cgL()
  {
    return "identity";
  }

  protected final int cgM()
  {
    return 2131302731;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.m
 * JD-Core Version:    0.6.2
 */
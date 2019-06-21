package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$d
{
  int cBc;
  String csB;
  int gVu;
  String hlE;
  boolean isLoading;
  boolean udi;

  private a$d(a parama)
  {
  }

  public final String toString()
  {
    AppMethodBeat.i(91406);
    String str = String.format("WidgetInfo appid %s, widgetId %s, pkgType %d, pkgVer %d", new Object[] { this.csB, this.hlE, Integer.valueOf(this.cBc), Integer.valueOf(this.gVu) });
    AppMethodBeat.o(91406);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class FavSearchUI$a
{
  int actionType;
  int jSW;
  long meT;
  int mjx;
  int mjy;
  boolean mjz = false;
  int position;
  String query;
  int scene;

  public final void IF()
  {
    AppMethodBeat.i(74084);
    h.pYm.e(15488, new Object[] { Integer.valueOf(this.actionType), Integer.valueOf(this.jSW), Integer.valueOf(this.scene), Integer.valueOf(this.position), Integer.valueOf(this.mjx), this.query, Long.valueOf(this.meT), Integer.valueOf(this.mjy) });
    AppMethodBeat.o(74084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.base;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMHorList$2 extends DataSetObserver
{
  MMHorList$2(MMHorList paramMMHorList)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(106654);
    MMHorList.a(this.yvH);
    this.yvH.invalidate();
    this.yvH.requestLayout();
    AppMethodBeat.o(106654);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(106655);
    MMHorList.b(this.yvH);
    this.yvH.invalidate();
    this.yvH.requestLayout();
    AppMethodBeat.o(106655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMHorList.2
 * JD-Core Version:    0.6.2
 */
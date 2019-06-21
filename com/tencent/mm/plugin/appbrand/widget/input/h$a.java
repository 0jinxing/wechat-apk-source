package com.tencent.mm.plugin.appbrand.widget.input;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aj;

final class h$a
{
  final SparseIntArray jdK;

  private h$a()
  {
    AppMethodBeat.i(123619);
    this.jdK = new SparseIntArray();
    AppMethodBeat.o(123619);
  }

  final void a(aj paramaj, int paramInt)
  {
    AppMethodBeat.i(123621);
    this.jdK.put(paramaj.hashCode(), paramInt);
    AppMethodBeat.o(123621);
  }

  final int e(aj paramaj)
  {
    AppMethodBeat.i(123620);
    int i = this.jdK.get(paramaj.hashCode(), 0);
    AppMethodBeat.o(123620);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.h.a
 * JD-Core Version:    0.6.2
 */
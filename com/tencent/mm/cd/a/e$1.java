package com.tencent.mm.cd.a;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1 extends DataSetObserver
{
  e$1(e parame)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(59146);
    e.a(this.yct);
    AppMethodBeat.o(59146);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(59147);
    e.b(this.yct);
    AppMethodBeat.o(59147);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.e.1
 * JD-Core Version:    0.6.2
 */
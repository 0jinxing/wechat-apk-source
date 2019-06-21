package com.tencent.mm.plugin.qqmail.b;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;

final class v$b extends AsyncTask<v.d, Integer, v.d>
  implements n.a
{
  private n puL;
  v.d puM;

  private v$b(v paramv)
  {
  }

  public final boolean b(v.d paramd)
  {
    boolean bool = false;
    AppMethodBeat.i(67995);
    if (!paramd.puV.onReady())
      AppMethodBeat.o(67995);
    while (true)
    {
      return bool;
      this.puM = paramd;
      super.execute(new v.d[] { paramd });
      AppMethodBeat.o(67995);
      bool = true;
    }
  }

  public final void ccp()
  {
    AppMethodBeat.i(67996);
    publishProgress(new Integer[] { Integer.valueOf(0) });
    AppMethodBeat.o(67996);
  }

  protected final void onCancelled()
  {
    AppMethodBeat.i(67997);
    g.RQ();
    g.RS().aa(new v.b.1(this));
    super.onCancelled();
    AppMethodBeat.o(67997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.v.b
 * JD-Core Version:    0.6.2
 */
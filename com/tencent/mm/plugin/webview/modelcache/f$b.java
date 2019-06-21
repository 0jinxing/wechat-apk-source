package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$b<T>
{
  final byte[] eMl;
  final SparseArray<T> unQ;

  public f$b()
  {
    AppMethodBeat.i(6829);
    this.eMl = new byte[0];
    this.unQ = new SparseArray();
    AppMethodBeat.o(6829);
  }

  public final void remove(int paramInt)
  {
    AppMethodBeat.i(6831);
    this.unQ.remove(paramInt);
    AppMethodBeat.o(6831);
  }

  public final T valueAt(int paramInt)
  {
    AppMethodBeat.i(6830);
    Object localObject = this.unQ.valueAt(paramInt);
    AppMethodBeat.o(6830);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.f.b
 * JD-Core Version:    0.6.2
 */
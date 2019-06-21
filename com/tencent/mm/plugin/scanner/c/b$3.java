package com.tencent.mm.plugin.scanner.c;

import android.arch.lifecycle.MutableLiveData;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3
  implements Runnable
{
  b$3(b paramb, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138720);
    b.b(this.qiV).setValue(new Pair(this.qiW, Integer.valueOf(this.fLS)));
    AppMethodBeat.o(138720);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.c.b.3
 * JD-Core Version:    0.6.2
 */
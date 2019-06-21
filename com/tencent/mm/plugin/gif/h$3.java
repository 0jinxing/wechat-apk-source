package com.tencent.mm.plugin.gif;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$3
  implements Runnable
{
  h$3(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62427);
    h.a(this.npu, -1);
    MMWXGFJNI.nativeRewindBuffer(h.g(this.npu));
    h.a(this.npu, h.e(this.npu), 0L);
    AppMethodBeat.o(62427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.h.3
 * JD-Core Version:    0.6.2
 */
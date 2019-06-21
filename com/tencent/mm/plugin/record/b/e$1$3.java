package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.pluginsdk.model.app.b;

final class e$1$3
  implements Runnable
{
  e$1$3(e.1 param1, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135647);
    this.pJs.pJr.ehi.onSceneEnd(3, this.kDE, "attach  has paused, status=" + this.pJs.pJr.pJj.field_status, this.pJs.pJr);
    AppMethodBeat.o(135647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.e.1.3
 * JD-Core Version:    0.6.2
 */
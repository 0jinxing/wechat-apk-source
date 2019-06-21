package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.h;
import java.util.Map;
import java.util.Queue;

final class e$3
  implements Runnable
{
  e$3(e parame, h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50560);
    this.fzs.fyK.add(this.fzt.field_mediaId);
    this.fzs.fyL.put(this.fzt.field_mediaId, this.fzt);
    this.fzs.cK(false);
    AppMethodBeat.o(50560);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e.3
 * JD-Core Version:    0.6.2
 */
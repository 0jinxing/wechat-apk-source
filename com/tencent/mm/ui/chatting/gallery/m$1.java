package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.u;

final class m$1
  implements Runnable
{
  m$1(m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32452);
    if (this.yXZ.yXX != null)
    {
      int i = u.A(this.yXZ.fUR, this.yXZ.filename);
      if (this.yXZ.mm(i))
      {
        if ((this.yXZ.rlF == 0) && (this.yXZ.rlH == 0L))
          this.yXZ.cso();
        this.yXZ.yXX.bq(this.yXZ.filename, true);
        this.yXZ.fUX = true;
      }
    }
    AppMethodBeat.o(32452);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.m.1
 * JD-Core Version:    0.6.2
 */
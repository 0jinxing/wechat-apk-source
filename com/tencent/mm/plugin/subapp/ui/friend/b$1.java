package com.tencent.mm.plugin.subapp.ui.friend;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.storage.aw;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25345);
    b.a(this.stz, d.akP().baR());
    this.stz.notifyDataSetChanged();
    AppMethodBeat.o(25345);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.b.1
 * JD-Core Version:    0.6.2
 */
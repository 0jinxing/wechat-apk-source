package com.tencent.mm.plugin.voip_cs.b.a;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;

final class b$b
  implements Runnable
{
  b$b(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135328);
    this.tet.tes = b.acf(this.tet.ter);
    Message localMessage = new Message();
    localMessage.what = 12;
    b.t(this.tet).sendMessage(localMessage);
    d.xDG.remove(this.tet.teq);
    AppMethodBeat.o(135328);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.b
 * JD-Core Version:    0.6.2
 */
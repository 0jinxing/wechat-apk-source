package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;

final class ReadMailUI$1
  implements Runnable
{
  ReadMailUI$1(ReadMailUI paramReadMailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68419);
    ReadMailUI.q(this.pzZ);
    if (ReadMailUI.r(this.pzZ) == 0)
    {
      ReadMailUI.s(this.pzZ);
      if (!ReadMailUI.t(this.pzZ))
        ReadMailUI.u(this.pzZ);
      ReadMailUI.a(this.pzZ, new ReadMailProxy(ReadMailUI.l(this.pzZ), null, new ReadMailUI.b(this.pzZ), new ReadMailUI.c(this.pzZ)));
      ReadMailUI.v(this.pzZ).REMOTE_CALL("addDownloadCallback", new Object[0]);
    }
    AppMethodBeat.o(68419);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.1
 * JD-Core Version:    0.6.2
 */
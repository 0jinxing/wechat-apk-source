package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ap.a;

final class ReadMailUI$4
  implements ap.a
{
  ReadMailUI$4(ReadMailUI paramReadMailUI)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(68423);
    if (!ReadMailUI.l(this.pzZ).isConnected())
      AppMethodBeat.o(68423);
    double d;
    while (true)
    {
      return bool;
      d = ((Double)new ReadMailProxy(ReadMailUI.l(this.pzZ), null).REMOTE_CALL("getMailAppDownloadProgress", new Object[] { Long.valueOf(ReadMailUI.B(this.pzZ)) })).doubleValue();
      if (d != 1.0D)
        break;
      ReadMailUI.t(this.pzZ);
      AppMethodBeat.o(68423);
    }
    if (ReadMailUI.N(this.pzZ) == 0)
      ReadMailUI.c(this.pzZ, ReadMailUI.O(this.pzZ).getWidth());
    for (int i = 0; ; i = (int)(ReadMailUI.N(this.pzZ) * d))
    {
      ReadMailUI.b(this.pzZ, i);
      AppMethodBeat.o(68423);
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.4
 * JD-Core Version:    0.6.2
 */
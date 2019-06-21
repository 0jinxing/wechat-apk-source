package com.tencent.mm.ui.applet;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class b$1
  implements MessageQueue.IdleHandler
{
  b$1(b paramb)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(106223);
    while (this.yrE.yrC.size() > 0)
    {
      String str = (String)this.yrE.yrC.removeFirst();
      this.yrE.yrD.wd(str);
    }
    AppMethodBeat.o(106223);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.b.1
 * JD-Core Version:    0.6.2
 */
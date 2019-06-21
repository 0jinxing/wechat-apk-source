package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class o$1$1
  implements Runnable
{
  o$1$1(o.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34707);
    String str = com.tencent.mm.sdk.platformtools.o.cc((Context)this.zxh.zxg.vlu.get());
    ab.i("MicroMsg.NetWarnView", "curr top activity is: %s", new Object[] { str });
    int i;
    if (!str.endsWith("NetworkDiagnoseAllInOneUI"))
    {
      if (!this.zxh.zxg.zwZ)
        break label81;
      i = 2;
    }
    while (true)
    {
      o.a(this.zxh.zxg, i);
      AppMethodBeat.o(34707);
      return;
      label81: if (this.zxh.zxg.zxa)
        i = 4;
      else if (this.zxh.zxg.zxb)
        i = 5;
      else
        i = 3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.o.1.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.notification.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.f;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class a$1$1
  implements Runnable
{
  a$1$1(a.1 param1, String paramString)
  {
  }

  public final void run()
  {
    final int i = 0;
    AppMethodBeat.i(23093);
    if (!g.RN().QY())
    {
      ab.w("MicroMsg.NotificationObserver", "account not init.");
      AppMethodBeat.o(23093);
      return;
    }
    final int j = f.Nr();
    aw.ZK();
    ad localad = c.XM().aoO(this.oVp);
    final boolean bool;
    if (localad == null)
    {
      bool = false;
      label59: if (!bool)
        break label97;
    }
    while (true)
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(23092);
          aw.getNotification().ik(j);
          if (!bool)
            aw.getNotification().y(a.1.1.this.oVp, i);
          ab.i("MicroMsg.NotificationObserver", "NotificationObserver refresh total badge count: %d, and talker badge count: %d, talker is mute: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool) });
          d.post(new a.1.1.1.1(this), "NotificationObserver");
          AppMethodBeat.o(23092);
        }
      });
      AppMethodBeat.o(23093);
      break;
      bool = localad.DX();
      break label59;
      label97: i = f.kF(this.oVp);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.a.a.1.1
 * JD-Core Version:    0.6.2
 */
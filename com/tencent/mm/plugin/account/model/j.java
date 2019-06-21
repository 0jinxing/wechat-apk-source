package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.pluginsdk.g.a.a.b;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.HashMap;

public class j
  implements at
{
  private static int fVL = 0;
  public static j.a gyR = j.a.gyX;
  private static ap gyS = null;
  private a gyQ;
  private o gyT;
  private c gyU;

  public j()
  {
    AppMethodBeat.i(124706);
    this.gyT = new j.2(this);
    this.gyU = new j.3(this);
    AppMethodBeat.o(124706);
  }

  public static void a(j.a parama)
  {
    AppMethodBeat.i(124709);
    gyR = parama;
    switch (j.4.gyW[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(124709);
      while (true)
      {
        return;
        fVL = 0;
        if (gyS == null)
          gyS = new ap(new j.1(), true);
        ab.d("MicroMsg.SubCoreAccountSync", "[oneliang][SmsVerifyCodeState]Sent");
        gyS.ae(900000L, 900000L);
        AppMethodBeat.o(124709);
      }
      if (gyS != null)
        gyS.stopTimer();
      ab.d("MicroMsg.SubCoreAccountSync", "[oneliang][SmsVerifyCodeState]verified");
      gyR = j.a.gyX;
      ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(36);
      fVL = 0;
      gyS = null;
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(124708);
    this.gyQ = new a();
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("ChangeLaunchImage", this.gyT);
    this.gyU.dnU();
    b.c.dif();
    b.Ky(43);
    AppMethodBeat.o(124708);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(124707);
    a locala = this.gyQ;
    com.tencent.mm.sdk.b.a.xxA.d(locala.gyA);
    this.gyQ = null;
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("ChangeLaunchImage", this.gyT);
    this.gyU.dead();
    AppMethodBeat.o(124707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.j
 * JD-Core Version:    0.6.2
 */
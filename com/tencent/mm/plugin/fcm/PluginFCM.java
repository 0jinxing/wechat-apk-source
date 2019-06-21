package com.tencent.mm.plugin.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public class PluginFCM extends f
  implements com.tencent.mm.plugin.fcm.a.a
{
  private static boolean mqD = true;
  c mqE;
  c mqF;

  public PluginFCM()
  {
    AppMethodBeat.i(56446);
    this.mqE = new PluginFCM.1(this);
    this.mqF = new PluginFCM.2(this);
    AppMethodBeat.o(56446);
  }

  private boolean handleLogin()
  {
    boolean bool = false;
    AppMethodBeat.i(56450);
    if (!com.tencent.mm.kernel.g.RK())
    {
      ab.w("MicroMsg.FCM.PluginFCM", "accout not ready");
      AppMethodBeat.o(56450);
    }
    while (true)
    {
      return bool;
      a locala = a.bwG();
      if (locala != null)
      {
        String str;
        if (locala.bwH())
        {
          ab.i("MicroMsg.FCM.FcmRegister", "Google Play Services is avaiable," + Long.toString(Thread.currentThread().getId()));
          com.google.firebase.a.ak(locala.context);
          com.google.firebase.messaging.a.va().bwi.uM();
          str = FirebaseInstanceId.uD().getToken();
          if (str == null)
            ab.w("MicroMsg.FCM.FcmRegister", "token is null, not ready");
        }
        while (true)
        {
          bool = true;
          AppMethodBeat.o(56450);
          break;
          locala.Mk(str);
          continue;
          ab.w("MicroMsg.FCM.FcmRegister", "Google Play Services Unavaiable");
          h.pYm.X(11250, "2,0");
          e.pXa.a(901L, 0L, 1L, false);
          if (locala.bwJ())
            locala.bwI();
        }
      }
      AppMethodBeat.o(56450);
    }
  }

  private boolean handleLogout()
  {
    boolean bool = false;
    AppMethodBeat.i(56451);
    a locala = a.bwG();
    if (locala != null)
    {
      ab.i("MicroMsg.FCM.FcmRegister", "FCM onLogout. isRegToSvr:" + locala.bwJ());
      WCFirebaseMessagingService.bwL();
      if (locala.bwJ())
      {
        locala.bwI();
        bool = true;
        AppMethodBeat.o(56451);
      }
    }
    while (true)
    {
      return bool;
      e.pXa.a(901L, 20L, 1L, false);
      break;
      AppMethodBeat.o(56451);
    }
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(56448);
    super.configure(paramg);
    AppMethodBeat.o(56448);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(56449);
    if (paramg.SG())
    {
      ab.i("MicroMsg.FCM.PluginFCM", "register listener at " + paramg.eHT);
      if (d.e(paramg))
      {
        mqD = false;
        AppMethodBeat.o(56449);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.b.a.xxA.b(this.mqE);
      com.tencent.mm.sdk.b.a.xxA.b(this.mqF);
      AppMethodBeat.o(56449);
    }
  }

  public void installed()
  {
    AppMethodBeat.i(56447);
    super.installed();
    alias(com.tencent.mm.plugin.fcm.a.a.class);
    AppMethodBeat.o(56447);
  }

  public String name()
  {
    return "plugin-fcm";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fcm.PluginFCM
 * JD-Core Version:    0.6.2
 */
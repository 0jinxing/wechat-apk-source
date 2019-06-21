package com.tencent.mm.plugin.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

public class FCMInstanceIDListenerService extends FirebaseInstanceIdService
{
  public final void onTokenRefresh()
  {
    AppMethodBeat.i(56426);
    String str = FirebaseInstanceId.uD().getToken();
    ab.i("MicroMsg.FCM.FCMInstanceIDListenerService", "Refreshed token: ".concat(String.valueOf(str)));
    g.RN();
    if (com.tencent.mm.kernel.a.QX())
    {
      a locala = a.bwG();
      if (locala != null)
      {
        locala.Mk(str);
        AppMethodBeat.o(56426);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.FCM.FCMInstanceIDListenerService", "fcmRegister null, not reg token");
      AppMethodBeat.o(56426);
      continue;
      ab.w("MicroMsg.FCM.FCMInstanceIDListenerService", "User is not logined, not reg token");
      AppMethodBeat.o(56426);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fcm.FCMInstanceIDListenerService
 * JD-Core Version:    0.6.2
 */
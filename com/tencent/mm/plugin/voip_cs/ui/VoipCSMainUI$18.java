package com.tencent.mm.plugin.voip_cs.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap.a;

final class VoipCSMainUI$18
  implements ap.a
{
  VoipCSMainUI$18(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(135406);
    Object localObject = new Intent(ah.getContext(), VoipCSMainUI.class);
    PendingIntent localPendingIntent = PendingIntent.getActivity(ah.getContext(), 44, (Intent)localObject, 134217728);
    localObject = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(this.teJ.tickerText).d(this.teJ.title).e(this.teJ.cEh);
    ((v.c)localObject).EI = localPendingIntent;
    ((v.c)localObject).k(2, true);
    localObject = ((v.c)localObject).build();
    ((Notification)localObject).icon = com.tencent.mm.bo.a.bWV();
    ((Notification)localObject).flags |= 32;
    ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().a(44, (Notification)localObject, false);
    AppMethodBeat.o(135406);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.18
 * JD-Core Version:    0.6.2
 */
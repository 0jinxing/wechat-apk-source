package com.tencent.mm.plugin.account.model;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.v.b;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.account.ui.MobileVerifyUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.List;

final class j$1
  implements ap.a
{
  public final boolean BI()
  {
    AppMethodBeat.i(124698);
    j.Fc();
    Object localObject1;
    Object localObject2;
    if ((j.access$000() == 1) || (j.access$000() == 16) || (j.access$000() % 96 == 0))
    {
      localObject1 = ah.getContext();
      localObject2 = ((ActivityManager.RunningTaskInfo)((ActivityManager)((Context)localObject1).getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
      ab.d("MicroMsg.SubCoreAccountSync", "[oneliang][showMobileRegNoVerifyCodeNotification]:%s", new Object[] { ((ComponentName)localObject2).getClassName() });
      if (MobileVerifyUI.class.getName().equals(((ComponentName)localObject2).getClassName()))
        break label255;
    }
    label255: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localObject2 = new Intent((Context)localObject1, MobileVerifyUI.class);
        ((Intent)localObject2).addFlags(2);
        ((Intent)localObject2).addFlags(536870912);
        ((Intent)localObject2).addFlags(67108864);
        PendingIntent localPendingIntent = PendingIntent.getActivity((Context)localObject1, 36, (Intent)localObject2, 1073741824);
        localObject2 = com.tencent.mm.bo.a.bt((Context)localObject1, "reminder_channel_id");
        ((v.c)localObject2).d(((Context)localObject1).getString(2131297025));
        ((v.c)localObject2).as(com.tencent.mm.bo.a.bWV());
        ((v.c)localObject2).j(System.currentTimeMillis());
        ((v.c)localObject2).EI = localPendingIntent;
        localObject1 = new v.b((v.c)localObject2).c(((Context)localObject1).getString(2131301433)).build();
        ((Notification)localObject1).defaults |= 1;
        ((Notification)localObject1).flags |= 16;
        ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().a(36, (Notification)localObject1, false);
      }
      AppMethodBeat.o(124698);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.j.1
 * JD-Core Version:    0.6.2
 */
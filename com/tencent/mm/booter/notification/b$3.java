package com.tencent.mm.booter.notification;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bo.a;
import com.tencent.mm.g.a.qd;
import com.tencent.mm.g.a.qd.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.ChattingUI;
import java.util.List;

final class b$3 extends c<qd>
{
  b$3(b paramb)
  {
    AppMethodBeat.i(15895);
    this.xxI = qd.class.getName().hashCode();
    AppMethodBeat.o(15895);
  }

  private boolean a(qd paramqd)
  {
    AppMethodBeat.i(15896);
    Object localObject1;
    int i;
    if ((paramqd != null) && ((paramqd instanceof qd)))
    {
      localObject1 = paramqd.cMt.cKE;
      i = paramqd.cMt.msgType;
      paramqd = this.edA;
    }
    try
    {
      ab.w("showSendMsgFailNotification fromUserName:%s msgType:%d", (String)localObject1, new Object[] { Integer.valueOf(i) });
      Object localObject2 = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramqd.context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
      if (!ChattingUI.class.getName().equals(((ComponentName)localObject2).getClassName()))
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>(paramqd.context, ChattingUI.class);
        ((Intent)localObject2).putExtra("nofification_type", "pushcontent_notification");
        ((Intent)localObject2).putExtra("Intro_Is_Muti_Talker", true);
        ((Intent)localObject2).putExtra("Chat_User", (String)localObject1);
        ((Intent)localObject2).putExtra("MainUI_User_Last_Msg_Type", i);
        ((Intent)localObject2).addFlags(536870912);
        ((Intent)localObject2).addFlags(67108864);
        localObject2 = PendingIntent.getActivity(paramqd.context, 35, (Intent)localObject2, 1073741824);
        localObject1 = a.bt(paramqd.context, a.dgM()).g(null).j(System.currentTimeMillis()).d(paramqd.context.getString(2131297025)).e(paramqd.context.getString(2131301434));
        ((v.c)localObject1).EI = ((PendingIntent)localObject2);
        localObject1 = ((v.c)localObject1).build();
        ((Notification)localObject1).icon = a.bWV();
        ((Notification)localObject1).defaults |= 1;
        ((Notification)localObject1).flags |= 16;
        paramqd.a(35, (Notification)localObject1, true);
      }
      AppMethodBeat.o(15896);
      return false;
    }
    catch (Exception paramqd)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMNotification", paramqd, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.b.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.bbom;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.a.h;
import com.tencent.mm.booter.notification.c;
import com.tencent.mm.booter.notification.c.a;
import com.tencent.mm.booter.notification.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.LauncherUI;
import java.util.ArrayList;

public final class j
  implements com.tencent.mm.plugin.zero.a.b
{
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(18260);
    String str1 = paramString2;
    if (bo.isNullOrNil(paramString2))
    {
      paramString2 = ah.getContext();
      if (!com.tencent.mm.m.f.kH(paramString1))
        break label160;
      i = 2131298223;
    }
    c localc;
    Context localContext;
    boolean bool1;
    boolean bool2;
    label160: label224: int j;
    while (true)
    {
      str1 = paramString2.getString(i);
      paramString2 = f.a.IO().eeb;
      if (!com.tencent.mm.m.f.MF())
        com.tencent.mm.booter.notification.e.cancel();
      try
      {
        localc = paramString2.edT;
        localContext = ah.getContext();
        ah.getContext();
        bool1 = com.tencent.mm.booter.notification.a.e.IX();
        ah.getContext();
        bool2 = com.tencent.mm.booter.notification.a.e.IV();
        ab.i("MicroMsg.Notification.AppMsg.Handle", "push:isShake: %B, isSound: %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if (paramLong == 0L)
          break label822;
        if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(str1)) || (bo.isNullOrNil(paramString3)))
        {
          ab.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION] Util.isNullOrNil(userName) || Util.isNullOrNil(nickName) || Util.isNullOrNil(content)");
          AppMethodBeat.o(18260);
        }
        while (true)
        {
          return;
          i = 2131300629;
          break;
          if ((!com.tencent.mm.m.f.Nn()) || (com.tencent.mm.m.f.No()))
            break label224;
          ab.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck");
          AppMethodBeat.o(18260);
        }
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          ab.e("MicroMsg.Notification.Handle", "push:notify, error");
          ab.printErrStackTrace("MicroMsg.Notification.Handle", paramString1, "", new Object[0]);
          AppMethodBeat.o(18260);
          continue;
          if (!com.tencent.mm.m.f.MC())
          {
            ab.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION]new MsgNotification setting no notification");
            AppMethodBeat.o(18260);
          }
          else
          {
            if (!c.eS(paramLong))
              break;
            ab.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION]already notify");
            AppMethodBeat.o(18260);
          }
        }
        com.tencent.mm.booter.notification.queue.b.IP().restore();
        j = c.IK() + 1;
        paramString2 = c.a(c.IL(), paramString1);
        if (paramString2 != null)
          break label831;
      }
    }
    int i = 0;
    label299: int k = i + 1;
    Object localObject = c.IL();
    paramString2 = (String)localObject;
    if (localObject == null)
    {
      paramString2 = new java/util/ArrayList;
      paramString2.<init>();
    }
    localObject = c.a(paramString2, paramString1);
    label373: int m;
    int n;
    int i1;
    PendingIntent localPendingIntent;
    String str2;
    if (localObject == null)
    {
      localObject = new com/tencent/mm/booter/notification/c$a;
      ((c.a)localObject).<init>((byte)0);
      ((c.a)localObject).userName = paramString1;
      ((c.a)localObject).edE = 1;
      paramString2.add(localObject);
      c.f(paramString2);
      c.im(c.IK() + 1);
      m = paramString2.size();
      if (com.tencent.mm.booter.notification.a.e.IU())
      {
        bool2 = false;
        bool1 = false;
      }
      localObject = c.IJ();
      n = com.tencent.mm.booter.notification.queue.b.IP().jP(paramString1);
      localc.cfT.eeH = j;
      localc.cfT.eeG = m;
      localc.cfT.eeN = bool1;
      localc.cfT.eeM = bool2;
      boolean bool3 = com.tencent.mm.m.f.MF();
      i1 = com.tencent.mm.bo.a.bWV();
      paramString2 = localc.cfT;
      paramString2.eez.a(paramString2.mContext, bool2, bool1, (Notification)localObject, null);
      i = paramString2.eez.eel;
      ab.i("MicroMsg.NotificationIntent", "[oneliang] notificationId:%s, userName:%s, msgType:%s, unReadMsgCount:%s, unReadTalkerCount:%s, isMuted:%s, isShowDetails:%s", new Object[] { Integer.valueOf(n), paramString1, Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(m), Boolean.FALSE, Boolean.valueOf(bool3) });
      paramString2 = new android/content/Intent;
      paramString2.<init>(localContext, LauncherUI.class);
      paramString2.putExtra("nofification_type", "new_msg_nofification");
      paramString2.putExtra("Main_User", paramString1);
      paramString2.putExtra("MainUI_User_Last_Msg_Type", paramInt);
      paramString2.addFlags(536870912);
      paramString2.addFlags(67108864);
      if (!bool3)
        break label856;
      paramString2.putExtra("talkerCount", 1);
      paramString2.putExtra("Intro_Is_Muti_Talker", false);
      paramString2.putExtra("pushcontent_unread_count", j);
      localPendingIntent = com.tencent.mm.booter.notification.a.d.b(localContext, n, paramString2);
      str1 = h.d(localContext, str1, bool3);
      str2 = h.a(localContext, paramString3, m, j, k, bool3);
      paramString3 = h.e(localContext, paramString3, bool3);
      if (!com.tencent.mm.m.f.MF())
        break label899;
    }
    label899: for (paramString2 = com.tencent.mm.booter.notification.a.a.a(localContext, com.tencent.mm.booter.notification.a.a.H(paramString1, paramString4)); ; paramString2 = null)
    {
      paramString3 = localc.a((Notification)localObject, i1, i, localPendingIntent, str1, str2, paramString3, paramString2, paramString1);
      paramString2 = new com/tencent/mm/booter/notification/NotificationItem;
      paramString2.<init>(n, paramString1, paramString3);
      paramString2.edW = paramLong;
      paramString2.edX = k;
      localc.a(paramString2, localc.cfT);
      com.tencent.mm.booter.notification.d.in(localc.cfT.eeH);
      com.tencent.mm.booter.notification.d.z(paramString1, k);
      label822: AppMethodBeat.o(18260);
      break;
      label831: i = paramString2.edE;
      break label299;
      ((c.a)localObject).edE += 1;
      break label373;
      label856: if (m <= 1)
        paramString2.putExtra("Intro_Is_Muti_Talker", false);
      while (true)
      {
        paramString2.putExtra("talkerCount", m);
        break;
        paramString2.putExtra("Intro_Is_Muti_Talker", true);
      }
    }
  }

  public final void aVq()
  {
    AppMethodBeat.i(18261);
    f.a.IO();
    com.tencent.mm.booter.notification.e.k(-1, null);
    AppMethodBeat.o(18261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.j
 * JD-Core Version:    0.6.2
 */
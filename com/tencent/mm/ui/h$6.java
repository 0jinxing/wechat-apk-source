package com.tencent.mm.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.a.c.a;

final class h$6
  implements Runnable
{
  h$6(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29316);
    Object localObject1 = com.tencent.mm.sdk.platformtools.ah.doB();
    long l1 = ((SharedPreferences)localObject1).getLong("show_sdcard_full_time", 0L);
    long l2 = System.currentTimeMillis();
    if ((l2 - l1 > 10800000L) || (l1 > l2));
    Object localObject2;
    int i;
    boolean bool2;
    Object localObject3;
    for (boolean bool1 = true; ; bool1 = false)
    {
      localObject2 = this.yih;
      i = com.tencent.mm.q.a.On();
      bool2 = f.Mo();
      ab.i("MicroMsg.LauncherUI.GlobalAlertMgr", "%d check mobile available space _dataRet[%d] checkSdIsFull[%b] needShowAlert[%b] testCode[%d] ", new Object[] { Integer.valueOf(localObject2.hashCode()), Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool1), Integer.valueOf(((h)localObject2).cur) });
      if (((h)localObject2).cur != 1)
        break;
      i = 1;
      bool1 = true;
      ((h)localObject2).cur = 4;
      if (i != 1)
        break label800;
      if (!bool1)
        break label1155;
      bool1 = true;
      localObject3 = new c.a(((h)localObject2).yhZ);
      ((c.a)localObject3).PV(2131298272);
      ((c.a)localObject3).asE(((h)localObject2).yhZ.getString(2131298271));
      ((c.a)localObject3).rc(false);
      ((c.a)localObject3).Qc(2131298268).a(new h.3((h)localObject2));
      ((c.a)localObject3).aMb().show();
      ab.d("MicroMsg.LauncherUI.GlobalAlertMgr", "%d show no space notification isShowLackSpaceNotification[%b]", new Object[] { Integer.valueOf(localObject2.hashCode()), Boolean.valueOf(((h)localObject2).yid) });
      if (!((h)localObject2).yid)
      {
        aw.getNotification().cancel(45);
        ((h)localObject2).yid = true;
        localObject3 = new Intent(com.tencent.mm.sdk.platformtools.ah.getContext(), LauncherUI.class);
        localObject3 = PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.ah.getContext(), 45, (Intent)localObject3, 134217728);
        v.c localc = com.tencent.mm.bo.a.bt(com.tencent.mm.sdk.platformtools.ah.getContext(), "reminder_channel_id").g(((h)localObject2).getString(2131298272)).d(((h)localObject2).getString(2131298272)).e(((h)localObject2).getString(2131298271)).z(false);
        localc.EI = ((PendingIntent)localObject3);
        localc.k(2, true);
        localObject3 = localc.build();
        ((Notification)localObject3).icon = com.tencent.mm.bo.a.bWV();
        ((Notification)localObject3).flags |= 32;
        aw.getNotification().a(45, (Notification)localObject3, false);
      }
      com.tencent.mm.plugin.report.service.h.pYm.a(282L, 20L, 1L, false);
      label425: ab.i("MicroMsg.LauncherUI.GlobalAlertMgr", "%d check mobile available space isShowAlert[%b]", new Object[] { Integer.valueOf(localObject2.hashCode()), Boolean.valueOf(bool1) });
      label455: if (bool1)
        ((SharedPreferences)localObject1).edit().putLong("show_sdcard_full_time", l2).commit();
      if (!bool1)
      {
        aw.ZK();
        bool2 = ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xKX, Boolean.FALSE)).booleanValue();
        if (bool2)
        {
          aw.ZK();
          localObject1 = (String)com.tencent.mm.model.c.Ry().get(6, "");
          if (!com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject1))
            break label1136;
          aw.ZK();
          bool1 = ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xKY, Boolean.FALSE)).booleanValue();
          aw.ZK();
          localObject2 = (String)com.tencent.mm.model.c.Ry().get(ac.a.xKZ, this.yih.getString(2131297556));
          ab.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summerbindmobile tip[%b], bindMobile[%s], force[%b], wording[%s]", new Object[] { Boolean.valueOf(bool2), localObject1, Boolean.valueOf(bool1), localObject2 });
          if (!bool1)
            break label1072;
          com.tencent.mm.ui.base.h.a(this.yih.yhZ, (String)localObject2, this.yih.getString(2131297061), this.yih.getString(2131296994), false, new h.6.1(this, (String)localObject2));
          label679: aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xKX, Boolean.FALSE);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xKZ, "");
          aw.ZK();
          com.tencent.mm.model.c.Ry().dsb();
        }
      }
      AppMethodBeat.o(29316);
      return;
    }
    if (((h)localObject2).cur == 2)
    {
      bool1 = true;
      i = 2;
    }
    while (true)
    {
      ((h)localObject2).cur = 0;
      break;
      if (((h)localObject2).cur == 3)
      {
        i = 0;
        bool2 = true;
        bool1 = true;
      }
      else if (((h)localObject2).cur == 4)
      {
        ((h)localObject2).cur = 0;
        bool1 = false;
        break label455;
        label800: if (i == 2)
        {
          if (!bool1)
            break label1155;
          bool1 = true;
          aw.hold();
          localObject3 = new c.a(((h)localObject2).yhZ);
          ((c.a)localObject3).PV(2131298270);
          ((c.a)localObject3).asE(((h)localObject2).yhZ.getString(2131298269));
          ((c.a)localObject3).rc(false);
          ((c.a)localObject3).Qc(2131298267).a(new h.4((h)localObject2));
          ((c.a)localObject3).aMb().show();
          com.tencent.mm.plugin.report.service.h.pYm.a(282L, 2L, 1L, false);
          break label425;
        }
        ab.d("MicroMsg.LauncherUI.GlobalAlertMgr", "%d cancel no space notification isShowLackSpaceNotification[%b] hadCheckNotification[%b]", new Object[] { Integer.valueOf(localObject2.hashCode()), Boolean.valueOf(((h)localObject2).yid), Boolean.valueOf(((h)localObject2).yie) });
        if ((!((h)localObject2).yie) || (((h)localObject2).yid))
        {
          aw.getNotification().cancel(45);
          ((h)localObject2).yid = false;
        }
        ((h)localObject2).yie = true;
        if ((bool2) && (bool1))
        {
          com.tencent.mm.ui.base.h.d(((h)localObject2).yhZ, ((h)localObject2).getString(2131302794), ((h)localObject2).getString(2131302795), ((h)localObject2).getString(2131296872), ((h)localObject2).getString(2131296957), new h.5((h)localObject2), null);
          com.tencent.mm.plugin.report.service.h.pYm.a(282L, 0L, 1L, false);
          bool1 = true;
          break label425;
          label1072: com.tencent.mm.ui.base.h.d(this.yih.yhZ, (String)localObject2, this.yih.getString(2131297061), this.yih.getString(2131296994), this.yih.getString(2131296868), new h.6.2(this, (String)localObject2), new h.6.3(this));
          break label679;
          label1136: ab.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summerbindmobile has bind[%s]", new Object[] { localObject1 });
          break label679;
        }
        label1155: bool1 = false;
        break label425;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(29317);
    String str = super.toString() + "|doOnResumeCheck";
    AppMethodBeat.o(29317);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h.6
 * JD-Core Version:    0.6.2
 */
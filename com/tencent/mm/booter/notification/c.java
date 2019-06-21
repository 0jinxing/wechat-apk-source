package com.tencent.mm.booter.notification;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.g.a.jg.b;
import com.tencent.mm.g.a.w;
import com.tencent.mm.g.a.w.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.storage.bi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends a
{
  public static String edB = "com.tencent.preference.notification.key.unread.msg";
  public static String edC = "com.tencent.preference.notification.key.unread.talker";
  public static String edD = "com.tencent.preference.notification.key.all.notified.msgid";
  public g cfT;
  Context mContext;

  public c()
  {
    AppMethodBeat.i(15926);
    this.mContext = ah.getContext();
    this.cfT = new g(this.mContext);
    AppMethodBeat.o(15926);
  }

  public static void II()
  {
    AppMethodBeat.i(15940);
    com.tencent.mm.m.f.MA().edit().putString(edD, "").apply();
    AppMethodBeat.o(15940);
  }

  public static Notification IJ()
  {
    AppMethodBeat.i(15927);
    Notification localNotification = new Notification();
    localNotification.icon = 2130839047;
    localNotification.ledARGB = -16711936;
    localNotification.ledOnMS = 300;
    localNotification.ledOffMS = 1000;
    AppMethodBeat.o(15927);
    return localNotification;
  }

  public static int IK()
  {
    AppMethodBeat.i(15933);
    int i = com.tencent.mm.m.f.MA().getInt(edB, 0);
    AppMethodBeat.o(15933);
    return i;
  }

  public static ArrayList<c.a> IL()
  {
    AppMethodBeat.i(15934);
    try
    {
      ArrayList localArrayList1 = (ArrayList)com.tencent.mm.booter.notification.queue.c.jQ(com.tencent.mm.m.f.MA().getString(edC, ""));
      if (localArrayList1 == null)
      {
        localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        AppMethodBeat.o(15934);
      }
      while (true)
      {
        return localArrayList1;
        AppMethodBeat.o(15934);
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", localClassNotFoundException, "", new Object[0]);
        ArrayList localArrayList2 = new ArrayList();
        AppMethodBeat.o(15934);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", localIOException, "", new Object[0]);
        ArrayList localArrayList3 = new ArrayList();
        AppMethodBeat.o(15934);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", localException, "Justin_Exception:%s", new Object[] { localException.getMessage() });
        ArrayList localArrayList4 = new ArrayList();
        AppMethodBeat.o(15934);
      }
    }
  }

  private static String IM()
  {
    AppMethodBeat.i(15939);
    String str = com.tencent.mm.m.f.MA().getString(edD, "");
    AppMethodBeat.o(15939);
    return str;
  }

  public static c.a a(List<c.a> paramList, String paramString)
  {
    AppMethodBeat.i(15932);
    if ((paramList == null) || (paramString == null))
    {
      AppMethodBeat.o(15932);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      Iterator localIterator = paramList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramList = (c.a)localIterator.next();
          if (paramList.userName.equals(paramString))
          {
            AppMethodBeat.o(15932);
            break;
          }
        }
      AppMethodBeat.o(15932);
      paramList = null;
    }
  }

  public static boolean a(String paramString, bi parambi, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(15928);
    ab.d("MicroMsg.Notification.AppMsg.Handle", "preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (!aw.RK())
    {
      ab.i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](MMCore.accHasReady())preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(15928);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if ((parambi != null) && (eS(parambi.field_msgSvrId)) && (!paramBoolean))
      {
        ab.i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](msgInfo != null && NotificationQueueManager.getImpl().isAlreadyNotify(msgInfo.getMsgSvrId()), msgId: %d", new Object[] { Long.valueOf(parambi.field_msgSvrId) });
        AppMethodBeat.o(15928);
        paramBoolean = bool;
      }
      else if ((paramInt & 0x1) == 0)
      {
        ab.i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](tipsFlag & ConstantsProtocal.TEXT_NOTIFY_SVR_FLAG) == 0)preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
        AppMethodBeat.o(15928);
        paramBoolean = bool;
      }
      else
      {
        aw.ZK();
        if ((com.tencent.mm.model.c.XI()) && (!r.ku(r.YF())))
        {
          aw.ZK();
          ab.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck, talker: %s, tipsFlag: %s isWebWXOnline: %B,isWebWXNotificationOpen: %B ", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(com.tencent.mm.model.c.XI()), Boolean.valueOf(r.ku(r.YF())) });
          AppMethodBeat.o(15928);
          paramBoolean = bool;
        }
        else if (t.mT(paramString))
        {
          parambi = new jg();
          parambi.cEu.czE = 3;
          com.tencent.mm.sdk.b.a.xxA.m(parambi);
          if (!parambi.cEv.cvi)
          {
            parambi = new jg();
            parambi.cEu.czE = 1;
            parambi.cEu.cEw = paramString;
            parambi.cEu.cEx = 3;
            com.tencent.mm.sdk.b.a.xxA.m(parambi);
          }
          ab.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](ContactStorageLogic.isLbsRoom(talker))preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
          AppMethodBeat.o(15928);
          paramBoolean = bool;
        }
        else if ((t.nN(paramString)) || ((t.mN(paramString)) && (!t.nM(paramString)) && (parambi != null) && (!parambi.apB(r.Yz())) && (parambi.getType() != 64) && (parambi != null) && (!parambi.dtV())))
        {
          ab.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](ContactStorageLogic.isMuteContact(talker) || (ContactStorageLogic.isChatRoom(talker) && !ContactStorageLogic.isChatRoomNotify(talker) && !msgInfo.isAtSomeone(ConfigStorageLogic.getUsernameFromUserInfo() && msgInfo.getType() != ConstantsProtocal.MM_DATA_MULTITALK)) && (msgInfo != null && !msgInfo.isChatRoomNotice(ConfigStorageLogic.getUsernameFromUserInfo())) )preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
          AppMethodBeat.o(15928);
          paramBoolean = bool;
        }
        else
        {
          AppMethodBeat.o(15928);
          paramBoolean = true;
        }
      }
    }
  }

  public static void eR(long paramLong)
  {
    AppMethodBeat.i(15937);
    if (paramLong == 0L)
      AppMethodBeat.o(15937);
    while (true)
    {
      return;
      String str1 = IM();
      String str2 = str1;
      if (str1.length() > 3000)
        str2 = str1.substring(str1.length() / 2, str1.length());
      if (eS(paramLong))
      {
        AppMethodBeat.o(15937);
      }
      else
      {
        str2 = str2 + paramLong + "%";
        com.tencent.mm.m.f.MA().edit().putString(edD, str2).apply();
        ab.d("MicroMsg.Notification.AppMsg.Handle", "setNotifiedMsgId: %s", new Object[] { str2 });
        AppMethodBeat.o(15937);
      }
    }
  }

  public static boolean eS(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(15938);
    if (paramLong == 0L)
      AppMethodBeat.o(15938);
    while (true)
    {
      return bool;
      String str = IM();
      ab.d("MicroMsg.Notification.AppMsg.Handle", "isAlreadyNotified: %s, msgId: %d", new Object[] { str, Long.valueOf(paramLong) });
      if (str.contains(paramLong + "%"))
      {
        AppMethodBeat.o(15938);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(15938);
      }
    }
  }

  public static void f(ArrayList<c.a> paramArrayList)
  {
    AppMethodBeat.i(15935);
    if (paramArrayList == null)
    {
      com.tencent.mm.m.f.MA().edit().putString(edC, "").apply();
      if (paramArrayList != null)
        break label140;
    }
    label140: for (paramArrayList = "null"; ; paramArrayList = paramArrayList.toString())
    {
      while (true)
      {
        ab.i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadTalker %s", new Object[] { paramArrayList });
        AppMethodBeat.o(15935);
        return;
        try
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(paramArrayList);
          com.tencent.mm.m.f.MA().edit().putString(edC, com.tencent.mm.booter.notification.queue.c.a(localArrayList)).apply();
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", localIOException, "", new Object[0]);
          com.tencent.mm.m.f.MA().edit().putString(edC, "").apply();
        }
      }
      break;
    }
  }

  public static void im(int paramInt)
  {
    AppMethodBeat.i(15936);
    paramInt = Math.max(0, paramInt);
    com.tencent.mm.m.f.MA().edit().putInt(edB, paramInt).apply();
    ab.i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadMsg %d", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(15936);
  }

  public final int a(NotificationItem paramNotificationItem, g paramg)
  {
    AppMethodBeat.i(15929);
    if (o.gn(this.mContext))
    {
      ab.i("MicroMsg.Notification.AppMsg.Handle", "GreenManUtil.isAppVisibleForeground");
      if ((com.tencent.mm.sdk.platformtools.f.DEBUG) || (com.tencent.mm.sdk.platformtools.f.PRE_RELEASE))
      {
        Object localObject = ((ActivityManager)this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (localObject != null)
        {
          Iterator localIterator = ((List)localObject).iterator();
          while (localIterator.hasNext())
          {
            localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if ((((ActivityManager.RunningAppProcessInfo)localObject).processName.startsWith("com.tencent.mm")) && (o.a((ActivityManager.RunningAppProcessInfo)localObject) == 3))
              o.gm(this.mContext);
          }
        }
      }
    }
    else if ((Build.VERSION.SDK_INT >= 16) && (paramNotificationItem != null) && (paramNotificationItem.Fl != null))
    {
      paramNotificationItem.Fl.priority = 1;
      if (!com.tencent.mm.m.f.MB())
      {
        paramNotificationItem.Fl.vibrate = new long[0];
        if ((!paramg.eeN) && (!paramg.eeM))
          paramNotificationItem.Fl.priority = 0;
      }
    }
    int i = super.a(paramNotificationItem, paramg);
    AppMethodBeat.o(15929);
    return i;
  }

  @TargetApi(21)
  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent1, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt3, String paramString4, PendingIntent paramPendingIntent2, int paramInt4, String paramString5, PendingIntent paramPendingIntent3, String paramString6)
  {
    AppMethodBeat.i(15931);
    v.c localc = com.tencent.mm.bo.a.bt(this.mContext, com.tencent.mm.bo.a.dgM());
    int i = paramInt1;
    if (paramInt1 == -1)
      i = com.tencent.mm.bo.a.bWV();
    localc.dt().as(i).g(paramString3).EI = paramPendingIntent1;
    localc.Fa = true;
    if (paramString1 != null)
      localc.d(paramString1);
    if (paramString2 != null)
      localc.e(paramString2);
    localc.at(paramInt2);
    if (paramBitmap != null)
      localc.EL = paramBitmap;
    if (paramNotification != null)
    {
      if (paramNotification.sound != null)
        localc.b(paramNotification.sound);
      if (paramNotification.vibrate != null)
        localc.a(paramNotification.vibrate);
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      if (paramString4 != null)
        localc.a(paramInt3, paramString4, paramPendingIntent2);
      if (paramString5 != null)
        localc.a(paramInt4, paramString5, paramPendingIntent3);
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localc.Fd = "msg";
      paramNotification = new w();
      paramNotification.csR.username = paramString6;
      paramNotification.csR.title = paramString1;
      com.tencent.mm.sdk.b.a.xxA.m(paramNotification);
      if (paramNotification.csR.csS != null)
        localc.a(paramNotification.csR.csS);
    }
    paramNotification = localc.build();
    AppMethodBeat.o(15931);
    return paramNotification;
  }

  @TargetApi(11)
  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    AppMethodBeat.i(15930);
    paramNotification = a(paramNotification, paramInt1, paramInt2, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, 0, null, null, 0, null, null, paramString4);
    AppMethodBeat.o(15930);
    return paramNotification;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.c
 * JD-Core Version:    0.6.2
 */
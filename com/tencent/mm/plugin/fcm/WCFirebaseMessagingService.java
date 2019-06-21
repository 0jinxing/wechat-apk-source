package com.tencent.mm.plugin.fcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.l;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WCFirebaseMessagingService extends FirebaseMessagingService
{
  static List<Pair<Long, Long>> mqH;
  private WakerLock wakerlock;

  static
  {
    AppMethodBeat.i(56458);
    mqH = new LinkedList();
    AppMethodBeat.o(56458);
  }

  public static void bwL()
  {
    AppMethodBeat.i(56457);
    mqH.clear();
    AppMethodBeat.o(56457);
  }

  public final void a(RemoteMessage paramRemoteMessage)
  {
    AppMethodBeat.i(56456);
    ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "on message received");
    Object localObject1 = a.bwG();
    if (localObject1 == null)
    {
      ab.w("MicroMsg.FCM.WCFirebaseMessagingService", "fcmRegister is null");
      e.pXa.a(901L, 26L, 1L, false);
      AppMethodBeat.o(56456);
    }
    while (true)
    {
      return;
      if (!((a)localObject1).bwJ())
      {
        ab.w("MicroMsg.FCM.WCFirebaseMessagingService", "fcm push not reg to server.");
        e.pXa.a(901L, 25L, 1L, false);
        AppMethodBeat.o(56456);
      }
      else
      {
        try
        {
          localObject1 = ah.getContext();
          if (l.bL((Context)localObject1))
          {
            ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "Logout or exit MM. no need show Notification.");
            h.pYm.X(11250, "1,2");
            e.pXa.a(901L, 28L, 1L, false);
            AppMethodBeat.o(56456);
            continue;
          }
          if (paramRemoteMessage.bxe != null)
            break label332;
          localObject2 = new android/support/v4/f/a;
          ((android.support.v4.f.a)localObject2).<init>();
          paramRemoteMessage.bxe = ((Map)localObject2);
          localObject2 = paramRemoteMessage.bxd.keySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            str1 = (String)((Iterator)localObject2).next();
            localObject3 = paramRemoteMessage.bxd.get(str1);
            if ((localObject3 instanceof String))
            {
              localObject3 = (String)localObject3;
              if ((!str1.startsWith("google.")) && (!str1.startsWith("gcm.")) && (!str1.equals("from")) && (!str1.equals("message_type")) && (!str1.equals("collapse_key")))
                paramRemoteMessage.bxe.put(str1, localObject3);
            }
          }
        }
        catch (Exception paramRemoteMessage)
        {
          ab.e("MicroMsg.FCM.WCFirebaseMessagingService", "onMessageReceived error :".concat(String.valueOf(paramRemoteMessage.toString())));
          ab.printErrStackTrace("MicroMsg.FCM.WCFirebaseMessagingService", paramRemoteMessage, "", new Object[0]);
          e.pXa.a(901L, 36L, 1L, false);
          AppMethodBeat.o(56456);
        }
        continue;
        label332: localObject4 = paramRemoteMessage.bxe;
        if (!((Map)localObject4).isEmpty())
          break;
        ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "msg data is empty: ");
        h.pYm.X(11250, "1,0");
        e.pXa.a(901L, 29L, 1L, false);
        AppMethodBeat.o(56456);
      }
    }
    String str2 = (String)((Map)localObject4).get("seq");
    String str3 = (String)((Map)localObject4).get("uin");
    paramRemoteMessage = (String)((Map)localObject4).get("cmd");
    String str4 = (String)((Map)localObject4).get("username");
    String str5 = (String)((Map)localObject4).get("time");
    Object localObject3 = (String)((Map)localObject4).get("collapse_key");
    Object localObject2 = (String)((Map)localObject4).get("sound");
    String str1 = (String)((Map)localObject4).get("alert");
    String str6 = (String)((Map)localObject4).get("msgType");
    String str7 = (String)((Map)localObject4).get("badge");
    Object localObject4 = (String)((Map)localObject4).get("from");
    e.pXa.a(901L, 32L, 1L, false);
    str4 = bo.anv(str4);
    label569: long l2;
    label653: label664: long l3;
    if (str1 == null)
    {
      i = -1;
      ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "Received gcm msg. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", new Object[] { str2, str3, paramRemoteMessage, str4, str5, localObject3, localObject2, Integer.valueOf(i), str6, str7, localObject4 });
      if (!bo.isNullOrNil(str3))
        break label795;
      l1 = 0L;
      if (!bo.isNullOrNil(str2))
        break label806;
      l2 = 0L;
      if (!bo.isNullOrNil(paramRemoteMessage))
        break label817;
      l3 = 0L;
      label674: i = com.tencent.mm.kernel.a.Ra();
      if ((l1 != 0L) && (Integer.toHexString(i).equals(Long.toHexString(l1))))
        break label835;
      paramRemoteMessage = new java/lang/StringBuilder;
      paramRemoteMessage.<init>("Logined user changed. no need show Notification.uin:");
      ab.e("MicroMsg.FCM.WCFirebaseMessagingService", l1 + ", oldUin:" + i);
      h.pYm.X(11250, "1,3");
      paramRemoteMessage = e.pXa;
      if (l1 != 0L)
        break label827;
    }
    label795: label806: label817: label827: for (long l1 = 33L; ; l1 = 34L)
    {
      paramRemoteMessage.a(901L, l1, 1L, false);
      AppMethodBeat.o(56456);
      break;
      i = str1.length();
      break label569;
      l1 = bo.getLong(str3, 0L);
      break label653;
      l2 = bo.getLong(str2, 0L);
      break label664;
      l3 = bo.getLong(paramRemoteMessage, 0L);
      break label674;
    }
    label835: paramRemoteMessage = mqH.iterator();
    do
    {
      if (!paramRemoteMessage.hasNext())
        break;
      localObject2 = (Pair)paramRemoteMessage.next();
    }
    while ((((Long)((Pair)localObject2).first).longValue() != l3) || (((Long)((Pair)localObject2).second).longValue() != l2));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        ab.w("MicroMsg.FCM.WCFirebaseMessagingService", "already has this seq:".concat(String.valueOf(l2)));
        e.pXa.a(901L, 35L, 1L, false);
        AppMethodBeat.o(56456);
        break;
      }
      mqH.add(Pair.create(Long.valueOf(l3), Long.valueOf(l2)));
      if (mqH.size() > 60)
        mqH.remove(0);
      if (this.wakerlock == null)
      {
        paramRemoteMessage = new com/tencent/mars/comm/WakerLock;
        paramRemoteMessage.<init>((Context)localObject1, "MicroMsg.FCM.WCFirebaseMessagingService");
        this.wakerlock = paramRemoteMessage;
        ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "start new wakerlock");
      }
      this.wakerlock.lock(200L, "FcmBroadcastReceiver.onReceive");
      ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync");
      paramRemoteMessage = new android/content/Intent;
      paramRemoteMessage.<init>(ah.getContext(), NotifyReceiver.NotifyService.class);
      paramRemoteMessage.putExtra("notify_option_type", 2);
      paramRemoteMessage.putExtra("notify_uin", com.tencent.mm.kernel.a.Ra());
      paramRemoteMessage.putExtra("notify_respType", 2147480001);
      paramRemoteMessage.putExtra("notify_respBuf", new byte[0]);
      paramRemoteMessage.putExtra("notfiy_recv_time", bo.anU());
      g.RQ();
      paramRemoteMessage.putExtra("notify_skey", g.RO().jQ(1));
      d.aH(paramRemoteMessage);
      ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync end!");
      AppMethodBeat.o(56456);
      break;
    }
  }

  public final void a(String paramString, Exception paramException)
  {
    AppMethodBeat.i(56455);
    super.a(paramString, paramException);
    h.pYm.X(11250, "1,1");
    e.pXa.a(901L, 30L, 1L, false);
    AppMethodBeat.o(56455);
  }

  public final void onDeletedMessages()
  {
    AppMethodBeat.i(56454);
    super.onDeletedMessages();
    ab.i("MicroMsg.FCM.WCFirebaseMessagingService", "Deleted messages on server.");
    h.pYm.X(11250, "1,1");
    e.pXa.a(901L, 31L, 1L, false);
    AppMethodBeat.o(56454);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fcm.WCFirebaseMessagingService
 * JD-Core Version:    0.6.2
 */
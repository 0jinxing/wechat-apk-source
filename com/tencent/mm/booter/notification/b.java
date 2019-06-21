package com.tencent.mm.booter.notification;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.platformtools.y.1;
import com.tencent.mm.platformtools.y.2;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
  implements com.tencent.mm.model.an, aq
{
  bi cKd;
  Context context;
  private String edo;
  private String edp;
  String edq;
  Intent edr;
  private boolean eds;
  private boolean edt;
  private long edu;
  f edv;
  private com.tencent.mm.booter.notification.a.e edw;

  @SuppressLint({"HandlerLeak"})
  ak edx;
  private final com.tencent.mm.sdk.b.c edy;
  private final com.tencent.mm.sdk.b.c edz;
  String talker;

  public b(Context paramContext)
  {
    AppMethodBeat.i(15898);
    this.context = null;
    this.edv = f.a.IO();
    this.edx = new b.1(this, Looper.getMainLooper());
    this.edy = new b.2(this);
    this.edz = new b.3(this);
    this.context = paramContext;
    this.talker = "";
    this.edq = "";
    this.edo = "";
    this.edu = 0L;
    this.edt = false;
    this.edr = null;
    this.edw = new com.tencent.mm.booter.notification.a.e();
    com.tencent.mm.plugin.notification.d.a(this);
    com.tencent.mm.modelvoice.e.a(this);
    com.tencent.mm.plugin.base.stub.b.a(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.edz);
    com.tencent.mm.sdk.b.a.xxA.c(this.edy);
    AppMethodBeat.o(15898);
  }

  static Message a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(15905);
    ab.d("MicroMsg.MMNotification", "[wrapMessage] talker:%s msgType:%s stack:%s", new Object[] { paramString1, Integer.valueOf(paramInt1), bo.dpG().toString() });
    Message localMessage = Message.obtain();
    Bundle localBundle = new Bundle();
    localBundle.putString("notification.show.talker", paramString1);
    localBundle.putString("notification.show.message.content", paramString2);
    localBundle.putInt("notification.show.message.type", paramInt1);
    localBundle.putInt("notification.show.tipsflag", paramInt2);
    localMessage.setData(localBundle);
    localMessage.what = paramInt3;
    AppMethodBeat.o(15905);
    return localMessage;
  }

  static int b(bi parambi)
  {
    int i = 0;
    AppMethodBeat.i(15923);
    int j;
    if (t.mZ(parambi.field_talker))
    {
      j = 0;
      if ((parambi.field_bizChatId == -1L) || (!com.tencent.mm.aj.f.kq(parambi.field_talker)))
        break label80;
      com.tencent.mm.aj.a.c localc = z.aeT().aK(parambi.field_bizChatId);
      if ((localc.isGroup()) || (!localc.lc(1)))
        break label80;
      AppMethodBeat.o(15923);
    }
    while (true)
    {
      return j;
      j = 3;
      break;
      label80: parambi = parambi.dqJ;
      if (bo.isNullOrNil(parambi))
      {
        AppMethodBeat.o(15923);
      }
      else
      {
        parambi = br.z(parambi, "msgsource");
        if ((parambi != null) && (!parambi.isEmpty()))
          break label131;
        AppMethodBeat.o(15923);
      }
    }
    while (true)
    {
      label131: int k;
      try
      {
        k = bo.getInt((String)parambi.get(".msgsource.tips"), j);
        if (((k & 0x1) != 0) || ((k & 0x2) == 0))
          break label184;
        j = i;
        AppMethodBeat.o(15923);
      }
      catch (Exception parambi)
      {
        AppMethodBeat.o(15923);
      }
      break;
      label184: j = k;
    }
  }

  private void cancel()
  {
    AppMethodBeat.i(15903);
    this.edt = false;
    e.cancel();
    AppMethodBeat.o(15903);
  }

  public final void BV()
  {
    AppMethodBeat.i(15902);
    ab.d("MicroMsg.MMNotification", "force cancelNotification");
    cancel();
    AppMethodBeat.o(15902);
  }

  public final String IG()
  {
    return this.edo;
  }

  public final void IH()
  {
    AppMethodBeat.i(15901);
    try
    {
      Object localObject = ah.getContext().getSharedPreferences("notify_newfriend_prep", 0).getString("notify_newfriend_prep", null);
      if (localObject != null)
      {
        localObject = ((String)localObject).split(",");
        int i = localObject.length;
        for (int j = 0; j < i; j++)
        {
          int k = bo.ank(localObject[j]);
          if (k > 0)
            aw.getNotification().cancel(k);
        }
      }
      AppMethodBeat.o(15901);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMNotification", localException, "try cancel notification fail: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(15901);
      }
    }
  }

  public final void II()
  {
    AppMethodBeat.i(15911);
    f.a.IO();
    c.II();
    AppMethodBeat.o(15911);
  }

  public final void L(List<bi> paramList)
  {
    String str = null;
    AppMethodBeat.i(15907);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      if (paramList == null);
      for (i = -1; ; i = paramList.size())
      {
        ab.w("MicroMsg.MMNotification", "notifyOther newMsgList:%d :%s", new Object[] { Integer.valueOf(i), bo.dpG() });
        AppMethodBeat.o(15907);
        return;
      }
    }
    int j = paramList.size() - 1;
    int i = 0;
    bi localbi;
    while (true)
    {
      if (j < 0)
        break label263;
      localbi = (bi)paramList.get(j);
      i = b(localbi);
      if (f.a(localbi.field_talker, localbi, i, false))
        break;
      j--;
    }
    label263: for (paramList = localbi; ; paramList = str)
    {
      if (paramList == null)
      {
        ab.w("MicroMsg.MMNotification", "notifyOther msg == null");
        AppMethodBeat.o(15907);
        break;
      }
      this.edq = "";
      this.talker = paramList.field_talker;
      str = paramList.field_content;
      j = paramList.getType();
      this.cKd = paramList;
      ab.i("MicroMsg.MMNotification", "notifyOther talker:%s msgid:%d type:%d tipsFlag:%d content:%s", new Object[] { this.talker, Long.valueOf(paramList.field_msgSvrId), Integer.valueOf(j), Integer.valueOf(i), bo.anv(str) });
      this.edx.sendMessageDelayed(a(this.talker, str, j, i, 0), 200L);
      AppMethodBeat.o(15907);
      break;
    }
  }

  public final int a(Notification paramNotification, boolean paramBoolean)
  {
    AppMethodBeat.i(15918);
    int i = f.a.IO().b(new NotificationItem(paramNotification, paramBoolean));
    AppMethodBeat.o(15918);
    return i;
  }

  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    AppMethodBeat.i(15922);
    paramNotification = f.a.IO().a(paramNotification, paramInt1, paramInt2, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, paramString4);
    AppMethodBeat.o(15922);
    return paramNotification;
  }

  public final Notification a(Notification paramNotification, int paramInt, PendingIntent paramPendingIntent1, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4, PendingIntent paramPendingIntent2, String paramString5, PendingIntent paramPendingIntent3, String paramString6)
  {
    AppMethodBeat.i(15909);
    paramNotification = f.a.IO().eeb.edT.a(paramNotification, paramInt, 1, paramPendingIntent1, paramString1, paramString2, paramString3, paramBitmap, 2130839735, paramString4, paramPendingIntent2, 2130839734, paramString5, paramPendingIntent3, paramString6);
    AppMethodBeat.o(15909);
    return paramNotification;
  }

  public final Notification a(PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    AppMethodBeat.i(15921);
    paramPendingIntent = a(null, -1, 0, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, paramString4);
    AppMethodBeat.o(15921);
    return paramPendingIntent;
  }

  public final void a(int paramInt, Notification paramNotification, boolean paramBoolean)
  {
    AppMethodBeat.i(15917);
    f.a.IO().b(new NotificationItem(paramInt, paramNotification, paramBoolean));
    AppMethodBeat.o(15917);
  }

  public final void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle)
  {
    AppMethodBeat.i(15908);
    com.tencent.mm.bp.d.a("webview", new y.1(paramString3, paramString4, paramBundle, paramString1, paramString2, paramInt), new y.2());
    AppMethodBeat.o(15908);
  }

  public final void a(bi parambi)
  {
    AppMethodBeat.i(15904);
    if (parambi == null)
      AppMethodBeat.o(15904);
    while (true)
    {
      return;
      if (parambi.field_isSend == 1)
      {
        ab.w("MicroMsg.MMNotification", "notifyFirst is sender , msgid:%d ", new Object[] { Long.valueOf(parambi.field_msgSvrId) });
        AppMethodBeat.o(15904);
      }
      else
      {
        Object localObject = bf.oE(parambi.dqJ);
        if ((localObject != null) && (((bf.b)localObject).scene == 1))
        {
          AppMethodBeat.o(15904);
        }
        else
        {
          int i = b(parambi);
          this.cKd = parambi;
          this.talker = parambi.field_talker;
          localObject = parambi.field_content;
          int j = parambi.getType();
          this.edq = "";
          this.edr = null;
          ab.i("MicroMsg.MMNotification", "notifyFirst talker:%s msgid:%d type:%d tipsFlag:%d content:%s", new Object[] { this.talker, Long.valueOf(parambi.field_msgSvrId), Integer.valueOf(j), Integer.valueOf(i), bo.anv((String)localObject) });
          if (!f.a(this.talker, this.cKd, i, false))
          {
            ab.w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
            AppMethodBeat.o(15904);
          }
          else
          {
            this.edx.sendMessageDelayed(a(this.talker, (String)localObject, j, i, 0), 200L);
            AppMethodBeat.o(15904);
          }
        }
      }
    }
  }

  public final void bv(boolean paramBoolean)
  {
    AppMethodBeat.i(15899);
    this.eds = paramBoolean;
    ab.i("MicroMsg.MMNotification", "set hideNotification: %s, stack[%s]", new Object[] { Boolean.valueOf(this.eds), bo.dpG() });
    AppMethodBeat.o(15899);
  }

  public final void bw(boolean paramBoolean)
  {
    AppMethodBeat.i(15914);
    d.bx(paramBoolean);
    AppMethodBeat.o(15914);
  }

  public final int c(Notification paramNotification)
  {
    AppMethodBeat.i(15919);
    int i = a(paramNotification, true);
    AppMethodBeat.o(15919);
    return i;
  }

  public final void cancel(int paramInt)
  {
    AppMethodBeat.i(15920);
    f.a.IO();
    com.tencent.mm.booter.notification.queue.b.IP().cancel(paramInt);
    AppMethodBeat.o(15920);
  }

  public final void cancelNotification(String paramString)
  {
    AppMethodBeat.i(15900);
    ab.v("MicroMsg.MMNotification", "cancel notification talker:" + paramString + " last talker:" + this.edp + "  curChattingTalker:" + this.edo);
    if (!this.edt)
      AppMethodBeat.o(15900);
    while (true)
    {
      return;
      aw.ZK();
      paramString = com.tencent.mm.model.c.XR().aoZ(paramString);
      if ((paramString != null) && (paramString.field_unReadCount != 0))
      {
        cancel();
        AppMethodBeat.o(15900);
      }
      else if (u.nR(t.fkP) == 0)
      {
        cancel();
        AppMethodBeat.o(15900);
      }
      else
      {
        AppMethodBeat.o(15900);
      }
    }
  }

  public final Looper getLooper()
  {
    AppMethodBeat.i(15906);
    Looper localLooper = Looper.getMainLooper();
    AppMethodBeat.o(15906);
    return localLooper;
  }

  public final void ik(int paramInt)
  {
    AppMethodBeat.i(15912);
    d.in(paramInt);
    AppMethodBeat.o(15912);
  }

  public final void il(int paramInt)
  {
    AppMethodBeat.i(15915);
    f.a.IO();
    Object localObject;
    if (paramInt != 0)
    {
      localObject = com.tencent.mm.booter.notification.queue.b.IP().eei.io(paramInt);
      if (((List)localObject).isEmpty())
        AppMethodBeat.o(15915);
    }
    while (true)
    {
      return;
      y localy = y.L(ah.getContext());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Integer localInteger = (Integer)((Iterator)localObject).next();
        com.tencent.mm.booter.notification.queue.b.IP().a(localy, localInteger.intValue());
      }
      AppMethodBeat.o(15915);
    }
  }

  public final void jO(String paramString)
  {
    this.edo = paramString;
  }

  public final void k(int paramInt, String paramString)
  {
    AppMethodBeat.i(15910);
    f.a.IO();
    e.k(paramInt, paramString);
    AppMethodBeat.o(15910);
  }

  public final void notify(int paramInt, Notification paramNotification)
  {
    AppMethodBeat.i(15916);
    a(paramInt, paramNotification, true);
    AppMethodBeat.o(15916);
  }

  public final void y(String paramString, int paramInt)
  {
    AppMethodBeat.i(15913);
    d.z(paramString, paramInt);
    AppMethodBeat.o(15913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.b
 * JD-Core Version:    0.6.2
 */
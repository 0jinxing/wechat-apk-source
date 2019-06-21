package com.tencent.mm.plugin.notification.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

@SuppressLint({"InlinedApi"})
public final class FailSendMsgNotification
{
  Notification Fl;
  boolean kXv;
  public Context mContext;
  private boolean mIsInit;
  private int mType;
  public a oWA;
  public b oWB;
  public c oWC;
  public String oWD;
  public String oWE;
  private PendingIntent oWF;
  private PendingIntent oWG;
  private PendingIntent oWH;
  private PendingIntent oWI;
  public boolean oWJ;
  public boolean oWK;
  public boolean oWL;
  public v.c oWx;
  private Intent oWy;
  private int oWz;

  public FailSendMsgNotification()
  {
    this.Fl = null;
    this.oWx = null;
    this.oWy = null;
    this.oWz = 0;
    this.oWA = null;
    this.oWB = null;
    this.oWC = null;
    this.oWD = null;
    this.oWE = null;
    this.oWF = null;
    this.oWG = null;
    this.oWH = null;
    this.oWI = null;
    this.oWJ = false;
    this.oWK = false;
    this.kXv = false;
    this.mIsInit = false;
    this.oWL = true;
  }

  public FailSendMsgNotification(int paramInt)
  {
    AppMethodBeat.i(23194);
    this.Fl = null;
    this.oWx = null;
    this.oWy = null;
    this.oWz = 0;
    this.oWA = null;
    this.oWB = null;
    this.oWC = null;
    this.oWD = null;
    this.oWE = null;
    this.oWF = null;
    this.oWG = null;
    this.oWH = null;
    this.oWI = null;
    this.oWJ = false;
    this.oWK = false;
    this.kXv = false;
    this.mIsInit = false;
    this.oWL = true;
    this.mType = paramInt;
    this.mContext = ah.getContext();
    this.oWx = com.tencent.mm.bo.a.bt(this.mContext, com.tencent.mm.bo.a.dgM());
    this.oWL = true;
    this.oWE = "";
    try
    {
      if (this.oWL)
        bWQ();
      bWR();
      this.mIsInit = true;
      if (this.mContext == null)
      {
        bool = true;
        ab.d("MicroMsg.FailSendMsgNotification", "create FailSendMsgNotification, type:%d, context==null:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
        this.oWJ = false;
        AppMethodBeat.o(23194);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.FailSendMsgNotification", "init FailSendMsgNotification error, e:%s", new Object[] { localException.getMessage() });
        this.mIsInit = false;
        continue;
        boolean bool = false;
      }
    }
  }

  private void bWQ()
  {
    AppMethodBeat.i(23195);
    this.oWx.Fa = true;
    Intent localIntent = new Intent();
    if (this.mType == 1)
    {
      localIntent.setAction("com.tencent.failnotification.omit_msg");
      localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendNormalMsgNotificationService.class);
      localIntent.putExtra("notification_type", this.mType);
      this.oWH = PendingIntent.getService(this.mContext, this.mType, localIntent, 134217728);
      this.oWx.a(2130839735, this.mContext.getString(2131301785), this.oWH);
      localIntent = new Intent();
      if (this.mType != 1)
        break label237;
      localIntent.setAction("com.tencent.failnotificaiton.resend_msg");
      localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendNormalMsgNotificationService.class);
    }
    while (true)
    {
      localIntent.putExtra("notification_type", this.mType);
      if (Build.VERSION.SDK_INT >= 16)
        localIntent.addFlags(268435456);
      this.oWI = PendingIntent.getService(this.mContext, this.mType, localIntent, 134217728);
      this.oWx.a(2130839736, this.mContext.getString(2131301786), this.oWI);
      AppMethodBeat.o(23195);
      return;
      if (this.mType != 2)
        break;
      localIntent.setAction("com.tencent.failnotification.omit_sns");
      localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendSnsMsgNotificationService.class);
      break;
      label237: if (this.mType == 2)
      {
        localIntent.setAction("com.tencent.failnotificaiton.resend_sns");
        localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendSnsMsgNotificationService.class);
      }
    }
  }

  private static int bWV()
  {
    if (Build.VERSION.SDK_INT < 19);
    for (int i = 2130839731; ; i = 2130839733)
      return i;
  }

  public final void TV(String paramString)
  {
    AppMethodBeat.i(23197);
    this.oWD = paramString;
    show();
    AppMethodBeat.o(23197);
  }

  public final void bWR()
  {
    AppMethodBeat.i(23196);
    Intent localIntent = new Intent();
    if (this.mType == 1)
    {
      localIntent.setAction("com.tencent.failnotification.click_msg");
      localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendNormalMsgNotificationService.class);
      localIntent.putExtra("notification_type", this.mType);
      this.oWF = PendingIntent.getService(this.mContext, this.mType, localIntent, 134217728);
      this.oWx.EI = this.oWF;
      localIntent = new Intent();
      if (this.mType != 1)
        break label191;
      localIntent.setAction("com.tencent.failnotification.dismiss_msg");
      localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendNormalMsgNotificationService.class);
    }
    while (true)
    {
      localIntent.putExtra("notification_type", this.mType);
      this.oWG = PendingIntent.getService(this.mContext, this.mType, localIntent, 134217728);
      this.oWx.a(this.oWG);
      AppMethodBeat.o(23196);
      return;
      if (this.mType != 2)
        break;
      localIntent.setAction("com.tencent.failnotification.click_sns");
      localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendSnsMsgNotificationService.class);
      break;
      label191: if (this.mType == 2)
      {
        localIntent.setAction("com.tencent.failnotification.dismiss_sns");
        localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendSnsMsgNotificationService.class);
      }
    }
  }

  public final void bWS()
  {
    AppMethodBeat.i(23198);
    ab.d("MicroMsg.FailSendMsgNotification", "setIsForeground:%b", new Object[] { Boolean.FALSE });
    this.kXv = false;
    AppMethodBeat.o(23198);
  }

  public final void bWT()
  {
    AppMethodBeat.i(23201);
    this.oWx.k(2, false);
    this.oWK = false;
    show();
    ab.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, unLockInNotificationBar");
    AppMethodBeat.o(23201);
  }

  public final void bWU()
  {
    AppMethodBeat.i(23202);
    this.oWL = true;
    this.oWx = com.tencent.mm.bo.a.bt(this.mContext, com.tencent.mm.bo.a.dgM());
    bWQ();
    bWR();
    AppMethodBeat.o(23202);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(23200);
    aw.getNotification().cancel(this.mType);
    Intent localIntent = new Intent();
    if (this.mType == 1)
    {
      localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendNormalMsgNotificationService.class);
      this.mContext.stopService(localIntent);
    }
    while (true)
    {
      this.kXv = false;
      this.oWJ = false;
      AppMethodBeat.o(23200);
      return;
      if (this.mType == 2)
      {
        localIntent.setClass(this.mContext, FailSendMsgNotification.FailSendSnsMsgNotificationService.class);
        this.mContext.stopService(localIntent);
      }
    }
  }

  @TargetApi(16)
  public final void show()
  {
    AppMethodBeat.i(23199);
    if (!this.mIsInit)
    {
      ab.e("MicroMsg.FailSendMsgNotification", "when show notification, is not init yet");
      AppMethodBeat.o(23199);
    }
    while (true)
    {
      return;
      this.oWx.g(this.oWE);
      this.oWx.d(this.mContext.getText(2131296982));
      this.oWx.as(bWV());
      this.oWx.e(this.oWD);
      this.oWx.z(false);
      this.Fl = this.oWx.build();
      if ((Build.VERSION.SDK_INT >= 16) && (!this.kXv))
      {
        this.Fl.priority = 2;
        ab.d("MicroMsg.FailSendMsgNotification", "show notification, set priority to max");
      }
      ab.d("MicroMsg.FailSendMsgNotification", "show notification, mIsForeground:%b", new Object[] { Boolean.valueOf(this.kXv) });
      aw.getNotification().a(this.mType, this.Fl, false);
      this.oWJ = true;
      AppMethodBeat.o(23199);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.ui.FailSendMsgNotification
 * JD-Core Version:    0.6.2
 */
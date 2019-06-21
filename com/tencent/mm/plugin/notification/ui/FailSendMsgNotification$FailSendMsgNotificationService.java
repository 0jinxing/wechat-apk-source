package com.tencent.mm.plugin.notification.ui;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.mm.plugin.notification.d.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class FailSendMsgNotification$FailSendMsgNotificationService extends Service
{
  protected com.tencent.mm.sdk.b.c oWM = new FailSendMsgNotification.FailSendMsgNotificationService.1(this);
  protected FailSendMsgNotification oWN = null;

  protected abstract int bWW();

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    ab.d("MicroMsg.FailSendMsgNotification", "onCreate FailSendMsgNotificationService");
    com.tencent.mm.sdk.b.a.xxA.c(this.oWM);
  }

  public void onDestroy()
  {
    super.onDestroy();
    ab.d("MicroMsg.FailSendMsgNotification", "onDestroy FailSendMsgNotificationService");
    com.tencent.mm.sdk.b.a.xxA.d(this.oWM);
  }

  @TargetApi(16)
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    ab.d("MicroMsg.FailSendMsgNotification", "onStartCommand");
    if ((paramIntent == null) || (paramIntent.getExtras() == null))
      ab.d("MicroMsg.FailSendMsgNotification", "handle action button, intent is null");
    while (true)
    {
      return 2;
      String str = paramIntent.getAction();
      if (bo.isNullOrNil(str))
      {
        ab.d("MicroMsg.FailSendMsgNotification", "handle action button, action is null");
      }
      else
      {
        paramInt1 = paramIntent.getExtras().getInt("notification_type", -1);
        ab.d("MicroMsg.FailSendMsgNotification", "handle action button, type:%d", new Object[] { Integer.valueOf(paramInt1) });
        if (f.At(paramInt1) == null)
        {
          ab.d("MicroMsg.FailSendMsgNotification", "handle action button, notification not exist");
        }
        else
        {
          ab.d("MicroMsg.FailSendMsgNotification", "action:%s", new Object[] { str });
          this.oWN = f.At(paramInt1);
          if (str.startsWith("com.tencent.failnotification.omit"))
          {
            if (this.oWN.oWA != null)
            {
              ab.d("MicroMsg.FailSendMsgNotification", "handle omit action button, type:%d", new Object[] { Integer.valueOf(paramInt1) });
              this.oWN.oWA.bWH();
            }
          }
          else if (str.startsWith("com.tencent.failnotificaiton.resend"))
          {
            if (this.oWN.oWA != null)
            {
              boolean bool1;
              if (this.oWN.Fl == null)
              {
                bool1 = true;
                label207: if (this.oWN.oWx != null)
                  break label366;
              }
              label366: for (boolean bool2 = true; ; bool2 = false)
              {
                ab.d("MicroMsg.FailSendMsgNotification", "handle resend action button, type:%d, notification==null:%b, notificationBuilder==null:%b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                if (this.oWN != null)
                  this.oWN.kXv = true;
                if ((this.oWN.Fl != null) && (Build.VERSION.SDK_INT >= 16))
                  this.oWN.Fl.priority = 0;
                if (this.oWN.Fl == null)
                  this.oWN.show();
                startForeground(paramInt1, this.oWN.Fl);
                this.oWN.oWA.bWG();
                ab.d("MicroMsg.FailSendMsgNotification", "finish handle resend action button, type:%d", new Object[] { Integer.valueOf(paramInt1) });
                break;
                bool1 = false;
                break label207;
              }
            }
          }
          else if (str.startsWith("com.tencent.failnotification.click"))
          {
            if (this.oWN.oWB != null)
            {
              ab.d("MicroMsg.FailSendMsgNotification", "handle click notification, type:%d", new Object[] { Integer.valueOf(paramInt1) });
              this.oWN.oWB.bWI();
            }
          }
          else if (str.startsWith("com.tencent.failnotification.dismiss"))
          {
            this.oWN.oWJ = false;
            this.oWN.kXv = false;
            if (this.oWN.oWC != null)
            {
              ab.d("MicroMsg.FailSendMsgNotification", "handle notification dismiss");
              this.oWN.oWC.onDismiss();
            }
            stopSelf();
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.ui.FailSendMsgNotification.FailSendMsgNotificationService
 * JD-Core Version:    0.6.2
 */
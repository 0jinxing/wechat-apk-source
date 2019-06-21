package com.tencent.mm.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public abstract class MMService
{
  int bWH = 0;
  ConcurrentHashMap<String, MMService> xEV = new ConcurrentHashMap();
  protected Service xFe;
  private Vector<Integer> xFf = new Vector();
  private byte xFg = (byte)0;

  public IBinder Iu()
  {
    ab.i(getTag(), "%s onBind()", new Object[] { "MicroMsg.MMService" });
    return null;
  }

  public final void dqz()
  {
    this.xFe.stopForeground(true);
  }

  public String getTag()
  {
    return "MicroMsg.MMService";
  }

  public void onCreate()
  {
    ab.i(getTag(), "%s onCreate()", new Object[] { "MicroMsg.MMService" });
  }

  public void onDestroy()
  {
    ab.i(getTag(), "%s onDestroy()", new Object[] { "MicroMsg.MMService" });
  }

  @Deprecated
  public void onStart(Intent paramIntent, int paramInt)
  {
    ab.i(getTag(), "%s onStart()", new Object[] { "MicroMsg.MMService" });
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    ab.i(getTag(), "%s onStartCommand()", new Object[] { "MicroMsg.MMService" });
    onStart(paramIntent, paramInt2);
    return 0;
  }

  public boolean onUnbind(Intent paramIntent)
  {
    ab.i(getTag(), "%s onUnbind()", new Object[] { "MicroMsg.MMService" });
    return false;
  }

  public final IBinder q(Intent paramIntent, String paramString)
  {
    int i = 2;
    Object localObject = null;
    String str = Integer.toBinaryString(this.xFg);
    ab.i(getTag(), "%s callLifeCycle() callType = %s state = %s", new Object[] { "MicroMsg.MMService", paramString, str });
    switch (paramString.hashCode())
    {
    default:
      i = -1;
      switch (i)
      {
      default:
        label90: paramString = localObject;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case 109757538:
    case 3540994:
    case 3023933:
    case -840745386:
    }
    while (true)
    {
      return paramString;
      if (!paramString.equals("start"))
        break;
      i = 0;
      break label90;
      if (!paramString.equals("stop"))
        break;
      i = 1;
      break label90;
      if (!paramString.equals("bind"))
        break;
      break label90;
      if (!paramString.equals("unbind"))
        break;
      i = 3;
      break label90;
      if ((this.xFg & 0x5) == 0)
        onCreate();
      i = this.bWH + 1;
      this.bWH = i;
      onStartCommand(paramIntent, 0, i);
      this.xFg = ((byte)(byte)(this.xFg | 0x1));
      paramString = localObject;
      continue;
      if (this.xFg == 1)
      {
        onDestroy();
        this.xEV.remove(getClass().getName());
        paramString = localObject;
      }
      else
      {
        paramString = localObject;
        if (this.xFg != 4)
          if (this.xFg == 5)
          {
            this.xFg = ((byte)7);
            paramString = localObject;
          }
          else
          {
            paramString = localObject;
            if (this.xFg == 13)
            {
              onDestroy();
              this.xEV.remove(getClass().getName());
              paramString = localObject;
              continue;
              paramIntent = Integer.valueOf(paramIntent.getIntExtra("service_connection", -1));
              paramString = localObject;
              if (!this.xFf.contains(paramIntent))
              {
                this.xFf.add(paramIntent);
                if ((this.xFg & 0x5) == 0)
                  onCreate();
                this.xFg = ((byte)(byte)(this.xFg | 0x4));
                paramString = Iu();
                continue;
                i = paramIntent.getIntExtra("service_connection", -1);
                this.xFf.remove(Integer.valueOf(i));
                paramString = localObject;
                if (this.xFg != 1)
                  if (this.xFg == 4)
                  {
                    onUnbind(paramIntent);
                    onDestroy();
                    this.xEV.remove(getClass().getName());
                    paramString = localObject;
                  }
                  else if (this.xFg == 5)
                  {
                    this.xFg = ((byte)13);
                    onUnbind(paramIntent);
                    paramString = localObject;
                  }
                  else
                  {
                    paramString = localObject;
                    if (this.xFg == 7)
                    {
                      onUnbind(paramIntent);
                      onDestroy();
                      this.xEV.remove(getClass().getName());
                      paramString = localObject;
                    }
                  }
              }
            }
          }
      }
    }
  }

  public final void startActivity(Intent paramIntent)
  {
    this.xFe.startActivity(paramIntent);
  }

  public final void startForeground(int paramInt, Notification paramNotification)
  {
    this.xFe.startForeground(paramInt, paramNotification);
  }

  public final void stopSelf()
  {
    ab.i(getTag(), "%s stopSelf()", new Object[] { "MicroMsg.MMService" });
    q(new Intent(), "stop");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.service.MMService
 * JD-Core Version:    0.6.2
 */
package android.support.v4.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class y
{
  private static final Object FG = new Object();
  private static String FH;
  private static Set<String> FI = new HashSet();
  private static d FK;
  private static final Object sLock = new Object();
  public final NotificationManager FJ;
  public final Context mContext;

  private y(Context paramContext)
  {
    this.mContext = paramContext;
    this.FJ = ((NotificationManager)this.mContext.getSystemService("notification"));
  }

  public static y L(Context paramContext)
  {
    return new y(paramContext);
  }

  public static Set<String> M(Context paramContext)
  {
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_notification_listeners");
    paramContext = FG;
    if (str != null);
    try
    {
      if (!str.equals(FH))
      {
        localObject1 = str.split(":");
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>(localObject1.length);
        int i = localObject1.length;
        for (int j = 0; j < i; j++)
        {
          ComponentName localComponentName = ComponentName.unflattenFromString(localObject1[j]);
          if (localComponentName != null)
            localHashSet.add(localComponentName.getPackageName());
        }
        FI = localHashSet;
        FH = str;
      }
      Object localObject1 = FI;
      return localObject1;
    }
    finally
    {
    }
  }

  public final void a(y.e parame)
  {
    synchronized (sLock)
    {
      if (FK == null)
      {
        d locald = new android/support/v4/app/y$d;
        locald.<init>(this.mContext.getApplicationContext());
        FK = locald;
      }
      FK.b(parame);
      return;
    }
  }

  public final boolean areNotificationsEnabled()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 24)
      bool = this.FJ.areNotificationsEnabled();
    while (true)
    {
      return bool;
      AppOpsManager localAppOpsManager;
      Object localObject;
      String str;
      int i;
      if (Build.VERSION.SDK_INT >= 19)
      {
        localAppOpsManager = (AppOpsManager)this.mContext.getSystemService("appops");
        localObject = this.mContext.getApplicationInfo();
        str = this.mContext.getApplicationContext().getPackageName();
        i = ((ApplicationInfo)localObject).uid;
      }
      try
      {
        localObject = Class.forName(AppOpsManager.class.getName());
        i = ((Integer)((Class)localObject).getMethod("checkOpNoThrow", new Class[] { Integer.TYPE, Integer.TYPE, String.class }).invoke(localAppOpsManager, new Object[] { Integer.valueOf(((Integer)((Class)localObject).getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), str })).intValue();
        if (i == 0)
        {
          bool = true;
          continue;
        }
        bool = false;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        bool = true;
        continue;
        bool = true;
      }
      catch (RuntimeException localRuntimeException)
      {
        break label169;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label169;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label169;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label169;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        label169: break label169;
      }
    }
  }

  public final void cancel(int paramInt)
  {
    this.FJ.cancel(null, paramInt);
    if (Build.VERSION.SDK_INT <= 19)
      a(new y.a(this.mContext.getPackageName(), paramInt));
  }

  public final int getImportance()
  {
    if (Build.VERSION.SDK_INT >= 24);
    for (int i = this.FJ.getImportance(); ; i = -1000)
      return i;
  }

  static final class d
    implements ServiceConnection, Handler.Callback
  {
    private final Map<ComponentName, y.d.a> FO = new HashMap();
    private Set<String> FP = new HashSet();
    private final Context mContext;
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;

    d(Context paramContext)
    {
      this.mContext = paramContext;
      this.mHandlerThread = new HandlerThread("NotificationManagerCompat");
      this.mHandlerThread.start();
      this.mHandler = new Handler(this.mHandlerThread.getLooper(), this);
    }

    private void a(y.d.a parama)
    {
      if (parama.FQ)
      {
        this.mContext.unbindService(this);
        parama.FQ = false;
      }
      parama.FR = null;
    }

    private void b(y.d.a parama)
    {
      if (this.mHandler.hasMessages(3, parama.componentName));
      while (true)
      {
        return;
        parama.retryCount += 1;
        if (parama.retryCount > 6)
        {
          new StringBuilder("Giving up on delivering ").append(parama.FS.size()).append(" tasks to ").append(parama.componentName).append(" after ").append(parama.retryCount).append(" retries");
          parama.FS.clear();
        }
        else
        {
          int i = (1 << parama.retryCount - 1) * 1000;
          if (Log.isLoggable("NotifManCompat", 3))
            new StringBuilder("Scheduling retry for ").append(i).append(" ms");
          parama = this.mHandler.obtainMessage(3, parama.componentName);
          this.mHandler.sendMessageDelayed(parama, i);
        }
      }
    }

    private void c(y.d.a parama)
    {
      if (Log.isLoggable("NotifManCompat", 3))
        new StringBuilder("Processing component ").append(parama.componentName).append(", ").append(parama.FS.size()).append(" queued tasks");
      if (parama.FS.isEmpty());
      while (true)
      {
        return;
        boolean bool;
        if (parama.FQ)
        {
          bool = true;
          if ((bool) && (parama.FR != null))
            break label165;
          b(parama);
          continue;
        }
        Object localObject = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(parama.componentName);
        parama.FQ = this.mContext.bindService((Intent)localObject, this, 33);
        if (parama.FQ)
          parama.retryCount = 0;
        while (true)
        {
          bool = parama.FQ;
          break;
          new StringBuilder("Unable to bind to listener ").append(parama.componentName);
          this.mContext.unbindService(this);
        }
        label165: localObject = (y.e)parama.FS.peek();
        if (localObject != null);
        try
        {
          if (Log.isLoggable("NotifManCompat", 3))
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Sending task ");
            localStringBuilder.append(localObject);
          }
          ((y.e)localObject).a(parama.FR);
          parama.FS.remove();
        }
        catch (DeadObjectException localDeadObjectException)
        {
          if (Log.isLoggable("NotifManCompat", 3))
            new StringBuilder("Remote service has died: ").append(parama.componentName);
          if (parama.FS.isEmpty())
            continue;
          b(parama);
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
            new StringBuilder("RemoteException communicating with ").append(parama.componentName);
        }
      }
    }

    public final void b(y.e parame)
    {
      this.mHandler.obtainMessage(0, parame).sendToTarget();
    }

    public final boolean handleMessage(Message paramMessage)
    {
      boolean bool;
      switch (paramMessage.what)
      {
      default:
        bool = false;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        return bool;
        paramMessage = (y.e)paramMessage.obj;
        Object localObject1 = y.M(this.mContext);
        if (!((Set)localObject1).equals(this.FP))
        {
          this.FP = ((Set)localObject1);
          Object localObject2 = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
          localObject3 = new HashSet();
          Iterator localIterator = ((List)localObject2).iterator();
          while (localIterator.hasNext())
          {
            ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
            if (((Set)localObject1).contains(localResolveInfo.serviceInfo.packageName))
            {
              localObject2 = new ComponentName(localResolveInfo.serviceInfo.packageName, localResolveInfo.serviceInfo.name);
              if (localResolveInfo.serviceInfo.permission != null)
                new StringBuilder("Permission present on component ").append(localObject2).append(", not adding listener record.");
              else
                ((Set)localObject3).add(localObject2);
            }
          }
          localObject1 = ((Set)localObject3).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (ComponentName)((Iterator)localObject1).next();
            if (!this.FO.containsKey(localObject2))
            {
              if (Log.isLoggable("NotifManCompat", 3))
                new StringBuilder("Adding listener record for ").append(localObject2);
              this.FO.put(localObject2, new y.d.a((ComponentName)localObject2));
            }
          }
          localObject1 = this.FO.entrySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Map.Entry)((Iterator)localObject1).next();
            if (!((Set)localObject3).contains(((Map.Entry)localObject2).getKey()))
            {
              if (Log.isLoggable("NotifManCompat", 3))
                new StringBuilder("Removing listener record for ").append(((Map.Entry)localObject2).getKey());
              a((y.d.a)((Map.Entry)localObject2).getValue());
              ((Iterator)localObject1).remove();
            }
          }
        }
        Object localObject3 = this.FO.values().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = (y.d.a)((Iterator)localObject3).next();
          ((y.d.a)localObject1).FS.add(paramMessage);
          c((y.d.a)localObject1);
        }
        bool = true;
        continue;
        paramMessage = (y.c)paramMessage.obj;
        localObject3 = paramMessage.componentName;
        paramMessage = paramMessage.FN;
        localObject3 = (y.d.a)this.FO.get(localObject3);
        if (localObject3 != null)
        {
          ((y.d.a)localObject3).FR = q.a.b(paramMessage);
          ((y.d.a)localObject3).retryCount = 0;
          c((y.d.a)localObject3);
        }
        bool = true;
        continue;
        paramMessage = (ComponentName)paramMessage.obj;
        paramMessage = (y.d.a)this.FO.get(paramMessage);
        if (paramMessage != null)
          a(paramMessage);
        bool = true;
        continue;
        paramMessage = (ComponentName)paramMessage.obj;
        paramMessage = (y.d.a)this.FO.get(paramMessage);
        if (paramMessage != null)
          c(paramMessage);
        bool = true;
      }
    }

    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (Log.isLoggable("NotifManCompat", 3))
        new StringBuilder("Connected to service ").append(paramComponentName);
      this.mHandler.obtainMessage(1, new y.c(paramComponentName, paramIBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      if (Log.isLoggable("NotifManCompat", 3))
        new StringBuilder("Disconnected from service ").append(paramComponentName);
      this.mHandler.obtainMessage(2, paramComponentName).sendToTarget();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.app.y
 * JD-Core Version:    0.6.2
 */
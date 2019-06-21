package android.support.v4.media;

import android.app.Service;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.e;
import android.support.v4.f.a;
import android.support.v4.f.j;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service
{
  static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);
  final a<IBinder, MediaBrowserServiceCompat.b> Io = new a();
  MediaBrowserServiceCompat.b Ip;
  final g Iq = new g();
  MediaSessionCompat.Token Ir;

  static boolean a(String paramString, MediaBrowserServiceCompat.b paramb, IBinder paramIBinder)
  {
    boolean bool1 = true;
    if (paramIBinder == null)
    {
      if (paramb.IA.remove(paramString) != null);
      while (true)
      {
        return bool1;
        bool1 = false;
      }
    }
    List localList = (List)paramb.IA.get(paramString);
    boolean bool2;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      bool2 = false;
      while (localIterator.hasNext())
        if (paramIBinder == ((j)localIterator.next()).first)
        {
          localIterator.remove();
          bool2 = true;
        }
      bool1 = bool2;
      if (localList.size() == 0)
        paramb.IA.remove(paramString);
    }
    for (bool1 = bool2; ; bool1 = false)
      break;
  }

  static List<MediaBrowserCompat.MediaItem> dK()
  {
    return null;
  }

  final void a(String paramString, MediaBrowserServiceCompat.b paramb, IBinder paramIBinder, Bundle paramBundle)
  {
    Object localObject = (List)paramb.IA.get(paramString);
    if (localObject == null)
      localObject = new ArrayList();
    while (true)
    {
      Iterator localIterator = ((List)localObject).iterator();
      j localj;
      do
      {
        if (!localIterator.hasNext())
          break;
        localj = (j)localIterator.next();
      }
      while ((paramIBinder != localj.first) || (!c.a(paramBundle, (Bundle)localj.second)));
      do
      {
        return;
        ((List)localObject).add(new j(paramIBinder, paramBundle));
        paramb.IA.put(paramString, localObject);
        paramIBinder = new MediaBrowserServiceCompat.1(this, paramString, paramb, paramString, paramBundle);
        this.Ip = paramb;
        if (paramBundle != null)
          paramIBinder.Dj = 1;
        this.Ip = null;
      }
      while (paramIBinder.isDone());
      throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + paramb.Iw + " id=" + paramString);
    }
  }

  public abstract MediaBrowserServiceCompat.a dJ();

  final class g extends Handler
  {
    private final MediaBrowserServiceCompat.d IR = new MediaBrowserServiceCompat.d(MediaBrowserServiceCompat.this);

    g()
    {
    }

    private void e(Runnable paramRunnable)
    {
      if (Thread.currentThread() == getLooper().getThread())
        paramRunnable.run();
      while (true)
      {
        return;
        post(paramRunnable);
      }
    }

    public final void handleMessage(Message paramMessage)
    {
      int i = 0;
      Object localObject1 = paramMessage.getData();
      switch (paramMessage.what)
      {
      default:
        new StringBuilder("Unhandled message: ").append(paramMessage).append("\n  Service version: 2\n  Client version: ").append(paramMessage.arg1);
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      while (true)
      {
        return;
        Object localObject2 = this.IR;
        Object localObject3 = ((Bundle)localObject1).getString("data_package_name");
        int j = ((Bundle)localObject1).getInt("data_calling_uid");
        localObject1 = ((Bundle)localObject1).getBundle("data_root_hints");
        paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
        Object localObject4 = ((MediaBrowserServiceCompat.d)localObject2).Iu;
        int k = i;
        int m;
        if (localObject3 != null)
        {
          localObject4 = ((MediaBrowserServiceCompat)localObject4).getPackageManager().getPackagesForUid(j);
          m = localObject4.length;
        }
        for (int n = 0; ; n++)
        {
          k = i;
          if (n < m)
          {
            if (localObject4[n].equals(localObject3))
              k = 1;
          }
          else
          {
            if (k != 0)
              break;
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + j + " package=" + (String)localObject3);
          }
        }
        ((MediaBrowserServiceCompat.d)localObject2).Iu.Iq.e(new MediaBrowserServiceCompat.d.1((MediaBrowserServiceCompat.d)localObject2, paramMessage, (String)localObject3, (Bundle)localObject1, j));
        continue;
        localObject1 = this.IR;
        paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
        ((MediaBrowserServiceCompat.d)localObject1).Iu.Iq.e(new MediaBrowserServiceCompat.d.2((MediaBrowserServiceCompat.d)localObject1, paramMessage));
        continue;
        localObject4 = this.IR;
        localObject2 = ((Bundle)localObject1).getString("data_media_item_id");
        localObject3 = e.c((Bundle)localObject1, "data_callback_token");
        localObject1 = ((Bundle)localObject1).getBundle("data_options");
        paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
        ((MediaBrowserServiceCompat.d)localObject4).Iu.Iq.e(new MediaBrowserServiceCompat.d.3((MediaBrowserServiceCompat.d)localObject4, paramMessage, (String)localObject2, (IBinder)localObject3, (Bundle)localObject1));
        continue;
        localObject2 = this.IR;
        localObject3 = ((Bundle)localObject1).getString("data_media_item_id");
        localObject1 = e.c((Bundle)localObject1, "data_callback_token");
        paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
        ((MediaBrowserServiceCompat.d)localObject2).Iu.Iq.e(new MediaBrowserServiceCompat.d.4((MediaBrowserServiceCompat.d)localObject2, paramMessage, (String)localObject3, (IBinder)localObject1));
        continue;
        localObject2 = this.IR;
        localObject3 = ((Bundle)localObject1).getString("data_media_item_id");
        localObject1 = (ResultReceiver)((Bundle)localObject1).getParcelable("data_result_receiver");
        paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
        if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (localObject1 != null))
        {
          ((MediaBrowserServiceCompat.d)localObject2).Iu.Iq.e(new MediaBrowserServiceCompat.d.5((MediaBrowserServiceCompat.d)localObject2, paramMessage, (String)localObject3, (ResultReceiver)localObject1));
          continue;
          localObject2 = this.IR;
          paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
          localObject1 = ((Bundle)localObject1).getBundle("data_root_hints");
          ((MediaBrowserServiceCompat.d)localObject2).Iu.Iq.e(new MediaBrowserServiceCompat.d.6((MediaBrowserServiceCompat.d)localObject2, paramMessage, (Bundle)localObject1));
          continue;
          localObject1 = this.IR;
          paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
          ((MediaBrowserServiceCompat.d)localObject1).Iu.Iq.e(new MediaBrowserServiceCompat.d.7((MediaBrowserServiceCompat.d)localObject1, paramMessage));
          continue;
          localObject2 = this.IR;
          localObject3 = ((Bundle)localObject1).getString("data_search_query");
          localObject4 = ((Bundle)localObject1).getBundle("data_search_extras");
          localObject1 = (ResultReceiver)((Bundle)localObject1).getParcelable("data_result_receiver");
          paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
          if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (localObject1 != null))
          {
            ((MediaBrowserServiceCompat.d)localObject2).Iu.Iq.e(new MediaBrowserServiceCompat.d.8((MediaBrowserServiceCompat.d)localObject2, paramMessage, (String)localObject3, (Bundle)localObject4, (ResultReceiver)localObject1));
            continue;
            localObject3 = this.IR;
            localObject4 = ((Bundle)localObject1).getString("data_custom_action");
            localObject2 = ((Bundle)localObject1).getBundle("data_custom_action_extras");
            localObject1 = (ResultReceiver)((Bundle)localObject1).getParcelable("data_result_receiver");
            paramMessage = new MediaBrowserServiceCompat.f(paramMessage.replyTo);
            if ((!TextUtils.isEmpty((CharSequence)localObject4)) && (localObject1 != null))
              ((MediaBrowserServiceCompat.d)localObject3).Iu.Iq.e(new MediaBrowserServiceCompat.d.9((MediaBrowserServiceCompat.d)localObject3, paramMessage, (String)localObject4, (Bundle)localObject2, (ResultReceiver)localObject1));
          }
        }
      }
    }

    public final boolean sendMessageAtTime(Message paramMessage, long paramLong)
    {
      Bundle localBundle = paramMessage.getData();
      localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      localBundle.putInt("data_calling_uid", Binder.getCallingUid());
      return super.sendMessageAtTime(paramMessage, paramLong);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat
 * JD-Core Version:    0.6.2
 */
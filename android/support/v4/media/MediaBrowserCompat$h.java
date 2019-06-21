package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.e;
import android.support.v4.f.a;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class MediaBrowserCompat$h
  implements MediaBrowserCompat.d, MediaBrowserCompat.i
{
  final Bundle HR;
  final MediaBrowserCompat.a HS = new MediaBrowserCompat.a(this);
  private final a<String, MediaBrowserCompat.k> HT = new a();
  MediaBrowserCompat.j HV;
  Messenger HW;
  private MediaSessionCompat.Token HX;
  final ComponentName HY;
  final MediaBrowserCompat.b HZ;
  MediaBrowserCompat.h.a Ia;
  private String Ib;
  final Context mContext;
  private Bundle mExtras;
  int mState = 1;

  public MediaBrowserCompat$h(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("context must not be null");
    if (paramComponentName == null)
      throw new IllegalArgumentException("service component must not be null");
    if (paramb == null)
      throw new IllegalArgumentException("connection callback must not be null");
    this.mContext = paramContext;
    this.HY = paramComponentName;
    this.HZ = paramb;
    this.HR = null;
  }

  private boolean a(Messenger paramMessenger, String paramString)
  {
    boolean bool = true;
    if ((this.HW != paramMessenger) || (this.mState == 0) || (this.mState == 1))
    {
      if ((this.mState != 0) && (this.mState != 1))
        new StringBuilder().append(paramString).append(" for ").append(this.HY).append(" with mCallbacksMessenger=").append(this.HW).append(" this=").append(this);
      bool = false;
    }
    return bool;
  }

  private static String av(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "UNKNOWN/".concat(String.valueOf(paramInt));
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return str;
      str = "CONNECT_STATE_DISCONNECTING";
      continue;
      str = "CONNECT_STATE_DISCONNECTED";
      continue;
      str = "CONNECT_STATE_CONNECTING";
      continue;
      str = "CONNECT_STATE_CONNECTED";
      continue;
      str = "CONNECT_STATE_SUSPENDED";
    }
  }

  public final void a(Messenger paramMessenger, String paramString, Bundle paramBundle)
  {
    if (!a(paramMessenger, "onLoadChildren"));
    while (true)
    {
      return;
      if (MediaBrowserCompat.DEBUG)
        new StringBuilder("onLoadChildren for ").append(this.HY).append(" id=").append(paramString);
      paramMessenger = (MediaBrowserCompat.k)this.HT.get(paramString);
      if (paramMessenger == null)
        boolean bool = MediaBrowserCompat.DEBUG;
      else
        paramMessenger.c(this.mContext, paramBundle);
    }
  }

  public final void a(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
  {
    if (!a(paramMessenger, "onConnect"));
    while (true)
    {
      return;
      if (this.mState != 2)
      {
        new StringBuilder("onConnect from service while mState=").append(av(this.mState)).append("... ignoring");
      }
      else
      {
        this.Ib = paramString;
        this.HX = paramToken;
        this.mExtras = paramBundle;
        this.mState = 3;
        if (MediaBrowserCompat.DEBUG)
          dump();
        this.HZ.onConnected();
        try
        {
          paramMessenger = this.HT.entrySet().iterator();
          while (paramMessenger.hasNext())
          {
            paramToken = (Map.Entry)paramMessenger.next();
            paramString = (String)paramToken.getKey();
            paramBundle = (MediaBrowserCompat.k)paramToken.getValue();
            paramToken = paramBundle.mO;
            List localList = paramBundle.Ii;
            for (int i = 0; i < paramToken.size(); i++)
            {
              MediaBrowserCompat.j localj = this.HV;
              IBinder localIBinder = ((MediaBrowserCompat.l)paramToken.get(i)).BN;
              paramBundle = (Bundle)localList.get(i);
              Messenger localMessenger = this.HW;
              Bundle localBundle = new android/os/Bundle;
              localBundle.<init>();
              localBundle.putString("data_media_item_id", paramString);
              e.a(localBundle, "data_callback_token", localIBinder);
              localBundle.putBundle("data_options", paramBundle);
              localj.a(3, localBundle, localMessenger);
            }
          }
        }
        catch (RemoteException paramMessenger)
        {
        }
      }
    }
  }

  public final void b(Messenger paramMessenger)
  {
    new StringBuilder("onConnectFailed for ").append(this.HY);
    if (!a(paramMessenger, "onConnectFailed"));
    while (true)
    {
      return;
      if (this.mState != 2)
      {
        new StringBuilder("onConnect from service while mState=").append(av(this.mState)).append("... ignoring");
      }
      else
      {
        dI();
        this.HZ.onConnectionFailed();
      }
    }
  }

  public final void connect()
  {
    if ((this.mState != 0) && (this.mState != 1))
      throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + av(this.mState) + ")");
    this.mState = 2;
    this.HS.post(new MediaBrowserCompat.h.1(this));
  }

  public final MediaSessionCompat.Token dH()
  {
    if (this.mState == 3);
    for (int i = 1; i == 0; i = 0)
      throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.mState + ")");
    return this.HX;
  }

  final void dI()
  {
    if (this.Ia != null)
      this.mContext.unbindService(this.Ia);
    this.mState = 1;
    this.Ia = null;
    this.HV = null;
    this.HW = null;
    this.HS.a(null);
    this.Ib = null;
    this.HX = null;
  }

  public final void disconnect()
  {
    this.mState = 0;
    this.HS.post(new Runnable()
    {
      public final void run()
      {
        if (MediaBrowserCompat.h.this.HW != null);
        try
        {
          MediaBrowserCompat.h.this.HV.a(2, null, MediaBrowserCompat.h.this.HW);
          int i = MediaBrowserCompat.h.this.mState;
          MediaBrowserCompat.h.this.dI();
          if (i != 0)
            MediaBrowserCompat.h.this.mState = i;
          if (MediaBrowserCompat.DEBUG)
            MediaBrowserCompat.h.this.dump();
          return;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
            new StringBuilder("RemoteException during connect for ").append(MediaBrowserCompat.h.this.HY);
        }
      }
    });
  }

  final void dump()
  {
    new StringBuilder("  mServiceComponent=").append(this.HY);
    new StringBuilder("  mCallback=").append(this.HZ);
    new StringBuilder("  mRootHints=").append(this.HR);
    new StringBuilder("  mState=").append(av(this.mState));
    new StringBuilder("  mServiceConnection=").append(this.Ia);
    new StringBuilder("  mServiceBinderWrapper=").append(this.HV);
    new StringBuilder("  mCallbacksMessenger=").append(this.HW);
    new StringBuilder("  mRootId=").append(this.Ib);
    new StringBuilder("  mMediaSessionToken=").append(this.HX);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.h
 * JD-Core Version:    0.6.2
 */
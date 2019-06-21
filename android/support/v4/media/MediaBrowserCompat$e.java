package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.e;
import android.support.v4.f.a;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.b;
import android.support.v4.media.session.b.a;

class MediaBrowserCompat$e
  implements MediaBrowserCompat.b.a, MediaBrowserCompat.d, MediaBrowserCompat.i
{
  protected final Object HQ;
  protected final Bundle HR;
  protected final MediaBrowserCompat.a HS = new MediaBrowserCompat.a(this);
  private final a<String, MediaBrowserCompat.k> HT = new a();
  protected int HU;
  protected MediaBrowserCompat.j HV;
  protected Messenger HW;
  private MediaSessionCompat.Token HX;
  final Context mContext;

  MediaBrowserCompat$e(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb)
  {
    this.mContext = paramContext;
    Object localObject = new Bundle();
    ((Bundle)localObject).putInt("extra_client_version", 1);
    this.HR = new Bundle((Bundle)localObject);
    paramb.HN = this;
    localObject = paramb.HM;
    paramb = this.HR;
    this.HQ = new MediaBrowser(paramContext, paramComponentName, (MediaBrowser.ConnectionCallback)localObject, paramb);
  }

  public final void a(Messenger paramMessenger, String paramString, Bundle paramBundle)
  {
    if (this.HW != paramMessenger);
    while (true)
    {
      return;
      paramMessenger = (MediaBrowserCompat.k)this.HT.get(paramString);
      if (paramMessenger == null)
        boolean bool = MediaBrowserCompat.DEBUG;
      else
        paramMessenger.c(this.mContext, paramBundle);
    }
  }

  public final void a(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
  {
  }

  public final void b(Messenger paramMessenger)
  {
  }

  public final void connect()
  {
    ((MediaBrowser)this.HQ).connect();
  }

  public final MediaSessionCompat.Token dH()
  {
    if (this.HX == null)
      this.HX = MediaSessionCompat.Token.z(((MediaBrowser)this.HQ).getSessionToken());
    return this.HX;
  }

  public final void disconnect()
  {
    if ((this.HV != null) && (this.HW != null));
    try
    {
      this.HV.a(7, null, this.HW);
      label28: ((MediaBrowser)this.HQ).disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label28;
    }
  }

  public final void onConnected()
  {
    Object localObject1 = ((MediaBrowser)this.HQ).getExtras();
    if (localObject1 == null);
    while (true)
    {
      return;
      this.HU = ((Bundle)localObject1).getInt("extra_service_version", 0);
      Object localObject2 = e.c((Bundle)localObject1, "extra_messenger");
      if (localObject2 != null)
      {
        this.HV = new MediaBrowserCompat.j((IBinder)localObject2, this.HR);
        this.HW = new Messenger(this.HS);
        this.HS.a(this.HW);
      }
      try
      {
        MediaBrowserCompat.j localj = this.HV;
        localObject2 = this.HW;
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putBundle("data_root_hints", localj.HR);
        localj.a(6, localBundle, (Messenger)localObject2);
        label120: localObject1 = b.a.d(e.c((Bundle)localObject1, "extra_session_binder"));
        if (localObject1 == null)
          continue;
        this.HX = MediaSessionCompat.Token.a(((MediaBrowser)this.HQ).getSessionToken(), (b)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        break label120;
      }
    }
  }

  public final void onConnectionSuspended()
  {
    this.HV = null;
    this.HW = null;
    this.HX = null;
    this.HS.a(null);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.e
 * JD-Core Version:    0.6.2
 */
package android.support.v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import java.util.HashSet;

public final class MediaControllerCompat
{
  final MediaControllerCompat.b Jj;
  private final MediaSessionCompat.Token Jk;
  private final HashSet<a> Jl = new HashSet();

  public MediaControllerCompat(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    if (paramToken == null)
      throw new IllegalArgumentException("sessionToken must not be null");
    this.Jk = paramToken;
    if (Build.VERSION.SDK_INT >= 24)
      this.Jj = new MediaControllerCompat.d(paramContext, paramToken);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 23)
        this.Jj = new c(paramContext, paramToken);
      else if (Build.VERSION.SDK_INT >= 21)
        this.Jj = new MediaControllerCompat.MediaControllerImplApi21(paramContext, paramToken);
      else
        this.Jj = new MediaControllerCompat.e(this.Jk);
    }
  }

  public static abstract class a
    implements IBinder.DeathRecipient
  {
    private final Object Jm;
    MediaControllerCompat.a.a Jn;
    boolean Jo;

    public a()
    {
      if (Build.VERSION.SDK_INT >= 21);
      for (this.Jm = new c.b(new MediaControllerCompat.a.b(this)); ; this.Jm = new MediaControllerCompat.a.c(this))
        return;
    }

    final void a(int paramInt, Object paramObject, Bundle paramBundle)
    {
      if (this.Jn != null)
      {
        paramObject = this.Jn.obtainMessage(paramInt, paramObject);
        paramObject.setData(paramBundle);
        paramObject.sendToTarget();
      }
    }
  }

  static class c extends MediaControllerCompat.MediaControllerImplApi21
  {
    public c(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      super(paramToken);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat
 * JD-Core Version:    0.6.2
 */
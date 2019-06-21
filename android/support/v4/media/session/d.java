package android.support.v4.media.session;

import android.media.session.MediaSession.Token;

final class d
{
  public static Object A(Object paramObject)
  {
    if ((paramObject instanceof MediaSession.Token))
      return paramObject;
    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.d
 * JD-Core Version:    0.6.2
 */
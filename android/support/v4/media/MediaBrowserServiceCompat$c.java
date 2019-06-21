package android.support.v4.media;

public class MediaBrowserServiceCompat$c<T>
{
  int Dj;
  final Object IC;
  private boolean IE;
  boolean IF;
  boolean IG;

  MediaBrowserServiceCompat$c(Object paramObject)
  {
    this.IC = paramObject;
  }

  void dL()
  {
  }

  void dM()
  {
    throw new UnsupportedOperationException("It is not supported to send an error for " + this.IC);
  }

  public final void dN()
  {
    if ((this.IF) || (this.IG))
      throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.IC);
    this.IF = true;
    dL();
  }

  final boolean isDone()
  {
    if ((this.IE) || (this.IF) || (this.IG));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.c
 * JD-Core Version:    0.6.2
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

public abstract interface b extends IInterface
{
  public abstract void C(boolean paramBoolean);

  public abstract void D(boolean paramBoolean);

  public abstract void a(int paramInt1, int paramInt2, String paramString);

  public abstract void a(MediaDescriptionCompat paramMediaDescriptionCompat);

  public abstract void a(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt);

  public abstract void a(RatingCompat paramRatingCompat);

  public abstract void a(RatingCompat paramRatingCompat, Bundle paramBundle);

  public abstract void a(a parama);

  public abstract void a(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper);

  public abstract boolean a(KeyEvent paramKeyEvent);

  public abstract void ay(int paramInt);

  public abstract void az(int paramInt);

  public abstract void b(int paramInt1, int paramInt2, String paramString);

  public abstract void b(MediaDescriptionCompat paramMediaDescriptionCompat);

  public abstract void b(a parama);

  public abstract boolean dQ();

  public abstract PendingIntent dR();

  public abstract ParcelableVolumeInfo dS();

  public abstract MediaMetadataCompat dT();

  public abstract PlaybackStateCompat dU();

  public abstract boolean dV();

  public abstract boolean dW();

  public abstract int dX();

  public abstract void dY();

  public abstract void dZ();

  public abstract void fastForward();

  public abstract Bundle getExtras();

  public abstract long getFlags();

  public abstract String getPackageName();

  public abstract List<MediaSessionCompat.QueueItem> getQueue();

  public abstract CharSequence getQueueTitle();

  public abstract int getRatingType();

  public abstract int getRepeatMode();

  public abstract String getTag();

  public abstract void pause();

  public abstract void play();

  public abstract void playFromMediaId(String paramString, Bundle paramBundle);

  public abstract void playFromSearch(String paramString, Bundle paramBundle);

  public abstract void playFromUri(Uri paramUri, Bundle paramBundle);

  public abstract void prepare();

  public abstract void prepareFromMediaId(String paramString, Bundle paramBundle);

  public abstract void prepareFromSearch(String paramString, Bundle paramBundle);

  public abstract void prepareFromUri(Uri paramUri, Bundle paramBundle);

  public abstract void rewind();

  public abstract void seekTo(long paramLong);

  public abstract void sendCustomAction(String paramString, Bundle paramBundle);

  public abstract void setRepeatMode(int paramInt);

  public abstract void skipToQueueItem(long paramLong);

  public abstract void stop();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.b
 * JD-Core Version:    0.6.2
 */
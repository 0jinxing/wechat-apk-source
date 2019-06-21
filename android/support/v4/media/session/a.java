package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public abstract interface a extends IInterface
{
  public abstract void A(boolean paramBoolean);

  public abstract void B(boolean paramBoolean);

  public abstract void a(MediaMetadataCompat paramMediaMetadataCompat);

  public abstract void a(ParcelableVolumeInfo paramParcelableVolumeInfo);

  public abstract void a(PlaybackStateCompat paramPlaybackStateCompat);

  public abstract void aw(int paramInt);

  public abstract void ax(int paramInt);

  public abstract void d(String paramString, Bundle paramBundle);

  public abstract void dP();

  public abstract void onExtrasChanged(Bundle paramBundle);

  public abstract void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList);

  public abstract void onQueueTitleChanged(CharSequence paramCharSequence);

  public abstract void onSessionDestroyed();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.a
 * JD-Core Version:    0.6.2
 */
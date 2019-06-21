package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

final class c$b<T extends c.a> extends MediaController.Callback
{
  protected final T JC;

  public c$b(T paramT)
  {
    this.JC = paramT;
  }

  public final void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
  {
    c.a locala = this.JC;
    int i = paramPlaybackInfo.getPlaybackType();
    AudioAttributes localAudioAttributes = ((MediaController.PlaybackInfo)paramPlaybackInfo).getAudioAttributes();
    int j;
    if ((localAudioAttributes.getFlags() & 0x1) == 1)
      j = 7;
    while (true)
    {
      locala.c(i, j, paramPlaybackInfo.getVolumeControl(), paramPlaybackInfo.getMaxVolume(), paramPlaybackInfo.getCurrentVolume());
      return;
      if ((localAudioAttributes.getFlags() & 0x4) == 4)
        j = 6;
      else
        switch (localAudioAttributes.getUsage())
        {
        default:
          j = 3;
          break;
        case 1:
        case 11:
        case 12:
        case 14:
          j = 3;
          break;
        case 13:
          j = 1;
          break;
        case 2:
          j = 0;
          break;
        case 3:
          j = 8;
          break;
        case 4:
          j = 4;
          break;
        case 6:
          j = 2;
          break;
        case 5:
        case 7:
        case 8:
        case 9:
        case 10:
          j = 5;
        }
    }
  }

  public final void onExtrasChanged(Bundle paramBundle)
  {
    this.JC.ec();
  }

  public final void onMetadataChanged(MediaMetadata paramMediaMetadata)
  {
    this.JC.y(paramMediaMetadata);
  }

  public final void onPlaybackStateChanged(PlaybackState paramPlaybackState)
  {
    this.JC.x(paramPlaybackState);
  }

  public final void onQueueChanged(List<MediaSession.QueueItem> paramList)
  {
    this.JC.onQueueChanged(paramList);
  }

  public final void onQueueTitleChanged(CharSequence paramCharSequence)
  {
    this.JC.eb();
  }

  public final void onSessionDestroyed()
  {
    this.JC.onSessionDestroyed();
  }

  public final void onSessionEvent(String paramString, Bundle paramBundle)
  {
    this.JC.ea();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.c.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

final class f$2
  implements Runnable
{
  f$2(f paramf, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16025);
    f localf = this.eeu;
    Object localObject1 = this.eev;
    boolean bool1 = this.eew;
    if (localf.context == null)
      localf.context = ah.getContext();
    if (localf.context == null)
    {
      ab.w("MicroMsg.Notification.Tool.Sound", "playSound:context is null!!");
      AppMethodBeat.o(16025);
    }
    while (true)
    {
      return;
      try
      {
        localObject2 = (AudioManager)localf.context.getSystemService("audio");
        int i = ((AudioManager)localObject2).getStreamVolume(5);
        if (i == 0)
        {
          AppMethodBeat.o(16025);
        }
        else
        {
          localf.ees.removeMessages(305419896);
          localf.ees.sendEmptyMessageDelayed(305419896, 8000L);
          ab.i("MicroMsg.Notification.Tool.Sound", "doPlaySound playerIsInit: %s", new Object[] { Boolean.valueOf(localf.eeq) });
          bool2 = localf.eeq;
          if (!bool2);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          if (localf.eer != null)
          {
            if (localf.eer.isPlaying())
              localf.eer.stop();
            localf.eer.release();
            ab.i("MicroMsg.Notification.Tool.Sound", "try to release player before playSound playerIsInit: %s", new Object[] { Boolean.valueOf(localf.eeq) });
          }
          localf.eeq = false;
          localObject3 = new com/tencent/mm/compatible/b/k;
          ((com.tencent.mm.compatible.b.k)localObject3).<init>();
          localf.eer = ((MediaPlayer)localObject3);
          ab.i("MicroMsg.Notification.Tool.Sound", "doPlaySound player: %s", new Object[] { localf.eer });
          localMediaPlayer = localf.eer;
          l = System.currentTimeMillis();
          if (bo.isNullOrNil((String)localObject1))
          {
            localObject3 = RingtoneManager.getDefaultUri(2);
            if (localObject3 == null);
          }
        }
        catch (IllegalStateException localException1)
        {
          try
          {
            Object localObject3;
            long l;
            localMediaPlayer.setDataSource(localf.context, (Uri)localObject3);
            ab.i("MicroMsg.Notification.Tool.Sound", "summeranrt setPlayerDataSource tid[%d] [%d]ms", new Object[] { Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l) });
            if (((AudioManager)localObject2).isWiredHeadsetOn())
            {
              g.KR();
              ab.d("MicroMsg.Notification.Tool.Sound", "headset on, selected stream type: %s", new Object[] { Integer.valueOf(0) });
              float f1 = ((AudioManager)localObject2).getStreamVolume(0);
              float f2 = ((AudioManager)localObject2).getStreamVolume(3);
              float f3 = ((AudioManager)localObject2).getStreamMaxVolume(0);
              float f4 = ((AudioManager)localObject2).getStreamMaxVolume(3);
              float f5 = f1 / f3;
              float f6 = f2 / f4;
              ab.d("MicroMsg.Notification.Tool.Sound", "headset on, toneVolume: %s, maxVolume: %s, toneScale: %s", new Object[] { Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f5) });
              ab.d("MicroMsg.Notification.Tool.Sound", "headset on, toneMUSICVolume: %s, maxMUSICVolume: %s, toneMusicScale: %s", new Object[] { Float.valueOf(f2), Float.valueOf(f4), Float.valueOf(f6) });
              if (f5 > f6)
              {
                f1 = f3 * f6;
                ab.d("MicroMsg.Notification.Tool.Sound", "headset on, toneVolume: %s", new Object[] { Float.valueOf(f1) });
              }
              ((AudioManager)localObject2).setSpeakerphoneOn(false);
              ab.i("MicroMsg.Notification.Tool.Sound", "notificationSetMode: %s", new Object[] { Integer.valueOf(q.etn.esG) });
              if (q.etn.esG == 1)
              {
                ab.i("MicroMsg.Notification.Tool.Sound", "notification set mode enable, set mode now");
                if (((AudioManager)localObject2).getMode() == 0)
                  ((AudioManager)localObject2).setMode(3);
                localObject3 = localf.eer;
                localObject1 = new com/tencent/mm/booter/notification/a/f$3;
                ((f.3)localObject1).<init>(localf, (AudioManager)localObject2);
                ((MediaPlayer)localObject3).setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject1);
                localObject3 = localf.eer;
                localObject1 = new com/tencent/mm/booter/notification/a/f$4;
                ((f.4)localObject1).<init>(localf, (AudioManager)localObject2);
                ((MediaPlayer)localObject3).setOnErrorListener((MediaPlayer.OnErrorListener)localObject1);
                localf.eer.setAudioStreamType(0);
                localf.eer.setLooping(true);
                localf.eer.prepare();
                localf.eer.setVolume(f1 / f3, f1 / f3);
                localf.eer.setLooping(false);
                localf.eer.start();
                localf.eeq = true;
                AppMethodBeat.o(16025);
                continue;
                localException1 = localException1;
                ab.printErrStackTrace("MicroMsg.Notification.Tool.Sound", localException1, "PlaySound Exception:", new Object[0]);
              }
            }
          }
          catch (IOException localIOException)
          {
            try
            {
              while (true)
              {
                MediaPlayer localMediaPlayer;
                if (localf.eer != null)
                  localf.eer.release();
                AppMethodBeat.o(16025);
                break;
                localIllegalStateException = localIllegalStateException;
                ab.w("MicroMsg.Notification.Tool.Sound", "try to release player before playSound error");
                if (localf.eer != null)
                {
                  localf.eer.release();
                  continue;
                  Object localObject4;
                  if (bool1)
                  {
                    localObject4 = localf.context.getAssets().openFd((String)localObject1);
                    localMediaPlayer.setDataSource(((AssetFileDescriptor)localObject4).getFileDescriptor(), ((AssetFileDescriptor)localObject4).getStartOffset(), ((AssetFileDescriptor)localObject4).getLength());
                    ((AssetFileDescriptor)localObject4).close();
                    localObject4 = null;
                  }
                  else
                  {
                    localObject4 = Uri.parse((String)localObject1);
                    continue;
                    localIOException = localIOException;
                    if (!bo.isNullOrNil((String)localObject1))
                    {
                      localObject5 = RingtoneManager.getDefaultUri(2);
                      localMediaPlayer.setDataSource(localf.context, (Uri)localObject5);
                    }
                    else
                    {
                      ab.i("MicroMsg.Notification.Tool.Sound", "setPlayerDataSource IOException soundUri:%s, isAsset:%s", new Object[] { localObject1, Boolean.valueOf(bool1) });
                      continue;
                      localObject2 = localf.eer;
                      localObject5 = new com/tencent/mm/booter/notification/a/f$5;
                      ((f.5)localObject5).<init>(localf);
                      ((MediaPlayer)localObject2).setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject5);
                      localObject2 = localf.eer;
                      localObject5 = new com/tencent/mm/booter/notification/a/f$6;
                      ((f.6)localObject5).<init>(localf);
                      ((MediaPlayer)localObject2).setOnErrorListener((MediaPlayer.OnErrorListener)localObject5);
                    }
                  }
                }
              }
              ab.d("MicroMsg.Notification.Tool.Sound", "getStreamVolume =  %d, soundUri = %s", new Object[] { Integer.valueOf(((AudioManager)localObject2).getStreamVolume(5)), localObject1 });
              Object localObject5 = localf.eer;
              Object localObject2 = new com/tencent/mm/booter/notification/a/f$7;
              ((f.7)localObject2).<init>(localf);
              ((MediaPlayer)localObject5).setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject2);
              localObject2 = localf.eer;
              localObject5 = new com/tencent/mm/booter/notification/a/f$8;
              ((f.8)localObject5).<init>(localf);
              ((MediaPlayer)localObject2).setOnErrorListener((MediaPlayer.OnErrorListener)localObject5);
              localf.eer.setAudioStreamType(5);
              localf.eer.setLooping(true);
              localf.eer.prepare();
              localf.eer.setLooping(false);
              localf.eer.start();
              localf.eeq = true;
              boolean bool3 = localf.eeq;
              if (Looper.myLooper() != null)
              {
                bool1 = true;
                label1033: if (Looper.getMainLooper() == null)
                  break label1091;
              }
              label1091: for (boolean bool2 = true; ; bool2 = false)
              {
                ab.i("MicroMsg.Notification.Tool.Sound", "doPlaySound start finish playerIsInit:%s, myLooper[%b] mainLooper[%b]", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                AppMethodBeat.o(16025);
                break;
                bool1 = false;
                break label1033;
              }
            }
            catch (Exception localException2)
            {
              ab.printErrStackTrace("MicroMsg.Notification.Tool.Sound", localException2, "try to release player in Exception:", new Object[0]);
              AppMethodBeat.o(16025);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f.2
 * JD-Core Version:    0.6.2
 */
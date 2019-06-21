package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$i
  implements Runnable
{
  double qxP = -1.0D;
  MediaPlayer qyf;
  int type;

  private b$i(b paramb)
  {
  }

  private void bUd()
  {
    AppMethodBeat.i(37426);
    ab.i("MicroMsg.SightPlayController", "stopPlayer");
    try
    {
      if (this.qyf != null)
      {
        this.qyf.stop();
        this.qyf.release();
        this.qyf = null;
      }
      AppMethodBeat.o(37426);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SightPlayController", localException, "stop play sound error: %s", new Object[] { localException.getMessage() });
        this.qyf = null;
        AppMethodBeat.o(37426);
      }
    }
  }

  public final double clk()
  {
    AppMethodBeat.i(37427);
    double d;
    if (this.qyf == null)
    {
      d = 0.0D;
      AppMethodBeat.o(37427);
    }
    while (true)
    {
      return d;
      d = this.qyf.getCurrentPosition();
      AppMethodBeat.o(37427);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(37428);
    Object localObject;
    switch (this.type)
    {
    default:
      localObject = "unknown";
      ab.i("MicroMsg.SightPlayController", "do play sound, operation %s", new Object[] { localObject });
      switch (this.type)
      {
      default:
      case 1:
      case 0:
      case 2:
      case 3:
      case 4:
      }
      break;
    case 1:
    case 0:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      label100: AppMethodBeat.o(37428);
      while (true)
      {
        return;
        localObject = "start";
        break;
        localObject = "stop";
        break;
        localObject = "pause";
        break;
        localObject = "resume";
        break;
        localObject = "seek";
        break;
        bUd();
        if (bo.isNullOrNil(b.a(this.rct)))
          break label100;
        try
        {
          localObject = new com/tencent/mm/compatible/b/k;
          ((k)localObject).<init>();
          this.qyf = ((MediaPlayer)localObject);
          this.qyf.setDisplay(null);
          this.qyf.reset();
          this.qyf.setDataSource(b.a(this.rct));
          this.qyf.setAudioStreamType(3);
          localObject = this.qyf;
          b.i.1 local1 = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/b$i$1;
          local1.<init>(this);
          ((MediaPlayer)localObject).setOnErrorListener(local1);
          this.qyf.prepare();
          this.qyf.start();
          AppMethodBeat.o(37428);
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException1, "play sound error: %s", new Object[] { localException1.getMessage() });
          ab.e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", new Object[] { b.a(this.rct) });
          this.rct.clear();
          if (b.b(this.rct) != null)
            b.b(this.rct).Ds(-1);
          AppMethodBeat.o(37428);
        }
        continue;
        bUd();
        AppMethodBeat.o(37428);
        continue;
        try
        {
          if ((this.qyf != null) && (this.qyf.isPlaying()))
            this.qyf.pause();
          AppMethodBeat.o(37428);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException2, "pause sound error: %s", new Object[] { localException2.getMessage() });
          bUd();
          AppMethodBeat.o(37428);
        }
        continue;
        try
        {
          if (this.qyf != null)
            this.qyf.start();
          AppMethodBeat.o(37428);
        }
        catch (Exception localException3)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException3, "pause sound error: %s", new Object[] { localException3.getMessage() });
          bUd();
          AppMethodBeat.o(37428);
        }
        continue;
        try
        {
          ab.i("MicroMsg.SightPlayController", "soundplayer seek %f", new Object[] { Double.valueOf(this.qxP) });
          this.qyf.seekTo((int)(this.qxP * 1000.0D));
          AppMethodBeat.o(37428);
        }
        catch (Exception localException4)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException4, "seek sound error: %s", new Object[] { localException4.getMessage() });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.i
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sight.decode.a;

import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b$i
  implements Runnable
{
  double qxP = -1.0D;
  MediaPlayer qyf;
  public int type;

  private b$i(b paramb)
  {
  }

  private void bUd()
  {
    AppMethodBeat.i(70243);
    ab.i("MicroMsg.SightPlayController", "stopPlayer");
    try
    {
      if (this.qyf != null)
      {
        this.qyf.stop();
        this.qyf.release();
        this.qyf = null;
      }
      AppMethodBeat.o(70243);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SightPlayController", localException, "stop play sound error: %s", new Object[] { localException.getMessage() });
        this.qyf = null;
        AppMethodBeat.o(70243);
      }
    }
  }

  public final double clk()
  {
    AppMethodBeat.i(70244);
    double d;
    if (this.qyf == null)
    {
      d = 0.0D;
      AppMethodBeat.o(70244);
    }
    while (true)
    {
      return d;
      d = this.qyf.getCurrentPosition();
      AppMethodBeat.o(70244);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(70245);
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
      label100: AppMethodBeat.o(70245);
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
        if (bo.isNullOrNil(b.a(this.qxW)))
          break label100;
        try
        {
          localObject = new com/tencent/mm/compatible/b/k;
          ((k)localObject).<init>();
          this.qyf = ((MediaPlayer)localObject);
          this.qyf.setDisplay(null);
          this.qyf.reset();
          this.qyf.setDataSource(b.a(this.qxW));
          this.qyf.setAudioStreamType(3);
          localObject = this.qyf;
          b.i.1 local1 = new com/tencent/mm/plugin/sight/decode/a/b$i$1;
          local1.<init>(this);
          ((MediaPlayer)localObject).setOnErrorListener(local1);
          this.qyf.prepare();
          this.qyf.start();
          AppMethodBeat.o(70245);
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException1, "play sound error: %s", new Object[] { localException1.getMessage() });
          ab.e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", new Object[] { b.a(this.qxW) });
          this.qxW.clear();
          if (b.b(this.qxW) != null)
            b.b(this.qxW).c(this.qxW, -1);
          AppMethodBeat.o(70245);
        }
        continue;
        bUd();
        AppMethodBeat.o(70245);
        continue;
        try
        {
          if ((this.qyf != null) && (this.qyf.isPlaying()))
            this.qyf.pause();
          AppMethodBeat.o(70245);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException2, "pause sound error: %s", new Object[] { localException2.getMessage() });
          bUd();
          AppMethodBeat.o(70245);
        }
        continue;
        try
        {
          if (this.qyf != null)
            this.qyf.start();
          AppMethodBeat.o(70245);
        }
        catch (Exception localException3)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException3, "pause sound error: %s", new Object[] { localException3.getMessage() });
          bUd();
          AppMethodBeat.o(70245);
        }
        continue;
        try
        {
          ab.i("MicroMsg.SightPlayController", "soundplayer seek %f", new Object[] { Double.valueOf(this.qxP) });
          this.qyf.seekTo((int)(this.qxP * 1000.0D));
          AppMethodBeat.o(70245);
        }
        catch (Exception localException4)
        {
          ab.printErrStackTrace("MicroMsg.SightPlayController", localException4, "seek sound error: %s", new Object[] { localException4.getMessage() });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.i
 * JD-Core Version:    0.6.2
 */
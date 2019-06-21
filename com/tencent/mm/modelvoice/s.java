package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class s
  implements d
{
  boolean fZC;
  d.a fZI;
  d.b fZJ;
  String fileName;
  MediaPlayer gaq;
  com.tencent.mm.compatible.util.b gar;
  int status;

  public s()
  {
    AppMethodBeat.i(55841);
    this.fileName = "";
    this.fZI = null;
    this.fZJ = null;
    this.status = 0;
    this.fZC = true;
    this.gaq = new k();
    amh();
    ami();
    ab.d("MicroMsg.VoicePlayer", "VoicePlayer");
    AppMethodBeat.o(55841);
  }

  public s(Context paramContext)
  {
    this();
    AppMethodBeat.i(55842);
    this.gar = new com.tencent.mm.compatible.util.b(paramContext);
    ab.d("MicroMsg.VoicePlayer", "VoicePlayer context");
    AppMethodBeat.o(55842);
  }

  private void amh()
  {
    AppMethodBeat.i(55843);
    this.gaq.setOnCompletionListener(new s.1(this));
    AppMethodBeat.o(55843);
  }

  private void ami()
  {
    AppMethodBeat.i(55844);
    this.gaq.setOnErrorListener(new s.2(this));
    AppMethodBeat.o(55844);
  }

  private boolean d(String paramString, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(55848);
    if (this.status != 0)
    {
      ab.e("MicroMsg.VoicePlayer", "startPlay error status:" + this.status);
      AppMethodBeat.o(55848);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      ab.i("MicroMsg.VoicePlayer", "startPlay speakerOn:%s,seekTo:%s,", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      this.fileName = paramString;
      try
      {
        f(paramBoolean, paramInt);
        this.status = 1;
        AppMethodBeat.o(55848);
        paramBoolean = true;
      }
      catch (Exception localException)
      {
        try
        {
          f(true, paramInt);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.VoicePlayer", "startPlay File[" + this.fileName + "] failed");
          ab.e("MicroMsg.VoicePlayer", "exception:%s", new Object[] { bo.l(localException) });
          this.status = -1;
          AppMethodBeat.o(55848);
          paramBoolean = bool;
        }
      }
    }
  }

  private void f(boolean paramBoolean, int paramInt)
  {
    int i = 3;
    AppMethodBeat.i(55849);
    if (!e.ct(this.fileName))
    {
      AppMethodBeat.o(55849);
      return;
    }
    int j;
    if (paramBoolean)
      j = 3;
    label256: 
    while (true)
    {
      try
      {
        ab.d("MicroMsg.VoicePlayer", "playImp speakerOn:%s,seekTo:%s,type:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(j) });
        if (!q.etd.epG)
          break label256;
        q.etd.dump();
        if (q.etd.epN != 1)
          break label256;
        j = i;
        if ((this.gar != null) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "playImp audioFocusHelper.requestFocus");
          this.gar.requestFocus();
        }
        this.gaq.setAudioStreamType(j);
        this.gaq.setDataSource(this.fileName);
        this.gaq.prepare();
        if (paramInt > 0)
          this.gaq.seekTo(paramInt);
        this.gaq.start();
        AppMethodBeat.o(55849);
        break;
        j = 0;
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.VoicePlayer", "playImp : fail, exception = " + localException.getMessage());
        ab.e("MicroMsg.VoicePlayer", "exception:%s", new Object[] { bo.l(localException) });
        if ((this.gar != null) && (this.fZC))
          this.gar.Mm();
        AppMethodBeat.o(55849);
      }
      break;
    }
  }

  public final boolean EH()
  {
    boolean bool = false;
    AppMethodBeat.i(55852);
    if ((this.status != 1) && (this.status != 2))
    {
      ab.e("MicroMsg.VoicePlayer", "stop not STATUS_PLAYING or STATUS_PAUSE error status:" + this.status);
      AppMethodBeat.o(55852);
    }
    while (true)
    {
      return bool;
      try
      {
        ab.d("MicroMsg.VoicePlayer", "stop mediaPlayer.stop()");
        this.gaq.stop();
        this.gaq.release();
        if ((this.gar != null) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
          this.gar.Mm();
        }
        this.status = 0;
        AppMethodBeat.o(55852);
        bool = true;
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("stop File[");
        ab.e("MicroMsg.VoicePlayer", this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        this.status = -1;
        if ((this.gar != null) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
          this.gar.Mm();
        }
        AppMethodBeat.o(55852);
      }
      finally
      {
        if ((this.gar != null) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
          this.gar.Mm();
        }
        AppMethodBeat.o(55852);
      }
    }
  }

  public final boolean Ew()
  {
    boolean bool = false;
    AppMethodBeat.i(55851);
    if (this.status != 2)
    {
      ab.e("MicroMsg.VoicePlayer", "resume not STATUS_PAUSE error status:" + this.status);
      AppMethodBeat.o(55851);
    }
    while (true)
    {
      return bool;
      try
      {
        ab.d("MicroMsg.VoicePlayer", "resume mediaPlayer.start()");
        this.gaq.start();
        if ((this.gar != null) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
          this.gar.requestFocus();
        }
        this.status = 1;
        AppMethodBeat.o(55851);
        bool = true;
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resume File[");
        ab.e("MicroMsg.VoicePlayer", this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        this.status = -1;
        if ((this.gar != null) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
          this.gar.requestFocus();
        }
        AppMethodBeat.o(55851);
      }
      finally
      {
        if ((this.gar != null) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
          this.gar.requestFocus();
        }
        AppMethodBeat.o(55851);
      }
    }
  }

  public final double Ez()
  {
    double d = 0.0D;
    AppMethodBeat.i(55853);
    if ((this.status != 1) && (this.status != 2))
      AppMethodBeat.o(55853);
    while (true)
    {
      return d;
      int i;
      int j;
      try
      {
        i = this.gaq.getCurrentPosition();
        j = this.gaq.getDuration();
        if (j != 0)
          break label149;
        ab.e("MicroMsg.VoicePlayer", "getDuration File[" + this.fileName + "] Failed");
        AppMethodBeat.o(55853);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.VoicePlayer", "getNowProgress File[" + this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        EH();
        AppMethodBeat.o(55853);
      }
      continue;
      label149: d = i / j;
      AppMethodBeat.o(55853);
    }
  }

  public final boolean S(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(55846);
    paramBoolean = d(paramString, paramBoolean, 0);
    AppMethodBeat.o(55846);
    return paramBoolean;
  }

  public final void a(d.a parama)
  {
    this.fZI = parama;
  }

  public final void a(d.b paramb)
  {
    this.fZJ = paramb;
  }

  public final void alP()
  {
    this.fZC = false;
  }

  public final void b(b.a parama)
  {
    AppMethodBeat.i(55854);
    if ((this.gar != null) && (parama != null))
      this.gar.a(parama);
    AppMethodBeat.o(55854);
  }

  public final boolean bn(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(55850);
    if (this.status != 1)
    {
      ab.e("MicroMsg.VoicePlayer", "pause not STATUS_PLAYING error status:" + this.status);
      AppMethodBeat.o(55850);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      try
      {
        ab.d("MicroMsg.VoicePlayer", "pause mediaPlayer.pause()");
        this.gaq.pause();
        if ((this.gar != null) && (paramBoolean) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
          this.gar.Mm();
        }
        this.status = 2;
        AppMethodBeat.o(55850);
        paramBoolean = true;
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("pause File[");
        ab.e("MicroMsg.VoicePlayer", this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        this.status = -1;
        if ((this.gar != null) && (paramBoolean) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
          this.gar.Mm();
        }
        AppMethodBeat.o(55850);
        paramBoolean = bool;
      }
      finally
      {
        if ((this.gar != null) && (paramBoolean) && (this.fZC))
        {
          ab.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
          this.gar.Mm();
        }
        AppMethodBeat.o(55850);
      }
    }
  }

  public final void bo(boolean paramBoolean)
  {
    AppMethodBeat.i(55845);
    ab.d("MicroMsg.VoicePlayer", "setSpeakerOn=".concat(String.valueOf(paramBoolean)));
    if (this.gaq == null)
      AppMethodBeat.o(55845);
    while (true)
    {
      return;
      if (ax.Ex())
      {
        ab.v("MicroMsg.VoicePlayer", "setSpeakOn return when calling");
        AppMethodBeat.o(55845);
      }
      else
      {
        int i = this.gaq.getCurrentPosition();
        EH();
        this.gaq = new k();
        amh();
        ami();
        d(this.fileName, paramBoolean, i);
        AppMethodBeat.o(55845);
      }
    }
  }

  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(55847);
    paramBoolean = d(paramString, paramBoolean, paramInt);
    AppMethodBeat.o(55847);
    return paramBoolean;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final boolean isPlaying()
  {
    boolean bool = true;
    if (this.status == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.s
 * JD-Core Version:    0.6.2
 */
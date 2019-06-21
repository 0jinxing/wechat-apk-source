package com.tencent.mm.plugin.n;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.nio.ByteBuffer;

public final class a extends h
{
  private AudioTrack aQf;
  private int channels;
  private boolean eif = false;
  private int sampleRate;

  public a(g paramg, ak paramak)
  {
    super(paramg, paramak);
  }

  private int getSampleRate()
  {
    AppMethodBeat.i(117863);
    if (this.sampleRate == 0)
      this.sampleRate = this.orM.getInteger("sample-rate");
    int i = this.sampleRate;
    AppMethodBeat.o(117863);
    return i;
  }

  @TargetApi(21)
  private void iT(boolean paramBoolean)
  {
    AppMethodBeat.i(117861);
    if (paramBoolean)
    {
      this.aQf.setVolume(0.0F);
      AppMethodBeat.o(117861);
    }
    while (true)
    {
      return;
      this.aQf.setVolume(1.0F);
      AppMethodBeat.o(117861);
    }
  }

  final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(117856);
    ab.d("MicroMsg.AudioTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d", new Object[] { aZm(), Integer.valueOf(this.state), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    boolean bool;
    if (!d.yG(this.state))
    {
      ab.i("MicroMsg.AudioTrackDataSource", "%s it no need process buffer now state %d", new Object[] { aZm(), Integer.valueOf(this.state) });
      bool = false;
      AppMethodBeat.o(117856);
    }
    while (true)
    {
      return bool;
      int i;
      if (this.aQf == null)
      {
        ab.i("MicroMsg.AudioTrackDataSource", "%s init audio track", new Object[] { aZm() });
        if (this.channels == 0)
          this.channels = this.orM.getInteger("channel-count");
        if (this.channels == 1)
        {
          i = 4;
          label160: int j = AudioTrack.getMinBufferSize(getSampleRate(), i, 2);
          this.aQf = new e(3, getSampleRate(), i, j);
          if ((this.aQf == null) || (this.aQf.getState() == 1))
            break label279;
          ab.w("MicroMsg.AudioTrackDataSource", "%s can not create audio track [%d]", new Object[] { aZm(), Integer.valueOf(this.aQf.getState()) });
          this.aQf.release();
          this.aQf = null;
        }
        for (i = 0; ; i = 1)
        {
          if (i != 0)
            break label293;
          bool = false;
          AppMethodBeat.o(117856);
          break;
          i = 12;
          break label160;
          label279: setMute(this.eif);
        }
      }
      label293: if ((d.yB(this.state)) && ((this.aQf.getPlayState() == 2) || (this.aQf.getPlayState() == 1)))
        onStart();
      if (this.state == 4)
      {
        i = 1;
        if ((i != 0) && (this.aQf.getPlayState() == 3))
          onPause();
      }
      try
      {
        this.orH.orA = paramBufferInfo.presentationTimeUs;
        paramBufferInfo = new byte[paramBufferInfo.size];
        paramByteBuffer.get(paramBufferInfo);
        paramByteBuffer.clear();
        if (paramBufferInfo.length > 0)
          this.aQf.write(paramBufferInfo, 0, paramBufferInfo.length);
        ab.d("MicroMsg.AudioTrackDataSource", "%s finish to process index[%d] time[%d] to audio track", new Object[] { aZm(), Integer.valueOf(paramInt), Long.valueOf(this.orH.orA) });
        paramMediaCodec.releaseOutputBuffer(paramInt, false);
        bool = true;
        AppMethodBeat.o(117856);
        continue;
        i = 0;
      }
      catch (Exception paramMediaCodec)
      {
        while (true)
          ab.e("MicroMsg.AudioTrackDataSource", "%s audio release output buffer error %s", new Object[] { aZm(), paramMediaCodec.toString() });
      }
    }
  }

  final boolean b(MediaCodec paramMediaCodec)
  {
    AppMethodBeat.i(117862);
    ab.i("MicroMsg.AudioTrackDataSource", "%s handle decoder before start", new Object[] { aZm() });
    paramMediaCodec.configure(this.orM, null, null, 0);
    AppMethodBeat.o(117862);
    return false;
  }

  protected final void c(MediaCodec paramMediaCodec)
  {
    AppMethodBeat.i(117864);
    ab.i("MicroMsg.AudioTrackDataSource", "%s on output format changed", new Object[] { aZm() });
    this.sampleRate = 0;
    this.channels = 0;
    if (this.aQf != null);
    try
    {
      this.aQf.flush();
      this.aQf.release();
      label54: this.aQf = null;
      AppMethodBeat.o(117864);
      return;
    }
    catch (Exception paramMediaCodec)
    {
      break label54;
    }
  }

  protected final void onPause()
  {
    AppMethodBeat.i(117858);
    ab.i("MicroMsg.AudioTrackDataSource", "%s on pause", new Object[] { aZm() });
    if ((this.aQf != null) && (this.aQf.getState() == 1))
      this.aQf.pause();
    AppMethodBeat.o(117858);
  }

  protected final void onStart()
  {
    AppMethodBeat.i(117857);
    ab.i("MicroMsg.AudioTrackDataSource", "%s on start", new Object[] { aZm() });
    if ((this.aQf != null) && (this.aQf.getState() == 1))
      this.aQf.play();
    AppMethodBeat.o(117857);
  }

  public final void release()
  {
    AppMethodBeat.i(117859);
    try
    {
      this.aQf.flush();
      this.aQf.release();
      label19: super.release();
      AppMethodBeat.o(117859);
      return;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(117860);
    if (this.aQf == null)
    {
      ab.w("MicroMsg.AudioTrackDataSource", "%s set mute[%b] but audio track is null", new Object[] { aZm(), Boolean.valueOf(paramBoolean) });
      this.eif = paramBoolean;
      AppMethodBeat.o(117860);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.compatible.util.d.fP(21))
      {
        ab.d("MicroMsg.AudioTrackDataSource", "%s api below 21 set mute[%b]", new Object[] { aZm(), Boolean.valueOf(paramBoolean) });
        if (paramBoolean)
        {
          this.aQf.setStereoVolume(0.0F, 0.0F);
          AppMethodBeat.o(117860);
        }
        else
        {
          this.aQf.setStereoVolume(1.0F, 1.0F);
          AppMethodBeat.o(117860);
        }
      }
      else
      {
        ab.d("MicroMsg.AudioTrackDataSource", "%s api higher 21 set mute[%b]", new Object[] { aZm(), Boolean.valueOf(paramBoolean) });
        iT(paramBoolean);
        AppMethodBeat.o(117860);
      }
    }
  }

  final String type()
  {
    return "audio";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.a
 * JD-Core Version:    0.6.2
 */
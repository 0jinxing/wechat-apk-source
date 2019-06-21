package com.tencent.mm.plugin.music.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ag.e;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public final class a
  implements IDataSource
{
  public e fqV;

  public a(e parame)
  {
    this.fqV = parame;
  }

  public final void close()
  {
    AppMethodBeat.i(137673);
    Logger.i("MicroMsg.Audio.InputStreamDataSource", "close");
    if (this.fqV != null)
      this.fqV.close();
    AppMethodBeat.o(137673);
  }

  public final AudioFormat.AudioType getAudioType()
  {
    AppMethodBeat.i(137672);
    AudioFormat.AudioType localAudioType;
    if (this.fqV == null)
    {
      Logger.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
      localAudioType = AudioFormat.AudioType.UNSUPPORT;
      AppMethodBeat.o(137672);
    }
    while (true)
    {
      return localAudioType;
      Logger.i("MicroMsg.Audio.InputStreamDataSource", "getAudioType:" + this.fqV.acc());
      switch (this.fqV.acc())
      {
      default:
        Logger.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
        localAudioType = AudioFormat.AudioType.UNSUPPORT;
        AppMethodBeat.o(137672);
        break;
      case 0:
        localAudioType = AudioFormat.AudioType.UNSUPPORT;
        AppMethodBeat.o(137672);
        break;
      case 1:
        localAudioType = AudioFormat.AudioType.AAC;
        AppMethodBeat.o(137672);
        break;
      case 2:
        localAudioType = AudioFormat.AudioType.MP3;
        AppMethodBeat.o(137672);
        break;
      case 3:
        localAudioType = AudioFormat.AudioType.WAV;
        AppMethodBeat.o(137672);
        break;
      case 4:
        localAudioType = AudioFormat.AudioType.OGG;
        AppMethodBeat.o(137672);
      }
    }
  }

  public final long getSize()
  {
    AppMethodBeat.i(137671);
    long l;
    if (this.fqV != null)
    {
      l = this.fqV.getSize();
      AppMethodBeat.o(137671);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(137671);
    }
  }

  public final void open()
  {
    AppMethodBeat.i(137669);
    Logger.i("MicroMsg.Audio.InputStreamDataSource", "open");
    if (this.fqV != null)
      this.fqV.open();
    AppMethodBeat.o(137669);
  }

  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137670);
    if (this.fqV == null)
    {
      Logger.e("MicroMsg.Audio.InputStreamDataSource", "[readAt]audioDataSource is null");
      paramInt1 = -1;
      AppMethodBeat.o(137670);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = this.fqV.readAt(paramLong, paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(137670);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.g.a
 * JD-Core Version:    0.6.2
 */
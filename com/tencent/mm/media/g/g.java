package com.tencent.mm.media.g;

import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/remuxer/MediaCodecRemuxerFactory;", "Lcom/tencent/mm/media/remuxer/IMediaCodecVideoRemuxer$Factory;", "()V", "get", "Lcom/tencent/mm/media/remuxer/IMediaCodecVideoRemuxer;", "filePath", "", "outputFilePath", "outputWidth", "", "outputHeight", "outputBitrate", "outputFps", "callback", "Lcom/tencent/mm/media/remuxer/IMediaCodecVideoRemuxer$FinishCallback;", "startTimeMs", "", "endTimeMs", "plugin-mediaeditor_release"})
public final class g
  implements c.a
{
  public final c a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2, c.b paramb)
  {
    AppMethodBeat.i(13077);
    if (paramString1 == null)
      paramString1 = "";
    while (true)
    {
      if (paramString2 == null)
        paramString2 = "";
      while (true)
      {
        paramString1 = (c)new e(null, paramString1, 1, paramString2, paramInt1, paramInt2, paramInt3, 48000, 44100, paramInt4, paramLong1, paramLong2, (b)new g.b(paramb));
        AppMethodBeat.o(13077);
        return paramString1;
      }
    }
  }

  public final c a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, c.b paramb)
  {
    AppMethodBeat.i(13076);
    if (paramString1 == null)
      paramString1 = "";
    while (true)
    {
      if (paramString2 == null)
        paramString2 = "";
      while (true)
      {
        paramString1 = (c)new e(null, paramString1, 1, paramString2, paramInt1, paramInt2, paramInt3, 48000, 44100, paramInt4, 0L, 0L, (b)new g.a(paramb));
        AppMethodBeat.o(13076);
        return paramString1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.g
 * JD-Core Version:    0.6.2
 */
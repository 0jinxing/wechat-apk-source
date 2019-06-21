package com.tencent.mm.audio.mix.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.a;

public final class f extends c
{
  public f(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(137032);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioVariableConvertProcess", "AudioVariableConvertProcess src:%s, srcSampleRate:%d, srcChannels:%d, srcBitDepth:%d, desSampleRate:%d, desChannels:%d, desBitDepth:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6) });
    this.cle = paramString;
    this.clf = a.eh(paramString);
    b.Dq();
    int j;
    if (paramInt4 <= 0)
    {
      j = 0;
      if (j != 0)
        this.ckY = paramInt4;
      if (paramInt5 > 0)
        break label169;
      j = 0;
      label118: if (j != 0)
        this.ckZ = paramInt5;
      if (paramInt4 > 0)
        break label175;
    }
    label169: label175: for (paramInt4 = i; ; paramInt4 = 1)
    {
      if (paramInt4 != 0)
        this.cla = paramInt6;
      C(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(137032);
      return;
      j = 1;
      break;
      j = 1;
      break label118;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.c.f
 * JD-Core Version:    0.6.2
 */
package com.google.android.exoplayer2.b;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(24)
final class b$a
{
  final MediaCodec.CryptoInfo aRZ;
  final MediaCodec.CryptoInfo.Pattern aSb;

  private b$a(MediaCodec.CryptoInfo paramCryptoInfo)
  {
    AppMethodBeat.i(94736);
    this.aRZ = paramCryptoInfo;
    this.aSb = new MediaCodec.CryptoInfo.Pattern(0, 0);
    AppMethodBeat.o(94736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.b.b.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.media.d;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/MediaCodecAACEncoderAsync;", "Lcom/tencent/mm/media/encoder/IAudioEncoder;", "mediaFormat", "Landroid/media/MediaFormat;", "frameEncodeCallback", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "data", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "frameEncodeEndCallback", "Lkotlin/Function0;", "(Landroid/media/MediaFormat;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "aacCallback", "com/tencent/mm/media/encoder/MediaCodecAACEncoderAsync$aacCallback$1", "Lcom/tencent/mm/media/encoder/MediaCodecAACEncoderAsync$aacCallback$1;", "inputDataSource", "", "Lcom/tencent/mm/media/encoder/MediaCodecAACEncoderAsync$EncoderData;", "kotlin.jvm.PlatformType", "", "isInputEnd", "", "sendDataToEncoder", "pcmData", "", "pts", "", "isLast", "startEncoder", "Companion", "EncoderData", "plugin-mediaeditor_release"})
public final class d extends a
{
  public static final d.a eVG;
  private List<d.b> eVD;
  private boolean eVE;
  private d.c eVF;

  static
  {
    AppMethodBeat.i(12942);
    eVG = new d.a((byte)0);
    AppMethodBeat.o(12942);
  }

  public d(MediaFormat paramMediaFormat, m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> paramm, a.f.a.a<y> parama)
  {
    super(paramMediaFormat, paramm, parama);
    AppMethodBeat.i(12941);
    this.eVD = Collections.synchronizedList((List)new ArrayList());
    this.eVF = new d.c(this);
    try
    {
      this.eVq.setCallback((MediaCodec.Callback)this.eVF);
      this.eVq.start();
      AppMethodBeat.o(12941);
      return;
    }
    catch (Exception paramMediaFormat)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", (Throwable)paramMediaFormat, "", new Object[0]);
        AppMethodBeat.o(12941);
      }
    }
  }

  public final void b(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(12940);
    j.p(paramArrayOfByte, "data");
    if (paramArrayOfByte != null)
    {
      paramArrayOfByte = new d.b(paramArrayOfByte, paramLong, paramBoolean);
      this.eVD.add(paramArrayOfByte);
    }
    AppMethodBeat.o(12940);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.d
 * JD-Core Version:    0.6.2
 */
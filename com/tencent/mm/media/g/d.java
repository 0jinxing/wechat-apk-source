package com.tencent.mm.media.g;

import a.f.a.m;
import a.l;
import a.y;
import android.media.MediaFormat;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/remuxer/MediaCodecCheckVideoCropRect;", "", "mediaExtractor", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "(Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;)V", "TAG", "", "callback", "Lkotlin/Function2;", "Landroid/media/MediaFormat;", "Lkotlin/ParameterName;", "name", "mediaFormat", "checker", "", "decoder", "Lcom/tencent/mm/media/decoder/IMediaCodecTransDecoder;", "handler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "invokeCallback", "", "lock", "Ljava/lang/Object;", "onDecode", "Ljava/nio/ByteBuffer;", "", "onFormatChanged", "Lkotlin/Function1;", "getCropBottom", "", "getCropLeft", "getCropRight", "getCropTop", "hasCropRect", "startCheck", "stopDecoder", "plugin-mediaeditor_release"})
public final class d
{
  final String TAG;
  final a.f.a.b<MediaFormat, y> eTI;
  com.tencent.mm.media.c.b eXA;
  boolean eXB;
  final m<ByteBuffer, Long, y> eXC;
  final a eXD;
  m<? super MediaFormat, ? super d, y> exT;
  final ak handler;
  final Object lock;

  public d(a parama)
  {
    AppMethodBeat.i(13039);
    this.eXD = parama;
    this.lock = new Object();
    this.TAG = "MicroMsg.MediaCodecCheckVideoCropRect";
    Looper localLooper = Looper.myLooper();
    parama = localLooper;
    if (localLooper == null)
      parama = Looper.getMainLooper();
    this.handler = new ak(parama);
    ab.i(this.TAG, "create MediaCodecCheckVideoCropRect");
    this.eXD.UT();
    this.eXC = ((m)new d.a(this));
    this.eTI = ((a.f.a.b)new d.b(this));
    AppMethodBeat.o(13039);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.d
 * JD-Core Version:    0.6.2
 */
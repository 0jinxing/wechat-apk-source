package com.tencent.mm.media.g;

import a.f.a.b;
import a.f.a.m;
import a.f.b.k;
import a.l;
import a.y;
import android.media.MediaCodec.BufferInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/remuxer/MediaCodecRemuxerCallback;", "", "mixMuxerController", "Lcom/tencent/mm/media/remuxer/MixMuxerController;", "mediaExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "outputFilePath", "", "type", "", "outputSampleRate", "outputChannelCount", "(Lcom/tencent/mm/media/remuxer/MixMuxerController;Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;Ljava/lang/String;III)V", "TAG", "audioEncodeCallback", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "data", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "getAudioEncodeCallback", "()Lkotlin/jvm/functions/Function2;", "setAudioEncodeCallback", "(Lkotlin/jvm/functions/Function2;)V", "backgroundMediaExtractor", "drawCallback", "Lkotlin/Function0;", "getDrawCallback", "()Lkotlin/jvm/functions/Function0;", "setDrawCallback", "(Lkotlin/jvm/functions/Function0;)V", "encodeEndCallback", "Lkotlin/Function1;", "path", "encodeFinish", "getEncodeEndCallback", "()Lkotlin/jvm/functions/Function1;", "setEncodeEndCallback", "(Lkotlin/jvm/functions/Function1;)V", "frameCount", "mixFinishCallback", "mixType", "tempPath", "videoEncodeCallback", "getVideoEncodeCallback", "setVideoEncodeCallback", "videoRotate", "getVideoRotate", "()I", "setVideoRotate", "(I)V", "finishMix", "plugin-mediaeditor_release"})
public final class f
{
  final String TAG;
  int eTb;
  int eXL;
  h eXR;
  com.tencent.mm.media.e.a eYA;
  int eYB;
  int eYC;
  b<? super String, y> eYD;
  m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> eYE;
  m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> eYF;
  b<? super b<? super String, y>, y> eYG;
  a.f.a.a<y> eYH;
  String eYj;
  String eys;
  int frameCount;

  public f(h paramh, com.tencent.mm.media.e.a parama, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13073);
    this.TAG = "MicroMsg.RemuxerCallback";
    this.eYj = "";
    this.eys = "";
    this.eYE = ((m)new d(this));
    this.eYF = ((m)new f.a(this));
    this.eYG = ((b)new c(this));
    this.eYH = ((a.f.a.a)new f.b(this));
    this.eys = (paramString + "_" + System.currentTimeMillis() + ".mp4");
    this.eXR = paramh;
    this.eYA = parama;
    this.eYj = paramString;
    this.eYB = paramInt2;
    this.eYC = 1;
    this.eTb = paramInt1;
    AppMethodBeat.o(13073);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "path", "invoke"})
  static final class c extends k
    implements b<b<? super String, ? extends y>, y>
  {
    c(f paramf)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "data", "Ljava/nio/ByteBuffer;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "invoke"})
  static final class d extends k
    implements m<ByteBuffer, MediaCodec.BufferInfo, y>
  {
    d(f paramf)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.f
 * JD-Core Version:    0.6.2
 */
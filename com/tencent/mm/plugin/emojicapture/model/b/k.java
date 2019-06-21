package com.tencent.mm.plugin.emojicapture.model.b;

import a.f.a.b;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.f.e;
import com.tencent.mm.plugin.emojicapture.ui.b.d;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixer;", "", "videoPath", "", "emojiFrameRetriever", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;", "gifPath", "videoPlayRate", "", "removeBackground", "", "hasSticker", "outputGif", "timeEnter", "", "(Ljava/lang/String;Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;Ljava/lang/String;IZZZJ)V", "getEmojiFrameRetriever", "()Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;", "frameCount", "gifEncoder", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixGifEncoder;", "getGifPath", "()Ljava/lang/String;", "mixPixelBuffer", "Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiCaptureMixEGLPixelBuffer;", "mixTime", "onMixFinish", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "", "startTick", "syncMgr", "Lcom/tencent/mm/media/mix/MixFrameSyncMgr;", "getTimeEnter", "()J", "videoDecoder", "Lcom/tencent/mm/plugin/emojicapture/model/mix/IEmojiMixDecoder;", "finishMix", "mixVideoFrame", "start", "mixFinish", "Companion", "plugin-emojicapture_release"})
public final class k
{
  public static final k.a lje;
  long eyR;
  private final long ezZ;
  int frameCount;
  final String hzs;
  final boolean liB;
  final boolean liC;
  private l liW;
  d liX;
  e liY;
  c liZ;
  final int liz;
  b<? super Boolean, y> lja;
  private long ljb;
  final a ljc;
  final boolean ljd;
  final String videoPath;

  static
  {
    AppMethodBeat.i(2707);
    lje = new k.a((byte)0);
    AppMethodBeat.o(2707);
  }

  public k(String paramString1, a parama, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
  {
    AppMethodBeat.i(2706);
    this.videoPath = paramString1;
    this.ljc = parama;
    this.hzs = paramString2;
    this.liz = paramInt;
    this.ljd = paramBoolean1;
    this.liB = paramBoolean2;
    this.liC = paramBoolean3;
    this.ezZ = paramLong;
    AppMethodBeat.o(2706);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class e extends a.f.b.k
    implements a.f.a.a<y>
  {
    e(k paramk, com.tencent.mm.plugin.sight.base.a parama)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.k
 * JD-Core Version:    0.6.2
 */
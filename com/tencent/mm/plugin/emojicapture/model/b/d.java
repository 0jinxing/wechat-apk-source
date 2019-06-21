package com.tencent.mm.plugin.emojicapture.model.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixInfo;", "", "scene", "", "timeEnter", "", "videoPath", "", "outputPath", "retriever", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;", "videoPlayRate", "isRemoveBg", "", "hasSticker", "outputGif", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;IZZZLcom/tencent/mm/storage/emotion/EmojiInfo;)V", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "getHasSticker", "()Z", "getOutputGif", "getOutputPath", "()Ljava/lang/String;", "getRetriever", "()Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;", "getScene", "()I", "getTimeEnter", "()J", "getVideoPath", "getVideoPlayRate", "plugin-emojicapture_release"})
public final class d
{
  final EmojiInfo exP;
  final long ezZ;
  final boolean liA;
  final boolean liB;
  final boolean liC;
  final String lis;
  final a liy;
  final int liz;
  final int scene;
  final String videoPath;

  public d(int paramInt1, long paramLong, String paramString1, String paramString2, a parama, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(2670);
    this.scene = paramInt1;
    this.ezZ = paramLong;
    this.videoPath = paramString1;
    this.lis = paramString2;
    this.liy = parama;
    this.liz = paramInt2;
    this.liA = paramBoolean1;
    this.liB = paramBoolean2;
    this.liC = paramBoolean3;
    this.exP = paramEmojiInfo;
    AppMethodBeat.o(2670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.d
 * JD-Core Version:    0.6.2
 */
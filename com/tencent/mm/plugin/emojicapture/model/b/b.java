package com.tencent.mm.plugin.emojicapture.model.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.f.d;
import com.tencent.mm.media.f.e;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixFrameSyncMgr;", "Lcom/tencent/mm/media/mix/MixFrameSyncMgr;", "videoPath", "", "emojiFrameRetriever", "Lcom/tencent/mm/media/mix/FrameRetriever;", "videoPlayRate", "", "(Ljava/lang/String;Lcom/tencent/mm/media/mix/FrameRetriever;I)V", "TAG", "plugin-emojicapture_release"})
public final class b extends e
{
  private final String TAG;

  public b(String paramString, d paramd, int paramInt)
  {
    super(paramString, paramd);
    AppMethodBeat.i(2663);
    this.TAG = "MicroMsg.EmojiMixFrameSyncMgr";
    this.eWR = (paramInt * 20);
    if (this.eWR > 30)
      this.eWR = 30;
    this.eWS /= paramInt;
    this.eWU = (1000.0F / this.eWR);
    if (this.eWU < this.eWS)
      this.eWU = this.eWS;
    this.eWP = ((int)(this.eWK / paramInt / this.eWU));
    this.eWQ = 0;
    ab.i(this.TAG, "init MixFrameSyncMgr,videoPath:" + paramString + ", videoPlayRate:" + paramInt + ", fps:" + this.eWJ + ", duration:" + this.eWK + ", frameCount:" + this.eWI + ", frameDuration:" + this.eWS + ", targetFrameRate:" + this.eWR + ", targetFrameCount:" + this.eWP + ", targetFrameDuration:" + this.eWU);
    AppMethodBeat.o(2663);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.b
 * JD-Core Version:    0.6.2
 */
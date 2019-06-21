package com.tencent.mm.media.f;

import a.l;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/mix/MixFrameSyncMgr;", "", "videoPath", "", "emojiFrameRetriever", "Lcom/tencent/mm/media/mix/FrameRetriever;", "(Ljava/lang/String;Lcom/tencent/mm/media/mix/FrameRetriever;)V", "TAG", "currentEmojiFrame", "Landroid/graphics/Bitmap;", "getCurrentEmojiFrame", "()Landroid/graphics/Bitmap;", "setCurrentEmojiFrame", "(Landroid/graphics/Bitmap;)V", "currentEmojiFrameDuration", "", "getCurrentEmojiFrameDuration", "()J", "setCurrentEmojiFrameDuration", "(J)V", "currentEmojiFrameStartTime", "", "getCurrentEmojiFrameStartTime", "()F", "setCurrentEmojiFrameStartTime", "(F)V", "emojiPassDuration", "getEmojiPassDuration", "setEmojiPassDuration", "targetFrameCount", "", "getTargetFrameCount", "()I", "setTargetFrameCount", "(I)V", "targetFrameDuration", "getTargetFrameDuration", "setTargetFrameDuration", "targetFrameRate", "getTargetFrameRate", "setTargetFrameRate", "targetPassDuration", "getTargetPassDuration", "setTargetPassDuration", "targetPassFrame", "getTargetPassFrame", "setTargetPassFrame", "videoDuration", "getVideoDuration", "setVideoDuration", "videoFrameCount", "getVideoFrameCount", "setVideoFrameCount", "videoFrameDuration", "getVideoFrameDuration", "setVideoFrameDuration", "videoFrameFps", "getVideoFrameFps", "setVideoFrameFps", "videoPassDuration", "getVideoPassDuration", "setVideoPassDuration", "videoPassFrame", "getVideoPassFrame", "setVideoPassFrame", "frameDuration", "needSkipFrame", "", "syncMixNextFrame", "Lcom/tencent/mm/media/mix/MixFrameSyncMgr$NextFrameInfo;", "framePass", "NextFrameInfo", "plugin-mediaeditor_release"})
public class e
{
  public final String TAG;
  protected int eWI;
  protected int eWJ;
  protected int eWK;
  public int eWL;
  private float eWM;
  public Bitmap eWN;
  public float eWO;
  protected int eWP;
  public int eWQ;
  protected int eWR;
  public float eWS;
  public float eWT;
  public float eWU;
  public float eWV;
  public final d eWW;

  public e(String paramString, d paramd)
  {
    AppMethodBeat.i(12999);
    this.eWW = paramd;
    this.TAG = "MicroMsg.MixFrameSyncMgr";
    this.eWM = -1.0F;
    paramString = com.tencent.mm.plugin.sight.base.d.WR(paramString);
    if ((paramString instanceof a))
    {
      this.eWJ = paramString.eTk;
      this.eWK = paramString.eWK;
      this.eWS = (1000.0F / paramString.eTk);
      this.eWI = ((int)(this.eWJ * (this.eWK / 1000.0D)));
    }
    while (true)
    {
      this.eWR = this.eWJ;
      this.eWU = this.eWS;
      this.eWP = this.eWI;
      this.eWQ = 0;
      AppMethodBeat.o(12999);
      return;
      this.eWI = 0;
      this.eWJ = 0;
      this.eWS = 0.0F;
      this.eWK = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.f.e
 * JD-Core Version:    0.6.2
 */
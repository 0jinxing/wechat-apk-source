package com.tencent.mm.plugin.story.model.e;

import a.f.a.m;
import a.f.a.q;
import a.f.b.j;
import a.f.b.k;
import a.y;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.f.c;
import com.tencent.mm.plugin.story.g.f;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/mix/StoryVideoMixer;", "", "captureInfo", "Lcom/tencent/mm/plugin/story/data/StoryCaptureInfo;", "editorItems", "", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "drawingRect", "", "mixVideoPath", "", "mixThumbPath", "retryTime", "", "(Lcom/tencent/mm/plugin/story/data/StoryCaptureInfo;Ljava/util/List;[FLjava/lang/String;Ljava/lang/String;I)V", "audioBitrate", "audioSampleRate", "blendBitmapProvider", "Lkotlin/Function1;", "", "Landroid/graphics/Bitmap;", "getCaptureInfo", "()Lcom/tencent/mm/plugin/story/data/StoryCaptureInfo;", "getDrawingRect", "()[F", "getEditorItems", "()Ljava/util/List;", "framePassDuration", "frameRetriever", "Lcom/tencent/mm/plugin/story/model/mix/StoryFrameRetriever;", "lastFrameInfo", "Lcom/tencent/mm/media/mix/FrameInfo;", "getMixThumbPath", "()Ljava/lang/String;", "setMixThumbPath", "(Ljava/lang/String;)V", "getMixVideoPath", "setMixVideoPath", "onFinish", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "mixVideo", "mixThumb", "", "ret", "", "getRetryTime", "()I", "setRetryTime", "(I)V", "videoBitrate", "videoFrameRate", "videoHeight", "videoRotate", "videoWidth", "blendBitmap", "graffiti", "thumb", "calcMixEmojiSize", "Landroid/graphics/Point;", "checkAudioCache", "callback", "Lkotlin/Function0;", "createGraffitiThumb", "createThumb", "makeSureConfig", "mix", "start", "Companion", "plugin-story_release"})
public final class b
{
  public static final b.a rWB;
  private int audioSampleRate;
  private int eRs;
  public final List<com.tencent.mm.media.editor.a.b> eWG;
  public int eXL;
  public final a.f.a.b<Long, Bitmap> eXh;
  private int fzS;
  String rWA;
  private q<? super String, ? super String, ? super Boolean, y> rWt;
  private long rWu;
  private c rWv;
  public a rWw;
  final com.tencent.mm.plugin.story.e.a rWx;
  public final float[] rWy;
  String rWz;
  private int videoBitrate;
  private int videoFrameRate;
  private int videoHeight;
  private int videoWidth;

  static
  {
    AppMethodBeat.i(109339);
    rWB = new b.a((byte)0);
    AppMethodBeat.o(109339);
  }

  private b(com.tencent.mm.plugin.story.e.a parama, List<com.tencent.mm.media.editor.a.b> paramList, float[] paramArrayOfFloat, String paramString1, String paramString2)
  {
    AppMethodBeat.i(109338);
    this.rWx = parama;
    this.eWG = paramList;
    this.rWy = paramArrayOfFloat;
    this.rWz = paramString1;
    this.rWA = paramString2;
    this.eRs = 1;
    this.rWu = -1L;
    if (!e.ct(this.rWz))
    {
      parama = com.tencent.mm.plugin.story.model.l.rTg;
      com.tencent.mm.plugin.story.model.l.aay(this.rWz);
    }
    if (!e.ct(this.rWA))
    {
      parama = com.tencent.mm.plugin.story.model.l.rTg;
      com.tencent.mm.plugin.story.model.l.aay(this.rWA);
    }
    ab.i("MicroMsg.Media.StoryVideoMixer", "create StoryVideoMixer, videoPath:" + this.rWx.fbT + ", outputFilePath:" + this.rWz + ", isCaptureVideo:" + this.rWx.fbV + ", retryTime:" + this.eRs);
    if (!e.ct(this.rWx.fbT))
    {
      parama = f.sbT;
      f.lJ(this.rWx.fbV);
    }
    this.eXh = ((a.f.a.b)new b.b(this));
    AppMethodBeat.o(109338);
  }

  public static Point fL(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109337);
    Point localPoint = new Point(paramInt1 * 1, paramInt2 * 1);
    AppMethodBeat.o(109337);
    return localPoint;
  }

  public final void a(q<? super String, ? super String, ? super Boolean, y> paramq)
  {
    AppMethodBeat.i(109336);
    ab.i("MicroMsg.Media.StoryVideoMixer", "Start mixer " + bo.dpG());
    this.rWt = paramq;
    paramq = (a.f.a.a)new b.e(this, paramq);
    if (this.rWx.rRJ != null)
    {
      Object localObject = this.rWx.rRJ;
      if (localObject == null)
        j.dWJ();
      if (!((AudioCacheInfo)localObject).aIM)
      {
        localObject = g.rUG;
        localObject = g.cyW();
        AudioCacheInfo localAudioCacheInfo = this.rWx.rRJ;
        if (localAudioCacheInfo == null)
          j.dWJ();
        ((g)localObject).a(localAudioCacheInfo, (m)new b.c(paramq));
        AppMethodBeat.o(109336);
      }
    }
    while (true)
    {
      return;
      paramq.invoke();
      AppMethodBeat.o(109336);
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "", "invoke"})
  static final class d extends k
    implements a.f.a.b<String, y>
  {
    d(b paramb)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.e.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.story.model.audio;

import a.l;
import a.y;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.mmsight.segment.d.a;
import com.tencent.mm.protocal.protobuf.bql;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;
import java.util.concurrent.Callable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/GetRecommendAudioTask;", "", "videoPath", "", "startTime", "", "endTime", "(Ljava/lang/String;JJ)V", "TAG", "callback", "Lkotlin/Function1;", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/RecommendedMusicInfo;", "", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "getEndTime", "()J", "frameInterval", "", "imageData", "Lcom/tencent/mm/protobuf/ByteString;", "imageDataTime", "", "isLoading", "", "()Z", "setLoading", "(Z)V", "lastRequestId", "latitude", "", "longitude", "getStartTime", "thumbFetcherPool", "Lcom/tencent/mm/plugin/mmsight/segment/ISegmentThumbFetcher$FetcherPool;", "thumbHeight", "thumbTarget", "thumbWidth", "getVideoPath", "()Ljava/lang/String;", "getMusicRequestId", "loadMore", "processImageData", "plugin-story_release"})
public final class f
{
  public final String TAG;
  public float cEB;
  public float cGm;
  private final long endTime;
  public a.f.a.b<? super LinkedList<bql>, y> exD;
  int fgI;
  int fgJ;
  int frameInterval;
  public boolean isLoading;
  public final LinkedList<com.tencent.mm.bt.b> rUA;
  public long rUB;
  private final d.a rUC;
  private int rUy;
  private int[] rUz;
  private final long startTime;
  final String videoPath;

  public f(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(109197);
    this.videoPath = paramString;
    this.startTime = paramLong1;
    this.endTime = paramLong2;
    this.TAG = "MicroMsg.GetRecommendAudioTask";
    this.frameInterval = 1000;
    this.rUy = 299;
    this.fgJ = 299;
    this.fgI = 299;
    this.rUz = new int[0];
    this.rUA = new LinkedList();
    this.rUy = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGi, 299);
    this.fgJ = this.rUy;
    this.fgI = this.rUy;
    ab.i(this.TAG, "GetRecommendAudioTask thumbWidth " + this.fgJ + " thumbHeight " + this.fgI + " thumbTarget " + this.rUy);
    paramString = com.tencent.mm.plugin.sight.base.d.WR(this.videoPath);
    int i;
    if (paramString != null)
    {
      i = paramString.eWK;
      if (i > 0)
        break label377;
    }
    while (true)
    {
      try
      {
        paramString = new android/media/MediaMetadataRetriever;
        paramString.<init>();
        paramString.setDataSource(this.videoPath);
        int j = bo.getInt(paramString.extractMetadata(9), 0);
        i = j;
        if (i <= 0)
          ab.w(this.TAG, "get video duration error! file exit: " + e.ct(this.videoPath));
        this.rUC = new d.a(3, (Callable)new f.1(this));
        if (this.startTime < 0L)
          break label380;
        paramLong1 = this.startTime;
        if (this.endTime < 0L)
          break label385;
        paramLong2 = this.endTime;
        if (paramLong2 - paramLong1 <= 0L)
          break label393;
        this.rUz = new int[] { (int)(100L + paramLong1), (int)((paramLong2 - paramLong1) / 2L), (int)(paramLong2 - 100L) };
        cyV();
        AppMethodBeat.o(109197);
        return;
        i = 0;
      }
      catch (Exception paramString)
      {
      }
      label377: continue;
      label380: paramLong1 = 0L;
      continue;
      label385: paramLong2 = i;
      continue;
      label393: if (i > 300)
        this.rUz = new int[] { 100, i / 2, i - 100 };
    }
  }

  private final void cyV()
  {
    AppMethodBeat.i(109196);
    try
    {
      Bitmap localBitmap1 = Bitmap.createBitmap(this.fgJ, this.fgI, Bitmap.Config.ARGB_8888);
      Object localObject1 = Bitmap.createBitmap(this.fgJ, this.fgI, Bitmap.Config.ARGB_8888);
      com.tencent.mm.plugin.mmsight.segment.d locald = this.rUC.bQd();
      locald.reuseBitmap((Bitmap)localObject1);
      localObject1 = this.rUz;
      int i = localObject1.length;
      for (int j = 0; j < i; j++)
      {
        Bitmap localBitmap2 = locald.getFrameAtTime(localObject1[j]);
        Object localObject2 = new android/graphics/Canvas;
        ((Canvas)localObject2).<init>(localBitmap1);
        Object localObject3 = new android/graphics/Rect;
        ((Rect)localObject3).<init>(0, 0, this.fgJ, this.fgI);
        ((Canvas)localObject2).drawBitmap(localBitmap2, null, (Rect)localObject3, null);
        localObject3 = this.rUA;
        localObject2 = new com/tencent/mm/bt/b;
        ((com.tencent.mm.bt.b)localObject2).<init>(com.tencent.mm.sdk.platformtools.d.c(localBitmap1, 50));
        ((LinkedList)localObject3).add(localObject2);
      }
      this.rUC.a(locald);
      this.rUC.destroy();
      AppMethodBeat.o(109196);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "processImageData error", new Object[0]);
        AppMethodBeat.o(109196);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.f
 * JD-Core Version:    0.6.2
 */
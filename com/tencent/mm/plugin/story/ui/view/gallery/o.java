package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.exoplayer2.g.a.a;
import com.google.android.exoplayer2.g.f.a;
import com.google.android.exoplayer2.g.h;
import com.google.android.exoplayer2.h.k;
import com.google.android.exoplayer2.source.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.story.e.c.a;
import com.tencent.mm.plugin.story.e.c.a.a;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.g.a;
import com.tencent.mm.plugin.story.model.e.a;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewFakeLayer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "backgrounndSilent", "", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "fakeImageView", "Landroid/widget/ImageView;", "fakeMusicInfo", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "fakeVideoInfo", "Lcom/tencent/mm/protocal/protobuf/StoryEditorProtoData;", "loopingFrame", "startTime", "", "stopTime", "storyFrameRetriever", "Lcom/tencent/mm/plugin/story/model/mix/StoryFrameRetriever;", "useFakeImage", "videoPlaying", "checkFakeVideoMatchScreenRatio", "isBackgroundSilent", "pauseFakeLayer", "", "playAudio", "playFakeLayer", "mute", "requestLoopFakeFrame", "frameRetriever", "setFakeVideoInfo", "stopFakeLayer", "plugin-story_release"})
public final class o extends RelativeLayout
{
  private final String TAG;
  private long eDL;
  private com.google.android.exoplayer2.v rYo;
  private cee sqN;
  private AudioCacheInfo sqO;
  boolean sqP;
  private ImageView sqQ;
  private a sqR;
  private boolean sqS;
  private boolean sqT;
  private long startTime;

  public o(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110960);
    this.TAG = "MicroMsg.StoryVideoViewFakeLayer";
    AppMethodBeat.o(110960);
  }

  private final void a(a parama)
  {
    AppMethodBeat.i(110955);
    if (!this.sqS)
    {
      ab.i(this.TAG, "requestLoopFakeFrame stop");
      AppMethodBeat.o(110955);
    }
    while (true)
    {
      return;
      if ((j.j(parama, this.sqR) ^ true))
      {
        ab.i(this.TAG, "requestLoopFakeFrame frameRetriever not match");
        AppMethodBeat.o(110955);
      }
      else
      {
        Object localObject = this.sqN;
        if (((localObject != null) && (((cee)localObject).fbV == true)) || (!this.sqT))
        {
          ab.i(this.TAG, "requestLoopFakeFrame local capture video or not useFakeImage");
          AppMethodBeat.o(110955);
        }
        else
        {
          com.tencent.mm.media.f.c localc = parama.UX();
          ImageView localImageView = this.sqQ;
          label123: long l;
          label171: int i;
          if (localImageView != null)
          {
            if (localc != null)
            {
              localObject = localc.bitmap;
              localImageView.setImageBitmap((Bitmap)localObject);
            }
          }
          else
          {
            localObject = this.sqQ;
            if (localObject != null)
              ((ImageView)localObject).setVisibility(0);
            if (localc == null)
              break label279;
            localObject = Long.valueOf(localc.eWH);
            l = ((Number)localObject).longValue();
            if (1L <= l)
              break label233;
            i = 0;
            label174: if (i == 0)
              break label266;
          }
          while (true)
            if (localObject != null)
            {
              l = ((Number)localObject).longValue();
              localObject = this.sqQ;
              if (localObject != null)
              {
                ((ImageView)localObject).postDelayed((Runnable)new o.a(this, parama), l);
                AppMethodBeat.o(110955);
                break;
                localObject = null;
                break label123;
                label233: if ((1000L < l) || (!this.sqS) || (!j.j(parama, this.sqR)))
                  break label171;
                i = 1;
                break label174;
                label266: localObject = null;
                continue;
              }
              AppMethodBeat.o(110955);
              break;
            }
          label279: AppMethodBeat.o(110955);
        }
      }
    }
  }

  private final void playAudio()
  {
    AppMethodBeat.i(110959);
    Object localObject1 = new com.google.android.exoplayer2.g.c((f.a)new a.a((com.google.android.exoplayer2.h.d)new k()));
    Object localObject2 = com.google.android.exoplayer2.i.v.i(getContext(), getContext().getString(2131296982));
    this.rYo = com.google.android.exoplayer2.g.a(getContext(), (h)localObject1);
    try
    {
      localObject1 = com.tencent.mm.plugin.story.model.audio.g.rUG;
      localObject1 = this.sqO;
      if (localObject1 == null)
        j.dWJ();
      j.o(localObject2, "userAgent");
      localObject1 = g.a.a((AudioCacheInfo)localObject1, (String)localObject2);
      localObject2 = new com/google/android/exoplayer2/source/d;
      ((com.google.android.exoplayer2.source.d)localObject2).<init>((i)localObject1, this.startTime, this.eDL * 1000L);
      localObject1 = this.rYo;
      if (localObject1 != null)
        ((com.google.android.exoplayer2.v)localObject1).aE(true);
      localObject1 = this.rYo;
      if (localObject1 != null)
        ((com.google.android.exoplayer2.v)localObject1).a((i)localObject2);
      localObject2 = this.rYo;
      if (localObject2 != null)
      {
        ((com.google.android.exoplayer2.v)localObject2).setRepeatMode(2);
        AppMethodBeat.o(110959);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(110959);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "", new Object[0]);
        AppMethodBeat.o(110959);
      }
    }
  }

  public final void cDc()
  {
    AppMethodBeat.i(110957);
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("LogStory: pauseFakeLayer ");
    Object localObject = this.sqN;
    if (localObject != null);
    for (localObject = Long.valueOf(((cee)localObject).timeStamp); ; localObject = null)
    {
      ab.i(str, localObject);
      localObject = this.rYo;
      if (localObject != null)
        ((com.google.android.exoplayer2.v)localObject).aE(false);
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        localObject = getChildAt(j);
        if ((localObject instanceof MMAnimateView))
          ((MMAnimateView)localObject).pause();
      }
    }
    this.sqS = false;
    localObject = this.sqQ;
    if (localObject != null)
      ((ImageView)localObject).setImageBitmap(null);
    localObject = this.sqQ;
    if (localObject != null)
      ((ImageView)localObject).setVisibility(8);
    localObject = this.sqR;
    if (localObject != null)
      ((a)localObject).destroy();
    this.sqR = null;
    AppMethodBeat.o(110957);
  }

  public final void cDd()
  {
    AppMethodBeat.i(110958);
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("LogStory: stopFakeLayer ");
    Object localObject = this.sqN;
    if (localObject != null);
    for (localObject = Long.valueOf(((cee)localObject).timeStamp); ; localObject = null)
    {
      ab.i(str, localObject);
      localObject = this.rYo;
      if (localObject != null)
        ((com.google.android.exoplayer2.v)localObject).stop();
      localObject = this.rYo;
      if (localObject != null)
        ((com.google.android.exoplayer2.v)localObject).release();
      this.rYo = null;
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        localObject = getChildAt(j);
        if ((localObject instanceof MMAnimateView))
          ((MMAnimateView)localObject).stop();
      }
    }
    this.sqS = false;
    localObject = this.sqQ;
    if (localObject != null)
      ((ImageView)localObject).setImageBitmap(null);
    localObject = this.sqQ;
    if (localObject != null)
      ((ImageView)localObject).setVisibility(8);
    localObject = this.sqR;
    if (localObject != null)
      ((a)localObject).destroy();
    this.sqR = null;
    AppMethodBeat.o(110958);
  }

  public final void lW(boolean paramBoolean)
  {
    AppMethodBeat.i(110956);
    String str = this.TAG;
    Object localObject1 = new StringBuilder("LogStory: playFakeLayer ");
    Object localObject2 = this.sqN;
    if (localObject2 != null);
    for (localObject2 = Long.valueOf(((cee)localObject2).timeStamp); ; localObject2 = null)
    {
      ab.i(str, localObject2);
      localObject2 = this.rYo;
      if (localObject2 != null)
        ((com.google.android.exoplayer2.v)localObject2).stop();
      localObject2 = this.rYo;
      if (localObject2 != null)
        ((com.google.android.exoplayer2.v)localObject2).release();
      if ((this.sqO != null) && (!paramBoolean))
        playAudio();
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        localObject2 = getChildAt(j);
        if ((localObject2 instanceof MMAnimateView))
          ((MMAnimateView)localObject2).resume();
      }
    }
    if (this.sqT)
    {
      localObject2 = this.sqN;
      if (localObject2 != null)
      {
        localObject1 = this.sqR;
        if (localObject1 != null)
          ((a)localObject1).destroy();
        localObject1 = this.sqQ;
        if (localObject1 != null)
          ((ImageView)localObject1).setImageBitmap(null);
        localObject1 = com.tencent.mm.plugin.story.f.l.sac;
        localObject1 = getContext();
        j.o(localObject1, "context");
        this.sqR = com.tencent.mm.plugin.story.f.l.b((cee)localObject2, (Context)localObject1);
        localObject2 = this.sqR;
        if (localObject2 != null)
        {
          ((a)localObject2).start();
          this.sqS = true;
          a((a)localObject2);
          AppMethodBeat.o(110956);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110956);
      continue;
      AppMethodBeat.o(110956);
    }
  }

  public final void setFakeVideoInfo(cee paramcee)
  {
    boolean bool1 = true;
    AppMethodBeat.i(110954);
    j.p(paramcee, "fakeVideoInfo");
    ab.i(this.TAG, "LogStory: setFakeVideoInfo " + paramcee.timeStamp);
    this.sqN = paramcee;
    if (this.sqQ == null)
    {
      localObject = new ImageView(getContext());
      ((ImageView)localObject).setScaleType(ImageView.ScaleType.CENTER_CROP);
      this.sqQ = ((ImageView)localObject);
    }
    removeAllViews();
    Object localObject = this.sqN;
    boolean bool3;
    if (localObject != null)
    {
      localObject = ((cee)localObject).videoPath;
      if (localObject != null)
      {
        c.a locala = com.tencent.mm.plugin.story.e.c.rRS;
        localObject = c.a.aaj((String)localObject);
        if (localObject != null)
        {
          bool2 = ((c.a.a)localObject).rRT;
          if ((paramcee.fbV) || (bool2))
            break label355;
          bool3 = true;
          label135: this.sqT = bool3;
          ab.i(this.TAG, "useFakeImage:" + this.sqT + ", isCaptureVideo:" + paramcee.fbV + ", matchScreenRatio:" + bool2);
          if (!this.sqT)
            break label361;
          addView((View)this.sqQ, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1));
          localObject = this.sqQ;
          if (localObject != null)
            ((ImageView)localObject).setVisibility(0);
          label236: if (paramcee.eYi == null)
            break label403;
          localObject = new AudioCacheInfo();
          ((AudioCacheInfo)localObject).rTW = paramcee.rTW;
          ((AudioCacheInfo)localObject).aIM = paramcee.aIM;
          ((AudioCacheInfo)localObject).cachePath = paramcee.eYi;
          ((AudioCacheInfo)localObject).musicUrl = paramcee.musicUrl;
          this.sqO = ((AudioCacheInfo)localObject);
          label288: bool2 = bool1;
          if (paramcee.eTb != 0)
            if (paramcee.eTb != 2)
              break label411;
        }
      }
    }
    label403: label411: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.sqP = bool2;
      this.startTime = paramcee.startTime;
      this.eDL = paramcee.endTime;
      this.sqS = false;
      AppMethodBeat.o(110954);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break;
      label355: bool3 = false;
      break label135;
      label361: localObject = com.tencent.mm.plugin.story.f.l.sac;
      localObject = getContext();
      j.o(localObject, "context");
      com.tencent.mm.plugin.story.f.l.a(paramcee, (Context)localObject, (ViewGroup)this);
      localObject = this.sqQ;
      if (localObject == null)
        break label236;
      ((ImageView)localObject).setVisibility(8);
      break label236;
      this.sqO = null;
      break label288;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.o
 * JD-Core Version:    0.6.2
 */
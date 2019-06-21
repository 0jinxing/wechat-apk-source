package com.tencent.mm.plugin.emojicapture.ui;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.c;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTextureView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "TAG", "", "afterSeekPlay", "", "callback", "Lcom/tencent/mm/pluginsdk/ui/tools/IVideoView$IVideoCallback;", "isMute", "isOnlineVideo", "isPrepared", "isRemoveBg", "lastSurfaceUpdatedTime", "", "needReset", "onSurfaceCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/IVideoView$OnSurfaceCallback;", "oneTimeTextureUpdateCallback", "Lkotlin/Function0;", "", "openWithNoneSurface", "path", "pauseByDestroyed", "pauseWhenUpdated", "player", "Lcom/tencent/mm/plugin/mmplayer/VideoPlayer;", "playerCallback", "Lcom/tencent/mm/plugin/mmplayer/IPlayerCallback;", "removeBgEnable", "renderSurface", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureRenderSurface;", "renderer", "Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiVideoPlayTextureRenderer;", "seekCompleteCallback", "Lkotlin/Function1;", "surface", "Landroid/view/Surface;", "useMp4Extrator", "videoHeight", "videoWidth", "getDuration", "getPlayRate", "", "getVideoPath", "isPlaying", "onSurfaceTextureAvailable", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "openVideo", "pause", "seekTo", "time", "", "setOneTimeVideoTextureUpdateCallback", "_callback", "setPlayRate", "rate", "setRemoveBackground", "remove", "afterDraw", "setRemoveBgEnable", "setVideoCallback", "setVideoPath", "start", "stop", "plugin-emojicapture_release"})
public final class EmojiVideoPlayTextureView extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private final String TAG;
  private boolean VN;
  private Surface aOO;
  private boolean eif;
  private boolean liA;
  public com.tencent.mm.plugin.n.i llA;
  public boolean llB;
  private long llC;
  private boolean llD;
  private e.a llE;
  private a<y> llF;
  private a.f.a.b<? super Boolean, y> llG;
  private e.d llH;
  private boolean llI;
  private boolean llJ;
  private boolean llK;
  private boolean llL;
  private boolean llM;
  private boolean llN;
  private c llO;
  private com.tencent.mm.plugin.emojicapture.ui.b.i llt;
  private b llz;
  private String path;
  private int videoHeight;
  private int videoWidth;

  public EmojiVideoPlayTextureView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(2931);
    this.TAG = "MicroMsg.EmojiVideoPlayTextureView";
    this.path = "";
    this.llB = true;
    this.llN = true;
    setSurfaceTextureListener((TextureView.SurfaceTextureListener)this);
    setOpaque(false);
    this.llO = ((c)new EmojiVideoPlayTextureView.c(this));
    AppMethodBeat.o(2931);
  }

  public EmojiVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(2929);
    this.TAG = "MicroMsg.EmojiVideoPlayTextureView";
    this.path = "";
    this.llB = true;
    this.llN = true;
    setSurfaceTextureListener((TextureView.SurfaceTextureListener)this);
    setOpaque(false);
    this.llO = ((c)new EmojiVideoPlayTextureView.c(this));
    AppMethodBeat.o(2929);
  }

  public EmojiVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(2930);
    this.TAG = "MicroMsg.EmojiVideoPlayTextureView";
    this.path = "";
    this.llB = true;
    this.llN = true;
    setSurfaceTextureListener((TextureView.SurfaceTextureListener)this);
    setOpaque(false);
    this.llO = ((c)new EmojiVideoPlayTextureView.c(this));
    AppMethodBeat.o(2930);
  }

  private final void bnS()
  {
    AppMethodBeat.i(2920);
    ab.i(this.TAG, "%d open video [%s]", new Object[] { Integer.valueOf(hashCode()), this.path });
    com.tencent.mm.plugin.n.i locali;
    if (this.llA != null)
    {
      locali = this.llA;
      if (locali != null)
        locali.a(null);
      locali = this.llA;
      if (locali != null)
        locali.stop();
      locali = this.llA;
      if (locali != null)
        locali.release();
      this.llA = null;
    }
    if ((bo.isNullOrNil(this.path)) || (this.aOO == null))
    {
      ab.w(this.TAG, "%d open video but path is null or mSurface is null", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(2920);
    }
    while (true)
    {
      return;
      try
      {
        this.VN = false;
        locali = new com/tencent/mm/plugin/n/i;
        locali.<init>(Looper.getMainLooper());
        this.llA = locali;
        locali = this.llA;
        if (locali != null)
          locali.setPath(this.path);
        locali = this.llA;
        if (locali != null)
          locali.setNeedResetExtractor(this.llI);
        locali = this.llA;
        if (locali != null)
          locali.setIsOnlineVideoType(this.llJ);
        locali = this.llA;
        if (locali != null)
          locali.a(this.llO);
        locali = this.llA;
        if (locali != null)
          locali.setSurface(this.aOO);
        locali = this.llA;
        if (locali != null)
          locali.iU(this.llK);
        locali = this.llA;
        if (locali != null)
          locali.setMute(true);
        if (this.aOO != null)
        {
          locali = this.llA;
          if (locali != null)
          {
            locali.prepare();
            AppMethodBeat.o(2920);
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "prepare async error %s", new Object[] { localException.getMessage() });
        Object localObject = this.llE;
        if (localObject != null)
        {
          ((e.a)localObject).onError(-1, -1);
          AppMethodBeat.o(2920);
          continue;
          AppMethodBeat.o(2920);
          continue;
          if (this.llD)
          {
            localObject = this.llA;
            if (localObject != null)
            {
              ((com.tencent.mm.plugin.n.i)localObject).prepare();
              AppMethodBeat.o(2920);
            }
          }
          else
          {
            AppMethodBeat.o(2920);
          }
        }
        else
        {
          AppMethodBeat.o(2920);
        }
      }
    }
  }

  public final void b(boolean paramBoolean, a<y> parama)
  {
    AppMethodBeat.i(2917);
    this.liA = paramBoolean;
    com.tencent.mm.plugin.emojicapture.ui.b.i locali = this.llt;
    if (locali != null)
      locali.ljd = paramBoolean;
    locali = this.llt;
    if (locali != null)
    {
      locali.lqm = ((a)new EmojiVideoPlayTextureView.d(this, parama));
      AppMethodBeat.o(2917);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2917);
    }
  }

  public final int getDuration()
  {
    AppMethodBeat.i(2924);
    int i;
    if (this.llA != null)
    {
      com.tencent.mm.plugin.n.i locali = this.llA;
      if (locali == null)
        j.dWJ();
      i = (int)locali.bPa();
      AppMethodBeat.o(2924);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(2924);
    }
  }

  public final float getPlayRate()
  {
    AppMethodBeat.i(2919);
    float f;
    if (this.llA != null)
    {
      com.tencent.mm.plugin.n.i locali = this.llA;
      if (locali == null)
        j.dWJ();
      f = locali.getPlayRate();
      AppMethodBeat.o(2919);
    }
    while (true)
    {
      return f;
      f = 1.0F;
      AppMethodBeat.o(2919);
    }
  }

  public final String getVideoPath()
  {
    return this.path;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(2913);
    boolean bool;
    if (((this.llA instanceof com.tencent.mm.plugin.n.i)) && (this.llA != null))
    {
      com.tencent.mm.plugin.n.i locali = this.llA;
      if (locali == null)
        j.dWJ();
      bool = locali.isPlaying();
      AppMethodBeat.o(2913);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(2913);
    }
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2928);
    dAh();
    ab.i(this.TAG, "onSurfaceTextureAvailable, " + paramInt1 + ", " + paramInt2 + ", " + paramSurfaceTexture);
    if (paramSurfaceTexture != null);
    while (true)
    {
      try
      {
        com.tencent.mm.plugin.emojicapture.ui.b.i locali = new com/tencent/mm/plugin/emojicapture/ui/b/i;
        locali.<init>(this.llN);
        Object localObject1 = this.llt;
        if (localObject1 != null)
          ((com.tencent.mm.plugin.emojicapture.ui.b.i)localObject1).release();
        this.llt = locali;
        if (this.llL)
        {
          setVisibility(4);
          localObject1 = this.llt;
          if (localObject1 != null)
            ((com.tencent.mm.plugin.emojicapture.ui.b.i)localObject1).ljd = this.liA;
          localObject1 = this.llt;
          if (localObject1 != null)
          {
            localObject2 = new com/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView$a;
            ((EmojiVideoPlayTextureView.a)localObject2).<init>(this);
            ((com.tencent.mm.plugin.emojicapture.ui.b.i)localObject1).lqm = ((a)localObject2);
          }
        }
        localObject1 = new com/tencent/mm/plugin/emojicapture/ui/b;
        Object localObject2 = new com/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView$b;
        ((b)localObject2).<init>(this, paramInt1, paramInt2, locali);
        ((b)localObject1).<init>(paramSurfaceTexture, locali, (a.f.a.b)localObject2);
        this.llz = ((b)localObject1);
        AppMethodBeat.o(2928);
        return;
      }
      catch (Exception paramSurfaceTexture)
      {
        ab.i(this.TAG, "onSurfaceTextureAvailable error: ".concat(String.valueOf(paramSurfaceTexture)));
      }
      AppMethodBeat.o(2928);
    }
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(2927);
    ab.i(this.TAG, "onSurfaceTextureDestroyed");
    paramSurfaceTexture = this.llz;
    if (paramSurfaceTexture != null)
      paramSurfaceTexture.gF(false);
    paramSurfaceTexture = this.llz;
    if (paramSurfaceTexture != null)
      paramSurfaceTexture.b((a)new b.a(paramSurfaceTexture));
    this.aOO = null;
    this.llL = false;
    this.llM = false;
    if (this.llA != null)
      if (isPlaying())
      {
        this.llL = true;
        paramSurfaceTexture = this.llA;
        if (paramSurfaceTexture != null)
          paramSurfaceTexture.pause();
      }
    while (true)
    {
      AppMethodBeat.o(2927);
      return false;
      this.llL = false;
    }
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2925);
    ab.i(this.TAG, "onSurfaceTextureSizeChanged " + paramInt1 + ", " + paramInt2);
    paramSurfaceTexture = this.llt;
    if (paramSurfaceTexture != null)
    {
      paramSurfaceTexture.dY(paramInt1, paramInt2);
      AppMethodBeat.o(2925);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2925);
    }
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(2926);
    if ((this.llM) && (this.llC > 0L))
    {
      paramSurfaceTexture = this.llA;
      if (paramSurfaceTexture != null)
        paramSurfaceTexture.pause();
      paramSurfaceTexture = this.llA;
      if (paramSurfaceTexture != null)
        paramSurfaceTexture.setMute(this.eif);
      this.llM = false;
    }
    if ((this.llC > 0L) && (this.llF != null))
    {
      ab.i(this.TAG, "%d notify surface update", new Object[] { Integer.valueOf(hashCode()) });
      paramSurfaceTexture = this.llF;
      if (paramSurfaceTexture != null)
        paramSurfaceTexture.invoke();
      this.llF = null;
    }
    this.llC = System.currentTimeMillis();
    AppMethodBeat.o(2926);
  }

  public final void pause()
  {
    AppMethodBeat.i(2923);
    if (this.llA != null)
    {
      Object localObject = this.llA;
      if (localObject == null)
        j.dWJ();
      if (((com.tencent.mm.plugin.n.i)localObject).isPlaying())
      {
        localObject = this.llA;
        if (localObject != null)
          ((com.tencent.mm.plugin.n.i)localObject).pause();
        localObject = this.llz;
        if (localObject != null)
          ((b)localObject).gG(true);
      }
    }
    this.llL = false;
    AppMethodBeat.o(2923);
  }

  public final void setOneTimeVideoTextureUpdateCallback(a<y> parama)
  {
    this.llF = parama;
  }

  public final void setPlayRate(float paramFloat)
  {
    AppMethodBeat.i(2916);
    com.tencent.mm.plugin.n.i locali = this.llA;
    if (locali != null)
    {
      locali.setPlayRate(paramFloat);
      AppMethodBeat.o(2916);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2916);
    }
  }

  public final void setRemoveBgEnable(boolean paramBoolean)
  {
    this.llN = paramBoolean;
  }

  public final void setVideoCallback(e.a parama)
  {
    AppMethodBeat.i(2915);
    j.p(parama, "callback");
    this.llE = parama;
    AppMethodBeat.o(2915);
  }

  public final void setVideoPath(String paramString)
  {
    AppMethodBeat.i(2914);
    j.p(paramString, "path");
    ab.i(this.TAG, "%d set video path [%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    this.path = paramString;
    bnS();
    requestLayout();
    AppMethodBeat.o(2914);
  }

  public final boolean start()
  {
    boolean bool1 = true;
    AppMethodBeat.i(2921);
    if ((this.llA != null) && (this.VN))
    {
      localObject = this.TAG;
      i = hashCode();
      boolean bool2 = this.llM;
      boolean bool3 = this.llL;
      if (this.aOO != null)
      {
        bool4 = true;
        ab.i((String)localObject, "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
        if (this.aOO != null)
          break label126;
        this.llL = true;
        AppMethodBeat.o(2921);
        bool4 = bool1;
      }
      while (true)
      {
        return bool4;
        bool4 = false;
        break;
        label126: if (this.llM)
        {
          this.llL = true;
          this.llM = false;
          AppMethodBeat.o(2921);
          bool4 = bool1;
        }
        else
        {
          localObject = this.llA;
          if (localObject != null)
            ((com.tencent.mm.plugin.n.i)localObject).start();
          localObject = this.llz;
          if (localObject != null)
            ((b)localObject).gG(false);
          AppMethodBeat.o(2921);
          bool4 = bool1;
        }
      }
    }
    Object localObject = this.TAG;
    int i = hashCode();
    if (this.llA == null);
    for (boolean bool4 = true; ; bool4 = false)
    {
      ab.w((String)localObject, "%d player is null[%b] or it prepared [%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool4), Boolean.valueOf(this.VN) });
      AppMethodBeat.o(2921);
      bool4 = false;
      break;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(2922);
    ab.i(this.TAG, "%d player stop [%s]", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    com.tencent.mm.plugin.n.i locali = this.llA;
    if (locali != null)
      locali.a(null);
    locali = this.llA;
    if (locali != null)
      locali.stop();
    locali = this.llA;
    if (locali != null)
      locali.release();
    this.llA = null;
    this.videoWidth = 0;
    this.videoHeight = 0;
    this.VN = false;
    this.path = "";
    this.llC = 0L;
    AppMethodBeat.o(2922);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureRenderSurface;", "invoke"})
  static final class b extends k
    implements a.f.a.b<b, y>
  {
    b(EmojiVideoPlayTextureView paramEmojiVideoPlayTextureView, int paramInt1, int paramInt2, com.tencent.mm.plugin.emojicapture.ui.b.i parami)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView
 * JD-Core Version:    0.6.2
 */
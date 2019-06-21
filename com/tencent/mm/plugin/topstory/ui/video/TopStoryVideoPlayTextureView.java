package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.i;
import com.tencent.mm.plugin.n.j;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.d;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class TopStoryVideoPlayTextureView extends VideoPlayerTextureView
{
  private Object lock;

  public TopStoryVideoPlayTextureView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(1779);
    this.lock = new Object();
    AppMethodBeat.o(1779);
  }

  public TopStoryVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(1780);
    this.lock = new Object();
    AppMethodBeat.o(1780);
  }

  public TopStoryVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(1781);
    this.lock = new Object();
    AppMethodBeat.o(1781);
  }

  public final void B(double paramDouble)
  {
    AppMethodBeat.i(1787);
    synchronized (this.lock)
    {
      super.B(paramDouble);
      AppMethodBeat.o(1787);
      return;
    }
  }

  public final void b(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1789);
    ab.i("MicroMsg.TopStory.TopStoryVideoPlayTextureView", "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramSurfaceTexture.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.llL) });
    try
    {
      dAh();
      Surface localSurface = new android/view/Surface;
      localSurface.<init>(paramSurfaceTexture);
      this.mSurface = localSurface;
      if ((this.llA == null) || (!this.VN))
        bnS();
      while (true)
      {
        dlB();
        if (this.llH != null)
          this.llH.akY();
        AppMethodBeat.o(1789);
        return;
        this.llA.f(this.mSurface);
        if (!com.tencent.mm.compatible.util.d.iW(23))
          break label218;
        if (!this.llL)
          break;
        this.llA.start();
        this.llL = false;
      }
    }
    catch (Exception paramSurfaceTexture)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoPlayTextureView", paramSurfaceTexture, "onSurfaceTextureAvailable failed", new Object[0]);
        AppMethodBeat.o(1789);
        continue;
        this.llM = true;
        this.llC = 0L;
        this.llA.setMute(true);
        this.llA.start();
        continue;
        label218: if (this.llL)
          d(this.llA.bPb(), true);
        else
          d(this.llA.bPb(), false);
      }
    }
  }

  public final void bnS()
  {
    AppMethodBeat.i(1783);
    ab.i("MicroMsg.TopStory.TopStoryVideoPlayTextureView", "%d open video [%s]", new Object[] { Integer.valueOf(hashCode()), this.path });
    synchronized (this.lock)
    {
      if (this.llA != null)
      {
        this.llA.orY = null;
        this.llA.orX.stop();
        this.llA.release();
        this.llA = null;
      }
      if (bo.isNullOrNil(this.path))
      {
        ab.w("MicroMsg.TopStory.TopStoryVideoPlayTextureView", "%d open video but path is null.", new Object[] { Integer.valueOf(hashCode()) });
        AppMethodBeat.o(1783);
      }
      while (true)
      {
        return;
        try
        {
          this.VN = false;
          i locali = new com/tencent/mm/plugin/n/i;
          locali.<init>(Looper.getMainLooper());
          this.llA = locali;
          this.llA.setPath(this.path);
          this.llA.setIOnlineCache(this.orK);
          this.llA.setNeedResetExtractor(this.llI);
          this.llA.setIsOnlineVideoType(this.llJ);
          this.llA.orY = this.llO;
          this.llA.setSurface(this.mSurface);
          this.llA.iU(this.llK);
          if (this.mSurface != null)
            this.llA.prepare();
          while (true)
          {
            AppMethodBeat.o(1783);
            break;
            if (this.llD)
              this.llA.prepare();
          }
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoPlayTextureView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
          if (this.llE != null)
            this.llE.onError(-1, -1);
          AppMethodBeat.o(1783);
        }
      }
    }
  }

  public final void i(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(1790);
    if ((com.tencent.mm.compatible.util.d.iW(23)) && (this.llM) && (this.llC > 0L))
    {
      if (this.llA != null)
      {
        this.llA.pause();
        this.llA.setMute(this.eif);
      }
      this.llM = false;
    }
    if ((this.llC > 0L) && (this.vvr != null))
    {
      ab.i("MicroMsg.TopStory.TopStoryVideoPlayTextureView", "%d notify surface update", new Object[] { Integer.valueOf(hashCode()) });
      this.vvr.bQL();
      this.vvr = null;
    }
    this.llC = System.currentTimeMillis();
    AppMethodBeat.o(1790);
  }

  public final void pause()
  {
    AppMethodBeat.i(1786);
    synchronized (this.lock)
    {
      super.pause();
      AppMethodBeat.o(1786);
      return;
    }
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(1788);
    synchronized (this.lock)
    {
      super.setMute(paramBoolean);
      AppMethodBeat.o(1788);
      return;
    }
  }

  public void setVideoPath(String paramString)
  {
    AppMethodBeat.i(1782);
    super.setVideoPath(paramString);
    AppMethodBeat.o(1782);
  }

  public final boolean start()
  {
    AppMethodBeat.i(1785);
    synchronized (this.lock)
    {
      boolean bool = super.start();
      AppMethodBeat.o(1785);
      return bool;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(1784);
    com.tencent.mm.sdk.g.d.post(new TopStoryVideoPlayTextureView.1(this), "player-stop");
    AppMethodBeat.o(1784);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.mmsight.segment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.Window;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.a.a.d;
import com.tencent.mm.plugin.mmsight.segment.a.c.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.concurrent.CountDownLatch;

@a(3)
public class VideoSegmentUI extends MMActivity
{
  private CountDownLatch bXQ;
  private ProgressDialog ehJ;
  private d ext;
  private int fPW;
  private String lis;
  private Surface mSurface;
  private RelativeLayout mmW;
  private VideoTransPara ouc;
  private String ozB;
  private f ozC;
  private com.tencent.mm.plugin.mmsight.segment.a.c ozD;
  private boolean ozE;
  private c ozF;
  private int ozG;
  private boolean ozH;
  private boolean ozI;
  private boolean ozJ;
  private c.b ozK;
  private c.a ozL;
  private a.d ozM;
  private String thumbPath;

  public VideoSegmentUI()
  {
    AppMethodBeat.i(55053);
    this.ozB = null;
    this.ozE = false;
    this.bXQ = new CountDownLatch(2);
    this.ozG = 10000;
    this.ehJ = null;
    this.ext = new d(this);
    this.lis = "";
    this.ozH = false;
    this.ozI = false;
    this.ozJ = false;
    this.ozK = new VideoSegmentUI.2(this);
    this.ozL = new VideoSegmentUI.3(this);
    this.ozM = new VideoSegmentUI.4(this);
    AppMethodBeat.o(55053);
  }

  private void a(boolean paramBoolean, Surface paramSurface)
  {
    AppMethodBeat.i(55056);
    if (this.ozD != null)
    {
      ab.e("MicroMsg.VideoSegmentUI", "initSegmentPlayer not null, you can not init segmentPlayer");
      AppMethodBeat.o(55056);
    }
    while (true)
    {
      return;
      this.ozD = new com.tencent.mm.plugin.mmsight.segment.a.c();
      this.ozE = false;
      this.ozD.setDataSource(this.ozB);
      this.ozD.a(new VideoSegmentUI.9(this));
      if (paramBoolean)
        this.ozD.a(this.ozM);
      this.ozD.setAudioStreamType(3);
      this.ozD.setLooping(true);
      if (paramSurface != null)
        this.ozD.setSurface(paramSurface);
      this.ozD.ozL = this.ozL;
      this.ozD.a(new VideoSegmentUI.10(this));
      this.ozD.prepareAsync();
      this.ozD.a(new VideoSegmentUI.11(this));
      AppMethodBeat.o(55056);
    }
  }

  public final int getLayoutId()
  {
    return 2130970998;
  }

  public final void initView()
  {
    AppMethodBeat.i(55055);
    this.ozF = ((c)findViewById(2131828431));
    this.mmW = ((RelativeLayout)findViewById(2131820987));
    AppMethodBeat.o(55055);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55054);
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    CaptureMMProxy.createProxy(new CaptureMMProxy(this.ext));
    this.ext.connect(new VideoSegmentUI.1(this));
    AppMethodBeat.o(55054);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55059);
    ab.i("MicroMsg.VideoSegmentUI", "onDestroy");
    super.onDestroy();
    getWindow().clearFlags(128);
    this.ext.release();
    if (this.ozF != null)
      this.ozF.release();
    if (this.ozD != null)
      this.ozD.release();
    if (this.mSurface != null)
      this.mSurface.release();
    if (this.ozC != null)
      this.ozC.release();
    j.owk.WY();
    AppMethodBeat.o(55059);
  }

  public void onPause()
  {
    AppMethodBeat.i(55058);
    if (this.ozD != null)
    {
      ab.i("MicroMsg.VideoSegmentUI", "onPause pause player");
      this.ozD.pause();
    }
    super.onPause();
    AppMethodBeat.o(55058);
  }

  public void onResume()
  {
    AppMethodBeat.i(55057);
    if ((this.ozD != null) && (this.ozE))
    {
      ab.i("MicroMsg.VideoSegmentUI", "onResume start player");
      this.ozD.start();
    }
    super.onResume();
    AppMethodBeat.o(55057);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class b
    implements TextureView.SurfaceTextureListener
  {
    private b()
    {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(55047);
      boolean bool1 = VideoSegmentUI.w(VideoSegmentUI.this);
      boolean bool2;
      if (VideoSegmentUI.d(VideoSegmentUI.this) == null)
        bool2 = true;
      while (true)
      {
        ab.i("MicroMsg.VideoSegmentUI", "TextureViewCallback create needResume[%b] segmentPlayer is null[%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        VideoSegmentUI.b(VideoSegmentUI.this, new Surface(paramSurfaceTexture));
        if ((VideoSegmentUI.d(VideoSegmentUI.this) == null) && (VideoSegmentUI.w(VideoSegmentUI.this)))
          ab.i("MicroMsg.VideoSegmentUI", "MediaPlayer resume");
        try
        {
          VideoSegmentUI.a(VideoSegmentUI.this, VideoSegmentUI.u(VideoSegmentUI.this));
          if ((VideoSegmentUI.j(VideoSegmentUI.this) != null) && (VideoSegmentUI.d(VideoSegmentUI.this) != null))
            VideoSegmentUI.d(VideoSegmentUI.this).setLoop((int)(VideoSegmentUI.e(VideoSegmentUI.this) * VideoSegmentUI.j(VideoSegmentUI.this).bQa()), (int)(VideoSegmentUI.e(VideoSegmentUI.this) * VideoSegmentUI.j(VideoSegmentUI.this).bQb()));
          VideoSegmentUI.a(VideoSegmentUI.this, false);
          VideoSegmentUI.o(VideoSegmentUI.this).countDown();
          AppMethodBeat.o(55047);
          return;
          bool2 = false;
        }
        catch (Exception paramSurfaceTexture)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.VideoSegmentUI", paramSurfaceTexture, "ResumeMediaPlayer error %s", new Object[] { paramSurfaceTexture.getMessage() });
        }
      }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      AppMethodBeat.i(55048);
      ab.i("MicroMsg.VideoSegmentUI", "TextureViewCallback.surfaceDestroyed %s", new Object[] { bo.dpG() });
      try
      {
        if (VideoSegmentUI.d(VideoSegmentUI.this) != null)
        {
          ab.i("MicroMsg.VideoSegmentUI", "TextureViewCallback MediaPlayer pause");
          VideoSegmentUI.d(VideoSegmentUI.this).release();
          VideoSegmentUI.v(VideoSegmentUI.this);
          VideoSegmentUI.a(VideoSegmentUI.this, true);
        }
        VideoSegmentUI.b(VideoSegmentUI.this, null);
        label75: AppMethodBeat.o(55048);
        return false;
      }
      catch (Exception paramSurfaceTexture)
      {
        break label75;
      }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI
 * JD-Core Version:    0.6.2
 */
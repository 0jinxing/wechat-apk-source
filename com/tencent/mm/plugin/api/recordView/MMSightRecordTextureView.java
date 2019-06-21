package com.tencent.mm.plugin.api.recordView;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

class MMSightRecordTextureView extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private int fcn;
  private int fco;
  private d gLH;
  private c gLI;

  public MMSightRecordTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(76329);
    setSurfaceTextureListener(this);
    AppMethodBeat.o(76329);
  }

  public MMSightRecordTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(76328);
    setSurfaceTextureListener(this);
    AppMethodBeat.o(76328);
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76330);
    ab.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureAvailable, surface: %s, width: %s, height: %s", new Object[] { paramSurfaceTexture, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.fcn = paramInt1;
    this.fco = paramInt2;
    this.gLH = new d();
    this.gLI = new c(paramSurfaceTexture, this.gLH);
    this.gLH.cM(paramInt1, paramInt2);
    this.gLI.needRender = true;
    this.gLI.start();
    AppMethodBeat.o(76330);
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(76332);
    this.gLI.needRender = false;
    try
    {
      this.gLI.join();
      this.gLI = null;
      AppMethodBeat.o(76332);
      return false;
    }
    catch (InterruptedException paramSurfaceTexture)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMSightRecordTextureViewImpl", paramSurfaceTexture, "onSurfaceTextureDestroyed error: %s", new Object[] { paramSurfaceTexture.getMessage() });
    }
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76331);
    ab.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureSizeChanged, surface: %s, width: %s, height: %s", new Object[] { paramSurfaceTexture, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.fcn = paramInt1;
    this.fco = paramInt2;
    this.gLH.cM(paramInt1, paramInt2);
    AppMethodBeat.o(76331);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.MMSightRecordTextureView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

public class ObservableTextureView extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  protected SurfaceTexture bsb;
  protected b sKO;
  private boolean sKP;

  public ObservableTextureView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(50963);
    this.sKP = false;
    init();
    AppMethodBeat.o(50963);
  }

  public ObservableTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(50964);
    this.sKP = false;
    init();
    AppMethodBeat.o(50964);
  }

  public ObservableTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.sKP = false;
  }

  private void init()
  {
    AppMethodBeat.i(50965);
    setSurfaceTextureListener(this);
    this.bsb = getSurfaceTexture();
    AppMethodBeat.o(50965);
  }

  public boolean isAvailable()
  {
    return this.sKP;
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50966);
    ab.i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
    dAh();
    this.sKP = true;
    if (this.sKO != null)
      this.sKO.e(paramSurfaceTexture);
    AppMethodBeat.o(50966);
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(50968);
    ab.i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
    this.sKP = false;
    AppMethodBeat.o(50968);
    return false;
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50967);
    ab.d("MicroMsg.ObservableTextureView", "onSurfaceTextureSizeChanged");
    AppMethodBeat.o(50967);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public void setTextureChangeCallback(b paramb)
  {
    this.sKO = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.video.ObservableTextureView
 * JD-Core Version:    0.6.2
 */
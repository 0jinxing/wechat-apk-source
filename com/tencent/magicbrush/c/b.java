package com.tencent.magicbrush.c;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends TextureView
  implements TextureView.SurfaceTextureListener
{
  protected MBRuntime bSv;
  private TextureView.SurfaceTextureListener bUy;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(115998);
    c.c.i("MagicBrush.MBTextureView", "MBRendererView construct", new Object[0]);
    this.bSv = null;
    super.setSurfaceTextureListener(this);
    AppMethodBeat.o(115998);
  }

  public final MBRuntime getMBRuntime()
  {
    return this.bSv;
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(116000);
    super.onAttachedToWindow();
    c.c.i("MagicBrush.MBTextureView", "MBRendererView.onAttachedToWindow", new Object[0]);
    AppMethodBeat.o(116000);
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(116001);
    super.onDetachedFromWindow();
    c.c.i("MagicBrush.MBTextureView", "MBRendererView.onDetachedFromWindow", new Object[0]);
    AppMethodBeat.o(116001);
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116002);
    c.c.i("MagicBrush.MBTextureView", "onSurfaceTextureAvailable() called with: surface = [" + paramSurfaceTexture + "], width = [" + paramInt1 + "], height = [" + paramInt2 + "]", new Object[0]);
    this.bSv.notifyWindowAvailable(paramSurfaceTexture, paramInt1, paramInt2);
    if (this.bUy != null)
      this.bUy.onSurfaceTextureAvailable(paramSurfaceTexture, paramInt1, paramInt2);
    AppMethodBeat.o(116002);
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(116004);
    c.c.i("MagicBrush.MBTextureView", "onSurfaceTextureDestroyed() called with: surface = [" + paramSurfaceTexture + "]", new Object[0]);
    this.bSv.notifyWindowDestroyed(paramSurfaceTexture);
    if (this.bUy != null)
      this.bUy.onSurfaceTextureDestroyed(paramSurfaceTexture);
    AppMethodBeat.o(116004);
    return false;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116003);
    c.c.i("MagicBrush.MBTextureView", "onSurfaceTextureSizeChanged() called with: surface = [" + paramSurfaceTexture + "], width = [" + paramInt1 + "], height = [" + paramInt2 + "]", new Object[0]);
    this.bSv.notifyWindowChanged(paramSurfaceTexture, paramInt1, paramInt2);
    if (this.bUy != null)
      this.bUy.onSurfaceTextureSizeChanged(paramSurfaceTexture, paramInt1, paramInt2);
    AppMethodBeat.o(116003);
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(116005);
    if (this.bUy != null)
      this.bUy.onSurfaceTextureUpdated(paramSurfaceTexture);
    AppMethodBeat.o(116005);
  }

  public final void setCustomSurfaceTextureListener(TextureView.SurfaceTextureListener paramSurfaceTextureListener)
  {
    this.bUy = paramSurfaceTextureListener;
  }

  public final void setMBRuntime(MBRuntime paramMBRuntime)
  {
    AppMethodBeat.i(115999);
    c.c.i("MagicBrush.MBTextureView", "MBRendererView setMBRuntime", new Object[0]);
    this.bSv = paramMBRuntime;
    this.bSv.setMBRuntimeView(this);
    AppMethodBeat.o(115999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.c.b
 * JD-Core Version:    0.6.2
 */
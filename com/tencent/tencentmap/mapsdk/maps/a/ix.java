package com.tencent.tencentmap.mapsdk.maps.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ak;

@TargetApi(14)
public class ix extends TextureView
  implements TextureView.SurfaceTextureListener, gg
{
  private iz a;
  private SurfaceTexture b;
  private iy c;

  public ix(Context paramContext, ak paramak)
  {
    super(paramContext);
    AppMethodBeat.i(99892);
    this.a = new iz(this, getContext().getApplicationContext(), paramak);
    setSurfaceTextureListener(this);
    AppMethodBeat.o(99892);
  }

  public void a_()
  {
    AppMethodBeat.i(99895);
    if (this.c != null);
    while (true)
    {
      synchronized (this.c)
      {
        this.c.notify();
        AppMethodBeat.o(99895);
        return;
      }
      AppMethodBeat.o(99895);
    }
  }

  protected boolean dispatchHoverEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99901);
    boolean bool;
    if ((this.a != null) && (this.a.b(paramMotionEvent)))
    {
      bool = true;
      AppMethodBeat.o(99901);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchHoverEvent(paramMotionEvent);
      AppMethodBeat.o(99901);
    }
  }

  public void e()
  {
    AppMethodBeat.i(99896);
    if (this.a != null)
      this.a.e();
    if (this.c != null)
      this.c.b();
    AppMethodBeat.o(99896);
  }

  public void f()
  {
    AppMethodBeat.i(99897);
    if (this.a != null)
      this.a.f();
    if (this.c != null)
      this.c.a();
    AppMethodBeat.o(99897);
  }

  public void g()
  {
    AppMethodBeat.i(99898);
    if (this.a != null)
      this.a.g();
    if (this.c != null)
      this.c.c();
    AppMethodBeat.o(99898);
  }

  public ge getVectorMapDelegate()
  {
    return this.a;
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(99899);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null)
      this.a.a(paramInt1, paramInt2);
    AppMethodBeat.o(99899);
  }

  @TargetApi(16)
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99893);
    if (this.b == null)
      this.b = paramSurfaceTexture;
    while (true)
    {
      if (this.a != null)
      {
        this.a.a(null, null);
        this.a.a(null, paramInt1, paramInt2);
      }
      if (this.c == null)
      {
        this.c = new iy(paramSurfaceTexture, this.a);
        this.c.start();
      }
      AppMethodBeat.o(99893);
      return;
      if (this.c != null)
      {
        this.b = paramSurfaceTexture;
        this.c.a(paramSurfaceTexture);
      }
    }
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    return true;
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99894);
    if (this.a != null)
    {
      this.a.a(null, paramInt1, paramInt2);
      if (this.c != null)
        this.c.d();
    }
    AppMethodBeat.o(99894);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(99900);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.a(paramMotionEvent);
      AppMethodBeat.o(99900);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99900);
    }
  }

  public void setZOrderMediaOverlay(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ix
 * JD-Core Version:    0.6.2
 */
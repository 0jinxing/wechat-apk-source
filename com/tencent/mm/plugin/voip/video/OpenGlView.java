package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public class OpenGlView extends GLSurfaceView
{
  private static String TAG = "OpenGlView";
  public boolean iXr;
  public boolean taZ;
  public boolean tba;
  public int tbb;
  private int tbc;
  private int tbd;
  public boolean tbe;
  WeakReference<OpenGlRender> tbf;

  public OpenGlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(5084);
    this.taZ = false;
    this.tba = true;
    this.iXr = false;
    this.tbb = 1;
    this.tbc = 0;
    this.tbd = 0;
    this.tbe = false;
    this.tbb = OpenGlRender.getGLVersion();
    getHolder().addCallback(this);
    try
    {
      getHolder().setType(2);
      if (this.tbb == 2)
      {
        setEGLContextFactory(new c());
        setEGLConfigChooser(new b(5, 6, 5, 0));
      }
      AppMethodBeat.o(5084);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        try
        {
          getHolder().setType(1);
        }
        catch (Exception paramContext)
        {
          try
          {
            getHolder().setType(0);
          }
          catch (Exception paramContext)
          {
          }
        }
    }
  }

  public final void cLK()
  {
    AppMethodBeat.i(5091);
    this.taZ = true;
    requestRender();
    AppMethodBeat.o(5091);
  }

  public void gb(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5083);
    setLayoutParams(new RelativeLayout.LayoutParams(paramInt1, paramInt2));
    this.tbc = paramInt1;
    this.tbd = paramInt2;
    AppMethodBeat.o(5083);
  }

  public void gc(int paramInt1, int paramInt2)
  {
  }

  public void onPause()
  {
    AppMethodBeat.i(5089);
    super.onPause();
    AppMethodBeat.o(5089);
  }

  public void onResume()
  {
    AppMethodBeat.i(5090);
    super.onResume();
    AppMethodBeat.o(5090);
  }

  public void setRenderer(OpenGlRender paramOpenGlRender)
  {
    AppMethodBeat.i(5085);
    this.tbf = new WeakReference(paramOpenGlRender);
    super.setRenderer(paramOpenGlRender);
    setRenderMode(0);
    AppMethodBeat.o(5085);
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(5088);
    ab.i(TAG, "surfaceChanged, format: %s, w: %s, h: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    super.surfaceChanged(paramSurfaceHolder, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(5088);
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(5086);
    ab.i(TAG, "surfaceCreated");
    super.surfaceCreated(paramSurfaceHolder);
    paramSurfaceHolder = (OpenGlRender)this.tbf.get();
    ab.i(OpenGlRender.TAG, "%s surfaceCreated", new Object[] { Integer.valueOf(paramSurfaceHolder.hashCode()) });
    paramSurfaceHolder.Init(OpenGlRender.getGLVersion(), new WeakReference(paramSurfaceHolder), paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.setParam(paramSurfaceHolder.mBrightness, paramSurfaceHolder.mContrast, paramSurfaceHolder.mSaturation, paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.setMode(((OpenGlView)paramSurfaceHolder.taG.get()).getWidth(), ((OpenGlView)paramSurfaceHolder.taG.get()).getHeight(), 0, paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.taD = true;
    paramSurfaceHolder.taz = true;
    AppMethodBeat.o(5086);
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(5087);
    ab.i(TAG, "surfaceDestroyed");
    OpenGlRender localOpenGlRender = (OpenGlRender)this.tbf.get();
    ab.i(OpenGlRender.TAG, "onSurfaceDestroyed,mRenderMode:%d", new Object[] { Integer.valueOf(localOpenGlRender.mRenderMode) });
    localOpenGlRender.taz = false;
    localOpenGlRender.Uninit(localOpenGlRender.mRenderMode);
    ab.i(OpenGlRender.TAG, "steve: after Uninit in onSurfaceDestroyed");
    localOpenGlRender.tax = 0;
    localOpenGlRender.taE = 0;
    localOpenGlRender.taF = 0;
    if (localOpenGlRender.taR != null)
      localOpenGlRender.taR.destroy();
    super.surfaceDestroyed(paramSurfaceHolder);
    AppMethodBeat.o(5087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.OpenGlView
 * JD-Core Version:    0.6.2
 */
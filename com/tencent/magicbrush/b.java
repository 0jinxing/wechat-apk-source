package com.tencent.magicbrush;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.FrameLayout;
import com.tencent.magicbrush.handler.JsTouchEventHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public final class b extends FrameLayout
{
  public MBRuntime bSv;
  private JsTouchEventHandler bSw;
  private com.tencent.magicbrush.c.b bSx;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(115839);
    setBackgroundColor(-16777216);
    this.bSx = new com.tencent.magicbrush.c.b(getContext());
    addView(this.bSx);
    AppMethodBeat.o(115839);
  }

  public final a.a getCurrentFps()
  {
    AppMethodBeat.i(115845);
    a.a locala = this.bSv.getCurrentFps();
    AppMethodBeat.o(115845);
    return locala;
  }

  public final MBRuntime getMBRuntime()
  {
    return this.bSv;
  }

  public final com.tencent.magicbrush.c.b getTextureView()
  {
    return this.bSx;
  }

  @SuppressLint({"ClickableViewAccessibility"})
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = -1;
    AppMethodBeat.i(115848);
    JsTouchEventHandler localJsTouchEventHandler;
    int k;
    int n;
    if (this.bSw != null)
    {
      localJsTouchEventHandler = this.bSw;
      localJsTouchEventHandler.fS(paramMotionEvent.getPointerCount());
      int j = JsTouchEventHandler.n(paramMotionEvent);
      if (j != -1)
      {
        k = paramMotionEvent.getPointerCount();
        for (m = 0; m < k; m++)
        {
          localJsTouchEventHandler.bSF.put(paramMotionEvent.getPointerId(m));
          localJsTouchEventHandler.bSG.put(paramMotionEvent.getX(m) / localJsTouchEventHandler.mDensity);
          localJsTouchEventHandler.bSG.put(paramMotionEvent.getY(m) / localJsTouchEventHandler.mDensity);
        }
        n = JsTouchEventHandler.n(paramMotionEvent);
        if (j != 1)
          break label172;
      }
    }
    label172: for (int m = i; ; m = paramMotionEvent.getActionIndex())
    {
      long l = localJsTouchEventHandler.nativeCreateTouchEvent(n, m, k, localJsTouchEventHandler.bSF, localJsTouchEventHandler.bSG, paramMotionEvent.getEventTime());
      localJsTouchEventHandler.bSv.notifyTouchEvent(l, localJsTouchEventHandler.bSH);
      AppMethodBeat.o(115848);
      return true;
    }
  }

  public final void registerEventListener(MBRuntime.IMBEventListener paramIMBEventListener)
  {
    AppMethodBeat.i(115843);
    this.bSv.registerEventListener(paramIMBEventListener);
    AppMethodBeat.o(115843);
  }

  public final void setMBRuntime(MBRuntime paramMBRuntime)
  {
    AppMethodBeat.i(115840);
    this.bSv = paramMBRuntime;
    this.bSw = new JsTouchEventHandler(paramMBRuntime);
    this.bSx.setMBRuntime(paramMBRuntime);
    AppMethodBeat.o(115840);
  }

  public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener paramSurfaceTextureListener)
  {
    AppMethodBeat.i(115841);
    this.bSx.setCustomSurfaceTextureListener(paramSurfaceTextureListener);
    AppMethodBeat.o(115841);
  }

  public final void setTransparentBackground(boolean paramBoolean)
  {
    AppMethodBeat.i(115842);
    if (paramBoolean)
    {
      setBackground(null);
      AppMethodBeat.o(115842);
    }
    while (true)
    {
      return;
      setBackgroundColor(-16777216);
      AppMethodBeat.o(115842);
    }
  }

  public final void setUserPreferedFps(double paramDouble)
  {
    AppMethodBeat.i(115844);
    this.bSv.setUserPreferredFps(paramDouble);
    AppMethodBeat.o(115844);
  }

  public final void yx()
  {
    AppMethodBeat.i(115846);
    this.bSv.resume();
    AppMethodBeat.o(115846);
  }

  public final void yy()
  {
    AppMethodBeat.i(115847);
    this.bSv.pause();
    AppMethodBeat.o(115847);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.b
 * JD-Core Version:    0.6.2
 */
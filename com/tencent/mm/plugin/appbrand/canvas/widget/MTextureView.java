package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.b;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MTextureView extends TextureView
  implements TextureView.SurfaceTextureListener, a
{
  private final b hef;
  private final Set<View.OnAttachStateChangeListener> heg;
  private volatile ak hej;
  private Runnable hek;
  private volatile boolean hem;
  private volatile Object mLock;

  public MTextureView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(103812);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    this.mLock = new Object();
    this.hek = new MTextureView.1(this);
    init();
    AppMethodBeat.o(103812);
  }

  public MTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103813);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    this.mLock = new Object();
    this.hek = new MTextureView.1(this);
    init();
    AppMethodBeat.o(103813);
  }

  public MTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(103814);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    this.mLock = new Object();
    this.hek = new MTextureView.1(this);
    init();
    AppMethodBeat.o(103814);
  }

  private void init()
  {
    AppMethodBeat.i(103815);
    setSurfaceTextureListener(this);
    ((Activity)getContext()).getWindow().setFlags(16777216, 16777216);
    Paint localPaint = new Paint();
    localPaint.setColor(-1);
    this.hef.getDrawContext().hcJ = localPaint;
    AppMethodBeat.o(103815);
  }

  public final void C(Runnable paramRunnable)
  {
    AppMethodBeat.i(103819);
    if (this.hej == null)
      AppMethodBeat.o(103819);
    while (true)
    {
      return;
      this.hej.post(paramRunnable);
      AppMethodBeat.o(103819);
    }
  }

  public final void a(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103825);
    this.hef.a(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103825);
  }

  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103823);
    this.hef.a(paramJSONArray, parama);
    AppMethodBeat.o(103823);
  }

  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103828);
    if (this.heg.contains(paramOnAttachStateChangeListener))
      AppMethodBeat.o(103828);
    while (true)
    {
      return;
      this.heg.add(paramOnAttachStateChangeListener);
      super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
      AppMethodBeat.o(103828);
    }
  }

  public final void ayc()
  {
    AppMethodBeat.i(103818);
    if (this.hej == null)
      AppMethodBeat.o(103818);
    while (true)
    {
      return;
      this.hej.removeCallbacks(this.hek);
      this.hej.post(this.hek);
      AppMethodBeat.o(103818);
    }
  }

  public final void ayd()
  {
    AppMethodBeat.i(103827);
    this.hef.ayd();
    AppMethodBeat.o(103827);
  }

  public final void aye()
  {
    AppMethodBeat.i(103834);
    this.hef.aye();
    AppMethodBeat.o(103834);
  }

  public final void b(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103826);
    this.hef.b(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103826);
  }

  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103824);
    this.hef.b(paramJSONArray, parama);
    AppMethodBeat.o(103824);
  }

  public final boolean e(Canvas paramCanvas)
  {
    AppMethodBeat.i(103822);
    boolean bool = this.hef.e(paramCanvas);
    AppMethodBeat.o(103822);
    return bool;
  }

  public com.tencent.mm.plugin.appbrand.canvas.d getDrawContext()
  {
    AppMethodBeat.i(103820);
    com.tencent.mm.plugin.appbrand.canvas.d locald = this.hef.getDrawContext();
    AppMethodBeat.o(103820);
    return locald;
  }

  public String getSessionId()
  {
    AppMethodBeat.i(103831);
    String str = this.hef.getSessionId();
    AppMethodBeat.o(103831);
    return str;
  }

  public String getTraceId()
  {
    AppMethodBeat.i(103817);
    String str = this.hef.getTraceId();
    AppMethodBeat.o(103817);
    return str;
  }

  public final boolean isPaused()
  {
    return this.hef.mPause;
  }

  public final void onResume()
  {
    AppMethodBeat.i(103830);
    this.hef.onResume();
    AppMethodBeat.o(103830);
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(103835);
    com.tencent.luggage.g.d.v("MicroMsg.MTextureView", "onSurfaceTextureAvailable");
    if (this.hej == null)
    {
      paramSurfaceTexture = com.tencent.mm.sdk.g.d.ek("MTextureView#Rending-Thread", -19);
      paramSurfaceTexture.start();
      this.hej = new ak(paramSurfaceTexture.getLooper());
    }
    paramSurfaceTexture = lockCanvas();
    if (paramSurfaceTexture == null)
      AppMethodBeat.o(103835);
    while (true)
    {
      return;
      paramSurfaceTexture.drawColor(-1);
      unlockCanvasAndPost(paramSurfaceTexture);
      AppMethodBeat.o(103835);
    }
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture arg1)
  {
    AppMethodBeat.i(103837);
    com.tencent.luggage.g.d.v("MicroMsg.MTextureView", "onSurfaceTextureDestroyed");
    this.hej.removeCallbacks(this.hek);
    this.hej.getLooper().quit();
    synchronized (this.mLock)
    {
      boolean bool = this.hem;
      if (bool);
      try
      {
        this.mLock.wait(1000L);
        this.hej = null;
        AppMethodBeat.o(103837);
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          com.tencent.luggage.g.d.e("MicroMsg.MTextureView", "await error : %s", new Object[] { Log.getStackTraceString(localInterruptedException) });
      }
    }
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(103836);
    com.tencent.luggage.g.d.v("MicroMsg.MTextureView", "onSurfaceTextureSizeChanged");
    AppMethodBeat.o(103836);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103829);
    this.heg.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    AppMethodBeat.o(103829);
  }

  public void setDrawActionReportable(com.tencent.mm.plugin.appbrand.canvas.c.a parama)
  {
    AppMethodBeat.i(103821);
    this.hef.setDrawActionReportable(parama);
    AppMethodBeat.o(103821);
  }

  public void setSessionId(String paramString)
  {
    AppMethodBeat.i(103832);
    this.hef.setSessionId(paramString);
    AppMethodBeat.o(103832);
  }

  public void setStartTime(long paramLong)
  {
    AppMethodBeat.i(103833);
    this.hef.setStartTime(paramLong);
    AppMethodBeat.o(103833);
  }

  public void setTraceId(String paramString)
  {
    AppMethodBeat.i(103816);
    this.hef.setTraceId(paramString);
    AppMethodBeat.o(103816);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView
 * JD-Core Version:    0.6.2
 */
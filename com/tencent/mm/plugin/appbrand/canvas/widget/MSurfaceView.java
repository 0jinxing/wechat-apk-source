package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.b;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MSurfaceView extends SurfaceView
  implements SurfaceHolder.Callback, a
{
  private final b hef;
  private final Set<View.OnAttachStateChangeListener> heg;
  private SurfaceHolder hei;
  private ak hej;
  private Runnable hek;
  private volatile boolean mDestroyed;

  public MSurfaceView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(103784);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    this.hek = new MSurfaceView.1(this);
    init();
    AppMethodBeat.o(103784);
  }

  public MSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103785);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    this.hek = new MSurfaceView.1(this);
    init();
    AppMethodBeat.o(103785);
  }

  public MSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(103786);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    this.hek = new MSurfaceView.1(this);
    init();
    AppMethodBeat.o(103786);
  }

  private void init()
  {
    AppMethodBeat.i(103787);
    this.hei = getHolder();
    this.hei.addCallback(this);
    this.hei.setFormat(-3);
    Paint localPaint = new Paint();
    localPaint.setColor(-1);
    this.hef.getDrawContext().hcJ = localPaint;
    AppMethodBeat.o(103787);
  }

  public final void C(Runnable paramRunnable)
  {
    AppMethodBeat.i(103795);
    if (this.hej == null)
      AppMethodBeat.o(103795);
    while (true)
    {
      return;
      this.hej.post(paramRunnable);
      AppMethodBeat.o(103795);
    }
  }

  public final void a(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103801);
    this.hef.a(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103801);
  }

  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103799);
    this.hef.a(paramJSONArray, parama);
    AppMethodBeat.o(103799);
  }

  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103804);
    if (this.heg.contains(paramOnAttachStateChangeListener))
      AppMethodBeat.o(103804);
    while (true)
    {
      return;
      this.heg.add(paramOnAttachStateChangeListener);
      super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
      AppMethodBeat.o(103804);
    }
  }

  public final void ayc()
  {
    AppMethodBeat.i(103794);
    C(new MSurfaceView.2(this));
    AppMethodBeat.o(103794);
  }

  public final void ayd()
  {
    AppMethodBeat.i(103803);
    this.hef.ayd();
    AppMethodBeat.o(103803);
  }

  public final void aye()
  {
    AppMethodBeat.i(103810);
    this.hef.aye();
    AppMethodBeat.o(103810);
  }

  public final void b(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103802);
    this.hef.b(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103802);
  }

  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103800);
    this.hef.b(paramJSONArray, parama);
    AppMethodBeat.o(103800);
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(103793);
    com.tencent.luggage.g.d.i("MicroMsg.MSurfaceView", "draw(%s)", new Object[] { Integer.valueOf(hashCode()) });
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    super.draw(paramCanvas);
    AppMethodBeat.o(103793);
  }

  public final boolean e(Canvas paramCanvas)
  {
    AppMethodBeat.i(103798);
    boolean bool = this.hef.e(paramCanvas);
    AppMethodBeat.o(103798);
    return bool;
  }

  public com.tencent.mm.plugin.appbrand.canvas.d getDrawContext()
  {
    AppMethodBeat.i(103796);
    com.tencent.mm.plugin.appbrand.canvas.d locald = this.hef.getDrawContext();
    AppMethodBeat.o(103796);
    return locald;
  }

  public String getSessionId()
  {
    AppMethodBeat.i(103807);
    String str = this.hef.getSessionId();
    AppMethodBeat.o(103807);
    return str;
  }

  public String getTraceId()
  {
    AppMethodBeat.i(103792);
    String str = this.hef.getTraceId();
    AppMethodBeat.o(103792);
    return str;
  }

  public final boolean isPaused()
  {
    return this.hef.mPause;
  }

  public final void onResume()
  {
    AppMethodBeat.i(103806);
    this.hef.onResume();
    AppMethodBeat.o(103806);
  }

  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103805);
    this.heg.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    AppMethodBeat.o(103805);
  }

  public void setDrawActionReportable(com.tencent.mm.plugin.appbrand.canvas.c.a parama)
  {
    AppMethodBeat.i(103797);
    this.hef.setDrawActionReportable(parama);
    AppMethodBeat.o(103797);
  }

  public void setSessionId(String paramString)
  {
    AppMethodBeat.i(103808);
    this.hef.setSessionId(paramString);
    AppMethodBeat.o(103808);
  }

  public void setStartTime(long paramLong)
  {
    AppMethodBeat.i(103809);
    this.hef.setStartTime(paramLong);
    AppMethodBeat.o(103809);
  }

  public void setTraceId(String paramString)
  {
    AppMethodBeat.i(103791);
    this.hef.setTraceId(paramString);
    AppMethodBeat.o(103791);
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(103789);
    com.tencent.luggage.g.d.i("MicroMsg.MSurfaceView", "surfaceChanged(%s)", new Object[] { Integer.valueOf(hashCode()) });
    AppMethodBeat.o(103789);
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(103788);
    com.tencent.luggage.g.d.i("MicroMsg.MSurfaceView", "surfaceCreated(%s)", new Object[] { Integer.valueOf(hashCode()) });
    this.mDestroyed = false;
    if (this.hej == null)
    {
      paramSurfaceHolder = com.tencent.mm.sdk.g.d.ek("MSurfaceView#Rending-Thread", -19);
      paramSurfaceHolder.start();
      this.hej = new ak(paramSurfaceHolder.getLooper());
    }
    AppMethodBeat.o(103788);
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(103790);
    com.tencent.luggage.g.d.i("MicroMsg.MSurfaceView", "surfaceDestroyed(%s)", new Object[] { Integer.valueOf(hashCode()) });
    this.mDestroyed = true;
    this.hej.getLooper().quit();
    this.hej = null;
    AppMethodBeat.o(103790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView
 * JD-Core Version:    0.6.2
 */
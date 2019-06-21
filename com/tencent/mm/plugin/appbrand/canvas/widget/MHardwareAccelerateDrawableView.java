package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.b;
import com.tencent.mm.plugin.appbrand.canvas.d;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;

public class MHardwareAccelerateDrawableView extends View
  implements a
{
  private final b hef;
  private final Set<View.OnAttachStateChangeListener> heg;

  public MHardwareAccelerateDrawableView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(103759);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    setLayerType(2, null);
    AppMethodBeat.o(103759);
  }

  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103760);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    setLayerType(2, null);
    AppMethodBeat.o(103760);
  }

  public MHardwareAccelerateDrawableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(103761);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    setLayerType(2, null);
    AppMethodBeat.o(103761);
  }

  public final void C(Runnable paramRunnable)
  {
    AppMethodBeat.i(103766);
    this.hef.C(paramRunnable);
    AppMethodBeat.o(103766);
  }

  public final void a(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103772);
    this.hef.a(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103772);
  }

  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103770);
    this.hef.a(paramJSONArray, parama);
    AppMethodBeat.o(103770);
  }

  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103775);
    if (this.heg.contains(paramOnAttachStateChangeListener))
      AppMethodBeat.o(103775);
    while (true)
    {
      return;
      this.heg.add(paramOnAttachStateChangeListener);
      super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
      AppMethodBeat.o(103775);
    }
  }

  public final void ayc()
  {
    AppMethodBeat.i(103765);
    postInvalidate();
    AppMethodBeat.o(103765);
  }

  public final void ayd()
  {
    AppMethodBeat.i(103774);
    this.hef.ayd();
    AppMethodBeat.o(103774);
  }

  public final void aye()
  {
    AppMethodBeat.i(103781);
    this.hef.aye();
    AppMethodBeat.o(103781);
  }

  public final void b(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103773);
    this.hef.b(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103773);
  }

  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103771);
    this.hef.b(paramJSONArray, parama);
    AppMethodBeat.o(103771);
  }

  public final boolean e(Canvas paramCanvas)
  {
    AppMethodBeat.i(103769);
    boolean bool = this.hef.e(paramCanvas);
    AppMethodBeat.o(103769);
    return bool;
  }

  public d getDrawContext()
  {
    AppMethodBeat.i(103767);
    d locald = this.hef.getDrawContext();
    AppMethodBeat.o(103767);
    return locald;
  }

  public String getSessionId()
  {
    AppMethodBeat.i(103778);
    String str = this.hef.getSessionId();
    AppMethodBeat.o(103778);
    return str;
  }

  public String getTraceId()
  {
    AppMethodBeat.i(103764);
    String str = this.hef.getTraceId();
    AppMethodBeat.o(103764);
    return str;
  }

  public final boolean isPaused()
  {
    return this.hef.mPause;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(103762);
    e(paramCanvas);
    AppMethodBeat.o(103762);
  }

  public final void onResume()
  {
    AppMethodBeat.i(103777);
    this.hef.onResume();
    AppMethodBeat.o(103777);
  }

  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103776);
    this.heg.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    AppMethodBeat.o(103776);
  }

  public void setDrawActionReportable(com.tencent.mm.plugin.appbrand.canvas.c.a parama)
  {
    AppMethodBeat.i(103768);
    this.hef.setDrawActionReportable(parama);
    AppMethodBeat.o(103768);
  }

  public void setSessionId(String paramString)
  {
    AppMethodBeat.i(103779);
    this.hef.setSessionId(paramString);
    AppMethodBeat.o(103779);
  }

  public void setStartTime(long paramLong)
  {
    AppMethodBeat.i(103780);
    this.hef.setStartTime(paramLong);
    AppMethodBeat.o(103780);
  }

  public void setTraceId(String paramString)
  {
    AppMethodBeat.i(103763);
    this.hef.setTraceId(paramString);
    AppMethodBeat.o(103763);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.MHardwareAccelerateDrawableView
 * JD-Core Version:    0.6.2
 */
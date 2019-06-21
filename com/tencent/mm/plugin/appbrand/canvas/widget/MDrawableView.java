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

public class MDrawableView extends View
  implements a
{
  private final b hef;
  private final Set<View.OnAttachStateChangeListener> heg;

  public MDrawableView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(103736);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    setLayerType(1, null);
    AppMethodBeat.o(103736);
  }

  public MDrawableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103737);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    setLayerType(1, null);
    AppMethodBeat.o(103737);
  }

  public MDrawableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(103738);
    this.hef = new b(this);
    this.heg = new LinkedHashSet();
    setLayerType(1, null);
    AppMethodBeat.o(103738);
  }

  public final void C(Runnable paramRunnable)
  {
    AppMethodBeat.i(103741);
    post(paramRunnable);
    AppMethodBeat.o(103741);
  }

  public final void a(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103749);
    this.hef.a(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103749);
  }

  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103747);
    this.hef.a(paramJSONArray, parama);
    AppMethodBeat.o(103747);
  }

  public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103752);
    if (this.heg.contains(paramOnAttachStateChangeListener))
      AppMethodBeat.o(103752);
    while (true)
    {
      return;
      this.heg.add(paramOnAttachStateChangeListener);
      super.addOnAttachStateChangeListener(paramOnAttachStateChangeListener);
      AppMethodBeat.o(103752);
    }
  }

  public final void ayc()
  {
    AppMethodBeat.i(103740);
    postInvalidate();
    AppMethodBeat.o(103740);
  }

  public final void ayd()
  {
    AppMethodBeat.i(103751);
    this.hef.ayd();
    AppMethodBeat.o(103751);
  }

  public final void aye()
  {
    AppMethodBeat.i(103758);
    this.hef.aye();
    AppMethodBeat.o(103758);
  }

  public final void b(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103750);
    this.hef.b(paramDrawCanvasArg, parama);
    AppMethodBeat.o(103750);
  }

  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103748);
    this.hef.b(paramJSONArray, parama);
    AppMethodBeat.o(103748);
  }

  public final boolean e(Canvas paramCanvas)
  {
    AppMethodBeat.i(103746);
    boolean bool = this.hef.e(paramCanvas);
    AppMethodBeat.o(103746);
    return bool;
  }

  public d getDrawContext()
  {
    AppMethodBeat.i(103742);
    d locald = this.hef.getDrawContext();
    AppMethodBeat.o(103742);
    return locald;
  }

  public String getSessionId()
  {
    AppMethodBeat.i(103755);
    String str = this.hef.getSessionId();
    AppMethodBeat.o(103755);
    return str;
  }

  public String getTraceId()
  {
    AppMethodBeat.i(103745);
    String str = this.hef.getTraceId();
    AppMethodBeat.o(103745);
    return str;
  }

  public final boolean isPaused()
  {
    return this.hef.mPause;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(103739);
    e(paramCanvas);
    AppMethodBeat.o(103739);
  }

  public final void onResume()
  {
    AppMethodBeat.i(103754);
    this.hef.onResume();
    AppMethodBeat.o(103754);
  }

  public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener paramOnAttachStateChangeListener)
  {
    AppMethodBeat.i(103753);
    this.heg.remove(paramOnAttachStateChangeListener);
    super.removeOnAttachStateChangeListener(paramOnAttachStateChangeListener);
    AppMethodBeat.o(103753);
  }

  public void setDrawActionReportable(com.tencent.mm.plugin.appbrand.canvas.c.a parama)
  {
    AppMethodBeat.i(103743);
    this.hef.setDrawActionReportable(parama);
    AppMethodBeat.o(103743);
  }

  public void setSessionId(String paramString)
  {
    AppMethodBeat.i(103756);
    this.hef.setSessionId(paramString);
    AppMethodBeat.o(103756);
  }

  public void setStartTime(long paramLong)
  {
    AppMethodBeat.i(103757);
    this.hef.setStartTime(paramLong);
    AppMethodBeat.o(103757);
  }

  public void setTraceId(String paramString)
  {
    AppMethodBeat.i(103744);
    this.hef.setTraceId(paramString);
    AppMethodBeat.o(103744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.MDrawableView
 * JD-Core Version:    0.6.2
 */
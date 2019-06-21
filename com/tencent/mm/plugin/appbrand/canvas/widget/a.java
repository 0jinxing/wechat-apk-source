package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.graphics.Canvas;
import org.json.JSONArray;

public abstract interface a extends b, com.tencent.mm.plugin.appbrand.collector.d
{
  public abstract void C(Runnable paramRunnable);

  public abstract void a(DrawCanvasArg paramDrawCanvasArg, a.a parama);

  public abstract void a(JSONArray paramJSONArray, a.a parama);

  public abstract void ayc();

  public abstract void ayd();

  public abstract void b(DrawCanvasArg paramDrawCanvasArg, a.a parama);

  public abstract void b(JSONArray paramJSONArray, a.a parama);

  public abstract boolean e(Canvas paramCanvas);

  public abstract com.tencent.mm.plugin.appbrand.canvas.d getDrawContext();

  public abstract String getTraceId();

  public abstract void setDrawActionReportable(com.tencent.mm.plugin.appbrand.canvas.c.a parama);

  public abstract void setTraceId(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.a
 * JD-Core Version:    0.6.2
 */
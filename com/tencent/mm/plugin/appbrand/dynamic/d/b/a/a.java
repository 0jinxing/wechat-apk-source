package com.tencent.mm.plugin.appbrand.dynamic.d.b.a;

import android.text.TextUtils;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.a.d;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.dynamic.d.b.b;
import com.tencent.mm.sdk.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

public abstract class a
  implements e<DrawCanvasArg>
{
  protected DrawCanvasArg hnN;
  protected String hnO;
  protected BlockingQueue<b> hnP = new LinkedBlockingQueue(100);
  protected BlockingQueue<Runnable> hnQ = new LinkedBlockingQueue(100);
  protected volatile long hnR;
  protected volatile long hnS;
  protected int hnT;
  protected int hnU;
  protected boolean hnV;
  protected Thread workerThread = new Thread(new a.1(this), "DrawCanvasMgr-worker");

  public a()
  {
    this.workerThread.start();
  }

  public final boolean Ai(String paramString)
  {
    boolean bool = false;
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return bool;
      if ((this.hnO == null) || (this.hnO.hashCode() != paramString.hashCode()))
        bool = true;
    }
  }

  public final void F(Runnable paramRunnable)
  {
    try
    {
      this.hnQ.put(paramRunnable);
      return;
    }
    catch (InterruptedException paramRunnable)
    {
      while (true)
        ab.printErrStackTrace("BaseDrawCanvasWithObj", paramRunnable, "", new Object[0]);
    }
  }

  public final void a(b paramb)
  {
    try
    {
      this.hnP.put(paramb);
      this.hnS = paramb.hnC;
      this.hnU += 1;
      return;
    }
    catch (InterruptedException paramb)
    {
      while (true)
        ab.printErrStackTrace("BaseDrawCanvasWithObj", paramb, "", new Object[0]);
    }
  }

  public final void azU()
  {
    this.hnV = true;
  }

  public DrawCanvasArg c(JSONObject paramJSONObject, String paramString)
  {
    DrawCanvasArg localDrawCanvasArg1 = (DrawCanvasArg)d.ayk().hdz.aA();
    DrawCanvasArg localDrawCanvasArg2 = localDrawCanvasArg1;
    if (localDrawCanvasArg1 == null)
      localDrawCanvasArg2 = new DrawCanvasArg();
    localDrawCanvasArg2.hdU = paramJSONObject.optBoolean("reserve");
    localDrawCanvasArg2.hdV = paramString;
    localDrawCanvasArg2.hdW = paramJSONObject.optLong("__invoke_jsapi_timestamp");
    return localDrawCanvasArg2;
  }

  public final void reset()
  {
    this.hnO = null;
    u.i("BaseDrawCanvasWithObj", "drop frame %d times, allFrame %d ", new Object[] { Integer.valueOf(this.hnT), Integer.valueOf(this.hnU) });
    this.hnU = 0;
    this.hnT = 0;
    this.hnR = 0L;
    this.workerThread.interrupt();
    for (Runnable localRunnable = (Runnable)this.hnQ.poll(); localRunnable != null; localRunnable = (Runnable)this.hnQ.poll())
      if (localRunnable != null)
        localRunnable.run();
    this.hnQ.clear();
    this.hnP.clear();
    if (this.hnN != null)
    {
      this.hnN.reset();
      this.hnN = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.a.a
 * JD-Core Version:    0.6.2
 */
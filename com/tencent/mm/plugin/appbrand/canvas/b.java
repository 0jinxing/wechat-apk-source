package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.appbrand.canvas.widget.a
{
  volatile boolean hcf;
  JSONArray hcg;
  volatile DrawCanvasArg hch;
  private d hci;
  private c hcj;
  com.tencent.mm.plugin.appbrand.canvas.widget.a hck;
  private volatile String hcl;
  private Runnable hcm;
  private Runnable hcn;
  private volatile long hco;
  private volatile long hcp;
  protected volatile int hcq;
  protected volatile long hcr;
  protected volatile long hcs;
  protected volatile long hct;
  protected volatile long hcu;
  private com.tencent.mm.plugin.appbrand.canvas.c.a hcv;
  boolean hcw;
  private String hcx;
  protected volatile int mCount;
  public volatile boolean mPause;

  public b(com.tencent.mm.plugin.appbrand.canvas.widget.a parama)
  {
    AppMethodBeat.i(103149);
    this.hcm = new b.1(this);
    this.hcn = new b.2(this);
    this.hcq = 0;
    this.hcw = true;
    this.hck = parama;
    this.hci = new d(new b.a(parama));
    this.hcj = new c();
    AppMethodBeat.o(103149);
  }

  private boolean a(Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103152);
    this.hcf = false;
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
      AppMethodBeat.o(103152);
    while (true)
    {
      return bool;
      long l1 = this.hco;
      long l2 = System.nanoTime();
      this.hci.reset();
      int i = 0;
      while (true)
        if (i < paramJSONArray.length())
        {
          JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
          if (localJSONObject != null);
          try
          {
            this.hcj.a(this.hci, paramCanvas, localJSONObject);
            i++;
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.DrawActionDelegateImpl", "drawAction error, exception : %s", new Object[] { localException });
          }
        }
      e(l1, l2, System.nanoTime());
      l1 = System.currentTimeMillis();
      if (!this.mPause)
        this.hcu = l1;
      AppMethodBeat.o(103152);
      bool = true;
    }
  }

  private void e(long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong1 != 0L)
    {
      this.hct = (paramLong3 - paramLong2 + this.hct);
      this.hcs += paramLong3 - paramLong1;
      this.mCount += 1;
    }
  }

  private boolean f(Canvas paramCanvas)
  {
    AppMethodBeat.i(103151);
    this.hci.hcN = true;
    boolean bool;
    if (this.hch == null)
    {
      this.hcf = false;
      AppMethodBeat.o(103151);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((!this.hch.hdX) || (this.hch.heb))
        break;
      bool = a(paramCanvas, this.hch.hdY);
      AppMethodBeat.o(103151);
    }
    this.hcf = false;
    if (this.hch == null);
    for (Object localObject1 = null; ; localObject1 = this.hch.hdv)
    {
      if ((localObject1 != null) && (((List)localObject1).size() != 0))
        break label123;
      AppMethodBeat.o(103151);
      bool = false;
      break;
    }
    label123: long l1 = this.hco;
    long l2 = System.nanoTime();
    this.hci.reset();
    localObject1 = ((List)localObject1).iterator();
    while (true)
    {
      try
      {
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (DrawActionWrapper)((Iterator)localObject1).next();
          if (localObject2 == null)
            continue;
          try
          {
            switch (((DrawActionWrapper)localObject2).type)
            {
            default:
              ab.w("MicroMsg.DrawActionDelegateImpl", "unknown arg type %d", new Object[] { Integer.valueOf(((DrawActionWrapper)localObject2).type) });
            case 1:
            case 2:
            }
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.DrawActionDelegateImpl", "drawAction error, exception : %s", new Object[] { localException });
          }
          continue;
        }
      }
      catch (Exception paramCanvas)
      {
        ab.printErrStackTrace("MicroMsg.DrawActionDelegateImpl", paramCanvas, "", new Object[0]);
        e(l1, l2, System.nanoTime());
        l1 = System.currentTimeMillis();
        if (!this.mPause)
          this.hcu = l1;
        AppMethodBeat.o(103151);
        bool = true;
      }
      break;
      this.hcj.a(this.hci, paramCanvas, ((DrawActionWrapper)localObject2).hcQ);
      Object localObject4 = new java/lang/IllegalStateException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("please use draw obj ");
      ((IllegalStateException)localObject4).<init>(((DrawActionWrapper)localObject2).hcQ.toString());
      AppMethodBeat.o(103151);
      throw ((Throwable)localObject4);
      localObject4 = this.hcj;
      localObject3 = this.hci;
      Object localObject2 = ((DrawActionWrapper)localObject2).hcP;
      localObject4 = (com.tencent.mm.plugin.appbrand.canvas.action.d)((c)localObject4).hcD.get(((BaseDrawActionArg)localObject2).method);
      if (localObject4 != null)
        ((com.tencent.mm.plugin.appbrand.canvas.action.d)localObject4).a((d)localObject3, paramCanvas, (DrawActionArg)localObject2);
    }
  }

  public final void C(Runnable paramRunnable)
  {
    AppMethodBeat.i(103159);
    if (equals(this.hck))
      AppMethodBeat.o(103159);
    while (true)
    {
      return;
      al.d(paramRunnable);
      AppMethodBeat.o(103159);
    }
  }

  public final void a(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103155);
    this.hck.C(new b.5(this, paramDrawCanvasArg, parama));
    AppMethodBeat.o(103155);
  }

  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(103153);
    this.hck.C(new b.3(this, paramJSONArray, parama));
    AppMethodBeat.o(103153);
  }

  public final void ayc()
  {
  }

  public final void ayd()
  {
    AppMethodBeat.i(103157);
    this.hck.C(new b.7(this));
    AppMethodBeat.o(103157);
  }

  public final void aye()
  {
    AppMethodBeat.i(103160);
    int i = this.mCount;
    long l1 = this.hct;
    long l2 = this.hcs;
    if ((i <= 0) || (l1 <= 0L) || (l2 <= 0L))
      AppMethodBeat.o(103160);
    while (true)
    {
      return;
      float f1 = (float)this.hcr * 1.0F / this.hcq / 1000000.0F;
      float f2 = (float)l1 * 1.0F / i / 1000000.0F;
      ab.i("MicroMsg.DrawActionDelegateImpl", "firstDraw timecost %f, onDraw timecost %f, firstDraw count %d, drawCount %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(this.hcq), Integer.valueOf(i) });
      if (this.hcv != null)
      {
        this.hcv.gk(l1 / i);
        this.hcv.gl(l2 / i);
        this.hcv.b(l1, l2, i);
        this.hcv.aj(f1);
        this.hcv.ak(f2);
      }
      AppMethodBeat.o(103160);
    }
  }

  public final void b(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(103156);
    if (paramDrawCanvasArg == null)
      AppMethodBeat.o(103156);
    while (true)
    {
      return;
      this.hck.C(new b.6(this, paramDrawCanvasArg, parama));
      AppMethodBeat.o(103156);
    }
  }

  public final void b(final JSONArray paramJSONArray, final a.a parama)
  {
    AppMethodBeat.i(103154);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
      AppMethodBeat.o(103154);
    while (true)
    {
      return;
      this.hck.C(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(103143);
          b.this.hcw = true;
          if (b.this.hcg == null)
            b.this.hcg = paramJSONArray;
          while (true)
          {
            b.this.hcf = true;
            if (parama != null)
              parama.a(null);
            AppMethodBeat.o(103143);
            return;
            for (int i = 0; i < paramJSONArray.length(); i++)
              b.this.hcg.put(paramJSONArray.opt(i));
          }
        }
      });
      AppMethodBeat.o(103154);
    }
  }

  public final boolean e(Canvas paramCanvas)
  {
    AppMethodBeat.i(103150);
    boolean bool;
    if (this.hcw)
    {
      this.hci.hcN = false;
      bool = a(paramCanvas, this.hcg);
      AppMethodBeat.o(103150);
    }
    while (true)
    {
      return bool;
      bool = f(paramCanvas);
      AppMethodBeat.o(103150);
    }
  }

  public final d getDrawContext()
  {
    return this.hci;
  }

  public final String getSessionId()
  {
    return this.hcl;
  }

  public final String getTraceId()
  {
    return this.hcx;
  }

  public final boolean isPaused()
  {
    return this.mPause;
  }

  public final void onResume()
  {
    AppMethodBeat.i(103158);
    this.hck.C(this.hcn);
    AppMethodBeat.o(103158);
  }

  public final void setDrawActionReportable(com.tencent.mm.plugin.appbrand.canvas.c.a parama)
  {
    this.hcv = parama;
  }

  public final void setSessionId(String paramString)
  {
    this.hcl = paramString;
  }

  public final void setStartTime(long paramLong)
  {
    this.hco = paramLong;
    this.hcp = paramLong;
  }

  public final void setTraceId(String paramString)
  {
    this.hcx = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b
 * JD-Core Version:    0.6.2
 */
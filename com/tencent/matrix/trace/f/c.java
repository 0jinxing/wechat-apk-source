package com.tencent.matrix.trace.f;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.mrs.b.a.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends e
{
  private final com.tencent.matrix.trace.a.a bYH;
  private final long bZM;
  long bZN;
  private boolean bZO;
  long bZP;
  long bZQ;
  long bZR;
  long bZS;
  private long bZT;
  private HashSet<com.tencent.matrix.trace.e.b> listeners = new HashSet();

  public c(com.tencent.matrix.trace.a.a parama)
  {
    this.bYH = parama;
    this.bZM = (TimeUnit.MILLISECONDS.convert(com.tencent.matrix.trace.core.b.zx().bZe, TimeUnit.NANOSECONDS) + 1L);
    if (parama.bWX == null)
    {
      i = 10000;
      this.bZN = i;
      this.bZO = parama.bYA;
      if (parama.bWX != null)
        break label203;
      i = 42;
      label76: this.bZP = i;
      if (parama.bWX != null)
        break label224;
      i = 24;
      label92: this.bZQ = i;
      if (parama.bWX != null)
        break label245;
      i = 3;
      label107: this.bZS = i;
      if (parama.bWX != null)
        break label265;
    }
    label265: for (int i = 9; ; i = parama.bWX.get(a.a.Ajg.name(), 9))
    {
      this.bZR = i;
      com.tencent.matrix.d.c.i("Matrix.FrameTracer", "[init] frameIntervalMs:%s isFPSEnable:%s", new Object[] { Long.valueOf(this.bZM), Boolean.valueOf(this.bZO) });
      if (this.bZO)
        a(new b((byte)0));
      return;
      i = parama.bWX.get(a.a.Ajd.name(), 10000);
      break;
      label203: i = parama.bWX.get(a.a.Aji.name(), 42);
      break label76;
      label224: i = parama.bWX.get(a.a.Ajh.name(), 24);
      break label92;
      label245: i = parama.bWX.get(a.a.Ajf.name(), 3);
      break label107;
    }
  }

  public final void a(com.tencent.matrix.trace.e.b paramb)
  {
    synchronized (this.listeners)
    {
      this.listeners.add(paramb);
      return;
    }
  }

  public final void a(String paramString, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    paramLong2 = System.currentTimeMillis();
    try
    {
      synchronized (this.listeners)
      {
        Iterator localIterator = this.listeners.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.matrix.trace.e.b localb = (com.tencent.matrix.trace.e.b)localIterator.next();
          int i = (int)(paramLong1 / this.bZM);
          if (localb.getHandler() != null)
          {
            Handler localHandler = localb.getHandler();
            Runnable local1 = new com/tencent/matrix/trace/f/c$1;
            local1.<init>(this, localb, paramString, paramLong1, i);
            localHandler.post(local1);
          }
        }
      }
    }
    finally
    {
      paramLong1 = System.currentTimeMillis() - paramLong2;
      if (this.bYH.bYE)
        com.tencent.matrix.d.c.v("Matrix.FrameTracer", "[notifyListener] cost:%sms", new Object[] { Long.valueOf(paramLong1) });
      if (paramLong1 > this.bZM)
        com.tencent.matrix.d.c.w("Matrix.FrameTracer", "[notifyListener] warm! maybe do heavy work in doFrameSync,but you can replace with doFrameAsync! cost:%sms", new Object[] { Long.valueOf(paramLong1) });
      if ((this.bYH.isDebug) && (!this.caA))
        this.bZT += 1L;
    }
    paramLong1 = System.currentTimeMillis() - paramLong2;
    if (this.bYH.bYE)
      com.tencent.matrix.d.c.v("Matrix.FrameTracer", "[notifyListener] cost:%sms", new Object[] { Long.valueOf(paramLong1) });
    if (paramLong1 > this.bZM)
      com.tencent.matrix.d.c.w("Matrix.FrameTracer", "[notifyListener] warm! maybe do heavy work in doFrameSync,but you can replace with doFrameAsync! cost:%sms", new Object[] { Long.valueOf(paramLong1) });
    if ((this.bYH.isDebug) && (!this.caA))
      this.bZT += 1L;
  }

  public final void b(com.tencent.matrix.trace.e.b paramb)
  {
    synchronized (this.listeners)
    {
      this.listeners.remove(paramb);
      return;
    }
  }

  public final void onForeground(boolean paramBoolean)
  {
    super.onForeground(paramBoolean);
    if (paramBoolean)
    {
      if (this.bZT > 300L)
        com.tencent.matrix.d.c.e("Matrix.FrameTracer", "wrong! why do frame[%s] in background!!!", new Object[] { Long.valueOf(this.bZT) });
      this.bZT = 0L;
    }
  }

  public final void zC()
  {
    super.zC();
    com.tencent.matrix.trace.core.b.zx().a(this);
  }

  public final void zD()
  {
    super.zD();
    com.tencent.matrix.trace.core.b.zx().b(this);
  }

  static enum a
  {
    int index;

    private a(int paramInt)
    {
      this.index = paramInt;
    }
  }

  final class b extends com.tencent.matrix.trace.e.b
  {
    private Handler caf = new Handler(com.tencent.matrix.d.b.zL().getLooper());
    private HashMap<String, c.c> cag = new HashMap();

    private b()
    {
    }

    public final void a(String paramString, long paramLong, int paramInt)
    {
      super.a(paramString, paramLong, paramInt);
      if ((paramString == null) || (paramString.equals("")));
      for (int i = 1; i != 0; i = 0)
        return;
      c.c localc = (c.c)this.cag.get(paramString);
      if (localc == null)
      {
        localc = new c.c(c.this, paramString);
        this.cag.put(paramString, localc);
      }
      while (true)
      {
        long l = com.tencent.matrix.trace.core.b.zx().bZe;
        paramLong = localc.cai;
        localc.cai = (l * (paramInt + 1) / 1000000L + paramLong);
        localc.cak += paramInt;
        localc.caj += 1;
        Object localObject1;
        int j;
        int k;
        if (paramInt >= localc.bZY.bZP)
        {
          localObject1 = localc.cal;
          i = c.a.bZZ.index;
          localObject1[i] += 1;
          localObject1 = localc.cam;
          j = c.a.bZZ.index;
          i = localObject1[j];
          k = paramInt;
        }
        while (true)
        {
          Object localObject2;
          while (true)
          {
            localObject1[j] = (i + k);
            if (localc.cai < c.this.bZN)
              break;
            this.cag.remove(paramString);
            float f = Math.min(60.0F, 1000.0F * localc.caj / (float)localc.cai);
            com.tencent.matrix.d.c.i("Matrix.FrameTracer", "[report] FPS:%s %s", new Object[] { Float.valueOf(f), localc.toString() });
            try
            {
              paramString = (com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class);
              JSONObject localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>();
              localJSONObject.put(c.a.bZZ.name(), localc.cal[c.a.bZZ.index]);
              localJSONObject.put(c.a.caa.name(), localc.cal[c.a.caa.index]);
              localJSONObject.put(c.a.cab.name(), localc.cal[c.a.cab.index]);
              localJSONObject.put(c.a.cac.name(), localc.cal[c.a.cac.index]);
              localJSONObject.put(c.a.cad.name(), localc.cal[c.a.cad.index]);
              localObject1 = new org/json/JSONObject;
              ((JSONObject)localObject1).<init>();
              ((JSONObject)localObject1).put(c.a.bZZ.name(), localc.cam[c.a.bZZ.index]);
              ((JSONObject)localObject1).put(c.a.caa.name(), localc.cam[c.a.caa.index]);
              ((JSONObject)localObject1).put(c.a.cab.name(), localc.cam[c.a.cab.index]);
              ((JSONObject)localObject1).put(c.a.cac.name(), localc.cam[c.a.cac.index]);
              ((JSONObject)localObject1).put(c.a.cad.name(), localc.cam[c.a.cad.index]);
              localObject2 = new org/json/JSONObject;
              ((JSONObject)localObject2).<init>();
              localObject2 = com.tencent.matrix.d.a.a((JSONObject)localObject2, paramString.getApplication());
              ((JSONObject)localObject2).put("scene", localc.cah);
              ((JSONObject)localObject2).put("dropLevel", localJSONObject);
              ((JSONObject)localObject2).put("dropSum", localObject1);
              ((JSONObject)localObject2).put("fps", f);
              localObject1 = new com/tencent/matrix/c/b;
              ((com.tencent.matrix.c.b)localObject1).<init>();
              ((com.tencent.matrix.c.b)localObject1).tag = "Trace_FPS";
              ((com.tencent.matrix.c.b)localObject1).bWv = ((JSONObject)localObject2);
              paramString.onDetectIssue((com.tencent.matrix.c.b)localObject1);
            }
            catch (JSONException paramString)
            {
              com.tencent.matrix.d.c.e("Matrix.FrameTracer", "json error", new Object[] { paramString });
            }
          }
          break;
          if (paramInt >= localc.bZY.bZQ)
          {
            localObject1 = localc.cal;
            i = c.a.caa.index;
            localObject1[i] += 1;
            localObject1 = localc.cam;
            j = c.a.caa.index;
            i = localObject1[j];
            k = paramInt;
          }
          else if (paramInt >= localc.bZY.bZR)
          {
            localObject1 = localc.cal;
            i = c.a.cab.index;
            localObject1[i] += 1;
            localObject1 = localc.cam;
            j = c.a.cab.index;
            i = localObject1[j];
            k = paramInt;
          }
          else if (paramInt >= localc.bZY.bZS)
          {
            localObject1 = localc.cal;
            i = c.a.cac.index;
            localObject1[i] += 1;
            localObject1 = localc.cam;
            j = c.a.cac.index;
            i = localObject1[j];
            k = paramInt;
          }
          else
          {
            localObject1 = localc.cal;
            i = c.a.cad.index;
            localObject1[i] += 1;
            localObject2 = localc.cam;
            int m = c.a.cad.index;
            int n = localObject2[m];
            i = n;
            j = m;
            localObject1 = localObject2;
            k = paramInt;
            if (paramInt < 0)
            {
              k = 0;
              i = n;
              j = m;
              localObject1 = localObject2;
            }
          }
        }
      }
    }

    public final Handler getHandler()
    {
      return this.caf;
    }
  }

  final class c
  {
    String cah;
    long cai;
    int caj = 0;
    int cak;
    int[] cal = new int[c.a.values().length];
    int[] cam = new int[c.a.values().length];

    c(String arg2)
    {
      Object localObject;
      this.cah = localObject;
    }

    public final String toString()
    {
      return "focusedActivityName=" + this.cah + ", sumFrame=" + this.caj + ", sumDroppedFrames=" + this.cak + ", sumFrameCost=" + this.cai + ", dropLevel=" + Arrays.toString(this.cal);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.f.c
 * JD-Core Version:    0.6.2
 */
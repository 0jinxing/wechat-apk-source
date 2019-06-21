package com.tencent.matrix.trace.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.matrix.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.core.AppMethodBeat.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends e
{
  final com.tencent.matrix.trace.a.a bYu;
  private Handler bZw;
  volatile a bZx;
  private boolean bZy;

  public a(com.tencent.matrix.trace.a.a parama)
  {
    this.bYu = parama;
    this.bZy = parama.bYD;
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, boolean paramBoolean)
  {
    super.a(paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramBoolean);
    if (this.bYu.bYE)
      c.v("Matrix.AnrTracer", "[dispatchEnd] token:%s cost:%sms cpu:%sms usage:%s", new Object[] { Long.valueOf(paramLong5), Long.valueOf(paramLong3 - paramLong1), Long.valueOf(paramLong4 - paramLong2), com.tencent.matrix.trace.g.b.p(paramLong4 - paramLong2, paramLong3 - paramLong1) });
    if (this.bZx != null)
    {
      this.bZx.bZz.release();
      this.bZw.removeCallbacks(this.bZx);
    }
  }

  public final void a(String paramString, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    if (this.bYu.bYE)
      c.v("Matrix.AnrTracer", "--> [doFrame] activityName:%s frameCost:%sms [%s:%s:%s]ns", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(paramLong4) });
  }

  public final void c(long paramLong1, long paramLong2, long paramLong3)
  {
    super.c(paramLong1, paramLong2, paramLong3);
    if (this.bZx != null)
      this.bZw.removeCallbacks(this.bZx);
    this.bZx = new a(AppMethodBeat.getInstance().maskIndex("AnrTracer#dispatchBegin"), paramLong3);
    if (this.bYu.bYE)
      c.v("Matrix.AnrTracer", "* [dispatchBegin] token:%s index:%s", new Object[] { Long.valueOf(paramLong3), Integer.valueOf(this.bZx.bZz.index) });
    this.bZw.postDelayed(this.bZx, 5000L);
  }

  public final void zC()
  {
    super.zC();
    if (this.bZy)
    {
      com.tencent.matrix.trace.core.b.zx().a(this);
      this.bZw = new Handler(com.tencent.matrix.d.b.zL().getLooper());
    }
  }

  public final void zD()
  {
    super.zD();
    if (this.bZy)
    {
      com.tencent.matrix.trace.core.b.zx().b(this);
      if (this.bZx != null)
        this.bZx.bZz.release();
      this.bZw.removeCallbacksAndMessages(null);
    }
  }

  final class a
    implements Runnable
  {
    long bYW;
    AppMethodBeat.a bZz;

    a(AppMethodBeat.a paramLong, long arg3)
    {
      this.bZz = paramLong;
      Object localObject;
      this.bYW = localObject;
    }

    public final void run()
    {
      a.this.bZx = null;
      long l1 = SystemClock.uptimeMillis();
      Object localObject1 = AppMethodBeat.getInstance().copyData(this.bZz);
      this.bZz.release();
      Object localObject2 = new long[3];
      localObject2[0] = com.tencent.matrix.d.a.getDalvikHeap();
      localObject2[1] = com.tencent.matrix.d.a.getNativeHeap();
      localObject2[2] = com.tencent.matrix.d.a.zJ();
      Object localObject3 = Looper.getMainLooper().getThread().getState();
      Object localObject4 = com.tencent.matrix.trace.g.b.a(Looper.getMainLooper().getThread().getStackTrace(), "|*        ", 12);
      Object localObject5 = com.tencent.matrix.trace.core.b.zx();
      long l2 = ((com.tencent.matrix.trace.core.b)localObject5).p(0, this.bYW);
      long l3 = ((com.tencent.matrix.trace.core.b)localObject5).p(1, this.bYW);
      long l4 = ((com.tencent.matrix.trace.core.b)localObject5).p(2, this.bYW);
      Object localObject6 = new LinkedList();
      if (localObject1.length > 0)
      {
        com.tencent.matrix.trace.g.a.a((long[])localObject1, (LinkedList)localObject6, true, l1);
        com.tencent.matrix.trace.g.a.a((List)localObject6, new com.tencent.matrix.trace.g.a.a()
        {
          public final boolean c(long paramAnonymousLong, int paramAnonymousInt)
          {
            if (paramAnonymousLong < paramAnonymousInt * 5);
            for (boolean bool = true; ; bool = false)
              return bool;
          }

          public final void e(List<com.tencent.matrix.trace.d.a> paramAnonymousList, int paramAnonymousInt)
          {
            c.w("Matrix.AnrTracer", "[fallback] size:%s targetSize:%s stack:%s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(30), paramAnonymousList });
            paramAnonymousList = paramAnonymousList.listIterator(Math.min(paramAnonymousInt, 30));
            while (paramAnonymousList.hasNext())
            {
              paramAnonymousList.next();
              paramAnonymousList.remove();
            }
          }
        });
      }
      localObject1 = new StringBuilder();
      StringBuilder localStringBuilder = new StringBuilder();
      long l5 = Math.max(5000L, com.tencent.matrix.trace.g.a.a((LinkedList)localObject6, (StringBuilder)localObject1, localStringBuilder));
      localObject5 = com.tencent.matrix.trace.g.a.a((List)localObject6, l5);
      long l6 = ((LinkedList)localObject6).size();
      localObject6 = new StringBuilder();
      ((StringBuilder)localObject6).append(" \n>>>>>>>>>>>>>>>>>>>>>>> maybe happens ANR(5s)! <<<<<<<<<<<<<<<<<<<<<<<\n");
      ((StringBuilder)localObject6).append("|* [Memory]\n");
      ((StringBuilder)localObject6).append("|*   DalvikHeap: ").append(localObject2[0]).append("kb\n");
      ((StringBuilder)localObject6).append("|*   NativeHeap: ").append(localObject2[1]).append("kb\n");
      ((StringBuilder)localObject6).append("|*   VmSize: ").append(localObject2[2]).append("kb\n");
      ((StringBuilder)localObject6).append("|* [doFrame]\n");
      ((StringBuilder)localObject6).append("|*   inputCost: ").append(l2).append("\n");
      ((StringBuilder)localObject6).append("|*   animationCost: ").append(l3).append("\n");
      ((StringBuilder)localObject6).append("|*   traversalCost: ").append(l4).append("\n");
      ((StringBuilder)localObject6).append("|* [Thread]\n");
      ((StringBuilder)localObject6).append("|*   State: ").append(localObject3).append("\n");
      ((StringBuilder)localObject6).append("|*   Stack: ").append((String)localObject4);
      ((StringBuilder)localObject6).append("|* [Trace]\n");
      ((StringBuilder)localObject6).append("|*   StackSize: ").append(l6).append("\n");
      ((StringBuilder)localObject6).append("|*   StackKey: ").append((String)localObject5).append("\n");
      if (a.this.bYu.isDebug)
        ((StringBuilder)localObject6).append(localStringBuilder.toString());
      ((StringBuilder)localObject6).append("=========================================================================");
      c.w("Matrix.AnrTracer", "%s \npostTime:%s curTime:%s", new Object[] { ((StringBuilder)localObject6).toString(), Long.valueOf(this.bYW), Long.valueOf(l1) });
      try
      {
        localObject3 = (com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class);
        localObject4 = new org/json/JSONObject;
        ((JSONObject)localObject4).<init>();
        localObject4 = com.tencent.matrix.d.a.a((JSONObject)localObject4, com.tencent.matrix.a.yK().application);
        ((JSONObject)localObject4).put("detail", com.tencent.matrix.trace.b.a.a.bYJ);
        ((JSONObject)localObject4).put("cost", l5);
        ((JSONObject)localObject4).put("stackKey", localObject5);
        ((JSONObject)localObject4).put("stack", ((StringBuilder)localObject1).toString());
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>();
        ((JSONObject)localObject1).put("dalvik_heap", localObject2[0]);
        ((JSONObject)localObject1).put("native_heap", localObject2[1]);
        ((JSONObject)localObject1).put("vm_size", localObject2[2]);
        ((JSONObject)localObject4).put("memory", localObject1);
        localObject1 = new com/tencent/matrix/c/b;
        ((com.tencent.matrix.c.b)localObject1).<init>();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((com.tencent.matrix.c.b)localObject1).key = this.bYW;
        ((com.tencent.matrix.c.b)localObject1).tag = "Trace_EvilMethod";
        ((com.tencent.matrix.c.b)localObject1).bWv = ((JSONObject)localObject4);
        ((com.tencent.matrix.trace.a)localObject3).onDetectIssue((com.tencent.matrix.c.b)localObject1);
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          c.e("Matrix.AnrTracer", "[JSONException error: %s", new Object[] { localJSONException });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.f.a
 * JD-Core Version:    0.6.2
 */
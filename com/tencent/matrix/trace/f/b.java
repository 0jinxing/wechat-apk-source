package com.tencent.matrix.trace.f;

import android.os.Handler;
import com.tencent.matrix.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.core.AppMethodBeat.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends e
{
  final com.tencent.matrix.trace.a.a bYH;
  private AppMethodBeat.a bZC;
  private long[] bZD = new long[3];
  private long bZE;
  private boolean bZF;

  public b(com.tencent.matrix.trace.a.a parama)
  {
    this.bYH = parama;
    if (parama.bWX == null);
    while (true)
    {
      this.bZE = i;
      this.bZF = parama.bYB;
      return;
      i = parama.bWX.get(com.tencent.mrs.b.a.a.Aje.name(), 1000);
    }
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, boolean paramBoolean)
  {
    super.a(paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramBoolean);
    long l;
    if (this.bYH.bYE)
      l = System.currentTimeMillis();
    try
    {
      if (paramLong3 - paramLong1 >= this.bZE)
      {
        long[] arrayOfLong1 = AppMethodBeat.getInstance().copyData(this.bZC);
        long[] arrayOfLong2 = new long[3];
        System.arraycopy(this.bZD, 0, arrayOfLong2, 0, 3);
        Handler localHandler = com.tencent.matrix.d.b.zM();
        a locala = new com/tencent/matrix/trace/f/b$a;
        locala.<init>(this, arrayOfLong1, arrayOfLong2, paramLong4 - paramLong2, paramLong3 - paramLong1, paramLong3);
        localHandler.post(locala);
      }
      return;
      l = 0L;
    }
    finally
    {
      this.bZC.release();
      if (this.bYH.bYE)
        c.v("Matrix.EvilMethodTracer", "[dispatchEnd] token:%s cost:%sms cpu:%sms usage:%s innerCost:%s", new Object[] { Long.valueOf(paramLong5), Long.valueOf(paramLong3 - paramLong1), Long.valueOf(paramLong4 - paramLong2), com.tencent.matrix.trace.g.b.p(paramLong4 - paramLong2, paramLong3 - paramLong1), Long.valueOf(System.currentTimeMillis() - l) });
    }
  }

  public final void a(String paramString, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    this.bZD[0] = paramLong2;
    this.bZD[1] = paramLong3;
    this.bZD[2] = paramLong4;
  }

  public final void c(long paramLong1, long paramLong2, long paramLong3)
  {
    super.c(paramLong1, paramLong2, paramLong3);
    this.bZC = AppMethodBeat.getInstance().maskIndex("EvilMethodTracer#dispatchBegin");
  }

  public final void zC()
  {
    super.zC();
    if (this.bZF)
      com.tencent.matrix.trace.core.b.zx().a(this);
  }

  public final void zD()
  {
    super.zD();
    if (this.bZF)
      com.tencent.matrix.trace.core.b.zx().b(this);
  }

  final class a
    implements Runnable
  {
    long[] bZG;
    long bZH;
    long bZI;
    long bZJ;
    long[] bZh;

    a(long[] paramArrayOfLong1, long[] paramLong1, long arg4, long arg6, long arg8)
    {
      Object localObject1;
      this.bZI = localObject1;
      this.bZH = ???;
      this.bZG = paramArrayOfLong1;
      this.bZh = paramLong1;
      Object localObject2;
      this.bZJ = localObject2;
    }

    public final void run()
    {
      Object localObject1 = com.tencent.matrix.trace.g.b.p(this.bZH, this.bZI);
      Object localObject2 = new LinkedList();
      if (this.bZG.length > 0)
      {
        com.tencent.matrix.trace.g.a.a(this.bZG, (LinkedList)localObject2, true, this.bZJ);
        com.tencent.matrix.trace.g.a.a((List)localObject2, new com.tencent.matrix.trace.g.a.a()
        {
          public final boolean c(long paramAnonymousLong, int paramAnonymousInt)
          {
            if (paramAnonymousLong < paramAnonymousInt * 5);
            for (boolean bool = true; ; bool = false)
              return bool;
          }

          public final void e(List<com.tencent.matrix.trace.d.a> paramAnonymousList, int paramAnonymousInt)
          {
            c.w("Matrix.EvilMethodTracer", "[fallback] size:%s targetSize:%s stack:%s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(30), paramAnonymousList });
            paramAnonymousList = paramAnonymousList.listIterator(Math.min(paramAnonymousInt, 30));
            while (paramAnonymousList.hasNext())
            {
              paramAnonymousList.next();
              paramAnonymousList.remove();
            }
          }
        });
      }
      StringBuilder localStringBuilder = new StringBuilder();
      Object localObject3 = new StringBuilder();
      long l1 = Math.max(this.bZI, com.tencent.matrix.trace.g.a.a((LinkedList)localObject2, localStringBuilder, (StringBuilder)localObject3));
      String str = com.tencent.matrix.trace.g.a.a((List)localObject2, l1);
      long l2 = ((LinkedList)localObject2).size();
      long l3 = this.bZh[0];
      long l4 = this.bZh[1];
      long l5 = this.bZh[2];
      long l6 = this.bZI;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(String.format(" \n>>>>>>>>>>>>>>>>>>>>> maybe happens Jankiness!(%sms) <<<<<<<<<<<<<<<<<<<<<\n", new Object[] { Long.valueOf(l6) }));
      ((StringBuilder)localObject2).append("|* [CPU]\n");
      ((StringBuilder)localObject2).append("|*   usage: ").append((String)localObject1).append("\n");
      ((StringBuilder)localObject2).append("|* [Memory]\n");
      ((StringBuilder)localObject2).append("|* [doFrame]\n");
      ((StringBuilder)localObject2).append("|*   inputCost: ").append(l3).append("\n");
      ((StringBuilder)localObject2).append("|*   animationCost: ").append(l4).append("\n");
      ((StringBuilder)localObject2).append("|*   traversalCost: ").append(l5).append("\n");
      ((StringBuilder)localObject2).append("|* [Trace]\n");
      ((StringBuilder)localObject2).append("|*   StackSize: ").append(l2).append("\n");
      ((StringBuilder)localObject2).append("|*   StackKey: ").append(str).append("\n");
      if (b.this.bYH.isDebug)
        ((StringBuilder)localObject2).append(((StringBuilder)localObject3).toString());
      ((StringBuilder)localObject2).append("=========================================================================");
      c.w("Matrix.EvilMethodTracer", "%s", new Object[] { ((StringBuilder)localObject2).toString() });
      try
      {
        localObject3 = (com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class);
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        localObject2 = com.tencent.matrix.d.a.a((JSONObject)localObject2, com.tencent.matrix.a.yK().application);
        ((JSONObject)localObject2).put("detail", com.tencent.matrix.trace.b.a.a.bYI);
        ((JSONObject)localObject2).put("cost", l1);
        ((JSONObject)localObject2).put("usage", localObject1);
        ((JSONObject)localObject2).put("stack", localStringBuilder.toString());
        ((JSONObject)localObject2).put("stackKey", str);
        localObject1 = new com/tencent/matrix/c/b;
        ((com.tencent.matrix.c.b)localObject1).<init>();
        ((com.tencent.matrix.c.b)localObject1).tag = "Trace_EvilMethod";
        ((com.tencent.matrix.c.b)localObject1).bWv = ((JSONObject)localObject2);
        ((com.tencent.matrix.trace.a)localObject3).onDetectIssue((com.tencent.matrix.c.b)localObject1);
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          c.e("Matrix.EvilMethodTracer", "[JSONException error: %s", new Object[] { localJSONException });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.f.b
 * JD-Core Version:    0.6.2
 */
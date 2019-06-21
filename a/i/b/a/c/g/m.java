package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class m
{
  private d BAb;
  private g BAc;
  private volatile boolean BAd;
  protected volatile q BAe;

  // ERROR //
  public final q d(q paramq)
  {
    // Byte code:
    //   0: ldc 17
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 25	a/i/b/a/c/g/m:BAe	La/i/b/a/c/g/q;
    //   9: ifnonnull +14 -> 23
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield 25	a/i/b/a/c/g/m:BAe	La/i/b/a/c/g/q;
    //   18: ifnull +17 -> 35
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_0
    //   24: getfield 25	a/i/b/a/c/g/m:BAe	La/i/b/a/c/g/q;
    //   27: astore_1
    //   28: ldc 17
    //   30: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_1
    //   34: areturn
    //   35: aload_0
    //   36: getfield 30	a/i/b/a/c/g/m:BAb	La/i/b/a/c/g/d;
    //   39: ifnull +44 -> 83
    //   42: aload_0
    //   43: aload_1
    //   44: invokeinterface 36 1 0
    //   49: aload_0
    //   50: getfield 30	a/i/b/a/c/g/m:BAb	La/i/b/a/c/g/d;
    //   53: aload_0
    //   54: getfield 38	a/i/b/a/c/g/m:BAc	La/i/b/a/c/g/g;
    //   57: invokeinterface 44 3 0
    //   62: checkcast 32	a/i/b/a/c/g/q
    //   65: putfield 25	a/i/b/a/c/g/m:BAe	La/i/b/a/c/g/q;
    //   68: aload_0
    //   69: monitorexit
    //   70: goto -47 -> 23
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: ldc 17
    //   78: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_1
    //   82: athrow
    //   83: aload_0
    //   84: aload_1
    //   85: putfield 25	a/i/b/a/c/g/m:BAe	La/i/b/a/c/g/q;
    //   88: goto -20 -> 68
    //   91: astore_1
    //   92: goto -24 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   14	23	73	finally
    //   35	68	73	finally
    //   68	70	73	finally
    //   74	76	73	finally
    //   83	88	73	finally
    //   35	68	91	java/io/IOException
    //   83	88	91	java/io/IOException
  }

  public final q e(q paramq)
  {
    q localq = this.BAe;
    this.BAe = paramq;
    this.BAb = null;
    this.BAd = true;
    return localq;
  }

  public final int vq()
  {
    AppMethodBeat.i(121550);
    int i;
    if (this.BAd)
    {
      i = this.BAe.vq();
      AppMethodBeat.o(121550);
    }
    while (true)
    {
      return i;
      i = this.BAb.size();
      AppMethodBeat.o(121550);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.m
 * JD-Core Version:    0.6.2
 */
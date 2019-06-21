package com.tencent.mm.kernel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.ai.p.a;
import com.tencent.mm.ai.w.b;
import com.tencent.mm.ci.a.a;
import com.tencent.mm.g.a.kr;
import com.tencent.mm.kernel.api.d;
import com.tencent.mm.model.al;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.model.cc;
import com.tencent.mm.model.cc.a;
import com.tencent.mm.network.c;
import com.tencent.mm.network.h.a;
import com.tencent.mm.network.n;
import com.tencent.mm.network.n.a;
import com.tencent.mm.protocal.x.a;
import com.tencent.mm.protocal.x.b;
import com.tencent.mm.protocal.y.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
{
  public static String eJm = "wechatnetwork";
  private static al eJr = null;
  public final a eJn;
  public final p eJo;
  private HashSet<n> eJp;
  public n eJq;

  public b(p.a parama, a parama1)
  {
    AppMethodBeat.i(57933);
    this.eJp = new HashSet();
    this.eJq = new n.a()
    {
      // ERROR //
      public final void gl(int paramAnonymousInt)
      {
        // Byte code:
        //   0: ldc 21
        //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
        //   5: new 28	java/util/HashSet
        //   8: astore_2
        //   9: aload_2
        //   10: invokespecial 29	java/util/HashSet:<init>	()V
        //   13: aload_0
        //   14: getfield 12	com/tencent/mm/kernel/b$2:eJs	Lcom/tencent/mm/kernel/b;
        //   17: invokestatic 33	com/tencent/mm/kernel/b:b	(Lcom/tencent/mm/kernel/b;)Ljava/util/HashSet;
        //   20: astore_3
        //   21: aload_3
        //   22: monitorenter
        //   23: aload_2
        //   24: aload_0
        //   25: getfield 12	com/tencent/mm/kernel/b$2:eJs	Lcom/tencent/mm/kernel/b;
        //   28: invokestatic 33	com/tencent/mm/kernel/b:b	(Lcom/tencent/mm/kernel/b;)Ljava/util/HashSet;
        //   31: invokevirtual 37	java/util/HashSet:addAll	(Ljava/util/Collection;)Z
        //   34: pop
        //   35: aload_3
        //   36: monitorexit
        //   37: aload_2
        //   38: invokevirtual 41	java/util/HashSet:iterator	()Ljava/util/Iterator;
        //   41: astore_3
        //   42: aload_3
        //   43: invokeinterface 47 1 0
        //   48: ifeq +50 -> 98
        //   51: aload_3
        //   52: invokeinterface 51 1 0
        //   57: checkcast 53	com/tencent/mm/network/n
        //   60: iload_1
        //   61: invokeinterface 55 2 0
        //   66: goto -24 -> 42
        //   69: astore_3
        //   70: ldc 57
        //   72: aload_3
        //   73: ldc 59
        //   75: iconst_0
        //   76: anewarray 61	java/lang/Object
        //   79: invokestatic 67	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   82: ldc 21
        //   84: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   87: return
        //   88: astore_2
        //   89: aload_3
        //   90: monitorexit
        //   91: ldc 21
        //   93: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   96: aload_2
        //   97: athrow
        //   98: ldc 21
        //   100: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   103: goto -16 -> 87
        //
        // Exception table:
        //   from	to	target	type
        //   5	23	69	java/lang/Exception
        //   37	42	69	java/lang/Exception
        //   42	66	69	java/lang/Exception
        //   91	98	69	java/lang/Exception
        //   23	37	88	finally
        //   89	91	88	finally
      }
    };
    this.eJo = p.a(parama);
    this.eJo.ftB = g.RS();
    com.tencent.mm.ai.w.fuq = new w.b()
    {
      public final p Rh()
      {
        AppMethodBeat.i(57922);
        p localp = b.a(b.this);
        AppMethodBeat.o(57922);
        return localp;
      }
    };
    this.eJn = parama1;
    AppMethodBeat.o(57933);
  }

  public static al Re()
  {
    return eJr;
  }

  public static void a(al paramal)
  {
    eJr = paramal;
  }

  public static void b(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(57938);
    kr localkr = new kr();
    localkr.cGB.status = paramInt1;
    localkr.cGB.cGC = paramInt2;
    localkr.cGB.cGD = paramBoolean;
    localkr.cGB.cGE = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localkr);
    AppMethodBeat.o(57938);
  }

  public final void Rf()
  {
    AppMethodBeat.i(57936);
    this.eJo.a(new bk(new bk.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        AppMethodBeat.i(57924);
        if ((paramAnonymouse == null) || (paramAnonymouse.adg() == null))
          AppMethodBeat.o(57924);
        while (true)
        {
          return;
          paramAnonymouse.adg().reset();
          AppMethodBeat.o(57924);
        }
      }
    }
    , "reset accinfo"), 0);
    AppMethodBeat.o(57936);
  }

  public final p Rg()
  {
    return this.eJo;
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(57934);
    synchronized (this.eJp)
    {
      this.eJp.add(paramn);
      AppMethodBeat.o(57934);
      return;
    }
  }

  public final void b(n paramn)
  {
    AppMethodBeat.i(57935);
    synchronized (this.eJp)
    {
      this.eJp.remove(paramn);
      AppMethodBeat.o(57935);
      return;
    }
  }

  public final byte[] jQ(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(57937);
    try
    {
      Object localObject2;
      if ((this.eJo != null) && (this.eJo.ftA != null))
      {
        localObject2 = this.eJo.ftA.adg();
        if (localObject2 != null);
      }
      else
      {
        AppMethodBeat.o(57937);
      }
      while (true)
      {
        return localObject1;
        localObject2 = this.eJo.ftA.adg().jQ(paramInt);
        localObject1 = localObject2;
        AppMethodBeat.o(57937);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MMKernel.CoreNetwork", "get session key error, %s", new Object[] { localException.getMessage() });
        ab.e("MMKernel.CoreNetwork", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(57937);
      }
    }
  }

  public static final class a extends com.tencent.mm.ci.a<d>
    implements d
  {
    public final void b(final com.tencent.mm.network.e parame)
    {
      AppMethodBeat.i(57932);
      a(new a.a()
      {
      });
      AppMethodBeat.o(57932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.b
 * JD-Core Version:    0.6.2
 */
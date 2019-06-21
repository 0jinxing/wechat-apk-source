package com.tencent.mm.at;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class n$a
{
  static ak cbT;
  private ReentrantLock cbR;
  private Condition cbS;
  int fDC;
  n.a.a fFR;

  public n$a()
  {
    AppMethodBeat.i(78358);
    this.cbR = new ReentrantLock();
    this.cbS = this.cbR.newCondition();
    AppMethodBeat.o(78358);
  }

  public static a a(n.e parame)
  {
    AppMethodBeat.i(78359);
    try
    {
      if (cbT == null)
      {
        localObject1 = new android/os/HandlerThread;
        ((HandlerThread)localObject1).<init>("big file gen Worker");
        ((HandlerThread)localObject1).start();
        localObject2 = new com/tencent/mm/sdk/platformtools/ak;
        ((ak)localObject2).<init>(((HandlerThread)localObject1).getLooper());
        cbT = (ak)localObject2;
      }
      Object localObject2 = new a();
      parame.fGl = ((a)localObject2);
      Object localObject1 = parame.fGl;
      cbT.post(new n.a.1((a)localObject1, parame));
      ((a)localObject2).fDC = parame.fDC;
      AppMethodBeat.o(78359);
      return localObject2;
    }
    finally
    {
      AppMethodBeat.o(78359);
    }
    throw parame;
  }

  // ERROR //
  public final n.a.a ahe()
  {
    // Byte code:
    //   0: ldc 95
    //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 35	com/tencent/mm/at/n$a:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   9: invokevirtual 98	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   12: aload_0
    //   13: getfield 100	com/tencent/mm/at/n$a:fFR	Lcom/tencent/mm/at/n$a$a;
    //   16: ifnonnull +42 -> 58
    //   19: ldc 102
    //   21: ldc 104
    //   23: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield 41	com/tencent/mm/at/n$a:cbS	Ljava/util/concurrent/locks/Condition;
    //   30: invokeinterface 114 1 0
    //   35: goto -23 -> 12
    //   38: astore_1
    //   39: aload_0
    //   40: getfield 35	com/tencent/mm/at/n$a:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   43: invokevirtual 117	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   46: aload_0
    //   47: getfield 100	com/tencent/mm/at/n$a:fFR	Lcom/tencent/mm/at/n$a$a;
    //   50: astore_1
    //   51: ldc 95
    //   53: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_1
    //   57: areturn
    //   58: aload_0
    //   59: getfield 35	com/tencent/mm/at/n$a:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   62: invokevirtual 117	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   65: goto -19 -> 46
    //   68: astore_1
    //   69: aload_0
    //   70: getfield 35	com/tencent/mm/at/n$a:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   73: invokevirtual 117	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   76: ldc 95
    //   78: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_1
    //   82: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   12	35	38	java/lang/Exception
    //   12	35	68	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.n.a
 * JD-Core Version:    0.6.2
 */
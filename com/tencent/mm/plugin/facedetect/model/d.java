package com.tencent.mm.plugin.facedetect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static volatile d lTB;
  public static final Object mLock;
  public List<a> lTC = null;

  static
  {
    AppMethodBeat.i(176);
    lTB = null;
    mLock = new Object();
    AppMethodBeat.o(176);
  }

  public static final d bsq()
  {
    AppMethodBeat.i(172);
    if (lTB == null);
    while (true)
    {
      synchronized (mLock)
      {
        if (lTB == null)
        {
          locald1 = new com/tencent/mm/plugin/facedetect/model/d;
          locald1.<init>();
          lTB = locald1;
        }
        d locald1 = lTB;
        AppMethodBeat.o(172);
        return locald1;
      }
      d locald2 = lTB;
      AppMethodBeat.o(172);
    }
  }

  // ERROR //
  public final void a(d.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 173
    //   5: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: ifnonnull +19 -> 28
    //   12: ldc 43
    //   14: ldc 45
    //   16: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: sipush 173
    //   22: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: getstatic 31	com/tencent/mm/plugin/facedetect/model/d:mLock	Ljava/lang/Object;
    //   31: astore_2
    //   32: aload_2
    //   33: monitorenter
    //   34: aload_0
    //   35: getfield 37	com/tencent/mm/plugin/facedetect/model/d:lTC	Ljava/util/List;
    //   38: ifnonnull +20 -> 58
    //   41: new 53	java/util/ArrayList
    //   44: astore_3
    //   45: aload_3
    //   46: iconst_5
    //   47: invokespecial 55	java/util/ArrayList:<init>	(I)V
    //   50: aload_0
    //   51: aload_3
    //   52: invokestatic 61	java/util/Collections:synchronizedList	(Ljava/util/List;)Ljava/util/List;
    //   55: putfield 37	com/tencent/mm/plugin/facedetect/model/d:lTC	Ljava/util/List;
    //   58: aload_0
    //   59: getfield 37	com/tencent/mm/plugin/facedetect/model/d:lTC	Ljava/util/List;
    //   62: astore 4
    //   64: new 6	com/tencent/mm/plugin/facedetect/model/d$a
    //   67: astore_3
    //   68: aload_3
    //   69: aload_0
    //   70: aload_1
    //   71: invokespecial 64	com/tencent/mm/plugin/facedetect/model/d$a:<init>	(Lcom/tencent/mm/plugin/facedetect/model/d;Lcom/tencent/mm/plugin/facedetect/model/d$b;)V
    //   74: aload 4
    //   76: aload_3
    //   77: invokeinterface 70 2 0
    //   82: pop
    //   83: aload_2
    //   84: monitorexit
    //   85: sipush 173
    //   88: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: goto -66 -> 25
    //   94: astore_1
    //   95: aload_0
    //   96: monitorexit
    //   97: aload_1
    //   98: athrow
    //   99: astore_1
    //   100: aload_2
    //   101: monitorexit
    //   102: sipush 173
    //   105: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   108: aload_1
    //   109: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	8	94	finally
    //   12	25	94	finally
    //   28	34	94	finally
    //   85	91	94	finally
    //   102	110	94	finally
    //   34	58	99	finally
    //   58	85	99	finally
    //   100	102	99	finally
  }

  public final void aS(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(174);
    while (true)
    {
      synchronized (mLock)
      {
        ab.v("MicroMsg.FaceCameraDataCallbackHolder", "hy: publish data:".concat(String.valueOf(paramArrayOfByte)));
        if ((this.lTC == null) || (this.lTC.size() == 0))
        {
          ab.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: nothing's listening to preview data");
          AppMethodBeat.o(174);
          return;
        }
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
        {
          ab.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: null camera data got");
          AppMethodBeat.o(174);
          continue;
        }
        Iterator localIterator = this.lTC.iterator();
        if (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          int i = paramArrayOfByte.length;
          locala.data = ((byte[])locala.lTD.bsr().d(Integer.valueOf(i)));
          System.arraycopy(paramArrayOfByte, 0, locala.data, 0, i);
          locala.lTD.aT(locala.data);
        }
      }
      AppMethodBeat.o(174);
    }
  }

  public final void b(d.b paramb)
  {
    AppMethodBeat.i(175);
    synchronized (mLock)
    {
      if (this.lTC != null)
        this.lTC.remove(paramb);
      AppMethodBeat.o(175);
      return;
    }
  }

  final class a
  {
    byte[] data;
    d.b lTD;

    a(d.b arg2)
    {
      Object localObject;
      this.lTD = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.d
 * JD-Core Version:    0.6.2
 */
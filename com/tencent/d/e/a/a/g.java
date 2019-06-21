package com.tencent.d.e.a.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g
{
  private static final int[] AtM = { 1, 4, 9 };
  private final HashSet<Sensor> AtK;
  public final SparseArray<i> AtL;
  public g.a AtN;
  private final SensorManager bCW;

  public g(Context paramContext)
  {
    AppMethodBeat.i(114557);
    this.AtK = new HashSet();
    this.AtL = new SparseArray();
    this.AtN = new g.a(this);
    this.bCW = ((SensorManager)paramContext.getSystemService("sensor"));
    AppMethodBeat.o(114557);
  }

  private static boolean f(SparseArray<i> paramSparseArray)
  {
    boolean bool = false;
    AppMethodBeat.i(114561);
    if (paramSparseArray.size() == 0)
      AppMethodBeat.o(114561);
    while (true)
    {
      return bool;
      label176: for (int i = 0; ; i++)
      {
        if (i >= paramSparseArray.size())
          break label182;
        Object localObject = (i)paramSparseArray.valueAt(i);
        if (localObject != null)
        {
          Object[] arrayOfObject = ((i)localObject).dQB();
          if ((arrayOfObject != null) && (arrayOfObject.length != 0))
          {
            int j = 0;
            for (int k = 0; j < ((i)localObject).Ll.length; k = m)
            {
              m = k;
              if ((List)localObject.Ll[j] != null)
                m = k + 1;
              j++;
            }
            if (k < 3)
            {
              AppMethodBeat.o(114561);
              break;
            }
            for (int m = 0; ; m++)
            {
              if (m >= arrayOfObject.length)
                break label176;
              localObject = (List)arrayOfObject[m];
              if ((localObject != null) && (((List)localObject).size() < f.AtI / 2))
              {
                AppMethodBeat.o(114561);
                break;
              }
            }
          }
        }
      }
      label182: bool = true;
      AppMethodBeat.o(114561);
    }
  }

  public final void dQv()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(114559);
        if (this.bCW == null)
        {
          AppMethodBeat.o(114559);
          return;
        }
        synchronized (this.AtK)
        {
          Iterator localIterator = this.AtK.iterator();
          if (localIterator.hasNext())
          {
            Sensor localSensor = (Sensor)localIterator.next();
            this.bCW.unregisterListener(this.AtN, localSensor);
          }
        }
      }
      finally
      {
      }
      this.AtK.clear();
      g.a locala = this.AtN;
      synchronized (locala.AtO)
      {
        if (!locala.AtO.get())
        {
          AppMethodBeat.o(114559);
          continue;
        }
        locala.AtO.set(false);
        locala.AtQ = (System.currentTimeMillis() - locala.AtD);
        if (locala.AtQ < 0L)
          locala.AtQ = 0L;
        locala.AtD = 0L;
        AppMethodBeat.o(114559);
      }
    }
  }

  public final SparseArray<i> dQw()
  {
    AppMethodBeat.i(114560);
    synchronized (this.AtL)
    {
      SparseArray localSparseArray2 = new android/util/SparseArray;
      localSparseArray2.<init>();
      for (int i = 0; i < this.AtL.size(); i++)
        localSparseArray2.append(this.AtL.keyAt(i), (i)this.AtL.valueAt(i));
      if (f(localSparseArray2))
      {
        AppMethodBeat.o(114560);
        return localSparseArray2;
      }
      localSparseArray2 = new android/util/SparseArray;
      localSparseArray2.<init>();
      AppMethodBeat.o(114560);
    }
  }

  // ERROR //
  public final boolean nA(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 166
    //   4: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 61	com/tencent/d/e/a/a/g:bCW	Landroid/hardware/SensorManager;
    //   11: ifnonnull +14 -> 25
    //   14: ldc 166
    //   16: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: iconst_0
    //   20: istore_3
    //   21: aload_0
    //   22: monitorexit
    //   23: iload_3
    //   24: ireturn
    //   25: aload_0
    //   26: getfield 49	com/tencent/d/e/a/a/g:AtN	Lcom/tencent/d/e/a/a/g$a;
    //   29: astore 4
    //   31: aload 4
    //   33: getfield 127	com/tencent/d/e/a/a/g$a:AtO	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   36: astore 5
    //   38: aload 5
    //   40: monitorenter
    //   41: aload 4
    //   43: getfield 127	com/tencent/d/e/a/a/g$a:AtO	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   46: invokevirtual 132	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   49: ifeq +124 -> 173
    //   52: aload 5
    //   54: monitorexit
    //   55: aload_0
    //   56: getfield 39	com/tencent/d/e/a/a/g:AtK	Ljava/util/HashSet;
    //   59: astore 4
    //   61: aload 4
    //   63: monitorenter
    //   64: aload_0
    //   65: getfield 39	com/tencent/d/e/a/a/g:AtK	Ljava/util/HashSet;
    //   68: invokevirtual 123	java/util/HashSet:clear	()V
    //   71: aload 4
    //   73: monitorexit
    //   74: aload_0
    //   75: getfield 39	com/tencent/d/e/a/a/g:AtK	Ljava/util/HashSet;
    //   78: astore 5
    //   80: aload 5
    //   82: monitorenter
    //   83: getstatic 22	com/tencent/d/e/a/a/g:AtM	[I
    //   86: astore 6
    //   88: aload 6
    //   90: arraylength
    //   91: istore 7
    //   93: iconst_0
    //   94: istore 8
    //   96: iconst_0
    //   97: istore_3
    //   98: iload 8
    //   100: iload 7
    //   102: if_icmpge +143 -> 245
    //   105: aload 6
    //   107: iload 8
    //   109: iaload
    //   110: istore 9
    //   112: aload_0
    //   113: getfield 61	com/tencent/d/e/a/a/g:bCW	Landroid/hardware/SensorManager;
    //   116: iload 9
    //   118: invokevirtual 170	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   121: astore 4
    //   123: iload_3
    //   124: istore 10
    //   126: aload 4
    //   128: ifnull +36 -> 164
    //   131: iload_3
    //   132: istore 10
    //   134: aload_0
    //   135: getfield 61	com/tencent/d/e/a/a/g:bCW	Landroid/hardware/SensorManager;
    //   138: aload_0
    //   139: getfield 49	com/tencent/d/e/a/a/g:AtN	Lcom/tencent/d/e/a/a/g$a;
    //   142: aload 4
    //   144: iconst_0
    //   145: invokevirtual 174	android/hardware/SensorManager:registerListener	(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //   148: ifeq +16 -> 164
    //   151: aload_0
    //   152: getfield 39	com/tencent/d/e/a/a/g:AtK	Ljava/util/HashSet;
    //   155: aload 4
    //   157: invokevirtual 178	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   160: pop
    //   161: iconst_1
    //   162: istore 10
    //   164: iinc 8 1
    //   167: iload 10
    //   169: istore_3
    //   170: goto -72 -> 98
    //   173: aload 4
    //   175: getfield 127	com/tencent/d/e/a/a/g$a:AtO	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   178: iconst_1
    //   179: invokevirtual 136	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   182: aload 4
    //   184: invokestatic 142	java/lang/System:currentTimeMillis	()J
    //   187: putfield 146	com/tencent/d/e/a/a/g$a:AtD	J
    //   190: aload 4
    //   192: lload_1
    //   193: l2d
    //   194: getstatic 181	com/tencent/d/e/a/a/f:AtH	J
    //   197: l2d
    //   198: ddiv
    //   199: invokestatic 187	java/lang/Math:ceil	(D)D
    //   202: d2i
    //   203: putfield 190	com/tencent/d/e/a/a/g$a:AtP	I
    //   206: aload 5
    //   208: monitorexit
    //   209: goto -154 -> 55
    //   212: astore 4
    //   214: aload 5
    //   216: monitorexit
    //   217: ldc 166
    //   219: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: aload 4
    //   224: athrow
    //   225: astore 5
    //   227: aload_0
    //   228: monitorexit
    //   229: aload 5
    //   231: athrow
    //   232: astore 5
    //   234: aload 4
    //   236: monitorexit
    //   237: ldc 166
    //   239: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: aload 5
    //   244: athrow
    //   245: aload 5
    //   247: monitorexit
    //   248: iload_3
    //   249: ifne +7 -> 256
    //   252: aload_0
    //   253: invokevirtual 192	com/tencent/d/e/a/a/g:dQv	()V
    //   256: ldc 166
    //   258: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: goto -240 -> 21
    //   264: astore 4
    //   266: aload 5
    //   268: monitorexit
    //   269: ldc 166
    //   271: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   274: aload 4
    //   276: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   41	55	212	finally
    //   173	209	212	finally
    //   214	217	212	finally
    //   2	19	225	finally
    //   25	41	225	finally
    //   55	64	225	finally
    //   74	83	225	finally
    //   217	225	225	finally
    //   237	245	225	finally
    //   252	256	225	finally
    //   256	261	225	finally
    //   269	277	225	finally
    //   64	74	232	finally
    //   234	237	232	finally
    //   83	93	264	finally
    //   112	123	264	finally
    //   134	161	264	finally
    //   245	248	264	finally
    //   266	269	264	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.g
 * JD-Core Version:    0.6.2
 */
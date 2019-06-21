package com.tencent.mm.compatible.e;

import android.hardware.Camera;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class u
{
  private static final Object etw;

  static
  {
    AppMethodBeat.i(93013);
    etw = new Object();
    AppMethodBeat.o(93013);
  }

  // ERROR //
  private static void a(Camera paramCamera)
  {
    // Byte code:
    //   0: ldc 35
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 37
    //   7: ldc 39
    //   9: invokevirtual 45	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   12: astore_1
    //   13: aload_1
    //   14: iconst_1
    //   15: invokevirtual 51	java/lang/reflect/Field:setAccessible	(Z)V
    //   18: aconst_null
    //   19: astore_2
    //   20: ldc 37
    //   22: invokevirtual 55	java/lang/Class:getDeclaredClasses	()[Ljava/lang/Class;
    //   25: astore_3
    //   26: aload_3
    //   27: arraylength
    //   28: istore 4
    //   30: iconst_0
    //   31: istore 5
    //   33: aload_2
    //   34: astore 6
    //   36: iload 5
    //   38: iload 4
    //   40: if_icmpge +37 -> 77
    //   43: aload_3
    //   44: iload 5
    //   46: aaload
    //   47: astore 6
    //   49: aload 6
    //   51: invokevirtual 59	java/lang/Class:getName	()Ljava/lang/String;
    //   54: ldc 61
    //   56: invokevirtual 67	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   59: ifeq +55 -> 114
    //   62: aload 6
    //   64: invokevirtual 71	java/lang/Class:getConstructors	()[Ljava/lang/reflect/Constructor;
    //   67: iconst_0
    //   68: aaload
    //   69: astore 6
    //   71: aload 6
    //   73: iconst_1
    //   74: invokevirtual 74	java/lang/reflect/Constructor:setAccessible	(Z)V
    //   77: aload_1
    //   78: aload_0
    //   79: aload 6
    //   81: iconst_3
    //   82: anewarray 4	java/lang/Object
    //   85: dup
    //   86: iconst_0
    //   87: aload_0
    //   88: aastore
    //   89: dup
    //   90: iconst_1
    //   91: aload_0
    //   92: aastore
    //   93: dup
    //   94: iconst_2
    //   95: invokestatic 80	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   98: aastore
    //   99: invokevirtual 84	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   102: checkcast 86	android/os/Handler
    //   105: invokevirtual 90	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   108: ldc 35
    //   110: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: return
    //   114: iinc 5 1
    //   117: goto -84 -> 33
    //   120: astore_0
    //   121: ldc 92
    //   123: ldc 94
    //   125: iconst_1
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload_0
    //   132: aastore
    //   133: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: getstatic 106	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   139: ldc2_w 107
    //   142: ldc2_w 109
    //   145: lconst_1
    //   146: iconst_0
    //   147: invokevirtual 113	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   150: ldc 35
    //   152: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -42 -> 113
    //   158: astore_0
    //   159: ldc 92
    //   161: ldc 94
    //   163: iconst_1
    //   164: anewarray 4	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: aload_0
    //   170: aastore
    //   171: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: getstatic 106	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   177: ldc2_w 107
    //   180: ldc2_w 109
    //   183: lconst_1
    //   184: iconst_0
    //   185: invokevirtual 113	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   188: ldc 35
    //   190: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   193: goto -80 -> 113
    //   196: astore_0
    //   197: ldc 92
    //   199: ldc 94
    //   201: iconst_1
    //   202: anewarray 4	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload_0
    //   208: aastore
    //   209: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: ldc 35
    //   214: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: goto -104 -> 113
    //   220: astore_0
    //   221: ldc 92
    //   223: ldc 94
    //   225: iconst_1
    //   226: anewarray 4	java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: aload_0
    //   232: aastore
    //   233: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: ldc 35
    //   238: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   241: goto -128 -> 113
    //   244: astore 6
    //   246: aconst_null
    //   247: astore_0
    //   248: aload_0
    //   249: ifnull +17 -> 266
    //   252: getstatic 106	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   255: ldc2_w 107
    //   258: ldc2_w 109
    //   261: lconst_1
    //   262: iconst_0
    //   263: invokevirtual 113	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   266: ldc 35
    //   268: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: aload 6
    //   273: athrow
    //   274: astore 6
    //   276: goto -28 -> 248
    //   279: astore 6
    //   281: goto -33 -> 248
    //
    // Exception table:
    //   from	to	target	type
    //   5	18	120	java/lang/NoSuchFieldException
    //   20	30	120	java/lang/NoSuchFieldException
    //   49	77	120	java/lang/NoSuchFieldException
    //   77	108	120	java/lang/NoSuchFieldException
    //   5	18	158	java/lang/IllegalAccessException
    //   20	30	158	java/lang/IllegalAccessException
    //   49	77	158	java/lang/IllegalAccessException
    //   77	108	158	java/lang/IllegalAccessException
    //   5	18	196	java/lang/reflect/InvocationTargetException
    //   20	30	196	java/lang/reflect/InvocationTargetException
    //   49	77	196	java/lang/reflect/InvocationTargetException
    //   77	108	196	java/lang/reflect/InvocationTargetException
    //   5	18	220	java/lang/InstantiationException
    //   20	30	220	java/lang/InstantiationException
    //   49	77	220	java/lang/InstantiationException
    //   77	108	220	java/lang/InstantiationException
    //   5	18	244	finally
    //   20	30	244	finally
    //   49	77	244	finally
    //   77	108	244	finally
    //   197	212	244	finally
    //   221	236	244	finally
    //   121	136	274	finally
    //   159	174	279	finally
  }

  public static t b(int paramInt, Looper arg1)
  {
    AppMethodBeat.i(93010);
    if (com.tencent.mm.compatible.util.d.iW(28));
    while (true)
    {
      try
      {
        localObject1 = new com/tencent/mm/compatible/e/t;
        ((t)localObject1).<init>(c(paramInt, ???));
        AppMethodBeat.o(93010);
        ??? = (Looper)localObject1;
        return ???;
      }
      catch (Exception )
      {
        Object localObject1;
        ab.printErrStackTrace("MicroMsg.MMCamera", ???, "opnImpl error, try camera directly, myLooper: %s", new Object[] { Looper.myLooper() });
        if (Looper.myLooper() == null)
        {
          localObject1 = new Camera[1];
          localObject1[0] = null;
          com.tencent.mm.sdk.g.d.h(new u.1((Camera[])localObject1, paramInt), "MMCamera_openLooperNull").start();
          synchronized (etw)
          {
            try
            {
              etw.wait();
              ab.i("MicroMsg.MMCamera", "openCamera wait finish");
              ??? = new t(localObject1[0]);
              AppMethodBeat.o(93010);
            }
            catch (Exception localException)
            {
              ab.printErrStackTrace("MicroMsg.MMCamera", localException, "MMCamera_openLooperNull wait error", new Object[0]);
              continue;
            }
          }
        }
        ??? = new t(Camera.open(paramInt));
        AppMethodBeat.o(93010);
        continue;
      }
      ??? = new t(c(paramInt, ???));
      AppMethodBeat.o(93010);
    }
  }

  private static Camera c(int paramInt, Looper paramLooper)
  {
    AppMethodBeat.i(93011);
    Camera localCamera = Camera.open(paramInt);
    if (paramLooper == null)
      AppMethodBeat.o(93011);
    while (true)
    {
      return localCamera;
      a(localCamera);
      AppMethodBeat.o(93011);
    }
  }

  public static t c(Looper paramLooper)
  {
    AppMethodBeat.i(93009);
    Camera localCamera = Camera.open();
    if (paramLooper == null)
    {
      paramLooper = new t(localCamera);
      AppMethodBeat.o(93009);
    }
    while (true)
    {
      return paramLooper;
      a(localCamera);
      paramLooper = new t(localCamera);
      AppMethodBeat.o(93009);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.u
 * JD-Core Version:    0.6.2
 */
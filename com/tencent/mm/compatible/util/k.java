package com.tencent.mm.compatible.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;

public final class k
{
  private static final HashMap<String, WeakReference<ClassLoader>> mLoadedLibs;

  static
  {
    AppMethodBeat.i(93104);
    mLoadedLibs = new HashMap();
    AppMethodBeat.o(93104);
  }

  // ERROR //
  public static void a(String paramString, ClassLoader paramClassLoader)
  {
    // Byte code:
    //   0: ldc 33
    //   2: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   9: ifne +7 -> 16
    //   12: aload_1
    //   13: ifnonnull +105 -> 118
    //   16: iconst_1
    //   17: istore_2
    //   18: ldc 41
    //   20: iload_2
    //   21: invokestatic 47	junit/framework/Assert:assertFalse	(Ljava/lang/String;Z)V
    //   24: getstatic 23	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   27: astore_3
    //   28: aload_3
    //   29: monitorenter
    //   30: new 49	java/lang/StringBuilder
    //   33: astore 4
    //   35: aload 4
    //   37: ldc 51
    //   39: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: ldc 56
    //   44: aload 4
    //   46: aload_0
    //   47: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc 62
    //   52: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: aload_1
    //   56: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: getstatic 23	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   68: aload_0
    //   69: invokevirtual 78	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   72: checkcast 80	java/lang/ref/WeakReference
    //   75: astore 4
    //   77: aload 4
    //   79: ifnull +200 -> 279
    //   82: aload 4
    //   84: invokevirtual 83	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   87: checkcast 85	java/lang/ClassLoader
    //   90: astore 4
    //   92: aload 4
    //   94: ifnull +80 -> 174
    //   97: aload 4
    //   99: aload_1
    //   100: if_acmpne +23 -> 123
    //   103: ldc 56
    //   105: ldc 87
    //   107: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: aload_3
    //   111: monitorexit
    //   112: ldc 33
    //   114: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: return
    //   118: iconst_0
    //   119: istore_2
    //   120: goto -102 -> 18
    //   123: new 89	java/lang/UnsatisfiedLinkError
    //   126: astore 4
    //   128: new 49	java/lang/StringBuilder
    //   131: astore_1
    //   132: aload_1
    //   133: ldc 91
    //   135: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   138: aload 4
    //   140: aload_1
    //   141: aload_0
    //   142: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc 93
    //   147: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokespecial 94	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   156: ldc 33
    //   158: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload 4
    //   163: athrow
    //   164: astore_0
    //   165: aload_3
    //   166: monitorexit
    //   167: ldc 33
    //   169: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: aload_0
    //   173: athrow
    //   174: aload_3
    //   175: monitorexit
    //   176: ldc 56
    //   178: ldc 96
    //   180: aload_0
    //   181: invokestatic 102	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   184: invokevirtual 106	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   187: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: aload_0
    //   191: invokestatic 111	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   194: getstatic 23	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   197: astore 4
    //   199: aload 4
    //   201: monitorenter
    //   202: getstatic 23	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   205: astore_3
    //   206: new 80	java/lang/ref/WeakReference
    //   209: astore 5
    //   211: aload 5
    //   213: aload_1
    //   214: invokespecial 114	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   217: aload_3
    //   218: aload_0
    //   219: aload 5
    //   221: invokevirtual 118	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   224: pop
    //   225: aload 4
    //   227: monitorexit
    //   228: ldc 33
    //   230: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   233: goto -116 -> 117
    //   236: astore_1
    //   237: new 89	java/lang/UnsatisfiedLinkError
    //   240: dup
    //   241: ldc 120
    //   243: aload_0
    //   244: invokestatic 102	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   247: invokevirtual 106	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   250: invokespecial 94	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   253: aload_1
    //   254: invokevirtual 124	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   257: checkcast 89	java/lang/UnsatisfiedLinkError
    //   260: astore_0
    //   261: ldc 33
    //   263: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_0
    //   267: athrow
    //   268: astore_1
    //   269: aload 4
    //   271: monitorexit
    //   272: ldc 33
    //   274: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   277: aload_1
    //   278: athrow
    //   279: aconst_null
    //   280: astore 4
    //   282: goto -190 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   30	77	164	finally
    //   82	92	164	finally
    //   103	112	164	finally
    //   123	164	164	finally
    //   165	167	164	finally
    //   174	176	164	finally
    //   190	202	236	java/lang/Exception
    //   228	233	236	java/lang/Exception
    //   272	279	236	java/lang/Exception
    //   202	228	268	finally
    //   269	272	268	finally
  }

  public static boolean kx(String paramString)
  {
    AppMethodBeat.i(93101);
    synchronized (mLoadedLibs)
    {
      boolean bool = mLoadedLibs.containsKey(paramString);
      AppMethodBeat.o(93101);
      return bool;
    }
  }

  public static String ky(String paramString)
  {
    AppMethodBeat.i(93102);
    try
    {
      ClassLoader localClassLoader = k.class.getClassLoader();
      Method localMethod = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[] { String.class });
      localMethod.setAccessible(true);
      paramString = (String)localMethod.invoke(localClassLoader, new Object[] { paramString });
      AppMethodBeat.o(93102);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.k
 * JD-Core Version:    0.6.2
 */
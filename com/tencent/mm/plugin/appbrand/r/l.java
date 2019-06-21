package com.tencent.mm.plugin.appbrand.r;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l
{
  public static Object a(Class<?> paramClass, String paramString, Object paramObject, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(91170);
    paramClass = a(paramClass, paramString, paramObject, paramArrayOfClass, paramArrayOfObject, null);
    AppMethodBeat.o(91170);
    return paramClass;
  }

  // ERROR //
  public static <T> T a(Class<?> paramClass, String paramString, Object paramObject, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject, T paramT)
  {
    // Byte code:
    //   0: ldc 25
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_2
    //   6: ifnonnull +20 -> 26
    //   9: new 27	java/lang/IllegalArgumentException
    //   12: dup
    //   13: ldc 29
    //   15: invokespecial 33	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   18: astore_0
    //   19: ldc 25
    //   21: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: aload_0
    //   25: athrow
    //   26: aconst_null
    //   27: astore 6
    //   29: aload_2
    //   30: invokevirtual 37	java/lang/Object:getClass	()Ljava/lang/Class;
    //   33: astore 7
    //   35: aload 7
    //   37: ifnull +75 -> 112
    //   40: aload 7
    //   42: aload_1
    //   43: aload_3
    //   44: invokevirtual 43	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   47: astore 8
    //   49: aload 8
    //   51: astore 6
    //   53: aload 7
    //   55: invokevirtual 46	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   58: astore 7
    //   60: goto -25 -> 35
    //   63: astore 8
    //   65: aload 6
    //   67: astore 8
    //   69: aload_0
    //   70: aload 7
    //   72: if_acmpne +12 -> 84
    //   75: aload 7
    //   77: aload_1
    //   78: aload_3
    //   79: invokevirtual 43	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   82: astore 8
    //   84: aload 7
    //   86: invokevirtual 46	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   89: astore 7
    //   91: aload 8
    //   93: astore 6
    //   95: goto -60 -> 35
    //   98: astore_0
    //   99: aload 7
    //   101: invokevirtual 46	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   104: pop
    //   105: ldc 25
    //   107: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: aload_0
    //   111: athrow
    //   112: aload 6
    //   114: ifnonnull +13 -> 127
    //   117: ldc 25
    //   119: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload 5
    //   124: astore_0
    //   125: aload_0
    //   126: areturn
    //   127: aload 6
    //   129: iconst_1
    //   130: invokevirtual 52	java/lang/reflect/Method:setAccessible	(Z)V
    //   133: aload 6
    //   135: aload_2
    //   136: aload 4
    //   138: invokevirtual 56	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   141: astore_0
    //   142: ldc 25
    //   144: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: goto -22 -> 125
    //   150: astore_0
    //   151: ldc 58
    //   153: aload_0
    //   154: ldc 60
    //   156: iconst_0
    //   157: anewarray 4	java/lang/Object
    //   160: invokestatic 66	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: ldc 25
    //   165: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: aload 5
    //   170: astore_0
    //   171: goto -46 -> 125
    //   174: astore 8
    //   176: aload 6
    //   178: astore 8
    //   180: goto -96 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   40	49	63	java/lang/Exception
    //   40	49	98	finally
    //   75	84	98	finally
    //   127	142	150	java/lang/Exception
    //   75	84	174	java/lang/Exception
  }

  public static <T> T a(String paramString, Object paramObject, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(91172);
    paramString = a(null, paramString, paramObject, paramArrayOfClass, paramArrayOfObject, null);
    AppMethodBeat.o(91172);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.l
 * JD-Core Version:    0.6.2
 */
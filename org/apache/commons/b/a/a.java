package org.apache.commons.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.b.f;

public final class a
{
  private static final Object BYs = new Object();
  private static String[] BYt = { "getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable" };
  private static final Method BYu;
  private static final Method BYv;
  static Class BYw;

  static
  {
    Object localObject1 = null;
    AppMethodBeat.i(116943);
    try
    {
      if (BYw == null)
      {
        localObject2 = awQ("java.lang.Throwable");
        BYw = (Class)localObject2;
        localObject2 = ((Class)localObject2).getMethod("getCause", null);
        label115: BYu = (Method)localObject2;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        Object localObject2;
        label135: Class localClass2;
        if (BYw == null)
        {
          localObject2 = awQ("java.lang.Throwable");
          BYw = (Class)localObject2;
          if (BYw != null)
            break label196;
          localClass2 = awQ("java.lang.Throwable");
          BYw = localClass2;
        }
        while (true)
        {
          localObject2 = ((Class)localObject2).getMethod("initCause", new Class[] { localClass2 });
          BYv = (Method)localObject2;
          AppMethodBeat.o(116943);
          return;
          localObject2 = BYw;
          break;
          localException1 = localException1;
          Class localClass1 = null;
          break label115;
          localClass1 = BYw;
          break label135;
          label196: localClass2 = BYw;
        }
      }
      catch (Exception localException2)
      {
        while (true)
          Object localObject3 = localObject1;
      }
    }
  }

  public static Throwable C(Throwable paramThrowable)
  {
    AppMethodBeat.i(116936);
    synchronized (BYs)
    {
      paramThrowable = a(paramThrowable, BYt);
      AppMethodBeat.o(116936);
      return paramThrowable;
    }
  }

  private static Throwable a(Throwable paramThrowable, String[] arg1)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(116937);
    if (paramThrowable == null)
      AppMethodBeat.o(116937);
    while (true)
    {
      return localObject2;
      if ((paramThrowable instanceof b))
        localObject1 = ((b)paramThrowable).getCause();
      while (true)
      {
        localObject2 = localObject1;
        if (localObject1 != null)
          break label159;
        localObject2 = ???;
        if (??? == null);
        synchronized (BYs)
        {
          localObject2 = BYt;
          for (int i = 0; ; i++)
          {
            ??? = (String[])localObject1;
            if (i >= localObject2.length)
              break;
            ??? = localObject2[i];
            if (??? != null)
            {
              localObject1 = d(paramThrowable, ???);
              ??? = (String[])localObject1;
              if (localObject1 != null)
                break;
            }
          }
          if ((paramThrowable instanceof SQLException))
            localObject1 = ((SQLException)paramThrowable).getNextException();
          else if ((paramThrowable instanceof InvocationTargetException))
            localObject1 = ((InvocationTargetException)paramThrowable).getTargetException();
        }
      }
      localObject2 = ???;
      if (??? == null)
        localObject2 = e(paramThrowable, "detail");
      label159: AppMethodBeat.o(116937);
    }
  }

  static String[] awP(String paramString)
  {
    AppMethodBeat.i(116941);
    paramString = new StringTokenizer(paramString, f.LINE_SEPARATOR);
    ArrayList localArrayList = new ArrayList();
    while (paramString.hasMoreTokens())
      localArrayList.add(paramString.nextToken());
    paramString = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    AppMethodBeat.o(116941);
    return paramString;
  }

  private static Class awQ(String paramString)
  {
    AppMethodBeat.i(116942);
    try
    {
      paramString = Class.forName(paramString);
      AppMethodBeat.o(116942);
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      paramString = new NoClassDefFoundError(paramString.getMessage());
      AppMethodBeat.o(116942);
    }
    throw paramString;
  }

  // ERROR //
  private static Throwable d(Throwable paramThrowable, String paramString)
  {
    // Byte code:
    //   0: ldc 175
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 179	java/lang/Object:getClass	()Ljava/lang/Class;
    //   9: aload_1
    //   10: aconst_null
    //   11: invokevirtual 71	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnull +69 -> 85
    //   19: getstatic 59	org/apache/commons/b/a/a:BYw	Ljava/lang/Class;
    //   22: ifnonnull +55 -> 77
    //   25: ldc 61
    //   27: invokestatic 65	org/apache/commons/b/a/a:awQ	(Ljava/lang/String;)Ljava/lang/Class;
    //   30: astore_2
    //   31: aload_2
    //   32: putstatic 59	org/apache/commons/b/a/a:BYw	Ljava/lang/Class;
    //   35: aload_2
    //   36: aload_1
    //   37: invokevirtual 184	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
    //   40: invokevirtual 188	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   43: ifeq +42 -> 85
    //   46: aload_1
    //   47: aload_0
    //   48: getstatic 194	org/apache/commons/b/a:BWE	[Ljava/lang/Object;
    //   51: invokevirtual 198	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast 200	java/lang/Throwable
    //   57: astore_0
    //   58: ldc 175
    //   60: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: aload_0
    //   64: areturn
    //   65: astore_1
    //   66: aconst_null
    //   67: astore_1
    //   68: goto -53 -> 15
    //   71: astore_1
    //   72: aconst_null
    //   73: astore_1
    //   74: goto -59 -> 15
    //   77: getstatic 59	org/apache/commons/b/a/a:BYw	Ljava/lang/Class;
    //   80: astore_2
    //   81: goto -46 -> 35
    //   84: astore_0
    //   85: ldc 175
    //   87: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: aconst_null
    //   91: astore_0
    //   92: goto -29 -> 63
    //   95: astore_0
    //   96: goto -11 -> 85
    //   99: astore_0
    //   100: goto -15 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   5	15	65	java/lang/NoSuchMethodException
    //   5	15	71	java/lang/SecurityException
    //   46	58	84	java/lang/reflect/InvocationTargetException
    //   46	58	95	java/lang/IllegalArgumentException
    //   46	58	99	java/lang/IllegalAccessException
  }

  // ERROR //
  private static Throwable e(Throwable paramThrowable, String paramString)
  {
    // Byte code:
    //   0: ldc 203
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 179	java/lang/Object:getClass	()Ljava/lang/Class;
    //   9: aload_1
    //   10: invokevirtual 207	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull +66 -> 81
    //   18: getstatic 59	org/apache/commons/b/a/a:BYw	Ljava/lang/Class;
    //   21: ifnonnull +52 -> 73
    //   24: ldc 61
    //   26: invokestatic 65	org/apache/commons/b/a/a:awQ	(Ljava/lang/String;)Ljava/lang/Class;
    //   29: astore_2
    //   30: aload_2
    //   31: putstatic 59	org/apache/commons/b/a/a:BYw	Ljava/lang/Class;
    //   34: aload_2
    //   35: aload_1
    //   36: invokevirtual 212	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   39: invokevirtual 188	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   42: ifeq +39 -> 81
    //   45: aload_1
    //   46: aload_0
    //   47: invokevirtual 216	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   50: checkcast 200	java/lang/Throwable
    //   53: astore_0
    //   54: ldc 203
    //   56: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: aload_0
    //   60: areturn
    //   61: astore_1
    //   62: aconst_null
    //   63: astore_1
    //   64: goto -50 -> 14
    //   67: astore_1
    //   68: aconst_null
    //   69: astore_1
    //   70: goto -56 -> 14
    //   73: getstatic 59	org/apache/commons/b/a/a:BYw	Ljava/lang/Class;
    //   76: astore_2
    //   77: goto -43 -> 34
    //   80: astore_0
    //   81: ldc 203
    //   83: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: aconst_null
    //   87: astore_0
    //   88: goto -29 -> 59
    //   91: astore_0
    //   92: goto -11 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   5	14	61	java/lang/NoSuchFieldException
    //   5	14	67	java/lang/SecurityException
    //   45	54	80	java/lang/IllegalArgumentException
    //   45	54	91	java/lang/IllegalAccessException
  }

  public static boolean emS()
  {
    if (BYu != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void v(List paramList1, List paramList2)
  {
    AppMethodBeat.i(116940);
    int i = paramList1.size();
    int j = paramList2.size() - 1;
    i--;
    while ((i >= 0) && (j >= 0))
    {
      if (((String)paramList1.get(i)).equals((String)paramList2.get(j)))
        paramList1.remove(i);
      j--;
      i--;
    }
    AppMethodBeat.o(116940);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.a.a
 * JD-Core Version:    0.6.2
 */
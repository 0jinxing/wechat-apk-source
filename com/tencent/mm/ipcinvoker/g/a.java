package com.tencent.mm.ipcinvoker.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public final class a<FieldType>
{
  private Class<?> eGE;
  private String eGF;
  private Field mField;
  private boolean mInited;

  public a(Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(114116);
    if (paramString.length() == 0)
    {
      paramClass = new IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
      AppMethodBeat.o(114116);
      throw paramClass;
    }
    this.eGE = paramClass;
    this.eGF = paramString;
    AppMethodBeat.o(114116);
  }

  // ERROR //
  private FieldType PU()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 54
    //   6: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokespecial 57	com/tencent/mm/ipcinvoker/g/a:prepare	()V
    //   13: aload_0
    //   14: getfield 59	com/tencent/mm/ipcinvoker/g/a:mField	Ljava/lang/reflect/Field;
    //   17: ifnonnull +30 -> 47
    //   20: ldc 61
    //   22: ldc 63
    //   24: iconst_1
    //   25: anewarray 5	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: getfield 46	com/tencent/mm/ipcinvoker/g/a:eGF	Ljava/lang/String;
    //   34: aastore
    //   35: invokestatic 69	com/tencent/mm/ipcinvoker/h/b:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: ldc 54
    //   40: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: areturn
    //   47: aload_0
    //   48: getfield 59	com/tencent/mm/ipcinvoker/g/a:mField	Ljava/lang/reflect/Field;
    //   51: aconst_null
    //   52: invokevirtual 75	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   55: astore_1
    //   56: ldc 54
    //   58: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: goto -18 -> 43
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: astore_1
    //   70: new 34	java/lang/IllegalArgumentException
    //   73: astore_1
    //   74: aload_1
    //   75: ldc 77
    //   77: invokespecial 39	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   80: ldc 54
    //   82: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: aload_1
    //   86: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   4	43	64	finally
    //   47	56	64	finally
    //   56	61	64	finally
    //   70	87	64	finally
    //   47	56	69	java/lang/ClassCastException
  }

  // ERROR //
  private void prepare()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 81
    //   4: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 83	com/tencent/mm/ipcinvoker/g/a:mInited	Z
    //   11: ifeq +11 -> 22
    //   14: ldc 81
    //   16: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 44	com/tencent/mm/ipcinvoker/g/a:eGE	Ljava/lang/Class;
    //   26: astore_1
    //   27: aload_1
    //   28: ifnull +22 -> 50
    //   31: aload_1
    //   32: aload_0
    //   33: getfield 46	com/tencent/mm/ipcinvoker/g/a:eGF	Ljava/lang/String;
    //   36: invokevirtual 89	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   39: astore_2
    //   40: aload_2
    //   41: iconst_1
    //   42: invokevirtual 93	java/lang/reflect/Field:setAccessible	(Z)V
    //   45: aload_0
    //   46: aload_2
    //   47: putfield 59	com/tencent/mm/ipcinvoker/g/a:mField	Ljava/lang/reflect/Field;
    //   50: aload_0
    //   51: iconst_1
    //   52: putfield 83	com/tencent/mm/ipcinvoker/g/a:mInited	Z
    //   55: ldc 81
    //   57: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: goto -41 -> 19
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_2
    //   69: aload_1
    //   70: invokevirtual 97	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   73: astore_1
    //   74: goto -47 -> 27
    //
    // Exception table:
    //   from	to	target	type
    //   2	19	63	finally
    //   22	27	63	finally
    //   31	50	63	finally
    //   50	60	63	finally
    //   69	74	63	finally
    //   31	50	68	java/lang/Exception
  }

  // ERROR //
  public final FieldType PV()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 103
    //   4: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: invokespecial 105	com/tencent/mm/ipcinvoker/g/a:PU	()Ljava/lang/Object;
    //   13: astore_2
    //   14: aload_2
    //   15: astore_1
    //   16: ldc 103
    //   18: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: areturn
    //   25: astore_2
    //   26: ldc 61
    //   28: ldc 107
    //   30: iconst_1
    //   31: anewarray 5	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_2
    //   37: aastore
    //   38: invokestatic 109	com/tencent/mm/ipcinvoker/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: goto -25 -> 16
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    //   49: astore_2
    //   50: ldc 61
    //   52: ldc 107
    //   54: iconst_1
    //   55: anewarray 5	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_2
    //   61: aastore
    //   62: invokestatic 109	com/tencent/mm/ipcinvoker/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: goto -49 -> 16
    //   68: astore_2
    //   69: ldc 61
    //   71: ldc 107
    //   73: iconst_1
    //   74: anewarray 5	java/lang/Object
    //   77: dup
    //   78: iconst_0
    //   79: aload_2
    //   80: aastore
    //   81: invokestatic 109	com/tencent/mm/ipcinvoker/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: goto -68 -> 16
    //
    // Exception table:
    //   from	to	target	type
    //   9	14	25	java/lang/NoSuchFieldException
    //   2	7	44	finally
    //   9	14	44	finally
    //   16	21	44	finally
    //   26	41	44	finally
    //   50	65	44	finally
    //   69	84	44	finally
    //   9	14	49	java/lang/IllegalAccessException
    //   9	14	68	java/lang/IllegalArgumentException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.g.a
 * JD-Core Version:    0.6.2
 */
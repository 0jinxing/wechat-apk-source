package com.tencent.mm.svg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public final class a<T>
{
  private String classname;
  public Field eum;
  private String fieldName;
  private boolean inited;
  public Object obj;

  public a(Object paramObject, String paramString)
  {
    AppMethodBeat.i(70119);
    if (paramObject == null)
    {
      paramObject = new IllegalArgumentException("obj cannot be null");
      AppMethodBeat.o(70119);
      throw paramObject;
    }
    this.obj = paramObject;
    this.fieldName = paramString;
    this.classname = null;
    AppMethodBeat.o(70119);
  }

  public final boolean Mg()
  {
    AppMethodBeat.i(70122);
    prepare();
    boolean bool;
    if (this.eum != null)
    {
      bool = true;
      AppMethodBeat.o(70122);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(70122);
    }
  }

  public final T get()
  {
    AppMethodBeat.i(70121);
    prepare();
    Object localObject;
    if (this.eum == null)
    {
      localObject = new NoSuchFieldException();
      AppMethodBeat.o(70121);
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = this.eum.get(this.obj);
      AppMethodBeat.o(70121);
      return localObject;
    }
    catch (ClassCastException localClassCastException)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("unable to cast object");
      AppMethodBeat.o(70121);
      throw localIllegalArgumentException;
    }
  }

  // ERROR //
  public final void prepare()
  {
    // Byte code:
    //   0: ldc 71
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 73	com/tencent/mm/svg/b/a:inited	Z
    //   9: ifeq +9 -> 18
    //   12: ldc 71
    //   14: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   17: return
    //   18: aload_0
    //   19: iconst_1
    //   20: putfield 73	com/tencent/mm/svg/b/a:inited	Z
    //   23: aload_0
    //   24: getfield 38	com/tencent/mm/svg/b/a:obj	Ljava/lang/Object;
    //   27: invokevirtual 77	java/lang/Object:getClass	()Ljava/lang/Class;
    //   30: astore_1
    //   31: aload_1
    //   32: ifnull +133 -> 165
    //   35: aload_1
    //   36: aload_0
    //   37: getfield 40	com/tencent/mm/svg/b/a:fieldName	Ljava/lang/String;
    //   40: invokevirtual 83	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   43: astore_2
    //   44: aload_2
    //   45: iconst_1
    //   46: invokevirtual 87	java/lang/reflect/Field:setAccessible	(Z)V
    //   49: aload_0
    //   50: aload_2
    //   51: putfield 51	com/tencent/mm/svg/b/a:eum	Ljava/lang/reflect/Field;
    //   54: aload_1
    //   55: invokevirtual 90	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   58: pop
    //   59: ldc 71
    //   61: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: goto -47 -> 17
    //   67: astore_2
    //   68: aload_0
    //   69: getfield 42	com/tencent/mm/svg/b/a:classname	Ljava/lang/String;
    //   72: ifnull +66 -> 138
    //   75: aload_0
    //   76: getfield 42	com/tencent/mm/svg/b/a:classname	Ljava/lang/String;
    //   79: ldc 92
    //   81: invokevirtual 98	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: ifne +54 -> 138
    //   87: aload_1
    //   88: invokevirtual 102	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   91: astore_3
    //   92: aload_3
    //   93: arraylength
    //   94: istore 4
    //   96: iconst_0
    //   97: istore 5
    //   99: iload 5
    //   101: iload 4
    //   103: if_icmpge +35 -> 138
    //   106: aload_3
    //   107: iload 5
    //   109: aaload
    //   110: astore_2
    //   111: aload_2
    //   112: invokevirtual 105	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   115: invokevirtual 109	java/lang/Class:getName	()Ljava/lang/String;
    //   118: aload_0
    //   119: getfield 42	com/tencent/mm/svg/b/a:classname	Ljava/lang/String;
    //   122: invokevirtual 98	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   125: ifeq +21 -> 146
    //   128: aload_2
    //   129: iconst_1
    //   130: invokevirtual 87	java/lang/reflect/Field:setAccessible	(Z)V
    //   133: aload_0
    //   134: aload_2
    //   135: putfield 51	com/tencent/mm/svg/b/a:eum	Ljava/lang/reflect/Field;
    //   138: aload_1
    //   139: invokevirtual 90	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   142: astore_1
    //   143: goto -112 -> 31
    //   146: iinc 5 1
    //   149: goto -50 -> 99
    //   152: astore_2
    //   153: aload_1
    //   154: invokevirtual 90	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   157: pop
    //   158: ldc 71
    //   160: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: aload_2
    //   164: athrow
    //   165: ldc 71
    //   167: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   170: goto -153 -> 17
    //   173: astore_2
    //   174: goto -36 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   35	54	67	java/lang/Exception
    //   35	54	152	finally
    //   68	96	152	finally
    //   111	138	152	finally
    //   68	96	173	java/lang/Exception
    //   111	138	173	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.b.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.compatible.loader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public final class c<T>
{
  private String classname;
  private Field eum;
  private String fieldName;
  private boolean inited;
  private Object obj;

  public c(Object paramObject, String paramString1, String paramString2)
  {
    AppMethodBeat.i(51926);
    if (paramObject == null)
    {
      paramObject = new IllegalArgumentException("obj cannot be null");
      AppMethodBeat.o(51926);
      throw paramObject;
    }
    this.obj = paramObject;
    this.fieldName = paramString1;
    this.classname = paramString2;
    AppMethodBeat.o(51926);
  }

  // ERROR //
  private void prepare()
  {
    // Byte code:
    //   0: ldc 47
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 49	com/tencent/mm/compatible/loader/c:inited	Z
    //   9: ifeq +9 -> 18
    //   12: ldc 47
    //   14: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   17: return
    //   18: aload_0
    //   19: iconst_1
    //   20: putfield 49	com/tencent/mm/compatible/loader/c:inited	Z
    //   23: aload_0
    //   24: getfield 38	com/tencent/mm/compatible/loader/c:obj	Ljava/lang/Object;
    //   27: invokevirtual 53	java/lang/Object:getClass	()Ljava/lang/Class;
    //   30: astore_1
    //   31: aload_1
    //   32: ifnull +135 -> 167
    //   35: aload_1
    //   36: aload_0
    //   37: getfield 40	com/tencent/mm/compatible/loader/c:fieldName	Ljava/lang/String;
    //   40: invokevirtual 59	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   43: astore_2
    //   44: aload_2
    //   45: iconst_1
    //   46: invokevirtual 65	java/lang/reflect/Field:setAccessible	(Z)V
    //   49: aload_0
    //   50: aload_2
    //   51: putfield 67	com/tencent/mm/compatible/loader/c:eum	Ljava/lang/reflect/Field;
    //   54: aload_1
    //   55: invokevirtual 70	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   58: pop
    //   59: ldc 47
    //   61: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: goto -47 -> 17
    //   67: astore_2
    //   68: aload_0
    //   69: getfield 42	com/tencent/mm/compatible/loader/c:classname	Ljava/lang/String;
    //   72: ifnull +68 -> 140
    //   75: aload_0
    //   76: getfield 42	com/tencent/mm/compatible/loader/c:classname	Ljava/lang/String;
    //   79: ldc 72
    //   81: invokevirtual 78	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: ifne +56 -> 140
    //   87: aload_1
    //   88: invokevirtual 82	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   91: astore_2
    //   92: aload_2
    //   93: arraylength
    //   94: istore_3
    //   95: iconst_0
    //   96: istore 4
    //   98: iload 4
    //   100: iload_3
    //   101: if_icmpge +39 -> 140
    //   104: aload_2
    //   105: iload 4
    //   107: aaload
    //   108: astore 5
    //   110: aload 5
    //   112: invokevirtual 85	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   115: invokevirtual 89	java/lang/Class:getName	()Ljava/lang/String;
    //   118: aload_0
    //   119: getfield 42	com/tencent/mm/compatible/loader/c:classname	Ljava/lang/String;
    //   122: invokevirtual 78	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   125: ifeq +23 -> 148
    //   128: aload 5
    //   130: iconst_1
    //   131: invokevirtual 65	java/lang/reflect/Field:setAccessible	(Z)V
    //   134: aload_0
    //   135: aload 5
    //   137: putfield 67	com/tencent/mm/compatible/loader/c:eum	Ljava/lang/reflect/Field;
    //   140: aload_1
    //   141: invokevirtual 70	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   144: astore_1
    //   145: goto -114 -> 31
    //   148: iinc 4 1
    //   151: goto -53 -> 98
    //   154: astore_2
    //   155: aload_1
    //   156: invokevirtual 70	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   159: pop
    //   160: ldc 47
    //   162: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: aload_2
    //   166: athrow
    //   167: ldc 47
    //   169: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: goto -155 -> 17
    //   175: astore_2
    //   176: goto -36 -> 140
    //
    // Exception table:
    //   from	to	target	type
    //   35	54	67	java/lang/Exception
    //   35	54	154	finally
    //   68	95	154	finally
    //   110	140	154	finally
    //   68	95	175	java/lang/Exception
    //   110	140	175	java/lang/Exception
  }

  public final boolean Mg()
  {
    AppMethodBeat.i(51930);
    prepare();
    boolean bool;
    if (this.eum != null)
    {
      bool = true;
      AppMethodBeat.o(51930);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51930);
    }
  }

  public final T get()
  {
    AppMethodBeat.i(51928);
    prepare();
    Object localObject;
    if (this.eum == null)
    {
      localObject = new NoSuchFieldException();
      AppMethodBeat.o(51928);
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = this.eum.get(this.obj);
      AppMethodBeat.o(51928);
      return localObject;
    }
    catch (ClassCastException localClassCastException)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("unable to cast object");
      AppMethodBeat.o(51928);
      throw localIllegalArgumentException;
    }
  }

  public final void set(T paramT)
  {
    AppMethodBeat.i(51929);
    prepare();
    if (this.eum == null)
    {
      paramT = new NoSuchFieldException();
      AppMethodBeat.o(51929);
      throw paramT;
    }
    this.eum.set(this.obj, paramT);
    AppMethodBeat.o(51929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class f
{
  // ERROR //
  public static boolean bXm()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: sipush 7478
    //   5: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 19	java/lang/StringBuilder
    //   11: dup
    //   12: bipush 8
    //   14: invokespecial 21	java/lang/StringBuilder:<init>	(I)V
    //   17: astore_1
    //   18: iconst_0
    //   19: istore_2
    //   20: iload_2
    //   21: iconst_5
    //   22: if_icmpge +32 -> 54
    //   25: ldc2_w 22
    //   28: iconst_4
    //   29: iload_2
    //   30: isub
    //   31: bipush 8
    //   33: imul
    //   34: lshr
    //   35: ldc2_w 24
    //   38: land
    //   39: l2i
    //   40: i2c
    //   41: istore_3
    //   42: aload_1
    //   43: iload_3
    //   44: invokevirtual 29	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: iinc 2 1
    //   51: goto -31 -> 20
    //   54: aload_1
    //   55: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 4
    //   60: aload_1
    //   61: iconst_0
    //   62: aload_1
    //   63: invokevirtual 37	java/lang/StringBuilder:length	()I
    //   66: invokevirtual 41	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_1
    //   71: ldc 2
    //   73: invokevirtual 44	java/lang/Object:hashCode	()I
    //   76: bipush 31
    //   78: iushr
    //   79: iconst_1
    //   80: ior
    //   81: iconst_1
    //   82: ixor
    //   83: invokevirtual 47	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_1
    //   88: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: aload 4
    //   93: aload_1
    //   94: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 51	com/tencent/mm/plugin/webview/ui/tools/f:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokevirtual 57	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   103: ifne +11 -> 114
    //   106: sipush 7478
    //   109: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: iload_0
    //   113: ireturn
    //   114: sipush 7478
    //   117: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: iconst_0
    //   121: istore_0
    //   122: goto -10 -> 112
    //   125: astore 4
    //   127: aload_1
    //   128: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: astore 4
    //   133: aload_1
    //   134: iconst_0
    //   135: aload_1
    //   136: invokevirtual 37	java/lang/StringBuilder:length	()I
    //   139: invokevirtual 41	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_1
    //   144: ldc 2
    //   146: invokevirtual 44	java/lang/Object:hashCode	()I
    //   149: bipush 31
    //   151: iushr
    //   152: iconst_1
    //   153: ior
    //   154: iconst_1
    //   155: ixor
    //   156: invokevirtual 47	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_1
    //   161: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: aload 4
    //   166: aload_1
    //   167: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: invokestatic 51	com/tencent/mm/plugin/webview/ui/tools/f:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   173: invokevirtual 57	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   176: ifne +12 -> 188
    //   179: sipush 7478
    //   182: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: goto -73 -> 112
    //   188: sipush 7478
    //   191: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: iconst_0
    //   195: istore_0
    //   196: goto -84 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   42	48	125	finally
  }

  public static String cZD()
  {
    AppMethodBeat.i(7477);
    Object localObject1 = new StringBuilder(8);
    int i = 0;
    while (true)
    {
      char c;
      if (i < 3)
        c = (char)(int)(1045787241L >> (2 - i) * 8 & 0xFF);
      try
      {
        ((StringBuilder)localObject1).append(c);
        i++;
        continue;
        localObject1 = fv(((StringBuilder)localObject1).toString(), "");
        AppMethodBeat.o(7477);
        return localObject1;
      }
      finally
      {
        while (true)
        {
          localObject1 = fv(((StringBuilder)localObject1).toString(), "");
          AppMethodBeat.o(7477);
        }
      }
    }
  }

  private static String fv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7479);
    try
    {
      localObject = a.b.eGM;
      localObject = a.ll("100460");
      if ((localObject == null) || (!((c)localObject).isValid()))
      {
        ab.w("MicroMsg.WebViewHelper", "check point 1, explained by src code.");
        AppMethodBeat.o(7479);
        paramString1 = paramString2;
        return paramString1;
      }
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WebViewHelper", paramString1, "check point 1-1, explained by src code.", new Object[0]);
        AppMethodBeat.o(7479);
        paramString1 = paramString2;
        continue;
        Object localObject = ((c)localObject).dru();
        if (localObject == null)
        {
          ab.w("MicroMsg.WebViewHelper", "check point 2, explained by src code.");
          AppMethodBeat.o(7479);
          paramString1 = paramString2;
        }
        else
        {
          localObject = (String)((Map)localObject).get(paramString1);
          if (localObject != null)
          {
            ab.i("MicroMsg.WebViewHelper", "st, sk: %s, val:%s", new Object[] { paramString1, localObject });
            AppMethodBeat.o(7479);
            paramString1 = (String)localObject;
          }
          else
          {
            AppMethodBeat.o(7479);
            paramString1 = paramString2;
          }
        }
      }
    }
  }

  // ERROR //
  public static boolean isEnabled()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: sipush 7476
    //   5: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 19	java/lang/StringBuilder
    //   11: dup
    //   12: bipush 8
    //   14: invokespecial 21	java/lang/StringBuilder:<init>	(I)V
    //   17: astore_1
    //   18: iconst_0
    //   19: istore_2
    //   20: iload_2
    //   21: iconst_4
    //   22: if_icmpge +32 -> 54
    //   25: ldc2_w 121
    //   28: iconst_3
    //   29: iload_2
    //   30: isub
    //   31: bipush 8
    //   33: imul
    //   34: lshr
    //   35: ldc2_w 24
    //   38: land
    //   39: l2i
    //   40: i2c
    //   41: istore_3
    //   42: aload_1
    //   43: iload_3
    //   44: invokevirtual 29	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: iinc 2 1
    //   51: goto -31 -> 20
    //   54: aload_1
    //   55: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 4
    //   60: aload_1
    //   61: iconst_0
    //   62: aload_1
    //   63: invokevirtual 37	java/lang/StringBuilder:length	()I
    //   66: invokevirtual 41	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_1
    //   71: ldc 2
    //   73: invokevirtual 44	java/lang/Object:hashCode	()I
    //   76: bipush 31
    //   78: iushr
    //   79: iconst_1
    //   80: ior
    //   81: iconst_1
    //   82: ixor
    //   83: invokevirtual 47	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_1
    //   88: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: aload 4
    //   93: aload_1
    //   94: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 51	com/tencent/mm/plugin/webview/ui/tools/f:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokevirtual 57	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   103: ifne +11 -> 114
    //   106: sipush 7476
    //   109: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: iload_0
    //   113: ireturn
    //   114: sipush 7476
    //   117: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: iconst_0
    //   121: istore_0
    //   122: goto -10 -> 112
    //   125: astore 4
    //   127: aload_1
    //   128: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: astore 4
    //   133: aload_1
    //   134: iconst_0
    //   135: aload_1
    //   136: invokevirtual 37	java/lang/StringBuilder:length	()I
    //   139: invokevirtual 41	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_1
    //   144: ldc 2
    //   146: invokevirtual 44	java/lang/Object:hashCode	()I
    //   149: bipush 31
    //   151: iushr
    //   152: iconst_1
    //   153: ior
    //   154: iconst_1
    //   155: ixor
    //   156: invokevirtual 47	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_1
    //   161: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: aload 4
    //   166: aload_1
    //   167: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: invokestatic 51	com/tencent/mm/plugin/webview/ui/tools/f:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   173: invokevirtual 57	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   176: ifne +12 -> 188
    //   179: sipush 7476
    //   182: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: goto -73 -> 112
    //   188: sipush 7476
    //   191: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: iconst_0
    //   195: istore_0
    //   196: goto -84 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   42	48	125	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.f
 * JD-Core Version:    0.6.2
 */
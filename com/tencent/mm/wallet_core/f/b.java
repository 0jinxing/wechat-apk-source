package com.tencent.mm.wallet_core.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class b
{
  // ERROR //
  public static boolean dOm()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: ldc 12
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 20	java/lang/StringBuilder
    //   10: dup
    //   11: bipush 8
    //   13: invokespecial 22	java/lang/StringBuilder:<init>	(I)V
    //   16: astore_1
    //   17: iconst_0
    //   18: istore_2
    //   19: iload_2
    //   20: bipush 6
    //   22: if_icmpge +32 -> 54
    //   25: ldc2_w 23
    //   28: iconst_5
    //   29: iload_2
    //   30: isub
    //   31: bipush 8
    //   33: imul
    //   34: lshr
    //   35: ldc2_w 25
    //   38: land
    //   39: l2i
    //   40: i2c
    //   41: istore_3
    //   42: aload_1
    //   43: iload_3
    //   44: invokevirtual 30	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: iinc 2 1
    //   51: goto -32 -> 19
    //   54: aload_1
    //   55: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 4
    //   60: aload_1
    //   61: iconst_0
    //   62: aload_1
    //   63: invokevirtual 38	java/lang/StringBuilder:length	()I
    //   66: invokevirtual 42	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_1
    //   71: ldc 2
    //   73: invokevirtual 45	java/lang/Object:hashCode	()I
    //   76: bipush 31
    //   78: iushr
    //   79: iconst_1
    //   80: ior
    //   81: iconst_1
    //   82: ixor
    //   83: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_1
    //   88: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: aload 4
    //   93: aload_1
    //   94: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 52	com/tencent/mm/wallet_core/f/b:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   103: ifne +10 -> 113
    //   106: ldc 12
    //   108: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: iload_0
    //   112: ireturn
    //   113: ldc 12
    //   115: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: iconst_0
    //   119: istore_0
    //   120: goto -9 -> 111
    //   123: astore 4
    //   125: aload_1
    //   126: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore 4
    //   131: aload_1
    //   132: iconst_0
    //   133: aload_1
    //   134: invokevirtual 38	java/lang/StringBuilder:length	()I
    //   137: invokevirtual 42	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_1
    //   142: ldc 2
    //   144: invokevirtual 45	java/lang/Object:hashCode	()I
    //   147: bipush 31
    //   149: iushr
    //   150: iconst_1
    //   151: ior
    //   152: iconst_1
    //   153: ixor
    //   154: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_1
    //   159: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: aload 4
    //   164: aload_1
    //   165: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokestatic 52	com/tencent/mm/wallet_core/f/b:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   171: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   174: ifne +11 -> 185
    //   177: ldc 12
    //   179: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -71 -> 111
    //   185: ldc 12
    //   187: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: iconst_0
    //   191: istore_0
    //   192: goto -81 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   42	48	123	finally
  }

  // ERROR //
  public static boolean dOn()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: ldc 63
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 20	java/lang/StringBuilder
    //   10: dup
    //   11: bipush 8
    //   13: invokespecial 22	java/lang/StringBuilder:<init>	(I)V
    //   16: astore_1
    //   17: iconst_0
    //   18: istore_2
    //   19: iload_2
    //   20: bipush 6
    //   22: if_icmpge +32 -> 54
    //   25: ldc2_w 64
    //   28: iconst_5
    //   29: iload_2
    //   30: isub
    //   31: bipush 8
    //   33: imul
    //   34: lshr
    //   35: ldc2_w 25
    //   38: land
    //   39: l2i
    //   40: i2c
    //   41: istore_3
    //   42: aload_1
    //   43: iload_3
    //   44: invokevirtual 30	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: iinc 2 1
    //   51: goto -32 -> 19
    //   54: aload_1
    //   55: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 4
    //   60: aload_1
    //   61: iconst_0
    //   62: aload_1
    //   63: invokevirtual 38	java/lang/StringBuilder:length	()I
    //   66: invokevirtual 42	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_1
    //   71: ldc 2
    //   73: invokevirtual 45	java/lang/Object:hashCode	()I
    //   76: bipush 31
    //   78: iushr
    //   79: iconst_1
    //   80: ior
    //   81: iconst_1
    //   82: ixor
    //   83: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_1
    //   88: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: aload 4
    //   93: aload_1
    //   94: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 52	com/tencent/mm/wallet_core/f/b:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   103: ifne +10 -> 113
    //   106: ldc 63
    //   108: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: iload_0
    //   112: ireturn
    //   113: ldc 63
    //   115: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: iconst_0
    //   119: istore_0
    //   120: goto -9 -> 111
    //   123: astore 4
    //   125: aload_1
    //   126: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore 4
    //   131: aload_1
    //   132: iconst_0
    //   133: aload_1
    //   134: invokevirtual 38	java/lang/StringBuilder:length	()I
    //   137: invokevirtual 42	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_1
    //   142: ldc 2
    //   144: invokevirtual 45	java/lang/Object:hashCode	()I
    //   147: bipush 31
    //   149: iushr
    //   150: iconst_1
    //   151: ior
    //   152: iconst_1
    //   153: ixor
    //   154: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_1
    //   159: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: aload 4
    //   164: aload_1
    //   165: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokestatic 52	com/tencent/mm/wallet_core/f/b:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   171: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   174: ifne +11 -> 185
    //   177: ldc 63
    //   179: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -71 -> 111
    //   185: ldc 63
    //   187: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: iconst_0
    //   191: istore_0
    //   192: goto -81 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   42	48	123	finally
  }

  // ERROR //
  public static boolean dOo()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: ldc 67
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 20	java/lang/StringBuilder
    //   10: dup
    //   11: bipush 8
    //   13: invokespecial 22	java/lang/StringBuilder:<init>	(I)V
    //   16: astore_1
    //   17: iconst_0
    //   18: istore_2
    //   19: iload_2
    //   20: bipush 6
    //   22: if_icmpge +32 -> 54
    //   25: ldc2_w 68
    //   28: iconst_5
    //   29: iload_2
    //   30: isub
    //   31: bipush 8
    //   33: imul
    //   34: lshr
    //   35: ldc2_w 25
    //   38: land
    //   39: l2i
    //   40: i2c
    //   41: istore_3
    //   42: aload_1
    //   43: iload_3
    //   44: invokevirtual 30	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: iinc 2 1
    //   51: goto -32 -> 19
    //   54: aload_1
    //   55: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 4
    //   60: aload_1
    //   61: iconst_0
    //   62: aload_1
    //   63: invokevirtual 38	java/lang/StringBuilder:length	()I
    //   66: invokevirtual 42	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_1
    //   71: ldc 2
    //   73: invokevirtual 45	java/lang/Object:hashCode	()I
    //   76: bipush 31
    //   78: iushr
    //   79: iconst_1
    //   80: ior
    //   81: iconst_1
    //   82: ixor
    //   83: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_1
    //   88: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: aload 4
    //   93: aload_1
    //   94: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 52	com/tencent/mm/wallet_core/f/b:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   103: ifne +10 -> 113
    //   106: ldc 67
    //   108: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: iload_0
    //   112: ireturn
    //   113: ldc 67
    //   115: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: iconst_0
    //   119: istore_0
    //   120: goto -9 -> 111
    //   123: astore 4
    //   125: aload_1
    //   126: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore 4
    //   131: aload_1
    //   132: iconst_0
    //   133: aload_1
    //   134: invokevirtual 38	java/lang/StringBuilder:length	()I
    //   137: invokevirtual 42	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_1
    //   142: ldc 2
    //   144: invokevirtual 45	java/lang/Object:hashCode	()I
    //   147: bipush 31
    //   149: iushr
    //   150: iconst_1
    //   151: ior
    //   152: iconst_1
    //   153: ixor
    //   154: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_1
    //   159: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: aload 4
    //   164: aload_1
    //   165: invokevirtual 34	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokestatic 52	com/tencent/mm/wallet_core/f/b:fv	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   171: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   174: ifne +11 -> 185
    //   177: ldc 67
    //   179: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -71 -> 111
    //   185: ldc 67
    //   187: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: iconst_0
    //   191: istore_0
    //   192: goto -81 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   42	48	123	finally
  }

  private static String fv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49167);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100327");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      ab.w("MicroMsg.WalletPayHelper", "check point 1, explained by src code.");
      AppMethodBeat.o(49167);
      paramString1 = paramString2;
    }
    while (true)
    {
      return paramString1;
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      if (localObject == null)
      {
        ab.w("MicroMsg.WalletPayHelper", "check point 2, explained by src code.");
        AppMethodBeat.o(49167);
        paramString1 = paramString2;
      }
      else
      {
        paramString1 = (String)((Map)localObject).get(paramString1);
        if ((paramString1 != null) && (paramString1.length() > 0))
        {
          AppMethodBeat.o(49167);
        }
        else
        {
          AppMethodBeat.o(49167);
          paramString1 = paramString2;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.f.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.luggage.bridge;

import android.text.TextUtils;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class q
  implements p
{
  private static final Pattern bON;
  private o bOA;

  static
  {
    AppMethodBeat.i(90745);
    bON = Pattern.compile("^<<//([a-z]{0,10})//>>");
    AppMethodBeat.o(90745);
  }

  q(o paramo)
  {
    this.bOA = paramo;
  }

  public final String bx(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(90744);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(90744);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = bON.matcher(paramString);
      if (((Matcher)localObject2).find());
      for (localObject2 = ((Matcher)localObject2).group(1); ; localObject2 = null)
      {
        if (localObject2 != null)
          break label63;
        AppMethodBeat.o(90744);
        paramString = localObject1;
        break;
      }
      label63: paramString = paramString.replaceFirst("^<<//([a-z]{0,10})//>>", "");
      boolean bool = ((String)localObject2).equals("sync");
      paramString = this.bOA.bOG.h(paramString, bool);
      AppMethodBeat.o(90744);
    }
  }

  // ERROR //
  public final void onReady()
  {
    // Byte code:
    //   0: ldc 92
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 39	com/tencent/luggage/bridge/q:bOA	Lcom/tencent/luggage/bridge/o;
    //   9: astore_1
    //   10: sipush 4096
    //   13: newarray char
    //   15: astore_2
    //   16: new 94	java/io/StringWriter
    //   19: dup
    //   20: invokespecial 95	java/io/StringWriter:<init>	()V
    //   23: astore_3
    //   24: new 97	java/io/InputStreamReader
    //   27: astore 4
    //   29: aload 4
    //   31: aload_1
    //   32: getfield 101	com/tencent/luggage/bridge/o:bOF	Lcom/tencent/luggage/bridge/s;
    //   35: invokeinterface 107 1 0
    //   40: invokevirtual 113	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   43: ldc 115
    //   45: invokevirtual 121	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   48: invokespecial 124	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   51: aload 4
    //   53: astore 5
    //   55: aload 4
    //   57: aload_2
    //   58: invokevirtual 128	java/io/InputStreamReader:read	([C)I
    //   61: istore 6
    //   63: iconst_m1
    //   64: iload 6
    //   66: if_icmpeq +54 -> 120
    //   69: aload 4
    //   71: astore 5
    //   73: aload_3
    //   74: aload_2
    //   75: iconst_0
    //   76: iload 6
    //   78: invokevirtual 132	java/io/StringWriter:write	([CII)V
    //   81: goto -30 -> 51
    //   84: astore_1
    //   85: aload 4
    //   87: astore 5
    //   89: ldc 134
    //   91: ldc 136
    //   93: iconst_1
    //   94: anewarray 4	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: aload_1
    //   100: aastore
    //   101: invokestatic 142	com/tencent/luggage/g/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: aload 4
    //   106: ifnull +8 -> 114
    //   109: aload 4
    //   111: invokevirtual 145	java/io/InputStreamReader:close	()V
    //   114: ldc 92
    //   116: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: return
    //   120: aload 4
    //   122: invokevirtual 145	java/io/InputStreamReader:close	()V
    //   125: aload_1
    //   126: getfield 101	com/tencent/luggage/bridge/o:bOF	Lcom/tencent/luggage/bridge/s;
    //   129: aload_3
    //   130: invokevirtual 149	java/io/StringWriter:toString	()Ljava/lang/String;
    //   133: invokeinterface 153 2 0
    //   138: ldc 92
    //   140: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: goto -24 -> 119
    //   146: astore 5
    //   148: ldc 134
    //   150: ldc 155
    //   152: iconst_1
    //   153: anewarray 4	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload 5
    //   160: aastore
    //   161: invokestatic 142	com/tencent/luggage/g/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: goto -39 -> 125
    //   167: astore 5
    //   169: ldc 134
    //   171: ldc 155
    //   173: iconst_1
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: aload 5
    //   181: aastore
    //   182: invokestatic 142	com/tencent/luggage/g/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: ldc 92
    //   187: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: goto -71 -> 119
    //   193: astore 4
    //   195: aconst_null
    //   196: astore 5
    //   198: aload 5
    //   200: ifnull +8 -> 208
    //   203: aload 5
    //   205: invokevirtual 145	java/io/InputStreamReader:close	()V
    //   208: ldc 92
    //   210: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: aload 4
    //   215: athrow
    //   216: astore 5
    //   218: ldc 134
    //   220: ldc 155
    //   222: iconst_1
    //   223: anewarray 4	java/lang/Object
    //   226: dup
    //   227: iconst_0
    //   228: aload 5
    //   230: aastore
    //   231: invokestatic 142	com/tencent/luggage/g/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: goto -26 -> 208
    //   237: astore 4
    //   239: goto -41 -> 198
    //   242: astore_1
    //   243: aconst_null
    //   244: astore 4
    //   246: goto -161 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   55	63	84	java/lang/Exception
    //   73	81	84	java/lang/Exception
    //   120	125	146	java/lang/Exception
    //   109	114	167	java/lang/Exception
    //   24	51	193	finally
    //   203	208	216	java/lang/Exception
    //   55	63	237	finally
    //   73	81	237	finally
    //   89	104	237	finally
    //   24	51	242	java/lang/Exception
  }

  public final void wO()
  {
    AppMethodBeat.i(90742);
    f localf = this.bOA.bOH;
    d.i("Java2JsMessageQueue", "reset");
    localf.bOq = false;
    localf.bOp.clear();
    AppMethodBeat.o(90742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.q
 * JD-Core Version:    0.6.2
 */
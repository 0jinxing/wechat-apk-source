package com.tencent.mm.plugin.appbrand.luggage.b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.d.a.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.io.File;

public final class j extends com.tencent.luggage.bridge.impl.a.a
  implements com.tencent.mm.plugin.appbrand.d.b
{
  private final i gPI;

  public j(i parami)
  {
    this.gPI = parami;
  }

  // ERROR //
  public final void a(String paramString, com.tencent.mm.plugin.appbrand.d.a.a parama)
  {
    // Byte code:
    //   0: ldc 21
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_0
    //   6: newarray byte
    //   8: astore_3
    //   9: aload_0
    //   10: aload_1
    //   11: invokevirtual 31	com/tencent/mm/plugin/appbrand/luggage/b/j:match	(Ljava/lang/String;)Z
    //   14: ifeq +175 -> 189
    //   17: aload_0
    //   18: getfield 15	com/tencent/mm/plugin/appbrand/luggage/b/j:gPI	Lcom/tencent/mm/plugin/appbrand/i;
    //   21: invokevirtual 37	com/tencent/mm/plugin/appbrand/i:asE	()Lcom/tencent/mm/plugin/appbrand/appstorage/p;
    //   24: astore 4
    //   26: aload 4
    //   28: ifnull +161 -> 189
    //   31: aload 4
    //   33: aload_1
    //   34: iconst_0
    //   35: aload_1
    //   36: ldc 39
    //   38: invokevirtual 45	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   41: invokevirtual 49	java/lang/String:substring	(II)Ljava/lang/String;
    //   44: invokeinterface 55 2 0
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull +138 -> 189
    //   54: aload_1
    //   55: invokevirtual 61	java/io/File:exists	()Z
    //   58: ifeq +131 -> 189
    //   61: aload_1
    //   62: invokevirtual 65	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   65: astore 4
    //   67: aload 4
    //   69: astore_1
    //   70: aload 4
    //   72: ldc 67
    //   74: invokevirtual 70	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   77: ifne +14 -> 91
    //   80: ldc 67
    //   82: aload 4
    //   84: invokestatic 74	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   87: invokevirtual 78	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   90: astore_1
    //   91: aload_1
    //   92: invokestatic 84	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   95: astore 4
    //   97: aload 4
    //   99: astore_1
    //   100: aload 4
    //   102: invokestatic 90	com/tencent/luggage/g/i:k	(Ljava/io/InputStream;)[B
    //   105: astore 5
    //   107: aload 4
    //   109: invokestatic 94	com/tencent/luggage/g/i:b	(Ljava/io/Closeable;)V
    //   112: aload 5
    //   114: astore_1
    //   115: aload_2
    //   116: ifnull +10 -> 126
    //   119: aload_2
    //   120: aload_1
    //   121: invokeinterface 100 2 0
    //   126: ldc 21
    //   128: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: return
    //   132: astore_1
    //   133: aconst_null
    //   134: astore 4
    //   136: aload 4
    //   138: astore_1
    //   139: ldc 105
    //   141: ldc 107
    //   143: iconst_0
    //   144: anewarray 109	java/lang/Object
    //   147: invokestatic 115	com/tencent/luggage/g/d:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload 4
    //   152: invokestatic 94	com/tencent/luggage/g/i:b	(Ljava/io/Closeable;)V
    //   155: aload_3
    //   156: astore_1
    //   157: goto -42 -> 115
    //   160: astore_1
    //   161: aconst_null
    //   162: astore 4
    //   164: aload_1
    //   165: astore_2
    //   166: aload 4
    //   168: invokestatic 94	com/tencent/luggage/g/i:b	(Ljava/io/Closeable;)V
    //   171: ldc 21
    //   173: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: aload_2
    //   177: athrow
    //   178: astore_2
    //   179: aload_1
    //   180: astore 4
    //   182: goto -16 -> 166
    //   185: astore_1
    //   186: goto -50 -> 136
    //   189: aload_3
    //   190: astore_1
    //   191: goto -76 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   91	97	132	java/io/FileNotFoundException
    //   91	97	160	finally
    //   100	107	178	finally
    //   139	150	178	finally
    //   100	107	185	java/io/FileNotFoundException
  }

  public final boolean a(c paramc, String paramString)
  {
    AppMethodBeat.i(86990);
    boolean bool;
    if ((paramc == null) || (paramString == null) || (paramString.length() == 0))
    {
      bool = false;
      AppMethodBeat.o(86990);
    }
    while (true)
    {
      return bool;
      bool = paramString.startsWith("wxfile://");
      AppMethodBeat.o(86990);
    }
  }

  public final Bitmap b(String paramString, Rect paramRect, a.c paramc)
  {
    paramc = null;
    String str = null;
    AppMethodBeat.i(86989);
    if (!match(paramString))
    {
      AppMethodBeat.o(86989);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      p localp = this.gPI.asE();
      if (localp == null)
      {
        AppMethodBeat.o(86989);
        paramString = str;
      }
      else
      {
        paramString = localp.yg(paramString.substring(0, paramString.lastIndexOf("?appId=")));
        if ((paramString == null) || (!paramString.exists()))
        {
          AppMethodBeat.o(86989);
          paramString = str;
        }
        else
        {
          str = paramString.getAbsolutePath();
          paramString = str;
          if (!str.startsWith("file://"))
            paramString = "file://".concat(String.valueOf(str));
          if (paramRect != null)
            paramc = new com.tencent.mm.plugin.appbrand.luggage.a.a(paramRect.left, paramRect.top, paramRect.width(), paramRect.height());
          paramString = com.tencent.mm.modelappbrand.a.b.abR().a(paramString, paramc);
          AppMethodBeat.o(86989);
        }
      }
    }
  }

  public final String b(c paramc, String paramString)
  {
    AppMethodBeat.i(86991);
    if (!a(paramc, paramString))
      AppMethodBeat.o(86991);
    while (true)
    {
      return paramString;
      paramString = paramString + "?appId=" + paramc.getAppId();
      AppMethodBeat.o(86991);
    }
  }

  public final boolean match(String paramString)
  {
    AppMethodBeat.i(86988);
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("wxfile://")))
    {
      bool = true;
      AppMethodBeat.o(86988);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86988);
    }
  }

  public final String wP()
  {
    return "WxFileImageReader";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.j
 * JD-Core Version:    0.6.2
 */
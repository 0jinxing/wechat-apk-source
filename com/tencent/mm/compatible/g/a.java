package com.tencent.mm.compatible.g;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends BitmapFactory
{
  private static a euC = null;

  // ERROR //
  private static Bitmap a(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 20
    //   4: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 31	com/tencent/mm/sdk/platformtools/d:dnX	()V
    //   10: new 33	android/util/TypedValue
    //   13: astore 4
    //   15: aload 4
    //   17: invokespecial 36	android/util/TypedValue:<init>	()V
    //   20: aload_0
    //   21: iload_1
    //   22: aload 4
    //   24: invokevirtual 42	android/content/res/Resources:openRawResource	(ILandroid/util/TypedValue;)Ljava/io/InputStream;
    //   27: astore 5
    //   29: aload_0
    //   30: aload 4
    //   32: aload 5
    //   34: aconst_null
    //   35: aload_2
    //   36: invokestatic 46	com/tencent/mm/compatible/g/a:decodeResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   39: astore_0
    //   40: aload_0
    //   41: ifnonnull +133 -> 174
    //   44: aload 5
    //   46: invokestatic 50	com/tencent/mm/compatible/g/a:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   49: astore_3
    //   50: aload_3
    //   51: astore_0
    //   52: aload_0
    //   53: astore_3
    //   54: aload 5
    //   56: ifnull +10 -> 66
    //   59: aload 5
    //   61: invokevirtual 55	java/io/InputStream:close	()V
    //   64: aload_0
    //   65: astore_3
    //   66: aload_3
    //   67: ifnonnull +75 -> 142
    //   70: aload_2
    //   71: ifnull +71 -> 142
    //   74: new 57	java/lang/IllegalArgumentException
    //   77: dup
    //   78: ldc 59
    //   80: invokespecial 62	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   83: astore_0
    //   84: ldc 20
    //   86: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: aload_0
    //   90: athrow
    //   91: astore_0
    //   92: aconst_null
    //   93: astore 5
    //   95: aconst_null
    //   96: astore_0
    //   97: aload_0
    //   98: astore_3
    //   99: aload 5
    //   101: ifnull -35 -> 66
    //   104: aload 5
    //   106: invokevirtual 55	java/io/InputStream:close	()V
    //   109: aload_0
    //   110: astore_3
    //   111: goto -45 -> 66
    //   114: astore 5
    //   116: aload_0
    //   117: astore_3
    //   118: goto -52 -> 66
    //   121: astore_0
    //   122: aconst_null
    //   123: astore 5
    //   125: aload 5
    //   127: ifnull +8 -> 135
    //   130: aload 5
    //   132: invokevirtual 55	java/io/InputStream:close	()V
    //   135: ldc 20
    //   137: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: aload_0
    //   141: athrow
    //   142: ldc 20
    //   144: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_3
    //   148: areturn
    //   149: astore_0
    //   150: aload_3
    //   151: astore_0
    //   152: goto -112 -> 40
    //   155: astore 5
    //   157: aload_0
    //   158: astore_3
    //   159: goto -93 -> 66
    //   162: astore_2
    //   163: goto -28 -> 135
    //   166: astore_0
    //   167: goto -42 -> 125
    //   170: astore_3
    //   171: goto -74 -> 97
    //   174: goto -122 -> 52
    //
    // Exception table:
    //   from	to	target	type
    //   10	29	91	java/lang/Exception
    //   104	109	114	java/io/IOException
    //   10	29	121	finally
    //   29	40	149	java/lang/Exception
    //   59	64	155	java/io/IOException
    //   130	135	162	java/io/IOException
    //   29	40	166	finally
    //   44	50	166	finally
    //   44	50	170	java/lang/Exception
  }

  public static void a(a parama)
  {
    euC = parama;
  }

  public static Bitmap decodeResource(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(93049);
    paramResources = decodeResource(paramResources, paramInt, null);
    AppMethodBeat.o(93049);
    return paramResources;
  }

  public static Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(93050);
    if (euC != null)
    {
      Bitmap localBitmap = euC.decodeResource(paramResources, paramInt, paramOptions);
      if (localBitmap != null)
      {
        AppMethodBeat.o(93050);
        paramResources = localBitmap;
      }
    }
    while (true)
    {
      return paramResources;
      paramResources = a(paramResources, paramInt, paramOptions);
      AppMethodBeat.o(93050);
    }
  }

  public static abstract interface a
  {
    public abstract Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.a
 * JD-Core Version:    0.6.2
 */
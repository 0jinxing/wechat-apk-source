package com.tencent.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.e;
import com.tencent.util.g;
import com.tencent.view.raw.FilterRawGet;
import java.io.InputStream;

public final class b
{
  public static Context AIC;
  private static FilterRawGet AID;
  public static boolean AIE;
  public static boolean AIF;
  public static boolean AIG;
  public static int AIH;
  public static boolean AII;
  public static boolean AIJ;

  static
  {
    AppMethodBeat.i(86630);
    AID = new FilterRawGet();
    AIE = false;
    AIF = false;
    AIG = true;
    AIH = -1;
    AII = false;
    AIJ = false;
    AppMethodBeat.o(86630);
  }

  public static Bitmap a(String paramString, Bitmap.Config paramConfig, int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(86629);
    try
    {
      localObject2 = auA(paramString);
      paramString = e.O((InputStream)localObject2);
    }
    catch (Exception paramString)
    {
      try
      {
        Object localObject2;
        g.closeQuietly((InputStream)localObject2);
        while (true)
        {
          label25: if (paramString == null)
          {
            AppMethodBeat.o(86629);
            paramString = (String)localObject1;
          }
          while (true)
          {
            return paramString;
            localObject1 = new BitmapFactory.Options();
            ((BitmapFactory.Options)localObject1).inPreferredConfig = paramConfig;
            localObject1 = BitmapFactory.decodeByteArray(paramString, 0, paramString.length, (BitmapFactory.Options)localObject1);
            paramString = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
            localObject2 = new Canvas(paramString);
            paramConfig = new Paint(6);
            ((Canvas)localObject2).drawBitmap((Bitmap)localObject1, new Rect(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight()), new Rect(0, 0, paramInt1, paramInt2), paramConfig);
            ((Bitmap)localObject1).recycle();
            AppMethodBeat.o(86629);
          }
          paramString = paramString;
          paramString = null;
        }
      }
      catch (Exception localException)
      {
        break label25;
      }
    }
  }

  // ERROR //
  public static InputStream auA(String paramString)
  {
    // Byte code:
    //   0: ldc 124
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 34	com/tencent/view/b:AIE	Z
    //   8: ifeq +42 -> 50
    //   11: getstatic 126	com/tencent/view/b:AIC	Landroid/content/Context;
    //   14: invokevirtual 132	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   17: astore_1
    //   18: aload_1
    //   19: aload_0
    //   20: invokevirtual 137	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   23: astore_0
    //   24: ldc 124
    //   26: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_0
    //   30: areturn
    //   31: astore_0
    //   32: aconst_null
    //   33: astore_0
    //   34: ldc 124
    //   36: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: goto -10 -> 29
    //   42: astore_0
    //   43: ldc 124
    //   45: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_0
    //   49: athrow
    //   50: getstatic 32	com/tencent/view/b:AID	Lcom/tencent/view/raw/FilterRawGet;
    //   53: aload_0
    //   54: invokevirtual 140	com/tencent/view/raw/FilterRawGet:getInpuStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   57: astore_0
    //   58: ldc 124
    //   60: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: goto -34 -> 29
    //
    // Exception table:
    //   from	to	target	type
    //   18	24	31	java/io/IOException
    //   18	24	42	finally
  }

  // ERROR //
  public static Bitmap auB(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 145
    //   6: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 147	java/io/FileInputStream
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: invokespecial 150	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   18: aload_3
    //   19: invokestatic 63	com/tencent/util/e:O	(Ljava/io/InputStream;)[B
    //   22: astore_0
    //   23: aload_3
    //   24: invokestatic 69	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   27: aload_0
    //   28: ifnonnull +27 -> 55
    //   31: ldc 145
    //   33: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: aload_2
    //   37: astore_0
    //   38: aload_0
    //   39: areturn
    //   40: astore_3
    //   41: aconst_null
    //   42: astore_0
    //   43: ldc 152
    //   45: ldc 154
    //   47: aload_3
    //   48: invokestatic 159	com/tencent/util/i:a	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   51: pop
    //   52: goto -25 -> 27
    //   55: new 71	android/graphics/BitmapFactory$Options
    //   58: dup
    //   59: invokespecial 72	android/graphics/BitmapFactory$Options:<init>	()V
    //   62: astore_3
    //   63: aload_3
    //   64: getstatic 87	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   67: putfield 76	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   70: aload_0
    //   71: iconst_0
    //   72: aload_0
    //   73: arraylength
    //   74: aload_3
    //   75: invokestatic 82	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   78: astore_0
    //   79: ldc 145
    //   81: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: goto -46 -> 38
    //   87: astore_0
    //   88: ldc 152
    //   90: ldc 160
    //   92: aload_0
    //   93: invokestatic 159	com/tencent/util/i:a	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   96: pop
    //   97: aload_1
    //   98: astore_0
    //   99: goto -20 -> 79
    //   102: astore_3
    //   103: goto -60 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   9	23	40	java/lang/Exception
    //   70	79	87	java/lang/OutOfMemoryError
    //   23	27	102	java/lang/Exception
  }

  // ERROR //
  public static Bitmap vt(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 162
    //   6: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokestatic 57	com/tencent/view/b:auA	(Ljava/lang/String;)Ljava/io/InputStream;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnonnull +35 -> 50
    //   18: new 164	java/lang/StringBuilder
    //   21: astore 4
    //   23: aload 4
    //   25: ldc 166
    //   27: invokespecial 167	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: ldc 152
    //   32: aload 4
    //   34: aload_0
    //   35: invokevirtual 171	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 173
    //   40: invokevirtual 171	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokestatic 181	com/tencent/util/i:m	(Ljava/lang/Object;Ljava/lang/String;)I
    //   49: pop
    //   50: aload_3
    //   51: invokestatic 63	com/tencent/util/e:O	(Ljava/io/InputStream;)[B
    //   54: astore_0
    //   55: aload_3
    //   56: invokestatic 69	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   59: aload_0
    //   60: ifnonnull +27 -> 87
    //   63: ldc 162
    //   65: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: aload_2
    //   69: astore_0
    //   70: aload_0
    //   71: areturn
    //   72: astore_3
    //   73: aconst_null
    //   74: astore_0
    //   75: ldc 152
    //   77: ldc 154
    //   79: aload_3
    //   80: invokestatic 159	com/tencent/util/i:a	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   83: pop
    //   84: goto -25 -> 59
    //   87: new 71	android/graphics/BitmapFactory$Options
    //   90: dup
    //   91: invokespecial 72	android/graphics/BitmapFactory$Options:<init>	()V
    //   94: astore_3
    //   95: aload_3
    //   96: getstatic 87	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   99: putfield 76	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   102: aload_0
    //   103: iconst_0
    //   104: aload_0
    //   105: arraylength
    //   106: aload_3
    //   107: invokestatic 82	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   110: astore_0
    //   111: ldc 162
    //   113: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: goto -46 -> 70
    //   119: astore_0
    //   120: ldc 152
    //   122: ldc 160
    //   124: aload_0
    //   125: invokestatic 159	com/tencent/util/i:a	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   128: pop
    //   129: aload_1
    //   130: astore_0
    //   131: goto -20 -> 111
    //   134: astore_3
    //   135: goto -60 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   9	14	72	java/lang/Exception
    //   18	50	72	java/lang/Exception
    //   50	55	72	java/lang/Exception
    //   102	111	119	java/lang/OutOfMemoryError
    //   55	59	134	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.view.b
 * JD-Core Version:    0.6.2
 */
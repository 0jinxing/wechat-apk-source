package com.tencent.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Environment;
import com.tencent.filter.QImage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilterEngineJNILib
{
  private static long mLastDate = 0L;
  private static int mSameSecondCount = 0;

  public static String generateBundlePath(String paramString1, String paramString2)
  {
    AppMethodBeat.i(86584);
    if (paramString2 != null);
    for (paramString2 = paramString1 + "." + paramString2; ; paramString2 = paramString1)
    {
      if (new File(paramString2).exists())
      {
        AppMethodBeat.o(86584);
        paramString1 = paramString2;
      }
      while (true)
      {
        return paramString1;
        Object localObject = com.tencent.view.b.AIC;
        if (localObject == null)
        {
          AppMethodBeat.o(86584);
          paramString1 = null;
        }
        else
        {
          localObject = ((Context)localObject).getDir("filter", 0);
          if ((!((File)localObject).isDirectory()) && (!((File)localObject).mkdirs()))
          {
            AppMethodBeat.o(86584);
            paramString1 = null;
          }
          else
          {
            localObject = new File((File)localObject, paramString2);
            if (!((File)localObject).exists())
            {
              ((File)localObject).mkdirs();
              ((File)localObject).delete();
              try
              {
                paramString2 = com.tencent.view.b.auA(paramString2);
                if (paramString2 == null)
                  break label211;
                byte[] arrayOfByte = new byte[1024];
                ((File)localObject).createNewFile();
                paramString1 = new java/io/FileOutputStream;
                paramString1.<init>((File)localObject);
                while (true)
                {
                  int i = paramString2.read(arrayOfByte);
                  if (i == -1)
                    break;
                  paramString1.write(arrayOfByte, 0, i);
                }
              }
              catch (IOException paramString1)
              {
              }
            }
            while (true)
            {
              paramString1 = ((File)localObject).getAbsolutePath();
              AppMethodBeat.o(86584);
              break;
              paramString2.close();
              paramString1.close();
            }
            label211: i.k("filter", "generateBundlePath notfound".concat(String.valueOf(paramString1)));
            AppMethodBeat.o(86584);
            paramString1 = null;
          }
        }
      }
    }
  }

  private static String generateName(long paramLong)
  {
    try
    {
      AppMethodBeat.i(86590);
      Object localObject1 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject1).<init>("'IMG'_yyyyMMdd_HHmmss");
      Object localObject2 = new java/util/Date;
      ((Date)localObject2).<init>(paramLong);
      localObject2 = ((SimpleDateFormat)localObject1).format((Date)localObject2);
      if (paramLong / 1000L == mLastDate / 1000L)
      {
        mSameSecondCount += 1;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = (String)localObject2 + "_" + mSameSecondCount;
      }
      while (true)
      {
        AppMethodBeat.o(86590);
        return localObject2;
        mLastDate = paramLong;
        mSameSecondCount = 0;
      }
    }
    finally
    {
    }
  }

  public static byte[] getAssetContents(String paramString)
  {
    AppMethodBeat.i(86583);
    if (com.tencent.view.b.AIC == null)
    {
      paramString = null;
      AppMethodBeat.o(86583);
    }
    while (true)
    {
      return paramString;
      InputStream localInputStream = com.tencent.view.b.AIC.getAssets().open(paramString, 3);
      paramString = new byte[localInputStream.available()];
      localInputStream.read(paramString);
      AppMethodBeat.o(86583);
    }
  }

  private static String getSDPath()
  {
    AppMethodBeat.i(86588);
    Object localObject = null;
    if (Environment.getExternalStorageState().equals("mounted"))
      localObject = Environment.getExternalStorageDirectory();
    localObject = ((File)localObject).toString();
    AppMethodBeat.o(86588);
    return localObject;
  }

  public static native void nativeCopyImage(Bitmap paramBitmap, long paramLong);

  public static byte[] readBundleData(String paramString)
  {
    AppMethodBeat.i(86585);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    try
    {
      InputStream localInputStream = com.tencent.view.b.auA(paramString);
      if (localInputStream == null)
      {
        localObject2 = localObject1;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localObject2 = localObject1;
        localStringBuilder.<init>("decodeBitmap  getStream ");
        localObject2 = localObject1;
        i.m("FilterDefault", paramString + " not exist");
      }
      localObject2 = localObject1;
      paramString = e.O(localInputStream);
      localObject2 = paramString;
      g.closeQuietly(localInputStream);
      AppMethodBeat.o(86585);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        i.a("FilterDefault", "decodeBitmap  getStream", paramString);
        paramString = (String)localObject2;
      }
    }
  }

  public static QImage readBundleImage(String paramString)
  {
    AppMethodBeat.i(86586);
    Bitmap localBitmap = com.tencent.view.b.vt(paramString);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramString = QImage.Bitmap2QImage(localBitmap);
      b.recycle(localBitmap);
      AppMethodBeat.o(86586);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(86586);
    }
  }

  public static void recycleImage(Bitmap paramBitmap)
  {
    AppMethodBeat.i(86587);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      paramBitmap.recycle();
    System.gc();
    AppMethodBeat.o(86587);
  }

  // ERROR //
  private static int saveBitmap(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 259
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 62
    //   10: ldc_w 261
    //   13: aload_1
    //   14: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   17: invokevirtual 121	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   20: invokestatic 127	com/tencent/util/i:k	(Ljava/lang/Object;Ljava/lang/String;)I
    //   23: pop
    //   24: aconst_null
    //   25: astore_3
    //   26: aconst_null
    //   27: astore 4
    //   29: aconst_null
    //   30: astore 5
    //   32: new 44	java/io/File
    //   35: astore 6
    //   37: aload 6
    //   39: aload_1
    //   40: invokespecial 47	java/io/File:<init>	(Ljava/lang/String;)V
    //   43: aload 6
    //   45: invokevirtual 264	java/io/File:getParentFile	()Ljava/io/File;
    //   48: astore 7
    //   50: aload 7
    //   52: invokevirtual 51	java/io/File:exists	()Z
    //   55: ifne +9 -> 64
    //   58: aload 7
    //   60: invokevirtual 74	java/io/File:mkdirs	()Z
    //   63: pop
    //   64: aload 6
    //   66: invokevirtual 51	java/io/File:exists	()Z
    //   69: ifne +9 -> 78
    //   72: aload 6
    //   74: invokevirtual 87	java/io/File:createNewFile	()Z
    //   77: pop
    //   78: new 31	java/lang/StringBuilder
    //   81: astore 7
    //   83: aload 7
    //   85: ldc_w 266
    //   88: invokespecial 195	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   91: ldc 62
    //   93: aload 7
    //   95: aload 6
    //   97: invokevirtual 51	java/io/File:exists	()Z
    //   100: invokevirtual 269	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   103: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 127	com/tencent/util/i:k	(Ljava/lang/Object;Ljava/lang/String;)I
    //   109: pop
    //   110: new 89	java/io/FileOutputStream
    //   113: astore 6
    //   115: aload 6
    //   117: aload_1
    //   118: invokespecial 270	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   121: aload_0
    //   122: ifnull +20 -> 142
    //   125: aload_0
    //   126: getstatic 276	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   129: bipush 95
    //   131: aload 6
    //   133: invokevirtual 280	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   136: pop
    //   137: aload 6
    //   139: invokevirtual 283	java/io/FileOutputStream:flush	()V
    //   142: aload 6
    //   144: invokestatic 286	com/tencent/util/g:closeQuietly	(Ljava/io/OutputStream;)V
    //   147: iconst_1
    //   148: istore_2
    //   149: ldc_w 259
    //   152: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: iload_2
    //   156: ireturn
    //   157: astore_0
    //   158: aload 5
    //   160: astore 6
    //   162: aload 6
    //   164: invokestatic 286	com/tencent/util/g:closeQuietly	(Ljava/io/OutputStream;)V
    //   167: ldc_w 259
    //   170: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -18 -> 155
    //   176: astore_0
    //   177: aload_3
    //   178: astore 6
    //   180: aload 6
    //   182: invokestatic 286	com/tencent/util/g:closeQuietly	(Ljava/io/OutputStream;)V
    //   185: ldc_w 259
    //   188: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: goto -36 -> 155
    //   194: astore_0
    //   195: aload 4
    //   197: astore 6
    //   199: aload 6
    //   201: invokestatic 286	com/tencent/util/g:closeQuietly	(Ljava/io/OutputStream;)V
    //   204: ldc_w 259
    //   207: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: aload_0
    //   211: athrow
    //   212: astore_0
    //   213: goto -14 -> 199
    //   216: astore_0
    //   217: goto -37 -> 180
    //   220: astore_0
    //   221: goto -59 -> 162
    //
    // Exception table:
    //   from	to	target	type
    //   32	64	157	java/lang/Exception
    //   64	78	157	java/lang/Exception
    //   78	121	157	java/lang/Exception
    //   32	64	176	java/lang/OutOfMemoryError
    //   64	78	176	java/lang/OutOfMemoryError
    //   78	121	176	java/lang/OutOfMemoryError
    //   32	64	194	finally
    //   64	78	194	finally
    //   78	121	194	finally
    //   125	142	212	finally
    //   125	142	216	java/lang/OutOfMemoryError
    //   125	142	220	java/lang/Exception
  }

  public static void writeToAlbum(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(86589);
    if (com.tencent.view.b.AIF)
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      i.k("filter", "writeToAlbum: " + paramInt1 + " " + paramInt2);
      nativeCopyImage(localBitmap, paramLong);
      String str = generateName(System.currentTimeMillis());
      i.k("filter", "writeToAlbum ret: ".concat(String.valueOf(saveBitmap(localBitmap, getSDPath() + "/filter/" + str + ".jpg"))));
      localBitmap.recycle();
    }
    AppMethodBeat.o(86589);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.util.FilterEngineJNILib
 * JD-Core Version:    0.6.2
 */
package com.tencent.youtu.ytcommon.tools;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class YTFileUtils
{
  private YTFileUtils()
  {
    AppMethodBeat.i(118086);
    AssertionError localAssertionError = new AssertionError();
    AppMethodBeat.o(118086);
    throw localAssertionError;
  }

  public static boolean copyAsset(AssetManager paramAssetManager, String paramString1, String paramString2)
  {
    AppMethodBeat.i(118089);
    try
    {
      paramAssetManager = paramAssetManager.open(paramString1);
      paramString1 = new java/io/File;
      paramString1.<init>(paramString2);
      paramString1.createNewFile();
      paramString1 = new java/io/FileOutputStream;
      paramString1.<init>(paramString2);
      copyFile(paramAssetManager, paramString1);
      paramAssetManager.close();
      paramString1.flush();
      paramString1.close();
      bool = true;
      AppMethodBeat.o(118089);
      return bool;
    }
    catch (Exception paramAssetManager)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(118089);
      }
    }
  }

  public static void copyFile(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    AppMethodBeat.i(118091);
    byte[] arrayOfByte = new byte[1024];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    AppMethodBeat.o(118091);
  }

  public static void copyFileOrDir(AssetManager paramAssetManager, String paramString1, String paramString2)
  {
    AppMethodBeat.i(118090);
    try
    {
      String[] arrayOfString = paramAssetManager.list(paramString1);
      Object localObject;
      if (arrayOfString.length == 0)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        copyAsset(paramAssetManager, paramString1, paramString2 + "/" + paramString1);
        AppMethodBeat.o(118090);
      }
      while (true)
      {
        return;
        if (paramString2.endsWith(File.separator))
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
        }
        for (localObject = paramString2 + paramString1; ; localObject = paramString2 + File.separator + paramString1)
        {
          File localFile = new java/io/File;
          localFile.<init>((String)localObject);
          if (!localFile.exists())
            localFile.mkdir();
          for (int i = 0; i < arrayOfString.length; i++)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            copyFileOrDir(paramAssetManager, paramString1 + "/" + arrayOfString[i], paramString2);
          }
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
        }
        AppMethodBeat.o(118090);
      }
    }
    catch (IOException paramAssetManager)
    {
      while (true)
        AppMethodBeat.o(118090);
    }
  }

  public static void deleteFile(File paramFile)
  {
    AppMethodBeat.i(118096);
    if (paramFile.isFile())
    {
      paramFile.delete();
      AppMethodBeat.o(118096);
    }
    while (true)
    {
      return;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if ((arrayOfFile == null) || (arrayOfFile.length == 0))
        {
          paramFile.delete();
          AppMethodBeat.o(118096);
        }
        else
        {
          for (int i = 0; i < arrayOfFile.length; i++)
            deleteFile(arrayOfFile[i]);
          paramFile.delete();
        }
      }
      else
      {
        AppMethodBeat.o(118096);
      }
    }
  }

  public static Bitmap drawableToBitmap(Drawable paramDrawable)
  {
    AppMethodBeat.i(118092);
    if ((paramDrawable instanceof BitmapDrawable))
    {
      localObject = (BitmapDrawable)paramDrawable;
      if (((BitmapDrawable)localObject).getBitmap() != null)
      {
        localObject = ((BitmapDrawable)localObject).getBitmap();
        AppMethodBeat.o(118092);
        return localObject;
      }
    }
    if ((paramDrawable.getIntrinsicWidth() <= 0) || (paramDrawable.getIntrinsicHeight() <= 0));
    for (Object localObject = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888); ; localObject = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888))
    {
      Canvas localCanvas = new Canvas((Bitmap)localObject);
      paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
      paramDrawable.draw(localCanvas);
      AppMethodBeat.o(118092);
      break;
    }
  }

  public static String getLastPathComponent(String paramString)
  {
    AppMethodBeat.i(118095);
    paramString = paramString.split("/");
    if (paramString.length == 0)
    {
      paramString = "";
      AppMethodBeat.o(118095);
    }
    while (true)
    {
      return paramString;
      paramString = paramString[(paramString.length - 1)];
      AppMethodBeat.o(118095);
    }
  }

  // ERROR //
  public static StringBuilder readAssetFile(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 189
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 80	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 186
    //   11: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: astore_2
    //   15: new 192	java/io/InputStreamReader
    //   18: astore_3
    //   19: aload_3
    //   20: aload_0
    //   21: invokevirtual 198	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   24: invokevirtual 204	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   27: aload_1
    //   28: invokevirtual 33	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   31: invokespecial 207	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   34: new 209	java/io/BufferedReader
    //   37: astore_1
    //   38: aload_1
    //   39: aload_3
    //   40: invokespecial 212	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   43: aload_1
    //   44: astore_0
    //   45: aload_1
    //   46: invokevirtual 215	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   49: astore_3
    //   50: aload_3
    //   51: ifnull +80 -> 131
    //   54: aload_1
    //   55: astore_0
    //   56: aload_2
    //   57: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: ldc 186
    //   62: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +12 -> 77
    //   68: aload_1
    //   69: astore_0
    //   70: aload_2
    //   71: ldc 221
    //   73: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload_1
    //   78: astore_0
    //   79: aload_2
    //   80: aload_3
    //   81: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: goto -42 -> 43
    //   88: astore_2
    //   89: aload_1
    //   90: astore_0
    //   91: new 223	java/lang/RuntimeException
    //   94: astore_3
    //   95: aload_1
    //   96: astore_0
    //   97: aload_3
    //   98: ldc 225
    //   100: aload_2
    //   101: invokespecial 228	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   104: aload_1
    //   105: astore_0
    //   106: ldc 189
    //   108: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_1
    //   112: astore_0
    //   113: aload_3
    //   114: athrow
    //   115: astore_1
    //   116: aload_0
    //   117: ifnull +7 -> 124
    //   120: aload_0
    //   121: invokevirtual 229	java/io/BufferedReader:close	()V
    //   124: ldc 189
    //   126: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: aload_1
    //   130: athrow
    //   131: aload_1
    //   132: invokevirtual 229	java/io/BufferedReader:close	()V
    //   135: ldc 189
    //   137: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: aload_2
    //   141: areturn
    //   142: astore_0
    //   143: new 223	java/lang/RuntimeException
    //   146: dup
    //   147: ldc 225
    //   149: aload_0
    //   150: invokespecial 228	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   153: astore_0
    //   154: ldc 189
    //   156: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: aload_0
    //   160: athrow
    //   161: astore_0
    //   162: new 223	java/lang/RuntimeException
    //   165: dup
    //   166: ldc 225
    //   168: aload_0
    //   169: invokespecial 228	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   172: astore_0
    //   173: ldc 189
    //   175: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: aload_0
    //   179: athrow
    //   180: astore_1
    //   181: aconst_null
    //   182: astore_0
    //   183: goto -67 -> 116
    //   186: astore_2
    //   187: aconst_null
    //   188: astore_1
    //   189: goto -100 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   45	50	88	java/io/IOException
    //   56	68	88	java/io/IOException
    //   70	77	88	java/io/IOException
    //   79	85	88	java/io/IOException
    //   45	50	115	finally
    //   56	68	115	finally
    //   70	77	115	finally
    //   79	85	115	finally
    //   91	95	115	finally
    //   97	104	115	finally
    //   106	111	115	finally
    //   113	115	115	finally
    //   131	135	142	java/io/IOException
    //   120	124	161	java/io/IOException
    //   15	43	180	finally
    //   15	43	186	java/io/IOException
  }

  // ERROR //
  public static StringBuilder readFile(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 231
    //   4: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 35	java/io/File
    //   10: dup
    //   11: aload_0
    //   12: invokespecial 38	java/io/File:<init>	(Ljava/lang/String;)V
    //   15: astore_2
    //   16: new 80	java/lang/StringBuilder
    //   19: dup
    //   20: ldc 186
    //   22: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: astore_3
    //   26: aload_2
    //   27: invokevirtual 117	java/io/File:isFile	()Z
    //   30: ifne +12 -> 42
    //   33: ldc 231
    //   35: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: aload_1
    //   39: astore_0
    //   40: aload_0
    //   41: areturn
    //   42: new 192	java/io/InputStreamReader
    //   45: astore_0
    //   46: new 233	java/io/FileInputStream
    //   49: astore_1
    //   50: aload_1
    //   51: aload_2
    //   52: invokespecial 235	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   55: aload_0
    //   56: aload_1
    //   57: invokespecial 207	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   60: new 209	java/io/BufferedReader
    //   63: astore_1
    //   64: aload_1
    //   65: aload_0
    //   66: invokespecial 212	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   69: aload_1
    //   70: astore_0
    //   71: aload_1
    //   72: invokevirtual 215	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   75: astore_2
    //   76: aload_2
    //   77: ifnull +80 -> 157
    //   80: aload_1
    //   81: astore_0
    //   82: aload_3
    //   83: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: ldc 186
    //   88: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   91: ifne +12 -> 103
    //   94: aload_1
    //   95: astore_0
    //   96: aload_3
    //   97: ldc 221
    //   99: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_1
    //   104: astore_0
    //   105: aload_3
    //   106: aload_2
    //   107: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: goto -42 -> 69
    //   114: astore_3
    //   115: aload_1
    //   116: astore_0
    //   117: new 223	java/lang/RuntimeException
    //   120: astore_2
    //   121: aload_1
    //   122: astore_0
    //   123: aload_2
    //   124: ldc 225
    //   126: aload_3
    //   127: invokespecial 228	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   130: aload_1
    //   131: astore_0
    //   132: ldc 231
    //   134: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   137: aload_1
    //   138: astore_0
    //   139: aload_2
    //   140: athrow
    //   141: astore_1
    //   142: aload_0
    //   143: ifnull +7 -> 150
    //   146: aload_0
    //   147: invokevirtual 229	java/io/BufferedReader:close	()V
    //   150: ldc 231
    //   152: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: aload_1
    //   156: athrow
    //   157: aload_1
    //   158: invokevirtual 229	java/io/BufferedReader:close	()V
    //   161: ldc 231
    //   163: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: aload_3
    //   167: astore_0
    //   168: goto -128 -> 40
    //   171: astore_0
    //   172: new 223	java/lang/RuntimeException
    //   175: dup
    //   176: ldc 225
    //   178: aload_0
    //   179: invokespecial 228	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   182: astore_0
    //   183: ldc 231
    //   185: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: aload_0
    //   189: athrow
    //   190: astore_0
    //   191: new 223	java/lang/RuntimeException
    //   194: dup
    //   195: ldc 225
    //   197: aload_0
    //   198: invokespecial 228	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   201: astore_0
    //   202: ldc 231
    //   204: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload_0
    //   208: athrow
    //   209: astore_1
    //   210: aconst_null
    //   211: astore_0
    //   212: goto -70 -> 142
    //   215: astore_3
    //   216: aconst_null
    //   217: astore_1
    //   218: goto -103 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   71	76	114	java/io/IOException
    //   82	94	114	java/io/IOException
    //   96	103	114	java/io/IOException
    //   105	111	114	java/io/IOException
    //   71	76	141	finally
    //   82	94	141	finally
    //   96	103	141	finally
    //   105	111	141	finally
    //   117	121	141	finally
    //   123	130	141	finally
    //   132	137	141	finally
    //   139	141	141	finally
    //   157	161	171	java/io/IOException
    //   146	150	190	java/io/IOException
    //   42	69	209	finally
    //   42	69	215	java/io/IOException
  }

  public static boolean zipFileAtPath(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(118093);
    Object localObject1 = new File(paramString1);
    try
    {
      Object localObject2 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject2).<init>(paramString2);
      paramString2 = new java/util/zip/ZipOutputStream;
      Object localObject3 = new java/io/BufferedOutputStream;
      ((BufferedOutputStream)localObject3).<init>((OutputStream)localObject2);
      paramString2.<init>((OutputStream)localObject3);
      if (((File)localObject1).isDirectory())
      {
        zipSubFolder(paramString2, (File)localObject1, ((File)localObject1).getParent().length());
        paramString2.close();
        bool = true;
        AppMethodBeat.o(118093);
        return bool;
      }
      localObject2 = new byte[2048];
      localObject3 = new java/io/FileInputStream;
      ((FileInputStream)localObject3).<init>(paramString1);
      localObject1 = new java/io/BufferedInputStream;
      ((BufferedInputStream)localObject1).<init>((InputStream)localObject3, 2048);
      localObject3 = new java/util/zip/ZipEntry;
      ((ZipEntry)localObject3).<init>(getLastPathComponent(paramString1));
      paramString2.putNextEntry((ZipEntry)localObject3);
      while (true)
      {
        int i = ((BufferedInputStream)localObject1).read((byte[])localObject2, 0, 2048);
        if (i == -1)
          break;
        paramString2.write((byte[])localObject2, 0, i);
      }
    }
    catch (Exception paramString1)
    {
      while (true)
        AppMethodBeat.o(118093);
    }
  }

  private static void zipSubFolder(ZipOutputStream paramZipOutputStream, File paramFile, int paramInt)
  {
    AppMethodBeat.i(118094);
    paramFile = paramFile.listFiles();
    int i = paramFile.length;
    int j = 0;
    if (j < i)
    {
      Object localObject1 = paramFile[j];
      if (((File)localObject1).isDirectory())
        zipSubFolder(paramZipOutputStream, (File)localObject1, paramInt);
      while (true)
      {
        j++;
        break;
        byte[] arrayOfByte = new byte[2048];
        Object localObject2 = ((File)localObject1).getPath();
        localObject1 = ((String)localObject2).substring(paramInt);
        localObject2 = new BufferedInputStream(new FileInputStream((String)localObject2), 2048);
        paramZipOutputStream.putNextEntry(new ZipEntry((String)localObject1));
        while (true)
        {
          int k = ((BufferedInputStream)localObject2).read(arrayOfByte, 0, 2048);
          if (k == -1)
            break;
          paramZipOutputStream.write(arrayOfByte, 0, k);
        }
        ((BufferedInputStream)localObject2).close();
      }
    }
    AppMethodBeat.o(118094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.YTFileUtils
 * JD-Core Version:    0.6.2
 */
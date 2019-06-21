package com.tencent.mm.graphics;

import android.content.res.AssetManager.AssetInputStream;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.annotation.Keep;
import android.util.TypedValue;
import com.tencent.e.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

@Keep
public class MMBitmapFactory
{
  private static final int DENSITY_DEFAULT = 160;
  private static final int REWIND_BUFFER_SIZE = 262144;
  private static final String TAG = "MicroMsg.MMBitmapFactory";
  private static final int TEMP_STORAGE_SIZE = 4096;

  static
  {
    AppMethodBeat.i(57658);
    loadNativeModule("mmimgcodec");
    AppMethodBeat.o(57658);
  }

  private MMBitmapFactory()
  {
    AppMethodBeat.i(57657);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(57657);
    throw localUnsupportedOperationException;
  }

  public static void addExternalCodecLibDir(String paramString)
  {
    AppMethodBeat.i(57633);
    b.i("MicroMsg.MMBitmapFactory", "[+] add external codec library path: %s", new Object[] { paramString });
    nativeAddExternalLibDir(paramString);
    AppMethodBeat.o(57633);
  }

  private static void announceDecodeResult(BitmapFactory.Options paramOptions, Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(138193);
    assertNotNull(paramOptions, "[-] opts is null.");
    String str;
    if (paramBoolean)
    {
      str = "system";
      if (((paramBitmap == null) && (paramOptions.outMimeType == null)) || (paramOptions.outWidth <= 0) || (paramOptions.outHeight <= 0))
        break label107;
      b.i("MicroMsg.MMBitmapFactory", "[+] decode success by %s, w:%s, h:%s, mime-type:%s, sampleSize:%s", new Object[] { str, Integer.valueOf(paramOptions.outWidth), Integer.valueOf(paramOptions.outHeight), paramOptions.outMimeType, Integer.valueOf(paramOptions.inSampleSize) });
      AppMethodBeat.o(138193);
    }
    while (true)
    {
      return;
      str = "mmcodec";
      break;
      label107: b.e("MicroMsg.MMBitmapFactory", "[+] fail to decode by %s", new Object[] { str });
      AppMethodBeat.o(138193);
    }
  }

  private static void assertNotNull(Object paramObject, String paramString)
  {
    AppMethodBeat.i(57652);
    if (paramObject == null)
    {
      paramObject = new IllegalArgumentException(paramString);
      AppMethodBeat.o(57652);
      throw paramObject;
    }
    AppMethodBeat.o(57652);
  }

  private static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(57653);
    if (paramCloseable == null)
      AppMethodBeat.o(57653);
    while (true)
    {
      return;
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(57653);
      }
      catch (Throwable paramCloseable)
      {
        AppMethodBeat.o(57653);
      }
    }
  }

  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57643);
    assertNotNull(paramArrayOfByte, "'data' is null.");
    paramArrayOfByte = decodeByteArrayInternal(paramArrayOfByte, paramInt1, paramInt2, null);
    AppMethodBeat.o(57643);
    return paramArrayOfByte;
  }

  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57644);
    assertNotNull(paramArrayOfByte, "'data' is null.");
    paramArrayOfByte = decodeByteArrayInternal(paramArrayOfByte, paramInt1, paramInt2, paramOptions);
    AppMethodBeat.o(57644);
    return paramArrayOfByte;
  }

  private static Bitmap decodeByteArrayInternal(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions)
  {
    int i = 0;
    AppMethodBeat.i(57645);
    BitmapFactory.Options localOptions = paramOptions;
    if (paramOptions == null)
      localOptions = new BitmapFactory.Options();
    if (isForceSystemDecoder(localOptions))
    {
      b.w("MicroMsg.MMBitmapFactory", "[!] force decoding data by system codec.");
      paramArrayOfByte = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, localOptions);
      announceDecodeResult(localOptions, paramArrayOfByte, true);
      AppMethodBeat.o(57645);
    }
    while (true)
    {
      return paramArrayOfByte;
      try
      {
        paramOptions = nativeDecodeByteArray(paramArrayOfByte, paramInt1, paramInt2, localOptions);
        if (localOptions.outMimeType != null)
          i = 1;
        if (i != 0)
        {
          announceDecodeResult(localOptions, paramOptions, false);
          setDensityFromOptions(paramOptions, localOptions);
          paramArrayOfByte = scaleBitmapOnDemand(paramOptions, localOptions);
          AppMethodBeat.o(57645);
        }
        else
        {
          b.w("MicroMsg.MMBitmapFactory", "[!] unsupported image format, try to decode with system codec.");
          paramArrayOfByte = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, localOptions);
          announceDecodeResult(localOptions, paramArrayOfByte, true);
          AppMethodBeat.o(57645);
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        b.b("MicroMsg.MMBitmapFactory", paramArrayOfByte, "decode failed.");
        paramArrayOfByte = null;
        AppMethodBeat.o(57645);
      }
    }
  }

  public static Bitmap decodeFile(String paramString)
  {
    AppMethodBeat.i(57637);
    assertNotNull(paramString, "'pathName' is null.");
    paramString = decodeFileInternal(paramString, null);
    AppMethodBeat.o(57637);
    return paramString;
  }

  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57638);
    assertNotNull(paramString, "'pathName' is null.");
    paramString = decodeFileInternal(paramString, paramOptions);
    AppMethodBeat.o(57638);
    return paramString;
  }

  public static Bitmap decodeFileDescriptor(FileDescriptor paramFileDescriptor)
  {
    AppMethodBeat.i(57640);
    assertNotNull(paramFileDescriptor, "'fd' is null.");
    paramFileDescriptor = decodeFileDescriptorInternal(paramFileDescriptor, null, null);
    AppMethodBeat.o(57640);
    return paramFileDescriptor;
  }

  public static Bitmap decodeFileDescriptor(FileDescriptor paramFileDescriptor, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57641);
    assertNotNull(paramFileDescriptor, "'fd' is null.");
    paramFileDescriptor = decodeFileDescriptorInternal(paramFileDescriptor, paramRect, paramOptions);
    AppMethodBeat.o(57641);
    return paramFileDescriptor;
  }

  // ERROR //
  private static Bitmap decodeFileDescriptorInternal(FileDescriptor paramFileDescriptor, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 183
    //   4: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_2
    //   8: astore 4
    //   10: aload_2
    //   11: ifnonnull +12 -> 23
    //   14: new 73	android/graphics/BitmapFactory$Options
    //   17: dup
    //   18: invokespecial 127	android/graphics/BitmapFactory$Options:<init>	()V
    //   21: astore 4
    //   23: aload 4
    //   25: invokestatic 131	com/tencent/mm/graphics/MMBitmapFactory:isForceSystemDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   28: ifeq +40 -> 68
    //   31: ldc 20
    //   33: ldc 185
    //   35: iconst_1
    //   36: anewarray 4	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_0
    //   42: aastore
    //   43: invokestatic 187	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: aload_0
    //   47: aload_1
    //   48: aload 4
    //   50: invokestatic 189	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   53: astore_0
    //   54: aload 4
    //   56: aload_0
    //   57: iconst_1
    //   58: invokestatic 143	com/tencent/mm/graphics/MMBitmapFactory:announceDecodeResult	(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;Z)V
    //   61: ldc 183
    //   63: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: aload_0
    //   67: areturn
    //   68: aload_0
    //   69: invokestatic 193	com/tencent/mm/graphics/MMBitmapFactory:nativeIsSeekable	(Ljava/io/FileDescriptor;)Z
    //   72: ifeq +107 -> 179
    //   75: aload_0
    //   76: aload 4
    //   78: invokestatic 197	com/tencent/mm/graphics/MMBitmapFactory:getOrCreateStorageBuffer	(Landroid/graphics/BitmapFactory$Options;)[B
    //   81: aload_1
    //   82: aload 4
    //   84: invokestatic 201	com/tencent/mm/graphics/MMBitmapFactory:nativeDecodeFileDescriptor	(Ljava/io/FileDescriptor;[BLandroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   87: astore_2
    //   88: aload 4
    //   90: getfield 76	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   93: ifnull +5 -> 98
    //   96: iconst_1
    //   97: istore_3
    //   98: iload_3
    //   99: ifeq +31 -> 130
    //   102: aload 4
    //   104: aload_2
    //   105: iconst_0
    //   106: invokestatic 143	com/tencent/mm/graphics/MMBitmapFactory:announceDecodeResult	(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;Z)V
    //   109: aload_2
    //   110: aload 4
    //   112: invokestatic 150	com/tencent/mm/graphics/MMBitmapFactory:setDensityFromOptions	(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)V
    //   115: aload_2
    //   116: aload 4
    //   118: invokestatic 154	com/tencent/mm/graphics/MMBitmapFactory:scaleBitmapOnDemand	(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   121: astore_0
    //   122: ldc 183
    //   124: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: goto -61 -> 66
    //   130: ldc 20
    //   132: ldc 156
    //   134: invokestatic 137	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: aload_0
    //   138: aload_1
    //   139: aload 4
    //   141: invokestatic 189	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   144: astore_0
    //   145: aload 4
    //   147: aload_0
    //   148: iconst_1
    //   149: invokestatic 143	com/tencent/mm/graphics/MMBitmapFactory:announceDecodeResult	(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;Z)V
    //   152: ldc 183
    //   154: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: goto -91 -> 66
    //   160: astore_0
    //   161: ldc 20
    //   163: aload_0
    //   164: ldc 158
    //   166: invokestatic 162	com/tencent/e/a/b:b	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   169: ldc 183
    //   171: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aconst_null
    //   175: astore_0
    //   176: goto -110 -> 66
    //   179: new 203	java/io/FileInputStream
    //   182: astore_2
    //   183: aload_2
    //   184: aload_0
    //   185: invokespecial 206	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   188: aload_2
    //   189: astore_0
    //   190: aload_2
    //   191: aload_1
    //   192: aload 4
    //   194: invokestatic 210	com/tencent/mm/graphics/MMBitmapFactory:decodeStreamInternal	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   197: astore_1
    //   198: aload_1
    //   199: astore_0
    //   200: aload_2
    //   201: invokestatic 212	com/tencent/mm/graphics/MMBitmapFactory:closeQuietly	(Ljava/io/Closeable;)V
    //   204: ldc 183
    //   206: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -143 -> 66
    //   212: astore 4
    //   214: aconst_null
    //   215: astore_1
    //   216: aload_1
    //   217: astore_0
    //   218: ldc 20
    //   220: aload 4
    //   222: ldc 158
    //   224: invokestatic 162	com/tencent/e/a/b:b	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   227: aload_1
    //   228: invokestatic 212	com/tencent/mm/graphics/MMBitmapFactory:closeQuietly	(Ljava/io/Closeable;)V
    //   231: ldc 183
    //   233: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: aconst_null
    //   237: astore_0
    //   238: goto -172 -> 66
    //   241: astore_1
    //   242: aconst_null
    //   243: astore_0
    //   244: aload_0
    //   245: invokestatic 212	com/tencent/mm/graphics/MMBitmapFactory:closeQuietly	(Ljava/io/Closeable;)V
    //   248: ldc 183
    //   250: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   253: aload_1
    //   254: athrow
    //   255: astore_1
    //   256: goto -12 -> 244
    //   259: astore 4
    //   261: aload_2
    //   262: astore_1
    //   263: goto -47 -> 216
    //
    // Exception table:
    //   from	to	target	type
    //   75	88	160	java/lang/Throwable
    //   88	96	160	java/lang/Throwable
    //   102	122	160	java/lang/Throwable
    //   130	152	160	java/lang/Throwable
    //   179	188	212	java/lang/Throwable
    //   179	188	241	finally
    //   190	198	255	finally
    //   218	227	255	finally
    //   190	198	259	java/lang/Throwable
  }

  // ERROR //
  private static Bitmap decodeFileInternal(String paramString, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 213
    //   4: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: astore_3
    //   9: aload_1
    //   10: ifnonnull +11 -> 21
    //   13: new 73	android/graphics/BitmapFactory$Options
    //   16: dup
    //   17: invokespecial 127	android/graphics/BitmapFactory$Options:<init>	()V
    //   20: astore_3
    //   21: aload_3
    //   22: invokestatic 131	com/tencent/mm/graphics/MMBitmapFactory:isForceSystemDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   25: ifeq +37 -> 62
    //   28: ldc 20
    //   30: ldc 215
    //   32: iconst_1
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: aload_0
    //   39: aastore
    //   40: invokestatic 187	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   43: aload_0
    //   44: aload_3
    //   45: invokestatic 217	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   48: astore_0
    //   49: aload_3
    //   50: aload_0
    //   51: iconst_1
    //   52: invokestatic 143	com/tencent/mm/graphics/MMBitmapFactory:announceDecodeResult	(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;Z)V
    //   55: ldc 213
    //   57: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: aload_0
    //   61: areturn
    //   62: new 203	java/io/FileInputStream
    //   65: astore_1
    //   66: aload_1
    //   67: aload_0
    //   68: invokespecial 218	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   71: aload_1
    //   72: invokestatic 222	com/tencent/mm/graphics/MMBitmapFactory:wrapUnResetableStreamOnDemand	(Ljava/io/InputStream;)Ljava/io/InputStream;
    //   75: astore 4
    //   77: aload 4
    //   79: astore_1
    //   80: aload 4
    //   82: invokestatic 226	com/tencent/mm/graphics/MMBitmapFactory:getCompatibleRewindBufferSize	()I
    //   85: invokevirtual 231	java/io/InputStream:mark	(I)V
    //   88: aload 4
    //   90: astore_1
    //   91: aload 4
    //   93: aconst_null
    //   94: aload_3
    //   95: invokestatic 234	com/tencent/mm/graphics/MMBitmapFactory:nativeDecodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   98: astore 5
    //   100: aload 4
    //   102: astore_1
    //   103: aload_3
    //   104: getfield 76	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   107: ifnull +5 -> 112
    //   110: iconst_1
    //   111: istore_2
    //   112: iload_2
    //   113: ifeq +45 -> 158
    //   116: aload 4
    //   118: astore_1
    //   119: aload_3
    //   120: aload 5
    //   122: iconst_0
    //   123: invokestatic 143	com/tencent/mm/graphics/MMBitmapFactory:announceDecodeResult	(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;Z)V
    //   126: aload 4
    //   128: astore_1
    //   129: aload 5
    //   131: aload_3
    //   132: invokestatic 150	com/tencent/mm/graphics/MMBitmapFactory:setDensityFromOptions	(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)V
    //   135: aload 4
    //   137: astore_1
    //   138: aload 5
    //   140: aload_3
    //   141: invokestatic 154	com/tencent/mm/graphics/MMBitmapFactory:scaleBitmapOnDemand	(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   144: astore_0
    //   145: aload 4
    //   147: invokestatic 212	com/tencent/mm/graphics/MMBitmapFactory:closeQuietly	(Ljava/io/Closeable;)V
    //   150: ldc 213
    //   152: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -95 -> 60
    //   158: aload 4
    //   160: astore_1
    //   161: ldc 20
    //   163: ldc 156
    //   165: invokestatic 137	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: aload 4
    //   170: astore_1
    //   171: aload 4
    //   173: invokevirtual 237	java/io/InputStream:reset	()V
    //   176: aload 4
    //   178: astore_1
    //   179: aload_0
    //   180: aload_3
    //   181: invokestatic 217	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   184: astore_0
    //   185: aload 4
    //   187: astore_1
    //   188: aload_3
    //   189: aload_0
    //   190: iconst_1
    //   191: invokestatic 143	com/tencent/mm/graphics/MMBitmapFactory:announceDecodeResult	(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;Z)V
    //   194: aload 4
    //   196: invokestatic 212	com/tencent/mm/graphics/MMBitmapFactory:closeQuietly	(Ljava/io/Closeable;)V
    //   199: ldc 213
    //   201: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: goto -144 -> 60
    //   207: astore_0
    //   208: aconst_null
    //   209: astore 4
    //   211: aload 4
    //   213: astore_1
    //   214: ldc 20
    //   216: aload_0
    //   217: ldc 158
    //   219: invokestatic 162	com/tencent/e/a/b:b	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   222: aload 4
    //   224: invokestatic 212	com/tencent/mm/graphics/MMBitmapFactory:closeQuietly	(Ljava/io/Closeable;)V
    //   227: ldc 213
    //   229: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: aconst_null
    //   233: astore_0
    //   234: goto -174 -> 60
    //   237: astore_0
    //   238: aconst_null
    //   239: astore_1
    //   240: aload_1
    //   241: invokestatic 212	com/tencent/mm/graphics/MMBitmapFactory:closeQuietly	(Ljava/io/Closeable;)V
    //   244: ldc 213
    //   246: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: aload_0
    //   250: athrow
    //   251: astore_0
    //   252: goto -12 -> 240
    //   255: astore_0
    //   256: goto -45 -> 211
    //
    // Exception table:
    //   from	to	target	type
    //   62	77	207	java/lang/Throwable
    //   62	77	237	finally
    //   80	88	251	finally
    //   91	100	251	finally
    //   103	110	251	finally
    //   119	126	251	finally
    //   129	135	251	finally
    //   138	145	251	finally
    //   161	168	251	finally
    //   171	176	251	finally
    //   179	185	251	finally
    //   188	194	251	finally
    //   214	222	251	finally
    //   80	88	255	java/lang/Throwable
    //   91	100	255	java/lang/Throwable
    //   103	110	255	java/lang/Throwable
    //   119	126	255	java/lang/Throwable
    //   129	135	255	java/lang/Throwable
    //   138	145	255	java/lang/Throwable
    //   161	168	255	java/lang/Throwable
    //   171	176	255	java/lang/Throwable
    //   179	185	255	java/lang/Throwable
    //   188	194	255	java/lang/Throwable
  }

  public static Bitmap decodeResource(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(57634);
    b.d("MicroMsg.MMBitmapFactory", "[*] transfer invocation to BitmapFactory.decodeResource, res: %s, id: %s", new Object[] { paramResources, Integer.valueOf(paramInt) });
    paramResources = BitmapFactory.decodeResource(paramResources, paramInt);
    AppMethodBeat.o(57634);
    return paramResources;
  }

  public static Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57635);
    b.d("MicroMsg.MMBitmapFactory", "[*] transfer invocation to BitmapFactory.decodeResource, res: %s, id: %s, opts: %s", new Object[] { paramResources, Integer.valueOf(paramInt), paramOptions });
    paramResources = BitmapFactory.decodeResource(paramResources, paramInt, paramOptions);
    AppMethodBeat.o(57635);
    return paramResources;
  }

  public static Bitmap decodeResourceStream(Resources paramResources, TypedValue paramTypedValue, InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57636);
    b.d("MicroMsg.MMBitmapFactory", "[*] transfer invocation to BitmapFactory.decodeResourceStream, res: %s, value: %s, is: %s, pad: %s, opts: %s", new Object[] { paramResources, paramTypedValue, paramInputStream, paramRect, paramOptions });
    paramResources = BitmapFactory.decodeResourceStream(paramResources, paramTypedValue, paramInputStream, paramRect, paramOptions);
    AppMethodBeat.o(57636);
    return paramResources;
  }

  public static Bitmap decodeStream(InputStream paramInputStream)
  {
    AppMethodBeat.i(57646);
    assertNotNull(paramInputStream, "'is' is null.");
    paramInputStream = decodeStreamInternal(paramInputStream, null, null);
    AppMethodBeat.o(57646);
    return paramInputStream;
  }

  public static Bitmap decodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57647);
    assertNotNull(paramInputStream, "'is' is null.");
    paramInputStream = decodeStreamInternal(paramInputStream, paramRect, paramOptions);
    AppMethodBeat.o(57647);
    return paramInputStream;
  }

  private static Bitmap decodeStreamInternal(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    int i = 0;
    AppMethodBeat.i(57648);
    BitmapFactory.Options localOptions = paramOptions;
    if (paramOptions == null)
      localOptions = new BitmapFactory.Options();
    int j;
    if ((paramInputStream instanceof AssetManager.AssetInputStream))
    {
      b.w("MicroMsg.MMBitmapFactory", "[!] force decoding stream by system codec since it's asset stream.");
      j = 1;
    }
    while (true)
    {
      if (j != 0)
      {
        paramInputStream = BitmapFactory.decodeStream(paramInputStream, paramRect, localOptions);
        announceDecodeResult(localOptions, paramInputStream, true);
        AppMethodBeat.o(57648);
      }
      while (true)
      {
        return paramInputStream;
        if (!isForceSystemDecoder(localOptions))
          break label222;
        b.w("MicroMsg.MMBitmapFactory", "[!] force decoding stream by system codec since specific options.");
        j = 1;
        break;
        try
        {
          paramInputStream = wrapUnResetableStreamOnDemand(paramInputStream);
          paramInputStream.mark(getCompatibleRewindBufferSize());
          paramOptions = nativeDecodeStream(paramInputStream, paramRect, localOptions);
          j = i;
          if (localOptions.outMimeType != null)
            j = 1;
          if (j != 0)
          {
            announceDecodeResult(localOptions, paramOptions, false);
            setDensityFromOptions(paramOptions, localOptions);
            paramInputStream = scaleBitmapOnDemand(paramOptions, localOptions);
            AppMethodBeat.o(57648);
          }
          else
          {
            b.w("MicroMsg.MMBitmapFactory", "[!] unsupported image format, try to decode with system codec.");
            paramInputStream.reset();
            paramInputStream.mark(getCompatibleRewindBufferSize());
            paramInputStream = BitmapFactory.decodeStream(paramInputStream, paramRect, localOptions);
            announceDecodeResult(localOptions, paramInputStream, true);
            AppMethodBeat.o(57648);
          }
        }
        catch (Throwable paramInputStream)
        {
          b.b("MicroMsg.MMBitmapFactory", paramInputStream, "decode failed.");
          paramInputStream = null;
          AppMethodBeat.o(57648);
        }
      }
      label222: j = 0;
    }
  }

  private static int getCompatibleRewindBufferSize()
  {
    AppMethodBeat.i(138505);
    int i;
    if ("HUAWEI".equals(Build.MANUFACTURER))
    {
      i = 8388608;
      AppMethodBeat.o(138505);
    }
    while (true)
    {
      return i;
      i = 262144;
      AppMethodBeat.o(138505);
    }
  }

  private static byte[] getOrCreateStorageBuffer(BitmapFactory.Options paramOptions)
  {
    if (paramOptions != null)
    {
      paramOptions = paramOptions.inTempStorage;
      if (paramOptions == null)
        break label20;
    }
    while (true)
    {
      return paramOptions;
      paramOptions = null;
      break;
      label20: paramOptions = new byte[4096];
    }
  }

  public static String getVersion()
  {
    return "0.2.18";
  }

  private static boolean isForceSystemDecoder(BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57651);
    boolean bool;
    if ((paramOptions != null) && (Build.VERSION.SDK_INT >= 26) && (Bitmap.Config.HARDWARE.equals(paramOptions.inPreferredConfig)))
    {
      bool = true;
      AppMethodBeat.o(57651);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(57651);
    }
  }

  private static void loadNativeModule(String paramString)
  {
    AppMethodBeat.i(57656);
    try
    {
      System.loadLibrary(paramString);
      b.i("MicroMsg.MMBitmapFactory", "Successfully load native module: %s", new Object[] { paramString });
      AppMethodBeat.o(57656);
      return;
    }
    catch (Throwable localThrowable)
    {
      b.b("MicroMsg.MMBitmapFactory", localThrowable, "Fail to load native module: %s", new Object[] { paramString });
      paramString = new RuntimeException(localThrowable);
      AppMethodBeat.o(57656);
    }
    throw paramString;
  }

  private static native void nativeAddExternalLibDir(String paramString);

  private static native Bitmap nativeDecodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions);

  private static native Bitmap nativeDecodeFileDescriptor(FileDescriptor paramFileDescriptor, byte[] paramArrayOfByte, Rect paramRect, BitmapFactory.Options paramOptions);

  private static native Bitmap nativeDecodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions);

  private static native boolean nativeIsSeekable(FileDescriptor paramFileDescriptor);

  private static native int nativePinBitmap(Bitmap paramBitmap);

  private static native int nativeUnPinBitmap(Bitmap paramBitmap);

  public static Bitmap pinBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(57649);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      b.i("MicroMsg.MMBitmapFactory", "[tomys] Try to pin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", new Object[] { paramBitmap, Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), paramBitmap.getConfig(), Integer.valueOf(paramBitmap.getByteCount()) });
      int i = nativePinBitmap(paramBitmap);
      if (i < 0)
        b.e("MicroMsg.MMBitmapFactory", "pinBitmap failed, ret: %s", new Object[] { Integer.valueOf(i) });
    }
    AppMethodBeat.o(57649);
    return paramBitmap;
  }

  private static Bitmap scaleBitmapOnDemand(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57654);
    if ((paramBitmap == null) || (paramOptions == null))
      AppMethodBeat.o(57654);
    while (true)
    {
      return paramBitmap;
      if (paramOptions.inScaled)
        break;
      AppMethodBeat.o(57654);
    }
    int i = paramOptions.inDensity;
    int j = paramOptions.inTargetDensity;
    int k = paramOptions.inScreenDensity;
    if ((i != 0) && (j != 0) && (i != k));
    for (float f1 = j / i; ; f1 = 1.0F)
    {
      if (f1 == 1.0F)
      {
        AppMethodBeat.o(57654);
        break;
      }
      j = (int)(paramBitmap.getWidth() * f1 + 0.5F);
      k = (int)(f1 * paramBitmap.getHeight() + 0.5F);
      f1 = j / paramBitmap.getWidth();
      float f2 = k / paramBitmap.getHeight();
      b.d("MicroMsg.MMBitmapFactory", "[+] Bmp to scale: [sw: %s, sh: %s, dw: %s, dh: %s, scX: %s, scY: %s]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(j), Integer.valueOf(k), Float.valueOf(f1), Float.valueOf(f2) });
      paramOptions = new Matrix();
      paramOptions.setScale(f1, f2);
      paramOptions = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), paramOptions, true);
      if (paramOptions != paramBitmap)
        paramBitmap.recycle();
      AppMethodBeat.o(57654);
      paramBitmap = paramOptions;
      break;
    }
  }

  private static void setDensityFromOptions(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(57655);
    if ((paramBitmap == null) || (paramOptions == null))
      AppMethodBeat.o(57655);
    while (true)
    {
      return;
      int i = paramOptions.inDensity;
      if (i != 0)
      {
        paramBitmap.setDensity(i);
        int j = paramOptions.inTargetDensity;
        if ((j == 0) || (i == j) || (i == paramOptions.inScreenDensity))
        {
          AppMethodBeat.o(57655);
        }
        else
        {
          byte[] arrayOfByte = paramBitmap.getNinePatchChunk();
          if ((arrayOfByte != null) && (NinePatch.isNinePatchChunk(arrayOfByte)));
          for (i = 1; ; i = 0)
          {
            if ((paramOptions.inScaled) || (i != 0))
              paramBitmap.setDensity(j);
            AppMethodBeat.o(57655);
            break;
          }
        }
      }
      else
      {
        if (paramOptions.inBitmap != null)
          paramBitmap.setDensity(160);
        AppMethodBeat.o(57655);
      }
    }
  }

  public static Bitmap unPinBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(57650);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      b.i("MicroMsg.MMBitmapFactory", "[tomys] Try to unpin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", new Object[] { paramBitmap, Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), paramBitmap.getConfig(), Integer.valueOf(paramBitmap.getByteCount()) });
      int i = nativeUnPinBitmap(paramBitmap);
      if (i < 0)
        b.e("MicroMsg.MMBitmapFactory", "unPinBitmap failed, ret: %s", new Object[] { Integer.valueOf(i) });
    }
    AppMethodBeat.o(57650);
    return paramBitmap;
  }

  private static InputStream wrapUnResetableStreamOnDemand(InputStream paramInputStream)
  {
    AppMethodBeat.i(138506);
    if (paramInputStream.markSupported())
      AppMethodBeat.o(138506);
    while (true)
    {
      return paramInputStream;
      if ((paramInputStream instanceof FileInputStream))
      {
        paramInputStream = new a((FileInputStream)paramInputStream);
        AppMethodBeat.o(138506);
      }
      else
      {
        paramInputStream = new BufferedInputStream(paramInputStream);
        AppMethodBeat.o(138506);
      }
    }
  }

  @Keep
  public static class Options extends BitmapFactory.Options
  {

    @Keep
    public boolean inUseSmoothSample = false;
  }

  static final class a extends FilterInputStream
  {
    private long eCr = 0L;

    public a(FileInputStream paramFileInputStream)
    {
      super();
    }

    public final void mark(int paramInt)
    {
      try
      {
        AppMethodBeat.i(138503);
        try
        {
          this.eCr = ((FileInputStream)this.in).getChannel().position();
          AppMethodBeat.o(138503);
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b.b("MicroMsg.MMBitmapFactory", localIOException, "fail to mark position.");
            this.eCr = -1L;
            AppMethodBeat.o(138503);
          }
        }
      }
      finally
      {
      }
    }

    public final boolean markSupported()
    {
      return true;
    }

    public final void reset()
    {
      try
      {
        AppMethodBeat.i(138504);
        if (this.eCr < 0L)
        {
          IOException localIOException = new java/io/IOException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Illegal marked position: ");
          localIOException.<init>(this.eCr);
          AppMethodBeat.o(138504);
          throw localIOException;
        }
      }
      finally
      {
      }
      ((FileInputStream)this.in).getChannel().position(this.eCr);
      AppMethodBeat.o(138504);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.MMBitmapFactory
 * JD-Core Version:    0.6.2
 */
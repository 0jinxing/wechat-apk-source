package com.tencent.smtt.export.external;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class libwebp
{
  private static final int BITMAP_ALPHA_8 = 1;
  private static final int BITMAP_ARGB_4444 = 3;
  private static final int BITMAP_ARGB_8888 = 4;
  private static final int BITMAP_RGB_565 = 2;
  private static final String LOGTAG = "[image]";
  private static boolean isMultiCore = false;
  private static libwebp mInstance = null;
  private static boolean mIsLoadLibSuccess = false;
  private int mBitmapType = 4;

  public static int checkIsHuaModel()
  {
    int i = 1;
    AppMethodBeat.i(63832);
    String str1 = Build.BRAND.trim().toLowerCase();
    String str2 = Build.MODEL.trim().toLowerCase();
    int j = 0;
    int k = j;
    if (str1 != null)
    {
      k = j;
      if (str1.length() > 0)
      {
        k = j;
        if (str1.contains("huawei"))
          k = 1;
      }
    }
    if ((str2 != null) && (str2.length() > 0) && (str2.contains("huawei")))
      k = i;
    while (true)
    {
      AppMethodBeat.o(63832);
      return k;
    }
  }

  private String getCPUinfo()
  {
    AppMethodBeat.i(63826);
    String str1 = "";
    String str2 = str1;
    try
    {
      Object localObject2 = new java/lang/ProcessBuilder;
      str2 = str1;
      ((ProcessBuilder)localObject2).<init>(new String[] { "/system/bin/cat", "/proc/cpuinfo" });
      str2 = str1;
      localObject2 = ((ProcessBuilder)localObject2).start().getInputStream();
      str2 = str1;
      byte[] arrayOfByte = new byte[1024];
      while (true)
      {
        str2 = str1;
        if (((InputStream)localObject2).read(arrayOfByte) == -1)
          break;
        str2 = str1;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        str2 = str1;
        localStringBuilder.<init>();
        str2 = str1;
        localStringBuilder = localStringBuilder.append(str1);
        str2 = str1;
        String str3 = new java/lang/String;
        str2 = str1;
        str3.<init>(arrayOfByte);
        str2 = str1;
        str1 = str3;
      }
      str2 = str1;
      ((InputStream)localObject2).close();
      AppMethodBeat.o(63826);
      return str1;
    }
    catch (IOException localIOException)
    {
      while (true)
        Object localObject1 = str2;
    }
  }

  public static libwebp getInstance(Context paramContext)
  {
    AppMethodBeat.i(63822);
    if (mInstance == null)
    {
      loadWepLibraryIfNeed(paramContext);
      mInstance = new libwebp();
    }
    paramContext = mInstance;
    AppMethodBeat.o(63822);
    return paramContext;
  }

  private boolean isMultiCore()
  {
    AppMethodBeat.i(63825);
    boolean bool = getCPUinfo().contains("processor");
    AppMethodBeat.o(63825);
    return bool;
  }

  public static void loadWepLibraryIfNeed(Context paramContext)
  {
    AppMethodBeat.i(63824);
    if (!mIsLoadLibSuccess);
    while (true)
    {
      try
      {
        LibraryLoader.loadLibrary(paramContext, "webp_base");
        mIsLoadLibSuccess = true;
        AppMethodBeat.o(63824);
        return;
      }
      catch (UnsatisfiedLinkError paramContext)
      {
      }
      AppMethodBeat.o(63824);
    }
  }

  public static void loadWepLibraryIfNeed(Context paramContext, String paramString)
  {
    AppMethodBeat.i(63823);
    if (!mIsLoadLibSuccess);
    while (true)
    {
      try
      {
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        System.load(paramString + File.separator + "libwebp_base.so");
        mIsLoadLibSuccess = true;
        AppMethodBeat.o(63823);
        return;
      }
      catch (UnsatisfiedLinkError paramContext)
      {
      }
      AppMethodBeat.o(63823);
    }
  }

  public int[] decodeBase(byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(63828);
    if (!mIsLoadLibSuccess)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(63828);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = nativeDecode(paramArrayOfByte, isMultiCore, paramArrayOfInt1, paramArrayOfInt2);
      AppMethodBeat.o(63828);
    }
  }

  public int[] decodeBase_16bit(byte[] paramArrayOfByte, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(63829);
    if (!mIsLoadLibSuccess)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(63829);
      return paramArrayOfByte;
    }
    switch (libwebp.1.$SwitchMap$android$graphics$Bitmap$Config[paramConfig.ordinal()])
    {
    default:
      this.mBitmapType = 2;
    case 1:
    case 2:
    }
    while (true)
    {
      paramArrayOfByte = nativeDecode_16bit(paramArrayOfByte, isMultiCore, this.mBitmapType);
      AppMethodBeat.o(63829);
      break;
      this.mBitmapType = 3;
      continue;
      this.mBitmapType = 2;
    }
  }

  public int[] decodeInto(byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(63830);
    if (!mIsLoadLibSuccess)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(63830);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = nativeDecodeInto(paramArrayOfByte, isMultiCore, paramArrayOfInt1, paramArrayOfInt2);
      AppMethodBeat.o(63830);
    }
  }

  public int getInfo(byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(63827);
    int i;
    if (!mIsLoadLibSuccess)
    {
      i = 0;
      AppMethodBeat.o(63827);
    }
    while (true)
    {
      return i;
      i = nativeGetInfo(paramArrayOfByte, paramArrayOfInt1, paramArrayOfInt2);
      AppMethodBeat.o(63827);
    }
  }

  public int[] incDecode(byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(63831);
    if (!mIsLoadLibSuccess)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(63831);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = nativeIDecode(paramArrayOfByte, isMultiCore, paramArrayOfInt1, paramArrayOfInt2);
      AppMethodBeat.o(63831);
    }
  }

  public native int[] nativeDecode(byte[] paramArrayOfByte, boolean paramBoolean, int[] paramArrayOfInt1, int[] paramArrayOfInt2);

  public native int[] nativeDecodeInto(byte[] paramArrayOfByte, boolean paramBoolean, int[] paramArrayOfInt1, int[] paramArrayOfInt2);

  public native int[] nativeDecode_16bit(byte[] paramArrayOfByte, boolean paramBoolean, int paramInt);

  public native int nativeGetInfo(byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2);

  public native int[] nativeIDecode(byte[] paramArrayOfByte, boolean paramBoolean, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.libwebp
 * JD-Core Version:    0.6.2
 */
package com.github.henryye.nativeiv.comm;

import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.support.annotation.Keep;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.github.henryye.nativeiv.bitmap.c;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

@Keep
public class NativeImage
  implements IBitmap<NativeBitmapStruct>
{
  private static final String TAG = "Ni.NativeImage";
  private a factory;
  private NativeImageJni jni;
  private long lastDecodeUsing;
  private NativeBitmapStruct mNativeBitmapStruct;

  public NativeImage(NativeImageJni paramNativeImageJni, a parama)
  {
    AppMethodBeat.i(115761);
    this.mNativeBitmapStruct = null;
    this.lastDecodeUsing = -1L;
    this.jni = paramNativeImageJni;
    this.factory = parama;
    try
    {
      try
      {
        parama.aMo.put(Integer.valueOf(hashCode()), this);
        return;
      }
      finally
      {
      }
    }
    finally
    {
      AppMethodBeat.o(115761);
    }
    throw paramNativeImageJni;
  }

  // ERROR //
  public void decodeInputStream(InputStream paramInputStream, Bitmap.Config paramConfig, c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 71
    //   4: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 42	com/github/henryye/nativeiv/comm/NativeImage:factory	Lcom/github/henryye/nativeiv/comm/a;
    //   11: ifnonnull +11 -> 22
    //   14: ldc 71
    //   16: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: invokestatic 77	android/os/SystemClock:elapsedRealtime	()J
    //   25: lstore 4
    //   27: aload_1
    //   28: ifnonnull +18 -> 46
    //   31: ldc 12
    //   33: ldc 79
    //   35: iconst_0
    //   36: anewarray 5	java/lang/Object
    //   39: invokestatic 85	com/tencent/magicbrush/a/c$c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: invokevirtual 88	com/github/henryye/nativeiv/comm/NativeImage:recycle	()V
    //   46: aload_1
    //   47: invokestatic 94	com/github/henryye/nativeiv/b/a:f	(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
    //   50: astore_3
    //   51: aload_2
    //   52: ifnull +111 -> 163
    //   55: aload_2
    //   56: getstatic 100	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   59: if_acmpeq +104 -> 163
    //   62: aload_2
    //   63: getstatic 103	android/graphics/Bitmap$Config:ARGB_4444	Landroid/graphics/Bitmap$Config;
    //   66: if_acmpeq +97 -> 163
    //   69: aload_2
    //   70: getstatic 106	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   73: if_acmpeq +90 -> 163
    //   76: getstatic 109	android/graphics/Bitmap$Config:ALPHA_8	Landroid/graphics/Bitmap$Config;
    //   79: astore_1
    //   80: aload_2
    //   81: aload_1
    //   82: if_acmpne +76 -> 158
    //   85: iconst_2
    //   86: istore 6
    //   88: aload_3
    //   89: ifnull +117 -> 206
    //   92: aload_0
    //   93: getfield 40	com/github/henryye/nativeiv/comm/NativeImage:jni	Lcom/github/henryye/nativeiv/comm/NativeImageJni;
    //   96: astore_1
    //   97: aload_1
    //   98: getfield 114	com/github/henryye/nativeiv/comm/NativeImageJni:mNativeInst	J
    //   101: lconst_0
    //   102: lcmp
    //   103: ifeq +66 -> 169
    //   106: aload_1
    //   107: aload_1
    //   108: getfield 114	com/github/henryye/nativeiv/comm/NativeImageJni:mNativeInst	J
    //   111: aload_3
    //   112: iload 6
    //   114: invokevirtual 118	com/github/henryye/nativeiv/comm/NativeImageJni:nativeDecodeNative	(JLjava/nio/ByteBuffer;I)Lcom/github/henryye/nativeiv/comm/CommNativeBitmapStruct;
    //   117: astore_1
    //   118: aload_1
    //   119: ifnull +55 -> 174
    //   122: aload_0
    //   123: aload_1
    //   124: invokevirtual 124	com/github/henryye/nativeiv/comm/CommNativeBitmapStruct:convertToCommonStruct	()Lcom/github/henryye/nativeiv/comm/CommNativeBitmapStruct;
    //   127: putfield 34	com/github/henryye/nativeiv/comm/NativeImage:mNativeBitmapStruct	Lcom/github/henryye/nativeiv/bitmap/NativeBitmapStruct;
    //   130: aload_3
    //   131: invokevirtual 130	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   134: pop
    //   135: aload_0
    //   136: invokestatic 77	android/os/SystemClock:elapsedRealtime	()J
    //   139: lload 4
    //   141: lsub
    //   142: putfield 38	com/github/henryye/nativeiv/comm/NativeImage:lastDecodeUsing	J
    //   145: ldc 71
    //   147: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: goto -131 -> 19
    //   153: astore_1
    //   154: aload_0
    //   155: monitorexit
    //   156: aload_1
    //   157: athrow
    //   158: getstatic 136	android/os/Build$VERSION:SDK_INT	I
    //   161: istore 6
    //   163: iconst_4
    //   164: istore 6
    //   166: goto -78 -> 88
    //   169: aconst_null
    //   170: astore_1
    //   171: goto -53 -> 118
    //   174: ldc 12
    //   176: ldc 138
    //   178: iconst_0
    //   179: anewarray 5	java/lang/Object
    //   182: invokestatic 141	com/tencent/magicbrush/a/c$c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: goto -55 -> 130
    //   188: astore_1
    //   189: aload_0
    //   190: invokestatic 77	android/os/SystemClock:elapsedRealtime	()J
    //   193: lload 4
    //   195: lsub
    //   196: putfield 38	com/github/henryye/nativeiv/comm/NativeImage:lastDecodeUsing	J
    //   199: ldc 71
    //   201: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: aload_1
    //   205: athrow
    //   206: ldc 12
    //   208: ldc 143
    //   210: iconst_0
    //   211: anewarray 5	java/lang/Object
    //   214: invokestatic 85	com/tencent/magicbrush/a/c$c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: aload_0
    //   218: invokevirtual 88	com/github/henryye/nativeiv/comm/NativeImage:recycle	()V
    //   221: new 145	java/io/IOException
    //   224: astore_1
    //   225: aload_1
    //   226: ldc 147
    //   228: invokespecial 150	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   231: ldc 71
    //   233: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: aload_1
    //   237: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	19	153	finally
    //   22	27	153	finally
    //   31	46	153	finally
    //   46	51	153	finally
    //   55	80	153	finally
    //   135	150	153	finally
    //   158	163	153	finally
    //   189	206	153	finally
    //   92	118	188	finally
    //   122	130	188	finally
    //   130	135	188	finally
    //   174	185	188	finally
    //   206	238	188	finally
  }

  public void decodeInputStreamRegion(InputStream paramInputStream, Rect paramRect, Bitmap.Config paramConfig, c paramc)
  {
    AppMethodBeat.i(115763);
    paramInputStream = new IOException("Stub!");
    AppMethodBeat.o(115763);
    throw paramInputStream;
  }

  public com.github.henryye.nativeiv.bitmap.a<Integer> dump()
  {
    try
    {
      AppMethodBeat.i(115764);
      com.github.henryye.nativeiv.bitmap.a locala = new com/github/henryye/nativeiv/bitmap/a;
      locala.<init>();
      if (this.mNativeBitmapStruct != null)
      {
        locala.width = this.mNativeBitmapStruct.width;
        locala.height = this.mNativeBitmapStruct.height;
        locala.aMb = true;
        locala.aMc = Integer.valueOf(this.mNativeBitmapStruct.glFormat);
        locala.aMd = this.lastDecodeUsing;
      }
      AppMethodBeat.o(115764);
      return locala;
    }
    finally
    {
    }
  }

  public void forceSet(NativeBitmapStruct paramNativeBitmapStruct)
  {
    this.mNativeBitmapStruct = paramNativeBitmapStruct;
  }

  public long getDecodeTime()
  {
    return this.lastDecodeUsing;
  }

  @Keep
  public BitmapType getType()
  {
    return BitmapType.Native;
  }

  @Keep
  public NativeBitmapStruct provide()
  {
    return this.mNativeBitmapStruct;
  }

  @Keep
  public void recycle()
  {
    try
    {
      AppMethodBeat.i(115765);
      c.c.v("Ni.NativeImage", "hy: recycling %d", new Object[] { Integer.valueOf(hashCode()) });
      if ((this.mNativeBitmapStruct != null) && (this.mNativeBitmapStruct.ptr != -1L))
      {
        ??? = this.jni;
        long l = this.mNativeBitmapStruct.ptr;
        if (((NativeImageJni)???).mNativeInst != 0L)
          ((NativeImageJni)???).nativeRecycleNative(((NativeImageJni)???).mNativeInst, l);
        this.mNativeBitmapStruct = null;
      }
      if (this.factory != null);
      synchronized (this.factory)
      {
        ((a)???).aMo.remove(Integer.valueOf(hashCode()));
        this.factory = null;
        AppMethodBeat.o(115765);
        return;
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.comm.NativeImage
 * JD-Core Version:    0.6.2
 */
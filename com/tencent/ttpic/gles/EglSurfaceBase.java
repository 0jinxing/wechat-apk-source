package com.tencent.ttpic.gles;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(17)
public class EglSurfaceBase
{
  protected static final String TAG = GlUtil.TAG;
  private EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
  protected EglCore mEglCore;
  private int mHeight = -1;
  private int mWidth = -1;

  protected EglSurfaceBase(EglCore paramEglCore)
  {
    this.mEglCore = paramEglCore;
  }

  public void createOffscreenSurface(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49973);
    if (this.mEGLSurface != EGL14.EGL_NO_SURFACE)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("surface already created");
      AppMethodBeat.o(49973);
      throw localIllegalStateException;
    }
    this.mEGLSurface = this.mEglCore.createOffscreenSurface(paramInt1, paramInt2);
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    AppMethodBeat.o(49973);
  }

  public void createWindowSurface(Object paramObject)
  {
    AppMethodBeat.i(49972);
    if (this.mEGLSurface != EGL14.EGL_NO_SURFACE)
    {
      paramObject = new IllegalStateException("surface already created");
      AppMethodBeat.o(49972);
      throw paramObject;
    }
    this.mEGLSurface = this.mEglCore.createWindowSurface(paramObject);
    AppMethodBeat.o(49972);
  }

  public int getHeight()
  {
    AppMethodBeat.i(49975);
    int i;
    if (this.mHeight < 0)
    {
      i = this.mEglCore.querySurface(this.mEGLSurface, 12374);
      AppMethodBeat.o(49975);
    }
    while (true)
    {
      return i;
      i = this.mHeight;
      AppMethodBeat.o(49975);
    }
  }

  public int getWidth()
  {
    AppMethodBeat.i(49974);
    int i;
    if (this.mWidth < 0)
    {
      i = this.mEglCore.querySurface(this.mEGLSurface, 12375);
      AppMethodBeat.o(49974);
    }
    while (true)
    {
      return i;
      i = this.mWidth;
      AppMethodBeat.o(49974);
    }
  }

  public void makeCurrent()
  {
    AppMethodBeat.i(49977);
    this.mEglCore.makeCurrent(this.mEGLSurface);
    AppMethodBeat.o(49977);
  }

  public void makeCurrentReadFrom(EglSurfaceBase paramEglSurfaceBase)
  {
    AppMethodBeat.i(49978);
    this.mEglCore.makeCurrent(this.mEGLSurface, paramEglSurfaceBase.mEGLSurface);
    AppMethodBeat.o(49978);
  }

  public void releaseEglSurface()
  {
    AppMethodBeat.i(49976);
    this.mEglCore.releaseSurface(this.mEGLSurface);
    this.mEGLSurface = EGL14.EGL_NO_SURFACE;
    this.mHeight = -1;
    this.mWidth = -1;
    AppMethodBeat.o(49976);
  }

  // ERROR //
  public void saveFrame(java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 99
    //   2: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 41	com/tencent/ttpic/gles/EglSurfaceBase:mEglCore	Lcom/tencent/ttpic/gles/EglCore;
    //   9: aload_0
    //   10: getfield 35	com/tencent/ttpic/gles/EglSurfaceBase:mEGLSurface	Landroid/opengl/EGLSurface;
    //   13: invokevirtual 103	com/tencent/ttpic/gles/EglCore:isCurrent	(Landroid/opengl/EGLSurface;)Z
    //   16: ifne +20 -> 36
    //   19: new 105	java/lang/RuntimeException
    //   22: dup
    //   23: ldc 107
    //   25: invokespecial 108	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   28: astore_1
    //   29: ldc 99
    //   31: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: aload_1
    //   35: athrow
    //   36: aload_1
    //   37: invokevirtual 114	java/io/File:toString	()Ljava/lang/String;
    //   40: astore_2
    //   41: aload_0
    //   42: invokevirtual 116	com/tencent/ttpic/gles/EglSurfaceBase:getWidth	()I
    //   45: istore_3
    //   46: aload_0
    //   47: invokevirtual 118	com/tencent/ttpic/gles/EglSurfaceBase:getHeight	()I
    //   50: istore 4
    //   52: iload_3
    //   53: iload 4
    //   55: imul
    //   56: iconst_4
    //   57: imul
    //   58: invokestatic 124	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   61: astore 5
    //   63: aload 5
    //   65: getstatic 130	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   68: invokevirtual 134	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   71: pop
    //   72: iconst_0
    //   73: iconst_0
    //   74: iload_3
    //   75: iload 4
    //   77: sipush 6408
    //   80: sipush 5121
    //   83: aload 5
    //   85: invokestatic 140	android/opengl/GLES20:glReadPixels	(IIIIIILjava/nio/Buffer;)V
    //   88: ldc 141
    //   90: invokestatic 144	com/tencent/ttpic/gles/GlUtil:checkGlError	(Ljava/lang/String;)V
    //   93: aload 5
    //   95: invokevirtual 148	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   98: pop
    //   99: new 150	java/io/BufferedOutputStream
    //   102: astore_1
    //   103: new 152	java/io/FileOutputStream
    //   106: astore 6
    //   108: aload 6
    //   110: aload_2
    //   111: invokespecial 153	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   114: aload_1
    //   115: aload 6
    //   117: invokespecial 156	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   120: iload_3
    //   121: iload 4
    //   123: getstatic 162	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   126: invokestatic 168	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   129: astore 6
    //   131: aload 6
    //   133: aload 5
    //   135: invokevirtual 172	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   138: aload 6
    //   140: getstatic 178	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   143: bipush 90
    //   145: aload_1
    //   146: invokevirtual 182	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   149: pop
    //   150: aload 6
    //   152: invokevirtual 185	android/graphics/Bitmap:recycle	()V
    //   155: aload_1
    //   156: invokevirtual 188	java/io/BufferedOutputStream:close	()V
    //   159: new 190	java/lang/StringBuilder
    //   162: dup
    //   163: ldc 192
    //   165: invokespecial 193	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   168: iload_3
    //   169: invokevirtual 197	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   172: ldc 199
    //   174: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: iload 4
    //   179: invokevirtual 197	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   182: ldc 204
    //   184: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: aload_2
    //   188: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: ldc 206
    //   193: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: ldc 99
    //   199: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: return
    //   203: astore_2
    //   204: aconst_null
    //   205: astore_1
    //   206: aload_1
    //   207: ifnull +7 -> 214
    //   210: aload_1
    //   211: invokevirtual 188	java/io/BufferedOutputStream:close	()V
    //   214: ldc 99
    //   216: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: aload_2
    //   220: athrow
    //   221: astore_2
    //   222: goto -16 -> 206
    //
    // Exception table:
    //   from	to	target	type
    //   99	120	203	finally
    //   120	155	221	finally
  }

  public void setPresentationTime(long paramLong)
  {
    AppMethodBeat.i(49980);
    this.mEglCore.setPresentationTime(this.mEGLSurface, paramLong);
    AppMethodBeat.o(49980);
  }

  public boolean swapBuffers()
  {
    AppMethodBeat.i(49979);
    boolean bool = this.mEglCore.swapBuffers(this.mEGLSurface);
    AppMethodBeat.o(49979);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.gles.EglSurfaceBase
 * JD-Core Version:    0.6.2
 */
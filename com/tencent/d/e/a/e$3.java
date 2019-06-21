package com.tencent.d.e.a;

import android.util.SparseArray;
import com.tencent.d.e.a.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class e$3 extends c
{
  e$3(e parame, int paramInt1, int paramInt2, int paramInt3, SparseArray paramSparseArray, List paramList)
  {
  }

  // ERROR //
  public final void dQt()
  {
    // Byte code:
    //   0: ldc 43
    //   2: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 23	com/tencent/d/e/a/e$3:Atx	Lcom/tencent/d/e/a/e;
    //   9: astore_1
    //   10: aload_1
    //   11: monitorenter
    //   12: aload_0
    //   13: getfield 25	com/tencent/d/e/a/e$3:Aty	I
    //   16: aload_0
    //   17: getfield 27	com/tencent/d/e/a/e$3:cgR	I
    //   20: aload_0
    //   21: getfield 23	com/tencent/d/e/a/e$3:Atx	Lcom/tencent/d/e/a/e;
    //   24: invokestatic 53	com/tencent/d/e/a/e:a	(Lcom/tencent/d/e/a/e;)Lcom/tencent/d/e/a/d;
    //   27: getfield 59	com/tencent/d/e/a/d:context	Landroid/content/Context;
    //   30: aload_0
    //   31: getfield 29	com/tencent/d/e/a/e$3:uAC	I
    //   34: aload_0
    //   35: getfield 31	com/tencent/d/e/a/e$3:Atz	Landroid/util/SparseArray;
    //   38: aload_0
    //   39: getfield 33	com/tencent/d/e/a/e$3:AtA	Ljava/util/List;
    //   42: invokestatic 64	com/tencent/d/e/a/a/b:a	(IILandroid/content/Context;ILandroid/util/SparseArray;Ljava/util/List;)Lcom/tencent/d/e/a/b/a;
    //   45: astore_2
    //   46: aload_1
    //   47: monitorexit
    //   48: invokestatic 70	com/tencent/d/e/a/a/h:dQz	()Lcom/tencent/d/e/a/a/h;
    //   51: astore_3
    //   52: aload_0
    //   53: getfield 25	com/tencent/d/e/a/e$3:Aty	I
    //   56: istore 4
    //   58: aload_0
    //   59: getfield 27	com/tencent/d/e/a/e$3:cgR	I
    //   62: istore 5
    //   64: aload_2
    //   65: invokevirtual 76	com/tencent/d/e/a/b/a:toByteArray	()[B
    //   68: invokestatic 82	com/tencent/d/f/b:compress	([B)[B
    //   71: invokestatic 87	com/tencent/d/f/c:dQC	()[B
    //   74: invokestatic 91	com/tencent/d/f/c:m	([B[B)[B
    //   77: astore 6
    //   79: aload 6
    //   81: ifnull +94 -> 175
    //   84: aload_3
    //   85: getfield 94	com/tencent/d/e/a/a/h:mContext	Landroid/content/Context;
    //   88: ldc 96
    //   90: iconst_0
    //   91: invokevirtual 102	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   94: astore_1
    //   95: aload_1
    //   96: ifnonnull +122 -> 218
    //   99: ldc 104
    //   101: astore_2
    //   102: aload_2
    //   103: invokestatic 110	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   106: ifne +69 -> 175
    //   109: aconst_null
    //   110: astore 7
    //   112: new 112	java/io/BufferedOutputStream
    //   115: astore_1
    //   116: new 114	java/io/FileOutputStream
    //   119: astore 8
    //   121: aload 8
    //   123: aload_2
    //   124: invokespecial 117	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   127: aload_1
    //   128: aload 8
    //   130: invokespecial 120	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   133: aload_1
    //   134: aload 6
    //   136: invokevirtual 124	java/io/BufferedOutputStream:write	([B)V
    //   139: aload_1
    //   140: invokevirtual 127	java/io/BufferedOutputStream:flush	()V
    //   143: aload_1
    //   144: invokestatic 133	com/tencent/d/f/f:closeQuietly	(Ljava/io/Closeable;)V
    //   147: aload_3
    //   148: iload 4
    //   150: iload 5
    //   152: invokevirtual 137	com/tencent/d/e/a/a/h:hT	(II)Ljava/lang/String;
    //   155: astore_1
    //   156: aload_1
    //   157: invokestatic 110	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   160: ifne +15 -> 175
    //   163: new 139	java/io/File
    //   166: dup
    //   167: aload_1
    //   168: invokespecial 140	java/io/File:<init>	(Ljava/lang/String;)V
    //   171: invokevirtual 143	java/io/File:delete	()Z
    //   174: pop
    //   175: aload_0
    //   176: getfield 23	com/tencent/d/e/a/e$3:Atx	Lcom/tencent/d/e/a/e;
    //   179: invokestatic 147	com/tencent/d/e/a/e:h	(Lcom/tencent/d/e/a/e;)Lcom/tencent/d/e/a/b;
    //   182: ifnull +11 -> 193
    //   185: aload_0
    //   186: getfield 23	com/tencent/d/e/a/e$3:Atx	Lcom/tencent/d/e/a/e;
    //   189: invokestatic 147	com/tencent/d/e/a/e:h	(Lcom/tencent/d/e/a/e;)Lcom/tencent/d/e/a/b;
    //   192: pop
    //   193: ldc 43
    //   195: invokestatic 150	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   198: return
    //   199: astore_2
    //   200: aload_1
    //   201: monitorexit
    //   202: ldc 43
    //   204: invokestatic 150	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload_2
    //   208: athrow
    //   209: astore_1
    //   210: ldc 43
    //   212: invokestatic 150	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -17 -> 198
    //   218: new 152	java/lang/StringBuilder
    //   221: dup
    //   222: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   225: aload_1
    //   226: invokevirtual 157	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   229: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: getstatic 165	java/io/File:separator	Ljava/lang/String;
    //   235: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: iload 4
    //   240: iload 5
    //   242: invokestatic 168	com/tencent/d/e/a/a/h:hU	(II)Ljava/lang/String;
    //   245: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: ldc 170
    //   250: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: invokestatic 176	java/lang/System:currentTimeMillis	()J
    //   256: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   259: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: astore_2
    //   263: goto -161 -> 102
    //   266: astore_1
    //   267: aconst_null
    //   268: astore_1
    //   269: aload_1
    //   270: invokestatic 133	com/tencent/d/f/f:closeQuietly	(Ljava/io/Closeable;)V
    //   273: goto -126 -> 147
    //   276: astore_2
    //   277: aload 7
    //   279: astore_1
    //   280: aload_1
    //   281: invokestatic 133	com/tencent/d/f/f:closeQuietly	(Ljava/io/Closeable;)V
    //   284: ldc 43
    //   286: invokestatic 150	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: aload_2
    //   290: athrow
    //   291: astore_2
    //   292: goto -12 -> 280
    //   295: astore_2
    //   296: goto -27 -> 269
    //
    // Exception table:
    //   from	to	target	type
    //   12	48	199	finally
    //   200	202	199	finally
    //   5	12	209	java/lang/IllegalArgumentException
    //   202	209	209	java/lang/IllegalArgumentException
    //   112	133	266	java/lang/Throwable
    //   112	133	276	finally
    //   133	143	291	finally
    //   133	143	295	java/lang/Throwable
  }

  public final void dQu()
  {
    AppMethodBeat.i(114539);
    if (e.f(this.Atx) != null)
      e.f(this.Atx);
    AppMethodBeat.o(114539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.e.3
 * JD-Core Version:    0.6.2
 */
package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.h.s.c;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.e;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$a
  implements s.c
{
  private final com.google.android.exoplayer2.h.f aSF;
  private final f.b bgJ;
  private final e bgK;
  long bgY;
  private final k bhe;
  private volatile boolean bhf;
  private boolean bhg;
  private long bhh;
  private final Uri uri;

  public f$a(f paramf, Uri paramUri, com.google.android.exoplayer2.h.f paramf1, f.b paramb, e parame)
  {
    AppMethodBeat.i(95480);
    this.uri = ((Uri)a.checkNotNull(paramUri));
    this.aSF = ((com.google.android.exoplayer2.h.f)a.checkNotNull(paramf1));
    this.bgJ = ((f.b)a.checkNotNull(paramb));
    this.bgK = parame;
    this.bhe = new k();
    this.bhg = true;
    this.bgY = -1L;
    AppMethodBeat.o(95480);
  }

  public final void j(long paramLong1, long paramLong2)
  {
    this.bhe.position = paramLong1;
    this.bhh = paramLong2;
    this.bhg = true;
  }

  public final void se()
  {
    this.bhf = true;
  }

  public final boolean sf()
  {
    return this.bhf;
  }

  // ERROR //
  public final void sg()
  {
    // Byte code:
    //   0: ldc 90
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_0
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +317 -> 325
    //   11: aload_0
    //   12: getfield 86	com/google/android/exoplayer2/source/f$a:bhf	Z
    //   15: ifne +310 -> 325
    //   18: aload_0
    //   19: getfield 66	com/google/android/exoplayer2/source/f$a:bhe	Lcom/google/android/exoplayer2/c/k;
    //   22: getfield 81	com/google/android/exoplayer2/c/k:position	J
    //   25: lstore_2
    //   26: aload_0
    //   27: getfield 55	com/google/android/exoplayer2/source/f$a:aSF	Lcom/google/android/exoplayer2/h/f;
    //   30: astore 4
    //   32: new 92	com/google/android/exoplayer2/h/i
    //   35: astore 5
    //   37: aload 5
    //   39: aload_0
    //   40: getfield 51	com/google/android/exoplayer2/source/f$a:uri	Landroid/net/Uri;
    //   43: lload_2
    //   44: ldc2_w 69
    //   47: aload_0
    //   48: getfield 31	com/google/android/exoplayer2/source/f$a:bhd	Lcom/google/android/exoplayer2/source/f;
    //   51: getfield 96	com/google/android/exoplayer2/source/f:bgG	Ljava/lang/String;
    //   54: invokespecial 99	com/google/android/exoplayer2/h/i:<init>	(Landroid/net/Uri;JJLjava/lang/String;)V
    //   57: aload_0
    //   58: aload 4
    //   60: aload 5
    //   62: invokeinterface 102 2 0
    //   67: putfield 72	com/google/android/exoplayer2/source/f$a:bgY	J
    //   70: aload_0
    //   71: getfield 72	com/google/android/exoplayer2/source/f$a:bgY	J
    //   74: ldc2_w 69
    //   77: lcmp
    //   78: ifeq +13 -> 91
    //   81: aload_0
    //   82: aload_0
    //   83: getfield 72	com/google/android/exoplayer2/source/f$a:bgY	J
    //   86: lload_2
    //   87: ladd
    //   88: putfield 72	com/google/android/exoplayer2/source/f$a:bgY	J
    //   91: new 104	com/google/android/exoplayer2/c/b
    //   94: astore 5
    //   96: aload 5
    //   98: aload_0
    //   99: getfield 55	com/google/android/exoplayer2/source/f$a:aSF	Lcom/google/android/exoplayer2/h/f;
    //   102: lload_2
    //   103: aload_0
    //   104: getfield 72	com/google/android/exoplayer2/source/f$a:bgY	J
    //   107: invokespecial 107	com/google/android/exoplayer2/c/b:<init>	(Lcom/google/android/exoplayer2/h/f;JJ)V
    //   110: aload_0
    //   111: getfield 59	com/google/android/exoplayer2/source/f$a:bgJ	Lcom/google/android/exoplayer2/source/f$b;
    //   114: aload 5
    //   116: aload_0
    //   117: getfield 55	com/google/android/exoplayer2/source/f$a:aSF	Lcom/google/android/exoplayer2/h/f;
    //   120: invokeinterface 111 1 0
    //   125: invokevirtual 114	com/google/android/exoplayer2/source/f$b:a	(Lcom/google/android/exoplayer2/c/f;Landroid/net/Uri;)Lcom/google/android/exoplayer2/c/e;
    //   128: astore 4
    //   130: aload_0
    //   131: getfield 68	com/google/android/exoplayer2/source/f$a:bhg	Z
    //   134: ifeq +20 -> 154
    //   137: aload 4
    //   139: lload_2
    //   140: aload_0
    //   141: getfield 83	com/google/android/exoplayer2/source/f$a:bhh	J
    //   144: invokeinterface 119 5 0
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield 68	com/google/android/exoplayer2/source/f$a:bhg	Z
    //   154: iload_1
    //   155: ifne +92 -> 247
    //   158: aload_0
    //   159: getfield 86	com/google/android/exoplayer2/source/f$a:bhf	Z
    //   162: ifne +85 -> 247
    //   165: aload_0
    //   166: getfield 61	com/google/android/exoplayer2/source/f$a:bgK	Lcom/google/android/exoplayer2/i/e;
    //   169: invokevirtual 124	com/google/android/exoplayer2/i/e:block	()V
    //   172: aload 4
    //   174: aload 5
    //   176: aload_0
    //   177: getfield 66	com/google/android/exoplayer2/source/f$a:bhe	Lcom/google/android/exoplayer2/c/k;
    //   180: invokeinterface 127 3 0
    //   185: istore 6
    //   187: iload 6
    //   189: istore_1
    //   190: aload 5
    //   192: invokeinterface 133 1 0
    //   197: aload_0
    //   198: getfield 31	com/google/android/exoplayer2/source/f$a:bhd	Lcom/google/android/exoplayer2/source/f;
    //   201: getfield 136	com/google/android/exoplayer2/source/f:bgH	J
    //   204: lload_2
    //   205: ladd
    //   206: lcmp
    //   207: ifle +171 -> 378
    //   210: aload 5
    //   212: invokeinterface 133 1 0
    //   217: lstore_2
    //   218: aload_0
    //   219: getfield 61	com/google/android/exoplayer2/source/f$a:bgK	Lcom/google/android/exoplayer2/i/e;
    //   222: invokevirtual 139	com/google/android/exoplayer2/i/e:tw	()Z
    //   225: pop
    //   226: aload_0
    //   227: getfield 31	com/google/android/exoplayer2/source/f$a:bhd	Lcom/google/android/exoplayer2/source/f;
    //   230: getfield 143	com/google/android/exoplayer2/source/f:handler	Landroid/os/Handler;
    //   233: aload_0
    //   234: getfield 31	com/google/android/exoplayer2/source/f$a:bhd	Lcom/google/android/exoplayer2/source/f;
    //   237: getfield 147	com/google/android/exoplayer2/source/f:bgM	Ljava/lang/Runnable;
    //   240: invokevirtual 153	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   243: pop
    //   244: goto -90 -> 154
    //   247: iload_1
    //   248: iconst_1
    //   249: if_icmpne +15 -> 264
    //   252: iconst_0
    //   253: istore_1
    //   254: aload_0
    //   255: getfield 55	com/google/android/exoplayer2/source/f$a:aSF	Lcom/google/android/exoplayer2/h/f;
    //   258: invokestatic 158	com/google/android/exoplayer2/i/v:a	(Lcom/google/android/exoplayer2/h/f;)V
    //   261: goto -254 -> 7
    //   264: aload_0
    //   265: getfield 66	com/google/android/exoplayer2/source/f$a:bhe	Lcom/google/android/exoplayer2/c/k;
    //   268: aload 5
    //   270: invokeinterface 133 1 0
    //   275: putfield 81	com/google/android/exoplayer2/c/k:position	J
    //   278: goto -24 -> 254
    //   281: astore 5
    //   283: aconst_null
    //   284: astore 4
    //   286: iload_1
    //   287: iconst_1
    //   288: if_icmpeq +22 -> 310
    //   291: aload 4
    //   293: ifnull +17 -> 310
    //   296: aload_0
    //   297: getfield 66	com/google/android/exoplayer2/source/f$a:bhe	Lcom/google/android/exoplayer2/c/k;
    //   300: aload 4
    //   302: invokeinterface 133 1 0
    //   307: putfield 81	com/google/android/exoplayer2/c/k:position	J
    //   310: aload_0
    //   311: getfield 55	com/google/android/exoplayer2/source/f$a:aSF	Lcom/google/android/exoplayer2/h/f;
    //   314: invokestatic 158	com/google/android/exoplayer2/i/v:a	(Lcom/google/android/exoplayer2/h/f;)V
    //   317: ldc 90
    //   319: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: aload 5
    //   324: athrow
    //   325: ldc 90
    //   327: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   330: return
    //   331: astore 4
    //   333: aload 5
    //   335: astore 7
    //   337: aload 4
    //   339: astore 5
    //   341: aload 7
    //   343: astore 4
    //   345: goto -59 -> 286
    //   348: astore 4
    //   350: aload 5
    //   352: astore 7
    //   354: aload 4
    //   356: astore 5
    //   358: aload 7
    //   360: astore 4
    //   362: goto -76 -> 286
    //   365: astore 7
    //   367: aload 5
    //   369: astore 4
    //   371: aload 7
    //   373: astore 5
    //   375: goto -89 -> 286
    //   378: goto -224 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   18	91	281	finally
    //   91	110	281	finally
    //   110	154	331	finally
    //   158	187	348	finally
    //   190	244	365	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.f.a
 * JD-Core Version:    0.6.2
 */
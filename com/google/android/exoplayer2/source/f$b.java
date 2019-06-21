package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.g;

final class f$b
{
  private final g aTn;
  private final e[] bhi;
  e bhj;

  public f$b(e[] paramArrayOfe, g paramg)
  {
    this.bhi = paramArrayOfe;
    this.aTn = paramg;
  }

  // ERROR //
  public final e a(com.google.android.exoplayer2.c.f paramf, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: ldc 28
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 36	com/google/android/exoplayer2/source/f$b:bhj	Lcom/google/android/exoplayer2/c/e;
    //   9: ifnull +15 -> 24
    //   12: aload_0
    //   13: getfield 36	com/google/android/exoplayer2/source/f$b:bhj	Lcom/google/android/exoplayer2/c/e;
    //   16: astore_1
    //   17: ldc 28
    //   19: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: aload_1
    //   23: areturn
    //   24: aload_0
    //   25: getfield 20	com/google/android/exoplayer2/source/f$b:bhi	[Lcom/google/android/exoplayer2/c/e;
    //   28: astore_3
    //   29: aload_3
    //   30: arraylength
    //   31: istore 4
    //   33: iconst_0
    //   34: istore 5
    //   36: iload 5
    //   38: iload 4
    //   40: if_icmpge +32 -> 72
    //   43: aload_3
    //   44: iload 5
    //   46: aaload
    //   47: astore 6
    //   49: aload 6
    //   51: aload_1
    //   52: invokeinterface 44 2 0
    //   57: ifeq +65 -> 122
    //   60: aload_0
    //   61: aload 6
    //   63: putfield 36	com/google/android/exoplayer2/source/f$b:bhj	Lcom/google/android/exoplayer2/c/e;
    //   66: aload_1
    //   67: invokeinterface 49 1 0
    //   72: aload_0
    //   73: getfield 36	com/google/android/exoplayer2/source/f$b:bhj	Lcom/google/android/exoplayer2/c/e;
    //   76: ifnonnull +83 -> 159
    //   79: new 51	com/google/android/exoplayer2/source/q
    //   82: dup
    //   83: new 53	java/lang/StringBuilder
    //   86: dup
    //   87: ldc 55
    //   89: invokespecial 58	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_0
    //   93: getfield 20	com/google/android/exoplayer2/source/f$b:bhi	[Lcom/google/android/exoplayer2/c/e;
    //   96: invokestatic 64	com/google/android/exoplayer2/i/v:d	([Ljava/lang/Object;)Ljava/lang/String;
    //   99: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: ldc 70
    //   104: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: aload_2
    //   111: invokespecial 77	com/google/android/exoplayer2/source/q:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   114: astore_1
    //   115: ldc 28
    //   117: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: aload_1
    //   121: athrow
    //   122: aload_1
    //   123: invokeinterface 49 1 0
    //   128: iinc 5 1
    //   131: goto -95 -> 36
    //   134: astore 6
    //   136: aload_1
    //   137: invokeinterface 49 1 0
    //   142: goto -14 -> 128
    //   145: astore_2
    //   146: aload_1
    //   147: invokeinterface 49 1 0
    //   152: ldc 28
    //   154: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: aload_2
    //   158: athrow
    //   159: aload_0
    //   160: getfield 36	com/google/android/exoplayer2/source/f$b:bhj	Lcom/google/android/exoplayer2/c/e;
    //   163: aload_0
    //   164: getfield 22	com/google/android/exoplayer2/source/f$b:aTn	Lcom/google/android/exoplayer2/c/g;
    //   167: invokeinterface 80 2 0
    //   172: aload_0
    //   173: getfield 36	com/google/android/exoplayer2/source/f$b:bhj	Lcom/google/android/exoplayer2/c/e;
    //   176: astore_1
    //   177: ldc 28
    //   179: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -160 -> 22
    //
    // Exception table:
    //   from	to	target	type
    //   49	66	134	java/io/EOFException
    //   49	66	145	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.f.b
 * JD-Core Version:    0.6.2
 */
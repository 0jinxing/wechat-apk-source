package com.tencent.mm.plugin.n;

import android.util.Pair;
import com.tencent.mm.plugin.a.g;
import java.io.RandomAccessFile;
import java.util.List;

public final class f
{
  List<g> gkn;
  List<Pair> gko;
  RandomAccessFile ort;
  g oru;
  int orv;
  int orw;

  // ERROR //
  public final int J(java.nio.ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: ldc 21
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 29	com/tencent/mm/plugin/n/f:orv	I
    //   9: aload_0
    //   10: getfield 31	com/tencent/mm/plugin/n/f:orw	I
    //   13: if_icmplt +12 -> 25
    //   16: ldc 21
    //   18: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iconst_m1
    //   22: istore_2
    //   23: iload_2
    //   24: ireturn
    //   25: aload_0
    //   26: getfield 36	com/tencent/mm/plugin/n/f:ort	Ljava/io/RandomAccessFile;
    //   29: aload_0
    //   30: getfield 38	com/tencent/mm/plugin/n/f:oru	Lcom/tencent/mm/plugin/a/g;
    //   33: getfield 43	com/tencent/mm/plugin/a/g:start	J
    //   36: invokevirtual 49	java/io/RandomAccessFile:seek	(J)V
    //   39: aload_0
    //   40: getfield 38	com/tencent/mm/plugin/n/f:oru	Lcom/tencent/mm/plugin/a/g;
    //   43: getfield 52	com/tencent/mm/plugin/a/g:size	I
    //   46: newarray byte
    //   48: astore_3
    //   49: aload_0
    //   50: getfield 36	com/tencent/mm/plugin/n/f:ort	Ljava/io/RandomAccessFile;
    //   53: aload_3
    //   54: invokevirtual 56	java/io/RandomAccessFile:read	([B)I
    //   57: istore_2
    //   58: aload_0
    //   59: getfield 38	com/tencent/mm/plugin/n/f:oru	Lcom/tencent/mm/plugin/a/g;
    //   62: getfield 52	com/tencent/mm/plugin/a/g:size	I
    //   65: istore 4
    //   67: iload_2
    //   68: iload 4
    //   70: if_icmpge +13 -> 83
    //   73: ldc 21
    //   75: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: iconst_m1
    //   79: istore_2
    //   80: goto -57 -> 23
    //   83: aload_3
    //   84: iconst_0
    //   85: iconst_0
    //   86: i2b
    //   87: bastore
    //   88: aload_3
    //   89: iconst_1
    //   90: iconst_0
    //   91: i2b
    //   92: bastore
    //   93: aload_3
    //   94: iconst_2
    //   95: iconst_0
    //   96: i2b
    //   97: bastore
    //   98: aload_3
    //   99: iconst_3
    //   100: iconst_1
    //   101: i2b
    //   102: bastore
    //   103: iconst_0
    //   104: istore 4
    //   106: iload 4
    //   108: iload_2
    //   109: if_icmpge +60 -> 169
    //   112: aload_3
    //   113: iload 4
    //   115: baload
    //   116: bipush 128
    //   118: if_icmpne +45 -> 163
    //   121: iload 4
    //   123: iconst_4
    //   124: iadd
    //   125: iload_2
    //   126: if_icmpge +37 -> 163
    //   129: aload_3
    //   130: iload 4
    //   132: iconst_1
    //   133: iadd
    //   134: baload
    //   135: ifne +28 -> 163
    //   138: aload_3
    //   139: iload 4
    //   141: iconst_2
    //   142: iadd
    //   143: baload
    //   144: ifne +19 -> 163
    //   147: aload_3
    //   148: iload 4
    //   150: iconst_3
    //   151: iadd
    //   152: iconst_0
    //   153: i2b
    //   154: bastore
    //   155: aload_3
    //   156: iload 4
    //   158: iconst_4
    //   159: iadd
    //   160: iconst_1
    //   161: i2b
    //   162: bastore
    //   163: iinc 4 1
    //   166: goto -60 -> 106
    //   169: aload_1
    //   170: invokevirtual 62	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   173: pop
    //   174: aload_1
    //   175: aload_3
    //   176: iconst_0
    //   177: iload_2
    //   178: invokevirtual 66	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   181: invokevirtual 69	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   184: pop
    //   185: ldc 21
    //   187: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: goto -167 -> 23
    //   193: astore_1
    //   194: iconst_m1
    //   195: istore_2
    //   196: ldc 71
    //   198: aload_1
    //   199: ldc 73
    //   201: iconst_0
    //   202: anewarray 4	java/lang/Object
    //   205: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: goto -23 -> 185
    //   211: astore_1
    //   212: goto -16 -> 196
    //
    // Exception table:
    //   from	to	target	type
    //   25	58	193	java/lang/Exception
    //   58	67	211	java/lang/Exception
    //   169	185	211	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.f
 * JD-Core Version:    0.6.2
 */
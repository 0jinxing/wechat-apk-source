package com.tencent.mm.plugin.d.a.c;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

final class c$a$a extends ak
{
  private WeakReference<c.a> jGh;

  public c$a$a(Looper paramLooper, c.a parama)
  {
    super(paramLooper);
    AppMethodBeat.i(18485);
    this.jGh = null;
    this.jGh = new WeakReference(parama);
    AppMethodBeat.o(18485);
  }

  // ERROR //
  public final void handleMessage(android.os.Message paramMessage)
  {
    // Byte code:
    //   0: sipush 18486
    //   3: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 23	com/tencent/mm/plugin/d/a/c/c$a$a:jGh	Ljava/lang/ref/WeakReference;
    //   10: invokevirtual 40	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   13: checkcast 6	com/tencent/mm/plugin/d/a/c/c$a
    //   16: astore_2
    //   17: aload_2
    //   18: ifnonnull +17 -> 35
    //   21: ldc 42
    //   23: ldc 44
    //   25: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: sipush 18486
    //   31: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: return
    //   35: aload_1
    //   36: getfield 56	android/os/Message:what	I
    //   39: tableswitch	default:+21 -> 60, 0:+30->69, 1:+404->443
    //   61: dstore_1
    //   62: istore 184
    //   64: nop
    //   65: lload_1
    //   66: goto -32 -> 34
    //   69: ldc 58
    //   71: ldc 60
    //   73: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: aload_2
    //   77: getfield 66	com/tencent/mm/plugin/d/a/c/c$a:jIK	Z
    //   80: ifeq +19 -> 99
    //   83: ldc 58
    //   85: ldc 68
    //   87: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: sipush 18486
    //   93: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: goto -62 -> 34
    //   99: aload_2
    //   100: getfield 74	com/tencent/mm/plugin/d/a/c/c$a:jIH	Z
    //   103: ifeq +183 -> 286
    //   106: aload_2
    //   107: aload_2
    //   108: getfield 78	com/tencent/mm/plugin/d/a/c/c$a:jIL	Landroid/bluetooth/BluetoothDevice;
    //   111: getstatic 84	com/tencent/mm/plugin/d/a/c/a:jIw	Ljava/util/UUID;
    //   114: invokevirtual 90	android/bluetooth/BluetoothDevice:createRfcommSocketToServiceRecord	(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;
    //   117: putfield 94	com/tencent/mm/plugin/d/a/c/c$a:jIG	Landroid/bluetooth/BluetoothSocket;
    //   120: aload_2
    //   121: getfield 94	com/tencent/mm/plugin/d/a/c/c$a:jIG	Landroid/bluetooth/BluetoothSocket;
    //   124: invokevirtual 100	android/bluetooth/BluetoothSocket:connect	()V
    //   127: aload_2
    //   128: iconst_1
    //   129: putfield 66	com/tencent/mm/plugin/d/a/c/c$a:jIK	Z
    //   132: aload_2
    //   133: getfield 104	com/tencent/mm/plugin/d/a/c/c$a:jII	Lcom/tencent/mm/plugin/d/a/c/b;
    //   136: astore_3
    //   137: aload_2
    //   138: getfield 108	com/tencent/mm/plugin/d/a/c/c$a:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   141: astore 4
    //   143: aload_2
    //   144: getfield 94	com/tencent/mm/plugin/d/a/c/c$a:jIG	Landroid/bluetooth/BluetoothSocket;
    //   147: astore_1
    //   148: ldc 110
    //   150: ldc 112
    //   152: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: aload_3
    //   156: iconst_3
    //   157: putfield 117	com/tencent/mm/plugin/d/a/c/b:mState	I
    //   160: aload_3
    //   161: getfield 121	com/tencent/mm/plugin/d/a/c/b:jIE	Lcom/tencent/mm/plugin/d/a/c/c$b;
    //   164: ifnull +15 -> 179
    //   167: aload_3
    //   168: getfield 121	com/tencent/mm/plugin/d/a/c/b:jIE	Lcom/tencent/mm/plugin/d/a/c/c$b;
    //   171: invokevirtual 126	com/tencent/mm/plugin/d/a/c/c$b:cancel	()V
    //   174: aload_3
    //   175: aconst_null
    //   176: putfield 121	com/tencent/mm/plugin/d/a/c/b:jIE	Lcom/tencent/mm/plugin/d/a/c/c$b;
    //   179: aload_3
    //   180: getfield 130	com/tencent/mm/plugin/d/a/c/b:jIF	Lcom/tencent/mm/plugin/d/a/c/c$c;
    //   183: ifnull +15 -> 198
    //   186: aload_3
    //   187: getfield 130	com/tencent/mm/plugin/d/a/c/b:jIF	Lcom/tencent/mm/plugin/d/a/c/c$c;
    //   190: invokevirtual 133	com/tencent/mm/plugin/d/a/c/c$c:cancel	()V
    //   193: aload_3
    //   194: aconst_null
    //   195: putfield 130	com/tencent/mm/plugin/d/a/c/b:jIF	Lcom/tencent/mm/plugin/d/a/c/c$c;
    //   198: aload_3
    //   199: new 123	com/tencent/mm/plugin/d/a/c/c$b
    //   202: dup
    //   203: aload_3
    //   204: aload 4
    //   206: aload_1
    //   207: invokespecial 136	com/tencent/mm/plugin/d/a/c/c$b:<init>	(Lcom/tencent/mm/plugin/d/a/c/b;Lcom/tencent/mm/plugin/d/a/c/a;Landroid/bluetooth/BluetoothSocket;)V
    //   210: putfield 121	com/tencent/mm/plugin/d/a/c/b:jIE	Lcom/tencent/mm/plugin/d/a/c/c$b;
    //   213: aload_3
    //   214: getfield 121	com/tencent/mm/plugin/d/a/c/b:jIE	Lcom/tencent/mm/plugin/d/a/c/c$b;
    //   217: ldc 138
    //   219: invokestatic 144	com/tencent/mm/sdk/g/d:h	(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
    //   222: invokevirtual 149	java/lang/Thread:start	()V
    //   225: aload_3
    //   226: new 132	com/tencent/mm/plugin/d/a/c/c$c
    //   229: dup
    //   230: aload_3
    //   231: aload 4
    //   233: aload_1
    //   234: invokespecial 150	com/tencent/mm/plugin/d/a/c/c$c:<init>	(Lcom/tencent/mm/plugin/d/a/c/b;Lcom/tencent/mm/plugin/d/a/c/a;Landroid/bluetooth/BluetoothSocket;)V
    //   237: putfield 130	com/tencent/mm/plugin/d/a/c/b:jIF	Lcom/tencent/mm/plugin/d/a/c/c$c;
    //   240: aload_3
    //   241: getfield 130	com/tencent/mm/plugin/d/a/c/b:jIF	Lcom/tencent/mm/plugin/d/a/c/c$c;
    //   244: ldc 152
    //   246: invokestatic 144	com/tencent/mm/sdk/g/d:h	(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
    //   249: invokevirtual 149	java/lang/Thread:start	()V
    //   252: aload_2
    //   253: getfield 108	com/tencent/mm/plugin/d/a/c/c$a:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   256: ifnull +21 -> 277
    //   259: aload_2
    //   260: getfield 108	com/tencent/mm/plugin/d/a/c/c$a:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   263: getfield 156	com/tencent/mm/plugin/d/a/c/a:jIy	Lcom/tencent/mm/plugin/d/a/c/a$a;
    //   266: aload_2
    //   267: getfield 104	com/tencent/mm/plugin/d/a/c/c$a:jII	Lcom/tencent/mm/plugin/d/a/c/b;
    //   270: getfield 160	com/tencent/mm/plugin/d/a/c/b:mSessionId	J
    //   273: iconst_1
    //   274: invokevirtual 166	com/tencent/mm/plugin/d/a/c/a$a:l	(JZ)V
    //   277: sipush 18486
    //   280: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: goto -249 -> 34
    //   286: aload_2
    //   287: aload_2
    //   288: getfield 78	com/tencent/mm/plugin/d/a/c/c$a:jIL	Landroid/bluetooth/BluetoothDevice;
    //   291: getstatic 169	com/tencent/mm/plugin/d/a/c/a:jIx	Ljava/util/UUID;
    //   294: invokevirtual 172	android/bluetooth/BluetoothDevice:createInsecureRfcommSocketToServiceRecord	(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;
    //   297: putfield 94	com/tencent/mm/plugin/d/a/c/c$a:jIG	Landroid/bluetooth/BluetoothSocket;
    //   300: goto -180 -> 120
    //   303: astore_1
    //   304: aload_2
    //   305: aconst_null
    //   306: putfield 94	com/tencent/mm/plugin/d/a/c/c$a:jIG	Landroid/bluetooth/BluetoothSocket;
    //   309: ldc 58
    //   311: ldc 174
    //   313: iconst_1
    //   314: anewarray 176	java/lang/Object
    //   317: dup
    //   318: iconst_0
    //   319: aload_1
    //   320: invokevirtual 180	java/io/IOException:toString	()Ljava/lang/String;
    //   323: aastore
    //   324: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   327: aload_2
    //   328: getfield 108	com/tencent/mm/plugin/d/a/c/c$a:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   331: ifnull +21 -> 352
    //   334: aload_2
    //   335: getfield 108	com/tencent/mm/plugin/d/a/c/c$a:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   338: getfield 156	com/tencent/mm/plugin/d/a/c/a:jIy	Lcom/tencent/mm/plugin/d/a/c/a$a;
    //   341: aload_2
    //   342: getfield 104	com/tencent/mm/plugin/d/a/c/c$a:jII	Lcom/tencent/mm/plugin/d/a/c/b;
    //   345: getfield 160	com/tencent/mm/plugin/d/a/c/b:mSessionId	J
    //   348: iconst_0
    //   349: invokevirtual 166	com/tencent/mm/plugin/d/a/c/a$a:l	(JZ)V
    //   352: sipush 18486
    //   355: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   358: goto -324 -> 34
    //   361: astore_1
    //   362: ldc 58
    //   364: ldc 185
    //   366: iconst_1
    //   367: anewarray 176	java/lang/Object
    //   370: dup
    //   371: iconst_0
    //   372: aload_1
    //   373: invokevirtual 180	java/io/IOException:toString	()Ljava/lang/String;
    //   376: aastore
    //   377: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   380: aload_2
    //   381: getfield 94	com/tencent/mm/plugin/d/a/c/c$a:jIG	Landroid/bluetooth/BluetoothSocket;
    //   384: invokevirtual 188	android/bluetooth/BluetoothSocket:close	()V
    //   387: aload_2
    //   388: getfield 108	com/tencent/mm/plugin/d/a/c/c$a:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   391: ifnull +21 -> 412
    //   394: aload_2
    //   395: getfield 108	com/tencent/mm/plugin/d/a/c/c$a:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   398: getfield 156	com/tencent/mm/plugin/d/a/c/a:jIy	Lcom/tencent/mm/plugin/d/a/c/a$a;
    //   401: aload_2
    //   402: getfield 104	com/tencent/mm/plugin/d/a/c/c$a:jII	Lcom/tencent/mm/plugin/d/a/c/b;
    //   405: getfield 160	com/tencent/mm/plugin/d/a/c/b:mSessionId	J
    //   408: iconst_0
    //   409: invokevirtual 166	com/tencent/mm/plugin/d/a/c/a$a:l	(JZ)V
    //   412: sipush 18486
    //   415: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: goto -384 -> 34
    //   421: astore_1
    //   422: ldc 58
    //   424: ldc 190
    //   426: iconst_1
    //   427: anewarray 176	java/lang/Object
    //   430: dup
    //   431: iconst_0
    //   432: aload_1
    //   433: invokevirtual 180	java/io/IOException:toString	()Ljava/lang/String;
    //   436: aastore
    //   437: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   440: goto -53 -> 387
    //   443: aload_2
    //   444: getfield 66	com/tencent/mm/plugin/d/a/c/c$a:jIK	Z
    //   447: ifne +19 -> 466
    //   450: ldc 58
    //   452: ldc 192
    //   454: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   457: sipush 18486
    //   460: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   463: goto -429 -> 34
    //   466: aload_2
    //   467: getfield 94	com/tencent/mm/plugin/d/a/c/c$a:jIG	Landroid/bluetooth/BluetoothSocket;
    //   470: invokevirtual 188	android/bluetooth/BluetoothSocket:close	()V
    //   473: sipush 18486
    //   476: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   479: goto -445 -> 34
    //   482: astore_1
    //   483: ldc 58
    //   485: ldc 194
    //   487: iconst_1
    //   488: anewarray 176	java/lang/Object
    //   491: dup
    //   492: iconst_0
    //   493: aload_1
    //   494: invokevirtual 180	java/io/IOException:toString	()Ljava/lang/String;
    //   497: aastore
    //   498: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   501: goto -441 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   99	120	303	java/io/IOException
    //   286	300	303	java/io/IOException
    //   120	127	361	java/io/IOException
    //   380	387	421	java/io/IOException
    //   466	473	482	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.c.a.a
 * JD-Core Version:    0.6.2
 */
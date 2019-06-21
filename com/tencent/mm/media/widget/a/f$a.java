package com.tencent.mm.media.widget.a;

import a.l;
import android.content.Context;
import android.os.Looper;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/media/widget/camera/OpenCameraThread$openCamera$1$1"})
final class f$a
  implements Runnable
{
  f$a(f paramf, long paramLong1, long paramLong2, Context paramContext, int paramInt, Looper paramLooper)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 13225
    //   3: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   10: getfield 63	com/tencent/mm/media/widget/a/f:TAG	Ljava/lang/String;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 39	com/tencent/mm/media/widget/a/f$a:fbu	J
    //   18: lstore_2
    //   19: invokestatic 69	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   22: astore 4
    //   24: aload 4
    //   26: ldc 71
    //   28: invokestatic 77	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   31: aload_1
    //   32: ldc 79
    //   34: iconst_3
    //   35: anewarray 4	java/lang/Object
    //   38: dup
    //   39: iconst_0
    //   40: lload_2
    //   41: invokestatic 85	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: aload 4
    //   49: invokevirtual 89	java/lang/Thread:getId	()J
    //   52: invokestatic 85	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   55: aastore
    //   56: dup
    //   57: iconst_2
    //   58: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   61: aload_0
    //   62: getfield 41	com/tencent/mm/media/widget/a/f$a:fbv	J
    //   65: lsub
    //   66: invokestatic 85	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   69: aastore
    //   70: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_0
    //   74: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   77: getfield 103	com/tencent/mm/media/widget/a/f:lock	Ljava/lang/Object;
    //   80: astore 4
    //   82: aload 4
    //   84: monitorenter
    //   85: aload_0
    //   86: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   89: aload_0
    //   90: getfield 43	com/tencent/mm/media/widget/a/f$a:fbw	Landroid/content/Context;
    //   93: aload_0
    //   94: getfield 45	com/tencent/mm/media/widget/a/f$a:fbx	I
    //   97: aload_0
    //   98: getfield 47	com/tencent/mm/media/widget/a/f$a:fby	Landroid/os/Looper;
    //   101: invokestatic 106	com/tencent/mm/compatible/e/d:a	(Landroid/content/Context;ILandroid/os/Looper;)Lcom/tencent/mm/compatible/e/d$a$a;
    //   104: putfield 110	com/tencent/mm/media/widget/a/f:fbs	Lcom/tencent/mm/compatible/e/d$a$a;
    //   107: aload_0
    //   108: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   111: getfield 114	com/tencent/mm/media/widget/a/f:fbr	Z
    //   114: ifeq +84 -> 198
    //   117: aload_0
    //   118: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   121: getfield 110	com/tencent/mm/media/widget/a/f:fbs	Lcom/tencent/mm/compatible/e/d$a$a;
    //   124: ifnull +74 -> 198
    //   127: aload_0
    //   128: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   131: getfield 63	com/tencent/mm/media/widget/a/f:TAG	Ljava/lang/String;
    //   134: ldc 116
    //   136: iconst_1
    //   137: anewarray 4	java/lang/Object
    //   140: dup
    //   141: iconst_0
    //   142: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   145: aload_0
    //   146: getfield 41	com/tencent/mm/media/widget/a/f$a:fbv	J
    //   149: lsub
    //   150: invokestatic 85	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   153: aastore
    //   154: invokestatic 119	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_0
    //   158: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   161: getfield 110	com/tencent/mm/media/widget/a/f:fbs	Lcom/tencent/mm/compatible/e/d$a$a;
    //   164: astore_1
    //   165: aload_1
    //   166: ifnonnull +6 -> 172
    //   169: invokestatic 122	a/f/b/j:dWJ	()V
    //   172: aload_1
    //   173: getfield 128	com/tencent/mm/compatible/e/d$a$a:erH	Lcom/tencent/mm/compatible/e/t;
    //   176: astore_1
    //   177: aload_1
    //   178: aconst_null
    //   179: invokevirtual 134	com/tencent/mm/compatible/e/t:setPreviewCallback	(Landroid/hardware/Camera$PreviewCallback;)V
    //   182: aload_1
    //   183: invokevirtual 137	com/tencent/mm/compatible/e/t:stopPreview	()V
    //   186: aload_1
    //   187: invokevirtual 140	com/tencent/mm/compatible/e/t:release	()V
    //   190: aload_0
    //   191: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   194: aconst_null
    //   195: putfield 110	com/tencent/mm/media/widget/a/f:fbs	Lcom/tencent/mm/compatible/e/d$a$a;
    //   198: aload_0
    //   199: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   202: getfield 103	com/tencent/mm/media/widget/a/f:lock	Ljava/lang/Object;
    //   205: invokevirtual 143	java/lang/Object:notify	()V
    //   208: getstatic 149	a/y:AUy	La/y;
    //   211: astore_1
    //   212: aload 4
    //   214: monitorexit
    //   215: sipush 13225
    //   218: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: return
    //   222: astore_1
    //   223: aload_0
    //   224: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   227: getfield 63	com/tencent/mm/media/widget/a/f:TAG	Ljava/lang/String;
    //   230: ldc 153
    //   232: iconst_1
    //   233: anewarray 4	java/lang/Object
    //   236: dup
    //   237: iconst_0
    //   238: aload_1
    //   239: invokevirtual 157	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   242: aastore
    //   243: invokestatic 119	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   246: aload_0
    //   247: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   250: aconst_null
    //   251: putfield 110	com/tencent/mm/media/widget/a/f:fbs	Lcom/tencent/mm/compatible/e/d$a$a;
    //   254: goto -147 -> 107
    //   257: astore_1
    //   258: aload 4
    //   260: monitorexit
    //   261: sipush 13225
    //   264: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   267: aload_1
    //   268: athrow
    //   269: astore_1
    //   270: aload_0
    //   271: getfield 37	com/tencent/mm/media/widget/a/f$a:fbt	Lcom/tencent/mm/media/widget/a/f;
    //   274: getfield 63	com/tencent/mm/media/widget/a/f:TAG	Ljava/lang/String;
    //   277: ldc 159
    //   279: iconst_1
    //   280: anewarray 4	java/lang/Object
    //   283: dup
    //   284: iconst_0
    //   285: aload_1
    //   286: invokevirtual 157	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   289: aastore
    //   290: invokestatic 119	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: goto -95 -> 198
    //
    // Exception table:
    //   from	to	target	type
    //   85	107	222	java/lang/Exception
    //   85	107	257	finally
    //   107	157	257	finally
    //   157	165	257	finally
    //   169	172	257	finally
    //   172	198	257	finally
    //   198	212	257	finally
    //   223	254	257	finally
    //   270	293	257	finally
    //   157	165	269	java/lang/Exception
    //   169	172	269	java/lang/Exception
    //   172	198	269	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.f.a
 * JD-Core Version:    0.6.2
 */
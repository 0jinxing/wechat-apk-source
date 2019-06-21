package com.tencent.mm.app;

import android.os.FileObserver;

final class l$a extends FileObserver
{
  l$a(l paraml, String paramString)
  {
    super(paramString, 712);
  }

  // ERROR //
  public final void onEvent(int paramInt, String arg2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic 25	java/lang/System:currentTimeMillis	()J
    //   5: aload_0
    //   6: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   9: invokestatic 28	com/tencent/mm/app/l:a	(Lcom/tencent/mm/app/l;)J
    //   12: lsub
    //   13: ldc2_w 29
    //   16: lcmp
    //   17: ifge +5 -> 22
    //   20: iconst_1
    //   21: istore_3
    //   22: iload_3
    //   23: ifeq +4 -> 27
    //   26: return
    //   27: aload_0
    //   28: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   31: getfield 34	com/tencent/mm/app/l:ceE	Ljava/util/HashSet;
    //   34: astore 4
    //   36: aload 4
    //   38: monitorenter
    //   39: iload_1
    //   40: lookupswitch	default:+44->84, 8:+56->96, 64:+145->185, 128:+130->170, 512:+145->185
    //   85: iconst_1
    //   86: monitorexit
    //   87: goto -61 -> 26
    //   90: astore_2
    //   91: aload 4
    //   93: monitorexit
    //   94: aload_2
    //   95: athrow
    //   96: ldc 36
    //   98: ldc 38
    //   100: aload_2
    //   101: invokestatic 44	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   104: invokevirtual 48	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   107: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: aload_0
    //   111: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   114: getfield 58	com/tencent/mm/app/l:ceH	Landroid/os/ConditionVariable;
    //   117: invokevirtual 64	android/os/ConditionVariable:open	()V
    //   120: aload_0
    //   121: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   124: getfield 68	com/tencent/mm/app/l:ceN	Lcom/tencent/mm/app/l$b;
    //   127: ifnonnull +43 -> 170
    //   130: aload_0
    //   131: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   134: astore 5
    //   136: new 70	com/tencent/mm/app/l$b
    //   139: astore 6
    //   141: aload 6
    //   143: aload_0
    //   144: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   147: iconst_0
    //   148: invokespecial 73	com/tencent/mm/app/l$b:<init>	(Lcom/tencent/mm/app/l;B)V
    //   151: aload 5
    //   153: aload 6
    //   155: putfield 68	com/tencent/mm/app/l:ceN	Lcom/tencent/mm/app/l$b;
    //   158: aload_0
    //   159: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   162: getfield 68	com/tencent/mm/app/l:ceN	Lcom/tencent/mm/app/l$b;
    //   165: ldc 75
    //   167: invokestatic 81	com/tencent/mm/sdk/g/d:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   170: aload_0
    //   171: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   174: getfield 34	com/tencent/mm/app/l:ceE	Ljava/util/HashSet;
    //   177: aload_2
    //   178: invokevirtual 87	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   181: pop
    //   182: goto -98 -> 84
    //   185: aload_0
    //   186: getfield 13	com/tencent/mm/app/l$a:ceP	Lcom/tencent/mm/app/l;
    //   189: getfield 34	com/tencent/mm/app/l:ceE	Ljava/util/HashSet;
    //   192: aload_2
    //   193: invokevirtual 90	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   196: pop
    //   197: goto -113 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   84	87	90	finally
    //   91	94	90	finally
    //   96	170	90	finally
    //   170	182	90	finally
    //   185	197	90	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.l.a
 * JD-Core Version:    0.6.2
 */
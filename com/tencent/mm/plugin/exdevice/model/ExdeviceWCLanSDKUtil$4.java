package com.tencent.mm.plugin.exdevice.model;

final class ExdeviceWCLanSDKUtil$4
  implements j.a
{
  ExdeviceWCLanSDKUtil$4(ExdeviceWCLanSDKUtil paramExdeviceWCLanSDKUtil)
  {
  }

  // ERROR //
  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: sipush 19287
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: bipush 16
    //   9: if_icmpne +31 -> 40
    //   12: aload_2
    //   13: ifnull +27 -> 40
    //   16: aload_2
    //   17: arraylength
    //   18: iconst_2
    //   19: if_icmplt +21 -> 40
    //   22: aload_2
    //   23: iconst_0
    //   24: aaload
    //   25: instanceof 30
    //   28: ifeq +12 -> 40
    //   31: aload_2
    //   32: iconst_1
    //   33: aaload
    //   34: instanceof 32
    //   37: ifne +10 -> 47
    //   40: sipush 19287
    //   43: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: return
    //   47: aload_2
    //   48: iconst_0
    //   49: aaload
    //   50: checkcast 30	java/lang/String
    //   53: astore_3
    //   54: aload_2
    //   55: iconst_1
    //   56: aaload
    //   57: checkcast 32	[B
    //   60: astore 4
    //   62: new 30	java/lang/String
    //   65: astore_2
    //   66: aload_2
    //   67: aload_3
    //   68: invokespecial 38	java/lang/String:<init>	(Ljava/lang/String;)V
    //   71: new 40	org/json/JSONObject
    //   74: astore_3
    //   75: aload_3
    //   76: aload_2
    //   77: invokespecial 41	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   80: aload_3
    //   81: ldc 43
    //   83: invokevirtual 47	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   86: astore_2
    //   87: aload_3
    //   88: ldc 49
    //   90: invokevirtual 47	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   93: astore_3
    //   94: ldc 51
    //   96: ldc 53
    //   98: new 30	java/lang/String
    //   101: dup
    //   102: aload 4
    //   104: invokespecial 56	java/lang/String:<init>	([B)V
    //   107: invokestatic 60	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   110: invokevirtual 63	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   113: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: new 70	com/tencent/mm/g/a/dv
    //   119: dup
    //   120: invokespecial 71	com/tencent/mm/g/a/dv:<init>	()V
    //   123: astore 5
    //   125: aload 5
    //   127: getfield 75	com/tencent/mm/g/a/dv:cxt	Lcom/tencent/mm/g/a/dv$a;
    //   130: aload_3
    //   131: putfield 81	com/tencent/mm/g/a/dv$a:ceI	Ljava/lang/String;
    //   134: aload 5
    //   136: getfield 75	com/tencent/mm/g/a/dv:cxt	Lcom/tencent/mm/g/a/dv$a;
    //   139: aload 4
    //   141: putfield 84	com/tencent/mm/g/a/dv$a:data	[B
    //   144: aload 5
    //   146: getfield 75	com/tencent/mm/g/a/dv:cxt	Lcom/tencent/mm/g/a/dv$a;
    //   149: aload_2
    //   150: putfield 87	com/tencent/mm/g/a/dv$a:cwz	Ljava/lang/String;
    //   153: getstatic 93	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   156: aload 5
    //   158: invokevirtual 97	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   161: pop
    //   162: sipush 19287
    //   165: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: goto -122 -> 46
    //   171: astore_3
    //   172: aconst_null
    //   173: astore_2
    //   174: ldc 51
    //   176: aload_3
    //   177: ldc 99
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: ldc 51
    //   188: ldc 105
    //   190: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: aconst_null
    //   194: astore_3
    //   195: goto -101 -> 94
    //   198: astore_3
    //   199: goto -25 -> 174
    //
    // Exception table:
    //   from	to	target	type
    //   62	87	171	java/lang/Exception
    //   87	94	198	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil.4
 * JD-Core Version:    0.6.2
 */
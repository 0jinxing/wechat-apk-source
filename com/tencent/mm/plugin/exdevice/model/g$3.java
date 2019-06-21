package com.tencent.mm.plugin.exdevice.model;

final class g$3
  implements j.a
{
  g$3(g paramg)
  {
  }

  // ERROR //
  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: sipush 19253
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: bipush 15
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
    //   40: sipush 19253
    //   43: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: return
    //   47: aload_2
    //   48: iconst_0
    //   49: aaload
    //   50: checkcast 30	java/lang/Integer
    //   53: invokevirtual 39	java/lang/Integer:intValue	()I
    //   56: istore_3
    //   57: aload_2
    //   58: iconst_1
    //   59: aaload
    //   60: checkcast 32	[B
    //   63: astore 4
    //   65: new 41	java/lang/String
    //   68: astore_2
    //   69: aload_2
    //   70: aload 4
    //   72: invokespecial 44	java/lang/String:<init>	([B)V
    //   75: ldc 46
    //   77: ldc 48
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload_2
    //   86: aastore
    //   87: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: new 56	org/json/JSONObject
    //   93: astore 4
    //   95: aload 4
    //   97: aload_2
    //   98: invokespecial 59	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   101: aload 4
    //   103: ldc 61
    //   105: invokevirtual 65	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   108: istore_1
    //   109: aload_0
    //   110: getfield 14	com/tencent/mm/plugin/exdevice/model/g$3:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   113: aload_0
    //   114: getfield 14	com/tencent/mm/plugin/exdevice/model/g$3:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   117: getfield 69	com/tencent/mm/plugin/exdevice/model/g:lsX	Ljava/util/HashMap;
    //   120: iload_3
    //   121: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   124: invokevirtual 79	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   127: checkcast 41	java/lang/String
    //   130: iload_1
    //   131: invokestatic 83	com/tencent/mm/plugin/exdevice/model/g:a	(Lcom/tencent/mm/plugin/exdevice/model/g;Ljava/lang/String;I)V
    //   134: iload_1
    //   135: bipush 100
    //   137: if_icmplt +18 -> 155
    //   140: aload_0
    //   141: getfield 14	com/tencent/mm/plugin/exdevice/model/g$3:lsY	Lcom/tencent/mm/plugin/exdevice/model/g;
    //   144: getfield 69	com/tencent/mm/plugin/exdevice/model/g:lsX	Ljava/util/HashMap;
    //   147: iload_3
    //   148: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   151: invokevirtual 86	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   154: pop
    //   155: ldc 46
    //   157: ldc 88
    //   159: iconst_1
    //   160: anewarray 4	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: iload_1
    //   166: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   169: aastore
    //   170: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: sipush 19253
    //   176: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: goto -133 -> 46
    //   182: astore_2
    //   183: iconst_0
    //   184: istore_1
    //   185: ldc 46
    //   187: ldc 90
    //   189: iconst_1
    //   190: anewarray 4	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload_2
    //   196: aastore
    //   197: invokestatic 93	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: goto -45 -> 155
    //   203: astore_2
    //   204: goto -19 -> 185
    //
    // Exception table:
    //   from	to	target	type
    //   65	109	182	org/json/JSONException
    //   109	134	203	org/json/JSONException
    //   140	155	203	org/json/JSONException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g.3
 * JD-Core Version:    0.6.2
 */
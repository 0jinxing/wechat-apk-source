package com.tencent.mm.plugin.exdevice.model;

final class ExdeviceWCLanSDKUtil$2
  implements j.a
{
  ExdeviceWCLanSDKUtil$2(ExdeviceWCLanSDKUtil paramExdeviceWCLanSDKUtil)
  {
  }

  // ERROR //
  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: sipush 19285
    //   5: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iload_1
    //   9: bipush 14
    //   11: if_icmpne +21 -> 32
    //   14: aload_2
    //   15: ifnull +17 -> 32
    //   18: aload_2
    //   19: arraylength
    //   20: ifle +12 -> 32
    //   23: aload_2
    //   24: iconst_0
    //   25: aaload
    //   26: instanceof 30
    //   29: ifne +10 -> 39
    //   32: sipush 19285
    //   35: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: return
    //   39: aload_2
    //   40: iconst_0
    //   41: aaload
    //   42: checkcast 30	[B
    //   45: astore 4
    //   47: new 35	java/lang/String
    //   50: astore_2
    //   51: aload_2
    //   52: aload 4
    //   54: invokespecial 38	java/lang/String:<init>	([B)V
    //   57: new 40	org/json/JSONObject
    //   60: astore 4
    //   62: aload 4
    //   64: aload_2
    //   65: invokespecial 43	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   68: aload 4
    //   70: ldc 45
    //   72: invokevirtual 49	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   75: astore_2
    //   76: aload_2
    //   77: ldc 51
    //   79: invokevirtual 55	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   82: astore 4
    //   84: aload_2
    //   85: ldc 57
    //   87: invokevirtual 55	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   90: astore 5
    //   92: aload 4
    //   94: astore 6
    //   96: aload 5
    //   98: astore 4
    //   100: aload_2
    //   101: astore 5
    //   103: aload 6
    //   105: ifnull +8 -> 113
    //   108: aload 4
    //   110: ifnonnull +51 -> 161
    //   113: ldc 59
    //   115: ldc 61
    //   117: invokestatic 67	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   120: sipush 19285
    //   123: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: goto -88 -> 38
    //   129: astore 6
    //   131: aconst_null
    //   132: astore 5
    //   134: aconst_null
    //   135: astore_2
    //   136: ldc 59
    //   138: ldc 69
    //   140: iconst_1
    //   141: anewarray 4	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload 6
    //   148: aastore
    //   149: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: aload_3
    //   153: astore 4
    //   155: aload_2
    //   156: astore 6
    //   158: goto -55 -> 103
    //   161: ldc 59
    //   163: new 74	java/lang/StringBuilder
    //   166: dup
    //   167: ldc 76
    //   169: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   172: aload 6
    //   174: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: ldc 83
    //   179: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: aload 4
    //   184: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: invokestatic 95	com/tencent/mm/plugin/exdevice/model/ad:boW	()Lcom/tencent/mm/plugin/exdevice/h/c;
    //   196: aload 4
    //   198: invokevirtual 101	com/tencent/mm/plugin/exdevice/h/c:Kv	(Ljava/lang/String;)Lcom/tencent/mm/plugin/exdevice/h/b;
    //   201: ifnonnull +28 -> 229
    //   204: ldc 59
    //   206: ldc 103
    //   208: iconst_1
    //   209: anewarray 4	java/lang/Object
    //   212: dup
    //   213: iconst_0
    //   214: aload 4
    //   216: aastore
    //   217: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: sipush 19285
    //   223: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: goto -188 -> 38
    //   229: aload_0
    //   230: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$2:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   233: getfield 107	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lsL	Ljava/util/HashMap;
    //   236: aload 4
    //   238: aload 5
    //   240: invokevirtual 108	org/json/JSONObject:toString	()Ljava/lang/String;
    //   243: invokevirtual 112	java/lang/String:getBytes	()[B
    //   246: invokevirtual 118	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   249: pop
    //   250: new 120	com/tencent/mm/g/a/dw
    //   253: dup
    //   254: invokespecial 121	com/tencent/mm/g/a/dw:<init>	()V
    //   257: astore_2
    //   258: aload_2
    //   259: getfield 125	com/tencent/mm/g/a/dw:cxu	Lcom/tencent/mm/g/a/dw$a;
    //   262: aload 4
    //   264: putfield 131	com/tencent/mm/g/a/dw$a:ceI	Ljava/lang/String;
    //   267: aload_0
    //   268: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$2:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   271: getfield 134	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lti	Ljava/util/HashMap;
    //   274: aload 4
    //   276: invokevirtual 138	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   279: ifeq +53 -> 332
    //   282: aload_0
    //   283: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$2:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   286: getfield 134	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lti	Ljava/util/HashMap;
    //   289: aload 4
    //   291: invokevirtual 142	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   294: checkcast 35	java/lang/String
    //   297: astore 6
    //   299: aload 6
    //   301: invokestatic 148	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   304: ifne +15 -> 319
    //   307: aload_2
    //   308: getfield 125	com/tencent/mm/g/a/dw:cxu	Lcom/tencent/mm/g/a/dw$a;
    //   311: aload 6
    //   313: invokevirtual 112	java/lang/String:getBytes	()[B
    //   316: putfield 151	com/tencent/mm/g/a/dw$a:cxv	[B
    //   319: aload_0
    //   320: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$2:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   323: getfield 134	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lti	Ljava/util/HashMap;
    //   326: aload 4
    //   328: invokevirtual 154	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   331: pop
    //   332: aload_2
    //   333: getfield 125	com/tencent/mm/g/a/dw:cxu	Lcom/tencent/mm/g/a/dw$a;
    //   336: iconst_0
    //   337: putfield 158	com/tencent/mm/g/a/dw$a:bcU	Z
    //   340: getstatic 164	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   343: aload_2
    //   344: invokevirtual 168	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   347: pop
    //   348: sipush 19285
    //   351: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   354: goto -316 -> 38
    //   357: astore 6
    //   359: aconst_null
    //   360: astore 4
    //   362: aload_2
    //   363: astore 5
    //   365: aload 4
    //   367: astore_2
    //   368: goto -232 -> 136
    //   371: astore 6
    //   373: aload_2
    //   374: astore 5
    //   376: aload 4
    //   378: astore_2
    //   379: goto -243 -> 136
    //
    // Exception table:
    //   from	to	target	type
    //   47	76	129	java/lang/Exception
    //   76	84	357	java/lang/Exception
    //   84	92	371	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil.2
 * JD-Core Version:    0.6.2
 */
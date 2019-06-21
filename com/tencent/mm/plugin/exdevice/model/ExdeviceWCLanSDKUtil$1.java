package com.tencent.mm.plugin.exdevice.model;

final class ExdeviceWCLanSDKUtil$1
  implements j.a
{
  ExdeviceWCLanSDKUtil$1(ExdeviceWCLanSDKUtil paramExdeviceWCLanSDKUtil)
  {
  }

  // ERROR //
  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: sipush 19284
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: bipush 10
    //   9: if_icmpne +7 -> 16
    //   12: aload_2
    //   13: ifnonnull +10 -> 23
    //   16: sipush 19284
    //   19: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: return
    //   23: aload_2
    //   24: iconst_0
    //   25: aaload
    //   26: checkcast 33	[B
    //   29: astore_3
    //   30: new 35	java/lang/String
    //   33: astore_2
    //   34: aload_2
    //   35: aload_3
    //   36: invokespecial 38	java/lang/String:<init>	([B)V
    //   39: new 40	org/json/JSONObject
    //   42: astore 4
    //   44: aload 4
    //   46: aload_2
    //   47: invokespecial 43	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   50: aload 4
    //   52: ldc 45
    //   54: invokevirtual 49	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   57: astore_2
    //   58: aload_2
    //   59: ldc 51
    //   61: invokevirtual 55	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore_3
    //   65: aload_2
    //   66: ldc 57
    //   68: invokevirtual 55	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore_2
    //   72: aload 4
    //   74: ldc 59
    //   76: invokevirtual 63	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   79: ifne +26 -> 105
    //   82: aload 4
    //   84: ldc 59
    //   86: invokevirtual 55	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   89: astore 4
    //   91: aload_0
    //   92: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$1:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   95: getfield 67	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lti	Ljava/util/HashMap;
    //   98: aload_2
    //   99: aload 4
    //   101: invokevirtual 73	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   104: pop
    //   105: new 75	com/tencent/mm/g/a/dw
    //   108: astore 4
    //   110: aload 4
    //   112: invokespecial 76	com/tencent/mm/g/a/dw:<init>	()V
    //   115: aload 4
    //   117: getfield 80	com/tencent/mm/g/a/dw:cxu	Lcom/tencent/mm/g/a/dw$a;
    //   120: aload_2
    //   121: putfield 86	com/tencent/mm/g/a/dw$a:ceI	Ljava/lang/String;
    //   124: aload_0
    //   125: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$1:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   128: getfield 67	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lti	Ljava/util/HashMap;
    //   131: aload_2
    //   132: invokevirtual 90	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   135: ifeq +52 -> 187
    //   138: aload_0
    //   139: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$1:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   142: getfield 67	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lti	Ljava/util/HashMap;
    //   145: aload_2
    //   146: invokevirtual 94	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   149: checkcast 35	java/lang/String
    //   152: astore 5
    //   154: aload 5
    //   156: invokestatic 99	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   159: ifne +16 -> 175
    //   162: aload 4
    //   164: getfield 80	com/tencent/mm/g/a/dw:cxu	Lcom/tencent/mm/g/a/dw$a;
    //   167: aload 5
    //   169: invokevirtual 103	java/lang/String:getBytes	()[B
    //   172: putfield 106	com/tencent/mm/g/a/dw$a:cxv	[B
    //   175: aload_0
    //   176: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$1:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   179: getfield 67	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lti	Ljava/util/HashMap;
    //   182: aload_2
    //   183: invokevirtual 109	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   186: pop
    //   187: aload 4
    //   189: getfield 80	com/tencent/mm/g/a/dw:cxu	Lcom/tencent/mm/g/a/dw$a;
    //   192: iconst_0
    //   193: putfield 113	com/tencent/mm/g/a/dw$a:bcU	Z
    //   196: getstatic 119	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   199: aload 4
    //   201: invokevirtual 123	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   204: pop
    //   205: aload_3
    //   206: ifnull +7 -> 213
    //   209: aload_2
    //   210: ifnonnull +48 -> 258
    //   213: ldc 125
    //   215: ldc 127
    //   217: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   220: sipush 19284
    //   223: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: goto -204 -> 22
    //   229: astore 4
    //   231: aconst_null
    //   232: astore_2
    //   233: aconst_null
    //   234: astore_3
    //   235: ldc 125
    //   237: aload 4
    //   239: ldc 135
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: invokestatic 139	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: ldc 125
    //   250: ldc 141
    //   252: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   255: goto -50 -> 205
    //   258: sipush 19284
    //   261: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   264: goto -242 -> 22
    //   267: astore 4
    //   269: aconst_null
    //   270: astore_2
    //   271: goto -36 -> 235
    //   274: astore 4
    //   276: goto -41 -> 235
    //
    // Exception table:
    //   from	to	target	type
    //   30	65	229	java/lang/Exception
    //   65	72	267	java/lang/Exception
    //   72	105	274	java/lang/Exception
    //   105	175	274	java/lang/Exception
    //   175	187	274	java/lang/Exception
    //   187	205	274	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil.1
 * JD-Core Version:    0.6.2
 */
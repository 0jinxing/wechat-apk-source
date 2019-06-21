package com.tencent.mm.plugin.exdevice.model;

final class ExdeviceWCLanSDKUtil$3
  implements j.a
{
  ExdeviceWCLanSDKUtil$3(ExdeviceWCLanSDKUtil paramExdeviceWCLanSDKUtil)
  {
  }

  // ERROR //
  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: sipush 19286
    //   5: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iload_1
    //   9: bipush 13
    //   11: if_icmpne +31 -> 42
    //   14: aload_2
    //   15: ifnull +27 -> 42
    //   18: aload_2
    //   19: arraylength
    //   20: iconst_2
    //   21: if_icmplt +21 -> 42
    //   24: aload_2
    //   25: iconst_0
    //   26: aaload
    //   27: instanceof 30
    //   30: ifeq +12 -> 42
    //   33: aload_2
    //   34: iconst_1
    //   35: aaload
    //   36: instanceof 32
    //   39: ifne +10 -> 49
    //   42: sipush 19286
    //   45: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: return
    //   49: aload_2
    //   50: iconst_0
    //   51: aaload
    //   52: checkcast 30	java/lang/String
    //   55: astore 4
    //   57: aload_2
    //   58: iconst_1
    //   59: aaload
    //   60: checkcast 32	java/lang/Integer
    //   63: invokevirtual 39	java/lang/Integer:intValue	()I
    //   66: istore_1
    //   67: new 30	java/lang/String
    //   70: astore_2
    //   71: aload_2
    //   72: aload 4
    //   74: invokespecial 42	java/lang/String:<init>	(Ljava/lang/String;)V
    //   77: new 44	org/json/JSONObject
    //   80: astore 4
    //   82: aload 4
    //   84: aload_2
    //   85: invokespecial 45	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   88: aload 4
    //   90: ldc 47
    //   92: invokevirtual 51	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   95: astore_2
    //   96: aload 4
    //   98: ldc 53
    //   100: invokevirtual 51	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   103: astore 4
    //   105: iload_1
    //   106: tableswitch	default:+18 -> 124, 1:+165->271
    //   125: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   128: iconst_0
    //   129: putfield 57	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:ltm	I
    //   132: aload_0
    //   133: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   136: getfield 61	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lsN	Ljava/util/HashMap;
    //   139: aload_2
    //   140: getstatic 67	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   143: invokevirtual 73	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   146: pop
    //   147: ldc 75
    //   149: ldc 77
    //   151: invokestatic 82	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   154: aload_0
    //   155: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   158: getfield 86	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:ltl	Z
    //   161: ifeq +71 -> 232
    //   164: aload_0
    //   165: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   168: getfield 57	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:ltm	I
    //   171: iconst_2
    //   172: if_icmpne +13 -> 185
    //   175: aload_0
    //   176: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   179: iconst_1
    //   180: aload_2
    //   181: invokevirtual 90	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:l	(ZLjava/lang/String;)Z
    //   184: pop
    //   185: new 92	com/tencent/mm/g/a/du
    //   188: dup
    //   189: invokespecial 93	com/tencent/mm/g/a/du:<init>	()V
    //   192: astore_3
    //   193: aload_3
    //   194: getfield 97	com/tencent/mm/g/a/du:cxr	Lcom/tencent/mm/g/a/du$a;
    //   197: aload_2
    //   198: putfield 103	com/tencent/mm/g/a/du$a:ceI	Ljava/lang/String;
    //   201: aload_3
    //   202: getfield 97	com/tencent/mm/g/a/du:cxr	Lcom/tencent/mm/g/a/du$a;
    //   205: aload_0
    //   206: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   209: getfield 57	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:ltm	I
    //   212: putfield 106	com/tencent/mm/g/a/du$a:cxs	I
    //   215: aload_3
    //   216: getfield 97	com/tencent/mm/g/a/du:cxr	Lcom/tencent/mm/g/a/du$a;
    //   219: aload 4
    //   221: putfield 109	com/tencent/mm/g/a/du$a:cwz	Ljava/lang/String;
    //   224: getstatic 115	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   227: aload_3
    //   228: invokevirtual 119	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   231: pop
    //   232: sipush 19286
    //   235: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: goto -190 -> 48
    //   241: astore 4
    //   243: aconst_null
    //   244: astore_2
    //   245: ldc 75
    //   247: aload 4
    //   249: ldc 121
    //   251: iconst_0
    //   252: anewarray 4	java/lang/Object
    //   255: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: ldc 75
    //   260: ldc 127
    //   262: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   265: aload_3
    //   266: astore 4
    //   268: goto -163 -> 105
    //   271: aload_0
    //   272: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   275: iconst_2
    //   276: putfield 57	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:ltm	I
    //   279: aload_0
    //   280: getfield 14	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil$3:ltn	Lcom/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil;
    //   283: getfield 61	com/tencent/mm/plugin/exdevice/model/ExdeviceWCLanSDKUtil:lsN	Ljava/util/HashMap;
    //   286: aload_2
    //   287: getstatic 133	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   290: invokevirtual 73	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   293: pop
    //   294: ldc 75
    //   296: ldc 135
    //   298: invokestatic 82	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   301: goto -147 -> 154
    //   304: astore 4
    //   306: goto -61 -> 245
    //
    // Exception table:
    //   from	to	target	type
    //   67	96	241	java/lang/Exception
    //   96	105	304	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil.3
 * JD-Core Version:    0.6.2
 */
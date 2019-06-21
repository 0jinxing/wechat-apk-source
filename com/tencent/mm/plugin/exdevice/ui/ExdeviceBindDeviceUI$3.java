package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.mm.plugin.exdevice.model.j.a;

final class ExdeviceBindDeviceUI$3
  implements j.a
{
  ExdeviceBindDeviceUI$3(ExdeviceBindDeviceUI paramExdeviceBindDeviceUI)
  {
  }

  // ERROR //
  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: sipush 19828
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: bipush 10
    //   9: if_icmpne +7 -> 16
    //   12: aload_2
    //   13: ifnonnull +10 -> 23
    //   16: sipush 19828
    //   19: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: return
    //   23: aload_2
    //   24: iconst_0
    //   25: aaload
    //   26: checkcast 36	[B
    //   29: astore_3
    //   30: new 38	java/lang/String
    //   33: astore_2
    //   34: aload_2
    //   35: aload_3
    //   36: invokespecial 41	java/lang/String:<init>	([B)V
    //   39: new 43	org/json/JSONObject
    //   42: astore 4
    //   44: aload 4
    //   46: aload_2
    //   47: invokespecial 46	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   50: aload 4
    //   52: ldc 48
    //   54: invokevirtual 52	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   57: astore_3
    //   58: aload_3
    //   59: ldc 54
    //   61: invokevirtual 58	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore_2
    //   65: aload_3
    //   66: ldc 60
    //   68: invokevirtual 58	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore_3
    //   72: aload_3
    //   73: astore 5
    //   75: aload_2
    //   76: astore 6
    //   78: aload 4
    //   80: ldc 62
    //   82: invokevirtual 66	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   85: ifne +68 -> 153
    //   88: aload 4
    //   90: ldc 62
    //   92: invokevirtual 58	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   95: astore 5
    //   97: aload_2
    //   98: astore 6
    //   100: aload 5
    //   102: astore_2
    //   103: aload 6
    //   105: ifnull +7 -> 112
    //   108: aload_3
    //   109: ifnonnull +52 -> 161
    //   112: sipush 19828
    //   115: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -96 -> 22
    //   121: astore 6
    //   123: aconst_null
    //   124: astore_3
    //   125: aconst_null
    //   126: astore_2
    //   127: ldc 68
    //   129: aload 6
    //   131: ldc 70
    //   133: iconst_0
    //   134: anewarray 4	java/lang/Object
    //   137: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: ldc 68
    //   142: ldc 78
    //   144: invokestatic 82	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: aload_2
    //   148: astore 6
    //   150: aload_3
    //   151: astore 5
    //   153: aconst_null
    //   154: astore_2
    //   155: aload 5
    //   157: astore_3
    //   158: goto -55 -> 103
    //   161: new 84	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f
    //   164: dup
    //   165: aload_0
    //   166: getfield 17	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$3:lze	Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI;
    //   169: iconst_0
    //   170: invokespecial 87	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:<init>	(Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI;B)V
    //   173: astore 5
    //   175: aload 5
    //   177: getstatic 93	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$b:lzp	Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$b;
    //   180: putfield 96	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:lzy	Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$b;
    //   183: aload 5
    //   185: new 98	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$d
    //   188: dup
    //   189: aload_0
    //   190: getfield 17	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$3:lze	Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI;
    //   193: iconst_0
    //   194: invokespecial 99	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$d:<init>	(Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI;B)V
    //   197: putfield 103	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:lzA	Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$d;
    //   200: aload 5
    //   202: getfield 103	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:lzA	Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$d;
    //   205: aload 6
    //   207: putfield 107	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$d:lxI	Ljava/lang/String;
    //   210: aload 5
    //   212: getfield 103	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:lzA	Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$d;
    //   215: aload_3
    //   216: putfield 110	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$d:lsu	Ljava/lang/String;
    //   219: aload_2
    //   220: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   223: ifne +57 -> 280
    //   226: aload 5
    //   228: aload_2
    //   229: invokevirtual 119	java/lang/String:getBytes	()[B
    //   232: iconst_2
    //   233: invokestatic 125	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   236: putfield 128	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:lzF	Ljava/lang/String;
    //   239: ldc 68
    //   241: ldc 130
    //   243: iconst_1
    //   244: anewarray 4	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload 5
    //   251: getfield 128	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:lzF	Ljava/lang/String;
    //   254: aastore
    //   255: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: new 135	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$3$1
    //   261: dup
    //   262: aload_0
    //   263: aload 5
    //   265: invokespecial 138	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$3$1:<init>	(Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$3;Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f;)V
    //   268: invokestatic 144	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   271: sipush 19828
    //   274: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   277: goto -255 -> 22
    //   280: aload 5
    //   282: aconst_null
    //   283: putfield 128	com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$f:lzF	Ljava/lang/String;
    //   286: goto -28 -> 258
    //   289: astore 6
    //   291: aconst_null
    //   292: astore_3
    //   293: goto -166 -> 127
    //   296: astore 6
    //   298: goto -171 -> 127
    //
    // Exception table:
    //   from	to	target	type
    //   30	65	121	java/lang/Exception
    //   65	72	289	java/lang/Exception
    //   78	97	296	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.3
 * JD-Core Version:    0.6.2
 */
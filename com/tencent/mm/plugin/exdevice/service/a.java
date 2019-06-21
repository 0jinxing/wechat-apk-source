package com.tencent.mm.plugin.exdevice.service;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class a
  implements r
{
  private static a lwh = null;
  private Object cli;
  private final HashMap<Long, Long> lwi;
  private g lwj;
  ak mHandler;

  public a(g paramg)
  {
    AppMethodBeat.i(19522);
    this.lwi = new HashMap();
    this.lwj = null;
    this.mHandler = new a.a(this, v.bpz().fPG.oAl.getLooper());
    this.cli = new Object();
    this.lwj = paramg;
    lwh = this;
    AppMethodBeat.o(19522);
  }

  // ERROR //
  private int a(long paramLong, p paramp)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore 4
    //   3: sipush 19526
    //   6: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: ldc 91
    //   11: ldc 93
    //   13: iconst_1
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: lload_1
    //   20: invokestatic 99	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   23: aastore
    //   24: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: aload_3
    //   28: invokestatic 110	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   31: aload_3
    //   32: invokeinterface 116 1 0
    //   37: invokeinterface 122 1 0
    //   42: lstore 5
    //   44: ldc 124
    //   46: lload 5
    //   48: invokestatic 130	com/tencent/mm/plugin/exdevice/h/a:C	(Ljava/lang/String;J)Z
    //   51: ifne +127 -> 178
    //   54: ldc 91
    //   56: ldc 132
    //   58: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: new 16	com/tencent/mm/plugin/exdevice/service/a$e
    //   64: dup
    //   65: invokespecial 137	com/tencent/mm/plugin/exdevice/service/a$e:<init>	()V
    //   68: astore_3
    //   69: aload_3
    //   70: lload_1
    //   71: putfield 141	com/tencent/mm/plugin/exdevice/service/a$e:lwo	J
    //   74: aload_3
    //   75: iconst_m1
    //   76: putfield 145	com/tencent/mm/plugin/exdevice/service/a$e:lqz	I
    //   79: aload_3
    //   80: iconst_m1
    //   81: putfield 148	com/tencent/mm/plugin/exdevice/service/a$e:lqL	I
    //   84: aload_3
    //   85: ldc 150
    //   87: putfield 154	com/tencent/mm/plugin/exdevice/service/a$e:hxN	Ljava/lang/String;
    //   90: getstatic 35	com/tencent/mm/plugin/exdevice/service/a:lwh	Lcom/tencent/mm/plugin/exdevice/service/a;
    //   93: getfield 80	com/tencent/mm/plugin/exdevice/service/a:mHandler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   96: getstatic 35	com/tencent/mm/plugin/exdevice/service/a:lwh	Lcom/tencent/mm/plugin/exdevice/service/a;
    //   99: getfield 80	com/tencent/mm/plugin/exdevice/service/a:mHandler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   102: iconst_3
    //   103: iconst_0
    //   104: iconst_0
    //   105: aload_3
    //   106: invokevirtual 160	com/tencent/mm/sdk/platformtools/ak:obtainMessage	(IIILjava/lang/Object;)Landroid/os/Message;
    //   109: invokevirtual 164	com/tencent/mm/sdk/platformtools/ak:sendMessage	(Landroid/os/Message;)Z
    //   112: invokestatic 168	junit/framework/Assert:assertTrue	(Z)V
    //   115: sipush 19526
    //   118: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: iload 4
    //   123: ireturn
    //   124: astore_3
    //   125: ldc 91
    //   127: ldc 170
    //   129: iconst_1
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_3
    //   136: invokevirtual 174	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: ldc 91
    //   145: aload_3
    //   146: ldc 179
    //   148: iconst_0
    //   149: anewarray 4	java/lang/Object
    //   152: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: aload_0
    //   156: getfield 53	com/tencent/mm/plugin/exdevice/service/a:lwj	Lcom/tencent/mm/plugin/exdevice/service/g;
    //   159: lload_1
    //   160: iconst_m1
    //   161: iconst_m1
    //   162: ldc 185
    //   164: invokeinterface 191 6 0
    //   169: sipush 19526
    //   172: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: goto -54 -> 121
    //   178: aload_0
    //   179: getfield 51	com/tencent/mm/plugin/exdevice/service/a:lwi	Ljava/util/HashMap;
    //   182: lload 5
    //   184: invokestatic 99	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   187: invokevirtual 195	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   190: ifne +45 -> 235
    //   193: ldc 91
    //   195: ldc 197
    //   197: iconst_1
    //   198: anewarray 4	java/lang/Object
    //   201: dup
    //   202: iconst_0
    //   203: lload 5
    //   205: invokestatic 99	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   208: aastore
    //   209: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: aload_0
    //   213: getfield 53	com/tencent/mm/plugin/exdevice/service/a:lwj	Lcom/tencent/mm/plugin/exdevice/service/g;
    //   216: lload_1
    //   217: iconst_m1
    //   218: iconst_m1
    //   219: ldc 199
    //   221: invokeinterface 191 6 0
    //   226: sipush 19526
    //   229: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: goto -111 -> 121
    //   235: new 201	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd
    //   238: dup
    //   239: invokespecial 202	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:<init>	()V
    //   242: astore 7
    //   244: aload 7
    //   246: aload_0
    //   247: getfield 51	com/tencent/mm/plugin/exdevice/service/a:lwi	Ljava/util/HashMap;
    //   250: lload 5
    //   252: invokestatic 99	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   255: invokevirtual 206	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   258: checkcast 95	java/lang/Long
    //   261: invokevirtual 209	java/lang/Long:longValue	()J
    //   264: putfield 212	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:channelID	J
    //   267: aload 7
    //   269: aload_3
    //   270: invokeinterface 116 1 0
    //   275: invokeinterface 216 1 0
    //   280: putfield 219	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:reqCmdID	I
    //   283: aload 7
    //   285: aload_3
    //   286: invokeinterface 116 1 0
    //   291: invokeinterface 222 1 0
    //   296: putfield 225	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:respCmdID	I
    //   299: aload_3
    //   300: invokeinterface 116 1 0
    //   305: invokeinterface 229 1 0
    //   310: astore 8
    //   312: aload_3
    //   313: invokeinterface 116 1 0
    //   318: invokeinterface 232 1 0
    //   323: istore 9
    //   325: lload_1
    //   326: iload 9
    //   328: i2s
    //   329: aload 7
    //   331: aload 8
    //   333: invokestatic 238	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice:startTask	(JSLcom/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd;[B)I
    //   336: ifeq +127 -> 463
    //   339: ldc 91
    //   341: ldc 240
    //   343: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   346: sipush 19526
    //   349: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   352: goto -231 -> 121
    //   355: astore_3
    //   356: ldc 91
    //   358: ldc 244
    //   360: iconst_1
    //   361: anewarray 4	java/lang/Object
    //   364: dup
    //   365: iconst_0
    //   366: aload_3
    //   367: invokevirtual 174	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   370: aastore
    //   371: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   374: ldc 91
    //   376: aload_3
    //   377: ldc 179
    //   379: iconst_0
    //   380: anewarray 4	java/lang/Object
    //   383: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   386: aload_0
    //   387: getfield 53	com/tencent/mm/plugin/exdevice/service/a:lwj	Lcom/tencent/mm/plugin/exdevice/service/g;
    //   390: lload_1
    //   391: iconst_m1
    //   392: iconst_m1
    //   393: ldc 246
    //   395: invokeinterface 191 6 0
    //   400: sipush 19526
    //   403: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   406: goto -285 -> 121
    //   409: astore_3
    //   410: ldc 91
    //   412: ldc 248
    //   414: iconst_1
    //   415: anewarray 4	java/lang/Object
    //   418: dup
    //   419: iconst_0
    //   420: aload_3
    //   421: invokevirtual 174	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   424: aastore
    //   425: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   428: ldc 91
    //   430: aload_3
    //   431: ldc 179
    //   433: iconst_0
    //   434: anewarray 4	java/lang/Object
    //   437: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   440: aload_0
    //   441: getfield 53	com/tencent/mm/plugin/exdevice/service/a:lwj	Lcom/tencent/mm/plugin/exdevice/service/g;
    //   444: lload_1
    //   445: iconst_m1
    //   446: iconst_m1
    //   447: ldc 250
    //   449: invokeinterface 191 6 0
    //   454: sipush 19526
    //   457: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   460: goto -339 -> 121
    //   463: ldc 91
    //   465: ldc 252
    //   467: bipush 6
    //   469: anewarray 4	java/lang/Object
    //   472: dup
    //   473: iconst_0
    //   474: lload_1
    //   475: invokestatic 99	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   478: aastore
    //   479: dup
    //   480: iconst_1
    //   481: lload 5
    //   483: invokestatic 99	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   486: aastore
    //   487: dup
    //   488: iconst_2
    //   489: aload 7
    //   491: getfield 212	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:channelID	J
    //   494: invokestatic 99	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   497: aastore
    //   498: dup
    //   499: iconst_3
    //   500: iload 9
    //   502: invokestatic 257	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   505: aastore
    //   506: dup
    //   507: iconst_4
    //   508: aload 7
    //   510: getfield 219	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:reqCmdID	I
    //   513: invokestatic 257	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   516: aastore
    //   517: dup
    //   518: iconst_5
    //   519: aload 7
    //   521: getfield 225	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:respCmdID	I
    //   524: invokestatic 257	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   527: aastore
    //   528: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   531: sipush 19526
    //   534: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   537: iconst_0
    //   538: istore 4
    //   540: goto -419 -> 121
    //
    // Exception table:
    //   from	to	target	type
    //   31	44	124	android/os/RemoteException
    //   267	299	355	android/os/RemoteException
    //   299	325	409	android/os/RemoteException
  }

  public static void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(19528);
    Assert.assertNotNull(lwh);
    ab.i("MicroMsg.exdevice.BTDeviceManager", "onStateChange channelId = " + paramLong + " oldState = " + paramInt1 + " newState = " + paramInt2 + " errCode = " + paramInt3);
    paramLong = lwh.hP(paramLong);
    if (-1L == paramLong)
    {
      ab.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
      AppMethodBeat.o(19528);
    }
    while (true)
    {
      return;
      a.d locald = new a.d((byte)0);
      locald.jJa = paramLong;
      locald.lqz = paramInt3;
      locald.lwn = paramInt2;
      locald.lwm = paramInt1;
      Assert.assertTrue(lwh.mHandler.sendMessage(lwh.mHandler.obtainMessage(4, 0, 0, locald)));
      AppMethodBeat.o(19528);
    }
  }

  public static long[] bpl()
  {
    AppMethodBeat.i(19524);
    long[] arrayOfLong = com.tencent.mm.plugin.exdevice.h.a.Kt("conneted_device");
    AppMethodBeat.o(19524);
    return arrayOfLong;
  }

  public static void c(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(19527);
    Assert.assertNotNull(lwh);
    ab.i("MicroMsg.exdevice.BTDeviceManager", "onTaskEnd taskId = " + paramLong + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    a.e locale = new a.e();
    locale.lwo = paramLong;
    locale.lqz = paramInt2;
    locale.lqL = paramInt1;
    locale.hxN = paramString;
    Assert.assertTrue(lwh.mHandler.sendMessage(lwh.mHandler.obtainMessage(3, 0, 0, locale)));
    AppMethodBeat.o(19527);
  }

  private boolean hO(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19525);
    ab.i("MicroMsg.exdevice.BTDeviceManager", "stopChannelImp deviceId = ".concat(String.valueOf(paramLong)));
    ab.i("MicroMsg.exdevice.BTDeviceManager", "remove the device from connected devices : [%d]", new Object[] { Long.valueOf(paramLong) });
    if (!com.tencent.mm.plugin.exdevice.h.a.E("conneted_device", paramLong))
      ab.e("MicroMsg.exdevice.BTDeviceManager", "removeFromSharedPreferences failed!!!");
    if (!this.lwi.containsKey(Long.valueOf(paramLong)))
    {
      ab.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
      AppMethodBeat.o(19525);
    }
    while (true)
    {
      return bool;
      Java2CExDevice.stopChannelService(((Long)this.lwi.get(Long.valueOf(paramLong))).longValue());
      Java2CExDevice.destroyChannel(((Long)this.lwi.get(Long.valueOf(paramLong))).longValue());
      AppMethodBeat.o(19525);
      bool = true;
    }
  }

  private long hP(long paramLong)
  {
    AppMethodBeat.i(19529);
    if (!this.lwi.containsValue(Long.valueOf(paramLong)))
    {
      ab.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find DeviceId by channelId");
      AppMethodBeat.o(19529);
      paramLong = -1L;
    }
    while (true)
    {
      return paramLong;
      Iterator localIterator = this.lwi.entrySet().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (paramLong == ((Long)localEntry.getValue()).longValue())
          {
            paramLong = ((Long)localEntry.getKey()).longValue();
            AppMethodBeat.o(19529);
            break;
          }
        }
      Assert.assertTrue(false);
      AppMethodBeat.o(19529);
      paramLong = -1L;
    }
  }

  public static void onDeviceRequest(long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(19530);
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      ab.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = %d, seq = %d, cmdId =%d, datain len = %d, errCode = %d", new Object[] { Long.valueOf(paramLong), Short.valueOf(paramShort1), Short.valueOf(paramShort2), Integer.valueOf(i), Integer.valueOf(paramInt) });
      Assert.assertNotNull(lwh);
      ab.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = " + paramLong + " seq = " + paramShort1 + "cmdId = " + paramShort2 + "errCode = " + paramInt);
      paramLong = lwh.hP(paramLong);
      if (-1L != paramLong)
        break label161;
      ab.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
      AppMethodBeat.o(19530);
    }
    while (true)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      label161: a.b localb = new a.b((byte)0);
      localb.jJa = paramLong;
      localb.lqA = paramArrayOfByte;
      localb.lwl = paramShort2;
      localb.lqG = paramShort1;
      Assert.assertTrue(lwh.mHandler.sendMessage(lwh.mHandler.obtainMessage(5, paramInt, 0, localb)));
      AppMethodBeat.o(19530);
    }
  }

  public static boolean uL(int paramInt)
  {
    AppMethodBeat.i(19523);
    ab.i("MicroMsg.exdevice.BTDeviceManager", "------stopScan------");
    boolean bool;
    if (!b.uL(paramInt))
    {
      ab.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.stopScan Failed!!!");
      bool = false;
      AppMethodBeat.o(19523);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(19523);
    }
  }

  public final void Fy(String paramString)
  {
    AppMethodBeat.i(19533);
    ab.i("MicroMsg.exdevice.BTDeviceManager", "------onScanError------ error code = %d, error msg = %s", new Object[] { Integer.valueOf(-1), Integer.valueOf(-1) });
    if (!this.mHandler.post(new a.1(this)))
      ab.e("MicroMsg.exdevice.BTDeviceManager", "onScanError: mHandler.post failed!!!");
    AppMethodBeat.o(19533);
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19532);
    if (paramArrayOfByte == null);
    for (int i = -1; ; i = paramArrayOfByte.length)
    {
      ab.d("MicroMsg.exdevice.BTDeviceManager", "------onScanFound------ aBluetoothVersion = %d, device mac = %s, device name = %s, rssi = %d, advertisment length = %d", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i) });
      paramString1 = new a.c(paramString1, paramString2, paramInt2, paramArrayOfByte);
      Assert.assertTrue(this.mHandler.sendMessage(this.mHandler.obtainMessage(1, 0, 0, paramString1)));
      AppMethodBeat.o(19532);
      return;
    }
  }

  public final void rQ(int paramInt)
  {
    AppMethodBeat.i(19531);
    ab.i("MicroMsg.exdevice.BTDeviceManager", "******onScanFinished******aBluetoothVersion = ".concat(String.valueOf(paramInt)));
    Assert.assertTrue(this.mHandler.sendMessage(this.mHandler.obtainMessage(2, 0, 0, null)));
    AppMethodBeat.o(19531);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.a
 * JD-Core Version:    0.6.2
 */
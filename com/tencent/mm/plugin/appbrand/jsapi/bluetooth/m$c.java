package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import org.json.JSONObject;

public final class m$c extends ah
{
  private static final int CTRL_INDEX = 189;
  private static final String NAME = "onBluetoothAdapterStateChange";
  private static JSONObject hDD;
  private static c hDF;

  static
  {
    AppMethodBeat.i(94202);
    hDF = new c();
    hDD = new JSONObject();
    AppMethodBeat.o(94202);
  }

  // ERROR //
  public static void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 47
    //   5: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +19 -> 28
    //   12: ldc 49
    //   14: ldc 51
    //   16: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc 47
    //   21: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: ldc 2
    //   26: monitorexit
    //   27: return
    //   28: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:hDD	Lorg/json/JSONObject;
    //   31: ldc 59
    //   33: invokevirtual 63	org/json/JSONObject:remove	(Ljava/lang/String;)Ljava/lang/Object;
    //   36: pop
    //   37: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:hDD	Lorg/json/JSONObject;
    //   40: ldc 59
    //   42: iload_1
    //   43: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   46: pop
    //   47: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:hDD	Lorg/json/JSONObject;
    //   50: ldc 69
    //   52: invokevirtual 63	org/json/JSONObject:remove	(Ljava/lang/String;)Ljava/lang/Object;
    //   55: pop
    //   56: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:hDD	Lorg/json/JSONObject;
    //   59: ldc 69
    //   61: iload_2
    //   62: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   65: pop
    //   66: aload_0
    //   67: ifnonnull +43 -> 110
    //   70: ldc 49
    //   72: ldc 71
    //   74: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: ldc 47
    //   79: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: goto -58 -> 24
    //   85: astore_0
    //   86: ldc 2
    //   88: monitorexit
    //   89: aload_0
    //   90: athrow
    //   91: astore_3
    //   92: ldc 49
    //   94: ldc 76
    //   96: iconst_1
    //   97: anewarray 78	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_3
    //   103: aastore
    //   104: invokestatic 81	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: goto -41 -> 66
    //   110: getstatic 32	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:hDF	Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c;
    //   113: aload_0
    //   114: aload_0
    //   115: invokeinterface 87 1 0
    //   120: invokevirtual 91	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:b	(Lcom/tencent/mm/plugin/appbrand/jsapi/c;I)Lcom/tencent/mm/plugin/appbrand/jsapi/ah;
    //   123: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:hDD	Lorg/json/JSONObject;
    //   126: invokevirtual 95	org/json/JSONObject:toString	()Ljava/lang/String;
    //   129: invokevirtual 99	com/tencent/mm/plugin/appbrand/jsapi/ah:AM	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/jsapi/ah;
    //   132: invokevirtual 102	com/tencent/mm/plugin/appbrand/jsapi/ah:aCj	()V
    //   135: ldc 49
    //   137: ldc 104
    //   139: iconst_1
    //   140: anewarray 78	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$c:hDD	Lorg/json/JSONObject;
    //   148: invokevirtual 95	org/json/JSONObject:toString	()Ljava/lang/String;
    //   151: aastore
    //   152: invokestatic 106	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: ldc 47
    //   157: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: goto -136 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   3	8	85	finally
    //   12	24	85	finally
    //   28	66	85	finally
    //   70	82	85	finally
    //   92	107	85	finally
    //   110	160	85	finally
    //   28	66	91	org/json/JSONException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m.c
 * JD-Core Version:    0.6.2
 */
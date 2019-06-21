package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import org.json.JSONObject;

final class m$b extends ah
{
  private static final int CTRL_INDEX = 188;
  private static final String NAME = "onBLEConnectionStateChanged";
  private static JSONObject hDD;
  private static b hDE;

  static
  {
    AppMethodBeat.i(94200);
    hDE = new b();
    hDD = new JSONObject();
    AppMethodBeat.o(94200);
  }

  // ERROR //
  public static void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, String paramString, boolean paramBoolean)
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
    //   28: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:hDD	Lorg/json/JSONObject;
    //   31: ldc 59
    //   33: invokevirtual 63	org/json/JSONObject:remove	(Ljava/lang/String;)Ljava/lang/Object;
    //   36: pop
    //   37: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:hDD	Lorg/json/JSONObject;
    //   40: ldc 59
    //   42: aload_1
    //   43: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   46: pop
    //   47: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:hDD	Lorg/json/JSONObject;
    //   50: ldc 69
    //   52: invokevirtual 63	org/json/JSONObject:remove	(Ljava/lang/String;)Ljava/lang/Object;
    //   55: pop
    //   56: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:hDD	Lorg/json/JSONObject;
    //   59: ldc 69
    //   61: iload_2
    //   62: invokevirtual 72	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   65: pop
    //   66: aload_0
    //   67: ifnonnull +43 -> 110
    //   70: ldc 49
    //   72: ldc 74
    //   74: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: ldc 47
    //   79: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: goto -58 -> 24
    //   85: astore_0
    //   86: ldc 2
    //   88: monitorexit
    //   89: aload_0
    //   90: athrow
    //   91: astore_1
    //   92: ldc 49
    //   94: ldc 79
    //   96: iconst_1
    //   97: anewarray 81	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_1
    //   103: aastore
    //   104: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: goto -41 -> 66
    //   110: getstatic 32	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:hDE	Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b;
    //   113: aload_0
    //   114: aload_0
    //   115: invokeinterface 90 1 0
    //   120: invokevirtual 93	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:b	(Lcom/tencent/mm/plugin/appbrand/jsapi/c;I)Lcom/tencent/mm/plugin/appbrand/jsapi/ah;
    //   123: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:hDD	Lorg/json/JSONObject;
    //   126: invokevirtual 97	org/json/JSONObject:toString	()Ljava/lang/String;
    //   129: invokevirtual 101	com/tencent/mm/plugin/appbrand/jsapi/ah:AM	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/jsapi/ah;
    //   132: invokevirtual 104	com/tencent/mm/plugin/appbrand/jsapi/ah:aCj	()V
    //   135: ldc 49
    //   137: ldc 106
    //   139: iconst_1
    //   140: anewarray 81	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: getstatic 37	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/m$b:hDD	Lorg/json/JSONObject;
    //   148: invokevirtual 97	org/json/JSONObject:toString	()Ljava/lang/String;
    //   151: aastore
    //   152: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m.b
 * JD-Core Version:    0.6.2
 */
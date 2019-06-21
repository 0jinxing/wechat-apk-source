package com.tencent.mm.plugin.appbrand.jsapi.m;

import java.lang.ref.WeakReference;

final class c$1
  implements Runnable
{
  c$1(c paramc, WeakReference paramWeakReference, int paramInt)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 30
    //   4: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 40	com/tencent/mm/plugin/appbrand/jsapi/m/c:aEJ	()Ljava/util/concurrent/atomic/AtomicReference;
    //   10: invokevirtual 46	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   13: checkcast 48	java/lang/String
    //   16: astore_2
    //   17: aload_2
    //   18: invokestatic 54	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   21: ifeq +216 -> 237
    //   24: invokestatic 60	com/tencent/mm/sdk/platformtools/ah:doI	()Z
    //   27: ifeq +159 -> 186
    //   30: ldc 62
    //   32: getstatic 68	com/tencent/mm/ipcinvoker/type/IPCVoid:eGH	Lcom/tencent/mm/ipcinvoker/type/IPCVoid;
    //   35: ldc 70
    //   37: invokestatic 76	com/tencent/mm/ipcinvoker/extension/XIPCInvoker:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   40: checkcast 78	com/tencent/mm/ipcinvoker/type/IPCString
    //   43: getfield 82	com/tencent/mm/ipcinvoker/type/IPCString:value	Ljava/lang/String;
    //   46: astore_3
    //   47: aload_3
    //   48: invokestatic 54	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   51: ifne +181 -> 232
    //   54: aload_3
    //   55: invokestatic 88	com/tencent/mm/a/e:cy	(Ljava/lang/String;)Ljava/lang/String;
    //   58: astore_2
    //   59: aload_2
    //   60: astore_3
    //   61: aload_3
    //   62: astore_2
    //   63: aload_3
    //   64: invokestatic 54	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   67: ifeq +18 -> 85
    //   70: invokestatic 92	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   73: invokevirtual 98	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   76: ldc 100
    //   78: invokevirtual 106	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   81: invokestatic 110	com/tencent/mm/sdk/platformtools/bo:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   84: astore_2
    //   85: aload_2
    //   86: astore_3
    //   87: aload_2
    //   88: invokestatic 54	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   91: ifne +12 -> 103
    //   94: invokestatic 40	com/tencent/mm/plugin/appbrand/jsapi/m/c:aEJ	()Ljava/util/concurrent/atomic/AtomicReference;
    //   97: aload_2
    //   98: invokevirtual 114	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
    //   101: aload_2
    //   102: astore_3
    //   103: aload_0
    //   104: getfield 20	com/tencent/mm/plugin/appbrand/jsapi/m/c$1:hKr	Ljava/lang/ref/WeakReference;
    //   107: invokevirtual 117	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   110: checkcast 119	com/tencent/mm/plugin/appbrand/page/u
    //   113: astore_1
    //   114: aload_1
    //   115: ifnull +47 -> 162
    //   118: aload_1
    //   119: invokevirtual 122	com/tencent/mm/plugin/appbrand/page/u:isRunning	()Z
    //   122: ifeq +40 -> 162
    //   125: new 124	java/util/HashMap
    //   128: dup
    //   129: iconst_1
    //   130: invokespecial 126	java/util/HashMap:<init>	(I)V
    //   133: astore_2
    //   134: aload_2
    //   135: ldc 128
    //   137: aload_3
    //   138: invokeinterface 134 3 0
    //   143: pop
    //   144: aload_1
    //   145: aload_0
    //   146: getfield 22	com/tencent/mm/plugin/appbrand/jsapi/m/c$1:eIl	I
    //   149: aload_0
    //   150: getfield 18	com/tencent/mm/plugin/appbrand/jsapi/m/c$1:hUj	Lcom/tencent/mm/plugin/appbrand/jsapi/m/c;
    //   153: ldc 136
    //   155: aload_2
    //   156: invokevirtual 140	com/tencent/mm/plugin/appbrand/jsapi/m/c:j	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   159: invokevirtual 144	com/tencent/mm/plugin/appbrand/page/u:M	(ILjava/lang/String;)V
    //   162: ldc 30
    //   164: invokestatic 147	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: return
    //   168: astore_3
    //   169: ldc 149
    //   171: aload_3
    //   172: ldc 151
    //   174: iconst_0
    //   175: anewarray 4	java/lang/Object
    //   178: invokestatic 157	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aconst_null
    //   182: astore_3
    //   183: goto -136 -> 47
    //   186: ldc 159
    //   188: astore_3
    //   189: goto -142 -> 47
    //   192: astore_2
    //   193: ldc 149
    //   195: aload_2
    //   196: ldc 161
    //   198: iconst_1
    //   199: anewarray 4	java/lang/Object
    //   202: dup
    //   203: iconst_0
    //   204: aload_3
    //   205: aastore
    //   206: invokestatic 157	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: aload_1
    //   210: astore_3
    //   211: goto -150 -> 61
    //   214: astore_2
    //   215: ldc 149
    //   217: aload_2
    //   218: ldc 163
    //   220: iconst_0
    //   221: anewarray 4	java/lang/Object
    //   224: invokestatic 157	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: aload_3
    //   228: astore_2
    //   229: goto -144 -> 85
    //   232: aload_2
    //   233: astore_3
    //   234: goto -173 -> 61
    //   237: aload_2
    //   238: astore_3
    //   239: goto -136 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   30	47	168	java/lang/Exception
    //   54	59	192	java/lang/Exception
    //   70	85	214	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.c.1
 * JD-Core Version:    0.6.2
 */
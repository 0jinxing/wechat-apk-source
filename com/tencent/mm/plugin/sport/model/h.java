package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  private static f fur;
  private static long rPG;
  private static JSONObject rPH;
  private static h.a rPI;

  static
  {
    AppMethodBeat.i(93683);
    fur = new h.1();
    AppMethodBeat.o(93683);
  }

  public static void ZS(String paramString)
  {
    AppMethodBeat.i(93680);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(93680);
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        rPH = localJSONObject;
        AppMethodBeat.o(93680);
      }
      catch (Exception paramString)
      {
        rPH = null;
        AppMethodBeat.o(93680);
      }
    }
  }

  public static void a(h.a parama)
  {
    rPI = parama;
  }

  public static boolean cws()
  {
    boolean bool = true;
    AppMethodBeat.i(93678);
    if (rPG == 0L)
      rPG = k.aa(1, 0L);
    if (System.currentTimeMillis() - rPG > 86400000L)
    {
      rPG = System.currentTimeMillis();
      k.ab(1, rPG);
      ab.i("MicroMsg.Sport.SportConfigLogic", "start to request sport config");
      g.Rg().a(1947, fur);
      g.Rg().a(new e(), 0);
      AppMethodBeat.o(93678);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Sport.SportConfigLogic", "last request time is %s", new Object[] { n.fQ(rPG) });
      AppMethodBeat.o(93678);
      bool = false;
    }
  }

  // ERROR //
  public static JSONObject cwt()
  {
    // Byte code:
    //   0: ldc 118
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   8: ifnonnull +160 -> 168
    //   11: invokestatic 123	com/tencent/mm/sdk/platformtools/ah:bqo	()Z
    //   14: ifeq +165 -> 179
    //   17: ldc 125
    //   19: invokestatic 129	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   22: checkcast 125	com/tencent/mm/plugin/sport/PluginSport
    //   25: invokevirtual 133	com/tencent/mm/plugin/sport/PluginSport:getSportFileStorage	()Lcom/tencent/mm/plugin/sport/model/j;
    //   28: iconst_2
    //   29: ldc 135
    //   31: invokevirtual 141	com/tencent/mm/plugin/sport/model/j:getString	(ILjava/lang/String;)Ljava/lang/String;
    //   34: astore_0
    //   35: aload_0
    //   36: invokestatic 45	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   39: ifne +166 -> 205
    //   42: new 47	org/json/JSONObject
    //   45: astore_1
    //   46: aload_1
    //   47: aload_0
    //   48: invokespecial 49	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   51: aload_1
    //   52: putstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   55: invokestatic 123	com/tencent/mm/sdk/platformtools/ah:bqo	()Z
    //   58: ifeq +23 -> 81
    //   61: getstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   64: astore_0
    //   65: invokestatic 144	com/tencent/mm/plugin/sport/model/n:cvY	()Z
    //   68: ifeq +131 -> 199
    //   71: iconst_1
    //   72: istore_2
    //   73: aload_0
    //   74: ldc 146
    //   76: iload_2
    //   77: invokevirtual 150	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   80: pop
    //   81: ldc 152
    //   83: astore_0
    //   84: getstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   87: ifnonnull +38 -> 125
    //   90: invokestatic 155	com/tencent/mm/plugin/sport/model/h:cwu	()Lorg/json/JSONObject;
    //   93: putstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   96: invokestatic 123	com/tencent/mm/sdk/platformtools/ah:bqo	()Z
    //   99: ifeq +23 -> 122
    //   102: getstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   105: astore_0
    //   106: invokestatic 144	com/tencent/mm/plugin/sport/model/n:cvY	()Z
    //   109: ifeq +102 -> 211
    //   112: iconst_1
    //   113: istore_2
    //   114: aload_0
    //   115: ldc 146
    //   117: iload_2
    //   118: invokevirtual 150	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   121: pop
    //   122: ldc 157
    //   124: astore_0
    //   125: getstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   128: ifnonnull +16 -> 144
    //   131: new 47	org/json/JSONObject
    //   134: dup
    //   135: invokespecial 158	org/json/JSONObject:<init>	()V
    //   138: putstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   141: ldc 160
    //   143: astore_0
    //   144: ldc 80
    //   146: ldc 162
    //   148: iconst_2
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload_0
    //   155: aastore
    //   156: dup
    //   157: iconst_1
    //   158: getstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   161: invokevirtual 166	org/json/JSONObject:toString	()Ljava/lang/String;
    //   164: aastore
    //   165: invokestatic 115	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: getstatic 51	com/tencent/mm/plugin/sport/model/h:rPH	Lorg/json/JSONObject;
    //   171: astore_0
    //   172: ldc 118
    //   174: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: aload_0
    //   178: areturn
    //   179: new 137	com/tencent/mm/plugin/sport/model/j
    //   182: dup
    //   183: getstatic 172	com/tencent/mm/plugin/sport/a/a:rOY	Ljava/lang/String;
    //   186: invokespecial 173	com/tencent/mm/plugin/sport/model/j:<init>	(Ljava/lang/String;)V
    //   189: iconst_2
    //   190: ldc 135
    //   192: invokevirtual 141	com/tencent/mm/plugin/sport/model/j:getString	(ILjava/lang/String;)Ljava/lang/String;
    //   195: astore_0
    //   196: goto -161 -> 35
    //   199: iconst_0
    //   200: istore_2
    //   201: goto -128 -> 73
    //   204: astore_0
    //   205: ldc 135
    //   207: astore_0
    //   208: goto -124 -> 84
    //   211: iconst_0
    //   212: istore_2
    //   213: goto -99 -> 114
    //   216: astore_0
    //   217: goto -95 -> 122
    //
    // Exception table:
    //   from	to	target	type
    //   42	71	204	java/lang/Exception
    //   73	81	204	java/lang/Exception
    //   96	112	216	java/lang/Exception
    //   114	122	216	java/lang/Exception
  }

  // ERROR //
  private static JSONObject cwu()
  {
    // Byte code:
    //   0: ldc 176
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 180	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   8: invokevirtual 186	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   11: astore_0
    //   12: aconst_null
    //   13: astore_1
    //   14: aconst_null
    //   15: astore_2
    //   16: aload_0
    //   17: ldc 188
    //   19: invokevirtual 194	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   22: astore_0
    //   23: aload_0
    //   24: astore_2
    //   25: aload_0
    //   26: astore_1
    //   27: new 196	java/lang/String
    //   30: astore_3
    //   31: aload_0
    //   32: astore_2
    //   33: aload_0
    //   34: astore_1
    //   35: aload_3
    //   36: aload_0
    //   37: invokestatic 202	com/tencent/mm/a/e:q	(Ljava/io/InputStream;)[B
    //   40: invokespecial 205	java/lang/String:<init>	([B)V
    //   43: aload_0
    //   44: astore_2
    //   45: aload_0
    //   46: astore_1
    //   47: new 47	org/json/JSONObject
    //   50: astore 4
    //   52: aload_0
    //   53: astore_2
    //   54: aload_0
    //   55: astore_1
    //   56: aload 4
    //   58: aload_3
    //   59: invokespecial 49	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   62: aload 4
    //   64: astore_1
    //   65: aload_0
    //   66: ifnull +10 -> 76
    //   69: aload_0
    //   70: invokevirtual 210	java/io/InputStream:close	()V
    //   73: aload 4
    //   75: astore_1
    //   76: ldc 176
    //   78: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_1
    //   82: areturn
    //   83: astore_0
    //   84: aload_2
    //   85: astore_1
    //   86: ldc 80
    //   88: aload_0
    //   89: ldc 212
    //   91: iconst_0
    //   92: anewarray 4	java/lang/Object
    //   95: invokestatic 216	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: aload_2
    //   99: astore_1
    //   100: new 47	org/json/JSONObject
    //   103: dup
    //   104: invokespecial 158	org/json/JSONObject:<init>	()V
    //   107: astore_0
    //   108: aload_0
    //   109: astore_1
    //   110: aload_2
    //   111: ifnull -35 -> 76
    //   114: aload_2
    //   115: invokevirtual 210	java/io/InputStream:close	()V
    //   118: aload_0
    //   119: astore_1
    //   120: goto -44 -> 76
    //   123: astore_2
    //   124: aload_0
    //   125: astore_1
    //   126: goto -50 -> 76
    //   129: astore_2
    //   130: aload_1
    //   131: ifnull +7 -> 138
    //   134: aload_1
    //   135: invokevirtual 210	java/io/InputStream:close	()V
    //   138: ldc 176
    //   140: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_2
    //   144: athrow
    //   145: astore_2
    //   146: aload 4
    //   148: astore_1
    //   149: goto -73 -> 76
    //   152: astore_1
    //   153: goto -15 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   16	23	83	java/lang/Exception
    //   27	31	83	java/lang/Exception
    //   35	43	83	java/lang/Exception
    //   47	52	83	java/lang/Exception
    //   56	62	83	java/lang/Exception
    //   114	118	123	java/io/IOException
    //   16	23	129	finally
    //   27	31	129	finally
    //   35	43	129	finally
    //   47	52	129	finally
    //   56	62	129	finally
    //   86	98	129	finally
    //   100	108	129	finally
    //   69	73	145	java/io/IOException
    //   134	138	152	java/io/IOException
  }

  public static void lp(boolean paramBoolean)
  {
    AppMethodBeat.i(93679);
    Object localObject = cwt();
    int i;
    if (paramBoolean)
      i = 1;
    try
    {
      while (true)
      {
        ((JSONObject)localObject).put("checkWeSportInstall", i);
        label23: localObject = ((JSONObject)localObject).toString();
        k.ZT((String)localObject);
        ((PluginSport)g.M(PluginSport.class)).getDeviceStepManager().ZR((String)localObject);
        if (rPI != null)
          rPI.Pi();
        AppMethodBeat.o(93679);
        return;
        i = 0;
      }
    }
    catch (JSONException localJSONException)
    {
      break label23;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.h
 * JD-Core Version:    0.6.2
 */
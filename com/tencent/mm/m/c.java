package com.tencent.mm.m;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static final String evW;
  public SparseArray<d> evV;

  static
  {
    AppMethodBeat.i(57865);
    evW = ac.eSj + "configlist/";
    AppMethodBeat.o(57865);
  }

  public c()
  {
    AppMethodBeat.i(57849);
    this.evV = new SparseArray();
    AppMethodBeat.o(57849);
  }

  public static int Ng()
  {
    AppMethodBeat.i(57857);
    String str = ((a)g.K(a.class)).Nu().getValue("VoiceVOIPSwitch");
    ab.d("MicroMsg.ConfigListDecoder", "voip is ".concat(String.valueOf(str)));
    try
    {
      i = bo.getInt(str, 0);
      ab.d("MicroMsg.ConfigListDecoder", "showVoiceVoipEntrance is ".concat(String.valueOf(i)));
      AppMethodBeat.o(57857);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ConfigListDecoder", "exception:%s", new Object[] { bo.l(localException) });
        int i = 0;
      }
    }
  }

  public static String iY(int paramInt)
  {
    AppMethodBeat.i(57850);
    String str = evW + "config_" + paramInt + ".xml";
    AppMethodBeat.o(57850);
    return str;
  }

  // ERROR //
  private void load(int paramInt)
  {
    // Byte code:
    //   0: ldc 129
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 131	java/io/File
    //   8: astore_2
    //   9: aload_2
    //   10: iload_1
    //   11: invokestatic 133	com/tencent/mm/m/c:iY	(I)Ljava/lang/String;
    //   14: invokespecial 136	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: aload_2
    //   18: invokevirtual 140	java/io/File:exists	()Z
    //   21: ifeq +278 -> 299
    //   24: new 142	java/io/FileInputStream
    //   27: astore_3
    //   28: aload_3
    //   29: aload_2
    //   30: invokespecial 145	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: aload_3
    //   34: astore_2
    //   35: new 147	java/io/InputStreamReader
    //   38: astore 4
    //   40: aload_3
    //   41: astore_2
    //   42: aload 4
    //   44: aload_3
    //   45: ldc 149
    //   47: invokespecial 152	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   50: aload_3
    //   51: astore_2
    //   52: new 154	java/io/BufferedReader
    //   55: astore 5
    //   57: aload_3
    //   58: astore_2
    //   59: aload 5
    //   61: aload 4
    //   63: invokespecial 157	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   66: aload_3
    //   67: astore_2
    //   68: new 159	java/lang/StringBuffer
    //   71: astore 6
    //   73: aload_3
    //   74: astore_2
    //   75: aload 6
    //   77: invokespecial 160	java/lang/StringBuffer:<init>	()V
    //   80: aload_3
    //   81: astore_2
    //   82: aload 5
    //   84: invokevirtual 163	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   87: astore 7
    //   89: aload 7
    //   91: ifnull +53 -> 144
    //   94: aload_3
    //   95: astore_2
    //   96: aload 6
    //   98: aload 7
    //   100: invokevirtual 166	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   103: pop
    //   104: goto -24 -> 80
    //   107: astore 5
    //   109: aload_3
    //   110: astore_2
    //   111: ldc 78
    //   113: ldc 108
    //   115: iconst_1
    //   116: anewarray 4	java/lang/Object
    //   119: dup
    //   120: iconst_0
    //   121: aload 5
    //   123: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   126: aastore
    //   127: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_3
    //   131: ifnull +149 -> 280
    //   134: aload_3
    //   135: invokevirtual 171	java/io/InputStream:close	()V
    //   138: ldc 129
    //   140: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: return
    //   144: aload_3
    //   145: astore_2
    //   146: aload_0
    //   147: iload_1
    //   148: aload 6
    //   150: invokevirtual 172	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   153: invokevirtual 175	com/tencent/mm/m/c:o	(ILjava/lang/String;)V
    //   156: aload_3
    //   157: astore_2
    //   158: aload 4
    //   160: invokevirtual 176	java/io/InputStreamReader:close	()V
    //   163: aload_3
    //   164: astore_2
    //   165: aload 5
    //   167: invokevirtual 177	java/io/BufferedReader:close	()V
    //   170: aload_3
    //   171: ifnull +109 -> 280
    //   174: aload_3
    //   175: invokevirtual 171	java/io/InputStream:close	()V
    //   178: ldc 129
    //   180: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: goto -40 -> 143
    //   186: astore_2
    //   187: ldc 78
    //   189: ldc 108
    //   191: iconst_1
    //   192: anewarray 4	java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aload_2
    //   198: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   201: aastore
    //   202: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: ldc 129
    //   207: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: goto -67 -> 143
    //   213: astore_2
    //   214: ldc 78
    //   216: ldc 108
    //   218: iconst_1
    //   219: anewarray 4	java/lang/Object
    //   222: dup
    //   223: iconst_0
    //   224: aload_2
    //   225: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   228: aastore
    //   229: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: ldc 129
    //   234: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: goto -94 -> 143
    //   240: astore_3
    //   241: aconst_null
    //   242: astore_2
    //   243: aload_2
    //   244: ifnull +7 -> 251
    //   247: aload_2
    //   248: invokevirtual 171	java/io/InputStream:close	()V
    //   251: ldc 129
    //   253: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aload_3
    //   257: athrow
    //   258: astore_2
    //   259: ldc 78
    //   261: ldc 108
    //   263: iconst_1
    //   264: anewarray 4	java/lang/Object
    //   267: dup
    //   268: iconst_0
    //   269: aload_2
    //   270: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   273: aastore
    //   274: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: goto -26 -> 251
    //   280: ldc 129
    //   282: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: goto -142 -> 143
    //   288: astore_3
    //   289: goto -46 -> 243
    //   292: astore 5
    //   294: aconst_null
    //   295: astore_3
    //   296: goto -187 -> 109
    //   299: aconst_null
    //   300: astore_3
    //   301: goto -131 -> 170
    //
    // Exception table:
    //   from	to	target	type
    //   35	40	107	java/lang/Exception
    //   42	50	107	java/lang/Exception
    //   52	57	107	java/lang/Exception
    //   59	66	107	java/lang/Exception
    //   68	73	107	java/lang/Exception
    //   75	80	107	java/lang/Exception
    //   82	89	107	java/lang/Exception
    //   96	104	107	java/lang/Exception
    //   146	156	107	java/lang/Exception
    //   158	163	107	java/lang/Exception
    //   165	170	107	java/lang/Exception
    //   174	178	186	java/io/IOException
    //   134	138	213	java/io/IOException
    //   5	33	240	finally
    //   247	251	258	java/io/IOException
    //   35	40	288	finally
    //   42	50	288	finally
    //   52	57	288	finally
    //   59	66	288	finally
    //   68	73	288	finally
    //   75	80	288	finally
    //   82	89	288	finally
    //   96	104	288	finally
    //   111	130	288	finally
    //   146	156	288	finally
    //   158	163	288	finally
    //   165	170	288	finally
    //   5	33	292	java/lang/Exception
  }

  public final d Nf()
  {
    AppMethodBeat.i(57855);
    if (this.evV.get(1) == null)
      load(1);
    d locald = (d)this.evV.get(1);
    AppMethodBeat.o(57855);
    return locald;
  }

  public final boolean Nh()
  {
    boolean bool = true;
    AppMethodBeat.i(57858);
    if (bo.getInt(O("ShowConfig", "hidePoiOversea"), 1) == 1);
    while (true)
    {
      ab.d("MicroMsg.ConfigListDecoder", "isHidePoiOversea : ".concat(String.valueOf(bool)));
      AppMethodBeat.o(57858);
      return bool;
      bool = false;
    }
  }

  public final boolean Ni()
  {
    boolean bool = true;
    AppMethodBeat.i(57859);
    if (bo.getInt(O("WebViewConfig", "disableWePkg"), 0) == 1);
    while (true)
    {
      ab.d("MicroMsg.ConfigListDecoder", "disableWePkg : ".concat(String.valueOf(bool)));
      AppMethodBeat.o(57859);
      return bool;
      bool = false;
    }
  }

  public final String Nj()
  {
    AppMethodBeat.i(57860);
    String str = O("FreeWiFiConfig", "CheckURL");
    ab.d("MicroMsg.ConfigListDecoder", "get check url for free wifi : %s", new Object[] { str });
    AppMethodBeat.o(57860);
    return str;
  }

  public final boolean Nk()
  {
    boolean bool = true;
    AppMethodBeat.i(57861);
    if (bo.getInt(O("ShowConfig", "showRecvTmpMsgBtn"), 0) == 1);
    while (true)
    {
      ab.d("MicroMsg.ConfigListDecoder", "isShowRecvTmpMsgBtn : ".concat(String.valueOf(bool)));
      AppMethodBeat.o(57861);
      return bool;
      bool = false;
    }
  }

  public final List<String> Nl()
  {
    AppMethodBeat.i(57862);
    Object localObject1 = null;
    Object localObject3 = O("IBeacon", "Content");
    Object localObject2;
    if (!bo.isNullOrNil((String)localObject3))
    {
      ArrayList localArrayList = new ArrayList();
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(((String)localObject3).replace(",}", "}"));
        localObject3 = ((JSONObject)localObject1).keys();
        while (true)
        {
          localObject1 = localArrayList;
          if (!((Iterator)localObject3).hasNext())
            break;
          localObject1 = ((Iterator)localObject3).next();
          if (localObject1 != null)
            localArrayList.add(localObject1.toString());
        }
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.ConfigListDecoder", "[oneliang] json parse exception: " + localJSONException.getMessage());
        localObject2 = localArrayList;
      }
    }
    AppMethodBeat.o(57862);
    return localObject2;
  }

  public final String Nm()
  {
    AppMethodBeat.i(57863);
    String str = O("MailApp", "MailAppRedirectUrAndroid");
    AppMethodBeat.o(57863);
    return str;
  }

  public final String O(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(57854);
    d locald = Nf();
    if (locald == null)
    {
      AppMethodBeat.o(57854);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      if (locald.evY.containsKey(paramString1))
      {
        paramString1 = (String)((HashMap)locald.evY.get(paramString1)).get(paramString2);
        AppMethodBeat.o(57854);
      }
      else
      {
        AppMethodBeat.o(57854);
        paramString1 = localObject;
      }
    }
  }

  // ERROR //
  public final boolean d(java.io.File paramFile1, java.io.File paramFile2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc_w 307
    //   5: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: invokevirtual 140	java/io/File:exists	()Z
    //   12: ifeq +440 -> 452
    //   15: aload_1
    //   16: invokevirtual 310	java/io/File:isDirectory	()Z
    //   19: ifeq +87 -> 106
    //   22: aload_2
    //   23: invokevirtual 140	java/io/File:exists	()Z
    //   26: ifne +8 -> 34
    //   29: aload_2
    //   30: invokevirtual 313	java/io/File:mkdir	()Z
    //   33: pop
    //   34: aload_1
    //   35: invokevirtual 317	java/io/File:listFiles	()[Ljava/io/File;
    //   38: astore 4
    //   40: iconst_0
    //   41: istore 5
    //   43: iconst_0
    //   44: istore_3
    //   45: iload 5
    //   47: aload 4
    //   49: arraylength
    //   50: if_icmpge +48 -> 98
    //   53: aload 4
    //   55: iload 5
    //   57: aaload
    //   58: astore 6
    //   60: aload_0
    //   61: aload 6
    //   63: new 131	java/io/File
    //   66: dup
    //   67: aload_2
    //   68: invokevirtual 320	java/io/File:getPath	()Ljava/lang/String;
    //   71: aload 6
    //   73: invokevirtual 323	java/io/File:getName	()Ljava/lang/String;
    //   76: invokespecial 325	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: invokevirtual 327	com/tencent/mm/m/c:d	(Ljava/io/File;Ljava/io/File;)Z
    //   82: istore_3
    //   83: iload_3
    //   84: ifeq +8 -> 92
    //   87: aload_1
    //   88: invokevirtual 330	java/io/File:delete	()Z
    //   91: pop
    //   92: iinc 5 1
    //   95: goto -50 -> 45
    //   98: ldc_w 307
    //   101: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: iload_3
    //   105: ireturn
    //   106: new 142	java/io/FileInputStream
    //   109: astore 6
    //   111: aload 6
    //   113: aload_1
    //   114: invokespecial 145	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   117: new 332	java/io/FileOutputStream
    //   120: astore 7
    //   122: aload 7
    //   124: aload_2
    //   125: invokespecial 333	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   128: aload 7
    //   130: astore 4
    //   132: aload 6
    //   134: astore_2
    //   135: sipush 1024
    //   138: newarray byte
    //   140: astore 8
    //   142: aload 7
    //   144: astore 4
    //   146: aload 6
    //   148: astore_2
    //   149: aload 6
    //   151: aload 8
    //   153: invokevirtual 337	java/io/InputStream:read	([B)I
    //   156: istore 5
    //   158: iload 5
    //   160: iconst_m1
    //   161: if_icmpeq +82 -> 243
    //   164: aload 7
    //   166: astore 4
    //   168: aload 6
    //   170: astore_2
    //   171: aload 7
    //   173: aload 8
    //   175: iconst_0
    //   176: iload 5
    //   178: invokevirtual 343	java/io/OutputStream:write	([BII)V
    //   181: goto -39 -> 142
    //   184: astore_2
    //   185: aload 7
    //   187: astore_1
    //   188: aload_2
    //   189: astore 7
    //   191: aload_1
    //   192: astore 4
    //   194: aload 6
    //   196: astore_2
    //   197: ldc 78
    //   199: ldc 108
    //   201: iconst_1
    //   202: anewarray 4	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload 7
    //   209: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   212: aastore
    //   213: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: aload 6
    //   218: ifnull +8 -> 226
    //   221: aload 6
    //   223: invokevirtual 171	java/io/InputStream:close	()V
    //   226: aload_1
    //   227: ifnull +7 -> 234
    //   230: aload_1
    //   231: invokevirtual 344	java/io/OutputStream:close	()V
    //   234: ldc_w 307
    //   237: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: goto -136 -> 104
    //   243: aload 7
    //   245: astore 4
    //   247: aload 6
    //   249: astore_2
    //   250: aload 7
    //   252: invokevirtual 347	java/io/OutputStream:flush	()V
    //   255: aload 7
    //   257: astore 4
    //   259: aload 6
    //   261: astore_2
    //   262: aload_1
    //   263: invokevirtual 330	java/io/File:delete	()Z
    //   266: pop
    //   267: aload 6
    //   269: invokevirtual 171	java/io/InputStream:close	()V
    //   272: aload 7
    //   274: invokevirtual 344	java/io/OutputStream:close	()V
    //   277: ldc_w 307
    //   280: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: iconst_1
    //   284: istore_3
    //   285: goto -181 -> 104
    //   288: astore_1
    //   289: ldc 78
    //   291: ldc 108
    //   293: iconst_1
    //   294: anewarray 4	java/lang/Object
    //   297: dup
    //   298: iconst_0
    //   299: aload_1
    //   300: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   303: aastore
    //   304: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   307: goto -35 -> 272
    //   310: astore_1
    //   311: ldc 78
    //   313: ldc 108
    //   315: iconst_1
    //   316: anewarray 4	java/lang/Object
    //   319: dup
    //   320: iconst_0
    //   321: aload_1
    //   322: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   325: aastore
    //   326: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: goto -52 -> 277
    //   332: astore_2
    //   333: ldc 78
    //   335: ldc 108
    //   337: iconst_1
    //   338: anewarray 4	java/lang/Object
    //   341: dup
    //   342: iconst_0
    //   343: aload_2
    //   344: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   347: aastore
    //   348: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   351: goto -125 -> 226
    //   354: astore_1
    //   355: ldc 78
    //   357: ldc 108
    //   359: iconst_1
    //   360: anewarray 4	java/lang/Object
    //   363: dup
    //   364: iconst_0
    //   365: aload_1
    //   366: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   369: aastore
    //   370: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   373: goto -139 -> 234
    //   376: astore_1
    //   377: aconst_null
    //   378: astore 4
    //   380: aconst_null
    //   381: astore_2
    //   382: aload_2
    //   383: ifnull +7 -> 390
    //   386: aload_2
    //   387: invokevirtual 171	java/io/InputStream:close	()V
    //   390: aload 4
    //   392: ifnull +8 -> 400
    //   395: aload 4
    //   397: invokevirtual 344	java/io/OutputStream:close	()V
    //   400: ldc_w 307
    //   403: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   406: aload_1
    //   407: athrow
    //   408: astore_2
    //   409: ldc 78
    //   411: ldc 108
    //   413: iconst_1
    //   414: anewarray 4	java/lang/Object
    //   417: dup
    //   418: iconst_0
    //   419: aload_2
    //   420: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   423: aastore
    //   424: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   427: goto -37 -> 390
    //   430: astore_2
    //   431: ldc 78
    //   433: ldc 108
    //   435: iconst_1
    //   436: anewarray 4	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: aload_2
    //   442: invokestatic 112	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   445: aastore
    //   446: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: goto -49 -> 400
    //   452: ldc_w 307
    //   455: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   458: goto -354 -> 104
    //   461: astore_1
    //   462: aconst_null
    //   463: astore 4
    //   465: aload 6
    //   467: astore_2
    //   468: goto -86 -> 382
    //   471: astore_1
    //   472: goto -90 -> 382
    //   475: astore 7
    //   477: aconst_null
    //   478: astore_1
    //   479: aconst_null
    //   480: astore 6
    //   482: goto -291 -> 191
    //   485: astore 7
    //   487: aconst_null
    //   488: astore_1
    //   489: goto -298 -> 191
    //
    // Exception table:
    //   from	to	target	type
    //   135	142	184	java/lang/Exception
    //   149	158	184	java/lang/Exception
    //   171	181	184	java/lang/Exception
    //   250	255	184	java/lang/Exception
    //   262	267	184	java/lang/Exception
    //   267	272	288	java/io/IOException
    //   272	277	310	java/io/IOException
    //   221	226	332	java/io/IOException
    //   230	234	354	java/io/IOException
    //   106	117	376	finally
    //   386	390	408	java/io/IOException
    //   395	400	430	java/io/IOException
    //   117	128	461	finally
    //   135	142	471	finally
    //   149	158	471	finally
    //   171	181	471	finally
    //   197	216	471	finally
    //   250	255	471	finally
    //   262	267	471	finally
    //   106	117	475	java/lang/Exception
    //   117	128	485	java/lang/Exception
  }

  public final String getMailAppEnterUlAndroid()
  {
    AppMethodBeat.i(57864);
    String str = O("MailApp", "MailAppEnterMailAppUrlAndroid");
    AppMethodBeat.o(57864);
    return str;
  }

  public final void init()
  {
    AppMethodBeat.i(57852);
    for (int i = 0; i < d.evX.length; i++)
      load(d.evX[i]);
    AppMethodBeat.o(57852);
  }

  public final void o(int paramInt, String paramString)
  {
    AppMethodBeat.i(57853);
    d locald = new d(paramInt);
    locald.evZ = br.z(paramString, "ConfigList");
    if (locald.evZ.containsKey(".ConfigList.$version"))
      locald.version = Integer.valueOf((String)locald.evZ.get(".ConfigList.$version")).intValue();
    label515: label524: for (int i = 0; ; i++)
    {
      Object localObject1 = new StringBuilder(".ConfigList.Config");
      int j;
      label183: Object localObject2;
      label212: Object localObject3;
      label252: Object localObject4;
      if (i == 0)
      {
        paramString = "";
        String str = paramString;
        if (locald.evZ.get(str + ".$name") == null)
          break;
        localObject1 = (String)locald.evZ.get(str + ".$name");
        if (((String)localObject1).equalsIgnoreCase("JDWebViewMenu"))
          continue;
        j = 0;
        localObject2 = new StringBuilder().append(str).append(".Item");
        if (j != 0)
          break label497;
        paramString = "";
        localObject2 = paramString;
        localObject3 = new StringBuilder().append(str).append(".Item");
        if (j != 0)
          break label506;
        paramString = "";
        localObject3 = paramString + ".$key";
        localObject4 = new StringBuilder().append(str).append(".Item");
        if (j != 0)
          break label515;
      }
      for (paramString = ""; ; paramString = Integer.valueOf(j))
      {
        localObject4 = paramString + ".$lang";
        if (!locald.evZ.containsKey(localObject2))
          break label524;
        paramString = (String)locald.evZ.get(localObject3);
        localObject2 = (String)locald.evZ.get(localObject2);
        localObject3 = (String)locald.evZ.get(localObject4);
        ab.d("MicroMsg.ConfigListInfo", "itemKey " + paramString + " itemValue " + (String)localObject2 + " itemLang " + (String)localObject3);
        if ((localObject3 == null) || (d.kB((String)localObject3)))
        {
          if (!locald.evY.containsKey(localObject1))
            locald.evY.put(localObject1, new HashMap());
          ((HashMap)locald.evY.get(localObject1)).put(paramString, localObject2);
        }
        j++;
        break label183;
        paramString = Integer.valueOf(i);
        break;
        label497: paramString = Integer.valueOf(j);
        break label212;
        label506: paramString = Integer.valueOf(j);
        break label252;
      }
    }
    this.evV.put(paramInt, locald);
    AppMethodBeat.o(57853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.m.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ar;
import com.tencent.tencentmap.mapsdk.a.m;
import com.tencent.tencentmap.mapsdk.a.n;
import com.tencent.tencentmap.mapsdk.a.q;
import com.tencent.tencentmap.mapsdk.a.r;
import com.tencent.tencentmap.mapsdk.a.s;
import com.tencent.tencentmap.mapsdk.a.u;
import com.tencent.tencentmap.mapsdk.a.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jo
  implements m
{
  private static volatile Map<String, List<WeakReference<ar>>> e;
  private boolean a;
  private String b;
  private s c;
  private r d;
  private WeakReference<ar> f;
  private String g;
  private String h;
  private String i;
  private String j;

  static
  {
    AppMethodBeat.i(100087);
    e = new HashMap();
    AppMethodBeat.o(100087);
  }

  public jo(Context paramContext, ar paramar, String paramString)
  {
    AppMethodBeat.i(100076);
    this.a = false;
    this.d = r.a(paramContext);
    this.b = "";
    if ((paramar != null) && (paramar.l() != null) && (paramar.l().b() != null))
      this.b = paramar.l().b().G();
    this.f = new WeakReference(paramar);
    this.g = paramString;
    this.h = this.d.b(this.g);
    this.i = this.d.c(this.g);
    this.j = this.d.d(this.g);
    this.c = u.a(paramContext, this.g);
    AppMethodBeat.o(100076);
  }

  private String a(String paramString)
  {
    AppMethodBeat.i(100083);
    if (paramString.equals("mapconfig"))
    {
      paramString = "mapconfig.dat";
      AppMethodBeat.o(100083);
    }
    while (true)
    {
      return paramString;
      if ((paramString.equals("indoormap_config")) || (paramString.equals("indoormap_config_premium")))
      {
        paramString = "indoormap_config.dat";
        AppMethodBeat.o(100083);
      }
      else if (paramString.equals("indoorpoi_icon"))
      {
        paramString = "poi_icon_indoor@2x.png";
        AppMethodBeat.o(100083);
      }
      else if (paramString.equals("closedroadstyle_normalmode"))
      {
        paramString = "style_normalmode.xml";
        AppMethodBeat.o(100083);
      }
      else if (paramString.equals("closedroadstyle_trafficmode"))
      {
        paramString = "style_trafficmode.xml";
        AppMethodBeat.o(100083);
      }
      else if (paramString.contains("@3x"))
      {
        paramString = null;
        AppMethodBeat.o(100083);
      }
      else
      {
        AppMethodBeat.o(100083);
      }
    }
  }

  private void a()
  {
    AppMethodBeat.i(100080);
    this.c.a("mapConfigLastCheckTime", System.currentTimeMillis());
    Object localObject = (List)e.get(b());
    if (localObject == null)
      AppMethodBeat.o(100080);
    while (true)
    {
      return;
      int k = ((List)localObject).size();
      WeakReference[] arrayOfWeakReference = (WeakReference[])((List)localObject).toArray(new WeakReference[k]);
      for (int m = 0; m < k; m++)
        if (arrayOfWeakReference[m] != null)
        {
          ar localar = (ar)arrayOfWeakReference[m].get();
          if ((localar != null) && (localar.l() != null) && (localar.l().b() != null))
          {
            localObject = localar.l().b();
            if (this.a)
            {
              ((f)localObject).p();
              if (localar.b() != null)
                localar.b().a((f)localObject);
              ((f)localObject).a();
            }
            ((f)localObject).k(true);
          }
        }
      e.clear();
      u.c();
      AppMethodBeat.o(100080);
    }
  }

  private void a(String paramString, WeakReference<ar> paramWeakReference)
  {
    try
    {
      AppMethodBeat.i(100084);
      if (e.containsKey(paramString))
      {
        ((List)e.get(paramString)).add(paramWeakReference);
        AppMethodBeat.o(100084);
      }
      while (true)
      {
        return;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localArrayList.add(paramWeakReference);
        e.put(paramString, localArrayList);
        AppMethodBeat.o(100084);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  // ERROR //
  private boolean a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 232
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 234	java/io/File
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 237	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 241	java/io/File:exists	()Z
    //   18: ifeq +7 -> 25
    //   21: aload_3
    //   22: ifnonnull +14 -> 36
    //   25: iconst_0
    //   26: istore 4
    //   28: ldc 232
    //   30: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: iload 4
    //   35: ireturn
    //   36: aload_3
    //   37: aload_1
    //   38: invokestatic 246	com/tencent/map/lib/util/a:a	(Ljava/io/File;)Ljava/lang/String;
    //   41: invokevirtual 116	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   44: istore 5
    //   46: iload 5
    //   48: ifne +22 -> 70
    //   51: iconst_0
    //   52: istore 4
    //   54: ldc 232
    //   56: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: goto -26 -> 33
    //   62: astore_3
    //   63: aload_3
    //   64: invokevirtual 249	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   67: invokestatic 253	com/tencent/map/lib/d:b	(Ljava/lang/String;)V
    //   70: iload 4
    //   72: ifeq +16 -> 88
    //   75: aload_1
    //   76: aload_0
    //   77: getfield 100	com/tencent/tencentmap/mapsdk/maps/a/jo:j	Ljava/lang/String;
    //   80: invokestatic 259	com/tencent/map/lib/util/ZipUtil:upZipFile	(Ljava/io/File;Ljava/lang/String;)V
    //   83: aload_1
    //   84: invokevirtual 262	java/io/File:delete	()Z
    //   87: pop
    //   88: new 234	java/io/File
    //   91: dup
    //   92: aload_0
    //   93: getfield 100	com/tencent/tencentmap/mapsdk/maps/a/jo:j	Ljava/lang/String;
    //   96: invokespecial 237	java/io/File:<init>	(Ljava/lang/String;)V
    //   99: astore 6
    //   101: aload 6
    //   103: invokevirtual 241	java/io/File:exists	()Z
    //   106: ifeq +11 -> 117
    //   109: aload 6
    //   111: invokevirtual 265	java/io/File:isDirectory	()Z
    //   114: ifne +48 -> 162
    //   117: new 267	java/lang/StringBuilder
    //   120: dup
    //   121: ldc_w 269
    //   124: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: aload_0
    //   128: getfield 100	com/tencent/tencentmap/mapsdk/maps/a/jo:j	Ljava/lang/String;
    //   131: invokevirtual 274	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual 277	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokestatic 253	com/tencent/map/lib/d:b	(Ljava/lang/String;)V
    //   140: iconst_0
    //   141: istore 4
    //   143: ldc 232
    //   145: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -115 -> 33
    //   151: astore_1
    //   152: aload_1
    //   153: invokevirtual 278	java/io/IOException:getMessage	()Ljava/lang/String;
    //   156: invokestatic 253	com/tencent/map/lib/d:b	(Ljava/lang/String;)V
    //   159: goto -71 -> 88
    //   162: aload_0
    //   163: invokespecial 158	com/tencent/tencentmap/mapsdk/maps/a/jo:b	()Ljava/lang/String;
    //   166: astore_3
    //   167: getstatic 41	com/tencent/tencentmap/mapsdk/maps/a/jo:e	Ljava/util/Map;
    //   170: ifnull +35 -> 205
    //   173: getstatic 41	com/tencent/tencentmap/mapsdk/maps/a/jo:e	Ljava/util/Map;
    //   176: aload_3
    //   177: invokeinterface 164 2 0
    //   182: ifnull +23 -> 205
    //   185: getstatic 41	com/tencent/tencentmap/mapsdk/maps/a/jo:e	Ljava/util/Map;
    //   188: aload_3
    //   189: invokeinterface 164 2 0
    //   194: checkcast 166	java/util/List
    //   197: invokeinterface 170 1 0
    //   202: ifne +14 -> 216
    //   205: iconst_0
    //   206: istore 4
    //   208: ldc 232
    //   210: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: goto -180 -> 33
    //   216: aconst_null
    //   217: astore_1
    //   218: getstatic 41	com/tencent/tencentmap/mapsdk/maps/a/jo:e	Ljava/util/Map;
    //   221: aload_3
    //   222: invokeinterface 164 2 0
    //   227: checkcast 166	java/util/List
    //   230: astore 7
    //   232: iconst_0
    //   233: istore 8
    //   235: aload_1
    //   236: astore_3
    //   237: iload 8
    //   239: aload 7
    //   241: invokeinterface 170 1 0
    //   246: if_icmpge +46 -> 292
    //   249: aload 7
    //   251: iload 8
    //   253: invokeinterface 281 2 0
    //   258: ifnull +28 -> 286
    //   261: aload 7
    //   263: iload 8
    //   265: invokeinterface 281 2 0
    //   270: checkcast 80	java/lang/ref/WeakReference
    //   273: invokevirtual 179	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   276: checkcast 63	com/tencent/tencentmap/mapsdk/a/ar
    //   279: astore_1
    //   280: aload_1
    //   281: astore_3
    //   282: aload_1
    //   283: ifnonnull +9 -> 292
    //   286: iinc 8 1
    //   289: goto -54 -> 235
    //   292: aload_3
    //   293: ifnull +20 -> 313
    //   296: aload_3
    //   297: invokevirtual 67	com/tencent/tencentmap/mapsdk/a/ar:l	()Lcom/tencent/tencentmap/mapsdk/maps/a/iz;
    //   300: ifnull +13 -> 313
    //   303: aload_3
    //   304: invokevirtual 67	com/tencent/tencentmap/mapsdk/a/ar:l	()Lcom/tencent/tencentmap/mapsdk/maps/a/iz;
    //   307: invokevirtual 72	com/tencent/tencentmap/mapsdk/maps/a/iz:b	()Lcom/tencent/map/lib/f;
    //   310: ifnonnull +14 -> 324
    //   313: iconst_0
    //   314: istore 4
    //   316: ldc 232
    //   318: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   321: goto -288 -> 33
    //   324: aload_3
    //   325: invokevirtual 67	com/tencent/tencentmap/mapsdk/a/ar:l	()Lcom/tencent/tencentmap/mapsdk/maps/a/iz;
    //   328: invokevirtual 72	com/tencent/tencentmap/mapsdk/maps/a/iz:b	()Lcom/tencent/map/lib/f;
    //   331: astore_3
    //   332: iconst_1
    //   333: istore 4
    //   335: aload 6
    //   337: invokevirtual 285	java/io/File:listFiles	()[Ljava/io/File;
    //   340: astore 6
    //   342: aload 6
    //   344: ifnonnull +14 -> 358
    //   347: iconst_1
    //   348: istore 4
    //   350: ldc 232
    //   352: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   355: goto -322 -> 33
    //   358: aload 6
    //   360: arraylength
    //   361: istore 9
    //   363: iconst_0
    //   364: istore 8
    //   366: iload 8
    //   368: iload 9
    //   370: if_icmpge +177 -> 547
    //   373: aload 6
    //   375: iload 8
    //   377: aaload
    //   378: astore 10
    //   380: aload_0
    //   381: aload 10
    //   383: invokevirtual 288	java/io/File:getName	()Ljava/lang/String;
    //   386: invokespecial 290	com/tencent/tencentmap/mapsdk/maps/a/jo:a	(Ljava/lang/String;)Ljava/lang/String;
    //   389: astore 7
    //   391: aload 7
    //   393: ifnonnull +15 -> 408
    //   396: aload 10
    //   398: invokevirtual 262	java/io/File:delete	()Z
    //   401: pop
    //   402: iinc 8 1
    //   405: goto -39 -> 366
    //   408: new 292	java/io/FileInputStream
    //   411: astore_1
    //   412: aload_1
    //   413: aload 10
    //   415: invokespecial 295	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   418: aload 10
    //   420: invokevirtual 298	java/io/File:length	()J
    //   423: l2i
    //   424: newarray byte
    //   426: astore 10
    //   428: aload_1
    //   429: aload 10
    //   431: iconst_0
    //   432: aload 10
    //   434: arraylength
    //   435: invokevirtual 304	java/io/InputStream:read	([BII)I
    //   438: pop
    //   439: aload_2
    //   440: aload_0
    //   441: getfield 92	com/tencent/tencentmap/mapsdk/maps/a/jo:h	Ljava/lang/String;
    //   444: invokevirtual 116	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   447: ifeq +31 -> 478
    //   450: aload_3
    //   451: aload 7
    //   453: aload 10
    //   455: invokevirtual 307	com/tencent/map/lib/f:a	(Ljava/lang/String;[B)Z
    //   458: istore 5
    //   460: iload 4
    //   462: iload 5
    //   464: iand
    //   465: istore 5
    //   467: aload_1
    //   468: invokestatic 312	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   471: iload 5
    //   473: istore 4
    //   475: goto -73 -> 402
    //   478: iload 4
    //   480: istore 5
    //   482: aload_2
    //   483: aload_0
    //   484: getfield 96	com/tencent/tencentmap/mapsdk/maps/a/jo:i	Ljava/lang/String;
    //   487: invokevirtual 116	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   490: ifeq -23 -> 467
    //   493: aload_3
    //   494: aload 7
    //   496: aload 10
    //   498: invokevirtual 314	com/tencent/map/lib/f:b	(Ljava/lang/String;[B)Z
    //   501: istore 5
    //   503: iload 4
    //   505: iload 5
    //   507: iand
    //   508: istore 5
    //   510: goto -43 -> 467
    //   513: astore_1
    //   514: aconst_null
    //   515: astore_1
    //   516: aload_1
    //   517: invokestatic 312	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   520: goto -118 -> 402
    //   523: astore_1
    //   524: aconst_null
    //   525: astore_1
    //   526: aload_1
    //   527: invokestatic 312	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   530: goto -128 -> 402
    //   533: astore_2
    //   534: aconst_null
    //   535: astore_1
    //   536: aload_1
    //   537: invokestatic 312	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   540: ldc 232
    //   542: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   545: aload_2
    //   546: athrow
    //   547: ldc 232
    //   549: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   552: goto -519 -> 33
    //   555: astore_2
    //   556: goto -20 -> 536
    //   559: astore 7
    //   561: goto -35 -> 526
    //   564: astore 7
    //   566: goto -50 -> 516
    //
    // Exception table:
    //   from	to	target	type
    //   36	46	62	java/io/FileNotFoundException
    //   75	88	151	java/io/IOException
    //   408	418	513	java/io/FileNotFoundException
    //   408	418	523	java/io/IOException
    //   408	418	533	finally
    //   418	460	555	finally
    //   482	503	555	finally
    //   418	460	559	java/io/IOException
    //   482	503	559	java/io/IOException
    //   418	460	564	java/io/FileNotFoundException
    //   482	503	564	java/io/FileNotFoundException
  }

  private boolean a(boolean paramBoolean, hq paramhq)
  {
    boolean bool = false;
    AppMethodBeat.i(100081);
    if ((!paramBoolean) || (paramhq == null))
      AppMethodBeat.o(100081);
    for (paramBoolean = bool; ; paramBoolean = bool)
    {
      return paramBoolean;
      if (paramhq.d != 0)
        break;
      AppMethodBeat.o(100081);
    }
    v.a(this.j);
    String str1 = this.j + paramhq.a;
    String str2 = paramhq.a;
    int k = -1;
    switch (str2.hashCode())
    {
    default:
      switch (k)
      {
      default:
        label184: paramBoolean = false;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      break;
    case 1366209438:
    case 451944782:
    case 178735484:
    case 1221876167:
    case -810824476:
    case -752505210:
    case 1217119024:
    case 1590879768:
    case -1105972063:
    case -2042251002:
    }
    while (true)
    {
      v.c(this.j);
      AppMethodBeat.o(100081);
      break;
      if (!str2.equals("mapconfig"))
        break label184;
      k = 0;
      break label184;
      if (!str2.equals("poi_icon"))
        break label184;
      k = 1;
      break label184;
      if (!str2.equals("map_icon"))
        break label184;
      k = 2;
      break label184;
      if (!str2.equals("rtt_config.json"))
        break label184;
      k = 3;
      break label184;
      if (!str2.equals("closedroadstyle_normalmode"))
        break label184;
      k = 4;
      break label184;
      if (!str2.equals("closedroadstyle_trafficmode"))
        break label184;
      k = 5;
      break label184;
      if (!str2.equals("indoormap_config_premium"))
        break label184;
      k = 6;
      break label184;
      if (!str2.equals("indoormap_config"))
        break label184;
      k = 7;
      break label184;
      if (!str2.equals("indoorpoi_icon"))
        break label184;
      k = 8;
      break label184;
      if (!str2.equals("sdk_offline_city_ver.json"))
        break label184;
      k = 9;
      break label184;
      bool = a(str1, this.h, paramhq.f, false);
      paramBoolean = bool;
      if (bool)
      {
        this.c.a("mapConfigVersion", paramhq.c);
        this.c.a("mapConfigZipMd5", paramhq.f);
        paramBoolean = bool;
        continue;
        bool = a(str1, this.h, paramhq.f, true);
        paramBoolean = bool;
        if (bool)
        {
          this.c.a("poiIconVersion", paramhq.c);
          this.c.a("mapPoiIconZipMd5", paramhq.f);
          paramBoolean = bool;
          continue;
          bool = a(str1, this.i, paramhq.f, true);
          paramBoolean = bool;
          if (bool)
          {
            this.c.a("mapIconVersion", paramhq.c);
            this.c.a("mapIconZipMd5", paramhq.f);
            paramBoolean = bool;
            continue;
            bool = a(str1, this.h, paramhq.f, false);
            paramBoolean = bool;
            if (bool)
            {
              this.c.a("rttConfigVersion", paramhq.c);
              this.c.a("rttConfigMd5", paramhq.f);
              paramBoolean = bool;
              continue;
              bool = a(str1, this.h, paramhq.f, false);
              paramBoolean = bool;
              if (bool)
              {
                this.c.a("closeRoadSytleNomalModeVersion", paramhq.c);
                this.c.a("closeRoadSytleNomalModeMd5", paramhq.f);
                paramBoolean = bool;
                continue;
                bool = a(str1, this.h, paramhq.f, false);
                paramBoolean = bool;
                if (bool)
                {
                  this.c.a("closeRoadStyleTrafficModeVersion", paramhq.c);
                  this.c.a("closeRoadStyleTrafficModeMd5", paramhq.f);
                  paramBoolean = bool;
                  continue;
                  bool = a(str1, this.h, paramhq.f, false);
                  paramBoolean = bool;
                  if (bool)
                  {
                    this.c.a(new String[] { "mapConfigIndoorVersion", "mapConfigIndoorMd5" });
                    this.c.a("mapConfigIndoorPremiumVersion", paramhq.c);
                    this.c.a("mapConfigIndoorPremiumMd5", paramhq.f);
                    paramBoolean = bool;
                    continue;
                    bool = a(str1, this.h, paramhq.f, false);
                    paramBoolean = bool;
                    if (bool)
                    {
                      this.c.a(new String[] { "mapConfigIndoorPremiumVersion", "mapConfigIndoorPremiumMd5" });
                      this.c.a("mapConfigIndoorVersion", paramhq.c);
                      this.c.a("mapConfigIndoorMd5", paramhq.f);
                      paramBoolean = bool;
                      continue;
                      bool = a(str1, this.h, paramhq.f, false);
                      paramBoolean = bool;
                      if (bool)
                      {
                        this.c.a("mapPoiIconIndoorVersion", paramhq.c);
                        this.c.a("poiIconIndoorMd5", paramhq.f);
                        paramBoolean = bool;
                        continue;
                        bool = a(str1, this.h, paramhq.f, false);
                        paramBoolean = bool;
                        if (bool)
                        {
                          this.c.a("offlineCityListVersion", paramhq.c);
                          this.c.a("offlineCityListMd5", paramhq.f);
                          paramBoolean = bool;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private String b()
  {
    String str1 = this.g;
    String str2 = str1;
    if (str1 == null)
      str2 = ic.a;
    return str2;
  }

  private void b(String paramString, int paramInt)
  {
    AppMethodBeat.i(100079);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new hp("mapconfig", this.c.b("mapConfigVersion"), this.c.a("mapConfigZipMd5")));
    localArrayList.add(new hp("poi_icon", this.c.b("poiIconVersion"), this.c.a("mapPoiIconZipMd5")));
    localArrayList.add(new hp("map_icon", this.c.b("mapIconVersion"), this.c.a("mapIconZipMd5")));
    localArrayList.add(new hp("rtt_config.json", this.c.b("rttConfigVersion"), this.c.a("rttConfigMd5")));
    localArrayList.add(new hp("closedroadstyle_normalmode", this.c.b("closeRoadSytleNomalModeVersion"), this.c.a("closeRoadSytleNomalModeMd5")));
    localArrayList.add(new hp("closedroadstyle_trafficmode", this.c.b("closeRoadStyleTrafficModeVersion"), this.c.a("closeRoadStyleTrafficModeMd5")));
    if (paramInt == jj.d);
    for (Object localObject = new hp("indoormap_config_premium", this.c.b("mapConfigIndoorPremiumVersion"), this.c.a("mapConfigIndoorPremiumMd5")); ; localObject = new hp("indoormap_config", this.c.b("mapConfigIndoorVersion"), this.c.a("mapConfigIndoorMd5")))
    {
      localArrayList.add(localObject);
      localArrayList.add(new hp("indoorpoi_icon", this.c.b("mapPoiIconIndoorVersion"), this.c.a("poiIconIndoorMd5")));
      localArrayList.add(new hp("sdk_offline_city_ver.json", this.c.b("offlineCityListVersion"), this.c.a("offlineCityListMd5")));
      localObject = b();
      paramString = new ho(localArrayList, (String)localObject, "4.2.2.1", null, this.b, paramString);
      new n().a(this.j, paramString, this, (String)localObject);
      AppMethodBeat.o(100079);
      return;
    }
  }

  public void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(100077);
    String str = b();
    if (e.containsKey(str))
    {
      a(str, this.f);
      AppMethodBeat.o(100077);
    }
    while (true)
    {
      return;
      a(str, this.f);
      new jo.a(this, paramString, paramInt).start();
      AppMethodBeat.o(100077);
    }
  }

  public void onResult(int paramInt, Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(100078);
    if ((paramInt == 0) && ((paramObject instanceof hq)))
    {
      if ((a(true, (hq)paramObject)) || (this.a))
        bool2 = true;
      this.a = bool2;
      AppMethodBeat.o(100078);
    }
    while (true)
    {
      return;
      if (!a(false, null))
      {
        bool2 = bool1;
        if (!this.a);
      }
      else
      {
        bool2 = true;
      }
      this.a = bool2;
      AppMethodBeat.o(100078);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jo
 * JD-Core Version:    0.6.2
 */
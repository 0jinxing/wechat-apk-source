package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.basemap.data.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

public class ln
{
  private static ConcurrentHashMap<String, b[]> a;
  private static volatile ln b;
  private ReentrantReadWriteLock c;
  private String d;
  private String e;
  private boolean f;
  private AtomicInteger g;

  static
  {
    AppMethodBeat.i(100452);
    a = new ConcurrentHashMap();
    AppMethodBeat.o(100452);
  }

  private ln()
  {
    AppMethodBeat.i(100442);
    this.c = new ReentrantReadWriteLock();
    this.d = null;
    this.e = null;
    this.f = false;
    this.g = new AtomicInteger(0);
    AppMethodBeat.o(100442);
  }

  public static ln a()
  {
    AppMethodBeat.i(100443);
    if (b == null);
    try
    {
      if (b == null)
      {
        localln = new com/tencent/tencentmap/mapsdk/maps/a/ln;
        localln.<init>();
        b = localln;
      }
      ln localln = b;
      AppMethodBeat.o(100443);
      return localln;
    }
    finally
    {
      AppMethodBeat.o(100443);
    }
  }

  public static boolean a(b paramb, b[] paramArrayOfb)
  {
    AppMethodBeat.i(100450);
    int i;
    if ((paramArrayOfb == null) || (paramArrayOfb.length < 3))
    {
      i = 0;
      AppMethodBeat.o(100450);
    }
    while (true)
    {
      return i;
      int j = paramArrayOfb.length - 1;
      int m = 0;
      i = 0;
      if (m < paramArrayOfb.length)
      {
        int n;
        if ((paramArrayOfb[m].a() >= paramb.a()) || (paramArrayOfb[j].a() < paramb.a()))
        {
          n = i;
          if (paramArrayOfb[j].a() < paramb.a())
          {
            n = i;
            if (paramArrayOfb[m].a() < paramb.a());
          }
        }
        else if (paramArrayOfb[m].b() > paramb.b())
        {
          n = i;
          if (paramArrayOfb[j].b() > paramb.b());
        }
        else
        {
          if (paramArrayOfb[m].b() + (paramb.a() - paramArrayOfb[m].a()) / (paramArrayOfb[j].a() - paramArrayOfb[m].a()) * (paramArrayOfb[j].b() - paramArrayOfb[m].b()) >= paramb.b())
            break label214;
        }
        label214: int k;
        for (j = 1; ; k = 0)
        {
          n = i ^ j;
          j = m;
          m++;
          i = n;
          break;
        }
      }
      AppMethodBeat.o(100450);
    }
  }

  public static boolean a(b[] paramArrayOfb1, b[] paramArrayOfb2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(100451);
    int i = paramArrayOfb1.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      k |= a(paramArrayOfb1[j], paramArrayOfb2);
      if (k == 0);
    }
    for (j = 1; ; j = 0)
    {
      int m = paramArrayOfb2.length;
      k = 0;
      i = 0;
      boolean bool2 = false;
      while (true)
        if (k < m)
        {
          bool2 |= a(paramArrayOfb2[k], paramArrayOfb1);
          if (bool2)
            i = 1;
          k++;
          continue;
          j++;
          break;
        }
      if ((j != 0) || (i != 0))
      {
        AppMethodBeat.o(100451);
        bool1 = true;
      }
      while (true)
      {
        return bool1;
        AppMethodBeat.o(100451);
      }
    }
  }

  private static b[] d(String paramString)
  {
    String[] arrayOfString1 = null;
    AppMethodBeat.i(100448);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(100448);
      paramString = arrayOfString1;
    }
    while (true)
    {
      return paramString;
      String[] arrayOfString2 = paramString.split(":");
      if (arrayOfString2.length == 0)
      {
        AppMethodBeat.o(100448);
        paramString = arrayOfString1;
      }
      else
      {
        paramString = new b[arrayOfString2.length];
        for (int i = 0; i < arrayOfString2.length; i++)
        {
          arrayOfString1 = arrayOfString2[i].split(",");
          paramString[i] = fp.a(new GeoPoint((int)(Double.parseDouble(arrayOfString1[1]) * 1000000.0D), (int)(Double.parseDouble(arrayOfString1[0]) * 1000000.0D)));
        }
        AppMethodBeat.o(100448);
      }
    }
  }

  public void a(Context paramContext)
  {
    AppMethodBeat.i(100444);
    if ((paramContext != null) && (!this.f))
    {
      this.d = (paramContext.getFilesDir() + "/frontiers.dat");
      this.e = (this.d + ".bak");
      this.f = true;
    }
    if (this.g.getAndIncrement() <= 0)
    {
      paramContext = b();
      if (paramContext == null)
      {
        paramContext = d("124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.959229,21.677848:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666");
        a.put("china", paramContext);
        paramContext = d("124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666");
        a.put("inland", paramContext);
        paramContext = d("121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:121.959229,21.677848");
        a.put("taiwan", paramContext);
        AppMethodBeat.o(100444);
      }
    }
    while (true)
    {
      return;
      b(paramContext);
      AppMethodBeat.o(100444);
    }
  }

  // ERROR //
  public boolean a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: ldc 165
    //   9: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: aload_0
    //   13: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   16: invokevirtual 169	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   19: invokevirtual 174	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   22: new 176	java/io/File
    //   25: dup
    //   26: aload_0
    //   27: getfield 47	com/tencent/tencentmap/mapsdk/maps/a/ln:d	Ljava/lang/String;
    //   30: invokespecial 179	java/io/File:<init>	(Ljava/lang/String;)V
    //   33: astore 5
    //   35: new 176	java/io/File
    //   38: dup
    //   39: aload_0
    //   40: getfield 49	com/tencent/tencentmap/mapsdk/maps/a/ln:e	Ljava/lang/String;
    //   43: invokespecial 179	java/io/File:<init>	(Ljava/lang/String;)V
    //   46: astore 6
    //   48: aload 6
    //   50: invokevirtual 183	java/io/File:exists	()Z
    //   53: ifeq +24 -> 77
    //   56: aload 6
    //   58: invokevirtual 186	java/io/File:delete	()Z
    //   61: ifne +16 -> 77
    //   64: aload 6
    //   66: invokevirtual 189	java/io/File:deleteOnExit	()V
    //   69: ldc 165
    //   71: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: iload 4
    //   76: ireturn
    //   77: aload 5
    //   79: invokevirtual 183	java/io/File:exists	()Z
    //   82: ifeq +47 -> 129
    //   85: aload 5
    //   87: aload 6
    //   89: invokevirtual 193	java/io/File:renameTo	(Ljava/io/File;)Z
    //   92: istore 7
    //   94: iload 7
    //   96: ifne +33 -> 129
    //   99: aconst_null
    //   100: invokestatic 198	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   103: aload 6
    //   105: aload 5
    //   107: invokevirtual 193	java/io/File:renameTo	(Ljava/io/File;)Z
    //   110: pop
    //   111: aload_0
    //   112: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   115: invokevirtual 169	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   118: invokevirtual 201	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   121: ldc 165
    //   123: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: goto -52 -> 74
    //   129: new 203	java/io/FileOutputStream
    //   132: astore 8
    //   134: aload 8
    //   136: aload 5
    //   138: invokespecial 206	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   141: aload 8
    //   143: aload_1
    //   144: ldc 208
    //   146: invokevirtual 212	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   149: invokevirtual 216	java/io/FileOutputStream:write	([B)V
    //   152: aload 8
    //   154: invokevirtual 219	java/io/FileOutputStream:flush	()V
    //   157: aload 8
    //   159: invokestatic 198	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   162: aload 6
    //   164: invokevirtual 186	java/io/File:delete	()Z
    //   167: pop
    //   168: aload_0
    //   169: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   172: invokevirtual 169	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   175: invokevirtual 201	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   178: iconst_1
    //   179: istore 4
    //   181: ldc 165
    //   183: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: goto -112 -> 74
    //   189: astore_1
    //   190: aload_3
    //   191: astore_1
    //   192: aload_1
    //   193: invokestatic 198	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   196: aload 6
    //   198: aload 5
    //   200: invokevirtual 193	java/io/File:renameTo	(Ljava/io/File;)Z
    //   203: pop
    //   204: aload_0
    //   205: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   208: invokevirtual 169	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   211: invokevirtual 201	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   214: ldc 165
    //   216: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: goto -145 -> 74
    //   222: astore 8
    //   224: aload_2
    //   225: astore_1
    //   226: aload 8
    //   228: astore_2
    //   229: aload_1
    //   230: invokestatic 198	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   233: aload 6
    //   235: aload 5
    //   237: invokevirtual 193	java/io/File:renameTo	(Ljava/io/File;)Z
    //   240: pop
    //   241: aload_0
    //   242: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   245: invokevirtual 169	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   248: invokevirtual 201	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   251: ldc 165
    //   253: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aload_2
    //   257: athrow
    //   258: astore_1
    //   259: aload_1
    //   260: astore_2
    //   261: aload 8
    //   263: astore_1
    //   264: goto -35 -> 229
    //   267: astore_1
    //   268: aload 8
    //   270: astore_1
    //   271: goto -79 -> 192
    //
    // Exception table:
    //   from	to	target	type
    //   77	94	189	java/lang/Throwable
    //   129	141	189	java/lang/Throwable
    //   77	94	222	finally
    //   129	141	222	finally
    //   141	157	258	finally
    //   141	157	267	java/lang/Throwable
  }

  public int b(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(100447);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(100447);
    while (true)
    {
      return j;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        Iterator localIterator = localJSONObject.keys();
        i = 0;
        while (true)
        {
          j = i;
          try
          {
            if (localIterator.hasNext())
            {
              paramString = (String)localIterator.next();
              if ("version".equals(paramString))
              {
                i = localJSONObject.optInt(paramString);
                continue;
              }
              b[] arrayOfb = d(localJSONObject.optString(paramString));
              i = j;
              if (arrayOfb == null)
                continue;
              a.put(paramString, arrayOfb);
              i = j;
            }
          }
          catch (Throwable paramString)
          {
          }
        }
        while (true)
        {
          AppMethodBeat.o(100447);
          break;
          if (!a.containsKey("china"))
          {
            paramString = d("124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.959229,21.677848:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666");
            if (paramString != null)
              a.put("china", paramString);
          }
          if (!a.containsKey("inland"))
          {
            paramString = d("124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666");
            if (paramString != null)
              a.put("inland", paramString);
          }
          if (!a.containsKey("taiwan"))
          {
            paramString = d("121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:121.959229,21.677848");
            if (paramString != null)
              a.put("taiwan", paramString);
          }
        }
      }
      catch (Throwable paramString)
      {
        while (true)
          j = i;
      }
    }
  }

  // ERROR //
  public String b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 253
    //   4: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   11: invokevirtual 257	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   14: invokevirtual 260	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   17: new 176	java/io/File
    //   20: astore_2
    //   21: aload_2
    //   22: aload_0
    //   23: getfield 47	com/tencent/tencentmap/mapsdk/maps/a/ln:d	Ljava/lang/String;
    //   26: invokespecial 179	java/io/File:<init>	(Ljava/lang/String;)V
    //   29: new 262	java/io/FileInputStream
    //   32: astore_3
    //   33: aload_3
    //   34: aload_2
    //   35: invokespecial 263	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: new 79	java/lang/String
    //   41: astore_1
    //   42: aload_1
    //   43: aload_3
    //   44: invokestatic 266	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/InputStream;)[B
    //   47: ldc 208
    //   49: invokespecial 269	java/lang/String:<init>	([BLjava/lang/String;)V
    //   52: aload_3
    //   53: invokestatic 198	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   56: aload_0
    //   57: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   60: invokevirtual 257	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   63: invokevirtual 270	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   66: ldc 253
    //   68: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: aload_1
    //   72: astore_3
    //   73: aload_3
    //   74: areturn
    //   75: astore_3
    //   76: aconst_null
    //   77: astore_3
    //   78: aload_3
    //   79: invokestatic 198	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   82: aload_0
    //   83: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   86: invokevirtual 257	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   89: invokevirtual 270	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   92: ldc 253
    //   94: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: aconst_null
    //   98: astore_3
    //   99: goto -26 -> 73
    //   102: astore_3
    //   103: aload_1
    //   104: invokestatic 198	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   107: aload_0
    //   108: getfield 45	com/tencent/tencentmap/mapsdk/maps/a/ln:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   111: invokevirtual 257	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   114: invokevirtual 270	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   117: ldc 253
    //   119: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_3
    //   123: athrow
    //   124: astore_1
    //   125: aload_3
    //   126: astore_2
    //   127: aload_1
    //   128: astore_3
    //   129: aload_2
    //   130: astore_1
    //   131: goto -28 -> 103
    //   134: astore_1
    //   135: goto -57 -> 78
    //
    // Exception table:
    //   from	to	target	type
    //   17	38	75	java/lang/Throwable
    //   17	38	102	finally
    //   38	52	124	finally
    //   38	52	134	java/lang/Throwable
  }

  public b[] c(String paramString)
  {
    AppMethodBeat.i(100449);
    paramString = (b[])a.get(paramString);
    AppMethodBeat.o(100449);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ln
 * JD-Core Version:    0.6.2
 */
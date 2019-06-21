package com.tencent.tencentmap.mapsdk.dynamic;

import android.content.Context;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aa;
import com.tencent.tencentmap.mapsdk.a.ab;
import com.tencent.tencentmap.mapsdk.a.i;
import com.tencent.tencentmap.mapsdk.a.j;
import com.tencent.tencentmap.mapsdk.a.k;
import com.tencent.tencentmap.mapsdk.a.l;
import com.tencent.tencentmap.mapsdk.a.x;
import com.tencent.tencentmap.mapsdk.a.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class a
  implements IInitializer
{
  private static final String[] a = { "1.0.2", "1.0.3", "1.0.4" };
  private static volatile a b;
  private static l d;
  private static volatile boolean f;
  private Context c;
  private aa e;
  private boolean g;

  private a(Context paramContext)
  {
    AppMethodBeat.i(101258);
    this.c = paramContext;
    j.a(this.c);
    y.a(this.c);
    d = l.a(paramContext);
    this.e = aa.a(this.c);
    AppMethodBeat.o(101258);
  }

  private a.a a(String paramString)
  {
    AppMethodBeat.i(101269);
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new a.a(null);
    }
    catch (JSONException localJSONException2)
    {
      try
      {
        JSONObject localJSONObject;
        paramString.a = localJSONObject.getInt("status");
        try
        {
          label33: paramString.b = localJSONObject.getString("message");
          try
          {
            label43: paramString.c = localJSONObject.getString("version");
            try
            {
              label53: paramString.d = localJSONObject.getString("full_location");
              try
              {
                label63: paramString.e = localJSONObject.getString("full_md5");
                try
                {
                  label73: paramString.f = localJSONObject.getInt("full_size");
                  try
                  {
                    label83: paramString.g = localJSONObject.getString("increment_location");
                    try
                    {
                      label93: paramString.h = localJSONObject.getString("increment_md5");
                      try
                      {
                        label103: paramString.i = localJSONObject.getInt("increment_size");
                        try
                        {
                          label113: if (localJSONObject.getString("enforcement").equals("15151515"))
                            paramString.j = true;
                        }
                        catch (JSONException localJSONException2)
                        {
                          try
                          {
                            if (localJSONObject.getInt("ver_consisten") == 1);
                            for (paramString.k = true; ; paramString.k = false)
                            {
                              label147: AppMethodBeat.o(101269);
                              while (true)
                              {
                                return paramString;
                                paramString = paramString;
                                AppMethodBeat.o(101269);
                                paramString = null;
                              }
                              paramString.j = false;
                              break;
                              localJSONException2 = localJSONException2;
                              break;
                            }
                          }
                          catch (JSONException localJSONException1)
                          {
                            break label147;
                          }
                        }
                      }
                      catch (JSONException localJSONException3)
                      {
                        break label113;
                      }
                    }
                    catch (JSONException localJSONException4)
                    {
                      break label103;
                    }
                  }
                  catch (JSONException localJSONException5)
                  {
                    break label93;
                  }
                }
                catch (JSONException localJSONException6)
                {
                  break label83;
                }
              }
              catch (JSONException localJSONException7)
              {
                break label73;
              }
            }
            catch (JSONException localJSONException8)
            {
              break label63;
            }
          }
          catch (JSONException localJSONException9)
          {
            break label53;
          }
        }
        catch (JSONException localJSONException10)
        {
          break label43;
        }
      }
      catch (JSONException localJSONException11)
      {
        break label33;
      }
    }
  }

  public static a a(Context paramContext)
  {
    AppMethodBeat.i(101259);
    if (b == null);
    try
    {
      if (b == null)
      {
        a locala = new com/tencent/tencentmap/mapsdk/dynamic/a;
        locala.<init>(paramContext.getApplicationContext());
        b = locala;
      }
      paramContext = b;
      AppMethodBeat.o(101259);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(101259);
    }
    throw paramContext;
  }

  // ERROR //
  private File a(String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: ldc 166
    //   2: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +25 -> 31
    //   9: aload_1
    //   10: invokevirtual 170	java/lang/String:isEmpty	()Z
    //   13: ifne +18 -> 31
    //   16: aload_2
    //   17: ifnull +14 -> 31
    //   20: aload_2
    //   21: invokevirtual 170	java/lang/String:isEmpty	()Z
    //   24: ifne +7 -> 31
    //   27: iload_3
    //   28: ifge +12 -> 40
    //   31: ldc 166
    //   33: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: aconst_null
    //   37: astore_1
    //   38: aload_1
    //   39: areturn
    //   40: getstatic 61	com/tencent/tencentmap/mapsdk/dynamic/a:d	Lcom/tencent/tencentmap/mapsdk/a/l;
    //   43: invokevirtual 173	com/tencent/tencentmap/mapsdk/a/l:a	()Ljava/lang/String;
    //   46: invokestatic 178	com/tencent/tencentmap/mapsdk/a/k:b	(Ljava/lang/String;)Z
    //   49: pop
    //   50: aload_1
    //   51: aload_1
    //   52: bipush 47
    //   54: invokevirtual 182	java/lang/String:lastIndexOf	(I)I
    //   57: iconst_1
    //   58: iadd
    //   59: invokevirtual 186	java/lang/String:substring	(I)Ljava/lang/String;
    //   62: astore 4
    //   64: new 188	java/io/File
    //   67: dup
    //   68: new 190	java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   75: getstatic 61	com/tencent/tencentmap/mapsdk/dynamic/a:d	Lcom/tencent/tencentmap/mapsdk/a/l;
    //   78: invokevirtual 173	com/tencent/tencentmap/mapsdk/a/l:a	()Ljava/lang/String;
    //   81: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: getstatic 198	java/io/File:separator	Ljava/lang/String;
    //   87: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload 4
    //   92: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokespecial 202	java/io/File:<init>	(Ljava/lang/String;)V
    //   101: astore 5
    //   103: aload 5
    //   105: invokevirtual 205	java/io/File:exists	()Z
    //   108: ifne +9 -> 117
    //   111: aload 5
    //   113: invokevirtual 208	java/io/File:createNewFile	()Z
    //   116: pop
    //   117: iconst_0
    //   118: istore 6
    //   120: aconst_null
    //   121: astore 7
    //   123: aconst_null
    //   124: astore 8
    //   126: aconst_null
    //   127: astore 4
    //   129: iload 6
    //   131: iconst_3
    //   132: if_icmpge +358 -> 490
    //   135: new 210	java/net/URL
    //   138: astore 9
    //   140: aload 9
    //   142: aload_1
    //   143: invokespecial 211	java/net/URL:<init>	(Ljava/lang/String;)V
    //   146: aload 9
    //   148: invokevirtual 215	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   151: checkcast 217	java/net/HttpURLConnection
    //   154: astore 9
    //   156: aload 4
    //   158: astore 10
    //   160: aload 4
    //   162: astore 7
    //   164: aload 4
    //   166: astore 11
    //   168: aload 9
    //   170: invokevirtual 221	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   173: astore 4
    //   175: aload 4
    //   177: astore 10
    //   179: aload 4
    //   181: astore 7
    //   183: aload 4
    //   185: astore 11
    //   187: new 223	java/io/FileOutputStream
    //   190: astore 12
    //   192: aload 4
    //   194: astore 10
    //   196: aload 4
    //   198: astore 7
    //   200: aload 4
    //   202: astore 11
    //   204: aload 12
    //   206: aload 5
    //   208: iconst_0
    //   209: invokespecial 226	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   212: aload 9
    //   214: astore 10
    //   216: aload 12
    //   218: astore 11
    //   220: aload 4
    //   222: astore 7
    //   224: sipush 4096
    //   227: newarray byte
    //   229: astore 8
    //   231: aload 9
    //   233: astore 10
    //   235: aload 12
    //   237: astore 11
    //   239: aload 4
    //   241: astore 7
    //   243: aload 4
    //   245: aload 8
    //   247: iconst_0
    //   248: sipush 4096
    //   251: invokevirtual 232	java/io/InputStream:read	([BII)I
    //   254: istore 13
    //   256: iload 13
    //   258: iconst_m1
    //   259: if_icmpeq +211 -> 470
    //   262: aload 9
    //   264: astore 10
    //   266: aload 12
    //   268: astore 11
    //   270: aload 4
    //   272: astore 7
    //   274: aload 12
    //   276: aload 8
    //   278: iconst_0
    //   279: iload 13
    //   281: invokevirtual 236	java/io/FileOutputStream:write	([BII)V
    //   284: aload 9
    //   286: astore 10
    //   288: aload 12
    //   290: astore 11
    //   292: aload 4
    //   294: astore 7
    //   296: aload 12
    //   298: invokevirtual 239	java/io/FileOutputStream:flush	()V
    //   301: goto -70 -> 231
    //   304: astore 14
    //   306: aload 12
    //   308: astore 8
    //   310: aload 9
    //   312: astore 10
    //   314: aload 8
    //   316: astore 11
    //   318: aload 4
    //   320: astore 7
    //   322: new 190	java/lang/StringBuilder
    //   325: astore 12
    //   327: aload 9
    //   329: astore 10
    //   331: aload 8
    //   333: astore 11
    //   335: aload 4
    //   337: astore 7
    //   339: aload 12
    //   341: ldc 241
    //   343: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   346: aload 9
    //   348: astore 10
    //   350: aload 8
    //   352: astore 11
    //   354: aload 4
    //   356: astore 7
    //   358: aload 12
    //   360: aload 14
    //   362: invokevirtual 245	java/net/MalformedURLException:getMessage	()Ljava/lang/String;
    //   365: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   371: invokestatic 249	com/tencent/tencentmap/mapsdk/a/i:a	(Ljava/lang/String;)V
    //   374: aload 4
    //   376: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   379: aload 8
    //   381: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   384: aload 9
    //   386: astore 10
    //   388: aload 8
    //   390: astore 11
    //   392: aload 4
    //   394: astore 7
    //   396: aload 9
    //   398: ifnull +20 -> 418
    //   401: aload 9
    //   403: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   406: aload 4
    //   408: astore 7
    //   410: aload 8
    //   412: astore 11
    //   414: aload 9
    //   416: astore 10
    //   418: iinc 6 1
    //   421: aload 11
    //   423: astore 8
    //   425: aload 7
    //   427: astore 4
    //   429: aload 10
    //   431: astore 7
    //   433: goto -304 -> 129
    //   436: astore_1
    //   437: new 190	java/lang/StringBuilder
    //   440: dup
    //   441: ldc_w 257
    //   444: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   447: aload_1
    //   448: invokevirtual 258	java/io/IOException:getMessage	()Ljava/lang/String;
    //   451: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   457: invokestatic 249	com/tencent/tencentmap/mapsdk/a/i:a	(Ljava/lang/String;)V
    //   460: ldc 166
    //   462: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: aconst_null
    //   466: astore_1
    //   467: goto -429 -> 38
    //   470: aload 4
    //   472: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   475: aload 12
    //   477: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   480: aload 9
    //   482: ifnull +8 -> 490
    //   485: aload 9
    //   487: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   490: aload 5
    //   492: invokevirtual 262	java/io/File:length	()J
    //   495: iload_3
    //   496: i2l
    //   497: lcmp
    //   498: ifeq +167 -> 665
    //   501: ldc 166
    //   503: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   506: aconst_null
    //   507: astore_1
    //   508: goto -470 -> 38
    //   511: astore 14
    //   513: aload 12
    //   515: astore 8
    //   517: aload 9
    //   519: astore 10
    //   521: aload 8
    //   523: astore 11
    //   525: aload 4
    //   527: astore 7
    //   529: new 190	java/lang/StringBuilder
    //   532: astore 12
    //   534: aload 9
    //   536: astore 10
    //   538: aload 8
    //   540: astore 11
    //   542: aload 4
    //   544: astore 7
    //   546: aload 12
    //   548: ldc 241
    //   550: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   553: aload 9
    //   555: astore 10
    //   557: aload 8
    //   559: astore 11
    //   561: aload 4
    //   563: astore 7
    //   565: aload 12
    //   567: aload 14
    //   569: invokevirtual 258	java/io/IOException:getMessage	()Ljava/lang/String;
    //   572: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   575: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   578: invokestatic 249	com/tencent/tencentmap/mapsdk/a/i:a	(Ljava/lang/String;)V
    //   581: aload 4
    //   583: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   586: aload 8
    //   588: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   591: aload 9
    //   593: astore 10
    //   595: aload 8
    //   597: astore 11
    //   599: aload 4
    //   601: astore 7
    //   603: aload 9
    //   605: ifnull -187 -> 418
    //   608: aload 9
    //   610: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   613: aload 9
    //   615: astore 10
    //   617: aload 8
    //   619: astore 11
    //   621: aload 4
    //   623: astore 7
    //   625: goto -207 -> 418
    //   628: astore_1
    //   629: aload 10
    //   631: astore_2
    //   632: aload 11
    //   634: astore 8
    //   636: aload 7
    //   638: astore 4
    //   640: aload 4
    //   642: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   645: aload 8
    //   647: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   650: aload_2
    //   651: ifnull +7 -> 658
    //   654: aload_2
    //   655: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   658: ldc 166
    //   660: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   663: aload_1
    //   664: athrow
    //   665: aload 5
    //   667: invokestatic 267	com/tencent/tencentmap/mapsdk/a/x:a	(Ljava/io/File;)Ljava/lang/String;
    //   670: astore_1
    //   671: aload_1
    //   672: ifnull +59 -> 731
    //   675: aload_1
    //   676: aload_2
    //   677: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   680: istore 15
    //   682: iload 15
    //   684: ifne +47 -> 731
    //   687: ldc 166
    //   689: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   692: aconst_null
    //   693: astore_1
    //   694: goto -656 -> 38
    //   697: astore_1
    //   698: new 190	java/lang/StringBuilder
    //   701: dup
    //   702: ldc_w 269
    //   705: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   708: aload_1
    //   709: invokevirtual 270	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   712: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   715: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   718: invokestatic 249	com/tencent/tencentmap/mapsdk/a/i:a	(Ljava/lang/String;)V
    //   721: ldc 166
    //   723: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   726: aconst_null
    //   727: astore_1
    //   728: goto -690 -> 38
    //   731: ldc 166
    //   733: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   736: aload 5
    //   738: astore_1
    //   739: goto -701 -> 38
    //   742: astore_1
    //   743: aload 7
    //   745: astore_2
    //   746: goto -106 -> 640
    //   749: astore_1
    //   750: aload 9
    //   752: astore_2
    //   753: aload 10
    //   755: astore 4
    //   757: goto -117 -> 640
    //   760: astore 14
    //   762: aload 7
    //   764: astore 9
    //   766: goto -249 -> 517
    //   769: astore 14
    //   771: aload 7
    //   773: astore 4
    //   775: goto -258 -> 517
    //   778: astore 14
    //   780: aload 7
    //   782: astore 9
    //   784: goto -474 -> 310
    //   787: astore 14
    //   789: aload 11
    //   791: astore 4
    //   793: goto -483 -> 310
    //
    // Exception table:
    //   from	to	target	type
    //   224	231	304	java/net/MalformedURLException
    //   243	256	304	java/net/MalformedURLException
    //   274	284	304	java/net/MalformedURLException
    //   296	301	304	java/net/MalformedURLException
    //   111	117	436	java/io/IOException
    //   224	231	511	java/io/IOException
    //   243	256	511	java/io/IOException
    //   274	284	511	java/io/IOException
    //   296	301	511	java/io/IOException
    //   224	231	628	finally
    //   243	256	628	finally
    //   274	284	628	finally
    //   296	301	628	finally
    //   322	327	628	finally
    //   339	346	628	finally
    //   358	374	628	finally
    //   529	534	628	finally
    //   546	553	628	finally
    //   565	581	628	finally
    //   665	671	697	java/io/FileNotFoundException
    //   675	682	697	java/io/FileNotFoundException
    //   135	156	742	finally
    //   168	175	749	finally
    //   187	192	749	finally
    //   204	212	749	finally
    //   135	156	760	java/io/IOException
    //   168	175	769	java/io/IOException
    //   187	192	769	java/io/IOException
    //   204	212	769	java/io/IOException
    //   135	156	778	java/net/MalformedURLException
    //   168	175	787	java/net/MalformedURLException
    //   187	192	787	java/net/MalformedURLException
    //   204	212	787	java/net/MalformedURLException
  }

  private String a(Map<String, String> paramMap)
  {
    AppMethodBeat.i(101268);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = (String[])paramMap.keySet().toArray(new String[paramMap.keySet().size()]);
    for (int i = 0; i < localObject.length - 1; i++)
      localStringBuilder.append(localObject[i]).append("=").append((String)paramMap.get(localObject[i])).append("&");
    localStringBuilder.append(localObject[(localObject.length - 1)]).append("=").append((String)paramMap.get(localObject[(localObject.length - 1)]));
    paramMap = null;
    try
    {
      localObject = x.a(ab.a(Base64.encodeToString(localStringBuilder.toString().getBytes("utf-8"), 2)));
      paramMap = (Map<String, String>)localObject;
      paramMap = "&sig=" + paramMap;
      AppMethodBeat.o(101268);
      return paramMap;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        i.a("Hash params failed with error:" + localUnsupportedEncodingException.getMessage());
    }
  }

  private boolean a(File paramFile, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(101266);
    try
    {
      paramFile = x.a(paramFile);
      if (paramFile != null)
      {
        bool2 = paramFile.equals(paramString);
        AppMethodBeat.o(101266);
      }
      while (true)
      {
        return bool2;
        AppMethodBeat.o(101266);
        bool2 = bool1;
      }
    }
    catch (FileNotFoundException paramFile)
    {
      while (true)
      {
        AppMethodBeat.o(101266);
        boolean bool2 = bool1;
      }
    }
  }

  private boolean b(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(101276);
    String[] arrayOfString = h();
    if ((paramString == null) || (arrayOfString == null))
      AppMethodBeat.o(101276);
    while (true)
    {
      return bool;
      for (int i = arrayOfString.length - 1; ; i--)
      {
        if (i <= 0)
          break label68;
        if (paramString.equals(arrayOfString[i]))
        {
          bool = true;
          AppMethodBeat.o(101276);
          break;
        }
      }
      label68: AppMethodBeat.o(101276);
    }
  }

  private void c()
  {
    AppMethodBeat.i(101262);
    new Thread(new a.1(this)).start();
    AppMethodBeat.o(101262);
  }

  private boolean d()
  {
    boolean bool = false;
    AppMethodBeat.i(101263);
    if (!e())
      AppMethodBeat.o(101263);
    while (true)
    {
      return bool;
      if (!a())
      {
        AppMethodBeat.o(101263);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(101263);
      }
    }
  }

  private boolean e()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(101265);
    if ("1.1.2".equals(this.e.d()))
    {
      AppMethodBeat.o(101265);
      return bool2;
    }
    this.e.d("1.1.2");
    int i = a.length - 1;
    label52: if (i > 0)
      if (b(a[i]))
        this.e.a(a);
    for (bool2 = bool1; ; bool2 = false)
    {
      this.e.a(a);
      break;
      i--;
      break label52;
    }
  }

  // ERROR //
  private a.a f()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 371
    //   5: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 373	java/util/TreeMap
    //   11: dup
    //   12: invokespecial 374	java/util/TreeMap:<init>	()V
    //   15: astore_2
    //   16: aload_2
    //   17: ldc_w 376
    //   20: aload_0
    //   21: invokespecial 378	com/tencent/tencentmap/mapsdk/dynamic/a:i	()Ljava/lang/String;
    //   24: invokeinterface 382 3 0
    //   29: pop
    //   30: aload_2
    //   31: ldc_w 384
    //   34: ldc_w 359
    //   37: invokeinterface 382 3 0
    //   42: pop
    //   43: aload_2
    //   44: ldc_w 386
    //   47: ldc_w 388
    //   50: invokeinterface 382 3 0
    //   55: pop
    //   56: aload_2
    //   57: ldc_w 390
    //   60: invokestatic 391	com/tencent/tencentmap/mapsdk/a/y:a	()Ljava/lang/String;
    //   63: invokeinterface 382 3 0
    //   68: pop
    //   69: aload_2
    //   70: ldc_w 393
    //   73: ldc_w 395
    //   76: invokeinterface 382 3 0
    //   81: pop
    //   82: aload_2
    //   83: ldc_w 397
    //   86: invokestatic 399	com/tencent/tencentmap/mapsdk/a/y:b	()Ljava/lang/String;
    //   89: invokeinterface 382 3 0
    //   94: pop
    //   95: aload_2
    //   96: ldc_w 401
    //   99: invokestatic 403	com/tencent/tencentmap/mapsdk/a/y:c	()Ljava/lang/String;
    //   102: invokeinterface 382 3 0
    //   107: pop
    //   108: aload_2
    //   109: ldc_w 405
    //   112: ldc_w 395
    //   115: invokeinterface 382 3 0
    //   120: pop
    //   121: aload_2
    //   122: ldc_w 407
    //   125: invokestatic 408	com/tencent/tencentmap/mapsdk/a/y:d	()Ljava/lang/String;
    //   128: invokeinterface 382 3 0
    //   133: pop
    //   134: aload_2
    //   135: ldc_w 410
    //   138: invokestatic 412	com/tencent/tencentmap/mapsdk/a/y:e	()Ljava/lang/String;
    //   141: invokeinterface 382 3 0
    //   146: pop
    //   147: aload_2
    //   148: ldc_w 414
    //   151: invokestatic 416	com/tencent/tencentmap/mapsdk/a/y:f	()Ljava/lang/String;
    //   154: invokeinterface 382 3 0
    //   159: pop
    //   160: ldc_w 418
    //   163: astore_3
    //   164: aload_0
    //   165: getfield 47	com/tencent/tencentmap/mapsdk/dynamic/a:c	Landroid/content/Context;
    //   168: invokestatic 423	com/tencent/tencentmap/mapsdk/a/z:a	(Landroid/content/Context;)Landroid/net/NetworkInfo;
    //   171: astore 4
    //   173: aload 4
    //   175: ifnull +9 -> 184
    //   178: aload 4
    //   180: invokevirtual 428	android/net/NetworkInfo:getTypeName	()Ljava/lang/String;
    //   183: astore_3
    //   184: aload_2
    //   185: ldc_w 430
    //   188: aload_3
    //   189: invokeinterface 382 3 0
    //   194: pop
    //   195: aload_2
    //   196: ldc_w 432
    //   199: invokestatic 437	java/lang/System:currentTimeMillis	()J
    //   202: ldc2_w 438
    //   205: ldiv
    //   206: invokestatic 444	java/lang/Long:toString	(J)Ljava/lang/String;
    //   209: invokeinterface 382 3 0
    //   214: pop
    //   215: new 190	java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   222: ldc_w 446
    //   225: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload_0
    //   229: aload_2
    //   230: invokespecial 448	com/tencent/tencentmap/mapsdk/dynamic/a:a	(Ljava/util/Map;)Ljava/lang/String;
    //   233: ldc_w 450
    //   236: invokestatic 456	android/net/Uri:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   239: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: astore 5
    //   247: aconst_null
    //   248: astore 4
    //   250: aconst_null
    //   251: astore_2
    //   252: aconst_null
    //   253: astore_3
    //   254: iload_1
    //   255: iconst_3
    //   256: if_icmpge +359 -> 615
    //   259: new 210	java/net/URL
    //   262: astore 6
    //   264: aload 6
    //   266: aload 5
    //   268: invokespecial 211	java/net/URL:<init>	(Ljava/lang/String;)V
    //   271: aload 6
    //   273: invokevirtual 215	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   276: checkcast 217	java/net/HttpURLConnection
    //   279: astore 6
    //   281: new 458	java/io/ByteArrayOutputStream
    //   284: astore 4
    //   286: aload 4
    //   288: invokespecial 459	java/io/ByteArrayOutputStream:<init>	()V
    //   291: aload_3
    //   292: astore 7
    //   294: aload_3
    //   295: astore 8
    //   297: aload_3
    //   298: astore_2
    //   299: sipush 4096
    //   302: newarray byte
    //   304: astore 9
    //   306: aload_3
    //   307: astore 7
    //   309: aload_3
    //   310: astore 8
    //   312: aload_3
    //   313: astore_2
    //   314: aload 6
    //   316: invokevirtual 221	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   319: astore_3
    //   320: aload_3
    //   321: astore 7
    //   323: aload_3
    //   324: astore 8
    //   326: aload_3
    //   327: astore_2
    //   328: aload_3
    //   329: aload 9
    //   331: iconst_0
    //   332: sipush 4096
    //   335: invokevirtual 232	java/io/InputStream:read	([BII)I
    //   338: istore 10
    //   340: iload 10
    //   342: iconst_m1
    //   343: if_icmpeq +88 -> 431
    //   346: aload_3
    //   347: astore 7
    //   349: aload_3
    //   350: astore 8
    //   352: aload_3
    //   353: astore_2
    //   354: aload 4
    //   356: aload 9
    //   358: iconst_0
    //   359: iload 10
    //   361: invokevirtual 460	java/io/ByteArrayOutputStream:write	([BII)V
    //   364: aload_3
    //   365: astore 7
    //   367: aload_3
    //   368: astore 8
    //   370: aload_3
    //   371: astore_2
    //   372: aload 4
    //   374: invokevirtual 461	java/io/ByteArrayOutputStream:flush	()V
    //   377: goto -57 -> 320
    //   380: astore_3
    //   381: aload 4
    //   383: astore 8
    //   385: aload 7
    //   387: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   390: aload 8
    //   392: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   395: aload 6
    //   397: astore 4
    //   399: aload 8
    //   401: astore_2
    //   402: aload 7
    //   404: astore_3
    //   405: aload 6
    //   407: ifnull +18 -> 425
    //   410: aload 6
    //   412: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   415: aload 7
    //   417: astore_3
    //   418: aload 8
    //   420: astore_2
    //   421: aload 6
    //   423: astore 4
    //   425: iinc 1 1
    //   428: goto -174 -> 254
    //   431: aload_3
    //   432: astore 7
    //   434: aload_3
    //   435: astore 8
    //   437: aload_3
    //   438: astore_2
    //   439: aload 4
    //   441: invokevirtual 465	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   444: astore 9
    //   446: aload_3
    //   447: astore 7
    //   449: aload_3
    //   450: astore 8
    //   452: aload_3
    //   453: astore_2
    //   454: new 25	java/lang/String
    //   457: astore 11
    //   459: aload_3
    //   460: astore 7
    //   462: aload_3
    //   463: astore 8
    //   465: aload_3
    //   466: astore_2
    //   467: aload 11
    //   469: aload 9
    //   471: ldc_w 301
    //   474: invokespecial 468	java/lang/String:<init>	([BLjava/lang/String;)V
    //   477: aload_3
    //   478: astore 7
    //   480: aload_3
    //   481: astore 8
    //   483: aload_3
    //   484: astore_2
    //   485: aload_0
    //   486: aload 11
    //   488: invokespecial 470	com/tencent/tencentmap/mapsdk/dynamic/a:a	(Ljava/lang/String;)Lcom/tencent/tencentmap/mapsdk/dynamic/a$a;
    //   491: astore 9
    //   493: aload_3
    //   494: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   497: aload 4
    //   499: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   502: aload 6
    //   504: ifnull +8 -> 512
    //   507: aload 6
    //   509: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   512: ldc_w 371
    //   515: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   518: aload 9
    //   520: astore_3
    //   521: aload_3
    //   522: areturn
    //   523: astore_3
    //   524: aload 8
    //   526: astore 7
    //   528: aload 4
    //   530: astore 8
    //   532: aload 7
    //   534: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   537: aload 8
    //   539: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   542: aload 6
    //   544: astore 4
    //   546: aload 8
    //   548: astore_2
    //   549: aload 7
    //   551: astore_3
    //   552: aload 6
    //   554: ifnull -129 -> 425
    //   557: aload 6
    //   559: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   562: aload 6
    //   564: astore 4
    //   566: aload 8
    //   568: astore_2
    //   569: aload 7
    //   571: astore_3
    //   572: goto -147 -> 425
    //   575: astore_3
    //   576: aload 6
    //   578: astore 8
    //   580: aload 4
    //   582: astore 6
    //   584: aload 8
    //   586: astore 4
    //   588: aload_2
    //   589: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   592: aload 6
    //   594: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   597: aload 4
    //   599: ifnull +8 -> 607
    //   602: aload 4
    //   604: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   607: ldc_w 371
    //   610: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   613: aload_3
    //   614: athrow
    //   615: ldc_w 371
    //   618: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   621: aconst_null
    //   622: astore_3
    //   623: goto -102 -> 521
    //   626: astore 6
    //   628: aload_2
    //   629: astore 8
    //   631: aload_3
    //   632: astore_2
    //   633: aload 6
    //   635: astore_3
    //   636: aload 8
    //   638: astore 6
    //   640: goto -52 -> 588
    //   643: astore 8
    //   645: aload 6
    //   647: astore 4
    //   649: aload_2
    //   650: astore 6
    //   652: aload_3
    //   653: astore_2
    //   654: aload 8
    //   656: astore_3
    //   657: goto -69 -> 588
    //   660: astore 6
    //   662: aload 4
    //   664: astore 6
    //   666: aload_2
    //   667: astore 8
    //   669: aload_3
    //   670: astore 7
    //   672: goto -140 -> 532
    //   675: astore 4
    //   677: aload_2
    //   678: astore 8
    //   680: aload_3
    //   681: astore 7
    //   683: goto -151 -> 532
    //   686: astore 6
    //   688: aload 4
    //   690: astore 6
    //   692: aload_2
    //   693: astore 8
    //   695: aload_3
    //   696: astore 7
    //   698: goto -313 -> 385
    //   701: astore 4
    //   703: aload_2
    //   704: astore 8
    //   706: aload_3
    //   707: astore 7
    //   709: goto -324 -> 385
    //
    // Exception table:
    //   from	to	target	type
    //   299	306	380	java/net/MalformedURLException
    //   314	320	380	java/net/MalformedURLException
    //   328	340	380	java/net/MalformedURLException
    //   354	364	380	java/net/MalformedURLException
    //   372	377	380	java/net/MalformedURLException
    //   439	446	380	java/net/MalformedURLException
    //   454	459	380	java/net/MalformedURLException
    //   467	477	380	java/net/MalformedURLException
    //   485	493	380	java/net/MalformedURLException
    //   299	306	523	java/lang/Exception
    //   314	320	523	java/lang/Exception
    //   328	340	523	java/lang/Exception
    //   354	364	523	java/lang/Exception
    //   372	377	523	java/lang/Exception
    //   439	446	523	java/lang/Exception
    //   454	459	523	java/lang/Exception
    //   467	477	523	java/lang/Exception
    //   485	493	523	java/lang/Exception
    //   299	306	575	finally
    //   314	320	575	finally
    //   328	340	575	finally
    //   354	364	575	finally
    //   372	377	575	finally
    //   439	446	575	finally
    //   454	459	575	finally
    //   467	477	575	finally
    //   485	493	575	finally
    //   259	281	626	finally
    //   281	291	643	finally
    //   259	281	660	java/lang/Exception
    //   281	291	675	java/lang/Exception
    //   259	281	686	java/net/MalformedURLException
    //   281	291	701	java/net/MalformedURLException
  }

  // ERROR //
  private void g()
  {
    // Byte code:
    //   0: ldc_w 471
    //   3: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 373	java/util/TreeMap
    //   9: dup
    //   10: invokespecial 374	java/util/TreeMap:<init>	()V
    //   13: astore_1
    //   14: aload_1
    //   15: ldc_w 473
    //   18: ldc_w 475
    //   21: invokeinterface 382 3 0
    //   26: pop
    //   27: aload_1
    //   28: ldc_w 376
    //   31: aload_0
    //   32: invokespecial 378	com/tencent/tencentmap/mapsdk/dynamic/a:i	()Ljava/lang/String;
    //   35: invokeinterface 382 3 0
    //   40: pop
    //   41: aload_1
    //   42: ldc_w 384
    //   45: ldc_w 359
    //   48: invokeinterface 382 3 0
    //   53: pop
    //   54: aload_1
    //   55: ldc_w 386
    //   58: ldc_w 388
    //   61: invokeinterface 382 3 0
    //   66: pop
    //   67: aload_1
    //   68: ldc_w 390
    //   71: invokestatic 391	com/tencent/tencentmap/mapsdk/a/y:a	()Ljava/lang/String;
    //   74: invokeinterface 382 3 0
    //   79: pop
    //   80: aload_1
    //   81: ldc_w 393
    //   84: ldc_w 395
    //   87: invokeinterface 382 3 0
    //   92: pop
    //   93: aload_1
    //   94: ldc_w 397
    //   97: invokestatic 399	com/tencent/tencentmap/mapsdk/a/y:b	()Ljava/lang/String;
    //   100: invokeinterface 382 3 0
    //   105: pop
    //   106: aload_1
    //   107: ldc_w 401
    //   110: invokestatic 403	com/tencent/tencentmap/mapsdk/a/y:c	()Ljava/lang/String;
    //   113: invokeinterface 382 3 0
    //   118: pop
    //   119: aload_1
    //   120: ldc_w 405
    //   123: ldc_w 395
    //   126: invokeinterface 382 3 0
    //   131: pop
    //   132: aload_1
    //   133: ldc_w 407
    //   136: invokestatic 408	com/tencent/tencentmap/mapsdk/a/y:d	()Ljava/lang/String;
    //   139: invokeinterface 382 3 0
    //   144: pop
    //   145: aload_1
    //   146: ldc_w 410
    //   149: invokestatic 412	com/tencent/tencentmap/mapsdk/a/y:e	()Ljava/lang/String;
    //   152: invokeinterface 382 3 0
    //   157: pop
    //   158: aload_1
    //   159: ldc_w 414
    //   162: invokestatic 416	com/tencent/tencentmap/mapsdk/a/y:f	()Ljava/lang/String;
    //   165: invokeinterface 382 3 0
    //   170: pop
    //   171: ldc_w 418
    //   174: astore_2
    //   175: aload_0
    //   176: getfield 47	com/tencent/tencentmap/mapsdk/dynamic/a:c	Landroid/content/Context;
    //   179: invokestatic 423	com/tencent/tencentmap/mapsdk/a/z:a	(Landroid/content/Context;)Landroid/net/NetworkInfo;
    //   182: astore_3
    //   183: aload_3
    //   184: ifnull +8 -> 192
    //   187: aload_3
    //   188: invokevirtual 428	android/net/NetworkInfo:getTypeName	()Ljava/lang/String;
    //   191: astore_2
    //   192: aload_1
    //   193: ldc_w 430
    //   196: aload_2
    //   197: invokeinterface 382 3 0
    //   202: pop
    //   203: aload_1
    //   204: ldc_w 432
    //   207: invokestatic 437	java/lang/System:currentTimeMillis	()J
    //   210: ldc2_w 438
    //   213: ldiv
    //   214: invokestatic 444	java/lang/Long:toString	(J)Ljava/lang/String;
    //   217: invokeinterface 382 3 0
    //   222: pop
    //   223: aload_1
    //   224: ldc_w 477
    //   227: ldc_w 395
    //   230: invokeinterface 382 3 0
    //   235: pop
    //   236: aload_1
    //   237: ldc 85
    //   239: ldc_w 479
    //   242: invokeinterface 382 3 0
    //   247: pop
    //   248: new 190	java/lang/StringBuilder
    //   251: dup
    //   252: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   255: ldc_w 446
    //   258: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: aload_0
    //   262: aload_1
    //   263: invokespecial 448	com/tencent/tencentmap/mapsdk/dynamic/a:a	(Ljava/util/Map;)Ljava/lang/String;
    //   266: ldc_w 450
    //   269: invokestatic 456	android/net/Uri:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   272: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   278: astore_1
    //   279: new 210	java/net/URL
    //   282: astore_2
    //   283: aload_2
    //   284: aload_1
    //   285: invokespecial 211	java/net/URL:<init>	(Ljava/lang/String;)V
    //   288: aload_2
    //   289: invokevirtual 215	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   292: checkcast 217	java/net/HttpURLConnection
    //   295: astore_2
    //   296: aload_2
    //   297: iconst_1
    //   298: invokevirtual 483	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   301: aload_2
    //   302: invokevirtual 487	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   305: astore_1
    //   306: aload_1
    //   307: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   310: aload_2
    //   311: invokevirtual 221	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   314: astore_3
    //   315: aload_3
    //   316: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   319: aload_1
    //   320: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   323: aload_2
    //   324: ifnull +193 -> 517
    //   327: aload_2
    //   328: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   331: ldc_w 471
    //   334: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   337: return
    //   338: astore 4
    //   340: aconst_null
    //   341: astore_1
    //   342: aconst_null
    //   343: astore_2
    //   344: aload_1
    //   345: astore 5
    //   347: aload_2
    //   348: astore_3
    //   349: new 190	java/lang/StringBuilder
    //   352: astore 6
    //   354: aload_1
    //   355: astore 5
    //   357: aload_2
    //   358: astore_3
    //   359: aload 6
    //   361: ldc_w 489
    //   364: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   367: aload_1
    //   368: astore 5
    //   370: aload_2
    //   371: astore_3
    //   372: aload 6
    //   374: aload 4
    //   376: invokevirtual 245	java/net/MalformedURLException:getMessage	()Ljava/lang/String;
    //   379: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   385: invokestatic 249	com/tencent/tencentmap/mapsdk/a/i:a	(Ljava/lang/String;)V
    //   388: aconst_null
    //   389: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   392: aload_1
    //   393: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   396: aload_2
    //   397: ifnull +120 -> 517
    //   400: aload_2
    //   401: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   404: ldc_w 471
    //   407: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   410: goto -73 -> 337
    //   413: astore 4
    //   415: aconst_null
    //   416: astore_1
    //   417: aconst_null
    //   418: astore_2
    //   419: aload_1
    //   420: astore 5
    //   422: aload_2
    //   423: astore_3
    //   424: new 190	java/lang/StringBuilder
    //   427: astore 6
    //   429: aload_1
    //   430: astore 5
    //   432: aload_2
    //   433: astore_3
    //   434: aload 6
    //   436: ldc_w 489
    //   439: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   442: aload_1
    //   443: astore 5
    //   445: aload_2
    //   446: astore_3
    //   447: aload 6
    //   449: aload 4
    //   451: invokevirtual 258	java/io/IOException:getMessage	()Ljava/lang/String;
    //   454: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   460: invokestatic 249	com/tencent/tencentmap/mapsdk/a/i:a	(Ljava/lang/String;)V
    //   463: aconst_null
    //   464: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   467: aload_1
    //   468: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   471: aload_2
    //   472: ifnull +45 -> 517
    //   475: aload_2
    //   476: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   479: ldc_w 471
    //   482: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   485: goto -148 -> 337
    //   488: astore_2
    //   489: aconst_null
    //   490: astore_1
    //   491: aconst_null
    //   492: astore_3
    //   493: aconst_null
    //   494: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   497: aload_1
    //   498: invokestatic 252	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   501: aload_3
    //   502: ifnull +7 -> 509
    //   505: aload_3
    //   506: invokevirtual 255	java/net/HttpURLConnection:disconnect	()V
    //   509: ldc_w 471
    //   512: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   515: aload_2
    //   516: athrow
    //   517: ldc_w 471
    //   520: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   523: goto -186 -> 337
    //   526: astore_1
    //   527: aconst_null
    //   528: astore 5
    //   530: aload_2
    //   531: astore_3
    //   532: aload_1
    //   533: astore_2
    //   534: aload 5
    //   536: astore_1
    //   537: goto -44 -> 493
    //   540: astore 5
    //   542: aload_2
    //   543: astore_3
    //   544: aload 5
    //   546: astore_2
    //   547: goto -54 -> 493
    //   550: astore_2
    //   551: aload 5
    //   553: astore_1
    //   554: goto -61 -> 493
    //   557: astore 4
    //   559: aconst_null
    //   560: astore_1
    //   561: goto -142 -> 419
    //   564: astore 4
    //   566: goto -147 -> 419
    //   569: astore 4
    //   571: aconst_null
    //   572: astore_1
    //   573: goto -229 -> 344
    //   576: astore 4
    //   578: goto -234 -> 344
    //
    // Exception table:
    //   from	to	target	type
    //   279	296	338	java/net/MalformedURLException
    //   279	296	413	java/io/IOException
    //   279	296	488	finally
    //   296	306	526	finally
    //   306	315	540	finally
    //   349	354	550	finally
    //   359	367	550	finally
    //   372	388	550	finally
    //   424	429	550	finally
    //   434	442	550	finally
    //   447	463	550	finally
    //   296	306	557	java/io/IOException
    //   306	315	564	java/io/IOException
    //   296	306	569	java/net/MalformedURLException
    //   306	315	576	java/net/MalformedURLException
  }

  private String[] h()
  {
    AppMethodBeat.i(101274);
    String[] arrayOfString;
    if (this.e.a() == null)
    {
      this.e.a(a);
      arrayOfString = a;
      AppMethodBeat.o(101274);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = this.e.a();
      AppMethodBeat.o(101274);
    }
  }

  private String i()
  {
    AppMethodBeat.i(101275);
    Object localObject = h();
    if ((localObject != null) && (localObject.length != 0))
    {
      localObject = localObject[(localObject.length - 1)];
      AppMethodBeat.o(101275);
    }
    while (true)
    {
      return localObject;
      localObject = "null";
      AppMethodBeat.o(101275);
    }
  }

  protected void a(boolean paramBoolean)
  {
    AppMethodBeat.i(101270);
    a.a locala = f();
    if ((locala == null) || (locala.a != 0) || (!locala.k) || ((b(locala.c)) && (!paramBoolean)))
      AppMethodBeat.o(101270);
    while (true)
    {
      return;
      File localFile1 = a(locala.g, locala.h, locala.i);
      File localFile2 = localFile1;
      if (localFile1 == null)
        localFile2 = a(locala.d, locala.e, locala.f);
      if (localFile2 == null)
      {
        AppMethodBeat.o(101270);
      }
      else
      {
        if (a(localFile2))
          this.e.a(locala.c);
        localFile2.deleteOnExit();
        g();
        k.a(d.a());
        AppMethodBeat.o(101270);
      }
    }
  }

  protected boolean a()
  {
    boolean bool = false;
    AppMethodBeat.i(101264);
    if (!a(new File(d.b() + File.separator + "mapconfig.dat"), this.e.b()))
      AppMethodBeat.o(101264);
    while (true)
    {
      return bool;
      if (!a(new File(d.b() + File.separator + "poi_icon@2x.png"), this.e.c()))
      {
        AppMethodBeat.o(101264);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(101264);
      }
    }
  }

  // ERROR //
  protected boolean a(File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 522
    //   5: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 61	com/tencent/tencentmap/mapsdk/dynamic/a:d	Lcom/tencent/tencentmap/mapsdk/a/l;
    //   11: invokevirtual 513	com/tencent/tencentmap/mapsdk/a/l:b	()Ljava/lang/String;
    //   14: invokestatic 178	com/tencent/tencentmap/mapsdk/a/k:b	(Ljava/lang/String;)Z
    //   17: pop
    //   18: aload_1
    //   19: getstatic 61	com/tencent/tencentmap/mapsdk/dynamic/a:d	Lcom/tencent/tencentmap/mapsdk/a/l;
    //   22: invokevirtual 513	com/tencent/tencentmap/mapsdk/a/l:b	()Ljava/lang/String;
    //   25: invokestatic 523	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/File;Ljava/lang/String;)Z
    //   28: ifne +11 -> 39
    //   31: ldc_w 522
    //   34: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: iload_2
    //   38: ireturn
    //   39: new 190	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   46: getstatic 61	com/tencent/tencentmap/mapsdk/dynamic/a:d	Lcom/tencent/tencentmap/mapsdk/a/l;
    //   49: invokevirtual 513	com/tencent/tencentmap/mapsdk/a/l:b	()Ljava/lang/String;
    //   52: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: ldc_w 515
    //   58: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: astore_3
    //   65: new 188	java/io/File
    //   68: astore_1
    //   69: aload_1
    //   70: aload_3
    //   71: invokespecial 202	java/io/File:<init>	(Ljava/lang/String;)V
    //   74: aload_1
    //   75: invokestatic 267	com/tencent/tencentmap/mapsdk/a/x:a	(Ljava/io/File;)Ljava/lang/String;
    //   78: astore_1
    //   79: aload_0
    //   80: getfield 68	com/tencent/tencentmap/mapsdk/dynamic/a:e	Lcom/tencent/tencentmap/mapsdk/a/aa;
    //   83: aload_1
    //   84: invokevirtual 524	com/tencent/tencentmap/mapsdk/a/aa:b	(Ljava/lang/String;)Z
    //   87: pop
    //   88: new 190	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   95: getstatic 61	com/tencent/tencentmap/mapsdk/dynamic/a:d	Lcom/tencent/tencentmap/mapsdk/a/l;
    //   98: invokevirtual 513	com/tencent/tencentmap/mapsdk/a/l:b	()Ljava/lang/String;
    //   101: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: ldc_w 520
    //   107: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: astore_3
    //   114: new 188	java/io/File
    //   117: astore_1
    //   118: aload_1
    //   119: aload_3
    //   120: invokespecial 202	java/io/File:<init>	(Ljava/lang/String;)V
    //   123: aload_1
    //   124: invokestatic 267	com/tencent/tencentmap/mapsdk/a/x:a	(Ljava/io/File;)Ljava/lang/String;
    //   127: astore_1
    //   128: aload_0
    //   129: getfield 68	com/tencent/tencentmap/mapsdk/dynamic/a:e	Lcom/tencent/tencentmap/mapsdk/a/aa;
    //   132: aload_1
    //   133: invokevirtual 526	com/tencent/tencentmap/mapsdk/a/aa:c	(Ljava/lang/String;)Z
    //   136: pop
    //   137: iconst_1
    //   138: istore_2
    //   139: ldc_w 522
    //   142: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: goto -108 -> 37
    //   148: astore_1
    //   149: ldc_w 522
    //   152: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -118 -> 37
    //   158: astore_1
    //   159: ldc_w 522
    //   162: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: goto -128 -> 37
    //
    // Exception table:
    //   from	to	target	type
    //   65	88	148	java/io/FileNotFoundException
    //   114	137	158	java/io/FileNotFoundException
  }

  public void downLoadVectorMapResource()
  {
    AppMethodBeat.i(101260);
    c();
    AppMethodBeat.o(101260);
  }

  public boolean isVectorMapValid()
  {
    AppMethodBeat.i(101261);
    boolean bool = d();
    AppMethodBeat.o(101261);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.dynamic.a
 * JD-Core Version:    0.6.2
 */
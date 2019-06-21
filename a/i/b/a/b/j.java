package a.i.b.a.b;

import a.a.v;
import a.i.b.a.c.d.b.s;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "packageParts", "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/HashMap;", "visitedModules", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "findPackageParts", "", "packageFqName", "getAnnotationsOnBinaryModule", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "moduleName", "registerModule", "", "EmptyEnumeration", "descriptors.runtime"})
public final class j
  implements s
{
  private final HashSet<String> AZA;
  private final HashMap<String, LinkedHashSet<String>> AZB;
  private final ClassLoader AZr;

  public j(ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(119056);
    this.AZr = paramClassLoader;
    this.AZA = new HashSet();
    this.AZB = new HashMap();
    AppMethodBeat.o(119056);
  }

  // ERROR //
  public final void ar(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 86
    //   4: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: ldc 87
    //   10: invokestatic 49	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield 66	a/i/b/a/b/j:AZA	Ljava/util/HashSet;
    //   17: aload_1
    //   18: invokevirtual 91	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   21: ifne +11 -> 32
    //   24: ldc 86
    //   26: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: new 93	java/lang/StringBuilder
    //   35: astore_2
    //   36: aload_2
    //   37: ldc 95
    //   39: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: aload_2
    //   43: aload_1
    //   44: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 103
    //   49: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: astore_3
    //   56: aload_0
    //   57: getfield 61	a/i/b/a/b/j:AZr	Ljava/lang/ClassLoader;
    //   60: aload_3
    //   61: invokevirtual 113	java/lang/ClassLoader:getResources	(Ljava/lang/String;)Ljava/util/Enumeration;
    //   64: astore_1
    //   65: aload_1
    //   66: ldc 115
    //   68: invokestatic 117	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   71: aload_1
    //   72: ldc 119
    //   74: invokestatic 49	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   77: new 121	a/a/n$a
    //   80: astore_2
    //   81: aload_2
    //   82: aload_1
    //   83: invokespecial 124	a/a/n$a:<init>	(Ljava/util/Enumeration;)V
    //   86: aload_2
    //   87: checkcast 126	java/util/Iterator
    //   90: astore 4
    //   92: aload 4
    //   94: invokeinterface 130 1 0
    //   99: ifeq +324 -> 423
    //   102: aload 4
    //   104: invokeinterface 134 1 0
    //   109: checkcast 136	java/net/URL
    //   112: astore_1
    //   113: aload_1
    //   114: invokevirtual 140	java/net/URL:openStream	()Ljava/io/InputStream;
    //   117: astore_1
    //   118: aload_1
    //   119: ifnull -27 -> 92
    //   122: aload_1
    //   123: checkcast 142	java/io/Closeable
    //   126: astore 5
    //   128: aload 5
    //   130: checkcast 144	java/io/InputStream
    //   133: astore_2
    //   134: getstatic 150	a/i/b/a/c/e/b/a/k:ByJ	La/i/b/a/c/e/b/a/k$a;
    //   137: astore_1
    //   138: aload_2
    //   139: ldc 119
    //   141: invokestatic 49	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   144: sipush 8192
    //   147: aload_2
    //   148: invokevirtual 154	java/io/InputStream:available	()I
    //   151: invokestatic 160	java/lang/Math:max	(II)I
    //   154: istore 6
    //   156: new 162	java/io/ByteArrayOutputStream
    //   159: astore 7
    //   161: aload 7
    //   163: iload 6
    //   165: invokespecial 164	java/io/ByteArrayOutputStream:<init>	(I)V
    //   168: aload_2
    //   169: aload 7
    //   171: checkcast 166	java/io/OutputStream
    //   174: invokestatic 172	a/e/a:d	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   177: pop2
    //   178: aload 7
    //   180: invokevirtual 176	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   183: astore_2
    //   184: aload_2
    //   185: ldc 178
    //   187: invokestatic 117	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   190: getstatic 184	a/i/b/a/c/j/a/j$a:BHa	La/i/b/a/c/j/a/j$a;
    //   193: checkcast 186	a/i/b/a/c/j/a/j
    //   196: astore 7
    //   198: getstatic 192	a/i/b/a/b/j$b:AZD	La/i/b/a/b/j$b;
    //   201: checkcast 194	a/f/a/b
    //   204: astore 8
    //   206: aload_1
    //   207: ldc 119
    //   209: invokestatic 49	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   212: aload_3
    //   213: ldc 196
    //   215: invokestatic 49	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   218: aload 7
    //   220: ldc 198
    //   222: invokestatic 49	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   225: aload 8
    //   227: ldc 200
    //   229: invokestatic 49	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   232: aload_2
    //   233: aload_3
    //   234: aload 8
    //   236: invokestatic 206	a/i/b/a/c/e/b/a/k$a:a	([BLjava/lang/String;La/f/a/b;)La/i/b/a/c/e/b/a/k;
    //   239: getfield 210	a/i/b/a/c/e/b/a/k:ByE	Ljava/util/Map;
    //   242: invokeinterface 216 1 0
    //   247: invokeinterface 222 1 0
    //   252: astore_2
    //   253: aload_2
    //   254: invokeinterface 130 1 0
    //   259: ifeq +147 -> 406
    //   262: aload_2
    //   263: invokeinterface 134 1 0
    //   268: checkcast 224	java/util/Map$Entry
    //   271: astore_1
    //   272: aload_1
    //   273: invokeinterface 227 1 0
    //   278: checkcast 229	java/lang/String
    //   281: astore 8
    //   283: aload_1
    //   284: invokeinterface 232 1 0
    //   289: checkcast 234	a/i/b/a/c/e/b/a/m
    //   292: astore 7
    //   294: aload_0
    //   295: getfield 71	a/i/b/a/b/j:AZB	Ljava/util/HashMap;
    //   298: checkcast 212	java/util/Map
    //   301: astore 9
    //   303: aload 9
    //   305: aload 8
    //   307: invokeinterface 238 2 0
    //   312: astore_1
    //   313: aload_1
    //   314: ifnonnull +123 -> 437
    //   317: new 240	java/util/LinkedHashSet
    //   320: astore_1
    //   321: aload_1
    //   322: invokespecial 241	java/util/LinkedHashSet:<init>	()V
    //   325: aload 9
    //   327: aload 8
    //   329: aload_1
    //   330: invokeinterface 245 3 0
    //   335: pop
    //   336: aload_1
    //   337: checkcast 240	java/util/LinkedHashSet
    //   340: aload 7
    //   342: invokevirtual 248	a/i/b/a/c/e/b/a/m:ehA	()Ljava/util/Set;
    //   345: checkcast 250	java/util/Collection
    //   348: invokevirtual 254	java/util/LinkedHashSet:addAll	(Ljava/util/Collection;)Z
    //   351: pop
    //   352: goto -99 -> 253
    //   355: astore_2
    //   356: ldc 86
    //   358: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   361: aload_2
    //   362: athrow
    //   363: astore_1
    //   364: aload 5
    //   366: aload_2
    //   367: invokestatic 259	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   370: ldc 86
    //   372: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   375: aload_1
    //   376: athrow
    //   377: astore_1
    //   378: aload_1
    //   379: checkcast 85	java/lang/Throwable
    //   382: astore_1
    //   383: ldc 86
    //   385: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   388: aload_1
    //   389: athrow
    //   390: astore_1
    //   391: aload_0
    //   392: monitorexit
    //   393: aload_1
    //   394: athrow
    //   395: astore_1
    //   396: getstatic 263	a/i/b/a/b/j$a:AZC	La/i/b/a/b/j$a;
    //   399: checkcast 265	java/util/Enumeration
    //   402: astore_1
    //   403: goto -338 -> 65
    //   406: getstatic 271	a/y:AUy	La/y;
    //   409: astore_1
    //   410: aload 5
    //   412: aconst_null
    //   413: invokestatic 259	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   416: goto -324 -> 92
    //   419: astore_1
    //   420: goto -328 -> 92
    //   423: ldc 86
    //   425: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   428: goto -399 -> 29
    //   431: astore_1
    //   432: aconst_null
    //   433: astore_2
    //   434: goto -70 -> 364
    //   437: goto -101 -> 336
    //
    // Exception table:
    //   from	to	target	type
    //   128	253	355	java/lang/Throwable
    //   253	313	355	java/lang/Throwable
    //   317	336	355	java/lang/Throwable
    //   336	352	355	java/lang/Throwable
    //   406	410	355	java/lang/Throwable
    //   356	363	363	finally
    //   113	118	377	java/lang/UnsupportedOperationException
    //   122	128	377	java/lang/UnsupportedOperationException
    //   364	377	377	java/lang/UnsupportedOperationException
    //   410	416	377	java/lang/UnsupportedOperationException
    //   2	29	390	finally
    //   32	56	390	finally
    //   56	65	390	finally
    //   65	92	390	finally
    //   92	113	390	finally
    //   113	118	390	finally
    //   122	128	390	finally
    //   364	377	390	finally
    //   378	390	390	finally
    //   396	403	390	finally
    //   410	416	390	finally
    //   423	428	390	finally
    //   56	65	395	java/io/IOException
    //   113	118	419	java/lang/Exception
    //   122	128	419	java/lang/Exception
    //   364	377	419	java/lang/Exception
    //   410	416	419	java/lang/Exception
    //   128	253	431	finally
    //   253	313	431	finally
    //   317	336	431	finally
    //   336	352	431	finally
    //   406	410	431	finally
  }

  public final List<String> avA(String paramString)
  {
    try
    {
      AppMethodBeat.i(119055);
      a.f.b.j.p(paramString, "packageFqName");
      paramString = (LinkedHashSet)this.AZB.get(paramString);
      if (paramString != null);
      for (paramString = a.a.j.m((Iterable)paramString); ; paramString = null)
      {
        Object localObject = paramString;
        if (paramString == null)
          localObject = (List)v.AUP;
        AppMethodBeat.o(119055);
        return localObject;
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.j
 * JD-Core Version:    0.6.2
 */
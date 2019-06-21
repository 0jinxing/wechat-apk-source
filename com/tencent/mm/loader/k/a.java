package com.tencent.mm.loader.k;

import a.f.b.j;
import a.l;
import a.y;
import com.tencent.mm.loader.c.e.b;
import com.tencent.mm.loader.d.b.c;
import com.tencent.mm.loader.e.c.b.b;
import com.tencent.mm.loader.h.f<*>;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/task/ImageLoadWorkTask;", "T", "R", "Lcom/tencent/mm/loader/task/LoadTask;", "_url", "Lcom/tencent/mm/loader/model/data/DataItem;", "target", "Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "reaper", "Lcom/tencent/mm/loader/Reaper;", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;Lcom/tencent/mm/loader/Reaper;)V", "diskCache", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "getDiskCache$libimageloader_release", "()Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "setDiskCache$libimageloader_release", "(Lcom/tencent/mm/loader/cache/disk/IDiskCache;)V", "isLocalFile", "", "()Z", "memoryCache", "Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "getMemoryCache$libimageloader_release", "()Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "setMemoryCache$libimageloader_release", "(Lcom/tencent/mm/loader/cache/memory/IMemoryCache;)V", "producer", "Lcom/tencent/mm/loader/common/IImageResourceProducer;", "getProducer$libimageloader_release", "()Lcom/tencent/mm/loader/common/IImageResourceProducer;", "setProducer$libimageloader_release", "(Lcom/tencent/mm/loader/common/IImageResourceProducer;)V", "batchGet", "", "readNetworkStart", "", "taskListener", "Lcom/tencent/mm/loader/task/LoadTask$ITask;", "execute", "fileType", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions$LoadFrom;", "executeTask", "loadFromDisk", "Lcom/tencent/mm/loader/model/LoadResult;", "producerThenCommitDisk", "Lcom/tencent/mm/loader/task/ImageLoadWorkTask$LazyTask;", "httpResponse", "Lcom/tencent/mm/loader/model/Response;", "source", "Lcom/tencent/mm/loader/model/datasource/DataSource;", "whenDataReady", "Companion", "LazyTask", "libimageloader_release"})
public final class a<T, R> extends b<T, R>
{
  public static final a.a eSr = new a.a((byte)0);
  private com.tencent.mm.loader.b.b.c<T, R> ePs = this.eSE.eOK;
  private com.tencent.mm.loader.b.a.d<T, R> ePt = this.eSE.eOL;
  private com.tencent.mm.loader.d.d<R> eSq = this.eSE.eOP;

  public a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.e.b.c<R> paramc, com.tencent.mm.loader.f<T, R> paramf)
  {
    super(parama, paramc, paramf);
  }

  // ERROR //
  private final com.tencent.mm.loader.h.c<R> Uo()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 131	com/tencent/mm/loader/h/c
    //   5: dup
    //   6: invokespecial 133	com/tencent/mm/loader/h/c:<init>	()V
    //   9: astore_2
    //   10: getstatic 137	com/tencent/mm/loader/h/c:eRS	Lcom/tencent/mm/loader/h/c$a;
    //   13: astore_3
    //   14: aload_2
    //   15: invokestatic 141	com/tencent/mm/loader/h/c:Uc	()I
    //   18: putfield 145	com/tencent/mm/loader/h/c:from	I
    //   21: aload_0
    //   22: getfield 104	com/tencent/mm/loader/k/b:eSE	Lcom/tencent/mm/loader/f;
    //   25: astore 4
    //   27: aload_0
    //   28: getfield 111	com/tencent/mm/loader/k/a:ePt	Lcom/tencent/mm/loader/b/a/d;
    //   31: astore 5
    //   33: aload 5
    //   35: ifnull +279 -> 314
    //   38: aload_0
    //   39: getfield 149	com/tencent/mm/loader/k/b:eQE	Lcom/tencent/mm/loader/h/a/a;
    //   42: astore 6
    //   44: aload 4
    //   46: getfield 153	com/tencent/mm/loader/f:eOF	Lcom/tencent/mm/loader/c/e;
    //   49: astore_3
    //   50: aload 6
    //   52: ldc 155
    //   54: invokestatic 96	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   57: aload_3
    //   58: ldc 157
    //   60: invokestatic 96	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   63: aload 4
    //   65: ldc 98
    //   67: invokestatic 96	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   70: aload 6
    //   72: ldc 155
    //   74: invokestatic 96	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   77: aload_3
    //   78: ldc 157
    //   80: invokestatic 96	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   83: aload 4
    //   85: ldc 98
    //   87: invokestatic 96	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   90: aload 5
    //   92: aload 6
    //   94: aload_3
    //   95: aload 4
    //   97: invokevirtual 163	com/tencent/mm/loader/b/a/d:c	(Lcom/tencent/mm/loader/h/a/a;Lcom/tencent/mm/loader/c/e;Lcom/tencent/mm/loader/f;)Lcom/tencent/mm/loader/h/b/a;
    //   100: astore_3
    //   101: aload_3
    //   102: ifnull +212 -> 314
    //   105: aload_3
    //   106: checkcast 165	java/io/Closeable
    //   109: astore 7
    //   111: aload 7
    //   113: checkcast 167	com/tencent/mm/loader/h/b/a
    //   116: astore 6
    //   118: aload_0
    //   119: getfield 121	com/tencent/mm/loader/k/a:eSq	Lcom/tencent/mm/loader/d/d;
    //   122: astore_3
    //   123: aload_3
    //   124: ifnull +192 -> 316
    //   127: aload_3
    //   128: aload 4
    //   130: invokevirtual 171	com/tencent/mm/loader/f:Tc	()Lcom/tencent/mm/loader/e/b/c;
    //   133: getfield 177	com/tencent/mm/loader/e/b/c:eQw	Lcom/tencent/mm/loader/e/b/f;
    //   136: aload 4
    //   138: aload 6
    //   140: invokevirtual 183	com/tencent/mm/loader/d/d:a	(Lcom/tencent/mm/loader/e/b/f;Lcom/tencent/mm/loader/f;Lcom/tencent/mm/loader/h/b/a;)Lcom/tencent/mm/loader/h/e;
    //   143: astore_3
    //   144: aload_3
    //   145: astore 6
    //   147: aload_3
    //   148: instanceof 185
    //   151: ifne +6 -> 157
    //   154: aconst_null
    //   155: astore 6
    //   157: aload 6
    //   159: ifnull +42 -> 201
    //   162: aload 4
    //   164: getfield 189	com/tencent/mm/loader/f:eOR	Lcom/tencent/mm/loader/e/c/a;
    //   167: astore_3
    //   168: aload_3
    //   169: ifnull +152 -> 321
    //   172: aload_3
    //   173: aload 4
    //   175: invokevirtual 171	com/tencent/mm/loader/f:Tc	()Lcom/tencent/mm/loader/e/b/c;
    //   178: getfield 177	com/tencent/mm/loader/e/b/c:eQw	Lcom/tencent/mm/loader/e/b/f;
    //   181: aload 4
    //   183: aload 6
    //   185: getstatic 195	com/tencent/mm/loader/e/c/b$b:eQO	Lcom/tencent/mm/loader/e/c/b$b;
    //   188: invokevirtual 200	com/tencent/mm/loader/e/c/a:a	(Lcom/tencent/mm/loader/e/b/f;Lcom/tencent/mm/loader/f;Lcom/tencent/mm/loader/h/e;Lcom/tencent/mm/loader/e/c/b$b;)Lcom/tencent/mm/loader/h/e;
    //   191: astore 5
    //   193: aload 5
    //   195: astore_3
    //   196: aload 5
    //   198: ifnonnull +6 -> 204
    //   201: aload 6
    //   203: astore_3
    //   204: aload_3
    //   205: ifnull +45 -> 250
    //   208: aload 4
    //   210: getfield 203	com/tencent/mm/loader/f:eOQ	Lcom/tencent/mm/loader/e/c/a;
    //   213: astore 6
    //   215: aload 6
    //   217: ifnull +110 -> 327
    //   220: aload 6
    //   222: aload 4
    //   224: invokevirtual 171	com/tencent/mm/loader/f:Tc	()Lcom/tencent/mm/loader/e/b/c;
    //   227: getfield 177	com/tencent/mm/loader/e/b/c:eQw	Lcom/tencent/mm/loader/e/b/f;
    //   230: aload 4
    //   232: aload_3
    //   233: getstatic 195	com/tencent/mm/loader/e/c/b$b:eQO	Lcom/tencent/mm/loader/e/c/b$b;
    //   236: invokevirtual 200	com/tencent/mm/loader/e/c/a:a	(Lcom/tencent/mm/loader/e/b/f;Lcom/tencent/mm/loader/f;Lcom/tencent/mm/loader/h/e;Lcom/tencent/mm/loader/e/c/b$b;)Lcom/tencent/mm/loader/h/e;
    //   239: astore 5
    //   241: aload 5
    //   243: astore 6
    //   245: aload 5
    //   247: ifnonnull +6 -> 253
    //   250: aload_3
    //   251: astore 6
    //   253: aload 6
    //   255: ifnull +53 -> 308
    //   258: aload 6
    //   260: invokevirtual 206	com/tencent/mm/loader/h/e:isValid	()Z
    //   263: ifeq +70 -> 333
    //   266: aload 6
    //   268: ifnull +40 -> 308
    //   271: aload_0
    //   272: getfield 116	com/tencent/mm/loader/k/a:ePs	Lcom/tencent/mm/loader/b/b/c;
    //   275: astore_3
    //   276: aload_3
    //   277: ifnull +22 -> 299
    //   280: aload_3
    //   281: aload 4
    //   283: getfield 209	com/tencent/mm/loader/f:eOY	Lcom/tencent/mm/loader/h/a/a;
    //   286: aload 4
    //   288: getfield 203	com/tencent/mm/loader/f:eOQ	Lcom/tencent/mm/loader/e/c/a;
    //   291: aload 6
    //   293: invokevirtual 213	com/tencent/mm/loader/h/e:getValue	()Ljava/lang/Object;
    //   296: invokevirtual 218	com/tencent/mm/loader/b/b/c:a	(Lcom/tencent/mm/loader/h/a/a;Lcom/tencent/mm/loader/e/c/a;Ljava/lang/Object;)V
    //   299: aload_2
    //   300: aload 6
    //   302: invokevirtual 213	com/tencent/mm/loader/h/e:getValue	()Ljava/lang/Object;
    //   305: putfield 222	com/tencent/mm/loader/h/c:value	Ljava/lang/Object;
    //   308: aload 7
    //   310: aconst_null
    //   311: invokestatic 227	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   314: aload_2
    //   315: areturn
    //   316: aconst_null
    //   317: astore_3
    //   318: goto -174 -> 144
    //   321: aconst_null
    //   322: astore 5
    //   324: goto -131 -> 193
    //   327: aconst_null
    //   328: astore 5
    //   330: goto -89 -> 241
    //   333: aconst_null
    //   334: astore 6
    //   336: goto -70 -> 266
    //   339: astore 6
    //   341: aload 6
    //   343: athrow
    //   344: astore_3
    //   345: aload 7
    //   347: aload 6
    //   349: invokestatic 227	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   352: aload_3
    //   353: athrow
    //   354: astore_3
    //   355: ldc 229
    //   357: aload_3
    //   358: checkcast 129	java/lang/Throwable
    //   361: ldc 231
    //   363: iconst_2
    //   364: anewarray 233	java/lang/Object
    //   367: dup
    //   368: iconst_0
    //   369: aload_0
    //   370: getfield 149	com/tencent/mm/loader/k/b:eQE	Lcom/tencent/mm/loader/h/a/a;
    //   373: aastore
    //   374: dup
    //   375: iconst_1
    //   376: aload_0
    //   377: getfield 237	com/tencent/mm/loader/k/b:ePa	Ljava/lang/String;
    //   380: aastore
    //   381: invokestatic 243	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   384: goto -70 -> 314
    //   387: astore_3
    //   388: aload_1
    //   389: astore 6
    //   391: goto -46 -> 345
    //
    // Exception table:
    //   from	to	target	type
    //   111	123	339	java/lang/Throwable
    //   127	144	339	java/lang/Throwable
    //   147	154	339	java/lang/Throwable
    //   162	168	339	java/lang/Throwable
    //   172	193	339	java/lang/Throwable
    //   208	215	339	java/lang/Throwable
    //   220	241	339	java/lang/Throwable
    //   258	266	339	java/lang/Throwable
    //   271	276	339	java/lang/Throwable
    //   280	299	339	java/lang/Throwable
    //   299	308	339	java/lang/Throwable
    //   341	344	344	finally
    //   21	33	354	java/lang/Exception
    //   38	101	354	java/lang/Exception
    //   105	111	354	java/lang/Exception
    //   308	314	354	java/lang/Exception
    //   345	354	354	java/lang/Exception
    //   111	123	387	finally
    //   127	144	387	finally
    //   147	154	387	finally
    //   162	168	387	finally
    //   172	193	387	finally
    //   208	215	387	finally
    //   220	241	387	finally
    //   258	266	387	finally
    //   271	276	387	finally
    //   280	299	387	finally
    //   299	308	387	finally
  }

  private final void a(com.tencent.mm.loader.h.f<?> paramf, b.a<R> parama)
  {
    com.tencent.mm.ab.a locala = null;
    Object localObject1 = null;
    Object localObject2 = null;
    com.tencent.mm.loader.h.c localc = new com.tencent.mm.loader.h.c();
    Object localObject3 = com.tencent.mm.loader.h.c.eRS;
    localc.from = com.tencent.mm.loader.h.c.Ud();
    com.tencent.mm.loader.f localf1 = this.eSE;
    int i;
    label58: com.tencent.mm.loader.h.b.a locala1;
    com.tencent.mm.loader.f localf2;
    if (paramf != null)
      if (paramf.value() != null)
      {
        i = 1;
        if (i == 0)
          break label613;
        localObject3 = paramf;
        if (localObject3 == null)
          break label914;
        locala1 = paramf.TW();
        if (locala1 == null)
          break label914;
        System.currentTimeMillis();
        localf2 = this.eSE;
        localObject3 = this.eSq;
        if (localObject3 == null)
          break label619;
        localObject3 = ((com.tencent.mm.loader.d.d)localObject3).a(localf2.Tc().eQw, this.eSE, locala1);
        label116: if ((localObject3 instanceof com.tencent.mm.loader.h.e))
          break label1014;
      }
    label191: label225: label613: label619: label747: label1007: label1014: for (localObject1 = null; ; localObject1 = localObject3)
    {
      b.b localb;
      Object localObject4;
      if (localObject1 != null)
      {
        com.tencent.mm.loader.e.c.a locala2 = localf2.eOQ;
        if (locala2 != null)
        {
          localb = b.b.eQP;
          j.p(localb, "when");
          localObject4 = ((com.tencent.mm.loader.e.c.a)locala2).eQG;
          localObject3 = localObject4;
          if (!(localObject4 instanceof com.tencent.mm.loader.e.c.b))
            localObject3 = null;
          localObject4 = localObject3;
          if (localObject3 == null)
          {
            localObject4 = ((com.tencent.mm.loader.e.c.a)locala2).eQG;
            localObject3 = localObject4;
            if (!(localObject4 instanceof com.tencent.mm.loader.e.c.b))
              localObject3 = null;
            localObject4 = localObject3;
            if (localObject3 != null)
              break label686;
            localObject4 = ((com.tencent.mm.loader.e.c.a)locala2).eQG;
            localObject3 = localObject4;
            if (!(localObject4 instanceof com.tencent.mm.loader.e.c.b))
              localObject3 = null;
            localObject4 = localObject3;
            if (localObject3 != null)
              break label747;
            i = 0;
            if (i != 1)
              break label808;
            localObject3 = localf2.eOQ;
            if (localObject3 == null)
              break label839;
            localObject3 = ((com.tencent.mm.loader.e.c.a)localObject3).a(localf2.Tc().eQw, localf2, (com.tencent.mm.loader.h.e)localObject1, b.b.eQP);
            if (localObject3 == null)
              break label839;
            a(paramf, (com.tencent.mm.loader.h.e)localObject1, (com.tencent.mm.loader.h.e)localObject3, (b)this);
            paramf = new a.b((com.tencent.mm.loader.h.e)localObject3, (a.f.a.a)a.e.eSC);
            if (paramf == null)
              break label856;
            localObject4 = paramf.eSs;
            if (localObject4 != null)
            {
              locala = new com.tencent.mm.ab.a("Transcoder");
              localObject3 = localf1.eOR;
              if (localObject3 == null)
                break label844;
              localObject1 = ((com.tencent.mm.loader.e.c.a)localObject3).a(localf1.Tc().eQw, localf1, (com.tencent.mm.loader.h.e)localObject4, b.b.eQO);
              localObject3 = localObject1;
              if (localObject1 == null)
                localObject3 = localObject4;
              localObject1 = localf1.eOQ;
              if (localObject1 == null)
                break label850;
              localObject1 = ((com.tencent.mm.loader.e.c.a)localObject1).a(localf1.Tc().eQw, localf1, (com.tencent.mm.loader.h.e)localObject3, b.b.eQO);
              if (localObject1 != null)
                break label1007;
            }
          }
        }
      }
      while (true)
      {
        localObject1 = localf1.eOQ;
        if (localObject1 != null)
          ((com.tencent.mm.loader.e.c.a)localObject1).a(localf1.Tc().eQw, localf1, (com.tencent.mm.loader.h.e)localObject3, b.b.eQN);
        localObject3 = y.AUy;
        locala.SW();
        localObject3 = ((com.tencent.mm.loader.h.e)localObject4).getValue();
        localc.value = localObject3;
        parama.a(localc);
        if (localObject3 != null)
        {
          parama = this.ePs;
          if (parama != null)
            parama.a(localf1.eOY, localf1.eOQ, localObject3);
        }
        parama = new com.tencent.mm.ab.a("lazytask commit");
        paramf.eSt.invoke();
        paramf = y.AUy;
        parama.SW();
        if (localf1.eOS != null)
        {
          parama = this.eSE.eOF;
          paramf = localObject2;
          if (parama != null)
            paramf = parama.TG();
          Arrays.copyOf(paramf, paramf.length);
        }
        while (true)
        {
          return;
          i = 0;
          break;
          localObject3 = null;
          break label58;
          localObject3 = null;
          break label116;
          do
          {
            if ((((com.tencent.mm.loader.e.c.b)localObject4).eQH == com.tencent.mm.loader.e.c.b.a.eQL) && (localb == ((com.tencent.mm.loader.e.c.b)localObject4).eQI))
            {
              i = 1;
              break;
            }
            localObject4 = ((com.tencent.mm.loader.e.c.b)localObject4).eQG;
            localObject3 = localObject4;
            if (!(localObject4 instanceof com.tencent.mm.loader.e.c.b))
              localObject3 = null;
            localObject4 = localObject3;
          }
          while (localObject3 != null);
          break label191;
          do
          {
            if ((((com.tencent.mm.loader.e.c.b)localObject4).eQH == com.tencent.mm.loader.e.c.b.a.eQK) && (localb == ((com.tencent.mm.loader.e.c.b)localObject4).eQI))
            {
              i = 1;
              break;
            }
            localObject4 = ((com.tencent.mm.loader.e.c.b)localObject4).eQG;
            localObject3 = localObject4;
            if (!(localObject4 instanceof com.tencent.mm.loader.e.c.b))
              localObject3 = null;
            localObject4 = localObject3;
          }
          while (localObject3 != null);
          break label225;
          do
          {
            if ((((com.tencent.mm.loader.e.c.b)localObject4).eQH == com.tencent.mm.loader.e.c.b.a.eQJ) && (localb == ((com.tencent.mm.loader.e.c.b)localObject4).eQI))
            {
              i = 1;
              break;
            }
            localObject4 = ((com.tencent.mm.loader.e.c.b)localObject4).eQG;
            localObject3 = localObject4;
            if (!(localObject4 instanceof com.tencent.mm.loader.e.c.b))
              localObject3 = null;
            localObject4 = localObject3;
          }
          while (localObject3 != null);
          break label259;
          paramf = new a.b((com.tencent.mm.loader.h.e)localObject1, (a.f.a.a)new a.d((com.tencent.mm.loader.h.e)localObject1, localf2, this, locala1, paramf));
          break label336;
          paramf = null;
          break label336;
          localObject1 = null;
          break label396;
          localObject1 = null;
          break label443;
          paramf = com.tencent.mm.loader.h.c.eRS;
          localc.status = com.tencent.mm.loader.h.c.Ua();
          if (localf1.eOS != null)
          {
            localObject3 = this.eSE.eOF;
            paramf = locala;
            if (localObject3 != null)
              paramf = ((com.tencent.mm.loader.c.e)localObject3).TG();
            Arrays.copyOf(paramf, paramf.length);
          }
          parama.Uq();
          continue;
          paramf = com.tencent.mm.loader.h.c.eRS;
          localc.status = com.tencent.mm.loader.h.c.TZ();
          if (com.tencent.mm.loader.c.e.DEBUG)
            ab.i("MicroMsg.Loader.ImageLoadWorkTask", "httpRespone value is null %s %s", new Object[] { this.eQE, bo.dpG().toString() });
          if (localf1.eOS != null)
          {
            localObject3 = this.eSE.eOF;
            paramf = (com.tencent.mm.loader.h.f<?>)localObject1;
            if (localObject3 != null)
              paramf = ((com.tencent.mm.loader.c.e)localObject3).TG();
            Arrays.copyOf(paramf, paramf.length);
          }
          parama.Uq();
        }
        localObject3 = localObject1;
      }
    }
  }

  protected final void a(e.b paramb, b.a<R> parama)
  {
    boolean bool = true;
    j.p(paramb, "fileType");
    j.p(parama, "taskListener");
    try
    {
      System.currentTimeMillis();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("[ImageLoader] run. get bitmap from disk. key:");
      ab.d("MicroMsg.Loader.ImageLoadWorkTask", this.eQE + " fileType " + paramb + " [width:" + this.eOZ + ".weakHolder.viewWidth height:" + this.eOZ + ".weakHolder.viewHeight] diskCache " + this.ePt + " producer " + this.eSq);
      localObject1 = Uo();
      int i;
      label151: Object localObject2;
      if (this.eQE != null)
        if (com.tencent.mm.loader.l.a.d(this.eQE))
        {
          i = 1;
          if ((i != 0) || (((com.tencent.mm.loader.h.c)localObject1).value != null))
            break label244;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("[ImageLoader] run. get bitmap from disk. done result resultData ");
          ab.d("MicroMsg.Loader.ImageLoadWorkTask", localObject1 + " bitmap " + ((com.tencent.mm.loader.h.c)localObject1).value + " isNeedDownload " + bool);
          if (bool)
            break label249;
          parama.b((com.tencent.mm.loader.h.c)localObject1);
        }
      while (true)
      {
        return;
        if (this.eSE.eOF.Ty() == e.b.eQj)
        {
          i = 1;
          break;
        }
        i = 0;
        break;
        label244: bool = false;
        break label151;
        label249: localObject2 = this.eSE;
        long l;
        while (true)
        {
          try
          {
            l = System.currentTimeMillis();
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("[ImageLoader] run. get bitmap from memory failed.now try to get from network. ");
            ab.d("MicroMsg.Loader.ImageLoadWorkTask", this.eQE + " fileType: " + paramb);
            if (((com.tencent.mm.loader.f)localObject2).eOI != null)
              ((com.tencent.mm.loader.f)localObject2).Tc();
            localObject1 = ((com.tencent.mm.loader.f)localObject2).eOJ;
            if (!((com.tencent.mm.loader.f)localObject2).eOO.a(this.eQE))
              break label418;
            if (localObject1 != null)
              break label424;
            a(null, parama);
            paramb = new java/lang/StringBuilder;
            paramb.<init>("can not download image, over limit ");
            ab.i("MicroMsg.Loader.ImageLoadWorkTask", this.eQE);
          }
          catch (Exception paramb)
          {
            ab.printErrStackTrace("MicroMsg.Loader.ImageLoadWorkTask", (Throwable)paramb, "[ImageLoader DownLoadException] run error %s [debug info %s]", new Object[] { this.eQE, ((com.tencent.mm.loader.f)localObject2).ePa });
            paramb = y.AUy;
          }
          break;
          label418: localObject1 = null;
        }
        label424: com.tencent.mm.loader.d.b localb = ((com.tencent.mm.loader.f)localObject2).eOJ;
        com.tencent.mm.loader.h.a.a locala = this.eQE;
        com.tencent.mm.loader.f.f localf = ((com.tencent.mm.loader.f)localObject2).eOV;
        localObject1 = this.eQR;
        if (localObject1 == null)
          j.avw("loader");
        Object localObject3 = new com/tencent/mm/loader/k/a$c;
        ((a.c)localObject3).<init>((com.tencent.mm.loader.f)localObject2, l, this, paramb, parama);
        localObject3 = (com.tencent.mm.loader.d.b.a)localObject3;
        j.p(locala, "url");
        j.p(localf, "fileNameCreator");
        j.p(localObject1, "loader");
        j.p(localObject3, "callback");
        paramb = new com/tencent/mm/loader/d/b$c;
        paramb.<init>(localb, (com.tencent.mm.loader.g.b)localObject1, locala, localf, (com.tencent.mm.loader.d.b.a)localObject3);
        ((com.tencent.mm.loader.g.b)localObject1).u((Runnable)paramb);
      }
    }
    catch (Exception paramb)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Loader.ImageLoadWorkTask", (Throwable)paramb, "[ImageLoader execute] " + paramb.getMessage() + " run error " + this.eQE + " [debug info " + this.ePa + ']', new Object[0]);
        parama.Uq();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.k.a
 * JD-Core Version:    0.6.2
 */
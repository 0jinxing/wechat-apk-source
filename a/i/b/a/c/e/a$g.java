package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class a$g extends i
  implements a.h
{
  public static s<g> BsC;
  private static final g BtP;
  private final d BsB;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  private List<a.i> BtQ;

  static
  {
    AppMethodBeat.i(120539);
    BsC = new a.g.1();
    g localg = new g();
    BtP = localg;
    localg.BtQ = Collections.emptyList();
    AppMethodBeat.o(120539);
  }

  private a$g()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$g(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 57	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 74
    //   6: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 59	a/i/b/a/c/e/a$g:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 61	a/i/b/a/c/e/a$g:BsH	I
    //   20: aload_0
    //   21: invokestatic 50	java/util/Collections:emptyList	()Ljava/util/List;
    //   24: putfield 52	a/i/b/a/c/e/a$g:BtQ	Ljava/util/List;
    //   27: invokestatic 78	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   30: astore_3
    //   31: aload_3
    //   32: iconst_1
    //   33: invokestatic 84	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   36: astore 4
    //   38: iconst_0
    //   39: istore 5
    //   41: iconst_0
    //   42: istore 6
    //   44: iload 5
    //   46: ifne +263 -> 309
    //   49: iload 6
    //   51: istore 7
    //   53: iload 6
    //   55: istore 8
    //   57: iload 6
    //   59: istore 9
    //   61: aload_1
    //   62: invokevirtual 90	a/i/b/a/c/g/e:vc	()I
    //   65: istore 10
    //   67: iload 10
    //   69: lookupswitch	default:+27->96, 0:+58->127, 10:+64->133
    //   97: iconst_3
    //   98: istore 7
    //   100: iload 6
    //   102: istore 8
    //   104: iload 6
    //   106: istore 9
    //   108: aload_0
    //   109: aload_1
    //   110: aload 4
    //   112: aload_2
    //   113: iload 10
    //   115: invokevirtual 94	a/i/b/a/c/e/a$g:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   118: ifne -74 -> 44
    //   121: iconst_1
    //   122: istore 5
    //   124: goto -80 -> 44
    //   127: iconst_1
    //   128: istore 5
    //   130: goto -86 -> 44
    //   133: iload 6
    //   135: istore 10
    //   137: iload 6
    //   139: iconst_1
    //   140: iand
    //   141: iconst_1
    //   142: if_icmpeq +61 -> 203
    //   145: iload 6
    //   147: istore 7
    //   149: iload 6
    //   151: istore 8
    //   153: iload 6
    //   155: istore 9
    //   157: new 96	java/util/ArrayList
    //   160: astore 11
    //   162: iload 6
    //   164: istore 7
    //   166: iload 6
    //   168: istore 8
    //   170: iload 6
    //   172: istore 9
    //   174: aload 11
    //   176: invokespecial 97	java/util/ArrayList:<init>	()V
    //   179: iload 6
    //   181: istore 7
    //   183: iload 6
    //   185: istore 8
    //   187: iload 6
    //   189: istore 9
    //   191: aload_0
    //   192: aload 11
    //   194: putfield 52	a/i/b/a/c/e/a$g:BtQ	Ljava/util/List;
    //   197: iload 6
    //   199: iconst_1
    //   200: ior
    //   201: istore 10
    //   203: iload 10
    //   205: istore 7
    //   207: iload 10
    //   209: istore 8
    //   211: iload 10
    //   213: istore 9
    //   215: aload_0
    //   216: getfield 52	a/i/b/a/c/e/a$g:BtQ	Ljava/util/List;
    //   219: aload_1
    //   220: getstatic 100	a/i/b/a/c/e/a$i:BsC	La/i/b/a/c/g/s;
    //   223: aload_2
    //   224: invokevirtual 103	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   227: invokeinterface 109 2 0
    //   232: pop
    //   233: iload 10
    //   235: istore 6
    //   237: goto -193 -> 44
    //   240: astore_1
    //   241: iload 7
    //   243: istore 8
    //   245: aload_1
    //   246: aload_0
    //   247: putfield 113	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   250: iload 7
    //   252: istore 8
    //   254: ldc 74
    //   256: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   259: iload 7
    //   261: istore 8
    //   263: aload_1
    //   264: athrow
    //   265: astore_1
    //   266: iload 8
    //   268: iconst_1
    //   269: iand
    //   270: iconst_1
    //   271: if_icmpne +14 -> 285
    //   274: aload_0
    //   275: aload_0
    //   276: getfield 52	a/i/b/a/c/e/a$g:BtQ	Ljava/util/List;
    //   279: invokestatic 117	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   282: putfield 52	a/i/b/a/c/e/a$g:BtQ	Ljava/util/List;
    //   285: aload 4
    //   287: invokevirtual 120	a/i/b/a/c/g/f:flush	()V
    //   290: aload_0
    //   291: aload_3
    //   292: invokevirtual 126	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   295: putfield 68	a/i/b/a/c/e/a$g:BsB	La/i/b/a/c/g/d;
    //   298: aload_0
    //   299: invokevirtual 129	a/i/b/a/c/e/a$g:eio	()V
    //   302: ldc 74
    //   304: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   307: aload_1
    //   308: athrow
    //   309: iload 6
    //   311: iconst_1
    //   312: iand
    //   313: iconst_1
    //   314: if_icmpne +14 -> 328
    //   317: aload_0
    //   318: aload_0
    //   319: getfield 52	a/i/b/a/c/e/a$g:BtQ	Ljava/util/List;
    //   322: invokestatic 117	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   325: putfield 52	a/i/b/a/c/e/a$g:BtQ	Ljava/util/List;
    //   328: aload 4
    //   330: invokevirtual 120	a/i/b/a/c/g/f:flush	()V
    //   333: aload_0
    //   334: aload_3
    //   335: invokevirtual 126	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   338: putfield 68	a/i/b/a/c/e/a$g:BsB	La/i/b/a/c/g/d;
    //   341: aload_0
    //   342: invokevirtual 129	a/i/b/a/c/e/a$g:eio	()V
    //   345: ldc 74
    //   347: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: return
    //   351: astore_1
    //   352: aload_0
    //   353: aload_3
    //   354: invokevirtual 126	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   357: putfield 68	a/i/b/a/c/e/a$g:BsB	La/i/b/a/c/g/d;
    //   360: goto -19 -> 341
    //   363: astore_1
    //   364: aload_0
    //   365: aload_3
    //   366: invokevirtual 126	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   369: putfield 68	a/i/b/a/c/e/a$g:BsB	La/i/b/a/c/g/d;
    //   372: ldc 74
    //   374: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   377: aload_1
    //   378: athrow
    //   379: astore_2
    //   380: iload 9
    //   382: istore 8
    //   384: new 71	a/i/b/a/c/g/k
    //   387: astore_1
    //   388: iload 9
    //   390: istore 8
    //   392: aload_1
    //   393: aload_2
    //   394: invokevirtual 133	java/io/IOException:getMessage	()Ljava/lang/String;
    //   397: invokespecial 136	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   400: iload 9
    //   402: istore 8
    //   404: aload_1
    //   405: aload_0
    //   406: putfield 113	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   409: iload 9
    //   411: istore 8
    //   413: ldc 74
    //   415: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: iload 9
    //   420: istore 8
    //   422: aload_1
    //   423: athrow
    //   424: astore_2
    //   425: aload_0
    //   426: aload_3
    //   427: invokevirtual 126	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   430: putfield 68	a/i/b/a/c/e/a$g:BsB	La/i/b/a/c/g/d;
    //   433: goto -135 -> 298
    //   436: astore_1
    //   437: aload_0
    //   438: aload_3
    //   439: invokevirtual 126	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   442: putfield 68	a/i/b/a/c/e/a$g:BsB	La/i/b/a/c/g/d;
    //   445: ldc 74
    //   447: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   450: aload_1
    //   451: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   61	67	240	a/i/b/a/c/g/k
    //   108	121	240	a/i/b/a/c/g/k
    //   157	162	240	a/i/b/a/c/g/k
    //   174	179	240	a/i/b/a/c/g/k
    //   191	197	240	a/i/b/a/c/g/k
    //   215	233	240	a/i/b/a/c/g/k
    //   61	67	265	finally
    //   108	121	265	finally
    //   157	162	265	finally
    //   174	179	265	finally
    //   191	197	265	finally
    //   215	233	265	finally
    //   245	250	265	finally
    //   254	259	265	finally
    //   263	265	265	finally
    //   384	388	265	finally
    //   392	400	265	finally
    //   404	409	265	finally
    //   413	418	265	finally
    //   422	424	265	finally
    //   328	333	351	java/io/IOException
    //   328	333	363	finally
    //   61	67	379	java/io/IOException
    //   108	121	379	java/io/IOException
    //   157	162	379	java/io/IOException
    //   174	179	379	java/io/IOException
    //   191	197	379	java/io/IOException
    //   215	233	379	java/io/IOException
    //   285	290	424	java/io/IOException
    //   285	290	436	finally
  }

  private a$g(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a.g.a a(g paramg)
  {
    AppMethodBeat.i(120535);
    paramg = a.g.a.edM().d(paramg);
    AppMethodBeat.o(120535);
    return paramg;
  }

  public static g edH()
  {
    return BtP;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120533);
    vq();
    for (int i = 0; i < this.BtQ.size(); i++)
      paramf.a(1, (q)this.BtQ.get(i));
    paramf.d(this.BsB);
    AppMethodBeat.o(120533);
  }

  public final s<g> ecy()
  {
    return BsC;
  }

  public final a.g.a edI()
  {
    AppMethodBeat.i(120536);
    a.g.a locala = a.g.a.edM().d(this);
    AppMethodBeat.o(120536);
    return locala;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120532);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120532);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120532);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.BtQ.size())
            break label92;
          if (!((a.i)this.BtQ.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120532);
            break;
          }
        }
        label92: this.BsG = ((byte)1);
        AppMethodBeat.o(120532);
        bool = true;
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120534);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(120534);
    while (true)
    {
      return i;
      i = 0;
      int j = 0;
      while (i < this.BtQ.size())
      {
        j += f.c(1, (q)this.BtQ.get(i));
        i++;
      }
      i = this.BsB.size() + j;
      this.BsH = i;
      AppMethodBeat.o(120534);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.g
 * JD-Core Version:    0.6.2
 */
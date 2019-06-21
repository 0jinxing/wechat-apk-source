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

public final class a$w extends i
  implements a.x
{
  public static s<w> BsC;
  private static final w BuN;
  private final d BsB;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  private List<a.w.b> BuO;

  static
  {
    AppMethodBeat.i(120794);
    BsC = new a.w.1();
    w localw = new w();
    BuN = localw;
    localw.BuO = Collections.emptyList();
    AppMethodBeat.o(120794);
  }

  private a$w()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$w(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 61	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 78
    //   6: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 63	a/i/b/a/c/e/a$w:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 65	a/i/b/a/c/e/a$w:BsH	I
    //   20: aload_0
    //   21: invokestatic 54	java/util/Collections:emptyList	()Ljava/util/List;
    //   24: putfield 56	a/i/b/a/c/e/a$w:BuO	Ljava/util/List;
    //   27: invokestatic 82	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   30: astore_3
    //   31: aload_3
    //   32: iconst_1
    //   33: invokestatic 88	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
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
    //   62: invokevirtual 94	a/i/b/a/c/g/e:vc	()I
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
    //   115: invokevirtual 98	a/i/b/a/c/e/a$w:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
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
    //   157: new 100	java/util/ArrayList
    //   160: astore 11
    //   162: iload 6
    //   164: istore 7
    //   166: iload 6
    //   168: istore 8
    //   170: iload 6
    //   172: istore 9
    //   174: aload 11
    //   176: invokespecial 101	java/util/ArrayList:<init>	()V
    //   179: iload 6
    //   181: istore 7
    //   183: iload 6
    //   185: istore 8
    //   187: iload 6
    //   189: istore 9
    //   191: aload_0
    //   192: aload 11
    //   194: putfield 56	a/i/b/a/c/e/a$w:BuO	Ljava/util/List;
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
    //   216: getfield 56	a/i/b/a/c/e/a$w:BuO	Ljava/util/List;
    //   219: aload_1
    //   220: getstatic 102	a/i/b/a/c/e/a$w$b:BsC	La/i/b/a/c/g/s;
    //   223: aload_2
    //   224: invokevirtual 105	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   227: invokeinterface 111 2 0
    //   232: pop
    //   233: iload 10
    //   235: istore 6
    //   237: goto -193 -> 44
    //   240: astore_1
    //   241: iload 7
    //   243: istore 8
    //   245: aload_1
    //   246: aload_0
    //   247: putfield 115	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   250: iload 7
    //   252: istore 8
    //   254: ldc 78
    //   256: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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
    //   276: getfield 56	a/i/b/a/c/e/a$w:BuO	Ljava/util/List;
    //   279: invokestatic 119	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   282: putfield 56	a/i/b/a/c/e/a$w:BuO	Ljava/util/List;
    //   285: aload 4
    //   287: invokevirtual 122	a/i/b/a/c/g/f:flush	()V
    //   290: aload_0
    //   291: aload_3
    //   292: invokevirtual 128	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   295: putfield 72	a/i/b/a/c/e/a$w:BsB	La/i/b/a/c/g/d;
    //   298: aload_0
    //   299: invokevirtual 131	a/i/b/a/c/e/a$w:eio	()V
    //   302: ldc 78
    //   304: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   307: aload_1
    //   308: athrow
    //   309: iload 6
    //   311: iconst_1
    //   312: iand
    //   313: iconst_1
    //   314: if_icmpne +14 -> 328
    //   317: aload_0
    //   318: aload_0
    //   319: getfield 56	a/i/b/a/c/e/a$w:BuO	Ljava/util/List;
    //   322: invokestatic 119	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   325: putfield 56	a/i/b/a/c/e/a$w:BuO	Ljava/util/List;
    //   328: aload 4
    //   330: invokevirtual 122	a/i/b/a/c/g/f:flush	()V
    //   333: aload_0
    //   334: aload_3
    //   335: invokevirtual 128	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   338: putfield 72	a/i/b/a/c/e/a$w:BsB	La/i/b/a/c/g/d;
    //   341: aload_0
    //   342: invokevirtual 131	a/i/b/a/c/e/a$w:eio	()V
    //   345: ldc 78
    //   347: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: return
    //   351: astore_1
    //   352: aload_0
    //   353: aload_3
    //   354: invokevirtual 128	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   357: putfield 72	a/i/b/a/c/e/a$w:BsB	La/i/b/a/c/g/d;
    //   360: goto -19 -> 341
    //   363: astore_1
    //   364: aload_0
    //   365: aload_3
    //   366: invokevirtual 128	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   369: putfield 72	a/i/b/a/c/e/a$w:BsB	La/i/b/a/c/g/d;
    //   372: ldc 78
    //   374: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   377: aload_1
    //   378: athrow
    //   379: astore_1
    //   380: iload 9
    //   382: istore 8
    //   384: new 75	a/i/b/a/c/g/k
    //   387: astore_2
    //   388: iload 9
    //   390: istore 8
    //   392: aload_2
    //   393: aload_1
    //   394: invokevirtual 135	java/io/IOException:getMessage	()Ljava/lang/String;
    //   397: invokespecial 138	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   400: iload 9
    //   402: istore 8
    //   404: aload_2
    //   405: aload_0
    //   406: putfield 115	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   409: iload 9
    //   411: istore 8
    //   413: ldc 78
    //   415: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: iload 9
    //   420: istore 8
    //   422: aload_2
    //   423: athrow
    //   424: astore_2
    //   425: aload_0
    //   426: aload_3
    //   427: invokevirtual 128	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   430: putfield 72	a/i/b/a/c/e/a$w:BsB	La/i/b/a/c/g/d;
    //   433: goto -135 -> 298
    //   436: astore_1
    //   437: aload_0
    //   438: aload_3
    //   439: invokevirtual 128	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   442: putfield 72	a/i/b/a/c/e/a$w:BsB	La/i/b/a/c/g/d;
    //   445: ldc 78
    //   447: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  private a$w(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a.w.a a(w paramw)
  {
    AppMethodBeat.i(120790);
    paramw = a.w.a.eeK().d(paramw);
    AppMethodBeat.o(120790);
    return paramw;
  }

  public static w eeF()
  {
    return BuN;
  }

  public final a.w.b Ty(int paramInt)
  {
    AppMethodBeat.i(120786);
    a.w.b localb = (a.w.b)this.BuO.get(paramInt);
    AppMethodBeat.o(120786);
    return localb;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120788);
    vq();
    for (int i = 0; i < this.BuO.size(); i++)
      paramf.a(1, (q)this.BuO.get(i));
    paramf.d(this.BsB);
    AppMethodBeat.o(120788);
  }

  public final s<w> ecy()
  {
    return BsC;
  }

  public final a.w.a eeG()
  {
    AppMethodBeat.i(120791);
    a.w.a locala = a.w.a.eeK().d(this);
    AppMethodBeat.o(120791);
    return locala;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120787);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120787);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120787);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.BuO.size())
            break label84;
          if (!Ty(i).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120787);
            break;
          }
        }
        label84: this.BsG = ((byte)1);
        AppMethodBeat.o(120787);
        bool = true;
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120789);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(120789);
    while (true)
    {
      return i;
      int j = 0;
      i = 0;
      while (j < this.BuO.size())
      {
        i += f.c(1, (q)this.BuO.get(j));
        j++;
      }
      i = this.BsB.size() + i;
      this.BsH = i;
      AppMethodBeat.o(120789);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.w
 * JD-Core Version:    0.6.2
 */
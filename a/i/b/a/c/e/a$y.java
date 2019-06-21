package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.n;
import a.i.b.a.c.g.o;
import a.i.b.a.c.g.s;
import a.i.b.a.c.g.t;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$y extends i
  implements a.z
{
  public static s<y> BsC;
  private static final y BuX;
  private final d BsB;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  private o BuY;

  static
  {
    AppMethodBeat.i(120819);
    BsC = new a.y.1();
    y localy = new y();
    BuX = localy;
    localy.BuY = n.BAf;
    AppMethodBeat.o(120819);
  }

  private a$y()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$y(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 55	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 72
    //   6: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 57	a/i/b/a/c/e/a$y:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 59	a/i/b/a/c/e/a$y:BsH	I
    //   20: aload_0
    //   21: getstatic 48	a/i/b/a/c/g/n:BAf	La/i/b/a/c/g/o;
    //   24: putfield 50	a/i/b/a/c/e/a$y:BuY	La/i/b/a/c/g/o;
    //   27: invokestatic 76	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   30: astore_3
    //   31: aload_3
    //   32: iconst_1
    //   33: invokestatic 82	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   36: astore 4
    //   38: iconst_0
    //   39: istore 5
    //   41: iconst_0
    //   42: istore 6
    //   44: iload 5
    //   46: ifne +276 -> 322
    //   49: iload 6
    //   51: istore 7
    //   53: iload 6
    //   55: istore 8
    //   57: iload 6
    //   59: istore 9
    //   61: aload_1
    //   62: invokevirtual 88	a/i/b/a/c/g/e:vc	()I
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
    //   115: invokevirtual 92	a/i/b/a/c/e/a$y:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   118: ifne -74 -> 44
    //   121: iconst_1
    //   122: istore 5
    //   124: goto -80 -> 44
    //   127: iconst_1
    //   128: istore 5
    //   130: goto -86 -> 44
    //   133: iload 6
    //   135: istore 7
    //   137: iload 6
    //   139: istore 8
    //   141: iload 6
    //   143: istore 9
    //   145: aload_1
    //   146: invokevirtual 96	a/i/b/a/c/g/e:ehY	()La/i/b/a/c/g/d;
    //   149: astore 11
    //   151: iload 6
    //   153: istore 10
    //   155: iload 6
    //   157: iconst_1
    //   158: iand
    //   159: iconst_1
    //   160: if_icmpeq +61 -> 221
    //   163: iload 6
    //   165: istore 7
    //   167: iload 6
    //   169: istore 8
    //   171: iload 6
    //   173: istore 9
    //   175: new 45	a/i/b/a/c/g/n
    //   178: astore 12
    //   180: iload 6
    //   182: istore 7
    //   184: iload 6
    //   186: istore 8
    //   188: iload 6
    //   190: istore 9
    //   192: aload 12
    //   194: invokespecial 97	a/i/b/a/c/g/n:<init>	()V
    //   197: iload 6
    //   199: istore 7
    //   201: iload 6
    //   203: istore 8
    //   205: iload 6
    //   207: istore 9
    //   209: aload_0
    //   210: aload 12
    //   212: putfield 50	a/i/b/a/c/e/a$y:BuY	La/i/b/a/c/g/o;
    //   215: iload 6
    //   217: iconst_1
    //   218: ior
    //   219: istore 10
    //   221: iload 10
    //   223: istore 7
    //   225: iload 10
    //   227: istore 8
    //   229: iload 10
    //   231: istore 9
    //   233: aload_0
    //   234: getfield 50	a/i/b/a/c/e/a$y:BuY	La/i/b/a/c/g/o;
    //   237: aload 11
    //   239: invokeinterface 102 2 0
    //   244: iload 10
    //   246: istore 6
    //   248: goto -204 -> 44
    //   251: astore_1
    //   252: iload 7
    //   254: istore 8
    //   256: aload_1
    //   257: aload_0
    //   258: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   261: iload 7
    //   263: istore 8
    //   265: ldc 72
    //   267: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: iload 7
    //   272: istore 8
    //   274: aload_1
    //   275: athrow
    //   276: astore_1
    //   277: iload 8
    //   279: iconst_1
    //   280: iand
    //   281: iconst_1
    //   282: if_icmpne +16 -> 298
    //   285: aload_0
    //   286: aload_0
    //   287: getfield 50	a/i/b/a/c/e/a$y:BuY	La/i/b/a/c/g/o;
    //   290: invokeinterface 110 1 0
    //   295: putfield 50	a/i/b/a/c/e/a$y:BuY	La/i/b/a/c/g/o;
    //   298: aload 4
    //   300: invokevirtual 113	a/i/b/a/c/g/f:flush	()V
    //   303: aload_0
    //   304: aload_3
    //   305: invokevirtual 118	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   308: putfield 66	a/i/b/a/c/e/a$y:BsB	La/i/b/a/c/g/d;
    //   311: aload_0
    //   312: invokevirtual 121	a/i/b/a/c/e/a$y:eio	()V
    //   315: ldc 72
    //   317: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: aload_1
    //   321: athrow
    //   322: iload 6
    //   324: iconst_1
    //   325: iand
    //   326: iconst_1
    //   327: if_icmpne +16 -> 343
    //   330: aload_0
    //   331: aload_0
    //   332: getfield 50	a/i/b/a/c/e/a$y:BuY	La/i/b/a/c/g/o;
    //   335: invokeinterface 110 1 0
    //   340: putfield 50	a/i/b/a/c/e/a$y:BuY	La/i/b/a/c/g/o;
    //   343: aload 4
    //   345: invokevirtual 113	a/i/b/a/c/g/f:flush	()V
    //   348: aload_0
    //   349: aload_3
    //   350: invokevirtual 118	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   353: putfield 66	a/i/b/a/c/e/a$y:BsB	La/i/b/a/c/g/d;
    //   356: aload_0
    //   357: invokevirtual 121	a/i/b/a/c/e/a$y:eio	()V
    //   360: ldc 72
    //   362: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: return
    //   366: astore_1
    //   367: aload_0
    //   368: aload_3
    //   369: invokevirtual 118	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   372: putfield 66	a/i/b/a/c/e/a$y:BsB	La/i/b/a/c/g/d;
    //   375: goto -19 -> 356
    //   378: astore_1
    //   379: aload_0
    //   380: aload_3
    //   381: invokevirtual 118	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   384: putfield 66	a/i/b/a/c/e/a$y:BsB	La/i/b/a/c/g/d;
    //   387: ldc 72
    //   389: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   392: aload_1
    //   393: athrow
    //   394: astore_1
    //   395: iload 9
    //   397: istore 8
    //   399: new 69	a/i/b/a/c/g/k
    //   402: astore_2
    //   403: iload 9
    //   405: istore 8
    //   407: aload_2
    //   408: aload_1
    //   409: invokevirtual 125	java/io/IOException:getMessage	()Ljava/lang/String;
    //   412: invokespecial 128	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   415: iload 9
    //   417: istore 8
    //   419: aload_2
    //   420: aload_0
    //   421: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   424: iload 9
    //   426: istore 8
    //   428: ldc 72
    //   430: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   433: iload 9
    //   435: istore 8
    //   437: aload_2
    //   438: athrow
    //   439: astore_2
    //   440: aload_0
    //   441: aload_3
    //   442: invokevirtual 118	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   445: putfield 66	a/i/b/a/c/e/a$y:BsB	La/i/b/a/c/g/d;
    //   448: goto -137 -> 311
    //   451: astore_1
    //   452: aload_0
    //   453: aload_3
    //   454: invokevirtual 118	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   457: putfield 66	a/i/b/a/c/e/a$y:BsB	La/i/b/a/c/g/d;
    //   460: ldc 72
    //   462: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: aload_1
    //   466: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   61	67	251	a/i/b/a/c/g/k
    //   108	121	251	a/i/b/a/c/g/k
    //   145	151	251	a/i/b/a/c/g/k
    //   175	180	251	a/i/b/a/c/g/k
    //   192	197	251	a/i/b/a/c/g/k
    //   209	215	251	a/i/b/a/c/g/k
    //   233	244	251	a/i/b/a/c/g/k
    //   61	67	276	finally
    //   108	121	276	finally
    //   145	151	276	finally
    //   175	180	276	finally
    //   192	197	276	finally
    //   209	215	276	finally
    //   233	244	276	finally
    //   256	261	276	finally
    //   265	270	276	finally
    //   274	276	276	finally
    //   399	403	276	finally
    //   407	415	276	finally
    //   419	424	276	finally
    //   428	433	276	finally
    //   437	439	276	finally
    //   343	348	366	java/io/IOException
    //   343	348	378	finally
    //   61	67	394	java/io/IOException
    //   108	121	394	java/io/IOException
    //   145	151	394	java/io/IOException
    //   175	180	394	java/io/IOException
    //   192	197	394	java/io/IOException
    //   209	215	394	java/io/IOException
    //   233	244	394	java/io/IOException
    //   298	303	439	java/io/IOException
    //   298	303	451	finally
  }

  private a$y(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a.y.a a(y paramy)
  {
    AppMethodBeat.i(120815);
    paramy = a.y.a.eeW().d(paramy);
    AppMethodBeat.o(120815);
    return paramy;
  }

  public static y eeR()
  {
    return BuX;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120813);
    vq();
    for (int i = 0; i < this.BuY.size(); i++)
      paramf.a(1, this.BuY.UC(i));
    paramf.d(this.BsB);
    AppMethodBeat.o(120813);
  }

  public final s<y> ecy()
  {
    return BsC;
  }

  public final a.y.a eeS()
  {
    AppMethodBeat.i(120816);
    a.y.a locala = a.y.a.eeW().d(this);
    AppMethodBeat.o(120816);
    return locala;
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(120812);
    String str = (String)this.BuY.get(paramInt);
    AppMethodBeat.o(120812);
    return str;
  }

  public final boolean isInitialized()
  {
    boolean bool = true;
    int i = this.BsG;
    if (i == 1);
    while (true)
    {
      return bool;
      if (i == 0)
        bool = false;
      else
        this.BsG = ((byte)1);
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120814);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(120814);
    while (true)
    {
      return i;
      int j = 0;
      int k;
      for (i = 0; j < this.BuY.size(); i = k + i)
      {
        k = f.c(this.BuY.UC(j));
        j++;
      }
      i = i + 0 + this.BuY.size() * 1 + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.y
 * JD-Core Version:    0.6.2
 */
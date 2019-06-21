package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$aa$a extends i
  implements a.aa.b
{
  public static s<a> BsC;
  private static final a Bvm;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public a.aa.a.b Bvn;
  public a.aa Bvo;
  public int Bvp;

  static
  {
    AppMethodBeat.i(120851);
    BsC = new a.aa.a.1();
    a locala = new a();
    Bvm = locala;
    locala.ecA();
    AppMethodBeat.o(120851);
  }

  private a$aa$a()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$aa$a(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 57	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 74
    //   6: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 59	a/i/b/a/c/e/a$aa$a:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 61	a/i/b/a/c/e/a$aa$a:BsH	I
    //   20: aload_0
    //   21: invokespecial 52	a/i/b/a/c/e/a$aa$a:ecA	()V
    //   24: invokestatic 78	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 84	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +286 -> 326
    //   43: aload_1
    //   44: invokevirtual 90	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+41->92, 0:+60->111, 8:+66->117, 18:+183->234, 24:+254->305
    //   93: aload_1
    //   94: aload 4
    //   96: aload_2
    //   97: iload 6
    //   99: invokevirtual 93	a/i/b/a/c/e/a$aa$a:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   102: ifne -64 -> 38
    //   105: iconst_1
    //   106: istore 5
    //   108: goto -70 -> 38
    //   111: iconst_1
    //   112: istore 5
    //   114: goto -76 -> 38
    //   117: aload_1
    //   118: invokevirtual 96	a/i/b/a/c/g/e:vd	()I
    //   121: istore 7
    //   123: iload 7
    //   125: invokestatic 100	a/i/b/a/c/e/a$aa$a$b:TD	(I)La/i/b/a/c/e/a$aa$a$b;
    //   128: astore 8
    //   130: aload 8
    //   132: ifnonnull +58 -> 190
    //   135: aload 4
    //   137: iload 6
    //   139: invokevirtual 103	a/i/b/a/c/g/f:fw	(I)V
    //   142: aload 4
    //   144: iload 7
    //   146: invokevirtual 103	a/i/b/a/c/g/f:fw	(I)V
    //   149: goto -111 -> 38
    //   152: astore_1
    //   153: aload_1
    //   154: aload_0
    //   155: putfield 107	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   158: ldc 74
    //   160: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: aload_1
    //   164: athrow
    //   165: astore_1
    //   166: aload 4
    //   168: invokevirtual 110	a/i/b/a/c/g/f:flush	()V
    //   171: aload_0
    //   172: aload_3
    //   173: invokevirtual 116	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   176: putfield 68	a/i/b/a/c/e/a$aa$a:BsB	La/i/b/a/c/g/d;
    //   179: aload_0
    //   180: invokevirtual 119	a/i/b/a/c/e/a$aa$a:eio	()V
    //   183: ldc 74
    //   185: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: aload_1
    //   189: athrow
    //   190: aload_0
    //   191: aload_0
    //   192: getfield 121	a/i/b/a/c/e/a$aa$a:BsD	I
    //   195: iconst_1
    //   196: ior
    //   197: putfield 121	a/i/b/a/c/e/a$aa$a:BsD	I
    //   200: aload_0
    //   201: aload 8
    //   203: putfield 123	a/i/b/a/c/e/a$aa$a:Bvn	La/i/b/a/c/e/a$aa$a$b;
    //   206: goto -168 -> 38
    //   209: astore_2
    //   210: new 71	a/i/b/a/c/g/k
    //   213: astore_1
    //   214: aload_1
    //   215: aload_2
    //   216: invokevirtual 127	java/io/IOException:getMessage	()Ljava/lang/String;
    //   219: invokespecial 130	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   222: aload_1
    //   223: aload_0
    //   224: putfield 107	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   227: ldc 74
    //   229: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: aload_1
    //   233: athrow
    //   234: aload_0
    //   235: getfield 121	a/i/b/a/c/e/a$aa$a:BsD	I
    //   238: iconst_2
    //   239: iand
    //   240: iconst_2
    //   241: if_icmpne +164 -> 405
    //   244: aload_0
    //   245: getfield 132	a/i/b/a/c/e/a$aa$a:Bvo	La/i/b/a/c/e/a$aa;
    //   248: invokevirtual 136	a/i/b/a/c/e/a$aa:efk	()La/i/b/a/c/e/a$aa$c;
    //   251: astore 8
    //   253: aload_0
    //   254: aload_1
    //   255: getstatic 137	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   258: aload_2
    //   259: invokevirtual 140	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   262: checkcast 8	a/i/b/a/c/e/a$aa
    //   265: putfield 132	a/i/b/a/c/e/a$aa$a:Bvo	La/i/b/a/c/e/a$aa;
    //   268: aload 8
    //   270: ifnull +22 -> 292
    //   273: aload 8
    //   275: aload_0
    //   276: getfield 132	a/i/b/a/c/e/a$aa$a:Bvo	La/i/b/a/c/e/a$aa;
    //   279: invokevirtual 146	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   282: pop
    //   283: aload_0
    //   284: aload 8
    //   286: invokevirtual 150	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   289: putfield 132	a/i/b/a/c/e/a$aa$a:Bvo	La/i/b/a/c/e/a$aa;
    //   292: aload_0
    //   293: aload_0
    //   294: getfield 121	a/i/b/a/c/e/a$aa$a:BsD	I
    //   297: iconst_2
    //   298: ior
    //   299: putfield 121	a/i/b/a/c/e/a$aa$a:BsD	I
    //   302: goto -264 -> 38
    //   305: aload_0
    //   306: aload_0
    //   307: getfield 121	a/i/b/a/c/e/a$aa$a:BsD	I
    //   310: iconst_4
    //   311: ior
    //   312: putfield 121	a/i/b/a/c/e/a$aa$a:BsD	I
    //   315: aload_0
    //   316: aload_1
    //   317: invokevirtual 96	a/i/b/a/c/g/e:vd	()I
    //   320: putfield 152	a/i/b/a/c/e/a$aa$a:Bvp	I
    //   323: goto -285 -> 38
    //   326: aload 4
    //   328: invokevirtual 110	a/i/b/a/c/g/f:flush	()V
    //   331: aload_0
    //   332: aload_3
    //   333: invokevirtual 116	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   336: putfield 68	a/i/b/a/c/e/a$aa$a:BsB	La/i/b/a/c/g/d;
    //   339: aload_0
    //   340: invokevirtual 119	a/i/b/a/c/e/a$aa$a:eio	()V
    //   343: ldc 74
    //   345: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   348: return
    //   349: astore_1
    //   350: aload_0
    //   351: aload_3
    //   352: invokevirtual 116	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   355: putfield 68	a/i/b/a/c/e/a$aa$a:BsB	La/i/b/a/c/g/d;
    //   358: goto -19 -> 339
    //   361: astore_1
    //   362: aload_0
    //   363: aload_3
    //   364: invokevirtual 116	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   367: putfield 68	a/i/b/a/c/e/a$aa$a:BsB	La/i/b/a/c/g/d;
    //   370: ldc 74
    //   372: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   375: aload_1
    //   376: athrow
    //   377: astore_2
    //   378: aload_0
    //   379: aload_3
    //   380: invokevirtual 116	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   383: putfield 68	a/i/b/a/c/e/a$aa$a:BsB	La/i/b/a/c/g/d;
    //   386: goto -207 -> 179
    //   389: astore_1
    //   390: aload_0
    //   391: aload_3
    //   392: invokevirtual 116	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   395: putfield 68	a/i/b/a/c/e/a$aa$a:BsB	La/i/b/a/c/g/d;
    //   398: ldc 74
    //   400: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   403: aload_1
    //   404: athrow
    //   405: aconst_null
    //   406: astore 8
    //   408: goto -155 -> 253
    //
    // Exception table:
    //   from	to	target	type
    //   43	49	152	a/i/b/a/c/g/k
    //   92	105	152	a/i/b/a/c/g/k
    //   117	130	152	a/i/b/a/c/g/k
    //   135	149	152	a/i/b/a/c/g/k
    //   190	206	152	a/i/b/a/c/g/k
    //   234	253	152	a/i/b/a/c/g/k
    //   253	268	152	a/i/b/a/c/g/k
    //   273	292	152	a/i/b/a/c/g/k
    //   292	302	152	a/i/b/a/c/g/k
    //   305	323	152	a/i/b/a/c/g/k
    //   43	49	165	finally
    //   92	105	165	finally
    //   117	130	165	finally
    //   135	149	165	finally
    //   153	165	165	finally
    //   190	206	165	finally
    //   210	234	165	finally
    //   234	253	165	finally
    //   253	268	165	finally
    //   273	292	165	finally
    //   292	302	165	finally
    //   305	323	165	finally
    //   43	49	209	java/io/IOException
    //   92	105	209	java/io/IOException
    //   117	130	209	java/io/IOException
    //   135	149	209	java/io/IOException
    //   190	206	209	java/io/IOException
    //   234	253	209	java/io/IOException
    //   253	268	209	java/io/IOException
    //   273	292	209	java/io/IOException
    //   292	302	209	java/io/IOException
    //   305	323	209	java/io/IOException
    //   326	331	349	java/io/IOException
    //   326	331	361	finally
    //   166	171	377	java/io/IOException
    //   166	171	389	finally
  }

  private a$aa$a(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(120845);
    this.Bvn = a.aa.a.b.Bvs;
    this.Bvo = a.aa.eeX();
    this.Bvp = 0;
    AppMethodBeat.o(120845);
  }

  public static a efl()
  {
    return Bvm;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120847);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.io(1, this.Bvn.value);
    if ((this.BsD & 0x2) == 2)
      paramf.a(2, this.Bvo);
    if ((this.BsD & 0x4) == 4)
      paramf.bq(3, this.Bvp);
    paramf.d(this.BsB);
    AppMethodBeat.o(120847);
  }

  public final boolean ecP()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final s<a> ecy()
  {
    return BsC;
  }

  public final boolean efm()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean efn()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = true;
    AppMethodBeat.i(120846);
    int i = this.BsG;
    if (i == 1)
      AppMethodBeat.o(120846);
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120846);
        bool = false;
      }
      else if ((ecP()) && (!this.Bvo.isInitialized()))
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120846);
        bool = false;
      }
      else
      {
        this.BsG = ((byte)1);
        AppMethodBeat.o(120846);
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120848);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(120848);
    while (true)
    {
      return i;
      int j = 0;
      if ((this.BsD & 0x1) == 1)
        j = f.ip(1, this.Bvn.value) + 0;
      i = j;
      if ((this.BsD & 0x2) == 2)
        i = j + f.c(2, this.Bvo);
      j = i;
      if ((this.BsD & 0x4) == 4)
        j = i + f.bs(3, this.Bvp);
      i = j + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120848);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.aa.a
 * JD-Core Version:    0.6.2
 */
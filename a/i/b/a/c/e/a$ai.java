package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.c.a;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$ai extends i.c<ai>
  implements a.aj
{
  public static s<ai> BsC;
  private static final ai BvO;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BsW;
  public int Buf;
  public a.aa BvP;
  public int BvQ;
  public a.aa Bvo;
  public int Bvp;

  static
  {
    AppMethodBeat.i(121005);
    BsC = new a.ai.1();
    ai localai = new ai();
    BvO = localai;
    localai.ecA();
    AppMethodBeat.o(121005);
  }

  private a$ai()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$ai(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 58	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 75
    //   6: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 60	a/i/b/a/c/e/a$ai:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 62	a/i/b/a/c/e/a$ai:BsH	I
    //   20: aload_0
    //   21: invokespecial 53	a/i/b/a/c/e/a$ai:ecA	()V
    //   24: invokestatic 79	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 85	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +398 -> 438
    //   43: aload_1
    //   44: invokevirtual 91	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+65->116, 0:+84->135, 8:+90->141, 16:+152->203, 26:+198->249, 34:+269->320, 40:+343->394, 48:+365->416
    //   117: aload_1
    //   118: aload 4
    //   120: aload_2
    //   121: iload 6
    //   123: invokevirtual 95	a/i/b/a/c/e/a$ai:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   126: ifne -88 -> 38
    //   129: iconst_1
    //   130: istore 5
    //   132: goto -94 -> 38
    //   135: iconst_1
    //   136: istore 5
    //   138: goto -100 -> 38
    //   141: aload_0
    //   142: aload_0
    //   143: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   146: iconst_1
    //   147: ior
    //   148: putfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   151: aload_0
    //   152: aload_1
    //   153: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   156: putfield 102	a/i/b/a/c/e/a$ai:BsW	I
    //   159: goto -121 -> 38
    //   162: astore_1
    //   163: aload_1
    //   164: aload_0
    //   165: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   168: ldc 75
    //   170: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: aload 4
    //   178: invokevirtual 109	a/i/b/a/c/g/f:flush	()V
    //   181: aload_0
    //   182: aload_3
    //   183: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   186: putfield 69	a/i/b/a/c/e/a$ai:BsB	La/i/b/a/c/g/d;
    //   189: aload_0
    //   190: getfield 119	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   193: invokevirtual 124	a/i/b/a/c/g/h:eii	()V
    //   196: ldc 75
    //   198: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: aload_1
    //   202: athrow
    //   203: aload_0
    //   204: aload_0
    //   205: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   208: iconst_2
    //   209: ior
    //   210: putfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   213: aload_0
    //   214: aload_1
    //   215: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   218: putfield 126	a/i/b/a/c/e/a$ai:Buf	I
    //   221: goto -183 -> 38
    //   224: astore_1
    //   225: new 72	a/i/b/a/c/g/k
    //   228: astore_2
    //   229: aload_2
    //   230: aload_1
    //   231: invokevirtual 130	java/io/IOException:getMessage	()Ljava/lang/String;
    //   234: invokespecial 133	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   237: aload_2
    //   238: aload_0
    //   239: putfield 106	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   242: ldc 75
    //   244: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   247: aload_2
    //   248: athrow
    //   249: aload_0
    //   250: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   253: iconst_4
    //   254: iand
    //   255: iconst_4
    //   256: if_icmpne +270 -> 526
    //   259: aload_0
    //   260: getfield 135	a/i/b/a/c/e/a$ai:Bvo	La/i/b/a/c/e/a$aa;
    //   263: invokevirtual 141	a/i/b/a/c/e/a$aa:efk	()La/i/b/a/c/e/a$aa$c;
    //   266: astore 7
    //   268: aload_0
    //   269: aload_1
    //   270: getstatic 142	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   273: aload_2
    //   274: invokevirtual 145	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   277: checkcast 137	a/i/b/a/c/e/a$aa
    //   280: putfield 135	a/i/b/a/c/e/a$ai:Bvo	La/i/b/a/c/e/a$aa;
    //   283: aload 7
    //   285: ifnull +22 -> 307
    //   288: aload 7
    //   290: aload_0
    //   291: getfield 135	a/i/b/a/c/e/a$ai:Bvo	La/i/b/a/c/e/a$aa;
    //   294: invokevirtual 151	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   297: pop
    //   298: aload_0
    //   299: aload 7
    //   301: invokevirtual 155	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   304: putfield 135	a/i/b/a/c/e/a$ai:Bvo	La/i/b/a/c/e/a$aa;
    //   307: aload_0
    //   308: aload_0
    //   309: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   312: iconst_4
    //   313: ior
    //   314: putfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   317: goto -279 -> 38
    //   320: aload_0
    //   321: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   324: bipush 16
    //   326: iand
    //   327: bipush 16
    //   329: if_icmpne +191 -> 520
    //   332: aload_0
    //   333: getfield 157	a/i/b/a/c/e/a$ai:BvP	La/i/b/a/c/e/a$aa;
    //   336: invokevirtual 141	a/i/b/a/c/e/a$aa:efk	()La/i/b/a/c/e/a$aa$c;
    //   339: astore 7
    //   341: aload_0
    //   342: aload_1
    //   343: getstatic 142	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   346: aload_2
    //   347: invokevirtual 145	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   350: checkcast 137	a/i/b/a/c/e/a$aa
    //   353: putfield 157	a/i/b/a/c/e/a$ai:BvP	La/i/b/a/c/e/a$aa;
    //   356: aload 7
    //   358: ifnull +22 -> 380
    //   361: aload 7
    //   363: aload_0
    //   364: getfield 157	a/i/b/a/c/e/a$ai:BvP	La/i/b/a/c/e/a$aa;
    //   367: invokevirtual 151	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   370: pop
    //   371: aload_0
    //   372: aload 7
    //   374: invokevirtual 155	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   377: putfield 157	a/i/b/a/c/e/a$ai:BvP	La/i/b/a/c/e/a$aa;
    //   380: aload_0
    //   381: aload_0
    //   382: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   385: bipush 16
    //   387: ior
    //   388: putfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   391: goto -353 -> 38
    //   394: aload_0
    //   395: aload_0
    //   396: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   399: bipush 8
    //   401: ior
    //   402: putfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   405: aload_0
    //   406: aload_1
    //   407: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   410: putfield 159	a/i/b/a/c/e/a$ai:Bvp	I
    //   413: goto -375 -> 38
    //   416: aload_0
    //   417: aload_0
    //   418: getfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   421: bipush 32
    //   423: ior
    //   424: putfield 97	a/i/b/a/c/e/a$ai:BsD	I
    //   427: aload_0
    //   428: aload_1
    //   429: invokevirtual 100	a/i/b/a/c/g/e:vd	()I
    //   432: putfield 161	a/i/b/a/c/e/a$ai:BvQ	I
    //   435: goto -397 -> 38
    //   438: aload 4
    //   440: invokevirtual 109	a/i/b/a/c/g/f:flush	()V
    //   443: aload_0
    //   444: aload_3
    //   445: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   448: putfield 69	a/i/b/a/c/e/a$ai:BsB	La/i/b/a/c/g/d;
    //   451: aload_0
    //   452: getfield 119	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   455: invokevirtual 124	a/i/b/a/c/g/h:eii	()V
    //   458: ldc 75
    //   460: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   463: return
    //   464: astore_1
    //   465: aload_0
    //   466: aload_3
    //   467: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   470: putfield 69	a/i/b/a/c/e/a$ai:BsB	La/i/b/a/c/g/d;
    //   473: goto -22 -> 451
    //   476: astore_1
    //   477: aload_0
    //   478: aload_3
    //   479: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   482: putfield 69	a/i/b/a/c/e/a$ai:BsB	La/i/b/a/c/g/d;
    //   485: ldc 75
    //   487: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   490: aload_1
    //   491: athrow
    //   492: astore_2
    //   493: aload_0
    //   494: aload_3
    //   495: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   498: putfield 69	a/i/b/a/c/e/a$ai:BsB	La/i/b/a/c/g/d;
    //   501: goto -312 -> 189
    //   504: astore_1
    //   505: aload_0
    //   506: aload_3
    //   507: invokevirtual 115	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   510: putfield 69	a/i/b/a/c/e/a$ai:BsB	La/i/b/a/c/g/d;
    //   513: ldc 75
    //   515: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   518: aload_1
    //   519: athrow
    //   520: aconst_null
    //   521: astore 7
    //   523: goto -182 -> 341
    //   526: aconst_null
    //   527: astore 7
    //   529: goto -261 -> 268
    //
    // Exception table:
    //   from	to	target	type
    //   43	49	162	a/i/b/a/c/g/k
    //   116	129	162	a/i/b/a/c/g/k
    //   141	159	162	a/i/b/a/c/g/k
    //   203	221	162	a/i/b/a/c/g/k
    //   249	268	162	a/i/b/a/c/g/k
    //   268	283	162	a/i/b/a/c/g/k
    //   288	307	162	a/i/b/a/c/g/k
    //   307	317	162	a/i/b/a/c/g/k
    //   320	341	162	a/i/b/a/c/g/k
    //   341	356	162	a/i/b/a/c/g/k
    //   361	380	162	a/i/b/a/c/g/k
    //   380	391	162	a/i/b/a/c/g/k
    //   394	413	162	a/i/b/a/c/g/k
    //   416	435	162	a/i/b/a/c/g/k
    //   43	49	175	finally
    //   116	129	175	finally
    //   141	159	175	finally
    //   163	175	175	finally
    //   203	221	175	finally
    //   225	249	175	finally
    //   249	268	175	finally
    //   268	283	175	finally
    //   288	307	175	finally
    //   307	317	175	finally
    //   320	341	175	finally
    //   341	356	175	finally
    //   361	380	175	finally
    //   380	391	175	finally
    //   394	413	175	finally
    //   416	435	175	finally
    //   43	49	224	java/io/IOException
    //   116	129	224	java/io/IOException
    //   141	159	224	java/io/IOException
    //   203	221	224	java/io/IOException
    //   249	268	224	java/io/IOException
    //   268	283	224	java/io/IOException
    //   288	307	224	java/io/IOException
    //   307	317	224	java/io/IOException
    //   320	341	224	java/io/IOException
    //   341	356	224	java/io/IOException
    //   361	380	224	java/io/IOException
    //   380	391	224	java/io/IOException
    //   394	413	224	java/io/IOException
    //   416	435	224	java/io/IOException
    //   438	443	464	java/io/IOException
    //   438	443	476	finally
    //   176	181	492	java/io/IOException
    //   176	181	504	finally
  }

  private a$ai(i.b<ai, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  public static a.ai.a b(ai paramai)
  {
    AppMethodBeat.i(121002);
    paramai = a.ai.a.efX().d(paramai);
    AppMethodBeat.o(121002);
    return paramai;
  }

  private void ecA()
  {
    AppMethodBeat.i(120998);
    this.BsW = 0;
    this.Buf = 0;
    this.Bvo = a.aa.eeX();
    this.Bvp = 0;
    this.BvP = a.aa.eeX();
    this.BvQ = 0;
    AppMethodBeat.o(120998);
  }

  public static ai efS()
  {
    return BvO;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(121000);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BsW);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.Buf);
    if ((this.BsD & 0x4) == 4)
      paramf.a(3, this.Bvo);
    if ((this.BsD & 0x10) == 16)
      paramf.a(4, this.BvP);
    if ((this.BsD & 0x8) == 8)
      paramf.bq(5, this.Bvp);
    if ((this.BsD & 0x20) == 32)
      paramf.bq(6, this.BvQ);
    locala.b(200, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(121000);
  }

  public final boolean ecP()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ecY()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final s<ai> ecy()
  {
    return BsC;
  }

  public final boolean edW()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efT()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efU()
  {
    if ((this.BsD & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean efn()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = true;
    AppMethodBeat.i(120999);
    int i = this.BsG;
    if (i == 1)
      AppMethodBeat.o(120999);
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120999);
        bool = false;
      }
      else if (!edW())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120999);
        bool = false;
      }
      else if ((ecP()) && (!this.Bvo.isInitialized()))
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120999);
        bool = false;
      }
      else if ((efT()) && (!this.BvP.isInitialized()))
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120999);
        bool = false;
      }
      else if (!this.BzI.isInitialized())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120999);
        bool = false;
      }
      else
      {
        this.BsG = ((byte)1);
        AppMethodBeat.o(120999);
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(121001);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(121001);
    while (true)
    {
      return i;
      i = 0;
      if ((this.BsD & 0x1) == 1)
        i = f.bs(1, this.BsW) + 0;
      int j = i;
      if ((this.BsD & 0x2) == 2)
        j = i + f.bs(2, this.Buf);
      i = j;
      if ((this.BsD & 0x4) == 4)
        i = j + f.c(3, this.Bvo);
      j = i;
      if ((this.BsD & 0x10) == 16)
        j = i + f.c(4, this.BvP);
      i = j;
      if ((this.BsD & 0x8) == 8)
        i = j + f.bs(5, this.Bvp);
      j = i;
      if ((this.BsD & 0x20) == 32)
        j = i + f.bs(6, this.BvQ);
      i = j + this.BzI.vq() + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(121001);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ai
 * JD-Core Version:    0.6.2
 */
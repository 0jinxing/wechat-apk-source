package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$ak extends i
  implements a.al
{
  public static s<ak> BsC;
  private static final ak BvR;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BvS;
  public int BvT;
  public a.ak.b BvU;
  public int BvV;
  public int BvW;
  public a.ak.c BvX;

  static
  {
    AppMethodBeat.i(121036);
    BsC = new a.ak.1();
    ak localak = new ak();
    BvR = localak;
    localak.ecA();
    AppMethodBeat.o(121036);
  }

  private a$ak()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$ak(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 62	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 79
    //   6: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 64	a/i/b/a/c/e/a$ak:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 66	a/i/b/a/c/e/a$ak:BsH	I
    //   20: aload_0
    //   21: invokespecial 57	a/i/b/a/c/e/a$ak:ecA	()V
    //   24: invokestatic 83	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 89	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +359 -> 399
    //   43: aload_1
    //   44: invokevirtual 95	a/i/b/a/c/g/e:vc	()I
    //   47: istore 6
    //   49: iload 6
    //   51: lookupswitch	default:+65->116, 0:+84->135, 8:+90->141, 16:+149->200, 24:+195->246, 32:+249->300, 40:+271->322, 48:+293->344
    //   117: aload_1
    //   118: aload 4
    //   120: aload_2
    //   121: iload 6
    //   123: invokevirtual 99	a/i/b/a/c/e/a$ak:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   126: ifne -88 -> 38
    //   129: iconst_1
    //   130: istore 5
    //   132: goto -94 -> 38
    //   135: iconst_1
    //   136: istore 5
    //   138: goto -100 -> 38
    //   141: aload_0
    //   142: aload_0
    //   143: getfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   146: iconst_1
    //   147: ior
    //   148: putfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   151: aload_0
    //   152: aload_1
    //   153: invokevirtual 104	a/i/b/a/c/g/e:vd	()I
    //   156: putfield 106	a/i/b/a/c/e/a$ak:BvS	I
    //   159: goto -121 -> 38
    //   162: astore_1
    //   163: aload_1
    //   164: aload_0
    //   165: putfield 110	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   168: ldc 79
    //   170: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: aload 4
    //   178: invokevirtual 113	a/i/b/a/c/g/f:flush	()V
    //   181: aload_0
    //   182: aload_3
    //   183: invokevirtual 119	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   186: putfield 73	a/i/b/a/c/e/a$ak:BsB	La/i/b/a/c/g/d;
    //   189: aload_0
    //   190: invokevirtual 122	a/i/b/a/c/e/a$ak:eio	()V
    //   193: ldc 79
    //   195: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   198: aload_1
    //   199: athrow
    //   200: aload_0
    //   201: aload_0
    //   202: getfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   205: iconst_2
    //   206: ior
    //   207: putfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   210: aload_0
    //   211: aload_1
    //   212: invokevirtual 104	a/i/b/a/c/g/e:vd	()I
    //   215: putfield 124	a/i/b/a/c/e/a$ak:BvT	I
    //   218: goto -180 -> 38
    //   221: astore_2
    //   222: new 76	a/i/b/a/c/g/k
    //   225: astore_1
    //   226: aload_1
    //   227: aload_2
    //   228: invokevirtual 128	java/io/IOException:getMessage	()Ljava/lang/String;
    //   231: invokespecial 131	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   234: aload_1
    //   235: aload_0
    //   236: putfield 110	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   239: ldc 79
    //   241: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: aload_1
    //   245: athrow
    //   246: aload_1
    //   247: invokevirtual 104	a/i/b/a/c/g/e:vd	()I
    //   250: istore 7
    //   252: iload 7
    //   254: invokestatic 135	a/i/b/a/c/e/a$ak$b:Ud	(I)La/i/b/a/c/e/a$ak$b;
    //   257: astore 8
    //   259: aload 8
    //   261: ifnonnull +20 -> 281
    //   264: aload 4
    //   266: iload 6
    //   268: invokevirtual 138	a/i/b/a/c/g/f:fw	(I)V
    //   271: aload 4
    //   273: iload 7
    //   275: invokevirtual 138	a/i/b/a/c/g/f:fw	(I)V
    //   278: goto -240 -> 38
    //   281: aload_0
    //   282: aload_0
    //   283: getfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   286: iconst_4
    //   287: ior
    //   288: putfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   291: aload_0
    //   292: aload 8
    //   294: putfield 140	a/i/b/a/c/e/a$ak:BvU	La/i/b/a/c/e/a$ak$b;
    //   297: goto -259 -> 38
    //   300: aload_0
    //   301: aload_0
    //   302: getfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   305: bipush 8
    //   307: ior
    //   308: putfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   311: aload_0
    //   312: aload_1
    //   313: invokevirtual 104	a/i/b/a/c/g/e:vd	()I
    //   316: putfield 142	a/i/b/a/c/e/a$ak:BvV	I
    //   319: goto -281 -> 38
    //   322: aload_0
    //   323: aload_0
    //   324: getfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   327: bipush 16
    //   329: ior
    //   330: putfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   333: aload_0
    //   334: aload_1
    //   335: invokevirtual 104	a/i/b/a/c/g/e:vd	()I
    //   338: putfield 144	a/i/b/a/c/e/a$ak:BvW	I
    //   341: goto -303 -> 38
    //   344: aload_1
    //   345: invokevirtual 104	a/i/b/a/c/g/e:vd	()I
    //   348: istore 7
    //   350: iload 7
    //   352: invokestatic 148	a/i/b/a/c/e/a$ak$c:Ue	(I)La/i/b/a/c/e/a$ak$c;
    //   355: astore 8
    //   357: aload 8
    //   359: ifnonnull +20 -> 379
    //   362: aload 4
    //   364: iload 6
    //   366: invokevirtual 138	a/i/b/a/c/g/f:fw	(I)V
    //   369: aload 4
    //   371: iload 7
    //   373: invokevirtual 138	a/i/b/a/c/g/f:fw	(I)V
    //   376: goto -338 -> 38
    //   379: aload_0
    //   380: aload_0
    //   381: getfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   384: bipush 32
    //   386: ior
    //   387: putfield 101	a/i/b/a/c/e/a$ak:BsD	I
    //   390: aload_0
    //   391: aload 8
    //   393: putfield 150	a/i/b/a/c/e/a$ak:BvX	La/i/b/a/c/e/a$ak$c;
    //   396: goto -358 -> 38
    //   399: aload 4
    //   401: invokevirtual 113	a/i/b/a/c/g/f:flush	()V
    //   404: aload_0
    //   405: aload_3
    //   406: invokevirtual 119	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   409: putfield 73	a/i/b/a/c/e/a$ak:BsB	La/i/b/a/c/g/d;
    //   412: aload_0
    //   413: invokevirtual 122	a/i/b/a/c/e/a$ak:eio	()V
    //   416: ldc 79
    //   418: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   421: return
    //   422: astore_1
    //   423: aload_0
    //   424: aload_3
    //   425: invokevirtual 119	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   428: putfield 73	a/i/b/a/c/e/a$ak:BsB	La/i/b/a/c/g/d;
    //   431: goto -19 -> 412
    //   434: astore_1
    //   435: aload_0
    //   436: aload_3
    //   437: invokevirtual 119	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   440: putfield 73	a/i/b/a/c/e/a$ak:BsB	La/i/b/a/c/g/d;
    //   443: ldc 79
    //   445: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   448: aload_1
    //   449: athrow
    //   450: astore_2
    //   451: aload_0
    //   452: aload_3
    //   453: invokevirtual 119	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   456: putfield 73	a/i/b/a/c/e/a$ak:BsB	La/i/b/a/c/g/d;
    //   459: goto -270 -> 189
    //   462: astore_1
    //   463: aload_0
    //   464: aload_3
    //   465: invokevirtual 119	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   468: putfield 73	a/i/b/a/c/e/a$ak:BsB	La/i/b/a/c/g/d;
    //   471: ldc 79
    //   473: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   476: aload_1
    //   477: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   43	49	162	a/i/b/a/c/g/k
    //   116	129	162	a/i/b/a/c/g/k
    //   141	159	162	a/i/b/a/c/g/k
    //   200	218	162	a/i/b/a/c/g/k
    //   246	259	162	a/i/b/a/c/g/k
    //   264	278	162	a/i/b/a/c/g/k
    //   281	297	162	a/i/b/a/c/g/k
    //   300	319	162	a/i/b/a/c/g/k
    //   322	341	162	a/i/b/a/c/g/k
    //   344	357	162	a/i/b/a/c/g/k
    //   362	376	162	a/i/b/a/c/g/k
    //   379	396	162	a/i/b/a/c/g/k
    //   43	49	175	finally
    //   116	129	175	finally
    //   141	159	175	finally
    //   163	175	175	finally
    //   200	218	175	finally
    //   222	246	175	finally
    //   246	259	175	finally
    //   264	278	175	finally
    //   281	297	175	finally
    //   300	319	175	finally
    //   322	341	175	finally
    //   344	357	175	finally
    //   362	376	175	finally
    //   379	396	175	finally
    //   43	49	221	java/io/IOException
    //   116	129	221	java/io/IOException
    //   141	159	221	java/io/IOException
    //   200	218	221	java/io/IOException
    //   246	259	221	java/io/IOException
    //   264	278	221	java/io/IOException
    //   281	297	221	java/io/IOException
    //   300	319	221	java/io/IOException
    //   322	341	221	java/io/IOException
    //   344	357	221	java/io/IOException
    //   362	376	221	java/io/IOException
    //   379	396	221	java/io/IOException
    //   399	404	422	java/io/IOException
    //   399	404	434	finally
    //   176	181	450	java/io/IOException
    //   176	181	462	finally
  }

  private a$ak(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  private void ecA()
  {
    this.BvS = 0;
    this.BvT = 0;
    this.BvU = a.ak.b.BvZ;
    this.BvV = 0;
    this.BvW = 0;
    this.BvX = a.ak.c.Bwc;
  }

  public static ak efY()
  {
    return BvR;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(121032);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BvS);
    if ((this.BsD & 0x2) == 2)
      paramf.bq(2, this.BvT);
    if ((this.BsD & 0x4) == 4)
      paramf.io(3, this.BvU.value);
    if ((this.BsD & 0x8) == 8)
      paramf.bq(4, this.BvV);
    if ((this.BsD & 0x10) == 16)
      paramf.bq(5, this.BvW);
    if ((this.BsD & 0x20) == 32)
      paramf.io(6, this.BvX.value);
    paramf.d(this.BsB);
    AppMethodBeat.o(121032);
  }

  public final s<ak> ecy()
  {
    return BsC;
  }

  public final boolean efZ()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean ega()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean egb()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean egc()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean egd()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ege()
  {
    if ((this.BsD & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
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
    AppMethodBeat.i(121033);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(121033);
    while (true)
    {
      return i;
      int j = 0;
      if ((this.BsD & 0x1) == 1)
        j = f.bs(1, this.BvS) + 0;
      i = j;
      if ((this.BsD & 0x2) == 2)
        i = j + f.bs(2, this.BvT);
      int k = i;
      if ((this.BsD & 0x4) == 4)
        k = i + f.ip(3, this.BvU.value);
      j = k;
      if ((this.BsD & 0x8) == 8)
        j = k + f.bs(4, this.BvV);
      i = j;
      if ((this.BsD & 0x10) == 16)
        i = j + f.bs(5, this.BvW);
      j = i;
      if ((this.BsD & 0x20) == 32)
        j = i + f.ip(6, this.BvX.value);
      i = j + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(121033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ak
 * JD-Core Version:    0.6.2
 */
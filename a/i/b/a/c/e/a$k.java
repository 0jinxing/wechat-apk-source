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

public final class a$k extends i.c<k>
  implements a.l
{
  public static s<k> BsC;
  private static final k Bue;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int Buf;

  static
  {
    AppMethodBeat.i(120600);
    BsC = new a.k.1();
    k localk = new k();
    Bue = localk;
    localk.Buf = 0;
    AppMethodBeat.o(120600);
  }

  private a$k()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$k(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: invokespecial 51	a/i/b/a/c/g/i$c:<init>	()V
    //   6: ldc 68
    //   8: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_0
    //   12: iconst_m1
    //   13: i2b
    //   14: putfield 53	a/i/b/a/c/e/a$k:BsG	B
    //   17: aload_0
    //   18: iconst_m1
    //   19: putfield 55	a/i/b/a/c/e/a$k:BsH	I
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield 46	a/i/b/a/c/e/a$k:Buf	I
    //   27: invokestatic 72	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   30: astore 4
    //   32: aload 4
    //   34: iconst_1
    //   35: invokestatic 78	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   38: astore 5
    //   40: iload_3
    //   41: ifne +125 -> 166
    //   44: aload_1
    //   45: invokevirtual 84	a/i/b/a/c/g/e:vc	()I
    //   48: istore 6
    //   50: iload 6
    //   52: lookupswitch	default:+28->80, 0:+46->98, 8:+51->103
    //   81: aload_1
    //   82: aload 5
    //   84: aload_2
    //   85: iload 6
    //   87: invokevirtual 88	a/i/b/a/c/e/a$k:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   90: ifne -50 -> 40
    //   93: iconst_1
    //   94: istore_3
    //   95: goto -55 -> 40
    //   98: iconst_1
    //   99: istore_3
    //   100: goto -60 -> 40
    //   103: aload_0
    //   104: aload_0
    //   105: getfield 90	a/i/b/a/c/e/a$k:BsD	I
    //   108: iconst_1
    //   109: ior
    //   110: putfield 90	a/i/b/a/c/e/a$k:BsD	I
    //   113: aload_0
    //   114: aload_1
    //   115: invokevirtual 93	a/i/b/a/c/g/e:vd	()I
    //   118: putfield 46	a/i/b/a/c/e/a$k:Buf	I
    //   121: goto -81 -> 40
    //   124: astore_1
    //   125: aload_1
    //   126: aload_0
    //   127: putfield 97	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   130: ldc 68
    //   132: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: aload_1
    //   136: athrow
    //   137: astore_1
    //   138: aload 5
    //   140: invokevirtual 100	a/i/b/a/c/g/f:flush	()V
    //   143: aload_0
    //   144: aload 4
    //   146: invokevirtual 106	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   149: putfield 62	a/i/b/a/c/e/a$k:BsB	La/i/b/a/c/g/d;
    //   152: aload_0
    //   153: getfield 110	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   156: invokevirtual 115	a/i/b/a/c/g/h:eii	()V
    //   159: ldc 68
    //   161: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: aload_1
    //   165: athrow
    //   166: aload 5
    //   168: invokevirtual 100	a/i/b/a/c/g/f:flush	()V
    //   171: aload_0
    //   172: aload 4
    //   174: invokevirtual 106	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   177: putfield 62	a/i/b/a/c/e/a$k:BsB	La/i/b/a/c/g/d;
    //   180: aload_0
    //   181: getfield 110	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   184: invokevirtual 115	a/i/b/a/c/g/h:eii	()V
    //   187: ldc 68
    //   189: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: return
    //   193: astore_1
    //   194: aload_0
    //   195: aload 4
    //   197: invokevirtual 106	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   200: putfield 62	a/i/b/a/c/e/a$k:BsB	La/i/b/a/c/g/d;
    //   203: goto -23 -> 180
    //   206: astore_1
    //   207: aload_0
    //   208: aload 4
    //   210: invokevirtual 106	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   213: putfield 62	a/i/b/a/c/e/a$k:BsB	La/i/b/a/c/g/d;
    //   216: ldc 68
    //   218: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: aload_1
    //   222: athrow
    //   223: astore_1
    //   224: new 65	a/i/b/a/c/g/k
    //   227: astore_2
    //   228: aload_2
    //   229: aload_1
    //   230: invokevirtual 119	java/io/IOException:getMessage	()Ljava/lang/String;
    //   233: invokespecial 122	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   236: aload_2
    //   237: aload_0
    //   238: putfield 97	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   241: ldc 68
    //   243: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   246: aload_2
    //   247: athrow
    //   248: astore_2
    //   249: aload_0
    //   250: aload 4
    //   252: invokevirtual 106	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   255: putfield 62	a/i/b/a/c/e/a$k:BsB	La/i/b/a/c/g/d;
    //   258: goto -106 -> 152
    //   261: astore_1
    //   262: aload_0
    //   263: aload 4
    //   265: invokevirtual 106	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   268: putfield 62	a/i/b/a/c/e/a$k:BsB	La/i/b/a/c/g/d;
    //   271: ldc 68
    //   273: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   276: aload_1
    //   277: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   44	50	124	a/i/b/a/c/g/k
    //   80	93	124	a/i/b/a/c/g/k
    //   103	121	124	a/i/b/a/c/g/k
    //   44	50	137	finally
    //   80	93	137	finally
    //   103	121	137	finally
    //   125	137	137	finally
    //   224	248	137	finally
    //   166	171	193	java/io/IOException
    //   166	171	206	finally
    //   44	50	223	java/io/IOException
    //   80	93	223	java/io/IOException
    //   103	121	223	java/io/IOException
    //   138	143	248	java/io/IOException
    //   138	143	261	finally
  }

  private a$k(i.b<k, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  public static k edV()
  {
    return Bue;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120596);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.Buf);
    locala.b(200, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120596);
  }

  public final s<k> ecy()
  {
    return BsC;
  }

  public final boolean edW()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = true;
    AppMethodBeat.i(120595);
    int i = this.BsG;
    if (i == 1)
      AppMethodBeat.o(120595);
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120595);
        bool = false;
      }
      else if (!this.BzI.isInitialized())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120595);
        bool = false;
      }
      else
      {
        this.BsG = ((byte)1);
        AppMethodBeat.o(120595);
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120597);
    int i = this.BsH;
    if (i != -1)
      AppMethodBeat.o(120597);
    while (true)
    {
      return i;
      i = 0;
      if ((this.BsD & 0x1) == 1)
        i = f.bs(1, this.Buf) + 0;
      i = i + this.BzI.vq() + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120597);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.k
 * JD-Core Version:    0.6.2
 */
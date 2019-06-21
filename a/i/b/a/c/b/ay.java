package a.i.b.a.c.b;

import a.a.aj;
import a.i.b.a.c.b.c.af;
import a.i.b.a.c.i.d;
import a.i.b.a.c.m.g.a;
import a.i.b.a.c.n.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

public final class ay
{
  public static final az BeW;
  public static final az BeX;
  public static final az BeY;
  public static final az BeZ;
  public static final az Bfa;
  public static final az Bfb;
  public static final az Bfc;
  public static final az Bfd;
  public static final az Bfe;
  public static final Set<az> Bff;
  private static final Map<az, Integer> Bfg;
  public static final az Bfh;
  private static final a.i.b.a.c.i.e.a.e Bfi;
  public static final a.i.b.a.c.i.e.a.e Bfj;

  @Deprecated
  public static final a.i.b.a.c.i.e.a.e Bfk;
  private static final a.i.b.a.c.m.g Bfl;

  static
  {
    // Byte code:
    //   0: ldc 33
    //   2: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 41	a/i/b/a/c/b/ay$1
    //   8: dup
    //   9: ldc 43
    //   11: invokespecial 47	a/i/b/a/c/b/ay$1:<init>	(Ljava/lang/String;)V
    //   14: putstatic 49	a/i/b/a/c/b/ay:BeW	La/i/b/a/c/b/az;
    //   17: new 6	a/i/b/a/c/b/ay$5
    //   20: dup
    //   21: ldc 51
    //   23: invokespecial 52	a/i/b/a/c/b/ay$5:<init>	(Ljava/lang/String;)V
    //   26: putstatic 54	a/i/b/a/c/b/ay:BeX	La/i/b/a/c/b/az;
    //   29: new 56	a/i/b/a/c/b/ay$6
    //   32: dup
    //   33: ldc 58
    //   35: invokespecial 59	a/i/b/a/c/b/ay$6:<init>	(Ljava/lang/String;)V
    //   38: putstatic 61	a/i/b/a/c/b/ay:BeY	La/i/b/a/c/b/az;
    //   41: new 63	a/i/b/a/c/b/ay$7
    //   44: dup
    //   45: ldc 65
    //   47: invokespecial 66	a/i/b/a/c/b/ay$7:<init>	(Ljava/lang/String;)V
    //   50: putstatic 68	a/i/b/a/c/b/ay:BeZ	La/i/b/a/c/b/az;
    //   53: new 70	a/i/b/a/c/b/ay$8
    //   56: dup
    //   57: ldc 72
    //   59: invokespecial 73	a/i/b/a/c/b/ay$8:<init>	(Ljava/lang/String;)V
    //   62: putstatic 75	a/i/b/a/c/b/ay:Bfa	La/i/b/a/c/b/az;
    //   65: new 77	a/i/b/a/c/b/ay$9
    //   68: dup
    //   69: ldc 79
    //   71: invokespecial 80	a/i/b/a/c/b/ay$9:<init>	(Ljava/lang/String;)V
    //   74: putstatic 82	a/i/b/a/c/b/ay:Bfb	La/i/b/a/c/b/az;
    //   77: new 84	a/i/b/a/c/b/ay$10
    //   80: dup
    //   81: ldc 86
    //   83: invokespecial 87	a/i/b/a/c/b/ay$10:<init>	(Ljava/lang/String;)V
    //   86: putstatic 89	a/i/b/a/c/b/ay:Bfc	La/i/b/a/c/b/az;
    //   89: new 91	a/i/b/a/c/b/ay$11
    //   92: dup
    //   93: ldc 93
    //   95: invokespecial 94	a/i/b/a/c/b/ay$11:<init>	(Ljava/lang/String;)V
    //   98: putstatic 96	a/i/b/a/c/b/ay:Bfd	La/i/b/a/c/b/az;
    //   101: new 98	a/i/b/a/c/b/ay$12
    //   104: dup
    //   105: ldc 100
    //   107: invokespecial 101	a/i/b/a/c/b/ay$12:<init>	(Ljava/lang/String;)V
    //   110: putstatic 103	a/i/b/a/c/b/ay:Bfe	La/i/b/a/c/b/az;
    //   113: iconst_4
    //   114: anewarray 105	a/i/b/a/c/b/az
    //   117: dup
    //   118: iconst_0
    //   119: getstatic 49	a/i/b/a/c/b/ay:BeW	La/i/b/a/c/b/az;
    //   122: aastore
    //   123: dup
    //   124: iconst_1
    //   125: getstatic 54	a/i/b/a/c/b/ay:BeX	La/i/b/a/c/b/az;
    //   128: aastore
    //   129: dup
    //   130: iconst_2
    //   131: getstatic 68	a/i/b/a/c/b/ay:BeZ	La/i/b/a/c/b/az;
    //   134: aastore
    //   135: dup
    //   136: iconst_3
    //   137: getstatic 82	a/i/b/a/c/b/ay:Bfb	La/i/b/a/c/b/az;
    //   140: aastore
    //   141: invokestatic 111	a/a/aj:setOf	([Ljava/lang/Object;)Ljava/util/Set;
    //   144: invokestatic 117	java/util/Collections:unmodifiableSet	(Ljava/util/Set;)Ljava/util/Set;
    //   147: putstatic 119	a/i/b/a/c/b/ay:Bff	Ljava/util/Set;
    //   150: iconst_4
    //   151: invokestatic 125	a/i/b/a/c/n/a:UP	(I)Ljava/util/HashMap;
    //   154: astore_0
    //   155: aload_0
    //   156: getstatic 54	a/i/b/a/c/b/ay:BeX	La/i/b/a/c/b/az;
    //   159: iconst_0
    //   160: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   163: invokeinterface 137 3 0
    //   168: pop
    //   169: aload_0
    //   170: getstatic 49	a/i/b/a/c/b/ay:BeW	La/i/b/a/c/b/az;
    //   173: iconst_0
    //   174: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   177: invokeinterface 137 3 0
    //   182: pop
    //   183: aload_0
    //   184: getstatic 68	a/i/b/a/c/b/ay:BeZ	La/i/b/a/c/b/az;
    //   187: iconst_1
    //   188: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   191: invokeinterface 137 3 0
    //   196: pop
    //   197: aload_0
    //   198: getstatic 61	a/i/b/a/c/b/ay:BeY	La/i/b/a/c/b/az;
    //   201: iconst_1
    //   202: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   205: invokeinterface 137 3 0
    //   210: pop
    //   211: aload_0
    //   212: getstatic 75	a/i/b/a/c/b/ay:Bfa	La/i/b/a/c/b/az;
    //   215: iconst_2
    //   216: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   219: invokeinterface 137 3 0
    //   224: pop
    //   225: aload_0
    //   226: invokestatic 141	java/util/Collections:unmodifiableMap	(Ljava/util/Map;)Ljava/util/Map;
    //   229: putstatic 143	a/i/b/a/c/b/ay:Bfg	Ljava/util/Map;
    //   232: getstatic 75	a/i/b/a/c/b/ay:Bfa	La/i/b/a/c/b/az;
    //   235: putstatic 145	a/i/b/a/c/b/ay:Bfh	La/i/b/a/c/b/az;
    //   238: new 147	a/i/b/a/c/b/ay$2
    //   241: dup
    //   242: invokespecial 149	a/i/b/a/c/b/ay$2:<init>	()V
    //   245: putstatic 151	a/i/b/a/c/b/ay:Bfi	La/i/b/a/c/i/e/a/e;
    //   248: new 153	a/i/b/a/c/b/ay$3
    //   251: dup
    //   252: invokespecial 154	a/i/b/a/c/b/ay$3:<init>	()V
    //   255: putstatic 156	a/i/b/a/c/b/ay:Bfj	La/i/b/a/c/i/e/a/e;
    //   258: new 158	a/i/b/a/c/b/ay$4
    //   261: dup
    //   262: invokespecial 159	a/i/b/a/c/b/ay$4:<init>	()V
    //   265: putstatic 161	a/i/b/a/c/b/ay:Bfk	La/i/b/a/c/i/e/a/e;
    //   268: ldc 163
    //   270: ldc 163
    //   272: invokevirtual 169	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   275: invokestatic 175	java/util/ServiceLoader:load	(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;
    //   278: invokevirtual 179	java/util/ServiceLoader:iterator	()Ljava/util/Iterator;
    //   281: astore_0
    //   282: aload_0
    //   283: invokeinterface 185 1 0
    //   288: ifeq +23 -> 311
    //   291: aload_0
    //   292: invokeinterface 189 1 0
    //   297: checkcast 163	a/i/b/a/c/m/g
    //   300: astore_0
    //   301: aload_0
    //   302: putstatic 191	a/i/b/a/c/b/ay:Bfl	La/i/b/a/c/m/g;
    //   305: ldc 33
    //   307: invokestatic 194	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: return
    //   311: getstatic 200	a/i/b/a/c/m/g$a:BLF	La/i/b/a/c/m/g$a;
    //   314: astore_0
    //   315: goto -14 -> 301
  }

  private static p a(a.i.b.a.c.i.e.a.e parame, p paramp, l paraml)
  {
    AppMethodBeat.i(119312);
    p localp = (p)paramp.dZd();
    if ((localp != null) && (localp.dYf() != Bfb))
      if (!localp.dYf().b(parame, localp, paraml))
        AppMethodBeat.o(119312);
    while (true)
    {
      return localp;
      localp = (p)d.a(localp, p.class);
      break;
      if ((paramp instanceof af))
      {
        localp = a(parame, ((af)paramp).eaL(), paraml);
        if (localp != null)
          AppMethodBeat.o(119312);
      }
      else
      {
        localp = null;
        AppMethodBeat.o(119312);
      }
    }
  }

  static Integer a(az paramaz1, az paramaz2)
  {
    AppMethodBeat.i(119313);
    if (paramaz1 == paramaz2)
    {
      paramaz1 = Integer.valueOf(0);
      AppMethodBeat.o(119313);
    }
    while (true)
    {
      return paramaz1;
      paramaz1 = (Integer)Bfg.get(paramaz1);
      paramaz2 = (Integer)Bfg.get(paramaz2);
      if ((paramaz1 == null) || (paramaz2 == null) || (paramaz1.equals(paramaz2)))
      {
        paramaz1 = null;
        AppMethodBeat.o(119313);
      }
      else
      {
        paramaz1 = Integer.valueOf(paramaz1.intValue() - paramaz2.intValue());
        AppMethodBeat.o(119313);
      }
    }
  }

  public static boolean a(l paraml1, l paraml2)
  {
    AppMethodBeat.i(119311);
    paraml2 = d.C(paraml2);
    boolean bool;
    if (paraml2 != an.BeS)
    {
      bool = paraml2.equals(d.C(paraml1));
      AppMethodBeat.o(119311);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119311);
    }
  }

  public static boolean a(p paramp, l paraml)
  {
    AppMethodBeat.i(119310);
    boolean bool;
    if (a(Bfj, paramp, paraml) == null)
    {
      bool = true;
      AppMethodBeat.o(119310);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119310);
    }
  }

  public static Integer b(az paramaz1, az paramaz2)
  {
    AppMethodBeat.i(119314);
    Integer localInteger = paramaz1.c(paramaz2);
    if (localInteger != null)
    {
      AppMethodBeat.o(119314);
      paramaz1 = localInteger;
    }
    while (true)
    {
      return paramaz1;
      paramaz1 = paramaz2.c(paramaz1);
      if (paramaz1 != null)
      {
        paramaz1 = Integer.valueOf(-paramaz1.intValue());
        AppMethodBeat.o(119314);
      }
      else
      {
        paramaz1 = null;
        AppMethodBeat.o(119314);
      }
    }
  }

  public static boolean b(az paramaz)
  {
    if ((paramaz == BeW) || (paramaz == BeX));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.ay
 * JD-Core Version:    0.6.2
 */
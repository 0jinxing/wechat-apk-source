package com.tencent.mm.aw;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.g.a.kd.b;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.al;

public final class a
{
  public static final void KX()
  {
    AppMethodBeat.i(137241);
    al.d(new a.1());
    AppMethodBeat.o(137241);
  }

  public static final void KY()
  {
    AppMethodBeat.i(137242);
    al.d(new a.2());
    AppMethodBeat.o(137242);
  }

  public static final void a(e parame)
  {
    AppMethodBeat.i(137245);
    al.d(new a.5(parame));
    AppMethodBeat.o(137245);
  }

  public static final void aic()
  {
    AppMethodBeat.i(137243);
    al.d(new a.3());
    AppMethodBeat.o(137243);
  }

  public static final void aid()
  {
    AppMethodBeat.i(137244);
    al.d(new a.4());
    AppMethodBeat.o(137244);
  }

  public static boolean aie()
  {
    AppMethodBeat.i(137246);
    kd localkd = new kd();
    localkd.cFz.action = -3;
    com.tencent.mm.sdk.b.a.xxA.m(localkd);
    boolean bool = localkd.cFA.csN;
    AppMethodBeat.o(137246);
    return bool;
  }

  public static boolean aif()
  {
    AppMethodBeat.i(137247);
    kd localkd = new kd();
    localkd.cFz.action = 10;
    com.tencent.mm.sdk.b.a.xxA.m(localkd);
    boolean bool = localkd.cFA.csN;
    AppMethodBeat.o(137247);
    return bool;
  }

  public static boolean aig()
  {
    AppMethodBeat.i(137248);
    kd localkd = new kd();
    localkd.cFz.action = 9;
    com.tencent.mm.sdk.b.a.xxA.m(localkd);
    boolean bool = localkd.cFA.csN;
    AppMethodBeat.o(137248);
    return bool;
  }

  public static e aih()
  {
    AppMethodBeat.i(137249);
    Object localObject = new kd();
    ((kd)localObject).cFz.action = -2;
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    localObject = ((kd)localObject).cFA.cFB;
    AppMethodBeat.o(137249);
    return localObject;
  }

  public static c aii()
  {
    AppMethodBeat.i(137253);
    Object localObject = new kd();
    ((kd)localObject).cFz.action = 8;
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    localObject = ((kd)localObject).cFA.cFF;
    AppMethodBeat.o(137253);
    return localObject;
  }

  public static void b(e parame)
  {
    AppMethodBeat.i(137250);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(137237);
        kd localkd = new kd();
        localkd.cFz.action = 0;
        localkd.cFz.cFB = this.fJL;
        com.tencent.mm.sdk.b.a.xxA.m(localkd);
        AppMethodBeat.o(137237);
      }
    });
    AppMethodBeat.o(137250);
  }

  public static void c(e parame)
  {
    AppMethodBeat.i(137251);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(137239);
        kd localkd = new kd();
        localkd.cFz.action = 3;
        localkd.cFz.cFB = this.fJL;
        com.tencent.mm.sdk.b.a.xxA.m(localkd);
        AppMethodBeat.o(137239);
      }
    });
    AppMethodBeat.o(137251);
  }

  public static boolean d(e parame)
  {
    boolean bool = false;
    if (parame == null);
    while (true)
    {
      return bool;
      switch (parame.fJS)
      {
      default:
        break;
      case 1:
      case 8:
      case 9:
        bool = true;
      }
    }
  }

  public static boolean lP(int paramInt)
  {
    AppMethodBeat.i(137252);
    kd localkd = new kd();
    localkd.cFz.action = 7;
    localkd.cFz.position = paramInt;
    com.tencent.mm.sdk.b.a.xxA.m(localkd);
    boolean bool = localkd.cFA.csN;
    AppMethodBeat.o(137252);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aw.a
 * JD-Core Version:    0.6.2
 */
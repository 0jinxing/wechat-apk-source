package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.f.a;
import com.bumptech.glide.f.b;
import com.bumptech.glide.f.d;
import com.bumptech.glide.f.h;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i<TranscodeType>
  implements Cloneable
{
  protected static final com.bumptech.glide.f.e awW;
  private final j awX;
  private final Class<TranscodeType> awY;
  protected com.bumptech.glide.f.e awZ;
  private final c awc;
  private final e awi;
  private final com.bumptech.glide.f.e awv;
  private k<?, ? super TranscodeType> axa;
  private Object axb;
  private d<TranscodeType> axc;
  private i<TranscodeType> axd;
  private i<TranscodeType> axe;
  private Float axf;
  private boolean axg;
  private boolean axh;
  private boolean axi;
  private final Context context;

  static
  {
    AppMethodBeat.i(91648);
    awW = new com.bumptech.glide.f.e().b(com.bumptech.glide.c.b.i.aBk).b(g.awK).nQ();
    AppMethodBeat.o(91648);
  }

  protected i(c paramc, j paramj, Class<TranscodeType> paramClass, Context paramContext)
  {
    AppMethodBeat.i(91638);
    this.axg = true;
    this.awc = paramc;
    this.awX = paramj;
    this.awY = paramClass;
    this.awv = paramj.awZ;
    this.context = paramContext;
    this.axa = paramj.k(paramClass);
    this.awZ = this.awv;
    this.awi = paramc.awi;
    AppMethodBeat.o(91638);
  }

  private b a(com.bumptech.glide.f.a.e<TranscodeType> parame, d<TranscodeType> paramd, com.bumptech.glide.f.c paramc, k<?, ? super TranscodeType> paramk, g paramg, int paramInt1, int paramInt2, com.bumptech.glide.f.e parame1)
  {
    AppMethodBeat.i(91644);
    Object localObject1;
    if (this.axe != null)
      localObject1 = new a(paramc);
    Object localObject2;
    for (paramc = (com.bumptech.glide.f.c)localObject1; ; paramc = localObject2)
    {
      paramk = b(parame, paramd, (com.bumptech.glide.f.c)localObject1, paramk, paramg, paramInt1, paramInt2, parame1);
      if (paramc == null)
      {
        AppMethodBeat.o(91644);
        paramc = paramk;
      }
      while (true)
      {
        return paramc;
        int i = this.axe.awZ.aHp;
        int j = this.axe.awZ.aHo;
        int k = i;
        int m = j;
        if (com.bumptech.glide.h.j.aW(paramInt1, paramInt2))
        {
          k = i;
          m = j;
          if (!this.axe.awZ.nU())
          {
            k = parame1.aHp;
            m = parame1.aHo;
          }
        }
        paramc.a(paramk, this.axe.a(parame, paramd, paramc, this.axe.axa, this.axe.awZ.aAk, k, m, this.axe.awZ));
        AppMethodBeat.o(91644);
      }
      localObject2 = null;
      localObject1 = paramc;
    }
  }

  private b a(com.bumptech.glide.f.a.e<TranscodeType> parame, d<TranscodeType> paramd, com.bumptech.glide.f.e parame1, com.bumptech.glide.f.c paramc, k<?, ? super TranscodeType> paramk, g paramg, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91646);
    parame = com.bumptech.glide.f.g.a(this.context, this.awi, this.axb, this.awY, parame1, paramInt1, paramInt2, paramg, parame, paramd, this.axc, paramc, this.awi.awe, paramk.axu);
    AppMethodBeat.o(91646);
    return parame;
  }

  private g a(g paramg)
  {
    AppMethodBeat.i(91643);
    switch (i.1.axj[paramg.ordinal()])
    {
    default:
      paramg = new IllegalArgumentException("unknown priority: " + this.awZ.aAk);
      AppMethodBeat.o(91643);
      throw paramg;
    case 1:
      paramg = g.awJ;
      AppMethodBeat.o(91643);
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramg;
      paramg = g.awI;
      AppMethodBeat.o(91643);
      continue;
      paramg = g.awH;
      AppMethodBeat.o(91643);
    }
  }

  private b b(com.bumptech.glide.f.a.e<TranscodeType> parame, d<TranscodeType> paramd, com.bumptech.glide.f.c paramc, k<?, ? super TranscodeType> paramk, g paramg, int paramInt1, int paramInt2, com.bumptech.glide.f.e parame1)
  {
    AppMethodBeat.i(91645);
    Object localObject;
    if (this.axd != null)
    {
      if (this.axi)
      {
        parame = new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        AppMethodBeat.o(91645);
        throw parame;
      }
      localObject = this.axd.axa;
      if (!this.axd.axg)
        break label346;
      localObject = paramk;
    }
    label343: label346: 
    while (true)
    {
      g localg;
      int i;
      int j;
      if (this.axd.awZ.nV())
      {
        localg = this.axd.awZ.aAk;
        i = this.axd.awZ.aHp;
        j = this.axd.awZ.aHo;
        if ((!com.bumptech.glide.h.j.aW(paramInt1, paramInt2)) || (this.axd.awZ.nU()))
          break label343;
        i = parame1.aHp;
        j = parame1.aHo;
      }
      while (true)
      {
        paramc = new h(paramc);
        paramk = a(parame, paramd, parame1, paramc, paramk, paramg, paramInt1, paramInt2);
        this.axi = true;
        parame = this.axd.a(parame, paramd, paramc, (k)localObject, localg, i, j, this.axd.awZ);
        this.axi = false;
        paramc.a(paramk, parame);
        AppMethodBeat.o(91645);
        parame = paramc;
        while (true)
        {
          return parame;
          localg = a(paramg);
          break;
          if (this.axf != null)
          {
            paramc = new h(paramc);
            paramc.a(a(parame, paramd, parame1, paramc, paramk, paramg, paramInt1, paramInt2), a(parame, paramd, parame1.nR().M(this.axf.floatValue()), paramc, paramk, a(paramg), paramInt1, paramInt2));
            AppMethodBeat.o(91645);
            parame = paramc;
          }
          else
          {
            parame = a(parame, paramd, parame1, paramc, paramk, paramg, paramInt1, paramInt2);
            AppMethodBeat.o(91645);
          }
        }
      }
    }
  }

  private com.bumptech.glide.f.e lG()
  {
    AppMethodBeat.i(91640);
    com.bumptech.glide.f.e locale;
    if (this.awv == this.awZ)
    {
      locale = this.awZ.nR();
      AppMethodBeat.o(91640);
    }
    while (true)
    {
      return locale;
      locale = this.awZ;
      AppMethodBeat.o(91640);
    }
  }

  private i<TranscodeType> lH()
  {
    AppMethodBeat.i(91641);
    try
    {
      i locali = (i)super.clone();
      locali.awZ = locali.awZ.nR();
      locali.axa = locali.axa.lJ();
      AppMethodBeat.o(91641);
      return locali;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      RuntimeException localRuntimeException = new RuntimeException(localCloneNotSupportedException);
      AppMethodBeat.o(91641);
      throw localRuntimeException;
    }
  }

  public final i<TranscodeType> Q(Object paramObject)
  {
    this.axb = paramObject;
    this.axh = true;
    return this;
  }

  public final i<TranscodeType> a(com.bumptech.glide.f.e parame)
  {
    AppMethodBeat.i(91639);
    com.bumptech.glide.h.i.d(parame, "Argument must not be null");
    for (com.bumptech.glide.f.e locale = lG(); locale.aHu; locale = locale.nR());
    if (com.bumptech.glide.f.e.aT(parame.aHi, 2))
      locale.aHj = parame.aHj;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 262144))
      locale.aHv = parame.aHv;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 1048576))
      locale.aBK = parame.aBK;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 4))
      locale.aAl = parame.aAl;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 8))
      locale.aAk = parame.aAk;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 16))
      locale.aHk = parame.aHk;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 32))
      locale.aHl = parame.aHl;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 64))
      locale.aHm = parame.aHm;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 128))
      locale.aHn = parame.aHn;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 256))
      locale.azQ = parame.azQ;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 512))
    {
      locale.aHp = parame.aHp;
      locale.aHo = parame.aHo;
    }
    if (com.bumptech.glide.f.e.aT(parame.aHi, 1024))
      locale.aAb = parame.aAb;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 4096))
      locale.aAf = parame.aAf;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 8192))
      locale.aHr = parame.aHr;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 16384))
      locale.aHs = parame.aHs;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 32768))
      locale.aHt = parame.aHt;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 65536))
      locale.aHq = parame.aHq;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 131072))
      locale.aAm = parame.aAm;
    if (com.bumptech.glide.f.e.aT(parame.aHi, 2048))
    {
      locale.aAh.putAll(parame.aAh);
      locale.aAn = parame.aAn;
    }
    if (com.bumptech.glide.f.e.aT(parame.aHi, 524288))
      locale.aAz = parame.aAz;
    if (!locale.aHq)
    {
      locale.aAh.clear();
      locale.aHi &= -2049;
      locale.aAm = false;
      locale.aHi &= -131073;
      locale.aAn = true;
    }
    locale.aHi |= parame.aHi;
    locale.aAd.a(parame.aAd);
    this.awZ = locale.nT();
    AppMethodBeat.o(91639);
    return this;
  }

  public final <Y extends com.bumptech.glide.f.a.e<TranscodeType>> Y b(Y paramY)
  {
    AppMethodBeat.i(91642);
    Object localObject1 = lG();
    com.bumptech.glide.h.j.om();
    com.bumptech.glide.h.i.d(paramY, "Argument must not be null");
    if (!this.axh)
    {
      paramY = new IllegalArgumentException("You must call #load() before calling #into()");
      AppMethodBeat.o(91642);
      throw paramY;
    }
    Object localObject2 = ((com.bumptech.glide.f.e)localObject1).nS();
    localObject1 = a(paramY, null, null, this.axa, ((com.bumptech.glide.f.e)localObject2).aAk, ((com.bumptech.glide.f.e)localObject2).aHp, ((com.bumptech.glide.f.e)localObject2).aHo, (com.bumptech.glide.f.e)localObject2);
    b localb = paramY.og();
    if (((b)localObject1).a(localb))
    {
      if ((!((com.bumptech.glide.f.e)localObject2).azQ) && (localb.isComplete()));
      for (int i = 1; i == 0; i = 0)
      {
        ((b)localObject1).recycle();
        if (!((b)com.bumptech.glide.h.i.d(localb, "Argument must not be null")).isRunning())
          localb.begin();
        AppMethodBeat.o(91642);
        return paramY;
      }
    }
    this.awX.c(paramY);
    paramY.h((b)localObject1);
    localObject2 = this.awX;
    ((j)localObject2).axp.aGW.add(paramY);
    localObject2 = ((j)localObject2).axn;
    ((n)localObject2).aGR.add(localObject1);
    if (!((n)localObject2).isPaused)
      ((b)localObject1).begin();
    while (true)
    {
      AppMethodBeat.o(91642);
      break;
      Log.isLoggable("RequestTracker", 2);
      ((n)localObject2).aGS.add(localObject1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.i
 * JD-Core Version:    0.6.2
 */
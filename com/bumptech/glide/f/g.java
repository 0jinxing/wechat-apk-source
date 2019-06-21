package com.bumptech.glide.f;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.f.k.a;
import android.util.Log;
import com.bumptech.glide.c.b.j.d;
import com.bumptech.glide.c.b.k;
import com.bumptech.glide.c.b.l;
import com.bumptech.glide.c.b.p;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.h.a.a.c;
import com.bumptech.glide.h.a.b.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class g<R>
  implements com.bumptech.glide.f.a.d, b, f, a.c
{
  private static final k.a<g<?>> aCd;
  private static final boolean aHx;
  private com.bumptech.glide.g aAk;
  private final com.bumptech.glide.h.a.b aAq;
  private com.bumptech.glide.f.a.e<R> aHA;
  private com.bumptech.glide.f.b.c<? super R> aHB;
  private j.d aHC;
  private g.a aHD;
  private Drawable aHE;
  private Drawable aHm;
  private int aHo;
  private int aHp;
  private Drawable aHr;
  private boolean aHw;
  private d<R> aHy;
  private c aHz;
  private Class<R> awY;
  private e awZ;
  private com.bumptech.glide.c.b.j awe;
  private com.bumptech.glide.e awi;
  private Object axb;
  private d<R> axc;
  private u<R> azR;
  private Context context;
  private int height;
  private long startTime;
  private final String tag;
  private int width;

  static
  {
    AppMethodBeat.i(92517);
    aCd = com.bumptech.glide.h.a.a.a(new g.1());
    aHx = Log.isLoggable("Request", 2);
    AppMethodBeat.o(92517);
  }

  g()
  {
    AppMethodBeat.i(92492);
    if (aHx);
    for (String str = String.valueOf(super.hashCode()); ; str = null)
    {
      this.tag = str;
      this.aAq = new b.a();
      AppMethodBeat.o(92492);
      return;
    }
  }

  public static <R> g<R> a(Context paramContext, com.bumptech.glide.e parame, Object paramObject, Class<R> paramClass, e parame1, int paramInt1, int paramInt2, com.bumptech.glide.g paramg, com.bumptech.glide.f.a.e<R> parame2, d<R> paramd1, d<R> paramd2, c paramc, com.bumptech.glide.c.b.j paramj, com.bumptech.glide.f.b.c<? super R> paramc1)
  {
    AppMethodBeat.i(92491);
    g localg1 = (g)aCd.aA();
    g localg2 = localg1;
    if (localg1 == null)
      localg2 = new g();
    localg2.context = paramContext;
    localg2.awi = parame;
    localg2.axb = paramObject;
    localg2.awY = paramClass;
    localg2.awZ = parame1;
    localg2.aHp = paramInt1;
    localg2.aHo = paramInt2;
    localg2.aAk = paramg;
    localg2.aHA = parame2;
    localg2.aHy = paramd1;
    localg2.axc = paramd2;
    localg2.aHz = paramc;
    localg2.awe = paramj;
    localg2.aHB = paramc1;
    localg2.aHD = g.a.aHF;
    AppMethodBeat.o(92491);
    return localg2;
  }

  private void a(p paramp, int paramInt)
  {
    AppMethodBeat.i(92514);
    this.aAq.oq();
    int i = this.awi.awu;
    if (i <= paramInt)
    {
      new StringBuilder("Load failed for ").append(this.axb).append(" with size [").append(this.width).append("x").append(this.height).append("]");
      if (i <= 4)
        paramp.mM();
    }
    this.aHC = null;
    this.aHD = g.a.aHJ;
    this.aHw = true;
    try
    {
      if (this.axc != null)
      {
        paramp = this.axc;
        oc();
        if (paramp.nN());
      }
      else if (this.aHy != null)
      {
        paramp = this.aHy;
        oc();
        if (paramp.nN());
      }
      else
      {
        nZ();
      }
      this.aHw = false;
      oe();
      AppMethodBeat.o(92514);
      return;
    }
    finally
    {
      this.aHw = false;
      AppMethodBeat.o(92514);
    }
    throw paramp;
  }

  private void a(u<R> paramu, R paramR, com.bumptech.glide.c.a parama)
  {
    AppMethodBeat.i(92512);
    oc();
    this.aHD = g.a.aHI;
    this.azR = paramu;
    if (this.awi.awu <= 3)
      new StringBuilder("Finished loading ").append(paramR.getClass().getSimpleName()).append(" from ").append(parama).append(" for ").append(this.axb).append(" with size [").append(this.width).append("x").append(this.height).append("] in ").append(com.bumptech.glide.h.e.q(this.startTime)).append(" ms");
    this.aHw = true;
    try
    {
      if (((this.axc == null) || (!this.axc.nO())) && ((this.aHy == null) || (!this.aHy.nO())))
      {
        this.aHB.oi();
        this.aHA.aa(paramR);
      }
      this.aHw = false;
      od();
      AppMethodBeat.o(92512);
      return;
    }
    finally
    {
      this.aHw = false;
      AppMethodBeat.o(92512);
    }
    throw paramu;
  }

  private void ae(String paramString)
  {
    AppMethodBeat.i(92516);
    new StringBuilder().append(paramString).append(" this: ").append(this.tag);
    AppMethodBeat.o(92516);
  }

  private Drawable dk(int paramInt)
  {
    AppMethodBeat.i(92502);
    if (this.awZ.aHt != null);
    for (Object localObject = this.awZ.aHt; ; localObject = this.context.getTheme())
    {
      localObject = com.bumptech.glide.c.d.c.a.a(this.awi, paramInt, (Resources.Theme)localObject);
      AppMethodBeat.o(92502);
      return localObject;
    }
  }

  private void f(u<?> paramu)
  {
    AppMethodBeat.i(92498);
    com.bumptech.glide.c.b.j.b(paramu);
    this.azR = null;
    AppMethodBeat.o(92498);
  }

  private static int g(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(92505);
    if (paramInt == -2147483648)
      AppMethodBeat.o(92505);
    while (true)
    {
      return paramInt;
      paramInt = Math.round(paramInt * paramFloat);
      AppMethodBeat.o(92505);
    }
  }

  private void nW()
  {
    AppMethodBeat.i(92495);
    if (this.aHw)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
      AppMethodBeat.o(92495);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(92495);
  }

  private Drawable nX()
  {
    AppMethodBeat.i(92500);
    if (this.aHm == null)
    {
      this.aHm = this.awZ.aHm;
      if ((this.aHm == null) && (this.awZ.aHn > 0))
        this.aHm = dk(this.awZ.aHn);
    }
    Drawable localDrawable = this.aHm;
    AppMethodBeat.o(92500);
    return localDrawable;
  }

  private Drawable nY()
  {
    AppMethodBeat.i(92501);
    if (this.aHr == null)
    {
      this.aHr = this.awZ.aHr;
      if ((this.aHr == null) && (this.awZ.aHs > 0))
        this.aHr = dk(this.awZ.aHs);
    }
    Drawable localDrawable = this.aHr;
    AppMethodBeat.o(92501);
    return localDrawable;
  }

  private void nZ()
  {
    AppMethodBeat.i(92503);
    if (!ob())
      AppMethodBeat.o(92503);
    while (true)
    {
      return;
      Drawable localDrawable1 = null;
      if (this.axb == null)
        localDrawable1 = nY();
      Drawable localDrawable2 = localDrawable1;
      if (localDrawable1 == null)
      {
        if (this.aHE == null)
        {
          this.aHE = this.awZ.aHk;
          if ((this.aHE == null) && (this.awZ.aHl > 0))
            this.aHE = dk(this.awZ.aHl);
        }
        localDrawable2 = this.aHE;
      }
      if (localDrawable2 == null)
        nX();
      AppMethodBeat.o(92503);
    }
  }

  private boolean oa()
  {
    AppMethodBeat.i(92506);
    boolean bool;
    if ((this.aHz == null) || (this.aHz.b(this)))
    {
      bool = true;
      AppMethodBeat.o(92506);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92506);
    }
  }

  private boolean ob()
  {
    AppMethodBeat.i(92507);
    boolean bool;
    if ((this.aHz == null) || (this.aHz.c(this)))
    {
      bool = true;
      AppMethodBeat.o(92507);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92507);
    }
  }

  private boolean oc()
  {
    AppMethodBeat.i(92508);
    boolean bool;
    if ((this.aHz == null) || (!this.aHz.nM()))
    {
      bool = true;
      AppMethodBeat.o(92508);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92508);
    }
  }

  private void od()
  {
    AppMethodBeat.i(92509);
    if (this.aHz != null)
      this.aHz.f(this);
    AppMethodBeat.o(92509);
  }

  private void oe()
  {
    AppMethodBeat.i(92510);
    if (this.aHz != null)
      this.aHz.g(this);
    AppMethodBeat.o(92510);
  }

  public final void a(p paramp)
  {
    AppMethodBeat.i(138533);
    a(paramp, 5);
    AppMethodBeat.o(138533);
  }

  public final boolean a(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(92515);
    if ((paramb instanceof g))
    {
      paramb = (g)paramb;
      if ((this.aHp == paramb.aHp) && (this.aHo == paramb.aHo) && (com.bumptech.glide.h.j.i(this.axb, paramb.axb)) && (this.awY.equals(paramb.awY)) && (this.awZ.equals(paramb.awZ)) && (this.aAk == paramb.aAk))
        if (this.axc != null)
        {
          if (paramb.axc == null)
            break label126;
          bool = true;
          AppMethodBeat.o(92515);
        }
    }
    while (true)
    {
      return bool;
      if (paramb.axc == null)
        break;
      label126: AppMethodBeat.o(92515);
      continue;
      AppMethodBeat.o(92515);
    }
  }

  public final void aV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92504);
    this.aAq.oq();
    if (aHx)
      ae("Got onSizeReady in " + com.bumptech.glide.h.e.q(this.startTime));
    if (this.aHD != g.a.aHH)
      AppMethodBeat.o(92504);
    while (true)
    {
      return;
      this.aHD = g.a.aHG;
      float f = this.awZ.aHj;
      this.width = g(paramInt1, f);
      this.height = g(paramInt2, f);
      if (aHx)
        ae("finished setup for calling load in " + com.bumptech.glide.h.e.q(this.startTime));
      this.aHC = this.awe.a(this.awi, this.axb, this.awZ.aAb, this.width, this.height, this.awZ.aAf, this.awY, this.aAk, this.awZ.aAl, this.awZ.aAh, this.awZ.aAm, this.awZ.aAn, this.awZ.aAd, this.awZ.azQ, this.awZ.aHv, this.awZ.aBK, this.awZ.aAz, this);
      if (this.aHD != g.a.aHG)
        this.aHC = null;
      if (aHx)
        ae("finished onSizeReady in " + com.bumptech.glide.h.e.q(this.startTime));
      AppMethodBeat.o(92504);
    }
  }

  public final void begin()
  {
    AppMethodBeat.i(92494);
    nW();
    this.aAq.oq();
    this.startTime = com.bumptech.glide.h.e.ok();
    int i;
    if (this.axb == null)
    {
      if (com.bumptech.glide.h.j.aW(this.aHp, this.aHo))
      {
        this.width = this.aHp;
        this.height = this.aHo;
      }
      if (nY() == null)
      {
        i = 5;
        a(new p("Received null model"), i);
        AppMethodBeat.o(92494);
      }
    }
    while (true)
    {
      return;
      i = 3;
      break;
      if (this.aHD == g.a.aHG)
      {
        IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Cannot restart a running request");
        AppMethodBeat.o(92494);
        throw localIllegalArgumentException;
      }
      if (this.aHD != g.a.aHI)
        break label156;
      c(this.azR, com.bumptech.glide.c.a.ayH);
      AppMethodBeat.o(92494);
    }
    label156: this.aHD = g.a.aHH;
    if (com.bumptech.glide.h.j.aW(this.aHp, this.aHo))
      aV(this.aHp, this.aHo);
    while (true)
    {
      if (((this.aHD == g.a.aHG) || (this.aHD == g.a.aHH)) && (ob()))
        nX();
      if (aHx)
        ae("finished run method in " + com.bumptech.glide.h.e.q(this.startTime));
      AppMethodBeat.o(92494);
      break;
      this.aHA.a(this);
    }
  }

  public final void c(u<?> paramu, com.bumptech.glide.c.a parama)
  {
    AppMethodBeat.i(92511);
    this.aAq.oq();
    this.aHC = null;
    if (paramu == null)
    {
      a(new p("Expected to receive a Resource<R> with an object of " + this.awY + " inside, but instead got null."), 5);
      AppMethodBeat.o(92511);
    }
    while (true)
    {
      return;
      Object localObject = paramu.get();
      if ((localObject == null) || (!this.awY.isAssignableFrom(localObject.getClass())))
      {
        f(paramu);
        StringBuilder localStringBuilder = new StringBuilder("Expected to receive an object of ").append(this.awY).append(" but instead got ");
        if (localObject != null)
        {
          parama = localObject.getClass();
          label131: parama = localStringBuilder.append(parama).append("{").append(localObject).append("} inside Resource{").append(paramu).append("}.");
          if (localObject == null)
            break label208;
        }
        label208: for (paramu = ""; ; paramu = " To indicate failure return a null Resource object, rather than a Resource object containing null data.")
        {
          a(new p(paramu), 5);
          AppMethodBeat.o(92511);
          break;
          parama = "";
          break label131;
        }
      }
      if (!oa())
      {
        f(paramu);
        this.aHD = g.a.aHI;
        AppMethodBeat.o(92511);
      }
      else
      {
        a(paramu, localObject, parama);
        AppMethodBeat.o(92511);
      }
    }
  }

  public final void clear()
  {
    int i = 1;
    AppMethodBeat.i(92496);
    com.bumptech.glide.h.j.om();
    nW();
    this.aAq.oq();
    if (this.aHD == g.a.aHL)
    {
      AppMethodBeat.o(92496);
      return;
    }
    nW();
    this.aAq.oq();
    this.aHD = g.a.aHK;
    Object localObject;
    k localk;
    if (this.aHC != null)
    {
      localObject = this.aHC;
      localk = ((j.d)localObject).aBD;
      localObject = ((j.d)localObject).aBE;
      com.bumptech.glide.h.j.om();
      localk.aAq.oq();
      if ((localk.aBL) || (localk.aBN))
      {
        if (localk.aBO == null)
          localk.aBO = new ArrayList(2);
        if (!localk.aBO.contains(localObject))
          localk.aBO.add(localObject);
        label146: this.aHC = null;
      }
    }
    else
    {
      if (this.azR != null)
        f(this.azR);
      j = i;
      if (this.aHz != null)
        if (!this.aHz.d(this))
          break label309;
    }
    label309: for (int j = i; ; j = 0)
    {
      if (j != 0)
        nX();
      this.aHD = g.a.aHL;
      AppMethodBeat.o(92496);
      break;
      localk.aBH.remove(localObject);
      if ((!localk.aBH.isEmpty()) || (localk.aBN) || (localk.aBL) || (localk.isCancelled))
        break label146;
      localk.isCancelled = true;
      localObject = localk.aBQ;
      ((com.bumptech.glide.c.b.g)localObject).isCancelled = true;
      localObject = ((com.bumptech.glide.c.b.g)localObject).aAG;
      if (localObject != null)
        ((com.bumptech.glide.c.b.e)localObject).cancel();
      localk.aBz.a(localk, localk.azP);
      break label146;
    }
  }

  public final boolean isCancelled()
  {
    if ((this.aHD == g.a.aHK) || (this.aHD == g.a.aHL));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isComplete()
  {
    if (this.aHD == g.a.aHI);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isFailed()
  {
    if (this.aHD == g.a.aHJ);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isRunning()
  {
    if ((this.aHD == g.a.aHG) || (this.aHD == g.a.aHH));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final com.bumptech.glide.h.a.b my()
  {
    return this.aAq;
  }

  public final boolean nL()
  {
    AppMethodBeat.i(92499);
    boolean bool = isComplete();
    AppMethodBeat.o(92499);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(92497);
    clear();
    this.aHD = g.a.aHM;
    AppMethodBeat.o(92497);
  }

  public final void recycle()
  {
    AppMethodBeat.i(92493);
    nW();
    this.context = null;
    this.awi = null;
    this.axb = null;
    this.awY = null;
    this.awZ = null;
    this.aHp = -1;
    this.aHo = -1;
    this.aHA = null;
    this.axc = null;
    this.aHy = null;
    this.aHz = null;
    this.aHB = null;
    this.aHC = null;
    this.aHE = null;
    this.aHm = null;
    this.aHr = null;
    this.width = -1;
    this.height = -1;
    aCd.release(this);
    AppMethodBeat.o(92493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.f.g
 * JD-Core Version:    0.6.2
 */
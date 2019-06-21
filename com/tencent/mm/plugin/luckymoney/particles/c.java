package com.tencent.mm.plugin.luckymoney.particles;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public final class c
{
  private float emissionRate;
  private ValueAnimator jcQ;
  private final b nZE;
  private final d nZF;
  private final ViewGroup nZG;
  final ConfettiView nZH;
  final Queue<com.tencent.mm.plugin.luckymoney.particles.a.b> nZI;
  final List<com.tencent.mm.plugin.luckymoney.particles.a.b> nZJ;
  private long nZK;
  int nZL;
  long nZM;
  private float nZN;
  public Interpolator nZO;
  private Rect nZP;
  private float nZQ;
  private float nZR;
  private float nZS;
  private float nZT;
  private float nZU;
  private float nZV;
  private float nZW;
  private float nZX;
  private Float nZY;
  private Float nZZ;
  private Float oaa;
  private Float oab;
  private int oac;
  private int oad;
  private float oae;
  private float oaf;
  private float oag;
  private float oah;
  private Float oai;
  private Float oaj;
  private long oak;
  public float oal;
  public float oam;
  private final Random random;

  public c(Context paramContext, b paramb, d paramd, ViewGroup paramViewGroup)
  {
    this(paramb, paramd, paramViewGroup, ConfettiView.es(paramContext));
    AppMethodBeat.i(42438);
    AppMethodBeat.o(42438);
  }

  private c(b paramb, d paramd, ViewGroup paramViewGroup, ConfettiView paramConfettiView)
  {
    AppMethodBeat.i(42439);
    this.random = new Random();
    this.nZI = new LinkedList();
    this.nZJ = new ArrayList(300);
    this.nZE = paramb;
    this.nZF = paramd;
    this.nZG = paramViewGroup;
    this.nZH = paramConfettiView;
    this.nZH.nZJ = this.nZJ;
    this.nZH.addOnAttachStateChangeListener(new c.1(this));
    this.oak = -1L;
    this.nZP = new Rect(0, 0, paramViewGroup.getWidth(), paramViewGroup.getHeight());
    AppMethodBeat.o(42439);
  }

  private void Q(int paramInt, long paramLong)
  {
    AppMethodBeat.i(42446);
    int i = 0;
    com.tencent.mm.plugin.luckymoney.particles.a.b localb;
    if (i < paramInt)
    {
      localb = (com.tencent.mm.plugin.luckymoney.particles.a.b)this.nZI.poll();
      if (localb != null)
        break label87;
      localb = this.nZE.b(this.random);
    }
    label87: 
    while (true)
    {
      a(localb, this.nZF, this.random, paramLong);
      this.nZJ.add(localb);
      i++;
      break;
      AppMethodBeat.o(42446);
      return;
    }
  }

  private static float a(float paramFloat1, float paramFloat2, Random paramRandom)
  {
    AppMethodBeat.i(42449);
    float f = paramRandom.nextFloat();
    AppMethodBeat.o(42449);
    return (f * 2.0F - 1.0F) * paramFloat2 + paramFloat1;
  }

  private void a(com.tencent.mm.plugin.luckymoney.particles.a.b paramb, d paramd, Random paramRandom, long paramLong)
  {
    Object localObject = null;
    AppMethodBeat.i(42448);
    paramb.reset();
    paramb.oaz = paramLong;
    paramb.oaA = paramd.aI(paramRandom.nextFloat());
    paramb.oaB = paramd.aJ(paramRandom.nextFloat());
    paramb.oaC = a(this.nZQ, this.nZR, paramRandom);
    paramb.oaD = a(this.nZS, this.nZT, paramRandom);
    paramb.nZU = a(this.nZU, this.nZV, paramRandom);
    paramb.nZW = a(this.nZW, this.nZX, paramRandom);
    if (this.nZY == null)
    {
      paramd = null;
      paramb.nZY = paramd;
      if (this.oaa != null)
        break label270;
      paramd = null;
      label129: paramb.oaa = paramd;
      paramb.oaG = a(this.oac, this.oad, paramRandom);
      paramb.oaH = a(this.oae, this.oaf, paramRandom);
      paramb.oag = a(this.oag, this.oah, paramRandom);
      if (this.oai != null)
        break label295;
    }
    label270: label295: for (paramd = localObject; ; paramd = Float.valueOf(a(this.oai.floatValue(), this.oaj.floatValue(), paramRandom)))
    {
      paramb.oai = paramd;
      paramb.oak = this.oak;
      paramb.nZO = this.nZO;
      paramb.oaJ = a(this.oal, this.oam, paramRandom);
      paramb.i(this.nZP);
      AppMethodBeat.o(42448);
      return;
      paramd = Float.valueOf(a(this.nZY.floatValue(), this.nZZ.floatValue(), paramRandom));
      break;
      paramd = Float.valueOf(a(this.oaa.floatValue(), this.oab.floatValue(), paramRandom));
      break label129;
    }
  }

  private void bLN()
  {
    AppMethodBeat.i(42444);
    if (this.jcQ != null)
      this.jcQ.cancel();
    this.nZK = 0L;
    Iterator localIterator = this.nZJ.iterator();
    while (localIterator.hasNext())
    {
      this.nZI.add(localIterator.next());
      localIterator.remove();
    }
    AppMethodBeat.o(42444);
  }

  private void bLO()
  {
    AppMethodBeat.i(42445);
    ViewParent localViewParent = this.nZH.getParent();
    if (localViewParent != null)
    {
      if (localViewParent != this.nZG)
        ((ViewGroup)localViewParent).removeView(this.nZH);
    }
    else
      this.nZG.addView(this.nZH);
    this.nZH.terminated = false;
    AppMethodBeat.o(42445);
  }

  private void bLP()
  {
    AppMethodBeat.i(42447);
    this.jcQ = ValueAnimator.ofInt(new int[] { 0 }).setDuration(9223372036854775807L);
    this.jcQ.addUpdateListener(new c.2(this));
    this.jcQ.start();
    AppMethodBeat.o(42447);
  }

  public final c R(float paramFloat1, float paramFloat2)
  {
    this.nZQ = (paramFloat1 / 1000.0F);
    this.nZR = (paramFloat2 / 1000.0F);
    return this;
  }

  public final c S(float paramFloat1, float paramFloat2)
  {
    this.nZS = (paramFloat1 / 1000.0F);
    this.nZT = (paramFloat2 / 1000.0F);
    return this;
  }

  public final c aF(float paramFloat)
  {
    this.emissionRate = (paramFloat / 1000.0F);
    this.nZN = (1.0F / this.emissionRate);
    return this;
  }

  public final c aG(float paramFloat)
  {
    this.nZU = (paramFloat / 1000000.0F);
    this.nZV = 0.0F;
    return this;
  }

  public final c aH(float paramFloat)
  {
    this.nZW = (paramFloat / 1000000.0F);
    this.nZX = 0.0F;
    return this;
  }

  public final c bLG()
  {
    this.nZM = 9223372036854775807L;
    return this;
  }

  public final c bLH()
  {
    this.oac = 180;
    this.oad = 180;
    return this;
  }

  public final c bLI()
  {
    this.oag = 0.00036F;
    this.oah = 0.00018F;
    return this;
  }

  public final c bLJ()
  {
    AppMethodBeat.i(42441);
    this.oai = Float.valueOf(0.36F);
    this.oaj = Float.valueOf(0.0F);
    AppMethodBeat.o(42441);
    return this;
  }

  public final c bLK()
  {
    this.oak = 1500L;
    return this;
  }

  public final c bLL()
  {
    AppMethodBeat.i(42442);
    bLN();
    bLO();
    Q(this.nZL, 0L);
    bLP();
    AppMethodBeat.o(42442);
    return this;
  }

  public final void bLM()
  {
    AppMethodBeat.i(42443);
    if (this.jcQ != null)
      this.jcQ.cancel();
    this.nZH.bLM();
    AppMethodBeat.o(42443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.c.a;

public class PickPoi extends RelativeLayout
{
  Animation De;
  private Context context;
  View nLu;
  protected c nOO;
  public c.a nOV;
  private double nQe;
  private double nQf;
  private f nQg;
  boolean nQh;
  private e nQi;

  public PickPoi(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(113649);
    this.nQg = new f();
    this.nQh = true;
    this.nQi = null;
    this.nOV = new PickPoi.1(this);
    this.context = paramContext;
    init();
    AppMethodBeat.o(113649);
  }

  public PickPoi(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113650);
    this.nQg = new f();
    this.nQh = true;
    this.nQi = null;
    this.nOV = new PickPoi.1(this);
    this.context = paramContext;
    init();
    AppMethodBeat.o(113650);
  }

  public PickPoi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113651);
    this.nQg = new f();
    this.nQh = true;
    this.nQi = null;
    this.nOV = new PickPoi.1(this);
    this.context = paramContext;
    init();
    AppMethodBeat.o(113651);
  }

  private void init()
  {
    AppMethodBeat.i(113652);
    this.nOO = c.agw();
    this.De = AnimationUtils.loadAnimation(this.context, 2131034283);
    this.nLu = LayoutInflater.from(this.context).inflate(2130969945, this, true).findViewById(2131825273);
    AppMethodBeat.o(113652);
  }

  public f getPoi()
  {
    return this.nQg;
  }

  public final void l(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113653);
    this.nQe = paramDouble1;
    this.nQf = paramDouble2;
    this.nQg = new f();
    this.nQg.type = 3;
    this.nQg.mName = this.context.getResources().getString(2131300987);
    this.nQg.bDG = paramDouble1;
    this.nQg.bDH = paramDouble2;
    this.nQg.nQp = "";
    this.nOO.a(this.nOV);
    this.nOO.a(paramDouble1, paramDouble2, this.nOV);
    this.nQh = true;
    AppMethodBeat.o(113653);
  }

  public final void m(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113654);
    l(paramDouble1, paramDouble2);
    this.nQh = false;
    AppMethodBeat.o(113654);
  }

  public void setAdapter(e parame)
  {
    this.nQi = parame;
  }

  public void setLocationArrow(int paramInt)
  {
    AppMethodBeat.i(113655);
    ((ImageView)this.nLu).setImageResource(paramInt);
    AppMethodBeat.o(113655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.PickPoi
 * JD-Core Version:    0.6.2
 */
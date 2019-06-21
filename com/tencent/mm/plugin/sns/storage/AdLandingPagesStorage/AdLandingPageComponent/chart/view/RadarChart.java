package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.Chart;
import java.util.ArrayList;

public class RadarChart extends Chart
{
  private Context context;
  public ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a> qYj;
  private c qYk;
  public TextView qYl;
  private RadarGrid qYm;
  private RadarDataLayer[] qYn;
  private a qYo;
  private boolean qYp;
  private boolean qYq;
  public int qYr;
  public int qYs;
  private int qYt;
  public Spannable[] qYu;
  private float qYv;

  public RadarChart(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(36958);
    this.qYk = new c();
    this.qYp = true;
    this.qYq = true;
    this.qYr = 3;
    this.qYs = 0;
    this.qYt = 4;
    this.qYv = 1.0F;
    this.context = paramContext;
    AppMethodBeat.o(36958);
  }

  public RadarChart(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(36959);
    this.qYk = new c();
    this.qYp = true;
    this.qYq = true;
    this.qYr = 3;
    this.qYs = 0;
    this.qYt = 4;
    this.qYv = 1.0F;
    this.context = paramContext;
    AppMethodBeat.o(36959);
  }

  public c getGridStyle()
  {
    AppMethodBeat.i(36963);
    c localc;
    if (this.qYm == null)
    {
      localc = this.qYk;
      AppMethodBeat.o(36963);
    }
    while (true)
    {
      return localc;
      this.qYk = this.qYm.getGridStyle();
      localc = this.qYm.getGridStyle();
      AppMethodBeat.o(36963);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(36961);
    paramInt2 = getChildCount();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      getChildAt(paramInt1).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    AppMethodBeat.o(36961);
  }

  public void setData(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a[] paramArrayOfa)
  {
    int i = 0;
    AppMethodBeat.i(36960);
    removeAllViews();
    int j = paramArrayOfa.length;
    for (int k = 0; k < j; k++)
      if (paramArrayOfa[k].size() <= 0)
      {
        paramArrayOfa = new Exception("Not enough elements.");
        AppMethodBeat.o(36960);
        throw paramArrayOfa;
      }
    for (k = 0; k < paramArrayOfa.length; k++)
      for (j = 0; j < paramArrayOfa.length; j++)
        if (!paramArrayOfa[k].a(paramArrayOfa[j]))
        {
          paramArrayOfa = new Error("Layer not compatible.");
          AppMethodBeat.o(36960);
          throw paramArrayOfa;
        }
    this.qYu = paramArrayOfa[0].cpi();
    this.qYs = paramArrayOfa[0].size();
    if (this.qYj == null)
      this.qYj = new ArrayList();
    j = paramArrayOfa.length;
    for (k = 0; k < j; k++)
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a locala = paramArrayOfa[k];
      this.qYj.add(locala);
    }
    this.qYm = new RadarGrid(this.context, this.qYs, this.qYt, this.qYv, this.qYu, this.qYk);
    addView(this.qYm);
    this.qYn = new RadarDataLayer[this.qYr];
    for (k = i; (k < this.qYn.length) && (this.qYj.size() > k); k++)
    {
      this.qYn[k] = new RadarDataLayer(this.context, this.qYv, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a)this.qYj.get(k));
      addView(this.qYn[k]);
    }
    if (this.qYo == null)
      this.qYo = new a(this.context, this.qYk);
    addView(this.qYo);
    AppMethodBeat.o(36960);
  }

  public void setGridStyle(c paramc)
  {
    AppMethodBeat.i(36962);
    this.qYk = paramc;
    if (this.qYm != null)
      this.qYm.setGridStyle(paramc);
    AppMethodBeat.o(36962);
  }

  public void setLatitudeNum(int paramInt)
  {
    this.qYt = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart
 * JD-Core Version:    0.6.2
 */
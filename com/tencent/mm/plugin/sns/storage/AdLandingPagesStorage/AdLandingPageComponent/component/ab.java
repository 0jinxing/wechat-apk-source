package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.Spannable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.sdk.g.d;
import java.util.concurrent.CountDownLatch;

public final class ab extends h
{
  private static final int rbX;
  private CountDownLatch countDownLatch;
  private Bitmap maskBitmap;
  private RadarChart rbY;
  private Bitmap rbZ;

  static
  {
    AppMethodBeat.i(37358);
    rbX = Color.parseColor("#26eae9e2");
    AppMethodBeat.o(37358);
  }

  public ab(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab paramab, ViewGroup paramViewGroup)
  {
    super(paramContext, paramab, paramViewGroup);
    AppMethodBeat.i(37351);
    this.countDownLatch = new CountDownLatch(2);
    AppMethodBeat.o(37351);
  }

  private static void a(Spannable paramSpannable, int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(37356);
    for (int i = 0; i < 2; i++)
      paramSpannable.setSpan(paramArrayOfObject[i], paramInt1, paramInt2, 18);
    AppMethodBeat.o(37356);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37355);
    super.coZ();
    this.countDownLatch.countDown();
    this.countDownLatch.countDown();
    AppMethodBeat.o(37355);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37352);
    this.rbY = ((RadarChart)this.contentView.findViewById(2131827621));
    AppMethodBeat.o(37352);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37354);
    d.h(new ab.1(this), "AdlandingRadarComp").start();
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab localab = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab)cpB();
    if (localab != null)
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(localab.qXx, localab.qWP, new ab.2(this));
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(localab.qXD, localab.qWP, new ab.3(this));
      cpq();
      AppMethodBeat.o(37354);
    }
    while (true)
    {
      return;
      Log.wtf("AdlandingRadarChartComp", "null info");
      AppMethodBeat.o(37354);
    }
  }

  protected final void cpq()
  {
    AppMethodBeat.i(37353);
    ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qZo.qWS, (int)this.qZo.qWQ, (int)this.qZo.qWT, (int)this.qZo.qWR);
    this.contentView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(37353);
  }

  protected final int getLayout()
  {
    return 2130970716;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab
 * JD-Core Version:    0.6.2
 */
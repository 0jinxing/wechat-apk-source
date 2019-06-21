package com.tencent.mm.plugin.appbrand.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.luggage.sdk.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.ui.statusbar.c;
import com.tencent.mm.ui.statusbar.c.a;

@SuppressLint({"ViewConstructor"})
public final class k extends LinearLayout
  implements c.a
{
  private final a[] iJm;
  private final SparseArray<k.b> iJn;
  private final SparseArray<k.b> iJo;
  private int iJp;
  public final b ivC;

  public k(Context paramContext, b paramb)
  {
    super(paramContext);
    AppMethodBeat.i(102341);
    this.ivC = paramb;
    this.iJn = new SparseArray();
    this.iJo = new SparseArray();
    this.iJm = new a[4];
    setClickable(false);
    int i = getContext().getResources().getDisplayMetrics().widthPixels;
    int j = com.tencent.mm.bz.a.fromDPToPix(getContext(), 10);
    int k = com.tencent.mm.bz.a.fromDPToPix(getContext(), 4);
    paramContext = new FrameLayout.LayoutParams(i * 3 / 5, -2);
    paramContext.gravity = 53;
    setLayoutParams(paramContext);
    aMu();
    setPadding(j, j, j, j);
    setOrientation(1);
    paramContext = new GradientDrawable();
    paramContext.setCornerRadius(k);
    paramContext.setColor(-652403418);
    setBackground(paramContext);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 2);
    paramb = new TextView(getContext());
    View localView = new View(getContext());
    paramb.setTextColor(-1);
    paramb.setLayoutParams(paramContext);
    paramb.setTextSize(1, 14.0F);
    paramb.setText(getContext().getString(2131296758));
    addView(paramb);
    localLayoutParams.setMargins(0, com.tencent.mm.bz.a.fromDPToPix(getContext(), 10), 0, 0);
    localView.setLayoutParams(localLayoutParams);
    localView.setBackgroundColor(1728053247);
    addView(localView);
    aMv();
    c.az((Activity)getContext()).a(this);
    AppMethodBeat.o(102341);
  }

  private void aMu()
  {
    AppMethodBeat.i(102342);
    if ((getLayoutParams() != null) && ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      ((ViewGroup.MarginLayoutParams)getLayoutParams()).topMargin = (com.tencent.mm.plugin.appbrand.widget.a.de(getContext()) + this.iJp);
      requestLayout();
    }
    AppMethodBeat.o(102342);
  }

  private void aMv()
  {
    AppMethodBeat.i(102343);
    for (int i = 0; i < 4; i++)
    {
      a locala = new a(getContext());
      locala.setText(getContext().getString(com.tencent.mm.plugin.appbrand.performance.d.ivQ[i]));
      this.iJm[i] = locala;
      addView(locala);
    }
    AppMethodBeat.o(102343);
  }

  public final void ae(int paramInt, String paramString)
  {
    AppMethodBeat.i(102344);
    m.runOnUiThread(new k.2(this, paramInt, paramString));
    AppMethodBeat.o(102344);
  }

  public final void cP(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102345);
    m.runOnUiThread(new k.3(this, paramString1, paramString2));
    AppMethodBeat.o(102345);
  }

  public final void pO(int paramInt)
  {
    AppMethodBeat.i(102346);
    this.iJp = paramInt;
    aMu();
    AppMethodBeat.o(102346);
  }

  @SuppressLint({"AppCompatCustomView"})
  final class a extends TextView
  {
    public a(Context arg2)
    {
      super();
      AppMethodBeat.i(102336);
      this$1 = new LinearLayout.LayoutParams(-1, -2);
      int i = com.tencent.mm.bz.a.fromDPToPix(getContext(), 5);
      k.this.setMargins(0, i, 0, i);
      setLayoutParams(k.this);
      setTextSize(1, 12.0F);
      setTextColor(-7171438);
      AppMethodBeat.o(102336);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.k
 * JD-Core Version:    0.6.2
 */
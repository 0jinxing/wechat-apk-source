package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.h;

public class SnsTranslateResultView extends LinearLayout
{
  private static final int rBw;
  private Drawable fHj;
  private TextView qeY;
  private TextView rBu;
  private View rBv;
  private float rBx;
  private int rBy;
  private int rxe;

  static
  {
    AppMethodBeat.i(39629);
    rBw = Color.parseColor("#19000000");
    AppMethodBeat.o(39629);
  }

  public SnsTranslateResultView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39623);
    this.rxe = -1;
    this.rBx = -1.0F;
    this.rBy = -1;
    LayoutInflater.from(getContext()).inflate(2130970967, this);
    this.rBu = ((TextView)findViewById(2131828362));
    this.qeY = ((TextView)findViewById(2131828363));
    this.rBv = findViewById(2131828361);
    this.fHj = getResources().getDrawable(2130840304);
    this.fHj.setBounds(0, 0, (int)(this.qeY.getTextSize() * 0.8F), (int)(this.qeY.getTextSize() * 0.8F));
    this.fHj.setColorFilter(rBw, PorterDuff.Mode.SRC_IN);
    AppMethodBeat.o(39623);
  }

  private void cuv()
  {
    AppMethodBeat.i(39627);
    if ((this.rBx == -1.0F) && (this.rBy == -1))
      if (this.rxe == 2)
        this.qeY.setTextSize(1, 14.0F * a.dm(getContext()));
    label162: 
    while (true)
    {
      if (this.rxe == 2)
      {
        this.qeY.setTextColor(getContext().getResources().getColor(2131690500));
        AppMethodBeat.o(39627);
      }
      while (true)
      {
        return;
        if (this.rxe != 1)
          break label162;
        this.qeY.setTextSize(1, 15.0F * a.dm(getContext()));
        break;
        this.qeY.setTextSize(this.rBy, this.rBx);
        break;
        if (this.rxe == 1)
          this.qeY.setTextColor(getContext().getResources().getColor(2131690502));
        AppMethodBeat.o(39627);
      }
    }
  }

  public final void El(int paramInt)
  {
    AppMethodBeat.i(39624);
    this.qeY.setCompoundDrawables(this.fHj, null, null, null);
    this.qeY.setCompoundDrawablePadding(a.fromDPToPix(getContext(), 3));
    this.qeY.setText(2131303839);
    h.a(this.qeY, null);
    this.rBu.setVisibility(4);
    this.rxe = paramInt;
    this.qeY.setTextSize(0, this.rBu.getTextSize());
    this.qeY.setTextColor(getContext().getResources().getColor(2131690501));
    AppMethodBeat.o(39624);
  }

  @TargetApi(11)
  public final void a(ap.b paramb, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(39628);
    this.rxe = paramInt;
    cuv();
    if (!bo.isNullOrNil(paramString1))
    {
      this.qeY.setText(paramString1);
      j.h(this.qeY, 2);
      this.qeY.setCompoundDrawables(null, null, null, null);
      if ((paramBoolean) && (d.iW(11)))
        h.a(this.qeY, new SnsTranslateResultView.1(this, paramb));
      if (bo.isNullOrNil(paramString2))
        break label121;
      this.rBu.setText(paramString2);
    }
    while (true)
    {
      this.rBu.setVisibility(0);
      AppMethodBeat.o(39628);
      return;
      this.qeY.setText(2131303837);
      break;
      label121: this.rBu.setText(2131298256);
    }
  }

  public TextView getResultTextView()
  {
    return this.qeY;
  }

  public View getSplitlineView()
  {
    return this.rBv;
  }

  public void setResultTextSize(float paramFloat)
  {
    AppMethodBeat.i(39626);
    this.qeY.setTextSize(0, paramFloat);
    this.rBx = paramFloat;
    this.rBy = 0;
    AppMethodBeat.o(39626);
  }

  public final void setResultTextSize$255e752(float paramFloat)
  {
    AppMethodBeat.i(39625);
    this.qeY.setTextSize(1, paramFloat);
    this.rBx = paramFloat;
    this.rBy = 1;
    AppMethodBeat.o(39625);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTranslateResultView
 * JD-Core Version:    0.6.2
 */
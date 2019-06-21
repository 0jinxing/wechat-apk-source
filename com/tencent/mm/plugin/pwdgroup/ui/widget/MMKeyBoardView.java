package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class MMKeyBoardView extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private ColorStateList lP;
  private Context mContext;
  private float nnX;
  private MMKeyBoardView.a prB;
  private Button prU;
  private Button prV;
  private Button prW;
  private Button prX;
  private Button prY;
  private Button prZ;
  private Button psa;
  private Button psb;
  private Button psc;
  private Button psd;
  private ImageButton pse;
  private View psf;
  private View psg;
  private View psh;
  private View psi;
  private View psj;
  private View psk;
  private boolean psl;
  private int psm;
  private int psn;
  private int pso;
  private int psp;
  private int psq;
  private int psr;
  private int pss;
  private int pst;
  private int psu;

  public MMKeyBoardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public MMKeyBoardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(24046);
    this.psl = true;
    this.mContext = paramContext;
    this.psm = getResources().getDimensionPixelSize(2131427369);
    this.psn = getResources().getDimensionPixelSize(2131427370);
    this.nnX = getResources().getDimensionPixelSize(2131427371);
    this.lP = getResources().getColorStateList(2131690740);
    this.pso = getResources().getColor(2131690193);
    this.prU = new Button(this.mContext);
    this.prV = new Button(this.mContext);
    this.prW = new Button(this.mContext);
    this.prX = new Button(this.mContext);
    this.prY = new Button(this.mContext);
    this.prZ = new Button(this.mContext);
    this.psa = new Button(this.mContext);
    this.psb = new Button(this.mContext);
    this.psc = new Button(this.mContext);
    this.psd = new Button(this.mContext);
    this.pse = new ImageButton(this.mContext);
    this.psf = new View(this.mContext);
    this.psf = new View(this.mContext);
    this.psg = new View(this.mContext);
    this.psh = new View(this.mContext);
    this.psi = new View(this.mContext);
    this.psj = new View(this.mContext);
    this.psk = new View(this.mContext);
    this.prU.setBackgroundResource(2130839135);
    this.prV.setBackgroundResource(2130839135);
    this.prW.setBackgroundResource(2130839135);
    this.prX.setBackgroundResource(2130839135);
    this.prY.setBackgroundResource(2130839135);
    this.prZ.setBackgroundResource(2130839135);
    this.psa.setBackgroundResource(2130839135);
    this.psb.setBackgroundResource(2130839135);
    this.psc.setBackgroundResource(2130839135);
    this.prZ.setBackgroundResource(2130839135);
    this.psd.setBackgroundResource(2130839135);
    this.pse.setBackgroundResource(2130839135);
    this.pse.setImageResource(2130839136);
    this.prU.setText("0");
    this.prV.setText("1");
    this.prW.setText("2");
    this.prX.setText("3");
    this.prY.setText("4");
    this.prZ.setText("5");
    this.psa.setText("6");
    this.psb.setText("7");
    this.psc.setText("8");
    this.psd.setText("9");
    this.prU.setGravity(17);
    this.prV.setGravity(17);
    this.prW.setGravity(17);
    this.prX.setGravity(17);
    this.prY.setGravity(17);
    this.prZ.setGravity(17);
    this.psa.setGravity(17);
    this.psb.setGravity(17);
    this.psc.setGravity(17);
    this.psd.setGravity(17);
    this.prU.setTextSize(0, this.nnX);
    this.prV.setTextSize(0, this.nnX);
    this.prW.setTextSize(0, this.nnX);
    this.prX.setTextSize(0, this.nnX);
    this.prY.setTextSize(0, this.nnX);
    this.prZ.setTextSize(0, this.nnX);
    this.psa.setTextSize(0, this.nnX);
    this.psb.setTextSize(0, this.nnX);
    this.psc.setTextSize(0, this.nnX);
    this.psd.setTextSize(0, this.nnX);
    this.prU.setTextColor(this.lP);
    this.prV.setTextColor(this.lP);
    this.prW.setTextColor(this.lP);
    this.prX.setTextColor(this.lP);
    this.prY.setTextColor(this.lP);
    this.prZ.setTextColor(this.lP);
    this.psa.setTextColor(this.lP);
    this.psb.setTextColor(this.lP);
    this.psc.setTextColor(this.lP);
    this.psd.setTextColor(this.lP);
    this.prU.setOnClickListener(this);
    this.prV.setOnClickListener(this);
    this.prW.setOnClickListener(this);
    this.prX.setOnClickListener(this);
    this.prY.setOnClickListener(this);
    this.prZ.setOnClickListener(this);
    this.psa.setOnClickListener(this);
    this.psb.setOnClickListener(this);
    this.psc.setOnClickListener(this);
    this.psd.setOnClickListener(this);
    this.pse.setOnClickListener(this);
    this.pse.setOnLongClickListener(this);
    this.psf.setBackgroundColor(this.pso);
    this.psf.setBackgroundColor(this.pso);
    this.psg.setBackgroundColor(this.pso);
    this.psh.setBackgroundColor(this.pso);
    this.psi.setBackgroundColor(this.pso);
    this.psj.setBackgroundColor(this.pso);
    this.psk.setBackgroundColor(this.pso);
    addView(this.prU);
    addView(this.prV);
    addView(this.prW);
    addView(this.prX);
    addView(this.prY);
    addView(this.prZ);
    addView(this.psa);
    addView(this.psb);
    addView(this.psc);
    addView(this.psd);
    addView(this.pse);
    addView(this.psf);
    addView(this.psg);
    addView(this.psh);
    addView(this.psi);
    addView(this.psj);
    addView(this.psk);
    post(new MMKeyBoardView.1(this));
    AppMethodBeat.o(24046);
  }

  private void input(String paramString)
  {
    AppMethodBeat.i(24052);
    if ((this.prB != null) && (this.psl))
      this.prB.input(paramString);
    AppMethodBeat.o(24052);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(24049);
    if (!this.psl)
    {
      ab.d("MicroMsg.Facing.MMKeyBoardView", "onClick KeyBoard is disable.");
      AppMethodBeat.o(24049);
    }
    while (true)
    {
      return;
      if (paramView == this.prU)
      {
        input("0");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.prV)
      {
        input("1");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.prW)
      {
        input("2");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.prX)
      {
        input("3");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.prY)
      {
        input("4");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.prZ)
      {
        input("5");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.psa)
      {
        input("6");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.psb)
      {
        input("7");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.psc)
      {
        input("8");
        AppMethodBeat.o(24049);
      }
      else if (paramView == this.psd)
      {
        input("9");
        AppMethodBeat.o(24049);
      }
      else
      {
        if ((paramView == this.pse) && (this.prB != null) && (this.psl))
          this.prB.delete();
        AppMethodBeat.o(24049);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(24047);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.psp = getWidth();
    this.psq = getHeight();
    paramInt4 = -this.psn;
    paramInt2 = this.pst - this.psn + 1;
    paramInt1 = this.pst * 2 - this.psn + 2;
    int i = this.psu + 2;
    paramInt3 = this.psu * 2 + 3;
    int j = this.psu * 3 + 4;
    this.prV.layout(paramInt4, 1, this.psr + paramInt4, this.pss + 1);
    this.prW.layout(paramInt2, 1, this.psr + paramInt2, this.pss + 1);
    this.prX.layout(paramInt1, 1, this.psr + paramInt1, this.pss + 1);
    this.prY.layout(paramInt4, i, this.psr + paramInt4, this.pss + i);
    this.prZ.layout(paramInt2, i, this.psr + paramInt2, this.pss + i);
    this.psa.layout(paramInt1, i, this.psr + paramInt1, this.pss + i);
    this.psb.layout(paramInt4, paramInt3, this.psr + paramInt4, this.pss + paramInt3);
    this.psc.layout(paramInt2, paramInt3, this.psr + paramInt2, this.pss + paramInt3);
    this.psd.layout(paramInt1, paramInt3, this.psr + paramInt1, this.pss + paramInt3);
    this.prU.layout(paramInt2, j, this.psr + paramInt2, this.pss + j);
    this.pse.layout(paramInt1, j, this.psr + paramInt1, this.pss + j);
    this.psf.layout(0, this.psm + 1, this.psp, this.psm + 1 + 1);
    this.psg.layout(0, this.psm + i, this.psp, i + this.psm + 1);
    this.psh.layout(0, this.psm + paramInt3, this.psp, paramInt3 + this.psm + 1);
    this.psi.layout(0, this.psm + j, this.psp, this.psm + j + 1);
    this.psj.layout(this.pst + 1, this.psm, this.pst + 2, this.psq);
    this.psk.layout(this.pst * 2 + 2, this.psm, this.pst * 2 + 3, this.psq);
    AppMethodBeat.o(24047);
  }

  public boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(24050);
    if ((paramView == this.pse) && (this.prB != null) && (this.psl))
      this.prB.axQ();
    AppMethodBeat.o(24050);
    return false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24048);
    super.onMeasure(paramInt1, paramInt2);
    this.psp = getWidth();
    this.psq = getHeight();
    if ((this.psp != 0) && (this.psq != 0))
    {
      this.pst = ((this.psp - 2) / 3);
      this.psu = ((this.psq - this.psm - 4) / 4);
      this.psr = (this.pst + this.psn * 2);
      this.pss = (this.psu + this.psm * 2);
    }
    this.prV.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.prW.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.prX.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.prY.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.prZ.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.psa.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.psb.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.psc.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.psd.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.prU.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.pse.measure(View.MeasureSpec.makeMeasureSpec(this.psr, 1073741824), View.MeasureSpec.makeMeasureSpec(this.pss, 1073741824));
    this.psf.measure(View.MeasureSpec.makeMeasureSpec(this.psp, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.psg.measure(View.MeasureSpec.makeMeasureSpec(this.psp, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.psh.measure(View.MeasureSpec.makeMeasureSpec(this.psp, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.psi.measure(View.MeasureSpec.makeMeasureSpec(this.psp, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.psj.measure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.psq, 1073741824));
    this.psk.measure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.psq, 1073741824));
    AppMethodBeat.o(24048);
  }

  public void setKeyBoardEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(24051);
    this.psl = paramBoolean;
    this.prU.setEnabled(paramBoolean);
    this.prV.setEnabled(paramBoolean);
    this.prW.setEnabled(paramBoolean);
    this.prX.setEnabled(paramBoolean);
    this.prY.setEnabled(paramBoolean);
    this.prZ.setEnabled(paramBoolean);
    this.psa.setEnabled(paramBoolean);
    this.psb.setEnabled(paramBoolean);
    this.psc.setEnabled(paramBoolean);
    this.psd.setEnabled(paramBoolean);
    this.pse.setEnabled(paramBoolean);
    AppMethodBeat.o(24051);
  }

  public void setOnInputDeleteListener(MMKeyBoardView.a parama)
  {
    this.prB = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView
 * JD-Core Version:    0.6.2
 */
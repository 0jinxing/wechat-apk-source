package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public class DoubleTabView extends RelativeLayout
{
  private int lfN;
  private int lfO;
  private Bitmap lfP;
  private LinearLayout lfQ;
  private ImageView lfR;
  protected View.OnClickListener lfV;
  private Matrix mMatrix;
  private MMTabView ygT;
  private MMTabView ygU;
  private String ygV;
  private String ygW;
  private DoubleTabView.a ygX;

  public DoubleTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105956);
    this.lfO = 0;
    this.mMatrix = new Matrix();
    this.lfV = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(105955);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if (DoubleTabView.a(DoubleTabView.this) != null)
          DoubleTabView.a(DoubleTabView.this).onTabClick(i);
        AppMethodBeat.o(105955);
      }
    };
    init();
    AppMethodBeat.o(105956);
  }

  public DoubleTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(105957);
    this.lfO = 0;
    this.mMatrix = new Matrix();
    this.lfV = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(105955);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if (DoubleTabView.a(DoubleTabView.this) != null)
          DoubleTabView.a(DoubleTabView.this).onTabClick(i);
        AppMethodBeat.o(105955);
      }
    };
    init();
    AppMethodBeat.o(105957);
  }

  private void bmo()
  {
    AppMethodBeat.i(105960);
    this.lfQ = new LinearLayout(getContext());
    this.lfQ.setBackgroundResource(2131690691);
    this.lfQ.setId(2131820592);
    this.lfQ.setOrientation(0);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    addView(this.lfQ, localLayoutParams);
    AppMethodBeat.o(105960);
  }

  private void bmp()
  {
    AppMethodBeat.i(105961);
    this.lfR = new ImageView(getContext());
    this.lfR.setImageMatrix(this.mMatrix);
    this.lfR.setScaleType(ImageView.ScaleType.MATRIX);
    this.lfR.setId(2131820593);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, a.fromDPToPix(getContext(), 3));
    localLayoutParams.addRule(8, 2131820592);
    addView(this.lfR, localLayoutParams);
    AppMethodBeat.o(105961);
  }

  private void dwP()
  {
    AppMethodBeat.i(105964);
    this.ygT = ul(0);
    this.ygT.setText(this.ygV);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
    localLayoutParams.weight = 1.0F;
    this.lfQ.addView(this.ygT, localLayoutParams);
    AppMethodBeat.o(105964);
  }

  private void dwQ()
  {
    AppMethodBeat.i(105965);
    this.ygU = ul(1);
    this.ygU.setText(this.ygW);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(2131428725));
    localLayoutParams.weight = 1.0F;
    this.lfQ.addView(this.ygU, localLayoutParams);
    AppMethodBeat.o(105965);
  }

  private void init()
  {
    AppMethodBeat.i(105959);
    bmo();
    bmp();
    dwP();
    dwQ();
    AppMethodBeat.o(105959);
  }

  private MMTabView ul(int paramInt)
  {
    AppMethodBeat.i(105966);
    MMTabView localMMTabView = new MMTabView(getContext(), paramInt);
    localMMTabView.setTag(Integer.valueOf(paramInt));
    localMMTabView.setOnClickListener(this.lfV);
    AppMethodBeat.o(105966);
    return localMMTabView;
  }

  public int getCurentIndex()
  {
    return this.lfO;
  }

  public final void l(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(105967);
    this.mMatrix.setTranslate(this.lfN * (paramInt + paramFloat), 0.0F);
    this.lfR.setImageMatrix(this.mMatrix);
    AppMethodBeat.o(105967);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105958);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.lfN = ((paramInt3 - paramInt1) / 2);
    paramInt2 = this.lfN;
    if ((this.lfP == null) || (this.lfP.getWidth() != paramInt2))
      if (this.lfP != null)
        break label159;
    label159: for (paramInt1 = -1; ; paramInt1 = this.lfP.getWidth())
    {
      ab.w("MicroMsg.DoubleTabView", "sharp width changed, from %d to %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.lfP = Bitmap.createBitmap(paramInt2, a.fromDPToPix(getContext(), 3), Bitmap.Config.ARGB_8888);
      new Canvas(this.lfP).drawColor(getResources().getColor(2131690683));
      l(this.lfO, 0.0F);
      this.lfR.setImageBitmap(this.lfP);
      setTo(this.lfO);
      AppMethodBeat.o(105958);
      return;
    }
  }

  public final void pC(boolean paramBoolean)
  {
    AppMethodBeat.i(105971);
    if (this.ygU != null)
      this.ygU.pR(paramBoolean);
    AppMethodBeat.o(105971);
  }

  public void setFirstTabString(String paramString)
  {
    AppMethodBeat.i(105962);
    this.ygV = paramString;
    this.ygT.setText(paramString);
    requestLayout();
    AppMethodBeat.o(105962);
  }

  public void setFirstTabUnReadCount(String paramString)
  {
    AppMethodBeat.i(105969);
    if (this.ygT != null)
      this.ygT.setUnread(paramString);
    AppMethodBeat.o(105969);
  }

  public void setOnTabClickListener(DoubleTabView.a parama)
  {
    this.ygX = parama;
  }

  public void setSecondTabString(String paramString)
  {
    AppMethodBeat.i(105963);
    this.ygW = paramString;
    this.ygU.setText(paramString);
    requestLayout();
    AppMethodBeat.o(105963);
  }

  public void setSecondTabUnReadCount(String paramString)
  {
    AppMethodBeat.i(105970);
    if (this.ygU != null)
      this.ygU.setUnread(paramString);
    AppMethodBeat.o(105970);
  }

  public void setTo(int paramInt)
  {
    AppMethodBeat.i(105968);
    this.lfO = paramInt;
    MMTabView localMMTabView = this.ygT;
    if (this.lfO == 0)
    {
      localColorStateList = getResources().getColorStateList(2131690683);
      localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.ygU;
      if (this.lfO != 1)
        break label87;
    }
    label87: for (ColorStateList localColorStateList = getResources().getColorStateList(2131690683); ; localColorStateList = getResources().getColorStateList(2131690741))
    {
      localMMTabView.setTextColor(localColorStateList);
      AppMethodBeat.o(105968);
      return;
      localColorStateList = getResources().getColorStateList(2131690741);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.DoubleTabView
 * JD-Core Version:    0.6.2
 */
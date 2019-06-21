package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMRadioGroupView extends LinearLayout
{
  private int ywN;
  private int ywO;
  private MMRadioImageButton.a ywP;
  private MMRadioGroupView.b ywQ;
  private MMRadioGroupView.c ywR;
  private MMRadioImageButton ywS;
  private MMRadioGroupView.d ywT;

  public MMRadioGroupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106751);
    this.ywN = -1;
    this.ywO = -1;
    this.ywP = new MMRadioGroupView.a(this);
    this.ywR = new MMRadioGroupView.c(this, (byte)0);
    super.setOnHierarchyChangeListener(this.ywR);
    AppMethodBeat.o(106751);
  }

  private void aD(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(106754);
    View localView = findViewById(paramInt);
    if ((localView != null) && ((localView instanceof MMRadioImageButton)))
      ((MMRadioImageButton)localView).setChecked(paramBoolean);
    AppMethodBeat.o(106754);
  }

  private void setCheckedButton(MMRadioImageButton paramMMRadioImageButton)
  {
    this.ywS = paramMMRadioImageButton;
  }

  private void setCheckedId(int paramInt)
  {
    this.ywN = paramInt;
  }

  private void setClickedId(int paramInt)
  {
    this.ywO = paramInt;
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(106753);
    if ((paramView instanceof MMRadioImageButton))
    {
      MMRadioImageButton localMMRadioImageButton = (MMRadioImageButton)paramView;
      if (localMMRadioImageButton.isChecked())
      {
        if (this.ywN != -1)
          aD(this.ywN, false);
        setCheckedId(localMMRadioImageButton.getId());
        setCheckedButton(localMMRadioImageButton);
      }
    }
    super.addView(paramView, paramInt, paramLayoutParams);
    AppMethodBeat.o(106753);
  }

  public MMRadioImageButton getCheckedRadioButton()
  {
    return this.ywS;
  }

  public int getCheckedRadioButtonId()
  {
    return this.ywN;
  }

  public int getClickedRadioButtonId()
  {
    return this.ywO;
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(106752);
    super.onFinishInflate();
    if (this.ywN != -1)
    {
      aD(this.ywN, true);
      setCheckedId(this.ywN);
    }
    AppMethodBeat.o(106752);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106755);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (((paramInt1 > 0) || (paramInt2 > 0)) && (this.ywT != null))
      this.ywT.NJ(paramInt1);
    AppMethodBeat.o(106755);
  }

  public void setOnMMRadioGroupCheckedChangeListener(MMRadioGroupView.b paramb)
  {
    this.ywQ = paramb;
  }

  public void setOnSizeChangeObserver(MMRadioGroupView.d paramd)
  {
    this.ywT = paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMRadioGroupView
 * JD-Core Version:    0.6.2
 */
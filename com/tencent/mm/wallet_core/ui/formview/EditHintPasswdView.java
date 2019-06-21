package com.tencent.mm.wallet_core.ui.formview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnFocusChangeListener;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.v;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class EditHintPasswdView extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private static final int AhW = 2130838533;
  private TenpaySecureEditText AhX;
  private int AhY;
  private int AhZ;
  private int Aia;
  private a Aib;
  private View.OnFocusChangeListener gJD;
  private int sZx;

  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(49390);
    this.AhX = null;
    this.AhY = 6;
    this.sZx = 1;
    this.AhZ = AhW;
    this.Aia = 1;
    this.Aib = null;
    this.gJD = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.PwdAttr, paramInt, 0);
    this.sZx = paramAttributeSet.getInteger(0, 1);
    this.AhZ = paramAttributeSet.getResourceId(1, AhW);
    this.Aia = paramAttributeSet.getInteger(2, 1);
    paramAttributeSet.recycle();
    this.AhX = ((TenpaySecureEditText)v.hu(paramContext).inflate(2130969819, this, true).findViewById(2131820687));
    b.a(this.AhX, this.sZx);
    this.AhY = getNumberSize();
    if (this.AhX != null)
    {
      this.AhX.setBackgroundResource(this.AhZ);
      this.AhX.setImeOptions(6);
      this.AhX.setInputType(128);
      this.AhX.addTextChangedListener(new EditHintPasswdView.1(this));
      this.AhX.setOnFocusChangeListener(this);
      this.AhX.setClickable(false);
      this.AhX.setLongClickable(false);
      super.setEnabled(true);
      super.setClickable(true);
      AppMethodBeat.o(49390);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.EditHintPasswdView", "hy: no edit text view");
      AppMethodBeat.o(49390);
    }
  }

  private boolean asa()
  {
    AppMethodBeat.i(49392);
    boolean bool;
    if ((this.AhX != null) && (this.AhX.getInputLength() == this.AhY))
    {
      bool = true;
      AppMethodBeat.o(49392);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49392);
    }
  }

  private int getNumberSize()
  {
    int i = 6;
    AppMethodBeat.i(49393);
    switch (this.sZx)
    {
    case 2:
    case 5:
    case 6:
    case 7:
    default:
      ab.i("MicroMsg.EditHintPasswdView", "hy: error or not set format. use default");
      AppMethodBeat.o(49393);
    case 1:
    case 3:
    case 4:
    case 8:
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(49393);
      continue;
      i = 3;
      AppMethodBeat.o(49393);
      continue;
      AppMethodBeat.o(49393);
      i = 4;
      continue;
      AppMethodBeat.o(49393);
      i = 4;
    }
  }

  public final void cey()
  {
    AppMethodBeat.i(49397);
    if (this.AhX != null)
      this.AhX.ClearInput();
    AppMethodBeat.o(49397);
  }

  public final int getEncrType()
  {
    return this.Aia;
  }

  public final int getFormat()
  {
    return this.sZx;
  }

  public final String getMd5Value()
  {
    AppMethodBeat.i(49391);
    String str;
    if (this.AhX != null)
    {
      str = ag.ck(this.AhX.getText().toString());
      AppMethodBeat.o(49391);
    }
    while (true)
    {
      return str;
      ab.w("MicroMsg.EditHintPasswdView", "hy: edit view is null");
      str = "";
      AppMethodBeat.o(49391);
    }
  }

  public final a getOnEditInputValidListener()
  {
    return this.Aib;
  }

  public final View.OnFocusChangeListener getOnFocusChangeListener()
  {
    return this.gJD;
  }

  public final String getText()
  {
    AppMethodBeat.i(49396);
    String str;
    if (this.AhX != null)
    {
      str = c.a.a(this.Aia, this.AhX);
      AppMethodBeat.o(49396);
    }
    while (true)
    {
      return str;
      ab.w("MicroMsg.EditHintPasswdView", "hy: no edit view");
      str = "";
      AppMethodBeat.o(49396);
    }
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(49399);
    if (this.gJD != null)
      this.gJD.onFocusChange(this, paramBoolean);
    if (this.Aib != null)
      this.Aib.hY(asa());
    AppMethodBeat.o(49399);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49398);
    setMeasuredDimension(getDefaultSize(BackwardSupportUtil.b.b(getContext(), 960.0F), paramInt1), getDefaultSize(BackwardSupportUtil.b.b(getContext(), 720.0F), paramInt2));
    paramInt2 = getMeasuredWidth();
    if (this.AhY == 0);
    for (paramInt1 = paramInt2 / 6; ; paramInt1 = paramInt2 / this.AhY)
    {
      int i = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      int j = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      setMeasuredDimension(getDefaultSize(paramInt2, i), getDefaultSize(paramInt1, j));
      super.onMeasure(i, j);
      AppMethodBeat.o(49398);
      return;
    }
  }

  public final void setEditTextMaxLength(int paramInt)
  {
    AppMethodBeat.i(49395);
    if (this.AhX != null)
    {
      InputFilter[] arrayOfInputFilter1 = this.AhX.getFilters();
      InputFilter[] arrayOfInputFilter2 = new InputFilter[arrayOfInputFilter1.length + 1];
      for (int i = 0; i < arrayOfInputFilter1.length; i++)
        arrayOfInputFilter2[i] = arrayOfInputFilter1[i];
      arrayOfInputFilter2[(arrayOfInputFilter2.length - 1)] = new InputFilter.LengthFilter(paramInt);
      this.AhX.setFilters(arrayOfInputFilter2);
    }
    AppMethodBeat.o(49395);
  }

  public final void setEditTextSize(float paramFloat)
  {
    AppMethodBeat.i(49394);
    if (this.AhX != null)
      this.AhX.setTextSize(paramFloat);
    AppMethodBeat.o(49394);
  }

  public final void setEncrType(int paramInt)
  {
    this.Aia = paramInt;
  }

  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.gJD = paramOnFocusChangeListener;
  }

  public final void setOnInputValidListener(a parama)
  {
    this.Aib = parama;
  }

  public static abstract interface a
  {
    public abstract void hY(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView
 * JD-Core Version:    0.6.2
 */
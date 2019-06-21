package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSpinnerDatePicker;

public class DatePickerDialogView extends LinearLayout
  implements View.OnClickListener
{
  private CollectRadioBtnView kHD;
  private CollectRadioBtnView kHE;
  private CollectRadioBtnView kHF;
  private MMSpinnerDatePicker kHG;
  private TextView kHH;
  private TextView kHI;
  private int kHJ;

  public DatePickerDialogView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(41334);
    this.kHJ = 0;
    init(paramContext);
    AppMethodBeat.o(41334);
  }

  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(41335);
    this.kHJ = 0;
    init(paramContext);
    AppMethodBeat.o(41335);
  }

  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(41336);
    this.kHJ = 0;
    init(paramContext);
    AppMethodBeat.o(41336);
  }

  private void bhH()
  {
    AppMethodBeat.i(41339);
    if (this.kHJ == 2)
    {
      this.kHD.setRadioSrc(2131231853);
      this.kHE.setRadioSrc(2131231852);
      this.kHF.setRadioSrc(2131231852);
    }
    while (true)
    {
      this.kHG.setPickerMode(this.kHJ);
      AppMethodBeat.o(41339);
      return;
      if (this.kHJ == 1)
      {
        this.kHD.setRadioSrc(2131231852);
        this.kHE.setRadioSrc(2131231853);
        this.kHF.setRadioSrc(2131231852);
      }
      else
      {
        this.kHD.setRadioSrc(2131231852);
        this.kHE.setRadioSrc(2131231852);
        this.kHF.setRadioSrc(2131231853);
      }
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(41337);
    paramContext = v.hu(paramContext).inflate(2130969151, this);
    this.kHD = ((CollectRadioBtnView)paramContext.findViewById(2131822820));
    this.kHE = ((CollectRadioBtnView)paramContext.findViewById(2131822821));
    this.kHF = ((CollectRadioBtnView)paramContext.findViewById(2131822822));
    this.kHH = ((TextView)paramContext.findViewById(2131820999));
    this.kHI = ((TextView)paramContext.findViewById(2131822819));
    this.kHD.setOnClickListener(this);
    this.kHE.setOnClickListener(this);
    this.kHF.setOnClickListener(this);
    this.kHD.setTitleText("年");
    this.kHE.setTitleText("月");
    this.kHF.setTitleText("日");
    this.kHG = ((MMSpinnerDatePicker)paramContext.findViewById(2131822823));
    this.kHG.dKC();
    this.kHG.setTextSize(2131427813);
    AppMethodBeat.o(41337);
  }

  public int getDatePickerMode()
  {
    AppMethodBeat.i(41346);
    int i = this.kHG.getPickerMode();
    AppMethodBeat.o(41346);
    return i;
  }

  public int getDayOfMonth()
  {
    AppMethodBeat.i(41345);
    int i = this.kHG.getDayOfMonth();
    AppMethodBeat.o(41345);
    return i;
  }

  public int getMonth()
  {
    AppMethodBeat.i(41344);
    int i = this.kHG.getMonth();
    AppMethodBeat.o(41344);
    return i;
  }

  public int getYear()
  {
    AppMethodBeat.i(41343);
    int i = this.kHG.getYear();
    AppMethodBeat.o(41343);
    return i;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(41338);
    int i = paramView.getId();
    if (i == 2131822820)
      this.kHJ = 2;
    while (true)
    {
      bhH();
      AppMethodBeat.o(41338);
      return;
      if (i == 2131822821)
        this.kHJ = 1;
      else if (i == 2131822822)
        this.kHJ = 0;
      else
        ab.i("MicroMsg.DatePickerDialogView", "unhandled click view: %s", new Object[] { paramView.getClass().toString() });
    }
  }

  public void setDatePickerMode(int paramInt)
  {
    AppMethodBeat.i(41340);
    this.kHJ = paramInt;
    bhH();
    AppMethodBeat.o(41340);
  }

  public void setOnCancelBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(41342);
    this.kHI.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(41342);
  }

  public void setOnOkBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(41341);
    this.kHH.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(41341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.DatePickerDialogView
 * JD-Core Version:    0.6.2
 */
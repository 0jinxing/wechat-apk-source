package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class CheckBoxPreference extends Preference
{
  private MMSwitchBtn ixT;
  private View mView;
  private TextView ttD;
  private int ttE;
  private String ttF;
  private int ttG;
  public boolean uOT;

  public CheckBoxPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107135);
    this.uOT = false;
    this.ttE = -1;
    this.ttF = "";
    this.ttG = 8;
    setLayoutResource(2130970127);
    AppMethodBeat.o(107135);
  }

  public void Hm(int paramInt)
  {
    AppMethodBeat.i(107140);
    this.ttG = paramInt;
    if (this.ttD != null)
      this.ttD.setVisibility(this.ttG);
    AppMethodBeat.o(107140);
  }

  public void ds(String paramString, int paramInt)
  {
    AppMethodBeat.i(107139);
    this.ttE = paramInt;
    this.ttF = paramString;
    if (this.ttD != null)
    {
      if (paramInt > 0)
        this.ttD.setBackgroundResource(this.ttE);
      if (!TextUtils.isEmpty(this.ttF))
        this.ttD.setText(this.ttF);
    }
    AppMethodBeat.o(107139);
  }

  public final boolean isChecked()
  {
    if (this.ixT != null);
    for (boolean bool = this.ixT.zMU; ; bool = this.uOT)
      return bool;
  }

  public void onBindView(View paramView)
  {
    AppMethodBeat.i(107137);
    super.onBindView(paramView);
    NW(8);
    this.ixT = ((MMSwitchBtn)paramView.findViewById(2131820932));
    this.ixT.setSwitchListener(new CheckBoxPreference.1(this));
    this.ixT.setCheck(this.uOT);
    if (!isEnabled())
    {
      this.ixT.setEnabled(false);
      ((TextView)paramView.findViewById(16908310)).setTextColor(paramView.getResources().getColor(2131689960));
      ((TextView)paramView.findViewById(16908304)).setTextColor(paramView.getResources().getColor(2131689960));
    }
    this.ttD = ((TextView)paramView.findViewById(2131826079));
    ds(this.ttF, this.ttE);
    Hm(this.ttG);
    AppMethodBeat.o(107137);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107136);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970207, localViewGroup);
    this.mView = paramViewGroup;
    paramViewGroup = this.mView;
    AppMethodBeat.o(107136);
    return paramViewGroup;
  }

  public final void qg(boolean paramBoolean)
  {
    AppMethodBeat.i(107138);
    if (this.ixT != null)
    {
      this.uOT = paramBoolean;
      this.ixT.setCheck(paramBoolean);
    }
    AppMethodBeat.o(107138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.CheckBoxPreference
 * JD-Core Version:    0.6.2
 */
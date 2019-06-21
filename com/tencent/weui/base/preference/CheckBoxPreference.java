package com.tencent.weui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
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
  boolean uOT;

  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113249);
    this.uOT = false;
    this.ttE = -1;
    this.ttF = "";
    this.ttG = 8;
    setLayoutResource(2130970127);
    AppMethodBeat.o(113249);
  }

  public final boolean isChecked()
  {
    if (this.ixT != null);
    for (boolean bool = this.ixT.zMU; ; bool = this.uOT)
      return bool;
  }

  public void onBindView(View paramView)
  {
    AppMethodBeat.i(113251);
    super.onBindView(paramView);
    this.ixT = ((MMSwitchBtn)paramView.findViewById(2131820932));
    this.ixT.setSwitchListener(new CheckBoxPreference.1(this));
    this.ixT.setCheck(this.uOT);
    if (!isEnabled())
    {
      this.ixT.setEnabled(false);
      ((TextView)paramView.findViewById(16908310)).setTextColor(paramView.getResources().getColor(2131689765));
    }
    this.ttD = ((TextView)paramView.findViewById(2131826079));
    paramView = this.ttF;
    int i = this.ttE;
    this.ttE = i;
    this.ttF = paramView;
    if (this.ttD != null)
    {
      if (i > 0)
        this.ttD.setBackgroundResource(this.ttE);
      if (!TextUtils.isEmpty(this.ttF))
        this.ttD.setText(this.ttF);
    }
    this.ttG = this.ttG;
    if (this.ttD != null)
      this.ttD.setVisibility(this.ttG);
    AppMethodBeat.o(113251);
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(113250);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), 2130970207, localViewGroup);
    this.mView = paramViewGroup;
    paramViewGroup = this.mView;
    AppMethodBeat.o(113250);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.CheckBoxPreference
 * JD-Core Version:    0.6.2
 */
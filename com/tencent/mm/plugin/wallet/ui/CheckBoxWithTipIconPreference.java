package com.tencent.mm.plugin.wallet.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;

public class CheckBoxWithTipIconPreference extends CheckBoxPreference
{
  private TextView ttD;
  private int ttE;
  private String ttF;
  private int ttG;

  public CheckBoxWithTipIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CheckBoxWithTipIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(46448);
    this.ttE = -1;
    this.ttF = "";
    this.ttG = 8;
    setLayoutResource(2130970208);
    AppMethodBeat.o(46448);
  }

  public final void Hm(int paramInt)
  {
    AppMethodBeat.i(46451);
    this.ttG = paramInt;
    if (this.ttD != null)
      this.ttD.setVisibility(paramInt);
    AppMethodBeat.o(46451);
  }

  public final void ds(String paramString, int paramInt)
  {
    AppMethodBeat.i(46450);
    this.ttE = paramInt;
    this.ttF = paramString;
    if (this.ttD != null)
    {
      if (this.ttE > 0)
        this.ttD.setBackgroundResource(this.ttE);
      if (!TextUtils.isEmpty(this.ttF))
        this.ttD.setText(this.ttF);
    }
    AppMethodBeat.o(46450);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(46449);
    super.onBindView(paramView);
    this.ttD = ((TextView)paramView.findViewById(2131826079));
    ds(this.ttF, this.ttE);
    Hm(this.ttG);
    AppMethodBeat.o(46449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.ui.CheckBoxWithTipIconPreference
 * JD-Core Version:    0.6.2
 */
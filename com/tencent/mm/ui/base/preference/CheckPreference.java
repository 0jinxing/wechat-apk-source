package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CheckPreference extends Preference
{
  private TextView ttD;
  private int ttE;
  private String ttF;
  private int ttG;
  public boolean uOT;
  private CheckBox yBq;
  public int yBr;

  public CheckPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CheckPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107141);
    this.uOT = false;
    this.ttE = -1;
    this.ttF = "";
    this.ttG = 8;
    this.yBr = -1;
    setLayoutResource(2130970206);
    AppMethodBeat.o(107141);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(107143);
    super.onBindView(paramView);
    this.yBq = ((CheckBox)paramView.findViewById(2131820932));
    this.yBq.setChecked(this.uOT);
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
    paramView = (LinearLayout.LayoutParams)this.yBq.getLayoutParams();
    if (-1 != this.yBr)
      paramView.setMargins(paramView.leftMargin, paramView.topMargin, this.yBr, paramView.bottomMargin);
    AppMethodBeat.o(107143);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107142);
    paramViewGroup = super.onCreateView(paramViewGroup);
    AppMethodBeat.o(107142);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.CheckPreference
 * JD-Core Version:    0.6.2
 */
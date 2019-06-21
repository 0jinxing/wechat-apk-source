package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class RadioCheckPreference extends Preference
{
  private TextView ttD;
  private int ttE;
  private String ttF;
  private int ttG;
  private boolean uOT;
  private CheckBox yBq;
  private int yBr;

  public RadioCheckPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public RadioCheckPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107286);
    this.uOT = false;
    this.ttE = -1;
    this.ttF = "";
    this.ttG = 8;
    this.yBr = -1;
    setLayoutResource(2130970127);
    AppMethodBeat.o(107286);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(107288);
    super.onBindView(paramView);
    NW(8);
    this.yBq = ((CheckBox)paramView.findViewById(2131826080));
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
    AppMethodBeat.o(107288);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107287);
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970209, paramViewGroup);
    AppMethodBeat.o(107287);
    return localView;
  }

  public final void qg(boolean paramBoolean)
  {
    AppMethodBeat.i(107289);
    this.uOT = paramBoolean;
    if (this.yBq != null)
      this.yBq.setChecked(paramBoolean);
    AppMethodBeat.o(107289);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.RadioCheckPreference
 * JD-Core Version:    0.6.2
 */
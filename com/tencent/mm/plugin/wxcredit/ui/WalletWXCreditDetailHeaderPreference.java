package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletWXCreditDetailHeaderPreference extends Preference
{
  TextView gng;
  private LayoutInflater mInflater;
  TextView uZu;

  public WalletWXCreditDetailHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public WalletWXCreditDetailHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(48717);
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(2130970127);
    AppMethodBeat.o(48717);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(48719);
    super.onBindView(paramView);
    this.gng = ((TextView)paramView.findViewById(2131829093));
    this.uZu = ((TextView)paramView.findViewById(2131829092));
    AppMethodBeat.o(48719);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(48718);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    this.mInflater.inflate(2130971187, localViewGroup);
    AppMethodBeat.o(48718);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailHeaderPreference
 * JD-Core Version:    0.6.2
 */
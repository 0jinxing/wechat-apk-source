package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletWXCreditDetailFooterPreference extends Preference
  implements View.OnClickListener
{
  private LayoutInflater mInflater;
  View.OnClickListener qqV;
  private TextView uZs;
  private TextView uZt;

  public WalletWXCreditDetailFooterPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public WalletWXCreditDetailFooterPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(48713);
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(2130970127);
    AppMethodBeat.o(48713);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(48715);
    super.onBindView(paramView);
    this.uZs = ((TextView)paramView.findViewById(2131829090));
    this.uZt = ((TextView)paramView.findViewById(2131829091));
    this.uZs.setOnClickListener(this);
    this.uZt.setOnClickListener(this);
    AppMethodBeat.o(48715);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(48716);
    if (this.qqV != null)
      this.qqV.onClick(paramView);
    AppMethodBeat.o(48716);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(48714);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    this.mInflater.inflate(2130971186, localViewGroup);
    AppMethodBeat.o(48714);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailFooterPreference
 * JD-Core Version:    0.6.2
 */
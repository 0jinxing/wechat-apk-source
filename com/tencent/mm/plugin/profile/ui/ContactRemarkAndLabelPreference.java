package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactRemarkAndLabelPreference extends Preference
{
  private TextView iDT;
  private String lYc;
  private Context mContext;
  private TextView pmh;
  private TextView pmi;
  private boolean pmj;
  private String pmk;
  private String pml;

  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.pmj = false;
    this.mContext = paramContext;
  }

  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23428);
    this.pmj = false;
    this.mContext = paramContext;
    setLayoutResource(2130970127);
    AppMethodBeat.o(23428);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23430);
    this.iDT = ((TextView)paramView.findViewById(2131820678));
    this.pmh = ((TextView)paramView.findViewById(2131826049));
    this.pmi = ((TextView)paramView.findViewById(2131826050));
    RelativeLayout.LayoutParams localLayoutParams;
    if ((this.iDT != null) && (!bo.isNullOrNil(this.lYc)))
    {
      this.iDT.setVisibility(0);
      this.iDT.setText(this.lYc);
      localLayoutParams = (RelativeLayout.LayoutParams)this.iDT.getLayoutParams();
      localLayoutParams.width = a.al(this.mContext, 2131427668);
      this.iDT.setLayoutParams(localLayoutParams);
    }
    if (this.pmh != null)
      if (!this.pmj)
      {
        this.pmh.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        i = 0;
        if (!bo.isNullOrNil(this.pmk))
        {
          this.pmh.setVisibility(0);
          this.pmh.setText(j.b(this.mContext, bo.nullAsNil(this.pmk), this.pmh.getTextSize()));
        }
      }
    for (int i = 1; ; i = 0)
    {
      int j = i;
      if (this.pmi != null)
      {
        j = i;
        if (!bo.isNullOrNil(this.pml))
        {
          j = i | 0x2;
          this.pmi.setVisibility(0);
          this.pmi.setText(this.pml);
        }
      }
      if (j == 1)
        ((RelativeLayout.LayoutParams)this.pmh.getLayoutParams()).addRule(15);
      if (j == 2)
      {
        localLayoutParams = (RelativeLayout.LayoutParams)this.pmi.getLayoutParams();
        localLayoutParams.addRule(3, 0);
        localLayoutParams.addRule(15);
      }
      super.onBindView(paramView);
      AppMethodBeat.o(23430);
      return;
      this.pmh.setVisibility(0);
      this.pmh.setCompoundDrawablesWithIntrinsicBounds(2131231060, 0, 0, 0);
      i = 1;
      break;
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23429);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970164, localViewGroup);
    AppMethodBeat.o(23429);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactRemarkAndLabelPreference
 * JD-Core Version:    0.6.2
 */
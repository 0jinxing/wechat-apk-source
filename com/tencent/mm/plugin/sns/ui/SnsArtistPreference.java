package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class SnsArtistPreference extends Preference
{
  private MMActivity crP;
  private String mTitle;
  private String pnJ;
  private int qle;
  private int qlf;
  private TextView rph;
  private String rpi;

  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(38733);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(38733);
  }

  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38734);
    this.pnJ = "";
    this.mTitle = "";
    this.qle = -1;
    this.qlf = 8;
    this.rph = null;
    this.rpi = "";
    this.crP = ((MMActivity)paramContext);
    setLayoutResource(2130970127);
    AppMethodBeat.o(38734);
  }

  private void csN()
  {
    AppMethodBeat.i(38735);
    if ((this.rph != null) && (this.rpi != null) && (!this.rpi.equals("")) && (this.crP != null))
    {
      String str = this.crP.getString(2131303264, new Object[] { this.rpi });
      this.rph.setText(str);
    }
    AppMethodBeat.o(38735);
  }

  public final void ZE(String paramString)
  {
    AppMethodBeat.i(38738);
    this.rpi = paramString;
    csN();
    AppMethodBeat.o(38738);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(38737);
    super.onBindView(paramView);
    this.rph = ((TextView)paramView.findViewById(2131826015));
    ((TextView)paramView.findViewById(2131826014)).setText(this.mTitle);
    paramView = (TextView)paramView.findViewById(2131822348);
    if (paramView != null)
    {
      paramView.setVisibility(this.qlf);
      paramView.setText(this.pnJ);
      if (this.qle != -1)
        paramView.setBackgroundDrawable(a.g(this.crP, this.qle));
    }
    csN();
    AppMethodBeat.o(38737);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(38736);
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    this.mTitle = this.crP.getString(2131303265);
    localLayoutInflater.inflate(2130970129, paramViewGroup);
    AppMethodBeat.o(38736);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsArtistPreference
 * JD-Core Version:    0.6.2
 */
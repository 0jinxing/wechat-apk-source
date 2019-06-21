package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletSecuritySettingHeaderPref extends Preference
{
  private MMActivity crP;
  private TextView iOc;
  String lYc;
  ImageView rnN;
  TextView tsA;
  String tsB;
  String tsC;
  View.OnClickListener tsD;
  View.OnClickListener tsE;
  private TextView tsz;

  public WalletSecuritySettingHeaderPref(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(46389);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(46389);
  }

  public WalletSecuritySettingHeaderPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(46390);
    this.tsD = null;
    this.tsE = null;
    this.crP = ((MMActivity)paramContext);
    setLayoutResource(2130971163);
    AppMethodBeat.o(46390);
  }

  final void cu()
  {
    AppMethodBeat.i(46392);
    if ((!bo.isNullOrNil(this.lYc)) && (this.iOc != null))
    {
      this.iOc.setText(this.lYc);
      this.iOc.setVisibility(0);
    }
    if ((!bo.isNullOrNil(this.tsB)) && (this.tsz != null))
    {
      this.tsz.setText(this.tsB);
      this.tsz.setVisibility(0);
    }
    if ((!bo.isNullOrNil(this.tsC)) && (this.tsA != null))
    {
      this.tsA.setText(this.tsC);
      this.tsA.setVisibility(0);
    }
    if ((bo.isNullOrNil(this.tsC)) && (this.tsA != null))
      this.tsA.setVisibility(8);
    AppMethodBeat.o(46392);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(46391);
    super.onBindView(paramView);
    ab.v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo onBindView");
    this.iOc = ((TextView)paramView.findViewById(2131824519));
    this.tsz = ((TextView)paramView.findViewById(2131821095));
    this.tsA = ((TextView)paramView.findViewById(2131829049));
    this.rnN = ((ImageView)paramView.findViewById(2131829048));
    cu();
    if ((this.tsA != null) && (this.tsD != null))
      this.tsA.setOnClickListener(this.tsD);
    if ((this.rnN != null) && (this.tsE != null))
      this.rnN.setOnClickListener(this.tsE);
    AppMethodBeat.o(46391);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref
 * JD-Core Version:    0.6.2
 */
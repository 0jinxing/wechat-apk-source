package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

final class WalletUniversalPayOrderUI$b
{
  public View iym;
  public CdnImageView ttA;
  public TextView ttB;
  public ImageView ttC;

  public WalletUniversalPayOrderUI$b(View paramView)
  {
    AppMethodBeat.i(46438);
    this.iym = paramView;
    this.ttA = ((CdnImageView)paramView.findViewById(2131828777));
    this.ttB = ((TextView)paramView.findViewById(2131828778));
    this.ttC = ((ImageView)paramView.findViewById(2131828779));
    AppMethodBeat.o(46438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

public class WcPayCashierBankcardItemLayout extends LinearLayout
{
  public CdnImageView kqn;
  public FavourLayout tGP;
  public TextView tLJ;
  public TextView tLK;
  public RadioButton tLL;

  public WcPayCashierBankcardItemLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(47749);
    init();
    AppMethodBeat.o(47749);
  }

  public WcPayCashierBankcardItemLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(47750);
    init();
    AppMethodBeat.o(47750);
  }

  public WcPayCashierBankcardItemLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47751);
    init();
    AppMethodBeat.o(47751);
  }

  private void init()
  {
    AppMethodBeat.i(47752);
    View.inflate(getContext(), 2130971193, this);
    this.kqn = ((CdnImageView)findViewById(2131829100));
    this.tLJ = ((TextView)findViewById(2131829101));
    this.tLK = ((TextView)findViewById(2131829103));
    this.tLL = ((RadioButton)findViewById(2131829102));
    this.tGP = ((FavourLayout)findViewById(2131829104));
    AppMethodBeat.o(47752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout
 * JD-Core Version:    0.6.2
 */
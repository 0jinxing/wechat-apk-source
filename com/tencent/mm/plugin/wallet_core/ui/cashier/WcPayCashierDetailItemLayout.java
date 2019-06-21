package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

public class WcPayCashierDetailItemLayout extends LinearLayout
{
  public TextView kRK;
  public TextView pQF;
  public CdnImageView tLM;
  public CdnImageView tLN;

  public WcPayCashierDetailItemLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(47753);
    init();
    AppMethodBeat.o(47753);
  }

  public WcPayCashierDetailItemLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(47754);
    init();
    AppMethodBeat.o(47754);
  }

  public WcPayCashierDetailItemLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47755);
    init();
    AppMethodBeat.o(47755);
  }

  private void init()
  {
    AppMethodBeat.i(47756);
    View.inflate(getContext(), 2130971194, this);
    this.pQF = ((TextView)findViewById(2131829105));
    this.tLM = ((CdnImageView)findViewById(2131829106));
    this.kRK = ((TextView)findViewById(2131829107));
    this.tLN = ((CdnImageView)findViewById(2131829108));
    AppMethodBeat.o(47756);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout
 * JD-Core Version:    0.6.2
 */
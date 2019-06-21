package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.ui.e;

public final class f extends i
  implements View.OnClickListener
{
  private int gOW;
  protected View jcl;
  private View.OnClickListener pUs;

  private f(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private f(Context paramContext, byte paramByte)
  {
    super(paramContext, 2131493871);
    AppMethodBeat.i(44982);
    this.gOW = 0;
    this.jcl = View.inflate(paramContext, 2130970513, null);
    setContentView(this.jcl);
    ((Button)this.jcl.findViewById(2131822819)).setOnClickListener(this);
    ((Button)this.jcl.findViewById(2131827084)).setOnClickListener(this);
    AppMethodBeat.o(44982);
  }

  public static f a(Context paramContext, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(44985);
    ab.i("RemittanceChargeDialog", "showCostDetail");
    f localf = new f(paramContext);
    localf.gOW = paramInt;
    if (paramDouble1 == 0.0D)
      ab.i("RemittanceChargeDialog", "showCostDetail ::: remian_fee = 0");
    ((TextView)localf.findViewById(2131827080)).setText(e.G(paramDouble1));
    ((TextView)localf.findViewById(2131827081)).setText(e.G(paramDouble2));
    if (paramDouble3 == 0.0D)
      ab.e("RemittanceChargeDialog", "showCostDetail ::: transaction_costs = 0");
    ((TextView)localf.findViewById(2131827078)).setText(e.G(paramDouble3));
    localf.findViewById(2131827077).setVisibility(0);
    if (!bo.isNullOrNil(paramString))
    {
      TextView localTextView = (TextView)localf.findViewById(2131827074);
      localTextView.setText(paramString);
      localTextView.setVisibility(0);
    }
    localf.findViewById(2131827082).setVisibility(0);
    localf.pUs = paramOnClickListener;
    localf.findViewById(2131823196).setOnClickListener(new f.1(localf));
    localf.show();
    com.tencent.mm.ui.base.h.a(paramContext, localf);
    if (paramInt == 1)
      com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(10), Integer.valueOf(1) });
    while (true)
    {
      AppMethodBeat.o(44985);
      return localf;
      com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    }
  }

  public static void a(Context paramContext, int paramInt, String paramString, double paramDouble)
  {
    AppMethodBeat.i(44984);
    ab.i("RemittanceChargeDialog", "showAlert");
    f localf = new f(paramContext);
    localf.gOW = paramInt;
    ab.i("RemittanceChargeDialog", "showTips");
    TextView localTextView = (TextView)localf.findViewById(2131827074);
    if (bo.isNullOrNil(paramString))
      ab.e("RemittanceChargeDialog", "desc is null");
    while (true)
    {
      ((TextView)localf.findViewById(2131827076)).setText(paramContext.getResources().getString(2131302430, new Object[] { e.G(paramDouble) }));
      localf.findViewById(2131827083).setVisibility(0);
      localf.findViewById(2131827075).setVisibility(0);
      localf.show();
      com.tencent.mm.ui.base.h.a(paramContext, localf);
      AppMethodBeat.o(44984);
      return;
      localTextView.setText(paramString);
      localTextView.setVisibility(0);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44983);
    if (paramView.getId() != 2131823196)
    {
      ab.i("RemittanceChargeDialog", "click cancel");
      dismiss();
    }
    if (paramView.getId() == 2131822819)
      if (this.gOW == 1)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(11), Integer.valueOf(1) });
        AppMethodBeat.o(44983);
      }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(12689, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
      AppMethodBeat.o(44983);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.f
 * JD-Core Version:    0.6.2
 */
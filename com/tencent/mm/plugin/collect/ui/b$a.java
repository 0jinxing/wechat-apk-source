package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletTextView;

final class b$a
{
  TextView kEq;
  WalletTextView kFm;
  TextView kFn;
  TextView kvI;

  public b$a(View paramView)
  {
    AppMethodBeat.i(41178);
    this.kvI = ((TextView)paramView.findViewById(2131822836));
    this.kFn = ((TextView)paramView.findViewById(2131822837));
    this.kFm = ((WalletTextView)paramView.findViewById(2131822838));
    this.kEq = ((TextView)paramView.findViewById(2131822839));
    AppMethodBeat.o(41178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.b.a
 * JD-Core Version:    0.6.2
 */
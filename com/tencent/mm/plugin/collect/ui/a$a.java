package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletTextView;

final class a$a
{
  TextView kEq;
  WalletTextView kFm;
  TextView kvI;

  public a$a(View paramView)
  {
    AppMethodBeat.i(41168);
    this.kvI = ((TextView)paramView.findViewById(2131822829));
    this.kFm = ((WalletTextView)paramView.findViewById(2131822830));
    this.kEq = ((TextView)paramView.findViewById(2131822831));
    AppMethodBeat.o(41168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.a.a
 * JD-Core Version:    0.6.2
 */
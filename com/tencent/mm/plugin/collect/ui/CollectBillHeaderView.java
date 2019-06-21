package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.model.e;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public class CollectBillHeaderView extends LinearLayout
{
  private TextView kEq;
  private WalletTextView kFm;
  private TextView kFn;
  private TextView kvI;

  public CollectBillHeaderView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(41173);
    init(paramContext);
    AppMethodBeat.o(41173);
  }

  public CollectBillHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(41174);
    init(paramContext);
    AppMethodBeat.o(41174);
  }

  public CollectBillHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(41175);
    init(paramContext);
    AppMethodBeat.o(41175);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(41176);
    paramContext = v.hu(paramContext).inflate(2130969152, this);
    this.kvI = ((TextView)paramContext.findViewById(2131822825));
    this.kFn = ((TextView)paramContext.findViewById(2131822826));
    this.kFm = ((WalletTextView)paramContext.findViewById(2131822827));
    this.kEq = ((TextView)paramContext.findViewById(2131822828));
    AppMethodBeat.o(41176);
  }

  public final void a(int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    AppMethodBeat.i(41177);
    this.kvI.setText(e.a(getContext(), paramLong, paramInt3));
    this.kFm.setText(e.tG(paramInt2));
    this.kEq.setText(getContext().getString(2131298356, new Object[] { Integer.valueOf(paramInt1) }));
    AppMethodBeat.o(41177);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillHeaderView
 * JD-Core Version:    0.6.2
 */
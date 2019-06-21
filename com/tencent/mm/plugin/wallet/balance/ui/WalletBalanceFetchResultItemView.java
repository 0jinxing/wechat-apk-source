package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public class WalletBalanceFetchResultItemView extends LinearLayout
{
  private TextView iDT;
  private TextView kEq;
  private boolean pNa;

  public WalletBalanceFetchResultItemView(Context paramContext)
  {
    this(paramContext, false);
  }

  public WalletBalanceFetchResultItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(45342);
    this.pNa = false;
    init();
    AppMethodBeat.o(45342);
  }

  public WalletBalanceFetchResultItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(45343);
    this.pNa = false;
    init();
    AppMethodBeat.o(45343);
  }

  public WalletBalanceFetchResultItemView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(45341);
    this.pNa = false;
    this.pNa = paramBoolean;
    init();
    AppMethodBeat.o(45341);
  }

  private void init()
  {
    AppMethodBeat.i(45344);
    if (this.pNa)
      inflate(getContext(), 2130968815, this);
    while (true)
    {
      this.iDT = ((TextView)findViewById(2131821640));
      this.kEq = ((TextView)findViewById(2131821641));
      AppMethodBeat.o(45344);
      return;
      inflate(getContext(), 2130968814, this);
    }
  }

  public final void a(String paramString1, CharSequence paramCharSequence, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(45345);
    this.iDT.setText(paramString1);
    if (!bo.isNullOrNil(paramString2))
      this.iDT.setTextColor(Color.parseColor(paramString2));
    if (paramBoolean)
      this.kEq.setText(j.b(getContext(), paramCharSequence, this.kEq.getTextSize()));
    while (true)
    {
      if (!bo.isNullOrNil(paramString3))
        this.kEq.setTextColor(Color.parseColor(paramString3));
      AppMethodBeat.o(45345);
      return;
      this.kEq.setText(paramCharSequence);
    }
  }

  public final void b(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(45346);
    a(getContext().getString(paramInt), paramCharSequence, "", "", false);
    AppMethodBeat.o(45346);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView
 * JD-Core Version:    0.6.2
 */
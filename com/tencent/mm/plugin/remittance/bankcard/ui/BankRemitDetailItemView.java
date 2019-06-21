package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;

public class BankRemitDetailItemView extends LinearLayout
{
  private TextView iDT;
  private TextView kEq;
  private boolean pNa;

  public BankRemitDetailItemView(Context paramContext)
  {
    this(paramContext, false);
  }

  public BankRemitDetailItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(44589);
    this.pNa = false;
    init();
    AppMethodBeat.o(44589);
  }

  public BankRemitDetailItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(44590);
    this.pNa = false;
    init();
    AppMethodBeat.o(44590);
  }

  public BankRemitDetailItemView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(44588);
    this.pNa = false;
    this.pNa = paramBoolean;
    init();
    AppMethodBeat.o(44588);
  }

  private void init()
  {
    AppMethodBeat.i(44591);
    if (this.pNa)
      inflate(getContext(), 2130968815, this);
    while (true)
    {
      this.iDT = ((TextView)findViewById(2131821640));
      this.kEq = ((TextView)findViewById(2131821641));
      AppMethodBeat.o(44591);
      return;
      inflate(getContext(), 2130968814, this);
    }
  }

  public final void a(String paramString, CharSequence paramCharSequence, boolean paramBoolean)
  {
    AppMethodBeat.i(44592);
    this.iDT.setText(paramString);
    if (paramBoolean)
    {
      this.kEq.setText(j.b(getContext(), paramCharSequence, this.kEq.getTextSize()));
      AppMethodBeat.o(44592);
    }
    while (true)
    {
      return;
      this.kEq.setText(paramCharSequence);
      AppMethodBeat.o(44592);
    }
  }

  public final void b(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(44593);
    a(getContext().getString(paramInt), paramCharSequence, false);
    AppMethodBeat.o(44593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView
 * JD-Core Version:    0.6.2
 */
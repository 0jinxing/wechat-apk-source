package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class SwitchPhoneItemView extends RelativeLayout
{
  private int tNA;
  private TextView tNx;
  private TextView tNy;
  ImageView tNz;

  public SwitchPhoneItemView(Context paramContext)
  {
    this(paramContext, 0);
  }

  public SwitchPhoneItemView(Context paramContext, int paramInt)
  {
    super(paramContext);
    AppMethodBeat.i(47884);
    this.tNA = 0;
    this.tNA = paramInt;
    cA(paramContext);
    AppMethodBeat.o(47884);
  }

  public SwitchPhoneItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(47885);
    this.tNA = 0;
    cA(paramContext);
    AppMethodBeat.o(47885);
  }

  public SwitchPhoneItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47886);
    this.tNA = 0;
    cA(paramContext);
    AppMethodBeat.o(47886);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(47887);
    if (this.tNA > 0);
    for (paramContext = inflate(paramContext, this.tNA, this); ; paramContext = inflate(paramContext, 2130971173, this))
    {
      this.tNx = ((TextView)paramContext.findViewById(2131829066));
      this.tNy = ((TextView)paramContext.findViewById(2131829067));
      this.tNz = ((ImageView)paramContext.findViewById(2131829068));
      AppMethodBeat.o(47887);
      return;
    }
  }

  public final void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    AppMethodBeat.i(47888);
    if (!bo.ac(paramCharSequence1))
    {
      this.tNx.setText(paramCharSequence1);
      if (bo.ac(paramCharSequence2))
        break label89;
      this.tNy.setMaxLines(2);
      this.tNy.setSelected(true);
      this.tNy.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      this.tNy.setText(paramCharSequence2);
      this.tNy.setMovementMethod(LinkMovementMethod.getInstance());
      AppMethodBeat.o(47888);
    }
    while (true)
    {
      return;
      this.tNx.setVisibility(8);
      break;
      label89: this.tNy.setVisibility(8);
      AppMethodBeat.o(47888);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView
 * JD-Core Version:    0.6.2
 */
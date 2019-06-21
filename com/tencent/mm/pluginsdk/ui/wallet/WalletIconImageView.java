package com.tencent.mm.pluginsdk.ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WalletIconImageView extends ImageView
{
  private int uf = 4;
  private int vvZ = -1;
  private View.OnClickListener vwa = null;

  public WalletIconImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public WalletIconImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void dlG()
  {
    AppMethodBeat.i(48768);
    super.setVisibility(this.uf);
    super.setImageResource(this.vvZ);
    super.setOnClickListener(this.vwa);
    AppMethodBeat.o(48768);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(48765);
    this.vvZ = paramInt;
    super.setImageResource(paramInt);
    AppMethodBeat.o(48765);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.vwa = paramOnClickListener;
  }

  public void setToClearState(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(48767);
    super.setVisibility(0);
    super.setImageResource(2130839158);
    super.setContentDescription(getContext().getString(2131298329));
    super.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(48767);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(48766);
    this.uf = paramInt;
    super.setVisibility(paramInt);
    AppMethodBeat.o(48766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView
 * JD-Core Version:    0.6.2
 */
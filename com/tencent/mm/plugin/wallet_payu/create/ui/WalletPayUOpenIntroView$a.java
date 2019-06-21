package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_payu.create.a.d;
import java.util.ArrayList;

final class WalletPayUOpenIntroView$a extends p
{
  private WalletPayUOpenIntroView$a(WalletPayUOpenIntroView paramWalletPayUOpenIntroView)
  {
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(48392);
    paramViewGroup.removeView((View)WalletPayUOpenIntroView.d(this.tTn).get(paramInt));
    AppMethodBeat.o(48392);
  }

  public final int getCount()
  {
    AppMethodBeat.i(48390);
    int i;
    if (WalletPayUOpenIntroView.c(this.tTn) == null)
    {
      i = 0;
      AppMethodBeat.o(48390);
    }
    while (true)
    {
      return i;
      i = WalletPayUOpenIntroView.c(this.tTn).length;
      AppMethodBeat.o(48390);
    }
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(48391);
    View localView = (View)WalletPayUOpenIntroView.d(this.tTn).get(paramInt);
    paramViewGroup.addView(localView);
    paramViewGroup = WalletPayUOpenIntroView.c(this.tTn)[paramInt];
    ImageView localImageView = (ImageView)localView.findViewById(2131822233);
    TextView localTextView1 = (TextView)localView.findViewById(2131825188);
    TextView localTextView2 = (TextView)localView.findViewById(2131826518);
    localImageView.setImageResource(paramViewGroup.tTh);
    localTextView1.setText(paramViewGroup.titleRes);
    localTextView2.setText(paramViewGroup.tTi);
    AppMethodBeat.o(48391);
    return localView;
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView.a
 * JD-Core Version:    0.6.2
 */
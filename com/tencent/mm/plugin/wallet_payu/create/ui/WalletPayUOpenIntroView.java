package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_payu.create.a.d;
import com.tencent.mm.ui.base.MMAutoHeightViewPager;
import com.tencent.mm.ui.base.MMPageControlView;
import java.util.ArrayList;

public class WalletPayUOpenIntroView extends LinearLayout
{
  private ArrayList<View> asv;
  private Context mContext;
  private MMAutoHeightViewPager tTj;
  private MMPageControlView tTk;
  private WalletPayUOpenIntroView.a tTl;
  private d[] tTm;

  public WalletPayUOpenIntroView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public WalletPayUOpenIntroView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(48393);
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(2130970357, this, true);
    this.tTj = ((MMAutoHeightViewPager)paramContext.findViewById(2131823829));
    this.tTk = ((MMPageControlView)paramContext.findViewById(2131826517));
    this.tTk.setVisibility(0);
    this.tTj.setOnPageChangeListener(new WalletPayUOpenIntroView.1(this));
    AppMethodBeat.o(48393);
  }

  public void setPagerData(d[] paramArrayOfd)
  {
    AppMethodBeat.i(48394);
    this.tTm = paramArrayOfd;
    this.asv = new ArrayList();
    if (this.tTm != null)
      for (i = 0; i < this.tTm.length; i++)
      {
        paramArrayOfd = LayoutInflater.from(this.mContext).inflate(2130970358, null);
        this.asv.add(paramArrayOfd);
      }
    this.tTl = new WalletPayUOpenIntroView.a(this, (byte)0);
    this.tTj.setAdapter(this.tTl);
    paramArrayOfd = this.tTk;
    if (this.tTm == null);
    for (int i = 0; ; i = this.tTm.length)
    {
      paramArrayOfd.hj(i, 0);
      AppMethodBeat.o(48394);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView
 * JD-Core Version:    0.6.2
 */
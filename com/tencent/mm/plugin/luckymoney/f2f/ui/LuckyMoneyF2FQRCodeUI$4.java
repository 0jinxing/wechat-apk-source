package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.util.Pair;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.f2f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Queue;

final class LuckyMoneyF2FQRCodeUI$4
  implements ShuffleView.a
{
  LuckyMoneyF2FQRCodeUI$4(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
  }

  public final void a(ValueAnimator paramValueAnimator, View paramView)
  {
    AppMethodBeat.i(42173);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f == 0.0F)
    {
      LuckyMoneyF2FQRCodeUI.a(this.nVw, paramView.getTranslationX());
      LuckyMoneyF2FQRCodeUI.b(this.nVw, paramView.getTranslationY());
      paramView.findViewById(2131825501).setVisibility(0);
    }
    paramView.setTranslationX((1.0F - f) * LuckyMoneyF2FQRCodeUI.A(this.nVw));
    paramView.setTranslationY((1.0F - f) * LuckyMoneyF2FQRCodeUI.B(this.nVw) - (LuckyMoneyF2FQRCodeUI.c(this.nVw).getHeight() + LuckyMoneyF2FQRCodeUI.B(this.nVw) * 8.0F) * f);
    paramView.setScaleX(0.5F * f + 1.0F);
    paramView.setScaleY(0.5F * f + 1.0F);
    paramValueAnimator = (Pair)LuckyMoneyF2FQRCodeUI.f(this.nVw).peek();
    if ((paramValueAnimator != null) && (!bo.isNullOrNil(LuckyMoneyF2FQRCodeUI.C(this.nVw))) && (LuckyMoneyF2FQRCodeUI.C(this.nVw).equals(paramValueAnimator.first)))
      LuckyMoneyF2FQRCodeUI.D(this.nVw).setAlpha(f);
    ab.i("LuckyMoneyF2FQRCodeUI", "fireworkBottomLayer %f", new Object[] { Float.valueOf(f) });
    if (f >= 0.9F)
    {
      paramView.setAlpha((1.0F - f) * 10.0F);
      LuckyMoneyF2FQRCodeUI.E(this.nVw).setAlpha(1.0F - (1.0F - f) * 10.0F);
      LuckyMoneyF2FQRCodeUI.E(this.nVw).setScaleX(f);
      LuckyMoneyF2FQRCodeUI.E(this.nVw).setScaleY(f);
      LuckyMoneyF2FQRCodeUI.E(this.nVw).setVisibility(0);
    }
    if (f == 1.0F)
    {
      LuckyMoneyF2FQRCodeUI.F(this.nVw).jU("packet_received.m4a");
      LuckyMoneyF2FQRCodeUI.c(this.nVw).removeView(LuckyMoneyF2FQRCodeUI.c(this.nVw).getExitView());
      LuckyMoneyF2FQRCodeUI.G(this.nVw);
      LuckyMoneyF2FQRCodeUI.H(this.nVw).start();
    }
    AppMethodBeat.o(42173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.4
 * JD-Core Version:    0.6.2
 */
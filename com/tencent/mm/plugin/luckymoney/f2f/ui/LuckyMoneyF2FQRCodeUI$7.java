package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class LuckyMoneyF2FQRCodeUI$7
  implements SensorEventListener
{
  final int nVA;
  float nVB;
  int nVC;
  ValueAnimator nVD;
  float neH;

  LuckyMoneyF2FQRCodeUI$7(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
    AppMethodBeat.i(42179);
    this.nVA = 3;
    this.nVB = a.al(ah.getContext(), 2131427796);
    AppMethodBeat.o(42179);
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    AppMethodBeat.i(42181);
    ab.i("LuckyMoneyF2FQRCodeUI", "onAccuracyChanged");
    AppMethodBeat.o(42181);
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f1 = -3.0F;
    AppMethodBeat.i(42180);
    float f2;
    if (paramSensorEvent.sensor.getType() == 1)
    {
      if (LuckyMoneyF2FQRCodeUI.g(this.nVw) <= 0)
        AppMethodBeat.o(42180);
      while (true)
      {
        return;
        if (this.nVC == 0)
          this.nVC = (f.de(this.nVw) + (int)this.nVB);
        f2 = paramSensorEvent.values[1];
        if (Math.abs(f2 - this.neH) >= 0.05D)
          break;
        AppMethodBeat.o(42180);
      }
      this.neH = f2;
      ab.d("LuckyMoneyF2FQRCodeUI", "[onSensorChanged] y:%s ", new Object[] { Float.valueOf(f2) });
      if (f2 >= -3.0F)
        break label250;
    }
    while (true)
    {
      f1 = f1 / 3.0F * this.nVC + this.nVC;
      ab.d("LuckyMoneyF2FQRCodeUI", "paddingTop:%s nowPaddingTop:%s", new Object[] { Float.valueOf(f1), Integer.valueOf(LuckyMoneyF2FQRCodeUI.N(this.nVw).getPaddingTop()) });
      if (this.nVD != null)
        this.nVD.cancel();
      this.nVD = ValueAnimator.ofFloat(new float[] { LuckyMoneyF2FQRCodeUI.N(this.nVw).getPaddingTop(), f1 }).setDuration(200L);
      this.nVD.addUpdateListener(new LuckyMoneyF2FQRCodeUI.7.1(this));
      this.nVD.start();
      AppMethodBeat.o(42180);
      break;
      label250: if (f2 > 0.0F)
        f1 = 0.0F;
      else
        f1 = f2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.7
 * JD-Core Version:    0.6.2
 */
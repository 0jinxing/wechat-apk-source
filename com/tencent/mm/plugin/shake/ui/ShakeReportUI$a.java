package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.d.a;
import com.tencent.mm.pluginsdk.ui.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.o;
import java.lang.ref.WeakReference;

final class ShakeReportUI$a extends d.a
{
  private final long[] gjH;
  private Vibrator kgA;
  private long mfT;
  WeakReference<ShakeReportUI> qwq;

  public ShakeReportUI$a(ShakeReportUI paramShakeReportUI)
  {
    AppMethodBeat.i(24812);
    this.mfT = bo.yz();
    this.gjH = new long[] { 300L, 200L, 300L, 200L };
    this.qwq = new WeakReference(paramShakeReportUI);
    AppMethodBeat.o(24812);
  }

  public final void bUT()
  {
    AppMethodBeat.i(24813);
    ShakeReportUI localShakeReportUI = (ShakeReportUI)this.qwq.get();
    if (localShakeReportUI == null)
      AppMethodBeat.o(24813);
    long l;
    while (true)
    {
      return;
      if (localShakeReportUI.isFinishing())
      {
        ab.e("MicroMsg.ShakeReportUI", "ui finished");
        AppMethodBeat.o(24813);
      }
      else if (!ShakeReportUI.v(localShakeReportUI))
      {
        ab.i("MicroMsg.ShakeReportUI", "tryShake the status is can's shake");
        AppMethodBeat.o(24813);
      }
      else
      {
        ShakeReportUI.w(localShakeReportUI);
        l = bo.az(this.mfT);
        if (l >= 1200L)
          break;
        ab.i("MicroMsg.ShakeReportUI", "tryStartShake delay too short:".concat(String.valueOf(l)));
        AppMethodBeat.o(24813);
      }
    }
    ab.w("MicroMsg.ShakeReportUI", "tryStartShake delaytoo enough:".concat(String.valueOf(l)));
    this.mfT = bo.yz();
    Object localObject;
    if (ShakeReportUI.x(localShakeReportUI) != null)
    {
      localObject = ShakeReportUI.x(localShakeReportUI);
      if (((c)localObject).view != null)
        ((c)localObject).view.setKeepScreenOn(true);
      ((c)localObject).che.ae(30000L, 30000L);
    }
    if (ShakeReportUI.y(localShakeReportUI) != null)
    {
      localObject = ShakeReportUI.y(localShakeReportUI);
      if (((f)localObject).vhB != null)
        ((f)localObject).vhB.dismiss();
    }
    if (ShakeReportUI.z(localShakeReportUI))
    {
      localObject = (ShakeReportUI)this.qwq.get();
      if (localObject != null)
        ay.au((Context)localObject, 2131303465);
    }
    while (true)
    {
      reset();
      ShakeReportUI.A(localShakeReportUI);
      AppMethodBeat.o(24813);
      break;
      localObject = (ShakeReportUI)this.qwq.get();
      if (localObject != null)
      {
        if (this.kgA == null)
          this.kgA = ((Vibrator)((ShakeReportUI)localObject).getSystemService("vibrator"));
        if (this.kgA != null)
          this.kgA.vibrate(this.gjH, -1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.a
 * JD-Core Version:    0.6.2
 */
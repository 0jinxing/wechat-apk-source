package com.tencent.mm.plugin.aa.ui;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class PaylistAAUI$12
  implements Runnable
{
  PaylistAAUI$12(PaylistAAUI paramPaylistAAUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40877);
    int i = this.gpC.getWindow().getDecorView().getHeight();
    int[] arrayOfInt = new int[2];
    Object localObject = this.gpC.findViewById(2131826459);
    ((View)localObject).getLocationInWindow(arrayOfInt);
    int j = arrayOfInt[1] + ((View)localObject).getHeight();
    int k = a.fromDPToPix(this.gpC.mController.ylL, 20);
    int m = i - j - a.fromDPToPix(this.gpC.mController.ylL, 24) - a.fromDPToPix(this.gpC.mController.ylL, 12);
    int n = m;
    if (m < k)
      n = k;
    ab.d("MicroMsg.PaylistAAUI", "height: %s, h1: %s, topMargin: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(n) });
    localObject = (RelativeLayout.LayoutParams)PaylistAAUI.f(this.gpC).getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).topMargin = n;
    PaylistAAUI.f(this.gpC).setLayoutParams((ViewGroup.LayoutParams)localObject);
    AppMethodBeat.o(40877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.12
 * JD-Core Version:    0.6.2
 */
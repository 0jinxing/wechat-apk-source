package com.tencent.mm.plugin.order.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x.a;

final class MallOrderProductListUI$b
  implements x.a
{
  String kbV;
  ImageView knb;
  TextView pdT;
  TextView pdU;
  TextView pdV;
  TextView pdW;
  TextView pdX;

  private MallOrderProductListUI$b(MallOrderProductListUI paramMallOrderProductListUI)
  {
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(43841);
    if ((paramString != null) && (paramString.equals(this.kbV)))
      this.knb.post(new MallOrderProductListUI.b.1(this, paramBitmap));
    AppMethodBeat.o(43841);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderProductListUI.b
 * JD-Core Version:    0.6.2
 */
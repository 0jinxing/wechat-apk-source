package com.tencent.mm.plugin.order.ui.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.wallet_core.ui.c;

final class a$4
  implements View.OnClickListener
{
  a$4(a parama, Bitmap paramBitmap, MallTransactionObject paramMallTransactionObject)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43888);
    if (this.pes.peq != null)
    {
      a locala = this.pes;
      Bitmap localBitmap = this.val$bmp;
      String str = this.pbT.pci;
      if (locala.peq != null)
      {
        locala.peq.iw(str, str);
        locala.peq.oZz = localBitmap;
        locala.peq.oZA = localBitmap;
        locala.peq.dOv();
      }
      this.pes.peq.G(paramView, true);
    }
    AppMethodBeat.o(43888);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a.4
 * JD-Core Version:    0.6.2
 */
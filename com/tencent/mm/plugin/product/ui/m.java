package com.tencent.mm.plugin.product.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.product.b.n.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
  implements x.a
{
  public TextView gne;
  public ImageView iyo;
  public n.a pjH;

  public final void m(String paramString, final Bitmap paramBitmap)
  {
    AppMethodBeat.i(44138);
    if ((this.pjH == null) || (bo.isNullOrNil(this.pjH.iconUrl)))
      AppMethodBeat.o(44138);
    while (true)
    {
      return;
      if (paramString.equals(this.pjH.iconUrl))
        this.iyo.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(44137);
            m.this.iyo.setImageBitmap(paramBitmap);
            AppMethodBeat.o(44137);
          }
        });
      AppMethodBeat.o(44138);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.m
 * JD-Core Version:    0.6.2
 */
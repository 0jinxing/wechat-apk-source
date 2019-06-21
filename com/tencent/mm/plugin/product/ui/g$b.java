package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.sdk.platformtools.ab;

final class g$b
  implements x.a
{
  public ImageView cDh;
  public String url;

  public g$b(g paramg, String paramString)
  {
    AppMethodBeat.i(44071);
    this.cDh = null;
    this.url = paramString;
    this.cDh = ((ImageView)((LayoutInflater)paramg.mContext.getSystemService("layout_inflater")).inflate(2130970388, null));
    paramString = x.a(new c(paramString));
    this.cDh.setImageBitmap(paramString);
    this.cDh.setOnClickListener(new g.b.1(this, paramg));
    x.a(this);
    AppMethodBeat.o(44071);
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(44072);
    StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(", bitmap = ");
    boolean bool;
    if (paramBitmap == null)
    {
      bool = true;
      ab.d("MicroMsg.MallProductImageAdapter", bool);
      if (this.url != null)
        break label62;
      AppMethodBeat.o(44072);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label62: if (paramString.equals(this.url))
        this.cDh.post(new g.b.2(this, paramBitmap));
      AppMethodBeat.o(44072);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.g.b
 * JD-Core Version:    0.6.2
 */
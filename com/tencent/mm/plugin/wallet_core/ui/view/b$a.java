package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a
  implements x.a
{
  public ViewGroup tNj = null;
  public e tNk;
  public ViewGroup tNl = null;
  public TextView tNm = null;
  public ImageView tNn = null;
  public TextView tNo = null;
  public TextView tlp = null;
  public TextView tlq = null;
  public TextView tlr = null;
  public ImageView tlt = null;
  public ImageView tlu = null;
  public TextView tlv = null;
  public TextView tlw = null;
  public TextView tlx = null;

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(47875);
    StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(", bitmap = ");
    boolean bool;
    if (paramBitmap == null)
    {
      bool = true;
      ab.d("MicroMsg.BankcardListAdapter", bool);
      if (this.tNk != null)
        break label62;
      AppMethodBeat.o(47875);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label62: if (paramString.equals(this.tNk.oRi))
        this.tlu.post(new b.a.1(this, paramBitmap));
      if ((paramString.equals(this.tNk.txq)) && (this.tlt != null))
        this.tlt.post(new b.a.2(this, paramBitmap));
      AppMethodBeat.o(47875);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.b.a
 * JD-Core Version:    0.6.2
 */
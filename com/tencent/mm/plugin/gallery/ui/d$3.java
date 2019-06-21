package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.gallery.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class d$3
  implements az.a
{
  private Bitmap mQQ = null;

  d$3(d paramd, String paramString)
  {
  }

  public final boolean acf()
  {
    boolean bool = true;
    AppMethodBeat.i(21487);
    if ((this.mQP.mQN == null) || (TextUtils.isEmpty(this.mQR)))
    {
      AppMethodBeat.o(21487);
      bool = false;
    }
    while (true)
    {
      return bool;
      String str = this.mQR;
      long l = bo.yz();
      Bitmap localBitmap = k.NC(str);
      ab.v("MicroMsg.ImageAdapter", "test decode: %d filePath:%s", new Object[] { Long.valueOf(bo.az(l)), str });
      this.mQQ = localBitmap;
      AppMethodBeat.o(21487);
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(21486);
    this.mQP.mQO = false;
    int i;
    if (this.mQP.mQH.containsKey(this.mQR))
    {
      i = ((Integer)this.mQP.mQH.get(this.mQR)).intValue();
      if (this.mQP.bCI())
        break label117;
      this.mQP.mQJ.put(i, this.mQQ);
    }
    while (true)
    {
      this.mQP.mQK.k(this.mQR, this.mQQ);
      this.mQQ = null;
      this.mQP.Dp();
      AppMethodBeat.o(21486);
      return false;
      label117: d.a(this.mQP, i, this.mQQ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.d.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.ipcall.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import java.lang.ref.WeakReference;

final class d$1
  implements az.a
{
  private boolean eNb = false;

  d$1(d paramd, String paramString1, String paramString2, ImageView paramImageView, String paramString3)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(22015);
    Bitmap localBitmap = a.aH(this.nAR.context, this.nAQ);
    if (localBitmap != null)
    {
      this.nAR.exy.put(this.val$key, new WeakReference(localBitmap));
      this.eNb = true;
      d.a(this.nAR, this.mAX, this.val$key, localBitmap);
    }
    AppMethodBeat.o(22015);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(22016);
    if (!this.eNb)
    {
      d locald = this.nAR;
      String str1 = this.nAQ;
      String str2 = this.eiH;
      ImageView localImageView = this.mAX;
      str1 = d.eM(str1, str2);
      locald.nAP.e(new d.2(locald, str2, localImageView, str1));
    }
    AppMethodBeat.o(22016);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.d.1
 * JD-Core Version:    0.6.2
 */
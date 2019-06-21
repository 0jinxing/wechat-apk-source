package com.tencent.mm.plugin.sight.draft.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.lang.ref.WeakReference;

final class c$a
  implements Runnable
{
  String key;
  String path;
  boolean qzW;
  WeakReference<c> qzX;

  public final void run()
  {
    AppMethodBeat.i(25022);
    Bitmap localBitmap = d.aml(this.path);
    Object localObject = (c)this.qzX.get();
    if (localObject != null)
    {
      if ((!bo.isNullOrNil(this.key)) && (localBitmap != null))
        ((c)localObject).qzU.put(this.key, localBitmap);
      localObject = new c.b((byte)0);
      ((c.b)localObject).key = this.key;
      ((c.b)localObject).mQQ = localBitmap;
      ((c.b)localObject).qzX = this.qzX;
      if (this.qzW)
        al.d((Runnable)localObject);
    }
    AppMethodBeat.o(25022);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.c.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class f$4
  implements Runnable
{
  f$4(f paramf, SparseArray paramSparseArray, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79929);
    ab.i("MicroMsg.ImageEngine", "begin do recycled");
    for (int i = 0; i < this.vuD.size(); i++)
    {
      Bitmap localBitmap = (Bitmap)this.vuD.valueAt(i);
      if (localBitmap != null)
      {
        ab.d("MicroMsg.ImageEngine", "recycled def bmp %s", new Object[] { localBitmap.toString() });
        localBitmap.recycle();
      }
    }
    this.vuD.clear();
    ab.i("MicroMsg.ImageEngine", "clear drawable cache");
    this.vuE.clear();
    ab.i("MicroMsg.ImageEngine", "end do recycled");
    AppMethodBeat.o(79929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f.4
 * JD-Core Version:    0.6.2
 */
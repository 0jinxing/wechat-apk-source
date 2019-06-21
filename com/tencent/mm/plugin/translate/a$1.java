package com.tencent.mm.plugin.translate;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.translate.a.c.a;
import com.tencent.mm.plugin.translate.a.c.c;
import com.tencent.mm.sdk.platformtools.az;

final class a$1
  implements c.a
{
  a$1(a parama)
  {
  }

  public final void a(int paramInt, SparseArray<c.c> paramSparseArray)
  {
    AppMethodBeat.i(26049);
    for (int i = 0; i < paramSparseArray.size(); i++)
    {
      c.c localc = (c.c)paramSparseArray.valueAt(i);
      if (localc != null)
        this.sKq.sKm.e(new a.1.1(this, paramInt, localc));
    }
    AppMethodBeat.o(26049);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.1
 * JD-Core Version:    0.6.2
 */
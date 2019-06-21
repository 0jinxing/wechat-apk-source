package com.tencent.mm.compatible.b;

import android.media.AudioRecord;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends AudioRecord
{
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, 2, paramInt4);
    AppMethodBeat.i(92834);
    g.iN(hashCode());
    AppMethodBeat.o(92834);
  }

  public final void release()
  {
    AppMethodBeat.i(92835);
    super.release();
    g.iO(hashCode());
    AppMethodBeat.o(92835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.d
 * JD-Core Version:    0.6.2
 */
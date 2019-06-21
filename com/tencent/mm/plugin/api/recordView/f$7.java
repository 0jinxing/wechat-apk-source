package com.tencent.mm.plugin.api.recordView;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import java.nio.ByteBuffer;

final class f$7
  implements i.a
{
  f$7(f paramf, MMSightRecordView.f paramf1, ByteBuffer paramByteBuffer)
  {
  }

  public final void asB()
  {
    AppMethodBeat.i(138316);
    if (this.gMp != null)
      this.gMp.aDr();
    AppMethodBeat.o(138316);
  }

  public final ByteBuffer getBuffer()
  {
    return this.gMq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.f.7
 * JD-Core Version:    0.6.2
 */
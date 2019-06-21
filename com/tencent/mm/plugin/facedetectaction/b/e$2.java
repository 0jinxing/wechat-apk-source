package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.e.a;
import com.tencent.mm.plugin.facedetect.e.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class e$2
  implements Runnable
{
  e$2(e parame, byte[][] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(703);
    try
    {
      a.btw().EL();
      for (localObject2 : this.mcG)
        a.btw().aU((byte[])localObject2);
      ??? = a.btw();
      Object localObject2 = new com/tencent/mm/plugin/facedetectaction/b/e$2$1;
      ((e.2.1)localObject2).<init>(this);
      ((a)???).a((a.b)localObject2);
      AppMethodBeat.o(703);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceCheckVideoRecordMgr", localException, "recordFrameImpl error", new Object[0]);
        if (this.mcH.mcE != null)
          this.mcH.mcE.onError();
        AppMethodBeat.o(703);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.e.2
 * JD-Core Version:    0.6.2
 */
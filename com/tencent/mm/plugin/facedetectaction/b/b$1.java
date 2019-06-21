package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame;

final class b$1
  implements YTPoseDetectInterface.PoseDetectOnFrame
{
  b$1(b paramb)
  {
  }

  public final void onFailed(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(683);
    ab.i("MicroMsg.FaceCheckActionEngine", "detect action failed, %s %s %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    b.a(this.mcp, 4);
    h.pYm.a(917L, 43L, 1L, false);
    if (b.a(this.mcp) != null)
      b.a(this.mcp);
    AppMethodBeat.o(683);
  }

  public final void onRecordingDone(byte[][] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(684);
    if (paramArrayOfByte != null)
      ab.i("MicroMsg.FaceCheckActionEngine", "notify start record, frameDatas.length: %s, width: %s, height: %s", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    while (true)
    {
      b.a(this.mcp, 5);
      if (b.a(this.mcp) != null)
        b.a(this.mcp).a(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(684);
      return;
      ab.e("MicroMsg.FaceCheckActionEngine", "onRecordingDone, frameData is null!!");
    }
  }

  public final void onSuccess(int paramInt)
  {
    AppMethodBeat.i(682);
    ab.i("MicroMsg.FaceCheckActionEngine", "detect action success: %s", new Object[] { Integer.valueOf(paramInt) });
    b.a(this.mcp, 3);
    h.pYm.a(917L, 42L, 1L, false);
    if (b.a(this.mcp) != null)
      b.a(this.mcp);
    AppMethodBeat.o(682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.b.1
 * JD-Core Version:    0.6.2
 */
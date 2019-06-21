package com.tencent.mm.plugin.facedetect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectPrepareUI$6
  implements c
{
  FaceDetectPrepareUI$6(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
  }

  public final void aw(int paramInt, String paramString)
  {
    AppMethodBeat.i(406);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onGetConfigFailed, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(90015), paramString });
    paramInt = FaceDetectPrepareUI.vr(paramInt);
    FaceDetectPrepareUI.a(this.lXp, paramInt, 90015, paramString, this.lXp.getString(2131299475));
    AppMethodBeat.o(406);
  }

  public final void e(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(405);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onGetConfigSuccess, bioId: %d, isCancel: %b", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(FaceDetectPrepareUI.h(this.lXp)) });
    if (FaceDetectPrepareUI.h(this.lXp))
      AppMethodBeat.o(405);
    while (true)
    {
      return;
      FaceDetectPrepareUI.a(this.lXp, paramLong);
      FaceDetectPrepareUI.a(this.lXp, paramArrayOfByte);
      FaceDetectPrepareUI.a(this.lXp, paramLong, paramArrayOfByte);
      AppMethodBeat.o(405);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.6
 * JD-Core Version:    0.6.2
 */
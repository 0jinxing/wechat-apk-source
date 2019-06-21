package com.tencent.mm.plugin.facedetectaction.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetectaction.b.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class FaceActionUI$2
  implements d.a
{
  FaceActionUI$2(FaceActionUI paramFaceActionUI)
  {
  }

  public final void Lx(String paramString)
  {
    AppMethodBeat.i(718);
    ab.i("MicroMsg.FaceActionUI", "onVerifyFinish:   authToken ：%s", new Object[] { paramString });
    al.d(new FaceActionUI.2.3(this, paramString));
    AppMethodBeat.o(718);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(719);
    ab.i("MicroMsg.FaceActionUI", "onError, err: %s, cgiErrCode: %s, cgiErrMsg: %s,retry: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramInt3) });
    FaceActionUI.b(this.mde, paramInt1);
    FaceActionUI.c(this.mde, paramInt2);
    FaceActionUI.b(this.mde, paramString);
    al.d(new FaceActionUI.2.4(this, paramString, paramInt3, paramInt2));
    AppMethodBeat.o(719);
  }

  public final void aA(final int paramInt, final String paramString)
  {
    AppMethodBeat.i(716);
    ab.i("MicroMsg.FaceActionUI", "onInitFaceCheckFinish: %s", new Object[] { Integer.valueOf(paramInt) });
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(710);
        FaceActionUI.a(FaceActionUI.2.this.mde, paramInt);
        FaceActionUI.a(FaceActionUI.2.this.mde, paramString);
        FaceActionUI.c(FaceActionUI.2.this.mde);
        FaceActionUI.d(FaceActionUI.2.this.mde);
        FaceActionUI.e(FaceActionUI.2.this.mde);
        AppMethodBeat.o(710);
      }
    });
    AppMethodBeat.o(716);
  }

  public final void btP()
  {
    AppMethodBeat.i(717);
    ab.i("MicroMsg.FaceActionUI", "onStartUpload");
    al.d(new FaceActionUI.2.2(this));
    AppMethodBeat.o(717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.2
 * JD-Core Version:    0.6.2
 */
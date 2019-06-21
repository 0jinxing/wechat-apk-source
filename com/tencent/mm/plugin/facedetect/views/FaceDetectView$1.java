package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectView$1
  implements b
{
  FaceDetectView$1(FaceDetectView paramFaceDetectView)
  {
  }

  public final void a(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(617);
    ab.e("MicroMsg.FaceDetectView", "hy: onDetectError: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    if ((FaceDetectView.a(this.maS)) || (FaceDetectView.b(this.maS)))
    {
      ab.w("MicroMsg.FaceDetectView", "hy: already end or paused");
      AppMethodBeat.o(617);
    }
    while (true)
    {
      return;
      if ((FaceDetectView.c(this.maS) == null) || (!FaceDetectView.c(this.maS).bsW()))
        break;
      ab.e("MicroMsg.FaceDetectView", "hy: motion eat result");
      FaceDetectView.a(this.maS, FaceDetectView.c(this.maS).bsZ());
      AppMethodBeat.o(617);
    }
    this.maS.hc(false);
    FaceDetectView.a(this.maS, true);
    FaceDetectView localFaceDetectView = this.maS;
    Object localObject;
    if (paramCharSequence != null)
    {
      localObject = paramCharSequence.toString();
      label156: FaceDetectView.a(localFaceDetectView, (String)localObject);
      if (FaceDetectView.d(this.maS) != null)
      {
        localObject = FaceDetectView.d(this.maS);
        if (paramCharSequence == null)
          break label227;
      }
    }
    label227: for (paramCharSequence = paramCharSequence.toString(); ; paramCharSequence = this.maS.getContext().getString(2131299438))
    {
      ((a)localObject).T(paramInt, paramCharSequence);
      AppMethodBeat.o(617);
      break;
      localObject = this.maS.getContext().getString(2131299438);
      break label156;
    }
  }

  public final void c(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    AppMethodBeat.i(618);
    int i = paramFaceCharacteristicsResult.errCode;
    String str = paramFaceCharacteristicsResult.aIm;
    ab.v("MicroMsg.FaceDetectView", "hy: onDetectHelp: %d, %s", new Object[] { Integer.valueOf(i), str });
    if ((FaceDetectView.a(this.maS)) || (FaceDetectView.b(this.maS)))
    {
      ab.w("MicroMsg.FaceDetectView", "hy: already end");
      AppMethodBeat.o(618);
    }
    while (true)
    {
      return;
      if ((FaceDetectView.c(this.maS) != null) && (FaceDetectView.c(this.maS).a(paramFaceCharacteristicsResult)))
      {
        ab.e("MicroMsg.FaceDetectView", "hy: motion eat result");
        FaceDetectView.a(this.maS, FaceDetectView.c(this.maS).bsZ());
        AppMethodBeat.o(618);
      }
      else
      {
        FaceDetectView.e(this.maS);
        if (!FaceDetectView.f(this.maS))
        {
          AppMethodBeat.o(618);
        }
        else
        {
          if ((FaceDetectView.g(this.maS)) || ((paramFaceCharacteristicsResult.errCode != 10) && (paramFaceCharacteristicsResult.errCode != 11)))
            break;
          AppMethodBeat.o(618);
        }
      }
    }
    FaceDetectView.a(this.maS, FaceCharacteristicsResult.vh(i));
    FaceDetectView localFaceDetectView = this.maS;
    if (str != null);
    for (paramFaceCharacteristicsResult = str; ; paramFaceCharacteristicsResult = "")
    {
      FaceDetectView.a(localFaceDetectView, paramFaceCharacteristicsResult);
      AppMethodBeat.o(618);
      break;
    }
  }

  public final void d(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    AppMethodBeat.i(619);
    ab.d("MicroMsg.FaceDetectView", "hy: onDetectSucceed: %s", new Object[] { paramFaceCharacteristicsResult.toString() });
    if ((FaceDetectView.a(this.maS)) || (FaceDetectView.b(this.maS)))
    {
      ab.w("MicroMsg.FaceDetectView", "hy: already end pr paused");
      AppMethodBeat.o(619);
    }
    while (true)
    {
      return;
      if ((FaceDetectView.c(this.maS) != null) && (FaceDetectView.c(this.maS).b(paramFaceCharacteristicsResult)))
      {
        ab.e("MicroMsg.FaceDetectView", "hy: motion eat result");
        FaceDetectView.a(this.maS, FaceDetectView.c(this.maS).bsZ());
        AppMethodBeat.o(619);
      }
      else
      {
        FaceDetectView.a(this.maS, false);
        if (((FaceDetectView.c(this.maS) != null) && (FaceDetectView.c(this.maS).bsV())) || (FaceDetectView.f(this.maS)))
        {
          FaceDetectView.h(this.maS);
          FaceDetectView.e(this.maS);
        }
        AppMethodBeat.o(619);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectView.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.facedetect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class l
{
  public static int vm(int paramInt)
  {
    AppMethodBeat.i(249);
    if ((paramInt < 90000) && (paramInt != 0))
    {
      ab.i("MicroMsg.FaceJSAPITranslateCenter", "hy: server error. not translate");
      AppMethodBeat.o(249);
    }
    while (true)
    {
      return paramInt;
      if (paramInt > 90099)
      {
        ab.i("MicroMsg.FaceJSAPITranslateCenter", "hy: already translated");
        AppMethodBeat.o(249);
      }
      else
      {
        switch (paramInt)
        {
        default:
          paramInt = 90199;
          AppMethodBeat.o(249);
          break;
        case 0:
          paramInt = 0;
          AppMethodBeat.o(249);
          break;
        case 90001:
          paramInt = 90109;
          AppMethodBeat.o(249);
          break;
        case 90002:
        case 90003:
        case 90004:
        case 90005:
        case 90006:
        case 90024:
        case 90025:
          paramInt = 90100;
          AppMethodBeat.o(249);
          break;
        case 90008:
        case 90009:
        case 90010:
          paramInt = 90101;
          AppMethodBeat.o(249);
          break;
        case 90011:
        case 90013:
          paramInt = 90102;
          AppMethodBeat.o(249);
          break;
        case 90019:
        case 90020:
        case 90021:
          paramInt = 90103;
          AppMethodBeat.o(249);
          break;
        case 90015:
          paramInt = 90104;
          AppMethodBeat.o(249);
          break;
        case 90022:
          paramInt = 90105;
          AppMethodBeat.o(249);
          break;
        case 90016:
          paramInt = 90106;
          AppMethodBeat.o(249);
          break;
        case 90017:
          paramInt = 90107;
          AppMethodBeat.o(249);
          break;
        case 90023:
          paramInt = 90108;
          AppMethodBeat.o(249);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.l
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.widget.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;

public final class b
{
  private static DisplayMetrics yHR = null;

  public static b.a a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    AppMethodBeat.i(112780);
    b.a locala = new b.a();
    if (yHR == null)
      yHR = paramContext.getResources().getDisplayMetrics();
    DisplayMetrics localDisplayMetrics = yHR;
    int i = aj.fromDPToPix(paramContext, 95);
    int j = paramInt1;
    if (paramInt1 < i)
      j = i;
    if (paramInt2 < 0)
    {
      locala.jiU = 0;
      locala.jiV = (localDisplayMetrics.widthPixels - (paramInt5 * 2 + j));
      paramInt1 = 0;
      paramInt2 = 1;
      if (paramInt3 >= 0)
      {
        j = paramInt3;
        if (paramInt3 <= localDisplayMetrics.heightPixels);
      }
      else
      {
        j = (int)(localDisplayMetrics.heightPixels / 2.0F);
      }
      if (!paramBoolean)
        break label279;
      if (j < paramInt4 + paramInt5)
        break label318;
      locala.rDO = (j - paramInt5 - paramInt4);
      paramInt3 = 0;
      paramInt4 = 1;
      label148: if (paramInt4 == 0)
        break label336;
      locala.rDO -= paramInt5 * 2;
      label168: if ((paramInt2 != 0) && (paramInt3 != 0))
        break label396;
      if ((paramInt1 == 0) || (paramInt3 == 0))
        break label358;
      locala.zSf = 2131493504;
    }
    label396: 
    while (true)
    {
      AppMethodBeat.o(112780);
      return locala;
      if (localDisplayMetrics.widthPixels - (paramInt2 + j + paramInt5 * 2) < 0)
      {
        locala.jiU = (paramInt2 - j - paramInt5);
        locala.jiV = (localDisplayMetrics.widthPixels - paramInt2 - paramInt5);
        paramInt1 = 1;
        paramInt2 = 0;
        break;
      }
      locala.jiU = paramInt2;
      locala.jiV = (localDisplayMetrics.widthPixels - (paramInt2 + j));
      paramInt1 = 0;
      paramInt2 = 1;
      break;
      label279: if (localDisplayMetrics.heightPixels - j < paramInt5 * 3 + paramInt4)
      {
        locala.rDO = (j - paramInt5 - paramInt4);
        paramInt3 = 0;
        paramInt4 = 1;
        break label148;
      }
      label318: locala.rDO = (j - paramInt5);
      paramInt3 = 1;
      paramInt4 = 0;
      break label148;
      label336: if (paramInt3 == 0)
        break label168;
      locala.rDO += paramInt5 * 2;
      break label168;
      label358: if ((paramInt2 != 0) && (paramInt4 != 0))
        locala.zSf = 2131493501;
      else if ((paramInt1 != 0) && (paramInt4 != 0))
        locala.zSf = 2131493503;
      else
        locala.zSf = 2131493502;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.b
 * JD-Core Version:    0.6.2
 */
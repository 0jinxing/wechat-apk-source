package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.j;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.al;
import java.util.Iterator;
import java.util.List;

public final class g$a
{
  private static DisplayMetrics yHR = null;

  public static g.a.a a(Context paramContext, TextPaint paramTextPaint, List<j> paramList, int paramInt)
  {
    AppMethodBeat.i(30496);
    g.a.a locala = new g.a.a();
    if (yHR == null)
      yHR = paramContext.getResources().getDisplayMetrics();
    DisplayMetrics localDisplayMetrics = yHR;
    Point localPoint = al.hy(paramContext);
    int i = localPoint.x;
    if ((i != localDisplayMetrics.widthPixels) || (localPoint.y != localDisplayMetrics.heightPixels))
      ab.e("MicroMsg.ChatFooterCustomSubmenu", "get screen param error!! width:%s, systermWidth:%s, height:%s, systermHeight:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(localDisplayMetrics.widthPixels), Integer.valueOf(localPoint.y), Integer.valueOf(localDisplayMetrics.heightPixels) });
    paramList = paramList.iterator();
    float f1 = 0.0F;
    if (paramList.hasNext())
    {
      float f2 = paramTextPaint.measureText(((j)paramList.next()).name);
      if (f1 >= f2)
        break label313;
      f1 = f2;
    }
    label313: 
    while (true)
    {
      break;
      int j = (int)f1;
      int k = a.fromDPToPix(paramContext, 30) * 2 + j;
      j = a.fromDPToPix(paramContext, 95);
      if (k < j);
      while (true)
      {
        if (paramInt - j / 2 < 0)
        {
          locala.jiU = 0;
          locala.jiV = (i - (j + 0));
        }
        while (true)
        {
          AppMethodBeat.o(30496);
          return locala;
          if (i - (j / 2 + paramInt) < 0)
          {
            locala.jiU = (i - (j + 0));
            locala.jiV = 0;
          }
          else
          {
            locala.jiU = (paramInt - j / 2);
            locala.jiV = (i - (j / 2 + paramInt));
          }
        }
        j = k;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.g.a
 * JD-Core Version:    0.6.2
 */
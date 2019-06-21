package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.a;
import com.tencent.mm.pluginsdk.ui.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class d
  implements q
{
  private static String a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(15620);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramInt1 >= paramInt2))
      AppMethodBeat.o(15620);
    while (true)
    {
      return paramString1;
      StringBuilder localStringBuilder = new StringBuilder();
      try
      {
        localStringBuilder.append(paramString1.subSequence(0, paramInt1 + 0));
        localStringBuilder.append(paramString2);
        localStringBuilder.append(paramString1.subSequence(paramInt2 + 0, paramString1.length()));
        paramString2.length();
        paramString1 = localStringBuilder.toString();
        AppMethodBeat.o(15620);
      }
      catch (Exception paramString1)
      {
        ab.e("MicroMsg.QrCodeURLHelper", paramString1.getMessage());
        paramString1 = "";
        AppMethodBeat.o(15620);
      }
    }
  }

  public final boolean a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    boolean bool = false;
    AppMethodBeat.i(15621);
    ab.d("MicroMsg.QrCodeURLHelper", "tryHandleEvents, url:%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(15621);
    while (true)
    {
      return bool;
      if (paramString.endsWith("@mailto@"))
        l.b(paramContext, paramString.substring(0, paramString.length() - 8), paramOnDismissListener);
      while (true)
      {
        AppMethodBeat.o(15621);
        bool = true;
        break;
        if (!paramString.endsWith("@tel@"))
          break label126;
        String str = paramString.substring(0, paramString.length() - 5);
        paramString = new Bundle();
        paramString.putInt("fromScene", 3);
        l.a(paramContext, str, paramOnDismissListener, paramString);
      }
      label126: AppMethodBeat.o(15621);
    }
  }

  public final boolean dq(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(15622);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(15622);
    while (true)
    {
      return bool;
      if ((paramString.endsWith("@mailto@")) || (paramString.endsWith("@tel@")))
      {
        bool = true;
        AppMethodBeat.o(15622);
      }
      else
      {
        AppMethodBeat.o(15622);
      }
    }
  }

  public final String x(Context paramContext, String paramString)
  {
    AppMethodBeat.i(15619);
    paramContext = a.bB(paramContext, paramString);
    if (paramContext.size() == 0)
    {
      AppMethodBeat.o(15619);
      return paramString;
    }
    Collections.sort(paramContext, new d.1(this));
    Iterator localIterator = paramContext.iterator();
    paramContext = paramString;
    label46: String str1;
    label124: String str2;
    if (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      str1 = null;
      int i = localm.start;
      int j = localm.end;
      switch (localm.type)
      {
      default:
        if (str1 != null)
        {
          str2 = localm.url;
          if ((localm.type == 1) && (!str2.startsWith("http://")))
          {
            str1 = String.format(str1, new Object[] { "http://" + str2.trim(), str2.trim() });
            label197: str1 = a(paramContext, i, j, str1);
            paramContext = str1;
            if (str1.length() != 0)
              break label295;
          }
        }
        break;
      case 25:
      case 24:
      case 1:
      }
    }
    while (true)
    {
      ab.d("MicroMsg.QrCodeURLHelper", "formatQRString, result:%s", new Object[] { paramString });
      AppMethodBeat.o(15619);
      break;
      str1 = "<a href=\"%s@tel@\">%s</a>";
      break label124;
      str1 = "<a href=\"%s@mailto@\">%s</a>";
      break label124;
      str1 = "<a href=\"%s\">%s</a>";
      break label124;
      str1 = String.format(str1, new Object[] { str2.trim(), str2.trim() });
      break label197;
      label295: break label46;
      paramString = paramContext;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.d
 * JD-Core Version:    0.6.2
 */
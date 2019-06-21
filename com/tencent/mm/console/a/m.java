package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.pluginsdk.p.c.a;
import com.tencent.mm.pluginsdk.p.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public final class m
  implements a
{
  static
  {
    AppMethodBeat.i(16149);
    b.a(new m(), new String[] { "//wear" });
    AppMethodBeat.o(16149);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(16148);
    if (ab.getLogLevel() > 1)
      AppMethodBeat.o(16148);
    while (true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      AppMethodBeat.o(16148);
      bool = true;
    }
    paramArrayOfString = paramArrayOfString[1];
    switch (paramArrayOfString.hashCode())
    {
    default:
      label88: i = -1;
      label91: switch (i)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case 107332:
    case 351608024:
    case 990157655:
    }
    while (true)
    {
      AppMethodBeat.o(16148);
      bool = true;
      break;
      if (!paramArrayOfString.equals("log"))
        break label88;
      break label91;
      if (!paramArrayOfString.equals("version"))
        break label88;
      i = 1;
      break label91;
      if (!paramArrayOfString.equals("reconnect"))
        break label88;
      i = 2;
      break label91;
      p.e.vaw.cUq();
      continue;
      paramArrayOfString = new TextView(paramContext);
      paramArrayOfString.setText(p.e.vaw.cUp());
      paramArrayOfString.setGravity(19);
      paramArrayOfString.setTextSize(1, 10.0F);
      paramArrayOfString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramArrayOfString.setTextColor(-16711936);
      paramArrayOfString.setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(2131427776);
      paramArrayOfString.setPadding(i, i, i, i);
      h.a(paramContext, null, paramArrayOfString, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.m
 * JD-Core Version:    0.6.2
 */
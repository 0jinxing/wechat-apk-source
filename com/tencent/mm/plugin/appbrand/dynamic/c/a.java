package com.tencent.mm.plugin.appbrand.dynamic.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.protocal.MMProtocalJni;

public final class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(10799);
    if (!((e)g.K(e.class)).abz().abF())
      AppMethodBeat.o(10799);
    while (true)
    {
      return true;
      if (!"//widget".equals(paramArrayOfString[0]))
      {
        AppMethodBeat.o(10799);
      }
      else
      {
        if (paramArrayOfString.length >= 2)
          break;
        AppMethodBeat.o(10799);
      }
    }
    paramString = paramArrayOfString[1].toLowerCase();
    label116: int i;
    switch (paramString.hashCode())
    {
    default:
      i = -1;
      label119: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      break;
    case -1408208058:
    case 1704329003:
    case 547812385:
    }
    while (true)
    {
      AppMethodBeat.o(10799);
      break;
      if (!paramString.equals("assert"))
        break label116;
      i = 0;
      break label119;
      if (!paramString.equals("jniassert"))
        break label116;
      i = 1;
      break label119;
      if (!paramString.equals("debugger"))
        break label116;
      i = 2;
      break label119;
      com.tencent.mm.ce.a.post(new a.1(this, paramArrayOfString));
      continue;
      com.tencent.mm.ce.a.post(new a.2(this, paramArrayOfString));
      continue;
      if ((paramArrayOfString.length <= 2) || (TextUtils.isEmpty(paramArrayOfString[2])))
      {
        AppMethodBeat.o(10799);
        break;
      }
      paramArrayOfString = paramArrayOfString[2];
      switch (paramArrayOfString.hashCode())
      {
      default:
        label300: i = -1;
      case 46800:
      case 46428:
      case 1450433:
      }
      while (true)
        switch (i)
        {
        default:
          break;
        case 0:
          ((e)g.K(e.class)).abz().cA(true);
          break;
          if (!paramArrayOfString.equals("-or"))
            break label300;
          i = 0;
          continue;
          if (!paramArrayOfString.equals("-cr"))
            break label300;
          i = 1;
          continue;
          if (!paramArrayOfString.equals("-ocb"))
            break label300;
          i = 2;
        case 1:
        case 2:
        }
      ((e)g.K(e.class)).abz().cA(false);
      continue;
      ((e)g.K(e.class)).abz().bT(paramContext);
    }
  }

  static class b
    implements com.tencent.mm.ipcinvoker.a<Bundle, Bundle>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.c.a
 * JD-Core Version:    0.6.2
 */
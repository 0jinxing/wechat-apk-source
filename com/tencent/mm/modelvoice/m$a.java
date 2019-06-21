package com.tencent.mm.modelvoice;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class m$a
  implements a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(116596);
    paramContext = paramArrayOfString[0];
    int i = -1;
    switch (paramContext.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      }
      break;
    case -1560895490:
    }
    do
    {
      AppMethodBeat.o(116596);
      bool2 = false;
      return bool2;
      if (!paramContext.equals("//voicetrymore"))
        break;
      i = 0;
      break;
    }
    while ((paramArrayOfString.length <= 1) || (paramArrayOfString[1] == null));
    i = bo.getInt(paramArrayOfString[1], 1);
    if (i == 1);
    for (boolean bool2 = true; ; bool2 = false)
    {
      com.tencent.mm.audio.b.i.cqY = bool2;
      ab.i("MicroMsg.SubCoreVoice", "summervoicetrymore enable[%d]", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(116596);
      bool2 = bool1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.m.a
 * JD-Core Version:    0.6.2
 */
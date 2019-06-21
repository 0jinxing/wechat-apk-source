package com.tencent.mm.console.a.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(16153);
    ab.i("MicroMsg.HCSettingCommand", "hcsetting args[%s] [%s]", new Object[] { Integer.valueOf(paramArrayOfString.length), paramArrayOfString[0] });
    paramArrayOfString = new Intent();
    paramArrayOfString.setClassName(paramContext, "com.tencent.mm.ui.tools.HardCoderSettingUI");
    paramContext.startActivity(paramArrayOfString);
    AppMethodBeat.o(16153);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.a.b
 * JD-Core Version:    0.6.2
 */
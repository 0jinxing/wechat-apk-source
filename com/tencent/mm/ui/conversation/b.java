package com.tencent.mm.ui.conversation;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  private static final String[] zqT = { "M3X", "M5s", "M5", "MX6", "U10", "U20", "M2 E", "M A5", "DIG-AL00", "DIG-TL10", "NCE-AL00", "NCE-TL10", "MYA-TL10", "MYA-AL10", "NEM-AL10" };

  public static boolean dIo()
  {
    boolean bool = true;
    AppMethodBeat.i(34154);
    int j;
    if ((Build.VERSION.SDK_INT == 23) && (Build.MODEL != null))
    {
      String[] arrayOfString = zqT;
      int i = arrayOfString.length;
      j = 0;
      if (j < i)
        if (arrayOfString[j].equalsIgnoreCase(Build.MODEL))
        {
          ab.i("CompatSupportV27", "for weird crash, %s", new Object[] { Build.MODEL });
          AppMethodBeat.o(34154);
        }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(34154);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.b
 * JD-Core Version:    0.6.2
 */
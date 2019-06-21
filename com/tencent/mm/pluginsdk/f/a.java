package com.tencent.mm.pluginsdk.f;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  public static void b(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    AppMethodBeat.i(79446);
    if (Build.VERSION.SDK_INT >= 11)
    {
      new b();
      b.b(paramCharSequence1, paramCharSequence2);
      AppMethodBeat.o(79446);
    }
    while (true)
    {
      return;
      new c();
      c.N(paramCharSequence2);
      AppMethodBeat.o(79446);
    }
  }

  public static CharSequence dhS()
  {
    AppMethodBeat.i(79447);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 11)
    {
      new b();
      localObject = ((android.content.ClipboardManager)ah.getContext().getSystemService("clipboard")).getPrimaryClip();
      if ((localObject == null) || (((ClipData)localObject).getItemCount() <= 0))
      {
        AppMethodBeat.o(79447);
        localObject = null;
      }
    }
    while (true)
    {
      return localObject;
      localObject = ((ClipData)localObject).getItemAt(0);
      if (localObject == null)
      {
        AppMethodBeat.o(79447);
        localObject = null;
      }
      else
      {
        localObject = ((ClipData.Item)localObject).getText();
        AppMethodBeat.o(79447);
        continue;
        new c();
        localObject = ((android.text.ClipboardManager)ah.getContext().getSystemService("clipboard")).getText();
        AppMethodBeat.o(79447);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.a
 * JD-Core Version:    0.6.2
 */
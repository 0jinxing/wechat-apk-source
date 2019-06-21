package com.tencent.mm.ui.chatting.k.a;

import android.text.Spannable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.widget.MMTextView.a;

public class a
{
  private static volatile a yZL;
  private static final al yZM;

  static
  {
    AppMethodBeat.i(32683);
    yZL = null;
    yZM = new al();
    AppMethodBeat.o(32683);
  }

  public static void a(CharSequence paramCharSequence, bi parambi)
  {
    AppMethodBeat.i(32681);
    a(paramCharSequence, parambi, 1);
    AppMethodBeat.o(32681);
  }

  private static void a(CharSequence paramCharSequence, bi parambi, int paramInt)
  {
    AppMethodBeat.i(32680);
    if ((paramCharSequence instanceof Spannable))
      yZM.aa(new a.b(paramCharSequence, parambi, paramInt));
    AppMethodBeat.o(32680);
  }

  public static a dHa()
  {
    AppMethodBeat.i(32679);
    if (yZL == null);
    while (true)
    {
      try
      {
        if (yZL == null)
        {
          locala1 = new com/tencent/mm/ui/chatting/k/a/a;
          locala1.<init>();
          yZL = locala1;
        }
        a locala1 = yZL;
        return locala1;
      }
      finally
      {
        AppMethodBeat.o(32679);
      }
      a locala2 = yZL;
      AppMethodBeat.o(32679);
    }
  }

  public static MMTextView.a dHb()
  {
    return a.a.yZN;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.k.a.a
 * JD-Core Version:    0.6.2
 */
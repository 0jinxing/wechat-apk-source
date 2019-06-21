package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

final class OpenFileChooserUI$6
  implements Runnable
{
  OpenFileChooserUI$6(OpenFileChooserUI paramOpenFileChooserUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7454);
    Object localObject1 = new ArrayList();
    int i = OpenFileChooserUI.a(this.usf, this.bSt);
    if (i == -50002)
    {
      al.d(new OpenFileChooserUI.6.1(this));
      AppMethodBeat.o(7454);
    }
    while (true)
    {
      return;
      Object localObject2;
      if (i == -50006)
      {
        localObject1 = OpenFileChooserUI.s(this.bSt, (List)localObject1);
        OpenFileChooserUI.b(this.usf, this.bSt);
        localObject2 = OpenFileChooserUI.d(this.usf);
      }
      while (true)
        if (!bo.isNullOrNil((String)localObject1))
        {
          al.d(new OpenFileChooserUI.6.4(this, (String)localObject1, (String)localObject2));
          AppMethodBeat.o(7454);
          break;
          if (i == 1)
          {
            String str1 = OpenFileChooserUI.c(this.usf, this.bSt);
            OpenFileChooserUI.b(this.usf, this.bSt);
            String str2 = OpenFileChooserUI.d(this.usf);
            localObject2 = str2;
            localObject1 = str1;
            if (!bo.isNullOrNil(str1))
              continue;
            localObject2 = str2;
            localObject1 = str1;
            if (OpenFileChooserUI.b(this.usf) != 7)
              continue;
            localObject2 = str2;
            localObject1 = str1;
            if (OpenFileChooserUI.c(this.usf) != 2)
              continue;
            al.d(new OpenFileChooserUI.6.2(this));
            AppMethodBeat.o(7454);
            break;
          }
          al.d(new OpenFileChooserUI.6.3(this));
          AppMethodBeat.o(7454);
          break;
        }
      al.d(new OpenFileChooserUI.6.5(this));
      AppMethodBeat.o(7454);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.6
 * JD-Core Version:    0.6.2
 */
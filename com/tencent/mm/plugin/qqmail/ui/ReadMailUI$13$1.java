package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h.c;

final class ReadMailUI$13$1
  implements h.c
{
  ReadMailUI$13$1(ReadMailUI.13 param13)
  {
  }

  public final void iE(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(68436);
    if (paramInt == 3)
    {
      ReadMailUI.J(this.pAf.pzZ);
      AppMethodBeat.o(68436);
    }
    Intent localIntent;
    String[] arrayOfString1;
    String[] arrayOfString2;
    String[] arrayOfString3;
    while (true)
    {
      return;
      localIntent = new Intent();
      localIntent.setClass(this.pAf.pzZ, ComposeUI.class);
      localIntent.putExtra("mailid", ReadMailUI.a(this.pAf.pzZ));
      localIntent.putExtra("subject", ReadMailUI.K(this.pAf.pzZ));
      arrayOfString1 = ReadMailUI.L(this.pAf.pzZ).a(false, ReadMailUI.l(this.pAf.pzZ));
      arrayOfString2 = ReadMailUI.c(this.pAf.pzZ).a(true, ReadMailUI.l(this.pAf.pzZ));
      arrayOfString3 = ReadMailUI.d(this.pAf.pzZ).a(true, ReadMailUI.l(this.pAf.pzZ));
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(68436);
      case 0:
      case 1:
      case 2:
      }
    }
    localIntent.putExtra("composeType", 2);
    localIntent.putExtra("toList", arrayOfString1);
    while (true)
    {
      this.pAf.pzZ.startActivity(localIntent);
      AppMethodBeat.o(68436);
      break;
      localIntent.putExtra("composeType", 2);
      String[] arrayOfString4 = new String[arrayOfString1.length + arrayOfString2.length];
      int j = arrayOfString1.length;
      int k = 0;
      for (paramInt = 0; k < j; paramInt++)
      {
        arrayOfString4[paramInt] = arrayOfString1[k];
        k++;
      }
      j = arrayOfString2.length;
      k = i;
      while (k < j)
      {
        arrayOfString4[paramInt] = arrayOfString2[k];
        k++;
        paramInt++;
      }
      localIntent.putExtra("toList", arrayOfString4);
      localIntent.putExtra("ccList", arrayOfString3);
      continue;
      localIntent.putExtra("composeType", 3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.13.1
 * JD-Core Version:    0.6.2
 */
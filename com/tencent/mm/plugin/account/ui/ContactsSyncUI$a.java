package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.model.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;

final class ContactsSyncUI$a
  implements b.a
{
  private boolean gAA;
  private w.a gAB;

  public ContactsSyncUI$a(ContactsSyncUI paramContactsSyncUI, boolean paramBoolean)
  {
    AppMethodBeat.i(124747);
    this.gAB = new ContactsSyncUI.a.1(this);
    this.gAA = paramBoolean;
    AppMethodBeat.o(124747);
  }

  final int P(Context paramContext, String paramString)
  {
    int i = 1;
    AppMethodBeat.i(124749);
    if (paramContext == null)
      AppMethodBeat.o(124749);
    while (true)
    {
      return i;
      int j = w.a(paramContext, paramString, this.gAB);
      if (j == 2)
      {
        Toast.makeText(paramContext, this.gAz.getString(2131298774), 1).show();
        AppMethodBeat.o(124749);
      }
      else if (j == 3)
      {
        Toast.makeText(paramContext, this.gAz.getString(2131298773), 1).show();
        AppMethodBeat.o(124749);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(124749);
      }
    }
  }

  public final int cy(Context paramContext)
  {
    AppMethodBeat.i(124748);
    g.RN();
    int i;
    if ((!a.QX()) || (a.QT()))
    {
      i = 4;
      AppMethodBeat.o(124748);
    }
    while (true)
    {
      return i;
      if (!this.gAA)
      {
        ab.i("MicroMsg.ProcessorAddAccount", "no need to bind mobile");
        w.a(this.gAz, this.gAB);
        i = 0;
        AppMethodBeat.o(124748);
      }
      else
      {
        String str = (String)g.RP().Ry().get(6, "");
        if (bo.isNullOrNil(str))
        {
          ab.e("MicroMsg.ProcessorAddAccount", "not bind mobile phone");
          i = 2;
          AppMethodBeat.o(124748);
        }
        else if (l.apR())
        {
          h.a(paramContext, 2131298772, 2131297061, 2131296994, 2131296868, new ContactsSyncUI.a.2(this, paramContext, str), new ContactsSyncUI.a.3(this, paramContext));
          i = 5;
          AppMethodBeat.o(124748);
        }
        else
        {
          i = P(paramContext, str);
          AppMethodBeat.o(124748);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ContactsSyncUI.a
 * JD-Core Version:    0.6.2
 */
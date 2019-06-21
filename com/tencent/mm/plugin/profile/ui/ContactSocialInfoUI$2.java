package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.account.friend.a.a;
import com.tencent.mm.plugin.profile.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h.c;

final class ContactSocialInfoUI$2
  implements h.c
{
  ContactSocialInfoUI$2(ContactSocialInfoUI paramContactSocialInfoUI, String[] paramArrayOfString)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(23441);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(23441);
      while (true)
      {
        return;
        if ((ContactSocialInfoUI.a(this.pmv) == null) || (ContactSocialInfoUI.a(this.pmv).length() == 0))
        {
          AppMethodBeat.o(23441);
        }
        else
        {
          paramInt = ContactSocialInfoUI.a(this.pmv).lastIndexOf(' ') + 1;
          if (paramInt <= 0)
            break;
          ContactSocialInfoUI.a(this.pmv, ContactSocialInfoUI.a(this.pmv).substring(paramInt));
          AppMethodBeat.o(23441);
          continue;
          if ((ContactSocialInfoUI.a(this.pmv) == null) || (ContactSocialInfoUI.a(this.pmv).length() == 0))
          {
            AppMethodBeat.o(23441);
          }
          else
          {
            paramInt = ContactSocialInfoUI.a(this.pmv).lastIndexOf(' ');
            localObject = ContactSocialInfoUI.a(this.pmv).substring(0, paramInt);
            if ((localObject == null) || (((String)localObject).length() == 0))
            {
              AppMethodBeat.o(23441);
            }
            else
            {
              t.b(ContactSocialInfoUI.b(this.pmv), ((String)localObject).trim());
              AppMethodBeat.o(23441);
              continue;
              if ((this.hId == null) || (this.hId.length <= 2) || (ContactSocialInfoUI.c(this.pmv) == null) || (ContactSocialInfoUI.b(this.pmv) == null))
              {
                AppMethodBeat.o(23441);
              }
              else
              {
                if ((ContactSocialInfoUI.c(this.pmv) == null) || (bo.isNullOrNil(ContactSocialInfoUI.c(this.pmv).frQ)))
                  break label329;
                ContactSocialInfoUI.a(this.pmv, ContactSocialInfoUI.b(this.pmv).field_username, ContactSocialInfoUI.c(this.pmv).frQ);
                AppMethodBeat.o(23441);
              }
            }
          }
        }
      }
      label329: Intent localIntent = new Intent();
      Object localObject = new Bundle();
      ((Bundle)localObject).putInt("fromScene", 2);
      localIntent.putExtra("reportArgs", (Bundle)localObject);
      b.gkE.j(localIntent, this.pmv);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI.2
 * JD-Core Version:    0.6.2
 */
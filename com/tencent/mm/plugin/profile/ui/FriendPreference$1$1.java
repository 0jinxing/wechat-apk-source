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

final class FriendPreference$1$1
  implements h.c
{
  FriendPreference$1$1(FriendPreference.1 param1, String[] paramArrayOfString)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(23619);
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
      AppMethodBeat.o(23619);
      while (true)
      {
        return;
        if ((this.pnD.pnB == null) || (this.pnD.pnB.length() == 0))
        {
          AppMethodBeat.o(23619);
        }
        else
        {
          paramInt = this.pnD.pnB.lastIndexOf(' ') + 1;
          if (paramInt <= 0)
            break;
          FriendPreference.a(this.pnD.pnC, this.pnD.pnB.substring(paramInt));
          AppMethodBeat.o(23619);
          continue;
          if ((this.pnD.pnB == null) || (this.pnD.pnB.length() == 0))
          {
            AppMethodBeat.o(23619);
          }
          else
          {
            paramInt = this.pnD.pnB.lastIndexOf(' ');
            localObject = this.pnD.pnB.substring(0, paramInt);
            if ((localObject == null) || (((String)localObject).length() == 0))
            {
              AppMethodBeat.o(23619);
            }
            else
            {
              t.b(FriendPreference.c(this.pnD.pnC), ((String)localObject).trim());
              AppMethodBeat.o(23619);
              continue;
              if ((this.hId == null) || (this.hId.length <= 2) || (FriendPreference.a(this.pnD.pnC) == null) || (FriendPreference.c(this.pnD.pnC) == null))
              {
                AppMethodBeat.o(23619);
              }
              else
              {
                if ((FriendPreference.a(this.pnD.pnC) == null) || (bo.isNullOrNil(FriendPreference.a(this.pnD.pnC).frQ)))
                  break label356;
                FriendPreference.a(this.pnD.pnC, FriendPreference.c(this.pnD.pnC).field_username, FriendPreference.a(this.pnD.pnC).frQ);
                AppMethodBeat.o(23619);
              }
            }
          }
        }
      }
      label356: Intent localIntent = new Intent();
      Object localObject = new Bundle();
      ((Bundle)localObject).putInt("fromScene", 2);
      localIntent.putExtra("reportArgs", (Bundle)localObject);
      b.gkE.j(localIntent, FriendPreference.b(this.pnD.pnC));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.FriendPreference.1.1
 * JD-Core Version:    0.6.2
 */
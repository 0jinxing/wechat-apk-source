package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.u;

final class h$1
  implements ContactListExpandPreference.a
{
  h$1(h paramh)
  {
  }

  public final void JT()
  {
  }

  public final void iA(int paramInt)
  {
  }

  public final void iB(int paramInt)
  {
    AppMethodBeat.i(23532);
    String str;
    if (this.pmX.pmW.KW(paramInt))
    {
      str = this.pmX.pmW.KX(paramInt);
      if (bo.isNullOrNil(str))
        AppMethodBeat.o(23532);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setClass(this.pmX.context, ContactInfoUI.class);
      localIntent.putExtra("Contact_User", str);
      localIntent.putExtra("Contact_RoomNickname", this.pmX.eih.mJ(str));
      this.pmX.context.startActivity(localIntent);
      AppMethodBeat.o(23532);
    }
  }

  public final void iC(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.h.1
 * JD-Core Version:    0.6.2
 */
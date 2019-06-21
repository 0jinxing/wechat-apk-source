package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.List;

final class SnsAddressUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SnsAddressUI$1(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33923);
    Intent localIntent = new Intent();
    paramMenuItem = bo.P((String[])SnsAddressUI.a(this.zpf).toArray(new String[0]));
    if ((paramMenuItem == null) || (paramMenuItem.size() == 0))
      localIntent.putExtra("Select_Contact", "");
    while (true)
    {
      this.zpf.setResult(-1, localIntent);
      this.zpf.finish();
      al.n(new SnsAddressUI.1.1(this), 100L);
      this.zpf.aqX();
      AppMethodBeat.o(33923);
      return true;
      localIntent.putExtra("Select_Contact", bo.c(paramMenuItem, ","));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsAddressUI.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

final class SelectContactUI$16
  implements View.OnClickListener
{
  SelectContactUI$16(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33864);
    Intent localIntent = new Intent(this.zoP.getIntent());
    localIntent.setClass(this.zoP.mController.ylL, OpenIMSelectContactUI.class);
    localIntent.removeExtra("titile");
    localIntent.putExtra("openim_appid", "3552365301");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = SelectContactUI.c(this.zoP).iterator();
    while (localIterator.hasNext())
    {
      paramView = (String)localIterator.next();
      if (ad.aox(paramView))
        localArrayList.add(paramView);
    }
    localIntent.putExtra("already_select_contact", bo.c(localArrayList, ","));
    this.zoP.startActivityForResult(localIntent, 5);
    AppMethodBeat.o(33864);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.16
 * JD-Core Version:    0.6.2
 */
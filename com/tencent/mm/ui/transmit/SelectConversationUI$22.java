package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import java.util.Iterator;
import java.util.List;

final class SelectConversationUI$22
  implements MenuItem.OnMenuItemClickListener
{
  SelectConversationUI$22(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(35145);
    if (SelectConversationUI.n(this.zKj))
      AppMethodBeat.o(35145);
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      localObject = SelectConversationUI.o(this.zKj).iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        paramMenuItem = (String)((Iterator)localObject).next();
      }
      while (!this.zKj.asq(paramMenuItem));
      AppMethodBeat.o(35145);
    }
    Object localObject = new Intent();
    ((Intent)localObject).putExtra("Select_Conv_User", ah.c(SelectConversationUI.o(this.zKj), ","));
    paramMenuItem = (Intent)this.zKj.getIntent().getParcelableExtra("Select_Conv_NextStep");
    if (paramMenuItem != null)
      SelectConversationUI.a(this.zKj, (Intent)localObject, paramMenuItem);
    while (true)
    {
      bool = true;
      AppMethodBeat.o(35145);
      break;
      if (SelectConversationUI.p(this.zKj))
      {
        SelectConversationUI.a(this.zKj, -1, (Intent)localObject);
        this.zKj.finish();
      }
      else
      {
        SelectConversationUI.a(this.zKj, (Intent)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.22
 * JD-Core Version:    0.6.2
 */
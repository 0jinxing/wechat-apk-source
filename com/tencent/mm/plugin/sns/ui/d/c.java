package com.tencent.mm.plugin.sns.ui.d;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class c
  implements View.OnCreateContextMenuListener
{
  public abstract void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo);

  public abstract boolean dR(View paramView);

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if (dR(paramView))
      a(paramContextMenu, paramView, paramContextMenuInfo);
    while (true)
    {
      return;
      ab.e("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.c
 * JD-Core Version:    0.6.2
 */
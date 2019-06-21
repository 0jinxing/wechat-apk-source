package com.tencent.mm.plugin.websearch.widget.view;

import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.y;
import com.tencent.mm.ui.base.n.a;
import java.util.List;

public final class a$1
  implements n.a
{
  public a$1(a parama, List paramList)
  {
  }

  public final void a(ImageView paramImageView, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(91473);
    paramMenuItem = (y)this.mhY.get(paramMenuItem.getItemId());
    com.tencent.mm.at.a.a.ahv().a(paramMenuItem.iconUrl, paramImageView, a.a(this.udD));
    AppMethodBeat.o(91473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.a.1
 * JD-Core Version:    0.6.2
 */
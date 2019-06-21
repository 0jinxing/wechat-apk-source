package com.tencent.mm.plugin.fts.ui.widget;

import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.o;

public final class d extends o
{
  public boolean mNe;

  public final void a(FragmentActivity paramFragmentActivity, Menu paramMenu)
  {
    AppMethodBeat.i(62204);
    if (paramFragmentActivity == null)
    {
      ab.w("MicroMsg.FTSVoiceSearchViewHelper", "on add search menu, activity is null");
      AppMethodBeat.o(62204);
    }
    while (true)
    {
      return;
      if (this.zGZ == null)
        this.zGZ = new FTSActionBarSearchView(paramFragmentActivity);
      super.a(paramFragmentActivity, paramMenu);
      AppMethodBeat.o(62204);
    }
  }

  public final boolean amG()
  {
    return this.mNe;
  }

  public final void setCursorVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(62205);
    ((FTSActionBarSearchView)this.zGZ).setCursorVisible(paramBoolean);
    AppMethodBeat.o(62205);
  }

  public final void setSearchContent(String paramString)
  {
    AppMethodBeat.i(62206);
    try
    {
      super.setSearchContent(paramString);
      AppMethodBeat.o(62206);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.FTSVoiceSearchViewHelper", "setSearchContent exception: " + paramString.getMessage());
        AppMethodBeat.o(62206);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.d
 * JD-Core Version:    0.6.2
 */
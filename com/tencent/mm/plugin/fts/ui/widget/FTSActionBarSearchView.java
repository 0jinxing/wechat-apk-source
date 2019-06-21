package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.ActionBarSearchView;
import com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText;

public class FTSActionBarSearchView extends ActionBarSearchView
{
  public FTSActionBarSearchView(Context paramContext)
  {
    super(paramContext);
  }

  public FTSActionBarSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public int getLayoutId()
  {
    AppMethodBeat.i(62103);
    ab.i("FTSActionBarSearchView", "getLayoutId");
    AppMethodBeat.o(62103);
    return 2130969628;
  }

  public void setCursorVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(62104);
    this.zzZ.setCursorVisible(paramBoolean);
    AppMethodBeat.o(62104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView
 * JD-Core Version:    0.6.2
 */
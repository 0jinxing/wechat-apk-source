package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedModuleTitle extends LinearLayout
{
  private TextView iDT;

  public GameFeedModuleTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111937);
    super.onFinishInflate();
    this.iDT = ((TextView)findViewById(2131824492));
    AppMethodBeat.o(111937);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111938);
    if ((paramd == null) || (bo.isNullOrNil(paramd.mVG)))
    {
      setVisibility(8);
      AppMethodBeat.o(111938);
    }
    while (true)
    {
      return;
      setVisibility(0);
      this.iDT.setText(paramd.mVG);
      AppMethodBeat.o(111938);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedModuleTitle
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class GameBestSellingTitle extends LinearLayout
{
  public GameBestSellingTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(111735);
    if (bo.isNullOrNil(paramString))
    {
      setVisibility(8);
      AppMethodBeat.o(111735);
    }
    while (true)
    {
      return;
      setVisibility(0);
      ((TextView)findViewById(2131824301)).setText(paramString);
      AppMethodBeat.o(111735);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameBestSellingTitle
 * JD-Core Version:    0.6.2
 */
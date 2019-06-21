package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class FTSMainUIHotWordLayout extends LinearLayout
{
  private TextView gnB;
  protected View.OnClickListener mJH;
  protected List<LinearLayout> mMf;
  protected int zyb;
  protected boolean zyc;
  public FTSMainUIHotWordLayout.b zyd;

  public FTSMainUIHotWordLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(91590);
    this.mMf = null;
    this.zyb = 2;
    this.zyc = true;
    this.gnB = null;
    this.zyd = null;
    initView();
    AppMethodBeat.o(91590);
  }

  public FTSMainUIHotWordLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(91591);
    this.mMf = null;
    this.zyb = 2;
    this.zyc = true;
    this.gnB = null;
    this.zyd = null;
    initView();
    AppMethodBeat.o(91591);
  }

  private void initView()
  {
    AppMethodBeat.i(91592);
    setOrientation(1);
    this.mMf = new ArrayList();
    AppMethodBeat.o(91592);
  }

  public String getSearchId()
  {
    if ((this.zyd != null) && (this.zyd.hlm != null));
    for (String str = this.zyd.hlm; ; str = "")
      return str;
  }

  public void setOnCellClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mJH = paramOnClickListener;
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(91593);
    int i;
    if (this.mMf.size() > 0)
    {
      i = 1;
      if (i == 0)
        break label39;
    }
    while (true)
    {
      super.setVisibility(paramInt);
      AppMethodBeat.o(91593);
      return;
      i = 0;
      break;
      label39: paramInt = 8;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout
 * JD-Core Version:    0.6.2
 */
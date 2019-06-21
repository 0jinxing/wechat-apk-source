package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FavDetailTitleView extends LinearLayout
{
  private ImageView ejo;
  private TextView gnB;

  public FavDetailTitleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(74671);
    super.onFinishInflate();
    this.ejo = ((ImageView)findViewById(2131821183));
    this.gnB = ((TextView)findViewById(2131821185));
    AppMethodBeat.o(74671);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavDetailTitleView
 * JD-Core Version:    0.6.2
 */
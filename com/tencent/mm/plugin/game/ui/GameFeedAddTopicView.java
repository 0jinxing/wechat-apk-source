package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.o;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedAddTopicView extends LinearLayout
  implements View.OnClickListener
{
  private d neV;
  private GameFeedTitleDescView nim;
  private TextView nin;

  public GameFeedAddTopicView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111924);
    if ((this.neV == null) || (this.neV.mVH == null))
      AppMethodBeat.o(111924);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.neV.mVH.mZj))
      {
        int i = c.ax(getContext(), this.neV.mVH.mZj);
        b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), a.T(this.neV.mVH.mZL, "clickType", "card"));
      }
      AppMethodBeat.o(111924);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111922);
    super.onFinishInflate();
    this.nim = ((GameFeedTitleDescView)findViewById(2131824480));
    this.nin = ((TextView)findViewById(2131824481));
    setOnClickListener(this);
    AppMethodBeat.o(111922);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111923);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naH == null))
    {
      setVisibility(8);
      AppMethodBeat.o(111923);
    }
    while (true)
    {
      return;
      this.neV = paramd;
      setVisibility(0);
      this.nim.b(paramd.mVH.naH.Title, paramd.mVH.naH.Desc, null);
      this.nin.setText(paramd.mVH.naH.mZY);
      if (!this.neV.mVJ)
      {
        a.a(getContext(), 10, 1024, this.neV.position, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), a.kY(this.neV.mVH.mZL));
        this.neV.mVJ = true;
      }
      AppMethodBeat.o(111923);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedAddTopicView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.c.a.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ak;

public class BottomEntranceView extends RelativeLayout
{
  private f kPP;
  private TextView kPQ;
  private int kPR;
  private int kPS;

  public BottomEntranceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private int getDisplayHeight()
  {
    AppMethodBeat.i(136213);
    int i = ak.hy(getContext()).y;
    AppMethodBeat.o(136213);
    return i;
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(136211);
    super.onFinishInflate();
    this.kPQ = ((TextView)findViewById(2131823315));
    this.kPS = (getDisplayHeight() - ak.de(getContext()) - ak.getStatusBarHeight(getContext()) - ak.fr(getContext()));
    this.kPR = getResources().getDimensionPixelSize(2131428130);
    ab.d("MicroMsg.BottomEntranceView", "mContentH = %d", new Object[] { Integer.valueOf(this.kPS) });
    getViewTreeObserver().addOnGlobalLayoutListener(new BottomEntranceView.1(this));
    setOnClickListener(new BottomEntranceView.2(this));
    AppMethodBeat.o(136211);
  }

  public void setData(f paramf)
  {
    AppMethodBeat.i(136212);
    if ((paramf == null) || (bo.isNullOrNil(paramf.desc)) || (bo.isNullOrNil(paramf.kdF)))
    {
      setVisibility(8);
      AppMethodBeat.o(136212);
    }
    while (true)
    {
      return;
      this.kPP = paramf;
      setVisibility(0);
      this.kPQ.setText(this.kPP.desc);
      AppMethodBeat.o(136212);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.y;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;

public final class p extends h
{
  MMWebView fow;
  FrameLayout raJ;

  public p(Context paramContext, y paramy, ViewGroup paramViewGroup)
  {
    super(paramContext, paramy, paramViewGroup);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37193);
    this.raJ = ((FrameLayout)this.contentView);
    this.fow = MMWebView.a.in(this.context);
    this.raJ.addView(this.fow);
    AppMethodBeat.o(37193);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37192);
    this.fow.setVerticalScrollBarEnabled(false);
    this.fow.setHorizontalScrollBarEnabled(false);
    this.fow.getSettings().setJavaScriptEnabled(true);
    this.fow.loadUrl(((y)this.qZo).nmz);
    this.fow.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.fow.setVisibility(0);
    this.raJ.setPadding(this.raJ.getPaddingLeft(), (int)((y)this.qZo).qWQ, this.raJ.getPaddingRight(), (int)((y)this.qZo).qWR);
    this.raJ.setLayoutParams(new LinearLayout.LayoutParams(this.ieu, this.iev));
    AppMethodBeat.o(37192);
  }

  protected final View cpr()
  {
    AppMethodBeat.i(37194);
    FrameLayout localFrameLayout = new FrameLayout(this.context);
    AppMethodBeat.o(37194);
    return localFrameLayout;
  }

  protected final int getLayout()
  {
    return 2147483647;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p
 * JD-Core Version:    0.6.2
 */
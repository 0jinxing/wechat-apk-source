package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings.LayoutAlgorithm;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;
import com.tencent.xweb.s;

public class HtmlTextView2 extends MMWebView
{
  private s pih;

  public HtmlTextView2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(ah.getContext(), paramAttributeSet);
    AppMethodBeat.i(44023);
    this.pih = new HtmlTextView2.2(this);
    initView();
    AppMethodBeat.o(44023);
  }

  public HtmlTextView2(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(ah.getContext(), paramAttributeSet, paramInt);
    AppMethodBeat.i(44022);
    this.pih = new HtmlTextView2.2(this);
    initView();
    AppMethodBeat.o(44022);
  }

  private void initView()
  {
    AppMethodBeat.i(44024);
    setOnTouchListener(new HtmlTextView2.1(this));
    setVerticalScrollBarEnabled(false);
    getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
    getSettings().setDefaultTextEncodingName("utf-8");
    AppMethodBeat.o(44024);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(44025);
    setWebViewClient(null);
    loadData(paramString, "text/html", "utf-8");
    setWebViewClient(this.pih);
    AppMethodBeat.o(44025);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.HtmlTextView2
 * JD-Core Version:    0.6.2
 */
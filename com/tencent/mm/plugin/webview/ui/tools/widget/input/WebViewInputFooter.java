package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

public final class WebViewInputFooter extends LinearLayout
{
  public MMActivity crP;
  private ImageButton jfS;
  private boolean oin;
  public int state;
  private WebViewInputFooter.c uKm;
  private WebViewInputFooter.a uKn;
  private WebViewInputFooter.b uKo;
  private WebViewSmileyPanel uKp;
  public View uKq;
  private View uKr;
  private View uKs;
  public MMEditText uKt;
  public LinearLayout uKu;
  public boolean uKv;
  private int uKw;

  public WebViewInputFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(10083);
    this.state = 0;
    this.uKw = 2147483647;
    this.oin = true;
    this.crP = ((MMActivity)paramContext);
    paramContext = (ViewGroup)View.inflate(this.crP, 2130971213, this);
    this.uKu = ((LinearLayout)paramContext.findViewById(2131829170));
    this.uKr = paramContext.findViewById(2131829174);
    this.uKs = paramContext.findViewById(2131829175);
    this.uKq = paramContext.findViewById(2131829173);
    this.uKt = ((MMEditText)paramContext.findViewById(2131829171));
    this.jfS = ((ImageButton)paramContext.findViewById(2131829172));
    this.jfS.setOnClickListener(new WebViewInputFooter.1(this));
    this.uKt.setOnTouchListener(new WebViewInputFooter.2(this));
    this.uKp = new WebViewSmileyPanel(getContext());
    this.uKp.setVisibility(8);
    this.uKp.setBackgroundResource(2130837979);
    this.uKp.setOnTextOperationListener(new WebViewInputFooter.3(this));
    ((LinearLayout)findViewById(2131820987)).addView(this.uKp, -1, 0);
    this.uKs.setOnClickListener(new WebViewInputFooter.4(this));
    this.uKt.addTextChangedListener(new WebViewInputFooter.5(this));
    AppMethodBeat.o(10083);
  }

  private void aRe()
  {
    AppMethodBeat.i(10085);
    if (this.uKo != null)
      this.uKo.cWU();
    this.uKp.setVisibility(8);
    this.jfS.setImageResource(2131231459);
    this.state = 0;
    AppMethodBeat.o(10085);
  }

  private int cWF()
  {
    int i = 0;
    AppMethodBeat.i(10084);
    if (this.uKo != null)
      this.uKo.cWT();
    if (this.uKt != null)
      this.crP.hideVKB(this.uKt);
    this.uKp.setVisibility(0);
    Object localObject = this.uKp;
    if (((WebViewSmileyPanel)localObject).WL != null)
      ((WebViewSmileyPanel)localObject).WL.setVisibility(0);
    localObject = this.uKp.getLayoutParams();
    if ((localObject != null) && (this.oin))
    {
      ((ViewGroup.LayoutParams)localObject).height = j.gs(getContext());
      this.uKp.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if (localObject != null)
    {
      i = ((ViewGroup.LayoutParams)localObject).height;
      AppMethodBeat.o(10084);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(10084);
    }
  }

  private void dcY()
  {
    AppMethodBeat.i(10088);
    if (this.uKt != null)
    {
      this.uKt.clearFocus();
      this.uKt.setFocusable(false);
      this.uKt.setFocusableInTouchMode(false);
    }
    AppMethodBeat.o(10088);
  }

  public final int dcZ()
  {
    AppMethodBeat.i(10089);
    setVisibility(0);
    if (this.uKu != null)
      this.uKu.setVisibility(8);
    this.uKv = true;
    this.state = 1;
    int i = cWF();
    AppMethodBeat.o(10089);
    return i;
  }

  public final void dda()
  {
    AppMethodBeat.i(10091);
    if (this.uKv)
      setVisibility(8);
    this.state = 0;
    aRe();
    AppMethodBeat.o(10091);
  }

  public final void hide()
  {
    AppMethodBeat.i(10090);
    setVisibility(8);
    if (this.crP != null)
    {
      if (this.uKt != null)
        this.crP.hideVKB(this.uKt);
      this.crP.aqX();
    }
    this.state = 0;
    aRe();
    dcY();
    AppMethodBeat.o(10090);
  }

  public final boolean isShown()
  {
    AppMethodBeat.i(10092);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(10092);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10092);
    }
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(10086);
    super.onDetachedFromWindow();
    dcY();
    if ((this.uKt != null) && (this.crP != null))
      this.crP.hideVKB(this.uKt);
    this.uKt = null;
    WebViewSmileyPanel localWebViewSmileyPanel = this.uKp;
    c localc = localWebViewSmileyPanel.uKz;
    localc.uKF = null;
    localc.jiq = null;
    if (localWebViewSmileyPanel.WL != null)
    {
      ((ViewGroup)localWebViewSmileyPanel.WL.getParent()).removeView(localWebViewSmileyPanel.WL);
      ((ViewGroup)localWebViewSmileyPanel.WL).removeAllViews();
      localWebViewSmileyPanel.WL = null;
    }
    localWebViewSmileyPanel.jiE = null;
    removeAllViews();
    this.crP = null;
    this.uKm = null;
    AppMethodBeat.o(10086);
  }

  public final void setMaxCount(int paramInt)
  {
    if (paramInt > 0)
      this.uKw = paramInt;
  }

  public final void setOnSmileyChosenListener(WebViewInputFooter.a parama)
  {
    this.uKn = parama;
  }

  public final void setOnSmileyPanelVisibilityChangedListener(WebViewInputFooter.b paramb)
  {
    this.uKo = paramb;
  }

  public final void setOnTextSendListener(WebViewInputFooter.c paramc)
  {
    this.uKm = paramc;
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(10087);
    this.uKt.setText("");
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(10087);
    while (true)
    {
      return;
      try
      {
        this.uKt.append(paramString);
        ab.d("MicroMsg.WebViewInputFooter", "after setText, editText.getText() = %s", new Object[] { this.uKt.getText() });
        AppMethodBeat.o(10087);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.d("MicroMsg.WebViewInputFooter", "appendText, exp = %s", new Object[] { paramString });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter
 * JD-Core Version:    0.6.2
 */
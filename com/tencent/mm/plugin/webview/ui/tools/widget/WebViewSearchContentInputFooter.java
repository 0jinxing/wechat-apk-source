package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class WebViewSearchContentInputFooter extends LinearLayout
{
  private View uKe;
  private EditText uKf;
  private View uKg;
  private View uKh;
  private View uKi;
  private TextView uKj;
  private WebViewSearchContentInputFooter.a uKk;

  public WebViewSearchContentInputFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(10065);
    init();
    AppMethodBeat.o(10065);
  }

  public WebViewSearchContentInputFooter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(10066);
    init();
    AppMethodBeat.o(10066);
  }

  private void init()
  {
    AppMethodBeat.i(10067);
    View localView = inflate(getContext(), 2130971217, this);
    this.uKf = ((EditText)localView.findViewById(2131820980));
    this.uKg = localView.findViewById(2131827693);
    this.uKh = localView.findViewById(2131829187);
    this.uKi = localView.findViewById(2131829188);
    this.uKj = ((TextView)localView.findViewById(2131829186));
    this.uKe = localView.findViewById(2131829185);
    this.uKg.setOnClickListener(new WebViewSearchContentInputFooter.1(this));
    this.uKh.setOnClickListener(new WebViewSearchContentInputFooter.2(this));
    this.uKi.setOnClickListener(new WebViewSearchContentInputFooter.3(this));
    this.uKf.setOnKeyListener(new WebViewSearchContentInputFooter.4(this));
    this.uKf.setOnFocusChangeListener(new WebViewSearchContentInputFooter.5(this));
    this.uKf.addTextChangedListener(new WebViewSearchContentInputFooter.6(this));
    this.uKf.setSelectAllOnFocus(true);
    reset();
    AppMethodBeat.o(10067);
  }

  public final void dcX()
  {
    AppMethodBeat.i(10069);
    this.uKf.setText("");
    AppMethodBeat.o(10069);
  }

  public String getSearchContent()
  {
    AppMethodBeat.i(10074);
    String str = this.uKf.getText().toString();
    AppMethodBeat.o(10074);
    return str;
  }

  public final void hide()
  {
    AppMethodBeat.i(10072);
    Context localContext = this.uKf.getContext();
    if ((localContext instanceof MMActivity))
      ((MMActivity)localContext).hideVKB(this.uKf);
    this.uKf.clearFocus();
    setVisibility(8);
    if (this.uKk != null)
      this.uKk.cWV();
    AppMethodBeat.o(10072);
  }

  public boolean isShown()
  {
    AppMethodBeat.i(10070);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(10070);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10070);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(10068);
    this.uKj.setText("");
    this.uKh.setEnabled(false);
    this.uKi.setEnabled(false);
    AppMethodBeat.o(10068);
  }

  public void setActionDelegate(WebViewSearchContentInputFooter.a parama)
  {
    this.uKk = parama;
  }

  public final void show()
  {
    AppMethodBeat.i(10071);
    setVisibility(0);
    this.uKf.requestFocus();
    postDelayed(new WebViewSearchContentInputFooter.7(this), 100L);
    AppMethodBeat.o(10071);
  }

  public final void t(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(10073);
    if (!paramBoolean)
    {
      AppMethodBeat.o(10073);
      return;
    }
    Object localObject = this.uKj;
    if (paramInt2 == 0)
    {
      paramInt1 = 0;
      label32: ((TextView)localObject).setText(String.format("%d/%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      localObject = this.uKi;
      if (paramInt2 <= 0)
        break label112;
      paramBoolean = true;
      label72: ((View)localObject).setEnabled(paramBoolean);
      localObject = this.uKh;
      if (paramInt2 <= 0)
        break label117;
    }
    label112: label117: for (paramBoolean = bool; ; paramBoolean = false)
    {
      ((View)localObject).setEnabled(paramBoolean);
      AppMethodBeat.o(10073);
      break;
      paramInt1++;
      break label32;
      paramBoolean = false;
      break label72;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter
 * JD-Core Version:    0.6.2
 */
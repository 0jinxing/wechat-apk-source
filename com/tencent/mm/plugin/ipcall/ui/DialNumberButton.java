package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.bo;

public class DialNumberButton extends RelativeLayout
{
  private TextView nzH;
  private TextView nzI;
  private boolean nzJ;

  public DialNumberButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(21953);
    this.nzJ = false;
    LayoutInflater.from(getContext()).inflate(2130969286, this);
    this.nzH = ((TextView)findViewById(2131823282));
    this.nzI = ((TextView)findViewById(2131823283));
    if (d.iW(16))
    {
      this.nzH.setTypeface(Typeface.create("sans-serif-light", 0));
      this.nzI.setTypeface(Typeface.create("sans-serif-normal", 0));
    }
    setClipChildren(false);
    setClipToPadding(false);
    AppMethodBeat.o(21953);
  }

  public final void eK(String paramString1, String paramString2)
  {
    AppMethodBeat.i(21957);
    if ((!bo.isNullOrNil(paramString1)) && (paramString1.length() == 1))
      this.nzH.setText(paramString1);
    if ((bo.isNullOrNil(paramString2)) && (!"1".equals(paramString1)))
    {
      this.nzI.setVisibility(8);
      AppMethodBeat.o(21957);
    }
    while (true)
    {
      return;
      this.nzI.setText(paramString2);
      this.nzI.setVisibility(0);
      AppMethodBeat.o(21957);
    }
  }

  public String getNumberText()
  {
    AppMethodBeat.i(21955);
    String str = this.nzH.getText().toString();
    AppMethodBeat.o(21955);
    return str;
  }

  public String getOtherText()
  {
    AppMethodBeat.i(21956);
    String str = this.nzI.getText().toString();
    AppMethodBeat.o(21956);
    return str;
  }

  public void setInTalkUIMode(boolean paramBoolean)
  {
    AppMethodBeat.i(21958);
    this.nzJ = paramBoolean;
    if (this.nzJ)
    {
      if (("#".equals(this.nzH.getText())) || ("*".equals(this.nzH.getText())))
        this.nzH.setTextColor(getContext().getResources().getColor(2131689943));
      while (true)
      {
        this.nzI.setTextColor(getContext().getResources().getColor(2131689943));
        setBackgroundDrawable(getResources().getDrawable(2130838479));
        AppMethodBeat.o(21958);
        return;
        this.nzH.setTextColor(getContext().getResources().getColor(2131689945));
      }
    }
    if (("#".equals(this.nzH.getText())) || ("*".equals(this.nzH.getText())))
      this.nzH.setTextColor(getContext().getResources().getColor(2131689943));
    while (true)
    {
      this.nzI.setTextColor(getContext().getResources().getColor(2131689943));
      setBackgroundDrawable(getResources().getDrawable(2130838480));
      AppMethodBeat.o(21958);
      break;
      this.nzH.setTextColor(getContext().getResources().getColor(2131689944));
    }
  }

  public final void setNumberTextSize$255e752(float paramFloat)
  {
    AppMethodBeat.i(21954);
    this.nzH.setTextSize(0, paramFloat);
    AppMethodBeat.o(21954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.DialNumberButton
 * JD-Core Version:    0.6.2
 */
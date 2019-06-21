package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R.a;
import com.tencent.mm.sdk.platformtools.bo;

public class IPCallFuncButton extends LinearLayout
{
  private boolean kcj;
  private ImageView nDf;
  private TextView nDg;
  private Drawable nDh;
  private Drawable nDi;
  private Drawable nDj;
  private boolean nDk;
  private boolean nDl;
  private a nDm;
  private View.OnTouchListener nDn;
  private String text;

  public IPCallFuncButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22181);
    this.kcj = false;
    this.nDl = true;
    this.nDn = new IPCallFuncButton.1(this);
    LayoutInflater.from(getContext()).inflate(2130969889, this);
    this.nDf = ((ImageView)findViewById(2131820869));
    this.nDg = ((TextView)findViewById(2131820674));
    paramContext = getContext().getTheme().obtainStyledAttributes(paramAttributeSet, R.a.IPCallFuncButton, 0, 0);
    this.nDh = paramContext.getDrawable(0);
    this.nDi = paramContext.getDrawable(1);
    this.nDk = paramContext.getBoolean(4, false);
    this.nDj = paramContext.getDrawable(2);
    int i = paramContext.getResourceId(3, 0);
    if (i != 0)
      this.text = getContext().getString(i);
    paramContext.recycle();
    if (!bo.isNullOrNil(this.text))
      this.nDg.setText(this.text);
    while (true)
    {
      if (this.nDh != null)
        this.nDf.setImageDrawable(this.nDh);
      this.nDf.setClickable(true);
      this.nDf.setOnTouchListener(this.nDn);
      AppMethodBeat.o(22181);
      return;
      this.nDg.setVisibility(8);
    }
  }

  public String getFuncText()
  {
    return this.text;
  }

  public final boolean isChecked()
  {
    if (this.nDk);
    for (boolean bool = this.kcj; ; bool = false)
      return bool;
  }

  public void setCheckBoxMode(boolean paramBoolean)
  {
    AppMethodBeat.i(22183);
    if (this.nDk != paramBoolean)
    {
      this.nDk = paramBoolean;
      this.kcj = false;
      if (this.nDh != null)
        this.nDf.setImageDrawable(this.nDh);
    }
    AppMethodBeat.o(22183);
  }

  public void setChecked(boolean paramBoolean)
  {
    AppMethodBeat.i(22185);
    if ((paramBoolean != this.kcj) && (this.nDk))
    {
      this.kcj = paramBoolean;
      if (this.kcj)
      {
        this.nDf.setImageDrawable(this.nDi);
        AppMethodBeat.o(22185);
      }
    }
    while (true)
    {
      return;
      this.nDf.setImageDrawable(this.nDh);
      AppMethodBeat.o(22185);
    }
  }

  public void setClickCallback(a parama)
  {
    this.nDm = parama;
  }

  public void setEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(22184);
    if (paramBoolean != this.nDl)
    {
      this.nDl = paramBoolean;
      if ((this.nDl) || (this.nDj == null))
        break label56;
      this.nDf.setImageDrawable(this.nDj);
    }
    while (true)
    {
      this.kcj = false;
      AppMethodBeat.o(22184);
      return;
      label56: this.nDf.setImageDrawable(this.nDh);
    }
  }

  public void setFuncText(String paramString)
  {
    AppMethodBeat.i(22182);
    this.text = paramString;
    this.nDg.setText(this.text);
    AppMethodBeat.o(22182);
  }

  public static abstract interface a
  {
    public abstract void iv(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton
 * JD-Core Version:    0.6.2
 */
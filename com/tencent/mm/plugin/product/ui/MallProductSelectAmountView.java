package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MallProductSelectAmountView extends LinearLayout
{
  private TextView gng;
  private ImageView pje;
  private ImageView pjf;
  private int pjg;
  private int pjh;
  private int pji;
  private int pjj;
  private MallProductSelectAmountView.a pjk;

  public MallProductSelectAmountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(44097);
    this.gng = null;
    this.pje = null;
    this.pjf = null;
    this.pjg = 2147483647;
    this.pjh = 1;
    this.pji = 1;
    this.pjj = this.pji;
    this.pjk = null;
    paramContext = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2130970394, this, true);
    this.gng = ((TextView)paramContext.findViewById(2131826604));
    this.pje = ((ImageView)paramContext.findViewById(2131826605));
    this.pjf = ((ImageView)paramContext.findViewById(2131826603));
    this.gng.setText(this.pjj);
    this.pje.setOnClickListener(new MallProductSelectAmountView.1(this));
    this.pjf.setOnClickListener(new MallProductSelectAmountView.2(this));
    AppMethodBeat.o(44097);
  }

  private boolean cag()
  {
    boolean bool = false;
    AppMethodBeat.i(44099);
    if (this.pjj > this.pjg)
    {
      this.pjj = this.pjg;
      if (this.pjk != null)
        this.pjk.gF(this.pjj);
      if (this.pjk != null)
        this.pjk.eZ(this.pjj, this.pjh);
      this.gng.setText(this.pjj);
      AppMethodBeat.o(44099);
    }
    while (true)
    {
      return bool;
      if (this.pjj > this.pji)
        this.pjf.setEnabled(true);
      while (true)
      {
        AppMethodBeat.o(44099);
        bool = true;
        break;
        if (this.pjj != this.pji)
          break label152;
        this.pjf.setEnabled(false);
      }
      label152: this.pjf.setEnabled(false);
      this.pjj = this.pji;
      if (this.pjk != null)
        this.pjk.gF(this.pjj);
      if (this.pjk != null)
        this.pjk.eZ(this.pjj, 2);
      this.gng.setText(this.pjj);
      AppMethodBeat.o(44099);
    }
  }

  public final void eY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(44102);
    if (paramInt1 > paramInt2)
      this.pjh = 3;
    for (this.pjg = paramInt2; ; this.pjg = paramInt1)
    {
      cag();
      if (this.pjk != null)
        this.pjk.gF(this.pjj);
      AppMethodBeat.o(44102);
      return;
      this.pjh = 1;
    }
  }

  public void setAddEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(44100);
    this.pje.setEnabled(paramBoolean);
    AppMethodBeat.o(44100);
  }

  public void setAmount(int paramInt)
  {
    AppMethodBeat.i(44098);
    this.pjj = paramInt;
    if (cag())
    {
      this.gng.setText(this.pjj);
      if (this.pjk != null)
        this.pjk.gF(this.pjj);
    }
    AppMethodBeat.o(44098);
  }

  public void setMinAmount(int paramInt)
  {
    AppMethodBeat.i(44103);
    this.pji = paramInt;
    cag();
    AppMethodBeat.o(44103);
  }

  public void setOnAmountChangeListener(MallProductSelectAmountView.a parama)
  {
    this.pjk = parama;
  }

  public void setRemoveEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(44101);
    this.pjf.setEnabled(paramBoolean);
    AppMethodBeat.o(44101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectAmountView
 * JD-Core Version:    0.6.2
 */
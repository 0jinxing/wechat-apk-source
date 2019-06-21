package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMRadioImageButton extends ImageButton
  implements Checkable
{
  private boolean lB = true;
  private boolean nG;
  private boolean ywV;
  private MMRadioImageButton.a ywW;
  private MMRadioImageButton.a ywX;

  public MMRadioImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public MMRadioImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean isChecked()
  {
    return this.nG;
  }

  public boolean performClick()
  {
    AppMethodBeat.i(106761);
    toggle();
    AppMethodBeat.o(106761);
    return false;
  }

  public void setCheckable(boolean paramBoolean)
  {
    this.lB = paramBoolean;
  }

  public void setChecked(boolean paramBoolean)
  {
    AppMethodBeat.i(106762);
    if (this.nG != paramBoolean)
    {
      this.nG = paramBoolean;
      setSelected(this.nG);
      refreshDrawableState();
      if (this.ywV)
        AppMethodBeat.o(106762);
    }
    while (true)
    {
      return;
      this.ywV = true;
      if (this.ywW != null)
        this.ywW.a(this);
      if (this.ywX != null)
        this.ywX.a(this);
      this.ywV = false;
      AppMethodBeat.o(106762);
    }
  }

  public void setOnMMRadioButtonCheckedChangeListener(MMRadioImageButton.a parama)
  {
    this.ywW = parama;
  }

  public void setOnOtherMMRadioButtonCheckedChangeListener(MMRadioImageButton.a parama)
  {
    this.ywX = parama;
  }

  public void toggle()
  {
    AppMethodBeat.i(106760);
    boolean bool;
    if (this.lB)
    {
      if (isChecked())
        break label78;
      if (!this.nG)
      {
        bool = true;
        setChecked(bool);
        AppMethodBeat.o(106760);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      if (this.ywW != null)
        this.ywW.b(this);
      if (this.ywX != null)
        this.ywX.b(this);
      label78: AppMethodBeat.o(106760);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMRadioImageButton
 * JD-Core Version:    0.6.2
 */
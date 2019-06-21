package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;

public class KeyboardLinearLayout extends OnLayoutChangedLinearLayout
{
  public String TAG;
  private boolean mHasInit;
  private int mHeight;
  private boolean yjC;
  private a yjD;

  public KeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105972);
    this.TAG = "MicroMsg.KeyboardLinearLayout";
    this.mHasInit = false;
    this.mHasInit = false;
    this.mHeight = 0;
    this.yjC = false;
    this.TAG += getId();
    AppMethodBeat.o(105972);
  }

  public KeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.TAG = "MicroMsg.KeyboardLinearLayout";
    this.mHasInit = false;
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105973);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    rP(paramInt4);
    AppMethodBeat.o(105973);
  }

  protected void rP(int paramInt)
  {
    AppMethodBeat.i(105974);
    if (!this.mHasInit)
    {
      this.mHasInit = true;
      this.mHeight = paramInt;
      ab.i(this.TAG, "init height:%d", new Object[] { Integer.valueOf(this.mHeight) });
      if (this.yjD != null)
        this.yjD.sD(-1);
      if ((this.mHasInit) && (!this.yjC) && (this.mHeight - paramInt > 100))
      {
        this.yjC = true;
        sD(-3);
        ab.w(this.TAG, "show keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
      }
      if ((this.mHasInit) && (this.yjC) && (this.mHeight - paramInt <= 100))
      {
        this.yjC = false;
        sD(-2);
        ab.w(this.TAG, "hide keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
      }
      AppMethodBeat.o(105974);
      return;
    }
    if (this.mHeight < paramInt);
    for (int i = paramInt; ; i = this.mHeight)
    {
      this.mHeight = i;
      break;
    }
  }

  protected void sD(int paramInt)
  {
    AppMethodBeat.i(105975);
    if (this.yjD != null)
      this.yjD.sD(paramInt);
    AppMethodBeat.o(105975);
  }

  public void setOnkbdStateListener(a parama)
  {
    this.yjD = parama;
  }

  public static abstract interface a
  {
    public abstract void sD(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.KeyboardLinearLayout
 * JD-Core Version:    0.6.2
 */
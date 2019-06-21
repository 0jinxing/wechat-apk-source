package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AutoResizeTextView extends TextView
  implements a.b
{
  private a nnT;

  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112354);
    h(paramAttributeSet);
    AppMethodBeat.o(112354);
  }

  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112355);
    h(paramAttributeSet);
    AppMethodBeat.o(112355);
  }

  private void h(AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(112356);
    this.nnT = a.a(this, paramAttributeSet).a(this);
    AppMethodBeat.o(112356);
  }

  public a getAutofitHelper()
  {
    return this.nnT;
  }

  public float getMaxTextSize()
  {
    return this.nnT.noa;
  }

  public float getMinTextSize()
  {
    return this.nnT.nnZ;
  }

  public float getPrecision()
  {
    return this.nnT.nob;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112357);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.nnT != null)
      this.nnT.bFJ();
    AppMethodBeat.o(112357);
  }

  public void setLines(int paramInt)
  {
    AppMethodBeat.i(112359);
    super.setLines(paramInt);
    if (this.nnT != null)
      this.nnT.wP(paramInt);
    AppMethodBeat.o(112359);
  }

  public void setMaxLines(int paramInt)
  {
    AppMethodBeat.i(112360);
    super.setMaxLines(paramInt);
    if (this.nnT != null)
      this.nnT.wP(paramInt);
    AppMethodBeat.o(112360);
  }

  public void setMaxTextSize(float paramFloat)
  {
    AppMethodBeat.i(112362);
    a locala = this.nnT;
    Context localContext = locala.sW.getContext();
    Resources localResources = Resources.getSystem();
    if (localContext != null)
      localResources = localContext.getResources();
    paramFloat = TypedValue.applyDimension(2, paramFloat, localResources.getDisplayMetrics());
    if (paramFloat != locala.noa)
    {
      locala.noa = paramFloat;
      locala.bFJ();
    }
    AppMethodBeat.o(112362);
  }

  public void setMinTextSize(int paramInt)
  {
    AppMethodBeat.i(112363);
    this.nnT.n(2, paramInt);
    AppMethodBeat.o(112363);
  }

  public void setPrecision(float paramFloat)
  {
    AppMethodBeat.i(112364);
    this.nnT.aD(paramFloat);
    AppMethodBeat.o(112364);
  }

  public void setSizeToFit(boolean paramBoolean)
  {
    AppMethodBeat.i(112361);
    this.nnT.hV(paramBoolean);
    AppMethodBeat.o(112361);
  }

  public void setTextSize(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(112358);
    super.setTextSize(paramInt, paramFloat);
    if (this.nnT != null)
    {
      a locala = this.nnT;
      if (!locala.noc)
      {
        Context localContext = locala.sW.getContext();
        Resources localResources = Resources.getSystem();
        if (localContext != null)
          localResources = localContext.getResources();
        locala.setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, localResources.getDisplayMetrics()));
      }
    }
    AppMethodBeat.o(112358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.AutoResizeTextView
 * JD-Core Version:    0.6.2
 */
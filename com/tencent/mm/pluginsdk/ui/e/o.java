package com.tencent.mm.pluginsdk.ui.e;

import android.text.TextPaint;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class o extends n
{
  private Object tag;
  private o.a vsx;

  public o()
  {
  }

  public o(Object paramObject, o.a parama)
  {
    super(2, null);
    this.vsx = parama;
    this.tag = paramObject;
  }

  public o(Object paramObject, o.a parama, int paramInt)
  {
    super(2, null);
    AppMethodBeat.i(40543);
    this.vsx = parama;
    this.tag = paramObject;
    Hy(paramInt);
    AppMethodBeat.o(40543);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(40544);
    if (this.vsx != null)
      this.vsx.a(paramView, this.tag);
    AppMethodBeat.o(40544);
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(40545);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setFakeBoldText(true);
    AppMethodBeat.o(40545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.o
 * JD-Core Version:    0.6.2
 */
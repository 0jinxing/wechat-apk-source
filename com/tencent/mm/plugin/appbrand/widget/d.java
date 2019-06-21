package com.tencent.mm.plugin.appbrand.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.e;
import com.tencent.mm.plugin.appbrand.widget.h.a;

@SuppressLint({"AppCompatCustomView"})
public class d extends TextView
  implements e
{
  private a iTW;
  private boolean ikj;

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(126658);
    super.setIncludeFontPadding(false);
    super.setLineSpacing(0.0F, 1.0F);
    super.setSpannableFactory(new d.1(this));
    AppMethodBeat.o(126658);
  }

  public final boolean aCH()
  {
    return this.ikj;
  }

  public void setInterceptEvent(boolean paramBoolean)
  {
    this.ikj = paramBoolean;
  }

  public void setLineHeight(int paramInt)
  {
    AppMethodBeat.i(126659);
    if (this.iTW == null)
      this.iTW = new a(paramInt);
    if (!this.iTW.ax(paramInt))
      AppMethodBeat.o(126659);
    while (true)
    {
      return;
      invalidate();
      AppMethodBeat.o(126659);
    }
  }

  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    AppMethodBeat.i(126660);
    TextView.BufferType localBufferType = paramBufferType;
    if (paramBufferType == TextView.BufferType.NORMAL)
      localBufferType = TextView.BufferType.SPANNABLE;
    super.setText(paramCharSequence, localBufferType);
    AppMethodBeat.o(126660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.d
 * JD-Core Version:    0.6.2
 */
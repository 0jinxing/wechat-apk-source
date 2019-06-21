package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Spanned;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.b.c.a;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.tools.f.a;
import java.lang.ref.WeakReference;

final class p$b extends f
{
  private final int jeY;
  private final f.a jeZ;

  p$b(p paramp, int paramInt, f.a parama)
  {
    super(paramInt, parama);
    this.jeY = paramInt;
    this.jeZ = parama;
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, final Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    int i = 0;
    AppMethodBeat.i(123695);
    if (a(paramSpanned.subSequence(0, paramInt3).toString() + paramSpanned.subSequence(paramInt4, paramSpanned.length()).toString(), this.jeZ) + a(paramCharSequence.subSequence(paramInt1, paramInt2).toString(), this.jeZ) > this.jeY)
      i = 1;
    CharSequence localCharSequence = paramCharSequence;
    if (i != 0)
      localCharSequence = paramCharSequence.subSequence(paramInt1, Math.max(paramInt1, Math.min(this.jeY - (paramSpanned.length() - (paramInt4 - paramInt3)), paramInt2)));
    if ((i != 0) && (bo.ac(localCharSequence)))
      if (this.jfa.zIy != null)
        break label207;
    label207: for (paramCharSequence = null; ; paramCharSequence = (EditText)this.jfa.zIy.get())
    {
      paramSpanned = this.jfa.zIC;
      if ((paramCharSequence != null) && (paramSpanned != null))
        paramCharSequence.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(123694);
            paramSpanned.JX();
            AppMethodBeat.o(123694);
          }
        });
      AppMethodBeat.o(123695);
      return localCharSequence;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.p.b
 * JD-Core Version:    0.6.2
 */
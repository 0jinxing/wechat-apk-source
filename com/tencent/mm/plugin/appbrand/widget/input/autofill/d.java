package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.ab;
import com.tencent.mm.plugin.appbrand.widget.input.d.a.a;
import java.lang.ref.WeakReference;

public final class d
{
  public static <Input extends EditText,  extends ab> void a(u paramu, Input paramInput, a.a parama)
  {
    AppMethodBeat.i(123904);
    if (!((ab)paramInput).aQQ())
    {
      AppMethodBeat.o(123904);
      return;
    }
    paramu = new WeakReference(paramu);
    paramu = new d.1(new WeakReference(paramInput), paramu);
    paramInput = ((ab)paramInput).getAutoFillController();
    paramInput.s(parama.jiX);
    paramInput.a(paramu);
    if ("screen".equalsIgnoreCase(parama.jiW));
    for (paramu = f.jic; ; paramu = f.jid)
    {
      paramInput.a(paramu);
      AppMethodBeat.o(123904);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.d
 * JD-Core Version:    0.6.2
 */
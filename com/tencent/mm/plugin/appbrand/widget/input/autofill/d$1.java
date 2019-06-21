package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.ab;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class d$1
  implements h
{
  d$1(WeakReference paramWeakReference1, WeakReference paramWeakReference2)
  {
  }

  public final void a(String paramString, h.a parama)
  {
    AppMethodBeat.i(123903);
    Object localObject = (EditText)this.jhU.get();
    u localu = (u)this.hKr.get();
    if ((localObject == null) || (localu == null))
      AppMethodBeat.o(123903);
    while (true)
    {
      return;
      int i = ((ab)localObject).getInputId();
      d.a locala = new d.a();
      localObject = new HashMap();
      ((HashMap)localObject).put("id", paramString);
      ((HashMap)localObject).put("type", parama.name().toLowerCase());
      ((HashMap)localObject).put("inputId", Integer.valueOf(i));
      locala.i(localu).s((Map)localObject).aCj();
      AppMethodBeat.o(123903);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.d.1
 * JD-Core Version:    0.6.2
 */
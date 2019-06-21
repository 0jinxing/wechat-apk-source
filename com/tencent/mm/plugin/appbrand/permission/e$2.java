package com.tencent.mm.plugin.appbrand.permission;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2
  implements d.b
{
  e$2(e parame, e.b paramb)
  {
  }

  public final void CW(String paramString)
  {
    AppMethodBeat.i(102281);
    if (this.iwT != null)
      if (TextUtils.isEmpty(paramString))
      {
        this.iwT.a(e.a.aKA());
        AppMethodBeat.o(102281);
      }
    while (true)
    {
      return;
      this.iwT.a(new e.a(-1, paramString));
      AppMethodBeat.o(102281);
    }
  }

  public final void aIX()
  {
    AppMethodBeat.i(102280);
    if (this.iwT != null)
      this.iwT.a(e.a.aKy());
    AppMethodBeat.o(102280);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(102282);
    if (this.iwT != null)
      this.iwT.a(e.a.aKB());
    AppMethodBeat.o(102282);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.e.2
 * JD-Core Version:    0.6.2
 */
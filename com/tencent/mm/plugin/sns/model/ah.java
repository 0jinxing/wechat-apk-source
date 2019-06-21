package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.g;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class ah
  implements g
{
  HashMap<String, l> ckP;

  public ah()
  {
    AppMethodBeat.i(36529);
    this.ckP = new HashMap();
    AppMethodBeat.o(36529);
  }

  public final l XW(String paramString)
  {
    AppMethodBeat.i(36530);
    paramString = (l)this.ckP.get(paramString);
    AppMethodBeat.o(36530);
    return paramString;
  }

  public final boolean a(l paraml)
  {
    AppMethodBeat.i(36533);
    boolean bool;
    if ((paraml == null) || (bo.isNullOrNil(paraml.field_userName)))
    {
      bool = false;
      AppMethodBeat.o(36533);
    }
    while (true)
    {
      return bool;
      af.cno().post(new ah.3(this, paraml));
      bool = true;
      AppMethodBeat.o(36533);
    }
  }

  public final boolean cnU()
  {
    AppMethodBeat.i(36531);
    af.cno().post(new ah.1(this));
    AppMethodBeat.o(36531);
    return true;
  }

  public final boolean cnV()
  {
    AppMethodBeat.i(36532);
    af.cno().post(new ah.2(this));
    AppMethodBeat.o(36532);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ah
 * JD-Core Version:    0.6.2
 */
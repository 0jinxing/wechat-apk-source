package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/InvokeCallbackContext;", "Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/CallbackContext;", "transitiveData", "", "(Ljava/lang/String;)V", "getTransitiveData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "plugin-appbrand-integration_release"})
final class n extends a
{
  final String hgU;

  public n(String paramString)
  {
    super((byte)0);
    this.hgU = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(134753);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof n))
      {
        paramObject = (n)paramObject;
        if (!j.j(this.hgU, paramObject.hgU));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(134753);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134753);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(134752);
    String str = this.hgU;
    int i;
    if (str != null)
    {
      i = str.hashCode();
      AppMethodBeat.o(134752);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(134752);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(134751);
    String str = "InvokeCallbackContext(transitiveData=" + this.hgU + ")";
    AppMethodBeat.o(134751);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n
 * JD-Core Version:    0.6.2
 */
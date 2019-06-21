package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ab$a
{
  public String label = "";
  public String qXE = "";
  public float value;

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(36947);
    if (paramObject == this)
      AppMethodBeat.o(36947);
    while (true)
    {
      return bool;
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((paramObject.label.equals(this.label)) && (paramObject.qXE.equals(this.qXE)) && (paramObject.value == this.value))
        {
          AppMethodBeat.o(36947);
        }
        else
        {
          AppMethodBeat.o(36947);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(36947);
        bool = false;
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(36948);
    int i = (int)(this.label.hashCode() + this.qXE.hashCode() + this.value);
    AppMethodBeat.o(36948);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab.a
 * JD-Core Version:    0.6.2
 */
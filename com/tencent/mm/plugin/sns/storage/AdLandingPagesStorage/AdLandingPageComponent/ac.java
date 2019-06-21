package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ac
{
  public float height;
  public String iconUrl;
  public float qWR;
  public float width;

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(36952);
    if (paramObject == this)
      AppMethodBeat.o(36952);
    while (true)
    {
      return bool;
      if ((paramObject instanceof ac))
      {
        paramObject = (ac)paramObject;
        if ((paramObject.iconUrl.equals(this.iconUrl)) && (paramObject.width == this.width) && (paramObject.height == this.height) && (paramObject.qWR == this.qWR))
        {
          AppMethodBeat.o(36952);
        }
        else
        {
          AppMethodBeat.o(36952);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(36952);
        bool = false;
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(36953);
    int i = super.hashCode();
    AppMethodBeat.o(36953);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ac
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class ab extends r
{
  public float borderWidth;
  public List<ab.a> itemList;
  public int qXA;
  public int qXB;
  public int qXC;
  public String qXD;
  public String qXx;
  public String qXy;
  public int qXz;

  public ab()
  {
    AppMethodBeat.i(36949);
    this.qXx = "";
    this.qXy = "";
    this.qXD = "";
    this.itemList = new ArrayList();
    AppMethodBeat.o(36949);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(36950);
    if (paramObject == this)
      AppMethodBeat.o(36950);
    while (true)
    {
      return bool;
      if ((paramObject instanceof ab))
      {
        paramObject = (ab)paramObject;
        if (paramObject.qXx == null)
        {
          if (this.qXx != null)
            break label165;
          label45: if (paramObject.borderWidth != this.borderWidth)
            break label165;
          if (paramObject.qXy != null)
            break label175;
          if (this.qXy != null)
            break label165;
          label71: if ((paramObject.qXz != this.qXz) || (paramObject.qXA != this.qXA) || (paramObject.qXB != this.qXB) || (paramObject.qXC != this.qXC))
            break label165;
          if (paramObject.itemList != null)
            break label192;
          if (this.itemList != null)
            break label165;
          label129: if (paramObject.qXD != null)
            break label211;
          if (this.qXD != null)
            break label165;
        }
        while (true)
        {
          AppMethodBeat.o(36950);
          break;
          if (paramObject.qXx.equals(this.qXx))
            break label45;
          label165: label175: label192: label211: 
          do
          {
            do
            {
              do
              {
                AppMethodBeat.o(36950);
                bool = false;
                break;
              }
              while (!paramObject.qXy.equals(this.qXy));
              break label71;
            }
            while (!paramObject.itemList.equals(this.itemList));
            break label129;
          }
          while (!paramObject.qXD.equals(this.qXD));
        }
      }
      AppMethodBeat.o(36950);
      bool = false;
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(36951);
    int i = super.hashCode();
    AppMethodBeat.o(36951);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab
 * JD-Core Version:    0.6.2
 */
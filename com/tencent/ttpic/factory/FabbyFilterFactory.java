package com.tencent.ttpic.factory;

import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FabbyFilterFactory
{
  public static BaseFilter createFilter(String paramString)
  {
    Object localObject = null;
    BaseFilter localBaseFilter = null;
    AppMethodBeat.i(81919);
    if (paramString == null)
    {
      AppMethodBeat.o(81919);
      localObject = localBaseFilter;
    }
    while (true)
    {
      return localObject;
      for (FabbyFilterFactory.FILTER_MODEL localFILTER_MODEL : FabbyFilterFactory.FILTER_MODEL.values())
        if (localFILTER_MODEL.name.equals(paramString))
        {
          localBaseFilter = TTPicFilterFactoryLocal.creatFilterById(localFILTER_MODEL.filterId);
          localObject = localBaseFilter;
          if (localBaseFilter != null)
          {
            localBaseFilter.setEffectIndex(localFILTER_MODEL.effectIndex);
            localObject = localBaseFilter;
          }
        }
      AppMethodBeat.o(81919);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.factory.FabbyFilterFactory
 * JD-Core Version:    0.6.2
 */
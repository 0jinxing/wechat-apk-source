package com.tencent.ttpic.filter;

import com.tencent.ttpic.model.ParticleParam;
import java.util.Comparator;

class FastParticleFilter$2
  implements Comparator<ParticleParam>
{
  FastParticleFilter$2(FastParticleFilter paramFastParticleFilter)
  {
  }

  public int compare(ParticleParam paramParticleParam1, ParticleParam paramParticleParam2)
  {
    return paramParticleParam1.blendFuncDst - paramParticleParam2.blendFuncDst;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FastParticleFilter.2
 * JD-Core Version:    0.6.2
 */
package com.google.android.gms.common.images.internal;

import com.google.android.gms.common.internal.Objects;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class PostProcessedResourceCache$PostProcessedResource
{
  public final int postProcessingFlags;
  public final int resId;

  public PostProcessedResourceCache$PostProcessedResource(int paramInt1, int paramInt2)
  {
    this.resId = paramInt1;
    this.postProcessingFlags = paramInt2;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!(paramObject instanceof PostProcessedResource))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (this == paramObject)
      {
        bool2 = true;
      }
      else
      {
        paramObject = (PostProcessedResource)paramObject;
        bool2 = bool1;
        if (paramObject.resId == this.resId)
        {
          bool2 = bool1;
          if (paramObject.postProcessingFlags == this.postProcessingFlags)
            bool2 = true;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(61296);
    int i = Objects.hashCode(new Object[] { Integer.valueOf(this.resId), Integer.valueOf(this.postProcessingFlags) });
    AppMethodBeat.o(61296);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.internal.PostProcessedResourceCache.PostProcessedResource
 * JD-Core Version:    0.6.2
 */
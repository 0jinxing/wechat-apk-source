package com.tencent.ttpic.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.face.Face;
import com.tencent.ttpic.model.VideoFilterEffect;
import java.util.List;

public class VideoEffectFilterBase extends VideoFilterBase
{
  private static final String TAG;
  protected VideoFilterEffect mVideoFilterEffect;

  static
  {
    AppMethodBeat.i(83074);
    TAG = VideoEffectFilterBase.class.getSimpleName();
    AppMethodBeat.o(83074);
  }

  public VideoEffectFilterBase(String paramString1, String paramString2, VideoFilterEffect paramVideoFilterEffect)
  {
    super(paramString1, paramString2);
    this.mVideoFilterEffect = paramVideoFilterEffect;
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(83072);
    super.initAttribParams();
    setTexCords(new float[] { 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F });
    AppMethodBeat.o(83072);
  }

  public void initParams()
  {
  }

  public boolean shouldRender(int paramInt1, int paramInt2, List<Face> paramList)
  {
    AppMethodBeat.i(83073);
    boolean bool;
    if ((paramInt1 == -1) || (paramInt2 == 0) || (paramList == null) || (paramList.isEmpty()))
    {
      AppMethodBeat.o(83073);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (this.mVideoFilterEffect == null)
      {
        AppMethodBeat.o(83073);
        bool = false;
      }
      else
      {
        switch (this.mVideoFilterEffect.order)
        {
        default:
          AppMethodBeat.o(83073);
          bool = false;
          break;
        case 1:
          if (paramInt1 == ((Face)paramList.get(0)).faceIndex)
          {
            AppMethodBeat.o(83073);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(83073);
            bool = false;
          }
          break;
        case 2:
          if (paramInt1 == ((Face)paramList.get(paramList.size() - 1)).faceIndex)
          {
            AppMethodBeat.o(83073);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(83073);
            bool = false;
          }
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.VideoEffectFilterBase
 * JD-Core Version:    0.6.2
 */
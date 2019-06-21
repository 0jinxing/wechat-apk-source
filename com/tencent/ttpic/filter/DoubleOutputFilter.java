package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.util.VideoGlobalContext;

public class DoubleOutputFilter extends BaseFilter
{
  public static final String FRAGMENT_SHADER;

  static
  {
    AppMethodBeat.i(82158);
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/OrigFragmentShader.dat");
    AppMethodBeat.o(82158);
  }

  public DoubleOutputFilter()
  {
    super(FRAGMENT_SHADER);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.DoubleOutputFilter
 * JD-Core Version:    0.6.2
 */
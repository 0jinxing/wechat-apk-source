package com.tencent.ttpic.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.util.VideoGlobalContext;

public class FrameVideoFilter extends FrameBaseFilter
{
  public static final String FRAGMENT_SHADER;
  public static final String VERTEX_SHADER;

  static
  {
    AppMethodBeat.i(82550);
    VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/LeftRightVertexShader.dat");
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FrameVideoFragmentShader.dat");
    AppMethodBeat.o(82550);
  }

  public FrameVideoFilter()
  {
    super(VERTEX_SHADER, FRAGMENT_SHADER);
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82549);
    super.initAttribParams();
    setTexCords(new float[] { 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F });
    AppMethodBeat.o(82549);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FrameVideoFilter
 * JD-Core Version:    0.6.2
 */
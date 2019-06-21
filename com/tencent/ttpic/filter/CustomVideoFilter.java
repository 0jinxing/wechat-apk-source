package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import com.tencent.filter.m.a;
import com.tencent.filter.m.b;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.config.MediaConfig;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.io.File;
import java.util.List;
import java.util.Set;

public class CustomVideoFilter extends VideoFilterBase
{
  private static final String TAG;
  private long frameStartTime;
  private List<NormalVideoFilter> normalFilters;
  private PTFaceAttr.PTExpression triggerType;

  static
  {
    AppMethodBeat.i(82150);
    TAG = CustomVideoFilter.class.getSimpleName();
    AppMethodBeat.o(82150);
  }

  public CustomVideoFilter(String paramString1, String paramString2, List<String> paramList, PTFaceAttr.PTExpression paramPTExpression, String paramString3)
  {
    super(paramString1, paramString2);
    AppMethodBeat.i(82143);
    this.dataPath = paramString3;
    this.triggerType = paramPTExpression;
    if (this.triggerType == null)
      this.triggerType = PTFaceAttr.PTExpression.UNKNOW;
    initParams();
    initTextureParams(paramList);
    AppMethodBeat.o(82143);
  }

  private void initTextureParams(List<String> paramList)
  {
    AppMethodBeat.i(82144);
    if (BaseUtils.isEmpty(paramList))
      AppMethodBeat.o(82144);
    while (true)
    {
      return;
      int i = 0;
      if (i < paramList.size())
      {
        Object localObject = (String)paramList.get(i);
        localObject = this.dataPath + File.separator + (String)localObject;
        if (((String)localObject).startsWith("assets://"));
        for (localObject = BitmapUtils.decodeSampledBitmapFromAssets(VideoGlobalContext.getContext(), FileUtils.getRealPath((String)localObject), MediaConfig.VIDEO_IMAGE_WIDTH, MediaConfig.VIDEO_IMAGE_HEIGHT); ; localObject = BitmapUtils.decodeSampledBitmapFromFile((String)localObject, MediaConfig.VIDEO_IMAGE_WIDTH, MediaConfig.VIDEO_IMAGE_HEIGHT))
        {
          if (BitmapUtils.isLegal((Bitmap)localObject))
            addParam(new m.k("inputImageTexture" + (i + 1), (Bitmap)localObject, 33985 + i, true));
          i++;
          break;
        }
      }
      AppMethodBeat.o(82144);
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82146);
    super.ApplyGLSLFilter();
    setTexCords(GlUtil.ORIGIN_TEX_COORDS);
    this.frameStartTime = System.currentTimeMillis();
    AppMethodBeat.o(82146);
  }

  public float[] getElementDurations(long paramLong)
  {
    AppMethodBeat.i(82149);
    float[] arrayOfFloat;
    if (BaseUtils.isEmpty(this.normalFilters))
    {
      arrayOfFloat = new float[0];
      AppMethodBeat.o(82149);
    }
    while (true)
    {
      return arrayOfFloat;
      arrayOfFloat = new float[this.normalFilters.size()];
      for (int i = 0; i < this.normalFilters.size(); i++)
        arrayOfFloat[i] = ((NormalVideoFilter)this.normalFilters.get(i)).getFrameDuration(paramLong);
      AppMethodBeat.o(82149);
    }
  }

  public void initParams()
  {
    AppMethodBeat.i(82148);
    addParam(new m.b(VideoFilterBase.SHADER_FIELD.CANVAS_SIZE.name, 0.0F, 0.0F));
    addParam(new m.b(VideoFilterBase.SHADER_FIELD.FACE_DETECT_IMAGE_SIZE.name, 0.0F, 0.0F));
    addParam(new m.a(VideoFilterBase.SHADER_FIELD.FACE_POINT.name, new float[0]));
    addParam(new m.i(VideoFilterBase.SHADER_FIELD.FACE_ACTION_TYPE.name, 0));
    addParam(new m.f(VideoFilterBase.SHADER_FIELD.FRAME_DURATION.name, 0.0F));
    addParam(new m.a(VideoFilterBase.SHADER_FIELD.ELEMENT_DURATIONS.name, new float[0]));
    addParam(new m.f(VideoFilterBase.SHADER_FIELD.AUDIO_POWER_SCALE.name, 0.0F));
    AppMethodBeat.o(82148);
  }

  public void setNormalFilters(List<NormalVideoFilter> paramList)
  {
    this.normalFilters = paramList;
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    int i = 0;
    AppMethodBeat.i(82145);
    int j;
    if (paramPTDetectInfo.triggeredExpression.contains(Integer.valueOf(this.triggerType.value)))
      j = this.triggerType.value;
    while (true)
    {
      addParam(new m.i(VideoFilterBase.SHADER_FIELD.FACE_ACTION_TYPE.name, j));
      addParam(new m.f(VideoFilterBase.SHADER_FIELD.FRAME_DURATION.name, (float)(System.currentTimeMillis() - this.frameStartTime) / 1000.0F));
      float[] arrayOfFloat;
      if (paramPTDetectInfo.facePoints != null)
      {
        arrayOfFloat = VideoMaterialUtil.toFlatArray(paramPTDetectInfo.facePoints);
        if (arrayOfFloat != null)
          addParam(new m.a(VideoFilterBase.SHADER_FIELD.FACE_POINT.name, VideoMaterialUtil.flipYPoints(arrayOfFloat, (int)(this.height * this.mFaceDetScale))));
      }
      while (true)
      {
        addParam(new m.a(VideoFilterBase.SHADER_FIELD.ELEMENT_DURATIONS.name, getElementDurations(paramPTDetectInfo.timestamp)));
        AppMethodBeat.o(82145);
        return;
        if (!paramPTDetectInfo.triggeredExpression.contains(Integer.valueOf(PTFaceAttr.PTExpression.FACE_DETECT.value)))
          break label250;
        j = PTFaceAttr.PTExpression.FACE_DETECT.value;
        break;
        arrayOfFloat = new float['´'];
        for (j = i; j < 180; j++)
          arrayOfFloat[j] = 0.0F;
        addParam(new m.a(VideoFilterBase.SHADER_FIELD.FACE_POINT.name, arrayOfFloat));
      }
      label250: j = 0;
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82147);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    addParam(new m.b(VideoFilterBase.SHADER_FIELD.CANVAS_SIZE.name, paramInt1, paramInt2));
    addParam(new m.b(VideoFilterBase.SHADER_FIELD.FACE_DETECT_IMAGE_SIZE.name, (float)(this.width * this.mFaceDetScale), (float)(this.height * this.mFaceDetScale)));
    AppMethodBeat.o(82147);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.CustomVideoFilter
 * JD-Core Version:    0.6.2
 */
package com.tencent.ttpic.filter;

import com.tencent.filter.h;
import com.tencent.filter.m.b;
import com.tencent.filter.m.i;
import com.tencent.filter.m.j;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.gles.AttributeParam;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.FastDynamicSticker;
import com.tencent.ttpic.model.FastStaticSticker;
import com.tencent.ttpic.model.FastSticker;
import com.tencent.ttpic.model.RenderParam;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.MatrixUtil;
import com.tencent.ttpic.util.VideoFilterFactory.POSITION_TYPE;
import com.tencent.ttpic.util.VideoFilterUtil.RATIO_MODE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FastStickerFilter extends VideoFilterBase
{
  private String TAG;
  private int faceCount;
  private List<RenderParam> renderParams;
  private RenderParam srcRenderParam;
  private List<FastSticker> stickerList;

  public FastStickerFilter()
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.FAST_STICKER);
    AppMethodBeat.i(82516);
    this.TAG = FastStickerFilter.class.getSimpleName();
    this.stickerList = new ArrayList();
    this.renderParams = new ArrayList();
    initParams();
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLES);
    AppMethodBeat.o(82516);
  }

  private void mergeRenderParam(RenderParam paramRenderParam, List<RenderParam> paramList)
  {
    AppMethodBeat.i(82522);
    BenchUtil.benchStart("mergeRenderParam");
    if (paramRenderParam != null);
    float[] arrayOfFloat1;
    float[] arrayOfFloat2;
    float[] arrayOfFloat3;
    float[] arrayOfFloat4;
    float[] arrayOfFloat5;
    float[] arrayOfFloat6;
    for (int i = 1; ; i = 0)
    {
      arrayOfFloat1 = new float[(paramList.size() + i) * GlUtil.EMPTY_POSITIONS_TRIANGLES.length];
      arrayOfFloat2 = new float[(paramList.size() + i) * GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length];
      arrayOfFloat3 = new float[(paramList.size() + i) * 6];
      arrayOfFloat4 = new float[(paramList.size() + i) * 6 * 2];
      arrayOfFloat5 = new float[(paramList.size() + i) * 6 * 1];
      arrayOfFloat6 = new float[(paramList.size() + i) * 6 * 3];
      if (paramRenderParam == null)
        break label981;
      for (j = 0; j < paramRenderParam.position.length; j++)
        arrayOfFloat1[j] = paramRenderParam.position[j];
    }
    for (int j = 0; j < GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length; j++)
      arrayOfFloat2[j] = GlUtil.ORIGIN_TEX_COORDS_TRIANGLES[j];
    for (j = 0; j < 6; j++)
      arrayOfFloat3[j] = 0.5F;
    for (j = 0; j < 12; j++)
      arrayOfFloat4[j] = paramRenderParam.texAnchor[(j % 2)];
    for (j = 0; j < 6; j++)
      arrayOfFloat5[j] = paramRenderParam.texScale;
    for (j = 0; j < 18; j++)
      arrayOfFloat6[j] = paramRenderParam.texRotate[(j % 3)];
    addParam(new m.n("inputImageTexture0", paramRenderParam.texture, 33985));
    label981: for (j = 1; ; j = 0)
    {
      if (!paramList.isEmpty())
      {
        paramRenderParam = new HashMap();
        int k = 0;
        int m = j;
        int n;
        while (k < paramList.size())
        {
          RenderParam localRenderParam = (RenderParam)paramList.get(k);
          if (!paramRenderParam.containsKey(localRenderParam.id))
          {
            paramRenderParam.put(localRenderParam.id, Integer.valueOf(m));
            addParam(new m.n("inputImageTexture".concat(String.valueOf(m)), ((RenderParam)paramList.get(k)).texture, 33985 + m));
          }
          for (n = 0; n < 6; n++)
            arrayOfFloat3[(m * 6 + n)] = (((Integer)paramRenderParam.get(((RenderParam)paramList.get(k)).id)).intValue() + 0.5F);
          m++;
          k++;
        }
        m = 0;
        k = j;
        while (m < paramList.size())
        {
          for (n = 0; n < ((RenderParam)paramList.get(m)).position.length; n++)
            arrayOfFloat1[(((RenderParam)paramList.get(m)).position.length * k + n)] = ((RenderParam)paramList.get(m)).position[n];
          k++;
          m++;
        }
        m = 0;
        k = j;
        while (m < paramList.size())
        {
          for (n = 0; n < GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length; n++)
            arrayOfFloat2[(GlUtil.ORIGIN_TEX_COORDS_TRIANGLES.length * k + n)] = GlUtil.ORIGIN_TEX_COORDS_TRIANGLES[n];
          k++;
          m++;
        }
        m = 0;
        k = j;
        while (m < paramList.size())
        {
          for (n = 0; n < 12; n++)
            arrayOfFloat4[(k * 6 * 2 + n)] = ((RenderParam)paramList.get(m)).texAnchor[(n % 2)];
          k++;
          m++;
        }
        m = 0;
        k = j;
        while (m < paramList.size())
        {
          for (n = 0; n < 6; n++)
            arrayOfFloat5[(k * 6 + n)] = ((RenderParam)paramList.get(m)).texScale;
          k++;
          m++;
        }
        for (k = 0; k < paramList.size(); k++)
        {
          for (m = 0; m < 18; m++)
            arrayOfFloat6[(j * 6 * 3 + m)] = ((RenderParam)paramList.get(k)).texRotate[(m % 3)];
          j++;
        }
      }
      setPositions(arrayOfFloat1);
      setTexCords(arrayOfFloat2);
      setCoordNum((paramList.size() + i) * 6);
      addAttribParam(new AttributeParam("a_stickerIndex", arrayOfFloat3, 1));
      addAttribParam(new AttributeParam("texAnchor", arrayOfFloat4, 2));
      addAttribParam(new AttributeParam("texScale", arrayOfFloat5, 1));
      addAttribParam(new AttributeParam("texRotate", arrayOfFloat6, 3));
      BenchUtil.benchEnd("mergeRenderParam");
      AppMethodBeat.o(82522);
      return;
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82517);
    super.ApplyGLSLFilter();
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).ApplyGLSLFilter();
    AppMethodBeat.o(82517);
  }

  public void addSrcTexture(int paramInt)
  {
    AppMethodBeat.i(82519);
    if (paramInt > 0)
    {
      this.srcRenderParam = new RenderParam();
      this.srcRenderParam.texture = paramInt;
      this.srcRenderParam.position = AlgoUtils.calPositionsTriangles(0.0F, this.height, this.width, 0.0F, this.width, this.height);
      this.srcRenderParam.texScale = 1.0F;
    }
    AppMethodBeat.o(82519);
  }

  public void addSticker(StickerItem paramStickerItem, String paramString)
  {
    AppMethodBeat.i(82529);
    if ((paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.STATIC.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.RELATIVE.type))
    {
      this.stickerList.add(new FastStaticSticker(paramStickerItem, paramString));
      AppMethodBeat.o(82529);
    }
    while (true)
    {
      return;
      if ((paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.DYNAMIC.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.GESTURE.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.BODY.type))
        this.stickerList.add(new FastDynamicSticker(paramStickerItem, paramString));
      AppMethodBeat.o(82529);
    }
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(82532);
    super.clearGLSLSelf();
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).destroy();
    AppMethodBeat.o(82532);
  }

  public void destroyAudio()
  {
    AppMethodBeat.i(82531);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).destroyAudio();
    AppMethodBeat.o(82531);
  }

  public int getStickerListSize()
  {
    AppMethodBeat.i(82530);
    int i = this.stickerList.size();
    AppMethodBeat.o(82530);
    return i;
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82528);
    setPositions(GlUtil.ORIGIN_TEX_COORDS_TRIANGLES);
    setTexCords(new float[] { 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F });
    setCoordNum(4);
    addAttribParam(new AttributeParam("a_stickerIndex", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 1));
    addAttribParam(new AttributeParam("texAnchor", new float[] { 0.0F, 0.0F }, 2));
    addAttribParam(new AttributeParam("texScale", new float[] { 0.0F }, 1));
    addAttribParam(new AttributeParam("texRotate", new float[] { 0.0F, 0.0F, 0.0F }, 3));
    AppMethodBeat.o(82528);
  }

  public void initParams()
  {
    AppMethodBeat.i(82523);
    addParam(new m.i("texNeedTransform", 1));
    addParam(new m.b("canvasSize", 0.0F, 0.0F));
    addParam(new m.j("u_MVPMatrix", MatrixUtil.getMVPMatrix(6.0F, 4.0F, 10.0F)));
    for (int i = 0; i <= 7; i++)
      addParam(new m.n("inputImageTexture".concat(String.valueOf(i)), 0, 33986));
    AppMethodBeat.o(82523);
  }

  public void render(h paramh)
  {
    AppMethodBeat.i(82521);
    if (((!this.renderParams.isEmpty()) && (this.faceCount > 0)) || (this.srcRenderParam != null));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        mergeRenderParam(this.srcRenderParam, this.renderParams);
        RenderProcess(paramh.texture[0], paramh.width, paramh.height, -1, 0.0D, paramh);
      }
      this.renderParams.clear();
      this.srcRenderParam = null;
      AppMethodBeat.o(82521);
      return;
    }
  }

  public void reset()
  {
    AppMethodBeat.i(82533);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).reset();
    AppMethodBeat.o(82533);
  }

  public void setAudioPause(boolean paramBoolean)
  {
    AppMethodBeat.i(82534);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).setAudioPause(paramBoolean);
    AppMethodBeat.o(82534);
  }

  public void setFaceCount(int paramInt)
  {
    this.faceCount = paramInt;
  }

  public boolean setPositions(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(82526);
    addAttribParam("position", paramArrayOfFloat);
    AppMethodBeat.o(82526);
    return true;
  }

  public void setRatioMode(VideoFilterUtil.RATIO_MODE paramRATIO_MODE)
  {
    AppMethodBeat.i(82525);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
    {
      FastSticker localFastSticker = (FastSticker)localIterator.next();
      if ((localFastSticker instanceof FastStaticSticker))
        ((FastStaticSticker)localFastSticker).setRatioMode(paramRATIO_MODE);
    }
    AppMethodBeat.o(82525);
  }

  public void setRenderParams(int paramInt)
  {
    AppMethodBeat.i(82520);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
    {
      FastSticker localFastSticker = (FastSticker)localIterator.next();
      if (localFastSticker.needRender(paramInt))
        this.renderParams.add(localFastSticker.getRenderParam().copy());
    }
    AppMethodBeat.o(82520);
  }

  public boolean setTexCords(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(82527);
    addAttribParam("inputTextureCoordinate", paramArrayOfFloat);
    AppMethodBeat.o(82527);
    return true;
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82518);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).updatePreview(paramPTDetectInfo);
    AppMethodBeat.o(82518);
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82524);
    this.width = paramInt1;
    this.height = paramInt2;
    addParam(new m.b("canvasSize", paramInt1, paramInt2));
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).updateVideoSize(paramInt1, paramInt2, paramDouble);
    AppMethodBeat.o(82524);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FastStickerFilter
 * JD-Core Version:    0.6.2
 */
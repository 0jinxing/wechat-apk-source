package com.tencent.ttpic.filter;

import com.tencent.filter.h;
import com.tencent.filter.m.b;
import com.tencent.filter.m.i;
import com.tencent.filter.m.j;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.PTFaceAttr;
import com.tencent.ttpic.gameplaysdk.model.GameParams;
import com.tencent.ttpic.gameplaysdk.model.StickerItem3D;
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
import com.tencent.ttpic.util.FrameUtil;
import com.tencent.ttpic.util.MatrixUtil;
import com.tencent.ttpic.util.VideoFilterFactory.POSITION_TYPE;
import com.tencent.ttpic.util.VideoFilterUtil.RATIO_MODE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Audio3DFilter extends VideoFilterBase
{
  private String TAG;
  private int faceCount;
  private GameFilter gameFilter;
  private h gameFrame;
  private List<StickerItem3D> itemList3D;
  private List<RenderParam> renderParams;
  private RenderParam srcRenderParam;
  private List<FastSticker> stickerList;

  public Audio3DFilter(List<StickerItem3D> paramList, int paramInt1, int paramInt2)
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.FAST_STICKER);
    AppMethodBeat.i(81954);
    this.TAG = Audio3DFilter.class.getSimpleName();
    this.stickerList = new ArrayList();
    this.renderParams = new ArrayList();
    this.itemList3D = new ArrayList();
    this.gameFrame = new h();
    this.gameFilter = new GameFilter(paramList, paramInt1, paramInt2);
    initParams();
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLES);
    AppMethodBeat.o(81954);
  }

  private void mergeRenderParam(RenderParam paramRenderParam, List<RenderParam> paramList)
  {
    AppMethodBeat.i(81961);
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
        break label982;
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
    label982: for (j = 1; ; j = 0)
    {
      if (!paramList.isEmpty())
      {
        HashMap localHashMap = new HashMap();
        int k = 0;
        int m = j;
        int n;
        while (k < paramList.size())
        {
          paramRenderParam = (RenderParam)paramList.get(k);
          if (!localHashMap.containsKey(paramRenderParam.id))
          {
            localHashMap.put(paramRenderParam.id, Integer.valueOf(m));
            addParam(new m.n("inputImageTexture".concat(String.valueOf(m)), ((RenderParam)paramList.get(k)).texture, 33985 + m));
          }
          for (n = 0; n < 6; n++)
            arrayOfFloat3[(m * 6 + n)] = (((Integer)localHashMap.get(((RenderParam)paramList.get(k)).id)).intValue() + 0.5F);
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
        k = 0;
        m = j;
        while (k < paramList.size())
        {
          for (n = 0; n < 12; n++)
            arrayOfFloat4[(m * 6 * 2 + n)] = ((RenderParam)paramList.get(k)).texAnchor[(n % 2)];
          m++;
          k++;
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
        for (m = 0; m < paramList.size(); m++)
        {
          for (k = 0; k < 18; k++)
            arrayOfFloat6[(j * 6 * 3 + k)] = ((RenderParam)paramList.get(m)).texRotate[(k % 3)];
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
      AppMethodBeat.o(81961);
      return;
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(81955);
    super.ApplyGLSLFilter();
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).ApplyGLSLFilter();
    this.gameFilter.applyGLSLFilter();
    AppMethodBeat.o(81955);
  }

  public void addSrcTexture(int paramInt)
  {
    AppMethodBeat.i(81957);
    if (paramInt > 0)
    {
      this.srcRenderParam = new RenderParam();
      this.srcRenderParam.texture = paramInt;
      this.srcRenderParam.position = AlgoUtils.calPositionsTriangles(0.0F, this.height, this.width, 0.0F, this.width, this.height);
      this.srcRenderParam.texScale = 1.0F;
    }
    AppMethodBeat.o(81957);
  }

  public void addSticker(StickerItem paramStickerItem, String paramString)
  {
    AppMethodBeat.i(81968);
    if ((paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.STATIC.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.RELATIVE.type))
    {
      this.stickerList.add(new FastStaticSticker(paramStickerItem, paramString));
      AppMethodBeat.o(81968);
    }
    while (true)
    {
      return;
      if ((paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.DYNAMIC.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.GESTURE.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.BODY.type))
        this.stickerList.add(new FastDynamicSticker(paramStickerItem, paramString));
      AppMethodBeat.o(81968);
    }
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(81971);
    super.clearGLSLSelf();
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).destroy();
    this.gameFilter.clear();
    AppMethodBeat.o(81971);
  }

  public void destroyAudio()
  {
    AppMethodBeat.i(81970);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).destroyAudio();
    AppMethodBeat.o(81970);
  }

  public int getStickerListSize()
  {
    AppMethodBeat.i(81969);
    int i = this.stickerList.size();
    AppMethodBeat.o(81969);
    return i;
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(81967);
    setPositions(GlUtil.ORIGIN_TEX_COORDS_TRIANGLES);
    setTexCords(new float[] { 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F });
    setCoordNum(4);
    addAttribParam(new AttributeParam("a_stickerIndex", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 1));
    addAttribParam(new AttributeParam("texAnchor", new float[] { 0.0F, 0.0F }, 2));
    addAttribParam(new AttributeParam("texScale", new float[] { 0.0F }, 1));
    addAttribParam(new AttributeParam("texRotate", new float[] { 0.0F, 0.0F, 0.0F }, 3));
    AppMethodBeat.o(81967);
  }

  public void initParams()
  {
    AppMethodBeat.i(81962);
    addParam(new m.i("texNeedTransform", 1));
    addParam(new m.b("canvasSize", 0.0F, 0.0F));
    addParam(new m.j("u_MVPMatrix", MatrixUtil.getMVPMatrix(6.0F, 4.0F, 10.0F)));
    for (int i = 0; i <= 7; i++)
      addParam(new m.n("inputImageTexture".concat(String.valueOf(i)), 0, 33986));
    AppMethodBeat.o(81962);
  }

  public void render(h paramh, PTFaceAttr paramPTFaceAttr)
  {
    AppMethodBeat.i(81960);
    if (((!this.renderParams.isEmpty()) && (this.faceCount > 0)) || (this.srcRenderParam != null));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        mergeRenderParam(this.srcRenderParam, this.renderParams);
        this.gameFrame.a(this.gameFilter.getGameRefTextureID(), this.gameFilter.getGameRefTextureWidth(), this.gameFilter.getGameRefTextureHeight(), 0.0D);
        FrameUtil.clearFrame(this.gameFrame, 0.0F, 0.0F, 0.0F, 0.0F, this.gameFilter.getGameRefTextureWidth(), this.gameFilter.getGameRefTextureHeight());
        RenderProcess(paramh.texture[0], this.gameFilter.getGameRefTextureWidth(), this.gameFilter.getGameRefTextureHeight(), -1, 0.0D, this.gameFrame);
        this.gameFilter.updateAndRender(paramh, paramPTFaceAttr);
      }
      this.renderParams.clear();
      this.srcRenderParam = null;
      AppMethodBeat.o(81960);
      return;
    }
  }

  public void reset()
  {
    AppMethodBeat.i(81972);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).reset();
    AppMethodBeat.o(81972);
  }

  public void setAudioPause(boolean paramBoolean)
  {
    AppMethodBeat.i(81973);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).setAudioPause(paramBoolean);
    AppMethodBeat.o(81973);
  }

  public void setFaceCount(int paramInt)
  {
    this.faceCount = paramInt;
  }

  public void setGameParams(GameParams paramGameParams, String paramString)
  {
    AppMethodBeat.i(81959);
    this.gameFilter.setGameParams(paramGameParams, paramString);
    AppMethodBeat.o(81959);
  }

  public boolean setPositions(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(81965);
    addAttribParam("position", paramArrayOfFloat);
    AppMethodBeat.o(81965);
    return true;
  }

  public void setRatioMode(VideoFilterUtil.RATIO_MODE paramRATIO_MODE)
  {
    AppMethodBeat.i(81964);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
    {
      FastSticker localFastSticker = (FastSticker)localIterator.next();
      if ((localFastSticker instanceof FastStaticSticker))
        ((FastStaticSticker)localFastSticker).setRatioMode(paramRATIO_MODE);
    }
    AppMethodBeat.o(81964);
  }

  public void setRenderParams(int paramInt)
  {
    AppMethodBeat.i(81958);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
    {
      FastSticker localFastSticker = (FastSticker)localIterator.next();
      if (localFastSticker.needRender(paramInt))
        this.renderParams.add(localFastSticker.getRenderParam().copy());
    }
    AppMethodBeat.o(81958);
  }

  public boolean setTexCords(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(81966);
    addAttribParam("inputTextureCoordinate", paramArrayOfFloat);
    AppMethodBeat.o(81966);
    return true;
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(81956);
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).updatePreview(paramPTDetectInfo);
    AppMethodBeat.o(81956);
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble, int paramInt3)
  {
    AppMethodBeat.i(81963);
    this.width = paramInt1;
    this.height = paramInt2;
    addParam(new m.b("canvasSize", paramInt1, paramInt2));
    Iterator localIterator = this.stickerList.iterator();
    while (localIterator.hasNext())
      ((FastSticker)localIterator.next()).updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.gameFilter.updateVideoSize(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(81963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.Audio3DFilter
 * JD-Core Version:    0.6.2
 */
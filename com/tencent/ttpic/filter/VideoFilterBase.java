package com.tencent.ttpic.filter;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.tencent.filter.h;
import com.tencent.filter.m;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.gles.AttributeParam;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.shader.Shader;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.shader.ShaderManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class VideoFilterBase
{
  public String dataPath;
  protected int height;
  private Map<String, AttributeParam> mAttrParams;
  private int mCoordNum;
  private GlUtil.DRAW_MODE mDrawMode;
  protected double mFaceDetScale;
  private Map<String, m> mParamList;
  private int mRenderMode;
  protected int mSTextureHandle;
  private boolean needDelProgram;
  private Shader shader;
  protected int width;

  private VideoFilterBase(Shader paramShader)
  {
    this.shader = paramShader;
    this.mAttrParams = new HashMap();
    this.mParamList = new HashMap();
    this.mSTextureHandle = -1;
    this.mCoordNum = 4;
    this.mDrawMode = GlUtil.DRAW_MODE.TRIANGLE_FAN;
  }

  public VideoFilterBase(ShaderCreateFactory.PROGRAM_TYPE paramPROGRAM_TYPE)
  {
    this(ShaderManager.getInstance().getShader(paramPROGRAM_TYPE));
  }

  public VideoFilterBase(String paramString1, String paramString2)
  {
    this(new Shader(paramString1, paramString2));
    this.needDelProgram = true;
  }

  public void ApplyGLSLFilter()
  {
    initAttribParams();
    this.shader.compile();
    Iterator localIterator = this.mParamList.values().iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).initialParams(this.shader.getShaderProgram());
    localIterator = this.mAttrParams.values().iterator();
    while (localIterator.hasNext())
      ((AttributeParam)localIterator.next()).initialParams(this.shader.getShaderProgram());
    this.mSTextureHandle = GLES20.glGetUniformLocation(this.shader.getShaderProgram(), "inputImageTexture");
  }

  public void OnDrawFrameGLSL()
  {
    this.shader.bind();
    Object localObject = this.mParamList.values().iterator();
    while (((Iterator)localObject).hasNext())
      ((m)((Iterator)localObject).next()).setParams(this.shader.getShaderProgram());
    Iterator localIterator = this.mAttrParams.values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (AttributeParam)localIterator.next();
      if (((AttributeParam)localObject).handle >= 0)
        ((AttributeParam)localObject).setParams(this.shader.getShaderProgram());
    }
  }

  public void OnDrawFrameGLSLSuper()
  {
    this.shader.bind();
    Iterator localIterator = this.mParamList.values().iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).setParams(this.shader.getShaderProgram());
  }

  public void RenderProcess(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble, h paramh)
  {
    paramh.a(paramInt4, paramInt2, paramInt3, paramDouble);
    OnDrawFrameGLSL();
    renderTexture(paramInt1, paramInt2, paramInt3);
  }

  public void addAttribParam(AttributeParam paramAttributeParam)
  {
    if (paramAttributeParam == null);
    while (true)
    {
      return;
      AttributeParam localAttributeParam1 = (AttributeParam)this.mAttrParams.get(paramAttributeParam.name);
      AttributeParam localAttributeParam2 = localAttributeParam1;
      if (localAttributeParam1 == null)
      {
        localAttributeParam2 = new AttributeParam(paramAttributeParam.name, paramAttributeParam.vertices, paramAttributeParam.perVertexFloat, false);
        this.mAttrParams.put(paramAttributeParam.name, localAttributeParam2);
      }
      localAttributeParam2.setVertices(paramAttributeParam.vertices);
      localAttributeParam2.perVertexFloat = paramAttributeParam.perVertexFloat;
    }
  }

  public void addAttribParam(String paramString, float[] paramArrayOfFloat)
  {
    addAttribParam(paramString, paramArrayOfFloat, false);
  }

  public void addAttribParam(String paramString, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return;
      AttributeParam localAttributeParam1 = (AttributeParam)this.mAttrParams.get(paramString);
      AttributeParam localAttributeParam2 = localAttributeParam1;
      if (localAttributeParam1 == null)
      {
        localAttributeParam2 = new AttributeParam(paramString, paramArrayOfFloat, paramBoolean);
        this.mAttrParams.put(paramString, localAttributeParam2);
      }
      localAttributeParam2.setVertices(paramArrayOfFloat);
    }
  }

  public void addParam(m paramm)
  {
    if (paramm == null);
    while (true)
    {
      return;
      m localm = (m)this.mParamList.get(paramm.name);
      if (localm == null)
      {
        this.mParamList.put(paramm.name, paramm);
      }
      else
      {
        paramm.handle = localm.handle;
        this.mParamList.put(paramm.name, paramm);
      }
    }
  }

  public void clearGLSLSelf()
  {
    if (this.needDelProgram)
      this.shader.clear();
    Iterator localIterator = this.mParamList.values().iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).clear();
    localIterator = this.mAttrParams.values().iterator();
    while (localIterator.hasNext())
      ((AttributeParam)localIterator.next()).clear();
  }

  public AttributeParam getAttribParam(String paramString)
  {
    return (AttributeParam)this.mAttrParams.get(paramString);
  }

  public int getProgramIds()
  {
    return this.shader.getShaderProgram();
  }

  public void initAttribParams()
  {
    setPositions(GlUtil.ORIGIN_POSITION_COORDS);
    setTexCords(GlUtil.ORIGIN_TEX_COORDS);
  }

  public abstract void initParams();

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(3553, paramInt1);
    GLES20.glTexParameterf(3553, 10241, 9729.0F);
    GLES20.glTexParameterf(3553, 10240, 9729.0F);
    GLES20.glTexParameterf(3553, 10242, 33071.0F);
    GLES20.glTexParameterf(3553, 10243, 33071.0F);
    GLES20.glUniform1i(this.mSTextureHandle, 0);
    if (this.mDrawMode == GlUtil.DRAW_MODE.TRIANGLE_STRIP)
    {
      GLES20.glDrawArrays(5, 0, this.mCoordNum);
      if (this.mRenderMode != 0)
        break label184;
      GLES20.glFinish();
    }
    while (true)
    {
      return true;
      if (this.mDrawMode == GlUtil.DRAW_MODE.TRIANGLES)
      {
        GLES20.glDrawArrays(4, 0, this.mCoordNum);
        break;
      }
      if (this.mDrawMode == GlUtil.DRAW_MODE.TRIANGLE_FAN)
      {
        GLES20.glDrawArrays(6, 0, this.mCoordNum);
        break;
      }
      if (this.mDrawMode == GlUtil.DRAW_MODE.LINES)
      {
        GLES20.glDrawArrays(1, 0, this.mCoordNum);
        break;
      }
      if (this.mDrawMode != GlUtil.DRAW_MODE.POINTS)
        break;
      GLES20.glDrawArrays(0, 0, this.mCoordNum);
      break;
      label184: if (this.mRenderMode == 1)
        GLES20.glFlush();
    }
  }

  public boolean setCoordNum(int paramInt)
  {
    this.mCoordNum = paramInt;
    return true;
  }

  public void setDrawMode(GlUtil.DRAW_MODE paramDRAW_MODE)
  {
    this.mDrawMode = paramDRAW_MODE;
  }

  public boolean setGrayCords(float[] paramArrayOfFloat)
  {
    addAttribParam("inputGrayTextureCoordinate", paramArrayOfFloat);
    return true;
  }

  public boolean setPositions(float[] paramArrayOfFloat)
  {
    addAttribParam("position", paramArrayOfFloat);
    return true;
  }

  public boolean setPositions(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    addAttribParam("position", paramArrayOfFloat, paramBoolean);
    return true;
  }

  public boolean setRenderMode(int paramInt)
  {
    this.mRenderMode = paramInt;
    return true;
  }

  public boolean setTexCords(float[] paramArrayOfFloat)
  {
    addAttribParam("inputTextureCoordinate", paramArrayOfFloat);
    return true;
  }

  public boolean setTexCords(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    addAttribParam("inputTextureCoordinate", paramArrayOfFloat, paramBoolean);
    return true;
  }

  public void updateFilterShader(ShaderCreateFactory.PROGRAM_TYPE paramPROGRAM_TYPE)
  {
    this.shader = ShaderManager.getInstance().getShader(paramPROGRAM_TYPE);
    this.needDelProgram = false;
  }

  public void updateFilterShader(String paramString1, String paramString2)
  {
    this.shader = new Shader(paramString1, paramString2);
    this.needDelProgram = true;
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    this.width = paramInt1;
    this.height = paramInt2;
    this.mFaceDetScale = paramDouble;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.VideoFilterBase
 * JD-Core Version:    0.6.2
 */
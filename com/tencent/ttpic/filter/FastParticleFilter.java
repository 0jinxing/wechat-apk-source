package com.tencent.ttpic.filter;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.tencent.filter.h;
import com.tencent.filter.m;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.gles.AttributeParam;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.model.ParticleParam;
import com.tencent.ttpic.shader.Shader;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.List<Lcom.tencent.ttpic.model.ParticleParam;>;
import java.util.Map;

public class FastParticleFilter
{
  private static final String FRAGMENT_SHADER;
  private static final int MAX_DRAW_PER_RENDER = 7;
  private static final int MAX_PARTICLE_NUM = 166;
  private static final String VERTEX_SHADER;
  private int blendFuncDst;
  private int blendFuncSrc;
  protected int height;
  private Map<String, AttributeParam> mAttrParams;
  private int mCoordNum;
  private Map<String, m> mParamList;
  protected int mSTextureHandle;
  protected double mScreenScale;
  private Shader shader;
  protected int width;

  static
  {
    AppMethodBeat.i(82487);
    VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FastParticleVertexShader.dat");
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FastParticleFragmentShader.dat");
    AppMethodBeat.o(82487);
  }

  public FastParticleFilter()
  {
    this(new Shader(VERTEX_SHADER, FRAGMENT_SHADER));
    AppMethodBeat.i(82466);
    AppMethodBeat.o(82466);
  }

  private FastParticleFilter(Shader paramShader)
  {
    AppMethodBeat.i(82467);
    this.blendFuncSrc = 0;
    this.blendFuncDst = 0;
    this.mSTextureHandle = -1;
    this.shader = paramShader;
    this.mAttrParams = new HashMap();
    this.mParamList = new HashMap();
    AppMethodBeat.o(82467);
  }

  private boolean mergeRenderParams(List<ParticleParam> paramList)
  {
    boolean bool = false;
    int i = 0;
    AppMethodBeat.i(82476);
    if (!paramList.isEmpty())
    {
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += ((ParticleParam)paramList.get(j)).coordNum;
        j++;
      }
      setCoordNum(k);
      setBlendFuncSrc(((ParticleParam)paramList.get(0)).blendFuncSrc);
      setBlendFuncDst(((ParticleParam)paramList.get(0)).blendFuncDst);
      float[] arrayOfFloat = new float[k * 3];
      j = 0;
      int m = 0;
      while (j < paramList.size())
      {
        for (n = 0; n < ((ParticleParam)paramList.get(j)).position.length; n++)
        {
          arrayOfFloat[m] = ((ParticleParam)paramList.get(j)).position[n];
          m++;
        }
        j++;
      }
      addAttribParam(new AttributeParam("position", arrayOfFloat, 3));
      arrayOfFloat = new float[k * 2];
      int n = 0;
      j = 0;
      while (n < paramList.size())
      {
        for (m = 0; m < ((ParticleParam)paramList.get(n)).inputTextureCoordinate.length; m++)
        {
          arrayOfFloat[j] = ((ParticleParam)paramList.get(n)).inputTextureCoordinate[m];
          j++;
        }
        n++;
      }
      setTexCords(arrayOfFloat);
      arrayOfFloat = new float[k * 4];
      n = 0;
      j = 0;
      while (n < paramList.size())
      {
        for (m = 0; m < ((ParticleParam)paramList.get(n)).aColor.length; m++)
        {
          arrayOfFloat[j] = ((ParticleParam)paramList.get(n)).aColor[m];
          j++;
        }
        n++;
      }
      addAttribParam(new AttributeParam("aColor", arrayOfFloat, 4));
      arrayOfFloat = new float[k];
      j = 0;
      k = 0;
      while (j < paramList.size())
      {
        for (n = 0; n < ((ParticleParam)paramList.get(j)).coordNum; n++)
        {
          arrayOfFloat[k] = (j + 0.5F);
          k++;
        }
        j++;
      }
      addAttribParam(new AttributeParam("a_stickerIndex", arrayOfFloat, 1));
      for (j = i; j < paramList.size(); j++)
        addParam(new m.n("inputImageTexture".concat(String.valueOf(j)), ((ParticleParam)paramList.get(j)).texture, 33984 + j + 1));
      AppMethodBeat.o(82476);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(82476);
    }
  }

  private List<List<ParticleParam>> splitRenderParams(List<ParticleParam> paramList)
  {
    int i = 0;
    AppMethodBeat.i(82479);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramList = null;
      AppMethodBeat.o(82479);
    }
    while (true)
    {
      return paramList;
      Object localObject = (ParticleParam)paramList.get(0);
      int j = ((ParticleParam)localObject).blendFuncSrc;
      int k = ((ParticleParam)localObject).blendFuncDst;
      int m = ((ParticleParam)localObject).maxParticleNum;
      localObject = new ArrayList();
      int n = 1;
      while (n < paramList.size())
      {
        ParticleParam localParticleParam = (ParticleParam)paramList.get(n);
        m += localParticleParam.maxParticleNum;
        int i1;
        int i2;
        if ((n - i + 1 <= 7) && (m <= 166) && (localParticleParam.blendFuncSrc == j))
        {
          i1 = i;
          i2 = k;
          if (localParticleParam.blendFuncDst == k);
        }
        else
        {
          ((List)localObject).add(paramList.subList(i, n));
          m = localParticleParam.maxParticleNum;
          j = localParticleParam.blendFuncSrc;
          i2 = localParticleParam.blendFuncDst;
          i1 = n;
        }
        n++;
        i = i1;
        k = i2;
      }
      ((List)localObject).add(paramList.subList(i, paramList.size()));
      AppMethodBeat.o(82479);
      paramList = (List<ParticleParam>)localObject;
    }
  }

  public void OnDrawFrameGLSL()
  {
    AppMethodBeat.i(82480);
    this.shader.bind();
    Iterator localIterator = this.mParamList.values().iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).setParams(this.shader.getShaderProgram());
    localIterator = this.mAttrParams.values().iterator();
    while (localIterator.hasNext())
    {
      AttributeParam localAttributeParam = (AttributeParam)localIterator.next();
      if (localAttributeParam.handle >= 0)
        localAttributeParam.setParams(this.shader.getShaderProgram());
    }
    AppMethodBeat.o(82480);
  }

  public void addAttribParam(AttributeParam paramAttributeParam)
  {
    AppMethodBeat.i(82472);
    if (paramAttributeParam == null)
      AppMethodBeat.o(82472);
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
      AppMethodBeat.o(82472);
    }
  }

  public void addAttribParam(String paramString, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(82470);
    addAttribParam(paramString, paramArrayOfFloat, false);
    AppMethodBeat.o(82470);
  }

  public void addAttribParam(String paramString, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(82471);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(82471);
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
      AppMethodBeat.o(82471);
    }
  }

  public void addParam(m paramm)
  {
    AppMethodBeat.i(82474);
    if (paramm == null)
      AppMethodBeat.o(82474);
    while (true)
    {
      return;
      m localm = (m)this.mParamList.get(paramm.name);
      if (localm == null)
      {
        this.mParamList.put(paramm.name, paramm);
        AppMethodBeat.o(82474);
      }
      else
      {
        paramm.handle = localm.handle;
        this.mParamList.put(paramm.name, paramm);
        AppMethodBeat.o(82474);
      }
    }
  }

  public void applyGLSLFilter()
  {
    AppMethodBeat.i(82468);
    initAttribParams();
    this.shader.compile();
    Iterator localIterator = this.mParamList.values().iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).initialParams(this.shader.getShaderProgram());
    localIterator = this.mAttrParams.values().iterator();
    while (localIterator.hasNext())
      ((AttributeParam)localIterator.next()).initialParams(this.shader.getShaderProgram());
    this.mSTextureHandle = GLES20.glGetUniformLocation(this.shader.getShaderProgram(), "inputImageTexture");
    AppMethodBeat.o(82468);
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(82486);
    this.shader.clear();
    Iterator localIterator = this.mParamList.values().iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).clear();
    localIterator = this.mAttrParams.values().iterator();
    while (localIterator.hasNext())
      ((AttributeParam)localIterator.next()).clear();
    AppMethodBeat.o(82486);
  }

  public AttributeParam getAttribParam(String paramString)
  {
    AppMethodBeat.i(82473);
    paramString = (AttributeParam)this.mAttrParams.get(paramString);
    AppMethodBeat.o(82473);
    return paramString;
  }

  public int getBlendFuncDst()
  {
    return this.blendFuncDst;
  }

  public int getBlendFuncSrc()
  {
    return this.blendFuncSrc;
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82469);
    setCoordNum(6);
    addAttribParam(new AttributeParam("position", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 3));
    addAttribParam(new AttributeParam("inputTextureCoordinate", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 2));
    addAttribParam(new AttributeParam("a_stickerIndex", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 1));
    addAttribParam(new AttributeParam("aColor", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 4));
    initParams();
    AppMethodBeat.o(82469);
  }

  public void initParams()
  {
    AppMethodBeat.i(82475);
    for (int i = 0; i <= 7; i++)
      addParam(new m.n("inputImageTexture".concat(String.valueOf(i)), 0, 33986));
    AppMethodBeat.o(82475);
  }

  public void render(List<ParticleParam> paramList, h paramh)
  {
    AppMethodBeat.i(82478);
    if (paramList.size() > 0)
    {
      Collections.sort(paramList, new FastParticleFilter.1(this));
      Collections.sort(paramList, new FastParticleFilter.2(this));
      paramList = splitRenderParams(paramList).iterator();
      while (paramList.hasNext())
        if (mergeRenderParams((List)paramList.next()))
        {
          GLES20.glBindFramebuffer(36160, paramh.bJz[0]);
          GLES20.glViewport(0, 0, paramh.width, paramh.height);
          OnDrawFrameGLSL();
          renderTexture(paramh);
        }
    }
    AppMethodBeat.o(82478);
  }

  public void renderTexture(h paramh)
  {
    AppMethodBeat.i(82477);
    boolean bool = GlUtil.curBlendModeEnabled;
    GLES20.glEnable(3042);
    GLES20.glBlendFunc(getBlendFuncSrc(), getBlendFuncDst());
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(3553, paramh.texture[0]);
    GLES20.glTexParameterf(3553, 10241, 9729.0F);
    GLES20.glTexParameterf(3553, 10240, 9729.0F);
    GLES20.glTexParameterf(3553, 10242, 33071.0F);
    GLES20.glTexParameterf(3553, 10243, 33071.0F);
    GLES20.glUniform1i(this.mSTextureHandle, 0);
    GLES20.glDrawArrays(4, 0, this.mCoordNum);
    GLES20.glFlush();
    GlUtil.setBlendMode(bool);
    AppMethodBeat.o(82477);
  }

  public void setBlendFuncDst(int paramInt)
  {
    this.blendFuncDst = paramInt;
  }

  public void setBlendFuncSrc(int paramInt)
  {
    this.blendFuncSrc = paramInt;
  }

  public boolean setColors(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(82483);
    addAttribParam("aColor", paramArrayOfFloat);
    AppMethodBeat.o(82483);
    return true;
  }

  public boolean setCoordNum(int paramInt)
  {
    this.mCoordNum = paramInt;
    return true;
  }

  public boolean setPositions(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(82481);
    addAttribParam("position", paramArrayOfFloat);
    AppMethodBeat.o(82481);
    return true;
  }

  public boolean setPositions(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(82484);
    addAttribParam("position", paramArrayOfFloat, paramBoolean);
    AppMethodBeat.o(82484);
    return true;
  }

  public boolean setTexCords(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(82482);
    addAttribParam("inputTextureCoordinate", paramArrayOfFloat);
    AppMethodBeat.o(82482);
    return true;
  }

  public boolean setTexCords(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(82485);
    addAttribParam("inputTextureCoordinate", paramArrayOfFloat, paramBoolean);
    AppMethodBeat.o(82485);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FastParticleFilter
 * JD-Core Version:    0.6.2
 */
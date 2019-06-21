package com.tencent.ttpic.filter;

import android.graphics.PointF;
import android.text.TextUtils;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.logic.watermark.LogicDataManager;
import com.tencent.ttpic.model.RenderParam;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.TRIGGERED_STATUS;
import com.tencent.ttpic.model.TextRenderItem;
import com.tencent.ttpic.model.Transition;
import com.tencent.ttpic.model.TriggerCtrlItem;
import com.tencent.ttpic.model.WMGroup;
import com.tencent.ttpic.particlesystem2d.Particle;
import com.tencent.ttpic.particlesystem2d.ParticleItem;
import com.tencent.ttpic.particlesystem2d.ParticleSystem2D;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import com.tencent.ttpic.util.VideoMaterialUtil.PARTICLE_CLEAR_MODE;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class VoiceTextFilter extends VideoFilterBase
{
  private static final String TAG;
  private float faceDetScale;
  private FastRenderFilter fastRenderFilter;
  private int frameInterval;
  private boolean isBackground;
  private long lastFrameTimestamp;
  private int lastHeight;
  private int lastWidth;
  private ParticleItem[] particleItems;
  private ParticleSystem2D particleSystem2D;
  private List<RenderParam> renderParams;
  private List<StickerItem> stickerItems;
  private List<TextRenderItem> textRenderItems;
  private int zIndex;

  static
  {
    AppMethodBeat.i(83178);
    TAG = VoiceTextFilter.class.getSimpleName();
    AppMethodBeat.o(83178);
  }

  public VoiceTextFilter(int paramInt, List<StickerItem> paramList)
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.FAST_STICKER);
    AppMethodBeat.i(83160);
    this.particleSystem2D = new ParticleSystem2D(VideoGlobalContext.getContext());
    this.textRenderItems = new ArrayList();
    this.fastRenderFilter = new FastRenderFilter();
    this.renderParams = new ArrayList();
    this.lastFrameTimestamp = -1L;
    this.lastWidth = -1;
    this.lastHeight = -1;
    this.zIndex = paramInt;
    if (paramInt < 0);
    for (boolean bool = true; ; bool = false)
    {
      this.isBackground = bool;
      this.stickerItems = paramList;
      initParticleItems(paramList);
      AppMethodBeat.o(83160);
      return;
    }
  }

  private void buildRenderParams(ParticleItem paramParticleItem)
  {
    AppMethodBeat.i(83170);
    int j;
    Particle localParticle;
    RenderParam localRenderParam;
    float f1;
    float f2;
    label107: int k;
    if (paramParticleItem.particles != null)
    {
      Particle[] arrayOfParticle = paramParticleItem.particles;
      int i = arrayOfParticle.length;
      j = 0;
      if (j < i)
      {
        localParticle = arrayOfParticle[j];
        if ((localParticle.texture > 0) && (localParticle.alive))
        {
          localRenderParam = new RenderParam();
          localRenderParam.texture = localParticle.texture;
          f1 = 0.0F;
          switch (paramParticleItem.emissionMode)
          {
          default:
            f2 = 0.0F;
            k = 0;
            if (paramParticleItem.stickerItem.anchorPoint != null)
              k = paramParticleItem.stickerItem.anchorPoint[0];
            break;
          case 0:
          case 1:
          case 2:
          }
        }
      }
    }
    for (int m = paramParticleItem.stickerItem.anchorPoint[1]; ; m = 0)
    {
      f1 -= k;
      float f3 = f2 - m;
      float f4 = f1 + paramParticleItem.stickerItem.width * paramParticleItem.screenRatioScale;
      f2 = paramParticleItem.stickerItem.height * paramParticleItem.screenRatioScale + f3;
      localRenderParam.texCords = GlUtil.ORIGIN_TEX_COORDS_TRIANGLES;
      localRenderParam.texScale = localParticle.scale;
      localRenderParam.texAnchor[0] = ((f1 + f4) / 2.0F - this.width / 2);
      localRenderParam.texAnchor[1] = ((f2 + f3) / 2.0F - this.height / 2);
      localRenderParam.texRotate[2] = localParticle.rotate;
      localRenderParam.position = AlgoUtils.calPositionsTriangles(f1, f2, f4, f3, this.width, this.height);
      this.renderParams.add(localRenderParam);
      j++;
      break;
      f1 = localParticle.startX + localParticle.positionX * paramParticleItem.screenRatioScale;
      f2 = localParticle.startY + localParticle.positionY * paramParticleItem.screenRatioScale;
      break label107;
      f1 = paramParticleItem.emitterX + localParticle.positionX * paramParticleItem.screenRatioScale;
      f2 = paramParticleItem.emitterY + localParticle.positionY * paramParticleItem.screenRatioScale;
      break label107;
      f1 = localParticle.positionX * paramParticleItem.screenRatioScale;
      f2 = localParticle.positionY * paramParticleItem.screenRatioScale;
      break label107;
      AppMethodBeat.o(83170);
      return;
    }
  }

  private void initParticleItems(List<StickerItem> paramList)
  {
    AppMethodBeat.i(83161);
    if (paramList != null)
    {
      this.particleItems = new ParticleItem[paramList.size()];
      for (int i = 0; i < paramList.size(); i++)
      {
        StickerItem localStickerItem = (StickerItem)paramList.get(i);
        if (localStickerItem.wmGroupCopies != null)
        {
          localObject = localStickerItem.wmGroupCopies.iterator();
          while (((Iterator)localObject).hasNext())
            ((WMGroup)((Iterator)localObject).next()).init();
        }
        Object localObject = new ParticleItem(localStickerItem);
        ((ParticleItem)localObject).triggerCtrlItem = new TriggerCtrlItem(localStickerItem);
        ((ParticleItem)localObject).particles = new Particle[localStickerItem.transition.particleCountMax];
        ((ParticleItem)localObject).maxRepeatCount = localStickerItem.transition.repeatCount;
        ((ParticleItem)localObject).emissionMode = localStickerItem.transition.emissionMode;
        ((ParticleItem)localObject).particleAlwaysUpdate = localStickerItem.transition.particleAlwaysUpdate;
        ((ParticleItem)localObject).clearMode = localStickerItem.transition.clearMode;
        for (int j = 0; j < ((ParticleItem)localObject).particles.length; j++)
          ((ParticleItem)localObject).particles[j] = new Particle();
        this.particleItems[i] = localObject;
      }
      this.particleSystem2D.createParticles(paramList);
    }
    AppMethodBeat.o(83161);
  }

  private void recycleUnusedWMGroups()
  {
    AppMethodBeat.i(83167);
    for (ParticleItem localParticleItem : this.particleItems)
      if (localParticleItem.particles != null)
      {
        HashSet localHashSet = new HashSet();
        for (Particle localParticle : localParticleItem.particles)
          if (localParticle.alive)
            localHashSet.add(Integer.valueOf(localParticle.wmGroupId));
        for (??? = 0; ??? < localParticleItem.stickerItem.wmGroupCopies.size(); ???++)
          if ((!localHashSet.contains(Integer.valueOf(???))) && (!((WMGroup)localParticleItem.stickerItem.wmGroupCopies.get(???)).isLock()) && ((??? != localParticleItem.curWMGroupId) || ((??? == localParticleItem.curWMGroupId) && (localParticleItem.takenByParticle))))
            localParticleItem.recycleWMGroup(???);
      }
    AppMethodBeat.o(83167);
  }

  private void reset(int paramInt)
  {
    AppMethodBeat.i(83165);
    this.particleSystem2D.clearParticles(paramInt);
    if ((this.particleItems != null) && (paramInt < this.particleItems.length))
      this.particleItems[paramInt].reset();
    AppMethodBeat.o(83165);
  }

  private void resetAll()
  {
    AppMethodBeat.i(83164);
    this.particleSystem2D.reset();
    for (int i = 0; i < this.particleItems.length; i++)
      this.particleItems[i].reset();
    AppMethodBeat.o(83164);
  }

  private void updateCurEmitterPos(List<PointF> paramList1, List<PointF> paramList2)
  {
    AppMethodBeat.i(83168);
    ParticleItem[] arrayOfParticleItem = this.particleItems;
    int i = arrayOfParticleItem.length;
    int j = 0;
    if (j < i)
    {
      ParticleItem localParticleItem = arrayOfParticleItem[j];
      StickerItem localStickerItem = localParticleItem.stickerItem;
      if (localStickerItem != null);
      switch (localStickerItem.type)
      {
      case 3:
      default:
      case 1:
        while (true)
        {
          j++;
          break;
          int m;
          if (this.width / this.height >= 0.75D)
          {
            int k = (int)(this.width / 0.75D);
            m = (int)(k * localStickerItem.position[1]);
            n = (int)(this.width * localStickerItem.position[0]);
            k = (k - this.height) / 2;
            localParticleItem.emitterX = n;
            localParticleItem.emitterY = (m - k);
            localParticleItem.screenRatioScale = (this.width * 1.0F / 720.0F);
          }
          else
          {
            n = (int)(this.height * 0.75D);
            m = (int)(this.height * localStickerItem.position[1]);
            localParticleItem.emitterX = ((int)(n * localStickerItem.position[0]) - (n - this.width) / 2);
            localParticleItem.emitterY = m;
            localParticleItem.screenRatioScale = (this.height * 1.0F / 960.0F);
          }
        }
      case 2:
      case 4:
      }
      Object localObject;
      label289: PointF localPointF;
      if (VideoMaterialUtil.isGestureItem(localStickerItem))
      {
        localObject = paramList2;
        if ((localObject == null) || (((List)localObject).isEmpty()))
          break label448;
        localPointF = (PointF)((List)localObject).get(localStickerItem.alignFacePoints[0]);
        if (localStickerItem.alignFacePoints.length != 1)
          break label450;
      }
      label448: label450: for (int n = localStickerItem.alignFacePoints[0]; ; n = localStickerItem.alignFacePoints[1])
      {
        localObject = (PointF)((List)localObject).get(n);
        localObject = new PointF((localPointF.x + ((PointF)localObject).x) / 2.0F, (localPointF.y + ((PointF)localObject).y) / 2.0F);
        ((PointF)localObject).x /= this.faceDetScale;
        ((PointF)localObject).y /= this.faceDetScale;
        localParticleItem.emitterX = ((PointF)localObject).x;
        localParticleItem.emitterY = ((PointF)localObject).y;
        break;
        localObject = paramList1;
        break label289;
        break;
      }
    }
    AppMethodBeat.o(83168);
  }

  private void updateParticleItemTrigger(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(83175);
    if (this.particleItems != null)
    {
      ParticleItem[] arrayOfParticleItem = this.particleItems;
      int i = arrayOfParticleItem.length;
      int j = 0;
      if (j < i)
      {
        ParticleItem localParticleItem = arrayOfParticleItem[j];
        TRIGGERED_STATUS localTRIGGERED_STATUS = localParticleItem.triggerCtrlItem.getTriggeredStatus(paramPTDetectInfo);
        if ((localTRIGGERED_STATUS == TRIGGERED_STATUS.FIRST_TRIGGERED) || (localTRIGGERED_STATUS == TRIGGERED_STATUS.TRIGGERED));
        for (boolean bool = true; ; bool = false)
        {
          localParticleItem.triggered = bool;
          j++;
          break;
        }
      }
    }
    AppMethodBeat.o(83175);
  }

  private void updateParticleState(ParticleItem paramParticleItem, int paramInt, long paramLong)
  {
    AppMethodBeat.i(83169);
    if ((paramParticleItem.particleReachMax) && (paramParticleItem.clearMode == VideoMaterialUtil.PARTICLE_CLEAR_MODE.CLEAR_ALL.value) && (paramParticleItem.lastFrameParticleReachMax))
      paramParticleItem.canUpdateTexture = true;
    Object localObject1;
    Object localObject2;
    int j;
    if ((paramParticleItem.canUpdateTexture) || ((paramParticleItem.clearMode == VideoMaterialUtil.PARTICLE_CLEAR_MODE.CLEAR_ALL.value) && (paramParticleItem.lastFrameParticleReachMax)))
    {
      if (paramParticleItem.lockedWMGroups.isEmpty())
        break label368;
      localObject1 = new ArrayList();
      localObject2 = paramParticleItem.lockedWMGroups.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (WMGroup)((Iterator)localObject2).next();
        if (((WMGroup)localObject3).isAsyncDrawFinished())
        {
          ((WMGroup)localObject3).updateTexture(paramLong, true, false, true);
          ((WMGroup)localObject3).unlock();
          ((List)localObject1).add(localObject3);
          paramParticleItem.useWMGroup(((WMGroup)localObject3).id);
          paramParticleItem.curTexture = ((WMGroup)localObject3).getCurTexture();
          paramParticleItem.curWMGroupId = ((WMGroup)localObject3).id;
          paramParticleItem.curRepeatCount = 0;
          paramParticleItem.canUpdateTexture = false;
          paramParticleItem.takenByParticle = false;
          if ((paramParticleItem.clearMode == VideoMaterialUtil.PARTICLE_CLEAR_MODE.CLEAR_ALL.value) && (paramParticleItem.lastFrameParticleReachMax))
          {
            this.particleSystem2D.clearParticles(paramInt);
            paramParticleItem.resetWMGroup();
            paramParticleItem.useWMGroup(((WMGroup)localObject3).id);
            localObject3 = paramParticleItem.particles;
            int i = localObject3.length;
            for (j = 0; j < i; j++)
              localObject3[j].alive = false;
            this.particleSystem2D.advance(this.particleItems, this.frameInterval);
            paramParticleItem.lastFrameParticleReachMax = false;
          }
        }
      }
      paramParticleItem.lockedWMGroups.removeAll((Collection)localObject1);
    }
    while (paramParticleItem.particleAlwaysUpdate)
    {
      localObject1 = paramParticleItem.getActiveWMGroups().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (WMGroup)((Iterator)localObject1).next();
        if (((WMGroup)localObject2).updateTexture(paramLong, true, false, true))
          ((WMGroup)localObject2).unlock();
      }
      label368: localObject1 = paramParticleItem.getAvailableWMGroup();
      if (localObject1 != null)
      {
        if (!((WMGroup)localObject1).updateTexture(paramLong, true, false, true))
          break label519;
        ((WMGroup)localObject1).unlock();
        paramParticleItem.useWMGroup(((WMGroup)localObject1).id);
        paramParticleItem.curTexture = ((WMGroup)localObject1).getCurTexture();
        paramParticleItem.curWMGroupId = ((WMGroup)localObject1).id;
        paramParticleItem.curRepeatCount = 0;
        paramParticleItem.canUpdateTexture = false;
        paramParticleItem.takenByParticle = false;
      }
      while ((paramParticleItem.clearMode == VideoMaterialUtil.PARTICLE_CLEAR_MODE.CLEAR_ALL.value) && (paramParticleItem.lastFrameParticleReachMax) && (!paramParticleItem.takenByParticle))
      {
        this.particleSystem2D.clearParticles(paramInt);
        paramParticleItem.resetWMGroup();
        paramParticleItem.useWMGroup(paramParticleItem.curWMGroupId);
        localObject1 = paramParticleItem.particles;
        j = localObject1.length;
        for (paramInt = 0; paramInt < j; paramInt++)
          localObject1[paramInt].alive = false;
        label519: if (!((WMGroup)localObject1).isLock())
        {
          paramParticleItem.recycleWMGroup(((WMGroup)localObject1).id);
        }
        else
        {
          paramParticleItem.useWMGroup(((WMGroup)localObject1).id);
          paramParticleItem.lockedWMGroups.add(localObject1);
        }
      }
      continue;
      this.particleSystem2D.advance(this.particleItems, this.frameInterval);
      paramParticleItem.lastFrameParticleReachMax = false;
    }
    paramParticleItem = paramParticleItem.getActiveWMGroups().iterator();
    while (paramParticleItem.hasNext())
      ((WMGroup)paramParticleItem.next()).updateTexture(paramLong, false, true, true);
    AppMethodBeat.o(83169);
  }

  private void updateParticleStateAndBuildRenderParams(long paramLong)
  {
    AppMethodBeat.i(83171);
    this.renderParams.clear();
    int i = 0;
    if (i < this.particleItems.length)
    {
      ParticleItem localParticleItem = this.particleItems[i];
      if (((!this.isBackground) || (localParticleItem.stickerItem.zIndex < 0)) && ((this.isBackground) || (localParticleItem.stickerItem.zIndex >= 0)))
      {
        if ((!localParticleItem.triggered) || (localParticleItem.stickerItem.wmGroupCopies == null))
          break label141;
        updateParticleState(localParticleItem, i, paramLong);
        buildRenderParams(localParticleItem);
      }
      while (true)
      {
        if ((localParticleItem.clearMode == VideoMaterialUtil.PARTICLE_CLEAR_MODE.CLEAR_ALL.value) && (!localParticleItem.lastFrameParticleReachMax))
          localParticleItem.lastFrameParticleReachMax = localParticleItem.particleReachMax;
        i++;
        break;
        label141: reset(i);
      }
    }
    AppMethodBeat.o(83171);
  }

  private void updateParticles(List<PointF> paramList1, List<PointF> paramList2, long paramLong)
  {
    AppMethodBeat.i(83172);
    if (this.particleItems != null)
    {
      updateCurEmitterPos(paramList1, paramList2);
      updateParticleStateAndBuildRenderParams(paramLong);
    }
    AppMethodBeat.o(83172);
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(83162);
    super.ApplyGLSLFilter();
    this.fastRenderFilter.applyGLSLFilter();
    AppMethodBeat.o(83162);
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(83177);
    super.clearGLSLSelf();
    Object localObject = this.textRenderItems.iterator();
    while (((Iterator)localObject).hasNext())
      ((TextRenderItem)((Iterator)localObject).next()).clear();
    for (int i = 0; i < this.stickerItems.size(); i++)
    {
      localObject = (StickerItem)this.stickerItems.get(i);
      if (((StickerItem)localObject).wmGroupCopies != null)
      {
        localObject = ((StickerItem)localObject).wmGroupCopies.iterator();
        while (((Iterator)localObject).hasNext())
          ((WMGroup)((Iterator)localObject).next()).clear();
      }
    }
    this.fastRenderFilter.clearGLSLSelf();
    this.particleSystem2D.release();
    LogicDataManager.getInstance().clearVoiceTexts();
    AppMethodBeat.o(83177);
  }

  public int getZIndex()
  {
    return this.zIndex;
  }

  public void initParams()
  {
  }

  public boolean isBackground()
  {
    return this.isBackground;
  }

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(83173);
    updateAndRender(null, System.currentTimeMillis(), this.isBackground);
    AppMethodBeat.o(83173);
    return true;
  }

  public void setTriggerWords(String paramString)
  {
    AppMethodBeat.i(83176);
    if (this.particleItems != null)
    {
      ParticleItem[] arrayOfParticleItem = this.particleItems;
      int i = arrayOfParticleItem.length;
      int j = 0;
      if (j < i)
      {
        Object localObject = arrayOfParticleItem[j];
        TriggerCtrlItem localTriggerCtrlItem = ((ParticleItem)localObject).triggerCtrlItem;
        if (TextUtils.isEmpty(((ParticleItem)localObject).stickerItem.triggerWords));
        for (localObject = paramString; ; localObject = ((ParticleItem)localObject).stickerItem.triggerWords)
        {
          localTriggerCtrlItem.setTriggerWords((String)localObject);
          j++;
          break;
        }
      }
    }
    AppMethodBeat.o(83176);
  }

  public void updateAndRender(h paramh, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(83174);
    if (!this.renderParams.isEmpty())
    {
      BenchUtil.benchStart(TAG + " fastRenderFilter.render");
      this.fastRenderFilter.render(this.renderParams, paramh, true);
      BenchUtil.benchEnd(TAG + " fastRenderFilter.render");
    }
    AppMethodBeat.o(83174);
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(83166);
    BenchUtil.benchStart(TAG + " updatePreview");
    if (this.lastFrameTimestamp != -1L)
      this.frameInterval = ((int)(paramPTDetectInfo.timestamp - this.lastFrameTimestamp));
    this.lastFrameTimestamp = paramPTDetectInfo.timestamp;
    BenchUtil.benchStart(TAG + " updateParticleItemTrigger");
    updateParticleItemTrigger(paramPTDetectInfo);
    BenchUtil.benchEnd(TAG + " updateParticleItemTrigger");
    BenchUtil.benchStart(TAG + " updateParticles");
    updateParticles(paramPTDetectInfo.facePoints, paramPTDetectInfo.handPoints, paramPTDetectInfo.timestamp);
    BenchUtil.benchEnd(TAG + " updateParticles");
    BenchUtil.benchStart(TAG + " particleSystem2D.advance");
    this.particleSystem2D.advance(this.particleItems, this.frameInterval);
    BenchUtil.benchEnd(TAG + " particleSystem2D.advance");
    BenchUtil.benchStart(TAG + " recycleUnusedWMGroups");
    recycleUnusedWMGroups();
    BenchUtil.benchEnd(TAG + " recycleUnusedWMGroups");
    BenchUtil.benchEnd(TAG + " updatePreview");
    AppMethodBeat.o(83166);
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(83163);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.fastRenderFilter.updateVideoSize(paramInt1, paramInt2);
    this.faceDetScale = ((float)paramDouble);
    Iterator localIterator = this.textRenderItems.iterator();
    while (localIterator.hasNext())
      ((TextRenderItem)localIterator.next()).updateVideoSize(paramInt1, paramInt2);
    if ((this.lastWidth > 0) && (this.lastHeight > 0) && ((paramInt1 != this.lastWidth) || (paramInt2 != this.lastHeight)))
      resetAll();
    this.lastWidth = paramInt1;
    this.lastHeight = paramInt2;
    AppMethodBeat.o(83163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.VoiceTextFilter
 * JD-Core Version:    0.6.2
 */
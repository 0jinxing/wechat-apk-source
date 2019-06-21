package com.tencent.ttpic.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.a.ab;
import com.tencent.filter.h;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.VideoModule;
import com.tencent.ttpic.ar.filter.ARParticleFilter;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.face.FaceRangeStatus;
import com.tencent.ttpic.face.FaceStatusChecker;
import com.tencent.ttpic.factory.FabbyFilterFactory;
import com.tencent.ttpic.filter.ActFilters;
import com.tencent.ttpic.filter.Audio3DFilter;
import com.tencent.ttpic.filter.CrazyFaceFilters;
import com.tencent.ttpic.filter.CustomVertexFilter;
import com.tencent.ttpic.filter.CustomVideoFilter;
import com.tencent.ttpic.filter.DoodleFilter;
import com.tencent.ttpic.filter.FabbyFilters;
import com.tencent.ttpic.filter.FabbyMvFilter;
import com.tencent.ttpic.filter.FabbyMvPart;
import com.tencent.ttpic.filter.FabbyParts;
import com.tencent.ttpic.filter.FaceCropFilter;
import com.tencent.ttpic.filter.FaceMoveFilter;
import com.tencent.ttpic.filter.FaceOffByImageFilter;
import com.tencent.ttpic.filter.FaceOffFilter;
import com.tencent.ttpic.filter.FacialFeatureFilter;
import com.tencent.ttpic.filter.FastStickerFilter;
import com.tencent.ttpic.filter.GameFilter;
import com.tencent.ttpic.filter.HeadCropFilter;
import com.tencent.ttpic.filter.LipsCosFilter;
import com.tencent.ttpic.filter.MultiViewerFilter;
import com.tencent.ttpic.filter.NormalVideoFilter;
import com.tencent.ttpic.filter.ParticleXFilter;
import com.tencent.ttpic.filter.PhantomFilter;
import com.tencent.ttpic.filter.SimpleEffectVideoFilter;
import com.tencent.ttpic.filter.SnakeFaceFilter;
import com.tencent.ttpic.filter.StaticStickerFilter;
import com.tencent.ttpic.filter.ThreeDimFilter;
import com.tencent.ttpic.filter.TransformFilter;
import com.tencent.ttpic.filter.VideoFilterBase;
import com.tencent.ttpic.filter.VideoFilterList;
import com.tencent.ttpic.filter.VoiceTextFilter;
import com.tencent.ttpic.model.Audio2Text;
import com.tencent.ttpic.model.FaceFeatureItem;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.model.FaceMeshItem;
import com.tencent.ttpic.model.GridSettingModel;
import com.tencent.ttpic.model.MultiViewerItem;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.StickerItem.ValueRange;
import com.tencent.ttpic.model.VideoFilterEffect;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.particle.ParticleFilter;
import com.tencent.ttpic.particlesystemx.ParticleSystemX;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class VideoFilterUtil
{
  public static final int IMAGE_HEIGHT = 960;
  public static final int IMAGE_WIDTH = 720;
  public static final double SCREEN_RATIO = 0.75D;
  public static final int SHOW_ONCE_TEX_COUNT = 2;
  public static final String SIMPLE_FRAGMENT_SHADER;
  public static final String SIMPLE_VERTEX_SHADER;

  static
  {
    AppMethodBeat.i(84037);
    SIMPLE_VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/SimpleVertexShader.dat");
    SIMPLE_FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/SimpleFragmentShader.dat");
    AppMethodBeat.o(84037);
  }

  public static boolean actionTriggered(List<PointF> paramList, List<StickerItem> paramList1, Set<Integer> paramSet)
  {
    AppMethodBeat.i(84026);
    boolean bool;
    if (paramList == null)
    {
      AppMethodBeat.o(84026);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramList1 == null) || (paramList1.size() == 0) || (paramSet == null))
      {
        AppMethodBeat.o(84026);
        bool = true;
      }
      else
      {
        paramList = paramList1.iterator();
        while (true)
          if (paramList.hasNext())
          {
            paramList1 = (StickerItem)paramList.next();
            if ((paramList1 != null) && (paramSet.contains(Integer.valueOf(paramList1.triggerType))))
            {
              AppMethodBeat.o(84026);
              bool = true;
              break;
            }
          }
        AppMethodBeat.o(84026);
        bool = false;
      }
    }
  }

  public static boolean canUseBlendMode(VideoFilterBase paramVideoFilterBase)
  {
    boolean bool = false;
    AppMethodBeat.i(84025);
    if (paramVideoFilterBase == null)
      AppMethodBeat.o(84025);
    while (true)
    {
      return bool;
      if ((paramVideoFilterBase instanceof NormalVideoFilter))
      {
        if ((((NormalVideoFilter)paramVideoFilterBase).canUseBlendMode()) || (VideoModule.es_GL_EXT_shader_framebuffer_fetch))
        {
          AppMethodBeat.o(84025);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(84025);
        }
      }
      else if (((paramVideoFilterBase instanceof FaceOffByImageFilter)) || ((paramVideoFilterBase instanceof ThreeDimFilter)) || ((paramVideoFilterBase instanceof ARParticleFilter)) || ((paramVideoFilterBase instanceof HeadCropFilter)))
      {
        AppMethodBeat.o(84025);
        bool = true;
      }
      else if ((paramVideoFilterBase instanceof FaceOffFilter))
      {
        if ((((FaceOffFilter)paramVideoFilterBase).canUseBlendMode()) || (VideoModule.es_GL_EXT_shader_framebuffer_fetch))
        {
          AppMethodBeat.o(84025);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(84025);
        }
      }
      else if ((paramVideoFilterBase instanceof VoiceTextFilter))
      {
        AppMethodBeat.o(84025);
        bool = true;
      }
      else if ((paramVideoFilterBase instanceof ParticleFilter))
      {
        AppMethodBeat.o(84025);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(84025);
      }
    }
  }

  private static ARParticleFilter createARParticleFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84015);
    ARParticleFilter localARParticleFilter = null;
    if (VideoMaterialUtil.isARMaterial(paramVideoMaterial))
      localARParticleFilter = new ARParticleFilter(paramVideoMaterial.getArParticleList(), paramVideoMaterial.getDataPath());
    AppMethodBeat.o(84015);
    return localARParticleFilter;
  }

  private static ActFilters createActFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83999);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.MAI_MENG.value)
    {
      localObject2 = localObject1;
      if (paramVideoMaterial.getFaceExpression() != null)
        localObject2 = new ActFilters(paramVideoMaterial.getFaceExpression(), paramVideoMaterial.getDataPath());
    }
    AppMethodBeat.o(83999);
    return localObject2;
  }

  private static Audio3DFilter createAudio3DFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84005);
    if ((paramVideoMaterial != null) && (paramVideoMaterial.getAudio3DParams() != null))
    {
      Audio3DFilter localAudio3DFilter = new Audio3DFilter(paramVideoMaterial.getItemList3D(), paramVideoMaterial.getOrderMode(), paramVideoMaterial.getMaxFaceCount());
      localAudio3DFilter.setGameParams(paramVideoMaterial.getGameParams(), paramVideoMaterial.getDataPath());
      if (paramVideoMaterial.getItemList() != null)
      {
        Iterator localIterator = paramVideoMaterial.getItemList().iterator();
        while (localIterator.hasNext())
          localAudio3DFilter.addSticker((StickerItem)localIterator.next(), paramVideoMaterial.getDataPath());
      }
      if (localAudio3DFilter.getStickerListSize() > 0)
      {
        AppMethodBeat.o(84005);
        paramVideoMaterial = localAudio3DFilter;
      }
    }
    while (true)
    {
      return paramVideoMaterial;
      paramVideoMaterial = null;
      AppMethodBeat.o(84005);
    }
  }

  private static List<ParticleFilter> createBodyParticleFilters(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84034);
    ArrayList localArrayList = new ArrayList();
    List localList = paramVideoMaterial.getItemList();
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
      {
        StickerItem localStickerItem = (StickerItem)localList.get(i);
        if ((localStickerItem.particleConfig != null) && (VideoMaterialUtil.isBodyDetectItem(localStickerItem)))
          localArrayList.add(new ParticleFilter(paramVideoMaterial.getDataPath() + File.separator + localStickerItem.id, localStickerItem));
      }
    AppMethodBeat.o(84034);
    return localArrayList;
  }

  private static List<NormalVideoFilter> createBodyVideoFilterList(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84003);
    ArrayList localArrayList = new ArrayList();
    if (paramVideoMaterial.getItemList() != null)
    {
      boolean bool = VideoMaterialUtil.canMaterialUseFastRender(paramVideoMaterial);
      Iterator localIterator = paramVideoMaterial.getItemList().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (StickerItem)localIterator.next();
        if ((VideoMaterialUtil.isBodyDetectItem((StickerItem)localObject)) && (((StickerItem)localObject).particleConfig == null) && ((!bool) || (!VideoMaterialUtil.canStickerItemUseFastRender((StickerItem)localObject))))
        {
          localObject = VideoFilterFactory.createFilter((StickerItem)localObject, paramVideoMaterial.getDataPath());
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
    }
    AppMethodBeat.o(84003);
    return localArrayList;
  }

  private static CustomVideoFilter createCustomEffectVideoFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84013);
    Object localObject1 = VideoMaterialUtil.loadVideoCustomEffectFilterVertexShader(paramVideoMaterial.getDataPath());
    String str = VideoMaterialUtil.loadVideoCustomEffectFilterFragmentShader(paramVideoMaterial.getDataPath());
    Object localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1))
      localObject2 = VideoFilterFactory.VERTEX_SHADER_COMMON;
    localObject1 = str;
    if (TextUtils.isEmpty(str))
      localObject1 = VideoFilterFactory.FRAGMENT_SHADER_IMAGE;
    paramVideoMaterial = new CustomVideoFilter((String)localObject2, (String)localObject1, paramVideoMaterial.getResourceList(), getCustomFilterTriggerType(paramVideoMaterial.getItemList()), paramVideoMaterial.getDataPath());
    AppMethodBeat.o(84013);
    return paramVideoMaterial;
  }

  private static CustomVertexFilter createCustomVertexFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84014);
    Object localObject1;
    Object localObject2;
    if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.CUSTOM_VERTEX_SHADER.value)
    {
      localObject1 = VideoMaterialUtil.loadVertexShader(paramVideoMaterial.getDataPath());
      String str = VideoMaterialUtil.loadFragmentShader(paramVideoMaterial.getDataPath());
      localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1))
        localObject2 = SIMPLE_VERTEX_SHADER;
      localObject1 = str;
      if (TextUtils.isEmpty(str))
        localObject1 = SIMPLE_FRAGMENT_SHADER;
      if (BaseUtils.isEmpty(paramVideoMaterial.getItemList()));
    }
    for (paramVideoMaterial = new CustomVertexFilter((String)localObject2, (String)localObject1); ; paramVideoMaterial = null)
    {
      AppMethodBeat.o(84014);
      return paramVideoMaterial;
    }
  }

  private static CustomVideoFilter createCustomVideoFilter(VideoMaterial paramVideoMaterial)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(84012);
    String str1;
    String str2;
    if ((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.CUSTOM_BEFORE_COMMON.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.COMMON_BEFORE_CUSTOM.value))
    {
      str1 = VideoMaterialUtil.loadVertexShader(paramVideoMaterial.getDataPath());
      str2 = VideoMaterialUtil.loadFragmentShader(paramVideoMaterial.getDataPath());
      if ((TextUtils.isEmpty(str1)) && (TextUtils.isEmpty(str2)))
      {
        AppMethodBeat.o(84012);
        localObject1 = localObject2;
      }
    }
    while (true)
    {
      return localObject1;
      localObject1 = str1;
      if (TextUtils.isEmpty(str1))
        localObject1 = VideoFilterFactory.VERTEX_SHADER_COMMON;
      localObject2 = str2;
      if (TextUtils.isEmpty(str2))
        localObject2 = VideoFilterFactory.FRAGMENT_SHADER_IMAGE;
      localObject1 = new CustomVideoFilter((String)localObject1, (String)localObject2, paramVideoMaterial.getResourceList(), getCustomFilterTriggerType(paramVideoMaterial.getItemList()), paramVideoMaterial.getDataPath());
      AppMethodBeat.o(84012);
    }
  }

  private static VideoFilterBase createDoodleFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83996);
    DoodleFilter localDoodleFilter = null;
    if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.DOODLE.value)
      localDoodleFilter = new DoodleFilter();
    AppMethodBeat.o(83996);
    return localDoodleFilter;
  }

  private static VideoFilterBase createEffectFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84035);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramVideoMaterial != null)
    {
      VideoFilterEffect localVideoFilterEffect = paramVideoMaterial.getVideoFilterEffect();
      localObject2 = localObject1;
      if (localVideoFilterEffect != null)
        switch (localVideoFilterEffect.type)
        {
        default:
          localObject2 = localObject1;
        case 1:
        case 2:
        }
    }
    while (true)
    {
      AppMethodBeat.o(84035);
      return localObject2;
      localObject2 = createSimpleEffectVideoFilter(paramVideoMaterial);
      continue;
      localObject2 = createCustomEffectVideoFilter(paramVideoMaterial);
    }
  }

  private static FabbyFilters createFabbyMvFilterList(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84009);
    Object localObject1 = null;
    ArrayList localArrayList;
    Object localObject2;
    if (paramVideoMaterial.getFabbyParts() != null)
    {
      localArrayList = new ArrayList();
      Iterator localIterator = paramVideoMaterial.getFabbyParts().getParts().iterator();
      if (localIterator.hasNext())
      {
        localObject2 = (FabbyMvPart)localIterator.next();
        localObject1 = new FabbyMvFilter();
        if (((FabbyMvPart)localObject2).bgItem != null)
          ((FabbyMvFilter)localObject1).bgFilter = ((StaticStickerFilter)VideoFilterFactory.createFilter(((FabbyMvPart)localObject2).bgItem, paramVideoMaterial.getDataPath()));
        if (((FabbyMvPart)localObject2).fgItem != null)
          ((FabbyMvFilter)localObject1).fgFilter = ((StaticStickerFilter)VideoFilterFactory.createFilter(((FabbyMvPart)localObject2).fgItem, paramVideoMaterial.getDataPath()));
        if (((FabbyMvPart)localObject2).coverItem != null)
          ((FabbyMvFilter)localObject1).coverFilter = ((StaticStickerFilter)VideoFilterFactory.createFilter(((FabbyMvPart)localObject2).coverItem, paramVideoMaterial.getDataPath()));
        if (((FabbyMvPart)localObject2).filterType == 1)
          ((FabbyMvFilter)localObject1).mEffectFilter = FabbyFilterFactory.createFilter(((FabbyMvPart)localObject2).filterId);
      }
    }
    label166: label187: label374: label375: 
    while (true)
    {
      ((FabbyMvFilter)localObject1).mvPart = ((FabbyMvPart)localObject2);
      localObject2 = ((FabbyMvPart)localObject2).gridSettingMap.iterator();
      int i = 0;
      Object localObject3;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Pair)((Iterator)localObject2).next();
        if (((GridSettingModel)((Pair)localObject3).second).canvasRectList.size() <= i)
          break label374;
        i = ((GridSettingModel)((Pair)localObject3).second).canvasRectList.size();
      }
      while (true)
      {
        break label187;
        if (((FabbyMvPart)localObject2).filterType != 2)
          break label375;
        ((FabbyMvFilter)localObject1).mEffectFilter = new ab();
        localObject3 = BitmapUtils.decodeSampledBitmapFromFile(paramVideoMaterial.getDataPath() + File.separator + ((FabbyMvPart)localObject2).lutFile, 1);
        ((FabbyMvFilter)localObject1).mEffectFilter.addParam(new m.k("inputImageTexture2", (Bitmap)localObject3, 33986, true));
        break label166;
        localArrayList.add(localObject1);
        break;
        localObject1 = new FabbyFilters(localArrayList, paramVideoMaterial.getDataPath(), paramVideoMaterial.getFabbyParts().getAudioFile());
        AppMethodBeat.o(84009);
        return localObject1;
      }
    }
  }

  private static FaceCropFilter createFaceCropFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84016);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramVideoMaterial != null)
    {
      localObject2 = localObject1;
      if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_CROP.value)
        localObject2 = new FaceCropFilter(paramVideoMaterial);
    }
    AppMethodBeat.o(84016);
    return localObject2;
  }

  private static List<NormalVideoFilter> createFaceFilterList(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84001);
    ArrayList localArrayList = new ArrayList();
    if (paramVideoMaterial.getItemList() != null)
    {
      boolean bool = VideoMaterialUtil.canMaterialUseFastRender(paramVideoMaterial);
      Iterator localIterator = paramVideoMaterial.getItemList().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (StickerItem)localIterator.next();
        if ((VideoMaterialUtil.isFaceItem((StickerItem)localObject)) && (((StickerItem)localObject).particleConfig == null) && ((!bool) || (!VideoMaterialUtil.canStickerItemUseFastRender((StickerItem)localObject))))
        {
          localObject = VideoFilterFactory.createFilter((StickerItem)localObject, paramVideoMaterial.getDataPath());
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
    }
    AppMethodBeat.o(84001);
    return localArrayList;
  }

  private static List<VideoFilterBase> createFaceOffFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84010);
    ArrayList localArrayList = new ArrayList();
    List localList = paramVideoMaterial.getFaceOffItemList();
    if (localList == null)
      AppMethodBeat.o(84010);
    while (true)
    {
      return localArrayList;
      int i = 0;
      if (i < localList.size())
      {
        Object localObject1 = (FaceItem)localList.get(i);
        if (paramVideoMaterial.getFaceoffType() == VideoMaterialUtil.FACE_OFF_TYPE.BY_IMAGE.value);
        FaceOffFilter localFaceOffFilter;
        for (localObject1 = new FaceOffByImageFilter((FaceItem)localObject1); ; localObject1 = localFaceOffFilter)
        {
          localArrayList.add(localObject1);
          i++;
          break;
          localFaceOffFilter = new FaceOffFilter((FaceItem)localObject1, paramVideoMaterial.getDataPath());
          Object localObject2 = VideoMaterialUtil.loadVertexShader(paramVideoMaterial.getDataPath());
          String str = VideoMaterialUtil.loadFragmentShader(paramVideoMaterial.getDataPath());
          if ((!TextUtils.isEmpty((CharSequence)localObject2)) || (!TextUtils.isEmpty(str)))
          {
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2))
              localObject1 = FaceOffFilter.VERTEX_SHADER;
            localObject2 = str;
            if (TextUtils.isEmpty(str))
              localObject2 = FaceOffFilter.FRAGMENT_SHADER;
            localFaceOffFilter.updateFilterShader((String)localObject1, (String)localObject2);
          }
        }
      }
      AppMethodBeat.o(84010);
    }
  }

  private static List<ParticleFilter> createFaceParticleFilters(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84032);
    ArrayList localArrayList = new ArrayList();
    List localList = paramVideoMaterial.getItemList();
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
      {
        StickerItem localStickerItem = (StickerItem)localList.get(i);
        if ((localStickerItem.particleConfig != null) && (VideoMaterialUtil.isFaceItem(localStickerItem)))
          localArrayList.add(new ParticleFilter(paramVideoMaterial.getDataPath() + File.separator + localStickerItem.id, localStickerItem));
      }
    AppMethodBeat.o(84032);
    return localArrayList;
  }

  private static List<FacialFeatureFilter> createFacialFeatureFilters(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83994);
    ArrayList localArrayList = new ArrayList();
    if ((paramVideoMaterial == null) || (paramVideoMaterial.getFaceFeatureItemList() == null))
    {
      paramVideoMaterial = null;
      AppMethodBeat.o(83994);
    }
    while (true)
    {
      return paramVideoMaterial;
      Iterator localIterator = paramVideoMaterial.getFaceFeatureItemList().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (FaceFeatureItem)localIterator.next();
        if ((((FaceFeatureItem)localObject1).getFaceOffItemList() != null) && (!((FaceFeatureItem)localObject1).getFaceOffItemList().isEmpty()))
        {
          Object localObject2 = ((FaceFeatureItem)localObject1).getStickerItems();
          FacialFeatureFilter localFacialFeatureFilter = new FacialFeatureFilter((FaceItem)((FaceFeatureItem)localObject1).getFaceOffItemList().get(0), ((FaceFeatureItem)localObject1).getDistortionItemList(), (FaceFeatureItem)localObject1);
          localObject1 = new ArrayList();
          if (!BaseUtils.isEmpty((Collection)localObject2))
          {
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              Object localObject3 = (StickerItem)((Iterator)localObject2).next();
              if (localObject3 != null)
              {
                localObject3 = VideoFilterFactory.createFilter((StickerItem)localObject3, paramVideoMaterial.getDataPath());
                if (localObject3 != null)
                  ((List)localObject1).add(localObject3);
              }
            }
          }
          localFacialFeatureFilter.setStickerFilters((List)localObject1);
          localArrayList.add(localFacialFeatureFilter);
        }
      }
      AppMethodBeat.o(83994);
      paramVideoMaterial = localArrayList;
    }
  }

  private static FastStickerFilter createFastBodyStickerFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84006);
    if (paramVideoMaterial.getItemList() != null)
      if (!VideoMaterialUtil.canMaterialUseFastRender(paramVideoMaterial))
      {
        AppMethodBeat.o(84006);
        paramVideoMaterial = null;
      }
    while (true)
    {
      return paramVideoMaterial;
      FastStickerFilter localFastStickerFilter = new FastStickerFilter();
      Iterator localIterator = paramVideoMaterial.getItemList().iterator();
      while (localIterator.hasNext())
      {
        StickerItem localStickerItem = (StickerItem)localIterator.next();
        if ((VideoMaterialUtil.isBodyDetectItem(localStickerItem)) && (VideoMaterialUtil.canStickerItemUseFastBodyRender(localStickerItem)))
          localFastStickerFilter.addSticker(localStickerItem, paramVideoMaterial.getDataPath());
      }
      if (localFastStickerFilter.getStickerListSize() > 0)
      {
        AppMethodBeat.o(84006);
        paramVideoMaterial = localFastStickerFilter;
      }
      else
      {
        AppMethodBeat.o(84006);
        paramVideoMaterial = null;
      }
    }
  }

  private static FastStickerFilter createFastFaceStickerFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84004);
    if (paramVideoMaterial.getItemList() != null)
      if (!VideoMaterialUtil.canMaterialUseFastRender(paramVideoMaterial))
      {
        AppMethodBeat.o(84004);
        paramVideoMaterial = null;
      }
    while (true)
    {
      return paramVideoMaterial;
      FastStickerFilter localFastStickerFilter = new FastStickerFilter();
      Iterator localIterator = paramVideoMaterial.getItemList().iterator();
      while (localIterator.hasNext())
      {
        StickerItem localStickerItem = (StickerItem)localIterator.next();
        if ((VideoMaterialUtil.isFaceItem(localStickerItem)) && (VideoMaterialUtil.canStickerItemUseFastFaceRender(localStickerItem)))
          localFastStickerFilter.addSticker(localStickerItem, paramVideoMaterial.getDataPath());
      }
      if (localFastStickerFilter.getStickerListSize() > 0)
      {
        AppMethodBeat.o(84004);
        paramVideoMaterial = localFastStickerFilter;
      }
      else
      {
        AppMethodBeat.o(84004);
        paramVideoMaterial = null;
      }
    }
  }

  public static VideoFilterList createFilters(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83992);
    if (paramVideoMaterial == null)
    {
      paramVideoMaterial = null;
      AppMethodBeat.o(83992);
      return paramVideoMaterial;
    }
    CustomVideoFilter localCustomVideoFilter = createCustomVideoFilter(paramVideoMaterial);
    CustomVertexFilter localCustomVertexFilter = createCustomVertexFilter(paramVideoMaterial);
    SnakeFaceFilter localSnakeFaceFilter = createSnakeFaceFilter(paramVideoMaterial);
    List localList1 = createFaceOffFilter(paramVideoMaterial);
    List localList2 = createTransformFilter(paramVideoMaterial);
    VideoFilterBase localVideoFilterBase = createDoodleFilter(paramVideoMaterial);
    Object localObject = createThreeDimFilter(paramVideoMaterial);
    FaceCropFilter localFaceCropFilter = createFaceCropFilter(paramVideoMaterial);
    HeadCropFilter localHeadCropFilter = createHeadCropFilter(paramVideoMaterial);
    List localList3 = createHeadCropFilterList(paramVideoMaterial);
    List localList4 = createFaceFilterList(paramVideoMaterial);
    List localList5 = createGestureVideoFilterList(paramVideoMaterial);
    List localList6 = createBodyVideoFilterList(paramVideoMaterial);
    FabbyFilters localFabbyFilters = createFabbyMvFilterList(paramVideoMaterial);
    LipsCosFilter localLipsCosFilter = createLipsCosFilter(paramVideoMaterial);
    List localList7 = createMultiViewerFilters(paramVideoMaterial);
    List localList8 = createFacialFeatureFilters(paramVideoMaterial);
    GameFilter localGameFilter = createGameFilter(paramVideoMaterial);
    List localList9 = createVoiceTextFilter(paramVideoMaterial);
    List localList10 = createFaceParticleFilters(paramVideoMaterial);
    List localList11 = createGestureParticleFilters(paramVideoMaterial);
    List localList12 = createBodyParticleFilters(paramVideoMaterial);
    PhantomFilter localPhantomFilter = createPhantomFilter(paramVideoMaterial);
    if (localCustomVideoFilter != null)
      localCustomVideoFilter.setNormalFilters(localList4);
    VideoFilterList localVideoFilterList = new VideoFilterList();
    ArrayList localArrayList = new ArrayList();
    if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.NORMAL.value)
      localArrayList.addAll(localList4);
    while (true)
    {
      if (localPhantomFilter != null)
        localVideoFilterList.setPhantomFilter(localPhantomFilter);
      localArrayList.addAll(localList9);
      localObject = createEffectFilter(paramVideoMaterial);
      if (localObject != null)
      {
        localVideoFilterList.setVideoEffectFilter((VideoFilterBase)localObject);
        localVideoFilterList.setVideoEffectOrder(paramVideoMaterial.getVideoFilterEffect().order);
      }
      if (localLipsCosFilter != null)
        localVideoFilterList.setLipsCosFilter(localLipsCosFilter);
      localVideoFilterList.setFabbyMvFilters(localFabbyFilters);
      localVideoFilterList.setFilters(localArrayList, localList1, localList2);
      localVideoFilterList.setFastFaceStickerFilter(createFastFaceStickerFilter(paramVideoMaterial));
      localVideoFilterList.setFastBodyStickerFilter(createFastBodyStickerFilter(paramVideoMaterial));
      localVideoFilterList.setFaceParticleFilters(localList10);
      localVideoFilterList.setGestureParticleFilters(localList11);
      localVideoFilterList.setBodyParticleFilters(localList12);
      localVideoFilterList.setAudio3DFilter(createAudio3DFilter(paramVideoMaterial));
      localVideoFilterList.setGestureFilters(localList5);
      localVideoFilterList.setBodyFilters(localList6);
      localVideoFilterList.setGameFilter(localGameFilter);
      localVideoFilterList.setMultiViewerFilters(localList7);
      localVideoFilterList.setNeedDetectGesture(VideoMaterialUtil.isGestureDetectMaterial(paramVideoMaterial));
      localVideoFilterList.setMaterial(paramVideoMaterial);
      localVideoFilterList.setFacialFeatureFilterList(localList8);
      if (paramVideoMaterial.getAudio2Text() != null)
        localVideoFilterList.setTriggerWords(paramVideoMaterial.getAudio2Text().triggerWords);
      AppMethodBeat.o(83992);
      paramVideoMaterial = localVideoFilterList;
      break;
      if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.COMMON_BEFORE_CUSTOM.value)
      {
        localArrayList.addAll(localList4);
        if (localCustomVideoFilter != null)
          localArrayList.add(localCustomVideoFilter);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.CUSTOM_BEFORE_COMMON.value)
      {
        if (localCustomVideoFilter != null)
          localArrayList.add(localCustomVideoFilter);
        localArrayList.addAll(localList4);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.SNAKE_FACE_BEFORE_COMMON.value)
      {
        localArrayList.add(localSnakeFaceFilter);
        localArrayList.addAll(localList4);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.CUSTOM_VERTEX_SHADER.value)
      {
        localArrayList.add(localCustomVertexFilter);
        localArrayList.addAll(localList4);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_OFF.value)
      {
        localArrayList.addAll(localList4);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.TRANSFORM.value)
      {
        localArrayList.addAll(localList4);
      }
      else if ((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_OFF_TRANSFORM.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.GAMEPLAY_3D.value))
      {
        localArrayList.addAll(localList4);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.THREE_DIM.value)
      {
        localArrayList.addAll((Collection)localObject);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.DOODLE.value)
      {
        localArrayList.add(localVideoFilterBase);
      }
      else if (VideoMaterialUtil.isFaceMorphingMaterial(paramVideoMaterial))
      {
        localVideoFilterList.setCrazyFaceFilters(new CrazyFaceFilters(paramVideoMaterial));
        localArrayList.addAll(localList4);
      }
      else if (VideoMaterialUtil.isARMaterial(paramVideoMaterial))
      {
        localVideoFilterList.setARParticleFilter(createARParticleFilter(paramVideoMaterial));
        if (localList4 != null)
          localArrayList.addAll(localList4);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.MAI_MENG.value)
      {
        localVideoFilterList.setActFilter(createActFilter(paramVideoMaterial));
        localArrayList.addAll(localList4);
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_CROP.value)
      {
        localArrayList.add(localFaceCropFilter);
        if (localList4 != null)
        {
          localArrayList.addAll(localList4);
          localFaceCropFilter.setNormalFilters(localList4);
        }
      }
      else if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_HEAD_CROP.value)
      {
        localVideoFilterList.setHeadCropFilter(localHeadCropFilter);
        localArrayList.add(localHeadCropFilter);
        localArrayList.addAll(localList4);
        localVideoFilterList.setHeadCropItemFilters(localList3);
      }
    }
  }

  private static GameFilter createGameFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84008);
    if ((paramVideoMaterial != null) && (paramVideoMaterial.getGameParams() != null))
    {
      GameFilter localGameFilter = new GameFilter(paramVideoMaterial.getItemList3D(), paramVideoMaterial.getOrderMode(), paramVideoMaterial.getMaxFaceCount());
      localGameFilter.setGameParams(paramVideoMaterial.getGameParams(), paramVideoMaterial.getDataPath());
      AppMethodBeat.o(84008);
      paramVideoMaterial = localGameFilter;
    }
    while (true)
    {
      return paramVideoMaterial;
      paramVideoMaterial = null;
      AppMethodBeat.o(84008);
    }
  }

  private static List<ParticleFilter> createGestureParticleFilters(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84033);
    ArrayList localArrayList = new ArrayList();
    List localList = paramVideoMaterial.getItemList();
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
      {
        StickerItem localStickerItem = (StickerItem)localList.get(i);
        if ((localStickerItem.particleConfig != null) && (VideoMaterialUtil.isGestureItem(localStickerItem)))
          localArrayList.add(new ParticleFilter(paramVideoMaterial.getDataPath() + File.separator + localStickerItem.id, localStickerItem));
      }
    AppMethodBeat.o(84033);
    return localArrayList;
  }

  private static List<NormalVideoFilter> createGestureVideoFilterList(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84002);
    ArrayList localArrayList = new ArrayList();
    if (paramVideoMaterial.getItemList() != null)
    {
      Iterator localIterator = paramVideoMaterial.getItemList().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (StickerItem)localIterator.next();
        if ((VideoMaterialUtil.isGestureItem((StickerItem)localObject)) && (((StickerItem)localObject).particleConfig == null))
        {
          localObject = VideoFilterFactory.createFilter((StickerItem)localObject, paramVideoMaterial.getDataPath());
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
    }
    AppMethodBeat.o(84002);
    return localArrayList;
  }

  private static HeadCropFilter createHeadCropFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84017);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramVideoMaterial != null)
    {
      localObject2 = localObject1;
      if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_HEAD_CROP.value)
        localObject2 = new HeadCropFilter();
    }
    AppMethodBeat.o(84017);
    return localObject2;
  }

  private static List<NormalVideoFilter> createHeadCropFilterList(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84000);
    ArrayList localArrayList = new ArrayList();
    if (paramVideoMaterial.getHeadCropItemList() != null)
    {
      Iterator localIterator = paramVideoMaterial.getHeadCropItemList().iterator();
      while (localIterator.hasNext())
      {
        NormalVideoFilter localNormalVideoFilter = VideoFilterFactory.createFilter((StickerItem)localIterator.next(), paramVideoMaterial.getDataPath());
        if (localNormalVideoFilter != null)
          localArrayList.add(localNormalVideoFilter);
      }
    }
    AppMethodBeat.o(84000);
    return localArrayList;
  }

  private static LipsCosFilter createLipsCosFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84018);
    LipsCosFilter localLipsCosFilter = null;
    if (!TextUtils.isEmpty(paramVideoMaterial.getLipsLutPath()))
    {
      paramVideoMaterial = paramVideoMaterial.getDataPath() + File.separator + paramVideoMaterial.getLipsLutPath();
      if (paramVideoMaterial.startsWith("assets://"))
        break label87;
    }
    label87: for (paramVideoMaterial = BitmapUtils.decodeSampledBitmapFromFile(paramVideoMaterial, 1); ; paramVideoMaterial = BitmapUtils.decodeSampleBitmapFromAssets(VideoGlobalContext.getContext(), FileUtils.getRealPath(paramVideoMaterial), 1))
    {
      localLipsCosFilter = new LipsCosFilter();
      localLipsCosFilter.setTypeAndLut(1, paramVideoMaterial);
      AppMethodBeat.o(84018);
      return localLipsCosFilter;
    }
  }

  private static List<MultiViewerFilter> createMultiViewerFilters(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84007);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramVideoMaterial.getMultiViewerItemList().iterator();
    while (localIterator.hasNext())
    {
      paramVideoMaterial = (MultiViewerItem)localIterator.next();
      if ((paramVideoMaterial != null) && (paramVideoMaterial.videoMaterial != null))
      {
        MultiViewerFilter localMultiViewerFilter = new MultiViewerFilter();
        localMultiViewerFilter.setVideoFilterList(createFilters(paramVideoMaterial.videoMaterial));
        localMultiViewerFilter.setActiveParts(paramVideoMaterial.activeParts);
        localMultiViewerFilter.setRenderId(paramVideoMaterial.renderId);
        localMultiViewerFilter.setNeedOriginFrame(paramVideoMaterial.needOriginFrame);
        if (!TextUtils.isEmpty(paramVideoMaterial.videoMaterial.getFilterId()))
          localMultiViewerFilter.setEffectFilter(FabbyFilterFactory.createFilter(paramVideoMaterial.videoMaterial.getFilterId()));
        localArrayList.add(localMultiViewerFilter);
      }
    }
    AppMethodBeat.o(84007);
    return localArrayList;
  }

  private static List<VideoFilterBase> createParticleXFilters(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84031);
    ArrayList localArrayList = new ArrayList();
    List localList = paramVideoMaterial.getItemList();
    if (localList != null)
    {
      ParticleSystemX.getInstance().init(VideoGlobalContext.getContext());
      for (int i = 0; i < localList.size(); i++)
      {
        StickerItem localStickerItem = (StickerItem)localList.get(i);
        if ((localStickerItem.transition != null) && (localStickerItem.wmGroupCopies == null))
        {
          localArrayList.add(new ParticleXFilter(localStickerItem, paramVideoMaterial.getDataPath(), i));
          ParticleSystemX.getInstance().addParticle(localStickerItem.transition);
        }
      }
      ParticleSystemX.getInstance().registerTemplate();
    }
    AppMethodBeat.o(84031);
    return localArrayList;
  }

  private static PhantomFilter createPhantomFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83993);
    Object localObject = null;
    List localList = paramVideoMaterial.getPhantomItemList();
    paramVideoMaterial = localObject;
    if (localList != null)
    {
      paramVideoMaterial = localObject;
      if (localList.size() > 0)
        paramVideoMaterial = new PhantomFilter(localList);
    }
    AppMethodBeat.o(83993);
    return paramVideoMaterial;
  }

  private static VideoFilterBase createSimpleEffectVideoFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83997);
    paramVideoMaterial = new SimpleEffectVideoFilter(paramVideoMaterial.getDataPath());
    AppMethodBeat.o(83997);
    return paramVideoMaterial;
  }

  private static SnakeFaceFilter createSnakeFaceFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84011);
    SnakeFaceFilter localSnakeFaceFilter = null;
    if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.SNAKE_FACE_BEFORE_COMMON.value)
      localSnakeFaceFilter = new SnakeFaceFilter();
    AppMethodBeat.o(84011);
    return localSnakeFaceFilter;
  }

  private static List<VideoFilterBase> createThreeDimFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83998);
    ArrayList localArrayList = new ArrayList();
    if ((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.THREE_DIM.value) && (paramVideoMaterial.getItemList() != null))
    {
      Iterator localIterator = paramVideoMaterial.getItemList().iterator();
      while (localIterator.hasNext())
        localArrayList.add(new ThreeDimFilter((StickerItem)localIterator.next(), paramVideoMaterial.getDataPath()));
    }
    AppMethodBeat.o(83998);
    return localArrayList;
  }

  private static List<VideoFilterBase> createTransformFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(83995);
    ArrayList localArrayList = new ArrayList();
    List localList = paramVideoMaterial.getFaceMeshItemList();
    if (!BaseUtils.isEmpty(localList))
      for (int i = 0; i < localList.size(); i++)
        localArrayList.add(new TransformFilter((FaceMeshItem)localList.get(i), paramVideoMaterial.getDataPath()));
    if (!BaseUtils.isEmpty(paramVideoMaterial.getDistortionItemList()))
      if (paramVideoMaterial.isUseMesh())
      {
        paramVideoMaterial = new TransformFilter(paramVideoMaterial.getDistortionItemList(), paramVideoMaterial.getItemList());
        paramVideoMaterial.setOptimizeBoundary(true);
        localArrayList.add(paramVideoMaterial);
      }
    while (true)
    {
      AppMethodBeat.o(83995);
      return localArrayList;
      if (!BaseUtils.isEmpty(paramVideoMaterial.getFaceMoveItemList()))
        localArrayList.add(new FaceMoveFilter(paramVideoMaterial.getFaceMoveItemList(), paramVideoMaterial.getItemList(), paramVideoMaterial.getFaceMoveTriangles()));
    }
  }

  private static List<VideoFilterBase> createVoiceTextFilter(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84030);
    ArrayList localArrayList1 = new ArrayList();
    Object localObject = paramVideoMaterial.getItemList();
    paramVideoMaterial = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        StickerItem localStickerItem = (StickerItem)((Iterator)localObject).next();
        if ((localStickerItem.transition != null) && (localStickerItem.wmGroupCopies != null))
          if (localStickerItem.zIndex >= 0)
            paramVideoMaterial.add(localStickerItem);
          else
            localArrayList2.add(localStickerItem);
      }
      if (!paramVideoMaterial.isEmpty())
        localArrayList1.add(new VoiceTextFilter(((StickerItem)paramVideoMaterial.get(0)).zIndex, paramVideoMaterial));
      if (!localArrayList2.isEmpty())
        localArrayList1.add(new VoiceTextFilter(((StickerItem)localArrayList2.get(0)).zIndex, localArrayList2));
    }
    AppMethodBeat.o(84030);
    return localArrayList1;
  }

  public static int get4DirectionAngle(double paramDouble)
  {
    double d = paramDouble;
    if (paramDouble > 3.141592653589793D)
      d = paramDouble - 6.283185307179586D;
    int i;
    if ((d >= -0.7853981633974483D) && (d <= 0.7853981633974483D))
      i = 0;
    while (true)
    {
      return i;
      if ((d >= 0.7853981633974483D) && (d <= 2.356194490192345D))
        i = 90;
      else if ((d >= -2.356194490192345D) && (d <= -0.7853981633974483D))
        i = 270;
      else
        i = 180;
    }
  }

  public static double get8DirectionAngle(double paramDouble)
  {
    if ((paramDouble >= -0.3926990816987241D) && (paramDouble <= 0.3926990816987241D))
      paramDouble = 0.0D;
    while (true)
    {
      return paramDouble;
      if ((paramDouble >= 0.3926990816987241D) && (paramDouble <= 1.178097245096172D))
        paramDouble = 0.7853981633974483D;
      else if ((paramDouble >= 1.178097245096172D) && (paramDouble <= 1.963495408493621D))
        paramDouble = 1.570796326794897D;
      else if ((paramDouble >= 1.963495408493621D) && (paramDouble <= 2.748893571891069D))
        paramDouble = 2.356194490192345D;
      else if ((paramDouble >= -1.178097245096172D) && (paramDouble <= -0.3926990816987241D))
        paramDouble = -0.7853981633974483D;
      else if ((paramDouble >= -1.963495408493621D) && (paramDouble <= -1.178097245096172D))
        paramDouble = -1.570796326794897D;
      else if ((paramDouble >= -2.748893571891069D) && (paramDouble <= -1.963495408493621D))
        paramDouble = -2.356194490192345D;
      else
        paramDouble = -3.141592653589793D;
    }
  }

  public static List<String> getAllPngFileNames(String paramString)
  {
    AppMethodBeat.i(83991);
    ArrayList localArrayList = new ArrayList();
    if (paramString == null)
      AppMethodBeat.o(83991);
    while (true)
    {
      return localArrayList;
      if (paramString.startsWith("assets://"));
      try
      {
        String[] arrayOfString = VideoGlobalContext.getContext().getAssets().list(FileUtils.getRealPath(paramString));
        if (arrayOfString == null)
        {
          AppMethodBeat.o(83991);
          continue;
        }
        int i = arrayOfString.length;
        int j = 0;
        while (true)
          if (j < i)
          {
            paramString = arrayOfString[j];
            if (paramString.endsWith(".png"))
              localArrayList.add(paramString);
            j++;
            continue;
            paramString = new File(paramString).list(VideoMaterialUtil.mPngFilter);
            if (paramString == null)
            {
              AppMethodBeat.o(83991);
              break;
            }
            localArrayList.addAll(Arrays.asList(paramString));
          }
        label143: AppMethodBeat.o(83991);
      }
      catch (IOException paramString)
      {
        break label143;
      }
    }
  }

  private static PTFaceAttr.PTExpression getCustomFilterTriggerType(List<StickerItem> paramList)
  {
    AppMethodBeat.i(84019);
    if (BaseUtils.isEmpty(paramList))
    {
      paramList = PTFaceAttr.PTExpression.UNKNOW;
      AppMethodBeat.o(84019);
      return paramList;
    }
    int i = PTFaceAttr.PTExpression.UNKNOW.value;
    paramList = paramList.iterator();
    label39: if (paramList.hasNext())
    {
      StickerItem localStickerItem = (StickerItem)paramList.next();
      if (localStickerItem.triggerType <= i)
        break label88;
      i = localStickerItem.triggerType;
    }
    label88: 
    while (true)
    {
      break label39;
      paramList = VideoMaterialUtil.getTriggerType(i);
      AppMethodBeat.o(84019);
      break;
    }
  }

  public static float getFaceStatus(FaceRangeStatus paramFaceRangeStatus, int paramInt, StickerItem.ValueRange paramValueRange)
  {
    float f = -1.0F;
    AppMethodBeat.i(84028);
    if (paramFaceRangeStatus == null)
      AppMethodBeat.o(84028);
    while (true)
    {
      return f;
      VideoMaterialUtil.RANGE_TRIGGER_TYPE[] arrayOfRANGE_TRIGGER_TYPE = VideoMaterialUtil.RANGE_TRIGGER_TYPE.values();
      int i = arrayOfRANGE_TRIGGER_TYPE.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label86;
        VideoMaterialUtil.RANGE_TRIGGER_TYPE localRANGE_TRIGGER_TYPE = arrayOfRANGE_TRIGGER_TYPE[j];
        if (localRANGE_TRIGGER_TYPE.value == paramInt)
        {
          f = localRANGE_TRIGGER_TYPE.checker.getLevel(paramFaceRangeStatus, paramValueRange);
          AppMethodBeat.o(84028);
          break;
        }
      }
      label86: AppMethodBeat.o(84028);
    }
  }

  public static h getSecondLastFrame(h paramh)
  {
    AppMethodBeat.i(84023);
    h localh;
    if (FrameUtil.isValid(paramh))
    {
      localh = paramh;
      if (FrameUtil.isValid(paramh.bJA));
    }
    else
    {
      localh = null;
      AppMethodBeat.o(84023);
    }
    while (true)
    {
      return localh;
      while ((FrameUtil.isValid(localh.bJA)) && (FrameUtil.isValid(localh.bJA.bJA)))
        localh = localh.bJA;
      AppMethodBeat.o(84023);
    }
  }

  public static List<VideoFilterBase> getSimpleNormalVideoFilter(List<VideoFilterBase> paramList)
  {
    AppMethodBeat.i(84036);
    ArrayList localArrayList = new ArrayList();
    if (paramList == null)
      AppMethodBeat.o(84036);
    while (true)
    {
      return localArrayList;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (VideoFilterBase)localIterator.next();
        if (canUseBlendMode(paramList))
          localArrayList.add(paramList);
      }
      AppMethodBeat.o(84036);
    }
  }

  public static boolean isStatusTriggered(FaceRangeStatus paramFaceRangeStatus, int paramInt, StickerItem.ValueRange paramValueRange)
  {
    boolean bool = false;
    AppMethodBeat.i(84027);
    if (paramFaceRangeStatus == null)
      AppMethodBeat.o(84027);
    while (true)
    {
      return bool;
      VideoMaterialUtil.RANGE_TRIGGER_TYPE[] arrayOfRANGE_TRIGGER_TYPE = VideoMaterialUtil.RANGE_TRIGGER_TYPE.values();
      int i = arrayOfRANGE_TRIGGER_TYPE.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label84;
        VideoMaterialUtil.RANGE_TRIGGER_TYPE localRANGE_TRIGGER_TYPE = arrayOfRANGE_TRIGGER_TYPE[j];
        if (localRANGE_TRIGGER_TYPE.value == paramInt)
        {
          bool = localRANGE_TRIGGER_TYPE.checker.isInRange(paramFaceRangeStatus, paramValueRange);
          AppMethodBeat.o(84027);
          break;
        }
      }
      label84: AppMethodBeat.o(84027);
    }
  }

  public static boolean maybeTransformFilter(VideoFilterBase paramVideoFilterBase)
  {
    if ((paramVideoFilterBase != null) && (((paramVideoFilterBase instanceof TransformFilter)) || ((paramVideoFilterBase instanceof CustomVideoFilter))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean needBlendMode(List<VideoFilterBase> paramList)
  {
    AppMethodBeat.i(84024);
    boolean bool;
    if (paramList == null)
    {
      AppMethodBeat.o(84024);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramList = paramList.iterator();
      while (true)
        if (paramList.hasNext())
          if (((VideoFilterBase)paramList.next() instanceof NormalVideoFilter))
          {
            bool = true;
            AppMethodBeat.o(84024);
            break;
          }
      AppMethodBeat.o(84024);
      bool = false;
    }
  }

  public static boolean needCopy(VideoFilterBase paramVideoFilterBase)
  {
    boolean bool = false;
    AppMethodBeat.i(83990);
    if (paramVideoFilterBase == null)
      AppMethodBeat.o(83990);
    while (true)
    {
      return bool;
      if ((paramVideoFilterBase instanceof NormalVideoFilter))
      {
        bool = ((NormalVideoFilter)paramVideoFilterBase).needCopyTex();
        AppMethodBeat.o(83990);
      }
      else if ((paramVideoFilterBase instanceof FaceOffFilter))
      {
        bool = true;
        AppMethodBeat.o(83990);
      }
      else
      {
        AppMethodBeat.o(83990);
      }
    }
  }

  public static boolean needDepthBuffer(VideoFilterBase paramVideoFilterBase)
  {
    if ((paramVideoFilterBase != null) && ((paramVideoFilterBase instanceof ThreeDimFilter)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean needRecordTouchPoint(VideoFilterList paramVideoFilterList)
  {
    AppMethodBeat.i(84029);
    boolean bool;
    if ((paramVideoFilterList != null) && (VideoMaterialUtil.isARMaterial(paramVideoFilterList.getMaterial())))
    {
      bool = true;
      AppMethodBeat.o(84029);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84029);
    }
  }

  public static void setRenderMode(BaseFilter paramBaseFilter, int paramInt)
  {
    AppMethodBeat.i(84021);
    while (paramBaseFilter != null)
    {
      paramBaseFilter.setRenderMode(paramInt);
      paramBaseFilter = paramBaseFilter.getmNextFilter();
    }
    AppMethodBeat.o(84021);
  }

  public static void setRenderMode(VideoFilterBase paramVideoFilterBase, int paramInt)
  {
    AppMethodBeat.i(84022);
    if (paramVideoFilterBase != null)
      paramVideoFilterBase.setRenderMode(paramInt);
    AppMethodBeat.o(84022);
  }

  public static void setRenderMode(List<? extends VideoFilterBase> paramList, int paramInt)
  {
    AppMethodBeat.i(84020);
    if (BaseUtils.isEmpty(paramList))
      AppMethodBeat.o(84020);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        ((VideoFilterBase)paramList.next()).setRenderMode(paramInt);
      AppMethodBeat.o(84020);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoFilterUtil
 * JD-Core Version:    0.6.2
 */
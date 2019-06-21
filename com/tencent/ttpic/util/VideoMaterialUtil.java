package com.tencent.ttpic.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.VideoModule;
import com.tencent.ttpic.VideoModule.DeviceType;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.config.MediaConfig.ENCODE_SIZE;
import com.tencent.ttpic.constant.CATEGORY_TYPE;
import com.tencent.ttpic.device.DeviceInstance;
import com.tencent.ttpic.facedetect.FaceDetector.DETECT_TYPE;
import com.tencent.ttpic.filter.FabbyMvPart;
import com.tencent.ttpic.filter.FabbyParts;
import com.tencent.ttpic.gameplaysdk.model.StickerItem3D;
import com.tencent.ttpic.model.Audio2Text;
import com.tencent.ttpic.model.FaceFeatureItem;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.model.Point3D;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.model.VideoMaterialMetaData;
import com.tencent.ttpic.model.WMElement;
import com.tencent.ttpic.model.WMGroup;
import com.tencent.util.i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VideoMaterialUtil
{
  public static final String CRAZYFACE_ANTI_WRINKLE = "antiWrinkle";
  public static final String CRAZYFACE_BLEND_ALPHA = "blendAlpha";
  public static final String CRAZYFACE_CANVAS = "canvas";
  public static final String CRAZYFACE_DISTORTION_ALPHA = "distortionAlpha";
  public static final String CRAZYFACE_DISTORTION_LIST = "distortionList";
  public static final String CRAZYFACE_FACE_COLOR = "imageFaceColor";
  public static final String CRAZYFACE_FACE_COLOR2 = "imageFaceColor2";
  public static final String CRAZYFACE_FACE_COLOR_RANGE = "faceColorRange";
  public static final String CRAZYFACE_FACE_LAYER = "faceImageLayer";
  public static final String CRAZYFACE_FACE_MASK = "faceMaskImage";
  public static final String CRAZYFACE_FACE_MASK_POINTS = "faceMaskFacePoint";
  public static final String CRAZYFACE_FACE_POINTS = "imageFacePoint";
  public static final String CRAZYFACE_FACE_RIANGLE = "faceTriangle";
  public static final String CRAZYFACE_HEIGHT = "height";
  public static final String CRAZYFACE_IMAGE_LAYER = "imageLayer";
  public static final String CRAZYFACE_IMAGE_PATH = "image";
  public static final String CRAZYFACE_LAYER_TYPE = "type";
  public static final String CRAZYFACE_STK_TYPE = "stkType";
  public static final String CRAZYFACE_WIDTH = "width";
  public static final String CRAZYFACE_X = "x";
  public static final String CRAZYFACE_Y = "y";
  public static final String[] DEVICE_NEED_COPY_TRANSFORM;
  public static final String[] DEVICE_NEED_SMALL_SIZE;
  public static final List<Integer> EMPTY_ANGLES_LIST;
  public static final List<PointF> EMPTY_POINTS_LIST;
  public static boolean ENABLE_FAST_RENDER = false;
  public static final String FILE_NAME_CUSTOM_FILTER_FRAGMENT_SHADER_ANDROID = "filterFragment_android.glsl";
  public static final String FILE_NAME_CUSTOM_FILTER_FRAGMENT_SHADER_COMMON = "filterFragment.glsl";
  public static final String FILE_NAME_CUSTOM_FILTER_VERTEX_SHADER_ANDROID = "filterVertex_android.glsl";
  public static final String FILE_NAME_CUSTOM_FILTER_VERTEX_SHADER_COMMON = "filterVertex.glsl";
  public static final String FILE_NAME_FRAGMENT_SHADER_ANDROID = "fragment_android.glsl";
  public static final String FILE_NAME_FRAGMENT_SHADER_COMMON = "fragment.glsl";
  public static final String FILE_NAME_VERTEX_SHADER_ANDROID = "vertex_android.glsl";
  public static final String FILE_NAME_VERTEX_SHADER_COMMON = "vertex.glsl";
  public static final String FRAMES_ID_SEPARATOR_3D = ":";
  public static final int INVALID_INT_FIELD_VALUE = -999999;
  public static final String ITEM_ID_CUSTOM = "nothing";
  public static final String MATERIAL_PREFIX = "video_";
  public static final String MP4_SUFFIX = ".mp4";
  public static final String PARAMS_FILE_NAME = "params";
  public static final String PNG_SUFFIX = ".png";
  public static final double RATIO_CANVAS = 0.75D;
  public static final double SCALE_DIFF = 100.0D;
  public static double SCALE_FACE_DETECT = 0.0D;
  public static final double SCALE_Y = 0.25D;
  public static final int SIZE_FACE_ANGLE = 3;
  public static final int SIZE_FACE_POINT = 90;
  private static final String TAG;
  public static FilenameFilter mMp4Filter;
  public static FilenameFilter mPngFilter;

  static
  {
    AppMethodBeat.i(84211);
    TAG = VideoMaterialUtil.class.getSimpleName();
    SCALE_FACE_DETECT = 0.16666667163372D;
    ENABLE_FAST_RENDER = true;
    EMPTY_POINTS_LIST = new ArrayList();
    EMPTY_ANGLES_LIST = new ArrayList();
    mPngFilter = new VideoMaterialUtil.3();
    mMp4Filter = new VideoMaterialUtil.4();
    DEVICE_NEED_SMALL_SIZE = new String[] { "A1001" };
    DEVICE_NEED_COPY_TRANSFORM = new String[] { "A1001", "SM-N9006", "vivo_X5Max_L", "vivo_X5Max_L", "vivo_X5V", "vivo_Y23L" };
    AppMethodBeat.o(84211);
  }

  public static float angleToRadian(float paramFloat)
  {
    return (float)(paramFloat * 3.141592653589793D / 180.0D);
  }

  public static List<Point3D> arrayTo3DPointList(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(84152);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfFloat == null)
      AppMethodBeat.o(84152);
    while (true)
    {
      return localArrayList;
      for (int i = 0; i < paramArrayOfFloat.length / 3; i++)
        localArrayList.add(new Point3D(paramArrayOfFloat[(i * 3)], paramArrayOfFloat[(i * 3 + 1)], paramArrayOfFloat[(i * 3 + 2)]));
      AppMethodBeat.o(84152);
    }
  }

  public static List<Float> arrayToList(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(84150);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfFloat == null)
      AppMethodBeat.o(84150);
    while (true)
    {
      return localArrayList;
      int i = paramArrayOfFloat.length;
      for (int j = 0; j < i; j++)
        localArrayList.add(Float.valueOf(paramArrayOfFloat[j]));
      AppMethodBeat.o(84150);
    }
  }

  public static List<PointF> arrayToPointList(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(84151);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfFloat == null)
      AppMethodBeat.o(84151);
    while (true)
    {
      return localArrayList;
      for (int i = 0; i < paramArrayOfFloat.length / 2; i++)
        localArrayList.add(new PointF(paramArrayOfFloat[(i * 2)], paramArrayOfFloat[(i * 2 + 1)]));
      AppMethodBeat.o(84151);
    }
  }

  public static List<PointF> arrayToPointList(int[][] paramArrayOfInt)
  {
    AppMethodBeat.i(84153);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfInt == null)
      AppMethodBeat.o(84153);
    while (true)
    {
      return localArrayList;
      for (int i = 0; i < paramArrayOfInt.length; i++)
        localArrayList.add(new PointF(paramArrayOfInt[i][0], paramArrayOfInt[i][1]));
      AppMethodBeat.o(84153);
    }
  }

  public static int calSampleSize(long paramLong1, long paramLong2, int paramInt)
  {
    int i;
    if (paramLong1 <= 0L)
    {
      i = 128;
      return i;
    }
    while (true)
    {
      i = paramInt;
      if (paramLong2 <= paramLong1)
        break;
      paramInt <<= 1;
      paramLong2 >>= 2;
    }
  }

  public static boolean canMaterialUseFastRender(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84201);
    paramVideoMaterial = paramVideoMaterial.getItemList().iterator();
    int i = 0;
    if (paramVideoMaterial.hasNext())
    {
      if (!canStickerItemUseFastRender((StickerItem)paramVideoMaterial.next()))
        break label75;
      i++;
    }
    label75: 
    while (true)
    {
      break;
      if (i <= 7)
      {
        bool = true;
        AppMethodBeat.o(84201);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(84201);
      }
    }
  }

  public static boolean canStickerItemUseFastBodyRender(StickerItem paramStickerItem)
  {
    AppMethodBeat.i(84200);
    boolean bool;
    if ((canStickerItemUseFastRender(paramStickerItem)) && (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.BODY.type))
    {
      bool = true;
      AppMethodBeat.o(84200);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84200);
    }
  }

  public static boolean canStickerItemUseFastFaceRender(StickerItem paramStickerItem)
  {
    AppMethodBeat.i(84199);
    boolean bool;
    if ((canStickerItemUseFastRender(paramStickerItem)) && (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.DYNAMIC.type))
    {
      bool = true;
      AppMethodBeat.o(84199);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84199);
    }
  }

  public static boolean canStickerItemUseFastRender(StickerItem paramStickerItem)
  {
    if ((ENABLE_FAST_RENDER) && (paramStickerItem != null) && (paramStickerItem.markMode == 0) && (paramStickerItem.personID < 0) && (paramStickerItem.stickerType == 0) && ((paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.DYNAMIC.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.BODY.type)) && ((paramStickerItem.blendMode < 2) || (paramStickerItem.blendMode > 12)) && (paramStickerItem.zIndex == 0) && (paramStickerItem.charmRange == null) && (paramStickerItem.ageRange == null) && (paramStickerItem.popularRange == null) && (paramStickerItem.genderRange == null) && (paramStickerItem.cpRange == null) && (paramStickerItem.randomGroupNum == 0) && (paramStickerItem.audioTriggerType == 0) && (paramStickerItem.particleConfig == null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void copyArrayToArray(PointF[] paramArrayOfPointF1, PointF[] paramArrayOfPointF2)
  {
    AppMethodBeat.i(84165);
    if ((paramArrayOfPointF1 == null) || (paramArrayOfPointF2 == null))
      AppMethodBeat.o(84165);
    while (true)
    {
      return;
      for (int i = 0; i < Math.min(paramArrayOfPointF1.length, paramArrayOfPointF2.length); i++)
      {
        paramArrayOfPointF2[i].x = paramArrayOfPointF1[i].x;
        paramArrayOfPointF2[i].y = paramArrayOfPointF1[i].y;
      }
      AppMethodBeat.o(84165);
    }
  }

  public static int copyList(List<PointF> paramList1, List<PointF> paramList2)
  {
    int i = 0;
    AppMethodBeat.i(84158);
    int j;
    if ((paramList2 == null) || (paramList1 == null))
    {
      j = -1;
      AppMethodBeat.o(84158);
    }
    while (true)
    {
      return j;
      int k = paramList2.size();
      int m;
      for (j = 0; ; j++)
      {
        m = j;
        if (j >= paramList1.size())
          break;
        ((PointF)paramList1.get(j)).x = ((PointF)paramList2.get(j)).x;
        ((PointF)paramList1.get(j)).y = ((PointF)paramList2.get(j)).y;
      }
      while (m < k)
      {
        paramList1.add(new PointF(((PointF)paramList2.get(m)).x, ((PointF)paramList2.get(m)).y));
        m++;
      }
      AppMethodBeat.o(84158);
      j = i;
    }
  }

  public static List<PointF> copyList(List<PointF> paramList)
  {
    AppMethodBeat.i(84157);
    if (paramList == null)
    {
      paramList = null;
      AppMethodBeat.o(84157);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        PointF localPointF = (PointF)paramList.next();
        localArrayList.add(new PointF(localPointF.x, localPointF.y));
      }
      AppMethodBeat.o(84157);
      paramList = localArrayList;
    }
  }

  public static void copyListToArray(List<PointF> paramList, PointF[] paramArrayOfPointF)
  {
    AppMethodBeat.i(84164);
    if ((BaseUtils.isEmpty(paramList)) || (paramArrayOfPointF == null))
      AppMethodBeat.o(84164);
    while (true)
    {
      return;
      for (int i = 0; i < Math.min(paramList.size(), paramArrayOfPointF.length); i++)
      {
        paramArrayOfPointF[i].x = ((PointF)paramList.get(i)).x;
        paramArrayOfPointF[i].y = ((PointF)paramList.get(i)).y;
      }
      AppMethodBeat.o(84164);
    }
  }

  public static void flipYPoints(List<PointF> paramList, int paramInt)
  {
  }

  public static float[] flipYPoints(float[] paramArrayOfFloat, int paramInt)
  {
    return paramArrayOfFloat;
  }

  public static int genFullScreenVertices(float[] paramArrayOfFloat, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = 1;
    AppMethodBeat.i(84149);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      paramInt1 = -1;
      AppMethodBeat.o(84149);
    }
    while (true)
    {
      return paramInt1;
      paramFloat2 = (paramFloat2 - paramFloat1) / paramInt1;
      paramFloat4 = (paramFloat4 - paramFloat3) / paramInt2;
      paramArrayOfFloat[0] = getCoordinate(paramFloat1, paramFloat2, 0);
      paramArrayOfFloat[1] = getCoordinate(paramFloat3, paramFloat4, 0);
      int j = 0;
      if (j < paramInt1)
      {
        int k;
        int m;
        if (j % 2 == 0)
        {
          k = 0;
          m = i;
          for (i = k; i < paramInt2; i++)
          {
            paramArrayOfFloat[(m * 2)] = getCoordinate(paramFloat1, paramFloat2, j + 1);
            paramArrayOfFloat[(m * 2 + 1)] = getCoordinate(paramFloat3, paramFloat4, i);
            m++;
            paramArrayOfFloat[(m * 2)] = getCoordinate(paramFloat1, paramFloat2, j);
            paramArrayOfFloat[(m * 2 + 1)] = getCoordinate(paramFloat3, paramFloat4, i + 1);
            m++;
          }
          paramArrayOfFloat[(m * 2)] = getCoordinate(paramFloat1, paramFloat2, j + 1);
          paramArrayOfFloat[(m * 2 + 1)] = getCoordinate(paramFloat3, paramFloat4, paramInt2);
        }
        for (i = m + 1; ; i = m + 1)
        {
          j++;
          break;
          k = paramInt2;
          m = i;
          for (i = k; i > 0; i--)
          {
            paramArrayOfFloat[(m * 2)] = getCoordinate(paramFloat1, paramFloat2, j + 1);
            paramArrayOfFloat[(m * 2 + 1)] = getCoordinate(paramFloat3, paramFloat4, i);
            m++;
            paramArrayOfFloat[(m * 2)] = getCoordinate(paramFloat1, paramFloat2, j);
            paramArrayOfFloat[(m * 2 + 1)] = getCoordinate(paramFloat3, paramFloat4, i - 1);
            m++;
          }
          paramArrayOfFloat[(m * 2)] = getCoordinate(paramFloat1, paramFloat2, j + 1);
          paramArrayOfFloat[(m * 2 + 1)] = getCoordinate(paramFloat3, paramFloat4, 0);
        }
      }
      AppMethodBeat.o(84149);
      paramInt1 = 0;
    }
  }

  public static List<PointF> genFullScreenVertices(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(84148);
    ArrayList localArrayList = new ArrayList();
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      AppMethodBeat.o(84148);
    while (true)
    {
      return localArrayList;
      paramFloat2 = (paramFloat2 - paramFloat1) / paramInt1;
      paramFloat4 = (paramFloat4 - paramFloat3) / paramInt2;
      localArrayList.add(new PointF(getCoordinate(paramFloat1, paramFloat2, 0), getCoordinate(paramFloat3, paramFloat4, 0)));
      int i = 0;
      if (i < paramInt1)
      {
        int j;
        if (i % 2 == 0)
        {
          for (j = 0; j < paramInt2; j++)
          {
            localArrayList.add(new PointF(getCoordinate(paramFloat1, paramFloat2, i + 1), getCoordinate(paramFloat3, paramFloat4, j)));
            localArrayList.add(new PointF(getCoordinate(paramFloat1, paramFloat2, i), getCoordinate(paramFloat3, paramFloat4, j + 1)));
          }
          localArrayList.add(new PointF(getCoordinate(paramFloat1, paramFloat2, i + 1), getCoordinate(paramFloat3, paramFloat4, paramInt2)));
        }
        while (true)
        {
          i++;
          break;
          for (j = paramInt2; j > 0; j--)
          {
            localArrayList.add(new PointF(getCoordinate(paramFloat1, paramFloat2, i + 1), getCoordinate(paramFloat3, paramFloat4, j)));
            localArrayList.add(new PointF(getCoordinate(paramFloat1, paramFloat2, i), getCoordinate(paramFloat3, paramFloat4, j - 1)));
          }
          localArrayList.add(new PointF(getCoordinate(paramFloat1, paramFloat2, i + 1), getCoordinate(paramFloat3, paramFloat4, 0)));
        }
      }
      AppMethodBeat.o(84148);
    }
  }

  public static String getActionTipString(int paramInt)
  {
    AppMethodBeat.i(84144);
    String str;
    if (paramInt == PTFaceAttr.PTExpression.MOUTH_OPEN.value)
    {
      str = VideoGlobalContext.getContext().getString(2131305780);
      AppMethodBeat.o(84144);
    }
    while (true)
    {
      return str;
      if (paramInt == PTFaceAttr.PTExpression.EYEBROWS_RAISE.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305781);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.BLINK.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305775);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.HEAD_SHAKE.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305782);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.KISS.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305778);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.BLINK_LEFT_EYE.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305776);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.BLINK_RIGHT_EYE.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305777);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.HEAD_NOD.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305779);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.HEAD_SHAKE_NEW.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305782);
        AppMethodBeat.o(84144);
      }
      else if (paramInt == PTFaceAttr.PTExpression.TRY_CLICK_SCREEN.value)
      {
        str = VideoGlobalContext.getContext().getString(2131305783);
        AppMethodBeat.o(84144);
      }
      else
      {
        str = "";
        AppMethodBeat.o(84144);
      }
    }
  }

  public static int getAllImageSize(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84172);
    int i;
    if ((paramVideoMaterial == null) || (paramVideoMaterial.getDataPath() == null))
    {
      AppMethodBeat.o(84172);
      i = 0;
    }
    while (true)
    {
      return i;
      Object localObject = new ArrayList();
      if (paramVideoMaterial.getItemList() != null)
        ((List)localObject).addAll(paramVideoMaterial.getItemList());
      if (paramVideoMaterial.getHeadCropItemList() != null)
        ((List)localObject).addAll(paramVideoMaterial.getHeadCropItemList());
      Iterator localIterator = ((List)localObject).iterator();
      for (i = 0; localIterator.hasNext(); i = getAllImageSize(paramVideoMaterial.getDataPath() + File.separator + ((StickerItem)localObject).subFolder) + i)
        localObject = (StickerItem)localIterator.next();
      AppMethodBeat.o(84172);
    }
  }

  public static int getAllImageSize(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(84171);
    if (paramString.startsWith("assets://"));
    try
    {
      String[] arrayOfString = VideoGlobalContext.getContext().getAssets().list(FileUtils.getRealPath(paramString));
      if (arrayOfString != null)
      {
        k = arrayOfString.length;
        if (k != 0);
      }
      else
      {
        AppMethodBeat.o(84171);
      }
      for (i = j; ; i = j)
      {
        return i;
        Context localContext = VideoGlobalContext.getContext();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString = BitmapUtils.getBitmapSize(localContext, paramString + File.separator + arrayOfString[0]);
        if (paramString != null)
          break;
        AppMethodBeat.o(84171);
      }
      int k = paramString.x;
      j = paramString.y;
      int m = arrayOfString.length;
      for (i = m * (j * k * 4) + 0; ; i = paramString.x * paramString.y * 4 * arrayOfString.length + 0)
      {
        label141: AppMethodBeat.o(84171);
        break;
        arrayOfString = new File(paramString).list(mPngFilter);
        if ((arrayOfString == null) || (arrayOfString.length == 0))
        {
          AppMethodBeat.o(84171);
          i = j;
          break;
        }
        paramString = BitmapUtils.getBitmapSize(VideoGlobalContext.getContext(), paramString + File.separator + arrayOfString[0]);
        if (paramString == null)
        {
          AppMethodBeat.o(84171);
          i = j;
          break;
        }
      }
    }
    catch (IOException paramString)
    {
      break label141;
    }
  }

  public static List<Integer> getAllIndex(PointWithIndex[][] paramArrayOfPointWithIndex, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84147);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      paramArrayOfPointWithIndex = null;
      AppMethodBeat.o(84147);
    }
    while (true)
    {
      return paramArrayOfPointWithIndex;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(Integer.valueOf(paramArrayOfPointWithIndex[0][0].index));
      int i = 0;
      if (i < paramInt1)
      {
        int j;
        if (i % 2 == 0)
        {
          for (j = 0; j < paramInt2; j++)
          {
            localArrayList.add(Integer.valueOf(paramArrayOfPointWithIndex[j][(i + 1)].index));
            localArrayList.add(Integer.valueOf(paramArrayOfPointWithIndex[(j + 1)][i].index));
          }
          localArrayList.add(Integer.valueOf(paramArrayOfPointWithIndex[paramInt2][(i + 1)].index));
        }
        while (true)
        {
          i++;
          break;
          for (j = paramInt2; j > 0; j--)
          {
            localArrayList.add(Integer.valueOf(paramArrayOfPointWithIndex[j][(i + 1)].index));
            localArrayList.add(Integer.valueOf(paramArrayOfPointWithIndex[(j - 1)][i].index));
          }
          localArrayList.add(Integer.valueOf(paramArrayOfPointWithIndex[0][(i + 1)].index));
        }
      }
      AppMethodBeat.o(84147);
      paramArrayOfPointWithIndex = localArrayList;
    }
  }

  public static PointWithIndex[][] getAllPoints(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(84146);
    PointWithIndex[][] arrayOfPointWithIndex;
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      arrayOfPointWithIndex = null;
      AppMethodBeat.o(84146);
    }
    while (true)
    {
      return arrayOfPointWithIndex;
      paramFloat2 = (paramFloat2 - paramFloat1) / paramInt1;
      paramFloat4 = (paramFloat4 - paramFloat3) / paramInt2;
      arrayOfPointWithIndex = new PointWithIndex[paramInt2 + 1][paramInt1 + 1];
      int i = 0;
      for (int j = 0; j <= paramInt2; j++)
      {
        int k = 0;
        while (k <= paramInt1)
        {
          arrayOfPointWithIndex[j][k] = new PointWithIndex(getCoordinate(paramFloat1, paramFloat2, k), getCoordinate(paramFloat3, paramFloat4, j), i);
          k++;
          i++;
        }
      }
      AppMethodBeat.o(84146);
    }
  }

  private static float getCoordinate(float paramFloat1, float paramFloat2, int paramInt)
  {
    return paramInt * paramFloat2 + paramFloat1;
  }

  public static VideoMaterialUtil.ITEM_SOURCE_TYPE getItemSourceType(int paramInt)
  {
    VideoMaterialUtil.ITEM_SOURCE_TYPE localITEM_SOURCE_TYPE;
    if (paramInt == 1)
      localITEM_SOURCE_TYPE = VideoMaterialUtil.ITEM_SOURCE_TYPE.VIDEO_LEFT_RIGHT;
    while (true)
    {
      return localITEM_SOURCE_TYPE;
      if (paramInt == 2)
        localITEM_SOURCE_TYPE = VideoMaterialUtil.ITEM_SOURCE_TYPE.VIDEO_UP_DOWN;
      else
        localITEM_SOURCE_TYPE = VideoMaterialUtil.ITEM_SOURCE_TYPE.VIDEO_NORMAL;
    }
  }

  public static String getMaterialId(String paramString)
  {
    Object localObject = null;
    String[] arrayOfString = null;
    AppMethodBeat.i(84168);
    if (paramString == null)
    {
      AppMethodBeat.o(84168);
      paramString = arrayOfString;
      return paramString;
    }
    arrayOfString = paramString.split(File.separator);
    for (int i = arrayOfString.length - 1; ; i--)
    {
      paramString = localObject;
      if (i >= 0)
      {
        if (!TextUtils.isEmpty(arrayOfString[i]))
          paramString = arrayOfString[i];
      }
      else
      {
        AppMethodBeat.o(84168);
        break;
      }
    }
  }

  public static String getMusicMaterialM4aPath(String paramString)
  {
    AppMethodBeat.i(84169);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(84169);
    }
    while (true)
    {
      return paramString;
      paramString = paramString + File.separator + getMaterialId(paramString) + ".m4a";
      AppMethodBeat.o(84169);
    }
  }

  public static int getNormalEncodeWidth()
  {
    AppMethodBeat.i(84186);
    int i;
    if (needSmallSize())
    {
      i = MediaConfig.ENCODE_SIZE.MEDIUM.width;
      AppMethodBeat.o(84186);
    }
    while (true)
    {
      return i;
      i = VideoPrefsUtil.getNormalEncodeWidth();
      AppMethodBeat.o(84186);
    }
  }

  public static PTFaceAttr.PTExpression getOppositeTriggerType(int paramInt)
  {
    AppMethodBeat.i(84138);
    PTFaceAttr.PTExpression localPTExpression = getTriggerType(paramInt).opposite;
    AppMethodBeat.o(84138);
    return localPTExpression;
  }

  public static PTFaceAttr.PTExpression getTriggerType(int paramInt)
  {
    AppMethodBeat.i(84139);
    PTFaceAttr.PTExpression[] arrayOfPTExpression = PTFaceAttr.PTExpression.values();
    int i = arrayOfPTExpression.length;
    int j = 0;
    PTFaceAttr.PTExpression localPTExpression;
    if (j < i)
    {
      localPTExpression = arrayOfPTExpression[j];
      if (localPTExpression.value == paramInt)
        AppMethodBeat.o(84139);
    }
    while (true)
    {
      return localPTExpression;
      j++;
      break;
      localPTExpression = PTFaceAttr.PTExpression.UNKNOW;
      AppMethodBeat.o(84139);
    }
  }

  // ERROR //
  public static int[] getVideoIndexMap(String paramString)
  {
    // Byte code:
    //   0: ldc_w 684
    //   3: invokestatic 215	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iconst_0
    //   7: newarray int
    //   9: astore_1
    //   10: new 686	java/io/RandomAccessFile
    //   13: astore_2
    //   14: aload_2
    //   15: aload_0
    //   16: ldc_w 688
    //   19: invokespecial 691	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: aload_1
    //   23: astore_0
    //   24: aload_2
    //   25: invokevirtual 695	java/io/RandomAccessFile:length	()J
    //   28: lstore_3
    //   29: aload_1
    //   30: astore_0
    //   31: aload_2
    //   32: lload_3
    //   33: ldc2_w 696
    //   36: lsub
    //   37: invokevirtual 701	java/io/RandomAccessFile:seek	(J)V
    //   40: aload_1
    //   41: astore_0
    //   42: iconst_4
    //   43: newarray byte
    //   45: astore 5
    //   47: aload_1
    //   48: astore_0
    //   49: aload_2
    //   50: aload 5
    //   52: invokevirtual 705	java/io/RandomAccessFile:read	([B)I
    //   55: pop
    //   56: aload_1
    //   57: astore_0
    //   58: aload 5
    //   60: invokestatic 710	com/tencent/ttpic/util/ByteUtil:readInt	([B)I
    //   63: istore 6
    //   65: iload 6
    //   67: bipush 12
    //   69: if_icmple +11 -> 80
    //   72: iload 6
    //   74: sipush 400
    //   77: if_icmplt +21 -> 98
    //   80: aload_1
    //   81: astore_0
    //   82: aload_2
    //   83: invokevirtual 713	java/io/RandomAccessFile:close	()V
    //   86: aload_2
    //   87: invokevirtual 713	java/io/RandomAccessFile:close	()V
    //   90: ldc_w 684
    //   93: invokestatic 267	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_1
    //   97: areturn
    //   98: iload 6
    //   100: i2l
    //   101: lstore 7
    //   103: aload_1
    //   104: astore_0
    //   105: aload_2
    //   106: lload_3
    //   107: lload 7
    //   109: lsub
    //   110: ldc2_w 714
    //   113: ladd
    //   114: invokevirtual 701	java/io/RandomAccessFile:seek	(J)V
    //   117: aload_1
    //   118: astore_0
    //   119: iload 6
    //   121: bipush 12
    //   123: isub
    //   124: iconst_4
    //   125: idiv
    //   126: istore 9
    //   128: aload_1
    //   129: astore_0
    //   130: iload 9
    //   132: newarray int
    //   134: astore_1
    //   135: iconst_0
    //   136: istore 6
    //   138: iload 6
    //   140: iload 9
    //   142: if_icmpge +29 -> 171
    //   145: aload_1
    //   146: astore_0
    //   147: aload_2
    //   148: aload 5
    //   150: invokevirtual 705	java/io/RandomAccessFile:read	([B)I
    //   153: pop
    //   154: aload_1
    //   155: astore_0
    //   156: aload_1
    //   157: iload 6
    //   159: aload 5
    //   161: invokestatic 710	com/tencent/ttpic/util/ByteUtil:readInt	([B)I
    //   164: iastore
    //   165: iinc 6 1
    //   168: goto -30 -> 138
    //   171: aload_2
    //   172: invokevirtual 713	java/io/RandomAccessFile:close	()V
    //   175: ldc_w 684
    //   178: invokestatic 267	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: goto -85 -> 96
    //   184: astore_0
    //   185: aconst_null
    //   186: astore_2
    //   187: aload_1
    //   188: astore_0
    //   189: aload_0
    //   190: astore_1
    //   191: aload_2
    //   192: ifnull -17 -> 175
    //   195: aload_2
    //   196: invokevirtual 713	java/io/RandomAccessFile:close	()V
    //   199: aload_0
    //   200: astore_1
    //   201: goto -26 -> 175
    //   204: astore_1
    //   205: aload_0
    //   206: astore_1
    //   207: goto -32 -> 175
    //   210: astore_0
    //   211: aconst_null
    //   212: astore_2
    //   213: aload_2
    //   214: ifnull +7 -> 221
    //   217: aload_2
    //   218: invokevirtual 713	java/io/RandomAccessFile:close	()V
    //   221: ldc_w 684
    //   224: invokestatic 267	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: aload_0
    //   228: athrow
    //   229: astore_0
    //   230: goto -140 -> 90
    //   233: astore_0
    //   234: goto -59 -> 175
    //   237: astore_1
    //   238: goto -17 -> 221
    //   241: astore_0
    //   242: goto -29 -> 213
    //   245: astore_1
    //   246: goto -57 -> 189
    //
    // Exception table:
    //   from	to	target	type
    //   10	22	184	java/lang/Exception
    //   195	199	204	java/io/IOException
    //   10	22	210	finally
    //   86	90	229	java/io/IOException
    //   171	175	233	java/io/IOException
    //   217	221	237	java/io/IOException
    //   24	29	241	finally
    //   31	40	241	finally
    //   42	47	241	finally
    //   49	56	241	finally
    //   58	65	241	finally
    //   82	86	241	finally
    //   105	117	241	finally
    //   119	128	241	finally
    //   130	135	241	finally
    //   147	154	241	finally
    //   156	165	241	finally
    //   24	29	245	java/lang/Exception
    //   31	40	245	java/lang/Exception
    //   42	47	245	java/lang/Exception
    //   49	56	245	java/lang/Exception
    //   58	65	245	java/lang/Exception
    //   82	86	245	java/lang/Exception
    //   105	117	245	java/lang/Exception
    //   119	128	245	java/lang/Exception
    //   130	135	245	java/lang/Exception
    //   147	154	245	java/lang/Exception
    //   156	165	245	java/lang/Exception
  }

  public static boolean hasValidFaceOffItem(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84206);
    boolean bool;
    if ((paramVideoMaterial != null) && (paramVideoMaterial.getFaceOffItemList() != null))
    {
      paramVideoMaterial = paramVideoMaterial.getFaceOffItemList().iterator();
      while (paramVideoMaterial.hasNext())
        if (!isEmptyItem((FaceItem)paramVideoMaterial.next()))
        {
          bool = true;
          AppMethodBeat.o(84206);
        }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84206);
    }
  }

  public static boolean is3DMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84202);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84202);
    while (true)
    {
      return bool;
      if (paramVideoMaterial.getGameParams() != null)
      {
        bool = true;
        AppMethodBeat.o(84202);
      }
      else
      {
        AppMethodBeat.o(84202);
      }
    }
  }

  public static boolean isARMaterial(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84181);
    boolean bool;
    if ((paramVideoMaterial != null) && (paramVideoMaterial.getArParticleList() != null) && (!paramVideoMaterial.getArParticleList().isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(84181);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84181);
    }
  }

  public static boolean isActionTriggerType(int paramInt)
  {
    boolean bool1 = false;
    PTFaceAttr.PTExpression[] arrayOfPTExpression = PTFaceAttr.PTExpression.ACTION_TRIGGER_TYPE;
    int i = arrayOfPTExpression.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramInt == arrayOfPTExpression[j].value)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public static boolean isAudio2textMaterial(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84185);
    boolean bool;
    if ((paramVideoMaterial != null) && (paramVideoMaterial.getAudio2Text() != null) && (paramVideoMaterial.getAudio2Text().sentenceCount > 0))
    {
      bool = true;
      AppMethodBeat.o(84185);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84185);
    }
  }

  public static boolean isAudioTextTriggerType(int paramInt)
  {
    if ((300 <= paramInt) && (paramInt <= 311));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isBodyDetectItem(StickerItem paramStickerItem)
  {
    if ((paramStickerItem != null) && (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.BODY.type));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isBodyDetectMaterial(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84208);
    Object localObject1;
    Object localObject2;
    boolean bool;
    if (paramVideoMaterial != null)
    {
      localObject1 = paramVideoMaterial.getItemList();
      localObject2 = paramVideoMaterial.getItemList3D();
      Object localObject3 = paramVideoMaterial.getHeadCropItemList();
      paramVideoMaterial = paramVideoMaterial.getFaceOffItemList();
      ArrayList localArrayList = new ArrayList();
      if (localObject1 != null)
        localArrayList.addAll((Collection)localObject1);
      if (localObject3 != null)
        localArrayList.addAll((Collection)localObject3);
      localObject3 = localArrayList.iterator();
      if (((Iterator)localObject3).hasNext())
      {
        localObject1 = (StickerItem)((Iterator)localObject3).next();
        if (((StickerItem)localObject1).type == VideoFilterFactory.POSITION_TYPE.BODY.type)
        {
          AppMethodBeat.o(84208);
          bool = true;
        }
      }
    }
    while (true)
    {
      return bool;
      if (!isBodyTriggerType(((StickerItem)localObject1).triggerType))
        break;
      AppMethodBeat.o(84208);
      bool = true;
      continue;
      if (paramVideoMaterial != null)
      {
        paramVideoMaterial = paramVideoMaterial.iterator();
        while (true)
          if (paramVideoMaterial.hasNext())
            if (isBodyTriggerType(((FaceItem)paramVideoMaterial.next()).triggerType))
            {
              AppMethodBeat.o(84208);
              bool = true;
              break;
            }
      }
      if (localObject2 != null)
      {
        localObject2 = ((List)localObject2).iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
          {
            paramVideoMaterial = (StickerItem3D)((Iterator)localObject2).next();
            if (paramVideoMaterial.type == VideoFilterFactory.POSITION_TYPE.BODY.type)
            {
              AppMethodBeat.o(84208);
              bool = true;
              break;
            }
            if (isBodyTriggerType(paramVideoMaterial.triggerType))
            {
              AppMethodBeat.o(84208);
              bool = true;
              break;
            }
          }
      }
      bool = false;
      AppMethodBeat.o(84208);
    }
  }

  public static boolean isBodyDetectType(int paramInt)
  {
    if (paramInt == 400);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isBodyTriggerType(int paramInt)
  {
    if (paramInt == 401);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isChangeFaceMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = true;
    AppMethodBeat.i(84177);
    if (paramVideoMaterial != null)
      if ((paramVideoMaterial.getShaderType() == 5) && (paramVideoMaterial.getFaceoffType() == 1))
        AppMethodBeat.o(84177);
    while (true)
    {
      return bool;
      AppMethodBeat.o(84177);
      bool = false;
      continue;
      AppMethodBeat.o(84177);
      bool = false;
    }
  }

  public static boolean isCosMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = true;
    AppMethodBeat.i(84182);
    if ((paramVideoMaterial != null) && ((paramVideoMaterial.getDetectorFlag() == 1) || (paramVideoMaterial.getDetectorFlag() == 2)))
      AppMethodBeat.o(84182);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84182);
    }
  }

  public static boolean isCpValueMaterial(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84173);
    boolean bool;
    if (paramVideoMaterial != null)
    {
      paramVideoMaterial = paramVideoMaterial.getItemList();
      if (paramVideoMaterial != null)
      {
        Iterator localIterator = paramVideoMaterial.iterator();
        while (localIterator.hasNext())
        {
          paramVideoMaterial = (StickerItem)localIterator.next();
          if ((paramVideoMaterial.markMode == FaceDetector.DETECT_TYPE.DETECT_TYPE_CP.value) || (paramVideoMaterial.cpRange != null))
          {
            bool = true;
            AppMethodBeat.o(84173);
          }
        }
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84173);
    }
  }

  public static boolean isDistortionFilter(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84166);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84166);
    while (true)
    {
      return bool;
      if (paramVideoMaterial.getShaderType() != VideoMaterialUtil.SHADER_TYPE.NORMAL.value)
      {
        bool = true;
        AppMethodBeat.o(84166);
      }
      else
      {
        AppMethodBeat.o(84166);
      }
    }
  }

  public static boolean isDownloaded(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84189);
    boolean bool;
    if (paramVideoMaterial == null)
    {
      bool = false;
      AppMethodBeat.o(84189);
    }
    while (true)
    {
      return bool;
      bool = paramVideoMaterial.getDataPath().startsWith("/");
      AppMethodBeat.o(84189);
    }
  }

  public static boolean isEmojiMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84176);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84176);
    while (true)
    {
      return bool;
      if (paramVideoMaterial.getCategoryFlag() == CATEGORY_TYPE.EMOJI.value)
      {
        bool = true;
        AppMethodBeat.o(84176);
      }
      else
      {
        AppMethodBeat.o(84176);
      }
    }
  }

  public static boolean isEmptyItem(FaceItem paramFaceItem)
  {
    AppMethodBeat.i(84205);
    boolean bool;
    if ((paramFaceItem == null) || ((TextUtils.isEmpty(paramFaceItem.id)) && (TextUtils.isEmpty(paramFaceItem.faceExchangeImage))) || ((!TextUtils.isEmpty(paramFaceItem.id)) && (paramFaceItem.id.equals("action"))) || ((!TextUtils.isEmpty(paramFaceItem.id)) && (paramFaceItem.id.equals("audio"))))
    {
      bool = true;
      AppMethodBeat.o(84205);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84205);
    }
  }

  public static boolean isEmptyItem(StickerItem paramStickerItem)
  {
    AppMethodBeat.i(84204);
    boolean bool;
    if ((paramStickerItem == null) || (TextUtils.isEmpty(paramStickerItem.id)) || (paramStickerItem.id.equals("action")) || (paramStickerItem.id.equals("audio")))
    {
      bool = true;
      AppMethodBeat.o(84204);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84204);
    }
  }

  public static boolean isFaceCopyMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84179);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84179);
    while (true)
    {
      return bool;
      if ((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_COPY.value) || ((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_SWITCH.value) && (paramVideoMaterial.getFaceSwapType() == VideoMaterialUtil.FACE_SWAP_TYPE.FACE_COPY.value)))
      {
        bool = true;
        AppMethodBeat.o(84179);
      }
      else
      {
        AppMethodBeat.o(84179);
      }
    }
  }

  public static boolean isFaceCountTriggerItem(StickerItem paramStickerItem)
  {
    if ((paramStickerItem != null) && (2 <= paramStickerItem.countTriggerType) && (paramStickerItem.countTriggerType <= 107));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isFaceItem(StickerItem paramStickerItem)
  {
    if ((paramStickerItem != null) && ((paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.STATIC.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.DYNAMIC.type) || (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.RELATIVE.type)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isFaceMorphingMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84180);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84180);
    while (true)
    {
      return bool;
      if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_MORPHING.value)
      {
        bool = true;
        AppMethodBeat.o(84180);
      }
      else
      {
        AppMethodBeat.o(84180);
      }
    }
  }

  public static boolean isFaceSwitchMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84178);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84178);
    while (true)
    {
      return bool;
      if (((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_SWITCH.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_SWITCH_DUP.value)) && (paramVideoMaterial.getFaceSwapType() == VideoMaterialUtil.FACE_SWAP_TYPE.FACE_SWITCH.value))
      {
        bool = true;
        AppMethodBeat.o(84178);
      }
      else
      {
        AppMethodBeat.o(84178);
      }
    }
  }

  public static boolean isFaceTriggerType(int paramInt)
  {
    if (paramInt < 200);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isGestureCountTriggerItem(StickerItem paramStickerItem)
  {
    if ((paramStickerItem != null) && (200 <= paramStickerItem.countTriggerType) && (paramStickerItem.countTriggerType <= 211));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isGestureDetectMaterial(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84210);
    Object localObject1;
    Object localObject2;
    boolean bool;
    if (paramVideoMaterial != null)
    {
      localObject1 = paramVideoMaterial.getItemList();
      localObject2 = paramVideoMaterial.getItemList3D();
      Object localObject3 = paramVideoMaterial.getHeadCropItemList();
      paramVideoMaterial = paramVideoMaterial.getFaceOffItemList();
      ArrayList localArrayList = new ArrayList();
      if (localObject1 != null)
        localArrayList.addAll((Collection)localObject1);
      if (localObject3 != null)
        localArrayList.addAll((Collection)localObject3);
      localObject3 = localArrayList.iterator();
      if (((Iterator)localObject3).hasNext())
      {
        localObject1 = (StickerItem)((Iterator)localObject3).next();
        if (((StickerItem)localObject1).type == VideoFilterFactory.POSITION_TYPE.GESTURE.type)
        {
          AppMethodBeat.o(84210);
          bool = true;
        }
      }
    }
    while (true)
    {
      return bool;
      if (!isGestureTriggerType(((StickerItem)localObject1).triggerType))
        break;
      AppMethodBeat.o(84210);
      bool = true;
      continue;
      if (paramVideoMaterial != null)
      {
        paramVideoMaterial = paramVideoMaterial.iterator();
        while (true)
          if (paramVideoMaterial.hasNext())
            if (isGestureTriggerType(((FaceItem)paramVideoMaterial.next()).triggerType))
            {
              AppMethodBeat.o(84210);
              bool = true;
              break;
            }
      }
      if (localObject2 != null)
      {
        localObject2 = ((List)localObject2).iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
          {
            paramVideoMaterial = (StickerItem3D)((Iterator)localObject2).next();
            if (paramVideoMaterial.type == VideoFilterFactory.POSITION_TYPE.GESTURE.type)
            {
              AppMethodBeat.o(84210);
              bool = true;
              break;
            }
            if (isGestureTriggerType(paramVideoMaterial.triggerType))
            {
              AppMethodBeat.o(84210);
              bool = true;
              break;
            }
          }
      }
      bool = false;
      AppMethodBeat.o(84210);
    }
  }

  public static boolean isGestureItem(StickerItem paramStickerItem)
  {
    if ((paramStickerItem != null) && (paramStickerItem.type == VideoFilterFactory.POSITION_TYPE.GESTURE.type));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isGestureTriggerType(int paramInt)
  {
    if ((200 <= paramInt) && (paramInt <= 213));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isHeadCropMaterial(VideoMaterial paramVideoMaterial)
  {
    boolean bool = false;
    AppMethodBeat.i(84198);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84198);
    while (true)
    {
      return bool;
      if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_HEAD_CROP.value)
      {
        bool = true;
        AppMethodBeat.o(84198);
      }
      else
      {
        AppMethodBeat.o(84198);
      }
    }
  }

  public static boolean isSegmentMaterial(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84209);
    boolean bool;
    if ((paramVideoMaterial != null) && (paramVideoMaterial.isSegmentRequired()))
    {
      bool = true;
      AppMethodBeat.o(84209);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84209);
    }
  }

  public static boolean isValidOutputFile(String paramString)
  {
    AppMethodBeat.i(84156);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = false;
      AppMethodBeat.o(84156);
    }
    while (true)
    {
      return bool;
      bool = new File(paramString).exists();
      AppMethodBeat.o(84156);
    }
  }

  public static boolean isWatermarkEditable(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84175);
    boolean bool;
    if (paramVideoMaterial != null)
    {
      paramVideoMaterial = paramVideoMaterial.getItemList();
      if (paramVideoMaterial != null)
      {
        Object localObject;
        do
        {
          paramVideoMaterial = paramVideoMaterial.iterator();
          while (!((Iterator)localObject).hasNext())
          {
            do
            {
              if (!paramVideoMaterial.hasNext())
                break;
              localObject = (StickerItem)paramVideoMaterial.next();
            }
            while (((StickerItem)localObject).wmGroup == null);
            localObject = ((StickerItem)localObject).wmGroup.wmElements.iterator();
          }
        }
        while (((WMElement)((Iterator)localObject).next()).edittype != 1);
        AppMethodBeat.o(84175);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84175);
    }
  }

  public static boolean isWatermarkMaterial(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84174);
    boolean bool;
    if (paramVideoMaterial != null)
    {
      paramVideoMaterial = paramVideoMaterial.getItemList();
      if (paramVideoMaterial != null)
      {
        paramVideoMaterial = paramVideoMaterial.iterator();
        while (paramVideoMaterial.hasNext())
          if (((StickerItem)paramVideoMaterial.next()).stickerType == VideoFilterFactory.STICKER_TYPE.WATERMARK.type)
          {
            bool = true;
            AppMethodBeat.o(84174);
          }
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84174);
    }
  }

  public static float[] listToArray(List<Float> paramList)
  {
    AppMethodBeat.i(84154);
    if (paramList == null)
    {
      paramList = new float[0];
      AppMethodBeat.o(84154);
    }
    while (true)
    {
      return paramList;
      float[] arrayOfFloat = new float[paramList.size()];
      for (int i = 0; i < paramList.size(); i++)
        arrayOfFloat[i] = ((Float)paramList.get(i)).floatValue();
      AppMethodBeat.o(84154);
      paramList = arrayOfFloat;
    }
  }

  public static int[][] listToIntArray(List<PointF> paramList)
  {
    AppMethodBeat.i(84207);
    if (paramList == null)
    {
      paramList = new int[0][];
      AppMethodBeat.o(84207);
    }
    while (true)
    {
      return paramList;
      int i = paramList.size();
      int[][] arrayOfInt = new int[i][2];
      for (i = 0; i < paramList.size(); i++)
      {
        arrayOfInt[i][0] = ((int)((PointF)paramList.get(i)).x);
        arrayOfInt[i][1] = ((int)((PointF)paramList.get(i)).y);
      }
      AppMethodBeat.o(84207);
      paramList = arrayOfInt;
    }
  }

  public static String loadFragmentShader(String paramString)
  {
    AppMethodBeat.i(84141);
    String str1 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "fragment_android.glsl");
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "fragment.glsl");
    AppMethodBeat.o(84141);
    return str2;
  }

  public static List<VideoMaterialMetaData> loadLocalMaterials()
  {
    AppMethodBeat.i(84167);
    Object localObject = VideoLocalDataInitializer.buildVideoMaterials();
    if (localObject == null)
    {
      localObject = new ArrayList();
      AppMethodBeat.o(84167);
    }
    while (true)
    {
      return localObject;
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        VideoMaterialMetaData localVideoMaterialMetaData = (VideoMaterialMetaData)localIterator.next();
        if (TextUtils.isEmpty(localVideoMaterialMetaData.path))
          localVideoMaterialMetaData.path = VideoPrefsUtil.getDefaultPrefs().getString(localVideoMaterialMetaData.id, "");
      }
      AppMethodBeat.o(84167);
    }
  }

  public static String loadVertexShader(String paramString)
  {
    AppMethodBeat.i(84140);
    String str1 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "vertex_android.glsl");
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "vertex.glsl");
    AppMethodBeat.o(84140);
    return str2;
  }

  public static String loadVideoCustomEffectFilterFragmentShader(String paramString)
  {
    AppMethodBeat.i(84143);
    String str1 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "filterFragment_android.glsl");
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "filterFragment.glsl");
    AppMethodBeat.o(84143);
    return str2;
  }

  public static String loadVideoCustomEffectFilterVertexShader(String paramString)
  {
    AppMethodBeat.i(84142);
    String str1 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "filterVertex_android.glsl");
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = FileUtils.load(VideoGlobalContext.getContext(), paramString, "filterVertex.glsl");
    AppMethodBeat.o(84142);
    return str2;
  }

  public static List<PointF> makeFacePoints(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(84145);
    ArrayList localArrayList = new ArrayList(90);
    int i = Math.min(paramArrayOfFloat.length / 2, 90);
    for (int j = 0; j < i; j++)
      localArrayList.add(new PointF(paramArrayOfFloat[(j * 2)], paramArrayOfFloat[(j * 2 + 1)]));
    AppMethodBeat.o(84145);
    return localArrayList;
  }

  public static boolean needCopyTransform()
  {
    boolean bool = false;
    AppMethodBeat.i(84161);
    String str1 = DeviceInstance.getInstance().getDeviceName().trim();
    int j;
    if (!TextUtils.isEmpty(str1))
    {
      String[] arrayOfString = DEVICE_NEED_COPY_TRANSFORM;
      int i = arrayOfString.length;
      j = 0;
      if (j < i)
      {
        String str2 = arrayOfString[j];
        if (str1.toLowerCase().endsWith(str2.toLowerCase()))
        {
          bool = true;
          AppMethodBeat.o(84161);
        }
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(84161);
    }
  }

  public static boolean needDetectFace(VideoMaterial paramVideoMaterial)
  {
    boolean bool = true;
    AppMethodBeat.i(84187);
    if ((paramVideoMaterial != null) && (paramVideoMaterial.getTriggerType() != 0) && (paramVideoMaterial.getTriggerType() != 1))
      AppMethodBeat.o(84187);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84187);
    }
  }

  public static boolean needFaceTips(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84203);
    boolean bool;
    if (paramVideoMaterial == null)
    {
      AppMethodBeat.o(84203);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramVideoMaterial = paramVideoMaterial.getItemList();
      if (paramVideoMaterial == null)
      {
        AppMethodBeat.o(84203);
        bool = false;
      }
      else
      {
        paramVideoMaterial = paramVideoMaterial.iterator();
        while (true)
          if (paramVideoMaterial.hasNext())
            if (((StickerItem)paramVideoMaterial.next()).triggerType >= 2)
            {
              bool = true;
              AppMethodBeat.o(84203);
              break;
            }
        AppMethodBeat.o(84203);
        bool = false;
      }
    }
  }

  public static boolean needOpenRefine(VideoMaterial paramVideoMaterial)
  {
    boolean bool = true;
    AppMethodBeat.i(84183);
    if ((paramVideoMaterial != null) && ((paramVideoMaterial.getDetectorFlag() == 1) || ((paramVideoMaterial.getDetectorFlag() == 2) && (VideoModule.getDeviceType() == VideoModule.DeviceType.HIGH))))
      AppMethodBeat.o(84183);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84183);
    }
  }

  public static boolean needSmallSize()
  {
    boolean bool = false;
    AppMethodBeat.i(84162);
    String str1 = DeviceInstance.getInstance().getDeviceName().trim();
    int j;
    if (!TextUtils.isEmpty(str1))
    {
      String[] arrayOfString = DEVICE_NEED_SMALL_SIZE;
      int i = arrayOfString.length;
      j = 0;
      if (j < i)
      {
        String str2 = arrayOfString[j];
        if (str1.toLowerCase().endsWith(str2.toLowerCase()))
        {
          bool = true;
          AppMethodBeat.o(84162);
        }
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(84162);
    }
  }

  public static boolean needVoiceChange(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84184);
    boolean bool;
    if ((paramVideoMaterial != null) && (paramVideoMaterial.getVoicekind() != -999999) && (paramVideoMaterial.getEnvironment() != -999999))
    {
      bool = true;
      AppMethodBeat.o(84184);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84184);
    }
  }

  public static void saveVideoMaterialToImages(String paramString)
  {
    AppMethodBeat.i(84170);
    Object localObject = getMaterialId(paramString);
    if ((localObject == null) || (!((String)localObject).startsWith("video_")))
      AppMethodBeat.o(84170);
    while (true)
    {
      return;
      File[] arrayOfFile = new File(paramString).listFiles();
      if (arrayOfFile == null)
      {
        AppMethodBeat.o(84170);
      }
      else
      {
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++)
        {
          paramString = arrayOfFile[j];
          if (paramString.isDirectory())
          {
            localObject = paramString.listFiles(new VideoMaterialUtil.2());
            if (localObject != null)
            {
              int k = localObject.length;
              int m = 0;
              while (m < k)
              {
                int[] arrayOfInt = localObject[m];
                try
                {
                  FileUtils.deleteFiles(paramString.getAbsolutePath(), ".png");
                  arrayOfInt = getVideoIndexMap(arrayOfInt.getAbsolutePath());
                  ArrayList localArrayList = new java/util/ArrayList;
                  localArrayList.<init>();
                  for (int n = 0; ; n++)
                  {
                    localArrayList.clear();
                    for (int i1 = 0; i1 < arrayOfInt.length; i1++)
                      if (arrayOfInt[i1] == n)
                      {
                        StringBuilder localStringBuilder = new java/lang/StringBuilder;
                        localStringBuilder.<init>();
                        localArrayList.add(paramString.getAbsolutePath() + File.separator + getMaterialId(paramString.getAbsolutePath()) + "_" + i1 + ".png");
                      }
                  }
                }
                catch (Exception localException)
                {
                  i.m(TAG, localException.toString());
                  m++;
                }
              }
            }
          }
        }
        AppMethodBeat.o(84170);
      }
    }
  }

  public static void sort(List<StickerItem> paramList)
  {
    AppMethodBeat.i(84163);
    if (BaseUtils.isEmpty(paramList))
      AppMethodBeat.o(84163);
    while (true)
    {
      return;
      Collections.sort(paramList, new VideoMaterialUtil.1());
      AppMethodBeat.o(84163);
    }
  }

  public static boolean supportLandscape(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84188);
    boolean bool;
    if ((paramVideoMaterial != null) && (paramVideoMaterial.isSupportLandscape()))
    {
      bool = true;
      AppMethodBeat.o(84188);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84188);
    }
  }

  public static float[] toFlatArray(List<PointF> paramList)
  {
    AppMethodBeat.i(84155);
    if (paramList == null)
    {
      paramList = new float[0];
      AppMethodBeat.o(84155);
    }
    while (true)
    {
      return paramList;
      float[] arrayOfFloat = new float[paramList.size() * 2];
      for (int i = 0; i < paramList.size(); i++)
      {
        PointF localPointF = (PointF)paramList.get(i);
        if (localPointF != null)
        {
          arrayOfFloat[(i * 2)] = localPointF.x;
          arrayOfFloat[(i * 2 + 1)] = localPointF.y;
        }
      }
      AppMethodBeat.o(84155);
      paramList = arrayOfFloat;
    }
  }

  public static float[] toFlatArray(PointF[] paramArrayOfPointF)
  {
    Object localObject;
    if (paramArrayOfPointF == null)
      localObject = new float[0];
    while (true)
    {
      return localObject;
      try
      {
        float[] arrayOfFloat = new float[paramArrayOfPointF.length * 2];
        for (int i = 0; ; i++)
        {
          localObject = arrayOfFloat;
          if (i >= paramArrayOfPointF.length)
            break;
          if (paramArrayOfPointF[i] != null)
          {
            arrayOfFloat[(i * 2)] = paramArrayOfPointF[i].x;
            arrayOfFloat[(i * 2 + 1)] = paramArrayOfPointF[i].y;
          }
        }
      }
      catch (OutOfMemoryError paramArrayOfPointF)
      {
        localObject = new float[0];
      }
    }
  }

  public static void updateFaceValueDetectType(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84192);
    if ((paramVideoMaterial == null) || (paramVideoMaterial.getItemList() == null))
      AppMethodBeat.o(84192);
    while (true)
    {
      return;
      Iterator localIterator = paramVideoMaterial.getItemList().iterator();
      StickerItem localStickerItem;
      for (int i = 0; localIterator.hasNext(); i = localStickerItem.markMode | i)
      {
        localStickerItem = (StickerItem)localIterator.next();
        int j = i;
        if (localStickerItem.ageRange != null)
          j = i | 0x1;
        i = j;
        if (localStickerItem.genderRange != null)
          i = j | 0x2;
        j = i;
        if (localStickerItem.popularRange != null)
          j = i | 0x4;
        i = j;
        if (localStickerItem.cpRange != null)
          i = j | 0x8;
      }
      paramVideoMaterial.setFaceValueDetectType(i);
      AppMethodBeat.o(84192);
    }
  }

  public static void updateItemImageType(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84193);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84193);
    while (true)
    {
      return;
      Object localObject1 = new ArrayList();
      if (paramVideoMaterial.getItemList() != null)
        ((List)localObject1).addAll(paramVideoMaterial.getItemList());
      Object localObject2;
      Object localObject3;
      if (paramVideoMaterial.getFaceFeatureItemList() != null)
      {
        localObject2 = paramVideoMaterial.getFaceFeatureItemList().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (FaceFeatureItem)((Iterator)localObject2).next();
          if ((localObject3 != null) && (((FaceFeatureItem)localObject3).getFaceOffItemList() != null))
            ((List)localObject1).addAll(((FaceFeatureItem)localObject3).getStickerItems());
        }
      }
      if (paramVideoMaterial.getHeadCropItemList() != null)
        ((List)localObject1).addAll(paramVideoMaterial.getHeadCropItemList());
      if (paramVideoMaterial.getFabbyParts() != null)
      {
        localObject3 = paramVideoMaterial.getFabbyParts().getParts().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (FabbyMvPart)((Iterator)localObject3).next();
          if (((FabbyMvPart)localObject2).bgItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject2).bgItem);
          if (((FabbyMvPart)localObject2).fgItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject2).fgItem);
          if (((FabbyMvPart)localObject2).coverItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject2).coverItem);
          if (((FabbyMvPart)localObject2).transitionItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject2).transitionItem);
        }
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (StickerItem)((Iterator)localObject1).next();
        if (((StickerItem)localObject3).sourceType == null)
          ((StickerItem)localObject3).sourceType = VideoMaterialUtil.ITEM_SOURCE_TYPE.IMAGE;
      }
      paramVideoMaterial = paramVideoMaterial.getItemList3D();
      if (paramVideoMaterial != null)
      {
        localObject1 = paramVideoMaterial.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramVideoMaterial = (StickerItem)((Iterator)localObject1).next();
          if (paramVideoMaterial.sourceType == null)
            paramVideoMaterial.sourceType = VideoMaterialUtil.ITEM_SOURCE_TYPE.IMAGE;
        }
      }
      AppMethodBeat.o(84193);
    }
  }

  public static void updateMaxFaceCount(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84191);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84191);
    while (true)
    {
      return;
      if (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_CROP.value)
        paramVideoMaterial.setMaxFaceCount(1);
      AppMethodBeat.o(84191);
    }
  }

  public static void updateNeedBodyInfo(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84196);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84196);
    while (true)
    {
      return;
      if (paramVideoMaterial.getItemList() != null)
      {
        Iterator localIterator = paramVideoMaterial.getItemList().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            StickerItem localStickerItem = (StickerItem)localIterator.next();
            if (localStickerItem.type == VideoFilterFactory.POSITION_TYPE.BODY.type)
            {
              paramVideoMaterial.setNeedBodyInfo(true);
              AppMethodBeat.o(84196);
              break;
            }
            if (isBodyTriggerType(localStickerItem.triggerType))
            {
              paramVideoMaterial.setNeedBodyInfo(true);
              AppMethodBeat.o(84196);
              break;
            }
          }
      }
      paramVideoMaterial.setNeedBodyInfo(false);
      AppMethodBeat.o(84196);
    }
  }

  public static void updateNeedFaceInfo(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84195);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84195);
    while (true)
    {
      return;
      if ((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.CUSTOM_BEFORE_COMMON.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.SNAKE_FACE_BEFORE_COMMON.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_OFF.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.TRANSFORM.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_SWITCH.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_OFF_TRANSFORM.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.THREE_DIM.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_SWITCH_DUP.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_COPY.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_MORPHING.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_HEAD_CROP.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_CROP.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.MAI_MENG.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.GAMEPLAY_3D.value))
      {
        paramVideoMaterial.setNeedFaceInfo(true);
        AppMethodBeat.o(84195);
      }
      else
      {
        if (paramVideoMaterial.getItemList() != null)
        {
          Iterator localIterator = paramVideoMaterial.getItemList().iterator();
          while (true)
            if (localIterator.hasNext())
            {
              StickerItem localStickerItem = (StickerItem)localIterator.next();
              if ((localStickerItem.type == VideoFilterFactory.POSITION_TYPE.STATIC.type) || (localStickerItem.type == VideoFilterFactory.POSITION_TYPE.DYNAMIC.type))
              {
                paramVideoMaterial.setNeedFaceInfo(true);
                AppMethodBeat.o(84195);
                break;
              }
              if (isFaceTriggerType(localStickerItem.triggerType))
              {
                paramVideoMaterial.setNeedFaceInfo(true);
                AppMethodBeat.o(84195);
                break;
              }
            }
        }
        paramVideoMaterial.setNeedFaceInfo(false);
        AppMethodBeat.o(84195);
      }
    }
  }

  public static void updatePointList(List<PointF> paramList1, List<PointF> paramList2)
  {
    AppMethodBeat.i(84159);
    if (paramList2 == null)
      AppMethodBeat.o(84159);
    while (true)
    {
      return;
      Object localObject = paramList1;
      if (paramList1 == null)
        localObject = new ArrayList();
      int i = paramList2.size();
      while (((List)localObject).size() > i)
        ((List)localObject).remove(((List)localObject).size() - 1);
      while (((List)localObject).size() < i)
        ((List)localObject).add(new PointF());
      for (int j = 0; j < i; j++)
      {
        ((PointF)((List)localObject).get(j)).x = ((PointF)paramList2.get(j)).x;
        ((PointF)((List)localObject).get(j)).y = ((PointF)paramList2.get(j)).y;
      }
      AppMethodBeat.o(84159);
    }
  }

  public static void updatePointListOfList(List<List<PointF>> paramList1, List<List<PointF>> paramList2)
  {
    AppMethodBeat.i(84160);
    if (paramList2 == null)
      AppMethodBeat.o(84160);
    while (true)
    {
      return;
      Object localObject = paramList1;
      if (paramList1 == null)
        localObject = new ArrayList();
      int i = paramList2.size();
      while (((List)localObject).size() > i)
        ((List)localObject).remove(((List)localObject).size() - 1);
      while (((List)localObject).size() < i)
        ((List)localObject).add(new ArrayList());
      for (int j = 0; j < i; j++)
        updatePointList((List)((List)localObject).get(j), (List)paramList2.get(j));
      AppMethodBeat.o(84160);
    }
  }

  public static void updateSupportLandscape(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84190);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84190);
    while (true)
    {
      return;
      if ((paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.MAI_MENG.value) || (paramVideoMaterial.getShaderType() == VideoMaterialUtil.SHADER_TYPE.FACE_CROP.value) || (isFaceMorphingMaterial(paramVideoMaterial)))
        paramVideoMaterial.setSupportLandscape(false);
      AppMethodBeat.o(84190);
    }
  }

  public static void updateWatermarkInfo(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84194);
    if ((paramVideoMaterial == null) || (paramVideoMaterial.getItemList() == null))
      AppMethodBeat.o(84194);
    while (true)
    {
      return;
      Iterator localIterator1 = paramVideoMaterial.getItemList().iterator();
      while (localIterator1.hasNext())
      {
        StickerItem localStickerItem = (StickerItem)localIterator1.next();
        if (localStickerItem.wmGroup != null)
        {
          localStickerItem.wmGroup.setItemId(localStickerItem.id);
          localStickerItem.wmGroup.setSize(localStickerItem.width, localStickerItem.height);
        }
        if (localStickerItem.wmGroupCopies != null)
        {
          Iterator localIterator2 = localStickerItem.wmGroupCopies.iterator();
          while (localIterator2.hasNext())
          {
            paramVideoMaterial = (WMGroup)localIterator2.next();
            paramVideoMaterial.setItemId(localStickerItem.id);
            paramVideoMaterial.setSize(localStickerItem.width, localStickerItem.height);
          }
        }
      }
      AppMethodBeat.o(84194);
    }
  }

  public static enum AR_MATERIAL_TYPE
  {
    public int value;

    static
    {
      AppMethodBeat.i(84056);
      NORMAL = new AR_MATERIAL_TYPE("NORMAL", 0, 1);
      CLICKABLE = new AR_MATERIAL_TYPE("CLICKABLE", 1, 2);
      $VALUES = new AR_MATERIAL_TYPE[] { NORMAL, CLICKABLE };
      AppMethodBeat.o(84056);
    }

    private AR_MATERIAL_TYPE(int paramInt)
    {
      this.value = paramInt;
    }
  }

  public static enum CHARM_RANGE_FIELD
  {
    public String value;

    static
    {
      AppMethodBeat.i(84062);
      MIN = new CHARM_RANGE_FIELD("MIN", 0, "min");
      MAX = new CHARM_RANGE_FIELD("MAX", 1, "max");
      $VALUES = new CHARM_RANGE_FIELD[] { MIN, MAX };
      AppMethodBeat.o(84062);
    }

    private CHARM_RANGE_FIELD(String paramString)
    {
      this.value = paramString;
    }
  }

  public static enum EXPRESSION_TYPE
  {
    public final int value;

    static
    {
      AppMethodBeat.i(84077);
      JUMP_EYE_BROW = new EXPRESSION_TYPE("JUMP_EYE_BROW", 0, 4);
      WINK = new EXPRESSION_TYPE("WINK", 1, 5);
      SHOOK_HEAD = new EXPRESSION_TYPE("SHOOK_HEAD", 2, 6);
      RIGHT_EYE_WINK = new EXPRESSION_TYPE("RIGHT_EYE_WINK", 3, 8);
      LEFT_EYE_WINK = new EXPRESSION_TYPE("LEFT_EYE_WINK", 4, 9);
      NOD = new EXPRESSION_TYPE("NOD", 5, 10);
      SHAKE_HEAD = new EXPRESSION_TYPE("SHAKE_HEAD", 6, 11);
      $VALUES = new EXPRESSION_TYPE[] { JUMP_EYE_BROW, WINK, SHOOK_HEAD, RIGHT_EYE_WINK, LEFT_EYE_WINK, NOD, SHAKE_HEAD };
      AppMethodBeat.o(84077);
    }

    private EXPRESSION_TYPE(int paramInt)
    {
      this.value = paramInt;
    }
  }

  public static enum FIELD
  {
    public final String value;

    static
    {
      AppMethodBeat.i(84104);
      MIN_APP_VERSION = new FIELD("MIN_APP_VERSION", 0, "minAppVersion");
      CATEGORY_FLAG = new FIELD("CATEGORY_FLAG", 1, "categoryFlag");
      SHADER_TYPE = new FIELD("SHADER_TYPE", 2, "shaderType");
      FACE_OFF_TYPE = new FIELD("FACE_OFF_TYPE", 3, "faceOffType");
      RESET_WHEN_START_RECORD = new FIELD("RESET_WHEN_START_RECORD", 4, "resetWhenStartRecord");
      SUPPORT_PAUSE = new FIELD("SUPPORT_PAUSE", 5, "supportPause");
      MAX_FACE_COUNT = new FIELD("MAX_FACE_COUNT", 6, "maxFaceCount");
      VOICE_KIND = new FIELD("VOICE_KIND", 7, "voicekind");
      ENVIRONMENT = new FIELD("ENVIRONMENT", 8, "environment");
      RESOURCE_LIST = new FIELD("RESOURCE_LIST", 9, "resourceList");
      ITEM_LIST = new FIELD("ITEM_LIST", 10, "itemList");
      FACE_EXCHANGE_IMAGE = new FIELD("FACE_EXCHANGE_IMAGE", 11, "faceExchangeImage");
      IMAGE_FACE_POINTS_FILE_NAME = new FIELD("IMAGE_FACE_POINTS_FILE_NAME", 12, "imageFacePointsFileName");
      BLEND_ALPHA = new FIELD("BLEND_ALPHA", 13, "blendAlpha");
      DISTORTION_LIST = new FIELD("DISTORTION_LIST", 14, "distortionList");
      FACE_POINTS_LIST = new FIELD("FACE_POINTS_LIST", 15, "facePoints");
      GRAY_SCALE = new FIELD("GRAY_SCALE", 16, "grayScale");
      FEATURE_TYPE = new FIELD("FEATURE_TYPE", 17, "featureType");
      FACE_MOVE_LIST = new FIELD("FACE_MOVE_LIST", 18, "faceMoveList");
      FACE_MOVE_TRIANGLE = new FIELD("FACE_MOVE_TRIANGLE", 19, "faceMoveTriangle");
      BLEND_MODE = new FIELD("BLEND_MODE", 20, "blendMode");
      ORDER_MODE = new FIELD("ORDER_MODE", 21, "orderMode");
      FACE_SWAP_TYPE = new FIELD("FACE_SWAP_TYPE", 22, "faceSwapType");
      FILTER_ID = new FIELD("FILTER_ID", 23, "filterId");
      FILTER_BLUR_STRENGTH = new FIELD("FILTER_BLUR_STRENGTH", 24, "filterBlurStrength");
      FILTER_EFFECT = new FIELD("FILTER_EFFECT", 25, "filterEffect");
      CHARM_RANGE = new FIELD("CHARM_RANGE", 26, "charmRange");
      FACE_MESH_ITEM_LIST = new FIELD("FACE_MESH_ITEM_LIST", 27, "faceMeshItemList");
      FACE_OFF_ITEM_LIST = new FIELD("FACE_OFF_ITEM_LIST", 28, "faceOffItemList");
      AR_PARTICLE_TYPE = new FIELD("AR_PARTICLE_TYPE", 29, "arParticleType");
      AR_PARTICLE_LIST = new FIELD("AR_PARTICLE_LIST", 30, "arParticleList");
      SUPPORT_LANDSCAPE = new FIELD("SUPPORT_LANDSCAPE", 31, "supportLandscape");
      RANDOM_GROUP_COUNT = new FIELD("RANDOM_GROUP_COUNT", 32, "randomGroupCount");
      FACE_EXPRESSION = new FIELD("FACE_EXPRESSION", 33, "faceExpression");
      TIPS_TEXT = new FIELD("TIPS_TEXT", 34, "tipsText");
      TIPS_ICON = new FIELD("TIPS_ICON", 35, "tipsIcon");
      FACE_CROP = new FIELD("FACE_CROP", 36, "videoFaceCrop");
      USE_MESH = new FIELD("USE_MESH", 37, "useMesh");
      FACE_HEAD_CROP_ITEM_LIST = new FIELD("FACE_HEAD_CROP_ITEM_LIST", 38, "headCropItemList");
      WATERMARK_GROUP = new FIELD("WATERMARK_GROUP", 39, "watermarkGroup");
      AD_ICON = new FIELD("AD_ICON", 40, "adIcon");
      AD_LINK = new FIELD("AD_LINK", 41, "adH5Link");
      AD_APP_LINK = new FIELD("AD_APP_LINK", 42, "adAppLink");
      DETECTOR_FLAG = new FIELD("DETECTOR_FLAG", 43, "detectorFlag");
      VIDEO_ALPHA_TYPE = new FIELD("VIDEO_ALPHA_TYPE", 44, "videoAlphaType");
      LIPS_LUT = new FIELD("LIPS_LUT", 45, "lipsLut");
      SPLIT_SCREEN = new FIELD("SPLIT_SCREEN", 46, "splitScreen");
      MULTI_VIEWER = new FIELD("MULTI_VIEWER", 47, "multiViewer");
      HAND_BOOST_ENABLE = new FIELD("HAND_BOOST_ENABLE", 48, "handBoostEnable");
      $VALUES = new FIELD[] { MIN_APP_VERSION, CATEGORY_FLAG, SHADER_TYPE, FACE_OFF_TYPE, RESET_WHEN_START_RECORD, SUPPORT_PAUSE, MAX_FACE_COUNT, VOICE_KIND, ENVIRONMENT, RESOURCE_LIST, ITEM_LIST, FACE_EXCHANGE_IMAGE, IMAGE_FACE_POINTS_FILE_NAME, BLEND_ALPHA, DISTORTION_LIST, FACE_POINTS_LIST, GRAY_SCALE, FEATURE_TYPE, FACE_MOVE_LIST, FACE_MOVE_TRIANGLE, BLEND_MODE, ORDER_MODE, FACE_SWAP_TYPE, FILTER_ID, FILTER_BLUR_STRENGTH, FILTER_EFFECT, CHARM_RANGE, FACE_MESH_ITEM_LIST, FACE_OFF_ITEM_LIST, AR_PARTICLE_TYPE, AR_PARTICLE_LIST, SUPPORT_LANDSCAPE, RANDOM_GROUP_COUNT, FACE_EXPRESSION, TIPS_TEXT, TIPS_ICON, FACE_CROP, USE_MESH, FACE_HEAD_CROP_ITEM_LIST, WATERMARK_GROUP, AD_ICON, AD_LINK, AD_APP_LINK, DETECTOR_FLAG, VIDEO_ALPHA_TYPE, LIPS_LUT, SPLIT_SCREEN, MULTI_VIEWER, HAND_BOOST_ENABLE };
      AppMethodBeat.o(84104);
    }

    private FIELD(String paramString)
    {
      this.value = paramString;
    }
  }

  public static enum WATERMARK_ELEMENT
  {
    public String value;

    static
    {
      AppMethodBeat.i(84134);
      ID = new WATERMARK_ELEMENT("ID", 0, "id");
      RELATIVE_ID = new WATERMARK_ELEMENT("RELATIVE_ID", 1, "relativeID");
      RELATIVE_ANCHOR = new WATERMARK_ELEMENT("RELATIVE_ANCHOR", 2, "relativeAnchor");
      ANCHOR = new WATERMARK_ELEMENT("ANCHOR", 3, "anchor");
      OFFSETX = new WATERMARK_ELEMENT("OFFSETX", 4, "offsetX");
      OFFSETY = new WATERMARK_ELEMENT("OFFSETY", 5, "offsetY");
      WIDTH = new WATERMARK_ELEMENT("WIDTH", 6, "width");
      HEIGHT = new WATERMARK_ELEMENT("HEIGHT", 7, "height");
      WMTYPE = new WATERMARK_ELEMENT("WMTYPE", 8, "wmtype");
      EDITTYPE = new WATERMARK_ELEMENT("EDITTYPE", 9, "editType");
      FMTSTR = new WATERMARK_ELEMENT("FMTSTR", 10, "fmtstr");
      FONT_NAME = new WATERMARK_ELEMENT("FONT_NAME", 11, "fontName");
      FONT_BOLD = new WATERMARK_ELEMENT("FONT_BOLD", 12, "fontBold");
      FONT_ITALICS = new WATERMARK_ELEMENT("FONT_ITALICS", 13, "fontItalics");
      FONT_TEXTURE = new WATERMARK_ELEMENT("FONT_TEXTURE", 14, "fontTexture");
      FONT_SIZE = new WATERMARK_ELEMENT("FONT_SIZE", 15, "fontSize");
      FONT_FIT = new WATERMARK_ELEMENT("FONT_FIT", 16, "fontFit");
      KERN = new WATERMARK_ELEMENT("KERN", 17, "kern");
      IMG_PATH = new WATERMARK_ELEMENT("IMG_PATH", 18, "imgPath");
      FRAME_DURATION = new WATERMARK_ELEMENT("FRAME_DURATION", 19, "frameDuration");
      FRAMES = new WATERMARK_ELEMENT("FRAMES", 20, "frames");
      COLOR = new WATERMARK_ELEMENT("COLOR", 21, "color");
      STROKE_COLOR = new WATERMARK_ELEMENT("STROKE_COLOR", 22, "strokeColor");
      STROKE_SIZE = new WATERMARK_ELEMENT("STROKE_SIZE", 23, "strokeSize");
      SHADOW_COLOR = new WATERMARK_ELEMENT("SHADOW_COLOR", 24, "shadowColor");
      SHADOW_SIZE = new WATERMARK_ELEMENT("SHADOW_SIZE", 25, "shadowSize");
      SHADOW_DX = new WATERMARK_ELEMENT("SHADOW_DX", 26, "shadowDx");
      SHADOW_DY = new WATERMARK_ELEMENT("SHADOW_DY", 27, "shadowDy");
      ALIGNMENT = new WATERMARK_ELEMENT("ALIGNMENT", 28, "alignment");
      VERTICAL = new WATERMARK_ELEMENT("VERTICAL", 29, "vertical");
      OUTER_STROKE_COLOR = new WATERMARK_ELEMENT("OUTER_STROKE_COLOR", 30, "outerStrokeColor");
      OUTER_STROKE_SIZE = new WATERMARK_ELEMENT("OUTER_STROKE_SIZE", 31, "outerStrokeSize");
      SHADER_BMP = new WATERMARK_ELEMENT("SHADER_BMP", 32, "shaderBmp");
      EMBOSS = new WATERMARK_ELEMENT("EMBOSS", 33, "emboss");
      MULTI_ROW = new WATERMARK_ELEMENT("MULTI_ROW", 34, "multiRow");
      ROTATE = new WATERMARK_ELEMENT("ROTATE", 35, "rotate");
      ANIMATE_TYPE = new WATERMARK_ELEMENT("ANIMATE_TYPE", 36, "animateType");
      LOGIC = new WATERMARK_ELEMENT("LOGIC", 37, "logic");
      $VALUES = new WATERMARK_ELEMENT[] { ID, RELATIVE_ID, RELATIVE_ANCHOR, ANCHOR, OFFSETX, OFFSETY, WIDTH, HEIGHT, WMTYPE, EDITTYPE, FMTSTR, FONT_NAME, FONT_BOLD, FONT_ITALICS, FONT_TEXTURE, FONT_SIZE, FONT_FIT, KERN, IMG_PATH, FRAME_DURATION, FRAMES, COLOR, STROKE_COLOR, STROKE_SIZE, SHADOW_COLOR, SHADOW_SIZE, SHADOW_DX, SHADOW_DY, ALIGNMENT, VERTICAL, OUTER_STROKE_COLOR, OUTER_STROKE_SIZE, SHADER_BMP, EMBOSS, MULTI_ROW, ROTATE, ANIMATE_TYPE, LOGIC };
      AppMethodBeat.o(84134);
    }

    private WATERMARK_ELEMENT(String paramString)
    {
      this.value = paramString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil
 * JD-Core Version:    0.6.2
 */
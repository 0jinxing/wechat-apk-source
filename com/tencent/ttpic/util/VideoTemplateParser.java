package com.tencent.ttpic.util;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.filter.FabbyMvPart;
import com.tencent.ttpic.filter.FabbyParts;
import com.tencent.ttpic.gameplaysdk.model.GameParams;
import com.tencent.ttpic.gameplaysdk.model.NodeParameter;
import com.tencent.ttpic.gameplaysdk.model.StickerItem3D;
import com.tencent.ttpic.json.XML;
import com.tencent.ttpic.logic.watermark.LogicDataManager;
import com.tencent.ttpic.model.AgeRange;
import com.tencent.ttpic.model.Audio2Text;
import com.tencent.ttpic.model.CanvasItem;
import com.tencent.ttpic.model.CharmRange;
import com.tencent.ttpic.model.CpRange;
import com.tencent.ttpic.model.DistortionItem;
import com.tencent.ttpic.model.ExpressionItem;
import com.tencent.ttpic.model.FaceCropItem;
import com.tencent.ttpic.model.FaceCropItem.CropFrame;
import com.tencent.ttpic.model.FaceExpression;
import com.tencent.ttpic.model.FaceFeatureItem;
import com.tencent.ttpic.model.FaceImageLayer;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.model.FaceMeshItem;
import com.tencent.ttpic.model.FaceMoveItem;
import com.tencent.ttpic.model.GenderRange;
import com.tencent.ttpic.model.GridModel;
import com.tencent.ttpic.model.GridSettingModel;
import com.tencent.ttpic.model.ImageWMElement;
import com.tencent.ttpic.model.MultiViewerItem;
import com.tencent.ttpic.model.PhantomItem;
import com.tencent.ttpic.model.PopularRange;
import com.tencent.ttpic.model.Rect;
import com.tencent.ttpic.model.ShakaEffectItem;
import com.tencent.ttpic.model.SizeI;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.StickerItem.ValueRange;
import com.tencent.ttpic.model.TextWMElement;
import com.tencent.ttpic.model.Transition;
import com.tencent.ttpic.model.VideoFilterEffect;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.model.WMElement;
import com.tencent.ttpic.model.WMElement.WMType;
import com.tencent.ttpic.model.WMGroup;
import com.tencent.ttpic.model.WMLogic;
import com.tencent.ttpic.model.WMLogicPair;
import com.tencent.ttpic.particle.ParticleConfig;
import com.tencent.util.g;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

public class VideoTemplateParser
{
  public static final String POSTFIX_DAT = "dat";
  private static final String POSTFIX_JSON = "json";
  private static final String TAG;
  private static final DecryptListener decryptListener;
  private static Comparator<Pair<Float, Integer>> mDivideValueComp;
  private static Comparator<Pair<Float, ? extends Object>> mDivideValueCompForObject;
  private static Comparator<GridModel> mGridModelComparator;
  private static Comparator<Pair<Float, Double>> mRangeValueComp;

  static
  {
    AppMethodBeat.i(84278);
    TAG = VideoTemplateParser.class.getSimpleName();
    decryptListener = new DecryptListener()
    {
      public final byte[] decrypt(byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(84229);
        paramAnonymousArrayOfByte = Coffee.drink(paramAnonymousArrayOfByte, Coffee.getDefaultSign());
        AppMethodBeat.o(84229);
        return paramAnonymousArrayOfByte;
      }
    };
    mDivideValueComp = new VideoTemplateParser.3();
    mDivideValueCompForObject = new VideoTemplateParser.4();
    mRangeValueComp = new VideoTemplateParser.5();
    mGridModelComparator = new VideoTemplateParser.6();
    AppMethodBeat.o(84278);
  }

  private static void checkValid(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84277);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(84277);
    while (true)
    {
      return;
      paramVideoMaterial = paramVideoMaterial.getItemList();
      if (paramVideoMaterial == null)
      {
        AppMethodBeat.o(84277);
      }
      else
      {
        paramVideoMaterial = paramVideoMaterial.iterator();
        while (paramVideoMaterial.hasNext())
        {
          StickerItem localStickerItem = (StickerItem)paramVideoMaterial.next();
          if (localStickerItem.type == VideoFilterFactory.POSITION_TYPE.STATIC.type)
          {
            if ((localStickerItem.position == null) || (localStickerItem.position.length < 2))
            {
              paramVideoMaterial = new IllegalArgumentException("No \"position\" field in static sticker");
              AppMethodBeat.o(84277);
              throw paramVideoMaterial;
            }
          }
          else if (localStickerItem.type == VideoFilterFactory.POSITION_TYPE.DYNAMIC.type)
          {
            if ((localStickerItem.scalePivots == null) || (localStickerItem.scalePivots.length < 2))
            {
              paramVideoMaterial = new IllegalArgumentException("No \"scalePivot\" field in dynamic sticker");
              AppMethodBeat.o(84277);
              throw paramVideoMaterial;
            }
            if ((localStickerItem.alignFacePoints == null) || (localStickerItem.alignFacePoints.length == 0))
            {
              paramVideoMaterial = new IllegalArgumentException("No \"alignFacePoints\" field in dynamic sticker");
              AppMethodBeat.o(84277);
              throw paramVideoMaterial;
            }
            if ((localStickerItem.anchorPoint == null) || (localStickerItem.anchorPoint.length < 2))
            {
              paramVideoMaterial = new IllegalArgumentException("No \"anchorPoint\" field in dynamic sticker");
              AppMethodBeat.o(84277);
              throw paramVideoMaterial;
            }
          }
        }
        AppMethodBeat.o(84277);
      }
    }
  }

  private static InputStream drinkACupOfCoffee(InputStream paramInputStream, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84276);
    byte[] arrayOfByte = g.toByteArray(paramInputStream);
    paramInputStream = arrayOfByte;
    if (paramDecryptListener != null)
      paramInputStream = paramDecryptListener.decrypt(arrayOfByte);
    paramInputStream = new ByteArrayInputStream(paramInputStream);
    AppMethodBeat.o(84276);
    return paramInputStream;
  }

  public static Object getVideoMaterialField(String paramString, VideoMaterialUtil.FIELD paramFIELD)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(84242);
    paramString = parseVideoMaterialFileAsJSONObject(paramString, "params", true, decryptListener);
    if (paramString == null)
    {
      AppMethodBeat.o(84242);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = paramString.get(paramFIELD.value);
        AppMethodBeat.o(84242);
      }
      catch (JSONException paramString)
      {
        while (true)
          paramString = localObject1;
      }
    }
  }

  private static void parse3DItemListParams(String paramString, org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial, boolean[] paramArrayOfBoolean)
  {
    AppMethodBeat.i(84263);
    ArrayList localArrayList;
    int i;
    int j;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    boolean bool;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      JSONArray localJSONArray = paramJSONObject.optJSONArray("itemList3D");
      if (localJSONArray != null)
      {
        i = 0;
        j = 0;
        if (j < localJSONArray.length())
        {
          localObject1 = localJSONArray.getJSONObject(j);
          localObject2 = new com/tencent/ttpic/gameplaysdk/model/StickerItem3D;
          ((StickerItem3D)localObject2).<init>();
          paramJSONObject = ((org.json.JSONObject)localObject1).optJSONArray("scale");
          if (paramJSONObject != null)
          {
            ((StickerItem3D)localObject2).nodeScale = new float[paramJSONObject.length()];
            for (i = 0; i < paramJSONObject.length(); i++)
              ((StickerItem3D)localObject2).nodeScale[i] = ((float)paramJSONObject.getDouble(i));
          }
          paramJSONObject = ((org.json.JSONObject)localObject1).optJSONArray("position");
          if (paramJSONObject != null)
          {
            ((StickerItem3D)localObject2).nodePosition = new float[paramJSONObject.length()];
            for (i = 0; i < paramJSONObject.length(); i++)
              ((StickerItem3D)localObject2).nodePosition[i] = ((float)paramJSONObject.getDouble(i));
          }
          paramJSONObject = ((org.json.JSONObject)localObject1).optJSONArray("eulerAngles");
          if (paramJSONObject != null)
          {
            ((StickerItem3D)localObject2).nodeEulerAngles = new float[paramJSONObject.length()];
            for (i = 0; i < paramJSONObject.length(); i++)
              ((StickerItem3D)localObject2).nodeEulerAngles[i] = ((float)paramJSONObject.getDouble(i));
          }
          ((StickerItem3D)localObject2).id = ((org.json.JSONObject)localObject1).optString("id");
          ((StickerItem3D)localObject2).frames = ((org.json.JSONObject)localObject1).optInt("frames");
          ((StickerItem3D)localObject2).frameDuration = ((org.json.JSONObject)localObject1).optDouble("frameDuration");
          if (((StickerItem3D)localObject2).frames > 0)
          {
            paramJSONObject = new com/tencent/ttpic/gameplaysdk/model/NodeParameter;
            paramJSONObject.<init>();
            paramJSONObject.nodeId = ((StickerItem3D)localObject2).id;
            paramJSONObject.frames = ((StickerItem3D)localObject2).frames;
            paramJSONObject.frameDuration = ((int)((StickerItem3D)localObject2).frameDuration);
            ((StickerItem3D)localObject2).nodeParameter = paramJSONObject;
          }
          if (((StickerItem3D)localObject2).id.contains(":"))
          {
            paramJSONObject = ((StickerItem3D)localObject2).id.split(":");
            if (paramJSONObject.length != 2);
          }
          for (((StickerItem3D)localObject2).subFolder = paramJSONObject[1]; ; ((StickerItem3D)localObject2).subFolder = ((StickerItem3D)localObject2).id)
          {
            ((StickerItem3D)localObject2).name = ((org.json.JSONObject)localObject1).optString("name");
            ((StickerItem3D)localObject2).type = ((org.json.JSONObject)localObject1).optInt("type");
            ((StickerItem3D)localObject2).personID = ((org.json.JSONObject)localObject1).optInt("personID", -1);
            ((StickerItem3D)localObject2).featureStatType = ((org.json.JSONObject)localObject1).optInt("featureStatType");
            ((StickerItem3D)localObject2).frameType = ((org.json.JSONObject)localObject1).optInt("frameType");
            ((StickerItem3D)localObject2).blendMode = ((org.json.JSONObject)localObject1).optInt("blendMode", -1);
            ((StickerItem3D)localObject2).zIndex = ((org.json.JSONObject)localObject1).optInt("zIndex", 0);
            ((StickerItem3D)localObject2).audioLoopCount = ((org.json.JSONObject)localObject1).optInt("audioLoopCount", -1);
            localObject3 = ((org.json.JSONObject)localObject1).optJSONObject(VideoMaterialUtil.FIELD.CHARM_RANGE.value);
            if (localObject3 != null)
            {
              paramJSONObject = new com/tencent/ttpic/model/CharmRange;
              paramJSONObject.<init>();
              ((StickerItem3D)localObject2).charmRange = paramJSONObject;
              ((StickerItem3D)localObject2).charmRange.min = ((org.json.JSONObject)localObject3).optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MIN.value);
              ((StickerItem3D)localObject2).charmRange.max = ((org.json.JSONObject)localObject3).optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MAX.value);
            }
            if (((StickerItem3D)localObject2).blendMode == -1)
              ((StickerItem3D)localObject2).blendMode = paramVideoMaterial.getBlendMode();
            ((StickerItem3D)localObject2).triggerType = ((org.json.JSONObject)localObject1).optInt("triggerType");
            if (VideoMaterialUtil.isActionTriggerType(((StickerItem3D)localObject2).triggerType))
              paramVideoMaterial.setTriggerType(((StickerItem3D)localObject2).triggerType);
            if (((org.json.JSONObject)localObject1).optInt("alwaysTriggered") != 1)
              break;
            bool = true;
            label601: ((StickerItem3D)localObject2).alwaysTriggered = bool;
            ((StickerItem3D)localObject2).playCount = ((org.json.JSONObject)localObject1).optInt("playCount");
            ((StickerItem3D)localObject2).stickerType = ((org.json.JSONObject)localObject1).optInt("stickerType", 0);
            if ((((StickerItem3D)localObject2).stickerType == VideoFilterFactory.STICKER_TYPE.VIDEO_UP_DOWN.type) || (((StickerItem3D)localObject2).stickerType == VideoFilterFactory.STICKER_TYPE.VIDEO_LEFT_RIGHT.type))
            {
              if (((StickerItem3D)localObject2).stickerType != VideoFilterFactory.STICKER_TYPE.VIDEO_UP_DOWN.type)
                break label815;
              paramJSONObject = VideoMaterialUtil.ITEM_SOURCE_TYPE.VIDEO_UP_DOWN;
              label681: ((StickerItem3D)localObject2).sourceType = paramJSONObject;
            }
            ((StickerItem3D)localObject2).width = ((org.json.JSONObject)localObject1).optInt("width");
            ((StickerItem3D)localObject2).height = ((org.json.JSONObject)localObject1).optInt("height");
            ((StickerItem3D)localObject2).support3D = ((org.json.JSONObject)localObject1).optInt("enable3D", 1);
            paramJSONObject = ((org.json.JSONObject)localObject1).optJSONArray("position");
            if (paramJSONObject == null)
              break label822;
            ((StickerItem3D)localObject2).position = new double[paramJSONObject.length()];
            for (i = 0; i < paramJSONObject.length(); i++)
              ((StickerItem3D)localObject2).position[i] = paramJSONObject.getDouble(i);
          }
        }
      }
    }
    catch (JSONException paramString)
    {
      LogUtils.e(TAG, paramString);
      AppMethodBeat.o(84263);
    }
    while (true)
    {
      return;
      bool = false;
      break label601;
      label815: paramJSONObject = VideoMaterialUtil.ITEM_SOURCE_TYPE.VIDEO_LEFT_RIGHT;
      break label681;
      label822: ((StickerItem3D)localObject2).position = new double[] { 0.0D, 0.0D };
      ((StickerItem3D)localObject2).audio = ((org.json.JSONObject)localObject1).optString("audio");
      if ((!TextUtils.isEmpty(((StickerItem3D)localObject2).audio)) && (!TextUtils.isEmpty(paramString)) && ((paramString.startsWith("assets://camera/camera_video/video_")) || (paramString.contains("/files/olm/camera/video_"))))
        paramArrayOfBoolean[0] = true;
      paramJSONObject = ((org.json.JSONObject)localObject1).optJSONArray("anchorPoint");
      if (paramJSONObject != null)
      {
        ((StickerItem3D)localObject2).anchorPoint = new int[paramJSONObject.length()];
        for (i = 0; i < paramJSONObject.length(); i++)
          ((StickerItem3D)localObject2).anchorPoint[i] = paramJSONObject.getInt(i);
      }
      paramJSONObject = ((org.json.JSONObject)localObject1).optJSONArray("alignFacePoints");
      if (paramJSONObject != null)
      {
        ((StickerItem3D)localObject2).alignFacePoints = new int[paramJSONObject.length()];
        for (i = 0; i < paramJSONObject.length(); i++)
          ((StickerItem3D)localObject2).alignFacePoints[i] = paramJSONObject.getInt(i);
      }
      paramJSONObject = ((org.json.JSONObject)localObject1).optJSONArray("scalePivots");
      if (paramJSONObject != null)
      {
        ((StickerItem3D)localObject2).scalePivots = new int[paramJSONObject.length()];
        for (i = 0; i < paramJSONObject.length(); i++)
          ((StickerItem3D)localObject2).scalePivots[i] = paramJSONObject.getInt(i);
      }
      ((StickerItem3D)localObject2).scaleFactor = ((org.json.JSONObject)localObject1).optInt("scaleFactor");
      ((StickerItem3D)localObject2).markMode = ((org.json.JSONObject)localObject1).optInt("markMode");
      ((StickerItem3D)localObject2).activateTriggerType = ((org.json.JSONObject)localObject1).optInt("activateTriggerType", 0);
      ((StickerItem3D)localObject2).activateTriggerCount = ((org.json.JSONObject)localObject1).optInt("activateTriggerCount", 0);
      ((StickerItem3D)localObject2).activateTriggerTotalCount = ((org.json.JSONObject)localObject1).optInt("activateTriggerTotalCount", 0);
      localObject3 = ((org.json.JSONObject)localObject1).optJSONObject("ageRange");
      if (localObject3 != null)
      {
        paramJSONObject = new com/tencent/ttpic/model/AgeRange;
        paramJSONObject.<init>();
        ((StickerItem3D)localObject2).ageRange = paramJSONObject;
        ((StickerItem3D)localObject2).ageRange.min = ((float)((org.json.JSONObject)localObject3).optDouble("min"));
        ((StickerItem3D)localObject2).ageRange.max = ((float)((org.json.JSONObject)localObject3).optDouble("max"));
      }
      paramJSONObject = ((org.json.JSONObject)localObject1).optJSONObject("genderRange");
      if (paramJSONObject != null)
      {
        localObject3 = new com/tencent/ttpic/model/GenderRange;
        ((GenderRange)localObject3).<init>();
        ((StickerItem3D)localObject2).genderRange = ((GenderRange)localObject3);
        ((StickerItem3D)localObject2).genderRange.min = ((float)paramJSONObject.optDouble("min"));
        ((StickerItem3D)localObject2).genderRange.max = ((float)paramJSONObject.optDouble("max"));
      }
      localObject3 = ((org.json.JSONObject)localObject1).optJSONObject("popularRange");
      if (localObject3 != null)
      {
        paramJSONObject = new com/tencent/ttpic/model/PopularRange;
        paramJSONObject.<init>();
        ((StickerItem3D)localObject2).popularRange = paramJSONObject;
        ((StickerItem3D)localObject2).popularRange.min = ((float)((org.json.JSONObject)localObject3).optDouble("min"));
        ((StickerItem3D)localObject2).popularRange.max = ((float)((org.json.JSONObject)localObject3).optDouble("max"));
      }
      localObject3 = ((org.json.JSONObject)localObject1).optJSONObject("cpRange");
      if (localObject3 != null)
      {
        paramJSONObject = new com/tencent/ttpic/model/CpRange;
        paramJSONObject.<init>();
        ((StickerItem3D)localObject2).cpRange = paramJSONObject;
        ((StickerItem3D)localObject2).cpRange.min = ((float)((org.json.JSONObject)localObject3).optDouble("min"));
        ((StickerItem3D)localObject2).cpRange.max = ((float)((org.json.JSONObject)localObject3).optDouble("max"));
      }
      localObject1 = ((org.json.JSONObject)localObject1).optJSONArray(VideoMaterialUtil.FIELD.WATERMARK_GROUP.value);
      int k;
      if (localObject1 != null)
      {
        localObject3 = new com/tencent/ttpic/model/WMGroup;
        ((WMGroup)localObject3).<init>();
        for (i = 0; i < ((JSONArray)localObject1).length(); i++)
        {
          Object localObject4 = ((JSONArray)localObject1).optJSONObject(i);
          if (localObject4 != null)
          {
            k = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.WMTYPE.value);
            Object localObject5;
            if (k == WMElement.WMType.TEXT.value)
            {
              paramJSONObject = new com/tencent/ttpic/model/TextWMElement;
              paramJSONObject.<init>();
              paramJSONObject.dataPath = paramVideoMaterial.getDataPath();
              paramJSONObject.sid = paramVideoMaterial.getId();
              paramJSONObject.id = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.ID.value);
              paramJSONObject.relativeID = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.RELATIVE_ID.value);
              localObject5 = ((org.json.JSONObject)localObject4).optJSONArray(VideoMaterialUtil.WATERMARK_ELEMENT.RELATIVE_ANCHOR.value);
              if ((localObject5 == null) || (((JSONArray)localObject5).length() != 2))
                break label2371;
              localObject6 = new android/graphics/PointF;
              ((PointF)localObject6).<init>((float)((JSONArray)localObject5).getDouble(0), (float)((JSONArray)localObject5).getDouble(1));
              paramJSONObject.relativeAnchor = ((PointF)localObject6);
              label1570: localObject5 = ((org.json.JSONObject)localObject4).optJSONArray(VideoMaterialUtil.WATERMARK_ELEMENT.ANCHOR.value);
              if ((localObject5 == null) || (((JSONArray)localObject5).length() != 2))
                break label2392;
              localObject6 = new android/graphics/PointF;
              ((PointF)localObject6).<init>((float)((JSONArray)localObject5).getDouble(0), (float)((JSONArray)localObject5).getDouble(1));
              paramJSONObject.anchor = ((PointF)localObject6);
              label1627: paramJSONObject.offsetX = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.OFFSETX.value);
              paramJSONObject.offsetY = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.OFFSETY.value);
              paramJSONObject.width = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.WIDTH.value);
              paramJSONObject.height = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.HEIGHT.value);
              paramJSONObject.wmtype = k;
              paramJSONObject.edittype = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.EDITTYPE.value);
              paramJSONObject.fmtstr = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.FMTSTR.value);
              paramJSONObject.fontName = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_NAME.value);
              if (((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_BOLD.value) != 1)
                break label2413;
              bool = true;
              label1756: paramJSONObject.fontBold = bool;
              if (((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_ITALICS.value) != 1)
                break label2419;
              bool = true;
              label1780: paramJSONObject.fontItalics = bool;
              paramJSONObject.fontTexture = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_TEXTURE.value);
              paramJSONObject.fontSize = ((float)((org.json.JSONObject)localObject4).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_SIZE.value, 60.0D));
              paramJSONObject.fontFit = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_FIT.value);
              paramJSONObject.kern = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.KERN.value);
              paramJSONObject.imgPath = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.IMG_PATH.value);
              paramJSONObject.frameDuration = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FRAME_DURATION.value);
              paramJSONObject.frames = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FRAMES.value);
              paramJSONObject.color = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.COLOR.value, "#FFFFFFFF");
              paramJSONObject.strokeColor = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.STROKE_COLOR.value, "#FFFFFFFF");
              paramJSONObject.strokeSize = ((float)((org.json.JSONObject)localObject4).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.STROKE_SIZE.value, -1.0D));
              paramJSONObject.shadowColor = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_COLOR.value, "#FFFFFFFF");
              paramJSONObject.shadowSize = ((float)((org.json.JSONObject)localObject4).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_SIZE.value, -1.0D));
              paramJSONObject.shadowDx = ((float)((org.json.JSONObject)localObject4).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_DX.value, -1.0D));
              paramJSONObject.shadowDy = ((float)((org.json.JSONObject)localObject4).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_DY.value, -1.0D));
              paramJSONObject.alignment = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.ALIGNMENT.value);
              paramJSONObject.vertical = ((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.VERTICAL.value);
              paramJSONObject.outerStrokeColor = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.OUTER_STROKE_COLOR.value, "#FFFFFFFF");
              paramJSONObject.outerStrokeSize = ((float)((org.json.JSONObject)localObject4).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.OUTER_STROKE_SIZE.value, -1.0D));
              paramJSONObject.shaderBmp = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.SHADER_BMP.value, null);
              if (((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.EMBOSS.value, 0) != 1)
                break label2425;
              bool = true;
              label2127: paramJSONObject.emboss = bool;
              if (((org.json.JSONObject)localObject4).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.MULTI_ROW.value, 0) != 1)
                break label2431;
            }
            Object localObject7;
            Object localObject8;
            Object localObject9;
            Object localObject10;
            label2371: label2392: label2413: label2419: label2425: label2431: for (bool = true; ; bool = false)
            {
              paramJSONObject.multiRow = bool;
              paramJSONObject.animateType = ((org.json.JSONObject)localObject4).optString(VideoMaterialUtil.WATERMARK_ELEMENT.ANIMATE_TYPE.value);
              localObject6 = ((org.json.JSONObject)localObject4).optJSONObject(VideoMaterialUtil.WATERMARK_ELEMENT.LOGIC.value);
              if (localObject6 == null)
                break label2558;
              localObject4 = new com/tencent/ttpic/model/WMLogic;
              ((WMLogic)localObject4).<init>();
              ((WMLogic)localObject4).type = ((org.json.JSONObject)localObject6).optString(VideoMaterialUtil.WATERMARK_LOGIC.TYPE.value);
              ((WMLogic)localObject4).setCompare(((org.json.JSONObject)localObject6).optString(VideoMaterialUtil.WATERMARK_LOGIC.COMPARE.value), paramJSONObject.sid);
              ((WMLogic)localObject4).data = ((org.json.JSONObject)localObject6).optString(VideoMaterialUtil.WATERMARK_LOGIC.DATA.value);
              localObject5 = ((org.json.JSONObject)localObject6).optJSONObject(VideoMaterialUtil.WATERMARK_LOGIC.RANGE.value);
              if (localObject5 == null)
                break label2445;
              localObject7 = new java/util/ArrayList;
              ((ArrayList)localObject7).<init>();
              ((WMLogic)localObject4).range = ((List)localObject7);
              localObject7 = ((org.json.JSONObject)localObject5).keys();
              while (((Iterator)localObject7).hasNext())
              {
                localObject8 = (String)((Iterator)localObject7).next();
                String str = ((org.json.JSONObject)localObject5).optString((String)localObject8);
                localObject9 = ((WMLogic)localObject4).range;
                localObject10 = new com/tencent/ttpic/model/WMLogicPair;
                ((WMLogicPair)localObject10).<init>((String)localObject8, str);
                ((List)localObject9).add(localObject10);
              }
              paramJSONObject = new ImageWMElement();
              break;
              localObject6 = new android/graphics/PointF;
              ((PointF)localObject6).<init>(0.0F, 0.0F);
              paramJSONObject.relativeAnchor = ((PointF)localObject6);
              break label1570;
              localObject6 = new android/graphics/PointF;
              ((PointF)localObject6).<init>(0.0F, 0.0F);
              paramJSONObject.anchor = ((PointF)localObject6);
              break label1627;
              bool = false;
              break label1756;
              bool = false;
              break label1780;
              bool = false;
              break label2127;
            }
            Collections.sort(((WMLogic)localObject4).range);
            label2445: Object localObject6 = ((org.json.JSONObject)localObject6).optJSONObject(VideoMaterialUtil.WATERMARK_LOGIC.CASE.value);
            if (localObject6 != null)
            {
              localObject5 = new java/util/ArrayList;
              ((ArrayList)localObject5).<init>();
              ((WMLogic)localObject4).wmcase = ((List)localObject5);
              localObject10 = ((org.json.JSONObject)localObject6).keys();
              while (((Iterator)localObject10).hasNext())
              {
                localObject7 = (String)((Iterator)localObject10).next();
                localObject9 = ((org.json.JSONObject)localObject6).optString((String)localObject7);
                localObject5 = ((WMLogic)localObject4).wmcase;
                localObject8 = new com/tencent/ttpic/model/WMLogicPair;
                ((WMLogicPair)localObject8).<init>((String)localObject7, (String)localObject9);
                ((List)localObject5).add(localObject8);
              }
            }
            paramJSONObject.logic = ((WMLogic)localObject4);
            label2558: ((WMGroup)localObject3).wmElements.add(paramJSONObject);
          }
        }
        ((StickerItem3D)localObject2).wmGroup = ((WMGroup)localObject3);
      }
      ((StickerItem3D)localObject2).preTriggerType = ((StickerItem3D)localObject2).triggerType;
      localArrayList.add(localObject2);
      i = ((StickerItem3D)localObject2).triggerType;
      j++;
      break;
      paramJSONObject = localArrayList.iterator();
      while (paramJSONObject.hasNext())
      {
        paramString = (StickerItem3D)paramJSONObject.next();
        if (paramString.activateTriggerType == 0)
        {
          paramString.countTriggerType = i;
        }
        else
        {
          paramString.playCount = 0;
          paramString.countTriggerType = PTFaceAttr.PTExpression.MV_PART_INDEX.value;
        }
      }
      paramVideoMaterial.setItemList3D(localArrayList);
      paramVideoMaterial = paramVideoMaterial.getGameParams();
      if (paramVideoMaterial != null)
      {
        for (i = 0; i < localArrayList.size(); i++)
        {
          paramArrayOfBoolean = (StickerItem3D)localArrayList.get(i);
          j = 0;
          paramJSONObject = "";
          int m;
          int n;
          float f;
          if ((paramArrayOfBoolean.nodePosition != null) && (paramArrayOfBoolean.nodePosition.length == 3))
          {
            m = 1;
            localObject2 = paramArrayOfBoolean.nodePosition;
            n = localObject2.length;
            for (k = 0; ; k++)
            {
              paramString = paramJSONObject;
              j = m;
              if (k >= n)
                break;
              f = localObject2[k];
              paramString = new java/lang/StringBuilder;
              paramString.<init>();
              paramJSONObject = paramJSONObject + f + "/";
            }
          }
          paramString = new java/lang/StringBuilder;
          paramString.<init>();
          paramString = "" + "0/0/0/";
          if (paramArrayOfBoolean.id.equals("head"))
          {
            paramJSONObject = new java/lang/StringBuilder;
            paramJSONObject.<init>();
            paramString = paramString + "180/0/0/";
          }
          while ((paramArrayOfBoolean.nodeScale != null) && (paramArrayOfBoolean.nodeScale.length == 3))
          {
            m = 1;
            localObject2 = paramArrayOfBoolean.nodeScale;
            n = localObject2.length;
            for (j = 0; ; j++)
            {
              paramJSONObject = paramString;
              k = m;
              if (j >= n)
                break;
              f = localObject2[j];
              paramJSONObject = new java/lang/StringBuilder;
              paramJSONObject.<init>();
              paramString = paramString + f + "/";
            }
            if ((paramArrayOfBoolean.nodeEulerAngles != null) && (paramArrayOfBoolean.nodeEulerAngles.length == 3))
            {
              m = 1;
              localObject2 = paramArrayOfBoolean.nodeEulerAngles;
              n = localObject2.length;
              k = 0;
              paramJSONObject = paramString;
              while (true)
              {
                paramString = paramJSONObject;
                j = m;
                if (k >= n)
                  break;
                f = localObject2[k];
                paramString = new java/lang/StringBuilder;
                paramString.<init>();
                paramJSONObject = paramJSONObject + f + "/";
                k++;
              }
            }
            paramJSONObject = new java/lang/StringBuilder;
            paramJSONObject.<init>();
            paramString = paramString + "0/0/0/";
          }
          paramJSONObject = new java/lang/StringBuilder;
          paramJSONObject.<init>();
          paramJSONObject = paramString + "1/1/1/";
          k = j;
          if (k != 0)
          {
            paramString = paramArrayOfBoolean.id.split(":");
            paramArrayOfBoolean = new java/lang/StringBuilder;
            paramArrayOfBoolean.<init>();
            paramVideoMaterial.nodeInitialTransform = (paramVideoMaterial.nodeInitialTransform + paramString[0] + "/" + paramJSONObject);
          }
        }
        if (!TextUtils.isEmpty(paramVideoMaterial.nodeInitialTransform))
          paramVideoMaterial.nodeInitialTransform = paramVideoMaterial.nodeInitialTransform.substring(0, paramVideoMaterial.nodeInitialTransform.length() - 1);
      }
      AppMethodBeat.o(84263);
    }
  }

  private static void parseArParticleListParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84253);
    paramJSONObject = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.AR_PARTICLE_LIST.value);
    if (paramJSONObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramJSONObject.length(); i++)
      {
        String str = paramJSONObject.optString(i);
        if (str != null)
          localArrayList.add(str);
      }
      paramVideoMaterial.setArParticleList(localArrayList);
    }
    AppMethodBeat.o(84253);
  }

  public static void parseAudio2TextParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84269);
    org.json.JSONObject localJSONObject = paramJSONObject.optJSONObject("audio2text");
    if (localJSONObject != null)
    {
      paramJSONObject = new Audio2Text();
      paramJSONObject.sentenceCount = localJSONObject.optInt("sentenceCount", 0);
      paramJSONObject.sentenceMode = localJSONObject.optInt("sentenceMode", 0);
      paramJSONObject.silenceTime = localJSONObject.optDouble("silenceTime", 0.0D);
      paramJSONObject.segmentCount = localJSONObject.optInt("segmentCount", 0);
      paramJSONObject.segmentTime = localJSONObject.optDouble("segmentTime", 0.0D);
      paramJSONObject.triggerWords = localJSONObject.optString("triggerWords", null);
      paramVideoMaterial.setAudio2Text(paramJSONObject);
    }
    AppMethodBeat.o(84269);
  }

  private static void parseAudio3DParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    boolean bool1 = true;
    AppMethodBeat.i(84267);
    GameParams localGameParams = new GameParams();
    localGameParams.mGameName = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.GAME_NAME.value);
    localGameParams.mAnimNames = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.ANIM_NAMES.value);
    localGameParams.mAnimDefaultRotate = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.ANIM_DEFAULT_ROTATE.value);
    localGameParams.mAnimNodeNames = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.ANIM_NODE_NAMES.value);
    localGameParams.mRunningAnimName = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.RUNNING_ANIM_NAME.value);
    localGameParams.mRunningAnimDefaultRotate = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.RUNNING_ANIM_DEFAULT_ROTATE.value);
    JSONArray localJSONArray = paramJSONObject.optJSONArray(VideoMaterialUtil.GAME_FIELD.TEXTURE_IMAGES.value);
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      localGameParams.textureImages = new String[localJSONArray.length()];
      for (int i = 0; i < localJSONArray.length(); i++)
        localGameParams.textureImages[i] = localJSONArray.optString(i);
      localGameParams.usePreload = true;
    }
    localGameParams.fov = ((float)paramJSONObject.optDouble(VideoMaterialUtil.GAME_FIELD.FOV.value, 60.0D));
    if (paramJSONObject.optInt(VideoMaterialUtil.GAME_FIELD.NOT_FLATTEN_EAR.value, 0) == 0)
    {
      bool2 = true;
      localGameParams.flattenEar = bool2;
      if (paramJSONObject.optInt(VideoMaterialUtil.GAME_FIELD.NOT_FLATTEN_NOSE.value, 0) != 0)
        break label257;
    }
    label257: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localGameParams.flattenNose = bool2;
      paramVideoMaterial.setAudio3DParams(localGameParams);
      AppMethodBeat.o(84267);
      return;
      bool2 = false;
      break;
    }
  }

  private static void parseBasicParams(String paramString, org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    boolean bool1 = true;
    AppMethodBeat.i(84249);
    paramVideoMaterial.setId(VideoMaterialUtil.getMaterialId(paramString));
    paramVideoMaterial.setMinAppVersion(paramJSONObject.optInt(VideoMaterialUtil.FIELD.MIN_APP_VERSION.value));
    paramVideoMaterial.setCategoryFlag(paramJSONObject.optInt(VideoMaterialUtil.FIELD.CATEGORY_FLAG.value, 0));
    paramVideoMaterial.setShaderType(paramJSONObject.optInt(VideoMaterialUtil.FIELD.SHADER_TYPE.value));
    paramVideoMaterial.setFaceoffType(paramJSONObject.optInt(VideoMaterialUtil.FIELD.FACE_OFF_TYPE.value));
    paramVideoMaterial.setFaceSwapType(paramJSONObject.optInt(VideoMaterialUtil.FIELD.FACE_SWAP_TYPE.value));
    paramVideoMaterial.setMaxFaceCount(paramJSONObject.optInt(VideoMaterialUtil.FIELD.MAX_FACE_COUNT.value));
    if (paramJSONObject.optInt(VideoMaterialUtil.FIELD.RESET_WHEN_START_RECORD.value, 0) == 1)
    {
      bool2 = true;
      paramVideoMaterial.setResetWhenStartRecord(bool2);
      if (paramJSONObject.optInt(VideoMaterialUtil.FIELD.SUPPORT_PAUSE.value, 0) != 1)
        break label576;
      bool2 = true;
      label143: paramVideoMaterial.setSupportPause(bool2);
      paramVideoMaterial.setVoicekind(paramJSONObject.optInt(VideoMaterialUtil.FIELD.VOICE_KIND.value, -999999));
      paramVideoMaterial.setEnvironment(paramJSONObject.optInt(VideoMaterialUtil.FIELD.ENVIRONMENT.value, -999999));
      paramVideoMaterial.setFaceExchangeImage(paramJSONObject.optString(VideoMaterialUtil.FIELD.FACE_EXCHANGE_IMAGE.value));
      paramVideoMaterial.setImageFacePointsFileName(paramJSONObject.optString(VideoMaterialUtil.FIELD.IMAGE_FACE_POINTS_FILE_NAME.value));
      paramVideoMaterial.setBlendAlpha(paramJSONObject.optDouble(VideoMaterialUtil.FIELD.BLEND_ALPHA.value));
      paramVideoMaterial.setGrayScale(paramJSONObject.optInt(VideoMaterialUtil.FIELD.GRAY_SCALE.value));
      paramVideoMaterial.setOrderMode(paramJSONObject.optInt(VideoMaterialUtil.FIELD.ORDER_MODE.value));
      paramVideoMaterial.setBlendMode(paramJSONObject.optInt(VideoMaterialUtil.FIELD.BLEND_MODE.value));
      paramVideoMaterial.setFeatureType(paramJSONObject.optInt(VideoMaterialUtil.FIELD.FEATURE_TYPE.value));
      paramVideoMaterial.setFilterId(paramJSONObject.optString(VideoMaterialUtil.FIELD.FILTER_ID.value));
      paramVideoMaterial.setFilterBlurStrength(paramJSONObject.optDouble(VideoMaterialUtil.FIELD.FILTER_BLUR_STRENGTH.value, 0.0D));
      paramVideoMaterial.setArParticleType(paramJSONObject.optInt(VideoMaterialUtil.FIELD.AR_PARTICLE_TYPE.value));
      if (paramJSONObject.optInt(VideoMaterialUtil.FIELD.SUPPORT_LANDSCAPE.value, 1) != 1)
        break label582;
      bool2 = true;
      label342: paramVideoMaterial.setSupportLandscape(bool2);
      paramVideoMaterial.setRandomGroupCount(paramJSONObject.optInt(VideoMaterialUtil.FIELD.RANDOM_GROUP_COUNT.value));
      paramVideoMaterial.setTipsText(paramJSONObject.optString(VideoMaterialUtil.FIELD.TIPS_TEXT.value));
      paramVideoMaterial.setTipsIcon(paramJSONObject.optString(VideoMaterialUtil.FIELD.TIPS_ICON.value));
      paramVideoMaterial.setHandBoostEnable(paramJSONObject.optInt(VideoMaterialUtil.FIELD.HAND_BOOST_ENABLE.value));
      if (paramJSONObject.optInt(VideoMaterialUtil.FIELD.USE_MESH.value, 0) == 0)
        break label588;
    }
    label576: label582: label588: for (boolean bool2 = bool1; ; bool2 = false)
    {
      paramVideoMaterial.setUseMesh(bool2);
      if (!TextUtils.isEmpty(paramJSONObject.optString(VideoMaterialUtil.FIELD.AD_ICON.value)))
        paramVideoMaterial.setAdIcon(paramString + File.separator + paramJSONObject.optString(VideoMaterialUtil.FIELD.AD_ICON.value));
      paramVideoMaterial.setAdLink(paramJSONObject.optString(VideoMaterialUtil.FIELD.AD_LINK.value));
      paramVideoMaterial.setAdAppLink(paramJSONObject.optString(VideoMaterialUtil.FIELD.AD_APP_LINK.value));
      paramVideoMaterial.setWeiboTag(paramJSONObject.optString("weiboTag"));
      paramVideoMaterial.setDetectorFlag(paramJSONObject.optInt(VideoMaterialUtil.FIELD.DETECTOR_FLAG.value));
      paramVideoMaterial.setLipsLutPath(paramJSONObject.optString(VideoMaterialUtil.FIELD.LIPS_LUT.value));
      paramVideoMaterial.setSplitScreen((float)paramJSONObject.optDouble(VideoMaterialUtil.FIELD.SPLIT_SCREEN.value, 0.0D));
      AppMethodBeat.o(84249);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label143;
      bool2 = false;
      break label342;
    }
  }

  private static List<DistortionItem> parseDistortionItemListParams(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(84261);
    if (paramJSONArray != null);
    while (true)
    {
      try
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = 0;
        if (i < paramJSONArray.length())
        {
          DistortionItem localDistortionItem = new com/tencent/ttpic/model/DistortionItem;
          localDistortionItem.<init>();
          org.json.JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          localDistortionItem.position = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.POSITION.value);
          localDistortionItem.distortion = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.DISTORTION.value);
          localDistortionItem.direction = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.DIRECTION.value);
          localDistortionItem.radius = ((float)localJSONObject.optDouble(VideoMaterialUtil.DISTORTION_ITEM_FILED.RADIUS.value));
          localDistortionItem.strength = ((float)localJSONObject.optDouble(VideoMaterialUtil.DISTORTION_ITEM_FILED.STRENGH.value));
          localDistortionItem.x = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.X.value);
          localDistortionItem.y = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.Y.value);
          localArrayList.add(localDistortionItem);
          i++;
          continue;
        }
        AppMethodBeat.o(84261);
        paramJSONArray = localArrayList;
        return paramJSONArray;
      }
      catch (JSONException paramJSONArray)
      {
        LogUtils.e(TAG, paramJSONArray);
      }
      paramJSONArray = null;
      AppMethodBeat.o(84261);
    }
  }

  private static void parseFabbyMvItems(String paramString, org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84268);
    Object localObject1 = paramJSONObject.optString("mvTemplateFile");
    if (TextUtils.isEmpty((CharSequence)localObject1))
      AppMethodBeat.o(84268);
    while (true)
    {
      return;
      int i = ((String)localObject1).lastIndexOf(".");
      Object localObject2 = localObject1;
      if (i >= 0)
        localObject2 = ((String)localObject1).substring(0, i);
      Object localObject3 = parseVideoMaterialFileAsJSONObject(paramString, (String)localObject2, true, paramDecryptListener);
      if (localObject3 == null)
      {
        AppMethodBeat.o(84268);
      }
      else
      {
        JSONArray localJSONArray = ((org.json.JSONObject)localObject3).optJSONArray("parts");
        if (localJSONArray == null)
        {
          AppMethodBeat.o(84268);
        }
        else if (localJSONArray.length() <= 0)
        {
          AppMethodBeat.o(84268);
        }
        else
        {
          localJSONArray.length();
          Object localObject4 = new ArrayList();
          int j;
          for (i = 0; i < localJSONArray.length(); i++)
          {
            FabbyMvPart localFabbyMvPart = new FabbyMvPart();
            Object localObject5 = localJSONArray.optJSONObject(i);
            if (localObject5 != null)
            {
              double d = ((org.json.JSONObject)localObject5).optDouble("duration");
              Object localObject6 = ((org.json.JSONObject)localObject5).optJSONObject("background");
              if (localObject6 != null)
              {
                localObject7 = new StickerItem();
                localObject2 = ((org.json.JSONObject)localObject6).optString("videoFile");
                localObject1 = ((org.json.JSONObject)localObject6).optString("imageName");
                if ((!TextUtils.isEmpty((CharSequence)localObject2)) || (!TextUtils.isEmpty((CharSequence)localObject1)))
                {
                  if (TextUtils.isEmpty((CharSequence)localObject2))
                    break label1250;
                  j = ((String)localObject2).lastIndexOf("/");
                  ((StickerItem)localObject7).id = ((String)localObject2).substring(j + 1, ((String)localObject2).length());
                  ((StickerItem)localObject7).subFolder = ((String)localObject2).substring(0, j);
                  j = 1;
                  ((StickerItem)localObject7).type = 1;
                  ((StickerItem)localObject7).alwaysTriggered = true;
                  ((StickerItem)localObject7).frames = ((org.json.JSONObject)localObject6).optInt("imageCount", 1);
                  ((StickerItem)localObject7).frameDuration = (((org.json.JSONObject)localObject6).optDouble("imageDuration", d) / ((StickerItem)localObject7).frames * 1000.0D);
                  ((StickerItem)localObject7).aspectMode = ((org.json.JSONObject)localObject6).optInt("aspectMode", 0);
                  ((StickerItem)localObject7).blendMode = ((org.json.JSONObject)localObject6).optInt("blendMode", 0);
                  ((StickerItem)localObject7).width = ((org.json.JSONObject)localObject6).optInt("width", 720);
                  ((StickerItem)localObject7).height = ((org.json.JSONObject)localObject6).optInt("height", 960);
                  ((StickerItem)localObject7).position = new double[] { 0.0D, 0.0D };
                  ((StickerItem)localObject7).isFabbyMvItem = true;
                  ((StickerItem)localObject7).fabbyTotalParts = localJSONArray.length();
                  ((StickerItem)localObject7).fabbyPart = i;
                  if (j == 0)
                    break label1328;
                  ((StickerItem)localObject7).sourceType = VideoMaterialUtil.getItemSourceType(((org.json.JSONObject)localObject6).optInt(VideoMaterialUtil.FIELD.VIDEO_ALPHA_TYPE.value));
                  label473: localFabbyMvPart.bgItem = ((StickerItem)localObject7);
                }
              }
              Object localObject7 = ((org.json.JSONObject)localObject5).optJSONObject("foreground");
              if (localObject7 != null)
              {
                localObject6 = new StickerItem();
                localObject2 = ((org.json.JSONObject)localObject7).optString("videoFile");
                localObject1 = ((org.json.JSONObject)localObject7).optString("imageName");
                if ((!TextUtils.isEmpty((CharSequence)localObject2)) || (!TextUtils.isEmpty((CharSequence)localObject1)))
                {
                  if (TextUtils.isEmpty((CharSequence)localObject2))
                    break label1339;
                  j = ((String)localObject2).lastIndexOf("/");
                  ((StickerItem)localObject6).id = ((String)localObject2).substring(j + 1, ((String)localObject2).length());
                  ((StickerItem)localObject6).subFolder = ((String)localObject2).substring(0, j);
                  j = 1;
                  label593: ((StickerItem)localObject6).type = 1;
                  ((StickerItem)localObject6).alwaysTriggered = true;
                  ((StickerItem)localObject6).frames = ((org.json.JSONObject)localObject7).optInt("imageCount", 1);
                  ((StickerItem)localObject6).frameDuration = (((org.json.JSONObject)localObject7).optDouble("imageDuration", d) / ((StickerItem)localObject6).frames * 1000.0D);
                  ((StickerItem)localObject6).aspectMode = ((org.json.JSONObject)localObject7).optInt("aspectMode", 0);
                  ((StickerItem)localObject6).blendMode = ((org.json.JSONObject)localObject7).optInt("blendMode", 0);
                  ((StickerItem)localObject6).width = ((org.json.JSONObject)localObject7).optInt("width", 720);
                  ((StickerItem)localObject6).height = ((org.json.JSONObject)localObject7).optInt("height", 1280);
                  ((StickerItem)localObject6).position = new double[] { 0.0D, 0.0D };
                  ((StickerItem)localObject6).isFabbyMvItem = true;
                  ((StickerItem)localObject6).fabbyTotalParts = localJSONArray.length();
                  ((StickerItem)localObject6).fabbyPart = i;
                  if (j == 0)
                    break label1417;
                  ((StickerItem)localObject6).sourceType = VideoMaterialUtil.getItemSourceType(((org.json.JSONObject)localObject7).optInt(VideoMaterialUtil.FIELD.VIDEO_ALPHA_TYPE.value));
                  label768: localFabbyMvPart.fgItem = ((StickerItem)localObject6);
                }
              }
              localObject7 = ((org.json.JSONObject)localObject5).optJSONObject("cover");
              if (localObject7 != null)
              {
                localObject6 = new StickerItem();
                localObject1 = ((org.json.JSONObject)localObject7).optString("imageFile");
                if (!TextUtils.isEmpty((CharSequence)localObject1))
                {
                  localObject2 = localObject1;
                  if (((String)localObject1).endsWith("_"))
                    localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
                  j = ((String)localObject2).lastIndexOf("/");
                  ((StickerItem)localObject6).id = ((String)localObject2).substring(j + 1, ((String)localObject2).lastIndexOf("_"));
                  ((StickerItem)localObject6).subFolder = ((String)localObject2).substring(0, j);
                  ((StickerItem)localObject6).type = 1;
                  ((StickerItem)localObject6).alwaysTriggered = true;
                  ((StickerItem)localObject6).frames = 1;
                  ((StickerItem)localObject6).frameDuration = (1000.0D * d);
                  ((StickerItem)localObject6).aspectMode = ((org.json.JSONObject)localObject7).optInt("aspectMode", 0);
                  ((StickerItem)localObject6).blendMode = ((org.json.JSONObject)localObject7).optInt("blendMode", 0);
                  ((StickerItem)localObject6).width = ((org.json.JSONObject)localObject7).optInt("width", 720);
                  ((StickerItem)localObject6).height = ((org.json.JSONObject)localObject7).optInt("height", 1280);
                  ((StickerItem)localObject6).position = new double[] { 0.0D, 0.0D };
                  ((StickerItem)localObject6).isFabbyMvItem = true;
                  ((StickerItem)localObject6).fabbyTotalParts = localJSONArray.length();
                  ((StickerItem)localObject6).fabbyPart = i;
                  localFabbyMvPart.coverItem = ((StickerItem)localObject6);
                }
              }
              localObject2 = ((org.json.JSONObject)localObject5).optJSONObject("cameraFrame");
              if (localObject2 != null)
              {
                localFabbyMvPart.easeCurve = ((org.json.JSONObject)localObject2).optInt("easeCurve", 0);
                localFabbyMvPart.scaleMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("shakaEffect");
                Object localObject8;
                Object localObject9;
                Object localObject10;
                Object localObject11;
                Object localObject12;
                Object localObject13;
                if (localObject1 != null)
                {
                  localObject8 = new ShakaEffectItem();
                  ((ShakaEffectItem)localObject8).setFilterType(((org.json.JSONObject)localObject1).optInt("filterType"));
                  localObject9 = new HashMap();
                  localObject10 = ((org.json.JSONObject)localObject1).keys();
                  while (true)
                  {
                    if (!((Iterator)localObject10).hasNext())
                      break label1451;
                    localObject6 = (String)((Iterator)localObject10).next();
                    localObject11 = ((org.json.JSONObject)localObject1).optJSONObject((String)localObject6);
                    new StringBuilder("key = ").append((String)localObject6).append(", valueJson = ").append(localObject11);
                    if (localObject11 != null)
                    {
                      localObject7 = new ArrayList();
                      localObject12 = ((org.json.JSONObject)localObject11).keys();
                      while (true)
                        if (((Iterator)localObject12).hasNext())
                        {
                          localObject13 = (String)((Iterator)localObject12).next();
                          ((List)localObject7).add(Pair.create(Float.valueOf((String)localObject13), Double.valueOf(((org.json.JSONObject)localObject11).optDouble((String)localObject13, 0.0D))));
                          continue;
                          label1250: localObject2 = localObject1;
                          if (((String)localObject1).endsWith("_"))
                            localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
                          j = ((String)localObject2).lastIndexOf("/");
                          ((StickerItem)localObject7).id = ((String)localObject2).substring(j + 1, ((String)localObject2).length());
                          ((StickerItem)localObject7).subFolder = ((String)localObject2).substring(0, j);
                          j = 0;
                          break;
                          label1328: ((StickerItem)localObject7).sourceType = VideoMaterialUtil.ITEM_SOURCE_TYPE.IMAGE;
                          break label473;
                          label1339: localObject2 = localObject1;
                          if (((String)localObject1).endsWith("_"))
                            localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
                          j = ((String)localObject2).lastIndexOf("/");
                          ((StickerItem)localObject6).id = ((String)localObject2).substring(j + 1, ((String)localObject2).length());
                          ((StickerItem)localObject6).subFolder = ((String)localObject2).substring(0, j);
                          j = 0;
                          break label593;
                          label1417: ((StickerItem)localObject6).sourceType = VideoMaterialUtil.ITEM_SOURCE_TYPE.IMAGE;
                          break label768;
                        }
                      Collections.sort((List)localObject7, mRangeValueComp);
                      ((Map)localObject9).put(localObject6, localObject7);
                    }
                  }
                  label1451: ((ShakaEffectItem)localObject8).setValueMap((Map)localObject9);
                  localFabbyMvPart.setShakaEffectItem((ShakaEffectItem)localObject8);
                }
                localObject7 = ((org.json.JSONObject)localObject2).optJSONObject("scale");
                if (localObject7 != null)
                {
                  localObject6 = ((org.json.JSONObject)localObject7).keys();
                  while (((Iterator)localObject6).hasNext())
                  {
                    localObject1 = (String)((Iterator)localObject6).next();
                    localFabbyMvPart.scaleMap.add(Pair.create(Float.valueOf((String)localObject1), Double.valueOf(((org.json.JSONObject)localObject7).optDouble((String)localObject1, 1.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.scaleMap, mRangeValueComp);
                localFabbyMvPart.degreeMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("rotate");
                if (localObject1 != null)
                {
                  localObject7 = ((org.json.JSONObject)localObject1).keys();
                  while (((Iterator)localObject7).hasNext())
                  {
                    localObject6 = (String)((Iterator)localObject7).next();
                    localFabbyMvPart.degreeMap.add(Pair.create(Float.valueOf((String)localObject6), Double.valueOf(((org.json.JSONObject)localObject1).optDouble((String)localObject6, 0.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.degreeMap, mRangeValueComp);
                localFabbyMvPart.translateXMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("translateX");
                if (localObject1 != null)
                {
                  localObject7 = ((org.json.JSONObject)localObject1).keys();
                  while (((Iterator)localObject7).hasNext())
                  {
                    localObject6 = (String)((Iterator)localObject7).next();
                    localFabbyMvPart.translateXMap.add(Pair.create(Float.valueOf((String)localObject6), Double.valueOf(((org.json.JSONObject)localObject1).optDouble((String)localObject6, 0.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.translateXMap, mRangeValueComp);
                localFabbyMvPart.translateYMap.clear();
                localObject7 = ((org.json.JSONObject)localObject2).optJSONObject("translateY");
                if (localObject7 != null)
                {
                  localObject6 = ((org.json.JSONObject)localObject7).keys();
                  while (((Iterator)localObject6).hasNext())
                  {
                    localObject1 = (String)((Iterator)localObject6).next();
                    localFabbyMvPart.translateYMap.add(Pair.create(Float.valueOf((String)localObject1), Double.valueOf(((org.json.JSONObject)localObject7).optDouble((String)localObject1, 0.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.translateYMap, mRangeValueComp);
                localFabbyMvPart.anchorXMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("anchorX");
                if (localObject1 != null)
                {
                  localObject6 = ((org.json.JSONObject)localObject1).keys();
                  while (((Iterator)localObject6).hasNext())
                  {
                    localObject7 = (String)((Iterator)localObject6).next();
                    localFabbyMvPart.anchorXMap.add(Pair.create(Float.valueOf((String)localObject7), Double.valueOf(((org.json.JSONObject)localObject1).optDouble((String)localObject7, 0.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.anchorXMap, mRangeValueComp);
                localFabbyMvPart.anchorYMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("anchorY");
                if (localObject1 != null)
                {
                  localObject7 = ((org.json.JSONObject)localObject1).keys();
                  while (((Iterator)localObject7).hasNext())
                  {
                    localObject6 = (String)((Iterator)localObject7).next();
                    localFabbyMvPart.anchorYMap.add(Pair.create(Float.valueOf((String)localObject6), Double.valueOf(((org.json.JSONObject)localObject1).optDouble((String)localObject6, 0.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.anchorYMap, mRangeValueComp);
                localFabbyMvPart.alphaMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("alpha");
                if (localObject1 != null)
                {
                  localObject6 = ((org.json.JSONObject)localObject1).keys();
                  while (((Iterator)localObject6).hasNext())
                  {
                    localObject7 = (String)((Iterator)localObject6).next();
                    localFabbyMvPart.alphaMap.add(Pair.create(Float.valueOf((String)localObject7), Double.valueOf(((org.json.JSONObject)localObject1).optDouble((String)localObject7, 1.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.alphaMap, mRangeValueComp);
                localFabbyMvPart.blurRadiusMap.clear();
                localObject7 = ((org.json.JSONObject)localObject2).optJSONObject("blurRadius");
                if (localObject7 != null)
                {
                  localObject6 = ((org.json.JSONObject)localObject7).keys();
                  while (((Iterator)localObject6).hasNext())
                  {
                    localObject1 = (String)((Iterator)localObject6).next();
                    localFabbyMvPart.blurRadiusMap.add(Pair.create(Float.valueOf((String)localObject1), Double.valueOf(((org.json.JSONObject)localObject7).optDouble((String)localObject1, 0.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.blurRadiusMap, mRangeValueComp);
                localFabbyMvPart.blurDirectionMap.clear();
                localObject6 = ((org.json.JSONObject)localObject2).optJSONObject("blurDirection");
                if (localObject6 != null)
                {
                  localObject7 = ((org.json.JSONObject)localObject6).keys();
                  while (((Iterator)localObject7).hasNext())
                  {
                    localObject1 = (String)((Iterator)localObject7).next();
                    localFabbyMvPart.blurDirectionMap.add(Pair.create(Float.valueOf((String)localObject1), Double.valueOf(((org.json.JSONObject)localObject6).optDouble((String)localObject1, 0.0D))));
                  }
                }
                Collections.sort(localFabbyMvPart.blurDirectionMap, mRangeValueComp);
                localFabbyMvPart.gridTypeMap.clear();
                localObject7 = ((org.json.JSONObject)localObject2).optJSONObject("gridType");
                if (localObject7 != null)
                {
                  localObject1 = ((org.json.JSONObject)localObject7).keys();
                  while (((Iterator)localObject1).hasNext())
                  {
                    localObject6 = (String)((Iterator)localObject1).next();
                    localFabbyMvPart.gridTypeMap.add(Pair.create(Float.valueOf((String)localObject6), Integer.valueOf(((org.json.JSONObject)localObject7).optInt((String)localObject6, 0))));
                  }
                }
                Collections.sort(localFabbyMvPart.gridTypeMap, mDivideValueComp);
                localFabbyMvPart.gridSettingMap.clear();
                localObject6 = ((org.json.JSONObject)localObject2).optJSONObject("gridSettingFile");
                if (localObject6 != null)
                {
                  localObject1 = ((org.json.JSONObject)localObject6).keys();
                  while (((Iterator)localObject1).hasNext())
                  {
                    localObject7 = (String)((Iterator)localObject1).next();
                    localObject9 = ((org.json.JSONObject)localObject6).optString((String)localObject7);
                    if (!TextUtils.isEmpty((CharSequence)localObject9))
                    {
                      localObject8 = parseVideoMaterialFileAsJSONObject(paramString, (String)localObject9, true, paramDecryptListener);
                      if (localObject8 != null)
                      {
                        localObject10 = new GridSettingModel();
                        localObject9 = new Rect(0, 0, 720, 1280);
                        localObject13 = ((org.json.JSONObject)localObject8).optJSONObject("canvasSize");
                        if (localObject13 != null)
                        {
                          ((Rect)localObject9).width = ((int)((org.json.JSONObject)localObject13).optDouble("width", 720.0D));
                          ((Rect)localObject9).height = ((int)((org.json.JSONObject)localObject13).optDouble("height", 1280.0D));
                        }
                        localObject11 = ((org.json.JSONObject)localObject8).optJSONArray("canvasRectList");
                        if ((localObject11 != null) && (((JSONArray)localObject11).length() > 0))
                        {
                          for (j = 0; j < ((JSONArray)localObject11).length(); j++)
                          {
                            localObject12 = new GridModel();
                            localObject13 = new Rect(0, 0, 720, 1280);
                            localObject8 = ((JSONArray)localObject11).optJSONObject(j);
                            if (localObject8 != null)
                            {
                              ((Rect)localObject13).x = ((int)((org.json.JSONObject)localObject8).optDouble("left", 0.0D));
                              ((Rect)localObject13).y = ((int)((org.json.JSONObject)localObject8).optDouble("top", 0.0D));
                              ((Rect)localObject13).width = ((int)((org.json.JSONObject)localObject8).optDouble("width", 720.0D));
                              ((Rect)localObject13).height = ((int)((org.json.JSONObject)localObject8).optDouble("height", 1280.0D));
                              ((GridModel)localObject12).renderId = ((org.json.JSONObject)localObject8).optInt("renderId", 0);
                              ((GridModel)localObject12).zIndex = ((org.json.JSONObject)localObject8).optInt("zIndex", 0);
                              ((GridModel)localObject12).aspectMode = ((org.json.JSONObject)localObject8).optInt("aspectMode", 0);
                              ((GridModel)localObject12).positionMode = ((org.json.JSONObject)localObject8).optInt("positionMode", 0);
                              ((GridModel)localObject12).transformType = ((org.json.JSONObject)localObject8).optInt("transformType", 0);
                            }
                            ((GridModel)localObject12).canvasRect = ((Rect)localObject13);
                            ((GridSettingModel)localObject10).canvasRectList.add(localObject12);
                          }
                          Collections.sort(((GridSettingModel)localObject10).canvasRectList, mGridModelComparator);
                        }
                        ((GridSettingModel)localObject10).canvasRect = ((Rect)localObject9);
                        localFabbyMvPart.gridSettingMap.add(Pair.create(Float.valueOf((String)localObject7), localObject10));
                      }
                    }
                  }
                }
                Collections.sort(localFabbyMvPart.gridSettingMap, mDivideValueCompForObject);
                localFabbyMvPart.gridModeMap.clear();
                localObject6 = ((org.json.JSONObject)localObject2).optJSONObject("gridMode");
                if (localObject6 != null)
                {
                  localObject7 = ((org.json.JSONObject)localObject6).keys();
                  while (((Iterator)localObject7).hasNext())
                  {
                    localObject1 = (String)((Iterator)localObject7).next();
                    localFabbyMvPart.gridModeMap.add(Pair.create(Float.valueOf((String)localObject1), Integer.valueOf(((org.json.JSONObject)localObject6).optInt((String)localObject1, 0))));
                  }
                }
                Collections.sort(localFabbyMvPart.gridModeMap, mDivideValueComp);
                localFabbyMvPart.gridOrderMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("gridOrder");
                if (localObject1 != null)
                {
                  localObject2 = ((org.json.JSONObject)localObject1).keys();
                  while (((Iterator)localObject2).hasNext())
                  {
                    localObject7 = (String)((Iterator)localObject2).next();
                    localFabbyMvPart.gridOrderMap.add(Pair.create(Float.valueOf((String)localObject7), Integer.valueOf(((org.json.JSONObject)localObject1).optInt((String)localObject7, 0))));
                  }
                }
                Collections.sort(localFabbyMvPart.gridOrderMap, mDivideValueComp);
              }
              localObject6 = ((org.json.JSONObject)localObject5).optJSONObject("finishTransition");
              int k;
              if (localObject6 != null)
              {
                localObject7 = new StickerItem();
                localObject2 = ((org.json.JSONObject)localObject6).optString("maskVideoFile");
                localObject1 = ((org.json.JSONObject)localObject6).optString("maskImageName");
                j = ((org.json.JSONObject)localObject6).optInt("transitionFunction", 0);
                if ((TextUtils.isEmpty((CharSequence)localObject2)) && (TextUtils.isEmpty((CharSequence)localObject1)))
                  break label3591;
                if (TextUtils.isEmpty((CharSequence)localObject2))
                  break label3516;
                k = ((String)localObject2).lastIndexOf("/");
                ((StickerItem)localObject7).id = ((String)localObject2).substring(k + 1, ((String)localObject2).length());
                ((StickerItem)localObject7).subFolder = ((String)localObject2).substring(0, k);
              }
              while (true)
              {
                ((StickerItem)localObject7).frames = ((org.json.JSONObject)localObject6).optInt("maskImageCount", 1);
                ((StickerItem)localObject7).frameDuration = (((org.json.JSONObject)localObject6).optDouble("maskImageDuration", 0.0D) / ((StickerItem)localObject7).frames * 1000.0D);
                ((StickerItem)localObject7).triggerType = ((org.json.JSONObject)localObject6).optInt("triggerType", 0);
                if ((((StickerItem)localObject7).triggerType == 1) && (paramVideoMaterial.getItemList() != null) && (paramVideoMaterial.getItemList().size() != 0))
                  ((StickerItem)localObject7).triggerType = ((StickerItem)paramVideoMaterial.getItemList().get(paramVideoMaterial.getItemList().size() - 1)).triggerType;
                localFabbyMvPart.transitionItem = ((StickerItem)localObject7);
                localFabbyMvPart.transitionDuration = (()(((org.json.JSONObject)localObject6).optDouble("duration", 0.0D) * 1000.0D));
                localFabbyMvPart.transitionEase = ((org.json.JSONObject)localObject6).optInt("easeCurve", 0);
                localFabbyMvPart.transitionMaskType = ((org.json.JSONObject)localObject6).optInt("maskType", 1);
                localFabbyMvPart.transitionFunction = j;
                localObject2 = ((org.json.JSONObject)localObject5).optJSONObject("filterEffect");
                if (localObject2 == null)
                  break label3621;
                localFabbyMvPart.filterType = ((org.json.JSONObject)localObject2).optInt("type", 0);
                localFabbyMvPart.filterId = ((org.json.JSONObject)localObject2).optString("filter");
                localFabbyMvPart.lutFile = ((org.json.JSONObject)localObject2).optString("lutFile");
                localFabbyMvPart.filterParamMap.clear();
                localObject1 = ((org.json.JSONObject)localObject2).optJSONObject("param");
                if (localObject1 == null)
                  break label3621;
                localObject2 = ((org.json.JSONObject)localObject1).keys();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject5 = (String)((Iterator)localObject2).next();
                  localFabbyMvPart.filterParamMap.add(Pair.create(Float.valueOf((String)localObject5), Integer.valueOf(((org.json.JSONObject)localObject1).optInt((String)localObject5, 0))));
                }
                label3516: localObject2 = localObject1;
                if (((String)localObject1).endsWith("_"))
                  localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
                k = ((String)localObject2).lastIndexOf("/");
                ((StickerItem)localObject7).id = ((String)localObject2).substring(k + 1, ((String)localObject2).length());
                ((StickerItem)localObject7).subFolder = ((String)localObject2).substring(0, k);
                continue;
                label3591: ((StickerItem)localObject7).id = "";
                ((StickerItem)localObject7).subFolder = "";
              }
              Collections.sort(localFabbyMvPart.filterParamMap, mDivideValueComp);
              label3621: localFabbyMvPart.duration = (()(1000.0D * d));
              localFabbyMvPart.partIndex = i;
              ((List)localObject4).add(localFabbyMvPart);
            }
          }
          localObject2 = ((org.json.JSONObject)localObject3).optString("bgmAudio", "");
          if (!TextUtils.isEmpty((CharSequence)localObject2))
            paramVideoMaterial.setHasAudio(true);
          paramVideoMaterial.setFabbyParts(new FabbyParts((List)localObject4, (String)localObject2));
          localObject2 = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.MULTI_VIEWER.value);
          localObject3 = new ArrayList();
          if (localObject2 != null)
          {
            i = 0;
            if (i < ((JSONArray)localObject2).length())
            {
              localObject1 = new MultiViewerItem();
              localObject4 = ((JSONArray)localObject2).optJSONObject(i);
              if (localObject4 != null)
              {
                ((MultiViewerItem)localObject1).videoMaterial = parseVideoMaterial(paramString, ((org.json.JSONObject)localObject4).optString("importMaterial"), true, paramDecryptListener);
                if (VideoMaterialUtil.isWatermarkMaterial(((MultiViewerItem)localObject1).videoMaterial))
                  LogicDataManager.getInstance().init(((MultiViewerItem)localObject1).videoMaterial);
                ((MultiViewerItem)localObject1).renderId = ((org.json.JSONObject)localObject4).optInt("renderId");
                paramJSONObject = ((org.json.JSONObject)localObject4).optJSONArray("activeParts");
                if (paramJSONObject != null)
                  for (j = 0; j < paramJSONObject.length(); j++)
                    ((MultiViewerItem)localObject1).activeParts.add(Integer.valueOf(paramJSONObject.optInt(j)));
                if (((org.json.JSONObject)localObject4).optInt("needOriginFrame", 1) != 1)
                  break label3903;
              }
              label3903: for (boolean bool = true; ; bool = false)
              {
                ((MultiViewerItem)localObject1).needOriginFrame = bool;
                ((List)localObject3).add(localObject1);
                i++;
                break;
              }
            }
          }
          paramVideoMaterial.setMultiViewerItemList((List)localObject3);
          AppMethodBeat.o(84268);
        }
      }
    }
  }

  private static void parseFaceCropParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    int i = 0;
    AppMethodBeat.i(84251);
    try
    {
      Object localObject1 = paramJSONObject.optJSONObject(VideoMaterialUtil.FIELD.FACE_CROP.value);
      if (localObject1 != null)
      {
        paramJSONObject = new com/tencent/ttpic/model/FaceCropItem;
        paramJSONObject.<init>();
        paramJSONObject.frameDuration = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.FACE_CROP_ITEM.FRAME_DURATION.value);
        paramJSONObject.frames = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.FACE_CROP_ITEM.FRAMES.value);
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        paramJSONObject.frameList = ((List)localObject2);
        localObject1 = ((org.json.JSONObject)localObject1).optJSONArray(VideoMaterialUtil.FACE_CROP_ITEM.FRAME_LIST.value);
        if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
          while (i < ((JSONArray)localObject1).length())
          {
            org.json.JSONObject localJSONObject = ((JSONArray)localObject1).getJSONObject(i);
            localObject2 = new com/tencent/ttpic/model/FaceCropItem$CropFrame;
            ((FaceCropItem.CropFrame)localObject2).<init>();
            ((FaceCropItem.CropFrame)localObject2).faceAngle = localJSONObject.optDouble(VideoMaterialUtil.FACE_CROP_ITEM_FRAME.FACE_ANGLE.value);
            ((FaceCropItem.CropFrame)localObject2).faceWidth = localJSONObject.optDouble(VideoMaterialUtil.FACE_CROP_ITEM_FRAME.FACE_WIDTH.value);
            ((FaceCropItem.CropFrame)localObject2).index = localJSONObject.optInt(VideoMaterialUtil.FACE_CROP_ITEM_FRAME.INDEX.value);
            JSONArray localJSONArray = localJSONObject.optJSONArray(VideoMaterialUtil.FACE_CROP_ITEM_FRAME.NOSE_POINT.value);
            if ((localJSONArray != null) && (localJSONArray.length() > 0))
            {
              ((FaceCropItem.CropFrame)localObject2).noseX = localJSONArray.getDouble(0);
              ((FaceCropItem.CropFrame)localObject2).noseY = localJSONArray.getDouble(1);
            }
            localJSONArray = localJSONObject.optJSONArray(VideoMaterialUtil.FACE_CROP_ITEM_FRAME.SIZE.value);
            if ((localJSONArray != null) && (localJSONArray.length() > 0))
            {
              ((FaceCropItem.CropFrame)localObject2).width = localJSONArray.getDouble(0);
              ((FaceCropItem.CropFrame)localObject2).height = localJSONArray.getDouble(1);
            }
            paramJSONObject.frameList.add(localObject2);
            i++;
          }
        paramVideoMaterial.setFaceCropItem(paramJSONObject);
      }
      AppMethodBeat.o(84251);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        LogUtils.e(TAG, paramJSONObject);
        AppMethodBeat.o(84251);
      }
    }
  }

  private static void parseFaceExpressionParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial, boolean[] paramArrayOfBoolean)
  {
    AppMethodBeat.i(84252);
    org.json.JSONObject localJSONObject = paramJSONObject.optJSONObject(VideoMaterialUtil.FIELD.FACE_EXPRESSION.value);
    if (localJSONObject != null)
    {
      paramJSONObject = new FaceExpression();
      paramJSONObject.id = localJSONObject.optString(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.ID.value);
      paramJSONObject.videoID = localJSONObject.optString(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.VIDEO_ID.value);
      paramJSONObject.frameDuration = localJSONObject.optDouble(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.FRAME_DURATION.value);
      paramJSONObject.frames = localJSONObject.optInt(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.FRAMES.value);
      paramJSONObject.audioID = localJSONObject.optString(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.AUDIO_ID.value);
      int i;
      JSONArray localJSONArray1;
      int j;
      Object localObject;
      if (!TextUtils.isEmpty(paramJSONObject.audioID))
      {
        i = 1;
        paramArrayOfBoolean[0] = i;
        paramArrayOfBoolean = localJSONObject.optJSONArray(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.CANVAS_SIZE.value);
        if ((paramArrayOfBoolean != null) && (paramArrayOfBoolean.length() == 2))
        {
          paramJSONObject.canvasSize = new SizeI();
          paramJSONObject.canvasSize.width = paramArrayOfBoolean.optInt(0);
          paramJSONObject.canvasSize.height = paramArrayOfBoolean.optInt(1);
        }
        paramJSONObject.canvasResizeMode = localJSONObject.optInt(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.CANVAS_RESIZE_MODE.value);
        paramJSONObject.scoreImageID = localJSONObject.optString(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.SCORE_IMAGE_ID.value);
        paramJSONObject.expressionNumber = localJSONObject.optInt(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.EXPRESSION_NUMBER.value);
        localJSONArray1 = localJSONObject.optJSONArray(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.EXPRESSION_LIST.value);
        if (localJSONArray1 != null)
          paramJSONObject.expressionList = new ArrayList();
      }
      else
      {
        for (j = 0; ; j++)
        {
          if (j >= localJSONArray1.length())
            break label647;
          paramArrayOfBoolean = new ExpressionItem();
          localObject = localJSONArray1.optJSONObject(j);
          if (localObject != null)
          {
            paramArrayOfBoolean.expressionTime = ((org.json.JSONObject)localObject).optInt(VideoMaterialUtil.EXPRESSION_ITEM_FILED.EXPRESSION_TIME.value);
            paramArrayOfBoolean.expressionID = ((org.json.JSONObject)localObject).optString(VideoMaterialUtil.EXPRESSION_ITEM_FILED.EXPRESSION_ID.value);
            JSONArray localJSONArray2 = ((org.json.JSONObject)localObject).optJSONArray(VideoMaterialUtil.EXPRESSION_ITEM_FILED.EXPRESSION_FEAT_SIZE.value);
            if ((localJSONArray2 != null) && (localJSONArray2.length() == 2))
            {
              paramArrayOfBoolean.expressionFeatSize = new SizeI();
              paramArrayOfBoolean.expressionFeatSize.width = localJSONArray2.optInt(0);
              paramArrayOfBoolean.expressionFeatSize.height = localJSONArray2.optInt(1);
            }
            localJSONArray2 = ((org.json.JSONObject)localObject).optJSONArray(VideoMaterialUtil.EXPRESSION_ITEM_FILED.EXPRESSION_FEAT.value);
            int k;
            if (localJSONArray2 != null)
            {
              paramArrayOfBoolean.expressionFeat = new ArrayList();
              k = 0;
              while (true)
                if (k < localJSONArray2.length() / 2)
                {
                  paramArrayOfBoolean.expressionFeat.add(new PointF(localJSONArray2.optInt(k * 2), localJSONArray2.optInt(k * 2 + 1)));
                  k++;
                  continue;
                  i = 0;
                  break;
                }
            }
            localJSONArray2 = ((org.json.JSONObject)localObject).optJSONArray(VideoMaterialUtil.EXPRESSION_ITEM_FILED.EXPRESSION_ANGLE.value);
            if ((localJSONArray2 != null) && (localJSONArray2.length() == 3))
            {
              paramArrayOfBoolean.expressionAngle = new float[3];
              paramArrayOfBoolean.expressionAngle[0] = ((float)localJSONArray2.optDouble(0));
              paramArrayOfBoolean.expressionAngle[1] = ((float)localJSONArray2.optDouble(1));
              paramArrayOfBoolean.expressionAngle[2] = ((float)localJSONArray2.optDouble(2));
            }
            paramArrayOfBoolean.scoreImageID = ((org.json.JSONObject)localObject).optString(VideoMaterialUtil.EXPRESSION_ITEM_FILED.SCORE_IMAGE_ID.value);
            localObject = ((org.json.JSONObject)localObject).optJSONArray(VideoMaterialUtil.EXPRESSION_ITEM_FILED.EXPRESSION_WEIGHT.value);
            if ((localObject != null) && (((JSONArray)localObject).length() == 7))
            {
              paramArrayOfBoolean.expressionWeight = new double[7];
              k = 0;
            }
            while (k < 7)
            {
              paramArrayOfBoolean.expressionWeight[k] = ((JSONArray)localObject).optDouble(k);
              k++;
              continue;
              paramArrayOfBoolean.expressionWeight = ActUtil.WEIGHT;
            }
            paramJSONObject.expressionList.add(paramArrayOfBoolean);
          }
        }
      }
      label647: paramArrayOfBoolean = localJSONObject.optJSONArray(VideoMaterialUtil.FACE_EXPRESSION_ITEM_FILED.CANVAS_ITEM_LIST.value);
      if (paramArrayOfBoolean != null)
      {
        paramJSONObject.canvasItemList = new ArrayList();
        for (j = 0; j < paramArrayOfBoolean.length(); j++)
        {
          localJSONObject = paramArrayOfBoolean.optJSONObject(j);
          if (localJSONObject != null)
          {
            localObject = new CanvasItem();
            ((CanvasItem)localObject).type = localJSONObject.optInt(VideoMaterialUtil.CANVAS_ITEM_FILED.TYPE.value);
            ((CanvasItem)localObject).index = localJSONObject.optInt(VideoMaterialUtil.CANVAS_ITEM_FILED.INDEX.value);
            ((CanvasItem)localObject).startTime = localJSONObject.optInt(VideoMaterialUtil.CANVAS_ITEM_FILED.START_TIME.value);
            ((CanvasItem)localObject).endTime = localJSONObject.optInt(VideoMaterialUtil.CANVAS_ITEM_FILED.END_TIME.value);
            ((CanvasItem)localObject).zIndex = localJSONObject.optInt(VideoMaterialUtil.CANVAS_ITEM_FILED.Z_INDEX.value);
            localJSONArray1 = localJSONObject.optJSONArray(VideoMaterialUtil.CANVAS_ITEM_FILED.ITEM_RECT.value);
            if ((localJSONArray1 != null) && (localJSONArray1.length() == 4))
            {
              ((CanvasItem)localObject).itemRect = new Rect();
              ((CanvasItem)localObject).itemRect.x = localJSONArray1.optInt(0);
              ((CanvasItem)localObject).itemRect.y = localJSONArray1.optInt(1);
              ((CanvasItem)localObject).itemRect.width = localJSONArray1.optInt(2);
              ((CanvasItem)localObject).itemRect.height = localJSONArray1.optInt(3);
            }
            ((CanvasItem)localObject).itemResizeMode = localJSONObject.optInt(VideoMaterialUtil.CANVAS_ITEM_FILED.ITEM_RESIZE_MODE.value);
            paramJSONObject.canvasItemList.add(localObject);
          }
        }
      }
      paramVideoMaterial.setFaceExpression(paramJSONObject);
    }
    AppMethodBeat.o(84252);
  }

  private static FaceFeatureItem parseFaceFeatureItem(String paramString, org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial, DecryptListener paramDecryptListener)
  {
    Object localObject1 = null;
    AppMethodBeat.i(84247);
    if (paramJSONObject == null)
    {
      AppMethodBeat.o(84247);
      paramString = (String)localObject1;
      return paramString;
    }
    FaceFeatureItem localFaceFeatureItem = new FaceFeatureItem();
    localFaceFeatureItem.setId(paramJSONObject.optString("id"));
    localFaceFeatureItem.setMaskAnchorPoint(paramJSONObject.optInt("maskAnchorPoint", -1));
    if (paramString.endsWith("/"));
    while (true)
    {
      localFaceFeatureItem.setDataPath(paramString);
      Object localObject2 = paramJSONObject.optString("distortionFile");
      int i;
      if (!TextUtils.isEmpty((CharSequence)localObject2))
      {
        i = ((String)localObject2).lastIndexOf(".");
        localObject1 = localObject2;
        if (i >= 0)
          localObject1 = ((String)localObject2).substring(0, i);
        localObject1 = parseVideoMaterialFileAsJSONObject(paramString, (String)localObject1, true, paramDecryptListener);
        if (localObject1 != null)
        {
          localObject1 = ((org.json.JSONObject)localObject1).optJSONArray("distortionList");
          if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
          {
            localObject1 = parseDistortionItemListParams((JSONArray)localObject1);
            if (localObject1 != null)
              localFaceFeatureItem.setDistortionItemList((List)localObject1);
          }
        }
      }
      localObject2 = paramJSONObject.optString("faceOffFile");
      if (!TextUtils.isEmpty((CharSequence)localObject2))
      {
        i = ((String)localObject2).lastIndexOf(".");
        localObject1 = localObject2;
        if (i >= 0)
          localObject1 = ((String)localObject2).substring(0, i);
        localObject1 = parseVideoMaterialFileAsJSONObject(paramString, (String)localObject1, true, paramDecryptListener);
        if (localObject1 != null)
        {
          localObject2 = new JSONArray();
          ((JSONArray)localObject2).put(localObject1);
          localObject1 = parseFaceOffItemListParams((JSONArray)localObject2);
          if (localObject1 != null)
            localFaceFeatureItem.setFaceOffItemList((List)localObject1);
        }
      }
      paramJSONObject = paramJSONObject.optJSONArray("itemList");
      if (paramJSONObject != null)
      {
        paramString = parseItemListParams(paramString, paramJSONObject, VideoFilterFactory.STICKER_TYPE.FACE_FEATURE.type, paramVideoMaterial, paramVideoMaterial.getBlendMode(), null, null, paramDecryptListener);
        if (paramString != null)
        {
          Collections.sort(paramString, new VideoTemplateParser.2());
          localFaceFeatureItem.setStickerItems(paramString);
        }
      }
      AppMethodBeat.o(84247);
      paramString = localFaceFeatureItem;
      break;
      paramString = paramString + "/" + localFaceFeatureItem.getId();
    }
  }

  private static void parseFaceFeatureItemListParams(String paramString, org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84246);
    paramJSONObject = paramJSONObject.optJSONArray("faceFeatureItemList");
    if (paramJSONObject == null)
      AppMethodBeat.o(84246);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramJSONObject.length(); i++)
      {
        Object localObject = paramJSONObject.optJSONObject(i);
        if (localObject != null)
        {
          localObject = parseFaceFeatureItem(paramString, (org.json.JSONObject)localObject, paramVideoMaterial, paramDecryptListener);
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
      paramVideoMaterial.setFaceFeatureItemList(localArrayList);
      AppMethodBeat.o(84246);
    }
  }

  private static void parseFaceImageLayerParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    int i = 0;
    AppMethodBeat.i(84254);
    org.json.JSONObject localJSONObject1 = paramJSONObject.optJSONObject("faceAverage");
    if (localJSONObject1 != null)
    {
      paramJSONObject = new FaceImageLayer();
      paramJSONObject.width = localJSONObject1.optDouble("width");
      paramJSONObject.height = localJSONObject1.optDouble("height");
      paramJSONObject.x = localJSONObject1.optDouble("x");
      paramJSONObject.y = localJSONObject1.optDouble("y");
      paramJSONObject.type = localJSONObject1.optInt("type");
      paramJSONObject.imagePath = localJSONObject1.optString("image");
      Object localObject1 = localJSONObject1.optJSONArray("imageFacePoint");
      int j;
      if (localObject1 != null)
      {
        localObject2 = new ArrayList();
        for (j = 0; j < ((JSONArray)localObject1).length(); j++)
          ((List)localObject2).add(Double.valueOf(((JSONArray)localObject1).optDouble(j)));
        paramJSONObject.imageFacePoint = ((List)localObject2);
      }
      localObject1 = localJSONObject1.optJSONArray("imageFaceColor");
      if (localObject1 != null)
      {
        localObject2 = new ArrayList();
        for (j = 0; j < ((JSONArray)localObject1).length(); j++)
          ((List)localObject2).add(Double.valueOf(((JSONArray)localObject1).optDouble(j)));
        paramJSONObject.imageFaceColor = ((List)localObject2);
      }
      Object localObject2 = localJSONObject1.optJSONArray("imageFaceColor2");
      if (localObject2 != null)
      {
        localObject1 = new ArrayList();
        for (j = 0; j < ((JSONArray)localObject2).length(); j++)
          ((List)localObject1).add(Double.valueOf(((JSONArray)localObject2).optDouble(j)));
        paramJSONObject.imageFaceColor2 = ((List)localObject1);
      }
      localObject2 = localJSONObject1.optJSONArray("faceColorRange");
      if (localObject2 != null)
      {
        localObject1 = new ArrayList();
        for (j = 0; j < ((JSONArray)localObject2).length(); j++)
          ((List)localObject1).add(Double.valueOf(((JSONArray)localObject2).optDouble(j)));
        paramJSONObject.faceColorRange = ((List)localObject1);
      }
      paramJSONObject.blendAlpha = localJSONObject1.optDouble("blendAlpha", 0.5D);
      paramJSONObject.distortionAlpha = localJSONObject1.optDouble("distortionAlpha", 0.5D);
      localObject2 = localJSONObject1.optJSONArray("distortionList");
      if (localObject2 != null)
      {
        localObject1 = new ArrayList();
        for (j = 0; j < ((JSONArray)localObject2).length(); j++)
        {
          Object localObject3 = ((JSONArray)localObject2).opt(j);
          if ((localObject3 instanceof org.json.JSONObject))
          {
            org.json.JSONObject localJSONObject2 = (org.json.JSONObject)localObject3;
            localObject3 = new DistortionItem();
            ((DistortionItem)localObject3).position = localJSONObject2.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.POSITION.value);
            ((DistortionItem)localObject3).distortion = localJSONObject2.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.DISTORTION.value);
            ((DistortionItem)localObject3).direction = localJSONObject2.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.DIRECTION.value);
            ((DistortionItem)localObject3).radius = ((float)localJSONObject2.optDouble(VideoMaterialUtil.DISTORTION_ITEM_FILED.RADIUS.value));
            ((DistortionItem)localObject3).strength = ((float)localJSONObject2.optDouble(VideoMaterialUtil.DISTORTION_ITEM_FILED.STRENGH.value));
            ((DistortionItem)localObject3).x = localJSONObject2.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.X.value, 0);
            ((DistortionItem)localObject3).y = localJSONObject2.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.Y.value, 0);
            ((List)localObject1).add(localObject3);
          }
        }
        paramJSONObject.distortionList = ((List)localObject1);
      }
      paramJSONObject.faceMaskImagePath = localJSONObject1.optString("faceMaskImage", null);
      localObject1 = localJSONObject1.optJSONArray("faceMaskFacePoint");
      if (localObject1 != null)
      {
        localObject2 = new ArrayList();
        for (j = 0; j < ((JSONArray)localObject1).length(); j++)
          ((List)localObject2).add(Double.valueOf(((JSONArray)localObject1).optDouble(j)));
        paramJSONObject.faceMaskFacePoint = ((List)localObject2);
      }
      localObject2 = localJSONObject1.optJSONArray("faceTriangle");
      if (localObject2 != null)
      {
        localObject1 = new ArrayList();
        for (j = i; j < ((JSONArray)localObject2).length(); j++)
          ((List)localObject1).add(Integer.valueOf(((JSONArray)localObject2).optInt(j)));
        paramJSONObject.faceTriangle = ((List)localObject1);
      }
      paramJSONObject.antiWrinkle = localJSONObject1.optDouble("antiWrinkle");
      paramVideoMaterial.setFaceImageLayer(paramJSONObject);
    }
    AppMethodBeat.o(84254);
  }

  private static void parseFaceMeshItemListParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84255);
    JSONArray localJSONArray = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.FACE_MESH_ITEM_LIST.value);
    if (localJSONArray != null)
    {
      paramJSONObject = new ArrayList();
      int i = 0;
      if (i < localJSONArray.length())
      {
        org.json.JSONObject localJSONObject1 = localJSONArray.optJSONObject(i);
        FaceMeshItem localFaceMeshItem;
        org.json.JSONObject localJSONObject2;
        if (localJSONObject1 != null)
        {
          localFaceMeshItem = new FaceMeshItem();
          localFaceMeshItem.id = localJSONObject1.optString(VideoMaterialUtil.FACE_MESH_ITEM_LIST.ID.value);
          localFaceMeshItem.personID = localJSONObject1.optInt(VideoMaterialUtil.FACE_MESH_ITEM_LIST.PERSON_ID.value, -1);
          localFaceMeshItem.frames = localJSONObject1.optInt(VideoMaterialUtil.FACE_MESH_ITEM_LIST.FRAMES.value);
          localJSONObject2 = localJSONObject1.optJSONObject(VideoMaterialUtil.FIELD.CHARM_RANGE.value);
          if (localJSONObject2 != null)
          {
            localFaceMeshItem.charmRange = new CharmRange();
            localFaceMeshItem.charmRange.min = localJSONObject2.optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MIN.value);
            localFaceMeshItem.charmRange.max = localJSONObject2.optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MAX.value);
          }
          localFaceMeshItem.frameType = localJSONObject1.optInt("frameType");
          localFaceMeshItem.frameDuration = localJSONObject1.optDouble("frameDuration");
          localFaceMeshItem.triggerType = Math.max(localJSONObject1.optInt("triggerType"), 2);
          if (VideoMaterialUtil.isActionTriggerType(localFaceMeshItem.triggerType))
            paramVideoMaterial.setTriggerType(localFaceMeshItem.triggerType);
          if (localJSONObject1.optInt("alwaysTriggered") != 1)
            break label348;
        }
        label348: for (boolean bool = true; ; bool = false)
        {
          localFaceMeshItem.alwaysTriggered = bool;
          localFaceMeshItem.featureStatType = localJSONObject1.optInt("featureStatType");
          localJSONObject2 = localJSONObject1.optJSONObject("featureStatValueRange");
          if (localJSONObject2 != null)
          {
            localFaceMeshItem.featureStatValueRange = new StickerItem.ValueRange();
            localFaceMeshItem.featureStatValueRange.min = localJSONObject2.optDouble("min");
            localFaceMeshItem.featureStatValueRange.max = localJSONObject2.optDouble("max");
          }
          paramJSONObject.add(localFaceMeshItem);
          i++;
          break;
        }
      }
      paramVideoMaterial.setFaceMeshItemList(paramJSONObject);
    }
    AppMethodBeat.o(84255);
  }

  private static void parseFaceMoveItemListParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84260);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      JSONArray localJSONArray = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.FACE_MOVE_LIST.value);
      if (localJSONArray != null)
      {
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          FaceMoveItem localFaceMoveItem = new com/tencent/ttpic/model/FaceMoveItem;
          localFaceMoveItem.<init>();
          paramJSONObject = localJSONArray.getJSONObject(i);
          localFaceMoveItem.position = paramJSONObject.optInt(VideoMaterialUtil.FACE_MOVE_ITEM_FILED.POSITION.value);
          localFaceMoveItem.pos1 = paramJSONObject.optInt(VideoMaterialUtil.FACE_MOVE_ITEM_FILED.POS1.value);
          localFaceMoveItem.pos2 = paramJSONObject.optInt(VideoMaterialUtil.FACE_MOVE_ITEM_FILED.POS2.value);
          localFaceMoveItem.ratio1 = ((float)paramJSONObject.optDouble(VideoMaterialUtil.FACE_MOVE_ITEM_FILED.RATIO1.value));
          localFaceMoveItem.ratio2 = ((float)paramJSONObject.optDouble(VideoMaterialUtil.FACE_MOVE_ITEM_FILED.RATIO2.value));
          localFaceMoveItem.dx = paramJSONObject.optInt(VideoMaterialUtil.FACE_MOVE_ITEM_FILED.X.value);
          localFaceMoveItem.dy = paramJSONObject.optInt(VideoMaterialUtil.FACE_MOVE_ITEM_FILED.Y.value);
          localArrayList.add(localFaceMoveItem);
        }
        paramVideoMaterial.setFaceMoveItemList(localArrayList);
      }
      AppMethodBeat.o(84260);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        LogUtils.e(TAG, paramJSONObject);
        AppMethodBeat.o(84260);
      }
    }
  }

  private static void parseFaceMoveTrianglesParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84259);
    try
    {
      paramJSONObject = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.FACE_MOVE_TRIANGLE.value);
      if (paramJSONObject != null)
      {
        int[] arrayOfInt = new int[paramJSONObject.length()];
        for (int i = 0; i < paramJSONObject.length(); i++)
          arrayOfInt[i] = paramJSONObject.getInt(i);
        paramVideoMaterial.setFaceMoveTriangles(arrayOfInt);
      }
      AppMethodBeat.o(84259);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        LogUtils.e(TAG, paramJSONObject);
        AppMethodBeat.o(84259);
      }
    }
  }

  private static List<FaceItem> parseFaceOffItemListParams(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(84256);
    ArrayList localArrayList1 = new ArrayList();
    if (paramJSONArray != null)
    {
      int i = 0;
      int j = 0;
      int k = -1;
      FaceItem localFaceItem;
      if (i < paramJSONArray.length())
      {
        org.json.JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
        int m = j;
        int n = k;
        boolean bool;
        if (localJSONObject != null)
        {
          localFaceItem = new FaceItem();
          localFaceItem.id = localJSONObject.optString(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.ID.value);
          localFaceItem.faceExchangeImage = localJSONObject.optString(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.FACE_EXCHANGE_IMAGE.value);
          localFaceItem.irisImage = localJSONObject.optString(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.IRIS_IMAGE.value);
          localFaceItem.blendAlpha = ((float)localJSONObject.optDouble(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.BLEND_ALPHA.value));
          localFaceItem.featureType = FaceOffUtil.getFeatureType(localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.FEATURE_TYPE.value));
          localFaceItem.grayScale = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.GRAY_SCALE.value);
          localFaceItem.blendMode = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.BLEND_MODE.value);
          localFaceItem.personID = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.PERSON_ID.value, -1);
          localFaceItem.randomGroupNum = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.RANDOM_GROUP_NUM.value);
          Object localObject = localJSONObject.optJSONArray(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.FACE_POINTS.value);
          if (localObject != null)
          {
            ArrayList localArrayList2 = new ArrayList();
            for (n = 0; n < ((JSONArray)localObject).length(); n++)
              localArrayList2.add(Float.valueOf((float)((JSONArray)localObject).optDouble(n)));
            localFaceItem.facePoints = localArrayList2;
          }
          localObject = localJSONObject.optJSONObject(VideoMaterialUtil.FIELD.CHARM_RANGE.value);
          if (localObject != null)
          {
            localFaceItem.charmRange = new CharmRange();
            localFaceItem.charmRange.min = ((org.json.JSONObject)localObject).optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MIN.value);
            localFaceItem.charmRange.max = ((org.json.JSONObject)localObject).optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MAX.value);
          }
          localFaceItem.frameType = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.FRAME_TYPE.value);
          localFaceItem.frames = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.FRAMES.value);
          localFaceItem.frameDuration = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.FRAME_DURATION.value);
          localFaceItem.width = localJSONObject.optInt("width");
          localFaceItem.height = localJSONObject.optInt("height");
          localFaceItem.triggerType = localJSONObject.optInt(VideoMaterialUtil.FACE_OFF_ITEM_FIELD.TRIGGER_TYPE.value, PTFaceAttr.PTExpression.FACE_DETECT.value);
          if (localJSONObject.optInt("alwaysTriggered", 1) != 1)
            break label658;
          bool = true;
          label462: localFaceItem.alwaysTriggered = bool;
          localFaceItem.featureStatType = localJSONObject.optInt("featureStatType");
          localObject = localJSONObject.optJSONObject("featureStatValueRange");
          if (localObject != null)
          {
            localFaceItem.featureStatValueRange = new StickerItem.ValueRange();
            localFaceItem.featureStatValueRange.min = ((org.json.JSONObject)localObject).optDouble("min");
            localFaceItem.featureStatValueRange.max = ((org.json.JSONObject)localObject).optDouble("max");
          }
          localFaceItem.activateTriggerType = localJSONObject.optInt("activateTriggerType", 0);
          localFaceItem.activateTriggerCount = localJSONObject.optInt("activateTriggerCount", 0);
          localFaceItem.activateTriggerTotalCount = localJSONObject.optInt("activateTriggerTotalCount", 0);
          localFaceItem.playCount = localJSONObject.optInt("playCount");
          localFaceItem.preTriggerType = localFaceItem.triggerType;
          localFaceItem.countTriggerType = localFaceItem.triggerType;
          if (k != -1)
            break label664;
          k = localFaceItem.triggerType;
        }
        while (true)
        {
          localArrayList1.add(localFaceItem);
          n = k;
          m = j;
          i++;
          j = m;
          k = n;
          break;
          label658: bool = false;
          break label462;
          label664: j = Math.max(j, localFaceItem.triggerType);
        }
      }
      paramJSONArray = localArrayList1.iterator();
      while (paramJSONArray.hasNext())
      {
        localFaceItem = (FaceItem)paramJSONArray.next();
        localFaceItem.preTriggerType = k;
        localFaceItem.countTriggerType = j;
      }
    }
    AppMethodBeat.o(84256);
    return localArrayList1;
  }

  private static void parseFacePointsListParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84258);
    paramJSONObject = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.FACE_POINTS_LIST.value);
    ArrayList localArrayList = new ArrayList();
    if (paramJSONObject != null)
    {
      for (int i = 0; i < paramJSONObject.length(); i++)
        localArrayList.add(Float.valueOf((float)paramJSONObject.optDouble(i)));
      paramVideoMaterial.setFacePoints(localArrayList);
    }
    AppMethodBeat.o(84258);
  }

  private static void parseFilterEffectParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84257);
    paramJSONObject = paramJSONObject.optJSONObject(VideoMaterialUtil.FIELD.FILTER_EFFECT.value);
    if (paramJSONObject != null)
    {
      VideoFilterEffect localVideoFilterEffect = new VideoFilterEffect();
      localVideoFilterEffect.type = paramJSONObject.optInt(VideoMaterialUtil.FILTER_EFFECT_FIELD.TYPE.value);
      localVideoFilterEffect.order = paramJSONObject.optInt(VideoMaterialUtil.FILTER_EFFECT_FIELD.ORDER.value);
      paramVideoMaterial.setVideoFilterEffect(localVideoFilterEffect);
    }
    AppMethodBeat.o(84257);
  }

  private static void parseGameParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    boolean bool1 = true;
    AppMethodBeat.i(84266);
    GameParams localGameParams = new GameParams();
    localGameParams.mGameName = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.GAME_NAME.value);
    localGameParams.mAnimNames = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.ANIM_NAMES.value);
    localGameParams.mAnimDefaultRotate = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.ANIM_DEFAULT_ROTATE.value);
    localGameParams.mAnimNodeNames = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.ANIM_NODE_NAMES.value);
    localGameParams.mRunningAnimName = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.RUNNING_ANIM_NAME.value);
    localGameParams.mRunningAnimDefaultRotate = paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.RUNNING_ANIM_DEFAULT_ROTATE.value);
    JSONArray localJSONArray = paramJSONObject.optJSONArray(VideoMaterialUtil.GAME_FIELD.TEXTURE_IMAGES.value);
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      localGameParams.textureImages = new String[localJSONArray.length()];
      for (int i = 0; i < localJSONArray.length(); i++)
        localGameParams.textureImages[i] = localJSONArray.optString(i);
      localGameParams.usePreload = true;
    }
    localGameParams.fov = ((float)paramJSONObject.optDouble(VideoMaterialUtil.GAME_FIELD.FOV.value, 60.0D));
    if (paramJSONObject.optInt(VideoMaterialUtil.GAME_FIELD.NOT_FLATTEN_EAR.value, 0) == 0)
    {
      bool2 = true;
      localGameParams.flattenEar = bool2;
      if (paramJSONObject.optInt(VideoMaterialUtil.GAME_FIELD.NOT_FLATTEN_NOSE.value, 0) != 0)
        break label257;
    }
    label257: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localGameParams.flattenNose = bool2;
      paramVideoMaterial.setGameParams(localGameParams);
      AppMethodBeat.o(84266);
      return;
      bool2 = false;
      break;
    }
  }

  private static void parseHeadCropItemListParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84262);
    ArrayList localArrayList;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.FACE_HEAD_CROP_ITEM_LIST.value);
      if (localObject != null)
      {
        int i = -1;
        int j = 0;
        int k = 0;
        if (k < ((JSONArray)localObject).length())
        {
          org.json.JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(k);
          paramJSONObject = new com/tencent/ttpic/model/StickerItem;
          paramJSONObject.<init>();
          paramJSONObject.id = localJSONObject.optString("id");
          paramJSONObject.subFolder = paramJSONObject.id;
          paramJSONObject.type = localJSONObject.optInt("type");
          paramJSONObject.triggerType = localJSONObject.optInt("triggerType");
          if (localJSONObject.optInt("alwaysTriggered") == 1);
          int m;
          for (boolean bool = true; ; bool = false)
          {
            paramJSONObject.alwaysTriggered = bool;
            paramJSONObject.featureStatType = localJSONObject.optInt("featureStatType");
            paramJSONObject.playCount = localJSONObject.optInt("playCount");
            if (VideoMaterialUtil.isActionTriggerType(paramJSONObject.triggerType))
              paramVideoMaterial.setTriggerType(paramJSONObject.triggerType);
            paramJSONObject.frameType = localJSONObject.optInt("frameType");
            paramJSONObject.frameDuration = localJSONObject.optDouble("frameDuration");
            paramJSONObject.frames = localJSONObject.optInt("frames");
            paramJSONObject.width = localJSONObject.optInt("width");
            paramJSONObject.height = localJSONObject.optInt("height");
            localJSONArray = localJSONObject.optJSONArray("position");
            if (localJSONArray == null)
              break;
            paramJSONObject.position = new double[localJSONArray.length()];
            for (m = 0; m < localJSONArray.length(); m++)
              paramJSONObject.position[m] = localJSONArray.getDouble(m);
          }
          paramJSONObject.position = new double[] { 0.0D, 0.0D };
          JSONArray localJSONArray = localJSONObject.optJSONArray("scalePivots");
          if (localJSONArray != null)
          {
            paramJSONObject.scalePivots = new int[localJSONArray.length()];
            for (m = 0; m < localJSONArray.length(); m++)
              paramJSONObject.scalePivots[m] = localJSONArray.getInt(m);
          }
          paramJSONObject.scaleFactor = localJSONObject.optInt("scaleFactor");
          paramJSONObject.blendMode = localJSONObject.optInt("blendMode", -1);
          if (paramJSONObject.blendMode == -1)
            paramJSONObject.blendMode = paramVideoMaterial.getBlendMode();
          paramJSONObject.support3D = localJSONObject.optInt("enable3D", 1);
          paramJSONObject.personID = localJSONObject.optInt("personID", -1);
          paramJSONObject.activateTriggerCount = localJSONObject.optInt("activateTriggerCount", 0);
          paramJSONObject.activateTriggerTotalCount = localJSONObject.optInt("activateTriggerTotalCount", 0);
          localArrayList.add(paramJSONObject);
          if (i == -1)
            i = paramJSONObject.triggerType;
          while (true)
          {
            k++;
            break;
            j = Math.max(j, paramJSONObject.triggerType);
          }
        }
        localObject = localArrayList.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramJSONObject = (StickerItem)((Iterator)localObject).next();
          paramJSONObject.preTriggerType = i;
          paramJSONObject.countTriggerType = j;
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      LogUtils.e(TAG, paramJSONObject);
      AppMethodBeat.o(84262);
    }
    while (true)
    {
      return;
      paramVideoMaterial.setHeadCropItemList(localArrayList);
      AppMethodBeat.o(84262);
    }
  }

  private static List<StickerItem> parseItemListParams(String paramString, JSONArray paramJSONArray, int paramInt1, VideoMaterial paramVideoMaterial, int paramInt2, boolean[] paramArrayOfBoolean, int[] paramArrayOfInt, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84264);
    ArrayList localArrayList;
    int i;
    int j;
    org.json.JSONObject localJSONObject;
    StickerItem localStickerItem;
    Object localObject1;
    Object localObject2;
    boolean bool;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (paramJSONArray != null)
      {
        i = 0;
        j = 0;
        if (j >= paramJSONArray.length())
          break label2214;
        localJSONObject = paramJSONArray.getJSONObject(j);
        localStickerItem = new com/tencent/ttpic/model/StickerItem;
        localStickerItem.<init>();
        localStickerItem.id = localJSONObject.optString("id");
        localStickerItem.subFolder = localStickerItem.id;
        localStickerItem.name = localJSONObject.optString("name");
        localStickerItem.type = localJSONObject.optInt("type");
        localStickerItem.scale = ((float)localJSONObject.optDouble("scale", 1.0D));
        localStickerItem.angle = ((float)localJSONObject.optDouble("angle", 0.0D));
        localStickerItem.dx = localJSONObject.optInt("dx", 0);
        localStickerItem.dy = localJSONObject.optInt("dy", 0);
        localStickerItem.personID = localJSONObject.optInt("personID", -1);
        localStickerItem.featureStatType = localJSONObject.optInt("featureStatType");
        localStickerItem.frameType = localJSONObject.optInt("frameType");
        localStickerItem.blendMode = localJSONObject.optInt("blendMode", -1);
        localStickerItem.zIndex = localJSONObject.optInt("zIndex");
        localStickerItem.audioLoopCount = localJSONObject.optInt("audioLoopCount", -1);
        localStickerItem.randomGroupNum = localJSONObject.optInt("randomGroupNum");
        localObject1 = localJSONObject.optJSONObject("featureStatValueRange");
        if (localObject1 != null)
        {
          localObject2 = new com/tencent/ttpic/model/StickerItem$ValueRange;
          ((StickerItem.ValueRange)localObject2).<init>();
          localStickerItem.featureStatValueRange = ((StickerItem.ValueRange)localObject2);
          localStickerItem.featureStatValueRange.min = ((org.json.JSONObject)localObject1).optDouble("min");
          localStickerItem.featureStatValueRange.max = ((org.json.JSONObject)localObject1).optDouble("max");
        }
        localObject1 = localJSONObject.optJSONObject(VideoMaterialUtil.FIELD.CHARM_RANGE.value);
        if (localObject1 != null)
        {
          localObject2 = new com/tencent/ttpic/model/CharmRange;
          ((CharmRange)localObject2).<init>();
          localStickerItem.charmRange = ((CharmRange)localObject2);
          localStickerItem.charmRange.min = ((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MIN.value);
          localStickerItem.charmRange.max = ((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.CHARM_RANGE_FIELD.MAX.value);
        }
        if (localStickerItem.blendMode == -1)
          localStickerItem.blendMode = paramInt2;
        localStickerItem.triggerType = localJSONObject.optInt("triggerType");
        localStickerItem.audioTriggerType = localJSONObject.optInt("audioTriggerType");
        if (localJSONObject.optInt("audioNeedAdjust", 1) == 1)
        {
          bool = true;
          localStickerItem.audioNeedAdjust = bool;
          localObject1 = localJSONObject.optJSONObject("audioValueRange");
          if (localObject1 != null)
          {
            localObject2 = new com/tencent/ttpic/model/StickerItem$ValueRange;
            ((StickerItem.ValueRange)localObject2).<init>();
            localStickerItem.audioValueRange = ((StickerItem.ValueRange)localObject2);
            localStickerItem.audioValueRange.min = ((org.json.JSONObject)localObject1).optDouble("min");
            localStickerItem.audioValueRange.max = ((org.json.JSONObject)localObject1).optDouble("max");
          }
          if ((VideoMaterialUtil.isActionTriggerType(localStickerItem.triggerType)) && (paramArrayOfInt != null))
            paramArrayOfInt[0] = localStickerItem.triggerType;
          if (localJSONObject.optInt("alwaysTriggered") != 1)
            break label789;
          bool = true;
          label558: localStickerItem.alwaysTriggered = bool;
          localStickerItem.playCount = localJSONObject.optInt("playCount");
          localStickerItem.frameDuration = localJSONObject.optDouble("frameDuration");
          localStickerItem.stickerType = localJSONObject.optInt("stickerType", paramInt1);
          if ((localStickerItem.stickerType == VideoFilterFactory.STICKER_TYPE.VIDEO_UP_DOWN.type) || (localStickerItem.stickerType == VideoFilterFactory.STICKER_TYPE.VIDEO_LEFT_RIGHT.type))
            if (localStickerItem.stickerType != VideoFilterFactory.STICKER_TYPE.VIDEO_UP_DOWN.type)
              break label795;
        }
        label789: label795: for (localObject2 = VideoMaterialUtil.ITEM_SOURCE_TYPE.VIDEO_UP_DOWN; ; localObject2 = VideoMaterialUtil.ITEM_SOURCE_TYPE.VIDEO_LEFT_RIGHT)
        {
          localStickerItem.sourceType = ((VideoMaterialUtil.ITEM_SOURCE_TYPE)localObject2);
          localStickerItem.frames = localJSONObject.optInt("frames");
          localStickerItem.width = localJSONObject.optInt("width");
          localStickerItem.height = localJSONObject.optInt("height");
          localStickerItem.support3D = localJSONObject.optInt("enable3D", 1);
          localStickerItem.scaleDirection = localJSONObject.optInt("scaleDirection");
          localObject2 = localJSONObject.optJSONArray("position");
          if (localObject2 == null)
            break label803;
          localStickerItem.position = new double[((JSONArray)localObject2).length()];
          for (i = 0; i < ((JSONArray)localObject2).length(); i++)
            localStickerItem.position[i] = ((JSONArray)localObject2).getDouble(i);
          bool = false;
          break;
          bool = false;
          break label558;
        }
        label803: localStickerItem.position = new double[] { 0.0D, 0.0D };
        localStickerItem.audio = localJSONObject.optString("audio");
        if ((!TextUtils.isEmpty(localStickerItem.audio)) && (paramArrayOfBoolean != null))
          paramArrayOfBoolean[0] = true;
        localObject2 = localJSONObject.optJSONArray("anchorPoint");
        if (localObject2 != null)
        {
          localStickerItem.anchorPoint = new int[((JSONArray)localObject2).length()];
          for (i = 0; i < ((JSONArray)localObject2).length(); i++)
            localStickerItem.anchorPoint[i] = ((JSONArray)localObject2).getInt(i);
        }
        localObject2 = localJSONObject.optJSONArray("anchorPointAudio");
        if (localObject2 != null)
        {
          localStickerItem.anchorPointAudio = new double[((JSONArray)localObject2).length()];
          for (i = 0; i < ((JSONArray)localObject2).length(); i++)
            localStickerItem.anchorPointAudio[i] = ((JSONArray)localObject2).getDouble(i);
        }
        localStickerItem.anchorPointAudio = new double[] { 0.5D, 0.5D };
        localObject2 = localJSONObject.optJSONArray("alignFacePoints");
        if (localObject2 != null)
        {
          localStickerItem.alignFacePoints = new int[((JSONArray)localObject2).length()];
          for (i = 0; i < ((JSONArray)localObject2).length(); i++)
            localStickerItem.alignFacePoints[i] = ((JSONArray)localObject2).getInt(i);
        }
        localObject2 = localJSONObject.optJSONArray("scalePivots");
        if (localObject2 != null)
        {
          localStickerItem.scalePivots = new int[((JSONArray)localObject2).length()];
          for (i = 0; i < ((JSONArray)localObject2).length(); i++)
            localStickerItem.scalePivots[i] = ((JSONArray)localObject2).getInt(i);
        }
        localStickerItem.scaleFactor = localJSONObject.optInt("scaleFactor");
        localStickerItem.originalScaleFactor = localStickerItem.scaleFactor;
        localStickerItem.markMode = localJSONObject.optInt("markMode");
        localStickerItem.activateTriggerType = localJSONObject.optInt("activateTriggerType", 0);
        localStickerItem.activateTriggerCount = localJSONObject.optInt("activateTriggerCount", 0);
        localStickerItem.activateTriggerTotalCount = localJSONObject.optInt("activateTriggerTotalCount", 0);
        localStickerItem.bodyTriggerPoint = localJSONObject.optInt("bodyTriggerPoint", 0);
        localStickerItem.bodyTriggerDirection = localJSONObject.optInt("bodyTriggerDirection", 0);
        localStickerItem.bodyTriggerDistance = localJSONObject.optInt("bodyTriggerDistance", 0);
        localStickerItem.bodyTriggerTimeGap = localJSONObject.optDouble("bodyTriggerTimeGap", 0.0D);
        localObject1 = localJSONObject.optJSONObject("ageRange");
        if (localObject1 != null)
        {
          localObject2 = new com/tencent/ttpic/model/AgeRange;
          ((AgeRange)localObject2).<init>();
          localStickerItem.ageRange = ((AgeRange)localObject2);
          localStickerItem.ageRange.min = ((float)((org.json.JSONObject)localObject1).optDouble("min"));
          localStickerItem.ageRange.max = ((float)((org.json.JSONObject)localObject1).optDouble("max"));
        }
        localObject1 = localJSONObject.optJSONObject("genderRange");
        if (localObject1 != null)
        {
          localObject2 = new com/tencent/ttpic/model/GenderRange;
          ((GenderRange)localObject2).<init>();
          localStickerItem.genderRange = ((GenderRange)localObject2);
          localStickerItem.genderRange.min = ((float)((org.json.JSONObject)localObject1).optDouble("min"));
          localStickerItem.genderRange.max = ((float)((org.json.JSONObject)localObject1).optDouble("max"));
        }
        localObject2 = localJSONObject.optJSONObject("popularRange");
        if (localObject2 != null)
        {
          localObject1 = new com/tencent/ttpic/model/PopularRange;
          ((PopularRange)localObject1).<init>();
          localStickerItem.popularRange = ((PopularRange)localObject1);
          localStickerItem.popularRange.min = ((float)((org.json.JSONObject)localObject2).optDouble("min"));
          localStickerItem.popularRange.max = ((float)((org.json.JSONObject)localObject2).optDouble("max"));
        }
        localObject1 = localJSONObject.optJSONObject("cpRange");
        if (localObject1 != null)
        {
          localObject2 = new com/tencent/ttpic/model/CpRange;
          ((CpRange)localObject2).<init>();
          localStickerItem.cpRange = ((CpRange)localObject2);
          localStickerItem.cpRange.min = ((float)((org.json.JSONObject)localObject1).optDouble("min"));
          localStickerItem.cpRange.max = ((float)((org.json.JSONObject)localObject1).optDouble("max"));
        }
        localObject1 = localJSONObject.optJSONObject("audioScaleFactor");
        if (localObject1 == null)
          break label1610;
        Iterator localIterator = ((org.json.JSONObject)localObject1).keys();
        while (localIterator.hasNext())
        {
          localObject2 = (String)localIterator.next();
          localStickerItem.audioScaleFactorMap.add(Pair.create(Float.valueOf((String)localObject2), Double.valueOf(((org.json.JSONObject)localObject1).optDouble((String)localObject2, 0.0D))));
        }
      }
    }
    catch (JSONException paramString)
    {
      LogUtils.e(TAG, paramString);
      paramString = null;
      AppMethodBeat.o(84264);
    }
    while (true)
    {
      return paramString;
      label1610: Collections.sort(localStickerItem.audioScaleFactorMap, mRangeValueComp);
      localObject2 = localJSONObject.optJSONObject("transition");
      if (localObject2 != null)
      {
        localObject1 = new com/tencent/ttpic/model/Transition;
        ((Transition)localObject1).<init>();
        localStickerItem.transition = ((Transition)localObject1);
        localStickerItem.transition.particleCountMax = ((org.json.JSONObject)localObject2).optInt(VideoMaterialUtil.TRANSITION.PARTICLE_COUNT_MAX.value);
        localStickerItem.transition.life = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.LIFE.value);
        localStickerItem.transition.emissionMode = ((org.json.JSONObject)localObject2).optInt(VideoMaterialUtil.TRANSITION.EMISSION_MODE.value);
        localObject1 = localStickerItem.transition;
        label1993: int k;
        if (((org.json.JSONObject)localObject2).optInt(VideoMaterialUtil.TRANSITION.PARTICLE_ALWAYS_UPDATE.value) == 1)
        {
          bool = true;
          ((Transition)localObject1).particleAlwaysUpdate = bool;
          localStickerItem.transition.emissionRate = ((org.json.JSONObject)localObject2).optInt(VideoMaterialUtil.TRANSITION.EMISSION_RATE.value);
          localStickerItem.transition.scale = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.SCALE.value);
          localStickerItem.transition.rotate = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.ROTATE.value);
          localStickerItem.transition.positionX = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.POSITION_X.value);
          localStickerItem.transition.positionY = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.POSITION_Y.value);
          localStickerItem.transition.p0 = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.P0.value);
          localStickerItem.transition.p1 = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.P1.value);
          localStickerItem.transition.p2 = ((org.json.JSONObject)localObject2).optString(VideoMaterialUtil.TRANSITION.P2.value);
          localStickerItem.transition.repeatCount = ((org.json.JSONObject)localObject2).optInt(VideoMaterialUtil.TRANSITION.REPEAT_COUNT.value, 1);
          localStickerItem.transition.minUpdateInterval = ((org.json.JSONObject)localObject2).optInt(VideoMaterialUtil.TRANSITION.MIN_UPDATE_INTERVAL.value, 1);
          localStickerItem.transition.clearMode = ((org.json.JSONObject)localObject2).optInt(VideoMaterialUtil.TRANSITION.CLEAR_MODE.value, 0);
          localObject2 = localJSONObject.optJSONArray(VideoMaterialUtil.FIELD.WATERMARK_GROUP.value);
          if (localObject2 == null)
            break label2117;
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localStickerItem.wmGroupCopies = ((List)localObject1);
          i = 0;
          k = localStickerItem.transition.particleCountMax / localStickerItem.transition.repeatCount;
          if (localStickerItem.transition.clearMode != VideoMaterialUtil.PARTICLE_CLEAR_MODE.CLEAR_ALL.value)
            break label2082;
        }
        label2082: for (int m = 1; ; m = 0)
        {
          if (i >= m + k)
            break label2117;
          localObject1 = parseWMGroup((JSONArray)localObject2, paramVideoMaterial);
          ((WMGroup)localObject1).id = i;
          localStickerItem.wmGroupCopies.add(localObject1);
          i++;
          break label1993;
          bool = false;
          break;
        }
      }
      else
      {
        localObject2 = localJSONObject.optJSONArray(VideoMaterialUtil.FIELD.WATERMARK_GROUP.value);
        if (localObject2 != null)
          localStickerItem.wmGroup = parseWMGroup((JSONArray)localObject2, paramVideoMaterial);
      }
      label2117: localStickerItem.triggerWords = localJSONObject.optString("triggerWords");
      localStickerItem.preTriggerType = localStickerItem.triggerType;
      localArrayList.add(localStickerItem);
      i = localStickerItem.triggerType;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localStickerItem.particleConfig = parseParticleConfig(paramString + File.separator + localStickerItem.id, localJSONObject.optString("dexName"), paramDecryptListener);
      j++;
      break;
      label2214: paramString = localArrayList.iterator();
      while (paramString.hasNext())
      {
        paramJSONArray = (StickerItem)paramString.next();
        if (paramJSONArray.activateTriggerType == 0)
        {
          paramJSONArray.countTriggerType = i;
        }
        else
        {
          paramJSONArray.playCount = 0;
          paramJSONArray.countTriggerType = PTFaceAttr.PTExpression.MV_PART_INDEX.value;
        }
      }
      AppMethodBeat.o(84264);
      paramString = localArrayList;
    }
  }

  public static ParticleConfig parseParticleConfig(String paramString1, String paramString2, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84273);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      AppMethodBeat.o(84273);
    while (true)
    {
      return null;
      paramString1 = readPexFile(paramString1, paramString2, paramDecryptListener);
      try
      {
        paramString1 = XML.toJSONObject(paramString1).toString();
        paramString2 = new org/json/JSONTokener;
        paramString2.<init>(paramString1);
        paramString2.nextValue();
        AppMethodBeat.o(84273);
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(84273);
      }
      catch (JSONException paramString1)
      {
        label67: break label67;
      }
    }
  }

  private static PhantomItem parsePhantomItem(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84245);
    if (paramJSONObject == null)
    {
      paramJSONObject = null;
      AppMethodBeat.o(84245);
    }
    while (true)
    {
      return paramJSONObject;
      PhantomItem localPhantomItem = new PhantomItem();
      localPhantomItem.setDataPath(paramVideoMaterial.getDataPath());
      localPhantomItem.setId(paramJSONObject.optString(VideoMaterialUtil.PHANTOM_ITEM_FIELD.ID.value));
      localPhantomItem.setMaskImage(paramJSONObject.optString(VideoMaterialUtil.PHANTOM_ITEM_FIELD.MASK_IMAGE.value));
      localPhantomItem.setBlendMode(paramJSONObject.optInt(VideoMaterialUtil.PHANTOM_ITEM_FIELD.BLEND_MODE.value));
      localPhantomItem.setScale(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.SCALE.value));
      localPhantomItem.setOpacity(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.OPACITY.value));
      localPhantomItem.setxK(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.X_K.value));
      localPhantomItem.setxAsin(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.X_A_SIN.value));
      localPhantomItem.setxBcos(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.X_B_COS.value));
      localPhantomItem.setxPhase(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.X_PHASE.value));
      localPhantomItem.setxOffset(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.X_OFFSET.value));
      localPhantomItem.setxStep(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.X_STEP.value));
      paramVideoMaterial = new double[2];
      VideoMaterial tmp195_194 = paramVideoMaterial;
      tmp195_194[0] = 0.0D;
      VideoMaterial tmp199_195 = tmp195_194;
      tmp199_195[1] = 360.0D;
      tmp199_195;
      JSONArray localJSONArray = paramJSONObject.optJSONArray(VideoMaterialUtil.PHANTOM_ITEM_FIELD.X_RANGE.value);
      if (localJSONArray != null)
      {
        paramVideoMaterial[0] = localJSONArray.optDouble(0);
        paramVideoMaterial[1] = localJSONArray.optDouble(1);
      }
      localPhantomItem.setxRange(paramVideoMaterial);
      localPhantomItem.setyK(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.Y_K.value));
      localPhantomItem.setyAsin(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.Y_A_SIN.value));
      localPhantomItem.setyBcos(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.Y_B_COS.value));
      localPhantomItem.setyPhase(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.Y_PHASE.value));
      localPhantomItem.setyOffset(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.Y_OFFSET.value));
      localPhantomItem.setyStep(paramJSONObject.optDouble(VideoMaterialUtil.PHANTOM_ITEM_FIELD.Y_STEP.value));
      paramVideoMaterial = paramJSONObject.optJSONArray(VideoMaterialUtil.PHANTOM_ITEM_FIELD.Y_RANGE.value);
      paramJSONObject = new double[2];
      paramJSONObject[0] = 0.0D;
      paramJSONObject[1] = 360.0D;
      paramJSONObject;
      if (paramVideoMaterial != null)
      {
        paramJSONObject[0] = paramVideoMaterial.optDouble(0);
        paramJSONObject[1] = paramVideoMaterial.optDouble(1);
      }
      localPhantomItem.setyRange(paramJSONObject);
      AppMethodBeat.o(84245);
      paramJSONObject = localPhantomItem;
    }
  }

  private static void parsePhantomItemListParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84244);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("phantomItemList");
    if (localJSONArray == null)
    {
      paramVideoMaterial.setPhantomItemList(new ArrayList());
      AppMethodBeat.o(84244);
    }
    while (true)
    {
      return;
      paramJSONObject = new ArrayList();
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        Object localObject = localJSONArray.optJSONObject(i);
        if (localObject != null)
        {
          localObject = parsePhantomItem((org.json.JSONObject)localObject, paramVideoMaterial);
          if (localObject != null)
            paramJSONObject.add(localObject);
        }
      }
      paramVideoMaterial.setPhantomItemList(paramJSONObject);
      AppMethodBeat.o(84244);
    }
  }

  private static void parseResourceListParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84250);
    ArrayList localArrayList = new ArrayList();
    paramJSONObject = paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.RESOURCE_LIST.value);
    if (paramJSONObject != null)
    {
      for (int i = 0; i < paramJSONObject.length(); i++)
        localArrayList.add(paramJSONObject.optString(i));
      paramVideoMaterial.setResourceList(localArrayList);
    }
    AppMethodBeat.o(84250);
  }

  private static void parseSegmentParams(org.json.JSONObject paramJSONObject, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84248);
    paramVideoMaterial.setSegmentFeather(paramJSONObject.optInt("SegmentFeathering", 0));
    boolean bool;
    if (paramJSONObject.optInt("SegmentRequired", 0) == 1)
      bool = true;
    while (true)
    {
      paramVideoMaterial.setSegmentRequired(bool);
      paramVideoMaterial.setSegmentStrokeWidth(paramJSONObject.optDouble("SegmentStrokeWidth", 0.0D));
      paramVideoMaterial.setSegmentStrokeGap(paramJSONObject.optDouble("SegmentStrokeGap", 0.0D));
      paramJSONObject = paramJSONObject.optString("SegmentStrokeColor", "");
      if (!TextUtils.isEmpty(paramJSONObject));
      try
      {
        i = Color.parseColor(paramJSONObject);
        paramVideoMaterial.setSegmentStrokeColor(new float[] { Color.red(i) / 255.0F, Color.green(i) / 255.0F, Color.blue(i) / 255.0F, Color.alpha(i) / 255.0F });
        AppMethodBeat.o(84248);
        return;
        bool = false;
      }
      catch (Exception paramJSONObject)
      {
        while (true)
          int i = 0;
      }
    }
  }

  public static VideoMaterial parseVideoMaterial(String paramString)
  {
    AppMethodBeat.i(84238);
    paramString = parseVideoMaterial(paramString, "params", true, decryptListener);
    AppMethodBeat.o(84238);
    return paramString;
  }

  public static VideoMaterial parseVideoMaterial(String paramString, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84240);
    paramString = parseVideoMaterial(null, parseVideoMaterialString(paramString, paramDecryptListener), paramDecryptListener);
    AppMethodBeat.o(84240);
    return paramString;
  }

  public static VideoMaterial parseVideoMaterial(String paramString1, String paramString2, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84241);
    paramString1 = parseVideoMaterial(paramString1, parseVideoMaterialString(paramString2, paramDecryptListener), paramDecryptListener);
    AppMethodBeat.o(84241);
    return paramString1;
  }

  public static VideoMaterial parseVideoMaterial(String paramString1, String paramString2, boolean paramBoolean, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84239);
    paramString1 = parseVideoMaterial(paramString1, parseVideoMaterialFileAsJSONObject(paramString1, paramString2, paramBoolean, paramDecryptListener), paramDecryptListener);
    AppMethodBeat.o(84239);
    return paramString1;
  }

  private static VideoMaterial parseVideoMaterial(String paramString, org.json.JSONObject paramJSONObject, DecryptListener paramDecryptListener)
  {
    boolean bool = false;
    AppMethodBeat.i(84243);
    VideoMaterial localVideoMaterial = new VideoMaterial();
    localVideoMaterial.setDataPath(paramString);
    if (paramJSONObject == null)
      AppMethodBeat.o(84243);
    while (true)
    {
      return localVideoMaterial;
      parseBasicParams(paramString, paramJSONObject, localVideoMaterial);
      if (!TextUtils.isEmpty(paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.GAME_NAME.value)))
        parseGameParams(paramJSONObject, localVideoMaterial);
      if (!TextUtils.isEmpty(paramJSONObject.optString(VideoMaterialUtil.GAME_FIELD.GAME_NAME.value)))
        parseAudio3DParams(paramJSONObject, localVideoMaterial);
      parseResourceListParams(paramJSONObject, localVideoMaterial);
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = 0;
      boolean[] arrayOfBoolean = new boolean[1];
      arrayOfBoolean[0] = false;
      Object localObject = parseItemListParams(paramString, paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.ITEM_LIST.value), VideoFilterFactory.STICKER_TYPE.NORMAL.type, localVideoMaterial, localVideoMaterial.getBlendMode(), arrayOfBoolean, arrayOfInt, paramDecryptListener);
      localVideoMaterial.setTriggerType(arrayOfInt[0]);
      localVideoMaterial.setItemList((List)localObject);
      int i;
      if (arrayOfBoolean[0] != 0)
      {
        i = 1;
        label173: localObject = new boolean[1];
        localObject[0] = 0;
        parse3DItemListParams(paramString, paramJSONObject, localVideoMaterial, (boolean[])localObject);
        if ((i == 0) && (localObject[0] == 0))
          break label486;
        i = 1;
        parseHeadCropItemListParams(paramJSONObject, localVideoMaterial);
        localVideoMaterial.setDistortionItemList(parseDistortionItemListParams(paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.DISTORTION_LIST.value)));
        parseFaceMoveItemListParams(paramJSONObject, localVideoMaterial);
        parseFaceMoveTrianglesParams(paramJSONObject, localVideoMaterial);
        parseFacePointsListParams(paramJSONObject, localVideoMaterial);
        parseFilterEffectParams(paramJSONObject, localVideoMaterial);
        localObject = parseFaceOffItemListParams(paramJSONObject.optJSONArray(VideoMaterialUtil.FIELD.FACE_OFF_ITEM_LIST.value));
        if (!TextUtils.isEmpty(localVideoMaterial.getFaceExchangeImage()))
          ((List)localObject).add(new FaceItem(localVideoMaterial.getFaceExchangeImage(), (float)localVideoMaterial.getBlendAlpha(), localVideoMaterial.getGrayScale(), localVideoMaterial.getFeatureType(), localVideoMaterial.getFacePoints()));
        localVideoMaterial.setFaceOffItemList((List)localObject);
        parseFaceMeshItemListParams(paramJSONObject, localVideoMaterial);
        parseFaceMeshItemListParams(paramJSONObject, localVideoMaterial);
        parseFaceImageLayerParams(paramJSONObject, localVideoMaterial);
        parseArParticleListParams(paramJSONObject, localVideoMaterial);
        localObject = new boolean[1];
        localObject[0] = 0;
        parseFaceExpressionParams(paramJSONObject, localVideoMaterial, (boolean[])localObject);
        if ((i != 0) || (localObject[0] != 0))
          bool = true;
        parseFaceCropParams(paramJSONObject, localVideoMaterial);
        localVideoMaterial.setHasAudio(bool);
        parseFabbyMvItems(paramString, paramJSONObject, localVideoMaterial, paramDecryptListener);
        parseSegmentParams(paramJSONObject, localVideoMaterial);
        parseFaceFeatureItemListParams(paramString, paramJSONObject, localVideoMaterial, paramDecryptListener);
        parsePhantomItemListParams(paramJSONObject, localVideoMaterial);
        parseAudio2TextParams(paramJSONObject, localVideoMaterial);
        VideoMaterialUtil.updateSupportLandscape(localVideoMaterial);
        VideoMaterialUtil.updateMaxFaceCount(localVideoMaterial);
        VideoMaterialUtil.updateFaceValueDetectType(localVideoMaterial);
        VideoMaterialUtil.updateItemImageType(localVideoMaterial);
        VideoMaterialUtil.updateWatermarkInfo(localVideoMaterial);
        VideoMaterialUtil.updateNeedFaceInfo(localVideoMaterial);
        VideoMaterialUtil.updateNeedBodyInfo(localVideoMaterial);
      }
      try
      {
        checkValid(localVideoMaterial);
        label471: AppMethodBeat.o(84243);
        continue;
        i = 0;
        break label173;
        label486: i = 0;
      }
      catch (IllegalArgumentException paramString)
      {
        break label471;
      }
    }
  }

  public static JSONArray parseVideoMaterialFileAsJSONArray(String paramString1, String paramString2, boolean paramBoolean, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84272);
    paramString2 = readMaterialFile(paramString1, paramString2, paramBoolean, paramDecryptListener);
    if ((paramString2 != null) && (!TextUtils.isEmpty(paramString2)));
    while (true)
    {
      try
      {
        paramString1 = new org/json/JSONTokener;
        paramString1.<init>(paramString2);
        paramString1 = (JSONArray)paramString1.nextValue();
        AppMethodBeat.o(84272);
        return paramString1;
      }
      catch (JSONException paramString1)
      {
      }
      paramString1 = null;
      AppMethodBeat.o(84272);
    }
  }

  public static org.json.JSONObject parseVideoMaterialFileAsJSONObject(String paramString1, String paramString2, boolean paramBoolean, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84271);
    paramString2 = readMaterialFile(paramString1, paramString2, paramBoolean, paramDecryptListener);
    LogUtils.d(TAG, "[material str]".concat(String.valueOf(paramString2)));
    if ((paramString2 != null) && (!TextUtils.isEmpty(paramString2)));
    while (true)
    {
      try
      {
        paramString1 = new org/json/JSONTokener;
        paramString1.<init>(paramString2);
        paramString1 = (org.json.JSONObject)paramString1.nextValue();
        AppMethodBeat.o(84271);
        return paramString1;
      }
      catch (JSONException paramString1)
      {
      }
      paramString1 = null;
      AppMethodBeat.o(84271);
    }
  }

  public static org.json.JSONObject parseVideoMaterialString(String paramString, DecryptListener paramDecryptListener)
  {
    AppMethodBeat.i(84270);
    Object localObject1 = null;
    Object localObject2 = paramString.trim();
    paramString = (String)localObject2;
    if (localObject2 != null)
    {
      paramString = (String)localObject2;
      try
      {
        if (((String)localObject2).charAt(0) == '{')
          break label118;
        paramString = new java/io/ByteArrayInputStream;
        paramString.<init>(((String)localObject2).getBytes(Charset.forName("UTF-8")));
        paramString = drinkACupOfCoffee(paramString, paramDecryptListener);
        paramDecryptListener = new java/io/InputStreamReader;
        paramDecryptListener.<init>(paramString);
        paramString = new java/io/BufferedReader;
        paramString.<init>(paramDecryptListener, 1024);
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        while (true)
        {
          paramDecryptListener = paramString.readLine();
          if (paramDecryptListener == null)
            break;
          ((StringBuffer)localObject2).append(paramDecryptListener);
        }
      }
      catch (Exception paramString)
      {
        paramString = localObject1;
      }
      AppMethodBeat.o(84270);
      return paramString;
      paramString = ((StringBuffer)localObject2).toString();
    }
    label118: if (!TextUtils.isEmpty(paramString))
    {
      paramDecryptListener = new org/json/JSONTokener;
      paramDecryptListener.<init>(paramString);
    }
    for (paramString = (org.json.JSONObject)paramDecryptListener.nextValue(); ; paramString = null)
      break;
  }

  private static WMGroup parseWMGroup(JSONArray paramJSONArray, VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(84265);
    WMGroup localWMGroup = new WMGroup();
    label1027: label1049: label1071: label1077: label1083: label1089: label1229: for (int i = 0; ; i++)
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      Object localObject5;
      Object localObject6;
      String str;
      Object localObject7;
      while (true)
      {
        try
        {
          if (i < paramJSONArray.length())
          {
            localObject1 = paramJSONArray.optJSONObject(i);
            if (localObject1 == null)
              break label1229;
            int j = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.WMTYPE.value);
            if (j != WMElement.WMType.TEXT.value)
              break label1015;
            localObject2 = new com/tencent/ttpic/model/TextWMElement;
            ((TextWMElement)localObject2).<init>();
            ((WMElement)localObject2).dataPath = paramVideoMaterial.getDataPath();
            ((WMElement)localObject2).sid = paramVideoMaterial.getId();
            ((WMElement)localObject2).id = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.ID.value);
            ((WMElement)localObject2).relativeID = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.RELATIVE_ID.value);
            localObject3 = ((org.json.JSONObject)localObject1).optJSONArray(VideoMaterialUtil.WATERMARK_ELEMENT.RELATIVE_ANCHOR.value);
            if ((localObject3 == null) || (((JSONArray)localObject3).length() != 2))
              break label1027;
            localObject4 = new android/graphics/PointF;
            ((PointF)localObject4).<init>((float)((JSONArray)localObject3).getDouble(0), (float)((JSONArray)localObject3).getDouble(1));
            ((WMElement)localObject2).relativeAnchor = ((PointF)localObject4);
            localObject3 = ((org.json.JSONObject)localObject1).optJSONArray(VideoMaterialUtil.WATERMARK_ELEMENT.ANCHOR.value);
            if ((localObject3 == null) || (((JSONArray)localObject3).length() != 2))
              break label1049;
            localObject4 = new android/graphics/PointF;
            ((PointF)localObject4).<init>((float)((JSONArray)localObject3).getDouble(0), (float)((JSONArray)localObject3).getDouble(1));
            ((WMElement)localObject2).anchor = ((PointF)localObject4);
            ((WMElement)localObject2).offsetX = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.OFFSETX.value);
            ((WMElement)localObject2).offsetY = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.OFFSETY.value);
            ((WMElement)localObject2).width = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.WIDTH.value);
            ((WMElement)localObject2).height = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.HEIGHT.value);
            ((WMElement)localObject2).wmtype = j;
            ((WMElement)localObject2).edittype = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.EDITTYPE.value);
            ((WMElement)localObject2).fmtstr = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.FMTSTR.value);
            ((WMElement)localObject2).fontName = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_NAME.value);
            if (((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_BOLD.value) != 1)
              break label1071;
            bool = true;
            ((WMElement)localObject2).fontBold = bool;
            if (((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_ITALICS.value) != 1)
              break label1077;
            bool = true;
            ((WMElement)localObject2).fontItalics = bool;
            ((WMElement)localObject2).fontTexture = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_TEXTURE.value);
            ((WMElement)localObject2).fontSize = ((float)((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_SIZE.value, 40.0D));
            ((WMElement)localObject2).fontFit = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FONT_FIT.value);
            ((WMElement)localObject2).kern = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.KERN.value);
            ((WMElement)localObject2).imgPath = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.IMG_PATH.value);
            ((WMElement)localObject2).frameDuration = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FRAME_DURATION.value);
            ((WMElement)localObject2).frames = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.FRAMES.value);
            ((WMElement)localObject2).color = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.COLOR.value, "#FFFFFFFF");
            ((WMElement)localObject2).strokeColor = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.STROKE_COLOR.value, "#FFFFFFFF");
            ((WMElement)localObject2).strokeSize = ((float)((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.STROKE_SIZE.value, -1.0D));
            ((WMElement)localObject2).shadowColor = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_COLOR.value, "#FFFFFFFF");
            ((WMElement)localObject2).shadowSize = ((float)((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_SIZE.value, -1.0D));
            ((WMElement)localObject2).shadowDx = ((float)((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_DX.value, -1.0D));
            ((WMElement)localObject2).shadowDy = ((float)((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.SHADOW_DY.value, -1.0D));
            ((WMElement)localObject2).alignment = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.ALIGNMENT.value);
            ((WMElement)localObject2).vertical = ((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.VERTICAL.value);
            ((WMElement)localObject2).outerStrokeColor = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.OUTER_STROKE_COLOR.value, "#FFFFFFFF");
            ((WMElement)localObject2).outerStrokeSize = ((float)((org.json.JSONObject)localObject1).optDouble(VideoMaterialUtil.WATERMARK_ELEMENT.OUTER_STROKE_SIZE.value, -1.0D));
            ((WMElement)localObject2).shaderBmp = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.SHADER_BMP.value, null);
            if (((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.EMBOSS.value, 0) != 1)
              break label1083;
            bool = true;
            ((WMElement)localObject2).emboss = bool;
            if (((org.json.JSONObject)localObject1).optInt(VideoMaterialUtil.WATERMARK_ELEMENT.MULTI_ROW.value, 0) != 1)
              break label1089;
            bool = true;
            ((WMElement)localObject2).multiRow = bool;
            ((WMElement)localObject2).animateType = ((org.json.JSONObject)localObject1).optString(VideoMaterialUtil.WATERMARK_ELEMENT.ANIMATE_TYPE.value);
            localObject3 = ((org.json.JSONObject)localObject1).optJSONObject(VideoMaterialUtil.WATERMARK_ELEMENT.LOGIC.value);
            if (localObject3 == null)
              break label1217;
            localObject1 = new com/tencent/ttpic/model/WMLogic;
            ((WMLogic)localObject1).<init>();
            ((WMLogic)localObject1).type = ((org.json.JSONObject)localObject3).optString(VideoMaterialUtil.WATERMARK_LOGIC.TYPE.value);
            ((WMLogic)localObject1).setCompare(((org.json.JSONObject)localObject3).optString(VideoMaterialUtil.WATERMARK_LOGIC.COMPARE.value), ((WMElement)localObject2).sid);
            ((WMLogic)localObject1).data = ((org.json.JSONObject)localObject3).optString(VideoMaterialUtil.WATERMARK_LOGIC.DATA.value);
            localObject4 = ((org.json.JSONObject)localObject3).optJSONObject(VideoMaterialUtil.WATERMARK_LOGIC.RANGE.value);
            if (localObject4 == null)
              break label1103;
            localObject5 = new java/util/ArrayList;
            ((ArrayList)localObject5).<init>();
            ((WMLogic)localObject1).range = ((List)localObject5);
            localObject6 = ((org.json.JSONObject)localObject4).keys();
            if (!((Iterator)localObject6).hasNext())
              break;
            localObject5 = (String)((Iterator)localObject6).next();
            str = ((org.json.JSONObject)localObject4).optString((String)localObject5);
            localObject7 = ((WMLogic)localObject1).range;
            WMLogicPair localWMLogicPair = new com/tencent/ttpic/model/WMLogicPair;
            localWMLogicPair.<init>((String)localObject5, str);
            ((List)localObject7).add(localWMLogicPair);
            continue;
          }
        }
        catch (Exception paramJSONArray)
        {
          LogUtils.e(paramJSONArray);
          AppMethodBeat.o(84265);
          return localWMGroup;
        }
        label1015: localObject2 = new ImageWMElement();
        continue;
        localObject4 = new android/graphics/PointF;
        ((PointF)localObject4).<init>(0.0F, 0.0F);
        ((WMElement)localObject2).relativeAnchor = ((PointF)localObject4);
        continue;
        localObject4 = new android/graphics/PointF;
        ((PointF)localObject4).<init>(0.0F, 0.0F);
        ((WMElement)localObject2).anchor = ((PointF)localObject4);
        continue;
        boolean bool = false;
        continue;
        bool = false;
        continue;
        bool = false;
        continue;
        bool = false;
      }
      Collections.sort(((WMLogic)localObject1).range);
      label1103: Object localObject4 = ((org.json.JSONObject)localObject3).optJSONObject(VideoMaterialUtil.WATERMARK_LOGIC.CASE.value);
      if (localObject4 != null)
      {
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        ((WMLogic)localObject1).wmcase = ((List)localObject3);
        localObject3 = ((org.json.JSONObject)localObject4).keys();
        while (((Iterator)localObject3).hasNext())
        {
          str = (String)((Iterator)localObject3).next();
          localObject6 = ((org.json.JSONObject)localObject4).optString(str);
          localObject5 = ((WMLogic)localObject1).wmcase;
          localObject7 = new com/tencent/ttpic/model/WMLogicPair;
          ((WMLogicPair)localObject7).<init>(str, (String)localObject6);
          ((List)localObject5).add(localObject7);
        }
      }
      ((WMElement)localObject2).logic = ((WMLogic)localObject1);
      localWMGroup.wmElements.add(localObject2);
    }
  }

  // ERROR //
  private static String readMaterialFile(String paramString1, String paramString2, boolean paramBoolean, DecryptListener paramDecryptListener)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: ldc_w 2891
    //   6: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokestatic 2896	com/tencent/ttpic/baseutils/FileUtils:getRealPath	(Ljava/lang/String;)Ljava/lang/String;
    //   13: astore 5
    //   15: new 867	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 868	java/lang/StringBuilder:<init>	()V
    //   22: aload 5
    //   24: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc_w 877
    //   30: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_1
    //   34: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: ldc_w 1298
    //   40: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: astore 6
    //   45: iload_2
    //   46: ifeq +269 -> 315
    //   49: ldc 13
    //   51: astore_0
    //   52: aload 6
    //   54: aload_0
    //   55: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 880	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: astore 6
    //   63: new 867	java/lang/StringBuilder
    //   66: dup
    //   67: invokespecial 868	java/lang/StringBuilder:<init>	()V
    //   70: aload 5
    //   72: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc_w 877
    //   78: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: aload_1
    //   82: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: ldc_w 1298
    //   88: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: astore_1
    //   92: iload_2
    //   93: ifne +228 -> 321
    //   96: ldc 13
    //   98: astore_0
    //   99: aload_1
    //   100: aload_0
    //   101: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 880	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: astore 7
    //   109: new 1196	java/io/File
    //   112: astore_1
    //   113: aload_1
    //   114: aload 6
    //   116: invokespecial 2897	java/io/File:<init>	(Ljava/lang/String;)V
    //   119: new 1196	java/io/File
    //   122: astore_0
    //   123: aload_0
    //   124: aload 7
    //   126: invokespecial 2897	java/io/File:<init>	(Ljava/lang/String;)V
    //   129: aload_1
    //   130: invokevirtual 2900	java/io/File:exists	()Z
    //   133: ifeq +10 -> 143
    //   136: aload_1
    //   137: invokevirtual 2903	java/io/File:isFile	()Z
    //   140: ifne +17 -> 157
    //   143: aload_0
    //   144: invokevirtual 2900	java/io/File:exists	()Z
    //   147: ifeq +226 -> 373
    //   150: aload_0
    //   151: invokevirtual 2903	java/io/File:isFile	()Z
    //   154: ifeq +219 -> 373
    //   157: aload_1
    //   158: invokevirtual 2900	java/io/File:exists	()Z
    //   161: ifeq +166 -> 327
    //   164: aload_1
    //   165: invokevirtual 2903	java/io/File:isFile	()Z
    //   168: ifeq +159 -> 327
    //   171: new 2905	java/io/FileInputStream
    //   174: astore_0
    //   175: aload_0
    //   176: aload_1
    //   177: invokespecial 2908	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   180: iload_2
    //   181: ifne +183 -> 364
    //   184: aload_0
    //   185: aload_3
    //   186: invokestatic 2862	com/tencent/ttpic/util/VideoTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Lcom/tencent/ttpic/util/DecryptListener;)Ljava/io/InputStream;
    //   189: astore_1
    //   190: aload_0
    //   191: invokestatic 2911	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   194: aload_1
    //   195: ifnull +363 -> 558
    //   198: new 2864	java/io/InputStreamReader
    //   201: astore_3
    //   202: aload_3
    //   203: aload_1
    //   204: invokespecial 2867	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   207: new 2869	java/io/BufferedReader
    //   210: astore 5
    //   212: aload 5
    //   214: aload_3
    //   215: sipush 1024
    //   218: invokespecial 2872	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   221: new 867	java/lang/StringBuilder
    //   224: astore 6
    //   226: aload 6
    //   228: invokespecial 868	java/lang/StringBuilder:<init>	()V
    //   231: aload 5
    //   233: invokevirtual 2878	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   236: astore 7
    //   238: aload 7
    //   240: ifnull +277 -> 517
    //   243: aload 6
    //   245: aload 7
    //   247: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: pop
    //   251: goto -20 -> 231
    //   254: astore 7
    //   256: aload_3
    //   257: astore 6
    //   259: aload 7
    //   261: astore_3
    //   262: aload_3
    //   263: invokevirtual 2914	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   266: pop
    //   267: aload 5
    //   269: ifnull +8 -> 277
    //   272: aload 5
    //   274: invokevirtual 2917	java/io/BufferedReader:close	()V
    //   277: aload 6
    //   279: ifnull +8 -> 287
    //   282: aload 6
    //   284: invokevirtual 2918	java/io/InputStreamReader:close	()V
    //   287: aload_1
    //   288: ifnull +7 -> 295
    //   291: aload_1
    //   292: invokevirtual 2921	java/io/InputStream:close	()V
    //   295: aload_0
    //   296: ifnull +7 -> 303
    //   299: aload_0
    //   300: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   303: ldc_w 2891
    //   306: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: aconst_null
    //   310: astore 6
    //   312: aload 6
    //   314: areturn
    //   315: ldc 10
    //   317: astore_0
    //   318: goto -266 -> 52
    //   321: ldc 10
    //   323: astore_0
    //   324: goto -225 -> 99
    //   327: aload_0
    //   328: invokevirtual 2900	java/io/File:exists	()Z
    //   331: ifeq +481 -> 812
    //   334: aload_0
    //   335: invokevirtual 2903	java/io/File:isFile	()Z
    //   338: ifeq +474 -> 812
    //   341: new 2905	java/io/FileInputStream
    //   344: dup
    //   345: aload_0
    //   346: invokespecial 2908	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   349: astore_0
    //   350: iload_2
    //   351: ifne +8 -> 359
    //   354: iconst_1
    //   355: istore_2
    //   356: goto -176 -> 180
    //   359: iconst_0
    //   360: istore_2
    //   361: goto -5 -> 356
    //   364: aload_0
    //   365: astore_3
    //   366: aload_0
    //   367: astore_1
    //   368: aload_3
    //   369: astore_0
    //   370: goto -176 -> 194
    //   373: invokestatic 2928	com/tencent/ttpic/util/VideoGlobalContext:getContext	()Landroid/content/Context;
    //   376: invokevirtual 2934	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   379: aload 6
    //   381: invokevirtual 2940	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   384: astore 5
    //   386: iload_2
    //   387: ifne +29 -> 416
    //   390: aload 5
    //   392: aload_3
    //   393: invokestatic 2862	com/tencent/ttpic/util/VideoTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Lcom/tencent/ttpic/util/DecryptListener;)Ljava/io/InputStream;
    //   396: astore_0
    //   397: aload_0
    //   398: astore_1
    //   399: aload_0
    //   400: astore 6
    //   402: aload 5
    //   404: invokestatic 2911	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   407: aconst_null
    //   408: astore_3
    //   409: aload_0
    //   410: astore_1
    //   411: aload_3
    //   412: astore_0
    //   413: goto -219 -> 194
    //   416: aconst_null
    //   417: astore_0
    //   418: aload 5
    //   420: astore_1
    //   421: goto -227 -> 194
    //   424: astore_0
    //   425: aconst_null
    //   426: astore_0
    //   427: aload_0
    //   428: astore 5
    //   430: aload_0
    //   431: astore_1
    //   432: aload_0
    //   433: astore 6
    //   435: invokestatic 2928	com/tencent/ttpic/util/VideoGlobalContext:getContext	()Landroid/content/Context;
    //   438: invokevirtual 2934	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   441: aload 7
    //   443: invokevirtual 2940	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   446: astore 7
    //   448: iload_2
    //   449: ifne +45 -> 494
    //   452: iload 4
    //   454: ifne +46 -> 500
    //   457: aload_0
    //   458: astore 5
    //   460: aload_0
    //   461: astore_1
    //   462: aload_0
    //   463: astore 6
    //   465: aload 7
    //   467: aload_3
    //   468: invokestatic 2862	com/tencent/ttpic/util/VideoTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Lcom/tencent/ttpic/util/DecryptListener;)Ljava/io/InputStream;
    //   471: astore_0
    //   472: aload_0
    //   473: astore 5
    //   475: aload_0
    //   476: astore_1
    //   477: aload_0
    //   478: astore 6
    //   480: aload 7
    //   482: invokestatic 2911	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   485: aconst_null
    //   486: astore_3
    //   487: aload_0
    //   488: astore_1
    //   489: aload_3
    //   490: astore_0
    //   491: goto -297 -> 194
    //   494: iconst_0
    //   495: istore 4
    //   497: goto -45 -> 452
    //   500: aconst_null
    //   501: astore_0
    //   502: aload 7
    //   504: astore_1
    //   505: goto -311 -> 194
    //   508: astore_0
    //   509: aconst_null
    //   510: astore_0
    //   511: aload 5
    //   513: astore_1
    //   514: goto -320 -> 194
    //   517: aload 6
    //   519: invokevirtual 880	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   522: astore 6
    //   524: aload 5
    //   526: invokevirtual 2917	java/io/BufferedReader:close	()V
    //   529: aload_3
    //   530: invokevirtual 2918	java/io/InputStreamReader:close	()V
    //   533: aload_1
    //   534: ifnull +7 -> 541
    //   537: aload_1
    //   538: invokevirtual 2921	java/io/InputStream:close	()V
    //   541: aload_0
    //   542: ifnull +7 -> 549
    //   545: aload_0
    //   546: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   549: ldc_w 2891
    //   552: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   555: goto -243 -> 312
    //   558: aload_1
    //   559: ifnull +7 -> 566
    //   562: aload_1
    //   563: invokevirtual 2921	java/io/InputStream:close	()V
    //   566: aload_0
    //   567: ifnull -264 -> 303
    //   570: aload_0
    //   571: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   574: goto -271 -> 303
    //   577: astore_0
    //   578: goto -275 -> 303
    //   581: astore_3
    //   582: aconst_null
    //   583: astore_0
    //   584: aconst_null
    //   585: astore 6
    //   587: aconst_null
    //   588: astore 5
    //   590: aconst_null
    //   591: astore_1
    //   592: aload 5
    //   594: ifnull +8 -> 602
    //   597: aload 5
    //   599: invokevirtual 2917	java/io/BufferedReader:close	()V
    //   602: aload 6
    //   604: ifnull +8 -> 612
    //   607: aload 6
    //   609: invokevirtual 2918	java/io/InputStreamReader:close	()V
    //   612: aload_1
    //   613: ifnull +7 -> 620
    //   616: aload_1
    //   617: invokevirtual 2921	java/io/InputStream:close	()V
    //   620: aload_0
    //   621: ifnull +7 -> 628
    //   624: aload_0
    //   625: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   628: ldc_w 2891
    //   631: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   634: aload_3
    //   635: athrow
    //   636: astore_0
    //   637: goto -9 -> 628
    //   640: astore_3
    //   641: aconst_null
    //   642: astore 6
    //   644: aconst_null
    //   645: astore 5
    //   647: aconst_null
    //   648: astore_1
    //   649: goto -57 -> 592
    //   652: astore_3
    //   653: aconst_null
    //   654: astore 6
    //   656: aconst_null
    //   657: astore 5
    //   659: goto -67 -> 592
    //   662: astore_3
    //   663: aconst_null
    //   664: astore_0
    //   665: aconst_null
    //   666: astore 6
    //   668: aconst_null
    //   669: astore 5
    //   671: goto -79 -> 592
    //   674: astore_3
    //   675: aconst_null
    //   676: astore 6
    //   678: aconst_null
    //   679: astore 5
    //   681: goto -89 -> 592
    //   684: astore 5
    //   686: aload_3
    //   687: astore 6
    //   689: aconst_null
    //   690: astore 7
    //   692: aload 5
    //   694: astore_3
    //   695: aload 7
    //   697: astore 5
    //   699: goto -107 -> 592
    //   702: astore 7
    //   704: aload_3
    //   705: astore 6
    //   707: aload 7
    //   709: astore_3
    //   710: goto -118 -> 592
    //   713: astore_3
    //   714: goto -122 -> 592
    //   717: astore_0
    //   718: goto -415 -> 303
    //   721: astore_3
    //   722: aconst_null
    //   723: astore_0
    //   724: aconst_null
    //   725: astore 6
    //   727: aconst_null
    //   728: astore 5
    //   730: aconst_null
    //   731: astore_1
    //   732: goto -470 -> 262
    //   735: astore_3
    //   736: aconst_null
    //   737: astore 6
    //   739: aconst_null
    //   740: astore 5
    //   742: aconst_null
    //   743: astore_1
    //   744: goto -482 -> 262
    //   747: astore_3
    //   748: aconst_null
    //   749: astore 6
    //   751: aconst_null
    //   752: astore 5
    //   754: goto -492 -> 262
    //   757: astore_3
    //   758: aconst_null
    //   759: astore_0
    //   760: aconst_null
    //   761: astore 7
    //   763: aconst_null
    //   764: astore 5
    //   766: aload 6
    //   768: astore_1
    //   769: aload 7
    //   771: astore 6
    //   773: goto -511 -> 262
    //   776: astore_3
    //   777: aconst_null
    //   778: astore 6
    //   780: aconst_null
    //   781: astore 5
    //   783: goto -521 -> 262
    //   786: astore 5
    //   788: aload_3
    //   789: astore 6
    //   791: aconst_null
    //   792: astore 7
    //   794: aload 5
    //   796: astore_3
    //   797: aload 7
    //   799: astore 5
    //   801: goto -539 -> 262
    //   804: astore_0
    //   805: goto -256 -> 549
    //   808: astore_1
    //   809: goto -382 -> 427
    //   812: aconst_null
    //   813: astore_0
    //   814: goto -634 -> 180
    //
    // Exception table:
    //   from	to	target	type
    //   221	231	254	java/lang/Exception
    //   231	238	254	java/lang/Exception
    //   243	251	254	java/lang/Exception
    //   517	524	254	java/lang/Exception
    //   373	386	424	java/io/IOException
    //   390	397	424	java/io/IOException
    //   435	448	508	java/io/IOException
    //   465	472	508	java/io/IOException
    //   480	485	508	java/io/IOException
    //   562	566	577	java/io/IOException
    //   570	574	577	java/io/IOException
    //   109	143	581	finally
    //   143	157	581	finally
    //   157	180	581	finally
    //   327	350	581	finally
    //   373	386	581	finally
    //   390	397	581	finally
    //   597	602	636	java/io/IOException
    //   607	612	636	java/io/IOException
    //   616	620	636	java/io/IOException
    //   624	628	636	java/io/IOException
    //   184	190	640	finally
    //   190	194	652	finally
    //   402	407	662	finally
    //   435	448	662	finally
    //   465	472	662	finally
    //   480	485	662	finally
    //   198	207	674	finally
    //   207	221	684	finally
    //   221	231	702	finally
    //   231	238	702	finally
    //   243	251	702	finally
    //   517	524	702	finally
    //   262	267	713	finally
    //   272	277	717	java/io/IOException
    //   282	287	717	java/io/IOException
    //   291	295	717	java/io/IOException
    //   299	303	717	java/io/IOException
    //   109	143	721	java/lang/Exception
    //   143	157	721	java/lang/Exception
    //   157	180	721	java/lang/Exception
    //   327	350	721	java/lang/Exception
    //   373	386	721	java/lang/Exception
    //   390	397	721	java/lang/Exception
    //   184	190	735	java/lang/Exception
    //   190	194	747	java/lang/Exception
    //   402	407	757	java/lang/Exception
    //   435	448	757	java/lang/Exception
    //   465	472	757	java/lang/Exception
    //   480	485	757	java/lang/Exception
    //   198	207	776	java/lang/Exception
    //   207	221	786	java/lang/Exception
    //   524	533	804	java/io/IOException
    //   537	541	804	java/io/IOException
    //   545	549	804	java/io/IOException
    //   402	407	808	java/io/IOException
  }

  // ERROR //
  private static String readPexFile(String paramString1, String paramString2, DecryptListener paramDecryptListener)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_1
    //   3: istore 4
    //   5: ldc_w 2941
    //   8: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_1
    //   12: ldc 10
    //   14: invokevirtual 1368	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   17: ifne +285 -> 302
    //   20: iconst_1
    //   21: istore 5
    //   23: aload_0
    //   24: invokestatic 2896	com/tencent/ttpic/baseutils/FileUtils:getRealPath	(Ljava/lang/String;)Ljava/lang/String;
    //   27: astore 6
    //   29: new 867	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 868	java/lang/StringBuilder:<init>	()V
    //   36: aload 6
    //   38: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc_w 877
    //   44: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_1
    //   48: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 880	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore_0
    //   55: new 867	java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial 868	java/lang/StringBuilder:<init>	()V
    //   62: aload 6
    //   64: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc_w 877
    //   70: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_1
    //   74: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 880	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: astore 7
    //   82: new 1196	java/io/File
    //   85: astore_1
    //   86: aload_1
    //   87: aload_0
    //   88: invokespecial 2897	java/io/File:<init>	(Ljava/lang/String;)V
    //   91: new 1196	java/io/File
    //   94: astore 6
    //   96: aload 6
    //   98: aload 7
    //   100: invokespecial 2897	java/io/File:<init>	(Ljava/lang/String;)V
    //   103: aload_1
    //   104: invokevirtual 2900	java/io/File:exists	()Z
    //   107: ifeq +10 -> 117
    //   110: aload_1
    //   111: invokevirtual 2903	java/io/File:isFile	()Z
    //   114: ifne +19 -> 133
    //   117: aload 6
    //   119: invokevirtual 2900	java/io/File:exists	()Z
    //   122: ifeq +241 -> 363
    //   125: aload 6
    //   127: invokevirtual 2903	java/io/File:isFile	()Z
    //   130: ifeq +233 -> 363
    //   133: aload_1
    //   134: invokevirtual 2900	java/io/File:exists	()Z
    //   137: ifeq +171 -> 308
    //   140: aload_1
    //   141: invokevirtual 2903	java/io/File:isFile	()Z
    //   144: ifeq +164 -> 308
    //   147: new 2905	java/io/FileInputStream
    //   150: astore_0
    //   151: aload_0
    //   152: aload_1
    //   153: invokespecial 2908	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   156: iload 5
    //   158: ifne +194 -> 352
    //   161: aload_0
    //   162: aload_2
    //   163: invokestatic 2862	com/tencent/ttpic/util/VideoTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Lcom/tencent/ttpic/util/DecryptListener;)Ljava/io/InputStream;
    //   166: astore_1
    //   167: aload_0
    //   168: invokestatic 2911	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   171: aload_1
    //   172: ifnull +399 -> 571
    //   175: new 2864	java/io/InputStreamReader
    //   178: astore_2
    //   179: aload_2
    //   180: aload_1
    //   181: invokespecial 2867	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   184: new 2869	java/io/BufferedReader
    //   187: astore 8
    //   189: aload 8
    //   191: aload_2
    //   192: sipush 1024
    //   195: invokespecial 2872	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   198: new 867	java/lang/StringBuilder
    //   201: astore 7
    //   203: aload 7
    //   205: invokespecial 868	java/lang/StringBuilder:<init>	()V
    //   208: aload 8
    //   210: invokevirtual 2878	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   213: astore 6
    //   215: aload 6
    //   217: ifnull +294 -> 511
    //   220: aload 7
    //   222: aload 6
    //   224: invokevirtual 872	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: goto -20 -> 208
    //   231: astore 7
    //   233: aload_2
    //   234: astore 6
    //   236: aload 7
    //   238: astore_2
    //   239: getstatic 42	com/tencent/ttpic/util/VideoTemplateParser:TAG	Ljava/lang/String;
    //   242: aload_2
    //   243: invokevirtual 2914	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   246: aload_2
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokestatic 2944	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    //   254: aload 8
    //   256: ifnull +8 -> 264
    //   259: aload 8
    //   261: invokevirtual 2917	java/io/BufferedReader:close	()V
    //   264: aload 6
    //   266: ifnull +8 -> 274
    //   269: aload 6
    //   271: invokevirtual 2918	java/io/InputStreamReader:close	()V
    //   274: aload_1
    //   275: ifnull +7 -> 282
    //   278: aload_1
    //   279: invokevirtual 2921	java/io/InputStream:close	()V
    //   282: aload_0
    //   283: ifnull +7 -> 290
    //   286: aload_0
    //   287: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   290: ldc_w 2941
    //   293: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   296: aconst_null
    //   297: astore 6
    //   299: aload 6
    //   301: areturn
    //   302: iconst_0
    //   303: istore 5
    //   305: goto -282 -> 23
    //   308: aload 6
    //   310: invokevirtual 2900	java/io/File:exists	()Z
    //   313: ifeq +553 -> 866
    //   316: aload 6
    //   318: invokevirtual 2903	java/io/File:isFile	()Z
    //   321: ifeq +545 -> 866
    //   324: new 2905	java/io/FileInputStream
    //   327: dup
    //   328: aload 6
    //   330: invokespecial 2908	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   333: astore_0
    //   334: iload 5
    //   336: ifne +10 -> 346
    //   339: iload 4
    //   341: istore 5
    //   343: goto -187 -> 156
    //   346: iconst_0
    //   347: istore 5
    //   349: goto -6 -> 343
    //   352: aload_0
    //   353: astore_1
    //   354: aload_0
    //   355: astore_2
    //   356: aload_1
    //   357: astore_0
    //   358: aload_2
    //   359: astore_1
    //   360: goto -189 -> 171
    //   363: invokestatic 2928	com/tencent/ttpic/util/VideoGlobalContext:getContext	()Landroid/content/Context;
    //   366: invokevirtual 2934	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   369: aload_0
    //   370: invokevirtual 2940	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   373: astore 8
    //   375: iload 5
    //   377: ifne +29 -> 406
    //   380: aload 8
    //   382: aload_2
    //   383: invokestatic 2862	com/tencent/ttpic/util/VideoTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Lcom/tencent/ttpic/util/DecryptListener;)Ljava/io/InputStream;
    //   386: astore_0
    //   387: aload_0
    //   388: astore 6
    //   390: aload_0
    //   391: astore_1
    //   392: aload 8
    //   394: invokestatic 2911	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   397: aconst_null
    //   398: astore_2
    //   399: aload_0
    //   400: astore_1
    //   401: aload_2
    //   402: astore_0
    //   403: goto -232 -> 171
    //   406: aconst_null
    //   407: astore_0
    //   408: aload 8
    //   410: astore_1
    //   411: goto -240 -> 171
    //   414: astore_0
    //   415: aconst_null
    //   416: astore_0
    //   417: aload_0
    //   418: astore 8
    //   420: aload_0
    //   421: astore 6
    //   423: aload_0
    //   424: astore_1
    //   425: invokestatic 2928	com/tencent/ttpic/util/VideoGlobalContext:getContext	()Landroid/content/Context;
    //   428: invokevirtual 2934	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   431: aload 7
    //   433: invokevirtual 2940	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   436: astore 7
    //   438: iload 5
    //   440: ifne +48 -> 488
    //   443: iload_3
    //   444: istore 5
    //   446: iload 5
    //   448: ifne +46 -> 494
    //   451: aload_0
    //   452: astore 8
    //   454: aload_0
    //   455: astore 6
    //   457: aload_0
    //   458: astore_1
    //   459: aload 7
    //   461: aload_2
    //   462: invokestatic 2862	com/tencent/ttpic/util/VideoTemplateParser:drinkACupOfCoffee	(Ljava/io/InputStream;Lcom/tencent/ttpic/util/DecryptListener;)Ljava/io/InputStream;
    //   465: astore_0
    //   466: aload_0
    //   467: astore 8
    //   469: aload_0
    //   470: astore 6
    //   472: aload_0
    //   473: astore_1
    //   474: aload 7
    //   476: invokestatic 2911	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   479: aconst_null
    //   480: astore_2
    //   481: aload_0
    //   482: astore_1
    //   483: aload_2
    //   484: astore_0
    //   485: goto -314 -> 171
    //   488: iconst_0
    //   489: istore 5
    //   491: goto -45 -> 446
    //   494: aconst_null
    //   495: astore_0
    //   496: aload 7
    //   498: astore_1
    //   499: goto -328 -> 171
    //   502: astore_0
    //   503: aconst_null
    //   504: astore_0
    //   505: aload 8
    //   507: astore_1
    //   508: goto -337 -> 171
    //   511: aload 7
    //   513: invokevirtual 880	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   516: astore 6
    //   518: aload 8
    //   520: invokevirtual 2917	java/io/BufferedReader:close	()V
    //   523: aload_2
    //   524: invokevirtual 2918	java/io/InputStreamReader:close	()V
    //   527: aload_1
    //   528: ifnull +7 -> 535
    //   531: aload_1
    //   532: invokevirtual 2921	java/io/InputStream:close	()V
    //   535: aload_0
    //   536: ifnull +7 -> 543
    //   539: aload_0
    //   540: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   543: ldc_w 2941
    //   546: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   549: goto -250 -> 299
    //   552: astore_0
    //   553: getstatic 42	com/tencent/ttpic/util/VideoTemplateParser:TAG	Ljava/lang/String;
    //   556: aload_0
    //   557: invokevirtual 2945	java/io/IOException:getMessage	()Ljava/lang/String;
    //   560: aload_0
    //   561: iconst_0
    //   562: anewarray 4	java/lang/Object
    //   565: invokestatic 2944	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    //   568: goto -25 -> 543
    //   571: aload_1
    //   572: ifnull +7 -> 579
    //   575: aload_1
    //   576: invokevirtual 2921	java/io/InputStream:close	()V
    //   579: aload_0
    //   580: ifnull -290 -> 290
    //   583: aload_0
    //   584: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   587: goto -297 -> 290
    //   590: astore_0
    //   591: getstatic 42	com/tencent/ttpic/util/VideoTemplateParser:TAG	Ljava/lang/String;
    //   594: aload_0
    //   595: invokevirtual 2945	java/io/IOException:getMessage	()Ljava/lang/String;
    //   598: aload_0
    //   599: iconst_0
    //   600: anewarray 4	java/lang/Object
    //   603: invokestatic 2944	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    //   606: goto -316 -> 290
    //   609: astore_0
    //   610: getstatic 42	com/tencent/ttpic/util/VideoTemplateParser:TAG	Ljava/lang/String;
    //   613: aload_0
    //   614: invokevirtual 2945	java/io/IOException:getMessage	()Ljava/lang/String;
    //   617: aload_0
    //   618: iconst_0
    //   619: anewarray 4	java/lang/Object
    //   622: invokestatic 2944	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    //   625: goto -335 -> 290
    //   628: astore_2
    //   629: aconst_null
    //   630: astore_0
    //   631: aconst_null
    //   632: astore 6
    //   634: aconst_null
    //   635: astore 8
    //   637: aconst_null
    //   638: astore_1
    //   639: aload 8
    //   641: ifnull +8 -> 649
    //   644: aload 8
    //   646: invokevirtual 2917	java/io/BufferedReader:close	()V
    //   649: aload 6
    //   651: ifnull +8 -> 659
    //   654: aload 6
    //   656: invokevirtual 2918	java/io/InputStreamReader:close	()V
    //   659: aload_1
    //   660: ifnull +7 -> 667
    //   663: aload_1
    //   664: invokevirtual 2921	java/io/InputStream:close	()V
    //   667: aload_0
    //   668: ifnull +7 -> 675
    //   671: aload_0
    //   672: invokevirtual 2922	java/io/FileInputStream:close	()V
    //   675: ldc_w 2941
    //   678: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   681: aload_2
    //   682: athrow
    //   683: astore_0
    //   684: getstatic 42	com/tencent/ttpic/util/VideoTemplateParser:TAG	Ljava/lang/String;
    //   687: aload_0
    //   688: invokevirtual 2945	java/io/IOException:getMessage	()Ljava/lang/String;
    //   691: aload_0
    //   692: iconst_0
    //   693: anewarray 4	java/lang/Object
    //   696: invokestatic 2944	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    //   699: goto -24 -> 675
    //   702: astore_2
    //   703: aconst_null
    //   704: astore 6
    //   706: aconst_null
    //   707: astore 8
    //   709: aconst_null
    //   710: astore_1
    //   711: goto -72 -> 639
    //   714: astore_2
    //   715: aconst_null
    //   716: astore 6
    //   718: aconst_null
    //   719: astore 8
    //   721: goto -82 -> 639
    //   724: astore_2
    //   725: aconst_null
    //   726: astore_0
    //   727: aconst_null
    //   728: astore 7
    //   730: aconst_null
    //   731: astore 8
    //   733: aload 6
    //   735: astore_1
    //   736: aload 7
    //   738: astore 6
    //   740: goto -101 -> 639
    //   743: astore_2
    //   744: aconst_null
    //   745: astore 6
    //   747: aconst_null
    //   748: astore 8
    //   750: goto -111 -> 639
    //   753: astore 8
    //   755: aload_2
    //   756: astore 6
    //   758: aconst_null
    //   759: astore 7
    //   761: aload 8
    //   763: astore_2
    //   764: aload 7
    //   766: astore 8
    //   768: goto -129 -> 639
    //   771: astore 7
    //   773: aload_2
    //   774: astore 6
    //   776: aload 7
    //   778: astore_2
    //   779: goto -140 -> 639
    //   782: astore_2
    //   783: goto -144 -> 639
    //   786: astore_2
    //   787: aconst_null
    //   788: astore_0
    //   789: aconst_null
    //   790: astore 6
    //   792: aconst_null
    //   793: astore 8
    //   795: aconst_null
    //   796: astore_1
    //   797: goto -558 -> 239
    //   800: astore_2
    //   801: aconst_null
    //   802: astore 6
    //   804: aconst_null
    //   805: astore 8
    //   807: aconst_null
    //   808: astore_1
    //   809: goto -570 -> 239
    //   812: astore_2
    //   813: aconst_null
    //   814: astore 6
    //   816: aconst_null
    //   817: astore 8
    //   819: goto -580 -> 239
    //   822: astore_2
    //   823: aconst_null
    //   824: astore_0
    //   825: aconst_null
    //   826: astore 6
    //   828: aconst_null
    //   829: astore 8
    //   831: goto -592 -> 239
    //   834: astore_2
    //   835: aconst_null
    //   836: astore 6
    //   838: aconst_null
    //   839: astore 8
    //   841: goto -602 -> 239
    //   844: astore 8
    //   846: aload_2
    //   847: astore 6
    //   849: aconst_null
    //   850: astore 7
    //   852: aload 8
    //   854: astore_2
    //   855: aload 7
    //   857: astore 8
    //   859: goto -620 -> 239
    //   862: astore_1
    //   863: goto -446 -> 417
    //   866: aconst_null
    //   867: astore_0
    //   868: goto -712 -> 156
    //
    // Exception table:
    //   from	to	target	type
    //   198	208	231	java/lang/Exception
    //   208	215	231	java/lang/Exception
    //   220	228	231	java/lang/Exception
    //   511	518	231	java/lang/Exception
    //   363	375	414	java/io/IOException
    //   380	387	414	java/io/IOException
    //   425	438	502	java/io/IOException
    //   459	466	502	java/io/IOException
    //   474	479	502	java/io/IOException
    //   518	527	552	java/io/IOException
    //   531	535	552	java/io/IOException
    //   539	543	552	java/io/IOException
    //   575	579	590	java/io/IOException
    //   583	587	590	java/io/IOException
    //   259	264	609	java/io/IOException
    //   269	274	609	java/io/IOException
    //   278	282	609	java/io/IOException
    //   286	290	609	java/io/IOException
    //   82	117	628	finally
    //   117	133	628	finally
    //   133	156	628	finally
    //   308	334	628	finally
    //   363	375	628	finally
    //   380	387	628	finally
    //   644	649	683	java/io/IOException
    //   654	659	683	java/io/IOException
    //   663	667	683	java/io/IOException
    //   671	675	683	java/io/IOException
    //   161	167	702	finally
    //   167	171	714	finally
    //   392	397	724	finally
    //   425	438	724	finally
    //   459	466	724	finally
    //   474	479	724	finally
    //   175	184	743	finally
    //   184	198	753	finally
    //   198	208	771	finally
    //   208	215	771	finally
    //   220	228	771	finally
    //   511	518	771	finally
    //   239	254	782	finally
    //   82	117	786	java/lang/Exception
    //   117	133	786	java/lang/Exception
    //   133	156	786	java/lang/Exception
    //   308	334	786	java/lang/Exception
    //   363	375	786	java/lang/Exception
    //   380	387	786	java/lang/Exception
    //   161	167	800	java/lang/Exception
    //   167	171	812	java/lang/Exception
    //   392	397	822	java/lang/Exception
    //   425	438	822	java/lang/Exception
    //   459	466	822	java/lang/Exception
    //   474	479	822	java/lang/Exception
    //   175	184	834	java/lang/Exception
    //   184	198	844	java/lang/Exception
    //   392	397	862	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoTemplateParser
 * JD-Core Version:    0.6.2
 */
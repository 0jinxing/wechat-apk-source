package com.tencent.ttpic.filter;

import android.graphics.PointF;
import android.text.TextUtils;
import com.tencent.filter.m.a;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.PTDetectInfo.Builder;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.device.DeviceInstance;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.DistortionItem;
import com.tencent.ttpic.model.FaceMeshItem;
import com.tencent.ttpic.model.MeshDistortionType;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.TRIGGERED_STATUS;
import com.tencent.ttpic.model.TriggerCtrlItem;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.TransformUtil;
import com.tencent.ttpic.util.VideoFilterUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import com.tencent.ttpic.util.VideoMaterialUtil.DISTORTION_ITEM_FILED;
import com.tencent.ttpic.util.VideoMaterialUtil.FIELD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TransformFilter extends VideoFilterBase
{
  private static final List<DistortionItem> EMPTY;
  private static final int MESH_DISTORTION_TYPE_COUNT = 30;
  private static final int XCOORD_NUM = 50;
  private static final int YCOORD_NUM = 66;
  private static List<PointF> mFullscreenVerticesPortrait;
  private static List<PointF> mInitTextureCoordinatesPortrait;
  float anotherStrength;
  private String dataPath;
  private float faceHeight;
  private float faceWidth;
  private float[] flatMesh;
  private List<DistortionItem> items;
  private FaceMeshItem mFaceMeshItem;
  private int mLastMeshIndex;
  private Map<String, List<DistortionItem>> mMeshCache;
  private MeshDistortionType[] meshs;
  private boolean optimizeBoundary;
  private float optimizeBoundaryStrength;
  private float screenRatioX;
  private float screenRatioY;
  private List<StickerItem> stickerItems;
  private TriggerCtrlItem triggerCtrlItem;

  static
  {
    AppMethodBeat.i(83037);
    EMPTY = new ArrayList();
    mFullscreenVerticesPortrait = VideoMaterialUtil.genFullScreenVertices(50, 66, -1.0F, 1.0F, -1.0F, 1.0F);
    mInitTextureCoordinatesPortrait = VideoMaterialUtil.genFullScreenVertices(50, 66, 0.0F, 1.0F, 0.0F, 1.0F);
    AppMethodBeat.o(83037);
  }

  public TransformFilter(FaceMeshItem paramFaceMeshItem, String paramString)
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.TRANSFORM);
    AppMethodBeat.i(83022);
    this.meshs = new MeshDistortionType[30];
    this.flatMesh = new float['Ò'];
    this.mLastMeshIndex = -1;
    this.mMeshCache = new HashMap();
    this.optimizeBoundary = true;
    this.optimizeBoundaryStrength = 0.25F;
    this.screenRatioX = 1.0F;
    this.screenRatioY = 1.0F;
    this.anotherStrength = 1.0F;
    this.mFaceMeshItem = paramFaceMeshItem;
    this.dataPath = paramString;
    this.items = EMPTY;
    this.triggerCtrlItem = new TriggerCtrlItem(this.mFaceMeshItem);
    initParams();
    AppMethodBeat.o(83022);
  }

  public TransformFilter(List<DistortionItem> paramList, List<StickerItem> paramList1)
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.TRANSFORM);
    AppMethodBeat.i(83021);
    this.meshs = new MeshDistortionType[30];
    this.flatMesh = new float['Ò'];
    this.mLastMeshIndex = -1;
    this.mMeshCache = new HashMap();
    this.optimizeBoundary = true;
    this.optimizeBoundaryStrength = 0.25F;
    this.screenRatioX = 1.0F;
    this.screenRatioY = 1.0F;
    this.anotherStrength = 1.0F;
    this.items = paramList;
    this.stickerItems = paramList1;
    this.triggerCtrlItem = new TriggerCtrlItem();
    initParams();
    AppMethodBeat.o(83021);
  }

  private List<DistortionItem> getNextFrame(int paramInt)
  {
    AppMethodBeat.i(83028);
    Object localObject1 = this.mFaceMeshItem.id + "_" + paramInt;
    if (!this.mMeshCache.containsKey(localObject1))
    {
      ArrayList localArrayList = new ArrayList();
      Object localObject2 = FileUtils.load(VideoGlobalContext.getContext(), this.dataPath + "/" + this.mFaceMeshItem.id, (String)localObject1 + ".json");
      if (!TextUtils.isEmpty((CharSequence)localObject2))
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>((String)localObject2);
          localObject2 = localJSONObject.optJSONArray(VideoMaterialUtil.FIELD.DISTORTION_LIST.value);
          if (localObject2 != null)
            for (paramInt = 0; paramInt < ((JSONArray)localObject2).length(); paramInt++)
            {
              DistortionItem localDistortionItem = new com/tencent/ttpic/model/DistortionItem;
              localDistortionItem.<init>();
              localJSONObject = ((JSONArray)localObject2).getJSONObject(paramInt);
              localDistortionItem.position = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.POSITION.value);
              localDistortionItem.distortion = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.DISTORTION.value);
              localDistortionItem.direction = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.DIRECTION.value);
              localDistortionItem.radius = ((float)localJSONObject.optDouble(VideoMaterialUtil.DISTORTION_ITEM_FILED.RADIUS.value));
              localDistortionItem.strength = ((float)localJSONObject.optDouble(VideoMaterialUtil.DISTORTION_ITEM_FILED.STRENGH.value));
              localDistortionItem.x = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.X.value);
              localDistortionItem.y = localJSONObject.optInt(VideoMaterialUtil.DISTORTION_ITEM_FILED.Y.value);
              localArrayList.add(localDistortionItem);
            }
        }
        catch (JSONException localJSONException)
        {
        }
      this.mMeshCache.put(localObject1, localArrayList);
    }
    localObject1 = (List)this.mMeshCache.get(localObject1);
    AppMethodBeat.o(83028);
    return localObject1;
  }

  private float getStrengthAdjust(int paramInt)
  {
    AppMethodBeat.i(83031);
    if ("OPPO_X909".equals(DeviceInstance.getInstance().getDeviceName()));
    for (float f1 = 0.2F; ; f1 = 1.0F)
    {
      float f2 = f1;
      if (this.optimizeBoundary)
      {
        f2 = f1;
        if (this.faceWidth > 0.0F)
        {
          f2 = f1;
          if (this.width > 0)
          {
            f2 = f1;
            if (this.mFaceDetScale > 0.0D)
            {
              float f3 = this.faceWidth;
              float f4 = this.optimizeBoundaryStrength;
              float f5 = this.width * (float)this.mFaceDetScale;
              f2 = this.height * (float)this.mFaceDetScale;
              float f6 = Math.min(f5, f2);
              f3 = Math.min(0.15F * f6, Math.min(f3 * f4, f6 * this.meshs[paramInt].radius));
              f2 = f1 * (Math.min(Math.min(Math.min(1.0F, Math.max(0.0F, (this.meshs[paramInt].point.x + this.meshs[paramInt].offsetX) / f3)), Math.min(1.0F, Math.max(0.0F, (f5 - this.meshs[paramInt].point.x - this.meshs[paramInt].offsetX) / f3))), Math.min(Math.min(1.0F, Math.max(0.0F, (this.meshs[paramInt].point.y + this.meshs[paramInt].offsetY) / f3)), Math.min(1.0F, Math.max(0.0F, (f2 - this.meshs[paramInt].point.y - this.meshs[paramInt].offsetY) / f3)))) * 0.9F + 0.1F);
            }
          }
        }
      }
      AppMethodBeat.o(83031);
      return f2;
    }
  }

  private TRIGGERED_STATUS updateActionTriggered(Set<Integer> paramSet, long paramLong)
  {
    AppMethodBeat.i(83026);
    paramSet = new PTDetectInfo.Builder().triggeredExpression(paramSet).timestamp(paramLong).build();
    paramSet = this.triggerCtrlItem.getTriggeredStatus(paramSet);
    AppMethodBeat.o(83026);
    return paramSet;
  }

  private void updateMeshParam()
  {
    AppMethodBeat.i(83027);
    int i = this.triggerCtrlItem.getFrameIndex();
    if (i == this.mLastMeshIndex)
      AppMethodBeat.o(83027);
    while (true)
    {
      return;
      this.items = getNextFrame(i);
      this.mLastMeshIndex = i;
      AppMethodBeat.o(83027);
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(83033);
    super.ApplyGLSLFilter();
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLE_STRIP);
    AppMethodBeat.o(83033);
  }

  public FaceMeshItem getFaceMeshItem()
  {
    return this.mFaceMeshItem;
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(83023);
    setPositions(VideoMaterialUtil.toFlatArray((PointF[])mFullscreenVerticesPortrait.toArray(new PointF[0])), false);
    setTexCords(VideoMaterialUtil.toFlatArray((PointF[])mInitTextureCoordinatesPortrait.toArray(new PointF[0])), false);
    setCoordNum(6651);
    AppMethodBeat.o(83023);
  }

  public void initParams()
  {
    AppMethodBeat.i(83024);
    addParam(new m.f("screenRatioX", 0.0F));
    addParam(new m.f("screenRatioY", 0.0F));
    addParam(new m.a("item", this.flatMesh));
    addParam(new m.f("faceRatio", 1.0F));
    addParam(new m.f("sin_roll", 0.0F));
    addParam(new m.f("cos_roll", 0.0F));
    addParam(new m.f("tan_yaw", 0.0F));
    addParam(new m.f("cos_yaw", 0.0F));
    addParam(new m.f("tan_pitch", 0.0F));
    addParam(new m.f("cos_pitch", 0.0F));
    for (int i = 0; i < 30; i++)
      this.meshs[i] = new MeshDistortionType();
    AppMethodBeat.o(83024);
  }

  public void reset()
  {
    AppMethodBeat.i(83034);
    this.triggerCtrlItem.reset();
    AppMethodBeat.o(83034);
  }

  public void setDistortionItems(List<DistortionItem> paramList)
  {
    this.items = paramList;
  }

  public void setOptimizeBoundary(boolean paramBoolean)
  {
    this.optimizeBoundary = paramBoolean;
  }

  public void setRenderForBitmap(boolean paramBoolean)
  {
    AppMethodBeat.i(83035);
    this.triggerCtrlItem.setRenderForBitmap(paramBoolean);
    AppMethodBeat.o(83035);
  }

  public void setTriggerWords(String paramString)
  {
    AppMethodBeat.i(83036);
    this.triggerCtrlItem.setTriggerWords(paramString);
    AppMethodBeat.o(83036);
  }

  public void updateFaceFeatures(List<PointF> paramList)
  {
    AppMethodBeat.i(83030);
    if ((paramList == null) || (paramList.size() < 131))
      AppMethodBeat.o(83030);
    while (true)
    {
      return;
      float f1 = ((PointF)paramList.get(18)).x - ((PointF)paramList.get(0)).x;
      float f2 = ((PointF)paramList.get(18)).y - ((PointF)paramList.get(0)).y;
      float f3 = ((PointF)paramList.get(9)).x - ((PointF)paramList.get(89)).x;
      float f4 = ((PointF)paramList.get(9)).y - ((PointF)paramList.get(89)).y;
      this.faceWidth = ((float)Math.sqrt(f1 * f1 + f2 * f2));
      this.faceHeight = ((float)Math.sqrt(f4 * f4 + f3 * f3));
      f4 = this.faceHeight / this.faceWidth;
      f2 = ((PointF)paramList.get(9)).x;
      f1 = ((PointF)paramList.get(84)).x;
      float f5 = -((PointF)paramList.get(9)).y;
      f3 = ((PointF)paramList.get(84)).y;
      f2 = (float)(Math.atan2(f2 - f1, f3 + f5) + 3.141592653589793D);
      f5 = this.height / this.width;
      f1 = (float)(2.0D / (this.width * this.mFaceDetScale));
      f3 = (float)(2.0D / (this.height * this.mFaceDetScale));
      PointF localPointF1 = new PointF();
      PointF localPointF2 = new PointF();
      PointF localPointF3 = new PointF();
      for (int i = 0; i < 131; i++)
        if ((i < 99) || (i > 106))
        {
          localPointF1.x = (((PointF)paramList.get(i)).x * f1 - 1.0F);
          localPointF1.y = (((PointF)paramList.get(i)).y * f3 - 1.0F);
          int j = 0;
          if (j < this.meshs.length)
          {
            float f7;
            float f8;
            if (this.meshs[j].type > 0)
            {
              localPointF2.x = ((this.meshs[j].point.x + this.meshs[j].offsetX) * f1 - 1.0F);
              localPointF2.y = (((this.meshs[j].point.y + this.meshs[j].offsetY) * f3 - 1.0F) * f5);
              localPointF3.x = localPointF1.x;
              localPointF1.y *= f5;
              f6 = AlgoUtils.getDistance(localPointF2, localPointF3);
              if (f6 < this.meshs[j].radius)
              {
                f7 = f6 / this.meshs[j].radius;
                f8 = localPointF2.x - localPointF3.x;
                f6 = (localPointF2.y - localPointF3.y) / f5;
                if (this.meshs[j].type != 1)
                  break label698;
                f7 = (float)(1.5D * (1.0D - Math.sin(f7 * 3.1415D * 0.5D)) * this.meshs[j].strength);
                localPointF1.x -= f8 * f7;
                localPointF1.y -= f7 * f6;
              }
            }
            label698: 
            do
              while (true)
              {
                j++;
                break;
                if (this.meshs[j].type != 2)
                  break label772;
                f7 = (float)(Math.cos(1.57075D * f7) * this.meshs[j].strength);
                localPointF1.x = (f8 * f7 + localPointF1.x);
                localPointF1.y = (f7 * f6 + localPointF1.y);
              }
            while (this.meshs[j].type != 3);
            label772: float f6 = (float)(Math.cos(f7 * 1.57075D) * this.meshs[j].radius * 0.5D / f4 * this.meshs[j].strength);
            PointF localPointF4 = new PointF(f4, f4 / f5);
            if (this.meshs[j].direction == 1.0F)
            {
              f8 = localPointF4.x;
              localPointF4.x = (-f6 * f8);
              localPointF4.y = 0.0F;
            }
            while (true)
            {
              localPointF1.x = ((float)(localPointF1.x + (localPointF4.x * Math.cos(f2) - localPointF4.y * Math.sin(f2))));
              double d1 = localPointF1.y;
              double d2 = localPointF4.y;
              double d3 = Math.cos(f2);
              localPointF1.y = ((float)((localPointF4.x * Math.sin(f2) + d2 * d3) / f5 + d1));
              break;
              if (this.meshs[j].direction == 2.0F)
              {
                localPointF4.x = 0.0F;
                f8 = localPointF4.y;
                localPointF4.y = (-f6 * f8);
              }
              else if (this.meshs[j].direction == 3.0F)
              {
                localPointF4.x = (f6 * localPointF4.x);
                localPointF4.y = 0.0F;
              }
              else if (this.meshs[j].direction == 4.0F)
              {
                localPointF4.x = 0.0F;
                localPointF4.y = (f6 * localPointF4.y);
              }
              else if (this.meshs[j].direction == 5.0F)
              {
                localPointF4.x *= -f6;
                f8 = localPointF4.y;
                localPointF4.y = (-f6 * f8);
              }
              else if (this.meshs[j].direction == 6.0F)
              {
                localPointF4.x *= f6;
                f8 = localPointF4.y;
                localPointF4.y = (-f6 * f8);
              }
              else if (this.meshs[j].direction == 7.0F)
              {
                localPointF4.x *= -f6;
                localPointF4.y = (f6 * localPointF4.y);
              }
              else if (this.meshs[j].direction == 8.0F)
              {
                localPointF4.x *= f6;
                localPointF4.y = (f6 * localPointF4.y);
              }
              else
              {
                localPointF4.x = 0.0F;
                localPointF4.y = 0.0F;
              }
            }
          }
          ((PointF)paramList.get(i)).x = ((localPointF1.x + 1.0F) / f1);
          ((PointF)paramList.get(i)).y = ((localPointF1.y + 1.0F) / f3);
        }
      AppMethodBeat.o(83030);
    }
  }

  public void updateParams(List<PointF> paramList, Set<Integer> paramSet, double paramDouble, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(83029);
    Object localObject = VideoMaterialUtil.copyList(paramList);
    Arrays.fill(this.flatMesh, -1.0F);
    if ((localObject == null) || (((List)localObject).size() < 90) || (BaseUtils.isEmpty(this.items)) || (!VideoFilterUtil.actionTriggered(paramList, this.stickerItems, paramSet)))
      addParam(new m.f("faceRatio", 1.0F));
    while (true)
    {
      addParam(new m.a("item", this.flatMesh));
      AppMethodBeat.o(83029);
      return;
      List localList = TransformUtil.getFullPoints((List)localObject);
      float f1 = ((PointF)localList.get(18)).x - ((PointF)localList.get(0)).x;
      float f2 = ((PointF)localList.get(18)).y - ((PointF)localList.get(0)).y;
      float f3 = ((PointF)localList.get(9)).x - ((PointF)localList.get(89)).x;
      float f4 = ((PointF)localList.get(9)).y - ((PointF)localList.get(89)).y;
      this.faceWidth = ((float)Math.sqrt(f1 * f1 + f2 * f2));
      this.faceHeight = ((float)Math.sqrt(f4 * f4 + f3 * f3));
      f2 = this.faceHeight / this.faceWidth;
      float f5 = ((PointF)localList.get(9)).x;
      f1 = ((PointF)localList.get(84)).x;
      f4 = -((PointF)localList.get(9)).y;
      f3 = ((PointF)localList.get(84)).y;
      float f6 = (float)(Math.atan2(f5 - f1, f3 + f4) + 3.141592653589793D);
      PointF localPointF1 = new PointF((float)(((PointF)localList.get(9)).x * 2.0F / paramDouble / this.width - 1.0D), (float)(((PointF)localList.get(9)).y * 2.0F / paramDouble / this.height - 1.0D) * this.height / this.width);
      paramSet = new PointF((float)(((PointF)localList.get(89)).x * 2.0F / paramDouble / this.width - 1.0D), (float)(((PointF)localList.get(89)).y * 2.0F / paramDouble / this.height - 1.0D) * this.height / this.width);
      f5 = AlgoUtils.getDistance(localPointF1, paramSet);
      float f7 = (float)Math.min(0.8353981633974483D, Math.max(-0.8353981633974483D, paramArrayOfFloat[1] * 1.5D));
      f1 = (float)Math.tan(f7);
      f3 = (float)Math.cos(f7);
      float f8 = ((PointF)localList.get(43)).x;
      float f9 = (((PointF)localList.get(9)).x - ((PointF)localList.get(43)).x) / 3.0F;
      f4 = ((PointF)localList.get(43)).y;
      localObject = new PointF(f8 + f9, (((PointF)localList.get(9)).y - ((PointF)localList.get(43)).y) / 3.0F + f4);
      ((PointF)localObject).x = ((float)(2.0F * ((PointF)localObject).x / paramDouble / this.width - 1.0D));
      ((PointF)localObject).y = ((float)(2.0F * ((PointF)localObject).y / paramDouble / this.height - 1.0D) * this.height / this.width);
      f9 = ((PointF)localList.get(53)).x;
      f8 = (((PointF)localList.get(9)).x - ((PointF)localList.get(53)).x) / 3.0F;
      f4 = ((PointF)localList.get(53)).y;
      paramList = new PointF(f9 + f8, (((PointF)localList.get(9)).y - ((PointF)localList.get(53)).y) / 3.0F + f4);
      paramList.x = ((float)(2.0F * paramList.x / paramDouble / this.width - 1.0D));
      paramList.y = ((float)(2.0F * paramList.y / paramDouble / this.height - 1.0D) * this.height / this.width);
      f8 = AlgoUtils.getDistance((PointF)localObject, paramList);
      f9 = (float)Math.min(0.8353981633974483D, Math.max(-0.8353981633974483D, paramArrayOfFloat[0] * 1.4D));
      Math.tan(f9);
      f4 = (float)Math.cos(f9);
      float f10 = (float)Math.cos(f6);
      float f11 = (float)Math.sin(f6);
      int i = localList.size();
      for (int j = 0; j < this.items.size(); j++)
      {
        paramArrayOfFloat = (DistortionItem)this.items.get(j);
        this.meshs[j].type = paramArrayOfFloat.distortion;
        if (paramArrayOfFloat.position < i)
          this.meshs[j].point = ((PointF)localList.get(paramArrayOfFloat.position));
        float f12 = getStrengthAdjust(j);
        this.meshs[j].strength = (f12 * paramArrayOfFloat.strength);
        this.meshs[j].radius = ((float)(paramArrayOfFloat.radius * this.faceWidth / paramDouble / Math.min(this.width, this.height) / 375.0D));
        f12 = paramArrayOfFloat.x * f3;
        float f13 = paramArrayOfFloat.y * f4;
        this.meshs[j].offsetX = ((f12 * f10 + f13 * f11) * this.faceWidth / 375.0F);
        this.meshs[j].offsetY = ((f12 * f11 - f13 * f10) * this.faceWidth / 375.0F);
        this.meshs[j].direction = paramArrayOfFloat.direction;
        if ((paramArrayOfFloat.distortion == 4) || (paramArrayOfFloat.distortion == 5))
        {
          PointF localPointF2 = (PointF)localList.get(paramArrayOfFloat.direction);
          f12 = (paramArrayOfFloat.targetDx * f10 * f3 + paramArrayOfFloat.targetDy * f11 * f4) * this.faceWidth / 375.0F;
          f13 = (paramArrayOfFloat.targetDx * f11 * f3 - paramArrayOfFloat.targetDy * f10 * f4) * this.faceWidth / 375.0F;
          this.meshs[j].direction = ((float)Math.atan2(f13 + localPointF2.y - this.meshs[j].point.y - this.meshs[j].offsetY, localPointF2.x + f12 - this.meshs[j].point.x - this.meshs[j].offsetX));
          if (paramArrayOfFloat.distortion == 5)
            this.meshs[j].direction = (3.141593F + this.meshs[j].direction);
        }
        this.meshs[j].faceDegree = f6;
        this.meshs[j].faceRatio = f2;
      }
      for (j = this.items.size(); j < 30; j++)
        this.meshs[j].type = -1;
      i = 0;
      for (j = 0; j < this.items.size(); j++)
      {
        paramArrayOfFloat = this.flatMesh;
        int k = i + 1;
        paramArrayOfFloat[i] = this.meshs[j].type;
        paramArrayOfFloat = this.flatMesh;
        int m = k + 1;
        paramArrayOfFloat[k] = this.meshs[j].strength;
        f11 = (float)(2.0F * (this.meshs[j].point.x + this.meshs[j].offsetX) / paramDouble / this.width - 1.0D);
        f10 = (float)(2.0F * (this.meshs[j].point.y + this.meshs[j].offsetY) / paramDouble / this.height - 1.0D);
        paramArrayOfFloat = this.flatMesh;
        i = m + 1;
        paramArrayOfFloat[m] = (this.screenRatioX * f11);
        paramArrayOfFloat = this.flatMesh;
        k = i + 1;
        paramArrayOfFloat[i] = (this.screenRatioY * f10);
        f4 = AlgoUtils.distanceOfPoint2Line(localPointF1, paramSet, f5, new PointF(f11, this.height * f10 / this.width)) * f1;
        f3 = f4;
        if ((localPointF1.x - paramSet.x) * (f10 - paramSet.y) - (localPointF1.y - paramSet.y) * (f11 - paramSet.x) > 0.0F)
          f3 = -f4;
        AlgoUtils.distanceOfPoint2Line((PointF)localObject, paramList, f8, new PointF(f11, f10 * this.height / this.width));
        f4 = ((PointF)localObject).x;
        f4 = paramList.x;
        f4 = paramList.y;
        f4 = ((PointF)localObject).y;
        f4 = paramList.y;
        f4 = paramList.x;
        f3 = 2.5F + f3;
        this.meshs[j].radius = (this.meshs[j].radius * 2.5F / f3);
        paramArrayOfFloat = this.flatMesh;
        i = k + 1;
        paramArrayOfFloat[k] = this.meshs[j].radius;
        paramArrayOfFloat = this.flatMesh;
        k = i + 1;
        paramArrayOfFloat[i] = this.meshs[j].direction;
        paramArrayOfFloat = this.flatMesh;
        i = k + 1;
        paramArrayOfFloat[k] = f3;
      }
      addParam(new m.f("faceRatio", f2));
      addParam(new m.f("sin_roll", (float)Math.sin(f6)));
      addParam(new m.f("cos_roll", (float)Math.cos(f6)));
      addParam(new m.f("tan_yaw", (float)Math.tan(f7)));
      addParam(new m.f("cos_yaw", (float)Math.cos(f7)));
      addParam(new m.f("tan_pitch", (float)Math.tan(f9)));
      addParam(new m.f("cos_pitch", (float)Math.cos(f9)));
    }
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(83025);
    float[] arrayOfFloat = paramPTDetectInfo.faceAngles;
    if ((paramPTDetectInfo.phoneAngle == 90.0F) || (paramPTDetectInfo.phoneAngle == 270.0F))
    {
      arrayOfFloat = new float[3];
      arrayOfFloat[0] = (-paramPTDetectInfo.faceAngles[1]);
      arrayOfFloat[1] = (-paramPTDetectInfo.faceAngles[0]);
      arrayOfFloat[2] = paramPTDetectInfo.faceAngles[2];
    }
    if (this.dataPath != null)
    {
      updateActionTriggered(paramPTDetectInfo.triggeredExpression, paramPTDetectInfo.timestamp);
      if (this.triggerCtrlItem.isTriggered())
        break label132;
      this.items = EMPTY;
      this.mLastMeshIndex = -1;
    }
    while (true)
    {
      updateParams(paramPTDetectInfo.facePoints, paramPTDetectInfo.triggeredExpression, this.mFaceDetScale, arrayOfFloat);
      AppMethodBeat.o(83025);
      return;
      label132: updateMeshParam();
    }
  }

  public void updateStrength(float paramFloat)
  {
    this.anotherStrength = paramFloat;
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(83032);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    float f2 = this.height / this.width;
    if (f2 > 1.0F);
    for (float f3 = 1.0F; ; f3 = 1.0F / f2)
    {
      this.screenRatioX = f3;
      f3 = f1;
      if (f2 > 1.0F)
        f3 = f2;
      this.screenRatioY = f3;
      addParam(new m.f("screenRatioX", this.screenRatioX));
      addParam(new m.f("screenRatioY", this.screenRatioY));
      AppMethodBeat.o(83032);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.TransformFilter
 * JD-Core Version:    0.6.2
 */
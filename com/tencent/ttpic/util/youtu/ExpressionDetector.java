package com.tencent.ttpic.util.youtu;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.facedetect.FaceInfo;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.VideoMaterialUtil.EXPRESSION_TYPE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExpressionDetector
{
  private static final int FACE_QUEUE_MAX_SIZE = 30;
  private static final String TAG;
  private static ThreadLocal<ExpressionDetector> mInstance;
  private List<LinkedList<FaceInfo>> mFaceQueueList;

  static
  {
    AppMethodBeat.i(84347);
    TAG = ExpressionDetector.class.getSimpleName();
    mInstance = new ExpressionDetector.1();
    AppMethodBeat.o(84347);
  }

  ExpressionDetector()
  {
    AppMethodBeat.i(84319);
    this.mFaceQueueList = new ArrayList();
    AppMethodBeat.o(84319);
  }

  private double calDistanceSquare(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(84328);
    double d1 = Math.pow(paramPointF1.x - paramPointF2.x, 2.0D);
    double d2 = Math.pow(paramPointF1.y - paramPointF2.y, 2.0D);
    AppMethodBeat.o(84328);
    return d1 + d2;
  }

  private double calcDistanceOfFeaturePoints(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(84344);
    double d = Math.sqrt(Math.pow(paramFloat1 - paramFloat3, 2.0D) + Math.pow(paramFloat2 - paramFloat4, 2.0D));
    AppMethodBeat.o(84344);
    return d;
  }

  private void clearFaceQueue(int paramInt)
  {
    AppMethodBeat.i(84346);
    if (paramInt < this.mFaceQueueList.size())
      while (((LinkedList)this.mFaceQueueList.get(paramInt)).size() > 1)
        ((LinkedList)this.mFaceQueueList.get(paramInt)).removeLast();
    AppMethodBeat.o(84346);
  }

  public static ExpressionDetector getInstance()
  {
    AppMethodBeat.i(84318);
    ExpressionDetector localExpressionDetector = (ExpressionDetector)mInstance.get();
    AppMethodBeat.o(84318);
    return localExpressionDetector;
  }

  private boolean isExpressionDistanceChangeDetected(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(84329);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionDistanceChangeDetected(i, paramInt1, paramInt2))
      {
        bool = true;
        AppMethodBeat.o(84329);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84329);
    }
  }

  private boolean isExpressionDistanceChangeDetected(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(84330);
    if ((paramInt1 < 0) || (paramInt1 >= this.mFaceQueueList.size()) || (((LinkedList)this.mFaceQueueList.get(paramInt1)).isEmpty()))
    {
      AppMethodBeat.o(84330);
      bool = false;
      return bool;
    }
    FaceInfo localFaceInfo = (FaceInfo)((LinkedList)this.mFaceQueueList.get(paramInt1)).getFirst();
    double d = calDistanceSquare((PointF)localFaceInfo.points.get(paramInt2), (PointF)localFaceInfo.points.get(paramInt3));
    Iterator localIterator = ((LinkedList)this.mFaceQueueList.get(paramInt1)).iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localFaceInfo = (FaceInfo)localIterator.next();
    }
    while (d / calDistanceSquare((PointF)localFaceInfo.points.get(paramInt2), (PointF)localFaceInfo.points.get(paramInt3)) >= 0.5D);
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(84330);
      break;
    }
  }

  private boolean isExpressionJumpEyebrowDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84324);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionJumpEyebrowDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84324);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84324);
    }
  }

  private boolean isExpressionJumpEyebrowDetected(int paramInt)
  {
    AppMethodBeat.i(84325);
    if ((paramInt < 0) || (paramInt >= this.mFaceQueueList.size()) || (((LinkedList)this.mFaceQueueList.get(paramInt)).isEmpty()))
    {
      bool = false;
      AppMethodBeat.o(84325);
      return bool;
    }
    Object localObject = (FaceInfo)((LinkedList)this.mFaceQueueList.get(paramInt)).getFirst();
    double d = AlgoUtils.getDistance((PointF)((FaceInfo)localObject).points.get(26), (PointF)((FaceInfo)localObject).points.get(64)) / AlgoUtils.getDistance((PointF)((FaceInfo)localObject).points.get(24), (PointF)((FaceInfo)localObject).points.get(64));
    localObject = ((LinkedList)this.mFaceQueueList.get(paramInt)).listIterator();
    ((ListIterator)localObject).next();
    FaceInfo localFaceInfo;
    do
    {
      if (!((ListIterator)localObject).hasNext())
        break;
      localFaceInfo = (FaceInfo)((ListIterator)localObject).next();
    }
    while (1.04D * d > AlgoUtils.getDistance((PointF)localFaceInfo.points.get(26), (PointF)localFaceInfo.points.get(64)) / AlgoUtils.getDistance((PointF)localFaceInfo.points.get(24), (PointF)localFaceInfo.points.get(64)));
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(84325);
      break;
    }
  }

  private boolean isExpressionJumpEyebrowDetectedForAtLeastOneFace()
  {
    boolean bool = false;
    AppMethodBeat.i(84342);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionJumpEyebrowDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84342);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84342);
    }
  }

  private boolean isExpressionKissDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84339);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionKissDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84339);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84339);
    }
  }

  private boolean isExpressionKissDetected(int paramInt)
  {
    AppMethodBeat.i(84340);
    boolean bool;
    if ((paramInt < 0) || (paramInt >= this.mFaceQueueList.size()) || (((LinkedList)this.mFaceQueueList.get(paramInt)).isEmpty()))
    {
      AppMethodBeat.o(84340);
      bool = false;
    }
    while (true)
    {
      return bool;
      FaceInfo localFaceInfo = (FaceInfo)((LinkedList)this.mFaceQueueList.get(paramInt)).getFirst();
      if (AlgoUtils.getDistance((PointF)localFaceInfo.points.get(77), (PointF)localFaceInfo.points.get(69)) / AlgoUtils.getDistance((PointF)localFaceInfo.points.get(65), (PointF)localFaceInfo.points.get(66)) >= 0.55F)
      {
        bool = true;
        AppMethodBeat.o(84340);
      }
      else
      {
        AppMethodBeat.o(84340);
        bool = false;
      }
    }
  }

  private boolean isExpressionLeftEyeWinkDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84332);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionDistanceChangeDetected(i, 47, 51))
      {
        bool = true;
        AppMethodBeat.o(84332);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84332);
    }
  }

  private boolean isExpressionNodDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84333);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionNodDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84333);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84333);
    }
  }

  private boolean isExpressionNodDetected(int paramInt)
  {
    AppMethodBeat.i(84334);
    if ((paramInt < 0) || (paramInt >= this.mFaceQueueList.size()) || (((LinkedList)this.mFaceQueueList.get(paramInt)).isEmpty()))
    {
      AppMethodBeat.o(84334);
      bool = false;
      return bool;
    }
    float f1 = 100.0F;
    float f2 = (float)(((FaceInfo)((LinkedList)this.mFaceQueueList.get(paramInt)).getFirst()).angles[0] * 180.0F / 3.141592653589793D);
    Iterator localIterator = ((LinkedList)this.mFaceQueueList.get(paramInt)).iterator();
    label106: if (localIterator.hasNext())
    {
      f1 = Math.min(f1, (float)(((FaceInfo)localIterator.next()).angles[0] * 180.0F / 3.141592653589793D));
      if (f2 - f1 <= 5.0F);
    }
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(84334);
      break;
      break label106;
    }
  }

  private boolean isExpressionOpenMouthDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84322);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionOpenMouthDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84322);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84322);
    }
  }

  private boolean isExpressionOpenMouthDetected(int paramInt)
  {
    AppMethodBeat.i(84323);
    boolean bool;
    if ((paramInt < 0) || (paramInt >= this.mFaceQueueList.size()) || (((LinkedList)this.mFaceQueueList.get(paramInt)).isEmpty()))
    {
      AppMethodBeat.o(84323);
      bool = false;
    }
    while (true)
    {
      return bool;
      FaceInfo localFaceInfo = (FaceInfo)((LinkedList)this.mFaceQueueList.get(paramInt)).getFirst();
      double d = AlgoUtils.getDistance((PointF)localFaceInfo.points.get(65), (PointF)localFaceInfo.points.get(66));
      if (AlgoUtils.getDistance((PointF)localFaceInfo.points.get(73), (PointF)localFaceInfo.points.get(81)) > d * 0.2D)
      {
        bool = true;
        AppMethodBeat.o(84323);
      }
      else
      {
        AppMethodBeat.o(84323);
        bool = false;
      }
    }
  }

  private boolean isExpressionOpenMouthDetectedForAtLeastOneFace()
  {
    boolean bool = false;
    AppMethodBeat.i(84341);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionOpenMouthDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84341);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84341);
    }
  }

  private boolean isExpressionRightEyeWinkDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84331);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionDistanceChangeDetected(i, 37, 41))
      {
        bool = true;
        AppMethodBeat.o(84331);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84331);
    }
  }

  private boolean isExpressionShakeHeadDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84335);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionShakeHeadDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84335);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84335);
    }
  }

  private boolean isExpressionShakeHeadDetected(int paramInt)
  {
    AppMethodBeat.i(84336);
    if ((paramInt < 0) || (paramInt >= this.mFaceQueueList.size()) || (((LinkedList)this.mFaceQueueList.get(paramInt)).isEmpty()))
    {
      AppMethodBeat.o(84336);
      bool = false;
      return bool;
    }
    float f1 = 100.0F;
    float f2 = -100.0F;
    Iterator localIterator = ((LinkedList)this.mFaceQueueList.get(paramInt)).iterator();
    label75: if (localIterator.hasNext())
    {
      float f3 = (float)(((FaceInfo)localIterator.next()).angles[1] * 180.0F / 3.141592653589793D);
      f1 = Math.min(f1, f3);
      f2 = Math.max(f2, f3);
      if (f2 - f1 <= 7.0F);
    }
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(84336);
      break;
      break label75;
    }
  }

  private boolean isExpressionShookHeadDetected()
  {
    boolean bool = false;
    AppMethodBeat.i(84337);
    int i = 0;
    if (i < this.mFaceQueueList.size())
      if (isExpressionShookHeadDetected(i))
      {
        bool = true;
        AppMethodBeat.o(84337);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(84337);
    }
  }

  private boolean isExpressionShookHeadDetected(int paramInt)
  {
    AppMethodBeat.i(84338);
    if ((paramInt < 0) || (paramInt >= this.mFaceQueueList.size()) || (((LinkedList)this.mFaceQueueList.get(paramInt)).isEmpty()))
    {
      AppMethodBeat.o(84338);
      bool = false;
      return bool;
    }
    Object localObject = (FaceInfo)((LinkedList)this.mFaceQueueList.get(paramInt)).getFirst();
    if ((((LinkedList)this.mFaceQueueList.get(paramInt)).size() > 1) && (AlgoUtils.getDistance((PointF)((FaceInfo)localObject).points.get(2), (PointF)((FaceInfo)localObject).points.get(64)) * 0.7F > AlgoUtils.getDistance((PointF)((FaceInfo)localObject).points.get(64), (PointF)((FaceInfo)localObject).points.get(16))))
    {
      localObject = ((LinkedList)this.mFaceQueueList.get(paramInt)).listIterator();
      ((ListIterator)localObject).next();
      FaceInfo localFaceInfo;
      do
      {
        if (!((ListIterator)localObject).hasNext())
          break;
        localFaceInfo = (FaceInfo)((ListIterator)localObject).next();
      }
      while (AlgoUtils.getDistance((PointF)localFaceInfo.points.get(64), (PointF)localFaceInfo.points.get(16)) * 0.7F <= AlgoUtils.getDistance((PointF)localFaceInfo.points.get(2), (PointF)localFaceInfo.points.get(64)));
    }
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(84338);
      break;
    }
  }

  private boolean isFaceDetected()
  {
    AppMethodBeat.i(84343);
    boolean bool;
    if (!this.mFaceQueueList.isEmpty())
    {
      bool = true;
      AppMethodBeat.o(84343);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84343);
    }
  }

  public static boolean needSaveDetectedExpression(int paramInt)
  {
    if ((paramInt == VideoMaterialUtil.EXPRESSION_TYPE.JUMP_EYE_BROW.value) || (paramInt == VideoMaterialUtil.EXPRESSION_TYPE.WINK.value) || (paramInt == VideoMaterialUtil.EXPRESSION_TYPE.SHOOK_HEAD.value) || (paramInt == VideoMaterialUtil.EXPRESSION_TYPE.RIGHT_EYE_WINK.value) || (paramInt == VideoMaterialUtil.EXPRESSION_TYPE.LEFT_EYE_WINK.value) || (paramInt == VideoMaterialUtil.EXPRESSION_TYPE.NOD.value) || (paramInt == VideoMaterialUtil.EXPRESSION_TYPE.SHAKE_HEAD.value));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private float pointPairToBearingDegrees(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(84326);
    paramPointF1 = new PointF(paramPointF2.x - paramPointF1.x, paramPointF2.y - paramPointF1.y);
    float f = (float)((float)Math.atan2(paramPointF1.y, paramPointF1.x) * 57.295779513082323D);
    if (f > 0.0F)
      AppMethodBeat.o(84326);
    while (true)
    {
      return f;
      f += 360.0F;
      AppMethodBeat.o(84326);
    }
  }

  private PointF pointSub(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(84327);
    paramPointF1 = new PointF(paramPointF1.x - paramPointF2.x, paramPointF1.y - paramPointF2.y);
    AppMethodBeat.o(84327);
    return paramPointF1;
  }

  public void addFaces(List<FaceInfo> paramList)
  {
    AppMethodBeat.i(84320);
    if (paramList == null)
    {
      this.mFaceQueueList.clear();
      AppMethodBeat.o(84320);
    }
    while (true)
    {
      return;
      if (paramList.size() != this.mFaceQueueList.size())
        this.mFaceQueueList.clear();
      for (int i = 0; i < paramList.size(); i++)
      {
        if (i == this.mFaceQueueList.size())
          this.mFaceQueueList.add(new LinkedList());
        LinkedList localLinkedList = (LinkedList)this.mFaceQueueList.get(i);
        if (localLinkedList.size() > 30)
          localLinkedList.removeLast();
        localLinkedList.addFirst(paramList.get(i));
      }
      AppMethodBeat.o(84320);
    }
  }

  public void clearFaceQueue()
  {
    AppMethodBeat.i(84345);
    Iterator localIterator = this.mFaceQueueList.iterator();
    while (localIterator.hasNext())
    {
      LinkedList localLinkedList = (LinkedList)localIterator.next();
      while (localLinkedList.size() > 1)
        localLinkedList.removeLast();
    }
    AppMethodBeat.o(84345);
  }

  public boolean detectExpression(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(84321);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(84321);
      bool = false;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 103:
    case 104:
    case 106:
    case 107:
    case 108:
    case 109:
    case 110:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(84321);
      continue;
      bool = isFaceDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionOpenMouthDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionJumpEyebrowDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionRightEyeWinkDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionShakeHeadDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionKissDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionLeftEyeWinkDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionRightEyeWinkDetected();
      AppMethodBeat.o(84321);
      continue;
      bool = isExpressionNodDetected();
      AppMethodBeat.o(84321);
      continue;
      if ((isFaceDetected()) && (!isExpressionOpenMouthDetected()))
      {
        AppMethodBeat.o(84321);
      }
      else
      {
        AppMethodBeat.o(84321);
        bool = false;
        continue;
        if ((isFaceDetected()) && (!isExpressionJumpEyebrowDetected()))
        {
          AppMethodBeat.o(84321);
        }
        else
        {
          AppMethodBeat.o(84321);
          bool = false;
          continue;
          if ((isFaceDetected()) && (!isExpressionShookHeadDetected()))
          {
            AppMethodBeat.o(84321);
          }
          else
          {
            AppMethodBeat.o(84321);
            bool = false;
            continue;
            if ((isFaceDetected()) && (!isExpressionKissDetected()))
            {
              AppMethodBeat.o(84321);
            }
            else
            {
              AppMethodBeat.o(84321);
              bool = false;
              continue;
              if ((isFaceDetected()) && (!isExpressionLeftEyeWinkDetected()))
              {
                AppMethodBeat.o(84321);
              }
              else
              {
                AppMethodBeat.o(84321);
                bool = false;
                continue;
                if ((isFaceDetected()) && (!isExpressionLeftEyeWinkDetected()))
                {
                  AppMethodBeat.o(84321);
                }
                else
                {
                  AppMethodBeat.o(84321);
                  bool = false;
                  continue;
                  if ((isFaceDetected()) && (!isExpressionNodDetected()))
                  {
                    AppMethodBeat.o(84321);
                  }
                  else
                  {
                    AppMethodBeat.o(84321);
                    bool = false;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.ExpressionDetector
 * JD-Core Version:    0.6.2
 */
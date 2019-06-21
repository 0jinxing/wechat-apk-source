package com.tencent.ttpic.filter;

import android.graphics.PointF;
import java.util.List;

public class BeautyTransformList$FaceInfoOfFrame
{
  public List<Integer> countList;
  public List<List<PointF>> faces;
  public List<float[]> facesAngles;
  public float phoneRotate;

  public BeautyTransformList$FaceInfoOfFrame(List<List<PointF>> paramList, List<float[]> paramList1, List<Integer> paramList2)
  {
    this.faces = paramList1;
    this.facesAngles = paramList2;
    Object localObject;
    this.countList = localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.BeautyTransformList.FaceInfoOfFrame
 * JD-Core Version:    0.6.2
 */
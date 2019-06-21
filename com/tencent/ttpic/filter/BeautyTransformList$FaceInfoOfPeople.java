package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;

public class BeautyTransformList$FaceInfoOfPeople
{
  int count;
  public LinkedList<List<PointF>> faces;
  public LinkedList<float[]> facesAngles;

  public BeautyTransformList$FaceInfoOfPeople(BeautyTransformList paramBeautyTransformList)
  {
    AppMethodBeat.i(82024);
    this.faces = new LinkedList();
    this.facesAngles = new LinkedList();
    this.count = -1;
    AppMethodBeat.o(82024);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.BeautyTransformList.FaceInfoOfPeople
 * JD-Core Version:    0.6.2
 */
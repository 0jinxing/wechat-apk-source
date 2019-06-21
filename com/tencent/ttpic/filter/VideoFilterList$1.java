package com.tencent.ttpic.filter;

import com.tencent.ttpic.face.Face;
import java.util.Comparator;

class VideoFilterList$1
  implements Comparator<Face>
{
  VideoFilterList$1(VideoFilterList paramVideoFilterList)
  {
  }

  public int compare(Face paramFace1, Face paramFace2)
  {
    return paramFace1.faceIndex - paramFace2.faceIndex;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.VideoFilterList.1
 * JD-Core Version:    0.6.2
 */
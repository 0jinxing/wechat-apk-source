package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.FaceOffUtil.FEATURE_TYPE;
import java.util.List;

public class FaceImageLayer
{
  public double antiWrinkle;
  public double blendAlpha;
  public String cosFunTemplateFile;
  public double distortionAlpha;
  public List<DistortionItem> distortionList;
  public List<Double> extraDistortionAlphaArray;
  public List<List<Double>> extraFacePointsArray;
  public List<Double> faceColorRange;
  public List<Double> faceMaskFacePoint;
  public String faceMaskImagePath;
  public List<Integer> faceTriangle;
  public FaceOffUtil.FEATURE_TYPE featureType = FaceOffUtil.FEATURE_TYPE.CRAZY_FACE;
  public double height;
  public List<Double> imageFaceColor;
  public List<Double> imageFaceColor2;
  public List<Double> imageFacePoint;
  public String imagePath;
  public int type;
  public double width;
  public double x;
  public double y;

  public int getVersion()
  {
    int i = 2;
    AppMethodBeat.i(83486);
    if ((this.imageFaceColor2 != null) && (this.imageFaceColor2.size() >= 12) && (this.faceColorRange != null) && (this.faceColorRange.size() >= 2))
      AppMethodBeat.o(83486);
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(83486);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.FaceImageLayer
 * JD-Core Version:    0.6.2
 */
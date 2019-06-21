package com.tencent.ttpic.model;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MeshDistortionType
{
  public float direction;
  public float faceDegree;
  public float faceRatio;
  public float offsetX;
  public float offsetY;
  public PointF point;
  public float radius;
  public float strength;
  public int type;

  public MeshDistortionType()
  {
    AppMethodBeat.i(83508);
    this.point = new PointF();
    AppMethodBeat.o(83508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.MeshDistortionType
 * JD-Core Version:    0.6.2
 */
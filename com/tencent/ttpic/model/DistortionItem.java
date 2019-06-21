package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class DistortionItem
  implements Cloneable
{
  public int direction;
  public int distortion;
  public int position;
  public float radius;
  public float strength;
  public int targetDx = 0;
  public int targetDy = 0;
  public int x;
  public int y;

  public DistortionItem clone()
  {
    AppMethodBeat.i(83479);
    Object localObject1 = new DistortionItem();
    try
    {
      Object localObject2 = super.clone();
      if ((localObject2 instanceof DistortionItem))
      {
        localObject2 = (DistortionItem)localObject2;
        localObject1 = localObject2;
        label32: AppMethodBeat.o(83479);
        return localObject1;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      break label32;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.DistortionItem
 * JD-Core Version:    0.6.2
 */
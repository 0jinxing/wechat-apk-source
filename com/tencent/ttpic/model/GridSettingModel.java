package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class GridSettingModel
{
  public Rect canvasRect;
  public List<GridModel> canvasRectList;

  public GridSettingModel()
  {
    AppMethodBeat.i(83498);
    this.canvasRect = new Rect();
    this.canvasRectList = new ArrayList();
    AppMethodBeat.o(83498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.GridSettingModel
 * JD-Core Version:    0.6.2
 */
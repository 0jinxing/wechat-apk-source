package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class DistortParam
{
  private List<DistortionItem> items;
  private int level;

  public DistortParam()
  {
    AppMethodBeat.i(83478);
    this.level = 0;
    this.items = new ArrayList();
    AppMethodBeat.o(83478);
  }

  public DistortParam(int paramInt, List<DistortionItem> paramList)
  {
    this.level = paramInt;
    this.items = paramList;
  }

  public List<DistortionItem> getItems()
  {
    return this.items;
  }

  public int getLevel()
  {
    return this.level;
  }

  public void setItems(List<DistortionItem> paramList)
  {
    this.items = paramList;
  }

  public void setLevel(int paramInt)
  {
    this.level = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.DistortParam
 * JD-Core Version:    0.6.2
 */
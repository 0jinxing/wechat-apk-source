package com.tencent.mapsdk.raster.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class IndoorBuilding
{
  private int mActiveLevelIndex;
  private String mBuidlingId;
  private String mBuildingName;
  private List<IndoorLevel> mLevels;

  public IndoorBuilding(String paramString1, String paramString2, List<IndoorLevel> paramList, int paramInt)
  {
    this.mBuidlingId = paramString1;
    this.mBuildingName = paramString2;
    this.mLevels = paramList;
    this.mActiveLevelIndex = paramInt;
  }

  public final int getActiveLevelIndex()
  {
    return this.mActiveLevelIndex;
  }

  public final String getBuidlingId()
  {
    return this.mBuidlingId;
  }

  public final String getBuildingName()
  {
    return this.mBuildingName;
  }

  public final List<IndoorLevel> getLevels()
  {
    return this.mLevels;
  }

  public final String toString()
  {
    AppMethodBeat.i(101186);
    String str;
    if ((this.mBuidlingId == null) || (this.mLevels == null) || (this.mLevels.size() <= this.mActiveLevelIndex))
    {
      str = null;
      AppMethodBeat.o(101186);
    }
    while (true)
    {
      return str;
      str = this.mBuidlingId + "_" + ((IndoorLevel)this.mLevels.get(this.mActiveLevelIndex)).getName();
      AppMethodBeat.o(101186);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.IndoorBuilding
 * JD-Core Version:    0.6.2
 */
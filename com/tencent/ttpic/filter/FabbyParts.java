package com.tencent.ttpic.filter;

import java.util.List;

public class FabbyParts
{
  private String audioFile;
  private List<FabbyMvPart> parts;

  public FabbyParts(List<FabbyMvPart> paramList, String paramString)
  {
    this.parts = paramList;
    this.audioFile = paramString;
  }

  public String getAudioFile()
  {
    return this.audioFile;
  }

  public List<FabbyMvPart> getParts()
  {
    return this.parts;
  }

  public void setAudioFile(String paramString)
  {
    this.audioFile = paramString;
  }

  public void setParts(List<FabbyMvPart> paramList)
  {
    this.parts = paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FabbyParts
 * JD-Core Version:    0.6.2
 */
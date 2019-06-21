package com.tencent.matrix.mrs.core;

public class MatrixUploadDataSlice
{
  private long endPos = 0L;
  private int packageIndex = 0;
  private long startPos = 0L;
  private int totalPackage = 1;
  private MatrixUploadIssue uploadIssue = null;

  public long getDataSize()
  {
    return this.endPos - this.startPos;
  }

  public long getEndPos()
  {
    return this.endPos;
  }

  public int getPackageIndex()
  {
    return this.packageIndex;
  }

  public long getStartPos()
  {
    return this.startPos;
  }

  public int getTotalPackage()
  {
    return this.totalPackage;
  }

  public MatrixUploadIssue getUploadIssue()
  {
    return this.uploadIssue;
  }

  public void setStartPos(long paramLong)
  {
    this.startPos = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.mrs.core.MatrixUploadDataSlice
 * JD-Core Version:    0.6.2
 */
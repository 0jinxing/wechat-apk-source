package com.tencent.mm.plugin.sns.data;

public final class h
{
  public int cNE;
  public String desc = "";
  public int fileSize = 0;
  public int filterId = 0;
  public int height = -1;
  public String path = "";
  public int qFX;
  public int qFY;
  public String qFZ = "";
  public String qGa = "";
  public String qGb = "";
  public boolean qGc = false;
  public String thumbPath = "";
  public int type;
  public int width = -1;

  public h()
  {
  }

  public h(int paramInt1, int paramInt2)
  {
    this.cNE = paramInt1;
    this.type = paramInt2;
    this.path = "";
  }

  public h(String paramString, int paramInt)
  {
    this.path = paramString;
    this.type = paramInt;
    this.cNE = -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.h
 * JD-Core Version:    0.6.2
 */
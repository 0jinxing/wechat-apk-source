package com.tencent.mm.pluginsdk.g.a.c;

public abstract class a
{
  public final String cvZ;
  private volatile int fLW;
  private final long fRS;
  private final String filePath;
  public final int networkType;
  public final int priority;
  protected volatile int status = 0;
  public final String url;
  public final String vdC;
  public final int vdM;
  public final String veW;
  private final String veX;
  private final String veY;

  protected a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, long paramLong, String paramString5, String paramString6, String paramString7, int paramInt3)
  {
    this.url = paramString1;
    this.vdC = paramString2;
    this.veW = paramString3;
    this.networkType = paramInt1;
    this.vdM = paramInt2;
    this.fLW = this.vdM;
    this.filePath = paramString4;
    this.fRS = paramLong;
    this.veX = paramString6;
    this.veY = paramString7;
    this.cvZ = paramString5;
    this.priority = paramInt3;
  }

  protected int aiW(String paramString)
  {
    return 0;
  }

  public s dih()
  {
    s locals = new s();
    locals.field_url = this.url;
    locals.field_urlKey = this.vdC;
    locals.field_fileVersion = this.veW;
    locals.field_networkType = this.networkType;
    locals.field_maxRetryTimes = this.vdM;
    locals.field_retryTimes = this.fLW;
    locals.field_filePath = this.filePath;
    locals.field_status = this.status;
    locals.field_expireTime = this.fRS;
    locals.field_groupId1 = this.veX;
    locals.field_groupId2 = this.veY;
    locals.field_md5 = this.cvZ;
    locals.field_priority = this.priority;
    return locals;
  }

  public String toString()
  {
    return "BaseResDownloadRequest | urlKey='" + this.vdC + '\'' + ", networkType=" + this.networkType + ", expireTime=" + this.fRS + ", fileVersion=" + this.veW + ", maxRetryTimes=" + this.vdM + ", md5='" + this.cvZ + '\'' + ", groupId1='" + this.veX + '\'' + ", groupId2='" + this.veY + '\'' + ", filePath='" + this.filePath + '\'' + ", retryTimes=" + this.fLW + ", status=" + this.status + ", priority=" + this.priority;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.a
 * JD-Core Version:    0.6.2
 */
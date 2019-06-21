package com.tencent.mm.pluginsdk.g.a.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class l
  implements f.b
{
  private final String filePath;
  private final String groupId;
  protected volatile int iSW = 15000;
  private final String method;
  final int networkType;
  final int priority;
  public final String url;
  public final String vdC;
  final int vdM;
  private final String veW;
  protected final Map<String, String> vfl = new HashMap();
  protected volatile int vfm = 20000;
  protected volatile int vfn = 15000;

  public l(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, int paramInt2, int paramInt3)
  {
    this.vdC = paramString1;
    this.filePath = paramString2;
    this.veW = paramString3;
    this.groupId = paramString4;
    this.url = paramString5;
    this.method = paramString6;
    this.vdM = paramInt1;
    this.networkType = paramInt2;
    this.priority = Math.max(paramInt3, 0);
  }

  public String awa()
  {
    return this.groupId;
  }

  public final String dib()
  {
    return this.vdC;
  }

  public boolean dig()
  {
    return false;
  }

  public final int diu()
  {
    return this.vfn;
  }

  public final int getConnectTimeout()
  {
    return this.iSW;
  }

  public String getFilePath()
  {
    return this.filePath;
  }

  public final int getReadTimeout()
  {
    return this.vfm;
  }

  public final Map<String, String> getRequestHeaders()
  {
    if (this.vfl.size() == 0);
    for (Object localObject = null; ; localObject = Collections.unmodifiableMap(this.vfl))
      return localObject;
  }

  public final void setConnectTimeout(int paramInt)
  {
    this.iSW = paramInt;
  }

  public final void setReadTimeout(int paramInt)
  {
    this.vfm = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.l
 * JD-Core Version:    0.6.2
 */
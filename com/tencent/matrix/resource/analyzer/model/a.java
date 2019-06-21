package com.tencent.matrix.resource.analyzer.model;

import com.tencent.matrix.resource.a.a.b;
import java.io.File;
import java.io.Serializable;

public final class a
  implements Serializable
{
  public final File bWS;
  public final String bWT;
  public final String mActivityName;

  public a(File paramFile, String paramString1, String paramString2)
  {
    this.bWS = ((File)b.d(paramFile, "hprofFile"));
    this.bWT = ((String)b.d(paramString1, "refKey"));
    this.mActivityName = ((String)b.d(paramString2, "activityName"));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.analyzer.model.a
 * JD-Core Version:    0.6.2
 */
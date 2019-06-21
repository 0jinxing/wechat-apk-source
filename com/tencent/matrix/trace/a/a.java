package com.tencent.matrix.trace.a;

import java.util.Set;

public final class a
{
  public com.tencent.mrs.b.a bWX;
  public boolean bYA;
  public boolean bYB;
  public boolean bYC;
  public boolean bYD;
  public boolean bYE;
  public String bYF;
  public Set<String> bYG;
  public boolean isDebug;

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(" \n");
    localStringBuilder.append("# TraceConfig\n");
    localStringBuilder.append("* isDebug:\t").append(this.isDebug).append("\n");
    localStringBuilder.append("* isDevEnv:\t").append(this.bYE).append("\n");
    localStringBuilder.append("* defaultFpsEnable:\t").append(this.bYA).append("\n");
    localStringBuilder.append("* defaultMethodTraceEnable:\t").append(this.bYB).append("\n");
    localStringBuilder.append("* defaultStartupEnable:\t").append(this.bYC).append("\n");
    localStringBuilder.append("* defaultAnrEnable:\t").append(this.bYD).append("\n");
    localStringBuilder.append("* splashActivities:\t").append(this.bYF).append("\n");
    return localStringBuilder.toString();
  }

  public static final class a
  {
    public a bYH = new a((byte)0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.a.a
 * JD-Core Version:    0.6.2
 */
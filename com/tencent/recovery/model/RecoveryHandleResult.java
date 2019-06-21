package com.tencent.recovery.model;

public class RecoveryHandleResult
{
  public boolean csN;
  public boolean retry;

  public String toString()
  {
    return "RecoveryHandleResult{result=" + this.csN + ", retry=" + this.retry + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.model.RecoveryHandleResult
 * JD-Core Version:    0.6.2
 */
package com.tencent.recovery.option;

import com.tencent.recovery.config.Express;

public class ProcessOptions
{
  private Express Aru;
  public int azs;

  public static final class Builder
  {
    public Express Aru;
    private int azs;

    public final Builder dQh()
    {
      this.azs = 10000;
      return this;
    }

    public final ProcessOptions dQi()
    {
      ProcessOptions localProcessOptions = new ProcessOptions();
      ProcessOptions.a(localProcessOptions, this.azs);
      ProcessOptions.a(localProcessOptions, this.Aru);
      return localProcessOptions;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.option.ProcessOptions
 * JD-Core Version:    0.6.2
 */
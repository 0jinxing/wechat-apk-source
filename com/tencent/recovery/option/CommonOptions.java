package com.tencent.recovery.option;

public class CommonOptions
{
  public String Arl;
  public String Aro;
  public String Arp;
  private boolean Arq;
  public long Arr;
  public long Ars;
  public String clientVersion;
  public String eCq;

  public static final class Builder
  {
    public String Arl;
    public String Aro;
    public String Arp;
    public boolean Arq;
    public long Arr;
    public long Ars;
    public String clientVersion;
    public String eCq;

    public final CommonOptions dQg()
    {
      CommonOptions localCommonOptions = new CommonOptions((byte)0);
      CommonOptions.a(localCommonOptions, this.Aro);
      CommonOptions.b(localCommonOptions, this.Arp);
      CommonOptions.c(localCommonOptions, this.clientVersion);
      CommonOptions.d(localCommonOptions, this.Arl);
      CommonOptions.e(localCommonOptions, this.eCq);
      CommonOptions.a(localCommonOptions, this.Arq);
      CommonOptions.a(localCommonOptions, this.Arr);
      CommonOptions.b(localCommonOptions, this.Ars);
      return localCommonOptions;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.option.CommonOptions
 * JD-Core Version:    0.6.2
 */
package com.tencent.youtu.ytagreflectlivecheck.requester;

public abstract interface RGBConfigRequester
{
  public abstract RGBConfigRequester.YTColorSeqReq getColorSeqReq();

  public abstract void request(String paramString, RGBConfigRequester.RGBConfigRequestCallBack paramRGBConfigRequestCallBack);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester
 * JD-Core Version:    0.6.2
 */
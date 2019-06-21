package com.tencent.tmassistantsdk.util;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class QUABuilder
{
  public String mAdrRelease;
  public String mBuildNo;
  public String mChannel;
  public String mChannelId;
  public int mDeviceHeight;
  public int mDeviceWidth;
  public int mRootStatus;
  public String mUA;
  public String mVersionName;

  private String getAppSpec()
  {
    AppMethodBeat.i(76273);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("0");
    ((StringBuffer)localObject).append(this.mVersionName.subSequence(0, 1));
    ((StringBuffer)localObject).append(this.mBuildNo);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(76273);
    return localObject;
  }

  public final String get()
  {
    AppMethodBeat.i(76272);
    String str = getAppSpec();
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("TMASDK_");
    ((StringBuffer)localObject).append(this.mVersionName);
    if (!TextUtils.isEmpty(this.mChannel))
    {
      ((StringBuffer)localObject).append("_");
      ((StringBuffer)localObject).append(this.mChannel);
    }
    ((StringBuffer)localObject).append("/");
    ((StringBuffer)localObject).append(str);
    ((StringBuffer)localObject).append("&NA/");
    ((StringBuffer)localObject).append(str);
    ((StringBuffer)localObject).append("&");
    ((StringBuffer)localObject).append(this.mAdrRelease);
    ((StringBuffer)localObject).append("_");
    ((StringBuffer)localObject).append(this.mRootStatus);
    ((StringBuffer)localObject).append("&");
    ((StringBuffer)localObject).append(this.mDeviceWidth / 16);
    ((StringBuffer)localObject).append("_");
    ((StringBuffer)localObject).append(this.mDeviceHeight / 16);
    ((StringBuffer)localObject).append("_");
    ((StringBuffer)localObject).append("14&");
    ((StringBuffer)localObject).append(this.mUA);
    ((StringBuffer)localObject).append("&");
    ((StringBuffer)localObject).append(this.mChannelId);
    ((StringBuffer)localObject).append("&");
    ((StringBuffer)localObject).append("NA");
    ((StringBuffer)localObject).append("&");
    ((StringBuffer)localObject).append("V3");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(76272);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.QUABuilder
 * JD-Core Version:    0.6.2
 */
package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class QueryLoginInfoRequest extends JceStruct
{
  public String addtion = "";

  public QueryLoginInfoRequest()
  {
  }

  public QueryLoginInfoRequest(String paramString)
  {
    this.addtion = paramString;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76009);
    this.addtion = paramJceInputStream.readString(0, false);
    AppMethodBeat.o(76009);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76008);
    if (this.addtion != null)
      paramJceOutputStream.write(this.addtion, 0);
    AppMethodBeat.o(76008);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.param.jce.QueryLoginInfoRequest
 * JD-Core Version:    0.6.2
 */
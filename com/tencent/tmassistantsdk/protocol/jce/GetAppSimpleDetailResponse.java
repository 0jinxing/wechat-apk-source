package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class GetAppSimpleDetailResponse extends JceStruct
{
  static ArrayList<AppSimpleDetail> cache_appSimpleDetailList;
  public ArrayList<AppSimpleDetail> appSimpleDetailList = null;
  public int ret = 0;

  public GetAppSimpleDetailResponse()
  {
  }

  public GetAppSimpleDetailResponse(int paramInt, ArrayList<AppSimpleDetail> paramArrayList)
  {
    this.ret = paramInt;
    this.appSimpleDetailList = paramArrayList;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76045);
    this.ret = paramJceInputStream.read(this.ret, 0, true);
    if (cache_appSimpleDetailList == null)
    {
      cache_appSimpleDetailList = new ArrayList();
      AppSimpleDetail localAppSimpleDetail = new AppSimpleDetail();
      cache_appSimpleDetailList.add(localAppSimpleDetail);
    }
    this.appSimpleDetailList = ((ArrayList)paramJceInputStream.read(cache_appSimpleDetailList, 1, true));
    AppMethodBeat.o(76045);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76044);
    paramJceOutputStream.write(this.ret, 0);
    paramJceOutputStream.write(this.appSimpleDetailList, 1);
    AppMethodBeat.o(76044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailResponse
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bj;

public class js
  implements bj
{
  public String a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(100103);
    paramInt2 = (int)(Math.pow(2.0D, paramInt3) - 1.0D - paramInt2);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("https://p0.map.gtimg.com/scenic/");
    ((StringBuffer)localObject).append("?z=");
    ((StringBuffer)localObject).append(paramInt3);
    ((StringBuffer)localObject).append("&y=");
    ((StringBuffer)localObject).append(paramInt2);
    ((StringBuffer)localObject).append("&x=");
    ((StringBuffer)localObject).append(paramInt1);
    ((StringBuffer)localObject).append("&styleid=");
    ((StringBuffer)localObject).append(7);
    ((StringBuffer)localObject).append("&version=");
    ((StringBuffer)localObject).append(jp.a());
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(100103);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.js
 * JD-Core Version:    0.6.2
 */
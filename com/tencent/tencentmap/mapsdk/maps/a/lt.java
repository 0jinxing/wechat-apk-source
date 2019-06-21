package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bj;
import com.tencent.tencentmap.mapsdk.a.da;

public class lt
  implements bj
{
  private da a = da.a;

  protected int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 % paramInt2;
    paramInt1 = i;
    if (i * paramInt2 < 0)
      paramInt1 = i + paramInt2;
    return paramInt1;
  }

  public da a()
  {
    return this.a;
  }

  public String a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(100481);
    String str = lq.e();
    if (str == null)
    {
      localObject = null;
      AppMethodBeat.o(100481);
      return localObject;
    }
    Object localObject = lq.h();
    if (localObject.length == 0);
    for (localObject = str.replaceFirst("\\{range\\}", ""); ; localObject = str.replaceFirst("\\{range\\}", Integer.toString(a(paramInt1 + paramInt2, localObject.length))))
    {
      localObject = ((String)localObject).replaceFirst("\\{z\\}", Integer.toString(paramInt3)).replaceFirst("\\{x\\}", Integer.toString(paramInt1)).replaceFirst("\\{y\\}", Integer.toString(paramInt2)).replaceFirst("\\{style\\}", Integer.toString(lq.a())).replaceFirst("\\{scene\\}", Integer.toString(lq.b())).replaceFirst("\\{version\\}", Integer.toString(lq.c())).replaceFirst("\\{ch\\}", this.a.name());
      localObject = (String)localObject + "&foreignLanguage=" + this.a.name();
      AppMethodBeat.o(100481);
      break;
    }
  }

  public void a(da paramda)
  {
    this.a = paramda;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lt
 * JD-Core Version:    0.6.2
 */
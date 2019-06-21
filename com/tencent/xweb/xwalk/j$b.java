package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;

public final class j$b
{
  public String ASA;
  public String ASB;
  public int ASw;
  public int ASx;
  public int ASy;
  public int ASz;
  public String wYV;
  public String wYW;
  public String wYX;

  public static b b(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    int i = 1;
    AppMethodBeat.i(85295);
    b localb = new b();
    localb.wYV = paramString1;
    localb.ASB = paramString2;
    localb.ASw = paramInt1;
    localb.ASy = paramInt2;
    localb.wYW = paramString3;
    localb.wYX = paramString4;
    if (paramInt1 > 0);
    try
    {
      paramString2 = new java/lang/StringBuffer;
      paramString2.<init>(paramString3);
      paramString2 = paramString2.reverse().toString();
      int j = 0;
      k = paramInt1;
      Object localObject;
      int m;
      if (paramInt2 > 0)
      {
        localObject = paramString4;
        i = 0;
        m = paramInt2;
      }
      while (true)
      {
        paramInt1 = 0;
        paramInt2 = 0;
        while (paramInt1 <= paramString2.length())
        {
          paramInt2 = paramInt1;
          if (k <= paramString2.substring(0, paramInt1).getBytes().length)
            break;
          paramInt2 = paramInt1;
          paramInt1++;
        }
        k = paramInt1 * -1;
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>();
        paramString2 = paramString1 + paramString4;
        j = 1;
        break;
        m = paramInt2 * -1;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>(paramString1);
        localStringBuilder = localStringBuilder.append(((StringBuffer)localObject).reverse().toString());
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>(paramString3);
        localObject = ((StringBuffer)localObject).reverse().toString();
      }
      paramInt1 = 0;
      k = 0;
      while (true)
      {
        if (paramInt1 > ((String)localObject).length())
          break label460;
        if (m <= ((String)localObject).substring(0, paramInt1).getBytes().length)
          break;
        k = paramInt1;
        paramInt1++;
      }
      k = paramInt2;
      if (j != 0)
        k = paramInt2 * -1;
      paramInt2 = paramInt1;
      if (i != 0)
        paramInt2 = paramInt1 * -1;
      if (paramString1.length() + k + paramInt2 <= 0)
      {
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("getSelectInfo error prefixIndex:");
        Log.e("XWWebView", k + ",suffixIndex:" + paramInt2);
        paramInt2 = 0;
        k = 0;
        localb.ASx = k;
        localb.ASz = paramInt2;
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>();
        localb.ASA = (paramString3 + paramString1 + paramString4).substring(paramString3.length() - k, paramInt2 + (paramString3.length() + paramString1.length()));
        AppMethodBeat.o(85295);
        return localb;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        int k;
        Log.e("XWWebView", "SelectInfo getSelectInfo error:" + paramString1.getMessage());
        continue;
        continue;
        label460: paramInt1 = k;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(85296);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("SelectInfo PickedWord:");
      localObject = this.wYV + ",PrefixText:" + this.wYW + ",SuffixText:" + this.wYX + ",PrefixOffset:" + this.ASw + ",prefixIndex:" + this.ASx + ",SuffixOffset:" + this.ASy + ",SuffixIndex:" + this.ASz + ",ResultPickedWord:" + this.ASB + ",OffsetedPickedWord:" + this.ASA;
      AppMethodBeat.o(85296);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = "SelectInfo toString error";
        AppMethodBeat.o(85296);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.j.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.wallet_core.a;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tenpay.android.wechat.PayuSecureEncrypt;

public final class a extends PayuSecureEncrypt
{
  public a(int paramInt)
  {
    this.mEncrptType = paramInt;
  }

  private String g(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(49013);
    int i = this.mEncrptType;
    Object localObject = "10";
    if (-20 == this.mEncrptType)
      i = 40;
    while (true)
    {
      if ((this.mEncrptType == -10) || (this.mEncrptType == -20) || (this.mEncrptType == 60))
        localObject = "30";
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(i);
      localStringBuilder.append("|");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("|");
      localStringBuilder.append(paramString2);
      localStringBuilder.append("|");
      if (paramBoolean)
      {
        localStringBuilder.append(ag.ck(paramString1));
        paramString1 = null;
      }
      try
      {
        localObject = localStringBuilder.toString().getBytes();
        paramString2 = new com/tencent/mm/pointers/PByteArray;
        paramString2.<init>();
        if (!MMProtocalJni.rsaPublicEncrypt((byte[])localObject, paramString2, getRsaEKey().getBytes("UTF-8"), getRsaNKey().getBytes("UTF-8")))
          ab.e("MicroMsg.WxPayuSecureEncrypt", "MMProtocalJni encrypt failed!");
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("01");
        paramString2 = Base64.encodeToString(paramString2.value, 2);
        paramString1 = paramString2;
        AppMethodBeat.o(49013);
        return paramString1;
        if (-10 != this.mEncrptType)
          continue;
        i = 20;
        continue;
        localStringBuilder.append(paramString1);
      }
      catch (Exception paramString2)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WxPayuSecureEncrypt", paramString2, "", new Object[0]);
      }
    }
  }

  private String iv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49012);
    String str = paramString1;
    if (this.mEncrptType != 40)
    {
      str = paramString1;
      if (this.mEncrptType != -20)
        str = paramString1.replaceAll(" ", "");
    }
    switch (this.mEncrptType)
    {
    default:
      AppMethodBeat.o(49012);
    case -20:
    case -10:
    case 60:
    case 20:
    case 30:
    case 40:
    case 50:
    }
    while (true)
    {
      return str;
      str = g(true, str, paramString2);
      AppMethodBeat.o(49012);
      continue;
      str = g(false, str, paramString2);
      AppMethodBeat.o(49012);
    }
  }

  public final String desedeEncode(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49009);
    paramString1 = iv(paramString1, paramString2);
    AppMethodBeat.o(49009);
    return paramString1;
  }

  public final String desedeVerifyCode(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49010);
    paramString1 = iv(paramString1, paramString2);
    AppMethodBeat.o(49010);
    return paramString1;
  }

  public final String encryptPasswd(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(49011);
    paramString1 = iv(paramString1, paramString2);
    AppMethodBeat.o(49011);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.a.a
 * JD-Core Version:    0.6.2
 */
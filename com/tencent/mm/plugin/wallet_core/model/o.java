package com.tencent.mm.plugin.wallet_core.model;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.security.PublicKey;
import javax.crypto.Cipher;

public final class o
{
  static o tzz;
  private PublicKey tzA = null;

  public final String bw(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46785);
    try
    {
      this.tzA = m.r(ah.getContext(), "lbs_rsa_public_key.pem");
      ab.i("MicroMsg.LocationEncrypt", "getPemPublickKeyFromAsset23 done2");
      PublicKey localPublicKey = this.tzA;
      Object localObject = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      ((Cipher)localObject).init(1, localPublicKey);
      localObject = Base64.encode(((Cipher)localObject).doFinal(paramArrayOfByte), 0);
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>((byte[])localObject);
      AppMethodBeat.o(46785);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.e("MicroMsg.LocationEncrypt", "encry publicKey error %s", new Object[] { paramArrayOfByte.getMessage() });
        paramArrayOfByte = "";
        AppMethodBeat.o(46785);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.o
 * JD-Core Version:    0.6.2
 */
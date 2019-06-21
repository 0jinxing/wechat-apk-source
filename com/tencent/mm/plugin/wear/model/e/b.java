package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.io.File;
import java.security.Key;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;

public final class b extends a
{
  private byte[] bFT;
  private byte[] tYx;
  private byte[] tYy;

  private void cUC()
  {
    AppMethodBeat.i(26386);
    Object localObject = new File(com.tencent.mm.compatible.util.e.eSk, "wear/key");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    File localFile1 = new File((File)localObject, "private.key");
    File localFile2 = new File((File)localObject, "public.key");
    File localFile3 = new File((File)localObject, "session.key");
    if ((!localFile1.exists()) || (!localFile2.exists()) || (!localFile3.exists()))
    {
      ab.i("MicroMsg.Wear.HttpAuthServer", "recreate keys");
      localFile1.delete();
      localFile2.delete();
      localFile3.delete();
      localObject = com.tencent.mm.plugin.wear.a.a.cUE();
      RSAPrivateKey localRSAPrivateKey = (RSAPrivateKey)((HashMap)localObject).get("RSAPrivateKey");
      this.tYy = ((RSAPublicKey)((HashMap)localObject).get("RSAPublicKey")).getEncoded();
      this.tYx = localRSAPrivateKey.getEncoded();
      this.bFT = com.tencent.mm.plugin.wear.a.a.cUF();
      com.tencent.mm.a.e.b(localFile1.getAbsolutePath(), this.tYx, this.tYx.length);
      com.tencent.mm.a.e.b(localFile2.getAbsolutePath(), this.tYy, this.tYy.length);
      com.tencent.mm.a.e.b(localFile3.getAbsolutePath(), this.bFT, this.bFT.length);
    }
    while (true)
    {
      ab.i("MicroMsg.Wear.HttpAuthServer", "publicKey=%s privateKey=%s sessionKey=%s", new Object[] { ag.w(this.tYy), ag.w(this.tYx), ag.w(this.bFT) });
      AppMethodBeat.o(26386);
      return;
      ab.i("MicroMsg.Wear.HttpAuthServer", "use old keys");
      this.tYy = com.tencent.mm.a.e.f(localFile2.getAbsolutePath(), 0, 2147483647);
      this.tYx = com.tencent.mm.a.e.f(localFile1.getAbsolutePath(), 0, 2147483647);
      this.bFT = com.tencent.mm.a.e.f(localFile3.getAbsolutePath(), 0, 2147483647);
    }
  }

  public final byte[] adl()
  {
    boolean bool1 = true;
    AppMethodBeat.i(26385);
    if ((this.tYy == null) || (this.tYx == null) || (this.bFT == null))
      ab.i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
    try
    {
      cUC();
      if (this.tYy != null)
      {
        bool2 = true;
        if (this.tYx == null)
          break label135;
        bool3 = true;
        if (this.bFT == null)
          break label140;
        ab.i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        byte[] arrayOfByte = this.bFT;
        AppMethodBeat.o(26385);
        return arrayOfByte;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", localException, "loadAllKey", new Object[0]);
        continue;
        boolean bool2 = false;
        continue;
        label135: boolean bool3 = false;
        continue;
        label140: bool1 = false;
      }
    }
  }

  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26387);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(10001));
    localArrayList.add(Integer.valueOf(10002));
    AppMethodBeat.o(26387);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool1 = true;
    AppMethodBeat.i(26388);
    switch (paramInt)
    {
    default:
    case 10001:
    case 10002:
    }
    while (true)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(26388);
      while (true)
      {
        return paramArrayOfByte;
        ab.i("MicroMsg.Wear.HttpAuthServer", "request public key");
        if ((this.tYy == null) || (this.tYx == null) || (this.bFT == null))
          ab.i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
        try
        {
          cUC();
          if (this.tYy != null)
          {
            bool2 = true;
            if (this.tYx == null)
              break label178;
            bool3 = true;
            if (this.bFT == null)
              break label184;
            ab.i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
            paramArrayOfByte = this.tYy;
            AppMethodBeat.o(26388);
          }
        }
        catch (Exception paramArrayOfByte)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", paramArrayOfByte, "loadAllKey", new Object[0]);
            continue;
            boolean bool2 = false;
            continue;
            label178: boolean bool3 = false;
            continue;
            label184: bool1 = false;
          }
        }
        try
        {
          Object localObject1 = this.tYx;
          Object localObject2 = new java/security/spec/PKCS8EncodedKeySpec;
          ((PKCS8EncodedKeySpec)localObject2).<init>((byte[])localObject1);
          localObject1 = KeyFactory.getInstance("RSA");
          localObject2 = ((KeyFactory)localObject1).generatePrivate((KeySpec)localObject2);
          localObject1 = Cipher.getInstance(((KeyFactory)localObject1).getAlgorithm());
          ((Cipher)localObject1).init(2, (Key)localObject2);
          localObject1 = ((Cipher)localObject1).doFinal(paramArrayOfByte);
          paramArrayOfByte = com.tencent.mm.plugin.wear.a.a.i(this.bFT, (byte[])localObject1);
          ab.i("MicroMsg.Wear.HttpAuthServer", "funid %d, randomKey=%s", new Object[] { Integer.valueOf(paramInt), ag.w((byte[])localObject1) });
          AppMethodBeat.o(26388);
        }
        catch (Exception paramArrayOfByte)
        {
          ab.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", paramArrayOfByte, "sessionKey resp error", new Object[0]);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.b
 * JD-Core Version:    0.6.2
 */
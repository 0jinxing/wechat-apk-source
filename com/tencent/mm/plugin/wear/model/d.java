package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.wear.model.a.b.a;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.plugin.wear.model.e.j;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
{
  com.tencent.mm.plugin.wear.model.a.b tXI;
  com.tencent.mm.plugin.wear.model.e.b tXJ;
  public i tXK;
  j tXL;
  p tXM;

  public d()
  {
    AppMethodBeat.i(26289);
    this.tXI = new com.tencent.mm.plugin.wear.model.a.a();
    this.tXJ = new com.tencent.mm.plugin.wear.model.e.b();
    this.tXK = new i();
    this.tXL = new j();
    this.tXM = new p();
    AppMethodBeat.o(26289);
  }

  public final boolean bA(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26292);
    boolean bool;
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(26292);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!cUs())
      {
        AppMethodBeat.o(26292);
        bool = false;
      }
      else
      {
        ah.getContext();
        String str = String.format("/wechat/%s/%d", new Object[] { "phone", Long.valueOf(System.currentTimeMillis()) });
        com.tencent.mm.plugin.wear.model.a.b localb = cUt();
        if (localb == null)
        {
          AppMethodBeat.o(26292);
          bool = false;
        }
        else
        {
          if (paramArrayOfByte.length > 92160);
          for (paramArrayOfByte = localb.C(str, paramArrayOfByte); ; paramArrayOfByte = localb.B(str, paramArrayOfByte))
          {
            if (paramArrayOfByte.code != 0)
              break label136;
            AppMethodBeat.o(26292);
            bool = true;
            break;
          }
          label136: AppMethodBeat.o(26292);
          bool = false;
        }
      }
    }
  }

  public final byte[] bB(byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    AppMethodBeat.i(26293);
    Object localObject2 = this.tXJ.adl();
    if ((paramArrayOfByte != null) && (localObject2 != null));
    while (true)
    {
      try
      {
        ab.d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", new Object[] { g.x((byte[])localObject2) });
        SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
        localSecretKeySpec.<init>((byte[])localObject2, "AES");
        localObject2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
        ((Cipher)localObject2).init(2, localSecretKeySpec);
        paramArrayOfByte = ((Cipher)localObject2).doFinal(paramArrayOfByte);
        AppMethodBeat.o(26293);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(26293);
        paramArrayOfByte = localObject1;
        continue;
      }
      AppMethodBeat.o(26293);
      paramArrayOfByte = localObject1;
    }
  }

  public final byte[] bC(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    AppMethodBeat.i(26294);
    byte[] arrayOfByte = this.tXJ.adl();
    if ((paramArrayOfByte != null) && (arrayOfByte != null));
    while (true)
    {
      try
      {
        ab.d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", new Object[] { g.x(arrayOfByte) });
        paramArrayOfByte = com.tencent.mm.plugin.wear.a.a.i(paramArrayOfByte, arrayOfByte);
        AppMethodBeat.o(26294);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(26294);
        paramArrayOfByte = localObject;
        continue;
      }
      AppMethodBeat.o(26294);
      paramArrayOfByte = localObject;
    }
  }

  public final boolean cUs()
  {
    AppMethodBeat.i(26290);
    boolean bool;
    if ((cUt() != null) && (cUt().cUx().size() > 0))
    {
      bool = true;
      AppMethodBeat.o(26290);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(26290);
    }
  }

  public final com.tencent.mm.plugin.wear.model.a.b cUt()
  {
    AppMethodBeat.i(26291);
    com.tencent.mm.plugin.wear.model.a.b localb;
    if ((this.tXI.isAvailable()) && (this.tXI.cUy()))
    {
      localb = this.tXI;
      AppMethodBeat.o(26291);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(26291);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.d
 * JD-Core Version:    0.6.2
 */
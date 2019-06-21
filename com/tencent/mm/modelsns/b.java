package com.tencent.mm.modelsns;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cdd;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  private static boolean fNO;
  private static AtomicInteger fQp;
  public Object fQg;
  public int fQh;
  public int fQi;
  public int fQj;
  public int fQk;
  public StringBuffer fQl;
  public StringBuffer fQm;
  public StringBuffer fQn;
  public StringBuffer fQo;
  public int opType;
  public long timeStamp;

  static
  {
    AppMethodBeat.i(94480);
    fNO = false;
    fQp = new AtomicInteger(0);
    AppMethodBeat.o(94480);
  }

  public b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94460);
    this.fQg = null;
    this.fQh = 1;
    this.opType = 0;
    this.fQl = new StringBuffer();
    this.fQm = new StringBuffer();
    this.fQn = new StringBuffer();
    this.fQo = new StringBuffer();
    this.opType = paramInt1;
    this.fQk = paramInt2;
    if (!ajG())
    {
      AppMethodBeat.o(94460);
      return;
    }
    this.timeStamp = System.currentTimeMillis();
    if (at.isWifi(ah.getContext()))
      this.fQj = 4;
    while (true)
    {
      this.fQi = fQp.incrementAndGet();
      AppMethodBeat.o(94460);
      break;
      if (at.is4G(ah.getContext()))
        this.fQj = 3;
      else if (at.is3G(ah.getContext()))
        this.fQj = 2;
      else if (at.is2G(ah.getContext()))
        this.fQj = 1;
      else
        this.fQj = 0;
    }
  }

  private static b Y(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    AppMethodBeat.i(94478);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(94478);
      paramArrayOfByte = localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      cdd localcdd = new cdd();
      try
      {
        localcdd.parseFrom(paramArrayOfByte);
        paramArrayOfByte = new com/tencent/mm/modelsns/b;
        paramArrayOfByte.<init>(localcdd.opType, localcdd.fQk);
        paramArrayOfByte.fQh = localcdd.fQh;
        paramArrayOfByte.timeStamp = localcdd.timeStamp;
        paramArrayOfByte.fQi = localcdd.fQi;
        paramArrayOfByte.fQj = localcdd.fQj;
        StringBuffer localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>(localcdd.xcN);
        paramArrayOfByte.fQl = localStringBuffer;
        localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>(localcdd.xcO);
        paramArrayOfByte.fQo = localStringBuffer;
        localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>(localcdd.xcP);
        paramArrayOfByte.fQm = localStringBuffer;
        localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>(localcdd.xcQ);
        paramArrayOfByte.fQn = localStringBuffer;
        AppMethodBeat.o(94478);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.StatisticsOplog", "putIntent " + paramArrayOfByte.getMessage());
        AppMethodBeat.o(94478);
        paramArrayOfByte = localObject;
      }
    }
  }

  public static void ajJ()
  {
    AppMethodBeat.i(94471);
    ab.i("MicroMsg.StatisticsOplog", "wait op");
    AppMethodBeat.o(94471);
  }

  public static b c(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(94477);
    paramIntent = paramIntent.getByteArrayExtra(paramString);
    if (paramIntent == null)
    {
      paramIntent = null;
      AppMethodBeat.o(94477);
    }
    while (true)
    {
      return paramIntent;
      paramIntent = Y(paramIntent);
      AppMethodBeat.o(94477);
    }
  }

  public static b lY(int paramInt)
  {
    AppMethodBeat.i(94458);
    b localb = new b(paramInt, 1);
    AppMethodBeat.o(94458);
    return localb;
  }

  public static b lZ(int paramInt)
  {
    AppMethodBeat.i(94459);
    b localb = new b(paramInt, 4);
    AppMethodBeat.o(94459);
    return localb;
  }

  public static b n(Bundle paramBundle)
  {
    AppMethodBeat.i(94475);
    paramBundle = paramBundle.getByteArray("intent_key_StatisticsOplog");
    if (paramBundle == null)
    {
      paramBundle = null;
      AppMethodBeat.o(94475);
    }
    while (true)
    {
      return paramBundle;
      paramBundle = Y(paramBundle);
      AppMethodBeat.o(94475);
    }
  }

  public static b u(Intent paramIntent)
  {
    AppMethodBeat.i(94476);
    paramIntent = c(paramIntent, "intent_key_StatisticsOplog");
    AppMethodBeat.o(94476);
    return paramIntent;
  }

  public final byte[] adk()
  {
    AppMethodBeat.i(94473);
    Object localObject1 = new cdd();
    ((cdd)localObject1).opType = this.opType;
    ((cdd)localObject1).fQk = this.fQk;
    ((cdd)localObject1).fQh = this.fQh;
    ((cdd)localObject1).timeStamp = this.timeStamp;
    ((cdd)localObject1).fQi = this.fQi;
    ((cdd)localObject1).fQj = this.fQj;
    ((cdd)localObject1).xcN = this.fQl.toString();
    ((cdd)localObject1).xcO = this.fQo.toString();
    ((cdd)localObject1).xcP = this.fQm.toString();
    ((cdd)localObject1).xcQ = this.fQn.toString();
    try
    {
      localObject1 = ((cdd)localObject1).toByteArray();
      AppMethodBeat.o(94473);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.StatisticsOplog", "putIntent " + localException.getMessage());
        Object localObject2 = null;
        AppMethodBeat.o(94473);
      }
    }
  }

  public final boolean ajG()
  {
    boolean bool1 = true;
    int i = c.fQr;
    boolean bool2;
    if (i == 0)
      bool2 = false;
    while (true)
    {
      return bool2;
      if (i == 1)
      {
        if (this.opType >= 501)
        {
          bool2 = bool1;
          if (this.opType <= 700);
        }
        else if (this.opType >= 701)
        {
          bool2 = bool1;
          if (this.opType <= 1000)
            continue;
        }
      }
      else if ((i == 2) && (this.opType >= 701))
      {
        bool2 = bool1;
        if (this.opType <= 1000);
      }
      else if ((i == 3) && (this.opType >= 501))
      {
        bool2 = bool1;
        if (this.opType <= 700);
      }
      else if (i == 4)
      {
        if (this.opType >= 701)
        {
          bool2 = bool1;
          if (this.opType <= 1000);
        }
        else if (this.opType >= 501)
        {
          bool2 = bool1;
          if (this.opType <= 700)
            continue;
        }
      }
      else
      {
        bool2 = false;
      }
    }
  }

  public final b ajH()
  {
    AppMethodBeat.i(94466);
    this.fQm = new StringBuffer();
    AppMethodBeat.o(94466);
    return this;
  }

  public final b ajI()
  {
    AppMethodBeat.i(94467);
    this.fQl = new StringBuffer();
    AppMethodBeat.o(94467);
    return this;
  }

  public final boolean ajK()
  {
    AppMethodBeat.i(94472);
    boolean bool;
    if (!ajG())
    {
      bool = false;
      AppMethodBeat.o(94472);
    }
    while (true)
    {
      return bool;
      d.post(new b.1(this), "StatisticsOplog");
      bool = true;
      AppMethodBeat.o(94472);
    }
  }

  public final void b(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(94474);
    byte[] arrayOfByte = adk();
    if (arrayOfByte == null)
      AppMethodBeat.o(94474);
    while (true)
    {
      return;
      paramIntent.putExtra(paramString, arrayOfByte);
      AppMethodBeat.o(94474);
    }
  }

  public final b cS(boolean paramBoolean)
  {
    AppMethodBeat.i(94469);
    if (paramBoolean);
    for (Object localObject = "1"; ; localObject = "0")
    {
      localObject = tx((String)localObject);
      AppMethodBeat.o(94469);
      return localObject;
    }
  }

  public final boolean ma(int paramInt)
  {
    AppMethodBeat.i(94461);
    this.fQg = Integer.valueOf(paramInt);
    AppMethodBeat.o(94461);
    return true;
  }

  public final b mb(int paramInt)
  {
    AppMethodBeat.i(94464);
    b localb = tx(String.valueOf(paramInt));
    AppMethodBeat.o(94464);
    return localb;
  }

  public final b mc(int paramInt)
  {
    AppMethodBeat.i(94470);
    if (!ajG())
    {
      AppMethodBeat.o(94470);
      return this;
    }
    if (this.fQm.length() == 0)
      this.fQm.append(paramInt);
    while (true)
    {
      AppMethodBeat.o(94470);
      break;
      this.fQm.append("||".concat(String.valueOf(paramInt)));
    }
  }

  public final b tx(String paramString)
  {
    AppMethodBeat.i(94463);
    if (!ajG())
    {
      AppMethodBeat.o(94463);
      return this;
    }
    if (this.fQl.length() == 0)
      if (bo.isNullOrNil(paramString))
        this.fQl.append(" ");
    while (true)
    {
      AppMethodBeat.o(94463);
      break;
      this.fQl.append(paramString);
      continue;
      this.fQl.append("||".concat(String.valueOf(paramString)));
    }
  }

  public final b ty(String paramString)
  {
    AppMethodBeat.i(94465);
    if (!ajG())
    {
      AppMethodBeat.o(94465);
      return this;
    }
    if (this.fQm.length() == 0)
      this.fQm.append(paramString);
    while (true)
    {
      AppMethodBeat.o(94465);
      break;
      this.fQm.append("||".concat(String.valueOf(paramString)));
    }
  }

  public final b tz(String paramString)
  {
    AppMethodBeat.i(94468);
    if (!ajG())
    {
      AppMethodBeat.o(94468);
      return this;
    }
    if (this.fQn.length() == 0)
      this.fQn.append(paramString);
    while (true)
    {
      AppMethodBeat.o(94468);
      break;
      this.fQn.append("||".concat(String.valueOf(paramString)));
    }
  }

  public final void update()
  {
    AppMethodBeat.i(94462);
    if (!ajG())
      AppMethodBeat.o(94462);
    while (true)
    {
      return;
      this.timeStamp = System.currentTimeMillis();
      this.fQi = fQp.incrementAndGet();
      AppMethodBeat.o(94462);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsns.b
 * JD-Core Version:    0.6.2
 */
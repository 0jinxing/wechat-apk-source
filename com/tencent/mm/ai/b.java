package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.bzw;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends k
{
  public int azs;
  public int cQh;
  public b fsG;
  public c fsH;
  public int fsI;
  public String uri;

  private b(a parama1, a parama2, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(58159);
    this.fsG = null;
    this.fsH = null;
    this.cQh = 0;
    if ((paramBoolean) && ((parama1 instanceof bsr)));
    for (boolean bool = true; ; bool = false)
    {
      this.fsG = new b(parama1, paramInt1, paramInt2, bool, paramInt5);
      this.fsH = new c(parama2, paramInt3, paramBoolean);
      this.uri = paramString;
      this.fsI = paramInt1;
      this.azs = paramInt4;
      AppMethodBeat.o(58159);
      return;
    }
  }

  public final void a(z paramz)
  {
    AppMethodBeat.i(58160);
    this.fsG.a(paramz);
    AppMethodBeat.o(58160);
  }

  public final a acA()
  {
    return this.fsH.fsP;
  }

  public final int acB()
  {
    return this.azs;
  }

  public final int acC()
  {
    return this.cQh;
  }

  public final a acz()
  {
    return this.fsG.fsP;
  }

  public final int getType()
  {
    return this.fsI;
  }

  public final String getUri()
  {
    return this.uri;
  }

  public static final class a
  {
    public int azs = 0;
    public int fsI;
    public a fsJ;
    public a fsK;
    public int fsL = 0;
    public int fsM = 0;
    public boolean fsN = true;
    public int fsO = 0;
    public String uri;

    public final void a(a parama)
    {
      this.fsJ = parama;
    }

    public final b acD()
    {
      boolean bool1 = true;
      AppMethodBeat.i(58156);
      if ((this.fsJ == null) || (this.fsK == null) || (bo.isNullOrNil(this.uri)) || (this.fsI <= 0) || (this.fsL == -2147483648) || (this.fsM == -2147483648))
      {
        boolean bool2;
        boolean bool3;
        label74: boolean bool4;
        boolean bool5;
        label93: boolean bool6;
        if (this.fsJ == null)
        {
          bool2 = true;
          if (this.fsK != null)
            break label191;
          bool3 = true;
          bool4 = bo.isNullOrNil(this.uri);
          if (this.fsI > 0)
            break label196;
          bool5 = true;
          if (this.fsL != -2147483648)
            break label202;
          bool6 = true;
          label105: if (this.fsM != -2147483648)
            break label208;
        }
        while (true)
        {
          localObject = new IllegalArgumentException(String.format("%s %s %s %s %s %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6), Boolean.valueOf(bool1) }));
          AppMethodBeat.o(58156);
          throw ((Throwable)localObject);
          bool2 = false;
          break;
          label191: bool3 = false;
          break label74;
          label196: bool5 = false;
          break label93;
          label202: bool6 = false;
          break label105;
          label208: bool1 = false;
        }
      }
      Object localObject = new b(this.fsJ, this.fsK, this.uri, this.fsI, this.fsL, this.fsM, this.fsN, this.azs, this.fsO, (byte)0);
      AppMethodBeat.o(58156);
      return localObject;
    }

    public final void b(a parama)
    {
      this.fsK = parama;
    }

    public final void kU(int paramInt)
    {
      this.fsI = paramInt;
    }

    public final void kV(int paramInt)
    {
      this.fsL = paramInt;
    }

    public final void kW(int paramInt)
    {
      this.fsM = paramInt;
    }

    public final void qq(String paramString)
    {
      this.uri = paramString;
    }
  }

  public static final class b extends l.d
    implements l.b
  {
    public int cmdId;
    private int fsI;
    public a fsP;
    private boolean fsQ;

    public b(a parama, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      this.fsP = parama;
      this.fsI = paramInt1;
      this.cmdId = paramInt2;
      this.fsQ = paramBoolean;
      this.fsO = paramInt3;
    }

    public final byte[] ZT()
    {
      AppMethodBeat.i(58157);
      if ((this.fsP instanceof bsr))
        ((bsr)this.fsP).setBaseRequest(l.a(this));
      byte[] arrayOfByte = this.fsP.toByteArray();
      AppMethodBeat.o(58157);
      return arrayOfByte;
    }

    public final int ZU()
    {
      return this.fsI;
    }

    public final int getCmdId()
    {
      return this.cmdId;
    }
  }

  public static final class c extends l.e
    implements l.c
  {
    public int cmdId;
    public a fsP = null;
    private boolean fsQ;

    public c(a parama, int paramInt, boolean paramBoolean)
    {
      this.fsP = parama;
      this.cmdId = paramInt;
      this.fsQ = paramBoolean;
    }

    public final int P(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(58158);
      this.fsP = this.fsP.parseFrom(paramArrayOfByte);
      int i;
      if (!(this.fsP instanceof bzw))
      {
        l.a(this, ((btd)this.fsP).getBaseResponse());
        i = ((btd)this.fsP).getBaseResponse().Ret;
        AppMethodBeat.o(58158);
      }
      while (true)
      {
        return i;
        i = ((bzw)this.fsP).getRet();
        AppMethodBeat.o(58158);
      }
    }

    public final int getCmdId()
    {
      return this.cmdId;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.b
 * JD-Core Version:    0.6.2
 */
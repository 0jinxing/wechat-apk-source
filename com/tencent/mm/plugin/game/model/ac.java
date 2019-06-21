package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.ae;
import com.tencent.mm.plugin.game.d.am;
import com.tencent.mm.plugin.game.d.be;
import com.tencent.mm.plugin.game.d.by;
import com.tencent.mm.plugin.game.d.di;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class ac extends x
{
  private be mXU;
  public by mXV;
  public ac.a mXW;
  public com.tencent.mm.plugin.game.d.ah mXX;
  public di mXY;
  public am mXZ;

  public ac(be parambe)
  {
    AppMethodBeat.i(111372);
    if (parambe == null)
    {
      this.mXU = new be();
      AppMethodBeat.o(111372);
    }
    while (true)
    {
      return;
      this.mXU = parambe;
      hM(true);
      AppMethodBeat.o(111372);
    }
  }

  public ac(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111373);
    this.mXU = new be();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(111373);
    while (true)
    {
      return;
      try
      {
        this.mXU.parseFrom(paramArrayOfByte);
        hM(false);
        AppMethodBeat.o(111373);
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
          ab.e("MicroMsg.GamePBDataIndex4", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }

  private void bEL()
  {
    AppMethodBeat.i(111376);
    if (this.mXU == null)
      AppMethodBeat.o(111376);
    while (true)
    {
      return;
      this.mXV = this.mXU.nce;
      if ((this.mXU.ncb != null) && (this.mXU.ncb.mZk != null))
      {
        this.mXW = new ac.a();
        this.mXW.mYa = a(this.mXU.ncb.mZk);
        if (this.mXW.mYa != null)
        {
          this.mXW.mYa.mVk = this.mXU.ncb.Desc;
          this.mXW.mYa.scene = 10;
          this.mXW.mYa.cKG = 1002;
          this.mXW.mYa.position = 1;
        }
        this.mXW.mYb = this.mXU.ncb.naN;
        this.mXW.mYc = this.mXU.ncb.naM;
        this.mXW.desc = this.mXU.ncb.Desc;
        this.mXW.mYd = this.mXU.ncd;
      }
      this.mXX = this.mXU.ncc;
      this.mXY = this.mXU.ncf;
      this.mXZ = this.mXU.ncg;
      AppMethodBeat.o(111376);
    }
  }

  private void hM(boolean paramBoolean)
  {
    AppMethodBeat.i(111374);
    bEL();
    hN(paramBoolean);
    AppMethodBeat.o(111374);
  }

  private void hN(boolean paramBoolean)
  {
    AppMethodBeat.i(111375);
    if ((this.mXU == null) || (!paramBoolean))
      AppMethodBeat.o(111375);
    while (true)
    {
      return;
      if ((this.mXU.ncb != null) && (this.mXU.ncb.mZk != null))
        d.a(a(this.mXU.ncb.mZk));
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().init(com.tencent.mm.sdk.platformtools.ah.getContext());
      AppMethodBeat.o(111375);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ac
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi.b;

final class c$d
{
  String content;
  long createTime;
  long cvx;
  int mGE;
  int mGF;
  String mGG;
  String mGH;
  int msgType;
  String talker;

  private c$d(c paramc)
  {
  }

  public final boolean bAA()
  {
    if ((this.msgType & 0xFFFF) == 49);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bAB()
  {
    boolean bool = true;
    if (this.msgType == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean bAC()
  {
    if (this.msgType == 48);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void bAD()
  {
    AppMethodBeat.i(136753);
    if (bAB())
    {
      this.mGE = 41;
      if (t.kH(this.talker))
      {
        this.mGG = bf.oz(this.content);
        if (!bo.isNullOrNil(this.mGG))
          this.mGG = d.Na(this.mGG);
        if (this.mGF != 1)
          break label810;
        this.mGH = r.Yz();
        AppMethodBeat.o(136753);
      }
    }
    while (true)
    {
      return;
      this.mGG = this.content;
      break;
      if (bAA())
      {
        localObject = j.b.me(this.content);
        if (localObject == null)
          break;
        switch (((j.b)localObject).type)
        {
        default:
          break;
        case 3:
        case 4:
        case 5:
        case 8:
        case 10:
        case 13:
        case 15:
        case 16:
        case 20:
        case 25:
          this.mGG = bo.bc(((j.b)localObject).getTitle(), "");
          this.mGE = 43;
          break;
        case 6:
          this.mGG = bo.bc(((j.b)localObject).getTitle(), "");
          this.mGE = 42;
          break;
        case 19:
          this.mGG = bo.bc(((j.b)localObject).getDescription(), "");
          if (this.mGG != null)
            this.mGG = this.mGG.replace(":", "​");
          this.mGE = 44;
          break;
        case 24:
          this.mGG = bo.bc(((j.b)localObject).getDescription(), "");
          if (this.mGG != null)
            this.mGG = this.mGG.replace(":", "​");
          this.mGE = 49;
          break;
        case 33:
          this.mGG = bo.bc(((j.b)localObject).getTitle(), "");
          this.mGE = 48;
          break;
        case 2000:
          this.mGG = (bo.bc(((j.b)localObject).title, "") + "​" + bo.bc(((j.b)localObject).description, ""));
          this.mGE = 45;
          break;
        case 2001:
          if ("1001".equals(((j.b)localObject).fhY))
          {
            this.mGE = 47;
            if (this.mGF == 1)
            {
              this.mGG = (bo.bc(((j.b)localObject).fhW, "") + "​" + bo.bc(((j.b)localObject).fhT, ""));
              break;
            }
            this.mGG = (bo.bc(((j.b)localObject).fhW, "") + "​" + bo.bc(((j.b)localObject).fhS, ""));
            break;
          }
          if (!"1002".equals(((j.b)localObject).fhY))
            break;
          this.mGE = 46;
          if (this.mGF == 1)
          {
            this.mGG = (bo.bc(((j.b)localObject).fhW, "") + "​" + bo.bc(((j.b)localObject).fhT, ""));
            break;
          }
          this.mGG = (bo.bc(((j.b)localObject).fhW, "") + "​" + bo.bc(((j.b)localObject).fhS, ""));
          break;
        }
      }
      if (!bAC())
        break;
      this.mGE = 50;
      if (t.kH(this.talker));
      for (Object localObject = bf.oz(this.content); ; localObject = this.content)
      {
        localObject = ((j)g.K(j.class)).bOr().Ro((String)localObject);
        if (!((bi.b)localObject).dua())
          break label799;
        this.mGG = (((bi.b)localObject).eUu + "​" + ((bi.b)localObject).label);
        break;
      }
      label799: this.mGG = ((bi.b)localObject).label;
      break;
      label810: if (t.kH(this.talker))
      {
        this.mGH = bo.bc(bf.oy(this.content), this.talker);
        AppMethodBeat.o(136753);
      }
      else
      {
        this.mGH = this.talker;
        AppMethodBeat.o(136753);
      }
    }
  }

  public final boolean isAvailable()
  {
    AppMethodBeat.i(136754);
    boolean bool;
    if (!bo.isNullOrNil(this.mGG))
    {
      bool = true;
      AppMethodBeat.o(136754);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136754);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.d
 * JD-Core Version:    0.6.2
 */
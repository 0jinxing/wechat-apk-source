package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.wy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class a
  implements g
{
  protected MMActivity jiE;
  protected b kaS;
  protected e.a kjF;
  boolean kok = false;
  private boolean kol = false;
  private boolean kom = false;
  private boolean kon = false;
  private boolean koo = false;
  private boolean kop = false;
  private boolean koq = false;
  private boolean kor = false;
  private boolean kos = false;
  private boolean kot = false;

  public a(MMActivity paramMMActivity)
  {
    this.jiE = paramMMActivity;
  }

  private boolean bdA()
  {
    AppMethodBeat.i(88698);
    boolean bool;
    if (!TextUtils.isEmpty(this.kaS.aZW().code))
    {
      bool = true;
      AppMethodBeat.o(88698);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88698);
    }
  }

  private String getString(int paramInt)
  {
    AppMethodBeat.i(88695);
    String str = this.jiE.getString(paramInt);
    AppMethodBeat.o(88695);
    return str;
  }

  public final void a(b paramb, e.a parama)
  {
    AppMethodBeat.i(88693);
    this.kaS = paramb;
    this.kjF = parama;
    bdD();
    AppMethodBeat.o(88693);
  }

  public final boolean bcT()
  {
    return this.kok;
  }

  protected final boolean bdB()
  {
    AppMethodBeat.i(88699);
    boolean bool;
    if ((!this.kaS.isAcceptable()) && ((l.tm(this.kjF.emC)) || (l.tn(this.kjF.emC)) || (this.kjF.emC == 23)))
    {
      bool = true;
      AppMethodBeat.o(88699);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88699);
    }
  }

  protected final boolean bdC()
  {
    AppMethodBeat.i(88700);
    boolean bool;
    if ((!this.kaS.aZS()) && (this.kjF.emC == 6))
    {
      bool = true;
      AppMethodBeat.o(88700);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88700);
    }
  }

  protected void bdD()
  {
    AppMethodBeat.i(88701);
    ab.i("MicroMsg.CardBaseShowLogic", "updateAcceptState()");
    if ((l.tm(this.kjF.emC)) || (l.tn(this.kjF.emC)))
      if (this.kaS.isAcceptable())
      {
        this.kol = true;
        this.kom = true;
        this.kor = true;
        this.kop = true;
        this.koq = true;
        if (!this.kaS.aZR())
          break label567;
        this.kol = false;
        this.kom = false;
        ab.i("MicroMsg.CardBaseShowLogic", "need direct jump!");
        label104: if (!this.kok)
          break label577;
        this.kol = false;
        this.kom = false;
        ab.i("MicroMsg.CardBaseShowLogic", "updateAcceptView to gone!");
      }
    while (true)
    {
      ab.i("MicroMsg.CardBaseShowLogic", "mIsAcceptedCard:" + this.kok);
      AppMethodBeat.o(88701);
      return;
      if (!this.kaS.isAcceptable())
      {
        this.kol = true;
        this.kom = false;
        if (this.kaS.aZR())
        {
          this.kos = true;
          this.kop = true;
          this.koo = true;
        }
        while (true)
        {
          this.koq = true;
          break;
          this.kop = false;
        }
      }
      this.kol = false;
      this.kom = false;
      this.kop = false;
      break;
      if (this.kjF.emC == 6)
      {
        if (this.kaS.aZS())
        {
          this.kol = true;
          this.kom = true;
          this.kop = false;
          break;
        }
        if (this.kaS.isNormal())
        {
          this.kos = true;
          this.kop = true;
          this.kon = true;
          this.koo = true;
          break;
        }
        this.kol = false;
        this.kom = false;
        this.kop = false;
        this.kon = true;
        break;
      }
      if (l.to(this.kjF.emC))
      {
        this.kol = false;
        this.kom = false;
        this.kon = true;
        if (this.kaS.isNormal())
        {
          this.kos = true;
          this.kop = true;
          this.koo = true;
          break;
        }
        this.kot = true;
        break;
      }
      if (this.kjF.emC != 23)
        break;
      if (this.kaS.isAcceptable())
      {
        this.kol = true;
        this.kom = true;
        this.kop = false;
      }
      for (this.koq = true; ; this.koq = true)
      {
        if ((TextUtils.isEmpty(this.kjF.kiN)) || (this.kjF.kiN.equals(r.Yz())) || (this.kaS.aZU()))
          break label565;
        ab.i("MicroMsg.CardBaseShowLogic", " detail page");
        this.kol = false;
        this.kom = false;
        this.kon = true;
        if (!this.kaS.isNormal())
          break;
        this.kos = true;
        this.kop = true;
        this.koo = true;
        break;
        this.kol = true;
        this.kom = false;
        this.kop = false;
      }
      label565: break;
      label567: ab.i("MicroMsg.CardBaseShowLogic", "not need direct jump!");
      break label104;
      label577: if (!this.kol)
      {
        this.kok = true;
        ab.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is true");
      }
      else
      {
        this.kok = false;
        ab.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is false!");
      }
    }
  }

  public boolean bdE()
  {
    return this.kol;
  }

  public final boolean bdF()
  {
    return this.kom;
  }

  public final boolean bdG()
  {
    return this.kon;
  }

  public final boolean bdH()
  {
    return this.koo;
  }

  public final boolean bdI()
  {
    return this.kop;
  }

  public final boolean bdJ()
  {
    return this.kor;
  }

  public final boolean bdK()
  {
    return this.kos;
  }

  public final boolean bdL()
  {
    return this.kot;
  }

  public boolean bdM()
  {
    return true;
  }

  public boolean bdN()
  {
    return false;
  }

  public boolean bdO()
  {
    return false;
  }

  public boolean bdP()
  {
    AppMethodBeat.i(88702);
    boolean bool;
    if (((this.kjF.emC == 6) && ((!this.kaS.isNormal()) || (this.kaS.aZS()))) || (this.kjF.emC == 5) || ((this.kjF.emC == 23) && (this.kaS.aZU())))
    {
      bool = true;
      AppMethodBeat.o(88702);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88702);
    }
  }

  public boolean bdQ()
  {
    return false;
  }

  public boolean bdR()
  {
    return true;
  }

  public boolean bdS()
  {
    AppMethodBeat.i(88703);
    boolean bool;
    if (((bdA()) && (bdy()) && (bdz())) || (this.kok))
    {
      bool = true;
      AppMethodBeat.o(88703);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88703);
    }
  }

  public boolean bdT()
  {
    return false;
  }

  public boolean bdU()
  {
    AppMethodBeat.i(88704);
    boolean bool;
    if (!this.kaS.isNormal())
    {
      bool = true;
      AppMethodBeat.o(88704);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88704);
    }
  }

  public boolean bdV()
  {
    AppMethodBeat.i(88705);
    boolean bool;
    if ((this.kaS.aZV().vUo != null) && (this.kaS.aZV().vUo.wcS != null) && (this.kaS.aZV().vUo.wcS.size() > 0) && (!TextUtils.isEmpty((CharSequence)this.kaS.aZV().vUo.wcS.get(0))))
    {
      bool = true;
      AppMethodBeat.o(88705);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(88705);
      bool = false;
    }
  }

  public boolean bdW()
  {
    AppMethodBeat.i(88706);
    boolean bool;
    if ((this.kaS.aZW().vSc != null) && (this.kaS.aZW().vSc.size() > 0) && (((bdy()) && (bdz())) || (this.kok)))
    {
      bool = true;
      AppMethodBeat.o(88706);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88706);
    }
  }

  public boolean bdX()
  {
    return false;
  }

  public final boolean bdY()
  {
    AppMethodBeat.i(88707);
    boolean bool;
    if ((this.kaS.aZW().vSg != null) && (!TextUtils.isEmpty(this.kaS.aZW().vSg.title)))
    {
      bool = true;
      AppMethodBeat.o(88707);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88707);
    }
  }

  public boolean bdZ()
  {
    AppMethodBeat.i(88708);
    boolean bool;
    if ((this.kaS.aZW().vSj != null) && (!TextUtils.isEmpty(this.kaS.aZW().vSj.title)))
    {
      bool = true;
      AppMethodBeat.o(88708);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88708);
    }
  }

  public final String bdx()
  {
    AppMethodBeat.i(88694);
    String str = "";
    if (!TextUtils.isEmpty(this.kaS.aZV().vUu))
      str = this.kaS.aZV().vUu;
    while (true)
    {
      AppMethodBeat.o(88694);
      return str;
      if (this.kaS.aZW().vSd == 0L)
        str = getString(2131297935);
      else if (this.kaS.aZW().vSe == 0)
        if (!TextUtils.isEmpty(this.kaS.aZV().vUb))
          str = this.kaS.aZV().vUb;
        else
          str = getString(2131297796);
    }
  }

  public final boolean bdy()
  {
    boolean bool = true;
    AppMethodBeat.i(88696);
    if ((this.kaS.aZW().status == 0) || (this.kaS.aZW().status == 1) || (this.kaS.aZW().status == 2))
      AppMethodBeat.o(88696);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88696);
    }
  }

  public final boolean bdz()
  {
    AppMethodBeat.i(88697);
    boolean bool;
    if ((this.kjF.emC == 3) || ((this.kjF.emC == 6) && (this.kaS.aZW().vSa == 0)) || (this.kjF.emC == 4) || (this.kjF.emC == 5) || (this.kjF.emC == 15))
    {
      bool = true;
      AppMethodBeat.o(88697);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88697);
    }
  }

  public boolean bea()
  {
    AppMethodBeat.i(88709);
    boolean bool;
    if (this.kaS.aZV().vUk != null)
    {
      bool = true;
      AppMethodBeat.o(88709);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88709);
    }
  }

  public boolean beb()
  {
    AppMethodBeat.i(88710);
    boolean bool;
    if (!TextUtils.isEmpty(this.kaS.aZV().vUh))
    {
      bool = true;
      AppMethodBeat.o(88710);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88710);
    }
  }

  public boolean bec()
  {
    return false;
  }

  public boolean bed()
  {
    return false;
  }

  public final void bee()
  {
    int i = 1;
    AppMethodBeat.i(88711);
    int j;
    String str;
    int k;
    label32: int m;
    label42: int n;
    label52: int i1;
    label62: int i2;
    label72: int i3;
    label82: int i4;
    label92: int i5;
    label102: int i6;
    if (bdA())
    {
      j = 1;
      str = bdx();
      if (!this.kok)
        break label240;
      k = 1;
      if (!bdE())
        break label246;
      m = 1;
      if (!this.kom)
        break label252;
      n = 1;
      if (!this.kon)
        break label258;
      i1 = 1;
      if (!this.koo)
        break label264;
      i2 = 1;
      if (!this.kop)
        break label270;
      i3 = 1;
      if (!this.koq)
        break label276;
      i4 = 1;
      if (!this.kor)
        break label282;
      i5 = 1;
      if (!this.kos)
        break label288;
      i6 = 1;
      label112: if (!this.kot)
        break label294;
    }
    while (true)
    {
      ab.i("MicroMsg.CardBaseShowLogic", "printStatus, isValidCode:%d, getUnacceptWording:%s, isAcceptedCard:%d, acceptViewVisible:%d, acceptViewEnabled:%d, isShowConsumedBtn:%d, isConsumedBtnEnabled:%d, enableOptionMenu:%d, isShareLogoVisible:%d, addShareMenu:%d, addMenu:%d, addInvalidCardMenu:%d ", new Object[] { Integer.valueOf(j), str, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i) });
      AppMethodBeat.o(88711);
      return;
      j = 0;
      break;
      label240: k = 0;
      break label32;
      label246: m = 0;
      break label42;
      label252: n = 0;
      break label52;
      label258: i1 = 0;
      break label62;
      label264: i2 = 0;
      break label72;
      label270: i3 = 0;
      break label82;
      label276: i4 = 0;
      break label92;
      label282: i5 = 0;
      break label102;
      label288: i6 = 0;
      break label112;
      label294: i = 0;
    }
  }

  public final void release()
  {
    this.kaS = null;
    this.kjF = null;
    this.jiE = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.a.a
 * JD-Core Version:    0.6.2
 */
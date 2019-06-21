package com.tencent.mm.plugin.backup.d;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.ua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class e
{
  com.tencent.mm.plugin.backup.b.e jqR;
  LinkedList<ua> jud;
  String jue;
  private String juf;
  private boolean jug;
  e.a juh;
  private ap jui;
  final f juj;
  final f juk;

  public e(e.a parama, com.tencent.mm.plugin.backup.b.e parame)
  {
    AppMethodBeat.i(17305);
    this.juf = "";
    this.jug = false;
    this.jui = new ap(Looper.getMainLooper(), new e.1(this), true);
    this.juj = new e.2(this);
    this.juk = new e.3(this);
    this.juh = parama;
    this.jqR = parame;
    AppMethodBeat.o(17305);
  }

  private boolean aTs()
  {
    boolean bool = false;
    AppMethodBeat.i(17309);
    this.jud = new LinkedList();
    PString localPString = new PString();
    PInt localPInt = new PInt();
    this.jue = g.ds(ah.getContext());
    ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "wifiName :%s", new Object[] { this.jue });
    if (bo.isNullOrNil(this.jue))
    {
      this.jqR.jqW = -4;
      this.juh.k(-4, null);
      this.juf = "";
      AppMethodBeat.o(17309);
    }
    while (true)
    {
      return bool;
      if (!b.aSZ().aTa().a(localPString, localPInt))
      {
        this.jqR.jqW = -4;
        this.juh.k(-4, null);
        this.juf = "";
        AppMethodBeat.o(17309);
      }
      else
      {
        ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "server listen result: %s, %d", new Object[] { localPString.value, Integer.valueOf(localPInt.value) });
        ua localua = new ua();
        localua.vYA = localPString.value;
        localua.wbp = new LinkedList();
        localua.wbp.add(Integer.valueOf(localPInt.value));
        this.jud.add(localua);
        AppMethodBeat.o(17309);
        bool = true;
      }
    }
  }

  final void aTr()
  {
    AppMethodBeat.i(17308);
    Object localObject = g.ds(ah.getContext());
    ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "checkNetStatus newWifiName:%s  preWifiName:%s acc:%b hold:%b", new Object[] { localObject, this.juf, Boolean.valueOf(aw.RK()), Boolean.valueOf(aw.QT()) });
    if (!((String)localObject).equals(this.juf))
      if (!aw.RK())
        AppMethodBeat.o(17308);
    while (true)
    {
      return;
      this.juf = ((String)localObject);
      if (!aTs())
      {
        this.jug = false;
        AppMethodBeat.o(17308);
      }
      else
      {
        this.jug = false;
        if (!aw.QT())
        {
          ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "begin to netscene create QRCode online ");
          aw.Rg().a(704, this.juj);
          localObject = new com.tencent.mm.plugin.backup.e.b(this.jud, this.jue);
          aw.Rg().a((m)localObject, 0);
          AppMethodBeat.o(17308);
        }
        else
        {
          ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "begin to netscene create QRCode offline");
          aw.Rg().a(1000, this.juk);
          localObject = new com.tencent.mm.plugin.backup.e.a(this.jud, this.jue, b.aSZ().jtg);
          aw.Rg().a((m)localObject, 0);
          AppMethodBeat.o(17308);
        }
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(17306);
    ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "start check network and gen qrcode handler starting:%b stop:%b .%s %s", new Object[] { Boolean.valueOf(this.jug), Boolean.valueOf(this.jui.doT()), this, bo.dpG() });
    if (this.jug)
    {
      AppMethodBeat.o(17306);
      return;
    }
    this.jug = true;
    if (aTs())
    {
      this.juf = null;
      aTr();
    }
    while (true)
    {
      this.jui.ae(500L, 500L);
      AppMethodBeat.o(17306);
      break;
      this.jqR.jqW = -4;
      this.juh.k(-4, null);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(17307);
    ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "stop check network and gen qrcode handler.");
    this.jug = false;
    aw.Rg().b(704, this.juj);
    aw.Rg().b(1000, this.juk);
    this.jui.stopTimer();
    AppMethodBeat.o(17307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.e
 * JD-Core Version:    0.6.2
 */
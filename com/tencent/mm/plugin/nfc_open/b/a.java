package com.tencent.mm.plugin.nfc_open.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.protobuf.bel;
import com.tencent.mm.protocal.protobuf.nn;
import com.tencent.mm.protocal.protobuf.sz;
import com.tencent.mm.protocal.protobuf.uk;
import com.tencent.mm.protocal.protobuf.ul;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public final class a
  implements f
{
  public bel oTw;

  public a()
  {
    AppMethodBeat.i(23063);
    init();
    AppMethodBeat.o(23063);
  }

  private void a(bel parambel)
  {
    AppMethodBeat.i(23065);
    if (!aw.RK())
    {
      ab.i("MicroMsg.CpuCardConfigManager", "setConfig account not ready");
      AppMethodBeat.o(23065);
    }
    while (true)
    {
      return;
      if (parambel != null)
      {
        ab.i("MicroMsg.CpuCardConfigManager", "setConfig config");
        this.oTw = parambel;
        try
        {
          parambel = new java/lang/String;
          parambel.<init>(this.oTw.toByteArray(), "ISO-8859-1");
          aw.ZK();
          c.Ry().set(ac.a.xKW, parambel);
          AppMethodBeat.o(23065);
        }
        catch (UnsupportedEncodingException parambel)
        {
          ab.w("MicroMsg.CpuCardConfigManager", "save config exp, " + parambel.getLocalizedMessage());
          AppMethodBeat.o(23065);
        }
        catch (IOException parambel)
        {
          ab.w("MicroMsg.CpuCardConfigManager", "save config exp, " + parambel.getLocalizedMessage());
        }
      }
      else
      {
        AppMethodBeat.o(23065);
      }
    }
  }

  private bel bVC()
  {
    AppMethodBeat.i(23066);
    if (this.oTw == null)
      init();
    bel localbel = this.oTw;
    AppMethodBeat.o(23066);
    return localbel;
  }

  private void init()
  {
    AppMethodBeat.i(23064);
    this.oTw = new bel();
    aw.ZK();
    String str = String.valueOf(c.Ry().get(ac.a.xKW, null));
    if (bo.isNullOrNil(str))
    {
      this.oTw.wbW = new LinkedList();
      this.oTw.lastUpdateTime = 0L;
      this.oTw.wbX = 86400;
      this.oTw.version = 0;
      AppMethodBeat.o(23064);
    }
    while (true)
    {
      return;
      try
      {
        this.oTw.parseFrom(str.getBytes("ISO-8859-1"));
        AppMethodBeat.o(23064);
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.CpuCardConfigManager", "parseConfig exp, " + localException.getLocalizedMessage());
        this.oTw.wbW = new LinkedList();
        this.oTw.lastUpdateTime = 0L;
        this.oTw.wbX = 86400;
        this.oTw.version = 0;
        AppMethodBeat.o(23064);
      }
    }
  }

  public final boolean bGv()
  {
    int i = 1800;
    AppMethodBeat.i(23067);
    boolean bool;
    try
    {
      if (NfcAdapter.getDefaultAdapter(ah.getContext()) == null)
      {
        ab.i("MicroMsg.CpuCardConfigManager", "Nfc not support no need update");
        AppMethodBeat.o(23067);
        bool = false;
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CpuCardConfigManager", localException, "", new Object[0]);
        AppMethodBeat.o(23067);
        bool = false;
      }
    }
    int j;
    if (this.oTw != null)
    {
      j = this.oTw.wbX;
      if (j < 1800)
        j = i;
    }
    label204: 
    while (true)
    {
      ab.i("MicroMsg.CpuCardConfigManager", "now=" + bo.anT() + ", lastUpdateTime=" + this.oTw.lastUpdateTime + ", updateFreq=" + j + ", configUpdateFreq=" + this.oTw.wbX);
      if (bo.anT() - this.oTw.lastUpdateTime > j)
      {
        bool = true;
        AppMethodBeat.o(23067);
        break;
        if (j <= 604800)
          break label204;
        j = 604800;
        continue;
      }
      AppMethodBeat.o(23067);
      bool = false;
      break;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(23068);
    aw.Rg().b(1561, this);
    uk localuk;
    if ((paramm instanceof com.tencent.mm.plugin.nfc_open.a.b))
    {
      paramString = bVC();
      paramString.lastUpdateTime = bo.anT();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localuk = (uk)((com.tencent.mm.plugin.nfc_open.a.b)paramm).ehh.fsH.fsP;
        if (localuk != null)
        {
          paramString.wbX = localuk.wbX;
          paramString.wbY = localuk.wbY;
          aw.ZK();
          if (((Integer)c.Ry().get(ac.a.xLb, Integer.valueOf(0))).intValue() == 0)
          {
            if (localuk.wbY == 1)
              ah.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ah.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
          }
          else
          {
            aw.ZK();
            c.Ry().set(ac.a.xLc, Integer.valueOf(localuk.wbY));
            aw.ZK();
            c.Ry().set(ac.a.xLf, localuk.tuB);
            if (paramString.version != localuk.version)
              break label261;
            ab.i("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd no config change return version = " + localuk.version);
            a(paramString);
            AppMethodBeat.o(23068);
          }
        }
      }
    }
    while (true)
    {
      return;
      ah.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ah.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
      break;
      label261: paramString.version = localuk.version;
      if ((localuk.wbW != null) && (!localuk.wbW.isEmpty()))
        if (paramString.wbW == null)
        {
          paramString.wbW = new LinkedList();
          paramInt1 = 0;
        }
      while (true)
        if (paramInt1 < localuk.wbW.size())
        {
          paramm = new nn();
          paramm.vzX = ((nn)localuk.wbW.get(paramInt1)).vzX;
          paramm.vRS = ((nn)localuk.wbW.get(paramInt1)).vRS;
          ab.d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd sflag=" + bo.h(Integer.valueOf(paramm.vRS)) + ", url=" + bo.nullAsNil(paramm.vzX));
          if (paramm.vRR == null)
            paramm.vRR = new LinkedList();
          label439: for (paramInt2 = 0; ; paramInt2++)
          {
            if (paramInt2 >= ((nn)localuk.wbW.get(paramInt1)).vRR.size())
              break label731;
            ul localul = new ul();
            if (localul.wbZ == null)
              localul.wbZ = new LinkedList();
            while (true)
            {
              for (int i = 0; i < ((ul)((nn)localuk.wbW.get(paramInt1)).vRR.get(paramInt2)).wbZ.size(); i++)
              {
                sz localsz = new sz();
                localsz.wap = ((sz)((ul)((nn)localuk.wbW.get(paramInt1)).vRR.get(paramInt2)).wbZ.get(i)).wap;
                localsz.nYb = ((sz)((ul)((nn)localuk.wbW.get(paramInt1)).vRR.get(paramInt2)).wbZ.get(i)).nYb;
                ab.d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd cmd=" + bo.nullAsNil(localsz.wap) + ", answer=" + bo.nullAsNil(localsz.nYb));
                localul.wbZ.add(localsz);
              }
              paramString.wbW.clear();
              break;
              paramm.vRR.clear();
              break label439;
              localul.wbZ.clear();
            }
            paramm.vRR.add(localul);
          }
          label731: paramString.wbW.add(paramm);
          paramInt1++;
          continue;
          paramString.wbW.clear();
        }
      a(paramString);
      AppMethodBeat.o(23068);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc_open.b.a
 * JD-Core Version:    0.6.2
 */
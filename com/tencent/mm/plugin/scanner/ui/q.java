package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.modelsimple.u.b;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.protocal.protobuf.bug;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.h;
import java.util.Map;

@h(doa={BaseScanUI.class})
public final class q extends i
  implements f, com.tencent.mm.plugin.scanner.util.b.a
{
  private static int qeG = 300;
  private float ecs;
  private float ect;
  private com.tencent.mm.modelgeo.b.a ecy;
  private com.tencent.mm.modelgeo.d fwu;
  private boolean fwx;
  private boolean nPX;
  private float pitch;
  private TextView qbp;
  private final int qeM;
  private final int qeN;
  private float qfA;
  private boolean qfB;
  private boolean qfC;
  private boolean qfD;
  private q.a qfE;
  protected ak qfF;
  private int qfv;
  private int qfw;
  private String qfx;
  private String qfy;
  private boolean qfz;

  public q(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint);
    AppMethodBeat.i(81242);
    this.qeM = 300;
    this.qeN = 400;
    this.qfz = false;
    this.qfA = -10000.0F;
    this.pitch = -10000.0F;
    this.qfB = false;
    this.qfC = false;
    this.qfD = false;
    this.fwx = false;
    this.ecy = new q.1(this);
    this.qfF = new q.2(this);
    fd(300, 400);
    AppMethodBeat.o(81242);
  }

  private void chA()
  {
    AppMethodBeat.i(81243);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeStreetView", "initLBS(), scanUICallback == null");
      AppMethodBeat.o(81243);
    }
    while (true)
    {
      return;
      if (this.fwu == null)
        this.fwu = com.tencent.mm.modelgeo.d.agz();
      this.ecs = -85.0F;
      this.ect = -1000.0F;
      this.qfw = -1000;
      this.qfv = 1;
      this.qfx = "";
      this.qfy = "";
      this.fwu.a(this.ecy, true);
      AppMethodBeat.o(81243);
    }
  }

  private void chv()
  {
    AppMethodBeat.i(81247);
    if (this.qet == null)
    {
      ab.e("MicroMsg.scanner.ScanModeStreetView", "dealWithNetWork(), scanUICallback == null");
      AppMethodBeat.o(81247);
    }
    while (true)
    {
      return;
      if ((g.RK()) && ((g.Rg().acS() == 6) || (g.Rg().acS() == 4)))
      {
        this.qet.jL(0L);
        chA();
      }
      AppMethodBeat.o(81247);
    }
  }

  public final void K(Bundle paramBundle)
  {
  }

  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
  }

  protected final void cgN()
  {
    AppMethodBeat.i(81246);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeStreetView", "handleNetworkChange(), scanUICallback == null");
      AppMethodBeat.o(81246);
    }
    while (true)
    {
      return;
      chv();
      AppMethodBeat.o(81246);
    }
  }

  protected final b cgO()
  {
    return null;
  }

  protected final int cgP()
  {
    return 2130970551;
  }

  protected final int cgQ()
  {
    return qeG;
  }

  protected final void cgR()
  {
    AppMethodBeat.i(81245);
    j(new Rect(0, 0, 0, 0));
    this.qet.b(4, null);
    onResume();
    AppMethodBeat.o(81245);
  }

  protected final boolean cgS()
  {
    return true;
  }

  protected final boolean cgT()
  {
    return true;
  }

  protected final void j(Rect paramRect)
  {
    AppMethodBeat.i(81244);
    this.qbp = ((TextView)this.qet.findViewById(2131827194));
    this.qbp.setText(2131302758);
    this.iqU = ((TextView)this.qet.findViewById(2131827209));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iqU.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.qet.getContext(), 13.0F));
      this.iqU.setLayoutParams(localLayoutParams);
    }
    if (com.tencent.mm.compatible.e.d.Lt())
      this.iqU.setPadding(BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.iqU.getPaddingTop(), BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.iqU.getPaddingBottom());
    chv();
    kl(true);
    AppMethodBeat.o(81244);
  }

  public final void jJ(long paramLong)
  {
  }

  protected final void onDestroy()
  {
    AppMethodBeat.i(81251);
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    AppMethodBeat.o(81251);
  }

  protected final void onPause()
  {
    AppMethodBeat.i(81250);
    this.qfB = true;
    kl(false);
    if (g.RK())
      g.Rg().b(424, this);
    if (this.qfF != null)
      this.qfF.removeMessages(0);
    AppMethodBeat.o(81250);
  }

  protected final void onResume()
  {
    AppMethodBeat.i(81249);
    this.qfB = false;
    if (g.RK())
      g.Rg().a(424, this);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeStreetView", "scanUICallback == null");
      AppMethodBeat.o(81249);
    }
    while (true)
    {
      return;
      chv();
      AppMethodBeat.o(81249);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81248);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeStreetView", "onSceneEnd(), scanUICallback == null");
      AppMethodBeat.o(81248);
      return;
    }
    this.qfD = false;
    switch (paramm.getType())
    {
    default:
    case 424:
    }
    while (true)
      while (true)
      {
        AppMethodBeat.o(81248);
        break;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.scanner.ScanModeStreetView", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          AppMethodBeat.o(81248);
          break;
        }
        this.qfD = true;
        paramString = ((u)paramm).ajC();
        if ((paramString == null) || (paramString.vOt == null))
        {
          ab.d("MicroMsg.scanner.ScanModeStreetView", "resp null");
          AppMethodBeat.o(81248);
          break;
        }
        ab.i("MicroMsg.scanner.ScanModeStreetView", "onSceneEnd() errType = [%s], errCode = [%s], resp.Type=[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramString.jCt) });
        if (paramString.jCt == 0)
        {
          paramString = u.tu(paramString.vOt);
          if (bo.isNullOrNil(paramString))
          {
            ab.e("MicroMsg.scanner.ScanModeStreetView", "SCAN_STREET_VIEW_TYPE_STREETVIEW url is null");
            AppMethodBeat.o(81248);
            break;
          }
          if (this.qfE == null)
            this.qfE = new q.a(this, (byte)0);
          this.qfE.url = paramString;
          al.af(this.qfE);
          al.n(this.qfE, 800L);
          AppMethodBeat.o(81248);
          break;
        }
        if (paramString.jCt == 2)
        {
          if ((this.qfF == null) || (this.qfB))
          {
            AppMethodBeat.o(81248);
            break;
          }
          this.qfF.removeMessages(0);
          this.qfF.sendEmptyMessageDelayed(0, 1000L);
          AppMethodBeat.o(81248);
          break;
        }
        if (paramString.jCt == 1)
          try
          {
            paramString = paramString.vOt;
            if (paramString != null)
            {
              paramString = br.z(paramString, "recommend");
              if (paramString != null)
              {
                paramm = u.b.f(paramString, ".recommend");
                u.b localb = new com/tencent/mm/modelsimple/u$b;
                localb.<init>();
                localb.title = bo.nullAsNil((String)paramString.get(".recommend.title"));
                localb.desc = bo.nullAsNil((String)paramString.get(".recommend.desc"));
                localb.fPL = paramm;
              }
            }
            AppMethodBeat.o(81248);
          }
          catch (Exception paramString)
          {
            ab.printErrStackTrace("MicroMsg.scanner.ScanModeStreetView", paramString, "", new Object[0]);
            ab.e("MicroMsg.scanner.ScanModeStreetView", "MM_SCAN_STREET_VIEW_TYPE_RECOMMEND， [%s]", new Object[] { paramString.getMessage() });
          }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.q
 * JD-Core Version:    0.6.2
 */
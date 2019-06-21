package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ba
  implements y
{
  private String appName = "";
  private MMActivity crP;
  private String csB = "";
  private int rig;
  private b rim = null;
  private boolean rjF = false;
  private boolean rjG = false;
  private WXMediaMessage rjH = null;
  private String rkV = "";

  public ba(MMActivity paramMMActivity)
  {
    this.crP = paramMMActivity;
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(39853);
    this.rim = b.u(this.crP.getIntent());
    this.rkV = this.crP.getIntent().getStringExtra(e.k.ygd);
    this.csB = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.rjF = this.crP.getIntent().getBooleanExtra("KThrid_app", false);
    this.rjG = this.crP.getIntent().getBooleanExtra("KSnsAction", false);
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.rjH = new SendMessageToWX.Req(this.crP.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
    AppMethodBeat.o(39853);
  }

  public final void N(Bundle paramBundle)
  {
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(39854);
    if (this.rjH != null)
    {
      this.rjH.description = paramString1;
      if ((this.rjH.mediaObject != null) && ((this.rjH.mediaObject instanceof WXTextObject)))
        ((WXTextObject)this.rjH.mediaObject).text = paramString1;
    }
    af.cnB();
    paramString1 = aw.b(this.rjH, paramString1, this.csB, this.appName);
    if (paramString1 == null)
    {
      ab.e("MicroMsg.TextWidget", "packHelper == null, %s, %s", new Object[] { this.csB, this.appName });
      AppMethodBeat.o(39854);
      return false;
    }
    paramPInt.value = paramString1.aPA;
    if (paramInt3 > a.qFE)
      paramString1.Dd(4);
    paramString1.Dh(this.rig);
    if (this.rjF)
      paramString1.Dh(5);
    paramString2 = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramPInt = t.Zn();
      Iterator localIterator = paramList1.iterator();
      while (localIterator.hasNext())
      {
        paramList1 = (String)localIterator.next();
        if (!paramPInt.contains(paramList1))
        {
          cco localcco = new cco();
          localcco.jBB = paramList1;
          paramString2.add(localcco);
        }
      }
    }
    paramString1.ar(paramString2);
    if (parami != null)
      paramString1.gc(parami.token, parami.wFn);
    paramString1.a(paramayt);
    if (paramBoolean)
      paramString1.Di(1);
    while (true)
    {
      paramString1.dg(paramList2).Df(paramInt1);
      paramString1.g(null, null, null, paramInt4, paramInt5);
      if ((this.rjG) && (this.rjH != null))
      {
        paramString1.Yn(this.rjH.mediaTagName);
        paramString1.af(this.csB, this.rjH.messageExt, this.rjH.messageAction);
      }
      paramInt1 = paramString1.commit();
      if (this.rim != null)
      {
        this.rim.ma(paramInt1);
        g.qTp.c(this.rim);
      }
      af.cnB().cmp();
      this.crP.finish();
      AppMethodBeat.o(39854);
      break;
      paramString1.Di(0);
    }
  }

  public final boolean crG()
  {
    return true;
  }

  public final View crH()
  {
    return null;
  }

  public final boolean crI()
  {
    return false;
  }

  public final boolean f(int paramInt, Intent paramIntent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ba
 * JD-Core Version:    0.6.2
 */
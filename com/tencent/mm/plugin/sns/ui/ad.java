package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ad
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
  private boolean rkW = false;

  public ad(MMActivity paramMMActivity, boolean paramBoolean)
  {
    this.crP = paramMMActivity;
    this.rkW = paramBoolean;
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(38358);
    this.rim = b.u(this.crP.getIntent());
    this.rkV = this.crP.getIntent().getStringExtra(e.k.ygd);
    this.csB = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.rjF = this.crP.getIntent().getBooleanExtra("KThrid_app", false);
    this.rjG = this.crP.getIntent().getBooleanExtra("KSnsAction", false);
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    paramBundle = this.crP.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null)
      this.rjH = new SendMessageToWX.Req(paramBundle).message;
    AppMethodBeat.o(38358);
  }

  public final void N(Bundle paramBundle)
  {
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(38359);
    if (this.crP.isFinishing())
    {
      paramBoolean = false;
      AppMethodBeat.o(38359);
      return paramBoolean;
    }
    paramString2 = new ax(2);
    paramPInt.value = paramString2.aPA;
    if (paramInt3 > a.qFE)
      paramString2.Dd(2);
    LinkedList localLinkedList = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramPInt = t.Zn();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!paramPInt.contains(str))
        {
          cco localcco = new cco();
          localcco.jBB = str;
          localLinkedList.add(localcco);
        }
      }
    }
    if (paramBoolean)
      paramString2.Di(1);
    while (true)
    {
      if (parami != null)
        paramString2.gc(parami.token, parami.wFn);
      paramString2.Dh(this.rig);
      if (this.rjF)
        paramString2.Dh(5);
      if ((this.rjG) && (this.rjH != null))
      {
        paramString2.Yn(this.rjH.mediaTagName);
        paramString2.af(this.csB, this.rjH.messageExt, this.rjH.messageAction);
      }
      paramString2.g(null, null, null, paramInt4, paramInt5);
      paramString2.Ym(paramString1).a(paramayt).ar(localLinkedList).Df(paramInt1).Dg(paramInt2).dg(paramList2);
      paramInt1 = paramString2.commit();
      if (this.rim != null)
      {
        this.rim.ma(paramInt1);
        g.qTp.c(this.rim);
      }
      this.crP.setResult(-1);
      af.cnB().cmp();
      this.crP.finish();
      paramBoolean = true;
      AppMethodBeat.o(38359);
      break;
      paramString2.Di(0);
    }
  }

  public final boolean crG()
  {
    return this.rkW;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ad
 * JD-Core Version:    0.6.2
 */
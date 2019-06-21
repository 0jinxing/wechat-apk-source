package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.cco;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ab
  implements y
{
  private String appName;
  String cHr;
  MMActivity crP;
  String csB;
  private TextView gne;
  private c hAA;
  boolean isPlaying;
  private View jAp;
  private int rig;
  private CdnImageView rih;
  private TextView rii;
  private b rim;
  private boolean rjF;
  private boolean rjG;
  WXMediaMessage rjH;
  ImageView rku;
  private Bitmap rkv;

  public ab(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(38329);
    this.rjH = null;
    this.rih = null;
    this.gne = null;
    this.rii = null;
    this.csB = "";
    this.appName = "";
    this.rjF = false;
    this.rjG = false;
    this.isPlaying = false;
    this.rim = null;
    this.hAA = new ab.1(this);
    this.crP = paramMMActivity;
    com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
    AppMethodBeat.o(38329);
  }

  public final void M(Bundle paramBundle)
  {
    AppMethodBeat.i(38330);
    this.rjH = new SendMessageToWX.Req(this.crP.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
    this.cHr = this.crP.getIntent().getStringExtra("Ksnsupload_musicid");
    this.rim = b.u(this.crP.getIntent());
    this.csB = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bo.bc(this.crP.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.rjF = this.crP.getIntent().getBooleanExtra("KThrid_app", false);
    this.rjG = this.crP.getIntent().getBooleanExtra("KSnsAction", false);
    this.rig = this.crP.getIntent().getIntExtra("Ksnsupload_source", 0);
    AppMethodBeat.o(38330);
  }

  public final void N(Bundle paramBundle)
  {
  }

  public final boolean a(int paramInt1, int paramInt2, org.b.d.i parami, String paramString1, List<String> paramList1, ayt paramayt, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(38333);
    af.cnB();
    paramString1 = aw.b(this.rjH, paramString1, this.csB, this.appName);
    if (paramString1 == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MusicWidget", "packHelper == null, %s, %s", new Object[] { this.csB, this.appName });
      AppMethodBeat.o(38333);
      return false;
    }
    paramPInt.value = paramString1.aPA;
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.qFE)
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
      AppMethodBeat.o(38333);
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
    AppMethodBeat.i(38332);
    this.jAp = v.hu(this.crP).inflate(2130970979, null);
    this.rih = ((CdnImageView)this.jAp.findViewById(2131825687));
    this.gne = ((TextView)this.jAp.findViewById(2131825689));
    this.rii = ((TextView)this.jAp.findViewById(2131825690));
    this.jAp.findViewById(2131824637).setVisibility(8);
    this.gne.setText(this.rjH.title);
    if (this.rjH.thumbData != null)
      this.rkv = d.bQ(this.rjH.thumbData);
    this.rih.setImageBitmap(this.rkv);
    if (!bo.isNullOrNil(this.rjH.description))
    {
      this.rii.setText(this.rjH.description);
      this.rii.setVisibility(0);
      this.rku = ((ImageView)this.jAp.findViewById(2131824637));
      this.rku.setVisibility(0);
      if ((!com.tencent.mm.aw.a.aie()) || (!this.isPlaying))
        break label273;
      this.rku.setImageResource(2130839637);
    }
    while (true)
    {
      this.rku.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(38328);
          if (com.tencent.mm.aw.a.aie())
          {
            ab.this.crY();
            AppMethodBeat.o(38328);
          }
          while (true)
          {
            return;
            paramAnonymousView = ab.this;
            if (paramAnonymousView.rjH == null)
            {
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MusicWidget", "doBeingPlayMusic: but item is null");
              AppMethodBeat.o(38328);
            }
            else
            {
              new ak(paramAnonymousView.crP.getMainLooper()).post(new ab.3(paramAnonymousView));
              AppMethodBeat.o(38328);
            }
          }
        }
      });
      com.tencent.mm.plugin.sns.data.i.b(this.rih, this.crP);
      View localView = this.jAp;
      AppMethodBeat.o(38332);
      return localView;
      this.rii.setVisibility(8);
      break;
      label273: this.rku.setImageResource(2130839639);
    }
  }

  public final boolean crI()
  {
    AppMethodBeat.i(38334);
    if ((this.rkv != null) && (!this.rkv.isRecycled()))
      this.rkv.recycle();
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    if ((com.tencent.mm.aw.a.aie()) && (this.isPlaying))
      crY();
    boolean bool = com.tencent.mm.aw.a.aie();
    AppMethodBeat.o(38334);
    return bool;
  }

  final void crY()
  {
    AppMethodBeat.i(38331);
    new ak(this.crP.getMainLooper()).post(new ab.2(this));
    AppMethodBeat.o(38331);
  }

  public final boolean f(int paramInt, Intent paramIntent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ab
 * JD-Core Version:    0.6.2
 */
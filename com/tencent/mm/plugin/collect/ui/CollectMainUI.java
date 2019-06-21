package com.tencent.mm.plugin.collect.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.collect.model.d;
import com.tencent.mm.plugin.collect.model.d.a;
import com.tencent.mm.plugin.collect.model.f.a;
import com.tencent.mm.plugin.collect.model.l;
import com.tencent.mm.plugin.collect.model.t;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.protocal.protobuf.bbc;
import com.tencent.mm.protocal.protobuf.bbj;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.bc.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(0)
public class CollectMainUI extends WalletPreferenceUI
  implements d.a, bc.a
{
  private static int kGN;
  private static int kHh = -1;
  private static int kHi = -1;
  private static int kHj = -1;
  private static int kHk = -1;
  private int cQG;
  private com.tencent.mm.ui.base.preference.f iFE;
  private Vibrator iVt;
  protected ScrollView kEu;
  private long kFU;
  protected TextView kGA;
  private RelativeLayout kGB;
  private Bitmap kGC;
  protected String kGD;
  protected String kGE;
  protected String kGF;
  private String kGG;
  private List<CollectMainUI.a> kGH;
  private double kGI;
  private String kGJ;
  private String kGK;
  protected boolean kGL;
  private long kGM;
  private View kGO;
  private CollectMainUI.b kGP;
  private SpannableStringBuilder kGQ;
  private SpannableStringBuilder kGR;
  private com.tencent.mm.plugin.collect.model.f kGS;
  private int kGT;
  private String kGU;
  private String kGV;
  private String kGW;
  protected CdnImageView kGX;
  protected TextView kGY;
  protected TextView kGZ;
  private ImageView kGi;
  private TextView kGj;
  private WalletTextView kGk;
  private TextView kGl;
  private TextView kGm;
  private TextView kGn;
  private RelativeLayout kGo;
  private View kGp;
  private TextView kGq;
  private Dialog kGr;
  private View kGs;
  private View kGt;
  private boolean kGu;
  private View kGv;
  private ImageView kGw;
  private TextView kGx;
  private TextView kGy;
  private TextView kGz;
  protected ImageView kHa;
  protected ViewGroup kHb;
  protected View kHc;
  private boolean kHd;
  private int kHe;
  private bbj kHf;
  private x.a kHg;

  public CollectMainUI()
  {
    AppMethodBeat.i(41287);
    this.kGi = null;
    this.kGj = null;
    this.kGk = null;
    this.kGl = null;
    this.kGm = null;
    this.kGn = null;
    this.kGo = null;
    this.kGp = null;
    this.kGq = null;
    this.iFE = null;
    this.kGr = null;
    this.kGs = null;
    this.kGt = null;
    this.kEu = null;
    this.kGu = false;
    this.kGv = null;
    this.kGC = null;
    this.kGD = null;
    this.kGE = null;
    this.kGF = null;
    this.kGG = null;
    this.kGH = new LinkedList();
    this.kGJ = null;
    this.kGK = null;
    this.kGL = false;
    this.kGP = new CollectMainUI.b(this, (byte)0);
    this.kGT = 0;
    this.kHd = false;
    this.kHe = 0;
    this.kHg = new CollectMainUI.12(this);
    AppMethodBeat.o(41287);
  }

  private Bitmap Id(String paramString)
  {
    AppMethodBeat.i(41297);
    paramString = com.tencent.mm.plugin.collect.model.b.a(this, paramString, com.tencent.mm.model.r.Yz(), this.kGT, this.kGW, this.kHg);
    AppMethodBeat.o(41297);
    return paramString;
  }

  private static bbc Q(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(41308);
    bbc localbbc = new bbc();
    localbbc.type = paramJSONObject.optInt("type", -1);
    localbbc.url = paramJSONObject.optString("url", "");
    localbbc.cEh = paramJSONObject.optString("wording", "");
    localbbc.wFS = paramJSONObject.optString("waapp_username", "");
    localbbc.wFT = paramJSONObject.optString("waapp_path", "");
    AppMethodBeat.o(41308);
    return localbbc;
  }

  private void bhu()
  {
    AppMethodBeat.i(41295);
    getWindow().getDecorView().post(new CollectMainUI.3(this));
    AppMethodBeat.o(41295);
  }

  private void bhv()
  {
    AppMethodBeat.i(41296);
    double d;
    if ((this.kGH != null) && (this.kGH.size() > 0))
    {
      this.kGs.setBackgroundResource(2130838362);
      this.iFE.removeAll();
      int i = 0;
      d = 0.0D;
      if (i < this.kGH.size())
      {
        CollectMainUI.a locala = (CollectMainUI.a)this.kGH.get(i);
        c localc;
        if (i == this.kGH.size() - 1)
        {
          localc = new c(this, (byte)0);
          label102: localc.setKey(String.valueOf(i));
          String str1 = locala.eoz;
          String str2 = str1;
          if (bo.isNullOrNil(str1))
          {
            str2 = str1;
            if (!bo.isNullOrNil(locala.username))
              str2 = com.tencent.mm.wallet_core.ui.e.mJ(locala.username);
          }
          localc.mTitle = str2;
          localc.edV = locala.username;
          if (locala.status != 0)
            break label218;
          localc.setSummary(2131298379);
        }
        while (true)
        {
          this.iFE.b(localc);
          i++;
          break;
          localc = new c(this);
          break label102;
          label218: if (locala.status == 1)
          {
            if (locala.jYD)
            {
              d += locala.kCJ;
              localc.setSummary(com.tencent.mm.wallet_core.ui.e.e(locala.kCJ, locala.cuZ));
            }
            while (true)
            {
              this.iFE.b(localc);
              break;
              localc.setSummary(2131298378);
            }
          }
          if (locala.status == 2)
            localc.setSummary(2131298377);
        }
      }
      this.iFE.notifyDataSetChanged();
      this.kGm.setText(com.tencent.mm.wallet_core.ui.e.e(d, ((CollectMainUI.a)this.kGH.get(0)).cuZ));
      this.kGm.setVisibility(0);
    }
    while (true)
    {
      if ((this.kGH != null) && (this.kGH.size() > 0))
      {
        this.kHb.setBackgroundResource(2130838363);
        this.kGp.setVisibility(0);
        if ((d <= 0.0D) || (this.kGH.size() <= 0))
          break label455;
        this.kHc.setVisibility(0);
        this.kGt.setVisibility(0);
        AppMethodBeat.o(41296);
      }
      while (true)
      {
        return;
        this.kGm.setVisibility(8);
        this.kGp.setVisibility(8);
        this.kGt.setVisibility(8);
        label455: AppMethodBeat.o(41296);
      }
      d = 0.0D;
    }
  }

  private void bhw()
  {
    AppMethodBeat.i(41304);
    aw localaw = k.cPy();
    if (this.kGL);
    for (int i = 33; ; i = 32)
    {
      if (localaw != null)
        com.tencent.mm.plugin.report.service.h.pYm.e(13447, new Object[] { Integer.valueOf(i), localaw.vCF, localaw.vCG, this.kGD, Double.valueOf(this.kGI), Long.valueOf(bo.anT()), Long.valueOf(localaw.vCE), localaw.vCH, localaw.vCI });
      AppMethodBeat.o(41304);
      return;
    }
  }

  private static bbc bhx()
  {
    AppMethodBeat.i(41306);
    try
    {
      Object localObject1 = new org/json/JSONObject;
      g.RQ();
      ((JSONObject)localObject1).<init>((String)g.RP().Ry().get(ac.a.xSX, ""));
      localObject1 = Q((JSONObject)localObject1);
      AppMethodBeat.o(41306);
      return localObject1;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CollectMainUI", localJSONException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(41306);
      }
    }
  }

  private static List<bbc> bhy()
  {
    AppMethodBeat.i(41307);
    ArrayList localArrayList = new ArrayList();
    try
    {
      g.RQ();
      String str = (String)g.RP().Ry().get(ac.a.xSZ, "");
      if (!bo.isNullOrNil(str))
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(str);
        for (int i = 0; i < localJSONArray.length(); i++)
          localArrayList.add(Q(localJSONArray.getJSONObject(i)));
      }
    }
    catch (JSONException localJSONException)
    {
      ab.printErrStackTrace("MicroMsg.CollectMainUI", localJSONException, "", new Object[0]);
      AppMethodBeat.o(41307);
    }
    return localArrayList;
  }

  private void fX(boolean paramBoolean)
  {
    AppMethodBeat.i(41292);
    Object localObject;
    if ((this.kGC != null) && (!this.kGC.isRecycled()))
    {
      i = BackwardSupportUtil.b.b(this, 197.0F);
      localObject = com.tencent.mm.plugin.collect.model.b.a(this, this.kGD, com.tencent.mm.model.r.Yz(), this.kGT, this.kGW, i, this.kHg, false);
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
        if (this.kGL)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11343, new Object[] { Integer.valueOf(1), Integer.valueOf((int)Math.round(this.kGI * 100.0D)) });
          if (this.kGu)
            break label634;
          this.kEu = ((ScrollView)((ViewStub)findViewById(2131822847)).inflate());
          bhr();
          this.kGu = true;
        }
    }
    label399: label431: label458: label476: label634: for (int i = 250; ; i = 0)
    {
      this.kEu.setVisibility(4);
      ((ImageView)this.kEu.findViewById(2131822885)).setImageBitmap(this.kGC);
      TextView localTextView1 = (TextView)this.kEu.findViewById(2131822886);
      TextView localTextView2 = (TextView)this.kEu.findViewById(2131822887);
      LinearLayout localLinearLayout1 = (LinearLayout)this.kEu.findViewById(2131822879);
      LinearLayout localLinearLayout2 = (LinearLayout)this.kEu.findViewById(2131822881);
      TextView localTextView3 = (TextView)this.kEu.findViewById(2131822883);
      TextView localTextView4 = (TextView)this.kEu.findViewById(2131822884);
      TextView localTextView5 = (TextView)this.kEu.findViewById(2131822882);
      String str1 = com.tencent.mm.wallet_core.ui.e.eK(com.tencent.mm.wallet_core.ui.e.mJ(com.tencent.mm.model.r.Yz()), 10);
      String str2 = bhp();
      localObject = str1;
      if (!bo.isNullOrNil(str2))
        localObject = str1 + getString(2131298383, new Object[] { str2 });
      if (this.kGT == 1)
        if (!bo.isNullOrNil(this.kGV))
        {
          localTextView1.setText(this.kGV);
          localTextView2.setText(j.b(this, (CharSequence)localObject, localTextView2.getTextSize()));
          localTextView2.setVisibility(0);
          if (!this.kGL)
            break label586;
          if (bo.isNullOrNil(this.kGK))
            break label576;
          localTextView4.setText(this.kGK);
          localTextView4.setVisibility(0);
          localTextView3.setText(bhq());
          localTextView5.setText(com.tencent.mm.wallet_core.ui.e.F(this.kGI));
          localLinearLayout2.setVisibility(0);
          al.n(new CollectMainUI.5(this, localLinearLayout1, paramBoolean), i);
          i = 1;
          if (i == 0)
            Toast.makeText(this.mController.ylL, getString(2131298397), 1).show();
        }
      while (true)
      {
        this.yCw.notifyDataSetChanged();
        AppMethodBeat.o(41292);
        return;
        com.tencent.mm.plugin.report.service.h.pYm.e(11343, new Object[] { Integer.valueOf(0) });
        break;
        localTextView1.setText(j.b(this, (CharSequence)localObject, localTextView1.getTextSize()));
        break label399;
        localTextView1.setText(j.b(this, (CharSequence)localObject, localTextView1.getTextSize()));
        break label399;
        localTextView4.setVisibility(8);
        break label431;
        localLinearLayout2.setVisibility(8);
        break label458;
        i = 0;
        break label476;
        ab.w("MicroMsg.CollectMainUI", "save ftf pay qrcode failed: bmp null");
        Toast.makeText(this.mController.ylL, getString(2131298397), 1).show();
      }
    }
  }

  public final int JC()
  {
    return 2131165200;
  }

  public final void a(t paramt)
  {
    int i = 0;
    AppMethodBeat.i(41298);
    ab.d("MicroMsg.CollectMainUI", "func[onRecv]:Recv payerMsg");
    int j;
    if (((this.cQG != 1) && (this.cQG != 0)) || ((paramt.msgType == 9) || ((this.cQG == 8) && (paramt.msgType == 26))))
    {
      if (this.iVt != null)
        this.iVt.vibrate(50L);
      if (paramt.timestamp < this.kGM)
      {
        ab.d("MicroMsg.CollectMainUI", "Recieve but time out ");
        AppMethodBeat.o(41298);
        return;
      }
      j = 0;
      label107: if (j >= this.kGH.size())
        break label512;
      if ((paramt.status != 0) || (!bo.nullAsNil(paramt.username).equals(((CollectMainUI.a)this.kGH.get(j)).username)) || (((CollectMainUI.a)this.kGH.get(j)).status != 2))
        break label324;
      this.kGH.remove(j);
      this.kGH.add(j, new CollectMainUI.a(this, paramt));
      j = 1;
    }
    while (true)
    {
      label208: if (j == 0);
      for (int k = 0; ; k++)
      {
        j = i;
        Object localObject;
        if (k < this.kGH.size())
        {
          localObject = (t)this.kGH.get(k);
          if (paramt.timestamp > ((t)localObject).timestamp)
          {
            this.kGH.add(k, new CollectMainUI.a(this, paramt));
            j = 1;
          }
        }
        else
        {
          if (j == 0)
            this.kGH.add(new CollectMainUI.a(this, paramt));
          al.d(new CollectMainUI.4(this));
          AppMethodBeat.o(41298);
          break;
          label324: if (paramt.cAa.equals(((CollectMainUI.a)this.kGH.get(j)).cAa))
          {
            ab.v("MicroMsg.CollectMainUI", "func[onRecv] Duplicated msg, transId=" + paramt.cAa);
            if (((CollectMainUI.a)this.kGH.get(j)).status == 0)
            {
              ((CollectMainUI.a)this.kGH.get(j)).status = paramt.status;
              ((CollectMainUI.a)this.kGH.get(j)).kCJ = paramt.kCJ;
              ((CollectMainUI.a)this.kGH.get(j)).cuZ = paramt.cuZ;
              if (paramt.status == 1)
              {
                localObject = this.kGP;
                CollectMainUI.a locala = (CollectMainUI.a)this.kGH.get(j);
                ((CollectMainUI.b)localObject).kHx.add(locala);
              }
            }
            j = 1;
            break label208;
          }
          j++;
          break label107;
        }
      }
      label512: j = 0;
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    return false;
  }

  public final void aNW()
  {
    AppMethodBeat.i(41302);
    ab.i("MicroMsg.CollectMainUI", "do screen shot");
    com.tencent.mm.plugin.report.service.h.pYm.e(13944, new Object[] { Integer.valueOf(9) });
    if (!this.kHd)
      if (this.kHe == 1)
      {
        e.a locala1 = new e.a(this.mController.ylL);
        e.a locala2 = locala1.asL(getString(2131298395));
        locala2.vkm.zQe.zOU = true;
        locala2.zQL = true;
        locala2.zQK = getString(2131298391);
        locala2.zQJ = getString(2131298394);
        locala2.Qh(getResources().getColor(2131690316)).re(true).a(new CollectMainUI.6(this), new e.c()
        {
          public final void d(boolean paramAnonymousBoolean, String paramAnonymousString)
          {
            AppMethodBeat.i(41258);
            CollectMainUI.e(CollectMainUI.this);
            AppMethodBeat.o(41258);
          }
        });
        locala1.show();
        AppMethodBeat.o(41302);
      }
    while (true)
    {
      return;
      com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131298388), "", getString(2131298387), getString(2131296868), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(41259);
          CollectMainUI.e(CollectMainUI.this);
          com.tencent.mm.plugin.report.service.h.pYm.e(13944, new Object[] { Integer.valueOf(10) });
          AppMethodBeat.o(41259);
        }
      }
      , new CollectMainUI.9(this));
      AppMethodBeat.o(41302);
      continue;
      ab.i("MicroMsg.CollectMainUI", "onScreenShot() realNameVerifying == true ");
      AppMethodBeat.o(41302);
    }
  }

  public final int aWi()
  {
    return 2130969162;
  }

  protected void bho()
  {
    AppMethodBeat.i(41305);
    if (com.tencent.mm.plugin.collect.model.f.kBJ == null)
      com.tencent.mm.plugin.collect.model.f.kBJ = new com.tencent.mm.plugin.collect.model.f();
    this.kGS = com.tencent.mm.plugin.collect.model.f.kBJ;
    Object localObject = this.kGS;
    g.RQ();
    g.RO().eJo.a(1588, (com.tencent.mm.ai.f)localObject);
    com.tencent.mm.plugin.collect.model.f localf = this.kGS;
    CollectMainUI.10 local10 = new CollectMainUI.10(this);
    g.RQ();
    String str1 = (String)g.RP().Ry().get(ac.a.xSV, "");
    g.RQ();
    String str2 = (String)g.RP().Ry().get(ac.a.xSW, "");
    localObject = str1;
    if (bo.isNullOrNil(str1))
    {
      ab.i("MicroMsg.F2fGetPayUrlManager", "use old payurl");
      localObject = com.tencent.mm.plugin.wallet_core.model.r.cPI().cQn();
    }
    local10.dz((String)localObject, str2);
    localObject = new l();
    localf.jxd.put(localObject, local10);
    g.RQ();
    g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
    AppMethodBeat.o(41305);
  }

  protected String bhp()
  {
    AppMethodBeat.i(41309);
    if (bo.isNullOrNil(this.kGE))
    {
      this.kGE = com.tencent.mm.plugin.wallet_core.model.r.cPI().bhp();
      this.kGE = com.tencent.mm.wallet_core.ui.e.att(this.kGE);
    }
    String str = this.kGE;
    AppMethodBeat.o(41309);
    return str;
  }

  protected String bhq()
  {
    AppMethodBeat.i(41310);
    String str = com.tencent.mm.wallet_core.ui.e.atq(this.kGJ);
    AppMethodBeat.o(41310);
    return str;
  }

  protected void bhr()
  {
  }

  protected void bhs()
  {
    AppMethodBeat.i(41294);
    this.kGi.setImageBitmap(null);
    if (this.kGL)
      if (bo.isNullOrNil(this.kGG))
      {
        ab.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
        AppMethodBeat.o(41294);
      }
    while (true)
    {
      return;
      this.kGC = Id(this.kGG);
      label59: if ((this.kGC != null) && (!this.kGC.isRecycled()))
      {
        this.kGi.setImageBitmap(this.kGC);
        label87: if (!this.kGL)
          break label280;
        this.kGk.setPrefix(bhq());
        this.kGk.setText(com.tencent.mm.wallet_core.ui.e.F(this.kGI));
        this.kGk.setVisibility(0);
        if (bo.isNullOrNil(this.kGK))
          break label268;
        this.kGj.setText(j.b(this.mController.ylL, this.kGK, this.kGj.getTextSize()));
        this.kGj.setVisibility(0);
      }
      while (true)
      {
        findViewById(2131822858).setVisibility(0);
        AppMethodBeat.o(41294);
        break;
        if (bo.isNullOrNil(this.kGD))
        {
          ab.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mPayUrl null");
          AppMethodBeat.o(41294);
          break;
        }
        this.kGC = Id(this.kGD);
        break label59;
        ab.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : bmp null ,mFixedPayUrl=" + bo.nullAsNil(this.kGG));
        break label87;
        label268: this.kGj.setVisibility(8);
      }
      label280: this.kGl.setVisibility(8);
      this.kGk.setVisibility(8);
      this.kGj.setVisibility(8);
      findViewById(2131822858).setVisibility(8);
      AppMethodBeat.o(41294);
    }
  }

  public final void bht()
  {
    AppMethodBeat.i(41289);
    xE(getResources().getColor(2131689531));
    AppMethodBeat.o(41289);
  }

  protected final void bq(List<bbc> paramList)
  {
    AppMethodBeat.i(41311);
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        bbc localbbc = (bbc)localIterator.next();
        if (localbbc.type == 1)
          com.tencent.mm.plugin.report.service.h.pYm.e(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(1), localbbc.cEh, "", "", "", Integer.valueOf(1) });
        else if (localbbc.type == 2)
          com.tencent.mm.plugin.report.service.h.pYm.e(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(2), localbbc.cEh, "", "", localbbc.url, Integer.valueOf(1) });
        else if (localbbc.type == 3)
          com.tencent.mm.plugin.report.service.h.pYm.e(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(3), localbbc.cEh, localbbc.wFS, localbbc.wFT, "", Integer.valueOf(1) });
      }
    }
    this.kGB.setOnClickListener(new CollectMainUI.13(this, paramList));
    AppMethodBeat.o(41311);
  }

  public boolean f(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    return false;
  }

  public void finish()
  {
    AppMethodBeat.i(41303);
    super.finish();
    overridePendingTransition(2131034261, 2131034266);
    AppMethodBeat.o(41303);
  }

  public final int getLayoutId()
  {
    return 2130969160;
  }

  public final void initView()
  {
    AppMethodBeat.i(41291);
    setMMTitle(2131301865);
    setBackBtn(new CollectMainUI.14(this));
    this.iFE = this.yCw;
    this.kGo = ((RelativeLayout)findViewById(2131820987));
    this.kGp = findViewById(2131822874);
    this.kHc = findViewById(2131822875);
    this.kGk = ((WalletTextView)findViewById(2131822861));
    this.kGj = ((TextView)findViewById(2131822862));
    this.kGl = ((TextView)findViewById(2131822860));
    this.kGm = ((TextView)findViewById(2131822876));
    this.kGA = ((TextView)findViewById(2131821634));
    this.kGs = ((RelativeLayout)findViewById(2131822853));
    this.kGt = findViewById(2131822877);
    this.kGO = LayoutInflater.from(this).inflate(2130969161, null, false);
    this.kGn = ((TextView)findViewById(2131822867));
    Object localObject = new SpannableStringBuilder(getString(2131298384));
    ((SpannableStringBuilder)localObject).setSpan(new o(new CollectMainUI.15(this)), 0, ((SpannableStringBuilder)localObject).length(), 18);
    this.kGn.setText((CharSequence)localObject);
    this.kGn.setClickable(true);
    this.kGn.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
    this.nDp.addFooterView(this.kGO, null, false);
    this.nDp.setFooterDividersEnabled(false);
    this.kGi = ((ImageView)findViewById(2131822864));
    this.kGq = ((TextView)findViewById(2131822856));
    this.kGz = ((TextView)findViewById(2131822866));
    this.kGz.setClickable(true);
    this.kGz.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
    this.kGQ = new SpannableStringBuilder(getString(2131298372));
    this.kGR = new SpannableStringBuilder(getString(2131298373));
    localObject = new o(new CollectMainUI.16(this));
    o localo = new o(new CollectMainUI.17(this));
    this.kGQ.setSpan(localObject, 0, this.kGQ.length(), 18);
    if (a.a.dzk().dzj())
      this.kGz.setOnClickListener(new CollectMainUI.18(this, (o)localObject, localo));
    this.kGR.setSpan(localo, 0, this.kGR.length(), 18);
    this.kGz.setText(this.kGQ);
    this.kGB = ((RelativeLayout)findViewById(2131822855));
    this.kGi.setOnLongClickListener(new CollectMainUI.19(this));
    this.kGv = findViewById(2131822848);
    this.kGw = ((ImageView)findViewById(2131822849));
    this.kGx = ((TextView)findViewById(2131822850));
    this.kGy = ((TextView)findViewById(2131822851));
    this.kGX = ((CdnImageView)findViewById(2131822870));
    this.kGY = ((TextView)findViewById(2131822871));
    this.kGZ = ((TextView)findViewById(2131822872));
    this.kHa = ((ImageView)findViewById(2131822873));
    this.kHb = ((ViewGroup)findViewById(2131822869));
    this.kGs.postDelayed(new CollectMainUI.20(this), 300L);
    localObject = new uo();
    ((uo)localObject).cQJ.cQL = "8";
    ((uo)localObject).callback = new CollectMainUI.2(this, (uo)localObject);
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    AppMethodBeat.o(41291);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41299);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 4096:
    case 4097:
    }
    while (true)
    {
      AppMethodBeat.o(41299);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        this.kGG = paramIntent.getStringExtra("ftf_pay_url");
        this.kGI = paramIntent.getDoubleExtra("ftf_fixed_fee", 0.0D);
        this.kGJ = paramIntent.getStringExtra("ftf_fixed_fee_type");
        this.kGK = paramIntent.getStringExtra("ftf_fixed_desc");
        this.kGF = paramIntent.getStringExtra("key_currency_unit");
        this.kGz.setText(this.kGR);
      }
      for (this.kGL = true; ; this.kGL = false)
      {
        refreshView();
        bhu();
        AppMethodBeat.o(41299);
        break;
      }
      this.kFU = com.tencent.mm.model.r.YE();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41288);
    this.yll = true;
    super.onCreate(paramBundle);
    paramBundle = getWindow().getAttributes();
    if (paramBundle.screenBrightness < 0.85F)
    {
      paramBundle.screenBrightness = 0.85F;
      getWindow().setAttributes(paramBundle);
    }
    pO(true);
    dyb();
    g.RQ();
    this.cQG = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
    this.kFU = com.tencent.mm.model.r.YE();
    int i = getIntent().getIntExtra("key_from_scene", 1);
    com.tencent.mm.plugin.report.service.h.pYm.e(14021, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
    overridePendingTransition(2131034265, 2131034262);
    com.tencent.mm.plugin.collect.a.a.bgv();
    paramBundle = com.tencent.mm.plugin.collect.a.a.bgw();
    if (!paramBundle.kaD.contains(this))
      paramBundle.kaD.add(this);
    initView();
    bho();
    refreshView();
    this.iVt = ((Vibrator)getSystemService("vibrator"));
    this.kGM = bo.anT();
    if (kHh < 0)
    {
      paramBundle = new DisplayMetrics();
      ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics(paramBundle);
      kHh = paramBundle.widthPixels / 2 - BackwardSupportUtil.b.b(this.mController.ylL, 20.0F);
      kHi = BackwardSupportUtil.b.b(this.mController.ylL, 60.0F);
      kHj = BackwardSupportUtil.b.b(this.mController.ylL, 40.0F);
      kHk = BackwardSupportUtil.b.b(this.mController.ylL, 70.0F);
    }
    bhu();
    com.tencent.mm.wallet_core.c.z.hL(16, 0);
    AppMethodBeat.o(41288);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41290);
    if (this.kGi != null)
      this.kGi.setImageBitmap(null);
    Object localObject = this.kGC;
    if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
    {
      ab.i("MicroMsg.CollectMainUI", "bitmap recycle %s", new Object[] { localObject });
      ((Bitmap)localObject).recycle();
    }
    if (this.kGr != null)
      this.kGr.dismiss();
    com.tencent.mm.plugin.collect.a.a.bgv();
    com.tencent.mm.plugin.collect.a.a.bgw().kaD.remove(this);
    this.iVt.cancel();
    if (this.kGS != null)
    {
      com.tencent.mm.plugin.collect.model.f localf = this.kGS;
      Iterator localIterator = localf.jxd.entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        ab.i("MicroMsg.F2fGetPayUrlManager", "uninit, do cancel netscene");
        g.RQ();
        g.RO().eJo.c((com.tencent.mm.ai.m)((Map.Entry)localObject).getKey());
      }
      localf.jxd.clear();
      g.RQ();
      g.RO().eJo.b(1588, localf);
    }
    x.c(this.kHg);
    super.onDestroy();
    AppMethodBeat.o(41290);
  }

  public void onPause()
  {
    AppMethodBeat.i(41301);
    super.onPause();
    bc.a(this, null);
    AppMethodBeat.o(41301);
  }

  public void onResume()
  {
    AppMethodBeat.i(41300);
    super.onResume();
    bc.a(this, this);
    AppMethodBeat.o(41300);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void refreshView()
  {
    AppMethodBeat.i(41293);
    if (bo.isNullOrNil(this.kGD))
    {
      ab.w("MicroMsg.CollectMainUI", "func[refreshView], mPayUrl null.");
      AppMethodBeat.o(41293);
    }
    while (true)
    {
      return;
      if (this.kGT == 1)
      {
        if (!bo.isNullOrNil(this.kGU))
          this.kGq.setText(this.kGU);
        if (!bo.isNullOrNil(this.kGV))
        {
          TextView localTextView = (TextView)findViewById(2131822857);
          localTextView.setText(this.kGV);
          localTextView.setVisibility(0);
        }
      }
      bhs();
      bhv();
      bhw();
      AppMethodBeat.o(41293);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI
 * JD-Core Version:    0.6.2
 */
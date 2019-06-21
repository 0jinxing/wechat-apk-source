package com.tencent.mm.plugin.scanner.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.plugin.scanner.a.l;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.ko;
import com.tencent.mm.protocal.protobuf.kq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductUI extends MMPreference
  implements com.tencent.mm.ai.f, x.a
{
  private long cvx;
  private com.tencent.mm.modelgeo.d ecr;
  private b.a ecy;
  protected ProgressDialog ehJ;
  protected com.tencent.mm.ui.base.preference.f ehK;
  private boolean fwx;
  private int gOW;
  private TextView gne;
  private TextView gsS;
  private com.tencent.mm.sdk.b.c hAA;
  private String kWz;
  private long mStartTime;
  private boolean nPX;
  private List<MusicPreference> oMb;
  private ImageView qcU;
  private ImageView qcV;
  private View qcW;
  private TextView qcX;
  private ImageView qcY;
  private View qcZ;
  private LinearLayout qda;
  private ImageView qdb;
  private o.a qdc;
  private View qdd;
  private int qde;
  private int qdf;
  private ProductUI.a qdg;
  private boolean qdh;
  private HashMap<String, Boolean> qdi;
  private e.a qdj;
  private String qdk;
  private boolean qdl;
  private String qdm;
  private boolean qdn;
  private boolean qdo;
  private boolean qdp;
  private com.tencent.mm.plugin.scanner.history.a.a qdq;
  private bz.a qdr;
  private MusicPreference.a qds;
  private boolean qdt;

  public ProductUI()
  {
    AppMethodBeat.i(81105);
    this.qde = 0;
    this.ehJ = null;
    this.qdh = false;
    this.qdl = false;
    this.qdn = false;
    this.qdo = false;
    this.qdp = false;
    this.fwx = false;
    this.ecy = new ProductUI.1(this);
    this.qdr = new bz.a()
    {
      public final void a(com.tencent.mm.ai.e.a paramAnonymousa)
      {
        AppMethodBeat.i(81090);
        Object localObject1 = aa.a(paramAnonymousa.eAB.vED);
        ab.i("MicroMsg.scanner.ProductUI", "lo-scanner-onRecieveMsg");
        paramAnonymousa = ProductUI.a(ProductUI.this);
        Object localObject2;
        if ((paramAnonymousa != null) && (!bo.isNullOrNil((String)localObject1)))
        {
          localObject2 = br.z((String)localObject1, "sysmsg");
          localObject1 = (String)((Map)localObject2).get(".sysmsg.scanproductinfo.product.id");
          if ((!bo.isNullOrNil(paramAnonymousa.field_productid)) && (paramAnonymousa.field_productid.equals(localObject1)))
            break label135;
          ab.i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: product id not match, productId=" + bo.nullAsNil((String)localObject1) + ", target=" + paramAnonymousa.field_productid);
        }
        while (true)
        {
          al.d(new ProductUI.9.1(this));
          AppMethodBeat.o(81090);
          return;
          label135: localObject2 = com.tencent.mm.plugin.scanner.a.a.l((Map)localObject2, ".sysmsg.scanproductinfo.product");
          HashMap localHashMap = new HashMap();
          for (int i = 0; i < ((List)localObject2).size(); i++)
          {
            localObject1 = ((com.tencent.mm.plugin.scanner.a.a)((List)localObject2).get(i)).fPL;
            if (localObject1 != null)
              for (int j = 0; j < ((List)localObject1).size(); j++)
              {
                a.a locala = (a.a)((List)localObject1).get(j);
                if (locala != null)
                  localHashMap.put(locala.key, locala);
              }
          }
          ab.i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: toUpdateSize=" + localHashMap.size());
          l.b(paramAnonymousa.qiL, localHashMap);
        }
      }
    };
    this.qds = new ProductUI.4(this);
    this.qdt = true;
    this.hAA = new ProductUI.5(this);
    AppMethodBeat.o(81105);
  }

  private static boolean Wi(String paramString)
  {
    AppMethodBeat.i(81118);
    com.tencent.mm.aw.e locale = com.tencent.mm.aw.a.aih();
    boolean bool;
    if ((locale != null) && (locale.fJS == 5) && (paramString.equals(locale.fJU)) && (com.tencent.mm.aw.a.aie()))
    {
      bool = true;
      AppMethodBeat.o(81118);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(81118);
    }
  }

  private static String Wj(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(81122);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(81122);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        String str = Uri.parse(paramString).getQueryParameter("p");
        paramString = str;
        AppMethodBeat.o(81122);
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.scanner.ProductUI", paramString + ";" + localException.getLocalizedMessage());
        AppMethodBeat.o(81122);
        paramString = localObject;
      }
    }
  }

  private static boolean Wk(String paramString)
  {
    AppMethodBeat.i(81124);
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    boolean bool;
    if ((paramString != null) && ((int)paramString.ewQ > 0) && (com.tencent.mm.n.a.jh(paramString.field_type)))
    {
      bool = true;
      AppMethodBeat.o(81124);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(81124);
    }
  }

  private void Wl(String paramString)
  {
    AppMethodBeat.i(81125);
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("jsapi_args_appid", com.tencent.mm.plugin.scanner.a.j.BT(this.qde));
    localIntent.putExtra("jsapiargs", localBundle);
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("pay_channel", 3);
    localIntent.putExtra("geta8key_scene", aGu());
    com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(81125);
  }

  private void a(final o.a parama)
  {
    AppMethodBeat.i(81112);
    if (parama == null)
    {
      ab.e("MicroMsg.scanner.ProductUI", "refreshViewByProduct(), pd == null");
      finish();
      AppMethodBeat.o(81112);
      return;
    }
    if (!bo.isNullOrNil(parama.field_thumburl))
      this.qdg = new ProductUI.a(parama);
    chm();
    if ((!bo.isNullOrNil(parama.field_introtitle)) && (!bo.isNullOrNil(parama.field_introlink)))
    {
      this.gsS.setText(parama.field_introtitle);
      this.gsS.setOnClickListener(new ProductUI.15(this, parama));
      this.gsS.setVisibility(0);
      label110: this.qde = this.qdc.field_functionType;
      if (parama.field_xmlType != 3)
        break label405;
      this.gne.setText(parama.field_title);
      if (bo.isNullOrNil(parama.field_certification))
        break label318;
      this.qcX.setText(parama.field_certification);
      this.qcY.setVisibility(0);
      label169: if ((parama.field_type != 1) && (parama.field_type != 2))
        break label365;
      this.qcU = ((ImageView)findViewById(2131826588));
      findViewById(2131826588).setVisibility(0);
      findViewById(2131826589).setVisibility(8);
      label222: if (!bo.isNullOrNil(parama.field_playurl))
      {
        ImageView localImageView = (ImageView)findViewById(2131826590);
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(81099);
            paramAnonymousView = new Intent("android.intent.action.VIEW");
            k.a(ProductUI.this.mController.ylL, paramAnonymousView, Uri.parse(parama.field_playurl), "video/*");
            ProductUI.this.startActivity(paramAnonymousView);
            AppMethodBeat.o(81099);
          }
        });
      }
      addIconOptionMenu(0, 2130839555, new ProductUI.2(this));
    }
    while (true)
    {
      ab.v("MicroMsg.scanner.ProductUI", "start postToMainThread initBodyView");
      al.d(new ProductUI.3(this, parama));
      AppMethodBeat.o(81112);
      break;
      this.gsS.setVisibility(8);
      break label110;
      label318: this.qcX.setText(parama.field_source);
      this.qcY.setVisibility(8);
      this.qcZ.setOnClickListener(null);
      this.qcZ.setBackgroundDrawable(null);
      this.qcZ.setFocusable(false);
      break label169;
      label365: this.qcU = ((ImageView)findViewById(2131826589));
      findViewById(2131826589).setVisibility(0);
      findViewById(2131826588).setVisibility(8);
      break label222;
      label405: if (parama.field_xmlType == 4)
      {
        this.qcU = ((ImageView)findViewById(2131826589));
        findViewById(2131826589).setVisibility(0);
        findViewById(2131826588).setVisibility(8);
        this.qcU.setImageResource(2131231884);
        this.qcU.setBackgroundResource(2131231884);
        this.gne.setText(2131302744);
        this.qcX.setText(null);
      }
    }
  }

  private int aGu()
  {
    int i;
    if (this.qde == 4)
      i = 11;
    while (true)
    {
      return i;
      if (this.qde == 3)
        i = 12;
      else
        i = 0;
    }
  }

  private void b(o.a parama)
  {
    AppMethodBeat.i(81114);
    if ((parama == null) || (parama.qiL == null) || (parama.qiL.size() == 0) || (this.ehK == null))
      AppMethodBeat.o(81114);
    while (true)
    {
      return;
      this.ehK.removeAll();
      int i = 0;
      while (i < parama.qiL.size())
      {
        Object localObject1 = (com.tencent.mm.plugin.scanner.a.a)parama.qiL.get(i);
        Object localObject2;
        Object localObject3;
        if ((localObject1 != null) && (((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL != null) && (((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.size() != 0) && (((com.tencent.mm.plugin.scanner.a.a)localObject1).pZh != 1) && (((com.tencent.mm.plugin.scanner.a.a)localObject1).pZj))
        {
          if (i != 0)
          {
            localObject2 = new Preference(this);
            ((Preference)localObject2).setLayoutResource(2130970378);
            this.ehK.b((Preference)localObject2);
          }
          if ((!bo.isNullOrNil(((com.tencent.mm.plugin.scanner.a.a)localObject1).title)) && ((((com.tencent.mm.plugin.scanner.a.a)localObject1).type == 6) || (((com.tencent.mm.plugin.scanner.a.a)localObject1).type == 7)))
          {
            localObject2 = new CategoryWithTitlePreference(this);
            ((CategoryWithTitlePreference)localObject2).setTitle(((com.tencent.mm.plugin.scanner.a.a)localObject1).title);
            this.ehK.b((Preference)localObject2);
          }
          if (((com.tencent.mm.plugin.scanner.a.a)localObject1).type != 6)
            break label337;
          localObject2 = new ArrayList();
          for (j = 0; j < ((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.size(); j++)
          {
            localObject3 = (a.a)((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.get(j);
            if (((a.a)localObject3).type == 10)
              ((List)localObject2).add(localObject3);
          }
          if (((List)localObject2).size() > 0)
          {
            localObject1 = new h(this);
            ((h)localObject1).setKey(i * 100);
            ((h)localObject1).pil = ((List)localObject2);
            this.ehK.b((Preference)localObject1);
          }
        }
        i++;
        continue;
        label337: int j = 0;
        label340: a.a locala;
        if (j < ((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.size())
        {
          localObject3 = i * 100 + j;
          locala = (a.a)((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.get(j);
          if (locala.type == 11)
          {
            this.qdl = true;
            this.qdm = locala.name;
          }
          if (locala.showType != 2)
          {
            if (locala.showType != 1)
              break label494;
            if (!bo.isNullOrNil(locala.image))
            {
              localObject2 = new b(this);
              ((b)localObject2).setKey((String)localObject3);
              ((b)localObject2).kXM = locala.image;
              ((b)localObject2).ehK = this.ehK;
              this.ehK.b((Preference)localObject2);
            }
          }
        }
        label1170: 
        while (true)
        {
          j++;
          break label340;
          break;
          label494: if (locala.type == 5)
          {
            localObject2 = new MusicPreference(this);
            ((MusicPreference)localObject2).setKey((String)localObject3);
            ((MusicPreference)localObject2).setTitle(locala.name);
            ((MusicPreference)localObject2).pZl = locala.pZl;
            ((MusicPreference)localObject2).pZm = locala.pZm;
            ((MusicPreference)localObject2).pZn = locala.pZn;
            if (!Wi(String.format("%s_cd_%s", new Object[] { locala.pZl, localObject3 })))
            {
              ((MusicPreference)localObject2).kk(false);
              ((MusicPreference)localObject2).qcA = this.qds;
              this.ehK.b((Preference)localObject2);
              com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
              if (this.oMb == null)
                this.oMb = new ArrayList();
              if (this.qdt)
                this.oMb.add(localObject2);
            }
          }
          while (true)
          {
            label595: if ((j >= ((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.size() - 1) || (locala.type == 12) || (((a.a)((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.get(j + 1)).type == 12) || (((a.a)((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL.get(j + 1)).showType == 1) || (!c(j, ((com.tencent.mm.plugin.scanner.a.a)localObject1).fPL)))
              break label1170;
            localObject2 = new g(this);
            this.ehK.b((Preference)localObject2);
            break;
            ((MusicPreference)localObject2).kk(true);
            break label595;
            if (locala.type == 6)
            {
              localObject2 = new e(this);
              ((e)localObject2).setKey((String)localObject3);
              ((e)localObject2).mTitle = locala.name;
              ((e)localObject2).setSummary(locala.desc);
              this.ehK.b((Preference)localObject2);
              ((e)localObject2).qcp = this.qdj;
            }
            else if (locala.type == 12)
            {
              localObject2 = new f(this);
              ((f)localObject2).setKey((String)localObject3);
              ((f)localObject2).kXM = locala.thumburl;
              ((f)localObject2).ehK = this.ehK;
              this.ehK.b((Preference)localObject2);
            }
            else
            {
              if (locala.type == 2)
              {
                if (Wk(locala.username));
                for (localObject2 = locala.pZt; ; localObject2 = locala.pZs)
                {
                  a locala1 = new a(this);
                  locala1.setKey((String)localObject3);
                  locala1.setTitle((CharSequence)localObject2);
                  locala1.setSummary(locala.desc);
                  locala1.qaJ = locala.fjz;
                  this.ehK.b(locala1);
                  break;
                }
              }
              if (locala.type == 22)
              {
                localObject2 = new d(this);
                ((d)localObject2).setKey((String)localObject3);
                if (!bo.isNullOrNil(locala.nickname))
                  ((d)localObject2).kux = (locala.nickname + ":");
                ((d)localObject2).mXp = locala.content;
                ((d)localObject2).qcd = locala.thumburl;
                this.ehK.b((Preference)localObject2);
              }
              else
              {
                localObject2 = new a(this);
                ((a)localObject2).setKey((String)localObject3);
                ((a)localObject2).setTitle(locala.name);
                ((a)localObject2).setSummary(locala.desc);
                ((a)localObject2).qaJ = locala.fjz;
                ((a)localObject2).kWC = locala.iconUrl;
                this.ehK.b((Preference)localObject2);
              }
            }
          }
        }
      }
      this.ehK.notifyDataSetChanged();
      ab.d("MicroMsg.scanner.ProductUI", "initBodyView finish");
      if (this.oMb != null)
        this.qdt = false;
      AppMethodBeat.o(81114);
    }
  }

  private void bb(int paramInt, String paramString)
  {
    AppMethodBeat.i(81119);
    if (this.qdc == null)
      AppMethodBeat.o(81119);
    while (true)
    {
      return;
      paramString = new com.tencent.mm.plugin.scanner.a.i(this.qdc.field_productid, "", paramInt, paramString, 0, 0);
      com.tencent.mm.kernel.g.Rg().a(paramString, 0);
      AppMethodBeat.o(81119);
    }
  }

  private static boolean c(int paramInt, LinkedList<a.a> paramLinkedList)
  {
    AppMethodBeat.i(81115);
    boolean bool;
    if (paramLinkedList != null)
    {
      paramInt++;
      if (paramInt < paramLinkedList.size())
        if (((a.a)paramLinkedList.get(paramInt)).showType != 2)
        {
          bool = true;
          AppMethodBeat.o(81115);
        }
    }
    while (true)
    {
      return bool;
      paramInt++;
      break;
      bool = false;
      AppMethodBeat.o(81115);
    }
  }

  private void chm()
  {
    AppMethodBeat.i(81111);
    this.qdf = this.mController.ylL.getResources().getDimensionPixelSize(2131428598);
    if ((this.qdc != null) && ((this.qdc.field_type == 1) || (this.qdc.field_type == 2)))
    {
      this.qdf = this.mController.ylL.getResources().getDimensionPixelSize(2131428599);
      ViewGroup.LayoutParams localLayoutParams = this.qcV.getLayoutParams();
      localLayoutParams.height = this.qdf;
      this.qcV.setLayoutParams(localLayoutParams);
      localLayoutParams = this.qcW.getLayoutParams();
      localLayoutParams.height = this.qdf;
      this.qda.setLayoutParams(localLayoutParams);
      RelativeLayout localRelativeLayout = (RelativeLayout)findViewById(2131826583);
      localLayoutParams = localRelativeLayout.getLayoutParams();
      localLayoutParams.height = this.qdf;
      localRelativeLayout.setLayoutParams(localLayoutParams);
      localLayoutParams = this.qda.getLayoutParams();
      localLayoutParams.height = this.qdf;
      this.qda.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(81111);
  }

  private void chn()
  {
    AppMethodBeat.i(81113);
    this.cvx = getIntent().getLongExtra("key_ProductUI_chatting_msgId", 0L);
    if ((this.cvx > 0L) && (com.tencent.mm.kernel.g.RK()))
    {
      bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(this.cvx);
      if (localbi.field_msgId > 0L)
      {
        localbi.jv(this.qdg.anJ());
        ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(this.cvx, localbi);
      }
    }
    AppMethodBeat.o(81113);
  }

  private void cho()
  {
    AppMethodBeat.i(81116);
    if ((this.qdc == null) || (this.qdc.qiL == null) || (this.qdc.qiL.size() == 0) || (this.ehK == null))
      AppMethodBeat.o(81116);
    while (true)
    {
      return;
      for (int i = 0; i < this.qdc.qiL.size(); i++)
      {
        com.tencent.mm.plugin.scanner.a.a locala = (com.tencent.mm.plugin.scanner.a.a)this.qdc.qiL.get(i);
        if ((locala != null) && (locala.fPL != null) && (locala.fPL.size() != 0))
        {
          int j = 0;
          if (j < locala.fPL.size())
          {
            a.a locala1 = (a.a)locala.fPL.get(j);
            MusicPreference localMusicPreference;
            if (locala1.type == 5)
            {
              String str = i * 100 + j;
              localMusicPreference = (MusicPreference)this.ehK.aqO(str);
              if (localMusicPreference != null)
              {
                if (Wi(String.format("%s_cd_%s", new Object[] { locala1.pZl, str })))
                  break label220;
                localMusicPreference.kk(false);
              }
            }
            while (true)
            {
              j++;
              break;
              label220: localMusicPreference.kk(true);
            }
          }
        }
      }
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(81116);
    }
  }

  private int chp()
  {
    if (this.qde == 3);
    for (int i = 47; ; i = 49)
      return i;
  }

  @TargetApi(11)
  private void chq()
  {
    AppMethodBeat.i(81126);
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().setBackgroundDrawable(null);
      getSupportActionBar();
    }
    AppMethodBeat.o(81126);
  }

  private void chr()
  {
    AppMethodBeat.i(81127);
    if (this.qdc != null)
    {
      ab.i("MicroMsg.scanner.ProductUI", "doUpdateActionLogic, flag=:" + this.qdc.field_getaction);
      if ((this.qdc.field_getaction & 0x2) > 0)
      {
        this.ecr = com.tencent.mm.modelgeo.d.agz();
        if (this.ecr == null)
          break label138;
        this.ecr.b(this.ecy);
        AppMethodBeat.o(81127);
      }
    }
    while (true)
    {
      return;
      if ((this.qdc.field_getaction & 0x1) > 0)
      {
        com.tencent.mm.plugin.scanner.a.c localc = new com.tencent.mm.plugin.scanner.a.c(this.kWz, l.cU(this.qdc.qiL), this.gOW, this.qdk, 0.0D, 0.0D);
        com.tencent.mm.kernel.g.Rg().a(localc, 0);
      }
      label138: AppMethodBeat.o(81127);
    }
  }

  private void chs()
  {
    AppMethodBeat.i(81129);
    if (!com.tencent.mm.plugin.scanner.util.i.cig())
    {
      ab.e("MicroMsg.scanner.ProductUI", "mHistoryItem ScanHistoryUtil.shouldShowHistoryList() is false!");
      AppMethodBeat.o(81129);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.scanner.history.a.a locala = new com.tencent.mm.plugin.scanner.history.a.a();
      locala.field_productId = this.kWz;
      if (!com.tencent.mm.plugin.scanner.e.cgy().cgC().b(locala, new String[0]));
      for (boolean bool = com.tencent.mm.plugin.scanner.e.cgy().cgC().b(this.qdq); ; bool = com.tencent.mm.plugin.scanner.e.cgy().cgC().c(this.qdq, new String[0]))
      {
        if (!bool)
          break label121;
        ab.i("MicroMsg.scanner.ProductUI", "mHistoryItem insert success!");
        this.qdo = true;
        AppMethodBeat.o(81129);
        break;
      }
      label121: ab.e("MicroMsg.scanner.ProductUI", "mHistoryItem insert fail!");
      AppMethodBeat.o(81129);
    }
  }

  private static void o(View paramView, float paramFloat)
  {
    AppMethodBeat.i(81128);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat, paramFloat);
    localAlphaAnimation.setDuration(0L);
    localAlphaAnimation.setFillAfter(true);
    paramView.startAnimation(localAlphaAnimation);
    AppMethodBeat.o(81128);
  }

  private void u(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(81123);
    this.kWz = paramString1;
    this.qdk = paramString2;
    paramString1 = new com.tencent.mm.plugin.scanner.a.d(paramString1, this.gOW, paramString2);
    com.tencent.mm.kernel.g.Rg().a(paramString1, 0);
    if (!paramBoolean)
    {
      paramString2 = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(paramString2, getString(2131302753), new ProductUI.8(this, paramString1));
    }
    AppMethodBeat.o(81123);
  }

  public final int JC()
  {
    return 2131165257;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(81117);
    ab.i("MicroMsg.scanner.ProductUI", "onPreferenceTreeClick item: [%s]", new Object[] { paramPreference.mKey });
    boolean bool;
    if ((this.qdc == null) || (this.qdc.qiL == null))
    {
      ab.e("MicroMsg.scanner.ProductUI", "product == null || product.actionlist == null");
      AppMethodBeat.o(81117);
      bool = false;
      return bool;
    }
    while (true)
    {
      a.a locala1;
      Intent localIntent;
      try
      {
        int i = Integer.valueOf(paramPreference.mKey).intValue();
        int j = i / 100;
        int k = i % 100;
        ab.v("MicroMsg.scanner.ProductUI", "keyId=[%s], ii=[%s], jj=[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        if ((j < 0) || (j >= this.qdc.qiL.size()))
        {
          ab.w("MicroMsg.scanner.ProductUI", "index out of bounds, ii=[%s], list Size=[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(this.qdc.qiL.size()) });
          AppMethodBeat.o(81117);
          bool = false;
          break;
        }
        com.tencent.mm.plugin.scanner.a.a locala = (com.tencent.mm.plugin.scanner.a.a)this.qdc.qiL.get(j);
        if (locala == null)
        {
          ab.w("MicroMsg.scanner.ProductUI", "actionList == null");
          AppMethodBeat.o(81117);
          bool = false;
          break;
        }
        if ((k < 0) || (k >= locala.fPL.size()))
        {
          ab.w("MicroMsg.scanner.ProductUI", "index out of bounds, jj=[%s], actions Size=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(locala.fPL.size()) });
          AppMethodBeat.o(81117);
          bool = false;
          break;
        }
        locala1 = (a.a)locala.fPL.get(k);
        if (locala1 == null)
        {
          ab.w("MicroMsg.scanner.ProductUI", "action == null");
          AppMethodBeat.o(81117);
          bool = false;
          break;
        }
        ab.i("MicroMsg.scanner.ProductUI", "action.type = [%s]", new Object[] { Integer.valueOf(locala1.type) });
        paramPreference = null;
        localIntent = new android/content/Intent;
        localIntent.<init>();
        paramf = paramPreference;
        switch (locala1.type)
        {
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        default:
          paramf = new java/lang/StringBuilder;
          paramf.<init>("Default go url:");
          ab.d("MicroMsg.scanner.ProductUI", locala1.link);
          paramf = paramPreference;
          if (!bo.isNullOrNil(locala1.link))
          {
            Wl(locala1.link);
            paramf = paramPreference;
          }
        case 6:
        case 7:
        case 10:
          paramPreference = new com/tencent/mm/plugin/scanner/a/i;
          paramPreference.<init>(this.qdc.field_productid, locala1.pZo, locala1.type, paramf, locala.fPL.size(), locala1.showType);
          com.tencent.mm.kernel.g.Rg().a(paramPreference, 0);
          AppMethodBeat.o(81117);
          bool = true;
          break;
        case 1:
        case 3:
        case 22:
          paramPreference = locala1.link;
          paramf = paramPreference;
          if (bo.isNullOrNil(locala1.link))
            continue;
          Wl(locala1.link);
          paramf = paramPreference;
          continue;
        case 2:
        case 4:
        case 5:
        case 9:
        case 8:
        case 11:
        case 21:
        case 12:
        }
      }
      catch (Exception paramf)
      {
        ab.e("MicroMsg.scanner.ProductUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        ab.printErrStackTrace("MicroMsg.scanner.ProductUI", paramf, "", new Object[0]);
        AppMethodBeat.o(81117);
        bool = false;
      }
      break;
      paramPreference = locala1.username;
      paramf = paramPreference;
      if (!bo.isNullOrNil(locala1.username))
      {
        paramf = locala1.username;
        if (Wk(paramf))
        {
          localIntent = new android/content/Intent;
          localIntent.<init>();
          localIntent.putExtra("Chat_User", paramf);
          localIntent.putExtra("finish_direct", true);
          localIntent.putExtra("add_scene", chp());
          com.tencent.mm.plugin.scanner.c.gkE.d(localIntent, this.mController.ylL);
          paramf = paramPreference;
        }
        else if (TextUtils.isEmpty(paramf))
        {
          ab.v("MicroMsg.scanner.ProductUI", "username is null");
          paramf = paramPreference;
        }
        else
        {
          localIntent = new android/content/Intent;
          localIntent.<init>();
          localIntent.putExtra("Contact_User", paramf);
          localIntent.putExtra("force_get_contact", true);
          localIntent.putExtra("Contact_Scene", chp());
          com.tencent.mm.plugin.scanner.c.gkE.c(localIntent, this);
          paramf = paramPreference;
          continue;
          paramf = locala1.pZn;
          localIntent.putExtra("rawUrl", locala1.pZn);
          localIntent.putExtra("geta8key_scene", aGu());
          com.tencent.mm.plugin.scanner.c.gkE.i(localIntent, this);
          com.tencent.mm.aw.a.aic();
          cho();
          continue;
          paramPreference = locala1.pZp;
          paramf = paramPreference;
          if (!bo.isNullOrNil(locala1.pZp))
          {
            localIntent.putExtra("key_product_id", locala1.pZp);
            localIntent.putExtra("key_product_scene", 12);
            com.tencent.mm.bp.d.b(this, "product", ".ui.MallProductUI", localIntent);
            paramf = paramPreference;
            continue;
            paramf = locala1.pZp;
            localIntent.putExtra("key_card_id", locala1.pZr);
            localIntent.putExtra("key_card_ext", locala1.pZq);
            localIntent.putExtra("key_from_scene", 9);
            com.tencent.mm.bp.d.b(this, "card", ".ui.CardDetailUI", localIntent);
            continue;
            localIntent.setClass(this, ProductFurtherInfoUI.class);
            localIntent.putExtra("key_Product_xml", this.qdc.field_xml);
            localIntent.putExtra("key_title", locala1.name);
            startActivity(localIntent);
            paramf = paramPreference;
            continue;
            paramf = locala1.pZi;
            localIntent.setClass(this, ProductPurchaseAreaUI.class);
            localIntent.putExtra("key_Product_xml", this.qdc.field_xml);
            localIntent.putExtra("referkey", locala1.pZi);
            localIntent.putExtra("key_Product_funcType", this.qde);
            startActivity(localIntent);
            continue;
            paramPreference = locala1.link;
            paramf = paramPreference;
            if (!bo.isNullOrNil(locala1.link))
            {
              Wl(locala1.link);
              paramf = paramPreference;
            }
          }
        }
      }
    }
  }

  public final int aWi()
  {
    return 2130970387;
  }

  public final int getLayoutId()
  {
    return 2130970380;
  }

  public final void initView()
  {
    AppMethodBeat.i(81110);
    setMMTitle(2131302767);
    this.ehK = this.yCw;
    chq();
    setBackBtn(new ProductUI.10(this));
    this.gne = ((TextView)findViewById(2131826592));
    this.qcV = ((ImageView)findViewById(2131826584));
    this.qcW = findViewById(2131826585);
    this.qcY = ((ImageView)findViewById(2131826594));
    this.qdd = findViewById(2131826577);
    this.qda = ((LinearLayout)findViewById(2131826586));
    this.qdb = ((ImageView)findViewById(2131826597));
    this.qcZ = findViewById(2131826593);
    o(this.qdd, 0.0F);
    Object localObject;
    String str;
    if (com.tencent.mm.bz.a.ga(this.mController.ylL))
    {
      this.gne.setTextSize(0, this.mController.ylL.getResources().getDimensionPixelSize(2131427577) * 1.25F);
      this.qcX = ((TextView)findViewById(2131826595));
      this.gsS = ((TextView)findViewById(2131826576));
      this.qdi = new HashMap();
      this.qdj = new ProductUI.11(this);
      this.qdq = new com.tencent.mm.plugin.scanner.history.a.a();
      this.qdq.field_ScanTime = System.currentTimeMillis();
      this.qdq.field_scene = this.gOW;
      if (this.gOW != 5)
        break label417;
      this.qdn = true;
      localObject = getIntent().getStringExtra("key_Qrcode_Url");
      str = Wj((String)localObject);
      this.qdq.field_qrcodeUrl = ((String)localObject);
      this.qdq.field_productId = str;
      u(str, (String)localObject, false);
      label325: findViewById(2131826582).setOnClickListener(new ProductUI.12(this));
      findViewById(2131826596).setOnClickListener(new ProductUI.13(this));
      this.qcZ.setOnClickListener(new ProductUI.14(this));
      new ProductUI.b(this);
      AppMethodBeat.o(81110);
    }
    while (true)
    {
      return;
      this.gne.setTextSize(0, com.tencent.mm.bz.a.al(this.mController.ylL, 2131427577));
      break;
      label417: if (this.gOW == 4)
      {
        str = getIntent().getStringExtra("key_product_id");
        localObject = getIntent().getStringExtra("key_Qrcode_Url");
        if (!bo.isNullOrNil(str))
        {
          u(str, (String)localObject, false);
          break label325;
        }
        ab.e("MicroMsg.scanner.ProductUI", "jsapi jump finish productId null");
        finish();
        AppMethodBeat.o(81110);
        continue;
      }
      this.qdp = getIntent().getBooleanExtra("key_is_from_barcode", false);
      this.qdn = getIntent().getBooleanExtra("key_need_add_to_history", false);
      localObject = getIntent().getStringExtra("key_Product_xml");
      if (!bo.isNullOrNil((String)localObject))
      {
        int i = getIntent().getIntExtra("key_Product_funcType", 0);
        this.qdc = com.tencent.mm.plugin.scanner.a.j.cV((String)localObject, i);
        if (this.qdc == null)
        {
          ab.e("MicroMsg.scanner.ProductUI", "initView(), product == null");
          finish();
          AppMethodBeat.o(81110);
          continue;
        }
        this.kWz = this.qdc.field_productid;
        this.qdk = this.qdc.field_extinfo;
        if ((this.qdn) && (!TextUtils.isEmpty(this.kWz)))
        {
          this.qdq.field_xmlContent = ((String)localObject);
          this.qdq.field_qrcodeUrl = this.qdk;
          this.qdq.field_productId = this.kWz;
          this.qdq.field_funcType = i;
          chs();
        }
        while (true)
        {
          localObject = this.qdc;
          getIntent().getBooleanExtra("key_ProductUI_addToDB", true);
          a((o.a)localObject);
          if ((i != 0) || (bo.isNullOrNil(this.qdc.field_productid)))
            break label765;
          u(this.qdc.field_productid, this.qdc.field_extinfo, true);
          break;
          ab.i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.qdn + " mProductId:" + this.kWz);
        }
        label765: chr();
        break label325;
      }
      localObject = getIntent().getStringExtra("key_Product_ID");
      if (!bo.isNullOrNil((String)localObject))
      {
        u((String)localObject, null, false);
        break label325;
      }
      ab.e("MicroMsg.scanner.ProductUI", "normal finish productId null");
      finish();
      AppMethodBeat.o(81110);
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81120);
    if ((!bo.isNullOrNil(paramString)) && (this.qdc != null) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      ab.d("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=".concat(String.valueOf(paramString)));
      al.d(new ProductUI.7(this, paramString, paramBitmap));
    }
    AppMethodBeat.o(81120);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(81106);
    super.onCreate(paramBundle);
    this.mStartTime = bo.anT();
    this.gOW = getIntent().getIntExtra("key_ProductUI_getProductInfoScene", 0);
    x.b(this);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("scanproductinfo", this.qdr, true);
    initView();
    AppMethodBeat.o(81106);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(81109);
    x.c(this);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("scanproductinfo", this.qdr, true);
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    if (this.ecr != null)
      this.ecr.c(this.ecy);
    bb(10100, bo.anT() - this.mStartTime);
    super.onDestroy();
    AppMethodBeat.o(81109);
  }

  public void onPause()
  {
    AppMethodBeat.i(81108);
    com.tencent.mm.kernel.g.Rg().b(1063, this);
    com.tencent.mm.kernel.g.Rg().b(1068, this);
    super.onPause();
    AppMethodBeat.o(81108);
  }

  public void onResume()
  {
    AppMethodBeat.i(81107);
    super.onResume();
    com.tencent.mm.kernel.g.Rg().a(1063, this);
    com.tencent.mm.kernel.g.Rg().a(1068, this);
    AppMethodBeat.o(81107);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81121);
    if (paramm == null)
    {
      ab.w("MicroMsg.scanner.ProductUI", "scene == null");
      AppMethodBeat.o(81121);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 1063)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.scanner.ProductUI", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          AppMethodBeat.o(81121);
        }
        else
        {
          paramString = (com.tencent.mm.plugin.scanner.a.d)paramm;
          if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
          for (paramString = (kq)paramString.ehh.fsH.fsP; ; paramString = null)
          {
            if (paramString != null)
              break label146;
            ab.w("MicroMsg.scanner.ProductUI", "onSceneEnd productInfo == null");
            AppMethodBeat.o(81121);
            break;
          }
          label146: if (paramString.vNK != null)
          {
            ab.d("MicroMsg.scanner.ProductUI", "onSceneEnd  productInfo.DescXML != null");
            paramm = com.tencent.mm.plugin.scanner.a.j.cV(paramString.vNK, this.qde);
            if ((this.qdc != null) && (this.qdc.field_xml != null) && (paramm != null) && (paramm.field_xml != null) && (!this.qdc.field_xml.equals(paramm.field_xml)))
            {
              this.qdc = paramm;
              a(this.qdc);
            }
            while (true)
            {
              if ((this.ehJ != null) && (this.ehJ.isShowing()))
                this.ehJ.dismiss();
              chr();
              if ((!this.qdn) || (this.qdo) || (TextUtils.isEmpty(this.kWz)))
                break label353;
              this.qdq.field_xmlContent = paramString.vNK;
              this.qdq.field_funcType = this.qde;
              chs();
              AppMethodBeat.o(81121);
              break;
              if ((paramm != null) && (paramm.field_xml != null))
              {
                this.qdc = paramm;
                a(this.qdc);
              }
            }
            label353: ab.i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.qdn + " mProductId:" + this.kWz + "  hasAddToHistory:" + this.qdo);
          }
          AppMethodBeat.o(81121);
        }
      }
      else
      {
        if ((paramm.getType() == 1068) && (paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = ((ko)((com.tencent.mm.plugin.scanner.a.c)paramm).ehh.fsH.fsP).vNJ;
          if ((this.qdc != null) && (l.b(this.qdc.qiL, l.cV(paramString))))
            b(this.qdc);
        }
        AppMethodBeat.o(81121);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI
 * JD-Core Version:    0.6.2
 */
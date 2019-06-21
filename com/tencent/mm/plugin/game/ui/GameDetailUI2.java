package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.game.d.ba;
import com.tencent.mm.plugin.game.d.br;
import com.tencent.mm.plugin.game.d.bs;
import com.tencent.mm.plugin.game.d.bv;
import com.tencent.mm.plugin.game.d.bw;
import com.tencent.mm.plugin.game.d.da;
import com.tencent.mm.plugin.game.d.v;
import com.tencent.mm.plugin.game.model.am;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.plugin.game.model.z.a;
import com.tencent.mm.plugin.game.model.z.b;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.t;
import com.tencent.mm.pluginsdk.ui.applet.t.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GameDetailUI2 extends MMActivity
  implements f
{
  private String appId;
  private Dialog lud;
  private com.tencent.mm.plugin.game.model.c mVZ;
  private int mXC;
  private String ngJ;
  private String ngK;
  private int ngM;
  private boolean ngN;
  private boolean ngO;
  private String ngP;
  private j.a ngQ;
  private d ngR;
  private k ngS;
  private ViewGroup ngT;
  private ImageView ngU;
  private ImageView ngV;
  private TextView ngW;
  private Button ngX;
  private TextProgressBar ngY;
  private TextView ngZ;
  private da nhA;
  private DialogInterface.OnClickListener nhB;
  private View.OnClickListener nhC;
  private View.OnClickListener nhD;
  private View.OnClickListener nhE;
  private View.OnClickListener nhF;
  private View.OnClickListener nhG;
  private View.OnClickListener nhH;
  private LinearLayout nha;
  private GameDetailAutoScrollView nhb;
  private LinearLayout nhc;
  private TextView nhd;
  private LinearLayout nhe;
  private TextView nhf;
  private LinearLayout nhg;
  private ImageView nhh;
  private View nhi;
  private TextView nhj;
  private TextView nhk;
  private View nhl;
  private TextView nhm;
  private ImageView nhn;
  private TextView nho;
  private TextView nhp;
  private LinearLayout nhq;
  private GameMediaList nhr;
  private TextView nhs;
  private TextView nht;
  private TextView nhu;
  private boolean nhv;
  private LinearLayout nhw;
  private TextView nhx;
  private LinearLayout nhy;
  private TextView nhz;

  public GameDetailUI2()
  {
    AppMethodBeat.i(111859);
    this.appId = null;
    this.mVZ = null;
    this.ngJ = null;
    this.ngK = null;
    this.ngM = 18;
    this.mXC = 0;
    this.ngP = null;
    this.ngQ = null;
    this.ngR = null;
    this.ngS = null;
    this.nhv = false;
    this.nhB = new GameDetailUI2.15(this);
    this.nhC = new GameDetailUI2.16(this);
    this.nhD = new GameDetailUI2.17(this);
    this.nhE = new GameDetailUI2.2(this);
    this.nhF = new GameDetailUI2.3(this);
    this.nhG = new GameDetailUI2.4(this);
    this.nhH = new GameDetailUI2.5(this);
    AppMethodBeat.o(111859);
  }

  private void a(z paramz)
  {
    AppMethodBeat.i(111868);
    Object localObject1 = null;
    if ((paramz.mXN.mXO == null) || (paramz.mXN.mXO.size() == 0))
      localObject1 = paramz.mXK.nbK;
    if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
    {
      this.nha.setVisibility(8);
      AppMethodBeat.o(111868);
    }
    while (true)
    {
      return;
      this.nha.setVisibility(0);
      this.nha.removeAllViews();
      Iterator localIterator = ((LinkedList)localObject1).iterator();
      if (localIterator.hasNext())
      {
        v localv = (v)localIterator.next();
        View localView = LayoutInflater.from(this.mController.ylL).inflate(2130969699, this.nha, false);
        localObject1 = (ImageView)localView.findViewById(2131824465);
        TextView localTextView = (TextView)localView.findViewById(2131824466);
        paramz = (TextView)localView.findViewById(2131824467);
        if (!bo.isNullOrNil(localv.jBB))
          a.b.a((ImageView)localObject1, localv.jBB, 0.5F, false);
        while (true)
        {
          localTextView.setText(localv.Title);
          paramz.setText(localv.naq);
          this.nha.addView(localView);
          break;
          Object localObject2 = new c.a();
          ((c.a)localObject2).eQf = true;
          localObject2 = ((c.a)localObject2).ahG();
          o.ahp().a(localv.mZs, (ImageView)localObject1, (com.tencent.mm.at.a.a.c)localObject2);
        }
      }
      AppMethodBeat.o(111868);
    }
  }

  private void b(com.tencent.mm.plugin.game.model.aa paramaa)
  {
    int i = 0;
    AppMethodBeat.i(111867);
    List localList = paramaa.mXO;
    if ((localList == null) || (localList.size() == 0))
    {
      this.nhc.setVisibility(8);
      this.nhd.setVisibility(8);
      AppMethodBeat.o(111867);
    }
    while (true)
    {
      return;
      this.nhc.setVisibility(0);
      if (localList.size() > 3)
        this.nhd.setVisibility(0);
      while (true)
      {
        this.nhc.removeAllViews();
        i locali = new i(this.mController.ylL);
        locali.Rt = 2130969696;
        locali.a(paramaa);
        locali.mXC = this.mXC;
        while ((i < localList.size()) && (i < 3))
        {
          paramaa = locali.getView(i, null, this.nha);
          this.nhc.addView(paramaa);
          i++;
        }
        this.nhd.setVisibility(8);
      }
      AppMethodBeat.o(111867);
    }
  }

  private void b(z paramz)
  {
    AppMethodBeat.i(111869);
    Object localObject;
    label275: label412: if ((paramz.bEA() != null) && (!paramz.bEA().isEmpty()))
    {
      this.nhe.setVisibility(0);
      if (!bo.isNullOrNil(paramz.bEz()))
      {
        this.nhf.setVisibility(0);
        this.nhf.setText(paramz.bEz());
        this.nhg.removeAllViews();
        if (paramz.bEB() != 1)
          break label275;
        this.nhg.setOrientation(1);
        this.nhh.setVisibility(8);
      }
      for (int i = 2130969691; ; i = 2130969690)
      {
        localObject = paramz.bEA();
        if (localObject == null)
          break label298;
        Iterator localIterator = ((LinkedList)localObject).iterator();
        while (localIterator.hasNext())
        {
          z.b localb = (z.b)localIterator.next();
          View localView = LayoutInflater.from(this.mController.ylL).inflate(i, this.nhg, false);
          localObject = (ImageView)localView.findViewById(2131824445);
          o.ahp().a(localb.cIY, (ImageView)localObject);
          if (paramz.bEB() == 1)
            ((TextView)localView.findViewById(2131824447)).setText(localb.title);
          ((TextView)localView.findViewById(2131824446)).setText(localb.desc);
          if (paramz.bEB() == 1)
          {
            localView.setTag(localb.url);
            localView.setOnClickListener(this.nhE);
          }
          this.nhg.addView(localView);
        }
        this.nhf.setVisibility(8);
        break;
        this.nhg.setOrientation(0);
        this.nhh.setVisibility(0);
      }
      label298: if (paramz.mXK.nbS != null)
      {
        localObject = new z.a();
        ((z.a)localObject).title = paramz.mXK.nbS.summary;
        ((z.a)localObject).desc = paramz.mXK.nbS.desc;
        ((z.a)localObject).url = paramz.mXK.nbS.url;
        paramz = (z)localObject;
        if (paramz == null)
          break label541;
        this.nhi.setVisibility(0);
        this.nhj.setText(paramz.title);
        if (bo.isNullOrNil(paramz.desc))
          break label529;
        this.nhk.setVisibility(0);
        this.nhk.setText(paramz.desc);
        this.nhi.setTag(paramz.url);
        this.nhi.setOnClickListener(this.nhE);
        AppMethodBeat.o(111869);
      }
    }
    while (true)
    {
      return;
      if ((paramz.mXK.nbN != null) && (!bo.isNullOrNil(paramz.mXK.nbN.ncA)) && (!bo.isNullOrNil(paramz.mXK.nbN.ncB)))
      {
        localObject = new z.a();
        ((z.a)localObject).title = paramz.mXK.nbN.ncA;
        ((z.a)localObject).url = paramz.mXK.nbN.ncB;
        paramz = (z)localObject;
        break;
      }
      paramz = null;
      break;
      label529: this.nhk.setVisibility(8);
      break label412;
      label541: this.nhi.setVisibility(8);
      AppMethodBeat.o(111869);
      continue;
      this.nhe.setVisibility(8);
      AppMethodBeat.o(111869);
    }
  }

  private void bFl()
  {
    AppMethodBeat.i(111865);
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    AppMethodBeat.o(111865);
  }

  private void c(z paramz)
  {
    AppMethodBeat.i(111870);
    if ((paramz.bEG() != null) && (!paramz.bEG().isEmpty()))
    {
      this.nhw.setVisibility(0);
      if (!bo.isNullOrNil(paramz.bEF()))
      {
        this.nhx.setVisibility(0);
        this.nhx.setText(paramz.bEF());
      }
      while (true)
      {
        this.nhy.removeAllViews();
        this.nhy.setOnClickListener(null);
        Iterator localIterator = paramz.bEG().iterator();
        while (localIterator.hasNext())
        {
          bw localbw = (bw)localIterator.next();
          View localView = LayoutInflater.from(this.mController.ylL).inflate(2130969692, this.nhy, false);
          TextView localTextView1 = (TextView)localView.findViewById(2131824448);
          TextView localTextView2 = (TextView)localView.findViewById(2131824449);
          TextView localTextView3 = (TextView)localView.findViewById(2131824450);
          ImageView localImageView = (ImageView)localView.findViewById(2131824451);
          localTextView1.setText(localbw.ncF);
          localTextView2.setText(localbw.Title);
          localTextView3.setText(localbw.naq);
          o.ahp().a(localbw.ncC, localImageView);
          localView.setTag(localbw.mZm);
          localView.setOnClickListener(this.nhF);
          this.nhy.addView(localView);
        }
        this.nhx.setVisibility(8);
      }
      if (paramz.mXK.nbN == null)
      {
        paramz = null;
        if (paramz == null)
          break label393;
        this.nhz.setVisibility(0);
        this.nhz.setText((CharSequence)paramz.first);
        this.nhz.setTag(paramz.second);
        this.nhz.setOnClickListener(this.nhG);
        AppMethodBeat.o(111870);
      }
    }
    while (true)
    {
      return;
      if ((bo.isNullOrNil(paramz.mXK.nbM.Title)) || (bo.isNullOrNil(paramz.mXK.nbM.ncB)))
      {
        paramz = null;
        break;
      }
      paramz = new Pair(paramz.mXK.nbM.ncA, paramz.mXK.nbM.ncB);
      break;
      label393: this.nhz.setVisibility(8);
      AppMethodBeat.o(111870);
      continue;
      this.nhw.setVisibility(8);
      AppMethodBeat.o(111870);
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(111864);
    bFl();
    finish();
    AppMethodBeat.o(111864);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969688;
  }

  public final void initView()
  {
    AppMethodBeat.i(111866);
    setMMTitle(2131300246);
    setBackBtn(new GameDetailUI2.1(this));
    this.ngT = ((ViewGroup)findViewById(2131824419));
    this.ngU = ((ImageView)findViewById(2131824420));
    this.ngV = ((ImageView)findViewById(2131821535));
    this.ngW = ((TextView)findViewById(2131821537));
    this.ngZ = ((TextView)findViewById(2131824409));
    this.ngX = ((Button)findViewById(2131824441));
    this.ngY = ((TextProgressBar)findViewById(2131824442));
    this.ngY.setTextSize(this.ngM);
    this.nha = ((LinearLayout)findViewById(2131824413));
    this.nhb = ((GameDetailAutoScrollView)findViewById(2131824421));
    this.nhc = ((LinearLayout)findViewById(2131824422));
    this.nhd = ((TextView)findViewById(2131824414));
    this.nhe = ((LinearLayout)findViewById(2131824423));
    this.nhf = ((TextView)findViewById(2131824424));
    this.nhg = ((LinearLayout)findViewById(2131824425));
    this.nhh = ((ImageView)findViewById(2131824426));
    this.nhi = findViewById(2131824427);
    this.nhj = ((TextView)findViewById(2131824428));
    this.nhk = ((TextView)findViewById(2131824429));
    this.nhl = findViewById(2131824432);
    this.nhm = ((TextView)findViewById(2131824433));
    this.nhn = ((ImageView)findViewById(2131824434));
    this.nho = ((TextView)findViewById(2131824435));
    this.nhp = ((TextView)findViewById(2131824436));
    this.nhq = ((LinearLayout)findViewById(2131824430));
    this.nhr = ((GameMediaList)findViewById(2131824416));
    this.nhr.l(this, this.appId, this.mXC);
    this.nhr.setItemLayout(2130969747);
    this.nhs = ((TextView)findViewById(2131824415));
    this.nht = ((TextView)findViewById(2131824418));
    this.nht.getViewTreeObserver().addOnGlobalLayoutListener(new GameDetailUI2.10(this));
    this.nhu = ((TextView)findViewById(2131824431));
    this.nhu.setOnClickListener(new GameDetailUI2.11(this));
    this.nhw = ((LinearLayout)findViewById(2131824437));
    this.nhx = ((TextView)findViewById(2131824438));
    this.nhy = ((LinearLayout)findViewById(2131824439));
    this.nhz = ((TextView)findViewById(2131824440));
    AppMethodBeat.o(111866);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(111872);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.GameDetailUI2", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
      ab.e("MicroMsg.GameDetailUI2", "error request code");
      AppMethodBeat.o(111872);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      switch (paramInt2)
      {
      case 1:
      default:
        AppMethodBeat.o(111872);
        break;
      case 3:
        if (this.ngS != null)
        {
          this.ngS.biT();
          AppMethodBeat.o(111872);
        }
        break;
      case 2:
        if ((this.mVZ != null) && (this.ngS != null))
        {
          this.ngS.bEj();
          this.ngR.a(this.mVZ, this.ngS);
          AppMethodBeat.o(111872);
        }
        break;
      case 0:
        AppMethodBeat.o(111872);
        continue;
        if (paramInt2 == -1)
        {
          String str1 = paramIntent.getStringExtra("Select_Conv_User");
          if (!bo.isNullOrNil(str1))
          {
            String str2 = this.nhA.mZs;
            paramIntent = str2;
            if (bo.isNullOrNil(str2))
              paramIntent = this.mVZ.field_appIconUrl;
            t.a.vlq.a(this.mController, this.nhA.ndx, paramIntent, this.nhA.ndy, true, getResources().getString(2131297041), new GameDetailUI2.9(this, str1));
          }
          AppMethodBeat.o(111872);
          continue;
          if (paramInt2 == -1)
          {
            com.tencent.mm.plugin.game.e.b.a(this.mController.ylL, 12, 1207, 2, 15, this.appId, this.mXC, null);
            AppMethodBeat.o(111872);
          }
        }
        else
        {
          AppMethodBeat.o(111872);
        }
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111860);
    super.onCreate(paramBundle);
    if (!com.tencent.mm.kernel.g.RK())
    {
      ab.e("MicroMsg.GameDetailUI2", "account not ready");
      finish();
      AppMethodBeat.o(111860);
      return;
    }
    this.ngN = true;
    this.ngO = false;
    this.appId = getIntent().getStringExtra("game_app_id");
    if (bo.isNullOrNil(this.appId))
    {
      ab.e("MicroMsg.GameDetailUI2", "appid is null or nill");
      finish();
      label84: initView();
      com.tencent.mm.kernel.g.Rg().a(1217, this);
      paramBundle = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().NK(this.appId);
      if ((paramBundle != null) && (paramBundle.length != 0))
        break label222;
      ab.i("MicroMsg.GameDetailUI2", "No cache found");
    }
    for (int i = 0; ; i = 1)
    {
      if (i == 0)
      {
        this.lud = com.tencent.mm.plugin.game.f.c.ej(this);
        this.lud.show();
      }
      paramBundle = com.tencent.mm.sdk.platformtools.aa.dor();
      boolean bool = com.tencent.mm.pluginsdk.model.app.g.u(this, this.appId);
      paramBundle = new am(paramBundle, this.appId, bool);
      com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
      AppMethodBeat.o(111860);
      break;
      this.mXC = getIntent().getIntExtra("game_report_from_scene", 0);
      break label84;
      label222: com.tencent.mm.kernel.g.RS().aa(new GameDetailUI2.12(this, paramBundle));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(111862);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(1217, this);
    if (this.ngQ != null)
      j.b(this.ngQ);
    AppMethodBeat.o(111862);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(111863);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(111863);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(111863);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(111861);
    super.onResume();
    if ((this.mVZ != null) && (this.ngS != null))
    {
      this.ngS.biT();
      this.ngR.a(this.ngY, this.ngX, this.mVZ, this.ngS);
    }
    if (!this.ngN)
    {
      b(new com.tencent.mm.plugin.game.model.aa(this.appId));
      AppMethodBeat.o(111861);
    }
    while (true)
    {
      return;
      this.ngN = false;
      AppMethodBeat.o(111861);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(111871);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (!com.tencent.mm.plugin.game.b.a.gkF.a(this, paramInt1, paramInt2, paramString))
        Toast.makeText(this, getString(2131300298, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      if (this.lud != null)
        this.lud.cancel();
      AppMethodBeat.o(111871);
      return;
    }
    switch (paramm.getType())
    {
    default:
    case 1217:
    }
    while (true)
    {
      AppMethodBeat.o(111871);
      break;
      paramString = ((am)paramm).lty.fsH.fsP;
      com.tencent.mm.kernel.g.RS().aa(new GameDetailUI2.14(this, paramString));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2
 * JD-Core Version:    0.6.2
 */
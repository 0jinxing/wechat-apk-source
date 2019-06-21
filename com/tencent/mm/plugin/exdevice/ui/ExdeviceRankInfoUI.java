package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.exdevice.f.a.j;
import com.tencent.mm.plugin.exdevice.f.a.j.a;
import com.tencent.mm.plugin.exdevice.f.b.f;
import com.tencent.mm.plugin.exdevice.model.ac;
import com.tencent.mm.plugin.exdevice.model.ac.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class ExdeviceRankInfoUI extends MMActivity
  implements j.a, com.tencent.mm.plugin.exdevice.f.b.e, f, d
{
  private static int lCl = 128;
  private boolean UP;
  private String hZn;
  private String igi;
  private ImageView lBT;
  private View lBZ;
  private Map<String, String> lCE;
  private String lCb;
  private String lCc;
  private com.tencent.mm.plugin.exdevice.a.b<j> lDA;
  private int lDB;
  private ListView lDf;
  private b lDg;
  private View lDh;
  private ExdeviceRankListHeaderView lDi;
  private ExdeviceRankChampionInfoView lDj;
  private View lDk;
  private String lDl;
  private String lDm;
  private String lDn;
  private String lDo;
  private com.tencent.mm.plugin.exdevice.f.b.a.a lDp;
  private String lDq;
  private int lDr;
  private List<e> lDs;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> lDt;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> lDu;
  private boolean lDv;
  private boolean lDw;
  private String lDx;
  private boolean lDy;
  private j lDz;
  private boolean lvJ;
  public boolean lvV;
  public String lvW;
  private com.tencent.mm.ui.base.p lzK;

  public ExdeviceRankInfoUI()
  {
    AppMethodBeat.i(20163);
    this.lzK = null;
    this.lCE = new HashMap();
    this.lDA = new ExdeviceRankInfoUI.12(this);
    AppMethodBeat.o(20163);
  }

  private int KH(String paramString)
  {
    AppMethodBeat.i(20168);
    ab.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser, locate2User(%s), username(%s).", new Object[] { paramString, this.igi });
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = -1;
      AppMethodBeat.o(20168);
    }
    while (true)
    {
      return i;
      if ((this.lDs == null) || (this.lDs.size() == 0))
      {
        i = -2;
        AppMethodBeat.o(20168);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.lDs.size())
            break label259;
          Object localObject = ((e)this.lDs.get(i)).lFy;
          int j = ((e)this.lDs.get(i)).lFz;
          if ((localObject != null) && (paramString.equalsIgnoreCase(((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject).field_username)) && (!paramString.equalsIgnoreCase(this.igi)) && ((j & 0x2) != 2))
          {
            localObject = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
            j = ((DisplayMetrics)localObject).heightPixels;
            ab.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser pos(%d).(h : %d)", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            this.lDf.setSelectionFromTop(i, j / 4);
            this.lDg.lCF = paramString;
            this.lDg.notifyDataSetInvalidated();
            bpY();
            AppMethodBeat.o(20168);
            break;
          }
        }
        label259: this.lDg.lCF = null;
        i = -3;
        AppMethodBeat.o(20168);
      }
    }
  }

  private void bpP()
  {
    AppMethodBeat.i(20169);
    if ((this.lDp != null) && (this.igi != null) && (this.igi.equals(this.lDp.field_username)) && (bo.isNullOrNil(this.lDp.field_championUrl)))
    {
      if (this.lBZ != null)
        this.lBZ.setVisibility(0);
      if (this.lDi == null)
        break label168;
      this.lDi.setOnViewClickListener(new ExdeviceRankInfoUI.21(this));
      AppMethodBeat.o(20169);
    }
    while (true)
    {
      return;
      if (this.lBZ != null)
        this.lBZ.setVisibility(8);
      if ((this.lDp != null) && (!bo.bc(this.lDp.field_username, "").equals(this.igi)) && (!bo.isNullOrNil(this.lDp.field_championUrl)))
        this.lDi.setOnViewClickListener(new ExdeviceRankInfoUI.22(this));
      label168: AppMethodBeat.o(20169);
    }
  }

  private void bpU()
  {
    AppMethodBeat.i(20166);
    ab.i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankInfoUIFromServer");
    this.lDz = new j(this.lDo, this.lDn, this.lDq, this.lDv, this.lDA);
    this.lDz.lvY = this;
    aw.Rg().a(this.lDz, 0);
    AppMethodBeat.o(20166);
  }

  private void bpV()
  {
    AppMethodBeat.i(20167);
    ab.i("MicroMsg.Sport.ExdeviceRankInfoUI", "try2LocateToUser, locate2User(%s), username(%s).", new Object[] { this.lDx, this.igi });
    if ((bo.isNullOrNil(this.lDx)) || (KH(this.lDx) < 0))
    {
      ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "locate to username is null or nil.");
      AppMethodBeat.o(20167);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(20167);
    }
  }

  private void bpW()
  {
    AppMethodBeat.i(20170);
    String str = bpX();
    if (!bo.isNullOrNil(str))
      this.lDq = str;
    AppMethodBeat.o(20170);
  }

  private String bpX()
  {
    AppMethodBeat.i(20171);
    Object localObject;
    if (this.lDs != null)
    {
      Iterator localIterator = this.lDs.iterator();
      while (localIterator.hasNext())
      {
        localObject = ((e)localIterator.next()).lFy;
        if ((localObject != null) && (((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject).field_ranknum == 1))
        {
          localObject = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject).field_username;
          AppMethodBeat.o(20171);
        }
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(20171);
    }
  }

  private void bpY()
  {
    AppMethodBeat.i(20173);
    View localView = this.lDf.getChildAt(0);
    int[] arrayOfInt = new int[2];
    int i;
    float f;
    if (localView != null)
      if (this.lDf.getFirstVisiblePosition() == 0)
      {
        localView.getLocationOnScreen(arrayOfInt);
        if ((bo.isNullOrNil(this.lDx)) && (lCl == 128))
          lCl = arrayOfInt[1];
        i = arrayOfInt[1];
        if (i > 0)
          if (i >= lCl)
          {
            f = 1.0F;
            ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "ap-alpha: %s", new Object[] { Float.valueOf(f) });
            this.lDj.setAlpha(f);
            this.lDj.setVisibility(0);
            this.lBZ.setAlpha(f);
            AppMethodBeat.o(20173);
          }
      }
    while (true)
    {
      return;
      f = i / lCl;
      break;
      this.lDj.setAlpha(0.0F);
      this.lBZ.setAlpha(0.0F);
      this.lDj.setVisibility(8);
      AppMethodBeat.o(20173);
    }
  }

  private void bpZ()
  {
    AppMethodBeat.i(20178);
    if (this.lDp != null)
    {
      if ((this.hZn == this.lDp.field_championUrl) || ((this.hZn != null) && (this.hZn.equals(this.lDp.field_championUrl))))
        break label99;
      com.tencent.mm.plugin.exdevice.f.a.e.a(this, this.lBT, this.lDp.field_championUrl);
      this.hZn = this.lDp.field_championUrl;
      AppMethodBeat.o(20178);
    }
    while (true)
    {
      return;
      this.lBT.setImageResource(2131689920);
      this.hZn = null;
      label99: AppMethodBeat.o(20178);
    }
  }

  private void bqb()
  {
    AppMethodBeat.i(20187);
    if (bo.isNullOrNil(this.lvW))
    {
      localObject = ad.bpa().Kr(this.igi);
      if (localObject != null)
        this.lvW = ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject).field_championUrl;
    }
    com.tencent.mm.plugin.exdevice.f.b.a.d locald = b.h(this.igi, this.lDu);
    String str = "--";
    Object localObject = "0";
    if (locald != null)
    {
      str = String.valueOf(locald.field_ranknum);
      localObject = String.valueOf(locald.field_score);
    }
    new ac().a(this, str, (String)localObject, this.lvW, new ExdeviceRankInfoUI.11(this));
    AppMethodBeat.o(20187);
  }

  private void gP(boolean paramBoolean)
  {
    AppMethodBeat.i(20164);
    if ((this.lDw) && (!paramBoolean))
      AppMethodBeat.o(20164);
    while (true)
    {
      return;
      ad.bpe();
      this.lDu = com.tencent.mm.plugin.exdevice.f.b.c.Kn(this.lDo);
      this.lDt = ad.boY().bpk();
      this.lDs = this.lDg.b(this.lDt, this.lDu, this.lvV);
      runOnUiThread(new ExdeviceRankInfoUI.1(this));
      AppMethodBeat.o(20164);
    }
  }

  private void gQ(boolean paramBoolean)
  {
    AppMethodBeat.i(20179);
    if (paramBoolean)
      bpW();
    if (!bo.isNullOrNil(this.lDn))
    {
      this.lDj.KF(this.lDq);
      this.lDj.setVisibility(0);
      AppMethodBeat.o(20179);
    }
    while (true)
    {
      return;
      this.lDj.setVisibility(8);
      AppMethodBeat.o(20179);
    }
  }

  public final void KI(String paramString)
  {
    AppMethodBeat.i(20182);
    com.tencent.mm.plugin.sport.a.d.kT(6);
    Intent localIntent = new Intent(this, ExdeviceProfileUI.class);
    localIntent.putExtra("username", paramString);
    localIntent.putExtra("usernickname", (String)this.lCE.get(paramString));
    localIntent.putExtra("app_username", this.lDn);
    localIntent.putExtra("rank_id", this.lDo);
    startActivityForResult(localIntent, 4);
    AppMethodBeat.o(20182);
  }

  public final boolean KJ(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(20186);
    if ((!bo.isNullOrNil(this.lDo)) && (!"#".equals(this.lDo)))
      if (r.Yz().equals(paramString))
      {
        ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: is self. see who likes me");
        paramString = new Intent(this, ExdeviceLikeUI.class);
        paramString.putExtra("app_username", this.lDn);
        paramString.putExtra("rank_id", this.lDo);
        paramString.putExtra("key_is_like_read_only", true);
        startActivity(paramString);
        AppMethodBeat.o(20186);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(20186);
      bool = false;
      continue;
      ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: rank id is not valid.abort the event");
      Toast.makeText(this, getString(2131299366), 0).show();
      AppMethodBeat.o(20186);
    }
  }

  public final void Ko(String paramString)
  {
    AppMethodBeat.i(20181);
    ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: rank changed to %s", new Object[] { paramString });
    this.lDo = paramString;
    AppMethodBeat.o(20181);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(20188);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(20152);
        if ((ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this) != null) && (ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this).isShowing()))
        {
          ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this).dismiss();
          ExdeviceRankInfoUI.f(ExdeviceRankInfoUI.this);
          ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "dismiss tips dialog.");
        }
        AppMethodBeat.o(20152);
      }
    });
    this.lCb = paramj.lvz;
    this.lCc = paramj.lvA;
    this.lvW = paramj.lvW;
    this.lvV = paramj.lvV;
    this.lvJ = paramj.lvJ;
    this.lDu = paramj.lvO;
    this.lDt = paramj.lvP;
    this.lDs = this.lDg.b(this.lDt, this.lDu, this.lvV);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(20153);
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).lCD = ExdeviceRankInfoUI.a(ExdeviceRankInfoUI.this);
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).notifyDataSetChanged();
        ExdeviceRankInfoUI.c(ExdeviceRankInfoUI.this);
        AppMethodBeat.o(20153);
      }
    });
    AppMethodBeat.o(20188);
  }

  public final void b(String paramString, com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    AppMethodBeat.i(20180);
    boolean bool;
    if ((paramd != null) && (!bo.isNullOrNil(paramString)))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (!"HardDeviceRankInfo".equals(paramString))
        break label156;
      if ((this.lDo == null) || (!this.lDo.equals(paramd.lvL)))
        break label216;
      ab.i("MicroMsg.Sport.ExdeviceRankInfoUI", "onRankChange, rankId(%s).", new Object[] { this.lDo });
      gP(true);
      if ((bo.isNullOrNil(this.lDq)) || (!this.lDq.equals(bpX())))
      {
        bpW();
        this.lDp = ad.bpa().Kr(this.lDq);
        runOnUiThread(new ExdeviceRankInfoUI.8(this));
      }
      runOnUiThread(new ExdeviceRankInfoUI.9(this));
      AppMethodBeat.o(20180);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label156: if (("HardDeviceChampionInfo".equals(paramString)) && (!bo.isNullOrNil(this.lDq)) && (this.lDq.equals(paramd.username)))
      {
        this.lDp = ad.bpa().Kr(this.lDq);
        runOnUiThread(new ExdeviceRankInfoUI.10(this));
      }
      label216: AppMethodBeat.o(20180);
    }
  }

  public final void bqa()
  {
    AppMethodBeat.i(20183);
    com.tencent.mm.plugin.sport.a.d.kT(31);
    bqb();
    AppMethodBeat.o(20183);
  }

  public final void cd(String paramString, int paramInt)
  {
    AppMethodBeat.i(20184);
    ad.bpe();
    String str1 = this.lDo;
    String str2 = this.lDn;
    com.tencent.mm.plugin.exdevice.f.b.b.d locald = ad.boX();
    boolean bool;
    com.tencent.mm.plugin.exdevice.f.b.a.d locald1;
    if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(paramString)) && ((paramInt == 1) || (paramInt == 0) || (paramInt == 2)))
    {
      bool = true;
      Assert.assertTrue(bool);
      locald1 = locald.a(new com.tencent.mm.plugin.exdevice.f.b.d(str1, null, paramString));
      if (locald1 != null)
        break label124;
      ab.w("MicroMsg.ExdeviceRankInfoStg", "hy: info is null. abort");
    }
    while (true)
    {
      com.tencent.mm.plugin.exdevice.f.b.c.d(str1, str2, paramString, paramInt);
      this.lDB += 1;
      AppMethodBeat.o(20184);
      return;
      bool = false;
      break;
      label124: locald1.field_selfLikeState = paramInt;
      switch (locald1.field_selfLikeState)
      {
      default:
        ab.w("MicroMsg.ExdeviceRankInfoStg", "hy: still loading...abort");
      case 1:
      case 0:
      }
    }
    for (locald1.field_likecount += 1; ; locald1.field_likecount -= 1)
    {
      locald.a(locald1, true);
      break;
    }
  }

  public final int getLayoutId()
  {
    return 2130969442;
  }

  public final void initView()
  {
    AppMethodBeat.i(20172);
    this.lDh = findViewById(2131823712);
    Object localObject1 = new ExdeviceRankListHeaderView(this);
    Object localObject2 = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject2);
    int i = ((Rect)localObject2).top;
    int j = i;
    if (i == 0)
      j = com.tencent.mm.plugin.exdevice.j.b.J(this, getResources().getDimensionPixelSize(2131427616));
    localObject2 = getResources().getDisplayMetrics();
    if (((DisplayMetrics)localObject2).widthPixels > ((DisplayMetrics)localObject2).heightPixels)
    {
      i = getResources().getDimensionPixelSize(2131427562);
      localObject2 = getWindowManager().getDefaultDisplay();
      i = ((Display)localObject2).getHeight() / 2 - j - i;
      if (((Display)localObject2).getHeight() > 0)
      {
        j = i;
        if (i > 0);
      }
      else
      {
        j = getResources().getDimensionPixelSize(2131427610);
      }
      ((ExdeviceRankListHeaderView)localObject1).setMinimumHeight(j);
      ((ExdeviceRankListHeaderView)localObject1).setMinimumWidth(((Display)localObject2).getWidth());
      ((ExdeviceRankListHeaderView)localObject1).setTag(Integer.valueOf(j));
      this.lDi = ((ExdeviceRankListHeaderView)localObject1);
      localObject2 = (MMPullDownView)findViewById(2131823710);
      this.lDf = ((ListView)findViewById(2131823711));
      this.lDj = ((ExdeviceRankChampionInfoView)findViewById(2131823713));
      this.lBZ = findViewById(2131823701);
      this.lBZ.setOnClickListener(new ExdeviceRankInfoUI.23(this));
      this.lDi.setIsShowTip(false);
      bpP();
      ((MMPullDownView)localObject2).setIsBottomShowAll(false);
      ((MMPullDownView)localObject2).setTopViewVisible(false);
      ((MMPullDownView)localObject2).setBottomViewVisible(false);
      ((MMPullDownView)localObject2).setIsBottomShowAll(false);
      ((MMPullDownView)localObject2).setIsTopShowAll(false);
      ((MMPullDownView)localObject2).setCanOverScrool(true);
      ((MMPullDownView)localObject2).setOnInterceptTouchEventListener(new ExdeviceRankInfoUI.24(this));
      ((MMPullDownView)localObject2).setAtBottomCallBack(new ExdeviceRankInfoUI.2(this));
      ((MMPullDownView)localObject2).setOnScrollChangedListener(new ExdeviceRankInfoUI.3(this));
      ((MMPullDownView)localObject2).setAtTopCallBack(new ExdeviceRankInfoUI.4(this));
      this.lDf.setOnScrollListener(new ExdeviceRankInfoUI.5(this));
      this.lDf.addHeaderView(this.lDi, null, false);
      localObject1 = getLayoutInflater().inflate(2130969440, null);
      this.lDk = ((View)localObject1).findViewById(2131823707);
      ((View)localObject1).findViewById(2131823708).setOnClickListener(new ExdeviceRankInfoUI.6(this));
      this.lDk.setVisibility(8);
      this.lDf.addFooterView((View)localObject1);
      if (this.lDt == null)
        break label747;
    }
    label559: label747: for (j = this.lDt.size(); ; j = 0)
    {
      if (this.lDu != null);
      for (i = this.lDu.size(); ; i = 0)
      {
        if (j + i == 0)
        {
          this.lDs = new ArrayList();
          this.lDg.lCD = this.lDs;
          getString(2131297061);
          this.lzK = h.b(this, getString(2131300968), true, new ExdeviceRankInfoUI.7(this));
        }
        this.lDf.setAdapter(this.lDg);
        this.lDg.lCG = this;
        if (this.lDr == 1)
        {
          this.lDf.setVisibility(0);
          this.lDh.setVisibility(8);
          j = 1;
          if (j != 0)
            break label620;
          ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: cannot handle this device type");
          finish();
          AppMethodBeat.o(20172);
        }
        while (true)
        {
          return;
          i = getResources().getDimensionPixelSize(2131427563);
          break;
          this.lDf.setVisibility(8);
          this.lDh.setVisibility(0);
          j = 0;
          break label559;
          label620: this.lBT = ((ImageView)findViewById(2131823700));
          ((MMPullDownView)localObject2).setCanOverScrool(false);
          int k = com.tencent.mm.bz.a.gd(this);
          i = ((Integer)this.lDi.getTag()).intValue();
          j = i;
          if (this.lvV)
          {
            j = getResources().getDimensionPixelSize(2131427626);
            int m = getResources().getDimensionPixelSize(2131427625);
            j = i + (j / 2 + m);
          }
          localObject1 = new RelativeLayout.LayoutParams(k, j);
          this.lBT.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          bpZ();
          gQ(false);
          AppMethodBeat.o(20172);
        }
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(20185);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.exdevice.f.a.e.a(this, paramInt1, paramInt2, paramIntent, this.lDn))
    {
      AppMethodBeat.o(20185);
      return;
    }
    if (paramInt2 == -1)
      switch (paramInt1)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    while (true)
    {
      AppMethodBeat.o(20185);
      break;
      if (paramIntent == null)
      {
        ab.e("MicroMsg.Sport.ExdeviceRankInfoUI", "onActivityResult, data is null.(reqestCode : %d)", new Object[] { Integer.valueOf(paramInt1) });
        AppMethodBeat.o(20185);
        break;
      }
      if (paramIntent == null);
      for (Object localObject = null; ; localObject = paramIntent.getStringExtra("Select_Conv_User"))
      {
        if ((localObject != null) && (((String)localObject).length() != 0))
          break label162;
        ab.e("MicroMsg.Sport.ExdeviceRankInfoUI", "select conversation failed, toUser is null.");
        AppMethodBeat.o(20185);
        break;
      }
      label162: paramIntent = paramIntent.getStringExtra("custom_send_text");
      ac.a(this, (String)localObject, ac.dG(this), paramIntent, this.lCc);
      h.bQ(this.mController.ylL, getResources().getString(2131297050));
      ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "Select conversation return.");
      AppMethodBeat.o(20185);
      break;
      h.bQ(this.mController.ylL, getResources().getString(2131297050));
      ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "Share to timeline return.");
      AppMethodBeat.o(20185);
      break;
      if (paramIntent != null)
      {
        localObject = bo.P(paramIntent.getStringExtra("received_card_name").split(","));
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          g.bOk().q("gh_43f2581f6fd6", str, t.kH(str));
          if (!bo.isNullOrNil(paramIntent))
          {
            qb localqb = new qb();
            localqb.cMq.cMr = str;
            localqb.cMq.content = paramIntent;
            localqb.cMq.type = t.nK(str);
            localqb.cMq.flags = 0;
            com.tencent.mm.sdk.b.a.xxA.m(localqb);
          }
        }
        AppMethodBeat.o(20185);
        break;
        if ((paramIntent != null) && (paramIntent.getBooleanExtra("KeyNeedUpdateRank", false)))
          bpU();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20165);
    super.onCreate(paramBundle);
    this.UP = false;
    this.igi = r.Yz();
    paramBundle = getIntent();
    this.lDl = paramBundle.getStringExtra("key_rank_info");
    this.lDm = paramBundle.getStringExtra("key_rank_semi");
    this.lDn = paramBundle.getStringExtra("app_username");
    this.lDo = paramBundle.getStringExtra("rank_id");
    this.lDv = paramBundle.getBooleanExtra("key_is_latest", false);
    this.lDq = paramBundle.getStringExtra("key_champioin_username");
    this.lDr = paramBundle.getIntExtra("device_type", 0);
    this.lDx = paramBundle.getStringExtra("locate_to_username");
    this.lDw = paramBundle.getBooleanExtra("key_only_show_latest_rank", false);
    Object localObject;
    if ((bo.isNullOrNil(this.lDo)) || ("#".equals(this.lDo)))
    {
      if (!this.lDw)
      {
        paramBundle = ad.boX();
        localObject = String.format("select * from %s order by %s desc limit 1", new Object[] { "HardDeviceRankInfo", "rankID" });
        localObject = paramBundle.bSd.a((String)localObject, null, 2);
        if (localObject != null)
          break label658;
        ab.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
        paramBundle = null;
        if (paramBundle != null)
        {
          this.lDo = paramBundle.field_rankID;
          this.lDn = paramBundle.field_appusername;
        }
      }
      this.lDq = null;
      this.lDv = true;
    }
    else
    {
      ad.bpe();
      this.lDu = com.tencent.mm.plugin.exdevice.f.b.c.Kn(this.lDo);
      if (!this.lDw)
      {
        if ((this.lDu != null) && (this.lDu.size() > 0))
          break label703;
        this.lDt = new ArrayList();
        this.lDu = com.tencent.mm.plugin.exdevice.f.a.a.a(this.lDo, this.lDn, this.lDl, this.lDm, this.lCE, this.lDt);
        ad.bpe();
        com.tencent.mm.plugin.exdevice.f.b.c.f(this.lDo, this.lDu);
      }
    }
    while (true)
    {
      this.lDt = ad.boY().bpk();
      this.lDg = new b(this, this.lDn);
      this.lDg.lCE = this.lCE;
      this.lDs = this.lDg.b(this.lDt, this.lDu, this.lvV);
      this.lDg.lCD = this.lDs;
      if (bo.isNullOrNil(this.lDq))
        bpW();
      this.lDp = ad.bpa().Kr(this.lDq);
      if ((this.lDp == null) && (!bo.isNullOrNil(this.lDq)))
      {
        this.lDp = new com.tencent.mm.plugin.exdevice.f.b.a.a();
        this.lDp.field_username = this.lDq;
        this.lDp.field_championMotto = getIntent().getStringExtra("key_champion_info");
        this.lDp.field_championUrl = getIntent().getStringExtra("key_champion_coverimg");
        ad.bpe();
        paramBundle = this.lDp;
        ad.bpa().a(paramBundle);
      }
      initView();
      if ((this.lDu != null) && (this.lDu.size() > 0))
      {
        paramBundle = ((com.tencent.mm.plugin.exdevice.f.b.a.d)this.lDu.get(0)).field_username;
        this.lDj.KF(paramBundle);
      }
      ad.bpf().a(this);
      ad.bpe().lwf = this;
      bpU();
      setBackBtn(new ExdeviceRankInfoUI.18(this));
      setMMTitle(2131299401);
      showOptionMenu(true);
      bpV();
      paramBundle = new sd();
      paramBundle.cOe.action = 2;
      com.tencent.mm.sdk.b.a.xxA.a(paramBundle, com.tencent.mm.sdk.g.d.xDG.cin());
      AppMethodBeat.o(20165);
      return;
      label658: if (!((Cursor)localObject).moveToFirst())
      {
        ab.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
        paramBundle = null;
      }
      while (true)
      {
        ((Cursor)localObject).close();
        break;
        paramBundle = new com.tencent.mm.plugin.exdevice.f.b.a.d();
        paramBundle.d((Cursor)localObject);
      }
      label703: com.tencent.mm.plugin.exdevice.f.a.a.d(this.lDl, this.lDm, this.lCE);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(20176);
    this.UP = true;
    if (this.lDg != null)
      b.finish();
    super.onDestroy();
    if (this.lDz != null)
      this.lDz.lvY = null;
    ad.bpf().b(this);
    ad.bpe().lwf = null;
    ad.bpe().lwg = null;
    if (this.lDB > 0)
    {
      int i = this.lDB;
      ab.v("MicroMsg.Sport.SportReportLogic", "reportLikeCount count=%d", new Object[] { Integer.valueOf(i) });
      com.tencent.mm.plugin.report.e.pXa.e(13168, new Object[] { Integer.valueOf(0), Integer.valueOf(i) });
    }
    AppMethodBeat.o(20176);
  }

  public void onPause()
  {
    AppMethodBeat.i(20177);
    super.onPause();
    AppMethodBeat.o(20177);
  }

  protected void onRestart()
  {
    AppMethodBeat.i(20175);
    super.onRestart();
    gP(true);
    AppMethodBeat.o(20175);
  }

  public void onResume()
  {
    AppMethodBeat.i(20174);
    super.onResume();
    AppMethodBeat.o(20174);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI
 * JD-Core Version:    0.6.2
 */
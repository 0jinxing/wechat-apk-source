package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.n;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.m.c;
import com.tencent.mm.plugin.fav.a.m.d;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.i;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.n.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavoriteFileDetailUI extends BaseFavDetailReportUI
  implements p, k.a
{
  private aar cAv;
  private boolean cHc;
  private long cvv;
  private ak fbD;
  private TextView gxi;
  private TextView iqU;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private com.tencent.mm.pluginsdk.ui.tools.e klq;
  private n.d lCi;
  private com.tencent.mm.plugin.fav.a.g mgf;
  private k mjD;
  private Button mlD;
  private Button mlE;
  private Button mlF;
  private MMImageView mlG;
  private TextView mlH;
  private View mlI;
  private View mlJ;
  private TextView mlK;
  private ImageView mlL;
  private TextView mlM;
  private boolean mlN;
  private boolean mlO;
  private String mlP;
  private String mlQ;
  private boolean mlR;
  private boolean mlS;
  private boolean mlT;
  private View.OnTouchListener mlU;
  private View.OnLongClickListener mlV;
  private ProgressBar progressBar;

  public FavoriteFileDetailUI()
  {
    AppMethodBeat.i(74345);
    this.klq = null;
    this.mjD = new k();
    this.mlN = false;
    this.mlO = false;
    this.cHc = true;
    this.mlR = false;
    this.mlS = false;
    this.mlT = false;
    this.jMO = null;
    this.lCi = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(74344);
        ClipboardManager localClipboardManager = (ClipboardManager)ah.getContext().getSystemService("clipboard");
        if (FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).title.equals(""));
        for (paramAnonymousMenuItem = FavoriteFileDetailUI.this.getString(2131301882); ; paramAnonymousMenuItem = FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).title)
        {
          localClipboardManager.setPrimaryClip(ClipData.newPlainText(null, paramAnonymousMenuItem));
          com.tencent.mm.ui.base.h.bQ(FavoriteFileDetailUI.this, FavoriteFileDetailUI.this.getString(2131296876));
          AppMethodBeat.o(74344);
          return;
        }
      }
    };
    this.mlU = new FavoriteFileDetailUI.2(this);
    this.mlV = new FavoriteFileDetailUI.3(this);
    AppMethodBeat.o(74345);
  }

  private void b(float paramFloat, String paramString)
  {
    AppMethodBeat.i(74361);
    this.fbD.post(new FavoriteFileDetailUI.8(this, paramFloat, paramString));
    AppMethodBeat.o(74361);
  }

  private void bnS()
  {
    AppMethodBeat.i(74363);
    if (this.mlR)
      AppMethodBeat.o(74363);
    while (true)
    {
      return;
      Object localObject = this.mlz;
      ((h.a)localObject).meY += 1;
      this.mlR = true;
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_detail_info_id", this.cvv);
      ((Intent)localObject).putExtra("key_detail_fav_path", com.tencent.mm.plugin.fav.a.b.b(this.cAv));
      ((Intent)localObject).putExtra("key_detail_fav_thumb_path", com.tencent.mm.plugin.fav.a.b.c(this.cAv));
      ((Intent)localObject).putExtra("key_detail_fav_video_duration", this.cAv.duration);
      ((Intent)localObject).putExtra("key_detail_statExtStr", this.cAv.cMn);
      com.tencent.mm.plugin.fav.a.b.b(this, ".ui.detail.FavoriteVideoPlayUI", (Intent)localObject);
      finish();
      AppMethodBeat.o(74363);
    }
  }

  private void bwg()
  {
    AppMethodBeat.i(74346);
    this.mlQ = getIntent().getStringExtra("key_detail_data_id");
    Iterator localIterator = this.mgf.field_favProto.wiv.iterator();
    while (localIterator.hasNext())
    {
      aar localaar = (aar)localIterator.next();
      if (localaar.mnd.equals(this.mlQ))
        this.cAv = localaar;
    }
    if (this.cAv == null)
      this.cAv = com.tencent.mm.plugin.fav.a.b.c(this.mgf);
    AppMethodBeat.o(74346);
  }

  private void bwh()
  {
    AppMethodBeat.i(74351);
    this.mlG.setVisibility(8);
    this.gxi.setVisibility(8);
    this.mlF.setVisibility(8);
    this.mlD.setVisibility(8);
    this.mlE.setVisibility(8);
    this.mlI.setVisibility(8);
    this.iqU.setVisibility(8);
    this.mlL.setVisibility(0);
    this.mlM.setVisibility(0);
    if (this.cAv.dataType == 4)
    {
      this.iqU.setGravity(17);
      this.iqU.setText(2131299678);
      AppMethodBeat.o(74351);
    }
    while (true)
    {
      return;
      this.iqU.setGravity(17);
      this.iqU.setText(2131299677);
      if (this.cAv.whh == 2)
      {
        this.mlM.setText(2131299598);
        AppMethodBeat.o(74351);
      }
      else
      {
        this.mlM.setText(2131299599);
        AppMethodBeat.o(74351);
      }
    }
  }

  private void bwi()
  {
    AppMethodBeat.i(74352);
    this.mlF.setVisibility(8);
    this.mlD.setVisibility(8);
    this.mlE.setVisibility(8);
    this.iqU.setVisibility(8);
    this.mlI.setVisibility(0);
    c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(this.cAv.mnd);
    int i;
    int j;
    int k;
    if (localc != null)
    {
      i = (int)localc.getProgress();
      j = localc.field_offset;
      k = localc.field_totalLen;
      if ((!this.mgf.buw()) || (!bo.isNullOrNil(this.cAv.wfZ)))
        break label179;
      b(i, getString(2131299759, new Object[] { com.tencent.mm.plugin.fav.a.b.aC(j), com.tencent.mm.plugin.fav.a.b.aC(k) }));
      AppMethodBeat.o(74352);
    }
    while (true)
    {
      return;
      k = (int)this.cAv.wgu;
      j = 0;
      i = 0;
      break;
      label179: b(i, getString(2131299609, new Object[] { com.tencent.mm.plugin.fav.a.b.aC(j), com.tencent.mm.plugin.fav.a.b.aC(k) }));
      AppMethodBeat.o(74352);
    }
  }

  private void bwj()
  {
    AppMethodBeat.i(74353);
    this.mlI.setVisibility(8);
    this.mlE.setVisibility(8);
    if (bo.isNullOrNil(this.cAv.wgg))
    {
      this.mlD.setVisibility(8);
      this.mlF.setVisibility(0);
      localObject = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(this.cAv.mnd);
      if ((localObject == null) || (((c)localObject).field_offset <= 0))
        break label150;
      localObject = this.mlF;
      if (!this.mgf.bux())
        break label143;
    }
    label143: for (int i = 2131299659; ; i = 2131299658)
    {
      ((Button)localObject).setText(i);
      this.iqU.setVisibility(8);
      AppMethodBeat.o(74353);
      return;
      this.mlD.setVisibility(0);
      break;
    }
    label150: Object localObject = this.mlF;
    if (this.mgf.bux());
    for (i = 2131299660; ; i = 2131299655)
    {
      ((Button)localObject).setText(i);
      break;
    }
  }

  private boolean bwk()
  {
    AppMethodBeat.i(74354);
    boolean bool;
    if ((com.tencent.mm.plugin.fav.a.b.f(this.cAv)) && (com.tencent.mm.plugin.fav.a.b.g(this.cAv)))
    {
      bool = true;
      AppMethodBeat.o(74354);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(74354);
    }
  }

  private void bwl()
  {
    AppMethodBeat.i(74355);
    if ((getType() == 15) && (this.cAv.wgZ != null) && (!bo.isNullOrNil(this.cAv.wgZ.fiG)) && (!bo.isNullOrNil(this.cAv.wgZ.fiK)))
    {
      this.mlS = true;
      this.mlG.setVisibility(8);
      this.mlI.setVisibility(8);
      this.mlF.setVisibility(8);
      this.mlD.setVisibility(8);
      this.mlE.setVisibility(8);
      this.iqU.setVisibility(8);
      String str = com.tencent.mm.plugin.fav.a.b.b(this.cAv);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.Mp() + " initView: fullpath:" + str);
      ViewGroup localViewGroup = (ViewGroup)findViewById(2131823992);
      this.klq = com.tencent.mm.pluginsdk.ui.tools.q.fT(this.mController.ylL);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(13);
      localViewGroup.addView((View)this.klq, 0, localLayoutParams);
      this.klq.setVideoCallback(new FavoriteFileDetailUI.4(this));
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.Mp() + " initView :" + str);
      if (str != null)
      {
        this.klq.stop();
        this.klq.setVideoPath(str);
      }
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.Mp() + " initView");
      com.tencent.mm.aw.a.aic();
      com.tencent.mm.plugin.report.service.h.pYm.e(11444, new Object[] { Integer.valueOf(4) });
    }
    if ((getType() == 15) || (getType() == 4))
      if (!this.mlS)
      {
        this.mlI.setVisibility(8);
        this.mlF.setVisibility(8);
        this.mlD.setVisibility(8);
        this.mlE.setVisibility(0);
        this.mlE.setText(2131299657);
        this.iqU.setVisibility(8);
        bnS();
      }
    while (true)
    {
      com.tencent.mm.kernel.g.RS().aa(new FavoriteFileDetailUI.6(this));
      AppMethodBeat.o(74355);
      return;
      if (!bwk())
        break;
      this.mlI.setVisibility(8);
      this.mlF.setVisibility(8);
      this.mlD.setVisibility(0);
      this.mlE.setVisibility(8);
      this.iqU.setVisibility(8);
      this.mlD.setOnClickListener(new FavoriteFileDetailUI.5(this));
    }
    this.mlI.setVisibility(8);
    this.mlF.setVisibility(8);
    if (bo.isNullOrNil(this.cAv.wgg))
      this.mlD.setVisibility(8);
    while (true)
    {
      this.mlE.setVisibility(0);
      this.mlz.meX = true;
      this.iqU.setVisibility(0);
      break;
      this.mlD.setVisibility(0);
    }
  }

  private boolean bwm()
  {
    AppMethodBeat.i(74364);
    c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(this.cAv.mnd);
    boolean bool;
    if (localc == null)
    {
      AppMethodBeat.o(74364);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (localc.field_status == 1)
      {
        AppMethodBeat.o(74364);
        bool = true;
      }
      else if (this.cAv.dataType == 8)
      {
        AppMethodBeat.o(74364);
        bool = false;
      }
      else if (this.mlT)
      {
        AppMethodBeat.o(74364);
        bool = false;
      }
      else
      {
        if ((localc.field_status == 4) && (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(this.cAv.mnd).field_extFlag != 0))
        {
          com.tencent.mm.plugin.fav.a.b.a(this.mgf, this.cAv, true);
          this.mlT = true;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FavoriteFileDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.mlT) });
        bool = this.mlT;
        AppMethodBeat.o(74364);
      }
    }
  }

  private int getType()
  {
    int i = 8;
    AppMethodBeat.i(74348);
    if (this.cAv == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavoriteFileDetailUI", "get type but data item is null");
      AppMethodBeat.o(74348);
    }
    while (true)
    {
      return i;
      if (this.cAv.dataType == 0)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavoriteFileDetailUI", "get data type, but data item type is 0, info type %d", new Object[] { Integer.valueOf(this.mgf.field_type) });
        if (4 == this.mgf.field_type)
        {
          AppMethodBeat.o(74348);
          i = 4;
        }
        else if (16 == this.mgf.field_type)
        {
          if ((this.cAv != null) && (this.cAv.wgZ != null))
          {
            if (!bo.isNullOrNil(this.cAv.wgZ.fiG))
            {
              AppMethodBeat.o(74348);
              i = 15;
            }
            else if (!bo.isNullOrNil(this.cAv.wgZ.fiK))
            {
              AppMethodBeat.o(74348);
              i = 15;
            }
          }
          else
          {
            AppMethodBeat.o(74348);
            i = 4;
          }
        }
        else
        {
          AppMethodBeat.o(74348);
        }
      }
      else if (this.cAv.dataType == 15)
      {
        if ((this.cAv != null) && (this.cAv.wgZ != null))
        {
          if (!bo.isNullOrNil(this.cAv.wgZ.fiG))
          {
            AppMethodBeat.o(74348);
            i = 15;
          }
          else if (!bo.isNullOrNil(this.cAv.wgZ.fiK))
          {
            AppMethodBeat.o(74348);
            i = 15;
          }
        }
        else
        {
          AppMethodBeat.o(74348);
          i = 4;
        }
      }
      else
      {
        i = this.cAv.dataType;
        AppMethodBeat.o(74348);
      }
    }
  }

  private void hl(boolean paramBoolean)
  {
    AppMethodBeat.i(74349);
    boolean bool = com.tencent.mm.plugin.fav.a.b.f(this.cAv);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FavoriteFileDetailUI", "init status, info type %d, exist:%B path:%s", new Object[] { Integer.valueOf(this.mgf.field_itemStatus), Boolean.valueOf(bool), com.tencent.mm.plugin.fav.a.b.b(this.cAv) });
    if (this.cAv.whh != 0)
    {
      bwh();
      AppMethodBeat.o(74349);
    }
    while (true)
    {
      return;
      if ((this.mgf.isDone()) || (bool) || (!bo.isNullOrNil(this.cAv.wfZ)))
      {
        if (bool)
        {
          bwl();
          if (getIntent().getBooleanExtra("key_detail_open_way", false))
          {
            abh localabh = new abh();
            localabh.cOi = 2;
            ((y)com.tencent.mm.kernel.g.K(y.class)).a(this.mController.ylL, this.mgf, localabh);
            AppMethodBeat.o(74349);
          }
        }
        else if (bo.isNullOrNil(this.cAv.wfZ))
        {
          bwh();
          AppMethodBeat.o(74349);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavoriteFileDetailUI", "? info is done, source file not exist, cdn data url is not null");
          bwj();
          AppMethodBeat.o(74349);
        }
      }
      else if (this.mgf.buy())
      {
        if (bo.isNullOrNil(this.cAv.wfZ))
        {
          bwh();
          if (paramBoolean)
          {
            int i = getType();
            if ((4 == i) || (15 == i));
            for (i = 2131299712; ; i = 2131299699)
            {
              com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(i));
              AppMethodBeat.o(74349);
              break;
            }
          }
        }
        else
        {
          bwj();
          if (paramBoolean)
          {
            com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131298922));
            AppMethodBeat.o(74349);
          }
        }
      }
      else if (this.mgf.bux())
      {
        bwj();
        if (paramBoolean)
        {
          com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131299588));
          AppMethodBeat.o(74349);
        }
      }
      else if ((this.mgf.isDownloading()) || (this.mgf.buw()))
      {
        bwi();
        AppMethodBeat.o(74349);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavoriteFileDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        bwj();
        AppMethodBeat.o(74349);
      }
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(74362);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FavoriteFileDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.mgf.field_localId) });
    paramString = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mgf.field_localId);
    if ((paramString == null) && (!this.mlO))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavoriteFileDetailUI", "error, on notify change, cannot find info");
      finish();
      AppMethodBeat.o(74362);
    }
    while (true)
    {
      return;
      if (!this.mlO)
        this.mgf = paramString;
      bwg();
      if (bwm())
      {
        AppMethodBeat.o(74362);
      }
      else
      {
        this.fbD.post(new FavoriteFileDetailUI.9(this));
        AppMethodBeat.o(74362);
      }
    }
  }

  public final void d(c paramc)
  {
    AppMethodBeat.i(74360);
    if ((paramc == null) || (paramc.field_dataId == null))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, item is null");
      AppMethodBeat.o(74360);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, dataID is %s, field id is %s", new Object[] { this.cAv.mnd, paramc.field_dataId });
      if (paramc.field_dataId.equals(this.cAv.mnd))
      {
        if ((this.mgf.buw()) && (bo.isNullOrNil(this.cAv.wfZ)))
        {
          b(paramc.getProgress(), getString(2131299759, new Object[] { com.tencent.mm.plugin.fav.a.b.aC(paramc.field_offset), com.tencent.mm.plugin.fav.a.b.aC(paramc.field_totalLen) }));
          AppMethodBeat.o(74360);
        }
        else
        {
          b(paramc.getProgress(), getString(2131299609, new Object[] { com.tencent.mm.plugin.fav.a.b.aC(paramc.field_offset), com.tencent.mm.plugin.fav.a.b.aC(paramc.field_totalLen) }));
          if ((this.mlO) && (com.tencent.mm.vfs.e.ct(paramc.field_path)))
          {
            this.mgf.field_itemStatus = 10;
            a("", null);
          }
          AppMethodBeat.o(74360);
        }
      }
      else
        AppMethodBeat.o(74360);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969536;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74359);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ((com.tencent.mm.plugin.fav.a.ab)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.ab.class)).b(this, paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(74359);
    while (true)
    {
      return;
      if (paramInt1 == 1)
      {
        Object localObject1;
        if (paramIntent == null)
        {
          localObject1 = null;
          label54: if (paramIntent != null)
            break label150;
        }
        Object localObject2;
        label150: for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
        {
          localObject2 = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FavoriteFileDetailUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
          localObject2 = new FavoriteFileDetailUI.7(this, (Dialog)localObject2);
          paramInt2 = getType();
          if (!bo.isNullOrNil((String)localObject1))
            break label161;
          AppMethodBeat.o(74359);
          break;
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          break label54;
        }
        label161: Iterator localIterator = bo.P(((String)localObject1).split(",")).iterator();
        label269: label313: label341: 
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if ((paramInt2 == 4) || (paramInt2 == 15))
          {
            i.a(this.mController.ylL, str, this.cAv, (Runnable)localObject2);
            boolean bool = t.kH(str);
            if (bool)
            {
              localObject1 = m.c.mfH;
              label247: com.tencent.mm.plugin.fav.a.g localg = this.mgf;
              m.d locald = m.d.mfL;
              if (!bool)
                break label313;
              paramInt1 = n.mA(str);
              com.tencent.mm.plugin.fav.a.m.a((m.c)localObject1, localg, locald, paramInt1);
            }
          }
          while (true)
          {
            if (bo.isNullOrNil(paramIntent))
              break label341;
            com.tencent.mm.plugin.messenger.a.g.bOk().F(str, paramIntent, t.nK(str));
            break;
            localObject1 = m.c.mfG;
            break label247;
            paramInt1 = 0;
            break label269;
            i.a(this.mController.ylL, str, this.mgf, this.cAv, (Runnable)localObject2);
          }
        }
        com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131299583));
      }
      AppMethodBeat.o(74359);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    AppMethodBeat.i(74347);
    super.onCreate(paramBundle);
    this.fbD = new ak();
    this.cvv = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.mlO = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    this.cHc = getIntent().getBooleanExtra("show_share", true);
    this.mlP = getIntent().getStringExtra("fav_note_xml");
    this.mgf = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.cvv);
    if ((this.mlO) && (!bo.isNullOrNil(this.mlP)))
      this.mgf = com.tencent.mm.plugin.fav.a.b.LF(this.mlP);
    if (this.mgf == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavoriteFileDetailUI", "error, cannot find download info");
      finish();
      AppMethodBeat.o(74347);
      return;
    }
    F(this.mgf);
    com.tencent.mm.plugin.fav.a.m.w(this.mgf);
    bwg();
    this.mlD = ((Button)findViewById(2131823997));
    this.mlE = ((Button)findViewById(2131823998));
    this.mlF = ((Button)findViewById(2131822658));
    this.mlG = ((MMImageView)findViewById(2131821226));
    this.gxi = ((TextView)findViewById(2131821227));
    this.iqU = ((TextView)findViewById(2131823800));
    this.mlJ = findViewById(2131821526);
    this.mlI = findViewById(2131821524);
    this.progressBar = ((ProgressBar)findViewById(2131821525));
    this.mlH = ((TextView)findViewById(2131823996));
    this.mlK = ((TextView)findViewById(2131827573));
    this.mlL = ((ImageView)findViewById(2131823994));
    this.mlM = ((TextView)findViewById(2131823995));
    this.gxi.setOnTouchListener(this.mlU);
    this.gxi.setOnLongClickListener(this.mlV);
    int i = getType();
    label400: label421: aau localaau;
    label458: boolean bool2;
    boolean bool3;
    if (4 == i)
    {
      setMMTitle(2131299761);
      if (this.cAv.dataType != 4)
        break label682;
      this.mlG.setImageResource(2131230817);
      this.gxi.setText(this.cAv.title);
      localaau = this.cAv.wgZ;
      if (localaau != null)
        break label712;
      this.mlK.setVisibility(8);
      setBackBtn(new FavoriteFileDetailUI.11(this));
      this.mlE.setOnClickListener(new FavoriteFileDetailUI.12(this));
      paramBundle = this.cAv.wgg;
      if (!bo.isNullOrNil(paramBundle))
        this.mlD.setOnClickListener(new FavoriteFileDetailUI.13(this, paramBundle));
      this.mlF.setOnClickListener(new FavoriteFileDetailUI.14(this));
      this.mlJ.setOnClickListener(new FavoriteFileDetailUI.15(this));
      if (this.cHc)
      {
        bool2 = getIntent().getBooleanExtra("key_detail_can_delete", true);
        i = getType();
        if (i != 8)
          break label1005;
        bool3 = this.mgf.but();
      }
    }
    while (true)
    {
      if ((bool3) || (bool2))
        addIconOptionMenu(0, 2131304081, 2130839555, new FavoriteFileDetailUI.16(this, bool3, bool2, i));
      hl(false);
      AppMethodBeat.o(74347);
      break;
      if (15 == i)
      {
        setMMTitle(2131299761);
        findViewById(2131823992).setBackgroundResource(2131689761);
        this.gxi.setVisibility(8);
        break label400;
      }
      setMMTitle(2131299641);
      break label400;
      label682: this.mlG.setImageResource(((com.tencent.mm.plugin.fav.a.ab)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.ab.class)).LU(this.cAv.wgo));
      break label421;
      label712: if (bo.isNullOrNil(localaau.fiG))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FavoriteFileDetailUI", " there is no attachurl, show more info btn");
        paramBundle = localaau.fiJ;
        localObject = localaau.fiK;
        if ((!bo.isNullOrNil(paramBundle)) && (!bo.isNullOrNil((String)localObject)))
        {
          this.mlK.setText(paramBundle);
          this.mlK.setVisibility(0);
          this.mlK.setOnClickListener(new FavoriteFileDetailUI.1(this, (String)localObject));
          break label458;
        }
        this.mlK.setVisibility(8);
        break label458;
      }
      Object localObject = getResources().getString(2131303579);
      paramBundle = (Bundle)localObject;
      if (localaau.wid / 60 > 0)
        paramBundle = (String)localObject + getResources().getString(2131303581, new Object[] { Integer.valueOf(localaau.wid / 60) });
      localObject = paramBundle;
      if (localaau.wid % 60 > 0)
        localObject = paramBundle + getResources().getString(2131303582, new Object[] { Integer.valueOf(localaau.wid % 60) });
      paramBundle = (String)localObject + getResources().getString(2131303580);
      this.mlK.setText(paramBundle);
      this.mlK.setVisibility(0);
      this.mlK.setOnClickListener(new FavoriteFileDetailUI.10(this));
      break label458;
      label1005: if (i == 15)
      {
        paramBundle = com.tencent.mm.m.g.Nu().getValue("SIGHTCannotTransmitForFav");
        if ((this.mgf.but()) && (bo.ank(paramBundle) == 0))
          bool3 = true;
        else
          bool3 = false;
      }
      else
      {
        bool3 = bool1;
        if (!this.mgf.buu())
        {
          bool3 = bool1;
          if (!this.mgf.but())
            bool3 = false;
        }
      }
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(74350);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenu.add(0, 0, 0, getString(2131296875));
    AppMethodBeat.o(74350);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74356);
    setResult(0, getIntent().putExtra("key_activity_browse_time", dyi()));
    if (this.klq != null)
    {
      this.klq.setVideoCallback(null);
      this.klq.stop();
      this.klq.onDetach();
    }
    super.onDestroy();
    AppMethodBeat.o(74356);
  }

  public void onPause()
  {
    AppMethodBeat.i(74358);
    super.onPause();
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().d(this);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(this);
    if (this.klq != null)
      this.klq.stop();
    AppMethodBeat.o(74358);
  }

  public void onResume()
  {
    AppMethodBeat.i(74357);
    super.onResume();
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().c(this);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(this);
    if (this.klq != null)
      this.klq.start();
    AppMethodBeat.o(74357);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI
 * JD-Core Version:    0.6.2
 */
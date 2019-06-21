package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.c.l;
import com.tencent.mm.emoji.sync.EmojiSyncManager;
import com.tencent.mm.emoji.sync.EmojiSyncManager.a;
import com.tencent.mm.emoji.sync.EmojiSyncManager.b;
import com.tencent.mm.emoji.sync.EmojiSyncManager.e;
import com.tencent.mm.emoji.sync.EmojiSyncManager.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.HeaderGridView;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;

public class EmojiCustomUI extends MMActivity
  implements AdapterView.OnItemClickListener, f
{
  private static l fHy;
  private static com.tencent.mm.at.a.c.d kZJ;
  private ProgressDialog gqo;
  private a kZA;
  private ArrayList<String> kZB;
  private int kZC;
  private EmojiSyncManager kZD;
  private View.OnClickListener kZE;
  private View.OnClickListener kZF;
  private View.OnClickListener kZG;
  private final k.a kZH;
  private final com.tencent.mm.emoji.sync.c kZI;
  private EmojiInfo kZK;
  private EmojiCustomUI.c kZn;
  private EmojiCustomUI.b kZo;
  private HeaderGridView kZp;
  private View kZq;
  private Button kZr;
  private Button kZs;
  private EmojiSyncManager.b kZt;
  private View kZu;
  private TextView kZv;
  private Button kZw;
  private boolean kZx;
  private boolean kZy;
  private boolean kZz;
  private ak mHandler;

  static
  {
    AppMethodBeat.i(53366);
    kZJ = new EmojiCustomUI.16();
    fHy = new EmojiCustomUI.17();
    AppMethodBeat.o(53366);
  }

  public EmojiCustomUI()
  {
    AppMethodBeat.i(53335);
    this.kZn = EmojiCustomUI.c.kZW;
    this.kZt = EmojiSyncManager.b.ezB;
    this.kZx = false;
    this.kZy = false;
    this.kZz = false;
    this.kZA = a.kZT;
    this.kZB = new ArrayList();
    this.kZC = 0;
    this.kZE = new EmojiCustomUI.1(this);
    this.kZF = new EmojiCustomUI.12(this);
    this.kZG = new EmojiCustomUI.13(this);
    this.kZH = new EmojiCustomUI.14(this);
    this.kZI = new EmojiCustomUI.15(this);
    this.mHandler = new EmojiCustomUI.18(this);
    AppMethodBeat.o(53335);
  }

  private boolean JO(String paramString)
  {
    AppMethodBeat.i(53350);
    com.tencent.mm.ui.base.h.d(this.mController.ylL, paramString, "", "", getString(2131300601), null, null);
    AppMethodBeat.o(53350);
    return true;
  }

  private void JP(String paramString)
  {
    AppMethodBeat.i(53356);
    getString(2131297061);
    this.gqo = com.tencent.mm.ui.base.h.b(this, paramString, true, new EmojiCustomUI.10(this));
    AppMethodBeat.o(53356);
  }

  private void a(a parama)
  {
    AppMethodBeat.i(53336);
    ab.i("MicroMsg.emoji.EmojiCustomUI", "dz[updateButtonType,button type:%s]", new Object[] { parama.toString() });
    this.kZA = parama;
    switch (EmojiCustomUI.11.kZO[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(53336);
      while (true)
      {
        return;
        this.kZw.setVisibility(4);
        AppMethodBeat.o(53336);
        continue;
        this.kZw.setVisibility(0);
        this.kZw.setText(2131299181);
        AppMethodBeat.o(53336);
      }
      this.kZw.setVisibility(0);
      this.kZw.setText(2131299182);
    }
  }

  private void a(EmojiCustomUI.c paramc)
  {
    AppMethodBeat.i(53346);
    long l = System.currentTimeMillis();
    this.kZn = paramc;
    switch (EmojiCustomUI.11.kZQ[paramc.ordinal()])
    {
    default:
    case 1:
    case 4:
    case 2:
    case 3:
    }
    while (true)
    {
      if (this.kZo != null)
      {
        this.kZo.bly();
        this.kZo.notifyDataSetChanged();
      }
      ab.d("MicroMsg.emoji.EmojiCustomUI", "updateMode use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(53346);
      return;
      setBackBtn(new EmojiCustomUI.3(this));
      enableBackMenu(true);
      addTextOptionMenu(0, getString(2131299099), new EmojiCustomUI.4(this));
      this.kZq.setVisibility(8);
      blt();
      blp();
      while (true)
      {
        blq();
        break;
        setBackBtn(new EmojiCustomUI.5(this));
        addTextOptionMenu(0, getString(2131296944), new EmojiCustomUI.6(this));
        this.kZq.setVisibility(0);
        bls();
        blr();
      }
      blq();
    }
  }

  private void blb()
  {
    AppMethodBeat.i(53357);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(53357);
  }

  private void blp()
  {
    AppMethodBeat.i(53347);
    if (this.kZB != null)
      this.kZB.clear();
    ab.i("MicroMsg.emoji.EmojiCustomUI", "clear md5 list. updateMode NORMAL");
    AppMethodBeat.o(53347);
  }

  private void blq()
  {
    AppMethodBeat.i(53348);
    View localView = this.kZq;
    if (this.kZn == EmojiCustomUI.c.kZX);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(53348);
      return;
    }
  }

  private void blr()
  {
    AppMethodBeat.i(53349);
    int i;
    if (this.kZn == EmojiCustomUI.c.kZX)
    {
      if (this.kZB != null)
        break label94;
      i = 0;
      if (i <= 0)
        break label105;
      this.kZr.setText(getResources().getString(2131296881));
      this.kZr.setEnabled(true);
      this.kZs.setEnabled(true);
    }
    while (true)
    {
      setMMTitle(getResources().getString(2131299080, new Object[] { Integer.valueOf(i) }));
      AppMethodBeat.o(53349);
      return;
      label94: i = this.kZB.size();
      break;
      label105: this.kZr.setText(getResources().getString(2131296881));
      this.kZr.setEnabled(false);
      this.kZs.setEnabled(false);
    }
  }

  private void bls()
  {
    AppMethodBeat.i(53351);
    if (this.mHandler != null)
      this.mHandler.sendEmptyMessageDelayed(1003, 0L);
    AppMethodBeat.o(53351);
  }

  private void blt()
  {
    AppMethodBeat.i(53352);
    if (!com.tencent.mm.sdk.platformtools.at.isConnected(this))
    {
      bls();
      AppMethodBeat.o(53352);
    }
    while (true)
    {
      return;
      if (blu())
      {
        AppMethodBeat.o(53352);
      }
      else
      {
        this.kZy = false;
        AppMethodBeat.o(53352);
      }
    }
  }

  private boolean blu()
  {
    boolean bool = true;
    AppMethodBeat.i(53353);
    if ((this.kZo != null) && (this.kZo.getRealCount() > com.tencent.mm.emoji.a.e.OM()))
    {
      this.kZx = true;
      this.kZu.setVisibility(0);
      blv();
      this.kZw.setVisibility(8);
      this.kZo.notifyDataSetChanged();
      enableOptionMenu(0, true);
      this.kZy = true;
      AppMethodBeat.o(53353);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(53353);
      bool = false;
    }
  }

  private void blv()
  {
    AppMethodBeat.i(53354);
    this.kZv.setTextColor(getResources().getColor(2131690384));
    this.kZv.setText(getString(2131299177, new Object[] { Integer.valueOf(com.tencent.mm.emoji.a.e.OM()) }));
    AppMethodBeat.o(53354);
  }

  private void go(boolean paramBoolean)
  {
    AppMethodBeat.i(53337);
    int i = this.kZD.ezt.size();
    int j = this.kZD.ezu;
    if ((i == j) && (!paramBoolean))
    {
      this.kZv.setText(2131299184);
      AppMethodBeat.o(53337);
      return;
    }
    if (j == 0)
    {
      k = i;
      label60: j += k;
      if (!paramBoolean)
        break label125;
    }
    label125: for (int k = 2131299186; ; k = 2131299179)
    {
      this.kZv.setText(String.format(getString(k), new Object[] { Integer.valueOf(j - i), Integer.valueOf(j) }));
      AppMethodBeat.o(53337);
      break;
      k = 0;
      break label60;
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969332;
  }

  public final void initView()
  {
    AppMethodBeat.i(53342);
    this.kZu = getLayoutInflater().inflate(2130969334, null);
    this.kZv = ((TextView)this.kZu.findViewById(2131823452));
    this.kZw = ((Button)this.kZu.findViewById(2131823453));
    this.kZw.setOnClickListener(this.kZE);
    this.kZp = ((HeaderGridView)findViewById(2131823446));
    this.kZp.eE(this.kZu);
    this.kZp.setAdapter$159aa965(this.kZo);
    this.kZp.setOnItemClickListener(this);
    this.kZp.setFocusableInTouchMode(false);
    this.kZq = findViewById(2131823447);
    this.kZr = ((Button)findViewById(2131823449));
    this.kZr.setOnClickListener(this.kZF);
    this.kZs = ((Button)findViewById(2131823448));
    this.kZs.setOnClickListener(this.kZG);
    AppMethodBeat.o(53342);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53344);
    ab.d("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: requestCode[%d],resultCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1)
      switch (paramInt1)
      {
      default:
        ab.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: not found this requestCode");
        AppMethodBeat.o(53344);
      case 214:
      case 205:
      case 206:
      }
    while (true)
    {
      return;
      if (this.kZo != null)
      {
        this.kZo.bly();
        this.kZo.notifyDataSetChanged();
        AppMethodBeat.o(53344);
        continue;
        if (paramIntent == null)
        {
          AppMethodBeat.o(53344);
        }
        else
        {
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 3);
          ((Intent)localObject).putExtra("CropImage_OutputPath", com.tencent.mm.plugin.emoji.h.b.Yb());
          com.tencent.mm.plugin.emoji.b.gkE.a((Intent)localObject, 206, this, paramIntent);
          AppMethodBeat.o(53344);
          continue;
          if (paramIntent == null)
          {
            ab.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult MAT_IMAGE_IN_CROP_ACTIVITY return null.");
            AppMethodBeat.o(53344);
          }
          else
          {
            localObject = paramIntent.getStringExtra("CropImage_OutputPath");
            paramInt1 = paramIntent.getIntExtra("emoji_type", 0);
            if ((localObject == null) || (((String)localObject).length() <= 0))
            {
              AppMethodBeat.o(53344);
            }
            else
            {
              paramIntent = ((String)localObject).substring(((String)localObject).lastIndexOf('/') + 1);
              localObject = com.tencent.mm.plugin.emoji.h.b.Yb() + paramIntent;
              this.kZK = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(paramIntent);
              localObject = com.tencent.mm.ui.tools.b.b.asm((String)localObject);
              ((com.tencent.mm.ui.tools.b.b)localObject).mSize = com.tencent.mm.m.b.MZ();
              ((com.tencent.mm.ui.tools.b.b)localObject).PL(com.tencent.mm.m.b.Na()).a(new EmojiCustomUI.2(this, paramInt1, paramIntent));
              AppMethodBeat.o(53344);
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(53344);
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(53345);
    if (this.kZn == EmojiCustomUI.c.kZX)
    {
      a(EmojiCustomUI.c.kZW);
      AppMethodBeat.o(53345);
    }
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(53345);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53338);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    this.kZC = getIntent().getIntExtra("key_emoji_panel_type", this.kZC);
    if (this.kZC == 1)
    {
      paramBundle = EmojiSyncManager.ezA;
      this.kZD = EmojiSyncManager.a.Ph();
      this.kZo = new EmojiCustomUI.b(this, this.kZC);
      this.kZo.bly();
      initView();
      a(EmojiCustomUI.c.kZW);
      if (this.kZC != 1)
        break label335;
    }
    label335: for (boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xJl, Boolean.TRUE)).booleanValue(); ; bool = ((Boolean)g.RP().Ry().get(ac.a.xJk, Boolean.TRUE)).booleanValue())
    {
      ab.i("MicroMsg.emoji.EmojiCustomUI", "[cpan] touch batch emoji download from EmojiCustomUI needDownload:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        paramBundle = new com.tencent.mm.plugin.emoji.f.e(this.kZC);
        g.RO().eJo.a(paramBundle, 0);
      }
      com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.c(this.kZH);
      com.tencent.mm.plugin.report.service.h.pYm.a(406L, 9L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(406L, 11L, System.currentTimeMillis() - l, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(12740, new Object[] { Integer.valueOf(4), "", "", "", Integer.valueOf(28), Integer.valueOf(28) });
      paramBundle = this.kZD;
      com.tencent.mm.emoji.sync.c localc = this.kZI;
      a.f.b.j.p(localc, "callback");
      com.tencent.mm.ab.b.a((a.f.a.a)new EmojiSyncManager.e(paramBundle, localc));
      this.kZD.ch(true);
      paramBundle = com.tencent.mm.emoji.a.b.eyD;
      com.tencent.mm.emoji.a.b.OG();
      AppMethodBeat.o(53338);
      return;
      paramBundle = EmojiSyncManager.ezA;
      this.kZD = EmojiSyncManager.a.Pg();
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53341);
    super.onDestroy();
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.d(this.kZH);
    com.tencent.mm.plugin.emoji.model.j.bkj().kXj.kXv = false;
    Object localObject = com.tencent.mm.plugin.emoji.model.j.bkj().kXj;
    if (((BKGLoaderManager)localObject).kXs)
      ((BKGLoaderManager)localObject).kXs = false;
    localObject = this.kZD;
    com.tencent.mm.emoji.sync.c localc = this.kZI;
    a.f.b.j.p(localc, "callback");
    com.tencent.mm.ab.b.a((a.f.a.a)new EmojiSyncManager.h((EmojiSyncManager)localObject, localc));
    this.mHandler.removeCallbacksAndMessages(null);
    AppMethodBeat.o(53341);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(53343);
    label111: EmojiInfo localEmojiInfo;
    if (this.kZo != null)
    {
      paramInt -= this.kZp.getHeaderViewCount() * 5;
      if ((this.kZn == EmojiCustomUI.c.kZW) && (paramInt == 0))
      {
        if (1 == this.kZC)
          AppMethodBeat.o(53343);
        while (true)
        {
          return;
          if (g.RP().isSDCardAvailable())
            break;
          t.hO(this);
          AppMethodBeat.o(53343);
        }
        if (this.kZo.getRealCount() < com.tencent.mm.emoji.a.e.OM())
          break label230;
        com.tencent.mm.ui.base.h.a(this, getString(2131299197), "", new EmojiCustomUI.19(this));
        com.tencent.mm.plugin.report.service.h.pYm.e(11596, new Object[] { Integer.valueOf(0) });
      }
      if ((this.kZn == EmojiCustomUI.c.kZX) && (paramInt < this.kZo.getRealCount()))
      {
        localEmojiInfo = this.kZo.uf(paramInt);
        paramAdapterView = null;
        if (paramView != null)
          paramAdapterView = (EmojiCustomUI.d)paramView.getTag();
        if (localEmojiInfo.field_catalog != EmojiGroupInfo.yad)
          break label238;
        com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131298081, 2131298081).show();
      }
    }
    while (true)
    {
      blr();
      if (paramAdapterView == null)
        this.kZo.notifyDataSetChanged();
      AppMethodBeat.o(53343);
      break;
      label230: com.tencent.mm.pluginsdk.ui.tools.n.ak(this);
      break label111;
      label238: if (!this.kZB.contains(localEmojiInfo.Aq()))
      {
        paramView = localEmojiInfo.Aq();
        if (this.kZB != null)
          this.kZB.add(paramView);
        if (paramAdapterView != null)
          paramAdapterView.lab.setChecked(true);
        ab.i("MicroMsg.emoji.EmojiCustomUI", "selected md5:%s", new Object[] { localEmojiInfo.Aq() });
      }
      else
      {
        paramView = localEmojiInfo.Aq();
        if (this.kZB != null)
          this.kZB.remove(paramView);
        if (paramAdapterView != null)
        {
          paramAdapterView.lab.setChecked(false);
          this.kZo.notifyDataSetChanged();
        }
        ab.i("MicroMsg.emoji.EmojiCustomUI", "unselected md5:%s", new Object[] { localEmojiInfo.Aq() });
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(53340);
    super.onPause();
    g.RO().eJo.b(698, this);
    AppMethodBeat.o(53340);
  }

  public void onResume()
  {
    AppMethodBeat.i(53339);
    super.onResume();
    blt();
    g.RO().eJo.a(698, this);
    AppMethodBeat.o(53339);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53355);
    ab.i("MicroMsg.emoji.EmojiCustomUI", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramm instanceof com.tencent.mm.plugin.emoji.f.c))
      switch (((com.tencent.mm.plugin.emoji.f.c)paramm).gvO)
      {
      default:
        AppMethodBeat.o(53355);
      case 2:
      case 3:
      }
    while (true)
    {
      return;
      blb();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new ArrayList(this.kZB);
        g.RS().aa(new EmojiCustomUI.9(this, paramString));
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.u(this.kZB, this.kZC);
        blp();
        blr();
        if (this.kZC == 0)
        {
          com.tencent.mm.emoji.a.a.OB().cb(true);
          paramString = com.tencent.mm.emoji.a.b.eyD;
          com.tencent.mm.emoji.a.b.ce(false);
        }
        while (true)
        {
          this.mHandler.sendEmptyMessageDelayed(1004, 100L);
          AppMethodBeat.o(53355);
          break;
          com.tencent.mm.emoji.a.a.OB().cd(true);
          paramString = com.tencent.mm.emoji.a.b.eyD;
          com.tencent.mm.emoji.a.b.cf(false);
        }
      }
      ab.i("MicroMsg.emoji.EmojiCustomUI", "delete failed");
      JO(getString(2131299193));
      AppMethodBeat.o(53355);
      continue;
      blb();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.l(this.kZC, this.kZB);
        blp();
        blr();
        if (this.kZC == 0)
          com.tencent.mm.emoji.a.a.OB().cb(true);
        while (true)
        {
          this.mHandler.sendEmptyMessageDelayed(1004, 100L);
          AppMethodBeat.o(53355);
          break;
          com.tencent.mm.emoji.a.a.OB().cd(true);
        }
      }
      JO(getString(2131299193));
      break;
      ab.w("MicroMsg.emoji.EmojiCustomUI", "no emoji operate");
      AppMethodBeat.o(53355);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static enum a
  {
    static
    {
      AppMethodBeat.i(53321);
      kZR = new a("START", 0);
      kZS = new a("PAUSE", 1);
      kZT = new a("EMPTY", 2);
      kZU = new a[] { kZR, kZS, kZT };
      AppMethodBeat.o(53321);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI
 * JD-Core Version:    0.6.2
 */
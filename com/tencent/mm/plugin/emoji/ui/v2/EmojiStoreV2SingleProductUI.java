package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.i;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;
import com.tencent.mm.protocal.protobuf.aia;
import com.tencent.mm.protocal.protobuf.aic;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.protocal.protobuf.xz;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.contact.LabelContainerView;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmojiStoreV2SingleProductUI extends MMActivity
  implements AbsListView.OnScrollListener, f
{
  private View abB;
  private String edV;
  private int gOW;
  private ProgressDialog gqo;
  private boolean isLoading;
  private long kVE;
  private String kWK;
  private String kWM;
  private MMPullDownView ldC;
  private i ldE;
  private int lde;
  private MMPullDownView.e lfA;
  private MMPullDownView.c lfB;
  private int lfa;
  private String lfb;
  private int lfc;
  private String lfd;
  private String lfe;
  private String lff;
  private String lfg;
  private String lfh;
  private int lfi;
  private PreViewListGridView lfj;
  private a lfk;
  private View lfl;
  private TextView lfm;
  private View lfn;
  private boolean lfo;
  private aia lfp;
  private byte[] lfq;
  private int lfr;
  private String lfs;
  private LabelContainerView lft;
  private TextView lfu;
  private MMTagPanel lfv;
  private HashMap<String, Integer> lfw;
  private ArrayList<String> lfx;
  private boolean lfy;
  private c lfz;
  private ak mHandler;

  public EmojiStoreV2SingleProductUI()
  {
    AppMethodBeat.i(53760);
    this.lde = 0;
    this.lfc = -1;
    this.lfi = 0;
    this.lfo = true;
    this.lfr = -1;
    this.isLoading = false;
    this.lfw = new HashMap();
    this.lfy = false;
    this.mHandler = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(53744);
        switch (paramAnonymousMessage.what)
        {
        case 1003:
        default:
        case 1001:
        case 1002:
        case 1004:
        }
        while (true)
        {
          AppMethodBeat.o(53744);
          while (true)
          {
            return;
            if (EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this) == null)
              break;
            EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this).setVisibility(8);
            AppMethodBeat.o(53744);
            continue;
            if (EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this) != null)
              EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this).setVisibility(0);
            sendEmptyMessage(1003);
            AppMethodBeat.o(53744);
          }
          EmojiStoreV2SingleProductUI.b(EmojiStoreV2SingleProductUI.this);
        }
      }
    };
    this.lfz = new EmojiStoreV2SingleProductUI.6(this);
    this.lfA = new EmojiStoreV2SingleProductUI.7(this);
    this.lfB = new MMPullDownView.c()
    {
      public final boolean bhm()
      {
        return false;
      }
    };
    AppMethodBeat.o(53760);
  }

  private void JP(String paramString)
  {
    AppMethodBeat.i(53769);
    if (isFinishing())
    {
      ab.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[showLoadingDialog] acitivity is finished.");
      AppMethodBeat.o(53769);
    }
    while (true)
    {
      return;
      getString(2131297061);
      this.gqo = com.tencent.mm.ui.base.h.b(this, paramString, true, new EmojiStoreV2SingleProductUI.3(this));
      AppMethodBeat.o(53769);
    }
  }

  private void JQ(String paramString)
  {
    AppMethodBeat.i(53773);
    if ((this.lfl != null) && (this.lfm != null))
      switch (this.lfi)
      {
      default:
      case 4:
      case 5:
      }
    while (true)
    {
      if (bo.isNullOrNil(paramString))
      {
        this.lfm.setText("");
        this.lfm.setVisibility(8);
        this.lfl.setVisibility(8);
      }
      AppMethodBeat.o(53773);
      return;
      if (!bo.isNullOrNil(paramString))
      {
        this.lfm.setText(getString(2131299162, new Object[] { paramString }));
        this.lfm.setVisibility(0);
        this.lfl.setVisibility(0);
        continue;
        if (!bo.isNullOrNil(paramString))
        {
          this.lfm.setText(getString(2131299157, new Object[] { paramString }));
          this.lfm.setVisibility(0);
          this.lfl.setVisibility(0);
        }
      }
    }
  }

  private void Kh()
  {
    AppMethodBeat.i(53768);
    if (this.lfy)
    {
      ab.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "need jeep to update page.");
      AppMethodBeat.o(53768);
      return;
    }
    this.lfq = null;
    switch (this.lfi)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      aK(this.lfq);
      AppMethodBeat.o(53768);
      break;
      this.lfp = j.getEmojiStorageMgr().xYt.aqo("0");
      if ((this.lfp != null) && (this.lfp.woo != null) && (this.lfk != null))
      {
        a(this.lfp);
        this.lfk.bw(this.lfp.woo);
      }
      while (true)
      {
        this.lfo = true;
        com.tencent.mm.plugin.report.service.h.pYm.e(12875, new Object[] { Integer.valueOf(0), "" });
        break;
        JP(getString(2131297086));
      }
      showOptionMenu(1001, false);
      this.lfo = false;
      com.tencent.mm.plugin.report.service.h.pYm.e(12875, new Object[] { Integer.valueOf(1), this.kWM });
      continue;
      showOptionMenu(1001, false);
      this.lfs = this.lfb;
      JQ(this.lfs);
      this.lfo = false;
      com.tencent.mm.plugin.report.service.h.pYm.e(12875, new Object[] { Integer.valueOf(1), "" });
      continue;
      this.lfs = "";
      JQ(this.kWK);
      this.lfo = false;
      com.tencent.mm.plugin.report.service.h.pYm.e(12875, new Object[] { Integer.valueOf(2), "" });
      continue;
      this.lfs = "";
      showOptionMenu(1001, false);
      showOptionMenu(1002, true);
      com.tencent.mm.plugin.report.service.h.pYm.e(12875, new Object[] { Integer.valueOf(3), "" });
    }
  }

  private void R(LinkedList<xx> paramLinkedList)
  {
    AppMethodBeat.i(53775);
    if ((this.lfk != null) && (paramLinkedList != null))
      if (this.lfr == -1)
      {
        this.lfk.bw(paramLinkedList);
        AppMethodBeat.o(53775);
      }
    while (true)
    {
      return;
      a locala = this.lfk;
      if (locala.kSg == null)
        locala.kSg = new ArrayList();
      locala.kSg.addAll(paramLinkedList);
      locala.notifyDataSetChanged();
      AppMethodBeat.o(53775);
    }
  }

  private void a(aia paramaia)
  {
    boolean bool = false;
    AppMethodBeat.i(53772);
    if ((paramaia != null) && (paramaia.wop != null) && (paramaia.wop.size() > 0))
    {
      if (this.lfo)
        bool = true;
      showOptionMenu(1001, bool);
      if (this.lfv == null)
        break label240;
      if (this.lfx == null)
        this.lfx = new ArrayList();
      while (true)
      {
        if (this.lfw == null)
          this.lfw = new HashMap();
        this.lfw.clear();
        this.lfx.add(getString(2131299161));
        Iterator localIterator = paramaia.wop.iterator();
        while (localIterator.hasNext())
        {
          paramaia = (xz)localIterator.next();
          if ((paramaia != null) && (!bo.isNullOrNil(paramaia.wdJ)))
          {
            this.lfx.add(paramaia.wdJ);
            this.lfw.put(paramaia.wdJ, Integer.valueOf(paramaia.wdI));
          }
        }
        this.lfx.clear();
      }
      paramaia = new ArrayList();
      paramaia.add(this.lfs);
      this.lfv.a(paramaia, this.lfx);
      AppMethodBeat.o(53772);
    }
    while (true)
    {
      return;
      showOptionMenu(1001, false);
      label240: AppMethodBeat.o(53772);
    }
  }

  private void aK(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53771);
    this.lfq = null;
    switch (this.lfi)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(53771);
      while (true)
      {
        return;
        paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(1, this.lde, this.lfa, this.kWK, this.lfc, paramArrayOfByte);
        g.RO().eJo.a(paramArrayOfByte, 0);
        AppMethodBeat.o(53771);
        continue;
        paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(2, this.lde, this.lfa, this.kWK, this.lfc, paramArrayOfByte);
        g.RO().eJo.a(paramArrayOfByte, 0);
        AppMethodBeat.o(53771);
        continue;
        paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(3, this.lde, this.lfa, this.kWK, this.lfc, paramArrayOfByte);
        g.RO().eJo.a(paramArrayOfByte, 0);
        AppMethodBeat.o(53771);
        continue;
        paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(4, this.lde, this.lfa, this.kWK, this.lfc, paramArrayOfByte);
        g.RO().eJo.a(paramArrayOfByte, 0);
        AppMethodBeat.o(53771);
      }
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(5, this.lde, this.lfa, this.kWK, this.lfc, paramArrayOfByte);
      g.RO().eJo.a(paramArrayOfByte, 0);
    }
  }

  private void blb()
  {
    AppMethodBeat.i(53770);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(53770);
  }

  private void bmi()
  {
    AppMethodBeat.i(53774);
    if (!this.isLoading)
    {
      aK(this.lfq);
      this.isLoading = true;
      this.mHandler.sendEmptyMessageDelayed(1002, 200L);
    }
    AppMethodBeat.o(53774);
  }

  private void bmj()
  {
    AppMethodBeat.i(53776);
    Toast.makeText(this.mController.ylL, getString(2131299196), 0).show();
    AppMethodBeat.o(53776);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969381;
  }

  public final void initView()
  {
    AppMethodBeat.i(53766);
    if ((this.lfi == 6) && (!bo.isNullOrNil(this.lfd)))
      setMMTitle(this.lfd);
    while (true)
    {
      setBackBtn(new EmojiStoreV2SingleProductUI.9(this));
      this.lfk = new a(this.mController.ylL);
      this.lfk.lgn = new EmojiStoreV2SingleProductUI.10(this);
      this.lfj = ((PreViewListGridView)findViewById(2131820986));
      this.abB = v.hu(this.mController.ylL).inflate(2130969367, null);
      this.lfl = this.abB.findViewById(2131823562);
      this.lfm = ((TextView)this.abB.findViewById(2131823563));
      this.lfj.addHeaderView(this.abB);
      this.lfn = v.hu(this.mController.ylL).inflate(2130969354, null);
      this.lfj.addFooterView(this.lfn);
      this.lfn.setVisibility(8);
      this.lfj.setAdapter(this.lfk);
      this.lfj.setOnScrollListener(this);
      this.ldC = ((MMPullDownView)findViewById(2131823590));
      this.ldC.setTopViewVisible(false);
      this.ldC.setOnBottomLoadDataListener(this.lfA);
      this.ldC.setAtBottomCallBack(this.lfB);
      this.ldC.setBottomViewVisible(false);
      this.ldC.setIsBottomShowAll(false);
      this.ldC.setIsReturnSuperDispatchWhenCancel(true);
      this.lft = ((LabelContainerView)findViewById(2131820901));
      this.lfu = ((TextView)this.lft.findViewById(16908310));
      this.lfu.setText(2131300896);
      this.lfv = ((MMTagPanel)this.lft.findViewById(2131820902));
      this.lfv.setTagSelectedBG(2130840376);
      this.lfv.setTagSelectedTextColorRes(2131690683);
      this.lfs = getString(2131299161);
      this.lft.setOnLabelContainerListener(new EmojiStoreV2SingleProductUI.11(this));
      this.lfv.setCallBack(new EmojiStoreV2SingleProductUI.12(this));
      addIconOptionMenu(1001, 2130837613, new EmojiStoreV2SingleProductUI.13(this));
      addIconOptionMenu(1002, 2131231770, new EmojiStoreV2SingleProductUI.2(this));
      showOptionMenu(1001, false);
      showOptionMenu(1002, false);
      AppMethodBeat.o(53766);
      return;
      setMMTitle(2131299132);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53765);
    switch (paramInt1)
    {
    default:
    case 5001:
    case 2002:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(53765);
      return;
      if (paramInt2 == -1)
      {
        com.tencent.mm.ui.widget.snackbar.b.i(this, this.mController.ylL.getString(2131297044));
        continue;
        if (paramInt2 == -1)
        {
          String str1 = paramIntent.getStringExtra("Select_Conv_User");
          if (!bo.isNullOrNil(str1))
          {
            ab.d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "..".concat(String.valueOf(str1)));
            int i = this.lfc;
            String str2 = this.lfd;
            String str3 = this.lff;
            String str4 = this.lfe;
            String str5 = this.lfg;
            int j = this.lfi;
            j.bki();
            l.a(this, str1, 27, i, str2, str3, str4, str5, j, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
          }
        }
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(53767);
    boolean bool;
    if ((this.lft != null) && (this.lft.getVisibility() == 0))
    {
      this.lft.setVisibility(8);
      if (this.lfo)
      {
        bool = true;
        showOptionMenu(1001, bool);
        setMMTitle(2131299132);
        AppMethodBeat.o(53767);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      super.onBackPressed();
      AppMethodBeat.o(53767);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53761);
    super.onCreate(paramBundle);
    this.lde = getIntent().getIntExtra("uin", 0);
    this.edV = getIntent().getStringExtra("Select_Conv_User");
    this.kVE = getIntent().getLongExtra("searchID", 0L);
    this.kWM = getIntent().getStringExtra("id");
    paramBundle = getIntent().getStringExtra("tag_id");
    if (!bo.isNullOrNil(paramBundle));
    try
    {
      this.lfa = Integer.valueOf(paramBundle).intValue();
      this.lfb = getIntent().getStringExtra("tag_desc");
      this.kWK = getIntent().getStringExtra("keyword");
      this.lfc = getIntent().getIntExtra("set_id", 0);
      this.lfd = getIntent().getStringExtra("set_title");
      this.lfe = getIntent().getStringExtra("set_iconURL");
      this.lff = getIntent().getStringExtra("set_desc");
      this.lfg = getIntent().getStringExtra("headurl");
      this.lfh = getIntent().getStringExtra("sns_object_data");
      this.lfi = getIntent().getIntExtra("pageType", 0);
      if (!bo.isNullOrNil(this.lfh))
      {
        this.lfc = EmojiLogic.Jv(this.lfh);
        this.lfd = EmojiLogic.Jw(this.lfh);
        this.lfe = EmojiLogic.Jy(this.lfh);
        this.lff = EmojiLogic.Jx(this.lfh);
        this.lfg = EmojiLogic.Jz(this.lfh);
        this.lfi = EmojiLogic.JA(this.lfh);
      }
      switch (this.lfi)
      {
      default:
        this.lfy = true;
        if (this.lfy)
        {
          paramBundle = new Intent();
          j.bki();
          paramBundle.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
          paramBundle.putExtra("showShare", false);
          d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramBundle);
          finish();
        }
        initView();
        if ((this.lde == 0) && (this.lfi == 2))
        {
          paramBundle = j.getEmojiStorageMgr().xYt.aqn(this.kWM);
          if ((paramBundle != null) && (paramBundle.woq != null) && (paramBundle.woq.DesignerUin != 0) && (!bo.isNullOrNil(paramBundle.woq.Name)))
          {
            this.lde = paramBundle.woq.DesignerUin;
            ab.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "uin:%s ", new Object[] { Integer.valueOf(this.lde) });
          }
        }
        else
        {
          i = 0;
          if (i != 0)
            break label772;
          Kh();
          g.RP().Ry().set(ac.a.xJn, Boolean.FALSE);
          g.RO().eJo.a(821, this);
          g.RO().eJo.a(239, this);
          AppMethodBeat.o(53761);
          return;
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        int i;
        ab.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", bo.l(paramBundle));
        continue;
        if (!bo.isNullOrNil(this.kWK))
        {
          this.lfi = 5;
          this.lfo = false;
          this.gOW = 2;
        }
        else if (!bo.isNullOrNil(this.kWM))
        {
          this.lfi = 2;
          this.gOW = 1;
        }
        else if (this.lde != 0)
        {
          this.lfi = 3;
          this.gOW = 1;
        }
        else if (this.lfa != 0)
        {
          this.gOW = 3;
          this.lfi = 4;
        }
        else if (this.lfc > 0)
        {
          this.lfi = 6;
          this.gOW = 4;
        }
        else
        {
          this.lfi = 1;
          this.gOW = 0;
          continue;
          this.gOW = 0;
          continue;
          if (bo.isNullOrNil(this.kWM))
          {
            continue;
            if (this.lde == 0)
            {
              continue;
              if (this.lfa == 0)
              {
                continue;
                if (bo.isNullOrNil(this.kWK))
                {
                  continue;
                  if (this.lfc == 0)
                  {
                    continue;
                    i = 1;
                    continue;
                    label772: this.ldE = new i(this.kWM);
                    g.RO().eJo.a(this.ldE, 0);
                    JP(getString(2131297086));
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53764);
    g.RO().eJo.b(239, this);
    g.RO().eJo.b(821, this);
    super.onDestroy();
    AppMethodBeat.o(53764);
  }

  public void onPause()
  {
    AppMethodBeat.i(53763);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.lfz);
    AppMethodBeat.o(53763);
  }

  public void onResume()
  {
    AppMethodBeat.i(53762);
    super.onResume();
    com.tencent.mm.sdk.b.a.xxA.c(this.lfz);
    AppMethodBeat.o(53762);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53777);
    int i = paramm.getType();
    if (i == 821)
    {
      blb();
      paramm = (com.tencent.mm.plugin.emoji.f.h)paramm;
      paramString = paramm.bkw();
      this.isLoading = false;
      if (this.lfn != null)
      {
        this.lfn.setVisibility(8);
        this.mHandler.removeMessages(1002);
        this.mHandler.sendEmptyMessageDelayed(1001, 200L);
      }
      i = paramm.gvO;
      if (((paramInt1 == 0) && (paramInt2 == 0)) || ((paramInt1 == 4) && ((paramInt2 == 2) || (paramInt2 == 3)) && ((this.lfq == null) || (this.lfq.length <= 0)) && (i != 3)))
        a(paramString);
      if ((paramInt1 == 0) || (paramInt1 == 4))
      {
        this.lfq = paramm.kWI;
        if (paramInt2 == 0)
        {
          R(paramString.woo);
          this.lfr = 0;
          AppMethodBeat.o(53777);
        }
      }
    }
    while (true)
    {
      return;
      if (paramInt2 == 2)
      {
        R(paramString.woo);
        this.lfr = 2;
        AppMethodBeat.o(53777);
      }
      else if (paramInt2 == 3)
      {
        this.lfr = -1;
        R(paramString.woo);
        AppMethodBeat.o(53777);
      }
      else
      {
        bmj();
        AppMethodBeat.o(53777);
        continue;
        bmj();
        AppMethodBeat.o(53777);
        continue;
        if (i == 239)
        {
          blb();
          if ((paramInt2 == 0) && (paramInt1 == 0))
          {
            paramString = ((i)paramm).bkx();
            if ((paramString != null) && (paramString.woq != null))
            {
              this.lde = paramString.woq.DesignerUin;
              if (this.mHandler != null)
                this.mHandler.sendEmptyMessage(1004);
            }
            AppMethodBeat.o(53777);
          }
          else
          {
            showOptionMenu(1001, false);
            com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299050), null, true);
            ab.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "open single product ui failed.");
          }
        }
        else
        {
          AppMethodBeat.o(53777);
        }
      }
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(53778);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (this.lfr == 2) && (!this.isLoading))
    {
      ab.d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "No More List.");
      bmi();
      ab.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
    if ((paramInt != 0) && (this.lfj != null))
      this.lfj.bmt();
    AppMethodBeat.o(53778);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI
 * JD-Core Version:    0.6.2
 */
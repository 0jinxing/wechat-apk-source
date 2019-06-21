package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnDragListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.g.a.ny;
import com.tencent.mm.g.a.nz;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.widget.InputPanelLinearLayout;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChatFooter extends InputPanelLinearLayout
  implements ViewTreeObserver.OnGlobalLayoutListener, h.a
{
  private static int count = 0;
  private static final int[] gcc = { 2130837686, 2130837687, 2130837688, 2130837689, 2130837690, 2130837691, 2130837692 };
  private static final int[] miN = { 0, 15, 30, 45, 60, 75, 90, 100 };
  private Activity activity;
  public String cEV;
  private Context context;
  private int dj;
  public ChatFooterPanel eAk;
  private View gbS;
  private int jZk;
  private int jZl;
  public final ak mHandler;
  private boolean miB;
  public View miF;
  public View miG;
  private ImageView miH;
  public View miI;
  public View miJ;
  private final ak miO;
  public MMEditText oij;
  public Button oik;
  public o szb;
  private TextView szc;
  private ImageView szd;
  public View sze;
  public String toUser;
  private int ubu;
  f vhg;
  public n viY;
  public boolean vjb;
  private String vmL;
  public AppPanel vmM;
  public TextView vmN;
  private Button vmO;
  public ImageButton vmP;
  public ChatFooterBottom vmQ;
  private TextView vmR;
  public ImageButton vmS;
  public ImageButton vmT;
  public View vmU;
  private com.tencent.mm.ui.widget.a.c vmV;
  private i vmW;
  public m vmX;
  private b vmY;
  private ChatFooter.e vmZ;
  private int vnA;
  private final int vnB;
  private final int vnC;
  private final int vnD;
  private final int vnE;
  private final int vnF;
  private final int vnG;
  private final int vnH;
  private final int vnI;
  private int vnJ;
  private int vnK;
  private int vnL;
  private boolean vnM;
  private final int vnN;
  private final int vnO;
  private volatile boolean vnP;
  private ak vnQ;
  private int vnR;
  private int vnS;
  private int vnT;
  private View vnU;
  public boolean vnV;
  private int vnW;
  public final ChatFooter.a vna;
  public boolean vnb;
  private boolean vnc;
  private TextView vnd;
  private InputMethodManager vne;
  private int vnf;
  private boolean vng;
  private boolean vnh;
  public boolean vni;
  private boolean vnj;
  com.tencent.mm.g.b.a.b vnk;
  public ChatFooter.c vnl;
  public ChatFooter.d vnm;
  private m.a vnn;
  private boolean vno;
  public MMFragment vnp;
  public ChatFooter.b vnq;
  private boolean vnr;
  private Animation vns;
  private Animation vnt;
  private ChatFooterPanel.a vnu;
  private AppPanel.b vnv;
  public ChatFooter.f vnw;
  private int vnx;
  private com.tencent.mm.sdk.b.c vny;
  private boolean vnz;

  public ChatFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChatFooter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27830);
    this.gbS = null;
    this.oij = null;
    this.oik = null;
    this.vmN = null;
    this.vmZ = null;
    this.vna = new ChatFooter.a((byte)0);
    this.vnb = false;
    this.vnc = false;
    this.miB = false;
    this.vng = false;
    this.vnh = false;
    this.vni = false;
    this.vjb = false;
    this.vnj = true;
    this.jZk = -1;
    this.jZl = -1;
    this.vnk = new com.tencent.mm.g.b.a.b();
    this.vnn = new ChatFooter.1(this);
    this.mHandler = new ChatFooter.12(this);
    this.vno = false;
    this.vnr = false;
    this.vnu = new ChatFooter.11(this);
    this.vnv = new ChatFooter.13(this);
    this.miO = new ChatFooter.15(this);
    this.vnx = 0;
    this.vny = new com.tencent.mm.sdk.b.c()
    {
    };
    this.vnz = false;
    this.vnA = 0;
    this.vnB = 0;
    this.vnC = 1;
    this.vnD = 2;
    this.vnE = 3;
    this.vnF = 20;
    this.vnG = 21;
    this.vnH = 22;
    this.vnI = 23;
    this.vnJ = 0;
    this.vnK = 0;
    this.vnL = -1;
    this.dj = -1;
    this.vnM = false;
    this.vnN = 4097;
    this.vnO = 4098;
    this.vnQ = new ChatFooter.27(this);
    this.vnR = -1;
    this.vnS = -1;
    this.vnT = -1;
    this.vnU = null;
    this.vnV = true;
    this.vnW = 0;
    long l = System.currentTimeMillis();
    this.vne = ((InputMethodManager)paramContext.getSystemService("input_method"));
    this.gbS = inflate(paramContext, 2130969019, this);
    this.oij = ((MMEditText)this.gbS.findViewById(2131822414));
    if (com.tencent.mm.ui.ae.dzg())
      this.oij.setImeOptions(268435456);
    com.tencent.mm.ui.tools.b.c.d(this.oij).PM(bo.getInt(com.tencent.mm.m.g.Nu().getValue("InputLimitSessionTextMsg"), 8192) * 2).a(null);
    this.oij.getInputExtras(true).putBoolean("IS_CHAT_EDITOR", true);
    this.oij.setOnFocusChangeListener(new ChatFooter.28(this));
    if (com.tencent.mm.compatible.util.d.iW(23))
      this.oij.setBreakStrategy(1);
    paramAttributeSet = new nz();
    paramAttributeSet.cKo.cKq = this.oij;
    paramAttributeSet.cKo.cKp = new ChatFooter.29(this);
    com.tencent.mm.sdk.b.a.xxA.m(paramAttributeSet);
    this.vmU = this.gbS.findViewById(2131822413);
    this.vmQ = ((ChatFooterBottom)findViewById(2131822422));
    this.vmS = ((ImageButton)this.gbS.findViewById(2131822420));
    this.oik = ((Button)this.gbS.findViewById(2131822421));
    getViewTreeObserver().addOnGlobalLayoutListener(this);
    this.oik.setTextSize(0, com.tencent.mm.bz.a.am(paramContext, 2131427762) * com.tencent.mm.bz.a.fY(paramContext));
    this.vmO = ((Button)this.gbS.findViewById(2131822415));
    this.vmP = ((ImageButton)findViewById(2131822412));
    iP(false);
    dkE();
    this.vmW = new i(getContext(), getRootView(), this, new ChatFooter.30(this, paramContext));
    this.vmW.vov = this;
    paramAttributeSet = getContext();
    getRootView();
    this.vmX = new m(paramAttributeSet);
    this.vmX.vnn = this.vnn;
    ab.d("MicroMsg.ChatFooter", "send edittext ime option %s", new Object[] { Integer.valueOf(this.oij.getImeOptions()) });
    this.oij.setOnEditorActionListener(new ChatFooter.31(this));
    this.oij.setOnTouchListener(new ChatFooter.32(this));
    this.oij.setOnLongClickListener(new ChatFooter.2(this, paramContext));
    this.oij.setCustomSelectionActionModeCallback(new ChatFooter.3(this, paramContext));
    this.oik.setOnClickListener(new ChatFooter.4(this));
    this.vmO.setOnTouchListener(new ChatFooter.9(this));
    this.vmO.setOnKeyListener(new ChatFooter.10(this));
    this.vmP.setOnClickListener(new ChatFooter.8(this));
    dkg();
    this.vmS.setVisibility(0);
    this.vmS.setContentDescription(getContext().getString(2131298026));
    this.vmS.setOnClickListener(new ChatFooter.6(this));
    ab.i("MicroMsg.ChatFooter", "[init]");
    Lh(-1);
    findViewById(2131822408).setOnTouchListener(new ChatFooter.5(this));
    ab.d("MicroMsg.ChatFooter", "init time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(27830);
  }

  private void Ld(int paramInt)
  {
    AppMethodBeat.i(27845);
    if (this.vmP == null)
    {
      AppMethodBeat.o(27845);
      return;
    }
    if (paramInt == 2130838304);
    for (int i = 1; ; i = 0)
    {
      if (this.vmP != null)
      {
        if (i == 0)
          break label85;
        this.vmP.setContentDescription(getContext().getString(2131298032));
      }
      while (true)
      {
        this.vmP.setImageResource(paramInt);
        this.vmP.setPadding(0, 0, 0, 0);
        AppMethodBeat.o(27845);
        break;
        label85: this.vmP.setContentDescription(getContext().getString(2131298031));
      }
    }
  }

  private void Lg(int paramInt)
  {
    AppMethodBeat.i(27868);
    this.vnf = paramInt;
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(27868);
      while (true)
      {
        return;
        this.vmU.setVisibility(0);
        this.vmO.setVisibility(8);
        Ld(2130838304);
        AppMethodBeat.o(27868);
      }
      this.vmU.setVisibility(8);
      this.vmO.setVisibility(0);
      Ld(2130838303);
      if ((r.Zf().booleanValue()) && (this.vnl != null))
      {
        ChatFooter.c localc = this.vnl;
        Boolean localBoolean = Boolean.TRUE;
        localc.b(localBoolean, localBoolean);
      }
    }
  }

  private void Lh(int paramInt)
  {
    AppMethodBeat.i(27915);
    ab.i("MicroMsg.ChatFooter", "[refreshBootomHeight] keyborPx:%d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.compatible.util.j.dod();
    if ((ad.aox(this.vmL)) || (ad.aoy(this.vmL)));
    for (paramInt = com.tencent.mm.compatible.util.j.e(this.context, paramInt, 43); ; paramInt = com.tencent.mm.compatible.util.j.at(this.context, paramInt))
    {
      if ((paramInt > 0) && (this.vmQ != null))
      {
        ab.d("MicroMsg.ChatFooter", "set bottom panel height: %d", new Object[] { Integer.valueOf(paramInt) });
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0);
        localLayoutParams.height = paramInt;
        ab.e("MicroMsg.ChatFooter", "refreshBootomHeight:bottomPanel height:" + localLayoutParams.height);
        this.vmQ.setLayoutParams(localLayoutParams);
      }
      if (this.vmM != null)
      {
        this.vmM.setPortHeighPx(paramInt);
        this.vmM.AG();
      }
      if (this.viY != null)
      {
        this.viY.setPortHeightPX(paramInt);
        this.viY.djT();
      }
      if (this.eAk != null)
      {
        if ((!cth()) && (!this.vmQ.dkH()))
          dkw();
        this.eAk.setPortHeightPx(paramInt);
        this.eAk.AG();
      }
      AppMethodBeat.o(27915);
      return;
    }
  }

  private void djq()
  {
    AppMethodBeat.i(27851);
    if (!this.vjb)
      AppMethodBeat.o(27851);
    while (true)
    {
      return;
      View localView = findViewById(2131822408);
      this.vjb = false;
      if (this.viY != null)
      {
        this.viY.destroy();
        this.viY.setVisibility(8);
      }
      localView.setVisibility(0);
      this.oij.setVisibility(0);
      this.oij.setText("");
      oP(true);
      dkd();
      u(0, -1, false);
      AppMethodBeat.o(27851);
    }
  }

  private void dkB()
  {
    AppMethodBeat.i(27914);
    this.vmQ.setVisibility(8);
    setAppPanelVisible(8);
    if (this.eAk != null)
      this.eAk.setVisibility(8);
    oR(false);
    AppMethodBeat.o(27914);
  }

  private void dkg()
  {
    AppMethodBeat.i(27846);
    String str;
    if (this.vnq == null)
    {
      str = this.vmL;
      this.vmM = ((AppPanel)findViewById(2131822423));
      this.vmM.setOnSwitchPanelListener(this.vnv);
      this.vmM.setPortHeighPx(com.tencent.mm.sdk.platformtools.x.gs(this.context));
      if ((!t.nI(str)) && (!t.nB(str)))
        break label113;
      this.vmM.init(0);
    }
    while (true)
    {
      this.vmR = ((TextView)findViewById(2131822424));
      AppMethodBeat.o(27846);
      return;
      str = this.vnq.getTalkerUserName();
      break;
      label113: if (t.mZ(str))
        this.vmM.init(4);
      else if (t.kH(str))
        this.vmM.init(2);
      else
        this.vmM.init(1);
    }
  }

  private void dku()
  {
    AppMethodBeat.i(27884);
    this.gbS.findViewById(2131822418).setVisibility(0);
    AppMethodBeat.o(27884);
  }

  private void dkv()
  {
    AppMethodBeat.i(27885);
    ab.i("MicroMsg.ChatFooter", "jacks chatting footer disable enter button send");
    this.vnh = false;
    this.oij.setImeOptions(0);
    this.oij.setInputType(this.oij.getInputType() | 0x40);
    AppMethodBeat.o(27885);
  }

  private void iP(boolean paramBoolean)
  {
    AppMethodBeat.i(27836);
    if (this.vns == null)
    {
      this.vns = AnimationUtils.loadAnimation(getContext(), 2131034216);
      this.vns.setDuration(150L);
    }
    if (this.vnt == null)
    {
      this.vnt = AnimationUtils.loadAnimation(getContext(), 2131034221);
      this.vnt.setDuration(150L);
    }
    if ((this.oik == null) || (this.vmS == null))
      AppMethodBeat.o(27836);
    while (true)
    {
      return;
      if (this.vno)
      {
        if (this.vmS.getVisibility() != 0)
          this.vmS.setVisibility(0);
        AppMethodBeat.o(27836);
      }
      else if ((this.oik.getVisibility() == 0) && (paramBoolean))
      {
        AppMethodBeat.o(27836);
      }
      else
      {
        if ((this.vmS.getVisibility() != 0) || (paramBoolean))
          break;
        AppMethodBeat.o(27836);
      }
    }
    if (paramBoolean)
    {
      this.oik.startAnimation(this.vns);
      this.oik.setVisibility(0);
      this.vmS.startAnimation(this.vnt);
      this.vmS.setVisibility(8);
    }
    while (true)
    {
      ab.i("MicroMsg.ChatFooter", "jacks canSend:%B", new Object[] { Boolean.valueOf(paramBoolean) });
      this.oik.getParent().requestLayout();
      AppMethodBeat.o(27836);
      break;
      this.vmS.startAnimation(this.vns);
      if (!this.vnc)
        this.vmS.setVisibility(0);
      this.oik.startAnimation(this.vnt);
      this.oik.setVisibility(8);
    }
  }

  @TargetApi(24)
  private boolean isInMultiWindowMode()
  {
    AppMethodBeat.i(27907);
    boolean bool;
    if (((getContext() instanceof Activity)) && (com.tencent.mm.compatible.util.d.iW(24)))
    {
      bool = ((Activity)getContext()).isInMultiWindowMode();
      ab.i("MicroMsg.ChatFooter", "isInMultiWindow %b ", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(27907);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(27907);
      bool = false;
    }
  }

  private void oR(boolean paramBoolean)
  {
    AppMethodBeat.i(27913);
    if (this.vmT == null)
      AppMethodBeat.o(27913);
    while (true)
    {
      return;
      if ((this.vnM) && (paramBoolean))
      {
        AppMethodBeat.o(27913);
      }
      else if ((!this.vnM) && (!paramBoolean))
      {
        AppMethodBeat.o(27913);
      }
      else
      {
        this.vnM = paramBoolean;
        if (paramBoolean)
        {
          this.vmT.setImageDrawable(getContext().getResources().getDrawable(2130838303));
          AppMethodBeat.o(27913);
        }
        else
        {
          this.vmT.setImageDrawable(getContext().getResources().getDrawable(2130838298));
          AppMethodBeat.o(27913);
        }
      }
    }
  }

  public final void AD()
  {
    AppMethodBeat.i(27843);
    this.vni = true;
    if (this.eAk != null)
      this.eAk.AD();
    AppMethodBeat.o(27843);
  }

  public final void Le(int paramInt)
  {
    AppMethodBeat.i(27862);
    this.vnx = 0;
    int i = com.tencent.mm.bz.a.fromDPToPix(getContext(), 180);
    int j = BackwardSupportUtil.b.b(getContext(), 50.0F);
    if (paramInt + j < i);
    for (this.vnx = -1; ; this.vnx = ((paramInt - i) / 2 + j))
    {
      if (this.szb == null)
      {
        this.szb = new o(View.inflate(getContext(), 2130971021, null), -1, -2);
        this.miH = ((ImageView)this.szb.getContentView().findViewById(2131823958));
        this.miI = this.szb.getContentView().findViewById(2131823956);
        this.miJ = this.szb.getContentView().findViewById(2131823960);
        this.szc = ((TextView)this.szb.getContentView().findViewById(2131823962));
        this.szd = ((ImageView)this.szb.getContentView().findViewById(2131823961));
        this.sze = this.szb.getContentView().findViewById(2131828470);
        this.miF = this.szb.getContentView().findViewById(2131823955);
        this.miG = this.szb.getContentView().findViewById(2131823963);
        this.vnd = ((TextView)this.szb.getContentView().findViewById(2131828469));
      }
      if (this.vnx != -1)
      {
        this.miG.setVisibility(8);
        this.miF.setVisibility(8);
        this.sze.setVisibility(0);
        new ak().post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(27805);
            ChatFooter.w(ChatFooter.this).setVisibility(0);
            AppMethodBeat.o(27805);
          }
        });
        this.szb.showAtLocation(this, 49, 0, this.vnx);
      }
      AppMethodBeat.o(27862);
      return;
    }
  }

  public final void Lf(int paramInt)
  {
    AppMethodBeat.i(27866);
    for (int i = 0; ; i++)
      if (i < gcc.length)
      {
        if ((paramInt >= miN[i]) && (paramInt < miN[(i + 1)]))
          this.miH.setBackgroundDrawable(com.tencent.mm.bz.a.g(getContext(), gcc[i]));
      }
      else
      {
        if ((paramInt == -1) && (this.szb != null))
        {
          this.szb.dismiss();
          this.sze.setVisibility(0);
          this.miF.setVisibility(8);
          this.miG.setVisibility(8);
        }
        AppMethodBeat.o(27866);
        return;
      }
  }

  public final void a(Context paramContext, Activity paramActivity)
  {
    AppMethodBeat.i(27831);
    this.activity = paramActivity;
    dkE();
    if (com.tencent.mm.pluginsdk.model.app.an.dhQ().vdc)
      com.tencent.mm.pluginsdk.model.app.an.dhQ().fL(ah.getContext());
    if ((!this.vmQ.dkH()) && (this.eAk != null))
      this.eAk.onResume();
    if ((!this.vno) && (this.vnh))
      dkv();
    while (true)
    {
      if (com.tencent.mm.sdk.platformtools.x.gu(paramContext) != this.vnj)
        djS();
      if (this.vmM != null)
        this.vmM.context = paramContext;
      this.context = paramContext;
      this.vmW.vou = false;
      if (!this.vjb)
      {
        dku();
        this.oij.setVisibility(0);
      }
      dkd();
      post(new ChatFooter.22(this));
      com.tencent.mm.sdk.b.a.xxA.c(this.vny);
      AppMethodBeat.o(27831);
      return;
      if ((this.vno) && (!this.vnh))
        dkt();
    }
  }

  public final void ac(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(27876);
    this.vmM.oF(paramBoolean1);
    this.vmM.oG(paramBoolean2);
    AppMethodBeat.o(27876);
  }

  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    AppMethodBeat.i(27861);
    this.vnw = new ChatFooter.f(this, paramTextWatcher);
    this.oij.addTextChangedListener(this.vnw);
    AppMethodBeat.o(27861);
  }

  public final void ax(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(27852);
    if (this.vna.vof.containsKey(paramString1));
    Object localObject;
    for (paramString1 = (LinkedList)this.vna.vof.get(paramString1); ; paramString1 = (String)localObject)
    {
      localObject = new HashMap(1);
      ((HashMap)localObject).put(paramString3, paramString2);
      paramString1.add(localObject);
      AppMethodBeat.o(27852);
      return;
      localObject = new LinkedList();
      this.vna.vof.put(paramString1, localObject);
    }
  }

  public final void az(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(27869);
    Lg(paramInt);
    switch (paramInt)
    {
    default:
      setVisibility(0);
      AppMethodBeat.o(27869);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      oP(true);
      if (paramBoolean)
      {
        showVKB();
        if (this.oij.length() > 0);
        for (paramBoolean = bool2; ; paramBoolean = false)
        {
          iP(paramBoolean);
          AppMethodBeat.o(27869);
          break;
        }
      }
      if (this.oij.length() > 0);
      for (paramBoolean = bool1; ; paramBoolean = false)
      {
        iP(paramBoolean);
        AppMethodBeat.o(27869);
        break;
      }
      u(0, -1, false);
      iP(false);
      AppMethodBeat.o(27869);
    }
  }

  public final void bvH()
  {
    AppMethodBeat.i(27865);
    post(new ChatFooter.17(this));
    AppMethodBeat.o(27865);
  }

  public final boolean cth()
  {
    boolean bool = true;
    AppMethodBeat.i(27906);
    int i = com.tencent.mm.ui.ae.fr(this.context);
    ab.i("MicroMsg.ChatFooter", "is show key board %d, %d, %d", new Object[] { Integer.valueOf(this.jZl), Integer.valueOf(this.jZk), Integer.valueOf(i) });
    if ((this.jZl > 0) && (this.jZl < this.jZk - i))
      AppMethodBeat.o(27906);
    while (true)
    {
      return bool;
      AppMethodBeat.o(27906);
      bool = false;
    }
  }

  public final void ddN()
  {
    AppMethodBeat.i(27857);
    this.vmO.setEnabled(false);
    this.vmO.setBackgroundDrawable(com.tencent.mm.bz.a.g(getContext(), 2130840007));
    if (this.szb != null)
    {
      this.miG.setVisibility(0);
      this.miF.setVisibility(8);
      this.sze.setVisibility(8);
      this.szb.update();
    }
    this.miO.sendEmptyMessageDelayed(0, 500L);
    AppMethodBeat.o(27857);
  }

  public final void destroy()
  {
    AppMethodBeat.i(27834);
    if (this.eAk != null)
    {
      ab.i("MicroMsg.ChatFooter", "jacks chat footer desctory smiley panel");
      this.eAk.AC();
      this.eAk.destroy();
      this.eAk = null;
    }
    if (this.viY != null)
    {
      this.viY.destroy();
      this.viY = null;
      this.vjb = false;
    }
    if (this.vmY != null)
      this.vmY.release();
    if (this.vmX != null)
    {
      this.vmX.vnn = null;
      this.vmX.voG = null;
      this.vmX.hide();
    }
    ab.d("MicroMsg.ChatFooter", "jacks destroy");
    AppMethodBeat.o(27834);
  }

  public final void djS()
  {
    AppMethodBeat.i(27888);
    ab.i("MicroMsg.ChatFooter", "[dealOrientationChange]");
    djq();
    dkB();
    this.vnz = true;
    this.vnj = com.tencent.mm.sdk.platformtools.x.gu(this.context);
    dkw();
    AppMethodBeat.o(27888);
  }

  public final void dkA()
  {
    AppMethodBeat.i(27902);
    u(2, 20, false);
    AppMethodBeat.o(27902);
  }

  public final void dkC()
  {
    AppMethodBeat.i(27916);
    this.miB = false;
    this.vmO.setBackgroundDrawable(com.tencent.mm.bz.a.g(getContext(), 2130840820));
    this.vmO.setText(2131298057);
    if (this.vmY != null)
      if ((this.miJ != null) && (this.miJ.getVisibility() == 0))
      {
        this.vmY.bNI();
        AppMethodBeat.o(27916);
      }
    while (true)
    {
      return;
      this.vmY.bNG();
      AppMethodBeat.o(27916);
    }
  }

  public final boolean dkD()
  {
    AppMethodBeat.i(27917);
    boolean bool;
    if (this.vnK - getTop() > 50)
    {
      bool = true;
      AppMethodBeat.o(27917);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27917);
    }
  }

  public final void dkE()
  {
    AppMethodBeat.i(27919);
    aw.ZK();
    this.vno = ((Boolean)com.tencent.mm.model.c.Ry().get(66832, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(27919);
  }

  public final void dka()
  {
    AppMethodBeat.i(27829);
    if (this.vnk != null)
    {
      com.tencent.mm.g.b.a.b localb = this.vnk;
      localb.cTv = 0L;
      localb.cTt = 0L;
      localb.cTu = 0L;
      localb.cTw = 0L;
      localb.aM(0L).aN(0L);
    }
    AppMethodBeat.o(27829);
  }

  public final void dkb()
  {
    AppMethodBeat.i(27835);
    if (this.vmM == null)
      AppMethodBeat.o(27835);
    while (true)
    {
      return;
      this.vmM.djI();
      AppMethodBeat.o(27835);
    }
  }

  public final void dkc()
  {
    AppMethodBeat.i(27838);
    if (this.vmY != null)
      this.vmY.bNL();
    ab.i("MicroMsg.ChatFooter", "click attach btn: %s, %s", new Object[] { Integer.valueOf(this.vmM.getVisibility()), Boolean.valueOf(this.vmQ.dkH()) });
    if ((this.vmM.getVisibility() == 0) && (!this.vmQ.dkH()))
    {
      if (this.vnf == 1)
      {
        showVKB();
        AppMethodBeat.o(27838);
      }
      while (true)
      {
        return;
        u(0, -1, false);
        AppMethodBeat.o(27838);
      }
    }
    u(2, 22, true);
    if ((this.viY != null) && (this.viY.getVisibility() == 0) && (this.vjb))
    {
      ab.d("MicroMsg.ChatFooter", "voiceInputPanel is VISIBLE, set appPanel VISIBLE");
      this.viY.setVisibility(8);
      this.vjb = false;
      this.viY.reset();
    }
    Object localObject = com.tencent.mm.pluginsdk.model.app.an.dhQ();
    Context localContext = ah.getContext();
    if ((!com.tencent.mm.kernel.g.RK()) || (localContext == null));
    while (true)
    {
      com.tencent.mm.pluginsdk.model.app.an.dhQ().fL(ah.getContext());
      AppMethodBeat.o(27838);
      break;
      try
      {
        String str = com.tencent.mm.m.g.Nu().getValue("ShowAPPSuggestion");
        if ((bo.isNullOrNil(str)) || (Integer.valueOf(str).intValue() != 1))
          ab.w("MicroMsg.SuggestionAppListLogic", "cfgShowAppSuggestion %s, return", new Object[] { str });
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.SuggestionAppListLogic", "exception in getSuggestionAppList, %s", new Object[] { localException.getMessage() });
        if (((com.tencent.mm.pluginsdk.model.app.an)localObject).vcW)
        {
          ab.w("MicroMsg.SuggestionAppListLogic", "SuggestionApp is Loading");
        }
        else
        {
          ab.i("MicroMsg.SuggestionAppListLogic", "getSuggestionAppList");
          ((com.tencent.mm.pluginsdk.model.app.an)localObject).vcW = true;
          if (System.currentTimeMillis() - ((com.tencent.mm.pluginsdk.model.app.an)localObject).vcZ < 43200000L)
          {
            ab.d("MicroMsg.SuggestionAppListLogic", "not now");
            ((com.tencent.mm.pluginsdk.model.app.an)localObject).vcW = false;
          }
          else
          {
            com.tencent.mm.kernel.g.RQ();
            ((com.tencent.mm.pluginsdk.model.app.an)localObject).vcZ = com.tencent.mm.kernel.g.RP().Ry().Mm(352275);
            if (System.currentTimeMillis() - ((com.tencent.mm.pluginsdk.model.app.an)localObject).vcZ < 43200000L)
            {
              ab.w("MicroMsg.SuggestionAppListLogic", "not now sp");
              ((com.tencent.mm.pluginsdk.model.app.an)localObject).vcW = false;
            }
            else
            {
              if (((com.tencent.mm.pluginsdk.model.app.an)localObject).lang == null)
                ((com.tencent.mm.pluginsdk.model.app.an)localObject).lang = aa.g(localContext.getSharedPreferences(ah.doA(), 0));
              localObject = new com.tencent.mm.pluginsdk.model.app.ae(((com.tencent.mm.pluginsdk.model.app.an)localObject).lang, new LinkedList());
              com.tencent.mm.plugin.s.a.bYM();
              com.tencent.mm.pluginsdk.model.app.d.a(4, (com.tencent.mm.pluginsdk.model.app.x)localObject);
            }
          }
        }
      }
    }
  }

  public final void dkd()
  {
    AppMethodBeat.i(27839);
    this.vmT = ((ImageButton)this.gbS.findViewById(2131822416));
    this.vmT.setVisibility(0);
    if (!com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xVy, false))
      this.gbS.findViewById(2131822417).setVisibility(0);
    while (true)
    {
      this.vmT.setOnClickListener(new ChatFooter.7(this));
      if (this.vmX != null)
        this.vmX.voF = this.vmT;
      AppMethodBeat.o(27839);
      return;
      this.gbS.findViewById(2131822417).setVisibility(8);
    }
  }

  public final void dke()
  {
    boolean bool = true;
    AppMethodBeat.i(27841);
    dkf();
    if ((e.vom == null) || (this.context == null))
    {
      if (this.context == null)
      {
        ab.e("MicroMsg.ChatFooter", "[initSmiley] context always is null! %s", new Object[] { bo.dpG() });
        this.eAk = new d(ah.getContext());
        AppMethodBeat.o(27841);
      }
      while (true)
      {
        return;
        this.eAk = new d(this.context);
        AppMethodBeat.o(27841);
      }
    }
    if (this.eAk != null)
      this.eAk.destroy();
    this.eAk = e.vom.dF(this.context);
    ChatFooterPanel localChatFooterPanel;
    if (this.eAk != null)
    {
      this.eAk.setEntranceScene(ChatFooterPanel.vhi);
      if (this.eAk != null)
        this.eAk.setVisibility(8);
      if (this.eAk != null)
        this.eAk.setFooterType(this.ubu);
      if (this.vmQ != null)
        this.vmQ.addView(this.eAk, -1, -2);
      if (this.eAk != null)
        this.eAk.setOnTextOperationListener(this.vnu);
      if (this.eAk != null)
      {
        localChatFooterPanel = this.eAk;
        if (this.oij.getText().length() <= 0)
          break label347;
      }
    }
    while (true)
    {
      localChatFooterPanel.setSendButtonEnable(bool);
      if (this.eAk != null)
      {
        if (this.vnq != null)
          this.eAk.setTalkerName(this.vnq.getTalkerUserName());
        this.eAk.setPortHeightPx(getKeyBordHeightPX());
        this.eAk.AG();
        if (!bo.isNullOrNil(this.oij.getText().toString()))
          this.eAk.AF();
      }
      if (this.vni)
        AD();
      setSmileyPanelCallback(this.vhg);
      AppMethodBeat.o(27841);
      break;
      label347: bool = false;
    }
  }

  public final void dkf()
  {
    boolean bool = true;
    AppMethodBeat.i(27842);
    if (this.context == null)
      if (this.activity == null)
      {
        ab.e("MicroMsg.ChatFooter", "[initSmiley] activity = null? %s", new Object[] { Boolean.valueOf(bool) });
        if (this.activity == null)
          break label72;
        this.context = this.activity.getBaseContext();
        AppMethodBeat.o(27842);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      label72: this.context = getContext();
      AppMethodBeat.o(27842);
    }
  }

  public final void dkh()
  {
    AppMethodBeat.i(27849);
    this.vnf = 1;
    this.vmU.setVisibility(0);
    this.vmO.setVisibility(8);
    Ld(2130838304);
    if (this.viY != null)
    {
      this.viY.setVisibility(8);
      this.vjb = false;
      this.viY.reset();
    }
    u(2, 21, true);
    AppMethodBeat.o(27849);
  }

  public final void dki()
  {
    AppMethodBeat.i(27864);
    this.sze.setVisibility(8);
    this.miF.setVisibility(0);
    AppMethodBeat.o(27864);
  }

  public final void dkj()
  {
    AppMethodBeat.i(27870);
    this.vmU.setVisibility(0);
    this.vmP.setVisibility(8);
    this.vmO.setVisibility(8);
    AppMethodBeat.o(27870);
  }

  public final void dkk()
  {
    AppMethodBeat.i(27871);
    if (this.vmP != null)
      this.vmP.setVisibility(0);
    AppMethodBeat.o(27871);
  }

  public final void dkl()
  {
    AppMethodBeat.i(27872);
    AppPanel localAppPanel = this.vmM;
    localAppPanel.vlP.vml.value = false;
    localAppPanel.djQ();
    AppMethodBeat.o(27872);
  }

  public final void dkm()
  {
    AppMethodBeat.i(27873);
    AppPanel localAppPanel = this.vmM;
    localAppPanel.vlP.vmD.value = false;
    localAppPanel.djQ();
    AppMethodBeat.o(27873);
  }

  public final void dkn()
  {
    AppMethodBeat.i(27874);
    AppPanel localAppPanel = this.vmM;
    localAppPanel.vlP.vmm.value = false;
    localAppPanel.djQ();
    AppMethodBeat.o(27874);
  }

  public final void dko()
  {
    AppMethodBeat.i(27875);
    AppPanel localAppPanel = this.vmM;
    localAppPanel.vlP.vmp.value = false;
    localAppPanel.djQ();
    AppMethodBeat.o(27875);
  }

  public final void dkp()
  {
    AppMethodBeat.i(27879);
    AppPanel localAppPanel = this.vmM;
    localAppPanel.vlX = true;
    localAppPanel.vlP.oN(false);
    localAppPanel.djQ();
    ab.i("MicroMsg.AppPanel", "disableServiceLuckyMoney %s", new Object[] { bo.dpG().toString() });
    AppMethodBeat.o(27879);
  }

  public final void dkq()
  {
    AppMethodBeat.i(27880);
    AppPanel localAppPanel = this.vmM;
    localAppPanel.vlY = true;
    localAppPanel.vlP.oK(false);
    localAppPanel.djQ();
    ab.i("MicroMsg.AppPanel", "disableServiceRemittance %s", new Object[] { bo.dpG().toString() });
    AppMethodBeat.o(27880);
  }

  public final void dkr()
  {
    AppMethodBeat.i(27881);
    if (this.vmT != null)
      this.vmT.setVisibility(8);
    AppMethodBeat.o(27881);
  }

  public final void dks()
  {
    AppMethodBeat.i(27882);
    AppPanel localAppPanel = this.vmM;
    localAppPanel.vlZ = true;
    localAppPanel.vlP.oO(false);
    localAppPanel.djQ();
    AppMethodBeat.o(27882);
  }

  public final void dkt()
  {
    AppMethodBeat.i(27883);
    ab.i("MicroMsg.ChatFooter", "jacks chatting footer enable enter button send");
    this.vnh = true;
    this.oij.setImeOptions(4);
    this.oij.setInputType(this.oij.getInputType() & 0xFFFFFFBF);
    AppMethodBeat.o(27883);
  }

  public final void dkw()
  {
    AppMethodBeat.i(27886);
    if ((!this.vmQ.dkH()) && (this.eAk != null))
      this.eAk.refresh();
    AppMethodBeat.o(27886);
  }

  public final boolean dkx()
  {
    boolean bool = false;
    AppMethodBeat.i(27891);
    if ((this.vnp == null) || (this.vnp.getView() == null))
      AppMethodBeat.o(27891);
    Object localObject;
    while (true)
    {
      return bool;
      localObject = this.vnp.getView().findViewById(2131825953);
      if (localObject != null)
        break;
      AppMethodBeat.o(27891);
    }
    Rect localRect = new Rect();
    ((View)localObject).getGlobalVisibleRect(localRect);
    if (com.tencent.mm.compatible.util.d.iW(28))
    {
      localObject = ((View)localObject).getRootWindowInsets().getDisplayCutout();
      if (localObject == null);
    }
    for (int i = ((DisplayCutout)localObject).getSafeInsetLeft(); ; i = 0)
    {
      if (localRect.left > i)
      {
        bool = true;
        AppMethodBeat.o(27891);
        break;
      }
      AppMethodBeat.o(27891);
      break;
    }
  }

  public final boolean dky()
  {
    AppMethodBeat.i(27892);
    boolean bool;
    if (this.vmQ.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(27892);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27892);
    }
  }

  public final void dkz()
  {
    AppMethodBeat.i(27900);
    showVKB();
    oP(true);
    AppMethodBeat.o(27900);
  }

  public String getAtSomebody()
  {
    return this.vna.vod;
  }

  public int getBarGroupHeight()
  {
    AppMethodBeat.i(27837);
    int i = findViewById(2131822408).getHeight();
    AppMethodBeat.o(27837);
    return i;
  }

  public f getCallback()
  {
    return this.vhg;
  }

  public char getCharAtCursor()
  {
    AppMethodBeat.i(27860);
    int i = getSelectionStart();
    if (i <= 0)
    {
      i = 120;
      AppMethodBeat.o(27860);
    }
    for (int j = i; ; j = i)
    {
      return j;
      i = getLastText().charAt(i - 1);
      AppMethodBeat.o(27860);
    }
  }

  public int getInsertPos()
  {
    return this.vna.voe;
  }

  public boolean getIsVoiceInputPanleShow()
  {
    return this.vjb;
  }

  public int getKeyBordHeightPX()
  {
    AppMethodBeat.i(27911);
    int i = com.tencent.mm.sdk.platformtools.x.gs(getContext());
    AppMethodBeat.o(27911);
    return i;
  }

  public String getLastContent()
  {
    return this.vna.voc;
  }

  public String getLastText()
  {
    AppMethodBeat.i(27858);
    String str;
    if (this.oij == null)
    {
      str = "";
      AppMethodBeat.o(27858);
    }
    while (true)
    {
      return str;
      str = this.oij.getText().toString();
      AppMethodBeat.o(27858);
    }
  }

  public int getMode()
  {
    return this.vnf;
  }

  public View getPanel()
  {
    return this.vmQ;
  }

  public int getSelectionStart()
  {
    AppMethodBeat.i(27859);
    int i = this.oij.getSelectionStart();
    AppMethodBeat.o(27859);
    return i;
  }

  public int getSmieyType()
  {
    return 0;
  }

  public int getYFromBottom()
  {
    AppMethodBeat.i(27921);
    int i = com.tencent.mm.compatible.util.j.gs(getContext());
    int j = getHeight();
    if (j < i)
    {
      j += i;
      AppMethodBeat.o(27921);
    }
    while (true)
    {
      return j;
      AppMethodBeat.o(27921);
    }
  }

  public final HashMap<String, String> hJ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(27853);
    long l = System.currentTimeMillis();
    if (bo.isNullOrNil(paramString2))
    {
      if (this.vna.vof.containsKey(paramString1))
        this.vna.vof.remove(paramString1);
      AppMethodBeat.o(27853);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      if ((!this.vna.vof.containsKey(paramString1)) || (((LinkedList)this.vna.vof.get(paramString1)).size() <= 0))
      {
        AppMethodBeat.o(27853);
        paramString1 = null;
      }
      else
      {
        Object localObject = new LinkedList();
        int j;
        for (int i = 0; i < paramString2.length(); i = j + 1)
        {
          i = paramString2.indexOf("@", i);
          if (i == -1)
            break;
          j = paramString2.indexOf(' ', i);
          if ((j == -1) || (j - i > 40))
            break;
          ((List)localObject).add(paramString2.substring(i + 1, j));
        }
        ab.i("MicroMsg.ChatFooter", "after split @ :%s", new Object[] { localObject });
        if (((List)localObject).size() <= 0)
        {
          ((LinkedList)this.vna.vof.get(paramString1)).clear();
          AppMethodBeat.o(27853);
          paramString1 = null;
        }
        else
        {
          LinkedList localLinkedList = (LinkedList)this.vna.vof.get(paramString1);
          if ((localLinkedList != null) && (localLinkedList.size() > 0))
          {
            ab.i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] size:%s", new Object[] { Integer.valueOf(localLinkedList.size()) });
            paramString2 = new LinkedList();
            Iterator localIterator1 = ((List)localObject).iterator();
            while (true)
            {
              if (!localIterator1.hasNext())
                break label389;
              paramString1 = (String)localIterator1.next();
              Iterator localIterator2 = localLinkedList.iterator();
              if (localIterator2.hasNext())
              {
                localObject = (HashMap)localIterator2.next();
                if (!((HashMap)localObject).containsKey(paramString1))
                  break;
                paramString2.add(((HashMap)localObject).get(paramString1));
              }
            }
            label389: paramString1 = new HashMap(1);
            ab.i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames]  atList size:%s", new Object[] { Integer.valueOf(paramString2.size()) });
            paramString1.put("atuserlist", "<![CDATA[" + bo.c(paramString2, ",") + "]]>");
            localLinkedList.clear();
            ab.d("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            AppMethodBeat.o(27853);
          }
          else
          {
            ab.w("MicroMsg.ChatFooter", "list is null or size 0");
            AppMethodBeat.o(27853);
            paramString1 = null;
          }
        }
      }
    }
  }

  public final boolean hideVKB()
  {
    AppMethodBeat.i(27904);
    boolean bool;
    if (getKeyBordHeightPX() / 2 <= getBottom())
    {
      bool = bo.hideVKB(this);
      AppMethodBeat.o(27904);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27904);
    }
  }

  public final void m(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(27910);
    super.m(paramBoolean, paramInt);
    if (this.vnJ != paramInt)
    {
      this.vnJ = paramInt;
      com.tencent.mm.compatible.util.j.x(getContext(), paramInt);
      Lh(getKeyBordHeightPX());
    }
    AppMethodBeat.o(27910);
  }

  public final void oH(boolean paramBoolean)
  {
    AppMethodBeat.i(27877);
    this.vmM.oH(paramBoolean);
    AppMethodBeat.o(27877);
  }

  public final void oI(boolean paramBoolean)
  {
    AppMethodBeat.i(27878);
    this.vmM.oI(paramBoolean);
    AppMethodBeat.o(27878);
  }

  public final void oP(boolean paramBoolean)
  {
    AppMethodBeat.i(27840);
    if (this.oij == null)
      AppMethodBeat.o(27840);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.oij.requestFocus();
        AppMethodBeat.o(27840);
      }
      else
      {
        this.oij.clearFocus();
        AppMethodBeat.o(27840);
      }
    }
  }

  public final void oQ(boolean paramBoolean)
  {
    AppMethodBeat.i(27901);
    hideVKB();
    oP(paramBoolean);
    AppMethodBeat.o(27901);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(27889);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.ChatFooter", "onConfigurationChanged: %s", new Object[] { paramConfiguration });
    Lh(getKeyBordHeightPX());
    AppMethodBeat.o(27889);
  }

  public void onGlobalLayout()
  {
    AppMethodBeat.i(27920);
    if ((this.activity == null) || (this.activity.getWindow() == null) || (this.activity.getWindow().getDecorView() == null))
      AppMethodBeat.o(27920);
    while (true)
    {
      return;
      if (this.vnT == -1)
      {
        ab.w("MicroMsg.ChatFooter", "chattingui layout id == -1!");
        AppMethodBeat.o(27920);
      }
      else
      {
        if (this.vnU == null)
          this.vnU = this.activity.getWindow().getDecorView().findViewById(this.vnT);
        if (this.vnU == null)
        {
          ab.e("MicroMsg.ChatFooter", "can't get chattinguilayout by chattinguilayoutid: %d", new Object[] { Integer.valueOf(this.vnT) });
          AppMethodBeat.o(27920);
        }
        else
        {
          int i = this.vnU.getHeight();
          int j = this.vnU.getWidth();
          ab.d("MicroMsg.ChatFooter", "ashutest::keybord:ChatFooter measure height: %d, height: %d", new Object[] { Integer.valueOf(this.vnU.getMeasuredHeight()), Integer.valueOf(i) });
          if (this.dj < i)
            this.dj = i;
          this.vnL = i;
          if (this.vnR <= 0)
          {
            this.vnR = i;
            AppMethodBeat.o(27920);
          }
          else if (this.vnS <= 0)
          {
            this.vnS = j;
            AppMethodBeat.o(27920);
          }
          else if ((this.vnR == i) && (this.vnS == j))
          {
            AppMethodBeat.o(27920);
          }
          else
          {
            if ((cth()) && (this.vnr))
            {
              this.vnr = false;
              ab.d("MicroMsg.ChatFooter", "keybord:Chatfooter Show keybord & hide diy panel by onGlobalLayout");
              postDelayed(new ChatFooter.21(this), 10L);
            }
            ab.d("MicroMsg.ChatFooter", "keybord:Chatfooter keybord old: %d, new: %d", new Object[] { Integer.valueOf(this.vnR), Integer.valueOf(i) });
            int k = com.tencent.mm.ui.ae.fr(this.context);
            int m = Math.abs(this.vnR - i);
            if (m > k)
              this.vnR = i;
            k = Math.abs(this.vnS - j);
            this.vnS = j;
            ab.i("MicroMsg.ChatFooter", "alvinluo widthDiff: %d", new Object[] { Integer.valueOf(k) });
            if ((this.vnV) && (k != 0))
            {
              if (this.vmM != null)
              {
                this.vmM.setNeedRefreshHeight(true);
                this.vmM.djS();
              }
              if (this.eAk != null)
              {
                this.eAk.setPortHeightPx(com.tencent.mm.compatible.util.j.gs(this.context));
                dkw();
                this.eAk.AG();
              }
            }
            ab.d("MicroMsg.ChatFooter", "keybord:Chatfooter Keyboard Size: ".concat(String.valueOf(m)));
            AppMethodBeat.o(27920);
          }
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(27908);
    int i;
    if (this.activity == null)
    {
      i = 0;
      ab.i("MicroMsg.ChatFooter", "keybord:ChatFooter onLayout change: %B, l:%d, t:%d, r:%d, b:%d softInputMode:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(i) });
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.jZk >= paramInt4)
        break label195;
      paramInt1 = paramInt4;
      label98: this.jZk = paramInt1;
      this.jZl = paramInt4;
      if (getTop() != 0)
      {
        if (getTop() > this.vnK)
          this.vnK = getTop();
        if (this.vnK - getTop() <= 50)
          break label203;
        if (this.vmY != null)
          this.vmY.iS(true);
      }
      label166: if (paramBoolean)
        break label223;
      AppMethodBeat.o(27908);
    }
    while (true)
    {
      return;
      i = this.activity.getWindow().getAttributes().softInputMode;
      break;
      label195: paramInt1 = this.jZk;
      break label98;
      label203: if (this.vmY == null)
        break label166;
      this.vmY.iS(false);
      break label166;
      label223: if (this.vmX != null)
      {
        m localm = this.vmX;
        if (localm.voE.isShowing())
        {
          localm.voE.dismiss();
          localm.dkL();
        }
      }
      AppMethodBeat.o(27908);
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27909);
    ab.d("MicroMsg.ChatFooter", "keybord:ChatFooter onMeasure  provide height:%d, height:%d", new Object[] { Integer.valueOf(View.MeasureSpec.getSize(paramInt2)), Integer.valueOf(getMeasuredHeight()) });
    super.onMeasure(paramInt1, paramInt2);
    ab.d("MicroMsg.ChatFooter", "keybord:ChatFooter onMeasure  height:%d", new Object[] { Integer.valueOf(getMeasuredHeight()) });
    AppMethodBeat.o(27909);
  }

  public final void onPause()
  {
    AppMethodBeat.i(27833);
    this.vnr = true;
    if (this.eAk != null)
      this.eAk.onPause();
    if ((this.vjb) && (this.viY != null))
      this.viY.pause();
    if (this.vmY != null)
      this.vmY.onPause();
    if (this.vmX != null)
      this.vmX.hide();
    this.vnV = false;
    com.tencent.mm.sdk.b.a.xxA.d(this.vny);
    AppMethodBeat.o(27833);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(27912);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    ab.d("MicroMsg.ChatFooter", "keybord:ChatFooter onSizeChanged  w:%d, h:%d, oldw:%d, oldh:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    AppMethodBeat.o(27912);
  }

  public void setAppPanelListener(AppPanel.a parama)
  {
    AppMethodBeat.i(27896);
    this.vmM.setAppPanelListener(parama);
    AppMethodBeat.o(27896);
  }

  public void setAppPanelTip(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(27847);
    if ((this.vmR == null) || (this.vmM == null))
    {
      AppMethodBeat.o(27847);
      return;
    }
    this.vmR.setText(paramCharSequence);
    if (!bo.ac(paramCharSequence))
      if (this.vmM.getVisibility() != 0)
        break label68;
    label68: for (boolean bool = true; ; bool = false)
    {
      setAppPanelTipVisible(bool);
      AppMethodBeat.o(27847);
      break;
    }
  }

  public void setAppPanelTipVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(27848);
    if (this.vmR == null)
      AppMethodBeat.o(27848);
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(this.vmR.getText()))
        break;
      this.vmR.setVisibility(8);
      AppMethodBeat.o(27848);
    }
    if (paramBoolean)
    {
      localObject = this.vmR.getContext();
      this.vmM.getPageMaxRowCount();
      i = com.tencent.mm.bz.a.fromDPToPix((Context)localObject, 32);
      localObject = this.vmR.getLayoutParams();
      if ((localObject != null) && ((localObject instanceof ViewGroup.MarginLayoutParams)))
        ((ViewGroup.MarginLayoutParams)localObject).bottomMargin = i;
    }
    Object localObject = this.vmR;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      ((TextView)localObject).setVisibility(i);
      AppMethodBeat.o(27848);
      break;
    }
  }

  public void setAppPanelVisible(int paramInt)
  {
    AppMethodBeat.i(27887);
    if (this.vmM != null)
      this.vmM.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      setAppPanelTipVisible(bool);
      AppMethodBeat.o(27887);
      return;
    }
  }

  public void setAtSomebody(String paramString)
  {
    this.vna.vod = paramString;
  }

  public void setBottomPanelVisibility(int paramInt)
  {
    AppMethodBeat.i(27890);
    if (paramInt == 0)
    {
      this.vmQ.setVisibility(paramInt);
      AppMethodBeat.o(27890);
    }
    while (true)
    {
      return;
      dkA();
      AppMethodBeat.o(27890);
    }
  }

  public void setCattingRootLayoutId(int paramInt)
  {
    this.vnU = null;
    this.vnT = paramInt;
  }

  public void setDefaultSmileyByDetail(String paramString)
  {
    AppMethodBeat.i(27850);
    if (!bo.isNullOrNil(paramString))
    {
      if (this.eAk == null)
        dke();
      this.eAk.setDefaultEmojiByDetail(paramString);
    }
    AppMethodBeat.o(27850);
  }

  @TargetApi(11)
  public void setEditTextOnDragListener(View.OnDragListener paramOnDragListener)
  {
    AppMethodBeat.i(27894);
    this.oij.setOnDragListener(paramOnDragListener);
    AppMethodBeat.o(27894);
  }

  public void setFooterEventListener(b paramb)
  {
    this.vmY = paramb;
  }

  public void setFooterType(int paramInt)
  {
    AppMethodBeat.i(27832);
    this.ubu = paramInt;
    if (this.eAk != null)
      this.eAk.setFooterType(paramInt);
    AppMethodBeat.o(27832);
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(27856);
    if (this.oij != null)
      this.oij.setHint(paramString);
    AppMethodBeat.o(27856);
  }

  public void setInsertPos(int paramInt)
  {
    this.vna.voe = paramInt;
  }

  public void setLastContent(String paramString)
  {
    this.vna.voc = paramString;
  }

  public void setLastText(String paramString)
  {
    AppMethodBeat.i(27854);
    u(paramString, -1, true);
    AppMethodBeat.o(27854);
  }

  public void setLbsMode(boolean paramBoolean)
  {
    this.vnc = paramBoolean;
  }

  public void setMode(int paramInt)
  {
    AppMethodBeat.i(27867);
    az(paramInt, true);
    AppMethodBeat.o(27867);
  }

  public void setOnEditFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    AppMethodBeat.i(27895);
    this.oij.setOnFocusChangeListener(paramOnFocusChangeListener);
    AppMethodBeat.o(27895);
  }

  public void setOnFooterSwitchListener(ChatFooter.e parame)
  {
    AppMethodBeat.i(27897);
    this.vmZ = parame;
    if (parame == null)
      AppMethodBeat.o(27897);
    while (true)
    {
      return;
      parame = findViewById(2131822409);
      parame.setVisibility(0);
      parame.setOnClickListener(new ChatFooter.19(this));
      AppMethodBeat.o(27897);
    }
  }

  public void setRecordNormalWording(String paramString)
  {
    AppMethodBeat.i(27863);
    if ((paramString == null) || (this.vnd == null))
      AppMethodBeat.o(27863);
    while (true)
    {
      return;
      this.vnd.setText(paramString);
      AppMethodBeat.o(27863);
    }
  }

  public void setSetTolastCustomPage(boolean paramBoolean)
  {
  }

  public void setSmileyPanelCallback(f paramf)
  {
    AppMethodBeat.i(27844);
    this.vhg = paramf;
    if (this.eAk != null)
      this.eAk.setCallback(paramf);
    AppMethodBeat.o(27844);
  }

  public void setSmileyPanelCallback2(j paramj)
  {
    this.vmX.voG = paramj;
  }

  public void setSwitchButtonMode(int paramInt)
  {
    AppMethodBeat.i(27898);
    if (paramInt == this.vnA)
      AppMethodBeat.o(27898);
    while (true)
    {
      return;
      this.vnA = paramInt;
      ImageView localImageView1 = (ImageView)findViewById(2131822410);
      ImageView localImageView2 = (ImageView)findViewById(2131822411);
      if (this.vnA == 1)
      {
        localImageView1.setVisibility(8);
        localImageView2.setVisibility(0);
        AppMethodBeat.o(27898);
      }
      else
      {
        localImageView1.setVisibility(0);
        localImageView2.setVisibility(8);
        AppMethodBeat.o(27898);
      }
    }
  }

  public void setTipsShowCallback(ChatFooter.c paramc)
  {
    this.vnl = paramc;
  }

  @TargetApi(11)
  public void setToSendTextColor(final boolean paramBoolean)
  {
    AppMethodBeat.i(27899);
    if (com.tencent.mm.compatible.util.d.iW(11))
    {
      com.tencent.mm.compatible.a.a.a(11, new a.a()
      {
        public final void run()
        {
          AppMethodBeat.i(27811);
          Message localMessage = new Message();
          localMessage.what = 1002;
          localMessage.obj = Boolean.valueOf(paramBoolean);
          ChatFooter.K(ChatFooter.this).sendMessage(localMessage);
          AppMethodBeat.o(27811);
        }
      });
      AppMethodBeat.o(27899);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.oij.setTextColor(getResources().getColor(2131690748));
        AppMethodBeat.o(27899);
      }
      else
      {
        this.oij.setTextColor(getResources().getColor(2131690155));
        oP(false);
        AppMethodBeat.o(27899);
      }
    }
  }

  public void setUserName(String paramString)
  {
    AppMethodBeat.i(27918);
    this.vmL = paramString;
    if (this.eAk != null)
      this.eAk.setTalkerName(this.vmL);
    boolean bool;
    if (this.vmM != null)
    {
      bool = true;
      ab.i("MicroMsg.ChatFooter", "setusername: %s, %s", new Object[] { paramString, Boolean.valueOf(bool) });
      if (this.vmM != null)
      {
        if ((!t.nI(this.vmL)) && (!t.nB(this.vmL)))
          break label134;
        this.vmM.setServiceShowFlag(0);
      }
    }
    while (true)
    {
      if ((ad.aox(this.vmL)) || (ad.aoy(this.vmL)))
        Lh(-1);
      AppMethodBeat.o(27918);
      return;
      bool = false;
      break;
      label134: if (t.mZ(this.vmL))
        this.vmM.setServiceShowFlag(4);
      else if (t.kH(this.vmL))
        this.vmM.setServiceShowFlag(2);
      else
        this.vmM.setServiceShowFlag(1);
    }
  }

  public void setVoiceInputShowCallback(ChatFooter.d paramd)
  {
    this.vnm = paramd;
  }

  public void setWordCountLimit(int paramInt)
  {
    AppMethodBeat.i(27893);
    this.vmN = ((TextView)this.gbS.findViewById(2131822419));
    this.oij.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
    AppMethodBeat.o(27893);
  }

  public final void showVKB()
  {
    AppMethodBeat.i(27903);
    if ((this.vnp != null) && (this.vnp.isSupportNavigationSwipeBack()) && (this.vnp.getSwipeBackLayout() != null))
      this.vnp.getSwipeBackLayout().setOnceDisEnableGesture(true);
    post(new ChatFooter.23(this));
    AppMethodBeat.o(27903);
  }

  public final void u(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(27905);
    boolean bool2;
    if (paramBoolean)
    {
      if ((r.Zf().booleanValue()) && (this.vnl != null))
      {
        this.vnl.a(Boolean.TRUE, Boolean.FALSE);
        this.vnl.b(Boolean.TRUE, Boolean.FALSE);
      }
      this.vmS.setContentDescription(getContext().getString(2131298025));
      switch (paramInt1)
      {
      default:
        bool2 = false;
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      if (((bool2) && (paramInt2 != 21) && (this.vmT != null)) || ((this.vmT != null) && (!bool2) && ((paramInt2 == 21) || (paramInt2 == 20))))
        oR(false);
      if ((paramInt1 != 0) || (bool2))
        break;
      oR(false);
      AppMethodBeat.o(27905);
      return;
      getInputPanelHelper().az(new ChatFooter.24(this));
      if ((!com.tencent.mm.sdk.platformtools.x.gu(this.context)) || (isInMultiWindowMode()))
        this.vmQ.setVisibility(8);
      oP(true);
      setToSendTextColor(true);
      this.vne.showSoftInput(this.oij, 0);
      bool2 = paramBoolean;
      continue;
      Lh(getKeyBordHeightPX());
      if (paramInt2 == 22)
      {
        if (this.vmM == null)
          dkg();
        this.vmM.djT();
        if (this.eAk != null)
          this.eAk.setVisibility(8);
        ab.i("MicroMsg.ChatFooter", "show app panel");
        setAppPanelVisible(0);
        this.vmW.dkJ();
        oP(false);
        if (this.vnf == 2)
          Lg(1);
        label332: if ((!cth()) || (!com.tencent.mm.compatible.util.j.gu(getContext())) || (isInMultiWindowMode()))
          break label536;
        getInputPanelHelper().aA(new ChatFooter.25(this));
        ab.i("MicroMsg.ChatFooter", "bottom panel will show lately");
      }
      while (true)
      {
        if ((!cth()) || (!com.tencent.mm.compatible.util.j.gu(getContext())))
        {
          ViewGroup.LayoutParams localLayoutParams = this.vmQ.getLayoutParams();
          if ((localLayoutParams != null) && (localLayoutParams.height == 0))
          {
            localLayoutParams.height = com.tencent.mm.compatible.util.j.gs(getContext());
            ab.e("MicroMsg.ChatFooter", "configPannel():bottomPanel height:" + localLayoutParams.height);
            this.vmQ.setLayoutParams(localLayoutParams);
          }
        }
        hideVKB();
        bool2 = paramBoolean;
        break;
        if (paramInt2 != 21)
          break label332;
        if (this.vmM != null)
          setAppPanelVisible(8);
        if (this.eAk == null)
          dke();
        if (this.eAk != null)
          this.eAk.setVisibility(0);
        oR(true);
        oP(true);
        break label332;
        label536: this.vmQ.setVisibility(0);
      }
      this.vmQ.setIsHide(true);
      if (!com.tencent.mm.sdk.platformtools.x.gu(this.context))
        this.vmQ.setVisibility(8);
      oP(true);
      setToSendTextColor(true);
      bool2 = paramBoolean;
      continue;
      this.vmS.setContentDescription(getContext().getString(2131298026));
      switch (paramInt1)
      {
      default:
        bool2 = paramBoolean;
        break;
      case 0:
        hideVKB();
        oP(false);
        bool2 = paramBoolean;
        if (!this.vjb)
        {
          dkB();
          bool2 = paramBoolean;
        }
        break;
      case 1:
        hideVKB();
        bool2 = paramBoolean;
        break;
      case 2:
        if (paramInt2 == 20)
        {
          if (this.vjb)
          {
            hideVKB();
            bool2 = paramBoolean;
          }
          else
          {
            dkB();
            bool2 = paramBoolean;
          }
        }
        else if (paramInt2 == 22)
        {
          setAppPanelVisible(8);
          bool2 = paramBoolean;
        }
        else if (paramInt2 == 21)
        {
          bool2 = paramBoolean;
          if (this.eAk != null)
          {
            this.eAk.setVisibility(8);
            bool2 = paramBoolean;
          }
        }
        else
        {
          bool2 = paramBoolean;
          if (paramInt2 == 23)
          {
            djq();
            dkB();
            bool2 = paramBoolean;
          }
        }
        break;
      }
    }
    if ((bool2) && (paramInt2 != 22))
      if (this.oij.length() <= 0)
        break label827;
    label827: for (paramBoolean = bool1; ; paramBoolean = false)
    {
      iP(paramBoolean);
      AppMethodBeat.o(27905);
      break;
    }
  }

  public final void u(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(27855);
    if ((paramBoolean) && ((paramString == null) || (paramString.length() == 0) || (this.oij == null)))
    {
      this.oij.setText("");
      dka();
      AppMethodBeat.o(27855);
    }
    while (true)
    {
      return;
      this.vnb = true;
      this.oij.setText(com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), paramString, this.oij.getTextSize()));
      this.vnb = false;
      if ((paramInt < 0) || (paramInt > this.oij.getText().length()))
      {
        this.oij.setSelection(this.oij.getText().length());
        AppMethodBeat.o(27855);
      }
      else
      {
        this.oij.setSelection(paramInt);
        AppMethodBeat.o(27855);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter
 * JD-Core Version:    0.6.2
 */
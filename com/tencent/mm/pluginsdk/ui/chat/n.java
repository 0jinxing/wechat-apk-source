package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uc;
import com.tencent.mm.g.b.a.az;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoiceaddr.b.b;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.a;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.b;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl;
import com.tencent.mm.pluginsdk.ui.VoiceInputScrollView;
import com.tencent.mm.pluginsdk.ui.l;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;
import java.util.ArrayList;
import java.util.List;

public final class n extends LinearLayout
{
  private String cqz;
  private Context mContext;
  private Toast mMP;
  private boolean mMX;
  private TelephonyManager nva;
  private Button oik;
  private VoiceInputLayout.a vjs;
  private MMEditText vjx;
  private com.tencent.mm.ui.widget.a.c vmV;
  private int vmi;
  private VoiceInputLayout voR;
  private ImageButton voS;
  private Button voT;
  private TextView voU;
  private a voV;
  private MMEditText voW;
  private VoiceInputScrollView voX;
  private TextView voY;
  private long voZ;
  private VoiceInputLayout.b vpA;
  private boolean vpB;
  private boolean vpa;
  private float vpb;
  private float vpc;
  private boolean vpd;
  private boolean vpe;
  private boolean vpf;
  private int vpg;
  private final String vph;
  private boolean vpi;
  private boolean vpj;
  private long vpk;
  private long vpl;
  private long vpm;
  private boolean vpn;
  private boolean vpo;
  private final int vpp;
  private boolean vpq;
  private String vpr;
  private List<String> vps;
  private l vpt;
  private com.tencent.mm.sdk.b.c<uc> vpu;
  private b vpv;
  private int vpw;
  private ArrayList<String> vpx;
  private ArrayList<Integer> vpy;
  n.b vpz;

  public n(Context paramContext, boolean paramBoolean, MMEditText paramMMEditText)
  {
    super(paramContext);
    AppMethodBeat.i(27985);
    this.voW = null;
    this.voZ = 0L;
    this.vpa = false;
    this.vpb = 0.0F;
    this.vpc = 0.0F;
    this.vpd = false;
    this.vpe = false;
    this.mMX = false;
    this.vpf = false;
    this.vpg = 300;
    this.vph = "voiceinput_downdistance_content";
    this.vpi = false;
    this.vpj = false;
    this.vpk = 0L;
    this.vpl = 0L;
    this.vpm = 0L;
    this.vpn = false;
    this.vpo = false;
    this.vpp = 2;
    this.vpq = false;
    this.vpr = "";
    this.vps = new ArrayList();
    this.cqz = "";
    this.vpw = 0;
    this.vpx = new ArrayList();
    this.vpy = new ArrayList();
    this.vjs = new n.11(this);
    this.vpA = new n.3(this);
    this.vmi = com.tencent.mm.bz.a.fromDPToPix(getContext(), 395);
    this.vpB = true;
    this.mContext = paramContext;
    this.vpa = paramBoolean;
    this.voW = paramMMEditText;
    init();
    this.vpt = new l(this.mContext);
    long l = System.nanoTime();
    this.cqz = ("MicroMsg.VoiceInputPanel" + String.valueOf(l));
    ab.i("MicroMsg.VoiceInputPanel", "mToUser %s", new Object[] { this.cqz });
    dkM();
    int i = com.tencent.mm.m.g.Nu().getInt("VoiceInputLanguageSupportType", com.tencent.mm.modelvoiceaddr.g.gbc);
    if (aa.don())
    {
      this.vpx.add(getContext().getString(2131304287));
      this.vpy.add(Integer.valueOf(com.tencent.mm.modelvoiceaddr.g.gbc));
      if ((com.tencent.mm.modelvoiceaddr.g.gbd & i) != 0)
      {
        this.vpx.add(getContext().getString(2131304286));
        this.vpy.add(Integer.valueOf(com.tencent.mm.modelvoiceaddr.g.gbd));
      }
      if ((i & com.tencent.mm.modelvoiceaddr.g.gbe) != 0)
      {
        this.vpx.add(getContext().getString(2131304288));
        this.vpy.add(Integer.valueOf(com.tencent.mm.modelvoiceaddr.g.gbe));
      }
    }
    while (true)
    {
      this.vpw = 0;
      this.voU.setText((CharSequence)this.vpx.get(this.vpw));
      this.voR.setLangType(((Integer)this.vpy.get(this.vpw)).intValue());
      if (this.vpy.size() < 2)
        this.voU.setVisibility(8);
      AppMethodBeat.o(27985);
      return;
      if (aa.dor().equals("en"))
      {
        this.vpx.add(getContext().getString(2131304288));
        this.vpy.add(Integer.valueOf(com.tencent.mm.modelvoiceaddr.g.gbe));
        this.vpx.add(getContext().getString(2131304287));
        this.vpy.add(Integer.valueOf(com.tencent.mm.modelvoiceaddr.g.gbc));
        if ((i & com.tencent.mm.modelvoiceaddr.g.gbd) != 0)
        {
          this.vpx.add(getContext().getString(2131304286));
          this.vpy.add(Integer.valueOf(com.tencent.mm.modelvoiceaddr.g.gbd));
        }
      }
    }
  }

  private static void KY()
  {
    AppMethodBeat.i(27997);
    ab.i("MicroMsg.VoiceInputPanel", "resumeMusic");
    aw.ZL().KY();
    AppMethodBeat.o(27997);
  }

  private static void Lj(int paramInt)
  {
    AppMethodBeat.i(27999);
    ab.i("MicroMsg.VoiceInputPanel", "idkReport type = %s", new Object[] { Integer.valueOf(paramInt) });
    h.pYm.a(455L, paramInt, 1L, false);
    AppMethodBeat.o(27999);
  }

  private static void a(VoiceInputBehavior paramVoiceInputBehavior)
  {
    AppMethodBeat.i(27998);
    ab.i("MicroMsg.VoiceInputPanel", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(paramVoiceInputBehavior.cancel), Integer.valueOf(paramVoiceInputBehavior.send), Integer.valueOf(paramVoiceInputBehavior.click), Integer.valueOf(paramVoiceInputBehavior.longClick), Long.valueOf(paramVoiceInputBehavior.longClickTime), Integer.valueOf(paramVoiceInputBehavior.textClick), Integer.valueOf(paramVoiceInputBehavior.textChangeCount), Long.valueOf(paramVoiceInputBehavior.textChangeTime), Integer.valueOf(paramVoiceInputBehavior.textChangeReturn), Long.valueOf(paramVoiceInputBehavior.voiceInputTime), Integer.valueOf(paramVoiceInputBehavior.fail), Integer.valueOf(paramVoiceInputBehavior.clear), Integer.valueOf(paramVoiceInputBehavior.smileIconClick), Integer.valueOf(paramVoiceInputBehavior.voiceIconClick), Integer.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClickTime) });
    log_13905 locallog_13905 = new log_13905();
    locallog_13905.viOp_ = paramVoiceInputBehavior;
    h.pYm.c(13905, locallog_13905);
    AppMethodBeat.o(27998);
  }

  private void dkN()
  {
    AppMethodBeat.i(27992);
    ab.d("MicroMsg.VoiceInputPanel", "closePanel");
    VoiceInputBehavior localVoiceInputBehavior;
    if (this.voV != null)
    {
      this.vpn = true;
      ab.i("MicroMsg.VoiceInputPanel", "closePanel onClearBtnDown");
      localVoiceInputBehavior = new VoiceInputBehavior();
      if ((this.vjx == null) || (this.vjx.getText() == null) || (this.vjx.getText().length() <= 0))
        break label141;
      if (!this.vpn)
        break label132;
      localVoiceInputBehavior.cancel = 14;
    }
    while (true)
    {
      if (this.voZ != 0L)
      {
        localVoiceInputBehavior.voiceInputTime = bo.az(this.voZ);
        this.voZ = 0L;
      }
      a(localVoiceInputBehavior);
      this.voV.djr();
      AppMethodBeat.o(27992);
      return;
      label132: localVoiceInputBehavior.cancel = 16;
      continue;
      label141: if (this.vpn)
        localVoiceInputBehavior.cancel = 2;
      else
        localVoiceInputBehavior.cancel = 15;
    }
  }

  private void dkO()
  {
    AppMethodBeat.i(27996);
    ab.d("MicroMsg.VoiceInputPanel", "setTextHintAndColor");
    if ((this.vjx != null) && (this.vjx.getText() != null) && (this.vjx.getText().length() == 0))
    {
      this.vjx.setSelection(0);
      this.vjx.setCursorVisible(false);
      this.oik.setVisibility(4);
      if (!this.vpa)
        this.voS.setVisibility(0);
      this.voT.setVisibility(8);
      this.voY.setVisibility(0);
      if (this.vpa)
      {
        if ((this.voW == null) || (this.voW.getText() == null) || (this.voW.getText().length() != 0))
          break label289;
        this.oik.setVisibility(4);
      }
    }
    while (true)
    {
      if (this.vjx != null)
        this.vjx.clearFocus();
      KY();
      if (!this.vpj)
      {
        this.vpj = true;
        this.vpm = System.currentTimeMillis();
        ab.d("VOICEDEBUG", "Last Text Time = %s Corss Time = %s", new Object[] { Long.valueOf(this.vpm), Long.valueOf(this.vpm - this.vpl) });
      }
      AppMethodBeat.o(27996);
      return;
      if (this.vjx != null)
        this.vjx.setCursorVisible(true);
      this.oik.setVisibility(0);
      if (!this.vpa)
      {
        this.voS.setVisibility(8);
        this.voT.setVisibility(0);
      }
      this.voY.setVisibility(8);
      break;
      label289: this.oik.setVisibility(0);
    }
  }

  @TargetApi(16)
  private void init()
  {
    AppMethodBeat.i(27986);
    ab.d("MicroMsg.VoiceInputPanel", "init");
    View.inflate(getContext(), 2130971011, this);
    this.voS = ((ImageButton)findViewById(2131828450));
    this.voT = ((Button)findViewById(2131828451));
    this.voU = ((TextView)findViewById(2131828447));
    this.oik = ((Button)findViewById(2131828453));
    this.voY = ((TextView)findViewById(2131828448));
    if (this.vpa)
    {
      this.voS.setVisibility(4);
      this.oik.setVisibility(4);
      this.voT.setVisibility(8);
      if ((!this.vpa) || (this.voW == null))
        break label331;
      this.vjx = this.voW;
    }
    while (true)
    {
      this.voX = ((VoiceInputScrollView)findViewById(2131828443));
      this.voS.setOnClickListener(new n.5(this));
      this.oik.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(27977);
          n.a(n.this, 2);
          AppMethodBeat.o(27977);
        }
      });
      this.voT.setOnClickListener(new n.7(this));
      this.voU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(27980);
          paramAnonymousView = new e.a(n.this.getContext());
          n.8.1 local1 = new n.8.1(this, paramAnonymousView);
          e.a locala = paramAnonymousView.al(n.this.getContext().getString(2131304285));
          ArrayList localArrayList = n.e(n.this);
          int i = n.d(n.this);
          View localView = View.inflate(locala.mContext, 2130969293, null);
          locala.zQN = ((RadioGroup)localView.findViewById(2131823310));
          if (localArrayList != null);
          for (int j = localArrayList.size(); ; j = 0)
          {
            for (int k = 0; k < j; k++)
            {
              RadioButton localRadioButton = (RadioButton)View.inflate(locala.mContext, 2130969292, null);
              localRadioButton.setId(k);
              if (k == i)
                localRadioButton.setChecked(true);
              localRadioButton.setText((CharSequence)localArrayList.get(k));
              locala.zQN.addView(localRadioButton);
            }
            locala.zQN.setOnCheckedChangeListener(local1);
            locala.vkm.fn(localView);
            locala.re(true);
            paramAnonymousView.a(new n.8.2(this));
            paramAnonymousView.show();
            n.this.Lk(3);
            AppMethodBeat.o(27980);
            return;
          }
        }
      });
      if (((this.vjx.getText() != null) && (this.vjx.getText().length() > 0)) || ((this.vjx.getHint() != null) && (this.vjx.getHint().length() > 0)))
        this.voU.setVisibility(8);
      this.vjx.addTextChangedListener(new n.9(this));
      this.voX.setOnTouchListener(new n.10(this));
      AppMethodBeat.o(27986);
      return;
      this.voS.setVisibility(0);
      break;
      label331: this.vjx = ((MMEditText)findViewById(2131828445));
      this.vjx.setHintTextColor(getResources().getColor(2131690312));
      this.vjx.setClickable(true);
      this.vjx.setOnLongClickListener(new n.1(this));
      this.vjx.setOnTouchListener(new n.4(this));
    }
  }

  public final void Lk(int paramInt)
  {
    AppMethodBeat.i(28000);
    ab.i("MicroMsg.VoiceInputPanel", "action:%d, applang:%s, voiceLang:%s", new Object[] { Integer.valueOf(paramInt), aa.dor(), ((Integer)this.vpy.get(this.vpw)).toString() });
    az localaz = new az();
    localaz.daO = paramInt;
    localaz.fR(aa.dor()).fS(((Integer)this.vpy.get(this.vpw)).toString()).ajK();
    AppMethodBeat.o(28000);
  }

  public final void destroy()
  {
    AppMethodBeat.i(27991);
    ab.i("MicroMsg.VoiceInputPanel", "destroy");
    reset();
    if (this.vpu != null)
    {
      com.tencent.mm.sdk.b.a.xxA.d(this.vpu);
      this.vpu = null;
    }
    if (this.voR != null)
    {
      this.voR.setVoiceDetectListener(null);
      this.voR = null;
    }
    if (this.vpv != null)
      this.vpv = null;
    if ((this.nva != null) && (this.vpz != null))
    {
      this.nva.listen(this.vpz, 0);
      this.vpz.voR = null;
      this.vpz = null;
    }
    this.nva = null;
    this.voW = null;
    if (!this.cqz.startsWith("MicroMsg.VoiceInputPanel"))
      this.vpt.ea(this.cqz, ((Integer)this.vpy.get(this.vpw)).intValue());
    VoiceInputLayoutImpl localVoiceInputLayoutImpl = (VoiceInputLayoutImpl)findViewById(2131828452);
    if (localVoiceInputLayoutImpl != null)
    {
      ab.i("MicroMsg.VoiceInputPanel", "voiceInputLayout do stop!");
      localVoiceInputLayoutImpl.bBP();
      localVoiceInputLayoutImpl.djt();
    }
    AppMethodBeat.o(27991);
  }

  public final void djT()
  {
    AppMethodBeat.i(27994);
    ab.d("MicroMsg.VoiceInputPanel", "refreshHeight DISPLAY_HEIGHT_PORT_IN_PX %s,needRefreshProtHeight %s", new Object[] { Integer.valueOf(this.vmi), Boolean.valueOf(this.vpB) });
    if (this.vpB)
    {
      this.vpB = false;
      View localView = findViewById(2131828442);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      int i = this.vmi;
      Object localObject = localLayoutParams;
      if (localLayoutParams == null)
        localObject = new LinearLayout.LayoutParams(-1, i);
      ((ViewGroup.LayoutParams)localObject).height = i;
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      init();
      dkO();
      requestLayout();
    }
    AppMethodBeat.o(27994);
  }

  public final void dkM()
  {
    AppMethodBeat.i(27987);
    this.voZ = bo.yz();
    if (this.vpu == null)
    {
      ab.i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
      this.vpu = new n.2(this);
      com.tencent.mm.sdk.b.a.xxA.c(this.vpu);
    }
    if (this.voR == null)
    {
      this.voR = ((VoiceInputLayout)findViewById(2131828452));
      this.voR.setVoiceDetectListener(this.vpA);
      this.voR.setLongClickLisnter(this.vjs);
      this.voR.setFromFullScreen(this.vpa);
    }
    this.voY.setVisibility(0);
    if (this.vpv == null)
      this.vpv = new b();
    SharedPreferences localSharedPreferences = ah.doB();
    if (localSharedPreferences != null)
    {
      String str = localSharedPreferences.getString("voiceinput_downdistance_content", "");
      if (!str.equalsIgnoreCase(""))
      {
        ab.d("MicroMsg.VoiceInputPanel", "init memoryContent length=%s", new Object[] { Integer.valueOf(str.length()) });
        this.vpt.b(this.vjx);
        this.vpt.a(this.vjx, str, false);
        this.vpt.a(this.vjx);
        this.vpt.b(this.vjx);
        dkO();
        this.voX.fullScroll(130);
        localSharedPreferences.edit().remove("voiceinput_downdistance_content").apply();
      }
    }
    this.nva = ((TelephonyManager)ah.getContext().getSystemService("phone"));
    if (this.nva != null)
    {
      if (this.vpz == null)
        this.vpz = new n.b(this.voR);
      this.nva.listen(this.vpz, 32);
    }
    AppMethodBeat.o(27987);
  }

  public final void pause()
  {
    AppMethodBeat.i(27989);
    ab.i("MicroMsg.VoiceInputPanel", "pause");
    if (this.voR != null)
      this.voR.amA();
    this.vpb = 0.0F;
    this.vpc = 0.0F;
    this.vpd = false;
    this.vpe = false;
    this.mMX = false;
    this.vpf = false;
    this.vpn = false;
    this.vpB = true;
    AppMethodBeat.o(27989);
  }

  public final void reset()
  {
    AppMethodBeat.i(27990);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
    pause();
    this.vpo = false;
    this.vps.clear();
    if (this.vjx != null)
    {
      if (this.vpt != null)
      {
        this.vpt.b(this.vjx);
        this.vpt.a(this.vjx, "", false);
        this.vpt.a(this.vjx);
        this.vpt.b(this.vjx);
      }
      dkO();
    }
    AppMethodBeat.o(27990);
  }

  public final void setCallback(a parama)
  {
    this.voV = parama;
  }

  public final void setFullScreenData(String paramString)
  {
    AppMethodBeat.i(27988);
    if (paramString != null)
      this.vpr = paramString;
    dkO();
    AppMethodBeat.o(27988);
  }

  public final void setPortHeightPX(int paramInt)
  {
    AppMethodBeat.i(27993);
    ab.d("MicroMsg.VoiceInputPanel", "setPortHeightPX DISPLAY_HEIGHT_PORT_IN_PX %s,value %s", new Object[] { Integer.valueOf(this.vmi), Integer.valueOf(paramInt) });
    if (this.vmi != paramInt)
    {
      this.vmi = paramInt;
      this.vpB = true;
    }
    AppMethodBeat.o(27993);
  }

  public final void setToUser(String paramString)
  {
    AppMethodBeat.i(27995);
    int j;
    if (!bo.isNullOrNil(paramString))
    {
      this.cqz = paramString;
      this.vpw = 0;
      int i = this.vpt.aju(paramString);
      j = 0;
      if (j < this.vpy.size())
        if (i == ((Integer)this.vpy.get(j)).intValue())
        {
          this.vpw = j;
          this.voU.setText((CharSequence)this.vpx.get(this.vpw));
          this.voR.setLangType(((Integer)this.vpy.get(this.vpw)).intValue());
          if (this.vpy.size() >= 2)
            break label146;
          this.voU.setVisibility(8);
          AppMethodBeat.o(27995);
        }
    }
    while (true)
    {
      return;
      j++;
      break;
      label146: AppMethodBeat.o(27995);
      continue;
      ab.e("MicroMsg.VoiceInputPanel", "setToUser toUser is isNullOrNil");
      AppMethodBeat.o(27995);
    }
  }

  public static abstract interface a
  {
    public abstract void ajt(String paramString);

    public abstract void djr();

    public abstract void oz(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.n
 * JD-Core Version:    0.6.2
 */
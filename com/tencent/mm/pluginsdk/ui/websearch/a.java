package com.tencent.mm.pluginsdk.ui.websearch;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uc;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.a;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.b;
import com.tencent.mm.pluginsdk.ui.VoiceInputScrollView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public final class a extends LinearLayout
{
  private String cqz;
  AudioManager eoY;
  private Context mContext;
  private Toast mMP;
  private boolean mMX;
  private TelephonyManager nva;
  PhoneStateListener nvb;
  private Button oik;
  private VoiceInputLayout.a vjs;
  private MMEditText vjx;
  public int vmi;
  private VoiceInputLayout voR;
  private ImageButton voS;
  private Button voT;
  private VoiceInputScrollView voX;
  private TextView voY;
  private long voZ;
  private VoiceInputLayout.b vpA;
  public boolean vpB;
  private float vpb;
  private float vpc;
  private boolean vpd;
  private boolean vpe;
  private boolean vpf;
  private int vpg;
  private boolean vpi;
  private boolean vpj;
  private long vpk;
  private long vpl;
  private long vpm;
  private boolean vpn;
  private boolean vpo;
  private final int vpp;
  private boolean vpq;
  private List<String> vps;
  private c<uc> vpu;
  private a.a vwc;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(28251);
    this.voZ = 0L;
    this.vpb = 0.0F;
    this.vpc = 0.0F;
    this.vpd = false;
    this.vpe = false;
    this.mMX = false;
    this.vpf = false;
    this.vpg = 300;
    this.vpi = false;
    this.vpj = false;
    this.vpk = 0L;
    this.vpl = 0L;
    this.vpm = 0L;
    this.vpn = false;
    this.vpo = false;
    this.vpp = 2;
    this.vpq = false;
    this.vps = new ArrayList();
    this.cqz = "";
    this.vjs = new VoiceInputLayout.a()
    {
      public final void bBI()
      {
        AppMethodBeat.i(28240);
        a.a(a.this, 2131304291);
        AppMethodBeat.o(28240);
      }
    };
    this.nvb = new a.4(this);
    this.vpA = new a.5(this);
    this.vmi = com.tencent.mm.bz.a.fromDPToPix(getContext(), 280);
    this.vpB = true;
    this.mContext = paramContext;
    ab.d("MicroMsg.VoiceInputPanel", "init");
    View.inflate(getContext(), 2130971204, this);
    this.voS = ((ImageButton)findViewById(2131828450));
    this.voT = ((Button)findViewById(2131828451));
    this.oik = ((Button)findViewById(2131828453));
    this.voY = ((TextView)findViewById(2131828448));
    this.voS.setVisibility(0);
    this.oik.setVisibility(4);
    this.voT.setVisibility(8);
    this.vjx = ((MMEditText)findViewById(2131828445));
    this.vjx.setHintTextColor(getResources().getColor(2131690312));
    this.vjx.setClickable(false);
    this.voX = ((VoiceInputScrollView)findViewById(2131828443));
    this.voS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(28239);
        a.a(a.this);
        AppMethodBeat.o(28239);
      }
    });
    this.vjx.clearFocus();
    this.vjx.setFocusable(false);
    this.vjx.setClickable(false);
    this.vjx.setLongClickable(false);
    this.eoY = ((AudioManager)getContext().getSystemService("audio"));
    this.cqz = String.valueOf(System.nanoTime());
    ab.i("MicroMsg.VoiceInputPanel", "mToUser %s", new Object[] { this.cqz });
    dkM();
    AppMethodBeat.o(28251);
  }

  private void KY()
  {
    AppMethodBeat.i(28258);
    if (this.eoY != null)
      this.eoY.setStreamMute(3, false);
    AppMethodBeat.o(28258);
  }

  public final void destroy()
  {
    AppMethodBeat.i(28255);
    ab.i("MicroMsg.VoiceInputPanel", "destroy");
    reset();
    if (this.vpu != null)
    {
      com.tencent.mm.sdk.b.a.xxA.d(this.vpu);
      this.vpu = null;
    }
    if (this.voR != null)
    {
      this.voR.amA();
      this.voR.setVoiceDetectListener(null);
      this.voR.bBP();
      this.voR.djt();
      this.voR = null;
    }
    if ((this.nva != null) && (this.nvb != null))
    {
      this.nva.listen(this.nvb, 0);
      this.nvb = null;
    }
    this.nva = null;
    AppMethodBeat.o(28255);
  }

  public final void dkM()
  {
    AppMethodBeat.i(28252);
    this.voZ = bo.yz();
    if (this.vpu == null)
    {
      ab.i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
      this.vpu = new a.3(this);
      com.tencent.mm.sdk.b.a.xxA.c(this.vpu);
    }
    if (this.voR == null)
    {
      this.voR = ((VoiceInputLayout)findViewById(2131828452));
      this.voR.setVoiceDetectListener(this.vpA);
      this.voR.setLongClickLisnter(this.vjs);
    }
    this.voY.setVisibility(0);
    this.nva = ((TelephonyManager)ah.getContext().getSystemService("phone"));
    this.nva.listen(this.nvb, 32);
    AppMethodBeat.o(28252);
  }

  public final void dkO()
  {
    AppMethodBeat.i(28257);
    ab.d("MicroMsg.VoiceInputPanel", "setTextHintAndColor");
    if ((this.vjx != null) && (this.vjx.getText() != null) && (this.vjx.getText().length() == 0))
    {
      this.oik.setVisibility(4);
      this.voS.setVisibility(0);
      this.voT.setVisibility(8);
      this.voY.setVisibility(0);
    }
    while (true)
    {
      KY();
      if (!this.vpj)
      {
        this.vpj = true;
        this.vpm = System.currentTimeMillis();
        ab.d("VOICEDEBUG", "Last Text Time = %s Corss Time = %s", new Object[] { Long.valueOf(this.vpm), Long.valueOf(this.vpm - this.vpl) });
      }
      AppMethodBeat.o(28257);
      return;
      this.voS.setVisibility(4);
      this.voY.setVisibility(8);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(28253);
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
    AppMethodBeat.o(28253);
  }

  public final void reset()
  {
    AppMethodBeat.i(28254);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
    pause();
    this.vpo = false;
    this.vps.clear();
    if (this.vjx != null)
    {
      this.vjx.setText("");
      dkO();
    }
    AppMethodBeat.o(28254);
  }

  public final void setCallback(a.a parama)
  {
    this.vwc = parama;
  }

  public final void setToUser(String paramString)
  {
    AppMethodBeat.i(28256);
    if (!bo.isNullOrNil(paramString))
    {
      this.cqz = paramString;
      AppMethodBeat.o(28256);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.VoiceInputPanel", "setToUser toUser is isNullOrNil");
      AppMethodBeat.o(28256);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.websearch.a
 * JD-Core Version:    0.6.2
 */
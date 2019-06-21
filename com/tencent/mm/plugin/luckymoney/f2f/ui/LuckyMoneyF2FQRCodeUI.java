package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.plugin.luckymoney.f2f.a.1;
import com.tencent.mm.plugin.luckymoney.f2f.a.2;
import com.tencent.mm.plugin.luckymoney.f2f.a.e;
import com.tencent.mm.plugin.luckymoney.model.af;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.w;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.bc.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.HorizontalListViewV2;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class LuckyMoneyF2FQRCodeUI extends LuckyMoneyBaseUI
  implements bc.a
{
  private View abB;
  private SensorManager bCW;
  private int[] gCr;
  private ap gGo;
  private DisplayMetrics ghw;
  private String hwA;
  private d iHZ;
  private n.d kFW;
  private String lvz;
  private Bitmap mBitmap;
  private String nSX;
  private Button nTg;
  private View nUE;
  private View nUF;
  private ImageView nUG;
  private TextView nUH;
  private TextView nUI;
  private ImageView nUJ;
  private TextView nUK;
  private TextView nUL;
  private HorizontalListViewV2 nUM;
  private List<String> nUN;
  private Map<String, String> nUO;
  private Queue<Pair<String, Integer>> nUP;
  private a nUQ;
  private TextView nUR;
  private ShuffleView nUS;
  private ShuffleView.c nUT;
  private List<View> nUU;
  private ViewGroup nUV;
  private ViewGroup nUW;
  private View nUX;
  private com.tencent.mm.plugin.luckymoney.f2f.a nUY;
  private long nUZ;
  private String nUs;
  private int nUt;
  private String nVa;
  private ValueAnimator nVb;
  private float nVc;
  private float nVd;
  private float nVe;
  private bz.a nVf;
  private n.c nVg;
  private Bitmap nVh;
  private Bitmap nVi;
  private Bitmap nVj;
  private Bitmap nVk;
  private Bitmap nVl;
  private Bitmap nVm;
  private Bitmap nVn;
  private Bitmap nVo;
  private Bitmap nVp;
  private Bitmap nVq;
  private Bitmap nVr;
  private Bitmap nVs;
  private com.tencent.mm.plugin.luckymoney.particles.b nVt;
  private com.tencent.mm.plugin.luckymoney.particles.b nVu;
  final SensorEventListener nVv;
  private int retCode;

  public LuckyMoneyF2FQRCodeUI()
  {
    AppMethodBeat.i(42194);
    this.nVf = new LuckyMoneyF2FQRCodeUI.1(this);
    this.nVg = new LuckyMoneyF2FQRCodeUI.8(this);
    this.kFW = new LuckyMoneyF2FQRCodeUI.9(this);
    this.nVt = new com.tencent.mm.plugin.luckymoney.particles.b()
    {
      public final com.tencent.mm.plugin.luckymoney.particles.a.b b(Random paramAnonymousRandom)
      {
        AppMethodBeat.i(42184);
        int i = paramAnonymousRandom.nextInt(100);
        if (i < 16)
        {
          if (LuckyMoneyF2FQRCodeUI.i(LuckyMoneyF2FQRCodeUI.this) == null)
            LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839280, 36));
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.i(LuckyMoneyF2FQRCodeUI.this));
          AppMethodBeat.o(42184);
        }
        while (true)
        {
          return paramAnonymousRandom;
          if (i < 33)
          {
            if (LuckyMoneyF2FQRCodeUI.j(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.b(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839281, 36));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.j(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42184);
          }
          else if (i < 50)
          {
            if (LuckyMoneyF2FQRCodeUI.k(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.c(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839282, 36));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.k(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42184);
          }
          else if (i < 70)
          {
            if (LuckyMoneyF2FQRCodeUI.l(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.d(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839275, 36));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.l(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42184);
          }
          else if (i < 90)
          {
            if (LuckyMoneyF2FQRCodeUI.m(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.e(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839276, 36));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.m(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42184);
          }
          else
          {
            if (LuckyMoneyF2FQRCodeUI.n(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.f(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839277, 36));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.n(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42184);
          }
        }
      }
    };
    this.nVu = new com.tencent.mm.plugin.luckymoney.particles.b()
    {
      public final com.tencent.mm.plugin.luckymoney.particles.a.b b(Random paramAnonymousRandom)
      {
        AppMethodBeat.i(42185);
        int i = paramAnonymousRandom.nextInt(100);
        if (i < 10)
        {
          if (LuckyMoneyF2FQRCodeUI.o(LuckyMoneyF2FQRCodeUI.this) == null)
            LuckyMoneyF2FQRCodeUI.g(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839280, 32));
          paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.o(LuckyMoneyF2FQRCodeUI.this));
          AppMethodBeat.o(42185);
        }
        while (true)
        {
          return paramAnonymousRandom;
          if (i < 20)
          {
            if (LuckyMoneyF2FQRCodeUI.p(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.h(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839281, 32));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.p(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42185);
          }
          else if (i < 30)
          {
            if (LuckyMoneyF2FQRCodeUI.q(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.i(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839282, 32));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.q(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42185);
          }
          else if (i < 50)
          {
            if (LuckyMoneyF2FQRCodeUI.r(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.j(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839275, 32));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.r(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42185);
          }
          else if (i < 75)
          {
            if (LuckyMoneyF2FQRCodeUI.s(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.k(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839276, 32));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.s(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42185);
          }
          else
          {
            if (LuckyMoneyF2FQRCodeUI.t(LuckyMoneyF2FQRCodeUI.this) == null)
              LuckyMoneyF2FQRCodeUI.l(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this, 2130839277, 32));
            paramAnonymousRandom = new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyF2FQRCodeUI.t(LuckyMoneyF2FQRCodeUI.this));
            AppMethodBeat.o(42185);
          }
        }
      }
    };
    this.nVv = new LuckyMoneyF2FQRCodeUI.7(this);
    AppMethodBeat.o(42194);
  }

  private void bLh()
  {
    AppMethodBeat.i(42196);
    if (!bo.isNullOrNil(this.lvz))
    {
      this.mBitmap = com.tencent.mm.bw.a.a.bF(this, this.lvz);
      this.nUJ.setImageBitmap(this.mBitmap);
    }
    if (this.nUt <= 0)
    {
      this.nUJ.setPadding(com.tencent.mm.bz.a.fromDPToPix(this, 5), com.tencent.mm.bz.a.fromDPToPix(this, 5), com.tencent.mm.bz.a.fromDPToPix(this, 5), com.tencent.mm.bz.a.fromDPToPix(this, 5));
      this.nUJ.setImageResource(2130839274);
      this.nUR.setVisibility(8);
      this.nTg.setVisibility(0);
      this.nUK.setVisibility(4);
      this.nUE.setPadding(this.nUE.getPaddingLeft(), f.de(this), this.nUE.getPaddingRight(), this.nUE.getPaddingBottom());
      if (this.nUN.size() > 0)
      {
        this.nUL.setText(getString(2131301103));
        AppMethodBeat.o(42196);
      }
    }
    while (true)
    {
      return;
      this.nUL.setText(getString(2131301104));
      AppMethodBeat.o(42196);
      continue;
      this.nUJ.setPadding(0, 0, 0, 0);
      this.nUK.setText(getString(2131301109));
      this.nUK.setVisibility(0);
      this.nUL.setText(getString(2131301109));
      this.nUR.setText(getString(2131301108, new Object[] { Integer.valueOf(this.nUt) }));
      this.nUR.setVisibility(0);
      this.nTg.setVisibility(8);
      AppMethodBeat.o(42196);
    }
  }

  private void bLi()
  {
    AppMethodBeat.i(42197);
    HashSet localHashSet = new HashSet();
    localHashSet.add("touch_card.m4a");
    localHashSet.add("select_card.m4a");
    for (int i = 1; i <= 8; i++)
      localHashSet.add("music" + i + ".m4a");
    localHashSet.add("packet_received.m4a");
    localHashSet.add("most_lucky.m4a");
    localHashSet.add("whistle.m4a");
    com.tencent.mm.plugin.luckymoney.f2f.a locala = this.nUY;
    WeakReference localWeakReference = new WeakReference(this);
    g.RS().aa(new a.1(locala, localHashSet, localWeakReference));
    locala.nTR.setOnLoadCompleteListener(new a.2(locala));
    AppMethodBeat.o(42197);
  }

  private void bLj()
  {
    AppMethodBeat.i(42198);
    int i = this.nUM.getWidth() - this.nUN.size() * getResources().getDimensionPixelSize(2131427501);
    if (i > 0)
    {
      this.nUM.setPadding(i / 2, 0, i / 2, 0);
      AppMethodBeat.o(42198);
    }
    while (true)
    {
      return;
      this.nUM.setPadding(0, 0, 0, 0);
      AppMethodBeat.o(42198);
    }
  }

  private void bLk()
  {
    AppMethodBeat.i(42199);
    if (this.nUU.size() != this.nUt)
    {
      ab.i("LuckyMoneyF2FQRCodeUI", "shuffle cards: %d", new Object[] { Integer.valueOf(this.nUU.size()), Integer.valueOf(this.nUt) });
      this.nUU.clear();
      for (int i = 0; i < this.nUt; i++)
      {
        View localView = LayoutInflater.from(this).inflate(2130969979, this.nUS, false);
        ((FrameLayout.LayoutParams)localView.getLayoutParams()).gravity = 81;
        this.nUU.add(localView);
      }
      this.nUS.setAllShuffleCards(this.nUU);
    }
    AppMethodBeat.o(42199);
  }

  public final void aNW()
  {
    AppMethodBeat.i(42205);
    ab.i("LuckyMoneyF2FQRCodeUI", "screenShot");
    if (this.nUt > 0)
    {
      Object localObject = this.lvz;
      ab.i("LuckyMoneyF2FQRCodeUI", "invalidQRCode");
      b(new com.tencent.mm.plugin.luckymoney.f2f.a.b((String)localObject), false);
      ab.i("LuckyMoneyF2FQRCodeUI", "getQRCode");
      b(new e(), false);
      bLh();
      localObject = this.gCr;
      localObject[1] += 1;
      com.tencent.mm.ui.base.h.b(this, getString(2131301110), null, true);
    }
    AppMethodBeat.o(42205);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    AppMethodBeat.i(42204);
    ab.i("LuckyMoneyF2FQRCodeUI", "errType: %d,errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof e))
      {
        ab.d("LuckyMoneyF2FQRCodeUI", "sendId:" + this.nSX);
        if ((!bo.Q(new String[] { this.nSX, ((e)paramm).nSX })) && (!this.nSX.equals(((e)paramm).nSX)))
        {
          this.nUN.clear();
          this.nUO.clear();
          this.nUP.clear();
          this.nUQ.notifyDataSetChanged();
          this.nVa = "";
        }
        if (!bo.isNullOrNil(((e)paramm).nSX))
          this.nSX = ((e)paramm).nSX;
        this.lvz = ((e)paramm).lvz;
        this.nUt = ((e)paramm).nUt;
        this.nUs = ((e)paramm).nUs;
        bLh();
        bLk();
        if (this.nUt == 0)
          this.gGo.stopTimer();
        if ((this.nUN.size() == 0) && (!bo.isNullOrNil(this.nSX)))
          b(new af(this.nSX, 5, 0, null, "v1.0"), false);
      }
    while (true)
    {
      AppMethodBeat.o(42204);
      return true;
      if ((paramm instanceof com.tencent.mm.plugin.luckymoney.f2f.a.a))
      {
        this.nSX = "";
        this.lvz = "";
        this.nUt = 0;
        this.nUN.clear();
        this.nVa = "";
        this.nUQ.notifyDataSetChanged();
        bLh();
        bLk();
        this.gGo.stopTimer();
        if (!bo.isNullOrNil(this.nUs))
          com.tencent.mm.ui.base.h.bQ(this, this.nUs);
      }
      else if ((paramm instanceof af))
      {
        this.nUZ = ((af)paramm).nYn.nWU;
        paramString = ((af)paramm).nYn.nXj;
        if ((paramString != null) && (paramString.size() > 0))
        {
          for (paramInt1 = i; paramInt1 < paramString.size(); paramInt1++)
          {
            w localw = (w)paramString.get(paramInt1);
            if ((!bo.isNullOrNil(localw.nWX)) && (!this.nUN.contains(localw.nWX)))
            {
              this.nUN.add(localw.nWX);
              paramm = localw.userName;
              if (!bo.isNullOrNil(localw.nYc))
                this.nVa = paramm;
              this.nUO.put(localw.nWX, paramm);
            }
          }
          bLj();
          this.nUQ.notifyDataSetChanged();
        }
      }
      else if ((paramm instanceof com.tencent.mm.plugin.luckymoney.f2f.a.b))
      {
        ab.i("LuckyMoneyF2FQRCodeUI", "onSceneEnd NetSceneF2FLuckyMoneyInvalid");
        this.retCode = ((com.tencent.mm.plugin.luckymoney.f2f.a.b)paramm).kCl;
        this.hwA = ((com.tencent.mm.plugin.luckymoney.f2f.a.b)paramm).kCm;
        ab.i("LuckyMoneyF2FQRCodeUI", "retcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        continue;
        if (!bo.isNullOrNil(paramString))
          com.tencent.mm.ui.base.h.b(this, paramString, getString(2131297061), true);
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969980;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42195);
    super.onCreate(paramBundle);
    this.ghw = getResources().getDisplayMetrics();
    this.nUN = new ArrayList();
    this.nUO = new HashMap();
    this.nUP = new LinkedList();
    this.nUU = new ArrayList();
    this.gCr = new int[6];
    paramBundle = this.gCr;
    paramBundle[0] += 1;
    this.gGo = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(42186);
        e locale = new e();
        LuckyMoneyF2FQRCodeUI.this.b(locale, false);
        AppMethodBeat.o(42186);
        return true;
      }
    }
    , true);
    this.abB = findViewById(2131825504);
    this.nUE = findViewById(2131825502);
    this.nUL = ((TextView)findViewById(2131825507));
    this.nUK = ((TextView)findViewById(2131825505));
    this.nVe = this.nUL.getAlpha();
    this.nUJ = ((ImageView)this.abB.findViewById(2131825506));
    this.nUM = ((HorizontalListViewV2)findViewById(2131825508));
    this.nUQ = new a((byte)0);
    this.nUM.setAdapter(this.nUQ);
    this.nUM.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(42187);
        paramAnonymousAdapterView = new Intent(LuckyMoneyF2FQRCodeUI.this, LuckyMoneyBeforeDetailUI.class);
        paramAnonymousAdapterView.putExtra("key_sendid", LuckyMoneyF2FQRCodeUI.u(LuckyMoneyF2FQRCodeUI.this));
        LuckyMoneyF2FQRCodeUI.this.startActivity(paramAnonymousAdapterView);
        AppMethodBeat.o(42187);
      }
    });
    this.nUM.setOnScrollStateChangedListener(new LuckyMoneyF2FQRCodeUI.14(this));
    this.nTg = ((Button)findViewById(2131825511));
    this.nTg.setOnClickListener(new LuckyMoneyF2FQRCodeUI.15(this));
    this.nUR = ((TextView)findViewById(2131825510));
    this.nUF = findViewById(2131825513);
    setBackBtn(new LuckyMoneyF2FQRCodeUI.2(this));
    setMMTitle(getString(2131301111));
    addIconOptionMenu(0, 2131230740, new LuckyMoneyF2FQRCodeUI.3(this));
    xE(getResources().getColor(2131690223));
    dyb();
    this.nUV = ((ViewGroup)findViewById(2131825519));
    this.nUW = ((ViewGroup)findViewById(2131825503));
    this.nUX = findViewById(2131825512);
    this.nUX.setAlpha(0.0F);
    this.bCW = ((SensorManager)getSystemService("sensor"));
    this.bCW.registerListener(this.nVv, this.bCW.getDefaultSensor(1), 3);
    this.nUY = new com.tencent.mm.plugin.luckymoney.f2f.a();
    this.nUS = ((ShuffleView)findViewById(2131825509));
    this.nUT = new ShuffleView.c();
    this.nUT.nWr = 4;
    this.nUT.nWp = 2;
    this.nUT.nWq = 4;
    this.nUT.nWs = 300;
    this.nUT.scaleY = 0.0F;
    this.nUS.setShuffleSetting(this.nUT);
    ShuffleView.ghw = this.ghw;
    paramBundle = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(300L);
    this.nUS.setExitAnimator(paramBundle);
    this.nUS.setExitAnimatorListener(new LuckyMoneyF2FQRCodeUI.4(this));
    this.nUS.setCardListener(new LuckyMoneyF2FQRCodeUI.5(this));
    bLi();
    this.nVb = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.nVb.setDuration(300L);
    this.nVb.setStartDelay(3000L);
    this.nVb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        AppMethodBeat.i(42177);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setTranslationY(-0.5F * f * LuckyMoneyF2FQRCodeUI.K(LuckyMoneyF2FQRCodeUI.this).heightPixels);
        LuckyMoneyF2FQRCodeUI.D(LuckyMoneyF2FQRCodeUI.this).setAlpha(1.0F - f);
        if (f == 1.0F)
        {
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setVisibility(8);
          LuckyMoneyF2FQRCodeUI.E(LuckyMoneyF2FQRCodeUI.this).setTranslationY(0.0F);
          LuckyMoneyF2FQRCodeUI.L(LuckyMoneyF2FQRCodeUI.this);
          LuckyMoneyF2FQRCodeUI.M(LuckyMoneyF2FQRCodeUI.this).notifyDataSetChanged();
          LuckyMoneyF2FQRCodeUI.w(LuckyMoneyF2FQRCodeUI.this).dzv();
        }
        AppMethodBeat.o(42177);
      }
    });
    bLh();
    getWindow().addFlags(128);
    AppMethodBeat.o(42195);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42203);
    com.tencent.mm.plugin.report.service.h.pYm.e(14007, new Object[] { Integer.valueOf(this.gCr[0]), Integer.valueOf(this.gCr[1]), Integer.valueOf(this.gCr[2]), Integer.valueOf(this.gCr[3]), Integer.valueOf(this.gCr[4]), Integer.valueOf(this.gCr[5]) });
    com.tencent.mm.plugin.luckymoney.f2f.a locala = this.nUY;
    locala.jxQ = true;
    locala.nTR.release();
    getWindow().clearFlags(128);
    super.onDestroy();
    AppMethodBeat.o(42203);
  }

  public void onPause()
  {
    AppMethodBeat.i(42202);
    super.onPause();
    if (this.bCW != null)
      this.bCW.unregisterListener(this.nVv);
    AppMethodBeat.o(42202);
  }

  public void onResume()
  {
    AppMethodBeat.i(42200);
    super.onResume();
    b(new e(), true);
    this.gGo.ae(60000L, 60000L);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("ffopenwxhb", this.nVf, true);
    nf(1990);
    nf(1987);
    nf(1971);
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    if (localLayoutParams.screenBrightness < 0.85F)
    {
      localLayoutParams.screenBrightness = 0.85F;
      getWindow().setAttributes(localLayoutParams);
    }
    bc.a(this, this);
    if (this.bCW != null)
      this.bCW.registerListener(this.nVv, this.bCW.getDefaultSensor(1), 3);
    AppMethodBeat.o(42200);
  }

  public void onStop()
  {
    AppMethodBeat.i(42201);
    super.onStop();
    this.gGo.stopTimer();
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("ffopenwxhb", this.nVf, true);
    ng(1990);
    ng(1987);
    ng(1971);
    bc.a(this, null);
    AppMethodBeat.o(42201);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends BaseAdapter
  {
    private a()
    {
    }

    private String getItem(int paramInt)
    {
      AppMethodBeat.i(42191);
      String str = (String)LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).get(paramInt);
      AppMethodBeat.o(42191);
      return str;
    }

    public final int getCount()
    {
      AppMethodBeat.i(42190);
      int i = LuckyMoneyF2FQRCodeUI.a(LuckyMoneyF2FQRCodeUI.this).size();
      AppMethodBeat.o(42190);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(42192);
      if (paramView == null)
      {
        paramView = LayoutInflater.from(LuckyMoneyF2FQRCodeUI.this).inflate(2130969982, null);
        Object localObject = (ImageView)paramView.findViewById(2131825525);
        ImageView localImageView = (ImageView)paramView.findViewById(2131825526);
        paramViewGroup = new LuckyMoneyF2FQRCodeUI.a.a(this);
        paramViewGroup.goC = ((ImageView)localObject);
        paramViewGroup.nVF = localImageView;
        paramView.setTag(paramViewGroup);
        localObject = (String)LuckyMoneyF2FQRCodeUI.b(LuckyMoneyF2FQRCodeUI.this).get(getItem(paramInt));
        x.b(paramViewGroup.goC, null, (String)localObject);
        if ((bo.isNullOrNil(LuckyMoneyF2FQRCodeUI.C(LuckyMoneyF2FQRCodeUI.this))) || (!LuckyMoneyF2FQRCodeUI.C(LuckyMoneyF2FQRCodeUI.this).equals(localObject)))
          break label157;
        paramViewGroup.nVF.setVisibility(0);
      }
      while (true)
      {
        AppMethodBeat.o(42192);
        return paramView;
        paramViewGroup = (LuckyMoneyF2FQRCodeUI.a.a)paramView.getTag();
        break;
        label157: paramViewGroup.nVF.setVisibility(4);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI
 * JD-Core Version:    0.6.2
 */